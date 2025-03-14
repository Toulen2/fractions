package pro1;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        File inputDir = new File("C:/Users/HP/Documents/2. Semestr/PRO1/CODE/data-fractions/input");
        File[] inputFiles = inputDir.listFiles();
        for (File inputFile : inputFiles)                                           // : je foreach, iterátor, procházení (cyklus) - může se místo toho použít normální cykl for
        {
            System.out.println("Reading "+inputFile);
            ExamRecord[] records = readInputFile(inputFile.toPath());               //ExamRecord je třída stejně jako např. int
            System.out.println("Ukázka: "+records[0].getName());                  //třída Math je statická (Math math = new Math(); nebude fungovat - nemůžu z toho udělat novou metodu)
            System.out.println("Score: "+records[0].getScore());

            // domácí úkol
            File outputFile = new File("C:/Users/HP/Documents/2. Semestr/PRO1/CODE/data-fractions/output/" + inputFile.getName()); // najde, kde má soubory uložit + zistí jméno souboru
            PrintWriter writer = new PrintWriter(outputFile);     // uloží soubory
            for (ExamRecord record : records) {
                writer.println(record.getName() + ", " + record.getScore()); // tohle ten soubor vytvoří
            }
            writer.close(); // musí tady být, jak by se tam psalo pořád a pak se vytvoří pouze prázdné soubory
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


    // Domácí úkol

//    public static ExamRecord[] writeOutputFile(Path path) throws IOException {
//        File outputFile = new File("C:/Users/HP/Documents/2. Semestr/PRO1/CODE/data-fractions/output"); // najde, kde má soubory uložit
//        PrintWriter writer = new PrintWriter(outputFile);     // uloží soubory
//        writer.println(readInputFile(path).toString());
//        return null;
//    }

}