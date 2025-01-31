package org.koreait.global.exceptions.scripts;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

/**
 * 예외 발생하면
 * alert('메세지');  -> target .. history.back()
 */
@Getter @Setter
public class AlertBackException extends AlertException {

    private String target;

    public AlertBackException(String message, HttpStatus status, String target) {
        super(message, status);

        this.target = target;
    }

    public AlertBackException(String message, HttpStatus status) {
        this(message, status, "self");
    }
}
