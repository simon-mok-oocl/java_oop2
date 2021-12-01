package practice07;

public class Person {
    private String name;
    private int age;
    private int id;

    public Person(int id , String name, int age) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String introduce()
    {
        return String.format("My name is %s. I am %d years old." , this.name , this.age);
    }

    public int getId()
    {
        return id;
    }

    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        else
            return this.id == ((Person)obj).getId();
    }

}
