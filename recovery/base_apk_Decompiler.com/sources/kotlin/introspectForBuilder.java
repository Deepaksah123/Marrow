package kotlin;

import android.view.MotionEvent;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u000f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00138G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\u0014\u001a\u00020\n8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0011\u0010\u0017\"\u0004\b\u000f\u0010\u0018"}, d2 = {"Lo/introspectForBuilder;", "", "Lo/setPresenter;", "Lo/getArrayBuilders;", "p0", "Lo/getAnnotationIntrospector;", "p1", "<init>", "(Lo/setPresenter;Lo/getAnnotationIntrospector;)V", "Lo/findClass;", "", "read", "(J)Z", "RemoteActionCompatParcelizer", "Lo/setPresenter;", "IconCompatParcelizer", "()Lo/setPresenter;", "write", "Lo/getAnnotationIntrospector;", "Landroid/view/MotionEvent;", "AudioAttributesCompatParcelizer", "()Landroid/view/MotionEvent;", "Z", "()Z", "(Z)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class introspectForBuilder {
    private boolean AudioAttributesCompatParcelizer;
    private final setPresenter<getArrayBuilders> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final getAnnotationIntrospector IconCompatParcelizer;

    public introspectForBuilder(setPresenter<getArrayBuilders> setpresenter, getAnnotationIntrospector getannotationintrospector) {
        this.RemoteActionCompatParcelizer = setpresenter;
        this.IconCompatParcelizer = getannotationintrospector;
    }

    public final setPresenter<getArrayBuilders> IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final MotionEvent AudioAttributesCompatParcelizer() {
        return this.IconCompatParcelizer.getAudioAttributesCompatParcelizer();
    }

    public final boolean read(long p0) {
        findRootValueDeserializer findrootvaluedeserializer;
        List<findRootValueDeserializer> listAudioAttributesCompatParcelizer = this.IconCompatParcelizer.AudioAttributesCompatParcelizer();
        int size = listAudioAttributesCompatParcelizer.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                findrootvaluedeserializer = null;
                break;
            }
            findrootvaluedeserializer = listAudioAttributesCompatParcelizer.get(i);
            if (findClass.AudioAttributesCompatParcelizer(findrootvaluedeserializer.getIconCompatParcelizer(), p0)) {
                break;
            }
            i++;
        }
        findRootValueDeserializer findrootvaluedeserializer2 = findrootvaluedeserializer;
        if (findrootvaluedeserializer2 != null) {
            return findrootvaluedeserializer2.getAudioAttributesImplBaseParcelizer();
        }
        return false;
    }

    public final void IconCompatParcelizer(boolean z) {
        this.AudioAttributesCompatParcelizer = z;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final boolean getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }
}
