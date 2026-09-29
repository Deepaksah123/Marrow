package kotlin;

import android.view.MotionEvent;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\r\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000b\u0010\u0010R$\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000e\u0010\u0013\"\u0004\b\u000e\u0010\u0014"}, d2 = {"Lo/getAnnotationIntrospector;", "", "", "p0", "", "Lo/findRootValueDeserializer;", "p1", "Landroid/view/MotionEvent;", "p2", "<init>", "(JLjava/util/List;Landroid/view/MotionEvent;)V", "AudioAttributesCompatParcelizer", "J", "read", "IconCompatParcelizer", "Ljava/util/List;", "()Ljava/util/List;", "write", "Landroid/view/MotionEvent;", "()Landroid/view/MotionEvent;", "(Landroid/view/MotionEvent;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getAnnotationIntrospector {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final long read;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final List<findRootValueDeserializer> write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private MotionEvent AudioAttributesCompatParcelizer;

    public getAnnotationIntrospector(long j, List<findRootValueDeserializer> list, MotionEvent motionEvent) {
        this.read = j;
        this.write = list;
        this.AudioAttributesCompatParcelizer = motionEvent;
    }

    public final List<findRootValueDeserializer> AudioAttributesCompatParcelizer() {
        return this.write;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final MotionEvent getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final void IconCompatParcelizer(MotionEvent motionEvent) {
        this.AudioAttributesCompatParcelizer = motionEvent;
    }
}
