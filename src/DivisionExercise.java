public class DivisionExercise extends Exercise {
    private Division creator = new Division();

    @Override
    protected Binaryoperation generateOperation() {
        return creator.generate();
    }
}
