import java.util.Scanner;

public class jumlahSeries {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("masukan number jumlah  Series: ");
    int n = sc.nextInt();

    double sum = 0.0;

    System.out.println("Number 1 " + 1.0);
    sum += 1.0;

    for (int i = 2; i <= n; i++) {
      System.out.println("Number " + i + " " + 1.0 / i);
      sum += 1.0 / i ;
    }
    System.out.println("Sum: " + sum);
  }
}