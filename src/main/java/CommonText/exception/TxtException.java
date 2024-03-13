package CommonText.exception;


public class TxtException extends RuntimeException {

    private String errMessage;

    public TxtException() {
        super();
    }

    public TxtException(String errMessage) {
        super(errMessage);
        this.errMessage = errMessage;
    }

    public String getErrMessage() {
        return errMessage;
    }

    public static void cast() {
        throw new TxtException("仅支持读取txt类型文件");
    }
}
