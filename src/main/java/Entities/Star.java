package Entities;

public class Star {
    private int _id;
    private String _name;
    private float _atitude;
    private float _longitude;
    private int _type;

    public int getId(){
        return _id;
    }

    public void setId(int id){
        this._id = id;
    }


    public String getName(){
        return _name;
    }
    public void setName(String name){
        this._name = name;
    }

    public float getAtitude(){
        return _atitude;
    }
    public void setAtitude(float atitude){
        this._atitude = atitude;
    }

    public float getLongitude(){
        return _longitude;
    }
    public void setLongitude(float longitude){
        this._longitude = longitude;
    }

    public int getType(){
        return _type;
    }
    public void setType(int type){
        this._type = type;
    }

}