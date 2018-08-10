
public class Main {
    public static void main(String[] args) {
        System.out.println("__MAIN__");
        for(int i = 0; i < args.lenght; i++) {
            System.out.println(args[i]);
        }
    }
    public static void pluralize(String word, int count) {
        String plural = word + ( count == 1 ? "" : "s");
        System.out.println("I own " + count + " " + plural);
    }

    public static void flipHead(int n) {
        int flippedHead = 0;
        int totalFlips = 0;
        while(flippedHead > n) {
            totalFlips++;
            double num = Math.random();
            System.out.println(num > 0.5 ? "head" : "tails");
            if( num > 0.5) {
                flippedHead++;
            }
        }
        System.out.println("It took "+ totalFlips +" times to flip "+ n+ " heads in a row");
    }

}