package com.SnapIot.Map;

public class MapObject<K, V> {

    private final K key; // got error to implement constructor
    private V value;

    public MapObject(K key, V value)
    {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

   /* public void setKey(K key) //wont get generated as key is final
   {
        this.key = key;
    }*/
}
