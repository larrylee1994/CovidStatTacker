package com.larrylee1994.coronavirustracker.models;

public class LocationStats {
    private String state;
    private String county;
    private int latestTotalCases;
    private int difference;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public int getLatestTotalCases() {
        return latestTotalCases;
    }

    public void setLatestTotalCases(int latestTotalCases) {
        this.latestTotalCases = latestTotalCases;
    }

    @Override
    public String toString() {
        return county + " | " +
                state + " | " +
                latestTotalCases;
    }

    public void setDifference(int difference) {
        this.difference = difference;
    }

    public int getDifference() {
        return difference;
    }
}
