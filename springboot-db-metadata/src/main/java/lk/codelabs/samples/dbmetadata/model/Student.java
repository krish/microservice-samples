package lk.codelabs.samples.dbmetadata.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {

    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String name;
}
