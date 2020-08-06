package com.xiaoshu.dao;

import com.xiaoshu.base.dao.BaseMapper;
import com.xiaoshu.entity.Model;
import com.xiaoshu.entity.ModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ModelMapper extends BaseMapper<Model> {
    long countByExample(ModelExample example);

    int deleteByExample(ModelExample example);

    List<Model> selectByExample(ModelExample example);

    int updateByExampleSelective(@Param("record") Model record, @Param("example") ModelExample example);

    int updateByExample(@Param("record") Model record, @Param("example") ModelExample example);
}