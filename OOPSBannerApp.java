public class OOPSBannerApp {

    public static void main(String[] args) {

        // UC5: Render OOPS Banner using Inline Array Initialization

        // Declare and initialize array in a single statement
        String[] banner = {
                String.join("   ", " ***** ", " ***** ", " ******", " ***** "),
                String.join("   ", "*     *", "*     *", "*     *", "*     *"),
                String.join("   ", "*     *", "*     *", "*     *", "*      "),
                String.join("   ", "*     *", "*     *", "****** ", " ***** "),
                String.join("   ", "*     *", "*     *", "*      ", "      *"),
                String.join("   ", "*     *", "*     *", "*      ", "*     *"),
                String.join("   ", " ***** ", " ***** ", "*      ", " ***** ")
        };

        // Enhanced for loop (same as UC4)
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
