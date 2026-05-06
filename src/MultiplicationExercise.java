public class MultiplicationExercise extends Exercise {
    private Multiplication creator = new Multiplication();

    @Override
    protected Binaryoperation generateOperation() {
        return creator.generate();
    }
}
