package com.example.pjw.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by pjw on 2018/5/29.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
