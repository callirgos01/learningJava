public class Bill
{
    public static void main(String[] args)
    {
        double[] items = {1, 10};
        System.out.println(items[0]);
        System.out.println(items[1]);
        System.out.println(items.length);
        double totalCost = 0;
        for( int i=0; i<items.length; i++ )
        {
            double tax = items[i] * 0.08;
            double tip = items[i] * 0.18;
            totalCost += items[i] + tax + tip;
            System.out.format("item %d |cost = $%.2f| |tip = $%.2f| |tax = $%.2f| |total = $%.2f| [running COST = $%.2f]\r\n", i, items[i], tip, tax, (items[i] + tax + tip), totalCost);
        }
        System.out.format("totalCost = %.2f\r\n",totalCost);
    }
}