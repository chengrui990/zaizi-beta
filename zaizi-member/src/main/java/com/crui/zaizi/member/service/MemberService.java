package com.crui.zaizi.member.service;

import com.crui.zaizi.member.bean.UmsMember;
import com.crui.zaizi.member.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface MemberService {
    List<UmsMember> getAllMember();

    List<UmsMemberReceiveAddress> getAddressByMemberId(Integer memberId);

//    List<UmsMember> getAllUser();
//
//    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(Integer memberId);
}
