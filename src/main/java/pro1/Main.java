package pro1;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println(new Fractions(1400,150));
        System.out.println(new Fractions(52440,3620));
        System.out.println(new Fractions(1300,1260));
        File inputDir = new File("C:/Users/HP/Documents/2. Semestr/PRO1/CODE/data-fractions/input");
        File[] inputFiles = inputDir.listFiles();
        for (File inputFile : inputFiles)                                           // : je foreach, iterátor, procházení (cyklus) - může se místo toho použít normální cykl for
        {
//            System.out.println("Reading "+inputFile);
            ExamRecord[] records = readInputFile(inputFile.toPath());               //ExamRecord je třída stejně jako např. int
            System.out.println("Ukázka: "+records[0].getName());                  //třída Math je statická (Math math = new Math(); nebude fungovat - nemůžu z toho udělat novou metodu)

        }
    }
    //path = cesta k souboru
    public static ExamRecord[] readInputFile(Path path) throws IOException {
        List<String> lines = Files.readAllLines(path);      // readAllLines pomocí throws přiznává, že tam může nastat chyba
        List<ExamRecord> resultList = new ArrayList<>();
        for(String line : lines)
        {
            String[] split= line.split("[:=;]");
            resultList.add(new ExamRecord(
                    split[0],
                    Fractions.parse(split[1])
            ));
        }
        return resultList.toArray(new ExamRecord[0]);   // musíme tam dát parametr protože bullshit
    }
}