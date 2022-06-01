package com.Bridgelabz.Regex;


    // Check string Regex
import java.util.regex.Pattern;
import java.util.regex.Matcher;

    public class ClassProgramRegex  {

        // "str" in "hamstring"
        public boolean checkGivenString(String givString){
            String chkString = "ham";
            boolean ifPresent = false;

            for(int i=0;i<givString.length()-2;i++){
                if((givString.charAt(i)+"").equals(chkString.charAt(0)+"")){
                    if((givString.charAt(i+1)+"").equals(chkString.charAt(1)+"")){
                        if((givString.charAt(i+2)+"").equals(chkString.charAt(2)+"")){
                            ifPresent = true;
                        }
                    }
                }
            }
            return ifPresent;
        }

        public void checkStringUsingRegex(String givString){

            Pattern pattern = Pattern.compile("[x]{2}[y]{1}[z]{1}");// we search for this
            Matcher macher = pattern.matcher("xxyxz");// we search in this
            boolean ifMatches = macher.find();
            if(ifMatches){
                System.out.println("Match found");
            }else{
                System.out.println("Match Not found");
            }
        }

        public static void main(String[] args) {
            ClassProgramRegex  chk = new ClassProgramRegex();
//boolean result = chk.checkGivenString("strait");
//System.out.println(result);
            chk.checkStringUsingRegex("hamstring");
        }
    }

