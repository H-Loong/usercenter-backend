package com.hloong.usercenter.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hloong.usercenter.model.domain.Tag;
import com.hloong.usercenter.service.TagService;
import com.hloong.usercenter.mapper.TagMapper;
import org.springframework.stereotype.Service;

/**
* @author lenovo
* @description 针对表【tag(标签)】的数据库操作Service实现
* @createDate 2024-05-11 09:53:20
*/
@Service
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag>
    implements TagService{

}




