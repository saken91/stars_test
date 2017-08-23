package Entities;


public class JsonResponse {

    private JsonResponse() { }

    public JsonResponse(int code, String description) {
        this._code = code;
        this._description = description;
    }

    public JsonResponse(int code, String description, Object data) {
        this._code = code;
        this._description = description;
        this._data = data;
    }

    private int _code;
    private String _description;
    private Object _data;

    public int getCode(){
        return _code;
    }

    public int setCode(int code){
        this._code = code;
        return _code;
    }

    public String getDescription(){
        return _description;
    }

    public String setDescription(String description){
        this._description = description;
        return _description;
    }

    public Object getData() {
        return _data;
    }

    public Object setData(Object data){
        this._data = data;
        return _data;
    }


}