package com.company;

public class Main {

   public static  int myScore;
    public static void main(String[] args) {
	// write your code here
         myScore = 100000;
         Score myscore=new Score();

        int total= myscore.changeScore();
        System.out.println(total);

        Maximum maximum=new Maximum();
       double result= maximum.max(85, 56);
        System.out.println("The maximum number is : "+result);



    }
   /* public static void changeMyscore(){
        myScore+=10000;
        System.out.println("My score is: "+myScore);
    }*/
}
