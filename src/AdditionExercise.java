public class AdditionExercise extends Exercise {
    private Addition creator = new Addition();

    @Override
    protected Binaryoperation generateOperation() {
        return creator.generate();
    }
}
