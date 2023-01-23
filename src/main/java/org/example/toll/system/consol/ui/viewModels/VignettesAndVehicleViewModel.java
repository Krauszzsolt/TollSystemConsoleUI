package org.example.toll.system.consol.ui.viewModels;


import java.util.ArrayList;

public class VignettesAndVehicleViewModel {
    public ArrayList<VignetteViewModel> vignettes;
    public VehicleViewModel vehicle;

    public VignettesAndVehicleViewModel(ArrayList<VignetteViewModel> vignettes, VehicleViewModel vehicle) {
        this.vignettes = vignettes;
        this.vehicle = vehicle;
    }
}
