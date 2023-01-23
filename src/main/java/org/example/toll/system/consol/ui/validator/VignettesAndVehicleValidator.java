package org.example.toll.system.consol.ui.validator;

import org.example.toll.system.consol.ui.viewModels.VignettesAndVehicleViewModel;

public class VignettesAndVehicleValidator {
    public void validateVignettesAndVehicle(String vignettesAndVehicleDto) {
        if(vignettesAndVehicleDto == null){
            throw new RuntimeException();
        }
    }
}
