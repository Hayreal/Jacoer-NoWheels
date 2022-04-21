package com.hayreal.datasourceplus.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface BatchMapper {

    void batchUpdate();

    void batchInsert(List<Map<String,Object>> list);
}
