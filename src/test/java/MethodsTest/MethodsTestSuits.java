package MethodsTest;

import homework4.Methods.StringMethods;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)

public class MethodsTestSuits {
    @Test
    public void reverseTest() {
        StringMethods reverseTest = new StringMethods();
        String str1 = StringMethods.reverse("java");
        Assert.assertEquals("Test", "avaj", str1);

    }

    @Test
    public void printDuplicateChTest() {
        StringMethods printDuplicateChTest = new StringMethods();
        String str1 = StringMethods.printDuplicateCh("java");
        Assert.assertEquals("Test", "a", str1);

    }

    @Test
    public void anagramgTest() {
        StringMethods anagramgTest = new StringMethods();
        Boolean result = anagramgTest.anagram("ada");
        Assert.assertEquals("test",false,result);

    }

    @Test
    public void noOfVowelsAndConsonantsTest() {
        StringMethods noOfVowelsAndConsonants = new StringMethods();
        String result = noOfVowelsAndConsonants.noOfVowelsAndConsonants("abc");
        Assert.assertEquals("Test",result,"Vowels:" + "1" + "\t" + "Consonant:" + "2");

    }




}
