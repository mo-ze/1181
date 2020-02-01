package polymorphism;


import java.util.ArrayList;
import java.util.Arrays;

public class abstactclass {

    public static void main(String[] args){
        GradStudent gs = new GradStudent("Amir", 1991, "Big Data", "Bioinformatics");
         Student s = new Student("Samir", 1985, "Computer Security");
         Instructor i = new Instructor("Ryan", 1989, 50000);
        Person p = new Instructor("Salt", 1951, 65000.00);

        ArrayList<Person> pal=new ArrayList<Person>();
        pal.add(gs);
        pal.add(s);
        pal.add(i);
        pal.add(p);
        for (Person pe:pal
             ) {
            System.out.println(pe.toString());
            
        }

    }


}
abstract class Person {
    private int birthYear;
    private String name;

    public Person( String name,int birthYear) {
        this.birthYear = birthYear;
        this.name = name;
    }

    public String toString() {
        return this.name +"\t"+ this.birthYear;
    }

    public abstract String complain();
}






 class Instructor extends Person {
    private double salary;
    public Instructor(String name, int birthYear, double salary){
        super(name, birthYear);
        this.salary = salary;
    }
    public String complain() {
        return "I didn't mark your midterm low enough!";
    }
    public String toString(){
        return super.toString() +"\t" + this.salary;
    }
}
class Student extends Person {
    private String program;
    public Student(String name, int birthYear, String program){
        super(name, birthYear);
        this.program = program;
    }
    public String complain() {
        return "You marked my midterm too low!";
    }
    public String toString(){
        return super.toString() +"\t" + this.program;
    }
}
class GradStudent extends Student {
    private String degree;
    public GradStudent(String name, int birthYear,
                       String program, String degree){
        super(name, birthYear, program);
        this.degree = degree;
    }
    public String toString(){
        return super.toString() +"\t" + this.degree;
    }
}

