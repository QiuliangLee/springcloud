package cn.itcast.user.service;

import cn.itcast.user.pojo.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author liqiuliang
 * @create 2023-07-28 1:22
 */
@RequestMapping("/user")
public interface UserRemoteService {

    /**
     * 路径： /user/110
     *
     * @param id 用户id
     * @return 用户
     */
    @GetMapping("/{id}")
    User queryById(@PathVariable("id") Long id,
                   @RequestHeader(value = "Truth", required = false) String truth);
}
