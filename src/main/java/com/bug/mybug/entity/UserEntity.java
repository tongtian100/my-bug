package com.bug.mybug.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.bug.mybug.base.BaseEntity;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.io.Serial;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author codeGen
 * @since 2024-11-15
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
@TableName("user")
public class UserEntity extends BaseEntity {

    /**
     * 用户名，用于登录
     */
    private String username;

    /**
     * 密码哈希值，用于安全存储
     */
    private String passwordHash;

    /**
     * 用户邮箱地址，用于账户验证或找回密码
     */
    private String email;

    /**
     * 名字
     */
    private String firstName;

    /**
     * 姓氏
     */
    private String lastName;

    /**
     * 手机号码
     */
    private String phoneNumber;

    /**
     * 出生日期
     */
    private LocalDate dateOfBirth;

    /**
     * 性别，M代表男性，F代表女性
     */
    private String gender;

    /**
     * 地址
     */
    private String address;

    /**
     * 城市
     */
    private String city;

    /**
     * 州/省
     */
    private String state;

    /**
     * 国家
     */
    private String country;

    /**
     * 邮政编码
     */
    private String postalCode;

    /**
     * 上次登录时间
     */
    private LocalDateTime lastLogin;

    /**
     * 是否激活状态，用于判断账户是否可用
     */
    private Boolean isActive;

    /**
     * 是否为管理员
     */
    private Boolean isStaff;

    /**
     * 头像图片链接或路径
     */
    private String profilePicture;

    public static final class Fields {

        /**
        * 用户名，用于登录
        */
        public static final String username = "username";

        /**
        * 密码哈希值，用于安全存储
        */
        public static final String password_hash = "password_hash";

        /**
        * 用户邮箱地址，用于账户验证或找回密码
        */
        public static final String email = "email";

        /**
        * 名字
        */
        public static final String first_name = "first_name";

        /**
        * 姓氏
        */
        public static final String last_name = "last_name";

        /**
        * 手机号码
        */
        public static final String phone_number = "phone_number";

        /**
        * 出生日期
        */
        public static final String date_of_birth = "date_of_birth";

        /**
        * 性别，M代表男性，F代表女性
        */
        public static final String gender = "gender";

        /**
        * 地址
        */
        public static final String address = "address";

        /**
        * 城市
        */
        public static final String city = "city";

        /**
        * 州/省
        */
        public static final String state = "state";

        /**
        * 国家
        */
        public static final String country = "country";

        /**
        * 邮政编码
        */
        public static final String postal_code = "postal_code";

        /**
        * 上次登录时间
        */
        public static final String last_login = "last_login";

        /**
        * 是否激活状态，用于判断账户是否可用
        */
        public static final String is_active = "is_active";

        /**
        * 是否为管理员
        */
        public static final String is_staff = "is_staff";

        /**
        * 头像图片链接或路径
        */
        public static final String profile_picture = "profile_picture";
    }

}
