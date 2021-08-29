package pp.service;

import pp.models.Role;

import java.util.List;

public interface RoleService {
    List<Role> index();
    Role getRoleById(int id);
    Role getDefaultRole();
    Role getRoleByName(String name);
}
