import java.util.Random;
public class Binaryoperation {
    static final int UPPER = 100;
    static final int LOWER = 0;
    protected int left_operand=0, right_operand=0;
    protected char operator='+';
    protected int value=0;
    //不是构造器
    protected void construct (int left, int right, char op) {
        left_operand = left;
        right_operand = right;
        operator = op;
        switch (op) {
            case '+': value = left + right; break;
            case '-': value = left - right; break;
            case '*': value = left * right; break;
            case '/': value = left / right; break;
        }
    }

    //实际产生对象的三个方法，（这里已经放到子类里面了）
//    public Binaryoperation generateAdditionOperation() {
//        Random random = new Random();
//        int left, right, result;
//        left = random.nextInt(UPPER+1);
//        do {
//            right = random.nextInt(UPPER+1);
//            result = left + right;
//        } while (result > UPPER);
//        Binaryoperation bop = new Binaryoperation();
//        bop.construct(left, right, '+');
//        return bop;
//    }
//    public Binaryoperation generateSubstractOperation() {
//        Random random = new Random();
//        int left, right;
//        left = random.nextInt(UPPER + 1);
//        do {
//            right = random.nextInt(UPPER + 1);
//        } while (right > left);  // 确保结果不小于 LOWER(0)
//        Binaryoperation bop = new Binaryoperation();
//        bop.construct(left, right, '-');
//        return bop;
//    }
    public Binaryoperation generateBinaryoperation() {
//        Random random = new Random();
//        if (random.nextBoolean()) {
//            return generateAdditionOperation();
//        } else {
//            return generateSubstractOperation();
//        }
        return null;
    }

    //实例变量访问器
    public int getLeftOperand() { return left_operand; }
    public int getRightOperand() { return right_operand; }
    public char getOperator() { return operator; }
    public int getResult() { return value; }

    public boolean equals (Binaryoperation anOperation) {
        //要使用 getOperator()
        return 	left_operand == anOperation.getLeftOperand() & right_operand == anOperation.getRightOperand() & operator == anOperation.getOperator();
    }
    public String toString() { return left_operand + "" + operator + right_operand; }  //示例：对运算32+5返回字符串"32+5"
    public String asString() { return toString() + "="; }  //示例：对运算32+5返回字符串"32+5="
    public String fullString() { return asString() + value; }  //示例：对运算32+5返回字符串"32+5=37"
}