package com.es2.singleton;
public class Registry{

    private Registry() {}
    private String _path = null;
    private String _connectionString = null;
    private static Registry instance = new Registry();

    public static Registry getInstance(){
        if(instance == null){
            instance = new Registry();
        }
        return instance;
    }

    public String getPath(){
        return _path;
    }

    public void setPath(String path){
        this._path = path;
    }

    public String getConnectionString(){
        return _connectionString;
    }

    public void setConnectionString(String connectionString){
        this._connectionString = connectionString;
    }

}
