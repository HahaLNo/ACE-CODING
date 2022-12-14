public class Rater {
    private String name; // name of company
    private double rating; // number rating (1 - 5)
    private String review;

    public Rater(String company, double initialRating) {
        name = company;
        rating = initialRating;
    }

    // Set rating to newRating as long as
    // the new rating is no more than 5
    public void setRating(double newRating) {
        if (newRating <= 5)
            ;
    }

    // Returns the rating of the company
    public double getRating() {
        return rating;
    }

    // Returns a string representation of the company
    // based on their ratings
    public String toString()
    {
        // remember, once a return statement is
        // executed, the program LEAVES the method.
        // Nothing after the executed return statement is executed.
        if rating 
    }
}

public class RaterTester {
    public static void main(String[] args) {
        Rater jrs = new Rater("Jr Cookery", 2);

        // Test Case: In the middle
        System.out.println("Current Rating: " + jrs.getRating());
        System.out.println(jrs);

        // Test Case: High rating
        jrs.setRating(4.5);
        System.out.println("\nCurrent Rating: " + jrs.getRating());
        System.out.println(jrs);

        // Test Case: Setting rating too high
        jrs.setRating(100);
        System.out.println("\nCurrent Rating: " + jrs.getRating());
        System.out.println(jrs);

        // Test Case: Low rating
        jrs.setRating(1);
        System.out.println("\nCurrent Rating: " + jrs.getRating());
        System.out.println(jrs);

    }
}
