package com.hayreal.datasourceplus;

import com.hayreal.datasourceplus.request.UserRequest;
import com.hayreal.datasourceplus.request.UserRequestRemote;
import com.hayreal.datasourceplus.servive.BatchService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class DataSourcePlusApplicationTests {

    @Autowired
    private BatchService batchService;

    @Test
    void contextLoads() {
    }


    @Test
    public void testDemo() {

        ArrayList<Map<String, Object>> list = new ArrayList<>(10);

        for (int i = 0; i < 10; i++) {
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put("age", Math.random());
            hashMap.put("name", "name" + Math.random());
            hashMap.put("password", "password" + Math.random());
            hashMap.put("email", "email" + Math.random());
            hashMap.put("phone", "phone" + Math.random());
            list.add(hashMap);
        }


        UserRequest request = new UserRequest();
        request.setList(list);
        UserRequestRemote remote = new UserRequestRemote();
        BeanUtils.copyProperties(request,remote);
        batchService.insertUserBatch(remote);
    }
}
