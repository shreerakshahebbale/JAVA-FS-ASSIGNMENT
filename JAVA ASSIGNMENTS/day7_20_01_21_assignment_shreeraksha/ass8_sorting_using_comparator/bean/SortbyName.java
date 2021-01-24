package bean;
import java.util.*;
//import bean.Employee;
public class SortbyName implements Comparator<Employee>
{
   
    public int compare(Employee e1, Employee e2)
    {
        return e1.getName().compareTo(e2.getName());
    }
}