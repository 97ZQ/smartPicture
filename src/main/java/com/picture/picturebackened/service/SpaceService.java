package com.picture.picturebackened.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.picture.picturebackened.model.dto.space.SpaceAddRequest;
import com.picture.picturebackened.model.dto.space.SpaceQueryRequest;
import com.picture.picturebackened.model.entity.Space;
import com.picture.picturebackened.model.entity.User;
import com.picture.picturebackened.model.vo.SpaceVO;

import javax.servlet.http.HttpServletRequest;

/**
* @author DELL
* @description 针对表【space(空间)】的数据库操作Service
* @createDate 2025-04-13 16:24:53
*/
public interface SpaceService extends IService<Space> {

    /**
     * 创建空间
     * @param spaceAddRequest
     * @param loginUser
     * @return
     */
    long addSpace(SpaceAddRequest spaceAddRequest, User loginUser);
    /**
     * 校验空间
     * @param space
     */
    void validSpace(Space space,boolean add);

    /**
     * 获取空间视图类
     * @param space
     * @param request
     * @return
     */
    SpaceVO getSpaceVO(Space space, HttpServletRequest request);

    /**
     * 获取空间试图分页结果
     * @param spacePage
     * @param request
     * @return
     */
    Page<SpaceVO> getSpaceVOPage(Page<Space> spacePage, HttpServletRequest request);

    /**
     * 获取查询对象
     * @param spaceQueryRequest
     * @return
     */
    QueryWrapper<Space> getQueryWrapper(SpaceQueryRequest spaceQueryRequest);

    /**
     * 根据空间级别填充空间对象
     * @param space
     */
    void fillSpaceBySpaceLevel(Space space);
}
