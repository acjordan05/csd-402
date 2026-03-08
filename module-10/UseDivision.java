public class UseDivision {

    public static void main(String[] args) {

        // Two International divisions
        InternationalDivision intDiv1 =
                new InternationalDivision("Global Tech", 1001, "Japan", "Japanese");

        InternationalDivision intDiv2 =
                new InternationalDivision("Euro Finance", 1002, "Germany", "German");

        // Two Domestic divisions
        DomesticDivision domDiv1 =
                new DomesticDivision("West Coast Sales", 2001, "California");

        DomesticDivision domDiv2 =
                new DomesticDivision("Southern Marketing", 2002, "Texas");

        // Display information
        intDiv1.display();
        intDiv2.display();
        domDiv1.display();
        domDiv2.display();
    }
}