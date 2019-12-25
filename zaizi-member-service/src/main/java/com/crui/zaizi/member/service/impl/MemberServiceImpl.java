package com.crui.zaizi.member.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.crui.zaizi.bean.UmsMember;
import com.crui.zaizi.bean.UmsMemberReceiveAddress;
import com.crui.zaizi.member.mapper.MemberMapper;
import com.crui.zaizi.member.mapper.UmsMemberReceiveAddressMapper;
import com.crui.zaizi.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;

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
    @Autowired
    private UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;


    @Override
    public List<UmsMember> getAllMember() {
        return memberMapper.selectAll();
//        return memberMapper.selectAllMember();
    }

    @Override
    public List<UmsMemberReceiveAddress> getAddressByMemberId(Integer memberId) {
        Example example = new Example(UmsMemberReceiveAddress.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("memberId", memberId);


        return umsMemberReceiveAddressMapper.selectByExample(example);
    }




}
