package org.example.toll.system.consol.ui.parser;

import org.json.JSONException;
import org.json.JSONObject;

public class VehicleParser {
    public String RegistrationNumberToJson(String r) {
        JSONObject registrationNumber = new JSONObject();
        try {
            registrationNumber.put("registrationNumber", r);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
        return registrationNumber.toString();
    }
}
