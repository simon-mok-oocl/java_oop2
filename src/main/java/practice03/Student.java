package practice03;


public class Student extends Person {
    int klass;

    public Student(String name , int age , int klass)
    {
        super(name , age);
        this.klass = klass;
    }

    public String introduce()
    {
        return String.format("I am a Student. I am at Class %d." , this.klass);
    }

    public int getKlass()
    {
        return this.klass;
    }
}