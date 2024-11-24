package Gestion.de.stage.Gestion.de.stage.Dto;

import lombok.Data;

@Data
public class UserDto {

    private long id;
    private String identifiant;
    private String role;  // Le rôle est un String pour représenter les différentes valeurs (ADMIN, ETUDIANT, etc.)

}

