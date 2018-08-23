package com.sunstar.coolweather.gson;

/**
 * Created by zp
 * on 2018/8/23.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
