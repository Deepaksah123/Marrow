package kotlin;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@getRenewGrpId
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JM\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0018\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\f0\t2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\f0\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0013J\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0014J\r\u0010\u0015\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0016\u0010\u0013J\u000f\u0010\u0017\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0017\u0010\u0013R\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R(\u0010\u0018\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u001aj\n\u0012\u0006\u0012\u0004\u0018\u00010\u0010`\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001cR\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00108AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u001d"}, d2 = {"Lo/setViews;", "", "Lo/getNullValueProvider;", "p0", "<init>", "(Lo/getNullValueProvider;)V", "Lo/hasValueTypeDeserializer;", "Lo/KeyDeserializers;", "p1", "Lkotlin/Function1;", "", "Lo/findBeanDeserializer;", "", "p2", "Lo/ResolvableDeserializer;", "p3", "Lo/fillInStackTrace;", "write", "(Lo/hasValueTypeDeserializer;Lo/KeyDeserializers;Lo/getAnswerMap;Lo/getAnswerMap;)Lo/fillInStackTrace;", "()V", "(Lo/fillInStackTrace;)V", "IconCompatParcelizer", "RemoteActionCompatParcelizer", "read", "AudioAttributesCompatParcelizer", "Lo/getNullValueProvider;", "Ljava/util/concurrent/atomic/AtomicReference;", "Lo/read;", "Ljava/util/concurrent/atomic/AtomicReference;", "()Lo/fillInStackTrace;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class setViews {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final getNullValueProvider write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final AtomicReference<fillInStackTrace> AudioAttributesCompatParcelizer = new AtomicReference<>(null);

    public setViews(getNullValueProvider getnullvalueprovider) {
        this.write = getnullvalueprovider;
    }

    public final fillInStackTrace AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer.get();
    }

    public fillInStackTrace write(hasValueTypeDeserializer p0, KeyDeserializers p1, getAnswerMap<? super List<? extends findBeanDeserializer>, getShowPopup> p2, getAnswerMap<? super ResolvableDeserializer, getShowPopup> p3) {
        this.write.RemoteActionCompatParcelizer(p0, p1, p2, p3);
        fillInStackTrace fillinstacktrace = new fillInStackTrace(this, this.write);
        this.AudioAttributesCompatParcelizer.set(fillinstacktrace);
        return fillinstacktrace;
    }

    public final void write() {
        this.write.RemoteActionCompatParcelizer();
        this.AudioAttributesCompatParcelizer.set(new fillInStackTrace(this, this.write));
    }

    public void write(fillInStackTrace p0) {
        if (setBackInvokedCallbackEnabled.read(this.AudioAttributesCompatParcelizer, p0, null)) {
            this.write.read();
        }
    }

    public final void IconCompatParcelizer() {
        this.AudioAttributesCompatParcelizer.set(null);
        this.write.read();
    }

    @getRenewGrpId
    public final void RemoteActionCompatParcelizer() {
        if (AudioAttributesCompatParcelizer() != null) {
            this.write.AudioAttributesImplApi26Parcelizer();
        }
    }

    @getRenewGrpId
    public final void read() {
        this.write.AudioAttributesCompatParcelizer();
    }
}
