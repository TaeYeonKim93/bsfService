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
// @RequestMapping(value="/데이터집합")
@Transactional
public class 데이터집합Controller {

    @Autowired
    데이터집합Repository 데이터집합Repository;
}
//>>> Clean Arch / Inbound Adaptor
