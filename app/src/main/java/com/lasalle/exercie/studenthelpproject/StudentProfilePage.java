package com.lasalle.exercie.studenthelpproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.lasalle.exercie.studenthelpproject.model.Student;

import java.sql.Date;

public class StudentProfilePage extends AppCompatActivity implements View.OnClickListener, ValueEventListener {

    Button btnStudentLogout;
    TextView tvStudentName,tvStudentProfile;
    DatabaseReference studentDB,studentChild;
    Student astudent;
    String studentId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_profile_page);
        initialize();
    }

    private void initialize() {
        btnStudentLogout = findViewById(R.id.btnStudentLogout);
        tvStudentName = findViewById(R.id.tvStudentName);
        tvStudentProfile = findViewById(R.id.tvStudentsProfile);
        btnStudentLogout.setOnClickListener(this);

        Intent i = getIntent();
        studentId = i.getStringExtra("studentid");

        astudent = new Student();
        studentDB = FirebaseDatabase.getInstance().getReference("Student");


        getStudent();




    }

    private void getStudent() {
        studentChild = studentDB.child(studentId);
        studentChild.addValueEventListener(this);


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

    @Override
    public void onDataChange(@NonNull DataSnapshot snapshot) {

        if(snapshot.exists()) {
            astudent.setStudentId(Integer.valueOf( snapshot.child("StudentId").getValue().toString()));
            astudent.setFirstName(snapshot.child("FirstName").getValue().toString());
            astudent.setLastName(snapshot.child("LastName").getValue().toString());
            astudent.setGender(snapshot.child("Gender").getValue().toString());
            astudent.setDateOfBirth(Date.valueOf(snapshot.child("DateOfBirth").getValue().toString()));
            astudent.setEmail(snapshot.child("Email").getValue().toString());

           String name = astudent.getFirstName() + " " + astudent.getLastName();

            tvStudentName.setText(name);
            tvStudentProfile.setText(astudent.toString());



        }else{
            Toast.makeText(this,"The document with the id "  + " doesn't exist",Toast.LENGTH_LONG).show();

        }


    }

    @Override
    public void onCancelled(@NonNull DatabaseError error) {

    }
}