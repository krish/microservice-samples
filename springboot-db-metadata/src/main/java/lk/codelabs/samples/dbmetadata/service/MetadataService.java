package lk.codelabs.samples.dbmetadata.service;

import lk.codelabs.samples.dbmetadata.config.MetadataIntegrator;
import lk.codelabs.samples.dbmetadata.model.Column;
import lk.codelabs.samples.dbmetadata.model.Table;
import org.hibernate.boot.model.relational.Database;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MetadataService {


    public List<Table> getMetadata() {


        Database database = MetadataIntegrator.getMetadataIntegrator().getMetadata().getDatabase();

        List<Table> metadata = new ArrayList<>();

        database.getDefaultNamespace().getTables().stream().forEach(t -> {

            Table table = new Table();
            table.setTableName(t.getName());
            List<Column> columns = new ArrayList<>();

            Iterator<org.hibernate.mapping.Column> columnIterator = t.getColumnIterator();
            List<String> pks = t.getPrimaryKey().getColumns().stream().map(c -> c.getName()).collect(Collectors.toList());




            while (columnIterator.hasNext()) {
                Column tcolumn = new Column();
                org.hibernate.mapping.Column column = columnIterator.next();
                tcolumn.setName(column.getName());
                tcolumn.setUnique(column.isUnique());
                tcolumn.setNullable(column.isNullable());
                tcolumn.setPrimatyKey((pks.contains(tcolumn.getName()) ? true : false));
                tcolumn.setSize(column.getLength());
                tcolumn.setType(column.getSqlType());
                columns.add(tcolumn);

            }
            table.setMetaData(columns);

            metadata.add(table);


        });
        return metadata;

    }


}
