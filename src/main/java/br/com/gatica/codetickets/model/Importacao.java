package br.com.gatica.codetickets.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table
@Getter
@Setter
public class Importacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cpf;
    private String cliente;
    private LocalDate nascimento;
    private String evento;
    private LocalDate data;
    private String tipoIngresso;
    private Double valor;
    private LocalDateTime horaImportacao;
    private Double taxaAdm;

}
