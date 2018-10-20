package com.Trials.String.CountCharacters;

import org.junit.Test;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

class DuplicateWordsInString {
    public static void main(String[] args) {
        String test1 = "This sentence contains two words, one and two";
        String test = "One One two two three, one and two";
        Set<String> duplicates = removeDuplicates(test);
        System.out.println("input : " + test);
        System.out.println("output : " + duplicates);

    }

    public static Set<String> removeDuplicates(String input) {

        if (input.length() == 0) {
            return Collections.emptySet();
        }
        String[] words = input.split("\\s+");
        HashSet hashSet = new HashSet();
        HashSet hashSet_noDuplicates = new HashSet();
        for (String word : words) {
            if (!hashSet.add(word)) {
                hashSet_noDuplicates.add(word);
            }
        }
        System.out.println(hashSet_noDuplicates);
        return hashSet_noDuplicates;
    }
}

 class DuplicateWordsInStringTest {
     @Test
     public void testWithEmptyString()
     {
         Set<String> output = DuplicateWordsInString.removeDuplicates("");
         assertEquals(Collections.emptySet(), output); }



 }