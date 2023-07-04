package com.example.easymed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;
public class AddMedicationActivity1 extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private Button nextActivity;
    private Spinner medicationSpinner;
    private Spinner administrationSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_medication1);

        nextActivity = findViewById(R.id.addMedicationButtonNext1);
        nextActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNextActivity();
            }
        });

        medicationSpinner = findViewById(R.id.medicationspinner);
        administrationSpinner = findViewById(R.id.administration_spinner);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.medication_suggestions, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        medicationSpinner.setAdapter(adapter);
        medicationSpinner.setOnItemSelectedListener(this);


        Spinner spinnerDoses = findViewById(R.id.doses_spinner);
        ArrayAdapter<CharSequence> adapterDoses = ArrayAdapter.createFromResource(this, R.array.numberDose, android.R.layout.simple_spinner_item);
        adapterDoses.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerDoses.setAdapter(adapterDoses);
        spinnerDoses.setOnItemSelectedListener(this);


        ArrayAdapter<CharSequence> adapterAdmin = ArrayAdapter.createFromResource(this, R.array.administrationTypes, android.R.layout.simple_spinner_item);
        adapterAdmin.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        administrationSpinner.setAdapter(adapterAdmin);
        administrationSpinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        // String text = adapterView.getItemAtPosition(i).toString();
        // Toast.makeText(adapterView.getContext(), text, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    public void openNextActivity() {
        int selectedMedicationPosition = medicationSpinner.getSelectedItemPosition();
        int selectedAdministrationPosition = administrationSpinner.getSelectedItemPosition();


        if (selectedMedicationPosition > 0 && selectedAdministrationPosition > 0) {
            Intent intent = new Intent(this, AddMedicationActivity2.class);
            startActivity(intent);
        } else {

            Toast.makeText(this, "Please select a medication and administration type", Toast.LENGTH_SHORT).show();
        }
    }
}