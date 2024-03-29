package cl.ufro.ayudantia.spring.data.modelo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

       

@Entity
@Table(name = "asd_ciudadanos")
public class Ciudadano implements Serializable {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

@Column (name = "Ciu_nombres")
    private String nombres;

@Column (name ="Ciu_apellidos")
    private String apellidos;

@ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "asd_ciudad_id", nullable = false)
    private Ciudad ciudad;

    public Ciudadano(Long id, String nombres, String apellidos) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    public Ciudadano() {
        
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    

}
