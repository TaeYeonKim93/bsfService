package bsf.infra;

import bsf.domain.*;
import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//<<< Clean Arch / Inbound Adaptor

@RestController
// @RequestMapping(value="/시각화지도")
@Transactional
public class 시각화지도Controller {

    @Autowired
    시각화지도Repository 시각화지도Repository;
}
//>>> Clean Arch / Inbound Adaptor
