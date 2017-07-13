// TODO: Decide whether this is a compile-time or run-time error.

public class CompileOrRunTime
{
    private static class Car{
        public Car(int mpg, int price)
        {
            this.price = price;
            this.mpg = mpg;
            this.TotalCost = ( (this.milesDriven / this.mpg) * this.priceOfGasPerGalon ) + this.price;
        }
        public int mpg;
        public int price;
        private static int priceOfGasPerGalon = 4;
        private static int milesDriven = 50000;
        public int TotalCost;
    }
    public static void main(String[] args)
    {
        //total cost car algo
        Car car1 = new Car(10, 15000);
        Car car2 = new Car(50, 30000);
        
        System.out.format("Car 1 Total Cost %d\r\n", car1.TotalCost);
        System.out.format("Car 2 Total Cost %d\r\n", car2.TotalCost);
        if( car1.TotalCost < car2.TotalCost )
        {
            System.out.println( "Pick Car 1!!!");
        }
        else
        {
            System.out.println( "Pick Car 2!!!");
        }
        
    }
}

