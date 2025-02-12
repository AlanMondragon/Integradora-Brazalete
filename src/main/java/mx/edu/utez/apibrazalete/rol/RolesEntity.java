package mx.edu.utez.apibrazalete.rol;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection =  "rol")
public class RolesEntity {

    private String id;
    private String rol;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRole() {
        return rol;
    }

    public void setRole(String role) {
        this.rol = role;
    }
}
