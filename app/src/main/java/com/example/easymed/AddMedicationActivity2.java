package com.example.easymed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class AddMedicationActivity2 extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private Button nextActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_medication2);

        nextActivity = (Button) findViewById(R.id.confirm_button);
        nextActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNextActivity();
            }
        });

        //Spinner Hours
        Spinner spinnerHours = findViewById(R.id.hours_spinner);
        ArrayAdapter<CharSequence> adapterHours = ArrayAdapter.createFromResource(this, R.array.numberHours, android.R.layout.simple_spinner_item);
        adapterHours.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerHours.setAdapter(adapterHours);
        spinnerHours.setOnItemSelectedListener(this);

        //Spinner Days
        Spinner spinnerDays = findViewById(R.id.days_spinner);
        ArrayAdapter<CharSequence> adapterDays = ArrayAdapter.createFromResource(this, R.array.numberDays, android.R.layout.simple_spinner_item);
        adapterDays.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerDays.setAdapter(adapterDays);
        spinnerDays.setOnItemSelectedListener(this);

        //Spinner Weeks
        Spinner spinnerWeeks = findViewById(R.id.weeks_spinner);
        ArrayAdapter<CharSequence> adapterWeeks = ArrayAdapter.createFromResource(this, R.array.numberWeeks, android.R.layout.simple_spinner_item);
        adapterWeeks.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerWeeks.setAdapter(adapterWeeks);
        spinnerWeeks.setOnItemSelectedListener(this);

        //Spinner Months
        Spinner spinnerMonths = findViewById(R.id.months_spinner);
        ArrayAdapter<CharSequence> adapterMonths = ArrayAdapter.createFromResource(this, R.array.numberMonths, android.R.layout.simple_spinner_item);
        adapterMonths.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerMonths.setAdapter(adapterMonths);
        spinnerMonths.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        //String text = adapterView.getItemAtPosition(i).toString();
        //Toast.makeText(adapterView.getContext(), text, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    public void openNextActivity() {
        Intent intent = new Intent(this, addMedicationActivity3.class);
        startActivity(intent);
    }
}