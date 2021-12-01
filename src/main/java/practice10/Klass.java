package practice10;



import java.util.ArrayList;

public class Klass {
    int klass;
    Teacher teacher;
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

    public void assignLeader(Person leader)
    {
        if (members.contains(leader)) {
            this.leader = leader;
            if(teacher != null)
                System.out.printf("I am %s. I know %s become Leader of %s.\n" , teacher.getName() , leader.getName() , this.getDisplayName());
        } else {
            System.out.printf("It is not one of us.\n");
        }
    }

    public void appendMember(Student member) {
        System.out.println("1111111------------------------------------------");
        System.out.println(!members.contains(member));

        if (!members.contains(member)) {
            members.add(member);
            if(teacher != null )
                System.out.printf("I am %s. I know %s has joined %s.\n", teacher.getName(), member.getName(), this.getDisplayName());

        }
    }

    public Person getLeader()
    {
        return this.leader;
    }

    public void setTeacher(Teacher teacher)
    {
        this.teacher = teacher;
    }
}