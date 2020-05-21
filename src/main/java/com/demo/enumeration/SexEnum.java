package com.demo.enumeration;

import java.util.HashMap;
import java.util.Map;

public enum SexEnum {
    male(1,"男"),
    female(2,"女");

    private Integer code;
    private String desc;
    private static Map<Integer,SexEnum> map1 = new HashMap<Integer, SexEnum>();
    SexEnum(Integer code,String desc){
        this.code = code;
        this.desc = desc;
    }
    static {
        for (SexEnum sexEnum : values()){
            map1.put(sexEnum.getCode(),sexEnum);
        }
    }

    public Integer getCode(){
        return this.code;
    }

    public static SexEnum get(Integer code){
        return map1.get(code);
    }

}
