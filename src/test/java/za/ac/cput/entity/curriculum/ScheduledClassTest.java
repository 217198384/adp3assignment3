/*
Dinelle Kotze
219089302
ScheduledClassTest.java
This is the test class for the ScheduledClass entity.
 */

package za.ac.cput.entity.curriculum;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import za.ac.cput.entity.curriculum.ScheduledClass;
import za.ac.cput.factory.curriculum.ScheduledClassFactory;

class ScheduledClassTest
{
    @Test
    void test()
    {
        ScheduledClass scheduledClass = ScheduledClassFactory.build("1",1,1,1,"10:30");
        System.out.println(scheduledClass);
        assertNotNull(scheduledClass);
    }
}