package com.picture.picturebackened.utils;

/**
 * 颜色转换工具类
 */
public class ColorTransformUtils {
    private ColorTransformUtils(){
        // 工具类不需要实例化
    }

    public static String getStandardColor(String color){
        // 每一种rgb色值都有空能只有一个0，要转换为00
        // 如果是六位，不用转换，如果是五位，要给第三个后面加个0
        // 实例：
        // 0x080e0 => 0x0800e
        if(color.length() == 7){
            color = color.substring(0,4) + "0" + color.substring(4,7);
        }
        return color;
    }
}
