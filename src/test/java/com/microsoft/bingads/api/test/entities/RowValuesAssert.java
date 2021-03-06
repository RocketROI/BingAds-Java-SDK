package com.microsoft.bingads.api.test.entities;

import com.microsoft.bingads.internal.bulk.RowValues;
import java.util.Map;
import static org.junit.Assert.assertEquals;

public class RowValuesAssert {

    public static void assertContains(Map<String, String> expected, RowValues actual) {        
        for (String expectedKey : expected.keySet()) {
            assertEquals(expected.get(expectedKey), actual.get(expectedKey));
        }
    }
}
