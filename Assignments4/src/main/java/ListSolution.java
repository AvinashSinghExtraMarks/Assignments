import java.util.ArrayList;
import java.util.Scanner;

public class ListSolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int leng = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < leng; i++) {
            int temp = sc.nextInt();
            list.add(temp);
        }
        int test = sc.nextInt();
        for(int i = 0; i < test; i++) {
            String s =  sc.next();
            if(s.equals("Insert")) {
                int index = sc.nextInt();
                int value = sc.nextInt();
                list.add(index, value);
            } else if(s.equals("Delete")) {
                int index = sc.nextInt();
                list.remove(index);
            } else {
                System.out.println("Invalid Name");
            }
        }
        for(int i : list) {
            System.out.print(i+ " ");
        }
    }
}
