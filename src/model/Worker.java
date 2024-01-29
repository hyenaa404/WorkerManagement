
package model;

/**
 *
 * @author Admin
 */
public class Worker {
    private Log log;
    private String id;
    private String name;
    private int age;
    private float salary;
    private String workLocation;

    public Worker() {
    }

    public Worker(String id, String name, int age, float salary, String workLocation, Log log) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.workLocation = workLocation;
        this.log = log;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getWorkLocation() {
        return workLocation;
    }

    public void setWorkLocation(String workLocation) {
        this.workLocation = workLocation;
    }

    public Log getLog() {
        return log;
    }

    public void setLog(Log log) {
        this.log = log;
    }
    
    

    @Override
    public String toString() {
        System.out.printf("%-10s | %-20s | %-10.2f ", id, name, salary);
        log.toString();
        return "";
    }

    
    
}
