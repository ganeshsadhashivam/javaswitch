import java.util.Scanner;
public class NestedSwitch {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);

        int empID = in.nextInt();

        String department = in.next();


        System.out.println("Enter Emp Id");
        int empId = in.nextInt();
        switch (empId){
            case 1:
                System.out.println("ganesh");
                break;
            case 2:
                System.out.println("ganesh 2");
                break;
            case 3:
                System.out.println("ganesh 3");
                System.out.println("enter department");
                switch (department){
                    case "IT":
                        System.out.println("it");
                        break;
                    case "Management":
                        System.out.println("mgmt");
                        break;
                }
                break;
        }
    }
}
