package github.com.danne.lee.mapper;

import github.com.danne.lee.entity.PumpFullCoefficient;
import github.com.danne.lee.entity.PumpFullCoefficientKey;

public interface PumpFullCoefficientMapper {
    int deleteByPrimaryKey(PumpFullCoefficientKey key);

    int insert(PumpFullCoefficient record);

    int insertSelective(PumpFullCoefficient record);

    PumpFullCoefficient selectByPrimaryKey(PumpFullCoefficientKey key);

    int updateByPrimaryKeySelective(PumpFullCoefficient record);

    int updateByPrimaryKey(PumpFullCoefficient record);
}