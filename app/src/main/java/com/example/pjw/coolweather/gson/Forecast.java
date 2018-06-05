package com.example.pjw.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by pjw on 2018/5/29.
 */

public class Forecast {
    public String date;
    @SerializedName("tmp")
    public Temperature temperature;
    @SerializedName("cond")
    public More more;
    public class Temperature{
        public String max;
        public String min;

    }
    public class More{
        @SerializedName("txt_d")
        public String info;
    }
}