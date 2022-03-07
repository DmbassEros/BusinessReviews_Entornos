package reviews.main;
import reviews.data.*;

public class Management {

    User[] users = new User[10];
    Business[] businesses = new Business[6];

    void initialize()
    {
        users [1] = new User ("user1", "1234");
        users [2] = new User ("user2", "1234");
        users [3] = new User ("user3", "1234");
        users [4] = new User ("user4", "1234");
        users [5] = new User ("user5", "1234");
        users [6] = new User ("user6", "1234");
        users [7] = new User ("user7", "1234");
        users [8] = new User ("user8", "1234");
        users [9] = new User ("user9", "1234");
        users [10] = new User ("user10", "1234");

        Review[] reviewsGarage1 = new Review[2];
        Review[] reviewsGarage2 = new Review[2];

        Review[] reviewsRestaurant1 = new Review[2];
        Review[] reviewsRestaurant2 = new Review[2];

        Review[] reviewsHairdresser1 = new Review[2];
        Review[] reviewsHairdresser2 = new Review[2];

        reviewsGarage1 [0] = new Review(users[1],"love it",5);
        reviewsGarage1 [1] = new Review(users[2],"dont like it",1);
        reviewsGarage2 [0] = new Review(users[3],"kinda gross place",1.5f);
        reviewsGarage2 [1] = new Review(users[4],"too cheap",3.5f);

        reviewsRestaurant1 [0] = new Review(users[3],"Tasty food",4);
        reviewsRestaurant1 [1] = new Review(users[5],"Meat was raw!",0);
        reviewsRestaurant2 [0] = new Review(users[7],"Taste like grandma's cook!",4.5f);
        reviewsRestaurant2 [1] = new Review(users[8],"Good prices",3.5f);

        reviewsHairdresser1[0] = new Review(users[10],"I was expecting more hair",2.5f);
        reviewsHairdresser1 [1] = new Review(users[4],"I look like Jonny Bravo",5);
        reviewsHairdresser2 [0] = new Review(users[9],"Didn't like it, refusing to explain",0.5f);
        reviewsHairdresser2 [1] = new Review(users[6],"They ruined my hairstyle!",0);



        businesses[1] = new Garage("Garage1","Alicante",1503.89f,reviewsGarage1);
        businesses[2] = new Garage("Garage2","Madrid",1000.50f,reviewsGarage2);

        businesses [3] = new Restaurant("Restaurant1","Ibiza","Mediterranea",reviewsRestaurant1);
        businesses [4] = new Restaurant("Restaurante2","Barcelona","100 tapas",reviewsRestaurant2);

        businesses [5] = new Hairdresser("Hairdresser1","Madrid",true,reviewsHairdresser1);
        businesses [6] = new Hairdresser("Hairdresser2","Alicante",false,reviewsHairdresser2);

    }
    User login(String login, String password) {
        for (User u : users) {
            if (u.getLogin() == login && u.getPassword() == password) {
                return u;
            }
        }
        return null;
    }

    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }

    public Business[] getBusinesses() {
        return businesses;
    }

    public void setBusinesses(Business[] businesses) {
        this.businesses = businesses;
    }
}
