package com.shkrimtaret.repositories;

import com.shkrimtaret.models.Shkrimtari;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShkrimtariRepositories extends JpaRepository<Shkrimtari,Long> {
}
