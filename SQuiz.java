package com.example.devnet.QuizGame;

/**
 * Created by devnet on 11/1/2017.
 */

public class SQuiz {

    public static  String[] questions = new String[]{

            "c is programing language",
            "A terabyte is equal to 1 million gigabytes",
            "The wire of an electric bulb is known as the filament",
            "The SI unit of electric current is ampere",
            "Glass is attracted by a magnet",
            "Magnet attracted by Iron ",
            "Antoine Lavoisier is honored as Father of Modern Chemistry",
            "Sulphur dioxide gases cause acid rain",
            "Microsoft office is a piece of software",
            "Thermoplastics type of plastics can be recycled",
            "A firewall is a type of hardware",
            "CD stands for collective disk",
            "The three chambers at the bottom of your heart are called ventricles.",
            "Atomic bombs work by atomic fission.",
            "Spiders have six legs.",
            "Sharks are mammals.",
            "Kelvin is a measure of temperature.",
            "A monitor displays information",
            "Food chains always start with a green plant.",
            "A pen drive is a storage device"
    };
    public static int[] images =new int[]{

            R.drawable.prog, R.drawable.tb,R.drawable.bul,R.drawable.curent,R.drawable.glas,R.drawable.mag,R.drawable.ceme,R.drawable.acid,R.drawable.office,R.drawable.pls,R.drawable.fire,R.drawable.cd,R.drawable.brain,R.drawable.atom,R.drawable.spider,R.drawable.shark,R.drawable.kk,R.drawable.moni,R.drawable.food,R.drawable.pend
    };

    public static boolean[] answers = new boolean[]{
            true, false,true,true,false,true,true,true,true,true,false,false,false,true,false,false,true,true,false,true
    };
}
