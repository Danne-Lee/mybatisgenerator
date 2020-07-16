package github.com.danne.lee.mapper;

import github.com.danne.lee.entity.Gtcj;

public interface GtcjMapper {
    int deleteByPrimaryKey(String id);

    int insert(Gtcj record);

    int insertSelective(Gtcj record);

    Gtcj selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Gtcj record);

    int updateByPrimaryKey(Gtcj record);
}