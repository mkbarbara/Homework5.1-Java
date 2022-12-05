import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import re.nelology.sqr.SQRService;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/ranges.csv")
    public void autotestsSquare(int expected, int left, int right) {
        SQRService service = new SQRService();
        int actual = service.calcSqrtFromRange(left, right);

        Assertions.assertEquals(expected, actual);
    }
}
