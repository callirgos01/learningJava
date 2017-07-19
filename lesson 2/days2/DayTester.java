public class DayTester
{
    /*
    public static void main(String[] args)
    {
        Day today = new Day(2010, 2, 15); // February 15, 2010
        today.addDays(30);

        System.out.println(today.getYear());
        System.out.println("Expected: 2010");
        System.out.println(today.getMonth());
        System.out.println("Expected: 3");
        System.out.println(today.getDayOfMonth());
        System.out.println("Expected: 13");
        System.out.println(today.daysFrom(today));
        System.out.println("Expected: 30");
    }*/
    //Quiz 19
    /**
       returns the number of days Sally Raides was alive
       @param aYear a year (any number other than 0)
       @param aMonth a month between 1 and 12
       @param aDayOfMonth a day of the month between 1 and 31
    */
    public static void main(String[] args)
    {
        Day birthDay = new Day(1951, 5, 26); //Sally Ride's Birth Day 
        Day deathDay = new Day(2012, 7, 23); //Sally Ride's Death Day

        System.out.println(deathDay.daysFrom(birthDay));
    }



}
