package practice06;

public class Klass {
    int klass;

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
}
