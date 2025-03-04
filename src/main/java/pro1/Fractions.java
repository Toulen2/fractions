package pro1;

public class Fractions {
    private long n;             // crtl + klik na třídu -> odkaz na dokumentaci (Long)
    private long d;

    public Fractions(long n, long d) {
        long gcd = Utils.gcd(n, d);                        // GCD - největší společný dělitel
        this.n = n / gcd;
        this.d = d / gcd;
    }
    public Fractions add(Fractions other) {
        return new Fractions(n * other.d + other.n * d, other.d * d);
    }
    public static Fractions parse(String s) {
        s = s.replace(" ", "");
        String[] split = s.split("\\+");   // + = vyjímka -> musim použít \\+ nebo použít metodu s.split(Pattern.quote("+"));
        Fractions sum = new Fractions(0,1);

        for (String part : split) {
            Fractions partFractions;
            if (part.contains("%")) {
                partFractions = new Fractions(Long.parseLong(part.replace("%", "")),100);
            }
            else {
                String[] split2 = part.split("/");
                partFractions = new Fractions(Long.parseLong(split2[0]),Long.parseLong(split2[1]));
            }
            sum = sum.add(partFractions);
        }
        return sum;
    }

    //@Override
    public String toString() { // vytvoříme logiku, jak se bude zlomek převádět na String
        return n + "/" + d;
    }
}
