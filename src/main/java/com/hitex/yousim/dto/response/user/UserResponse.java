package com.hitex.yousim.dto.response.user;

import com.hitex.yousim.dto.response.IResponseData;
import com.hitex.yousim.model.User;
import lombok.Data;

@Data
public class UserResponse extends User implements IResponseData {
}
