package com.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 用户
 * </p>
 *
 * @author admin
 * @since
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Users implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户名
     */
    private String uname;

    /**
     * 姓名
     */
    private String name;

    /**
     * 图片
     */
    private String img;

    /**
     * 性别
     */
    private String sex;

    /**
     * 地址
     */
    private String address;

    /**
     * 密码
     */
    private String pwd;

    /**
     * 角色
     */
    private String utype;

    /**
     * 电话
     */
    private String tel;

    /**
     * 年龄
     */
    private String age;

    /**
     * 目前状态
     */
    private String status;

    /**
     * 邮箱
     */
    private String email;



    /**
     * 添加时间
     */
    private LocalDateTime pubtime;


}
