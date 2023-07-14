/**
 * @author Andrés Segura - https://github.com/Andr7st
 * proyecto de prática spring boot persistencia.
 * */

package com.andr7st.sb.app.models.entity;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "products")
public class Product implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id // Indica que es la primary key
    @GeneratedValue(strategy = GenerationType.SEQUENCE) // sequence para postgresql, identity para mysql
    private Long Id;

    @Column(length = 128)
    private String name;

    @Column(unique = true)
    private String reference;

    @Temporal(TemporalType.DATE) // indica el formato en que se crean las fechas en la tabla
    private Date created;


    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
