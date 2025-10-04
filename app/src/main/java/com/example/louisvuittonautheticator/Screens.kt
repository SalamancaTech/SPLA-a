package com.example.louisvuittonauthenticator

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun HomeScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Louis Vuitton Authenticator", fontSize = 24.sp)
        Spacer(modifier = Modifier.height(32.dp))
        Button(onClick = { navController.navigate("handbags") }) { Text("HANDBAGS") }
        Button(onClick = { navController.navigate("footwear") }) { Text("FOOTWEAR") }
        Button(onClick = { navController.navigate("accessories") }) { Text("ACCESSORIES") }
        Button(onClick = { navController.navigate("travel") }) { Text("TRAVEL") }
        Button(onClick = { navController.navigate("apparel") }) { Text("APPAREL") }
        Button(onClick = { navController.navigate("learn") }) { Text("LEARN") }
        Button(onClick = { navController.navigate("about") }) { Text("ABOUT") }
    }
}

@Composable
fun HandbagsScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Handbags", fontSize = 24.sp)
        Spacer(modifier = Modifier.height(32.dp))
        Button(onClick = { navController.navigate("general_handbags_q1") }) { Text("General") }
        Button(onClick = { /* TODO */ }) { Text("Speedy Bag") }
        Button(onClick = { /* TODO */ }) { Text("Neverfull Tote") }
        Button(onClick = { navController.popBackStack() }) { Text("Back") }
    }
}

// -- General Handbag Question Screens --

@Composable
fun GeneralHandbagsQ1(navController: NavController) {
    QuestionScreen(
        navController = navController,
        questionText = Questions.LV1A_Q1,
        onYesClicked = { navController.navigateWithEncodedText("flag_screen", Flags.LV1A_F1) },
        onNoClicked = { navController.navigate("general_handbags_q2") },
        onBackClicked = { navController.popBackStack() }
    )
}

@Composable
fun GeneralHandbagsQ2(navController: NavController) {
    QuestionScreen(
        navController = navController,
        questionText = Questions.LV1A_Q2,
        onYesClicked = { navController.navigate("general_handbags_q3") },
        onNoClicked = { navController.navigateWithEncodedText("flag_screen", Flags.LV1A_F2) },
        onBackClicked = { navController.popBackStack() }
    )
}

@Composable
fun GeneralHandbagsQ3(navController: NavController) {
    QuestionScreen(
        navController = navController,
        questionText = Questions.LV1A_Q3,
        onYesClicked = { navController.navigate("general_handbags_q4") },
        onNoClicked = { navController.navigateWithEncodedText("flag_screen", Flags.LV1A_F3) },
        onBackClicked = { navController.popBackStack() }
    )
}

@Composable
fun GeneralHandbagsQ4(navController: NavController) {
    QuestionScreen(
        navController = navController,
        questionText = Questions.LV1A_Q4,
        onYesClicked = { navController.navigate("authentication_complete") },
        onNoClicked = { navController.navigateWithEncodedText("flag_screen", Flags.LV1A_F4) },
        onBackClicked = { navController.popBackStack() }
    )
}


// -- Reusable & Other Screens --

@Composable
fun QuestionScreen(
    navController: NavController,
    questionText: String,
    onYesClicked: () -> Unit,
    onNoClicked: () -> Unit,
    onBackClicked: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(questionText, fontSize = 20.sp, textAlign = TextAlign.Center)
        Spacer(modifier = Modifier.height(32.dp))
        Button(onClick = onYesClicked) { Text("Yes") }
        Button(onClick = onNoClicked) { Text("No") }
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = onBackClicked) { Text("Back") }
        Button(onClick = {
            navController.navigate("home") {
                popUpTo("home") { inclusive = true }
            }
        }) { Text("Home") }
    }
}

@Composable
fun FlagScreen(navController: NavController, flagText: String) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Result", fontSize = 24.sp)
        Spacer(modifier = Modifier.height(16.dp))
        Text(flagText, fontSize = 18.sp, textAlign = TextAlign.Center)
        Spacer(modifier = Modifier.height(32.dp))
        Button(onClick = { navController.popBackStack() }) { Text("Back") }
        Button(onClick = {
            navController.navigate("home") {
                popUpTo("home") { inclusive = true }
            }
        }) { Text("Home") }
    }
}

@Composable
fun AuthenticationCompleteScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Authentication complete!", fontSize = 24.sp)
        Spacer(modifier = Modifier.height(32.dp))
        Button(onClick = { navController.popBackStack() }) { Text("Back") }
        Button(onClick = {
            navController.navigate("home") {
                popUpTo("home") { inclusive = true }
            }
        }) { Text("Home") }
    }
}


@Composable
fun FootwearScreen(navController: NavController) {
    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        Text("Footwear Screen", fontSize = 24.sp)
        Button(onClick = { navController.popBackStack() }) { Text("Back") }
    }
}

@Composable
fun AccessoriesScreen(navController: NavController) {
    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        Text("Accessories Screen", fontSize = 24.sp)
        Button(onClick = { navController.popBackStack() }) { Text("Back") }
    }
}

@Composable
fun TravelScreen(navController: NavController) {
    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        Text("Travel Screen", fontSize = 24.sp)
        Button(onClick = { navController.popBackStack() }) { Text("Back") }
    }
}

@Composable
fun ApparelScreen(navController: NavController) {
    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        Text("Apparel Screen", fontSize = 24.sp)
        Button(onClick = { navController.popBackStack() }) { Text("Back") }
    }
}

@Composable
fun LearnScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Coming Soon!", fontSize = 24.sp)
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { navController.popBackStack() }) { Text("BACK") }
    }
}

@Composable
fun AboutScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Coming Soon!", fontSize = 24.sp)
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { navController.popBackStack() }) { Text("BACK") }
    }
}

