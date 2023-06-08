package com.bosonit.formacion.block17springbatch.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Setter
@Getter
public class TiempoErrorCorregido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTiempoError;
    private String localidad;
    @Temporal(TemporalType.DATE)
    private Date fecha;
    private Integer temperatura;

    @OneToOne
    private Tiempo tiempo;
}

