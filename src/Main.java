
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner in =new  Scanner(System.in);
String fruit = in.next();
//String a="Ganesh";
//String b="Ganesh";
//System.out.println(a.equals(b));

        //old way to write switch
//if(fruit.equals("mango")){
//    System.out.println("true");
//}
//switch(fruit){
//    case "Mango":
//        System.out.println("mango");
//        break;
//    case "Apple":
//        System.out.println("Apple");
//        break;
//    default:
//        System.out.println("pls Enter valid fruit");
//}

        //new Way to write switch
        switch (fruit) {
            case "Mango" -> System.out.println("mango");
            case "Apple" -> System.out.println("Apple");
            default -> System.out.println("pls Enter valid fruit");
        }

        int day = in.nextInt();
        switch (day) {
            case 1,2,3,4,5 -> System.out.println("weekday");
            case 6,7 -> System.out.println("weekend");
            default -> System.out.println("pls Enter valid day");
        }
    }
}