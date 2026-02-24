public class OOPSBannerApp {

    public static void main(String[] args) {

        // UC6: Refactor Banner Logic into Static Helper Methods

        // Array initialized using method calls (NOT UC5 inline strings)
        String[] banner = {
                buildLine(0),
                buildLine(1),
                buildLine(2),
                buildLine(3),
                buildLine(4),
                buildLine(5),
                buildLine(6)
        };

        // Loop to print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }

    // Builds each row of "OOPS"
    public static String buildLine(int row) {
        return String.join("   ",
                getOPattern(row),   // First O
                getOPattern(row),   // Second O
                getPPattern(row),
                getSPattern(row)
        );
    }

    // Pattern for O
    public static String getOPattern(int row) {
        String[] O = {
                " *****  ",
                "*     * ",
                "*     * ",
                "*     * ",
                "*     * ",
                "*     * ",
                " *****  "
        };
        return O[row];
    }

    // Pattern for P
    public static String getPPattern(int row) {
        String[] P = {
                "******  ",
                "*     * ",
                "*     * ",
                "******  ",
                "*       ",
                "*       ",
                "*       "
        };
        return P[row];
    }

    // Pattern for S
    public static String getSPattern(int row) {
        String[] S = {
                " *****  ",
                "*     * ",
                "*       ",
                " *****  ",
                "      * ",
                "*     * ",
                " *****  "
        };
        return S[row];
    }
}