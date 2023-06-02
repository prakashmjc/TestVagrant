import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
/*
 * Author : Prakash M
 * email : prakash.mjc@gmail.com
 */

public class CodingAssignment {
	

	public static void main(String[] args) {
		//Creating a play list named "songsPlayed" with size of 3
		String songsPlayed[] = new String[3];
		//Following 3 songs are played and added to the Play List
		songsPlayed[0] = "S1";
		songsPlayed[1] = "S2";
		songsPlayed[2] = "S3";
		//Play List with capacity 3
		System.out.println(Arrays.toString(songsPlayed));
		//new song S4 being played and getting added to the playlist
		songsPlayed = newSongPlayed("S4", songsPlayed);
		System.out.println("S4 song is played, Playlist => "+Arrays.toString(songsPlayed));
		//new song S2 being played and getting added to the playlist
		songsPlayed = newSongPlayed("S2", songsPlayed);
		System.out.println("S2 song is played, Playlist => "+Arrays.toString(songsPlayed));
		//new song S1 being played and getting added to the playlist
		songsPlayed = newSongPlayed("S1", songsPlayed);
		System.out.println("S1 song is played, Playlist => "+Arrays.toString(songsPlayed));
		
	}
	
	/*
	 * Function to add recently played song to the play list of initial size,
	 * and to maintain the play list capacity
	 * Args recentSongPlayed : Song that played recently
	 * Args playList : play list of recent songs
	 */
	public static String[] newSongPlayed(String recentSongPlayed, String[] playList) {
		Queue<String> currentPlayList = new LinkedList<>(Arrays.asList(playList));
		currentPlayList.add(recentSongPlayed);
		currentPlayList.remove();
		return  currentPlayList.toArray(new String[playList.length]);
	}
	

}
