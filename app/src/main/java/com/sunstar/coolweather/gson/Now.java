package com.sunstar.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by zp
 * on 2018/8/23.
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
