package com.example.pjw.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by pjw on 2018/5/29.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt")
        public String info;
    }
}
