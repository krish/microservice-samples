package lk.codelabs.samples.dbmetadata.config;

import org.hibernate.boot.Metadata;
import org.hibernate.boot.model.relational.Database;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.hibernate.integrator.spi.Integrator;
import org.hibernate.service.spi.SessionFactoryServiceRegistry;
import org.springframework.stereotype.Component;


public class MetadataIntegrator implements Integrator {



    private static final MetadataIntegrator metadataIntegrator=new MetadataIntegrator();


    Database database;
    Metadata metadata;

    public Metadata getMetadata() {
        return metadata;
    }


    public static MetadataIntegrator getMetadataIntegrator(){
        return metadataIntegrator;
    }

    @Override
    public void integrate(Metadata metadata, SessionFactoryImplementor sessionFactoryImplementor, SessionFactoryServiceRegistry sessionFactoryServiceRegistry) {
        this.database = metadata.getDatabase();
        this.metadata = metadata;
    }

    @Override
    public void disintegrate(SessionFactoryImplementor sessionFactoryImplementor, SessionFactoryServiceRegistry sessionFactoryServiceRegistry) {

    }
}
