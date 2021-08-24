package pp.dao;

import org.springframework.stereotype.Repository;
import pp.models.User;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;


@Repository
@Transactional
public class UserDAOImpl implements UserDAO {

    @PersistenceContext
    EntityManager em;

    @Override
    @Transactional
    public List<User> index() {
        return em.createQuery("SELECT u FROM User u", User.class)
                .getResultList();
    }

    @Override
    public void save(User user) {
        em.persist(user);
    }

    @Override
    public User show(int id) {
        return em.find(User.class, id);
    }

    @Override
    public void update(int id, User updatedUser) {
        User userToBeUpdated = em.find(User.class, id);

        userToBeUpdated.setName(updatedUser.getName());
        userToBeUpdated.setAge(updatedUser.getAge());
        userToBeUpdated.setEmail(updatedUser.getEmail());

    }

    @Override
    public void delete(int id) {
        em.remove(em.find(User.class, id));
    }
}
