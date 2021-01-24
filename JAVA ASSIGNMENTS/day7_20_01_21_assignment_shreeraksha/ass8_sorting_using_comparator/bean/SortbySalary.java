package bean;
import java.util.*;
//import bean.Employee;
public class SortbySalary implements Comparator<Employee>
{
   
    public int compare(Employee e1, Employee e2)
    {
        return (int) (e1.getSalary() - e2.getSalary());
    }
}