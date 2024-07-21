package com.sm.userProfile.repositories;

import com.sm.userProfile.entities.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface UserProfileRepository  extends JpaRepository<UserProfile,Long> {

}
