package com.example.mongo.doctor.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@Document(collection = "doctors")


public class doctorModel {
    @Id
    private Long id;
    private String name;
    private String specialization;

        public Long getId(){ return id;}
        public doctorModel(Long id, String name, String specialization){
            this.id = id;
            this.name = name;
            this.specialization = specialization;
        }

    public void setId(Long id) {
        this.id = id;
    }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getSpecialization() { return specialization; }

}
