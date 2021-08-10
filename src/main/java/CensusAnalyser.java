import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CensusAnalyser {
    public static void main(String[] args) throws CensusException, IOException {
        String filePathRead = "C:\\Users\\HP\\java\\day19\\Indian States Census\\IndiaStateCensusData.csv";
        String fileName = "IndiaStateCensusData";
        String delimiter =",";
        List<String> stringName = new ArrayList<>();
        stringName.add("State");
        stringName.add("Population");
        stringName.add("AreaInSqKm");
        stringName.add("DensityPerSqKm");

        ReadOperation readObj = new ReadOperation();
        int count = readObj.readDataCount(filePathRead, fileName);
        System.out.println(count);

        readObj.readDelimiter(filePathRead, delimiter);
        readObj.readHeader(filePathRead, stringName);
    }
}