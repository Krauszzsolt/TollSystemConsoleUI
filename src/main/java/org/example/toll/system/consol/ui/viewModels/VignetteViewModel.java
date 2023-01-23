package org.example.toll.system.consol.ui.viewModels;

import java.util.Date;

public class VignetteViewModel {
    public String vehicleCategory;
    public Date validFrom;
    public Date validTo;
    public Date dateOfPurchase;

    public VignetteViewModel(String vehicleCategory, Date validFrom, Date validTo, Date dateOfPurchase) {
        this.vehicleCategory = vehicleCategory;
        this.validFrom = validFrom;
        this.validTo = validTo;
        this.dateOfPurchase = dateOfPurchase;
    }
}
