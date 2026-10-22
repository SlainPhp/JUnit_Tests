package org.example;

public class Delivery {
    private double sum = 400;
    private double distance;
    private String dimensions;
    private boolean fragility;
    private String workload;

    public double getSum() {
        return sum;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
        if(distance > 30) {
            sum+=300;
        }
        else if(distance <= 30 && distance >10) {
            sum+=200;
        }
        else if(distance <=10 && distance > 2) {
            sum+=100;
        }
        else if(distance <= 2 && distance > 0) {
            sum+=50;
        }
        else {
            throw new RuntimeException();
        }
    }
    public String getDimensions() {
        return dimensions;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
        if(dimensions.equals("small")) {
            sum+=100;
        }
        else if(dimensions.equals("large")) {
            sum+=200;
        }
        else {
            throw new RuntimeException();
        }
    }

    public boolean isFragility() {
        return fragility;
    }

    public void setFragility(boolean fragility) {
        this.fragility = fragility;
        if(fragility == true && distance <= 30) {
            sum+=300;
        }
        else if( fragility == true && distance > 30) {
            throw new RuntimeException();
        }
    }

    public String getWorkload() {
        return workload;
    }

    public void setWorkload(String workload) {
        this.workload = workload;
        if(workload.equals("elevated")) {
            sum*=1.2;
        }
        else if(workload.equals("high")) {
            sum*=1.4;
        }
        else if (workload.equals("very_high")) {
            sum*=1.6;
        }
        else if (workload.equals("normal")) {
            sum*=1;
        }
        else {
            throw new RuntimeException();
        }
    }
    public Delivery(double distance, String dimensions, boolean fragility, String workload) {
        this.distance = distance;
        this.dimensions = dimensions;
        this.fragility = fragility;
        this.workload = workload;
        setDistance(distance);
        setDimensions(dimensions);
        setFragility(fragility);
        setWorkload(workload);

    }

    public double deliveryCoast(Delivery delivery) {
    return sum;
    }
}
