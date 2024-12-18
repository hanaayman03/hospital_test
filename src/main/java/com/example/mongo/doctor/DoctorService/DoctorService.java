package com.example.mongo.doctor.DoctorService;

import com.example.mongo.doctor.model.doctorModel;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class DoctorService {

    List<doctorModel> doctors= new ArrayList<>();
    DoctorService(){
        doctors.add(new doctorModel(1L, "Hana", "eye"));
        doctors.add(new doctorModel(2L, "Zeina", "dentist"));
        doctors.add(new doctorModel(3L, "Habiba", "cardiology"));
    }

    public List<doctorModel> getallDoctors(){
        return doctors;
    }

    public doctorModel adddoctor( doctorModel doctor){
        doctors.add(doctor);
        return doctor;
    }
}
//    DoctorRepository doctorRepository;
//
//    public doctorService(DoctorRepository doctorRepository) {
//        this.doctorRepository = doctorRepository;
//    }
//}
//public doctorModel saveDoctor(doctorModel doctorModel) {
//    return doctorRepository.save(doctorModel);
//}
//
//public List<doctorModel> getAllDoctors() {
//    return doctorrepository.findAll();
//}