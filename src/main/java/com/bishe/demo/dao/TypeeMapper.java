package com.bishe.demo.dao;

import com.bishe.demo.bean.Typee;
import com.bishe.demo.bean.TypeeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TypeeMapper {
    int countByExample(TypeeExample example);

    int deleteByExample(TypeeExample example);

    int insert(Typee record);

    int insertSelective(Typee record);

    List<Typee> selectByExample(TypeeExample example);

    int updateByExampleSelective(@Param("record") Typee record, @Param("example") TypeeExample example);

    int updateByExample(@Param("record") Typee record, @Param("example") TypeeExample example);
}