package nl._42.app.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class DomainService {

    @Autowired
    private DomainRepository domainRepository;

    @PostConstruct
    public void populate() {
        Domain domain = new Domain();
        domain.setName("Only record");
        domainRepository.save(domain);
    }

    public List<Domain> fetch() {
        return domainRepository.findAll();
    }

}
