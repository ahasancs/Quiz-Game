package com.example.devnet.QuizGame;

/**
 * Created by devnet on 11/1/2017.
 */

public class Mquiz {

    public static  String[] questions = new String[]{

            "A is Alphabet",
            "0 is number",
            "One year = 365 days",
            "C is a programming language ",
            "One year = 13 months",
            "(a+b)^2= a^2 +2ab+b^2",
            "40+40*0-0 = 80",
            "smallest prime number is 1",
            "The square root of 100= 10",
            "Pi can be correctly written as a fraction",
            "-2 is an integer.",
            "  ((2^2)^3) = 2^5.",
            "The absolute value of a real negative number is negative.",
            "30% of x is equal to 0.03x",
            "Opposite angles of a parallelogram are equal.",
            "In an isosceles triangle all sides are unequal.",
            "A convex shape curves outwards.",
            "4^4 = 256",
            "100+2(3+9)*2-10=138",
            "10% of 500=50"
    };
    public static int[] images =new int[]{

            R.drawable.alphabet, R.drawable.book,R.drawable.calender,R.drawable.prog,R.drawable.calender,R.drawable.book,R.drawable.sum,R.drawable.sum,R.drawable.book,R.drawable.mat,R.drawable.mat2,R.drawable.mat3,R.drawable.mat4,R.drawable.mat,R.drawable.mat4,R.drawable.mat3,R.drawable.mat2,R.drawable.book,R.drawable.mat,R.drawable.mat3
    };

    public static boolean[] answers = new boolean[]{
            true,true,true,true,false,true,false,false,true,false,true,false,false,false,true,false,true,false,true,true
    };
}
