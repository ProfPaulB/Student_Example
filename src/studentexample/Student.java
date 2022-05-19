package studentexample;

/**
 * This class represents a Student and is a 
 * POJO (Plain Old Java Object)
 *
 * @author Paul Bonenfant
 */
public class Student {
    
    private String name;
    private int age;

    public Student(String name) {
        this.name = name;
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
        
        if (age > 0) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Age must be > 0");
        }
    } 
}
