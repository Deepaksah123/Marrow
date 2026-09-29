package kotlin;

import android.view.MotionEvent;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B!\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0017\b\u0016\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00168G¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\r\u001a\u00020\u00198\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001a\u001a\u0004\b\u0010\u0010\fR\u001a\u0010\u0013\u001a\u00020\u001b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u001a\u001a\u0004\b\u0011\u0010\fR\u001a\u0010\u0017\u001a\u00020\u001c8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u001a\u001a\u0004\b\u0015\u0010\fR*\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\n8\u0007@AX\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001d\u0010\f\"\u0004\b\u0013\u0010\u001e"}, d2 = {"Lo/DeserializationContext;", "", "", "Lo/getArrayBuilders;", "p0", "Lo/introspectForBuilder;", "p1", "<init>", "(Ljava/util/List;Lo/introspectForBuilder;)V", "(Ljava/util/List;)V", "Lo/constructCalendar;", "MediaBrowserCompatItemReceiver", "()I", "AudioAttributesCompatParcelizer", "Ljava/util/List;", "()Ljava/util/List;", "RemoteActionCompatParcelizer", "write", "Lo/introspectForBuilder;", "read", "()Lo/introspectForBuilder;", "IconCompatParcelizer", "Landroid/view/MotionEvent;", "AudioAttributesImplBaseParcelizer", "()Landroid/view/MotionEvent;", "", "I", "Lo/_getDateFormat;", "Lo/handleSecondaryContextualization;", "MediaBrowserCompatCustomActionResultReceiver", "(I)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DeserializationContext {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final List<getArrayBuilders> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final int AudioAttributesImplBaseParcelizer;
    private int MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final int AudioAttributesCompatParcelizer;
    private final int read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final introspectForBuilder IconCompatParcelizer;

    public DeserializationContext(List<getArrayBuilders> list, introspectForBuilder introspectforbuilder) {
        this.RemoteActionCompatParcelizer = list;
        this.IconCompatParcelizer = introspectforbuilder;
        MotionEvent motionEventAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer();
        this.AudioAttributesCompatParcelizer = motionEventAudioAttributesImplBaseParcelizer != null ? motionEventAudioAttributesImplBaseParcelizer.getClassification() : 0;
        MotionEvent motionEventAudioAttributesImplBaseParcelizer2 = AudioAttributesImplBaseParcelizer();
        this.read = _getDateFormat.write(motionEventAudioAttributesImplBaseParcelizer2 != null ? motionEventAudioAttributesImplBaseParcelizer2.getButtonState() : 0);
        MotionEvent motionEventAudioAttributesImplBaseParcelizer3 = AudioAttributesImplBaseParcelizer();
        this.AudioAttributesImplBaseParcelizer = handleSecondaryContextualization.RemoteActionCompatParcelizer(motionEventAudioAttributesImplBaseParcelizer3 != null ? motionEventAudioAttributesImplBaseParcelizer3.getMetaState() : 0);
        this.MediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver();
    }

    public final List<getArrayBuilders> AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final introspectForBuilder getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final MotionEvent AudioAttributesImplBaseParcelizer() {
        introspectForBuilder introspectforbuilder = this.IconCompatParcelizer;
        if (introspectforbuilder != null) {
            return introspectforbuilder.AudioAttributesCompatParcelizer();
        }
        return null;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final int getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public DeserializationContext(List<getArrayBuilders> list) {
        this(list, null);
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final int getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final int getAudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final int getMediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final void read(int i) {
        this.MediaBrowserCompatItemReceiver = i;
    }

    private final int MediaBrowserCompatItemReceiver() {
        MotionEvent motionEventAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer();
        if (motionEventAudioAttributesImplBaseParcelizer != null) {
            int actionMasked = motionEventAudioAttributesImplBaseParcelizer.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
                            case 5:
                                break;
                            case 6:
                                break;
                            case 7:
                                break;
                            case 8:
                                return constructCalendar.INSTANCE.MediaBrowserCompatItemReceiver();
                            case 9:
                                return constructCalendar.INSTANCE.read();
                            case 10:
                                return constructCalendar.INSTANCE.AudioAttributesCompatParcelizer();
                            default:
                                return constructCalendar.INSTANCE.MediaBrowserCompatCustomActionResultReceiver();
                        }
                    }
                    return constructCalendar.INSTANCE.RemoteActionCompatParcelizer();
                }
                return constructCalendar.INSTANCE.write();
            }
            return constructCalendar.INSTANCE.IconCompatParcelizer();
        }
        List<getArrayBuilders> list = this.RemoteActionCompatParcelizer;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            getArrayBuilders getarraybuilders = list.get(i);
            if (bufferAsCopyOfValue.AudioAttributesCompatParcelizer(getarraybuilders)) {
                return constructCalendar.INSTANCE.write();
            }
            if (bufferAsCopyOfValue.read(getarraybuilders)) {
                return constructCalendar.INSTANCE.IconCompatParcelizer();
            }
        }
        return constructCalendar.INSTANCE.RemoteActionCompatParcelizer();
    }
}
