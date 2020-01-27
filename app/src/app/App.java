package app;

import java.util.*;

public class App {

    static void cookieShowcase() {
        System.out.println("Here are all the cookies we have");
        String[] cookieTypes = { "Thanks-A-lot", "Girl Scout S'mores", "Lemonades", "Shortbread", "Thin Mints",
                "Peanut Butter patties", "Caramel deLites", "peanut butter sandwich" };

        for (String cookie : cookieTypes) {
            System.out.println(cookie);
        }
    }

    static void packages() {
        HashMap<String, Double> cookiePacks = new HashMap<String, Double>();
        Scanner sc = new Scanner(System.in);
        cookiePacks.put("1", 5.00);
        cookiePacks.put("2", 10.00);
        cookiePacks.put("3", 15.00);
        cookiePacks.put("4", 20.00);
        cookiePacks.put("5", 25.00);
        cookiePacks.put("6", 30.00);
        cookiePacks.put("7", 35.00);
        cookiePacks.put("8", 40.00);
        cookiePacks.put("9", 45.00);
        cookiePacks.put("10", 50.00);
        cookiePacks.put("11", 55.00);
        cookiePacks.put("12", 60.00);
        for (Map.Entry<String, Double> entry : cookiePacks.entrySet()) {
            System.out.println("Package amount: " + entry.getKey() + " " + "Package price: " + entry.getValue());
        }
        System.out.println("How many packages would you like to buy?");
        String choice = sc.nextLine();
        Double choicePack = (Double) cookiePacks.get(choice);
        System.out.println("Amount of packages: " + choice + " Amount due: " + "$" + choicePack);
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        System.out.println("What is your first name: ");
        String firstName = sc.nextLine();
        System.out.println("What is the troop number: ");
        Integer troopNum = sc.nextInt();
        System.out.println("What is your last name: ");
        String lastName = sc3.nextLine();
        System.out.println("What is your email: ");
        String email = sc2.nextLine();
        cookieShowcase();
        packages();
    }
}