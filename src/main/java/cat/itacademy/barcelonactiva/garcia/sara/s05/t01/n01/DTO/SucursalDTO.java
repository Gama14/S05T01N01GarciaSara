package cat.itacademy.barcelonactiva.garcia.sara.s05.t01.n01.DTO;

import javax.persistence.*;
import java.util.*;
import java.util.List;

@Entity
@Table(name = "sucursal")
public class SucursalDTO {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private int pk_SucursalID;
    @Column (name = "nom_sucursal")
    private String nomSucursal;
    @Column (name = "pais_sucursal")
    private String paisSucursal;
    @Column (name = "tipus_sucursal")
    private String tipusSucursal;
    public SucursalDTO (){

    }
    public SucursalDTO(String nom, String pais){
        nomSucursal=nom;
        paisSucursal=pais;
        tipusSucursal=comprovacioUE();


    }
    String a[]
            = new String[] { "alemanya", "austria", "belgica", "bulgaria","xipre", "croacia","dinamarca","eslovenia",
            "espanya", "estonia","finlandia", "frança", "grecia", "hungria","irlanda","italia", "letonia", "lituania",
            "luxebmurg", "malta","paisos baixos","polonia","portugal", "republica txeca", "republica eslovaca", "rumania", "suecia" };
    List<String> UE = Arrays.asList(a);



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
    public String getTipusSucursal() {
        return tipusSucursal;
    }
    public void setTipusSucursal(String tipusSucursal) {
        this.tipusSucursal = tipusSucursal;}

    public String comprovacioUE (){
        String comprovacioUE = "foraUE";
        int size = UE.size();
        for (int i =0; i<size;i++){
            if(paisSucursal.equalsIgnoreCase(UE.get(i))){
                comprovacioUE="dinsUE";
            }
        }
        return comprovacioUE;
    }


}
