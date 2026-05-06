import java.util.Random;

public class MixedExercise extends Exercise {
    private Addition       addCreator = new Addition();
    private Substraction   subCreator = new Substraction();
    private Multiplication mulCreator = new Multiplication();
    private Division       divCreator = new Division();
    private Random random = new Random();

    @Override
    protected Binaryoperation generateOperation() {
        switch (random.nextInt(4)) {
            case 0:  return addCreator.generate();
            case 1:  return subCreator.generate();
            case 2:  return mulCreator.generate();
            default: return divCreator.generate();
        }
    }
}
