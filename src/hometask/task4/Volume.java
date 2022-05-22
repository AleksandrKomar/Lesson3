package hometask.task4;

public class Volume {

    public static void main(String[] args) {

      double r = 5;
      double h = 2;

      double V = Math.PI * Math.pow(r, 2) * h;
      double S = 2 * Math.PI * r * (r + h);

      System.out.println("Объем цилиндра = " + V);
      System.out.println("Площадь поверхности = " + S);
    }
}
