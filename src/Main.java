import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String args[]){

        ArrayList<UserManager> users = new ArrayList<UserManager>();

        Scanner scan = new Scanner(System.in);
        System.out.println("Kullanıcı adı:");
        String newUserName = scan.nextLine();
        System.out.println("Kullanıcı yaşı:");
        int newUserAge = scan.nextInt();
        System.out.println("Kullanıcı online mi? true/false");
        boolean newIsOnline = scan.nextBoolean();


        if(!newUserName.isEmpty()){
        if(newUserAge != 0){


        UserManager newUser = new UserManager(newUserName, newUserAge, newIsOnline);
        users.add(newUser);
        System.out.println(users.get(0).toString());
        scan.close();

        }
        else{
            System.out.println("Kullanıcı yaşı geçersiz girildi.");
            scan.close();
        }


        }
        else{
            System.out.println("Kullanıcı adı boş girildi.");
            scan.close();

        }


    }



}
