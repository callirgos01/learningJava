import java.util.*;
public class Person
{
    private String name;
    private ArrayList<Person> friends;
    private double xCoords;
    private double yCoords;

    public Person(String name)
    {
        this.name = name;
        this.friends = new ArrayList<Person>();
    }   
    public void addFriend(Person friend)
    {
        this.friends.add(friend);
    }
    
    public void unFriend(Person friend)
    {
        this.friends.remove(friend);
    }
    public double getX()
    {
        return this.xCoords;
    }
    public double getY()
    {
        return this.yCoords;
    }
    public void makeMutualFriend(Person friend)
    {
        this.addFriend(friend);
        friend.addFriend(this);
    }
    public String getFriendsList()
    {
        String toReturn = "";
        if (this.friends.size() == 0 )
        {
            toReturn = "NoFriends";
        }

        for(int i = 0; i < this.friends.size(); i++ )
        {
            toReturn += this.friends.get(i).name + " ";
        }

        return toReturn;
    }
    public String getName()
    {
        return this.name;
    }
}