package org.example.toll.system.consol.ui.viewModels;

import java.util.Date;

public class VignetteViewModel {
    public String vehicleCategory;
    public String validFrom;
    public String validTo;
    public String dateOfPurchase;
    public boolean isValid;

    public VignetteViewModel(String vehicleCategory, String validFrom, String validTo, String dateOfPurchase, boolean isValid) {
        this.vehicleCategory = vehicleCategory;
        this.validFrom = validFrom;
        this.validTo = validTo;
        this.dateOfPurchase = dateOfPurchase;
        this.isValid = isValid;
    }

}
