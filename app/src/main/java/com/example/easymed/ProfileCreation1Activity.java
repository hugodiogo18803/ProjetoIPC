package com.example.easymed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ProfileCreation1Activity extends AppCompatActivity {

    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_creation1);

        button = (Button) findViewById(R.id.continueButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openProfileCreation2Activity();
            }
        });
    }

    public void openProfileCreation2Activity() {
        Intent intent = new Intent(this, ProfileCreation2Activity.class);
        startActivity(intent);
    }
}