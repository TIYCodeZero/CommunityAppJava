package com.example;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by jessicatracy on 9/29/16.
 */
public interface MemberEventRepository extends CrudRepository<MemberEvent, Integer> {
    MemberEvent findByEventId(int eventId);
}
