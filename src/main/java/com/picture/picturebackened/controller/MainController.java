package com.picture.picturebackened.controller;

import com.picture.picturebackened.common.BaseResponse;
import com.picture.picturebackened.common.ResultUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MainController {

    /**
     * 健康检查
     * @return
     */
    @GetMapping("/health")
    public BaseResponse<String> healthy(){
        return ResultUtils.success("ok");
    }
}
