package re.nelology.sqr;

public class SQRService {

    public int calcSqrtFromRange(int a, int b) {
        int x = 0;
        for (int i = 10; i < 100; i += 1) {
            if (i * i >= a) {
                if (i * i <= b) {
                    x += 1;
                }
            }
        }
        return x;
    }
}
