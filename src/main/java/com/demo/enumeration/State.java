package com.demo.enumeration;

import com.demo.util.ICoded;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public enum State implements ICoded<State>,Serializable {
    ON(1,"上线"),
    OFF(0,"下线");

    State(Integer code, String desc){
        this.code = code;
        this.desc = desc;
    }

    private final Integer code;
    private final String desc;
    private static final Map<Integer, State> stateHashMap = new HashMap<Integer, State>();

    static {
        for (State state : values()){
            stateHashMap.put(state.getCode(), state);
        }
    }

    @Override
    public Integer getCode(){
        return code;
    }

    public static State get(Integer code){
        return stateHashMap.get(code);
    }
}

