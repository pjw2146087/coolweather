package com.example.pjw.coolweather.gson;

/**
 * Created by pjw on 2018/5/29.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
