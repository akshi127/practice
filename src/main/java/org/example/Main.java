package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static boolean isPalindrome(String s) {
        String rev = new StringBuilder(s).reverse().toString();
        return rev.equals(s);
    }
}
