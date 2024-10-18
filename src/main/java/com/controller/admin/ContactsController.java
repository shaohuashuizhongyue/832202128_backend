package com.controller.admin;

import com.entity.Contacts;
import com.dto.Constants;
import com.dto.ResponseDto;
import com.github.pagehelper.PageHelper;
import com.service.ContactsService;
import com.dto.PageDto;
import com.dto.ContactsDto;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/admin/contacts/")
public class ContactsController {
    @Resource
    private ContactsService contactsService;

    public static final String TABLE_NAME = "联系人";

    /**
     * ====后台联系人管理====
     *
     * @param contacts
     * @return
     */

    /*保存*/
    @RequestMapping("save")
    public String save(@RequestBody Contacts contacts) {
        Map<String, Object> map = new HashMap<String, Object>();
        System.out.println("id=="+contacts.getId());
        if (contacts.getId()==null){
        Timestamp time = new Timestamp(System.currentTimeMillis());
        contacts.setPubtime(time.toString().substring(0,19));
        contactsService.save(contacts);
        }else {
        contactsService.updateById(contacts);
        }
        return "success";
    }

    /*分页列表*/
    @RequestMapping("list")
   public ContactsDto list(ContactsDto contactsDto) {
        Map<String, Object> bMap = new HashMap<String, Object>();
        QueryWrapper<Contacts> wrapper = new QueryWrapper<>();
        if (contactsDto.getName() != null && !contactsDto.getName().equals("")) {
            wrapper.like("name",contactsDto.getName());
        }
        if (contactsDto.getUid() != null && !contactsDto.getUid().equals("")) {
            wrapper.like("uid",contactsDto.getUid());
        }
        if (contactsDto.getAge() != null && !contactsDto.getAge().equals("")) {
            wrapper.like("age",contactsDto.getAge());
        }
        if (contactsDto.getCtype() != null && !contactsDto.getCtype().equals("")) {
            wrapper.like("ctype",contactsDto.getCtype());
        }
        if (contactsDto.getSex() != null && !contactsDto.getSex().equals("")) {
            wrapper.like("sex",contactsDto.getSex());
        }
        if (contactsDto.getTel() != null && !contactsDto.getTel().equals("")) {
            wrapper.like("tel",contactsDto.getTel());
        }
        if (contactsDto.getAddress() != null && !contactsDto.getAddress().equals("")) {
            wrapper.like("address",contactsDto.getAddress());
        }
        wrapper.orderByDesc("id");
        List<Contacts> list = contactsService.list(wrapper);
        contactsDto.setTotal(list.size());
		PageHelper.startPage(contactsDto.getPage(),contactsDto.getSize());
		list = contactsService.list(wrapper);
        contactsDto.setList(list);
		return contactsDto;
    }

    /*联系人搜索列表*/
	@RequestMapping("search")
	public ContactsDto search(ContactsDto contactsDto) {
		Map<String, Object> bMap = new HashMap<String, Object>();
        QueryWrapper<Contacts> wrapper = new QueryWrapper<>();
        if (contactsDto.getName() != null && !contactsDto.getName().equals("")) {
            wrapper.like("name",contactsDto.getName());
        }
        if (contactsDto.getUid() != null && !contactsDto.getUid().equals("")) {
            wrapper.like("uid",contactsDto.getUid());
        }
        if (contactsDto.getAge() != null && !contactsDto.getAge().equals("")) {
            wrapper.like("age",contactsDto.getAge());
        }
        if (contactsDto.getCtype() != null && !contactsDto.getCtype().equals("")) {
            wrapper.like("ctype",contactsDto.getCtype());
        }
        if (contactsDto.getSex() != null && !contactsDto.getSex().equals("")) {
            wrapper.like("sex",contactsDto.getSex());
        }
        if (contactsDto.getTel() != null && !contactsDto.getTel().equals("")) {
            wrapper.like("tel",contactsDto.getTel());
        }
        if (contactsDto.getAddress() != null && !contactsDto.getAddress().equals("")) {
            wrapper.like("address",contactsDto.getAddress());
        }
        wrapper.orderByDesc("id");
        List<Contacts> list = contactsService.list(wrapper);
        contactsDto.setTotal(list.size());
		PageHelper.startPage(contactsDto.getPage(),contactsDto.getSize());
		list = contactsService.list(wrapper);
        contactsDto.setList(list);
		return contactsDto;
	}

    /*删除*/
    @RequestMapping("delete/{id}")
    public String delete(@PathVariable Integer id) {
        contactsService.removeById(id);
        return "success";
    }

    /*获取单个对象*/
    @RequestMapping("getById")
    public Contacts getById(@PathVariable Integer id) {
        Map<String, Object> map = new HashMap<String, Object>();
        Contacts contacts1 = contactsService.getById(id);
        return contacts1;
    }

    /*获取所有*/
    @RequestMapping("all")
    public List<Contacts> all() {
        Map<String, Object> bMap = new HashMap<String, Object>();
        QueryWrapper<Contacts> wrapper = new QueryWrapper<>();
        wrapper.allEq(bMap);
        List<Contacts> list = contactsService.list(wrapper);
        return list;
    }

}
