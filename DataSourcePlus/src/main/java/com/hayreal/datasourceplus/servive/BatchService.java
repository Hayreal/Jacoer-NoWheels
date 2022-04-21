package com.hayreal.datasourceplus.servive;


import com.hayreal.datasourceplus.mapper.BatchMapper;
import com.hayreal.datasourceplus.request.UserRequestRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class BatchService {

    @Autowired
    private BatchMapper batchMapper;


    public void insertUserBatch(UserRequestRemote userRequestRemote){


        batchMapper.batchInsert(userRequestRemote.getList());

    }
}
