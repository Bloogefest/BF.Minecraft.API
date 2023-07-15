package com.bloogefest.minecraft.api.event;

import com.bloogefest.annotation.Experimental;
import com.bloogefest.annotation.NotNull;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @see Priority
 * @see Calling
 * @see Context
 * @see Type
 * @since 1.0.0-RC1
 */
@Experimental("1.0.0-RC3")
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD})
public @interface Subscribe {

    /**
     * @since 1.0.0-RC1
     */
    @Experimental("1.0.0-RC3") @NotNull Priority priority() default Priority.SECONDARY;

    /**
     * @since 1.0.0-RC1
     */
    @Experimental("1.0.0-RC9") @NotNull Calling calling() default Calling.SYNCHRONOUS;

    /**
     * @since 1.0.0-RC1
     */
    @Experimental("1.0.0-RC3") @NotNull Context context() default Context.NOT_CANCELLED;

    /**
     * @since 1.0.0-RC1
     */
    @Experimental("1.0.0-RC6") @NotNull Type type() default Type.ABSOLUTE;

    /**
     * @see Subscribe
     * @see Calling
     * @see Context
     * @see Type
     * @since 1.0.0-RC1
     */
    @Experimental("1.0.0-RC3") enum Priority {

        /**
         * @since 1.0.0-RC1
         */
        PRIMARY,

        /**
         * @since 1.0.0-RC1
         */
        SECONDARY,

        /**
         * @since 1.0.0-RC1
         */
        TERTIARY

    }

    /**
     * @see Subscribe
     * @see Priority
     * @see Context
     * @see Type
     * @since 1.0.0-RC1
     */
    @Experimental("1.0.0-RC9") enum Calling {

        /**
         * @since 1.0.0-RC1
         */
        SYNCHRONOUS,

        /**
         * @since 1.0.0-RC1
         */
        CONCURRENT,

        /**
         * @since 1.0.0-RC1
         */
        ASYNCHRONOUS

    }

    /**
     * @see Subscribe
     * @see Priority
     * @see Calling
     * @see Type
     * @since 1.0.0-RC1
     */
    @Experimental("1.0.0-RC3") enum Context {

        /**
         * @since 1.0.0-RC1
         */
        NOT_CANCELLED,

        /**
         * @since 1.0.0-RC1
         */
        CANCELLED,

        /**
         * @since 1.0.0-RC1
         */
        ANY

    }

    /**
     * @see Subscribe
     * @see Priority
     * @see Calling
     * @see Context
     * @since 1.0.0-RC1
     */
    @Experimental("1.0.0-RC6") enum Type {

        /**
         * @since 1.0.0-RC1
         */
        ABSOLUTE,

        /**
         * @since 1.0.0-RC1
         */
        RELATIVE,

        /**
         * @since 1.0.0-RC1
         */
        ANY

    }

}
