package activitytracker;

import java.util.ArrayList;
import java.util.List;

public class Activities {

    List<Activity> activities;

    public Activities(List<Activity> activities) {
        if (activities == null) {
            throw new IllegalArgumentException("Parameter must not be null!");
        }
        this.activities = activities;
    }

    public void addActivity(Activity activity) {
        if (activity == null) {
            throw new IllegalArgumentException("Parameter msut not be null!");
        }
        activities.add(activity);
    }

    public List<Report> distancesByTypes() {
        List<Report> result = new ArrayList<>();
        double bikingSum = 0;
        double hikingSum = 0;
        double runningSum = 0;
        double basketballSum = 0;
        for (Activity a : activities) {
            if (a instanceof ActivityWithTrack) {
                if (a.getType() == ActivityType.BIKING) {
                    bikingSum += a.getDistance();
                } else if(a.getType() == ActivityType.HIKING) {
                    hikingSum += a.getDistance();
                } else if(a.getType() == ActivityType.RUNNING) {
                    runningSum += a.getDistance();
                } else if(a.getType()== ActivityType.BASKETBALL) {
                    basketballSum += a.getDistance();
                }
            }
        }
        return result;
    }

    private double getDistanceOfAllBiking() {
        double sum = 0.0;
        activities.forEach(activity -> {ActivityType type = activity.getType(); if (type == ActivityType.BIKING)sum += activity.getDistance()});
        return sum;
        activities.forEach(a->a.getType().equals(ActivityType.BIKING));
    }
}
