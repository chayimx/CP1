import java.util.Scanner;

public class taxes {
  public static void main(String[] args) {
    Scanner kin = new Scanner(System.in);
    
    System.out.println("Calculating Income Tax");
    System.out.println();
    System.out.print("Total income for the year: $");
    double income = kin.nextDouble();
    if (income >= 0 && income < 9525){
      double tax = (income * 0.1);
      System.out.println("Tax to be paid: $" + tax);
    }
    else if (income >= 9525 && income < 38700){
      double tax = (((income - 9525) * .12) + 952.5);
      System.out.println("Tax to be paid: $" + tax);
    }
    else if (income >= 38700 && income < 82500){
      double tax = (((income - 38700) * .22) + 4453.5);
      System.out.println("Tax to be paid: $" + tax);
    }
    else if (income >= 82500 && income < 157500){
      double tax = (((income - 82500) * .24) + 14089.5);
      System.out.println("Tax to be paid: $" + tax);
    }
    else if (income >= 157500 && income < 200000){
      double tax = (((income - 157500) * .32) + 32089.5);
      System.out.println("Tax to be paid: $" + tax);
    }
    else if (income >= 200000 && income < 500000){
      double tax = (((income - 200000) * .35) + 45689.5);
      System.out.println("Tax to be paid: $" + tax);
    }
    else if (income >= 500000){
      double tax = (((income - 500000) * .37) + 150689.5);
      System.out.println("Tax to be paid: $" + tax);
    }
  }
}