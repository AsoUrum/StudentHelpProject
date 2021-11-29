package com.lasalle.exercie.studenthelpproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tutorLogin extends AppCompatActivity implements View.OnClickListener {

    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutor_login);
        initialize();
    }

    private void initialize() {
        btnLogin = findViewById(R.id.btnLogin);
    }

    private void showProfilePage()
    {
        Intent intent = new Intent(this, tutorProfile.class );
        startActivity(intent);

    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch(id){
            case R.id.btnLogin:
                showProfilePage();
                break;
        }

    }
}