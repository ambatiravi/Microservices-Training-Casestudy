package com.example.Book.Library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.Book.Library.entity.Subscription;

@Repository
public interface SubscriptionRepository extends JpaRepository<Subscription, Integer>{
	
	/*@Query(value = "select * from Subscription where subscriptionname = :subscriptionname", nativeQuery = true)
	Subscription getSubscribByusingName(@Param(value = "subscriptionname") String subscriptionname);

*/}
