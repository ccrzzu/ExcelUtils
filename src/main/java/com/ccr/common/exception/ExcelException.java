package com.ccr.common.exception;

/**
 * Created by Chengrui on 2015/6/24.
 * @Description 导入导出中会出现各种各样的问题，比如：数据源为空、有重复行等，我自定义了一个ExcelException异常类，用来处理这些问题。
 */
public class ExcelException extends Exception {

    public ExcelException() {
    }

    public ExcelException(String message) {
        super(message);
    }

    public ExcelException(String message, Throwable cause) {
        super(message, cause);
    }

    public ExcelException(Throwable cause) {
        super(cause);
    }

    public ExcelException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
