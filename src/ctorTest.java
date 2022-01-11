class ctor {
    String name;
    int score;
    static String className = "1반";

    public ctor(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

public class ctorTest {
    public static void main(String[] args) {

        ctor Mr_A = new ctor("Mr.A",100);
        ctor Mr_B = new ctor("Mr.B",90);
        ctor Mr_C = new ctor("Mr.C",80);

        printMember(Mr_A);
        printMember(Mr_B);
        printMember(Mr_C);
    }

    private static void printMember(ctor ct) {
        System.out.println(ctor.className+" "+ct.name+"의 점수: "+ct.score);
    }
}