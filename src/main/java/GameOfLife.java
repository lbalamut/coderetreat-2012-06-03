public class GameOfLife {
    private boolean isAddedCell = false;

    public boolean isEmpty() {
        return !isAddedCell;
    }

    public void addCell(int x, int y) {
        isAddedCell = true;
    }
}
