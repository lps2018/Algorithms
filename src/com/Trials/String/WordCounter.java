package com.Trials.String;

public class WordCounter {
    public static void main(String[] args) {
        String word = "  Good   v  Morning";
        wordcount( word);
    }

    public static int wordcount(String word) {

        int count =0;
        if(word.length()==0)
        {
            return 0;
        }
        char [] char_array = word.toCharArray();
        for(int i =0;i<word.length();i++)
        {
            if (((i > 0) && (char_array[i] != ' ') && (char_array[i - 1] == ' ')) || ((char_array[0] != ' ') && (i == 0)))
            {
                count++;
            }


        }
        System.out.println(count);
        return 0;
    }
}
