package com.example;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by jessicatracy on 9/29/16.
 */
public interface PostRepository extends CrudRepository<Post, Integer> {

    Post findByMember(Member member);

}
