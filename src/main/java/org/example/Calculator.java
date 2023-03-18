package org.example;


/**
 * Hello world!
 *
 */
import java.lang.Math;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.*;
public class Calculator {
    public static double root(double n) {
        logger.info("[ROOT] - " + n);
        if (n < 0) {
            return Double.NaN;
        }

        double ans = Math.sqrt(n);
        logger.info("[RESULT - ROOT] - " + ans);
        return ans;
    }
    public static double factorial (int n) {
        logger.info("[FACTORIAL] - " + n);
        if(n<0) {
            return Double.NaN;
        }
        int ans=1;
        for(int i=1;i<n+1;i++) {
            ans*=i;
        }
        logger.info("[RESULT - FACTORIAL] - " + ans);
        return ans;
    }
    public static double log(double n) {
        logger.info("[LOG] - " + n);
        double ans = Math.log(n);
        logger.info("[RESULT - LOG] - " + ans);
        return ans;
    }
    public static double power (double n1,double n2) {
        logger.info("[POW] - " + n1+"-"+n2);
        double ans = Math.pow(n1,n2);
        logger.info("[RESULT - POW] - " + ans);
        return ans;
    }
    private static final Logger logger = LogManager.getLogger(Calculator.class);
    //	MyClass.class.getName()
//	logger.entry();
    public static void main( String[] args ) {
//        System.out.println(logger.isDebugEnabled());

        Scanner sc = new Scanner(System.in);
//    	logger.entry();
        System.out.println("Welcome to Calculator Program");
        System.out.println("Enter the number for the required operation");
        System.out.println("1. Square root function - √x");
        System.out.println("2. Factorial function - x!");
        System.out.println("3. Natural logarithm (base е) - ln(x)");
        System.out.println("4. Power function - x^" + "b");
        int loop = sc.nextInt();
//    	while (1==1) {
        if (loop == 1) {
            System.out.println("Square root function - √x");
            System.out.println("Input the number");
            double n = sc.nextDouble();
            Double ans = root(n);
            if (ans.isNaN()) {
                System.out.println("Invalid input, Please Try again");
                logger.error("Invalid input, Entered input is not of the expected type");

                return;
            }
            System.out.println("Result: " + ans);
        }
        else if(loop==2) {
            System.out.println("Factorial function - x!");
            System.out.println("Input the number");
            int n=sc.nextInt();
            Double ans=factorial(n);
            if(ans.isNaN()) {
                System.out.println("Invalid input, Please Try again");
                logger.error("Invalid input, Entered input is not of the expected type");

                return;
            }
            System.out.println("Result: "+ ans);
        }
        else if(loop==3) {
            System.out.println("Natural logarithm (base е) - ln(x)");
            System.out.println("Input the number");
            double n=sc.nextDouble();
            Double ans=log(n);
//			if(ans.isNaN()) {
//				System.out.println("Invalid input, Please Try again");
//				return;
//			}
            System.out.println("Result: "+ ans);
        }else if(loop==4) {
            System.out.println("Power function - x^"+ "b");
            System.out.println("Input two numbers with space between them");
            double n1=sc.nextDouble();
            double n2=sc.nextDouble();
            Double ans=power(n1,n2);
//			if(ans.isNaN()) {
//				System.out.println("Invalid input, Please Try again");
//				return;
//			}
            System.out.println("Result: "+ ans);
        }
        else {
            System.out.println("Invalid input, Please Try again");

        }
    }
}