package com.example.mongo.doctor.controller;

import com.example.mongo.doctor.DoctorService.DoctorService;
import com.example.mongo.doctor.model.Response;
import com.example.mongo.doctor.model.doctorModel;
import com.example.mongo.doctor.repo.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/doctors")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;


    @PostMapping
    public ResponseEntity<Response<doctorModel>> adddoctors
            (@RequestBody doctorModel doctor) {
        doctorModel doctor1 = doctorService.adddoctor(doctor);
        Response<doctorModel> response = new Response<>(doctor1, "doctors added successfully", "OK");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity<List<doctorModel>> getAllDoctors() {
        List doctors = doctorService.getallDoctors();
        Response<List<doctorModel>> response = new Response<>(doctors, "doctors listed successfully", "OK");
        return new ResponseEntity<>(doctors,HttpStatus.OK);
    }
}
