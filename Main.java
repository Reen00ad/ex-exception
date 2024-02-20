import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        //ex1
//
//        try{
//        System.out.println("Enter first number : ");
//        int num1 = s.nextInt();
//        System.out.println("Enter second number : ");
//        int num2 = s.nextInt();
//        System.out.println(num1 + " + "+num2 + " = "+(num1 + num2));
//        System.out.println(num1 + " - "+num2 + " = "+(num1 - num2));
//        System.out.println(num1 + " x "+num2 + " = "+(num1 * num2));
//        System.out.println(num1 + " / "+num2 + " = "+(num1 / num2));
//        System.out.println(num1 + " mod "+num2 + " = "+(num1 % num2));
//        }catch (InputMismatchException e){
//            System.out.println(e.getMessage());
//        }catch (ArithmeticException e1){
//            System.out.println(e1.getMessage());
//        }

        //ex2

//        try{
//        System.out.println("Input a number : ");
//        int num = s.nextInt();
//        for (int i = 0; i <= 10; i++) {
//            System.out.println(num+" x "+i+" = "+(num*i));
//        }}catch (InputMismatchException e){
//            System.out.println(e.getMessage());
//        }

        //ex3
//
//        try {
//            System.out.println("Radius = ");
//            double rad = s.nextDouble();
//            System.out.println("Perimeter is = " + (2 * rad * Math.PI));
//            System.out.println("Area is = " + (rad * rad * Math.PI));
//        }catch (InputMismatchException e){
//            System.out.println("please enter a valid number ");
//        }

        //ex4

//        try {
//            double sum = 1;
//            double av = 1;
//            System.out.print("Enter the count of number : ");
//            int num = s.nextInt();
//
//            for (int i = 1; i <= num; i++) {
//                System.out.print("Enter the number :");
//                int num2 = s.nextInt();
//                sum = sum + num2;
//                av = sum / num;
//            }
//            System.out.println("The average is : " + av);
//        }catch (InputMismatchException e){
//            System.out.println(e.getMessage());
//        }

        //ex5
//       try{
//        System.out.println("Input first number : ");
//        int num1 = s.nextInt();
//        System.out.println("Input second number : ");
//        int num2 = s.nextInt();
//        System.out.println("Input third number : ");
//        int num3 = s.nextInt();
//        int sum = num1 + num2;
//        System.out.print("The result is "+check(sum,num3));
//
//       }catch (InputMismatchException e){
//           System.out.println(e.getMessage());
//       }catch (Exception e1){
//           System.out.println(e1.getMessage());
//       }

      //ex6

//        try {
//            System.out.print("Enter a word : ");
//            String word = s.nextLine();
//            String output = "";
//            for (int i = word.length() - 1; i >= 0; i--) {
//                output += word.charAt(i);
//            }
//            System.out.print("reverse word " + output);
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }

        //ex7
//
//        try{
//        System.out.print("Enter a number : ");
//        int num = s.nextInt();
//            if(num%2==0)
//            System.out.print("The number is even ");
//        else
//            System.out.print("The number is odd ");
//        }catch (InputMismatchException e){
//            System.out.println(e.getMessage());
//        }


        //ex8
//
//        try {
//            System.out.print("Enter temperature in centigrade : ");
//            float tem = s.nextFloat();
//            float fehren = (tem * 9 / 5) + 32;
//            System.out.print("temperature in Fahrenheite is : " + fehren);
//        }catch(InputMismatchException e){
//            System.out.println(e.getMessage());
//        }

        //ex9
//
//        try {
//            System.out.print("Input a string : ");
//            String input = s.nextLine();
//            System.out.print("Input a number : ");
//            int num = s.nextInt();
//            char ch = input.charAt(num);
//            System.out.print(ch);
//        }catch (InputMismatchException e){
//            System.out.println(e.getMessage());
//        }

        //ex10
//
//        try {
//            System.out.print("Width = ");
//            float wed = s.nextFloat();
//            System.out.print("Height = ");
//            float hei = s.nextFloat();
//
//            System.out.println("Area is " + wed + " * " + hei + " = " + (wed * hei));
//            System.out.print("Perimeter is 2 * ( " + wed + " + " + hei + " ) = " + (2 * (wed + hei)));
//        }catch (InputMismatchException e){
//            System.out.println(e.getMessage());
//        }

       // ex11
//
//        try {
//            System.out.print("Enter first number : ");
//            int num1 = s.nextInt();
//            System.out.print("Enter second number : ");
//            int num2 = s.nextInt();
//            if (num1 == num2)
//                System.out.println(num1 + " == " + num2);
//            if (num1 != num2)
//                System.out.println(num1 + " != " + num2);
//            if (num1 > num2)
//                System.out.println(num1 + " > " + num2);
//            if (num1 >= num2)
//                System.out.println(num1 + " >= " + num2);
//            if (num1 < num2)
//                System.out.println(num1 + " < " + num2);
//            if (num1 <= num2)
//                System.out.println(num1 + " <= " + num2);
//        }catch (InputMismatchException e){
//            System.out.println(e.getMessage());
//        }

        //ex12
//
//        try {
//            System.out.print("Input second : ");
//            int second = s.nextInt();
//            int h = second / 60;
//            int m = h % 60;
//            int ss = second % 60;
//            h = h / 60;
//            System.out.println(h + ":" + m + ":" + ss);
//        }catch (InputMismatchException e){
//            System.out.println(e.getMessage());
//        }

        //ex13
//
//        try {
//            System.out.print("Input first number : ");
//            int num1 = s.nextInt();
//            System.out.print("Input second number : ");
//            int num2 = s.nextInt();
//            System.out.print("Input third number : ");
//            int num3 = s.nextInt();
//            System.out.print("Input fourth number : ");
//            int num4 = s.nextInt();
//
//            if (num1 == num2 && num2 == num3 && num3 == num4)
//                System.out.print("Numbers are equals .");
//            else
//                System.out.print("Number are not equals .");
//        }catch (InputMismatchException e){
//            System.out.println("try again and enter numbers");
//        }

     //ex14
//
//       try{
//        System.out.print("Input a number : ");
//        int num = s.nextInt();
//        if(num>0)
//            System.out.print("Number is positive ");
//        else if (num==0)
//            System.out.print("Number is zero ");
//        else if (num<0)
//            System.out.print("Number is negative ");
//       }catch (InputMismatchException e){
//           System.out.println("try again and enter a number");
//       }



        //ex15

//        int pos =0;
//        int neg = 0;
//        int zero = 0;
//     try{
//        int num2 = 0;
//        while (num2 != -1){
//            System.out.print("enter number (or enter -1 to quiet )");
//             num2 = s.nextInt();
//            if (num2 > 0)
//                pos++;
//            else if (num2<0 && num2 != -1)
//                neg++;
//
//            else if (num2 == 0)
//                zero++;
//
//     }}catch (InputMismatchException e){
//         System.out.println("try again and enter number please");
//     }
//        System.out.println("positive "+pos);
//        System.out.println("negative "+neg);
//       System.out.println("zero "+zero);

        //ex16

//        try {
//            System.out.print("Input a number :");
//            int num = s.nextInt();
//            int rev = 0;
//            while (num != 0) {
//                rev = rev * 10;
//                rev = rev + num % 10;
//                num = num / 10;
//
//            }
//            System.out.print("the output : " + rev);
//        }catch (InputMismatchException e){
//            System.out.println(e.getMessage());
//        }

        //ex17
//        int large = 0;
//        int small = 0;
//        int num ;
//       try{
//        do{
//            System.out.print("Enter the number (or enter -1 to quiet ):");
//            num=s.nextInt();
//            if(num > large)
//                large=num;
//            if(num < large && num!=-1)
//                small = num;
//        }while (num != -1);
//           System.out.println("The largest number is "+large);
//           System.out.println("The smallest number is "+small);
//       }catch (InputMismatchException e){
//           System.out.println("try again and enter number ");
//       }




      // ex18
//
//        try {
//            System.out.print("Enter string : ");
//            String str = s.nextLine();
//            char ch = 'a';
//            int count = 0;
//            for (int i = 0; i < str.length(); i++) {
//                if(str.charAt(i)==ch)
//                    count++;
//            }
//            System.out.print("Number of a's : "+count);
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }






    }
    //ex5
    public static boolean check(int sum,int num)throws Exception{
        boolean b ;
        if(sum == num)
            b=true;
//        throw new Exception("INVALID");
        else{
            b=false;
       throw new Exception("wrong"); }
       return b;

    }


}