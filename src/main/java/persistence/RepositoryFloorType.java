package persistence;

import model.FloorType;
import util.DBUtil;

import javax.persistence.EntityManager;

public class RepositoryFloorType {
    private EntityManager em;

    public RepositoryFloorType() {
        this.em = DBUtil.getEntityManager();
    }

    public void saveFloorType(FloorType floorType) {
        try{
            this.em.getTransaction().begin();
            this.em.persist(floorType);
            this.em.getTransaction().commit();
        }catch (Exception e) {
            this.em.getTransaction().rollback();
        }
    }

    public void updateFloorType(FloorType floorType) {
        try{
            this.em.getTransaction().begin();
            this.em.merge(floorType);
            this.em.getTransaction().commit();
        }catch (Exception e) {
            this.em.getTransaction().rollback();
        }
    }

    public void deleteFloorType(FloorType floorType) {
        try {
            this.em.getTransaction().begin();
            this.em.remove(em.merge(floorType));
            this.em.getTransaction().commit();
        } catch (Exception e) {
            this.em.getTransaction().rollback();
        }
    }
}
