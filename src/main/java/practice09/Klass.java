package practice09;

import java.util.ArrayList;

public class Klass {
    int klass;
    Person leader;
    ArrayList<Student> members= new ArrayList();

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

    public void assignLeader(Student leader)
    {
        if (members.contains(leader)) {
            this.leader = leader;
        } else {
            System.out.printf("It is not one of us.\n");
        }
    }

    public void appendMember(Student member)
    {
        if(!members.contains(member))
            members.add(member);
    }

    public Person getLeader()
    {
        return this.leader;
    }
}