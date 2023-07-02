package com.example.easymed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class addMedicationActivity3 extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private Button finalize;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_medication3);

        finalize = (Button) findViewById(R.id.completeAndSaveButton);
        finalize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFinalActivity();
            }
        });

        //Spinner Dose Reminder
        Spinner spinnerDoseReminder = findViewById(R.id.doseReminderSpinner);
        ArrayAdapter<CharSequence> adapterDoseReminder = ArrayAdapter.createFromResource(this, R.array.numberRefills, android.R.layout.simple_spinner_item);
        adapterDoseReminder.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerDoseReminder.setAdapter(adapterDoseReminder);
        spinnerDoseReminder.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
    public void openFinalActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}