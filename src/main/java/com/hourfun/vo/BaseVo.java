package com.hourfun.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BaseVo implements Serializable  {
    private static final long serialVersionUID = 2829611531281555408L;
}
