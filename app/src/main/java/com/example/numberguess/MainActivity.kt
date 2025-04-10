package com.example.numberguess

import android.os.Build.VERSION_CODES.R
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this, "Welcome to Number Guess", Toast.LENGTH_SHORT).show()
    }
}
bbjbb


 The  onCreate()  method is called when the activity is created. The  setContentView()  method sets the layout for the activity. The  Toast.makeText()  method creates a toast message that displays a short message.
 Step 4: Run the App
 To run the app, click the  Run  button in the toolbar.
 Select the device or emulator you want to run the app on and click  OK .
 The app will be installed on the device or emulator and will start automatically.
 You should see a toast message that says "Welcome to Number Guess".
 Conclusion
 You have successfully created a new Android project using Android Studio. You have also learned how to create a new activity and display a toast message in the app.
 To learn more about Android development, check out our  Android topic page.
 Happy coding!
 Peer Review Contributions by:  Mohan Raj