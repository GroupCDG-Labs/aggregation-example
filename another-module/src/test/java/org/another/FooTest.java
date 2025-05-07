package org.another;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FooTest  {

    @Test
    public void aTest() {
        Foo foo = new Foo();
        assertEquals(2, foo.add(1,1));
    }
}