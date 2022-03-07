package reviews.main;
import reviews.data.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option, optionTop;
        String login, password;
        Management management = new Management();
        management.initialize();
        do {
            System.out.println("Insert login :");
            login = sc.next();
            System.out.println("Insert password:");
            password = sc.next();
        }
        while (management.login(login, password) != null);

        System.out.println("1. My reviews:");
        System.out.println("2. Business list:");
        System.out.println("3. Top rated businesses:");
        System.out.println("4. Edit my review:");
        System.out.println("5. quit:");

        System.out.println("Choose an option");
        option = sc.nextInt();
        switch (option)
        {
            case 1:
                for(Business b : management.getBusinesses())
                {
                    for(Review r : b.getReviews())
                    {
                        System.out.println(r.toString());
                    }
                }
                break;
            case 2:
                Arrays.sort(management.getBusinesses());
                for(Business b : management.getBusinesses())
                {
                    System.out.println(b.toString());
                }
                break;
            case 3:
                System.out.println("Choose top business you want to know");
                System.out.println("1.Restaurants, 2.Hairdressers, 3.Garages");
                optionTop = sc.nextInt();
                switch (optionTop) {
                    case 1:
                        for(Business b : management.getBusinesses()){
                                if(b.getClass() == Restaurant.class)
                                {
                                    b.reviewAverage();
                                }
                            }
                        break;
                    case 2:
                        for(Business b : management.getBusinesses()){
                            if(b.getClass() == Hairdresser.class)
                            {
                                b.reviewAverage();
                            }
                        }
                        break;
                    case 3:
                        for(Business b : management.getBusinesses()){
                            if(b.getClass() == Garage.class)
                            {
                                b.reviewAverage();
                            }
                        }
                        break;
                }
                break;
            case 4:

                break;
            case 5:
            default:
                }
    }
}
