
public class Model implements Comparable<Model>
{
    private Computer superComputer;
    private String brand;
    
    public Model(Computer cpu, String br)
    {
        this.superComputer = cpu;
        this.brand = br;
    }
    public Computer getCpu() {
        return superComputer;
    }
    public String getBrand() {
        return brand;
    }
    public void setCpu(Computer newCpu) {
        this.superComputer = newCpu;
    }
    public void setBrand(String newBrand) {
        this.brand = newBrand;
    }
    public String toString() {
        return "Computer: " + superComputer + "\n Brand: " + brand;
    }
    public int compareTo(Model other) {
        if(this.superComputer == other.superComputer) {
            return 1;
        }
        else {
            return 0;
        }
    }
}
