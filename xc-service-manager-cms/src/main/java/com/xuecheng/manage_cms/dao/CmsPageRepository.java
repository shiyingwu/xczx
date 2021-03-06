package com.xuecheng.manage_cms.dao;

import com.xuecheng.framework.domain.cms.CmsPage;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface CmsPageRepository extends MongoRepository<CmsPage,String> {

    public CmsPage findByPageName(String pageName);
    //根据页面名称，站点id，页面访问路径查询
    public CmsPage findByPageNameAndSiteIdAndAndPageWebPath(String pageName,String siteId,String pageWebPath);


}
