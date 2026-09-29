package kotlin;

import kotlin.Metadata;
import kotlin._handleOddName;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001b\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\u00020\u0006*\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u0006*\u00020\u0005¢\u0006\u0004\b\f\u0010\u000bJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\rR(\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006@\u0007X\u0086\u000e¢\u0006\f\n\u0004\b\f\u0010\u000e\"\u0004\b\u000f\u0010\tR\u0016\u0010\u0013\u001a\u00020\u00118\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0012R\u0014\u0010\u000f\u001a\u00020\u00118WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\n\u001a\u00020\u00168\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019"}, d2 = {"Lo/appendUnquotedUTF8;", "Lo/_handleOddName$IconCompatParcelizer;", "Lo/createForPropertyOverride;", "Lo/hasIndex;", "Lkotlin/Function1;", "Lo/getConfigOverride;", "", "p0", "<init>", "(Lo/getAnswerMap;)V", "write", "(Lo/getConfigOverride;)V", "AudioAttributesCompatParcelizer", "()V", "Lo/getAnswerMap;", "read", "RemoteActionCompatParcelizer", "", "Z", "IconCompatParcelizer", "l_", "()Z", "", "Ljava/lang/Object;", "MediaBrowserCompatItemReceiver", "()Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class appendUnquotedUTF8 extends _handleOddName.IconCompatParcelizer implements createForPropertyOverride, hasIndex {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private getAnswerMap<? super getConfigOverride, getShowPopup> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final Object write = appendUnquoted.INSTANCE;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private boolean IconCompatParcelizer;

    @Override // kotlin.hasIndex
    /* JADX INFO: renamed from: l_ */
    public final boolean getRead() {
        return true;
    }

    public final void read(getAnswerMap<? super getConfigOverride, getShowPopup> getanswermap) {
        this.RemoteActionCompatParcelizer = getanswermap;
    }

    public appendUnquotedUTF8(getAnswerMap<? super getConfigOverride, getShowPopup> getanswermap) {
        this.RemoteActionCompatParcelizer = getanswermap;
    }

    @Override // kotlin.createForPropertyOverride
    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final Object getIconCompatParcelizer() {
        return this.write;
    }

    @Override // kotlin.hasIndex
    public final void write(getConfigOverride getconfigoverride) {
        if (this.IconCompatParcelizer) {
            return;
        }
        this.RemoteActionCompatParcelizer.invoke(getconfigoverride);
    }

    public final void AudioAttributesCompatParcelizer(getConfigOverride getconfigoverride) {
        this.IconCompatParcelizer = true;
        this.RemoteActionCompatParcelizer.invoke(getconfigoverride);
        getValueNulls.write(this);
    }

    public final void write() {
        this.IconCompatParcelizer = false;
        getValueNulls.write(this);
    }
}
