
import org.jaudiotagger.audio.AudioFile;
import org.jaudiotagger.audio.AudioFileIO;


import java.io.File;


public class Main {

    public static void main(String[] args) {
	// write your code here
        File file = new File("lecture01.mp3");
        System.out.println(file.length());
        long duration=0;
        try {
            AudioFile auFile = AudioFileIO.read(file);
            duration = auFile.getAudioHeader().getTrackLength();

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(duration);

    }
}
