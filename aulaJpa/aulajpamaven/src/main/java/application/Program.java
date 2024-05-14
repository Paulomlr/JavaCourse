package application;

import dominio.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Program {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa"); // com essa linha, instaciamos com as configurações do persistence.xml
        EntityManager em = emf.createEntityManager(); // conexão com o banco de dados

        Pessoa p = em.find(Pessoa.class, 2); // recuperando dados do banco de dados através do id
        //System.out.println(p);
        em.getTransaction().begin();
        em.remove(p); // sempre que é uma operação que não seja uma simples consulta, tem que colocar transação, em.getTransaction()
        em.getTransaction().commit();

        System.out.println("Pronto!");
        em.close();
        emf.close();
    }
}
