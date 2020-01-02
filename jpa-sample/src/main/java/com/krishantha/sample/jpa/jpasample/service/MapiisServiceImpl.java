package com.krishantha.sample.jpa.jpasample.service;

import com.krishantha.sample.jpa.jpasample.model.MapiisQuestionnaire;
import com.krishantha.sample.jpa.jpasample.repository.MapiisRepisitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Krishantha Dinesh
 * krishantha@krishantha.com
 * www.krishantha.com
 * twitter @krishantha
 * on 20-December-2019 23:06
 * @Project jpa-sample
 */
@Service
public class MapiisServiceImpl {

    @Autowired
    MapiisRepisitory repisitory;

    public List<MapiisQuestionnaire> findall(){
        List<MapiisQuestionnaire> questionnaires= repisitory.findAll();


        for(MapiisQuestionnaire questionnaire: questionnaires ){

            String [] values=questionnaire.getData().split("\\n");
            System.out.println("numer of items :"+values.length);
        }


        return questionnaires;
    }

}
