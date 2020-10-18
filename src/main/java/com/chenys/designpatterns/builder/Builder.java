package com.chenys.designpatterns.builder;

/**
 * <p>描述: [建造者接口] </p>
 * <p>创建时间: 2020/10/18 </p>
 *
 * @author <a href="mailto:chenys@highzap.com" rel="nofollow">陈永松</a>
 * @version v1.0
 */
public interface Builder {
    void setCarType(CarTypeEnum type);

    void setSeats(int seats);

    void setEngine(Engine engine);

    void setTransmission(Transmission transmission);

    void setTripComputer(TripComputer tripComputer);

    void setGPSNavigator(GPSNavigator gpsNavigator);
}
