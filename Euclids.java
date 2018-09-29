public class Euclids{
  public static void main(String [] args){
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    int c;
    int counter = 0;
    System.out.print("The GCD of " + a + " and " + b + " is ");
    while(true){
      counter++;
      c = a%b;
      if(c == 0){
        break;
      }
      a = b;
      b = c;
    }
    System.out.println(b);
    System.out.println("Calculated in " + counter + " iterations");
  }
}
