import java.util.*;

public class EfficientRater implements rater
{
    private String myID;
    private HashMap <String, rating> myRatings;

    public EfficientRater(String myID)
    {
        this.myID = myID;
        myRatings = new HashMap<>();
    }

    public boolean hasRating(String item)
    {
        return myRatings.containsKey(item);
    }

    public void addRating(String item, double rating)
    {
        myRatings.put(item, new rating(item, rating));
    }

    public String getID()
    {
        return myID;
    }

    public double getRating(String item)
    {
        if(myRatings.containsKey(item))
        {
            return myRatings.get(item).getValue();
        }
        return -1;
    }

    public int numRatings()
    {
        return myRatings.size();
    }

    public ArrayList <String> getItemsRated()
    {
        ArrayList <String> itemsRated = new ArrayList<>();
        for(String movieID : myRatings.keySet())
        {
            itemsRated.add(movieID);
        }
        return itemsRated;
    }
}