package com.example.mongo.doctor.repo;

import com.example.mongo.doctor.model.doctorModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

public interface DoctorRepository extends MongoRepository <doctorModel, Integer> {
}
