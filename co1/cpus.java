

class CPU {
    int price;
    CPU(int price)
    {
        this.price=price;
    }
    class  processor{
        processor(double core,String manufcturer)
        {
            System.out.println("Cores"+core);
            System.out.println("Manufacturer:"+manufcturer);
        }
    }
    static class RAM{
        RAM(double memory,String manufcturer)
        {
            System.out.println("Memory:"+memory+"TB");
            System.out.println("Manufacturer:"+manufcturer);
        }
    }
}
public class cpus
{
    public static void main(String ...a)
    {
        CPU c = new CPU(20000);
        CPU.processor pr=c.new processor(6,"Akash");
        new CPU.RAM(1,"Akash");

    }
}