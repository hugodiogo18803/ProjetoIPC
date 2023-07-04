package com.example.easymed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class ProfileCreation2Activity extends AppCompatActivity {

    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_creation2);

        button = findViewById(R.id.doneButton);
        button.setOnClickListener(view -> {
            CheckBox CheckBox = findViewById(R.id.checkBox);
            CheckBox CheckBox2 = findViewById(R.id.checkBox2);
            CheckBox CheckBox3 = findViewById(R.id.checkBox3);
            CheckBox CheckBox4 = findViewById(R.id.checkBox4);
            CheckBox CheckBox5 = findViewById(R.id.checkBox5);

            if (!CheckBox.isChecked() && !CheckBox2.isChecked() && !CheckBox3.isChecked() &&!CheckBox4.isChecked() &&!CheckBox5.isChecked()) {
                Toast.makeText(getApplicationContext(), "Please choose at least one option", Toast.LENGTH_SHORT).show();
            } else {
                openProfileCreationCompleteActivity();
            }
        });
    }

    public void openProfileCreationCompleteActivity() {
        Intent intent = new Intent(this, ProfileCompleteActivity.class);
        startActivity(intent);
    }
}