package org.example.toll.system.consol.ui;

import org.example.toll.system.consol.ui.viewModels.VignetteViewModel;
import org.example.toll.system.consol.ui.viewModels.VignettesAndVehicleViewModel;

import java.util.Scanner;

public class TollSystemView {

    private boolean running = true;


    public void setTollSystemController(TollSystemController tollSystemController) {
        this.tollSystemController = tollSystemController;
    }

    private TollSystemController tollSystemController;

    public void DisplayVehicle(VignettesAndVehicleViewModel v){
        for(VignetteViewModel vigenette : v.vignettes){
            System.out.println(vigenette.validFrom);
            System.out.println(vigenette.validTo);
            System.out.println(vigenette.vehicleCategory);
            System.out.println(vigenette.dateOfPurchase);
        }




        System.out.println("Rendszám: ");
        System.out.println(v.vehicle.registrationNumber + "\n");
        System.out.println("Gyártmány: ");
        System.out.println(v.vehicle.make);
        System.out.println("Típus: ");
        System.out.println(v.vehicle.model + "\n");
        System.out.println("Űlőhelyek száma vezetővel: ");
        System.out.println(v.vehicle.numberOfSeats + "\n");
        System.out.println("Jármű kategória: ");
        System.out.println(v.vehicle.vehicleType + "\n");
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
