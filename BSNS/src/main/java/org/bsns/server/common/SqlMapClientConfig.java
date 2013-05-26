package org.bsns.server.common;

import javax.annotation.Resource;

import org.apache.log4j.Logger;

import com.ibatis.sqlmap.client.SqlMapClient;

public class SqlMapClientConfig {
	
	@Resource(name="sqlMapClient")
	public SqlMapClient sqlMap;

	private Logger log = Logger.getLogger(this.getClass());
	
	public SqlMapClient getSqlMapClient() {
		log.debug("===== SqlMapClientConfig Class =====");
		return sqlMap;
	}
}
