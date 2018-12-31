package com.ezlo.automation.framework.helpers;

import com.ezlo.automation.framework.common_baby.Constants;
import com.ezlo.automation.framework.model.ezlo.EzlosData;
import com.ezlo.automation.framework.model.ezlo.Ezlos;
import com.ezlo.automation.framework.model.ezlo.UserData;
import com.ezlo.automation.framework.model.ezlo.Users;
import com.ezlo.automation.framework.model.ezlo.collections.FWUC_IOSTemplates;
import com.ezlo.automation.framework.model.ezlo.data.FWUC_TemplateIOSData;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

import java.util.Collection;

public class NoSQLDBHelper extends BaseHelper {
    private static Morphia morphia = new Morphia();
    private static Datastore ds = null;

    static  {
        try {
            String host = Constants.getProperties().getProperty("noSqlHost");
            int port = Integer.parseInt(Constants.getProperties().getProperty("noSqlPort"));
            MongoClient mongo = new MongoClient(host, port);
            ds = morphia.createDatastore(mongo, Constants.getProperties().getProperty("noSqlDBName"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addItem(Object obj) {
        ds.save(obj);
    }

    public void addItems(Collection<Object> objs) {
        ds.save(objs);
    }

    public void deleteItem(Object obj) {
        ds.delete(obj);
    }

    public void deleteItems(Collection<Object> ezlos) {
        ds.delete(ezlos);
    }

    public boolean isExist(Object obj){
        return ds.find(obj.getClass()).asList().contains(obj);
    }

    public Ezlos ezlos() {
        return new Ezlos(ds.find(EzlosData.class).asList());
    }

    public Users users() {
        return new Users(ds.find(UserData.class).asList());
    }

    public FWUC_IOSTemplates FWUC_TemplateIOSes(){
        return new FWUC_IOSTemplates(ds.find(FWUC_TemplateIOSData.class).asList());
    }

    public void clearUserCollection() {
        DBCollection users = ds.getCollection(UserData.class);
        users.drop();
    }

    private void clearTableByInstance(Object obj){
        ds.delete(obj);
    }

    public void clearEzloCollection() {
        ds.getCollection(EzlosData.class).drop();
    }

    public EzlosData getEzloByField(String field, String contains) {
        return ds.find(EzlosData.class).field(field).equal(contains).get();
    }

    public UserData getUserByField(String field, String contains) {
        return ds.find(UserData.class).field(field).equal(contains).get();
    }

    public boolean isUserExistByField(String field, String contains) {
        return ds.find(UserData.class).field(field).equal(contains).get() != null;
    }

    public boolean isEzloExistByField(String field, String contains) {
        return ds.find(EzlosData.class).field(field).equal(contains).get() != null;
    }
}
