import java.lang.Math;
public class ArrayAssignment {
  public static void main(String[] args) {
      int[] scores = new int[20];
      for (int i = 0; i < scores.length; i++){
          scores[i] = (int)(Math.random()*101);
    }
              printArray(scores);
      for (int i = 0; i < scores.length; i++){
          System.out.println(scores[i]);
      }
  }
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++){
            scores[i] = (int)(Math.random()*101);
        }
    }
}
