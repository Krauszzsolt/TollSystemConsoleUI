package org.example.toll.system.consol.ui.parser;

import org.example.toll.system.consol.ui.viewModels.VehicleViewModel;
import org.example.toll.system.consol.ui.viewModels.VignetteViewModel;
import org.example.toll.system.consol.ui.viewModels.VignettesAndVehicleViewModel;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Date;

public class LoadVignettesParser {

    public VignettesAndVehicleViewModel loadVignettesParser(String vignettesAndVehicleJson) {
        String model;
        String registrationNumber;
        String make;
        Integer numberOfSeats;
        String vehicleType;

        ArrayList<VignetteViewModel> vignettes = new ArrayList<>();


        try {
            JSONObject dto = new JSONObject(vignettesAndVehicleJson);
            JSONArray vignettesJSON = dto.getJSONArray("vignettes");
            JSONObject vehicleJson = dto.getJSONObject("vehicle");
            model = vehicleJson.getString("model");
            registrationNumber = vehicleJson.getString("registrationNumber");
            make = vehicleJson.getString("make");
            numberOfSeats = vehicleJson.getInt("numberOfSeats");
            vehicleType = vehicleJson.getString("vehicleType");


            for (int i=0;i<vignettesJSON.length();i++) {

                JSONObject vignetteJSON =  vignettesJSON.getJSONObject(i);
                String vehicleCategory = vignetteJSON.getString("vehicleCategory");
                String validFrom= vignetteJSON.getString("validFrom");
                String validTo= vignetteJSON.getString("validTo");
                String dateOfPurchase= vignetteJSON.getString("dateOfPurchase");
                Boolean isValid= vignetteJSON.getBoolean("isValid");
                vignettes.add(new VignetteViewModel(vehicleCategory,validFrom,validTo,dateOfPurchase,isValid));
            }

        } catch (JSONException e) {
            throw new RuntimeException(e);
        }

        return new VignettesAndVehicleViewModel(vignettes,new VehicleViewModel(model,registrationNumber,make,numberOfSeats,vehicleType));
    }
}
