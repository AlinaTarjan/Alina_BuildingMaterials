package persistence;

import model.Room;
import util.DBUtil;

import javax.persistence.EntityManager;

public class RepositoryRoom {
    private EntityManager em;

    public RepositoryRoom() {
        this.em = DBUtil.getEntityManager();
    }

    public void saveRoom(Room room) {
        try{
            this.em.getTransaction().begin();
            this.em.persist(room);
            this.em.getTransaction().commit();
        }catch (Exception e) {
            this.em.getTransaction().rollback();
        }
    }

    public void updateRoom(Room room) {
        try{
            this.em.getTransaction().begin();
            this.em.merge(room);
            this.em.getTransaction().commit();
        }catch (Exception e) {
            this.em.getTransaction().rollback();
        }
    }

    public void deleteRoom(Room room) {
        try {
            this.em.getTransaction().begin();
            this.em.remove(em.merge(room));
            this.em.getTransaction().commit();
        } catch (Exception e) {
            this.em.getTransaction().rollback();
        }
    }
}
