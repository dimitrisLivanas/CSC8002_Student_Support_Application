import java.util.HashMap;
import java.util.Random;
/**
 * The class that creats the Student Id for the Students.
 * The Id contains a letter followed by numbers and must be
 * unique for each student. I used the random class to generate 
 * a random letter and four random numbers. The stringRep is
 * the random number followed by the four random numbers.
 * I am using a factory (getInstance) to make sure of the uniqueness
 * of the Students Id.
 *
 * @Livanas Dimitris
 * @version 1.0
 */
public final class StudentId
{
    // instance variables - replace the example below with your own
    private static final HashMap<String, StudentId> id = new HashMap<String, StudentId>();
    private final char letter;
    private final int number;
    private final String stringRep;
    
    private StudentId(char letter, int number, String stringRep)
    {
        this.letter = letter;
        this.number = number;
        this.stringRep = stringRep;
    }
    
    public static StudentId getInstance()
    {
        Random rand = new Random();
        Character letter = (char)(rand.nextInt(50) + 'a');
        int number = rand.nextInt(1000)+1000;
        String stringRep = letter + "" + number;
        StudentId studentId = id.get(stringRep);
        if (studentId == null)
        {
            studentId = new StudentId(letter, number, stringRep);
            id.put(stringRep, studentId);
        }
        return studentId;
    }
    
    public char getLetter() 
    {
        return letter;
    }
    
    public int getNum()
    {
        return number;
    }
    
    public String getStringRep()
    {
        return stringRep;
    }
}
