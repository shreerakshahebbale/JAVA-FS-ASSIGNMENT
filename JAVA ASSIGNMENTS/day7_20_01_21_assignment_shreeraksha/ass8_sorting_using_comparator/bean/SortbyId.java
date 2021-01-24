package bean;
import java.util.*;
//import bean.Employee;

public class SortbyId implements Comparator<Employee>
	{
	    
	    public int compare(Employee e1, Employee e2)
	    {
	        return e1.getId() - e2.getId();
	    }
	}