package ru.sibit.warehouse.entity;


import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import ru.sibit.warehouse.entity.base.NamedEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@Table(name = "role", schema = "warehouse")
public class Role extends NamedEntity implements GrantedAuthority {
    @Transient
    @ManyToMany(mappedBy = "roles")
    private Set<User> users;

    public Role(Long id, String name) {
        this.setId(id);
        this.setName(name);
    }

    @Override
    public String getAuthority() {
        return this.getName();
    }
}
