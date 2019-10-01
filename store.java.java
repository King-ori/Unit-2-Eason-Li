import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;

public class Receipt{
  public static void main(String[] args){

    DecimalFormat fmt = new DecimalFormat("0.##");

    Random rand = new Random();

    //constant prices and charges
    final double bookPrice = 9.00;
    final double bookCharge= .95; //* number books

    final double moviePrice = 13.97;
    final double movieCharge = .04; //* total movie price

    final double nutPrice = 1.72;
    final double nutCharge = .30; //* number of pounds

    final double tax = .072; //* total

    //setting date/time
    int month = (rand.nextInt(12) + 1);
    int day = (rand.nextInt(28) + 1);
    int year = (rand.nextInt(12) + 2010);
    int hours = rand.nextInt(24);
    int minutes = rand.nextInt(60);

    //inputs for number of goods
    Scanner input= new Scanner(System.in);

    System.out.println("Number of Books:");
    int numBooks = input.nextInt();

    System.out.println("Number of movies:");
    int numMovies = input.nextInt();

    System.out.println("Pounds of Peanuts:");
    double numNuts = input.nextDouble();

    //calculating totals
    double bookTotal = numBooks * bookPrice;
    double movieTotal=numMovies * moviePrice;
    double nutTotal = numNuts * nutPrice;
    double chargeTotal = (numBooks * bookCharge) + (movieTotal * movieCharge) + (numNuts * nutCharge);
    double subTotal = chargeTotal + bookTotal + movieTotal + nutTotal;
    double total = subTotal + (subTotal*tax);

    //printing receipt
    System.out.println("--------------------------------------------");
    System.out.println("Steve's S-Mart            Cashier: Peppa Pig\n");
    System.out.println(month + "/" + day + "/" + year + "                             " + hours + ":" + minutes +"|");
    System.out.println("--------------------------------------------\n");
    System.out.println("Total for books: " + fmt.format(bookTotal) + "\n");
    System.out.println("Total for movie: "+ fmt.format(movieTotal) + "\n");
    System.out.println("Total for peanuts: " + fmt.format(nutTotal) + "\n");
    System.out.println("Total shipping charge: " + fmt.format(chargeTotal));
    System.out.println("____________________________________________\n");
    System.out.println("Subtotal (no tax): " + fmt.format(subTotal));
    System.out.println("____________________________________________\n");
    System.out.println("Total (incl tax): " + fmt.format(total));
  }

}
