package pro1;

public class Utils {
    public static long gcd(long a, long b) {    // euklidův algoritmus na výpočet největšího dělitele
        if (b == 0) {                           // rekurzivní (neustále dokola volán)
            return a;
        } else {
            return gcd(b, a % b);
        }

//        while (b != 0) {              // učitelovo code
//            long temp = b;            // opakovaný (interativní)
//            b = a % b;
//            a = temp;
//        }
//        return a;

    }
}
