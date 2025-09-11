public class TestQue25{
	public static void main(String args[]){
		IAudioPlayer ia = new MediaPlayer();
		ia.playAudio("shaper of you ");
		IVideoPlayer iv = new MediaPlayer();
		iv.playVideo("inception");
	}
}

interface IAudioPlayer{
	public void playAudio(String audio);

}

interface IVideoPlayer{
	public void playVideo(String video);

}

class MediaPlayer implements IAudioPlayer,IVideoPlayer{
	
	public void playAudio(String audio){
			System.out.println("play audio - >"+audio);
	}

	public void playVideo(String video){
	System.out.println("play video - >"+video);
	}

	
}