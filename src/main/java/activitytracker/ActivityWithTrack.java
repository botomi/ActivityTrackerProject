package activitytracker;

public class ActivityWithTrack implements Activity{

    ActivityType activityType;
    Track track;

    public ActivityWithTrack(ActivityType activityType, Track track) {
        if (activityType == null || track == null) {
            throw new IllegalArgumentException("Parameter must not be null!");
        }
        this.activityType = activityType;
        this.track = track;
    }

    public double getDistance() {
        return track.getDistance();
    }

    public ActivityType getType() {
        return activityType;
    }
}
