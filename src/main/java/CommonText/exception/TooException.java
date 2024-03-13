package CommonText.exception;


public class TooException extends RuntimeException {


    private String errMessage;

    public TooException() {
        super();
    }

    public TooException(String errMessage) {
        super(errMessage);
        this.errMessage = errMessage;
    }

    public String getErrMessage() {
        return errMessage;
    }

    public static void cast() {
        throw new TooException("文本字符长度不能少于300字");
    }

}
