package kotlin;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface getTotalSolvedMcq {
    String AudioAttributesCompatParcelizer() default "";

    int IconCompatParcelizer() default 2;

    int[] RemoteActionCompatParcelizer() default {};

    String read() default "";

    String write() default "";
}
