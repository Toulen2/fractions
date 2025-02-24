package pro1;

public class Fractions {
    private long n;             // crtl + klik na třídu -> odkaz na dokumentaci (Long)
    private long d;

    public Fractions(long n, long d) {
        long gcd = Utils.gcd(n, d);                        // GCD - největší společný dělitel
        this.n = n / gcd;
        this.d = d / gcd;
    }

    public static Fractions parse(String s) {
        return new Fractions(1,1);
    }

    //@Override
    public String toString() { // vytvoříme logiku, jak se bude zlomek převádět na String
        return d + "/" + n;
    }
}
