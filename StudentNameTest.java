

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class StudentNameTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class StudentNameTest
{
    /**
     * Default constructor for test class StudentNameTest
     */
    public StudentNameTest()
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
    public void testGetFirstName()
    {
        StudentName studentN2 = new StudentName("Dimitris", "Livanas");
        assertEquals("Dimitris", studentN2.getFirstName());
    }

    @Test
    public void testGetLastName()
    {
        StudentName studentN1 = new StudentName("Ana", "Tasuli");
        assertEquals("Tasuli", studentN1.getLastName());
    }

    @Test
    public void testFullName()
    {
        StudentName studentN1 = new StudentName("Maria", "Arvaniti");
        assertEquals("Maria Arvaniti", studentN1.getStudentName());
    }
}



