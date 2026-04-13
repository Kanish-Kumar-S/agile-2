public class App {
 public static int otp(int sent, int recieved) {
    if(sent==recieved)
    {
        return 0;
    }
    else
    {
        return 1;
    }
 
 }
 public static void main(String[] args) {
    System.out.println(otp(2,3));
 }
}