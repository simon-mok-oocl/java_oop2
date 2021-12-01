package practice07;


public class Teacher extends Person {

    Klass klass;

    public Teacher(int id , String name , int age , Klass klass)
    {
        super(id , name , age);
        this.klass = klass;
    }

    public Teacher(int id , String name , int age)
    {
        super(id , name , age);
        this.klass = null;
    }

    public Klass getKlass()
    {
        return this.klass;
    }

    public String introduce()
    {
        String result = super.introduce();

        if( this.klass == null || this.klass.getNumber() <= 0)
            result += " I am a Teacher. I teach No Class.";
        else
            result += String.format(" I am a Teacher. I teach %s." , this.klass.getDisplayName());

        return result;
    }


    public String introduceWith(Student student)
    {
        String result = super.introduce();
        result += " I am a Teacher.";
        if(student.getKlass().getNumber() == this.klass.getNumber())
            result += " I teach ";
        else
            result += " I don't teach ";
        result += student.getName() + '.';

        return result;

    }
}