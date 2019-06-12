import java.util.Scanner;

public class Lanes{
  public static void main(String arg[]){
      
      Scanner kin = new Scanner(System.in);
      System.out.println(" \n");
      System.out.println("Addison and Western intersection \n");
      
      System.out.println("Which direction are you coming from? (n/e/s/w)");
      String direction = kin.nextLine();
      
      System.out.println("Which way are you turning? (right/left)");
      String turn = kin.nextLine();
      
      System.out.println("Is it a weekday or a weekend? (wd/we)");
      String day = kin.nextLine();
      
      System.out.println("What time is it rounded to the nearest hour?(6-17)");
      int time = kin.nextInt();
      
      
      if ( direction.equals("n") ){
          if ( turn.equals("right") ){
              if ( day.equals("wd") ){
                if (time == 6){
                    System.out.println("1 min");
                }
                else if ( time == 7 || time == 10){
                    System.out.println("2.5 min");
                }
                else if (time == 8 || time == 9 || time == 11 || time == 12 || time == 13 || time == 14 || time == 15 || time == 16 || time == 17){
                    System.out.println("2.8 min");
                }
              }
              else if ( day.equals("we") ){
                  if (time == 6){
                      System.out.println("1 min");
                  }
                  else if (time == 7 || time == 8){
                      System.out.println("2 min");
                  }
                  else if (time == 9){
                      System.out.println("2.5 min");
                  }
                  else if ( (time == 10) || (time == 11) || (time == 12) || (time == 13) || (time == 14) || (time == 15) || (time == 16) || (time == 17)){
                      System.out.println("2.8 min");
                  }
                      
              }
          }
          else if (turn.equals("left") ){
              if ( day.equals("wd") ){
                  if (time == 6){
                      System.out.println("1 min");
                  }
                  else if ( time == 7 || time == 9 || time == 10 || time == 11 || time == 15){
                      System.out.println("2.5 min");
                  }
                  else if (time == 8 || time == 12 || time == 13 || time == 14 || time == 16 || time == 17){
                      System.out.println("2.8 min");
                  }
              }
              else if ( day.equals("we") ){
                  if (time == 6){
                      System.out.println("2 min");
                  }
                  else if (time == 7 || time == 8){
                      System.out.println("2 min");
                  }
                  else if (time == 9 || time == 17){
                      System.out.println("2.5 min");
                  }
                  else if (time == 10 || time == 11 || time == 12 || time == 13 || time == 14 || time == 15 || time == 16){
                      System.out.println("2.8 min");
                  }
              }
          }
      }
      else if ( direction.equals("s") ){
          if ( turn.equals("right") ){
              if ( day.equals("wd") ){
                  if (time == 6){
                      System.out.println("1 min");
                  }
                  else if (time == 10 || time == 11){
                      System.out.println("2 min");
                  }
                  else if (time == 7 || time == 9 || time == 12 || time == 13 || time == 14 || time == 15){
                      System.out.println("2.5 min");
                  }
                  else if (time == 8 || time == 16 || time == 17){
                      System.out.println("2.8 min");
                  }
              }
              else if ( day.equals("we") ){
                  if (time == 6 || time == 7 || time == 8 || time == 16 || time == 17){
                      System.out.println("2 min");
                  }
                  else if (time == 9 || time == 10 || time == 11 || time == 12 || time == 13 || time == 14 || time == 15){
                      System.out.println("2.5 min");
                  }
              }
          }
          else if ( turn.equals("left") ){
              if ( day.equals("wd") ){
                  if (time == 6 || time == 7 || time == 9 || time == 10){
                      System.out.println("2 min");
                  }
                  else if (time == 11 || time == 12 || time == 13 || time == 14 || time == 15){
                      System.out.println("2.5 min");
                  }
                  else if (time == 8 || time == 16 || time == 17){
                      System.out.println("2.8 min");
                  }
              }
              else if ( day.equals("we") ){
                  if (time == 6){
                      System.out.println("2 min");
                  }
                  else{
                      System.out.println("2.5 min");
                  }
              }
          }
      }
  }
}
