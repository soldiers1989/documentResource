package com.huateng.scf.adv.wrn.dao;

import com.huateng.base.common.beans.Page;
import com.huateng.scf.adv.wrn.dao.model.BWanMortCheckInfo;
import com.huateng.scf.adv.wrn.dao.model.BWanMortCheckInfoExample;

import java.util.List;

public interface IBWanMortCheckInfoDAO {
    int countByExample(BWanMortCheckInfoExample example);

    int deleteByExample(BWanMortCheckInfoExample example);

    int deleteByPrimaryKey(String id);

    void insert(BWanMortCheckInfo record);

    void insertSelective(BWanMortCheckInfo record);

    List<BWanMortCheckInfo> selectByExample(BWanMortCheckInfoExample example);

    BWanMortCheckInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(BWanMortCheckInfo record, BWanMortCheckInfoExample example);

    int updateByExample(BWanMortCheckInfo record, BWanMortCheckInfoExample example);

    int updateByPrimaryKeySelective(BWanMortCheckInfo record);

    int updateByPrimaryKey(BWanMortCheckInfo record);

    List<BWanMortCheckInfo> selectByPage(BWanMortCheckInfoExample example, Page page);
}