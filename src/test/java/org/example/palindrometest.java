package org.example;

import org.junit.Test;
import static org.junit.Assert.*;
public class palindrometest{
    @Test
    public void palindrometest(){
        Main obj=new Main();
        assertTrue(obj.isPalindrome("madam"));
    }

}
