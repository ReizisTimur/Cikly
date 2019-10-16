package com.company;
import java.util.stream.IntStream;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        class Cikly {
            void sr25() {
                for (int i = 0; i < 25; i++) {
                    float a = (float) Math.random() * 100;
                    float b = (float) Math.random() * 100;
                    i--;
                    if (a > b) {
                        System.out.println(a + "  " + b + ",  а больше b");
                    } else if (a < b) {
                        System.out.println(a + "  " + b + ",   b больше a");
                    } else {
                        System.out.println(a + "  " + b + ",  а равно b");
                    }
                }
            }

            void PoiskProstCh() {
                int z = 100;
                String result = "";
                boolean rez = true;
                for (int i = 1; i <= z; i++) {
                    rez = false;
                    for (int y = 2; y < i - 1; y++) {
                        rez = (rez || (i % y == 0));
                    }
                    rez = !rez;
                    result = Boolean.toString(rez);
                    System.out.println(i + "  простое число  -  " + result);
                }
            }

            void ForEachInt() {
                int[] range = IntStream.range(4,10).toArray();
                for (int x: range){
                    System.out.print(x);
                }
            }
            int upr20(){
                int begin = 3;
                int end = 7;
                int testval = 3;
                if (testval >=begin &&testval<=end){
                    return 1;
                }
                else
                    return 0;
            }
            void BezKonCik(){
                int i = 0;
                while (true){
                    i++;
                    int j = i * 27;
                    if(j==1269) break;
                    if(i % 10 != 0) continue;
                    System.out.print(i+" ");
                }
            }
            void upr15 (){
                for (int i =1; i <= 100; i++)
                    System.out.print(i+" ");
            }
            void upr16(){
                for (int i =0; i < 25; i++){
                    int x = (int)(Math.random()*200);
                    int y = (int)(Math.random()*200);
                    if (x > y)
                        System.out.println("x больше y");
                    else if (x == y)
                        System.out.println("x равно y");
                    else
                        System.out.println("x меньше y");
                }
            }
            void upr17(){
                while (true){
                    int x = (int)(Math.random()*200);
                    int y = (int)(Math.random()*200);
                    if (x > y)
                        System.out.println("x больше y");
                    else if (x == y)
                        System.out.println("x равно y");
                    else
                        System.out.println("x меньше y");
                }
            }
            String upr21 () {
                for (int i = 1; i <= 100; i++){
                    System.out.print(i + " ");
                if (i ==99) break;
                }
                return "End";
            }
            void upr22(){
                String[] st ={"df1", "df3", "df5", "df9", "df10"};
                for (String x: st){
                    switch (x){
                        case "df1": System.out.println("df1"); //break;
                        case "df3": System.out.println("df3"); //break;
                        case "df5": System.out.println("df5"); //break;
                        case "df9": System.out.println("df9"); //break;
                        case "df10": System.out.println("df10"); //break;
                    }
                }
            }
        }

//        Cikly ck1 = new Cikly();
//        ck1.upr22();
//        System.out.println("\n"+ck1.upr21());
        new Gl5upr2(3);
    }
}
