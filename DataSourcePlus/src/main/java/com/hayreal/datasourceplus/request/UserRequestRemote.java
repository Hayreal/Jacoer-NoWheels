package com.hayreal.datasourceplus.request;


import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class UserRequestRemote {

    private List<Map<String,Object>> list;
}
