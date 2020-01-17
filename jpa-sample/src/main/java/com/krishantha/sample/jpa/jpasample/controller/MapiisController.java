package com.krishantha.sample.jpa.jpasample.controller;

import com.krishantha.sample.jpa.jpasample.model.MapiisQuestionnaire;
import com.krishantha.sample.jpa.jpasample.service.MapiisServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Krishantha Dinesh
 * krishantha@krishantha.com
 * www.krishantha.com
 * twitter @krishantha
 * on 20-December-2019 23:09
 * @Project jpa-sample
 */
@RestController
public class MapiisController {

    @Autowired
    MapiisServiceImpl mapiisService;


    @RequestMapping("/get")
    public MapiisQuestionnaire findAll(){
       return mapiisService.findall();
    }


}
