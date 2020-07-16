package github.com.danne.lee.mapper;

import github.com.danne.lee.entity.RecordConditions;
import github.com.danne.lee.entity.RecordConditionsKey;

public interface RecordConditionsMapper {
    int deleteByPrimaryKey(RecordConditionsKey key);

    int insert(RecordConditions record);

    int insertSelective(RecordConditions record);

    RecordConditions selectByPrimaryKey(RecordConditionsKey key);

    int updateByPrimaryKeySelective(RecordConditions record);

    int updateByPrimaryKey(RecordConditions record);
}