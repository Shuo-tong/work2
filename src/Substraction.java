import java.util.Random;

/**
 * 减法运算子类：确保 left >= right，结果不小于 LOWER(0)
 */
public class Substraction extends Binaryoperation {

    public Substraction generate() {
        Random random = new Random();
        int left, right;
        left = random.nextInt(UPPER + 1);
        do {
            right = random.nextInt(UPPER + 1);
        } while (right > left);
        Substraction op = new Substraction();
        op.construct(left, right, '-');
        return op;
    }
}
