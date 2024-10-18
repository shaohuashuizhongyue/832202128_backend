package com.dto;

import lombok.Data;
import org.apache.poi.ss.formula.functions.T;


@Data
public class UsersDto extends PageDto {



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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public boolean getSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    /**
     * id
     */
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
     * 介绍
     */
    private String note;

    /**
     * 邮箱
     */
    private String email;


    /**
     * 添加时间
     */
    private String pubtime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    public String getUtype() {
        return utype;
    }

    public void setUtype(String utype) {
        this.utype = utype;
    }
    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    public String getAge() {
        return age;
    }


    public void setEmail(String email) {
        this.email = email;
    }
    public String getPubtime() {
        return pubtime;
    }

    public void setPubtime(String pubtime) {
        this.pubtime = pubtime;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Users{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                ", content=" + content +
                ", id=" + id+ '\'' +
                ", uname=" + uname+ '\'' +
                ", name=" + name+ '\'' +
                ", img=" + img+ '\'' +
                ", sex=" + sex+ '\'' +
                ", address=" + address+ '\'' +
                ", pwd=" + pwd+ '\'' +
                ", utype=" + utype+ '\'' +
                ", tel=" + tel+ '\'' +
                ", age=" + age+ '\'' +
                ", status=" + status+ '\'' +
                ", note=" + note+ '\'' +
                ", email=" + email+ '\'' +
                ", pubtime=" + pubtime+ '\'' +
                ", page=" + page +
                ", size=" + size +
                ", total=" + total +
                ", list=" + list +
                '}';
    }

}
