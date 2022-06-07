import java.util.Scanner;

class Client {
    public static void main(String[] args) {

        System.out.println("Hello world");

        Square sq1 = new Square(2.3);

        System.out.println("The square is " + sq1.getArea());
        sq1.hear();
        sq1.respond();

        FakeDatabase mydb = new FakeDatabase(12, 23, 43);

        mydb.printStringDatabase();

        System.out.println(mydb.addToDatabase(2, 9001));

        mydb.printStringDatabase();

        Name myName = new Name("Quincy", "Hill");

        System.out.println(myName.getName());

        myName.setName("Yeeter", "McSkeeter");

        System.out.println(myName.getFirst());
        System.out.println(myName.getLast());

        Scanner scanner = new Scanner(System.in);
        try {
            // Do scanner stuff
            System.out.println("Principal: ");
            int principle = scanner.nextInt();

            System.out.println("Annual Interest Rate: ");
            float annualInterestRate = scanner.nextFloat();

            System.out.println("Period in years: ");
            int periodInYears = scanner.nextInt();

            MortgageCalculator myMortgage = new MortgageCalculator(principle, annualInterestRate, periodInYears);

            System.out.println("Monthly Payment: " + myMortgage.calculateMonthlyPayment());
        } finally {
            scanner.close();
        }

    }
}