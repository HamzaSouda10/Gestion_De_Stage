package Gestion.de.stage.Gestion.de.stage.mapper;

import Gestion.de.stage.Gestion.de.stage.Dto.UserDto;
import Gestion.de.stage.Gestion.de.stage.Entity.UtilisateurEntity;

public class UtilisateurMapper {
    // Convertir une entité en DTO
    public static UserDto toDto(UtilisateurEntity utilisateurEntity) {
        if (utilisateurEntity == null) {
            return null;
        }
        UserDto userDto = new UserDto();
        userDto.setId(utilisateurEntity.getId());
        userDto.setIdentifiant(utilisateurEntity.getIdentifiant());
        userDto.setRole(utilisateurEntity.getRole().name()); // Convertir l'énumération en String
        return userDto;
    }

    // Convertir un DTO en entité
    public static UtilisateurEntity toEntity(UserDto userDto) {
        if (userDto == null) {
            return null;
        }
        UtilisateurEntity utilisateurEntity = new UtilisateurEntity();
        utilisateurEntity.setId(userDto.getId());
        utilisateurEntity.setIdentifiant(userDto.getIdentifiant());
        utilisateurEntity.setRole(UtilisateurEntity.Role.valueOf(userDto.getRole())); // Convertir le String en énumération
        return utilisateurEntity;
    }

}
