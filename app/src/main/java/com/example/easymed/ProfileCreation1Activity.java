package com.example.easymed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class ProfileCreation1Activity extends AppCompatActivity {

    private Button button;
    private RadioGroup genderOptions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_creation1);

        button = findViewById(R.id.continueButton);
        genderOptions = findViewById(R.id.gender_options);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText firstNameEditText = findViewById(R.id.editTextText2);
                EditText lastNameEditText = findViewById(R.id.editTextText3);
                EditText birthDateEditText = findViewById(R.id.birth_date);
                RadioButton maleRadioButton = findViewById(R.id.radioButton3);
                RadioButton femaleRadioButton = findViewById(R.id.radioButton2);
                RadioButton otherRadioButton = findViewById(R.id.radioButton);


                if (firstNameEditText.getText().toString().isEmpty() ||
                        lastNameEditText.getText().toString().isEmpty() ||
                        birthDateEditText.getText().toString().isEmpty() ||
                        (!maleRadioButton.isChecked() && !femaleRadioButton.isChecked() && !otherRadioButton.isChecked())) {
                    Toast.makeText(getApplicationContext(), "Please fill in all the fields", Toast.LENGTH_SHORT).show();
                } else {
                    openProfileCreation2Activity();
                }
            }
        });
    }

    public void openProfileCreation2Activity() {
        Intent intent = new Intent(this, ProfileCreation2Activity.class);
        startActivity(intent);
    }
}
