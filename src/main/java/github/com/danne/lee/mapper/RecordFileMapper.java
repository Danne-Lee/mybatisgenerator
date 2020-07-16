package github.com.danne.lee.mapper;

import github.com.danne.lee.entity.RecordFile;

public interface RecordFileMapper {
    int deleteByPrimaryKey(String id);

    int insert(RecordFile record);

    int insertSelective(RecordFile record);

    RecordFile selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(RecordFile record);

    int updateByPrimaryKey(RecordFile record);
}