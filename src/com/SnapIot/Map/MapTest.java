package com.SnapIot.Map;
import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class MapTest {
    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testStandardMap() {
        // Standard Map
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("Lars", 1);
        map.put("Larss", 2);
        map.put("Larsss", 3);
        assertEquals(java.util.Optional.ofNullable(map.get("Lars")), 1);

        for (int i = 0; i < 100; i++) {
            map.put(String.valueOf(i), i);
        }
        assertEquals(map.size(), 101);

        assertEquals(map.get("51"), java.util.Optional.of(51));
        map.keySet();
    }
}
