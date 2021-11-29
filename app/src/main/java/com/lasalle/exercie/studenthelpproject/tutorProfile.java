package com.lasalle.exercie.studenthelpproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tutorProfile extends AppCompatActivity implements View.OnClickListener {

    Button btnLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutor_profile);

        initialize();
    }

    private void initialize() {
        btnLogout = findViewById(R.id.btnLogout);

    }

    private void showLoginPage()
    {
        Intent intent = new Intent(this, tutorLogin.class );
        startActivity(intent);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch(id){
            case R.id.btnLogin:
                showLoginPage();
                break;
        }

    }
}
