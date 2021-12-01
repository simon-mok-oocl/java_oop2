package practice09;


public class Student extends Person {
    Klass klass;

    public Student(int id , String name , int age , Klass klass)
    {
        super(id , name , age);
        this.klass = klass;
    }

    public String introduce()
    {
        String result = super.introduce();
        result += String.format(" I am a Student.");


        if(this.equals(this.klass.getLeader()))
            result += String.format(" I am Leader of %s." , klass.getDisplayName());
        else
            result += String.format(" I am at %s." , klass.getDisplayName());
        return result;
    }

    public Klass getKlass()
    {
        return this.klass;
    }
}