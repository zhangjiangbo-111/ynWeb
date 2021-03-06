package com.yn.common;

import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Result extends JSONObject {

    private static final Logger log = LoggerFactory.getLogger(Result.class);

    public Result() {
        try {
            this.put("msg", "");
            this.put("code", "");
            this.put("count", "");
            this.put("data", "");
        } catch (JSONException e) {
            log.error("Result constructor error:{}", e.getMessage());
        }
    }

    public Result(Integer code, String msg, Integer count, Object data) {
        try {
            this.put("status", code);
            this.put("msg", msg);
            this.put("count", count);
            this.put("data", data);
        } catch (JSONException e) {
            log.error("Result constructor error:{}", e.getMessage());
        }
    }

    public void addCode(Integer code) {
        try {
            this.put("code", code);
        } catch (JSONException e) {
            log.error("Result.addCode error:{}", e.getMessage());
        }
    }

    public void addMsg(String msg) {
        try {
            this.put("msg", msg);
        } catch (JSONException e) {
            log.error("Result.addMsg error:{}", e.getMessage());
        }
    }

    public void addCount(Integer count) {
        try {
            this.put("count", count);
        } catch (JSONException e) {
            log.error("Result.addCount error:{}", e.getMessage());
        }
    }

    public void addData(Object data) {
        if (data == null) return;
        try {
            this.put("data", data);
        } catch (JSONException e) {
            log.error("Result.addData error:{}", e.getMessage());
        }
    }

    public static Result getQuerySuccessResult() {
        Result result = new Result();
        result.addMsg(Constant.MSG_QUERY_SUCCESS);
        result.addCode(Constant.CODE_QUERY_SUCCESS);
        return result;
    }

    public static Result getQueryFailResult(Exception e) {
        Result result = new Result();
        result.addMsg(Constant.MSG_QUERY_FAIL + e);
        result.addCode(Constant.CODE_QUERY_FAIL);
        return result;
    }

    public static Result getUpdateSuccessResult() {
        Result result = new Result();
        result.addMsg(Constant.MSG_UPDATE_SUCCESS);
        result.addCode(Constant.CODE_UPDATE_SUCCESS);
        return result;
    }

    public static Result getUpdateFailResult(Exception e) {
        Result result = new Result();
        result.addMsg(Constant.MSG_UPDATE_FAIL + e);
        result.addCode(Constant.CODE_UPDATE_FAIL);
        return result;
    }

    public static Result getDelSuccessResult() {
        Result result = new Result();
        result.addMsg(Constant.MSG_DELE_SUCCESS);
        result.addCode(Constant.CODE_DELE_SUCCESS);
        return result;
    }

    public static Result getDelFailResult(Exception e) {
        Result result = new Result();
        result.addMsg(Constant.MSG_DELE_FAIL + e);
        result.addCode(Constant.CODE_DELE_FAIL);
        return result;
    }

    public static Result getDelFailResult() {
        Result result = new Result();
        result.addMsg(Constant.MSG_DELE_FAIL);
        result.addCode(Constant.CODE_DELE_FAIL);
        return result;
    }

    public static Result getAddSuccessResult() {
        Result result = new Result();
        result.addMsg(Constant.MSG_ADD_SUCCESS);
        result.addCode(Constant.CODE_ADD_SUCCESS);
        return result;
    }

    public static Result getAddFailResult() {
        Result result = new Result();
        result.addMsg(Constant.MSG_ADD_FAIL);
        result.addCode(Constant.CODE_ADD_FAIL);
        return result;
    }

    public static Result getAddFailResult(Exception e) {
        Result result = new Result();
        result.addMsg(Constant.MSG_ADD_FAIL + e);
        result.addCode(Constant.CODE_ADD_FAIL);
        return result;
    }


}
