package com.dcinspirations.homepage;

import android.content.Context;
import android.content.SharedPreferences;
import android.provider.Settings;
import android.widget.Toast;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Sp {
    static SharedPreferences sharedPreferences;
    static SharedPreferences.Editor spe;

    public Sp(Context ctx) {
        sharedPreferences = ctx.getSharedPreferences("default", 0);
        spe = sharedPreferences.edit();
    }

    public static void setMonth(String m){
        spe.putString("month",m);
        spe.commit();
    }
    public static String getMonth(){
        String m = sharedPreferences.getString("month","0/0000");
        return m;
    }

}
