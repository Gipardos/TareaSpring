
package cl.ufro.ayudantia.spring.data.modelo;

import cl.ufro.ayudantia.spring.data.modelo.Ciudadano;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


    
@Entity
@Table(name="asd_cuidades")
public class Ciudad  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="ciu_nombre")
    private String nombre;
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "ciudad")
    private Set<Ciudadano> ciudadanos = new HashSet<>();

    public Ciudad(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
     public Set<Ciudadano> getCiudadanos() {
        return ciudadanos;
    }

    public void setCiudadanos(Set<Ciudadano> ciudadanos) {
        this.ciudadanos = ciudadanos;
    }
    
    
}

    

