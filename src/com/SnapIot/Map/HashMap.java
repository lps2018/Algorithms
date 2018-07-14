package com.SnapIot.Map;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashMap<K, V>
{
    private int size;
    private int DEFAULT_CAPACITY = 16;
    private MapObject<K, V>[] values = new MapObject[DEFAULT_CAPACITY];

//get operation
public V get (K key)
{
    for (int i = 0; i < size; i++)
    {
        if (values[i] != null)
        {
           if (values[i].getKey().equals(key))
           {
              return  values[i].getValue();
           }
        }
    }
    return null;
}


    public void put(K key, V value)
    {
        boolean insert = true;
        for (int i = 0; i < size; i++)
        {
            if (values[i].getKey().equals(key))
            {
                values[i].setValue(value);
                insert = false;
            }
        }
        if (insert)
        {
            ensureCapa();
           values[size++] = new MapObject<K, V>(key, value);
        }

    }
   private void ensureCapa()
    {
        if (size == values.length)
        {
            int newSize = values.length * 2;
            values = Arrays.copyOf(values, newSize);
        }
    }

    public void remove(K key) {
        for (int i = 0; i < size; i++) {
            if (values[i].getKey().equals(key))
            {
                values[i] = null;
                size--;
                condenseArray(i);
            }
        }
    }

 private void condenseArray(int start) {
        for (int i = start; i < size; i++) {
            values[i] = values[i + 1];
        }
    }

   public Set<K> keySet()
   {
       Set<K> set = new HashSet<K>();
       for (int i = 0; i < size; i++)
       {
           set.add(values[i].getKey());
       }
       return set;
   }


    public int size() {
        return size;
    }
}
