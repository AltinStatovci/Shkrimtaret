package com.shkrimtaret.mappers;

import com.shkrimtaret.dtos.ShkrimtariDto;
import com.shkrimtaret.models.Shkrimtari;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
@Component
public class ShkrimtariMapper {
    public Shkrimtari toEntity(ShkrimtariDto dto){
        Shkrimtari entity = new Shkrimtari();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setSurName(dto.getSurname());
        entity.setEmail(dto.getEmail());
        entity.setBirthdate(dto.getBirthdate());
        entity.setActive(dto.getActive());
        entity.setWritingStyle(dto.getWritingStyle());
        entity.setAverageRating(dto.getAverage());
        entity.setCreatedAt(LocalDateTime.now());
        return entity;
    }

    public ShkrimtariDto toDto(Shkrimtari entity){
        ShkrimtariDto dto = new ShkrimtariDto();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setSurname(entity.getSurName());
        dto.setEmail(entity.getEmail());
        dto.setBirthdate(entity.getBirthdate());
        dto.setActive(entity.getActive());
        dto.setWritingStyle(entity.getWritingStyle());
        dto.setAverage(entity.getAverageRating());
        return dto;
    }

}
