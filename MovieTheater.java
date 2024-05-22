public class MovieTheater {
    private char[][] seatingChart;
    private int rows;
    private int cols;

    public MovieTheater(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;

        seatingChart = new char[rows][cols];

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                seatingChart[i][j] = '0';

            }
        }
    }

    public void displaySeatingChart() {

        System.out.println("Seating Chart:");
        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                System.out.print(seatingChart[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println();
    }

    public void reserveSeat(int row, int col) {

        if (row < 0 || row >= rows || col < 0 || col >= cols) {

            System.out.println("Invalid seat location. Please choose a valid seat.");
            return;
        }

        if (seatingChart[row][col] == 'X') {

            System.out.println("Spot at row " + (row + 1) + ", col " + (col + 1) + " is occupied.");


        } else {

            seatingChart[row][col] = 'X';
            System.out.println("Spot at row " + (row + 1) + ", col " + (col + 1) + " has been reserved.");

        }
    }

    public static void main(String[] args) {
        MovieTheater theater = new MovieTheater(5, 5);

        // Display initial seating chart
        theater.displaySeatingChart();

        // Try reserving a few seats
        theater.reserveSeat(0, 0);
        theater.reserveSeat(0, 0);
        theater.reserveSeat(1, 3);
        theater.reserveSeat(6, 6);


        theater.displaySeatingChart();
    }
}
