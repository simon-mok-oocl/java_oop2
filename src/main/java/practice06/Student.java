package practice06;


public class Student extends Person {
    Klass klass;

    public Student(String name , int age , Klass klass)
    {
        super(name , age);
        this.klass = klass;
    }

    public String introduce()
    {
        String result = super.introduce();
        result += String.format(" I am a Student. I am at %s." , klass.getDisplayName());
        return result;
    }

    public Klass getKlass()
    {
        return this.klass;
    }
}