package week2;

import java.util.Scanner;

public class tutotrial {
    private static final int QUESTION = 7;

    public static void main(String[] args) {
        //question 1
        if (QUESTION == 1) {
            int a = 1;
            double d = 1.0;
            a = 46 / 9;                         //a = 5
            a = 46 / 9 + 4 * 4 - 2;             //a = 19
//            a = 45 + 43 % 5 * (23 * 3 % 2);     //a = 48
            a %= 3 / a + 3;                     //a = 0
            d = 4 + d * d + 4;                  //d = 9.0
            d += 1.5 * 3 + (++a);               //d = 9 + 5.5 = 14.5 (a = 0(current) + 1)
            d -= 1.5 * 3 + a++;                 //d = 14.5 - 5.5 = 9.0 (a = 1(current))

            System.out.println(a);
            System.out.println(d);
        }

        //question 2
        if(QUESTION == 2){
            //check if CASTING (convert to different data type) is allowed
            char c = 'a';
            int i  = (int) c;           //char -> int, i = 97

            float f = 1000.34f;
            i = (int) f;                //float -> int (missing decimal part), i = 1000

            double d = 1000.34;
            i = (int) d;                //double -> int (missing decimal part), i = 1000

            i = 97;
            c = (char) i;               //int -> char, c = 'a'

            //print the result
            System.out.println(i);
            System.out.println(c);
        }

        //question 3
        if (QUESTION == 3) {
            int i = 0;                  //have not initialized i
            double k = 100.0;            //wrong data type (int -> double or float)
            int j = i + 1;
            System.out.println("j is" + j + "and k is " + k);
        }

        //question 5
        if(QUESTION == 5){
            double miles = 100;
            final double MILE_TO_KILOMETER = 1.609;
            double kilometres = miles*MILE_TO_KILOMETER;

            System.out.println(kilometres);
        }

        //question 6
        if(QUESTION == 6){
            System.out.println("Please insert int number presents ASCII codes from 0 - 127: ");
            Scanner input_ascii_num = new Scanner(System.in);
            int ascii_num = input_ascii_num.nextInt();

            if(ascii_num <= 127){
                char ascii_code = (char) ascii_num;
                System.out.println(ascii_code);
            }else{
                System.out.println("Please insert number in range 0 - 127");
            }
        }

        if(QUESTION == 7){
            //user input - employee's name
            System.out.printf("Please insert employee's name: ");
            Scanner name_input = new Scanner(System.in);
            String name = name_input.nextLine();          //or next() to read the whole text until Enter

            System.out.printf("Please insert work hours: ");
            Scanner hours_input = new Scanner(System.in);
            short hours = hours_input.nextShort();

            System.out.printf("Please insert hourly pay rate: ");
            Scanner hourly_rate_input = new Scanner(System.in);
            double hourly_rate = hourly_rate_input.nextDouble();

            //System.out.printf("Please insert Federal tax withholding rate (in %): ");
            Scanner federal_tax_input = new Scanner(System.in);
            short federal_tax = federal_tax_input.nextShort();

            //System.out.printf("Please insert State tax withholding rate (in %): ");
            Scanner state_tax_input = new Scanner(System.in);
            short state_tax = state_tax_input.nextShort();

            //print the payroll statement

        }

        //question 8
        if(QUESTION == 8){
            System.out.println("Please choose the following converter: \n" +
                    "- Type 0 to convert from kilo to pound" +
                    "- Type 1 to convert from pound to kilo");


        }
    }
}
