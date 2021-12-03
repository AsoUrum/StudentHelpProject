package com.lasalle.exercie.studenthelpproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StudentProfilePage extends AppCompatActivity implements View.OnClickListener  {

    Button btnStudentLogout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_profile_page);
        initialize();
    }

    private void initialize() {
        btnStudentLogout = findViewById(R.id.btnStudentLogout);
        btnStudentLogout.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();

        switch (id){

            case R.id.btnStudentLogout:
                toStudentLoginPage();
                break;
    }
}

    private void toStudentLoginPage() {

        Intent i = new Intent(this ,StudentLoginPage.class);
        startActivity(i);
    }
    }