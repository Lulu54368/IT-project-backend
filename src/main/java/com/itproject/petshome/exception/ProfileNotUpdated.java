package com.itproject.petshome.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.UNAUTHORIZED, reason = "You have to completed your profile")
public class ProfileNotUpdated extends Exception{
}
