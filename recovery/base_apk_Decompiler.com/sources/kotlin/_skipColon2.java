package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lo/_skipColon2;", "Lo/getSource;", "Lo/setEncoding;", "p0", "<init>", "(Lo/setEncoding;)V", "Lo/_parseSlowFloat;", "Lo/filterFinishObject;", "read", "(Lo/_parseSlowFloat;)Lo/filterFinishObject;", "", "AudioAttributesCompatParcelizer", "(Lo/_parseSlowFloat;)I", "IconCompatParcelizer", "Lo/setEncoding;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class _skipColon2 extends getSource {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final setEncoding AudioAttributesCompatParcelizer;

    public _skipColon2(setEncoding setencoding) {
        this.AudioAttributesCompatParcelizer = setencoding;
    }

    @Override // kotlin.getSource
    public final filterFinishObject read(_parseSlowFloat p0) {
        setEncoding setencoding = this.AudioAttributesCompatParcelizer;
        return setencoding.onPlay(setencoding.read(p0));
    }

    @Override // kotlin.getSource
    public final int AudioAttributesCompatParcelizer(_parseSlowFloat p0) {
        setEncoding setencoding = this.AudioAttributesCompatParcelizer;
        return setencoding.MediaBrowserCompatCustomActionResultReceiver(setencoding.read(p0));
    }
}
