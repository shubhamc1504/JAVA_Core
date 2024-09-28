class Computer
{

    public void playMusic()
    {
        System.out.println("Coldplay");
    }
    public String getMeAPen(int cost)
    {
        if (cost >10) {
            return "Blue pen";
        }
        else
        return "Black pen";
    }
}

public class Methods {
    public static void main(String[] args) {
        Computer comp = new Computer();
        comp.playMusic();
        String str = comp.getMeAPen(20);
        System.out.println(str);
    }
}
