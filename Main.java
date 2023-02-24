public class Main
{
    private int a = 0;
    private int b = 0;

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void print(int num) {
        System.out.println(num);
    }

    // default constructor
    Main() {}

    // constructor
    Main(int t_a, int t_b)
    {
        this.a = t_a;
        this.b = t_b;
    }
    public static void main(String[] args) {
            Main obj = new Main(20, 30);

            obj.print(obj.getA());
            obj.print(obj.getB());
    }
}