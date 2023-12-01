package com.quick.pojo.po;

import com.baomidou.mybatisplus.annotation.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 聊天信息
 * </p>
 *
 * @author 徐志斌
 * @since 2023-11-25
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@TableName("quick_chat_msg")
public class QuickChatMsg implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 账户id（发送人）
     */
    @TableField("send_id")
    private String sendId;

    /**
     * 账户id（接收人）
     */
    @TableField("receive_id")
    private String receiveId;

    /**
     * 消息内容
     */
    @TableField("content")
    private String content;

    /**
     * 消息类型（1：文字，2：语音，3：表情包，4：文件，5：语音通话，6：视频通话）
     *
     * @see com.quick.enums.ChatMsgEnum
     */
    @TableField("type")
    private Integer type;

    /**
     * 时间标识
     */
    @TableField("show_flag")
    private String showFlag;

    /**
     * 已读标识
     */
    @TableField("read_flag")
    private String readFlag;

    /**
     * 艾特标识
     */
    @TableField("at_nick")
    private String atNick;

    /**
     * 创建时间
     */
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    /**
     * 删除标识
     */
    @TableField(value = "deleted", fill = FieldFill.INSERT)
    @TableLogic
    private Boolean deleted;


}
