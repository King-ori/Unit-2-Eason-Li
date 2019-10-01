import java.util.Random;

public class RandomNumber{
  public static void main(String[]args){
    Random rand=new Random();
    rand.nextInt(10);
    System.out.println("#[0,9]:"+rand.nextInt(10));


    System.out.println("#[0,9]:"+(rand.nextInt(11)+1));


    System.out.println("#[20,34]:"+(rand.nextInt(35)+20));


    System.out.println("#[-10,9]:"+(rand.nextInt(10)+(-10)));

    System.out.println("#[0,1):"+rand.nextDouble());

    System.out.println("#[0,6):"+rand.nextDouble()*6);

    System.out.println("#[0,35]:"+(rand.nextInt(35))+1));
  }
}
