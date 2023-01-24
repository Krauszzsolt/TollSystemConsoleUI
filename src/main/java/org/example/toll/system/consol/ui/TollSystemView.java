package org.example.toll.system.consol.ui;

import org.example.toll.system.consol.ui.viewModels.VignetteViewModel;
import org.example.toll.system.consol.ui.viewModels.VignettesAndVehicleViewModel;

import java.util.Scanner;

public class TollSystemView {

    private boolean running = true;


    private TollSystemController tollSystemController;

    public TollSystemView(TollSystemController tollSystemController) {
        this.tollSystemController = tollSystemController;
    }

    public void DisplayVignettesAndVehicleViewModel(VignettesAndVehicleViewModel v){
        for(VignetteViewModel vigenette : v.vignettes) {
            String output = "";
            if (vigenette.isValid){
                output += "X ";
            }
            output += vigenette.validFrom + " " + vigenette.validTo + " " + vigenette.vehicleCategory + " " + vigenette.dateOfPurchase + " ";
            System.out.println(output);
        }
        System.out.println("Jármű adatai: ");
        System.out.println("Rendszám: ");
        System.out.println(v.vehicle.registrationNumber);
        System.out.println("Gyártmány: ");
        System.out.println(v.vehicle.make);
        System.out.println("Típus: ");
        System.out.println(v.vehicle.model);
        System.out.println("Űlőhelyek száma vezetővel: ");
        System.out.println(v.vehicle.numberOfSeats );
        System.out.println("Jármű kategória: ");
        System.out.println(v.vehicle.vehicleType);
    }

    public void simpleDisplay(String output) {
        System.out.println(output);
    }


    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (running)
        {
            selectAction(scanner);
        }
    }

    void selectAction(Scanner scanner) {
        System.out.print("Válassz tevékenységet!\n");
        System.out.print("Jármű jogosultságainak listázása (l)\n");
        String action = scanner.next();
        switch(action) {
            case "l":
                get(scanner);
                break;
            default:
                stop(action);
        }
    }


    private void get(Scanner scanner){
        System.out.print("Add meg a jármű rendszámát:\n");
        String RegistrationNumber = scanner.next();
        tollSystemController.getVignettesAndVehicleViewModel(RegistrationNumber);
    }

    private void stop(String action){
        if(action.equals("Stop")){
            running = false;
        }
    }

}
