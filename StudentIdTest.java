

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class StudentIdTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class StudentIdTest
{
    /**
     * Default constructor for test class StudentIdTest
     */
    public StudentIdTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testStudentId()
    {
        assertEquals("t1199", StudentId.getInstance());
    }

    @Test
    public void testGetLetter()
    {
        StudentId studentI2 = StudentId.getInstance();
        assertEquals("k1242", studentI2);
        assertEquals("k", studentI2.getLetter());
    }

    @Test
    public void testGetNum()
    {
        StudentId studentI3 = StudentId.getInstance();
        assertEquals("n1692", studentI3);
        assertEquals("1692", studentI3.getNum());
    }
}



