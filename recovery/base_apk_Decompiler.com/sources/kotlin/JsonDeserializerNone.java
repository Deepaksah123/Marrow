package kotlin;

import kotlin.Metadata;
import kotlin._handleOddName;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\t\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0017X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0013"}, d2 = {"Lo/JsonDeserializerNone;", "Lo/_handleOddName$IconCompatParcelizer;", "Lo/_writeCloseable;", "Lkotlin/Function1;", "Lo/getKey;", "", "p0", "<init>", "(Lo/getAnswerMap;)V", "IconCompatParcelizer", "AudioAttributesCompatParcelizer", "(J)V", "write", "Lo/getAnswerMap;", "", "RemoteActionCompatParcelizer", "Z", "AudioAttributesImplBaseParcelizer", "()Z", "J", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class JsonDeserializerNone extends _handleOddName.IconCompatParcelizer implements _writeCloseable {
    private getAnswerMap<? super getKey, getShowPopup> write;
    private final boolean RemoteActionCompatParcelizer = true;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private long read = getKey.read(-9223372034707292160L);

    public JsonDeserializerNone(getAnswerMap<? super getKey, getShowPopup> getanswermap) {
        this.write = getanswermap;
    }

    @Override // o._handleOddName.IconCompatParcelizer
    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final boolean getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final void IconCompatParcelizer(getAnswerMap<? super getKey, getShowPopup> p0) {
        this.write = p0;
        this.read = getKey.read(-9223372034707292160L);
    }

    @Override // kotlin._writeCloseable
    public final void AudioAttributesCompatParcelizer(long p0) {
        if (getKey.AudioAttributesCompatParcelizer(this.read, p0)) {
            return;
        }
        this.write.invoke(getKey.AudioAttributesCompatParcelizer(p0));
        this.read = p0;
    }
}
