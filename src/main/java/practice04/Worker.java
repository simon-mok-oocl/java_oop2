package practice04;


public class Worker extends Person {

    public Worker(String name, int age)
    {
        super(name , age);
    }

    @Override
    public String introduce()
    {
        String result = super.introduce();
        result += " I am a Worker. I have a job.";
        return result;
    }
}