package persistence;

import model.FloorType;
import model.WallType;
import util.DBUtil;

import javax.persistence.EntityManager;

public class RepositoryWallType {
    private EntityManager em;

    public RepositoryWallType() {
        this.em = DBUtil.getEntityManager();
    }

    public void saveWallType(WallType wallType) {
        try{
            this.em.getTransaction().begin();
            this.em.persist(wallType);
            this.em.getTransaction().commit();
        }catch (Exception e) {
            this.em.getTransaction().rollback();
        }
    }

    public void updateWallType(WallType wallType) {
        try{
            this.em.getTransaction().begin();
            this.em.merge(wallType);
            this.em.getTransaction().commit();
        }catch (Exception e) {
            this.em.getTransaction().rollback();
        }
    }

    public void deleteWallType(WallType wallType) {
        try {
            this.em.getTransaction().begin();
            this.em.remove(em.merge(wallType));
            this.em.getTransaction().commit();
        } catch (Exception e) {
            this.em.getTransaction().rollback();
        }
    }
}