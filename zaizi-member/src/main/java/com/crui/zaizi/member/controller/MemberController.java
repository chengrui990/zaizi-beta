package com.crui.zaizi.member.controller;

import com.crui.zaizi.bean.UmsMember;
import com.crui.zaizi.bean.UmsMemberReceiveAddress;
import com.crui.zaizi.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * VM Args:
 *
 * @author crui
 */
@Controller
@RequestMapping("member")
public class MemberController {
    @Autowired
    private MemberService memberService;

    @RequestMapping("index")
    @ResponseBody
    public String index(){
        return "hellp";
    }

    @RequestMapping("getAll")
    @ResponseBody
    public List<UmsMember> getAllMember(){
        return memberService.getAllMember();
    }

    @RequestMapping("getAddressByMemberId")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getAddressByMemberId(@RequestParam Integer memberId){
        return memberService.getAddressByMemberId(memberId);
    }
}
