package com.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 联系人
 * </p>
 *
 * @author admin
 * @since 2024-10-13
 */
@Data
  @EqualsAndHashCode(callSuper = false)
    public class Contacts implements Serializable {

    private static final long serialVersionUID=1L;

      /**
     * id
     */
        @TableId(value = "id", type = IdType.AUTO)
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
