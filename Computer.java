import java.util.Scanner;
public class Computer implements Comparable<Computer>
{
    private static int totalComputers;
    private static int totalModels;
    Scanner scan = new Scanner(System.in);
    public Computer(int comp, int mod)
    {
        this.totalComputers = comp;
        this.totalModels = mod;
    }
    
    public int getComp() {
        return this.totalComputers;
    }
    
    public int getModels() {
        return this.totalModels;
    }
    
    public void setComp(int newTotal, int newModels) {
        totalComputers = newTotal;
        totalModels = newModels;
    }
    
    public void setModels(int newModels) {
        totalModels = newModels;
    }
    
    public void sellComputer() {
        System.out.println("Dot you need a new Computer? (y/n)");
        String answer = scan.next();
        if(answer.equals("y")){
            System.out.println("Well Best Buy has your next computer waiting for you!");
        }
        else {
            System.out.println("Come back when you need a new one then!");
        }
    }
    
    public String toString() {
        return "There are " + totalComputers + " computers in total, made up by " + totalModels + " models.";
    }
    
    public int compareTo(Computer other) {
        if(this.totalComputers == other.totalComputers) {
            return 1;
        }
        else {
            return 0;
        }
        
    }
        
}
