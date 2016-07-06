import com.teamtreehouse.model.Song;
import com.teamtreehouse.model.SongBook;

public class Karaoke {

  public static void main(String[] args) {
    Song song = new Song(
      "The Beatles",
      "Hey Jude",
      "https://www.youtube.com/watch?v=A_MjCqQoLLA"
    );
    SongBook songBook = new SongBook();
    System.out.printf("Adding %s %n", song);
    songBook.addSong(song);
    System.out.printf("There are %d song(s). %n", songBook.getSongCount());
  }
}
