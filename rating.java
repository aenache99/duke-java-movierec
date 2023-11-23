public class rating implements Comparable <rating>
{
    private String item;
    private double value;

    public rating(String item, double value)
    {
        this.item = item;       //IMDB Movie ID
        this.value = value;     //actual rating
    }

    public String getItem()
    {
        return item;
    }

    public double getValue()
    {
        return value;
    }

    public String toString()
    {
        return "[" + getItem() + ", " + getValue() + "]";
    }

    public int compareTo(rating other)
    {
        return Double.compare(value, other.value);
    }
}