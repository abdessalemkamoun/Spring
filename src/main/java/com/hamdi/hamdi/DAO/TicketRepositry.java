package com.hamdi.hamdi.DAO;

import com.hamdi.hamdi.Model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TicketRepositry extends JpaRepository<Ticket,Long> {
    
}
