import java.util.Calendar;
/**
 * A class that holds information about the Student's SmartCard
 * It contains methods that can present each information
 * The smart card consists of the students name, date of birth
 * and Student Id and also the Date that the card has been issued.
 *
 * @author Livanas Dimitris
 * @version 1.0
 */
public class SmartCard
{
    private StudentName studentName;
    private Calendar dateOfBirth;
    private StudentId studentId;
    private Calendar issueDate;

    public SmartCard(StudentName studentName, Calendar dateOfBirth, StudentId studentId, Calendar issueDate)
    {
        this.studentName = studentName;
        this.dateOfBirth = dateOfBirth;
        this.studentId = studentId;
        this.issueDate = issueDate;
    }
    
    public StudentName getName()
    {
        return studentName;
    }
    
    public Calendar getDateOfBirth()
    {
        return dateOfBirth;
    }
    
    public StudentId getStudentId()
    {
        return studentId;
    }
    
    public Calendar getIssueDate()
    {
        return issueDate;
    }
    
}
