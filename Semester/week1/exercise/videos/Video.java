package week1.exercise.videos;

import java.time.LocalDate;

public class Video {

    private final String code;
    private String name;
    private double duration;
    private int likes;
    private boolean isForKids;
    private LocalDate uploadDate;
    private static double maxDuration = 20;

    public static void setMaxDuration(double maxDuration) {
        Video.maxDuration = maxDuration;
    }

    public static double getMaxDuration() {
        return maxDuration;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public double getDuration() {
        return duration;
    }

    public int getLikes() {
        return likes;
    }

    public boolean isForKids() {
        return isForKids;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDuration(double duration) {
        if(Video.getMaxDuration() < duration) {
            this.duration = Video.getMaxDuration();
        }else{
            this.duration = duration;
        }
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public void setForKids(boolean forKids) {
        isForKids = forKids;
    }

    public Video(String code, String name, double duration, int likes, boolean isForKids) {
        this.code = code;
        this.name = name;
        this.setDuration(duration);
        this.likes = likes;
        this.isForKids = isForKids;
    }

    public Video(String code, String name, double duration) {
        this.code = code;
        this.name = name;
        this.setDuration(duration);
    }

    public Video(String code) {

        this.code = code;
    }

    @Override
    public String toString() {
        return "Video{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                ", likes=" + likes +
                ", isForKids=" + isForKids +
                '}';
    }
}
