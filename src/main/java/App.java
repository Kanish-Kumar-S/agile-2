public class App {
 public static float fare(float demand, float distance,float time) {
    float p=0;
    if(distance>10)
    {
        p+=distance*15;
    }
    else
    {
        p+=distance*10;
    }
    if(demand>50)
    {
        p+=demand*(50/100);
    }
    else
    {
        p+=demand*(25/100);

    }
    if(time>21 || time<7)
    {
        p+=100*distance/3;
    }
    return p;
 }
 public static void main(String[] args) {
 System.out.println("Hello DevOps!");
 System.out.println(fare(2,3,4));
 }
}