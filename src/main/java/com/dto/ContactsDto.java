package com.dto;

import org.apache.poi.ss.formula.functions.T;
import lombok.Data;


@Data
public class ContactsDto extends PageDto {



  /**
     * 业务上的成功或失败
     */
    private boolean success = true;

    /**
     * 返回码
     */
    private String code;
    /**
     * 返回信息
     */
    private String message;

    /**
     * 返回泛型数据，自定义类型
     */
    private T content;


    /**
     * id
     */
    private Integer id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 用户id
     */
    private Integer uid;

    /**
     * 年龄
     */
    private String age;

    /**
     * 类型
     */
    private String ctype;

    /**
     * 性别
     */
    private String sex;

    /**
     * 图片
     */
    private String img;

    /**
     * 联系方式
     */
    private String tel;

    /**
     * 地址
     */
    private String address;

    /**
     * 说明
     */
    private String note;

    /**
     * 添加时间
     */
    private String pubtime;



}
