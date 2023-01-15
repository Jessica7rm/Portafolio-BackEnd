
package com.backend.jk_portfolio.Security.service;

import com.backend.jk_portfolio.Security.entity.Rol;
import com.backend.jk_portfolio.Security.enums.RolNombre;
import com.backend.jk_portfolio.Security.repository.iRolRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
@Transactional
public class RolService {
     @Autowired
    iRolRepository irolRepository;

    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return irolRepository.findByRolNombre(rolNombre);
    }
    public void save(Rol rol){
        irolRepository.save(rol);
    }
}
