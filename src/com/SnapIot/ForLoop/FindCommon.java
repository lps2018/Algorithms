package com.SnapIot.ForLoop;

import java.util.ArrayList;
import java.util.List;

public class FindCommon {
    public static void main(String[] args) {

        List <Integer> list1 = new ArrayList<>() ;
        List <Integer> list2 = new ArrayList<>() ;
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list2.add(1);
        list2.add(7);
        list2.add(9);
        list2.add(12);
        list2.add(5);
        FindCommon findCommon = new FindCommon();
        findCommon.findCommonElements(list1,list2);
        List list =   findCommon.findCommonElements(list1,list2);
        System.out.println(list);
    }

    public List  findCommonElements(List<Integer>list1,List<Integer>list2)

    {
        List list3 = new ArrayList<>() ;
        for (int element1:list1) {
            for (int element2:list2) {

                if(element1==element2)
                {
                    list3.add(element1)  ;
                }

            }
        }
       // System.out.println(list3);
        return list3;
    }
}
