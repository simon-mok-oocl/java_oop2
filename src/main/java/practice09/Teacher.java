package practice09;


import java.util.LinkedList;

public class Teacher extends Person {

    Klass klass;
    LinkedList<Klass> classes;

    public Teacher(int id , String name , int age , LinkedList<Klass> classes)
    {
        super(id , name , age);
        this.classes = classes;
    }

    public Teacher(int id , String name , int age)
    {
        super(id , name , age);
        this.klass = null;
    }


    public LinkedList<Klass> getClasses()
    {
        return this.classes;
    }
    public String introduce()
    {
        String result = super.introduce();
        result += " I am a Teacher.";
        boolean first=true;

        if(classes==null || classes.size() == 0)
        {
            result += " I teach No Class.";
        }
        else
        {
            result += " I teach Class ";
            for(Klass k : classes)
            {
                if(!first)
                    result += ", ";
                result += k.getNumber();
                first=false;
            }
            result += ".";
        }

        return result;
    }


    public String introduceWith(Student student)
    {
        String result = super.introduce();
        result += " I am a Teacher.";

        if(this.isTeaching(student))
            result += " I teach ";
        else
            result += " I don't teach ";
        result += student.getName() + '.';

        return result;

    }

    public boolean isTeaching(Student student)
    {
        for(Klass k : classes)
            if(student.getKlass().getNumber() == k.getNumber())
                return true;
        return false;
    }
}
