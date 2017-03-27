package com.erpsom.service;

import com.erpsom.domain.Paciente;
import com.erpsom.domain.QPaciente;
import com.erpsom.repository.PacienteRepository;
import com.google.common.collect.Lists;
import com.querydsl.core.types.OrderSpecifier;
import com.querydsl.core.types.Predicate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

/**
 * Created by HMO SmartClinic Ninja Development Team on 10/10/16.
 */

@Service
public class PacienteService {

    @Autowired
    PacienteRepository pacienteRepository;

    public List<Paciente> getPacientesCumplenHoy(){
        LocalDateTime localDateTime = LocalDateTime.now();
        QPaciente qPaciente = QPaciente.paciente;
        Predicate predicate = qPaciente.nacimiento.month().eq(localDateTime.getMonth().getValue())
                .and(qPaciente.nacimiento.dayOfMonth().eq(localDateTime.getDayOfMonth()));
        OrderSpecifier<Date> orderingSpecification = qPaciente.nacimiento.asc();
        List<Paciente> pacienteList = Lists.newArrayList(pacienteRepository.findAll(predicate,orderingSpecification));
        return pacienteList;
    }

    public List<Paciente> getPacienteByValue(String searchValue){
        QPaciente qPaciente = QPaciente.paciente;
        Predicate predicate = qPaciente.apellidoPaterno.like("%"+searchValue+"%")
                .or(qPaciente.apellidoMaterno.like("%"+searchValue+"%"))
                .or(qPaciente.nombres.like("%"+searchValue+"%"))
                .or(qPaciente.nombreCompleto.like("%"+searchValue+"%"));
        OrderSpecifier<String> orderSpecifier = qPaciente.nombres.asc();
        List<Paciente> pacienteList = Lists.newArrayList(pacienteRepository.findAll(predicate, orderSpecifier));
        return pacienteList;
    }
}
