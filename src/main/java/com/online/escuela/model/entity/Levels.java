package com.online.escuela.model.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Levels  implements Serializable{


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long idLevels;
    private String levelDescription;
    private String shiftdescription;
}
