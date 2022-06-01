package com.Bridgelabz.Regex;
import java.util.regex.*;

public class PinCodeProgram {

        public void pinCode() {
            Pattern pattern = Pattern.compile("[1-9][0-9]{5}[^a-zA-Z~!@#$%^&*()]");
            Matcher matcher = pattern.matcher("A400088 ");
            boolean pinCodeNo= matcher.matches();

            if (pinCodeNo) {
                System.out.println("Pin code is correct.");
            } else {
                System.out.println("Pin code is incorrect.");
            }
        }

        public void spaceAllow(){
            Pattern pattern = Pattern.compile("[0-9][1-9]{5}|[1-9][0-9]{2}[\\s][0-9]{3}"); //space allow after 3 char in pin code
            Matcher matcher = pattern.matcher("400 088");
            boolean pinCodeNo = matcher.matches();

            if (pinCodeNo){
                System.out.println("Pin code is correct.");
            } else {
            }
            }
                public static void main(String[] args)
                {
                    System.out.println(" PIN code by using Regex Pattern:");
                    PinCodeProgram p = new PinCodeProgram();
                    p.pinCode();
                    p.spaceAllow();
                }
            }

