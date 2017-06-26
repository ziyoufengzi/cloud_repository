/**
 * TcHospitalGzhMapper.java
 * Copyright© 2017 北京金风易通科技有限公司
 * All rights reserved.
 * -----------------------------------------------
 * 2017-06-26 Created
 */
package com.jfsoft.tchospitalgzh.mapper;

import java.util.List;

import com.jfsoft.tchospitalgzh.model.TcHospitalGzh;
import com.jfsoft.tchospitalgzh.model.TcHospitalGzhExample;
import org.apache.ibatis.annotations.Param;

public interface TcHospitalGzhMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tc_hospital_gzh
     */
    int countByExample(TcHospitalGzhExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tc_hospital_gzh
     */
    int deleteByExample(TcHospitalGzhExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tc_hospital_gzh
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tc_hospital_gzh
     */
    int insert(TcHospitalGzh record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tc_hospital_gzh
     */
    int insertSelective(TcHospitalGzh record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tc_hospital_gzh
     */
    List<TcHospitalGzh> selectByExample(TcHospitalGzhExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tc_hospital_gzh
     */
    TcHospitalGzh selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tc_hospital_gzh
     */
    int updateByExampleSelective(@Param("record") TcHospitalGzh record, @Param("example") TcHospitalGzhExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tc_hospital_gzh
     */
    int updateByExample(@Param("record") TcHospitalGzh record, @Param("example") TcHospitalGzhExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tc_hospital_gzh
     */
    int updateByPrimaryKeySelective(TcHospitalGzh record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tc_hospital_gzh
     */
    int updateByPrimaryKey(TcHospitalGzh record);
}