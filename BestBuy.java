
public class BestBuy
{
    
    public static void main(String[] args)
    {
        //Create 2 objects and print them: (Computer Count, Model Count)
        Computer compOne = new Computer(125, 12);
        System.out.println(compOne);
        Computer compTwo = new Computer(58, 9);
        System.out.println(compTwo);
        changeIt(compOne, compTwo);
        System.out.println(compOne);
        System.out.println(compTwo);
    }
    
    public static void changeIt(Computer obj1, Computer obj2) {
        obj1.setComp(50, 65);
        obj2.setComp(20, 8);
    }
    //The changeIt method essentially switches the values of the original
    //object(computer in this case)
}
