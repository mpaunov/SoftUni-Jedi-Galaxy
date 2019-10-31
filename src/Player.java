public class Player {
    private Galaxy galaxy;
    private long points;

    public Player(Galaxy galaxy) {
        this.galaxy = galaxy;
        this.points = 0;
    }

    public void collectStars(int row, int col) {
        while (row >= 0 && col < this.galaxy.getInnerLength(1)) {
            if (row < this.galaxy.getLength()
                    && col >= 0 && col < this.galaxy.getInnerLength(0)) {
                this.points += this.galaxy.getStar(row, col);
            }

            col++;
            row--;
        }
    }

    public long getPoints() {
        return this.points;
    }
}
