package cat.itacademy.barcelonactiva.garcia.sara.s05.t01.n01.model;

import javax.persistence.*;

@Entity
@Table(name = "sucursal")
public class Sucursal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private int pk_SucursalID;

    @Column (name = "nom_sucursal")
    private String nomSucursal;

    @Column (name = "pais_sucursal")
    private String paisSucursal;

    public Sucursal (){

    }
    public Sucursal(String nom, String pais){
        nomSucursal=nom;
        paisSucursal=pais;
    }



    public int getPk_SucursalID() {
        return pk_SucursalID;
    }
    public void setPk_SucursalID(int pk_SucursalID) {
        this.pk_SucursalID = pk_SucursalID;
    }
    public String getNomSucursal() {
        return nomSucursal;
    }
    public void setNomSucursal(String nomSucursal) {
        this.nomSucursal = nomSucursal;
    }
    public String getPaisSucursal() {
        return paisSucursal;
    }
    public void setPaisSucursal(String paisSucursal) {
        this.paisSucursal = paisSucursal;
    }


}
