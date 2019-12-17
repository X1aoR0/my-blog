package com.jicl.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table t_announcement
 *
 * @mbg.generated do_not_delete_during_merge
 */
@Data
public class Announcement implements Serializable {
    /**
     * Database Column Remarks:
     *   公告id，主键
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_announcement.annc_id
     *
     * @mbg.generated
     */
    private Integer anncId;

    /**
     * Database Column Remarks:
     *   公告标题
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_announcement.annc_title
     *
     * @mbg.generated
     */
    private String anncTitle;

    /**
     * Database Column Remarks:
     *   公告描述
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_announcement.annc_desc
     *
     * @mbg.generated
     */
    private String anncDesc;

    /**
     * Database Column Remarks:
     *   是否置顶
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_announcement.top_flag
     *
     * @mbg.generated
     */
    private Boolean topFlag;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_announcement.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * Database Column Remarks:
     *   更新时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_announcement.update_time
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     * Database Column Remarks:
     *   删除标志：1-删除 0-未删除
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_announcement.del_flag
     *
     * @mbg.generated
     */
    private Boolean delFlag;

    /**
     * Database Column Remarks:
     *   删除时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_announcement.del_time
     *
     * @mbg.generated
     */
    private Date delTime;

    /**
     * Database Column Remarks:
     *   公告内容
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_announcement.annc_content
     *
     * @mbg.generated
     */
    private String anncContent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_announcement
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;
}