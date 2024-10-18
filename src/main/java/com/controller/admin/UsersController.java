package com.controller.admin;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.dto.Constants;
import com.dto.ResponseDto;
import com.dto.UsersDto;
import com.entity.Users;
import com.github.pagehelper.PageHelper;
import com.service.UsersService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/admin/users/")
public class UsersController {
    @Resource
    private UsersService usersService;


    public static final String TABLE_NAME = "用户";

    /**
     * ====后台用户管理====
     *
     * @param users
     * @return
     */

    /*保存*/
    @RequestMapping("save")
    public String save(@RequestBody Users users) {
        Map<String, Object> map = new HashMap<String, Object>();
        System.out.println("id==" + users.getId());
        if (users.getId() == null) {
            Timestamp time = new Timestamp(System.currentTimeMillis());
            //users.setPubtime(time.toString().substring(0,19));
            usersService.save(users);
        } else {
            usersService.updateById(users);
        }
        return "success";
    }

    /*分页列表*/
    @RequestMapping("list")
    public UsersDto list(UsersDto usersDto) {
        Map<String, Object> bMap = new HashMap<String, Object>();
        QueryWrapper<Users> wrapper = new QueryWrapper<>();
        if (usersDto.getUname() != null && !usersDto.getUname().equals("")) {
            wrapper.like("uname", usersDto.getUname());
        }
        if (usersDto.getName() != null && !usersDto.getName().equals("")) {
            wrapper.like("name", usersDto.getName());
        }
        if (usersDto.getSex() != null && !usersDto.getSex().equals("")) {
            wrapper.like("sex", usersDto.getSex());
        }
        if (usersDto.getAddress() != null && !usersDto.getAddress().equals("")) {
            wrapper.like("address", usersDto.getAddress());
        }
        if (usersDto.getPwd() != null && !usersDto.getPwd().equals("")) {
            wrapper.like("pwd", usersDto.getPwd());
        }
        if (usersDto.getUtype() != null && !usersDto.getUtype().equals("")) {
            wrapper.like("utype", usersDto.getUtype());
        }
        if (usersDto.getTel() != null && !usersDto.getTel().equals("")) {
            wrapper.like("tel", usersDto.getTel());
        }
        if (usersDto.getAge() != null && !usersDto.getAge().equals("")) {
            wrapper.like("age", usersDto.getAge());
        }
        if (usersDto.getStatus() != null && !usersDto.getStatus().equals("")) {
            wrapper.like("status", usersDto.getStatus());
        }
        if (usersDto.getEmail() != null && !usersDto.getEmail().equals("")) {
            wrapper.like("email", usersDto.getEmail());
        }
        wrapper.orderByDesc("id");
        List<Users> list = usersService.list(wrapper);
        usersDto.setTotal(list.size());
        PageHelper.startPage(usersDto.getPage(), usersDto.getSize());
        list = usersService.list(wrapper);
        usersDto.setList(list);
        return usersDto;
    }

    /*用户搜索列表*/
    @RequestMapping("search")
    public UsersDto search(UsersDto usersDto) {
        Map<String, Object> bMap = new HashMap<String, Object>();
        QueryWrapper<Users> wrapper = new QueryWrapper<>();
        if (usersDto.getUname() != null && !usersDto.getUname().equals("")) {
            wrapper.like("uname", usersDto.getUname());
        }
        if (usersDto.getName() != null && !usersDto.getName().equals("")) {
            wrapper.like("name", usersDto.getName());
        }
        if (usersDto.getSex() != null && !usersDto.getSex().equals("")) {
            wrapper.like("sex", usersDto.getSex());
        }
        if (usersDto.getAddress() != null && !usersDto.getAddress().equals("")) {
            wrapper.like("address", usersDto.getAddress());
        }
        if (usersDto.getPwd() != null && !usersDto.getPwd().equals("")) {
            wrapper.like("pwd", usersDto.getPwd());
        }
        if (usersDto.getUtype() != null && !usersDto.getUtype().equals("")) {
            wrapper.like("utype", usersDto.getUtype());
        }
        if (usersDto.getTel() != null && !usersDto.getTel().equals("")) {
            wrapper.like("tel", usersDto.getTel());
        }
        if (usersDto.getAge() != null && !usersDto.getAge().equals("")) {
            wrapper.like("age", usersDto.getAge());
        }
        if (usersDto.getStatus() != null && !usersDto.getStatus().equals("")) {
            wrapper.like("status", usersDto.getStatus());
        }
        if (usersDto.getEmail() != null && !usersDto.getEmail().equals("")) {
            wrapper.like("email", usersDto.getEmail());
        }
        wrapper.orderByDesc("id");
        List<Users> list = usersService.list(wrapper);
        usersDto.setTotal(list.size());
        PageHelper.startPage(usersDto.getPage(), usersDto.getSize());
        list = usersService.list(wrapper);
        usersDto.setList(list);
        return usersDto;
    }

    /*删除*/
    @RequestMapping("delete/{id}")
    public String delete(@PathVariable Integer id) {
        usersService.removeById(id);
        return "success";
    }

    /*获取单个对象*/
    @RequestMapping("getById")
    public Users getById(@RequestBody Users users) {
        Map<String, Object> map = new HashMap<String, Object>();
        Users users1 = usersService.getById(users.getId());
        return users1;
    }

    /*获取所有*/
    @RequestMapping("all")
    public List<Users> all() {
        Map<String, Object> bMap = new HashMap<String, Object>();
        QueryWrapper<Users> wrapper = new QueryWrapper<>();
        wrapper.allEq(bMap);
        List<Users> list = usersService.list(wrapper);
        return list;
    }

    /*后台验证登录*/
    @RequestMapping("login")
    public ResponseDto login(@RequestBody Users sysuser, HttpServletRequest request, HttpSession session) {
        Map<String, Object> uMap = new HashMap<String, Object>();
        QueryWrapper<Users> wrapper = new QueryWrapper<>();
        wrapper.eq("uname", sysuser.getUname());
        wrapper.eq("pwd", sysuser.getPwd());
        //wrapper.eq("utype",sysuser.getUtype());
        //wrapper.eq("status","正常");
        System.out.println("uname==" + sysuser.getUname());
        System.out.println("pwd==" + sysuser.getPwd());
        //System.out.println("utype=="+sysuser.getUtype());
        Users sysuser1 = usersService.getOne(wrapper);
        ResponseDto responseDto = new ResponseDto();
        if (sysuser1 == null) {
            responseDto.setSuccess(false);
            responseDto.setMessage("用户名或者密码不正确，请重新输入！");
            return responseDto;
        } else {
            if (!sysuser1.getStatus().equals("正常")) {
                responseDto.setSuccess(false);
                responseDto.setMessage("用户状态不正常，请联系管理员！");
                return responseDto;
            } else {
                responseDto.setSuccess(true);
                responseDto.setContent(sysuser1);
                request.getSession().setAttribute(Constants.LOGIN_USER, sysuser1);
                System.out.println("session==" + request.getSession().getAttribute(Constants.LOGIN_USER));
                session.setAttribute("auser", sysuser1);
                System.out.println("sesson===" + session.getAttribute("auser"));
                responseDto.setMessage("登录成功！");
                return responseDto;
            }
        }
    }

    /*退出登录*/
    @RequestMapping("logOut")
    public ResponseDto logOut(HttpServletRequest request) {
        request.getSession().removeAttribute(Constants.LOGIN_USER);
        ResponseDto responseDto = new ResponseDto();
        responseDto.setSuccess(true);
        return responseDto;
    }


    // 验证用户名是否存在
    @RequestMapping("checkName")
    public String checkName(@RequestBody Users sysuser) {
        Map<String, Object> map = new HashMap<String, Object>();
        QueryWrapper<Users> wrapper = new QueryWrapper<>();
        map.put("uname", sysuser.getUname());
        wrapper.allEq(map);
        System.out.println("uname===" + sysuser.getUname());
        System.out.println("uname222===" + usersService.list(wrapper));
        if (usersService.list(wrapper).size() > 0) {
            return "ng";
        } else {
            return "success";
        }
    }
}
