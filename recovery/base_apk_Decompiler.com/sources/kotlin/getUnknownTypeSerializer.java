package kotlin;

import java.util.List;
import java.util.Map;
import kotlin.JavaBigIntegerFromCharSequence;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\b\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b\b\u0010\fJ\u001a\u0010\b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0002\u001a\u00020\rH\u0096\u0001¢\u0006\u0004\b\b\u0010\u000eJ$\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\r\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00100\u000fH\u0096\u0001¢\u0006\u0004\b\u0011\u0010\u0012J(\u0010\u0011\u001a\u00020\u00132\u0006\u0010\u0002\u001a\u00020\r2\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0003H\u0096\u0001¢\u0006\u0004\b\u0011\u0010\u0014R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0015"}, d2 = {"Lo/getUnknownTypeSerializer;", "Lo/JavaBigIntegerFromCharSequence;", "p0", "Lkotlin/Function0;", "", "p1", "<init>", "(Lo/JavaBigIntegerFromCharSequence;Lo/getCreatedOnDateMs;)V", "AudioAttributesCompatParcelizer", "()V", "", "", "(Ljava/lang/Object;)Z", "", "(Ljava/lang/String;)Ljava/lang/Object;", "", "", "read", "()Ljava/util/Map;", "Lo/JavaBigIntegerFromCharSequence$read;", "(Ljava/lang/String;Lo/getCreatedOnDateMs;)Lo/JavaBigIntegerFromCharSequence$read;", "Lo/getCreatedOnDateMs;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getUnknownTypeSerializer implements JavaBigIntegerFromCharSequence {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final getCreatedOnDateMs<getShowPopup> read;
    private final /* synthetic */ JavaBigIntegerFromCharSequence write;

    public getUnknownTypeSerializer(JavaBigIntegerFromCharSequence javaBigIntegerFromCharSequence, getCreatedOnDateMs<getShowPopup> getcreatedondatems) {
        this.write = javaBigIntegerFromCharSequence;
        this.read = getcreatedondatems;
    }

    public final void AudioAttributesCompatParcelizer() {
        this.read.invoke();
    }

    @Override // kotlin.JavaBigIntegerFromCharSequence
    public final boolean AudioAttributesCompatParcelizer(Object p0) {
        return this.write.AudioAttributesCompatParcelizer(p0);
    }

    @Override // kotlin.JavaBigIntegerFromCharSequence
    public final Object AudioAttributesCompatParcelizer(String p0) {
        return this.write.AudioAttributesCompatParcelizer(p0);
    }

    @Override // kotlin.JavaBigIntegerFromCharSequence
    public final Map<String, List<Object>> read() {
        return this.write.read();
    }

    @Override // kotlin.JavaBigIntegerFromCharSequence
    public final JavaBigIntegerFromCharSequence.read read(String p0, getCreatedOnDateMs<? extends Object> p1) {
        return this.write.read(p0, p1);
    }
}
