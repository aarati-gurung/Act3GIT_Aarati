import java.util.Scanner;

public class numAleatorios {
  
  public static final int NUM_MIN = 1;
  public static final int NUM_MAX = 9;
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    for(int i=1; i <= 20; i++) {
      System.out.println("Numeros Aleatorio " + i + "=" + Math.random()*NUM_MAX + NUM_MIN);
    }
  }

}