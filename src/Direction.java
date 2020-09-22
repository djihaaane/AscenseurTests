
public class Direction
{
    private final String nom;

    private Direction(String nom)
    {
        this.nom = nom;
    }

    @Override
    public String toString()
    {
        return nom;
    }

    public static  Direction UP = new Direction("UP");
    public static  Direction DOWN = new Direction("DOWN");
    public static  Direction NONE = new Direction("NONE");
}
