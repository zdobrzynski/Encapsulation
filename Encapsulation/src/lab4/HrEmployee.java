package lab4;

import java.util.ArrayList;

public class HrEmployee {
    private ArrayList<Employee> employees;

    public void HrEmployee(){
        employees = new ArrayList<>();
    }

    public void hireEmployee(String firstName, String lastName, String ssn){
        Employee holder = new Employee(firstName, lastName, ssn);
        employees.add(holder);
        holder.doFirstTimeOrientation("A101");
    }

}
