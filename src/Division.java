import java.util.Random;

/**
 * 除法运算子类：确保整除，除数范围 [1, 10]，商范围 [1, 10]
 * left = right * quotient，结果 value = quotient
 */
public class Division extends Binaryoperation {

    static final int DIV_UPPER = 10;  // 除数与商的上限

    public Division generate() {
        Random random = new Random();
        int right    = random.nextInt(DIV_UPPER) + 1;  // 除数 [1, 10]，避免除以 0
        int quotient = random.nextInt(DIV_UPPER) + 1;  // 商   [1, 10]
        int left     = right * quotient;               // 被除数，保证整除
        Division op = new Division();
        op.construct(left, right, '/');
        return op;
    }
}
