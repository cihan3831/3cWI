package at.cihan.projects.basics.loops;

public class loops2 {
    public static void main(String[] args) {
      int sum=0;
        for (int i = 2; i <=1000 ; i = i + 2) {
            sum = sum + i;
        }
        System.out.println("Die Summe der geraden Zahlen beträgt " + sum);
    }
}
