import java.util.Random;

public class Main {
public static String pluralize(String word, int number) {
  if (number == 0 || number > 1) {
    return word + "s";
} else {
    return word;
}

}

public static void main(String[] args) {
  int carCount = 1;
  System.out.println("I own " + carCount + " " + pluralize("car", carCount) + ".");

  int monitorCount = 2;
  System.out.println("I own " + monitorCount + " " + pluralize("monitor", monitorCount) + ".");;

  int storeCount = 0;
  System.out.println("I own " + storeCount + " " + pluralize("store", storeCount) + ".");

  flipNHeads(1);
}

public static void flipNHeads(int n) {
Random rand = new Random();
int flips = 0;
int headsInARow = 0;

while (headsInARow < n) {
  System.out.println((rand.nextDouble() < 0.5) ? "tails" : "heads");
            headsInARow = (rand.nextDouble() < 0.5) ? 0 : headsInARow + 1;
            flips++;

}
System.out.println("It took " + flips + " flips to flip " + n + " heads in a row.");
}

}