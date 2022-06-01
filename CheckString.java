package com.Bridgelabz.Regex;

import java.util.regex.*;

public class CheckString
{
    public boolean checkPresentString() {

        System.out.println(Pattern.matches("[gert]", "gert"));
        System.out.println(Pattern.matches("[gert]*", "terge"));
        System.out.println(Pattern.matches("[aabb]", "baab"));
        return false;
    }

    public static void main(String[] args) {
        CheckString s = new CheckString();
        s. checkPresentString();
    }
}


