package com.example.easymed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        button = (Button) findViewById(R.id.loginButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
         public void onClick(View view) {
                openProfileCreation1Activity();
            }
        });
    }

    public void openProfileCreation1Activity() {
        Intent intent = new Intent(this, ProfileCreation1Activity.class);
        startActivity(intent);
    }
}