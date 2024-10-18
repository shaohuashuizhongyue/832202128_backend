package com.service.impl;

import com.entity.Contacts;
import com.mapper.ContactsMapper;
import com.service.ContactsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 联系人 服务实现类
 * </p>
 *
 * @author admin
 * @since 2024-10-13
 */
@Service
public class ContactsServiceImpl extends ServiceImpl<ContactsMapper, Contacts> implements ContactsService {

}
