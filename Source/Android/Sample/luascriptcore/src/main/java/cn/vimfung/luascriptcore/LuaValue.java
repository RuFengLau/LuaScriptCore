package cn.vimfung.luascriptcore;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Lua值对象
 * Created by vimfung on 16/8/23.
 */
public class LuaValue
{
    private Object _valueContainer;
    private LuaValueType _type;

    public LuaValue(double value)
    {
        _type = LuaValueType.Number;
        _valueContainer = value;
    }

    public LuaValue(boolean value)
    {
        _type = LuaValueType.Boolean;
        _valueContainer = value;
    }

    public LuaValue(String value)
    {
        _type = LuaValueType.String;
        _valueContainer = value;
    }

    public LuaValue (byte[] value)
    {
        _type = LuaValueType.Data;
        _valueContainer = value;
    }

    public LuaValue (ArrayList value)
    {
        _type = LuaValueType.Table;
        _valueContainer = value;
    }

    public LuaValue (HashMap value)
    {
        _type = LuaValueType.Table;
        _valueContainer = value;
    }

    public Object toObject()
    {
        return _valueContainer;
    }
}