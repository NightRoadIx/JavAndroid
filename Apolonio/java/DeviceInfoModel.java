package com.example.apolonio;

public class DeviceInfoModel {
    private String deviceName, deviceHardwareAddress;
    public DeviceInfoModel(){}
    // Constructor
    public DeviceInfoModel(String deviceName, String deviceHardwareAddress){
        this.deviceName = deviceName;
        this.deviceHardwareAddress = deviceHardwareAddress;
    }
    public String getDeviceName(){return deviceName;}
    public String getDeviceHardwareAddress(){return deviceHardwareAddress;}
}
