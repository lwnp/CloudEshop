package com.xzit.dubbointerface.user;

import com.xzit.commonObj.model.dto.UserInfoDTO;

public interface UserInfoService {
   UserInfoDTO getUserInfo(String username);
}
