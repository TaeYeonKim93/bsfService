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
// @RequestMapping(value="/ai모형")
@Transactional
public class Ai모형Controller {

    @Autowired
    Ai모형Repository ai모형Repository;
}
//>>> Clean Arch / Inbound Adaptor
