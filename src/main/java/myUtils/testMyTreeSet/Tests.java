package myUtils.testMyTreeSet;


import myUtils.MyTreeSet;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;
/**
 * Created by ivan on 21.05.16.
 */
public class Tests {

    private Set<Integer> mySet;

    @Before
    public void setUp() throws Exception {
    mySet = new MyTreeSet<>();

    }

    @Test
    public void testMyTreeSetAdd() throws Exception{
        assertTrue(mySet.add(50));
        assertFalse(mySet.add(50)); // don`t add the same val
        assertTrue(mySet.add(300));
        assertTrue(mySet.add(200));

        assertEquals(mySet.size(), 3);
    }

    @Test
    public void testMyTreeSetRemove() throws Exception {
        assertEquals(mySet.size(), 0);
        mySet.add(50);
        //mySet.add();
        //mySet.add();
        assertEquals(mySet.size(), 1);
        assertTrue(mySet.remove(50));
        assertEquals(mySet.size(), 0);
    }
}
