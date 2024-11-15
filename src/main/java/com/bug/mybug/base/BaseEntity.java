package com.bug.mybug.base;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 通用字段
 * </p>
 *
 * @author codeGen
 * @since 2024-11-15
 */
@Data
@Accessors(chain = true)
public class BaseEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 记录创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createdTime;

    /**
     * 记录最后更新时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updatedTime;

    /**
     * 删除时间
     */
    private LocalDateTime deletedTime;

    /**
     * 删除标志
     */
    @TableLogic
    private Boolean deleted;

    /**
     * 创建者
     */
    @TableField(fill = FieldFill.INSERT)
    private Long createdBy;

    /**
     * 更新者
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Long updatedBy;

    /**
     * 版本号
     */
    @Version
    private Long version;

    public static final class Fields {

        /**
        * id
        */
        public static final String id = "id";

        /**
        * 记录创建时间
        */
        public static final String created_time = "created_time";

        /**
        * 记录最后更新时间
        */
        public static final String updated_time = "updated_time";

        /**
        * 删除时间
        */
        public static final String deleted_time = "deleted_time";

        /**
        * 删除标志
        */
        public static final String deleted = "deleted";

        /**
        * 创建者
        */
        public static final String created_by = "created_by";

        /**
        * 更新者
        */
        public static final String updated_by = "updated_by";

        /**
        * 版本号
        */
        public static final String version = "version";
    }

}
