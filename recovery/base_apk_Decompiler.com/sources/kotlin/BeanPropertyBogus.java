package kotlin;

import android.view.MotionEvent;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\r\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\u00078\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001a\u0010\u0012\u001a\u00020\t8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0016\u001a\u0004\b\u0011\u0010\u0017"}, d2 = {"Lo/BeanPropertyBogus;", "Lo/_throwSubtypeNameNotAllowed;", "", "Lo/_colonConcat;", "p0", "Lo/_format;", "p1", "Lo/getWrapperName;", "p2", "Landroid/view/MotionEvent;", "p3", "<init>", "(Ljava/util/List;IILandroid/view/MotionEvent;Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "write", "Ljava/util/List;", "IconCompatParcelizer", "()Ljava/util/List;", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer", "I", "()I", "read", "Landroid/view/MotionEvent;", "()Landroid/view/MotionEvent;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BeanPropertyBogus implements _throwSubtypeNameNotAllowed {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final int write;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final int read;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final MotionEvent AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final List<_colonConcat> RemoteActionCompatParcelizer;

    private BeanPropertyBogus(List<_colonConcat> list, int i, int i2, MotionEvent motionEvent) {
        this.RemoteActionCompatParcelizer = list;
        this.write = i;
        this.read = i2;
        this.AudioAttributesCompatParcelizer = motionEvent;
        if (IconCompatParcelizer().isEmpty()) {
            throw new IllegalArgumentException("changes cannot be empty".toString());
        }
    }

    @Override // kotlin.DatabindContext
    public final List<_colonConcat> IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.DatabindContext
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final int getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final MotionEvent getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public /* synthetic */ BeanPropertyBogus(List list, int i, int i2, MotionEvent motionEvent, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(list, i, i2, motionEvent);
    }
}
