class Movie {
    String title;
    String genre;
    int rating;
    void playIt() {
        System.out.println("Проигрывание фильма:" + " " + this.title);
    }
}

public class MovieTestDrive {
    public static void main(String[] args) {
        Movie one = new Movie();
        one.title = "HarryPotter";
        one.genre = "fantasy";
        one.rating = 9;

        Movie two = new Movie();
        two.title = "Lord of the rings";
        two.genre = "fantasy";
        two.rating = 9;
        two.playIt();

        Movie three = new Movie();
        three.title = "FightClub";
        three.genre = "action";
        three.rating = 10;
    }
}