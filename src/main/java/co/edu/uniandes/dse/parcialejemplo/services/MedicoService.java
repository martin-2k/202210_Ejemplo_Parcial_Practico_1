package co.edu.uniandes.dse.parcialejemplo.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.uniandes.dse.parcialejemplo.entities.MedicoEntity;
import co.edu.uniandes.dse.parcialejemplo.repositories.MedicoRepository;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class MedicoService {
    @Autowired
	MedicoRepository medicoRepository;

    @Transactional
	public List<MedicoEntity> getMedicos() {
		log.info("Inicia proceso de consultar todos los medicos");
		return medicoRepository.findAll();
	}

}
