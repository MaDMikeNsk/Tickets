public class Loader
{
    public static void main(String[] args)
    {
        int i = 200000;
        do {
            System.out.println("Ticket number: " + i);
            i++;
        }
        while (i < 210001);
    }
}