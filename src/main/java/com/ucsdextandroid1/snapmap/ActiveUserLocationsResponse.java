package com.ucsdextandroid1.snapmap;

import java.util.List;

public class ActiveUserLocationsResponse {

    private List<UserLocationData> userLocations;

    //public List<UserLocationData> getUserLocations() {
     //   return userLocations;
    //}


    public List<UserLocationData> getUserLocations() {
        return userLocations;
    }

    public void setUserLocations(List<UserLocationData> userLocations) {
        this.userLocations = userLocations;
    }


}
