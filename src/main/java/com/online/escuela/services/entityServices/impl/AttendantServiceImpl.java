package com.online.escuela.services.entityServices.impl;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import com.online.escuela.model.entity.Attendant;
import com.online.escuela.model.entity.dto.AttendantDTO;
import com.online.escuela.repositories.jpa.AttendantRepositories;
import com.online.escuela.services.entityServices.AttendantService;



@Service
@RequiredArgsConstructor
public class AttendantServiceImpl implements AttendantService {

    private final AttendantRepositories attendantRepositories;

    @Override
    public List<AttendantDTO> findAll() {
        return attendantRepositories.findAll().stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<AttendantDTO> findById(Long id) {
        return attendantRepositories.findById(id)
                .map(this::convertToDTO);
    }


    
    @Override
    public AttendantDTO save(AttendantDTO attendantDTO) {
        attendantDTO.setRegistrationDate(LocalDateTime.now());
        Attendant attendant = convertToEntity(attendantDTO);
        return convertToDTO(attendantRepositories.save(attendant));
    }

    @Override
    public void deleteById(Long id) {
        attendantRepositories.deleteById(id);
    }

    private AttendantDTO convertToDTO(Attendant attendant) {
        return AttendantDTO.builder()
                .attendantId(attendant.getAttendantId())
                .relationship(attendant.getRelationship())
                .firstName(attendant.getFirstName())
                .lastName(attendant.getLastName())
                .identityDocument(attendant.getIdentityDocument())
                .dateOfBirth(attendant.getDateOfBirth())
                .gender(attendant.getGender())
                .maritalStatus(attendant.getMaritalStatus())
                .city(attendant.getCity())
                .address(attendant.getAddress())
                .isActive(attendant.isActive())
                .registrationDate(attendant.getRegistrationDate())
                .build();
    }

    private Attendant convertToEntity(AttendantDTO attendantDTO) {
        return Attendant.builder()
                .attendantId(attendantDTO.getAttendantId())
                .relationship(attendantDTO.getRelationship())
                .firstName(attendantDTO.getFirstName())
                .lastName(attendantDTO.getLastName())
                .identityDocument(attendantDTO.getIdentityDocument())
                .dateOfBirth(attendantDTO.getDateOfBirth())
                .gender(attendantDTO.getGender())
                .maritalStatus(attendantDTO.getMaritalStatus())
                .city(attendantDTO.getCity())
                .address(attendantDTO.getAddress())
                .isActive(attendantDTO.isActive())
                .registrationDate(attendantDTO.getRegistrationDate())
                .build();
    }
}
