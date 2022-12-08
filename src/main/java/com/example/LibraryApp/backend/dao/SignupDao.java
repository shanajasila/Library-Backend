package com.example.LibraryApp.backend.dao;

import com.example.LibraryApp.backend.model.Signup;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SignupDao extends CrudRepository<Signup,Integer> {

    @Query(value = "SELECT `id`, `address`, `adhaar`, `confirmpassword`, `dob`, `email`, `name`, `password`, `phoneno`, `pincode`, `username` FROM `signup` WHERE `username`= :username && `password`= :password",nativeQuery = true)
    List<Signup>signin(@Param("password")String password,@Param("username")String username);
}
