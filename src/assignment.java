class SuperDepartment
{
    public String departmentName()
    {
        return "Super Department";
    }
    public String getTodayWork()
    {
        return "No Work as of now";
    }
    public String getWorkDeadline()
    {
        return"Nil";
    }
    public String isTodayAHoliday()
    {
        return "Today is not holiday";
    }
}
class AdminDepartment extends SuperDepartment
{
    public String departmentName()
    {
        return "Admin Department";
    }
     public String getTodayWork()
    {
        return "Complete your documents Submission";
    }
    public String getWorkDeadline()
    {
        return "Completed by EOD";
    }
    
}
class HrDepartment extends SuperDepartment
{
    public String departmentName()
    {
        return "Hr Department";
    }
     public String getTodayWork()
    {
        return "Fill today's timesheet and mark your attendance";
    }
    public String getWorkDeadline()
    {
        return "Completed by EOD";
    }
    public String doActivity()
    {
        return "team Lunch";
    }
    
}
class TechDeparment extends SuperDepartment
{
  public String departmentName()
    {
        return "Tech Department";
    }
     public String getTodayWork()
    {
        return "Completed coding of module 1";
    }
    public String getWorkDeadline()
    {
        return "Completed by EOD";
    } 
    public String getTechStackInformation()
    {
        return "core java";
    }
}
 public class assignment {
    public static void main(String[] args) {
        AdminDepartment ad=new AdminDepartment();
        HrDepartment hd=new HrDepartment();
        TechDeparment td =new TechDeparment();
        // Admin Department functionalities
        System.out.println("Welcome to "+ad.departmentName());
        System.out.println(ad.getTodayWork());
        System.out.println(ad.getWorkDeadline());
        System.out.println(ad.isTodayAHoliday());
        System.out.println("");
        
        //Hr Department Functionalities
        System.out.println("Welcome to "+hd.departmentName());
        System.out.println(hd.getTodayWork());
        System.out.println(hd.getWorkDeadline());
        System.out.println(hd.doActivity());
        System.out.println(hd.isTodayAHoliday());
        System.out.println("");
        
        //Tech Department Functionalities
        System.out.println("Welcome to "+td.departmentName());
        System.out.println(td.getTodayWork());
        System.out.println(td.getWorkDeadline());
        System.out.println(td.getTechStackInformation());
        System.out.println(td.isTodayAHoliday());
    }
}
