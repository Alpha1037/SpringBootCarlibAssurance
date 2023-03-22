package com.openclassrooms.dataLayer.repository;

import com.openclassrooms.dataLayer.model.Comment;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends CrudRepository<Comment,Integer> {

    public Iterable<Comment> findByContentContaining(String expression);

}
