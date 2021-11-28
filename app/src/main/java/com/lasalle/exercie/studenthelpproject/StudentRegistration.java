package com.lasalle.exercie.studenthelpproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class StudentRegistration extends AppCompatActivity implements View.OnClickListener {

    EditText edFirstName, edLastName, edGender, edEmail, edDOB;
    Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_registration);
        initialize();
    }

    private void initialize() {
        edFirstName =  findViewById(R.id.edFirstName);
        edLastName = findViewById(R.id.edLastName);
        edGender = findViewById(R.id.edGender);
        edEmail = findViewById(R.id.edEmail);
        edDOB = findViewById(R.id.edDOB);
        btnRegister = findViewById(R.id.btnRegister);
        btnRegister.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch(id){
            case R.id.btnRegister:
                register();
                break;
        }



    }

    private void register() {
        Intent intent = new Intent(this,StudentLoginPage.class);
        startActivity(intent);
    }
}