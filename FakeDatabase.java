

public class FakeDatabase{
    private int[] db = new int[3];


    FakeDatabase(int firstValue, int secondValue, int thirdValue){
        this.db[0] = firstValue;
        this.db[1] = secondValue;
        this.db[2] = thirdValue;
    }

    private int[] getDatabase(){
        return this.db;
    }

    public void printStringDatabase(){
        String[] myStringArray = new String[3];

        for(int i = 0; i < getDatabase().length; i++){
            myStringArray[i] = Integer.toString(getDatabase()[i]);
        }

        String myString = "";

        for(int i = 0; i < getDatabase().length; i++){
            myString += "Number " + Integer.toString(i+1) + " is: " + myStringArray[i] + " ,"; 
        }

        System.out.println(myString);
    }

    public void updateDatabase(){
        System.out.println("Not yet implemented");
    }

}