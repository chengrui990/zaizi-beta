package com.crui.zaizi.member.service.impl;

import com.crui.zaizi.member.bean.UmsMember;
import com.crui.zaizi.member.mapper.MemberMapper;
import com.crui.zaizi.member.mapper.UmsMemberReceiveAddressMapper;
import com.crui.zaizi.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * VM Args:
 *
 * @author crui
 */
@Service
public class MemberServiceImpl implements MemberService {
    @Autowired
    private MemberMapper memberMapper;
    @Override
    public List<UmsMember> getAllMember() {
        return memberMapper.selectAllMember();
    }

//    @Autowired
//    private UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;


}
