package com.quick.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.quick.pojo.po.QuickChatGroupMember;
import com.quick.pojo.po.QuickChatUser;

import java.util.List;

/**
 * <p>
 * 群成员 服务类
 * </p>
 *
 * @author 徐志斌
 * @since 2024-01-08
 */
public interface QuickChatGroupMemberService extends IService<QuickChatGroupMember> {

    List<QuickChatUser> getMemberByGroupId(Long groupId);
}
