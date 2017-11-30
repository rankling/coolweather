package com.coolweather.android.gson;

/**
 * Created by Frank on 2017/11/29.
 */

public class AQI {
    public AQICity city;
    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
