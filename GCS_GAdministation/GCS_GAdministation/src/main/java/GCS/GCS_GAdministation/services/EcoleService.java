package GCS.GCS_GAdministation.services;

import GCS.GCS_GAdministation.repository.EcoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EcoleService {

    @Autowired
    private EcoleRepository ecoleRepository;

}
