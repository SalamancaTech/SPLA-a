package com.example.louisvuittonauthenticator

// This file holds the text content for the questions and flags.
// This makes it easier to manage the text instead of having it directly in the UI code.

object Questions {
    const val LV1A_Q1 = "Did the handbag come with a plastic, credit-card-style \"Authenticity Card\"?"
    const val LV1A_Q2 = "Examine the main material of the bag. If it's Monogram or Damier Canvas, does it feel like a durable, slightly textured coated canvas (not soft leather)? If it's leather (like Epi or Empreinte), does it feel supple and high-quality?"
    const val LV1A_Q3 = "Look at the handles and leather trim. Is the edge glazing (the paint on the sides of the leather straps) a deep, matte burgundy-red color? Is the stitching neat, with a consistent density of approximately five stitches per inch?"
    const val LV1A_Q4 = "Do the padlock, zipper, and other metal hardware feel solid and heavy? Are the engravings crisp and clear?"
}

object Flags {
    const val LV1A_F1 = "CRITICAL RED FLAG: Louis Vuitton has never issued a plastic authenticity card. These are created by counterfeiters to make the product seem legitimate. The presence of this card is a definitive sign of a fake product."
    const val LV1A_F2 = "RED FLAG: Authentic LV canvas is a specific coated material that is durable and holds its shape. If the material feels like soft, pliable plastic, vinyl, or cheap leather, it is a strong indicator of a counterfeit. Similarly, authentic LV leather should feel and smell like a luxury-grade material, not synthetic or cheap."
    const val LV1A_F3 = "RED FLAG: Low-quality fakes often get the details of the Vachetta leather wrong. The edge paint should be a matte, deep burgundy, not a bright, shiny red. Stitching is a key indicator of authenticity; it should be perfectly even and consistent. Sloppy, uneven, or loose threads are clear signs of a fake."
    const val LV1A_F4 = "RED FLAG: Authentic hardware is brass-plated or solid brass. It should feel heavy and substantial. Counterfeit hardware is often made of cheap, coated plastic or lightweight metal. The engravings on authentic pieces are sharp and well-defined, while fakes often have blurry, shallow, or poorly-spaced lettering."
}
