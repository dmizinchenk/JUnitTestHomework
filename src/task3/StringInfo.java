package task3;

import java.util.Arrays;

public class StringInfo {
    public static boolean isPalindrome(String string)
    {
        string = string.replaceAll(" ", "").toLowerCase();
        return string.contentEquals(new StringBuilder(string).reverse());
    }
    public static int countVowels(String string)
    {
        String vowels = "eyuioa";
        string = string.replaceAll(" ", "").toLowerCase();
        int count = 0;
        for(char c : string.toCharArray())
        {
            if(vowels.contains(String.valueOf(c)))
                count++;
        }
        return count;
    }
    public static int countConsonants(String string)
    {
        string = string.replaceAll(" ", "").toLowerCase();
        return string.length() - countVowels(string);
    }
    public static int countWords(String string, String word)
    {
        string = string.toLowerCase();
        word = word.toLowerCase();
        if(!string.contains(word))
            return 0;
        return 1 + countWords(string.substring(string.indexOf(word) + 1), word);
    }
}
