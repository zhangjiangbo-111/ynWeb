// **********************************************************************
//
// Copyright (c) 2003-2017 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.6.4
//
// <auto-generated>
//
// Generated from file `RpcService.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package YNRPC;

public interface ISystemInformationPrx extends Ice.ObjectPrx
{
    /**
     * Description: 获得系统资源使用情况
     * Input: 
     * Output: values 返回资源使用情况列表
     * 为键值对数组，键为资源名称、值为资源使用值
     * Return:
     * Others: 
     **/
    public Result getSystemResourcesState(KeyValueListHolder values);

    /**
     * Description: 获得系统资源使用情况
     * Input: 
     * Output: values 返回资源使用情况列表
     * 为键值对数组，键为资源名称、值为资源使用值
     * Return:
     * Others: 
     * @param __ctx The Context map to send with the invocation.
     **/
    public Result getSystemResourcesState(KeyValueListHolder values, java.util.Map<String, String> __ctx);

    /**
     * Description: 获得系统资源使用情况
     * Input: 
     * Output: values 返回资源使用情况列表
     * 为键值对数组，键为资源名称、值为资源使用值
     * Return:
     * Others: 
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_getSystemResourcesState();

    /**
     * Description: 获得系统资源使用情况
     * Input: 
     * Output: values 返回资源使用情况列表
     * 为键值对数组，键为资源名称、值为资源使用值
     * Return:
     * Others: 
     * @param __ctx The Context map to send with the invocation.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_getSystemResourcesState(java.util.Map<String, String> __ctx);

    /**
     * Description: 获得系统资源使用情况
     * Input: 
     * Output: values 返回资源使用情况列表
     * 为键值对数组，键为资源名称、值为资源使用值
     * Return:
     * Others: 
     * @param __cb The asynchronous callback object.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_getSystemResourcesState(Ice.Callback __cb);

    /**
     * Description: 获得系统资源使用情况
     * Input: 
     * Output: values 返回资源使用情况列表
     * 为键值对数组，键为资源名称、值为资源使用值
     * Return:
     * Others: 
     * @param __ctx The Context map to send with the invocation.
     * @param __cb The asynchronous callback object.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_getSystemResourcesState(java.util.Map<String, String> __ctx, Ice.Callback __cb);

    /**
     * Description: 获得系统资源使用情况
     * Input: 
     * Output: values 返回资源使用情况列表
     * 为键值对数组，键为资源名称、值为资源使用值
     * Return:
     * Others: 
     * @param __cb The asynchronous callback object.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_getSystemResourcesState(Callback_ISystemInformation_getSystemResourcesState __cb);

    /**
     * Description: 获得系统资源使用情况
     * Input: 
     * Output: values 返回资源使用情况列表
     * 为键值对数组，键为资源名称、值为资源使用值
     * Return:
     * Others: 
     * @param __ctx The Context map to send with the invocation.
     * @param __cb The asynchronous callback object.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_getSystemResourcesState(java.util.Map<String, String> __ctx, Callback_ISystemInformation_getSystemResourcesState __cb);

    public interface FunctionalCallback_ISystemInformation_getSystemResourcesState_Response
    {
        void apply(Result __ret, KeyValue[] values);
    }

    /**
     * Description: 获得系统资源使用情况
     * Input: 
     * Output: values 返回资源使用情况列表
     * 为键值对数组，键为资源名称、值为资源使用值
     * Return:
     * Others: 
     * @param __responseCb The lambda response callback.
     * @param __exceptionCb The lambda exception callback.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_getSystemResourcesState(FunctionalCallback_ISystemInformation_getSystemResourcesState_Response __responseCb,
                                                         IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    /**
     * Description: 获得系统资源使用情况
     * Input: 
     * Output: values 返回资源使用情况列表
     * 为键值对数组，键为资源名称、值为资源使用值
     * Return:
     * Others: 
     * @param __responseCb The lambda response callback.
     * @param __exceptionCb The lambda exception callback.
     * @param __sentCb The lambda sent callback.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_getSystemResourcesState(FunctionalCallback_ISystemInformation_getSystemResourcesState_Response __responseCb,
                                                         IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb,
                                                         IceInternal.Functional_BoolCallback __sentCb);

    /**
     * Description: 获得系统资源使用情况
     * Input: 
     * Output: values 返回资源使用情况列表
     * 为键值对数组，键为资源名称、值为资源使用值
     * Return:
     * Others: 
     * @param __ctx The Context map to send with the invocation.
     * @param __responseCb The lambda response callback.
     * @param __exceptionCb The lambda exception callback.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_getSystemResourcesState(java.util.Map<String, String> __ctx,
                                                         FunctionalCallback_ISystemInformation_getSystemResourcesState_Response __responseCb,
                                                         IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    /**
     * Description: 获得系统资源使用情况
     * Input: 
     * Output: values 返回资源使用情况列表
     * 为键值对数组，键为资源名称、值为资源使用值
     * Return:
     * Others: 
     * @param __ctx The Context map to send with the invocation.
     * @param __responseCb The lambda response callback.
     * @param __exceptionCb The lambda exception callback.
     * @param __sentCb The lambda sent callback.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_getSystemResourcesState(java.util.Map<String, String> __ctx,
                                                         FunctionalCallback_ISystemInformation_getSystemResourcesState_Response __responseCb,
                                                         IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb,
                                                         IceInternal.Functional_BoolCallback __sentCb);

    /**
     * Description: 获得系统资源使用情况
     * Input: 
     * Output: values 返回资源使用情况列表
     * 为键值对数组，键为资源名称、值为资源使用值
     * Return:
     * Others: 
     * @param __result The asynchronous result object.
     **/
    public Result end_getSystemResourcesState(KeyValueListHolder values, Ice.AsyncResult __result);

    /**
     * Description: 获得嵌入式应用使用情况
     * Input: 
     * Output: values 返回状态列表
     * 为键值对数组，键为资源名称、值为资源使用值
     * Return:
     * Others: 
     **/
    public Result getAppRunState(KeyValueListHolder values);

    /**
     * Description: 获得嵌入式应用使用情况
     * Input: 
     * Output: values 返回状态列表
     * 为键值对数组，键为资源名称、值为资源使用值
     * Return:
     * Others: 
     * @param __ctx The Context map to send with the invocation.
     **/
    public Result getAppRunState(KeyValueListHolder values, java.util.Map<String, String> __ctx);

    /**
     * Description: 获得嵌入式应用使用情况
     * Input: 
     * Output: values 返回状态列表
     * 为键值对数组，键为资源名称、值为资源使用值
     * Return:
     * Others: 
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_getAppRunState();

    /**
     * Description: 获得嵌入式应用使用情况
     * Input: 
     * Output: values 返回状态列表
     * 为键值对数组，键为资源名称、值为资源使用值
     * Return:
     * Others: 
     * @param __ctx The Context map to send with the invocation.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_getAppRunState(java.util.Map<String, String> __ctx);

    /**
     * Description: 获得嵌入式应用使用情况
     * Input: 
     * Output: values 返回状态列表
     * 为键值对数组，键为资源名称、值为资源使用值
     * Return:
     * Others: 
     * @param __cb The asynchronous callback object.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_getAppRunState(Ice.Callback __cb);

    /**
     * Description: 获得嵌入式应用使用情况
     * Input: 
     * Output: values 返回状态列表
     * 为键值对数组，键为资源名称、值为资源使用值
     * Return:
     * Others: 
     * @param __ctx The Context map to send with the invocation.
     * @param __cb The asynchronous callback object.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_getAppRunState(java.util.Map<String, String> __ctx, Ice.Callback __cb);

    /**
     * Description: 获得嵌入式应用使用情况
     * Input: 
     * Output: values 返回状态列表
     * 为键值对数组，键为资源名称、值为资源使用值
     * Return:
     * Others: 
     * @param __cb The asynchronous callback object.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_getAppRunState(Callback_ISystemInformation_getAppRunState __cb);

    /**
     * Description: 获得嵌入式应用使用情况
     * Input: 
     * Output: values 返回状态列表
     * 为键值对数组，键为资源名称、值为资源使用值
     * Return:
     * Others: 
     * @param __ctx The Context map to send with the invocation.
     * @param __cb The asynchronous callback object.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_getAppRunState(java.util.Map<String, String> __ctx, Callback_ISystemInformation_getAppRunState __cb);

    public interface FunctionalCallback_ISystemInformation_getAppRunState_Response
    {
        void apply(Result __ret, KeyValue[] values);
    }

    /**
     * Description: 获得嵌入式应用使用情况
     * Input: 
     * Output: values 返回状态列表
     * 为键值对数组，键为资源名称、值为资源使用值
     * Return:
     * Others: 
     * @param __responseCb The lambda response callback.
     * @param __exceptionCb The lambda exception callback.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_getAppRunState(FunctionalCallback_ISystemInformation_getAppRunState_Response __responseCb,
                                                IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    /**
     * Description: 获得嵌入式应用使用情况
     * Input: 
     * Output: values 返回状态列表
     * 为键值对数组，键为资源名称、值为资源使用值
     * Return:
     * Others: 
     * @param __responseCb The lambda response callback.
     * @param __exceptionCb The lambda exception callback.
     * @param __sentCb The lambda sent callback.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_getAppRunState(FunctionalCallback_ISystemInformation_getAppRunState_Response __responseCb,
                                                IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb,
                                                IceInternal.Functional_BoolCallback __sentCb);

    /**
     * Description: 获得嵌入式应用使用情况
     * Input: 
     * Output: values 返回状态列表
     * 为键值对数组，键为资源名称、值为资源使用值
     * Return:
     * Others: 
     * @param __ctx The Context map to send with the invocation.
     * @param __responseCb The lambda response callback.
     * @param __exceptionCb The lambda exception callback.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_getAppRunState(java.util.Map<String, String> __ctx,
                                                FunctionalCallback_ISystemInformation_getAppRunState_Response __responseCb,
                                                IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    /**
     * Description: 获得嵌入式应用使用情况
     * Input: 
     * Output: values 返回状态列表
     * 为键值对数组，键为资源名称、值为资源使用值
     * Return:
     * Others: 
     * @param __ctx The Context map to send with the invocation.
     * @param __responseCb The lambda response callback.
     * @param __exceptionCb The lambda exception callback.
     * @param __sentCb The lambda sent callback.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_getAppRunState(java.util.Map<String, String> __ctx,
                                                FunctionalCallback_ISystemInformation_getAppRunState_Response __responseCb,
                                                IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb,
                                                IceInternal.Functional_BoolCallback __sentCb);

    /**
     * Description: 获得嵌入式应用使用情况
     * Input: 
     * Output: values 返回状态列表
     * 为键值对数组，键为资源名称、值为资源使用值
     * Return:
     * Others: 
     * @param __result The asynchronous result object.
     **/
    public Result end_getAppRunState(KeyValueListHolder values, Ice.AsyncResult __result);

    /**
     * Description: 获得系统网口使用情况
     * Input: 
     * Output: values 返回状态列表
     * 为键值对数组，键为资源名称、值为资源使用值
     * Return:
     * Others: 
     **/
    public Result getNetportsState(DeviceInfoListHolder states);

    /**
     * Description: 获得系统网口使用情况
     * Input: 
     * Output: values 返回状态列表
     * 为键值对数组，键为资源名称、值为资源使用值
     * Return:
     * Others: 
     * @param __ctx The Context map to send with the invocation.
     **/
    public Result getNetportsState(DeviceInfoListHolder states, java.util.Map<String, String> __ctx);

    /**
     * Description: 获得系统网口使用情况
     * Input: 
     * Output: values 返回状态列表
     * 为键值对数组，键为资源名称、值为资源使用值
     * Return:
     * Others: 
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_getNetportsState();

    /**
     * Description: 获得系统网口使用情况
     * Input: 
     * Output: values 返回状态列表
     * 为键值对数组，键为资源名称、值为资源使用值
     * Return:
     * Others: 
     * @param __ctx The Context map to send with the invocation.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_getNetportsState(java.util.Map<String, String> __ctx);

    /**
     * Description: 获得系统网口使用情况
     * Input: 
     * Output: values 返回状态列表
     * 为键值对数组，键为资源名称、值为资源使用值
     * Return:
     * Others: 
     * @param __cb The asynchronous callback object.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_getNetportsState(Ice.Callback __cb);

    /**
     * Description: 获得系统网口使用情况
     * Input: 
     * Output: values 返回状态列表
     * 为键值对数组，键为资源名称、值为资源使用值
     * Return:
     * Others: 
     * @param __ctx The Context map to send with the invocation.
     * @param __cb The asynchronous callback object.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_getNetportsState(java.util.Map<String, String> __ctx, Ice.Callback __cb);

    /**
     * Description: 获得系统网口使用情况
     * Input: 
     * Output: values 返回状态列表
     * 为键值对数组，键为资源名称、值为资源使用值
     * Return:
     * Others: 
     * @param __cb The asynchronous callback object.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_getNetportsState(Callback_ISystemInformation_getNetportsState __cb);

    /**
     * Description: 获得系统网口使用情况
     * Input: 
     * Output: values 返回状态列表
     * 为键值对数组，键为资源名称、值为资源使用值
     * Return:
     * Others: 
     * @param __ctx The Context map to send with the invocation.
     * @param __cb The asynchronous callback object.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_getNetportsState(java.util.Map<String, String> __ctx, Callback_ISystemInformation_getNetportsState __cb);

    public interface FunctionalCallback_ISystemInformation_getNetportsState_Response
    {
        void apply(Result __ret, DeviceInfo[] states);
    }

    /**
     * Description: 获得系统网口使用情况
     * Input: 
     * Output: values 返回状态列表
     * 为键值对数组，键为资源名称、值为资源使用值
     * Return:
     * Others: 
     * @param __responseCb The lambda response callback.
     * @param __exceptionCb The lambda exception callback.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_getNetportsState(FunctionalCallback_ISystemInformation_getNetportsState_Response __responseCb,
                                                  IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    /**
     * Description: 获得系统网口使用情况
     * Input: 
     * Output: values 返回状态列表
     * 为键值对数组，键为资源名称、值为资源使用值
     * Return:
     * Others: 
     * @param __responseCb The lambda response callback.
     * @param __exceptionCb The lambda exception callback.
     * @param __sentCb The lambda sent callback.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_getNetportsState(FunctionalCallback_ISystemInformation_getNetportsState_Response __responseCb,
                                                  IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb,
                                                  IceInternal.Functional_BoolCallback __sentCb);

    /**
     * Description: 获得系统网口使用情况
     * Input: 
     * Output: values 返回状态列表
     * 为键值对数组，键为资源名称、值为资源使用值
     * Return:
     * Others: 
     * @param __ctx The Context map to send with the invocation.
     * @param __responseCb The lambda response callback.
     * @param __exceptionCb The lambda exception callback.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_getNetportsState(java.util.Map<String, String> __ctx,
                                                  FunctionalCallback_ISystemInformation_getNetportsState_Response __responseCb,
                                                  IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    /**
     * Description: 获得系统网口使用情况
     * Input: 
     * Output: values 返回状态列表
     * 为键值对数组，键为资源名称、值为资源使用值
     * Return:
     * Others: 
     * @param __ctx The Context map to send with the invocation.
     * @param __responseCb The lambda response callback.
     * @param __exceptionCb The lambda exception callback.
     * @param __sentCb The lambda sent callback.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_getNetportsState(java.util.Map<String, String> __ctx,
                                                  FunctionalCallback_ISystemInformation_getNetportsState_Response __responseCb,
                                                  IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb,
                                                  IceInternal.Functional_BoolCallback __sentCb);

    /**
     * Description: 获得系统网口使用情况
     * Input: 
     * Output: values 返回状态列表
     * 为键值对数组，键为资源名称、值为资源使用值
     * Return:
     * Others: 
     * @param __result The asynchronous result object.
     **/
    public Result end_getNetportsState(DeviceInfoListHolder states, Ice.AsyncResult __result);

    /**
     * Description: 获得系统串口使用情况
     * Input: 
     * Output: values 返回状态列表
     * 为键值对数组，键为资源名称、值为资源使用值
     * Return:
     * Others: 
     **/
    public Result getComportsState(DeviceInfoListHolder states);

    /**
     * Description: 获得系统串口使用情况
     * Input: 
     * Output: values 返回状态列表
     * 为键值对数组，键为资源名称、值为资源使用值
     * Return:
     * Others: 
     * @param __ctx The Context map to send with the invocation.
     **/
    public Result getComportsState(DeviceInfoListHolder states, java.util.Map<String, String> __ctx);

    /**
     * Description: 获得系统串口使用情况
     * Input: 
     * Output: values 返回状态列表
     * 为键值对数组，键为资源名称、值为资源使用值
     * Return:
     * Others: 
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_getComportsState();

    /**
     * Description: 获得系统串口使用情况
     * Input: 
     * Output: values 返回状态列表
     * 为键值对数组，键为资源名称、值为资源使用值
     * Return:
     * Others: 
     * @param __ctx The Context map to send with the invocation.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_getComportsState(java.util.Map<String, String> __ctx);

    /**
     * Description: 获得系统串口使用情况
     * Input: 
     * Output: values 返回状态列表
     * 为键值对数组，键为资源名称、值为资源使用值
     * Return:
     * Others: 
     * @param __cb The asynchronous callback object.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_getComportsState(Ice.Callback __cb);

    /**
     * Description: 获得系统串口使用情况
     * Input: 
     * Output: values 返回状态列表
     * 为键值对数组，键为资源名称、值为资源使用值
     * Return:
     * Others: 
     * @param __ctx The Context map to send with the invocation.
     * @param __cb The asynchronous callback object.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_getComportsState(java.util.Map<String, String> __ctx, Ice.Callback __cb);

    /**
     * Description: 获得系统串口使用情况
     * Input: 
     * Output: values 返回状态列表
     * 为键值对数组，键为资源名称、值为资源使用值
     * Return:
     * Others: 
     * @param __cb The asynchronous callback object.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_getComportsState(Callback_ISystemInformation_getComportsState __cb);

    /**
     * Description: 获得系统串口使用情况
     * Input: 
     * Output: values 返回状态列表
     * 为键值对数组，键为资源名称、值为资源使用值
     * Return:
     * Others: 
     * @param __ctx The Context map to send with the invocation.
     * @param __cb The asynchronous callback object.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_getComportsState(java.util.Map<String, String> __ctx, Callback_ISystemInformation_getComportsState __cb);

    public interface FunctionalCallback_ISystemInformation_getComportsState_Response
    {
        void apply(Result __ret, DeviceInfo[] states);
    }

    /**
     * Description: 获得系统串口使用情况
     * Input: 
     * Output: values 返回状态列表
     * 为键值对数组，键为资源名称、值为资源使用值
     * Return:
     * Others: 
     * @param __responseCb The lambda response callback.
     * @param __exceptionCb The lambda exception callback.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_getComportsState(FunctionalCallback_ISystemInformation_getComportsState_Response __responseCb,
                                                  IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    /**
     * Description: 获得系统串口使用情况
     * Input: 
     * Output: values 返回状态列表
     * 为键值对数组，键为资源名称、值为资源使用值
     * Return:
     * Others: 
     * @param __responseCb The lambda response callback.
     * @param __exceptionCb The lambda exception callback.
     * @param __sentCb The lambda sent callback.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_getComportsState(FunctionalCallback_ISystemInformation_getComportsState_Response __responseCb,
                                                  IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb,
                                                  IceInternal.Functional_BoolCallback __sentCb);

    /**
     * Description: 获得系统串口使用情况
     * Input: 
     * Output: values 返回状态列表
     * 为键值对数组，键为资源名称、值为资源使用值
     * Return:
     * Others: 
     * @param __ctx The Context map to send with the invocation.
     * @param __responseCb The lambda response callback.
     * @param __exceptionCb The lambda exception callback.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_getComportsState(java.util.Map<String, String> __ctx,
                                                  FunctionalCallback_ISystemInformation_getComportsState_Response __responseCb,
                                                  IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    /**
     * Description: 获得系统串口使用情况
     * Input: 
     * Output: values 返回状态列表
     * 为键值对数组，键为资源名称、值为资源使用值
     * Return:
     * Others: 
     * @param __ctx The Context map to send with the invocation.
     * @param __responseCb The lambda response callback.
     * @param __exceptionCb The lambda exception callback.
     * @param __sentCb The lambda sent callback.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_getComportsState(java.util.Map<String, String> __ctx,
                                                  FunctionalCallback_ISystemInformation_getComportsState_Response __responseCb,
                                                  IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb,
                                                  IceInternal.Functional_BoolCallback __sentCb);

    /**
     * Description: 获得系统串口使用情况
     * Input: 
     * Output: values 返回状态列表
     * 为键值对数组，键为资源名称、值为资源使用值
     * Return:
     * Others: 
     * @param __result The asynchronous result object.
     **/
    public Result end_getComportsState(DeviceInfoListHolder states, Ice.AsyncResult __result);
}