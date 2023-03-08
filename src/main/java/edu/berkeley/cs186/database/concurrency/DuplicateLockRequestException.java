https://tutorcs.com
WeChat: cstutorcs
QQ: 749389476
Email: tutorcs@163.com
package edu.berkeley.cs186.database.concurrency;

@SuppressWarnings("serial")
public class DuplicateLockRequestException extends RuntimeException {
    DuplicateLockRequestException(String message) {
        super(message);
    }
}

