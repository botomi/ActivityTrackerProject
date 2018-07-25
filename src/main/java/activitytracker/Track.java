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
        double maxLatitude = trackpoints.get(0).getCoordinate().getLatitude();
        double maxLongitude = trackpoints.get(0).getCoordinate().getLongitude();

        for(TrackPoint item: trackpoints){
            if(item.getCoordinate().getLatitude() > maxLatitude){
                maxLatitude = item.getCoordinate().getLatitude();
            }
            if(item.getCoordinate().getLongitude() > maxLongitude){
                maxLongitude = item.getCoordinate().getLongitude();
            }
        }
        return new Coordinate(maxLatitude, maxLongitude);
    }

    public Coordinate findMinimumCoordinate(){
        double minLatitude = trackpoints.get(0).getCoordinate().getLatitude();
        double minLongitude = trackpoints.get(0).getCoordinate().getLongitude();

        for(TrackPoint item: trackpoints){
            if(item.getCoordinate().getLatitude() < minLatitude){
                minLatitude = item.getCoordinate().getLatitude();
            }
            if(item.getCoordinate().getLongitude() < minLongitude){
                minLongitude = item.getCoordinate().getLongitude();
            }
        }
        return new Coordinate(minLatitude, minLongitude);

    }

    public double getDistance(){
        double sum = 0.0;
        for(int i = 0; i < trackpoints.size()-1; i++){
            sum += trackpoints.get(i).getDistanceFrom(trackpoints.get(i+1));
        }
        return sum;
    }

    public double getFullDecrease(){

    }

    public double getFullElevation(){
        double sum = 0.0;
        for(TrackPoint item: trackpoints){
            sum += item.getElevation();
        }
        return sum;
    }

    public double getRectangleArea(){

    }

    public List<TrackPoint> getTrackpoints() {
        return trackpoints;
    }
}
