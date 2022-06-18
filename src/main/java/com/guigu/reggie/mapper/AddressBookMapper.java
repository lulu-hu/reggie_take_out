package com.guigu.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.guigu.reggie.entity.AddressBook;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AddressBookMapper extends BaseMapper<AddressBook> {
}
