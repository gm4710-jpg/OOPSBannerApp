public class OOPSBannerApp {

    public static void main(String[] args) {

        // UC6: Refactor Banner Logic into Static Helper Methods

        String[] banner = {
                buildLine(0),
                buildLine(1),
                buildLine(2),
                buildLine(3),
                buildLine(4),
                buildLine(5),
                buildLine(6)
        };

        // Loop-based rendering (as per UC6)
        for (String line : banner) {
            System.out.println(line);
        }
    }

    // Builds each row of OOPS (O, O, P, S)
    public static String buildLine(int row) {
        return String.join("   ",   // spacing between letters
                getOPattern(row),   // First O
                getOPattern(row),   // Second O (for OOPS)
                getPPattern(row),
                getSPattern(row)
        );
    }

    // Pattern for letter O (7 lines, fixed width)
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

    // Pattern for letter P
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

    // Pattern for letter S
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