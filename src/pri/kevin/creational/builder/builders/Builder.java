package pri.kevin.creational.builder.builders;

import pri.kevin.creational.builder.cars.CarType;
import pri.kevin.creational.builder.components.Engine;
import pri.kevin.creational.builder.components.GPSNavigator;
import pri.kevin.creational.builder.components.Transmission;
import pri.kevin.creational.builder.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
