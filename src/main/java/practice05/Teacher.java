package practice05;

public class Teacher extends Person{
    int klass;
    public Teacher(String name, int age , int klass)
    {
        super(name , age);
        this.klass = klass;
    }
    public Teacher(String name, int age)
    {
        super(name , age);
        this.klass = 0;
    }

    public int getKlass()
    {
        return this.klass;
    }

    public String introduce()
    {
        String result = super.introduce();

        if(this.klass <= 0)
            result += " I am a Teacher. I teach No Class.";
        else
            result += String.format(" I am a Teacher. I teach Class %d." , this.klass);

        return result;
    }
}
