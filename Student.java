import java.util.ArrayList;
/**
 * Abstract class Student - In this class i have the methods necessary to get
 * certain information about the Students
 *  a) A list of student's modules
 *  b) The Student ID
 *  c) The Student Type
 *  d) A method that checks if the student has enough credits.
 *
 * @author Livanas Dimitris
 * @version 1.0
 */
public abstract class Student implements Students
{
    private StudentId sId;
    private int maxCredits;
    private int currentCredits;
    private boolean enoughCredits;
    private ArrayList<Module> moduleList;
    
    public Student(int maxCredits, int currentCredits, boolean enoughCredits)
    {
        StudentId id = StudentId.getInstance();
        sId = id;
        this.maxCredits = maxCredits;
        this.currentCredits = currentCredits;
        this.enoughCredits = enoughCredits;
        this.moduleList = new ArrayList<>();
    }
    
    public void addModule(Module module)
    {
        moduleList.add(module);
    }
    
    public ArrayList getModules()
    {
        return moduleList;
    }
    
    public String getStudentId()
    {
        return sId.getStringRep();
    }
    
    public boolean enoughCredits(int maxCredits, int credits)
    {
        if ( maxCredits == credits)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public String getStudentType(int maxCredits)
    {
        if (maxCredits == 120)
        {
            System.out.println("Undergraduate (UG)");
        }
        else if (maxCredits == 180)
        {
            System.out.println("Postgraduate Taught (PGT)");
        }
        else if (maxCredits == 0)
        {
            System.out.println("Postgraduate Research (PGR)");
        }
        else 
        {
            System.out.println("Not a student type");
        }
        return "";
    }
}
