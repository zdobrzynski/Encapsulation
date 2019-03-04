package lab4;

public class Company {

    private HrEmployee hr;

    public Company(){
        hr = new HrEmployee();
    }

    public void hireSomeone(String firstName, String lastName, String ssn){
        hr.hireEmployee(firstName, lastName, ssn);
    }

    public HrEmployee getHr() {
        return hr;
    }

    public void setHr(HrEmployee hr) {
        this.hr = hr;
    }
}
