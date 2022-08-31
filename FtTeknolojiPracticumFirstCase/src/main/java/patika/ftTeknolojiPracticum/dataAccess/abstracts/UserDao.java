package patika.ftTeknolojiPracticum.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import patika.ftTeknolojiPracticum.entities.concretes.User;

public interface UserDao extends JpaRepository<User, Integer>{

}
