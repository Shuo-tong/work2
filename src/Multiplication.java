import java.util.Random;

/**
 * 乘法运算子类：操作数范围限定在 [1, 10]，确保结果在合理范围内
 */
public class Multiplication extends Binaryoperation {

    static final int MULT_UPPER = 10;  // 乘法操作数上限

    public Multiplication generate() {
        Random random = new Random();
        int left  = random.nextInt(MULT_UPPER) + 1;  // [1, 10]
        int right = random.nextInt(MULT_UPPER) + 1;  // [1, 10]
        Multiplication op = new Multiplication();
        op.construct(left, right, '*');
        return op;
    }
}
