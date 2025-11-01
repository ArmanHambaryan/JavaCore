package homework.employee.exception;

public class ThisIDNotEmployeeException extends Exception {
    public ThisIDNotEmployeeException() {
    }

    public ThisIDNotEmployeeException(String message) {
        super(message);
    }

    public ThisIDNotEmployeeException(String message, Throwable cause) {
        super(message, cause);
    }

    public ThisIDNotEmployeeException(Throwable cause) {
        super(cause);
    }

    public ThisIDNotEmployeeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
