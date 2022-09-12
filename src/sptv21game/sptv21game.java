
package sptv21game;

import java.util.Random;
import java.util.Scanner;


public class sptv21game {

    public static void main(String[] args) {
        System.out.println("Privrt, gruppa sptv21");
        Random random = new Random();
        int myNumber = random.nextInt(11);
        int cash = 3;
        do {
            int n = 0;
            Scanner scanner;
            System.out.println("У тебя "+ cash +" евро");
            System.out.println("zagadanno chislo ot 0 do 10 ugadai");
            do {
                scanner = new Scanner(System.in);
                int yourNumber = scanner.nextInt();
                if (myNumber == yourNumber) {
                    System.out.println("Ugadal");
                    cash++;
                    break;
                } else {
                    if(yourNumber<myNumber)
                    {
                        System.out.println("Загаданное число больше твоего");
                    }else{
                        System.out.println("Загаданное число меньше твоего");
                    }
                }
                n++;
                if (n > 2) {
                    System.out.println("ты проиграл");
                    cash--;
                    break;
                }
            } while (true);
            System.out.println("Выйти из игы? 1 да/ 0 нет");
            int repeat = scanner.nextInt();
            if (cash==0){
                System.out.println("у тебя не осталось евреев, пока");
                break;
            }
            if (repeat==1){
                System.out.println("bb");
                break;
            }


        }while(true);
    }
}
