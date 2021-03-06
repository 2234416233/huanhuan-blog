package com.huan.service.impl;

import com.huan.mapper.ArticleListMapper;
import com.huan.mapper.UserInfoMapper;
import com.huan.model.ArticleList;
import com.huan.model.UserInfo;
import com.huan.service.MainPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhanhuanhuan
 */
@Service
public class MainPageServiceImpl implements MainPageService {

    @Autowired
    private UserInfoMapper userInfoMapper;
    @Autowired
    private ArticleListMapper articleListMapper;

    public List<UserInfo> selectAll() {
        return userInfoMapper.selectAll();
    }

    public UserInfo selectUserDetail() {
        return userInfoMapper.selectByPrimaryKey("1");
    }

    public List<ArticleList> selectAllArticle() {
        return articleListMapper.selectAll();
    }

}
