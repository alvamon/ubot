package org.ubot.api;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * 
 * @author Troy
 *
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface ScriptDetails {
	double version();
	String name();
	String description();
	String author(); 
}
