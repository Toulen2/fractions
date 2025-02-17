package pro1;

public class Fractions {
    private long n;             // crtl + klik na třídu -> odkaz na dokumentaci (Long)
    private long d;

    public Fractions(long n, long d) {
        this.n = n;
        this.d = d;
        long gcd = gcd(n, d);                        // GCD - největší společný dělitel
    }

    private static long gcd(long a, long b) {
        return 1;
    }

}
