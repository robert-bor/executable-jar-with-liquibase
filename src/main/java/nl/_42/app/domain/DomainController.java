package nl._42.app.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/domains")
public class DomainController {

    @Autowired
    private DomainService domainService;

    @RequestMapping
    public Collection<Domain> fetch() {
        return domainService.fetch();
    }

}
