package cat.itacademy.barcelonactiva.garcia.sara.s05.t01.n01.DTO;

import javax.persistence.*;
import java.util.*;
import java.util.List;


public class SucursalDTO {

   
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomSucursal;
    private String paisSucursal;
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



    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
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
