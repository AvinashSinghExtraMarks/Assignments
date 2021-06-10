import java.util.*;

public class ArrayListSolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        ArrayList[] list = new ArrayList[len];
        for(int i = 0; i < len; i++) {
            int temp = sc.nextInt();
            list[i] = new ArrayList<Integer>();
            int val;
            for(int j = 0; j < temp; j++) {
                val = sc.nextInt();
                list[i].add(val);
            }
        }
        int testCase = sc.nextInt();
        System.out.println();
        for(int i = 0; i < testCase; i++) {
            try {
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println(list[a-1].get(b-1));
            } catch (IndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }
        }
    }
}
