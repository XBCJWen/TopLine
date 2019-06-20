package cn.edu.gdpt.topline172038cjw.utils;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;

public class UtilsHelper {
    public static DisplayMetrics getScreenWidth(Context context){
        WindowManager wm=(WindowManager)context.getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics outMetrice=new DisplayMetrics();
        wm.getDefaultDisplay().getMetrics(outMetrice);
        return outMetrice;
    }
}
