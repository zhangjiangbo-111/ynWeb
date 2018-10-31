package com.yn.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.UUID;

/**
 * @Author ：flyme
 * @ProjectName: ynWeb1.2
 * @Title : CommonUtils
 * @Description：request获取参数工具类
 * @Date ：Created in 16:39 2018/10/31
 */
public class CommonUtils {
    private static final Logger log = LoggerFactory.getLogger(CommonUtils.class);

    public static String getStrFromObject(String str) {
        log.debug("str={}", str);
        return null == str ? "" : str;
    }


    public static String generateId() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    public static Result genSuccessResult() {
        Result result = new Result();
        result.addMsg("成功");
        result.addCode(200);
        return result;
    }

}
