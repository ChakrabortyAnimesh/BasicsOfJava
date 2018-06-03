package com.company;

public class Main {

   public static  int myScore;
    public static void main(String[] args) {
	// write your code here
         myScore = 100000;
         Score myscore=new Score();

        int total= myscore.changeScore();
        System.out.println(total);



    }
   /* public static void changeMyscore(){
        myScore+=10000;
        System.out.println("My score is: "+myScore);
    }*/
}
