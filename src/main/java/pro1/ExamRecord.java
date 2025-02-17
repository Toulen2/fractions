package pro1;

public class ExamRecord {                               // Alt + insert = zkratka pro vytvoření věcí (např celého konstruktoru, getru atd)

    private String name;
    private Fractions score;

    public ExamRecord(String name, Fractions score) {   //boilerplate code - kód, který většinou moc nedělá (např. konstruktor)
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public Fractions getScore() {
        return score;
    }
}
