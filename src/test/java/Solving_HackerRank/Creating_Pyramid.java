package Solving_HackerRank;

public class Creating_Pyramid {
    public static void main(String[] args) {

        for (int count = 1, row = 1; row < 10; row++,count++) {
            for (int i=0;i < count; i++)
                System.out.print('^');
            System.out.print('\n');
        }
    }
}