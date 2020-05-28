package com.wyx.demo.strategypattern.handler;

/**
 * @Description //涉及的code类型枚举类
**/
public enum TypeEnum {

    MP3(0,"我是mp3"),
    MP4(1,"我是mp4"),
    MP5(2,"我是mp5"),
    ;

    private int code;
    private String msg;

    TypeEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
