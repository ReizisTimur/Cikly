package com.company;

import java.util.Arrays;
//Создайте класс с неинициализированной ссылкой на String. Покажите что Java инициализирует ссылку
//значением null
class Gl5upr1{
    String test;
    void show(){
        System.out.println(test);
    }
}
//Создайте класс с полем String, инициализируемым в точке определения и другим полем, инициализируемым конструктором.
class Gl5upr2{
    String show = "1, 2, 3, 4, 5";

    Gl5upr2(int i) {
        int [] show1 = new int[i];
        for( int y=0; y<i; y++){
            show1[y] = y + 1;
        }
        System.out.println(show);
        System.out.println(Arrays.toString(show1));
    }
}

class Gl5upr3{
    Gl5upr3(){
        System.out.println("Конструктор по умолчанию");
    }
    Gl5upr3(String str){
        System.out.println(str);
    }
}
//Создайте класс Dog с перегруженным методом bark. Метод должен быть перегружен для разных примитивных типов данных
//с целью вывода сообщения о лай, поскуливании и т.д. в зависимости от версии перегруженного метода.
class Dog{
    void bark(char c){
        System.out.println("Гав!");
    }
    void bark(){
        System.out.println("Ууууууу!");
    }
    void bark(int c, char x){
        System.out.println("Иии-иии-иии...");
    }
    void bark(char x, int c){
        System.out.println("Рыыыыыы!");

    }
}
class Empty{}

//Создайте класс с двумя методами.В первом методе дважды вызовите второй метод - один раз без ключевого слова this,
//другой раз с ним. Просто чтоб убедиться в работоспособности этого метода
class Gl5Upr8{
    String start = "Обратный отсчет:";
    int i = 10;
    String countM(){
        i--;
        String count = " "+i +",";
        return count;
    }
     Gl5Upr8(){
        String end = start + countM() +this.countM();
        System.out.println(end);
    }

}

public class Classes {

    public static void main(String[] args){
//        Gl5upr2a gl1 = new Gl5upr2a();
//        new Gl5upr2b(5);
//        new Gl5upr3("Консьруктор");
//        Dog barbos = new Dog();
//        barbos.bark('u', 9);
//        new Empty();
        new Gl5Upr8();

    }
}



