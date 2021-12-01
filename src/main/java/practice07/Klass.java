package practice07;

public class Klass {
    int klass;
    Person leader;

    public Klass(int klass)
    {
        this.klass = klass;
    }

    public int getNumber()
    {
        return this.klass;
    }

    public String getDisplayName()
    {
        return String.format("Class %d" , this.klass);
    }

    public void assignLeader(Person leader)
    {
        this.leader = leader;
    }

    public Person getLeader()
    {
        return this.leader;
    }
}

