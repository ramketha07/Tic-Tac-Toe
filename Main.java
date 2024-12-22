import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
     System.out.println("enter playing Mode (Normal-1|advanced-2)");

     int level=sc.nextInt();
     PlayMode pm;
     switch(level){
      case 1:pm=new NormalMode();
            pm.play();
            break;
      case 2: pm=new AdvancedMode();
            pm.play();  
            break;
      default:System.out.println("Plz Enter valid Levels Only (1|2)");
      
     }
  }
}