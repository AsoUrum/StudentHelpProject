package com.lasalle.exercie.studenthelpproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.result.ActivityResultLauncher;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.lasalle.exercie.studenthelpproject.model.Student;
import com.lasalle.exercie.studenthelpproject.model.Tutor;
import com.lasalle.exercie.studenthelpproject.model.User;

import java.util.Date;


public class TutorRegistration extends AppCompatActivity implements View.OnClickListener  {

    EditText edFirstName, edLastName, edGender, edEmail, edDOB, edSkill, edUsername, edPassword;
    Button btnRegister;

    DatabaseReference  tutorHelpDatabase, tutorHelpDatabaseUser, getTutorHelpDatabaseSkill;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutor_registration);
        initialize();
    }

    private void initialize() {
        edFirstName =  findViewById(R.id.edFirstName);
        edLastName = findViewById(R.id.edLastName);
        edGender = findViewById(R.id.edGender);
        edEmail = findViewById(R.id.edEmail);
        edDOB = findViewById(R.id.edDOB);
        edSkill = findViewById(R.id.edSkill);
        btnRegister = findViewById(R.id.btnRegister);
        edUsername = findViewById(R.id.edUserName);
        edPassword = findViewById(R.id.edPassword);
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

        try{
            Date dateOfBirth = (Date) edDOB.getText();
            String email = edEmail.getText().toString();
            String firstName = edFirstName.getText().toString();
            String lastName = edLastName.getText().toString();
            String gender = edGender.getText().toString();
            String username = edUsername.getText().toString();
            String password = edPassword.getText().toString();
            String skill = edSkill.getText().toString();
            String title = "Tutor";
            int id = 1;
            Tutor oneTutor= new Tutor(id,id,firstName,lastName,email,gender,dateOfBirth,skill);
            User oneUser = new User(id,username,password,title);
            //What to do with skill. Connect the table skill? what about the desc etc. or just expand skill in table tutor and add the string skill
            tutorHelpDatabase.child(String.valueOf(id)).setValue(oneTutor);
            tutorHelpDatabaseUser.child(String.valueOf(id)).setValue(oneUser);
            clearWidgets();
            Intent intent = new Intent(this,tutorLogin.class);
            intent.putExtra("username",username);
            intent.putExtra("password",password);
            startActivity(intent);
        }catch(Exception e){
            Toast.makeText(this,e.getMessage(),Toast.LENGTH_LONG).show();
        }
    }

    private void clearWidgets() {
    }
}