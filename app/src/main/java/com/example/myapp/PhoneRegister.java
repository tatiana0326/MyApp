package com.example.myapp;

public class PhoneRegister {
    private static String fullname;
    private static String phone;
    private static String password;

    public static String getFullname() {
        return fullname;
    }

    public static void setFullname(String name) {
        PhoneRegister.fullname = name;
    }

    public static String getPhone() {
        return phone;
    }

    public static void setPhone(String phone) {
        PhoneRegister.phone = phone;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        PhoneRegister.password = password;
    }

    public static boolean verifyUserExistence(){
        return fullname != null && phone != null && password != null;
    }
}