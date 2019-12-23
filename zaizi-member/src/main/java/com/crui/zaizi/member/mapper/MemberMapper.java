package com.crui.zaizi.member.mapper;


import com.crui.zaizi.member.bean.UmsMember;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * VM Args:
 *
 * @author crui
 */
@Component
public interface MemberMapper extends Mapper<UmsMember> {
    List<UmsMember> selectAllMember();

//    List<UmsMember> selectAll();
}
