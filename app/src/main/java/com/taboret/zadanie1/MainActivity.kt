package com.taboret.zadanie1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var replaceButton = findViewById<Button>(R.id.button2);
        var addButton = findViewById<Button>(R.id.button);
        var nameLabel = findViewById<TextView>(R.id.textView);
        var nameTextbox = findViewById<TextInputEditText>(R.id.pole);

        addButton.setOnClickListener {
            nameLabel.text = nameLabel.text.toString() + nameTextbox.text.toString();
        };

        replaceButton.setOnClickListener {
            nameLabel.text = "Nicholas Fajer";
        };
     }
    }


