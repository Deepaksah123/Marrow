package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0007X\u0086\u000e¢\u0006\f\n\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\n\u001a\u0004\u0018\u00010\u00018\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b\n\u0010\u000b\"\u0004\b\u0007\u0010\fR\u001a\u0010\u000e\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010"}, d2 = {"Lo/as;", "", "<init>", "()V", "", "RemoteActionCompatParcelizer", "Ljava/lang/String;", "write", "(Ljava/lang/String;)V", "read", "AudioAttributesCompatParcelizer", "Ljava/lang/Object;", "(Ljava/lang/Object;)V", "Lo/withAppendedAnnotationIntrospector;", "IconCompatParcelizer", "Lo/withAppendedAnnotationIntrospector;", "()Lo/withAppendedAnnotationIntrospector;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class as {
    private Object AudioAttributesCompatParcelizer;
    private final withAppendedAnnotationIntrospector IconCompatParcelizer = new withAppendedAnnotationIntrospector();

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private String read;

    public final void write(String str) {
        this.read = str;
    }

    public final void write(Object obj) {
        this.AudioAttributesCompatParcelizer = obj;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final withAppendedAnnotationIntrospector getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }
}
