package com.example.Sriinduplacementcurd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Sriinduplacementcurd.entity.Placement;
import com.example.Sriinduplacementcurd.service.PlacementService;
@RestController
public class PlacementController {

 @Autowired
 private PlacementService pser;

 // Add placement
 @PostMapping("/addplacement")
 public Placement addPlacement(@RequestBody Placement place) {
     return pser.addPlacement(place);
 }

 // Get all placements
 @GetMapping("/getplacements")
 public List<Placement> getAllPlacements() {
     return pser.getAllPlacements();
 }

 // Update placement
 @PutMapping("/updateplacement")
 public Placement updatePlacement(@RequestBody Placement place) {
     return pser.updatePlacement(place);
 }

 // Delete placement
 @DeleteMapping("/deleteplacement/{id}")
 public void deletePlacement(@PathVariable Long id) {
     pser.deletePlacement(id);
 }
}