package cn.itcast.order.consumer;

import cn.itcast.user.service.UserRemoteService;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author liqiuliang
 * @create 2023-07-28 1:29
 */
@FeignClient(value = "userservice", contextId = "userRemoteService")
public interface UserConsumer extends UserRemoteService {
}
