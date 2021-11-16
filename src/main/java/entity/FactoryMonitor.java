package entity;

import lombok.Data;

/***
 * @author yansong chen
 * @time 2021-11-15 23:01
 * @description:
 */
@Data
public class FactoryMonitor {
    int id;
    String dateTime;
    double co2Value;
    double ch4Value;
    double n2oValue;
    double pm25Value;
    int equipmentId;
    String factory;
    String place;
}
