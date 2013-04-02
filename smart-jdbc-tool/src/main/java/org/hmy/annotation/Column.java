package org.hmy.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface Column {

	String name() default "";

	boolean nullable() default true;

	boolean insertable() default true;

	boolean updatable() default true;
}
