package Solving_HackerRank;

import org.testng.annotations.Test;

import java.util.Scanner;

public class Java_StdInAndStdOutput {

    @Test
    public void StdInputAndOutput(){


        Scanner input = new Scanner(System.in);

        int i=input.nextInt();
        String string=input.nextLine();
        double d= input.nextDouble();


        System.out.println("The integer value is :  "+i);
        System.out.println("The string is : "+string);
        System.out.println("The double value is "+d);

    }

}
