
/**
 * A class that creates the Students name. The name contians a first name
 * and a last name. The class contains methods that return both first and last name
 * seperately and also a method that return the full name of the student.
 *
 * @Livanas Dimitris
 * @version 1.0
 */
public final class StudentName
{
    private String firstName;
    private String lastName;

    public StudentName(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getStudentName()
    {
        return firstName + " " + lastName;
    }
}
