import java.util.Scanner;

public class MovieRating {

    public static double hitungRataRata(int[] ratings) {
        int total = 0;
        for (int rating : ratings) {
            total += rating;
        }
        return (double) total / ratings.length;
    }

    public static String cariMovieTertinggi(String[] movies, double[] averages) {
        double maxRating = averages[0];
        int maxIndex = 0;
        for (int i = 1; i < averages.length; i++) {
            if (averages[i] > maxRating) {
                maxRating = averages[i];
                maxIndex = i;
            }
        }
        return movies[maxIndex];
    }

    public static String cariMovieTerendah(String[] movies, double[] averages) {
        double minRating = averages[0];
        int minIndex = 0;
        for (int i = 1; i < averages.length; i++) {
            if (averages[i] < minRating) {
                minRating = averages[i];
                minIndex = i;
            }
        }
        return movies[minIndex];
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah movie: ");
        int jumlahMovie = input.nextInt();

        String[] movies = new String[jumlahMovie];

        int[][] movieRatings = new int[jumlahMovie][];

        double[] averageRatings = new double[jumlahMovie];

        for (int i = 0; i < jumlahMovie; i++) {
            input.nextLine(); 
            System.out.print("Masukkan nama movie ke-" + (i + 1) + ": ");
            movies[i] = input.nextLine();

            System.out.print("Masukkan jumlah rating untuk movie " + movies[i] + ": ");
            int jumlahRating = input.nextInt();

            movieRatings[i] = new int[jumlahRating];

            for (int j = 0; j < jumlahRating; j++) {
                System.out.print("Masukkan rating ke-" + (j + 1) + " untuk movie " + movies[i] + ": ");
                movieRatings[i][j] = input.nextInt();
            }

            averageRatings[i] = hitungRataRata(movieRatings[i]);
        }

        String movieTertinggi = cariMovieTertinggi(movies, averageRatings);
        System.out.println("Movie dengan rating tertinggi adalah: " + movieTertinggi);

        String movieTerendah = cariMovieTerendah(movies, averageRatings);
        System.out.println("Movie dengan rating terendah adalah: " + movieTerendah);

        input.close();
    }
}
