package emisof.fotos.Entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor public class Foto
{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String nombre;
    String mimeType;
    @Lob
    String fotoBase64;

    public Foto()
    {
    }

    public Foto(String nombre, String mimeType, String fotoBase64)
    {
        this.nombre = nombre;
        this.mimeType = mimeType;
        this.fotoBase64 = fotoBase64;
    }
}

