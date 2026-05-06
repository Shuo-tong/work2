import java.util.Random;


public class Addition extends Binaryoperation {

    public Addition generate() {
        Random random = new Random();
        int left, right, result;
        left = random.nextInt(UPPER + 1);
        do {
            right = random.nextInt(UPPER + 1);
            result = left + right;
        } while (result > UPPER);
        Addition op = new Addition();
        op.construct(left, right, '+');
        return op;
    }
}
