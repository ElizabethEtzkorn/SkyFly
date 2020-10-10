package org.elizabethetzkorn.skyfly

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat.startActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

fun startButton (view: View) {
    val intent = Intent(SkyFly2Activity::class.java).apply {
    }
    startActivity(intent)
}
}
}
}