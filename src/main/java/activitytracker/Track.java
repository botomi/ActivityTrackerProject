package activitytracker;

import java.util.ArrayList;
import java.util.List;

public class Track {

    private List<TrackPoint> trackpoints = new ArrayList<>();


    public void addTrackPoint(TrackPoint point){
        if(point == null){
            throw new IllegalArgumentException("...");
        }
        trackpoints.add(point);
    }

    public Coordinate findMaximumCoordinate(){

    }

    public Coordinate findMinimumCoordinate(){

    }

    public double getDistance(){

    }

    public double getFullDecrease(){

    }

    public double getFullElevation(){

    }

    public double getRectangleArea(){

    }

    public List<TrackPoint> getTrackpoints() {
        return trackpoints;
    }
}
