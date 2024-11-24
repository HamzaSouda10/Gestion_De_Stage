package Gestion.de.stage.Gestion.de.stage.Entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "utilisateur")
public class UtilisateurEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(unique = true,nullable = false)
    private String identifiant;

    @Column(nullable = false)
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;

    public enum Role{
        ADMIN,
        ETUDIANT,
        ENTREPRISE,
        RESPONSABLE,
        ECOLE
    }
}
