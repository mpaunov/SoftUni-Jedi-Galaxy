public class Galaxy {
    private Field field;

    public Galaxy(Field field) {
        this.field = field;
    }

    public int getLength() {
        return this.field.getLength();
    }

    public int getInnerLength(int dimension) {
        return this.field.getDimensionLength(dimension);
    }

    public void setStar(int row, int col, int newValue) {
        this.field.setCell(row, col, newValue);
    }

    public int getStar(int row, int col) {
        return this.field.getCell(row, col);
    }
}
