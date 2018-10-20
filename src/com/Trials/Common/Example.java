package com.Trials.Common;

import java.util.ArrayList;
import java.util.List;

public class Example {

    public static void main(String[] args) {
        Example example = new Example();
        List<Integer> data = new ArrayList<>();
        data.add(1);
        data.add(11);
        data.add(0);
        data.add(110);
        data.add(-110);
       // List<Integer> result = new ArrayList<>();
       example.removeBigNumbers (data);
        //System.out.println(result);
    }
    public List<Integer> removeBigNumbers(List<Integer> data)
    {
        List<Integer> result = new ArrayList<>();
        List<Integer> data_modified = new ArrayList<>();
        data_modified = data;
        for (Integer i : data_modified)
        {
            if (i > 10) {
                data_modified.remove(i);
            }
            else
            {
                result.add(i);
            }
        }
        System.out.println(result);
        return result;
    }
}
