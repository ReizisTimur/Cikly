package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Vampirs {
    public static void main(String[] args){
        int a;
        int b;
        for (a =10; a < 100; a++){
            for (b =10; b < 100; b++){
                String stringTest = (Integer.toString(a) + b);
                char stringTestAr[] = stringTest.toCharArray();
                String intTest = Integer.toString(a * b);
                char intTestAr[] = intTest.toCharArray();
                if (intTestAr.length != stringTestAr.length || stringTestAr[3] == '0' || intTestAr[3] == '0') continue;
                Boolean answerInt = true;
                for (int i1 = 0; i1 < stringTestAr.length; i1++){
                    Boolean answerChar = false;
                    for (int i2 = 0; i2 < intTestAr.length; i2++){
                        answerChar = answerChar || (stringTestAr[i1] == intTestAr[i2]);
                        if (stringTestAr[i1] == intTestAr[i2]){
                            stringTestAr[i1] = '_';
                            intTestAr[i2] = '_';
                        }
                    }
                    answerInt = answerChar && answerInt;

                }
//                System.out.println(stringTest+"  " +intTest +"  "+ answerInt);
                                if (answerInt) System.out.println("Vampire - "+ stringTest + " "+intTest+"  "+ intTestAr.length + "  "+stringTestAr.length);
            }
        }
    }
}
