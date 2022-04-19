package cat.itacademy.barcelonactiva.garcia.sara.s05.t01.n01.model;

import javax.persistence.*;

@Entity
@Table (name = "sucursal")
public class Sucursal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private int pk_SucursalID;

    @Column (name = "nom_sucursal")
    private String nomSucursal;

    @Column (name = "pais_sucursal")
    private String paisSucursal;
}
