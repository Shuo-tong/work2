import java.util.ArrayList;

public abstract class Exercise {
    protected static final short OPERATION_NUMBER = 50;
    protected static final short COLUMN_NUMBER = 5;
    protected ArrayList<Binaryoperation> operationList = new ArrayList<Binaryoperation>();

    // 模板方法：通用生成循环，子类只需实现 generateOperation()
    public void generate() {
        operationList.clear();
        for (int i = 0; i < OPERATION_NUMBER; i++) {
            Binaryoperation anOperation;
            do {
                anOperation = generateOperation();
            } while (contains(anOperation, i - 1));
            operationList.add(anOperation);
        }
    }

    // 抽象方法：由子类决定生成哪种运算题
    protected abstract Binaryoperation generateOperation();

    // 只要产生的算式没在当前练习题中，就加入尾部
    private boolean contains(Binaryoperation anOperation, int length) {
        boolean found = false;
        for (int i = 0; i <= length; i++) {
            if (anOperation.equals(operationList.get(i))) {
                found = true;
                break;
            }
        }
        return found;
    }

    void formateAndDisplay() {
        for (int i = 0; i < operationList.size(); i++) {
            // 每道题固定宽度为12，左对齐
            System.out.printf("%-12s", operationList.get(i).asString());
            // 每 COLUMN_NUMBER 道题换行
            if ((i + 1) % COLUMN_NUMBER == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
}
