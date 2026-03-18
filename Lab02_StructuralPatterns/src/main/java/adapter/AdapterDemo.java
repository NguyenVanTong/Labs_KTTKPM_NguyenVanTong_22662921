package adapter;

/**
 * Target Interface - Interface mà client mong đợi
 */
interface MediaPlayer {
    void play(String audioType, String fileName);
}

/**
 * Adaptee - Class cần được adapt
 */
interface AdvancedMediaPlayer {
    void playVlc(String fileName);
    void playMp4(String fileName);
}

class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing VLC file. Name: " + fileName);
    }
    
    @Override
    public void playMp4(String fileName) {
        // Do nothing
    }
}

class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        // Do nothing
    }
    
    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing MP4 file. Name: " + fileName);
    }
}

/**
 * Adapter - Chuyển đổi AdvancedMediaPlayer thành MediaPlayer
 */
class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMusicPlayer;
    
    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMusicPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMusicPlayer = new Mp4Player();
        }
    }
    
    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMusicPlayer.playVlc(fileName);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMusicPlayer.playMp4(fileName);
        }
    }
}

/**
 * Concrete MediaPlayer - Sử dụng Adapter
 */
class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;
    
    @Override
    public void play(String audioType, String fileName) {
        // Built-in support for mp3
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing MP3 file. Name: " + fileName);
        }
        // MediaAdapter provides support for other formats
        else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
}

/**
 * Demo class
 */
public class AdapterDemo {
    public static void main(String[] args) {
        System.out.println("=== ADAPTER PATTERN DEMO ===\n");
        
        AudioPlayer audioPlayer = new AudioPlayer();
        
        System.out.println("1. Playing MP3 (built-in support):");
        audioPlayer.play("mp3", "song.mp3");
        
        System.out.println("\n2. Playing MP4 (via adapter):");
        audioPlayer.play("mp4", "video.mp4");
        
        System.out.println("\n3. Playing VLC (via adapter):");
        audioPlayer.play("vlc", "movie.vlc");
        
        System.out.println("\n4. Playing unsupported format:");
        audioPlayer.play("avi", "file.avi");
        
        System.out.println("\n=== Adapter Pattern Benefits ===");
        System.out.println("1. Cho phép các interface không tương thích làm việc cùng nhau");
        System.out.println("2. Tái sử dụng code hiện có mà không cần sửa đổi");
        System.out.println("3. Single Responsibility - adapter chỉ lo chuyển đổi interface");
    }
}
