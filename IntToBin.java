/** Returns the binary representation of a given integer. */
public class IntToBin {

    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        System.out.println("Binary representation of " + x + " is: " + toBinary(x));
    }

    /** Returns the binary representation of the given integer, as a string of 0's and 1's.  */
    public static String toBinary(int x) {
        String ret = "";
        if (x == 0 || x == 1) {
            return ret + x;
        } else {
            if (x % 2 == 0) {
                ret = toBinary(x / 2) + "0";
            } else if (x % 2 == 1) {
                ret = toBinary(x / 2) + "1";
            }
        }
        return ret;
    }    
 }
