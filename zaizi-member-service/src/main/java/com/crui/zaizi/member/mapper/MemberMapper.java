package com.crui.zaizi.member.mapper;


import com.crui.zaizi.bean.UmsMember;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * VM Args:
 *
 * @author crui
 */

public interface MemberMapper extends Mapper<UmsMember> {
    List<UmsMember> selectAllMember();

//    List<UmsMember> selectAll();
}
