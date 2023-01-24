package org.example.toll.system.consol.ui;

import org.example.toll.system.app.API.loadVignettesByCarRegistrationNumberAPI;
import org.example.toll.system.consol.ui.parser.VehicleParser;

public class TollSystemController {

    private loadVignettesByCarRegistrationNumberAPI loadVignettesByCarRegistrationNumberAPI;
    private VehicleParser vehicleParser = new VehicleParser();

    public TollSystemController(org.example.toll.system.app.API.loadVignettesByCarRegistrationNumberAPI loadVignettesByCarRegistrationNumberAPI) {
        this.loadVignettesByCarRegistrationNumberAPI = loadVignettesByCarRegistrationNumberAPI;
    }

    public void getVignettesAndVehicleViewModel(String registrationNumber){
        String r= vehicleParser.RegistrationNumberToJson(registrationNumber);
        loadVignettesByCarRegistrationNumberAPI.loadVignettesByCarRegistrationNumber(r);
    }
}
