//# xsc 19.4.0-0adeb1-20190425

package com.example.backend.travelexpense.proxy.internal;

public abstract class Any_as_com_example_backend_travelexpense_proxy_ExpenseType
{
    public static com.example.backend.travelexpense.proxy.ExpenseType cast(final Object value)
    {
        //# /usr/sap/ljs/xs-temp/0f924fe5-cc65-4d37-90d6-72e0a58bb8dd/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:2199:39 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:88:16 => /usr/sap/ljs/xs-temp/xs-home/templates/Any.as.xs:7:12
        if (value instanceof com.example.backend.travelexpense.proxy.ExpenseType)
        {
            final com.example.backend.travelexpense.proxy.ExpenseType var_value = ((com.example.backend.travelexpense.proxy.ExpenseType)value);
            return var_value;
        }
        else
        {
            throw com.sap.cloud.server.odata.core.CastException.cannotCast(value, "com.example.backend.travelexpense.proxy.ExpenseType");
        }
    }
}