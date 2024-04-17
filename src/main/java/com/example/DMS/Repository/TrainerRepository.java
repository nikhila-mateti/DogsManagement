package com.example.DMS.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.DMS.Models.Dog;
import com.example.DMS.Models.Trainer;

public interface TrainerRepository extends CrudRepository<Trainer, Integer>{

}
