package tests;

import org.junit.Test;
import task3.StringInfo;

import static org.junit.Assert.*;

public class StringInfoTest {
    private final String test = "Live not on evil";

    @Test
    public void isPalindrome() {
        assertTrue(StringInfo.isPalindrome(test));
    }

    @Test
    public void countVowels() {
        assertEquals(6, StringInfo.countVowels(test));
    }

    @Test
    public void countConsonants() {
        assertEquals(7, StringInfo.countConsonants(test));
    }

    @Test
    public void countWords() {
        String text = "Today is my birthday, and I couldn’t be more excited! I woke up and had breakfast, complete with pancakes, eggs, and a big mug of hot cocoa. My family sang “Happy Birthday” to me and presented me with a few small gifts, including a new book and a movie I’ve been wanting to see.";
        assertEquals(5, StringInfo.countWords(text, "and"));
    }
}