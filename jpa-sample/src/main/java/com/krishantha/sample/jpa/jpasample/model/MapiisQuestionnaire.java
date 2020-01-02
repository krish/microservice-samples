package com.krishantha.sample.jpa.jpasample.model;

import com.sun.corba.se.spi.ior.ObjectKey;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Krishantha Dinesh
 * krishantha@krishantha.com
 * www.krishantha.com
 * twitter @krishantha
 * on 20-December-2019 23:03
 * @Project jpa-sample
 */
@Entity
@Table(name = "MAPIIS_MM_DICT")
public class MapiisQuestionnaire {

    @Column(name = "questionnaire")
    String data;
    @Id
    @Column(name = "id_MAPIIS_MM_ID")
    int id;

 

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
