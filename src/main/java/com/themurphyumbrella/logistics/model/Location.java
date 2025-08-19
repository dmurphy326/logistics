package com.themurphyumbrella.logistics.model;

public class Location {
    private String locationId;
    private String locationName;
    private String locationDescription;

    public Location() {}

    public Location(String locationId, String locationName, String locationDescription) {
        this.locationId = locationId;
        this.locationName = locationName;
        this.locationDescription = locationDescription;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getLocationDescription() {
        return locationDescription;
    }

    public void setLocationDescription(String locationDescription) {
        this.locationDescription = locationDescription;
    }
}
