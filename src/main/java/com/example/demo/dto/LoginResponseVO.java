package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 登录成功返回体
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginResponseVO {

    /** 用户ID */
    private Long userId;

    /** 身份权限：1-普通用户，2-管理员，3-开发者 */
    private Integer status;

    /** 当前已选择的本命英雄数量 */
    private Integer heroCount;

    /** 当前是否需要选择本命英雄 */
    private Boolean needChooseHero;

    /** 当前已选择的本命英雄列表 */
    private List<UserHeroVO> heroList;
}


