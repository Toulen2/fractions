package pro1;
import java.io.File;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        File inputDir = new File("C:/data/input");
        File[] inputFiles = inputDir.listFiles();
        for (File inputFile : inputFiles)                                           // : je foreach, iterátor, procházení (cyklus) - může se místo toho použít normální cykl for
        {
            System.out.println("Reading "+inputFile);
            ExamRecord[] records = readInputFile(inputFile.toPath());               //ExamRecord je třída stejně jako např. int
            //System.out.println("Ukázka: "+records[0].getName());                    //třída Math je statická (Math math = new Math(); nebude fungovat - nemůžu z toho udělat novou metodu)

        }
    }
    //path = cesta k souboru
    public static ExamRecord[] readInputFile(Path path)  {

        return new ExamRecord[0]; //array
    }
}