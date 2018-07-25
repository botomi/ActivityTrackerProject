package activitytracker;

public class ActivityWithoutTrack implements Activity {

    ActivityType activityType;

    public ActivityWithoutTrack(ActivityType activityType) {
        if (activityType == null) {
            throw new IllegalArgumentException("Parameter must not be null!");
        }
        this.activityType = activityType;
    }

    public double getDistance() {
        return 0;
    }

    public ActivityType getType() {
        return activityType;
    }
}
