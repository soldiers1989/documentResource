package com.huateng.scf.adv.qry.dao.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.huateng.base.common.beans.Page;
import com.huateng.base.ibatisEx.IbatisDaoAnnotation4Template;
import com.huateng.base.ibatisEx.IbatisTemplate;
import com.huateng.scf.adv.qry.dao.IFranchiserProtocolMngDAO;

@Repository("franchiserProtocolMngDAO")
public class FranchiserProtocolMngDAOImpl extends IbatisDaoAnnotation4Template implements IFranchiserProtocolMngDAO {

	@Resource(name="sqlMapClientTemplate")
	
    private IbatisTemplate template;
	
	 public IbatisTemplate getSqlMapClientTemplate() {
	        return this.template;
	    }
	@Override
	public List<Map<String, Object>> selectByPage(Map<String, Object> param, Page page) {
		@SuppressWarnings("unchecked")
		List<Map<String, Object>> list =  this.searchListPageMyObject("EXT_FRANCHISERPROTOCOLMNG.queryFranchiserProtocol",param, page);
        return list;
	}

}
