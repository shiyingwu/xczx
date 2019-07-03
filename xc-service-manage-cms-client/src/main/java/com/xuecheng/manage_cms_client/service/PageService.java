package com.xuecheng.manage_cms_client.service;

import com.xuecheng.framework.domain.cms.CmsPage;
import com.xuecheng.manage_cms_client.dao.CmsPageRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PageService {
    @Autowired
    CmsPageRepository cmsPageRepository;
    //保存html页面到服务器物理路径
    public void savePageToServicePath(String pageId){
        //根据pageId查询cmsPage
        //得到html的文件id，从cmsPage中获取htmlFileId内容
        //从gridFS中查询html文件
        //将html文件保存到服务器物理路径上
    }
    //根据页面id查询页面的html文件id
    public CmsPage findCmsPageById(String pageId){
        Optional<CmsPage> optional = cmsPageRepository.findById(pageId);
        if (optional.isPresent()){
            return optional.get();
        }
        return null;
    }
}
