package Solving_HackerRank;

public class Java_If_Else {

    public static void main(String[] args) {


    int n=18;


        if (n%2==1){
        System.out.println("weird");
    }
        if ( n%2==0 || ( n>=2 && n<=6)){
        System.out.println("Not Weird");

    }
            else if( n%2==0 || ( n>=6 && n<=20)){
        System.out.println("Weird");
    }
            else if ( n%2==0 && n>20){
        System.out.println("not Weird");}

            else{
        System.out.println("out of logic");
    }
}


}
