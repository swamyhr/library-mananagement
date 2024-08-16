package library.man.app.library.utils;

public class ResponseObj {

    public int statusCode;
    public String statusMessage;

    public ResponseObj(int statusCode, String statusMessage) {
        this.statusCode = statusCode;
        this.statusMessage = statusMessage;
    }
}
