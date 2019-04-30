package com.example.stackoverflow;

public class passdata {
    public static String vale1,vale2,vale3,vale4;


    public passdata(String val1, String val2, String val3, String val4) {
        vale1=val1;
        vale2=val2;
        vale3=val3;
        vale4=val4;
    }

    public static String getVale1() {
        return vale1;
    }

    public static void setVale1(String vale1) {
        passdata.vale1 = vale1;
    }

    public static String getVale2() {
        return vale2;
    }

    public static void setVale2(String vale2) {
        passdata.vale2 = vale2;
    }

    public static String getVale3() {
        return vale3;
    }

    public static void setVale3(String vale3) {
        passdata.vale3 = vale3;
    }

    public static String getVale4() {
        return vale4;
    }

    public static void setVale4(String vale4) {
        passdata.vale4 = vale4;
    }
}
