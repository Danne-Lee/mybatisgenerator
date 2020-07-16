package github.com.danne.lee.mapper;

import github.com.danne.lee.entity.DataStaticFlow;
import github.com.danne.lee.entity.DataStaticFlowKey;

public interface DataStaticFlowMapper {
    int deleteByPrimaryKey(DataStaticFlowKey key);

    int insert(DataStaticFlow record);

    int insertSelective(DataStaticFlow record);

    DataStaticFlow selectByPrimaryKey(DataStaticFlowKey key);

    int updateByPrimaryKeySelective(DataStaticFlow record);

    int updateByPrimaryKey(DataStaticFlow record);
}