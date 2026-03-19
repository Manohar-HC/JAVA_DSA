class returnoops {//calculator

    int add(int a, int b) {
        return a + b;
    }
public class main {
    public static void main(String[] args) {

       returnoops c1 = new returnoops();
        int result = c1.add(5, 3);

        System.out.println(result);

    }
}
}
