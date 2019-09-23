package lk.codelabs.samples.dbmetadata.controller;

import lk.codelabs.samples.dbmetadata.model.Table;
import lk.codelabs.samples.dbmetadata.service.MetadataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MetadataController {


    @Autowired
    MetadataService metadataService;


    @RequestMapping("/metadata")
    public List<Table> metadata() {

        return metadataService.getMetadata();

    }

}
