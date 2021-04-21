import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        // mathProblem6Test();
        // problem6Test();
        // problem7Test();
        problem8Test();
    }
    public static void mathProblem6Test() {
        System.out.println("Math.pdf Problem 6: ");

        System.out.println("16.0 : " + MathProblem6.log2(16.0f));
        System.out.println("25.0 : " + MathProblem6.log2(25.0f));
    }

    public static void problem6Test() {
        System.out.println("Problem 6: ");

        System.out.println("Bitmask: input = {1} : "
            + Problem6.powerSet(new ArrayList<>(Arrays.asList(1)) )
        );
        System.out.println("Bitmask: input = {1, 2} : "
            + Problem6.powerSet(new ArrayList<>(Arrays.asList(1, 2)) )
        );
        System.out.println("Bitmask: input = {1, 2, 3} : "
            + Problem6.powerSet(new ArrayList<>(Arrays.asList(1, 2, 3)) )
        );


        System.out.println("DFS: input = {1} : "
            + Problem6.powerSetDFS(new ArrayList<>(Arrays.asList(1)) )
        );
        System.out.println("DFS: input = {1, 2} : "
            + Problem6.powerSetDFS(new ArrayList<>(Arrays.asList(1, 2)) )
        );
        System.out.println("DFS: input = {1, 2, 3} : "
            + Problem6.powerSetDFS(new ArrayList<>(Arrays.asList(1, 2, 3)) )
        );
    }

    public static void problem7Test() {
        System.out.println("Problem 7: ");
    
        // changer i < 20 to i <= 20 in order to match the output given in the statement

        System.out.print("Slow recursive: ");
        for(int i = 0; i <= 20; ++i) {
            if(i > 0) {System.out.print(", ");}
            System.out.print(Problem7.generate(i));
        }
        System.out.println("");

        System.out.print("Faster linear: ");
        for(int i = 0; i <= 20; ++i) {
            if(i > 0) {System.out.print(", ");}
            System.out.print(Problem7.generateFaster(i));
        }
        System.out.println("");
    }

    public static void problem8Test() {
        System.out.println("Problem 8: ");

        System.out.println("Slow 4, 6: " + Problem8.smallestCommon(4, 6));
        System.out.println("Slow 3, 5: " + Problem8.smallestCommon(3, 5));
        System.out.println("Slow 7, 14: " + Problem8.smallestCommon(7, 14));


        System.out.println("Faster 4, 6: " + Problem8.smallestCommonFaster(4, 6));
        System.out.println("Faster 3, 5: " + Problem8.smallestCommonFaster(3, 5));
        System.out.println("Faster 7, 14: " + Problem8.smallestCommonFaster(7, 14));
    }
}
