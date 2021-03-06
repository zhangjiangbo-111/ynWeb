// **********************************************************************
//
// Copyright (c) 2003-2018 ZeroC, Inc. All rights reserved.
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
// Generated from file `RpcCommon.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package YNRPC;

/**
 * Provides type-specific helper functions.
 **/
public final class VariantBoolPrxHelper extends Ice.ObjectPrxHelperBase implements VariantBoolPrx
{
    /**
     * Contacts the remote server to verify that the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param __obj The untyped proxy.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static VariantBoolPrx checkedCast(Ice.ObjectPrx __obj)
    {
        return checkedCastImpl(__obj, ice_staticId(), VariantBoolPrx.class, VariantBoolPrxHelper.class);
    }

    /**
     * Contacts the remote server to verify that the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param __obj The untyped proxy.
     * @param __ctx The Context map to send with the invocation.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static VariantBoolPrx checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        return checkedCastImpl(__obj, __ctx, ice_staticId(), VariantBoolPrx.class, VariantBoolPrxHelper.class);
    }

    /**
     * Contacts the remote server to verify that a facet of the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param __obj The untyped proxy.
     * @param __facet The name of the desired facet.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static VariantBoolPrx checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        return checkedCastImpl(__obj, __facet, ice_staticId(), VariantBoolPrx.class, VariantBoolPrxHelper.class);
    }

    /**
     * Contacts the remote server to verify that a facet of the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param __obj The untyped proxy.
     * @param __facet The name of the desired facet.
     * @param __ctx The Context map to send with the invocation.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static VariantBoolPrx checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        return checkedCastImpl(__obj, __facet, __ctx, ice_staticId(), VariantBoolPrx.class, VariantBoolPrxHelper.class);
    }

    /**
     * Downcasts the given proxy to this type without contacting the remote server.
     * @param __obj The untyped proxy.
     * @return A proxy for this type.
     **/
    public static VariantBoolPrx uncheckedCast(Ice.ObjectPrx __obj)
    {
        return uncheckedCastImpl(__obj, VariantBoolPrx.class, VariantBoolPrxHelper.class);
    }

    /**
     * Downcasts the given proxy to this type without contacting the remote server.
     * @param __obj The untyped proxy.
     * @param __facet The name of the desired facet.
     * @return A proxy for this type.
     **/
    public static VariantBoolPrx uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        return uncheckedCastImpl(__obj, __facet, VariantBoolPrx.class, VariantBoolPrxHelper.class);
    }

    public static final String[] __ids =
    {
        "::Ice::Object",
        "::YNRPC::Variant",
        "::YNRPC::VariantBool"
    };

    /**
     * Provides the Slice type ID of this type.
     * @return The Slice type ID.
     **/
    public static String ice_staticId()
    {
        return __ids[2];
    }

    public static void __write(IceInternal.BasicStream __os, VariantBoolPrx v)
    {
        __os.writeProxy(v);
    }

    public static VariantBoolPrx __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            VariantBoolPrxHelper result = new VariantBoolPrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }

    public static final long serialVersionUID = 0L;
}
