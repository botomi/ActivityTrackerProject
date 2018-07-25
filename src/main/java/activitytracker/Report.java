package activitytracker;

public class Report {

    private final ActivityType activityType;
    private final double distance;

    public Report(ActivityType activityType, double distance) {
        if (activityType == null || distance < 0){
            throw new IllegalArgumentException("Adjál meg jót");
        }
        this.activityType = activityType;
        this.distance = distance;
    }

    public ActivityType getActivityType() {
        return activityType;
    }

    public double getDistance() {
        return distance;
    }
}
