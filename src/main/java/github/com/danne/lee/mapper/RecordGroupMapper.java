package github.com.danne.lee.mapper;

import github.com.danne.lee.entity.RecordGroup;

public interface RecordGroupMapper {
    int deleteByPrimaryKey(String id);

    int insert(RecordGroup record);

    int insertSelective(RecordGroup record);

    RecordGroup selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(RecordGroup record);

    int updateByPrimaryKey(RecordGroup record);
}