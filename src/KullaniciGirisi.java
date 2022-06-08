import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String userName,passWord,newpass;

        Scanner input = new Scanner(System.in);
        System.out.println("Username : ");
        userName = input.nextLine();
        System.out.println("Password : ");
        passWord = input.nextLine();

        if (userName.equals("onur")&& passWord.equals("123456")){
            System.out.println("Login Successful");
        } else{
            System.out.println("Password Wrong");
            System.out.println("Do you want reset Password?\n1 - Yes\n2 - No");
            int ans = input.nextInt();
            input.nextLine();

            switch (ans){
                case 1:
                    System.out.println("Please Create New Password :");
                    newpass=input.nextLine();
                    if (newpass.equals("123456")){
                        System.out.println("You Can't Use Same Password!!!");
                    } else{
                        System.out.println("New Password Created.");
                    }
                    break;
                case 2:
                    System.out.println("Thanks For Visiting");
                    break;
                default:
                    System.out.println("Please Answer Question!!!");
            }
        }







    }
}
