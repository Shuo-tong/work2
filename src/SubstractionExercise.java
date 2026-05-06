public class SubstractionExercise extends Exercise {
    private Substraction creator = new Substraction();

    @Override
    protected Binaryoperation generateOperation() {
        return creator.generate();
    }
}
