public class DaysSolution {
    public static void main(String[] args)
    {
        int aYear = 1964;
        int aMonth = 11;
        int aDayOfMonth = 28;
        int daysToAdd = 228;
        Day days = new Day(aYear, aMonth, aDayOfMonth);

        System.out.println(days.toString());
        days.addDays(daysToAdd);
        System.out.println(days.toString());

    }
}