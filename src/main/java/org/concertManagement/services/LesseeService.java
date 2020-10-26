package org.concertManagement.services;

import org.concertManagement.entities.Lessee;
import org.concertManagement.repo.LesseeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class LesseeService {
    final private LesseeRepository lesseeRepository;

    @Autowired
    public LesseeService(LesseeRepository lesseeRepository){
        this.lesseeRepository = lesseeRepository;
    }

    @Transactional
    public void addLessee(Lessee lessee){
        lesseeRepository.save(lessee);
    }

    @Transactional
    public void deleteLessee(Lessee lessee){
        lesseeRepository.delete(lessee);
    }
}
