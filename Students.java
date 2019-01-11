import java.util.ArrayList;
/**
 * The interface Class for the Students
 *
 * @author Livanas Dimitris
 * @version 1.0
 */
public interface Students
{
    public String getStudentID();
    
    public String getStudentType();
    
    public ArrayList getModules();
    
    public boolean enoughCredits();
    
    
 }
