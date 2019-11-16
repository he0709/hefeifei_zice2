package com.hefeifei.service;

import com.hefeifei.vo.TPSVo;
import org.springframework.data.domain.Page;

public interface MyService {
    Page getList(TPSVo tpsVo);
}
