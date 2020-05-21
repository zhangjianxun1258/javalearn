package com.demo.pojo;


import com.demo.enumeration.State;
import lombok.Data;

import java.util.Date;

@Data
public class User {
    private Long id;
    private String loginId;
    private String name;
    private State state;
    private Date gmtCreate;
    private Date gmtModified;
}
