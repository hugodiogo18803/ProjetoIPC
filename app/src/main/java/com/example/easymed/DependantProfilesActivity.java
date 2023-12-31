package com.example.easymed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;

public class DependantProfilesActivity extends AppCompatActivity {

    private Button addDependant;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dependant_profiles);

        addDependant = (Button) findViewById(R.id.addDependantButton);
        addDependant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLogin();
            }
        });
    }
    public void openLogin() {
        Intent intent = new Intent(this, ProfileCreation1Activity.class);
        startActivity(intent);
    }

}