package org.koreait.global.exceptions.scripts;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter @Setter
public class AlertRedirectException extends AlertException {

    private String url;
    private String target;

    public AlertRedirectException(String message, String url, HttpStatus status, String target) {
        super(message, status);
        this.url = url;
        this.target = target;
    }

    public AlertRedirectException(String message, String url, HttpStatus status) {
        this(message, url, status, "self"); // target의 기본값 self : 기준 - 현재창
    }
}
