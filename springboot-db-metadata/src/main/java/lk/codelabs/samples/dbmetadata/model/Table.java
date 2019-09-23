package lk.codelabs.samples.dbmetadata.model;

import java.util.List;

public class Table {

    private String tableName;
    private String tableMask;
    private List<Column> metaData;

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getTableMask() {
        return tableMask;
    }

    public void setTableMask(String tableMask) {
        this.tableMask = tableMask;
    }

    public List<Column> getMetaData() {
        return metaData;
    }

    public void setMetaData(List<Column> metaData) {
        this.metaData = metaData;
    }
}