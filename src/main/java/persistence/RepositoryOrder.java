package persistence;

import model.Order;
import util.DBUtil;

import javax.persistence.EntityManager;
import java.sql.Date;

public class RepositoryOrder {

    private EntityManager em;

    public RepositoryOrder() {
        this.em = DBUtil.getEntityManager();
    }

    public void saveOrder(Order order) {
        try{
            this.em.getTransaction().begin();
            this.em.persist(order);
            this.em.getTransaction().commit();
        }catch (Exception e) {
            this.em.getTransaction().rollback();
        }
    }

    public void updateOrder(Order order) {
        try{
            this.em.getTransaction().begin();
            this.em.merge(order);
            this.em.getTransaction().commit();
        }catch (Exception e) {
            this.em.getTransaction().rollback();
        }
    }

    public void updateDeliveryOfOrder(int orderId, Date newDeliveryDate) {
        String sql = "UPDATE Order SET deliveryDate = :nDeliveryDate WHERE orderId = :orderId";
        this.em.getTransaction().begin();

        int result = em.createQuery(sql)
                .setParameter("nDeliveryDate", newDeliveryDate)
                .setParameter("orderId", orderId)
                .executeUpdate();

        this.em.getTransaction().commit();
        if(result > 0) {
            System.out.println("New delivery date was set for order Nr " + orderId);
        }
    }

    public void deleteOrder(Order order) {
        try {
            this.em.getTransaction().begin();
            this.em.remove(em.merge(order));
            this.em.getTransaction().commit();
        } catch (Exception e) {
            this.em.getTransaction().rollback();
        }
    }
}
