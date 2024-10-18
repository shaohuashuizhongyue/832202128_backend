package com.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.dto.CommonDto;
import com.entity.*;

/*import com.entity.Users;*/
/*import com.service.*;*/
import com.service.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/admin/common/")
public class CommonController {

    @Resource
    private UsersService usersService;


    /*通用方法*/
    @RequestMapping("all")
    public CommonDto all() {
        CommonDto commonDto = new CommonDto();
        /*用户*/
        List<Users> list = usersService.list();
        commonDto.setUalist(list);


        QueryWrapper<Users> wrapper2 = new QueryWrapper<>();
        wrapper2.eq("utype", "普通用户");
        List<Users> yglist = usersService.list(wrapper2);
        commonDto.setYglist(yglist);



        return commonDto;
    }


}
