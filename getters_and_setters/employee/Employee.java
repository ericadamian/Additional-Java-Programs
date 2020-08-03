// java program by Eric Adamian
// setters and getters for variables for main method

public class Employee{

    public String ssn, name, position;
    public float salary;

    public Employee(String ssn1, String name1, String position1, int salary1){
        ssn = ssn1;
        name = name1;
        position = position1;
        salary = salary1;
    }
    
    public void raise1(float percentage){
        salary += salary * (percentage / 100);
    }

    public void raise2(int amount){
        salary += amount;
    }

    public void raise3(){
        salary += 5000;
    }

    public void setName(String name1){
        name = name1;
    }

    public String getName(){
        return name;
    }

    public void setPosition(String position1){
        position = position1;
    }

    public String getPosition(){
        return position;
    }

    public void setSalary(int salary1){
        salary = salary1;
    }

    public double getSalary(){
        return salary;
    }

    public void setSSN(String ssn1){
        ssn = ssn1;
    }

    public String getSSN(){
       return ssn;
    }

    public boolean equals(Employee e){
        boolean compare;

        if(salary == e.salary){
            compare = true;
        }else{
            compare = false;
        }
      
        return compare;
    }

    public String toString(){
        String str= "\nSsn: " + ssn +
                    "\nName: " + name +
                    "\nPosition: "+ position +
                    "\nSalary: $" + salary;
        return str;
    }

}