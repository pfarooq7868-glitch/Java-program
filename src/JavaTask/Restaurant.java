package JavaTask;

public class Restaurant {
    int restaurantID;
    String restaurantName;
    String location;
    String cuisineType;
    int rating;

    Restaurant(int ID, String resName, String loc, String cuisine, int review) {
        restaurantID = ID;
        restaurantName = resName;
        location = loc;
        cuisineType = cuisine;
        rating = review;
        System.out.println("restaurantID :" + restaurantID);
        System.out.println("restaurantName :" + restaurantName);
        System.out.println("location :" + location);
        System.out.println("cuisineType :" + cuisineType);
        System.out.println("rating :" + rating);
        System.out.println("----------------------------------------");


    }

    static void main() {
        new Restaurant(102, "Amaravati Restaurant", "Nellore", "Andhra cuisine", 4);
        new Restaurant(103, "Arabian mandi Restaurant", "Nellore", "Arabian cuisine", 5);
        new Restaurant(104, " Telangana nattu ruchulu Restaurant", "Nellore", "Telangana cuisine", 4);


    }
}
