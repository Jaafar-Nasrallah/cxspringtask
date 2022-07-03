package com.example.springtest.hichChartTest.model;

public class UserSession {

    String userName;
    String password;
    boolean isAuthenticated = false;

    public UserSession(String userName, String password, boolean isAuthenticated) {
        if (userName.equals("demo") && password.equals("demo")){

        this.userName = userName;
        this.password = password;
        this.isAuthenticated = true;
        }
        else{
            this.userName = userName;
            this.password = password;
            this.isAuthenticated = false;
        }
    }

    public boolean IsAuthenticated(){
        return this.isAuthenticated;
    }

    @Override
    public String toString() {
        return "UserSession{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", isAuthenticated=" + isAuthenticated +
                '}';
    }
}
