/**
 * OOPSBannerApp UC3
 * Refactored to use String.join() for better memory efficiency.
 */
public class OOPSBannerApp {
    public static void main(String[] args) {
        // Constructing each line using String.join("", ...) instead of +
        System.out.println(String.join("", " **** ", " ", " **** ", " ", "******* ", " ", " ***** "));
        System.out.println(String.join("", "** **", " ", "** **", " ", "** **", " ", "** **"));
        System.out.println(String.join("", "** **", " ", "** **", " ", "** **", " ", "** "));
        System.out.println(String.join("", "** **", " ", "** **", " ", "******* ", " ", " ***** "));
        System.out.println(String.join("", "** **", " ", "** **", " ", "** ", " ", "     **"));
        System.out.println(String.join("", "** **", " ", "** **", " ", "** ", " ", "** **"));
        System.out.println(String.join("", " **** ", " ", " **** ", " ", "** ", " ", " ***** "));
    }
}
