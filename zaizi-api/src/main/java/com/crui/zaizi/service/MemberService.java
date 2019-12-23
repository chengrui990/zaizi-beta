package com.crui.zaizi.service;

import com.crui.zaizi.bean.UmsMember;
import com.crui.zaizi.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface MemberService {
    List<UmsMember> getAllMember();

    List<UmsMemberReceiveAddress> getAddressByMemberId(Integer memberId);

}
