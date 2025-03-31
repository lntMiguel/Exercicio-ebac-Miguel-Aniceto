package br.com.miguel.ebac.memelandia_meme.client;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Configuration
@EnableFeignClients
@EnableDiscoveryClient
public class UserClient {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserClient.class);

    @Autowired
    private MemeUserClient memeUserClient;

    @FeignClient(name = "memelandia-users")
    interface MemeUserClient{

        @RequestMapping(value = "/users/{id}/findBy", method = RequestMethod.GET)
        @ResponseBody
        boolean findById(@PathVariable("id")String id);

    }

    public  boolean validaUser(String id){
        LOGGER.info("Procurando usuario pelo id: {}", id);
        return memeUserClient.findById(id);
    }
}
