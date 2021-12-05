package com.lasalle.exercie.studenthelpproject;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.lasalle.exercie.studenthelpproject.model.TutorialAssignment;


public class StudentProfilePage extends AppCompatActivity implements View.OnClickListener, ChildEventListener {

    Button btnStudentLogout;
    ListView LvAppointment;
    ArrayList<TutorialAssignment> ListAppointment;
    ArrayAdapter<TutorialAssignment> lvAdapter;
    DatabaseReference TADatabase,ChildDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_profile_page);
        initialize();

    }

    private void initialize() {
        btnStudentLogout = findViewById(R.id.btnStudentLogout);
        btnStudentLogout.setOnClickListener(this);
        TADatabase = FirebaseDatabase.getInstance().getReference("TutorialAssignment");
        getAppointment();
        LvAppointment = findViewById(R.id.LvAppointment);
        ListAppointment= new ArrayList<>();
        lvAdapter = new ArrayAdapter<TutorialAssignment>(this, android.R.layout.simple_list_item_1, ListAppointment);
        LvAppointment.setAdapter(lvAdapter);


    }

    private void getAppointment() {
        ChildDatabase = TADatabase.child("222");
        ChildDatabase.addChildEventListener(this);
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
    public void onChildAdded(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {
        if (snapshot.exists()){
        String StudentId = snapshot.child("StudentId").getValue().toString();
        String TutorId = snapshot.child("TutorId").getValue().toString();
        String TutorialDate = snapshot.child("TutorialDate").getValue().toString();
        String TutorialDescription = snapshot.child("TutorialDescription").getValue().toString();
        TutorialAssignment tutorialAssignment = new TutorialAssignment(Integer.valueOf(StudentId),Integer.valueOf(TutorId),TutorialDate,TutorialDescription);
        ListAppointment.add(tutorialAssignment);
        lvAdapter.notifyDataSetChanged();
        }
        else {
            Toast.makeText(this,"Nothing",Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void onChildChanged(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {

    }

    @Override
    public void onChildRemoved(@NonNull DataSnapshot snapshot) {

    }

    @Override
    public void onChildMoved(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {

    }

    @Override
    public void onCancelled(@NonNull DatabaseError error) {

    }
}




