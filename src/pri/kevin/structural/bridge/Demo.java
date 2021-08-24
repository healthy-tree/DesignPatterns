package pri.kevin.structural.bridge;

import pri.kevin.structural.bridge.devices.Device;
import pri.kevin.structural.bridge.devices.Radio;
import pri.kevin.structural.bridge.devices.TV;
import pri.kevin.structural.bridge.remotes.AdvancedRemote;
import pri.kevin.structural.bridge.remotes.BasicRemote;

public class Demo {

    public static void main(String[] args) {
        testDevice(new TV());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
