package com.example.louisvuittonauthenticator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.louisvuittonauthenticator.ui.theme.LouisVuittonAuthenticatorTheme
import java.net.URLDecoder
import java.net.URLEncoder
import java.nio.charset.StandardCharsets

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LouisVuittonAuthenticatorTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    AppNavigation()
                }
            }
        }
    }
}

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "home") {
        composable("home") { HomeScreen(navController) }
        composable("handbags") { HandbagsScreen(navController) }
        composable("footwear") { FootwearScreen(navController) }
        composable("accessories") { AccessoriesScreen(navController) }
        composable("travel") { TravelScreen(navController) }
        composable("apparel") { ApparelScreen(navController) }
        composable("learn") { LearnScreen(navController) }
        composable("about") { AboutScreen(navController) }

        // Routes for General Handbag Questions
        composable("general_handbags_q1") { GeneralHandbagsQ1(navController) }
        composable("general_handbags_q2") { GeneralHandbagsQ2(navController) }
        composable("general_handbags_q3") { GeneralHandbagsQ3(navController) }
        composable("general_handbags_q4") { GeneralHandbagsQ4(navController) }

        // Route for displaying flags. It takes the flag text as an argument.
        composable(
            "flag_screen/{flagText}",
            arguments = listOf(navArgument("flagText") { type = NavType.StringType })
        ) { backStackEntry ->
            val flagText = backStackEntry.arguments?.getString("flagText") ?: ""
            FlagScreen(navController, URLDecoder.decode(flagText, StandardCharsets.UTF_8.toString()))
        }

        // Route for the final success screen
        composable("authentication_complete") { AuthenticationCompleteScreen(navController) }
    }
}

// Helper function to navigate with text that might contain special characters
fun NavController.navigateWithEncodedText(route: String, text: String) {
    val encodedText = URLEncoder.encode(text, StandardCharsets.UTF_8.toString())
    this.navigate("$route/$encodedText")
}

