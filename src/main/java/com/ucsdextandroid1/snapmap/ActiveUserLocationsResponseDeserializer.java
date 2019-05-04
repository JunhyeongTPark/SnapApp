package com.ucsdextandroid1.snapmap;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ActiveUserLocationsResponseDeserializer implements JsonDeserializer<ActiveUserLocationsResponse> {

    @Override
    public ActiveUserLocationsResponse deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {

        ActiveUserLocationsResponse response = new ActiveUserLocationsResponse();

        List<UserLocationData> locations = new ArrayList<>();
        for (Map.Entry<String, JsonElement> entry : json.getAsJsonObject().entrySet()) {
            JsonObject object = entry.getValue().getAsJsonObject();

            UserLocationData locationData = context.deserialize(entry.getValue(),UserLocationData.class);

            locationData.setUserId(entry.getKey());

            locations.add(locationData);

            //UserLocationData locationData = new UserLocationData(
            //        object.get("color").getAsString(),
            //)
        }

        response.setUserLocations(locations);

        return response;
    }
}
