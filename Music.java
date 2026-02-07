package Mini_project;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/* Song class */
class Song {
    private String title;
    private String artist;
    private int duration;

    public Song(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Title: " + title +
               ", Artist: " + artist +
               ", Duration: " + duration + " sec";
    }
}

/* Playlist class */
class Playlist {
    private ArrayList<Song> songs = new ArrayList<>();
    private int currentIndex = -1;

    public void addSong(Song song) {
        songs.add(song);
        System.out.println("Song added successfully!");
    }

    public void removeSong(String title) {
        for (int i = 0; i < songs.size(); i++) {
            if (songs.get(i).getTitle().equalsIgnoreCase(title)) {
                songs.remove(i);
                System.out.println("Song removed!");
                return;
            }
        }
        System.out.println("Song not found!");
    }

    public void showPlaylist() {
        if (songs.isEmpty()) {
            System.out.println("Playlist is empty.");
            return;
        }

        System.out.println("\nPlaylist:");
        for (int i = 0; i < songs.size(); i++) {
            System.out.println((i + 1) + ". " + songs.get(i));
        }
    }

    public void playSong(String title) {
        for (int i = 0; i < songs.size(); i++) {
            if (songs.get(i).getTitle().equalsIgnoreCase(title)) {
                currentIndex = i;
                System.out.println("Now playing: " + songs.get(i));
                return;
            }
        }
        System.out.println("Song not found!");
    }

    public void playPrevious() {
        if (currentIndex > 0) {
            currentIndex--;
            System.out.println("Now playing: " + songs.get(currentIndex));
        } else {
            System.out.println("No previous song available.");
        }
    }

    public void searchSong(String title) {
        for (Song song : songs) {
            if (song.getTitle().toLowerCase().contains(title.toLowerCase())) {
                System.out.println("Found: " + song);
                return;
            }
        }
        System.out.println("Song not found.");
    }

    public void shufflePlaylist() {
        Collections.shuffle(songs);
        currentIndex = -1;
        System.out.println("Playlist shuffled!");
    }
}

/* Main class */
public class Music {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMusic Playlist Menu");
            System.out.println("1. Add Song");
            System.out.println("2. Remove Song");
            System.out.println("3. Show Playlist");
            System.out.println("4. Play Song");
            System.out.println("5. Play Previous Song");
            System.out.println("6. Search Song");
            System.out.println("7. Shuffle Playlist");
            System.out.println("8. Exit");
            System.out.print("Choose an option: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter song title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter artist: ");
                    String artist = scanner.nextLine();
                    System.out.print("Enter duration (seconds): ");
                    int duration = scanner.nextInt();

                    playlist.addSong(new Song(title, artist, duration));
                    break;

                case 2:
                    System.out.print("Enter song title to remove: ");
                    playlist.removeSong(scanner.nextLine());
                    break;

                case 3:
                    playlist.showPlaylist();
                    break;

                case 4:
                    System.out.print("Enter song title to play: ");
                    playlist.playSong(scanner.nextLine());
                    break;

                case 5:
                    playlist.playPrevious();
                    break;

                case 6:
                    System.out.print("Enter song title to search: ");
                    playlist.searchSong(scanner.nextLine());
                    break;

                case 7:
                    playlist.shufflePlaylist();
                    break;

                case 8:
                    System.out.println("👋 Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option!");
            }
        } while (choice != 8);

        scanner.close();
    }
}




