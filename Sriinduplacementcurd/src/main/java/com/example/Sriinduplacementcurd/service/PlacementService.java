package com.example.Sriinduplacementcurd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Sriinduplacementcurd.entity.Placement;
import com.example.Sriinduplacementcurd.repository.PlacementRepo;
@Service
public class PlacementService {

	    @Autowired
	    private PlacementRepo prepo;

	    // Insert data
	    public Placement addPlacement(Placement place) {
	        return prepo.save(place);
	    }

	    // Get all data
	    public List<Placement> getAllPlacements() {
	        return prepo.findAll();
	    }

	    // Update data
	    // Example: update Placement set qualification = "B.Tech" where id = 101;
	    public Placement updatePlacement(Placement place) {
	        Long id = place.getPid();  // get ID from input
	        Placement p1 = prepo.findById(id).get();  // fetch existing record

	        // Set new values
	        p1.setPname(place.getPname());
	        p1.setPdate(place.getPdate());
	        p1.setPqualification(place.getPqualification());
	        p1.setPyear(place.getPyear());

	        return prepo.save(p1);  // save updated record
	    }

	    // Delete data
	    public void deletePlacement(Long id) {
	        prepo.deleteById(id);
	    }
	}


