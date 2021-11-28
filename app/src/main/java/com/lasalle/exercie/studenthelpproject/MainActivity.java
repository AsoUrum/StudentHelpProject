package com.lasalle.exercie.studenthelpproject;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnLogin, btnStudentSU, btnTutorSU;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();

    }

    private void initialize() {
        btnLogin = findViewById(R.id.btnLogin);
        btnStudentSU = findViewById(R.id.btnStudentSignUp);
        btnTutorSU = findViewById(R.id.btnTutorSignUp);
        btnLogin.setOnClickListener(this);
        btnStudentSU.setOnClickListener(this);
        btnTutorSU.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch(id){
            case R.id.btnLogin:
                login();
                break;
            case R.id.btnStudentSignUp:
                studentSignUp();
                break;
            case R.id.btnTutorSignUp:
                tutorSignUp();
                break;
        }
    }

    private void tutorSignUp() {
        Intent intent = new Intent(this, TutorRegistration.class);
        startActivity(intent);
    }

    private void studentSignUp() {
        Intent intent = new Intent(this,StudentRegistration.class);
        startActivity(intent);
    }

    private void login() {
    }
}