package com.syhbuy.spay.admin.base.shiro;
import com.syhbuy.spay.admin.base.util.Common;
import com.syhbuy.spay.admin.dao.ResourcesMapper;
import com.syhbuy.spay.admin.entity.Resources;
import com.syhbuy.spay.admin.entity.Role;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.shiro.config.Ini;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


/**
 * 产生责任链，确定每个url的访问权限
 * 
 */
public class ChainDefinitionSectionMetaSource implements FactoryBean<Ini.Section> {
	public static Log log = LogFactory.getLog(ChainDefinitionSectionMetaSource.class);

	@Autowired
	private ResourcesMapper resourcesMapper;

	// 静态资源访问权限
	private String filterChainDefinitions = null;

	public Ini.Section getObject() throws Exception {
		Ini ini = new Ini();
		if(null != filterChainDefinitions){
			ini.load(filterChainDefinitions);
		}
		Ini.Section section = ini.getSection(Ini.DEFAULT_SECTION_NAME);

		List<Resources> resources = resourcesMapper.selectResRole();
		for(Resources r : resources){
			if(Common.isNotEmpty(r.getResUrl())){
				if(r.getRoles() != null && r.getRoles().size() > 0){
					String rolesStr = "authc,roles[";
					for(Role role : r.getRoles()){
						rolesStr+=role.getRoleKey()+",";
					}
					rolesStr = rolesStr.substring(0,rolesStr.length()-1)+"]";
					section.put("/"+r.getResUrl(),rolesStr);
				}
			}
		}
		section.put("/**", "authc");

		return section;
	}

	/**
	 * 通过filterChainDefinitions对默认的url过滤定义
	 * 
	 * @param filterChainDefinitions
	 *            默认的url过滤定义
	 */
	public void setFilterChainDefinitions(String filterChainDefinitions) {
		this.filterChainDefinitions = filterChainDefinitions;
	}

	public Class<?> getObjectType() {
		return this.getClass();
	}

	public boolean isSingleton() {
		return false;
	}
}
