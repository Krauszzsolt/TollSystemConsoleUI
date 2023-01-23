package org.example.toll.system.consol.ui;

import org.example.toll.system.app.API.TollSystemPresenter;
import org.example.toll.system.consol.ui.parser.LoadVignettesParser;
import org.example.toll.system.consol.ui.validator.VignettesAndVehicleValidator;
import org.example.toll.system.consol.ui.viewModels.VignettesAndVehicleViewModel;

public class TollSystemPresenterImpl implements TollSystemPresenter {

    private LoadVignettesParser loadVignettesParser = new LoadVignettesParser();
    private VignettesAndVehicleValidator vignettesAndVehicleValidator = new VignettesAndVehicleValidator();
    private TollSystemView tollSystemView = new TollSystemView();
    @Override
    public void displayVignette(String VignettesAndVehicle) {
        vignettesAndVehicleValidator.validateVignettesAndVehicle(VignettesAndVehicle);
        VignettesAndVehicleViewModel vignettesAndVehicleViewModel = loadVignettesParser.loadVignettesParser(VignettesAndVehicle);

    }
}
