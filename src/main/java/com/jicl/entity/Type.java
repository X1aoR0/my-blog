package com.jicl.entity;

import java.io.Serializable;

import lombok.Builder;
import lombok.Data;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table t_type
 *
 * @mbg.generated do_not_delete_during_merge
 */
@Data
@Builder
public class Type implements Serializable {
    /**
     * Database Column Remarks:
     *   主键
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_type.type_id
     *
     * @mbg.generated
     */
    private Integer typeId;

    /**
     * Database Column Remarks:
     *   类型名
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_type.type_name
     *
     * @mbg.generated
     */
    private String typeName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_type
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;
}