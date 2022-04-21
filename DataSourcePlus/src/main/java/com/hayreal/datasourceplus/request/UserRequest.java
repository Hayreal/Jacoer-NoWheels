package com.hayreal.datasourceplus.request;

import lombok.Data;

import java.util.List;
import java.util.Map;


@Data
public class UserRequest {
    private List<Map<String,Object>> list;

}
