class Client{
    public static void main(String[] args){
        System.out.println("Hello world");

        Square sq1 = new Square(2.3);

        System.out.println("The square is "+sq1.getArea());
        sq1.hear();
        sq1.respond();

        FakeDatabase mydb = new FakeDatabase(12,23,43);

        mydb.printStringDatabase();
    }
}