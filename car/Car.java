public class Car
{
    private double milesDriven;
    private double gasInTank;
    private double milesPerGalon;
    public Car(double milesPerGalon)
    {
        this.milesPerGalon = milesPerGalon;
    }
    public void drive(double distance)
    {
        this.milesDriven += distance;
        this.gasInTank -= (distance / milesPerGalon);
    }
    public void addGas(double amount)
    {
        this.gasInTank += amount;    
    }
    public double getMilesDrive()
    {
        return this.milesDriven;
    }
    public double getGasInTank()
    {
        return this.gasInTank;
    }
}