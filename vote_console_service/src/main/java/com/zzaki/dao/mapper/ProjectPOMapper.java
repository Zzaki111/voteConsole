package com.zzaki.dao.mapper;

import com.zzaki.model.entity.ProjectPO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.type.JdbcType;
import tk.mybatis.mapper.common.Mapper;

public interface ProjectPOMapper extends Mapper<ProjectPO> {
}