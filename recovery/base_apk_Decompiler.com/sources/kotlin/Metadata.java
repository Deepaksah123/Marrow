package kotlin;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0019\b\u0087\u0002\u0018\u00002\u00020\u0001B\\\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002R\u0011\u0010\u0010\u001a\u00020\u00028\u0007¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0013\u001a\u00020\u00048\u0007¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0015\u001a\u00020\u00048\u0007¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0007¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0007¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\u001d\u001a\u00020\b8\u0007¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001f\u001a\u00020\b8\u0007¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001cR\u0011\u0010!\u001a\u00020\u00028\u0007¢\u0006\u0006\u001a\u0004\b \u0010\u000f"}, d2 = {"Lkotlin/Metadata;", "", "", "p0", "", "p1", "p2", "", "", "p3", "p4", "p5", "p6", "p7", "k", "()I", "kind", "mv", "()[I", "metadataVersion", "bv", "bytecodeVersion", "d1", "()[Ljava/lang/String;", "data1", "d2", "data2", "xs", "()Ljava/lang/String;", "extraString", "pn", "packageName", "xi", "extraInt"}, k = 1, mv = {2, 2, 0}, xi = 48)
public @interface Metadata {
    int[] bv() default {1, 0, 3};

    String[] d1() default {};

    String[] d2() default {};

    int k() default 1;

    int[] mv() default {};

    String pn() default "";

    int xi() default 0;

    String xs() default "";
}
