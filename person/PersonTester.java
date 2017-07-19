
public class PersonTester
{
    public static void main(String[] args)
    {
        Person me = new Person("Carlos");
        Person someOneElse = new Person("jake");
        Person morepeeps1 = new Person("mila");
        Person morepeeps2 = new Person("Stew");
        Person morepeeps3 = new Person("DufusRick");
        Person morepeeps4 = new Person("NotAnotherBot");
        Person morepeeps5 = new Person("FakeFriend");
        
        me.makeMutualFriend(someOneElse);
        me.makeMutualFriend(morepeeps1);
        me.makeMutualFriend(morepeeps2);
        me.addFriend(morepeeps3);
        me.addFriend(morepeeps4);
        me.addFriend(morepeeps5);
        
        System.out.println(me.getName() + "->  "+ me.getFriendsList());

        me.unFriend(someOneElse);

        System.out.println(me.getName() + "->  "+ me.getFriendsList());
        System.out.println(someOneElse.getName() + "->  "+ someOneElse.getFriendsList());
        System.out.println(morepeeps1.getName() + "->  "+ morepeeps1.getFriendsList());
        System.out.println(morepeeps2.getName() + "->  "+ morepeeps2.getFriendsList());
        System.out.println(morepeeps3.getName() + "->  "+ morepeeps3.getFriendsList());
        System.out.println(morepeeps4.getName() + "->  "+ morepeeps4.getFriendsList());

    }
}