package Interface;

public interface MusicPlayer {
	void play();
	void pause();
	void stop();
}

class Spotify implements MusicPlayer {
	@Override
	public void play() {
		System.out.println("\nStart playing music on Spotify !!");
	}
	public void pause() {
		System.out.println("\nPause playing music on Spotify !!");
	}
	public void stop() {
		System.out.println("\nStop playing music on Spotify !!");
	}
}

class YoutubeMusic implements MusicPlayer{
	@Override
	public void play() {
		System.out.println("\nStart playing music on YoutubeMusic !!");
	}
	public void pause() {
		System.out.println("\nPause playing music on YoutubeMusic !!");
	}
	public void stop() {
		System.out.println("\nStop playing music on YoutubeMusic !!");
	}
}
