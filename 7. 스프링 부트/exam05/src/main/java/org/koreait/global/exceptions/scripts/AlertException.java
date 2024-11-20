package org.koreait.global.exceptions.scripts;

import org.koreait.global.exceptions.CommonException;
import org.springframework.http.HttpStatus;

/**
 * 예외가 발생하면 화면 이동이 아니라
 * alert('메세지')
 */
public class AlertException extends CommonException {
    public AlertException(String message, HttpStatus status) {
        super(message, status);
    }
}
