package com.lasalle.exercie.studenthelpproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StudentLoginPage extends AppCompatActivity implements View.OnClickListener {

    Button btnStudentLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_login_page);
        initialize();
    }

    private void initialize() {
        btnStudentLogin =findViewById(R.id.btnStudentLogin);
        btnStudentLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();

        switch (id){

            case R.id.btnStudentLogin:
                toProfilePage();
                break;
    }
}

    private void toProfilePage() {
        Intent i = new Intent(this ,StudentProfilePage.class);
        startActivity(i);
    }
}
