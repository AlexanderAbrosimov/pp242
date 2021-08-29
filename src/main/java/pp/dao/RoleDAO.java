package pp.dao;

import pp.models.Role;

import java.util.List;

public interface RoleDAO {

    List<Role> index();
    Role getRoleById(int id);
    Role getDefaultRole();
    Role getRoleByName(String name);

}
