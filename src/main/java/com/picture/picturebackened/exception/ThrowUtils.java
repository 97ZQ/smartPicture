package com.picture.picturebackened.exception;

/**
 * 异常处理工具类
 */
public class ThrowUtils {
    /**
     * 条件成立抛出异常
     * @param condition 条件
     * @param runtimeException 异常
     */
    public static void throwIf(boolean condition,RuntimeException runtimeException){
        if(condition){
            throw runtimeException;
        }
    }

    /**
     * 条件成立，抛出异常
     * @param condition 条件
     * @param errorCode 异常码
     */
    public static void throwIf(boolean condition,ErrorCode errorCode){
        throwIf(condition,new BusinessException(errorCode));
    }

    /**
     * 条件成立，抛出异常
     * @param condition 条件
     * @param errorCode 异常码
     * @param message 异常信息
     */
    public static void throwIf(boolean condition,ErrorCode errorCode,String message){
        throwIf(condition,new BusinessException(errorCode,message));
    }
}
