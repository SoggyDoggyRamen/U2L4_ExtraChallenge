import java.util.Scanner;

public class TipCalculatorRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //Getting user input
        System.out.print("Bill: ");
        String b = s.nextLine();
        double bill = Double.parseDouble(b);
        System.out.print("Tip Percent: ");
        String t = s.nextLine();
        int tipPercent = Integer.parseInt(t);
        System.out.print("Num of People: ");
        String n = s.nextLine();
        int numOfPpl = Integer.parseInt(n);

        //doing calculatiosnes
        TipCalculator calculator = new TipCalculator(bill, tipPercent, numOfPpl);
        double total = calculator.getTotal();
        double tip = calculator.getTip();
        double totalPerPerson = calculator.tipPerPerson();
        double tipPerPerson = calculator.totalPerPerson();

        //Print
        System.out.print("-----------------------------------------------------");
        System.out.println();
        System.out.println("Total tip amount: $" + String.format("%.2f", tip));
        System.out.println("Total Paid: $" + String.format("%.2f", total));
        System.out.println("Tip per Person: $" + String.format("%.2f", tipPerPerson));
        System.out.print("Total per Person: $" + String.format("%.2f", totalPerPerson));

    }
}