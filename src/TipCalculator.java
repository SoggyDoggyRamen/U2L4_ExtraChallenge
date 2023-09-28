public class TipCalculator {
    double totalBill;
    double tipPercentage;
    int numOfPeople;
    double tip;
    double total;

    public TipCalculator(double totalBill, double tipPercentage, int numOfPeople)
    {
        this.totalBill = totalBill;
        this.tipPercentage = tipPercentage;
        this.numOfPeople = numOfPeople;
    }

    public double getTotal()
    {
        total = totalBill + totalBill * tipPercentage;
        return total;
    }

    public double getTip()
    {
        tip = totalBill * tipPercentage;
        return tip;
    }

    public double tipPerPerson()
    {
        double tipPerPerson = tip / numOfPeople;
        return tipPerPerson;
    }

    public double totalPerPerson()
    {
        double totalPerPerson = total / numOfPeople;
        return totalPerPerson;
    }
}
