package com.nd.app.attributelibrary;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.ContextThemeWrapper;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Young on 14/12/14.
 */
public class BaseLibActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TypedArray typedArray = getTheme().obtainStyledAttributes(
                getThemeId(this), new int[]{R.attr.libTheme});
        setTheme(typedArray.getResourceId(0, 0));
        typedArray.recycle();
        super.onCreate(savedInstanceState);
    }

    /**
     * @param ctx
     * @return int
     * @函数名称 :getThemeId
     * @brief 获取主题ID
     * @作者 : Young
     * @date : 2014年11月24日 11:46:01
     * @see
     */
    private static int getThemeId(Context ctx) {
        try {
            int themeResId;
            Class<?> clazz = ContextThemeWrapper.class;
            Method method = clazz.getMethod("getThemeResId");
            method.setAccessible(true);
            themeResId = (Integer) method.invoke(ctx);
            return themeResId;
        } catch (NoSuchMethodException e) {
        } catch (IllegalAccessException e) {
        } catch (IllegalArgumentException e) {
        } catch (InvocationTargetException e) {
        }
        return R.style.LibDefaultStyle;
    }

}
