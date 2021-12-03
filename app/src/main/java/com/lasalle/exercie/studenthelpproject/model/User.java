package com.lasalle.exercie.studenthelpproject.model;

import androidx.annotation.NonNull;

public class User {
    private static  int count = 100;
    private  int userId;
    private  String userName;
    private  String password;
    private  String jobTitle;

    public User() {
    }

    public User( String userName, String password, String jobTitle) {
        this.userId = ++count;
        this.userName = userName;
        this.password = password;
        this.jobTitle = jobTitle;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = count++;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }


    @NonNull
    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                '}';
    }
}
