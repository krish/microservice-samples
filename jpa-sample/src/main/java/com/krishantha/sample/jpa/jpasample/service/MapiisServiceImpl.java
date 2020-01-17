package com.krishantha.sample.jpa.jpasample.service;

import com.krishantha.sample.jpa.jpasample.model.MapiisQuestionnaire;
import com.krishantha.sample.jpa.jpasample.repository.MapiisRepisitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public MapiisQuestionnaire findall(){
        Optional<MapiisQuestionnaire> mapiisQuestionnaire = repisitory.findById(12345678);


      if(mapiisQuestionnaire.isPresent()){
          String [] values=mapiisQuestionnaire.get().getData().split("\\n");

          for (String s:values){
              System.out.println(s);
              if (s.substring(0,1).equals("7")){

                 try {
                     System.out.println("HL8---------------------------");
                     System.out.println(s.substring(1,1+15).trim());
                     System.out.println(s.substring(16,16+12).trim());
                     System.out.println(s.substring(28,28+25).trim());
                     System.out.println(s.substring(53,53+1).trim());
                     System.out.println("---------------------------");
                 }catch (IndexOutOfBoundsException ie){
                     continue;
                 }


              }
          }

      }





        return mapiisQuestionnaire.get();
    }

}
