package kotlin;

import kotlin.Metadata;
import kotlin.getAudioComponent;
import kotlin.parseDigitsRecursive;
import kotlin.replaceDelegatee;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0019\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u000eR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0013R\"\u0010\n\u001a\u00020\u00158\u0017@\u0017X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0017\u0010\u0019R\u0016\u0010\u0017\u001a\u00020\u00158\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0016R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u001c8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001dR/\u0010\u001a\u001a\u0004\u0018\u00010\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u00018C@CX\u0083\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u001f\u001a\u0004\b\u001a\u0010 \"\u0004\b\u0011\u0010!R(\u0010\"\u001a\u0004\u0018\u00010\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u00018G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010 \"\u0004\b\u0017\u0010!"}, d2 = {"Lo/clearVideoFrameMetadataListener;", "Lo/replaceDelegatee;", "Lo/replaceDelegatee$IconCompatParcelizer;", "Lo/getAudioComponent$AudioAttributesCompatParcelizer;", "", "p0", "Lo/getAudioComponent;", "p1", "<init>", "(Ljava/lang/Object;Lo/getAudioComponent;)V", "AudioAttributesCompatParcelizer", "()Lo/replaceDelegatee$IconCompatParcelizer;", "", "AudioAttributesImplApi26Parcelizer", "()V", "RemoteActionCompatParcelizer", "Ljava/lang/Object;", "write", "()Ljava/lang/Object;", "Lo/getAudioComponent;", "read", "", "I", "IconCompatParcelizer", "()I", "(I)V", "MediaBrowserCompatItemReceiver", "Lo/replaceDelegatee$IconCompatParcelizer;", "", "Z", "AudioAttributesImplBaseParcelizer", "Lo/InputAccessor;", "()Lo/replaceDelegatee;", "(Lo/replaceDelegatee;)V", "MediaBrowserCompatCustomActionResultReceiver"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class clearVideoFrameMetadataListener implements replaceDelegatee, replaceDelegatee.IconCompatParcelizer, getAudioComponent.AudioAttributesCompatParcelizer {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private replaceDelegatee.IconCompatParcelizer RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final getAudioComponent read;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private int IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final Object write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private boolean AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private int AudioAttributesCompatParcelizer = -1;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final InputAccessor MediaBrowserCompatItemReceiver = available.RemoteActionCompatParcelizer$default(null, null, 2, null);

    public clearVideoFrameMetadataListener(Object obj, getAudioComponent getaudiocomponent) {
        this.write = obj;
        this.read = getaudiocomponent;
    }

    @Override // o.getAudioComponent.AudioAttributesCompatParcelizer
    /* JADX INFO: renamed from: write, reason: from getter */
    public final Object getWrite() {
        return this.write;
    }

    @Override // o.getAudioComponent.AudioAttributesCompatParcelizer
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final int getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final void IconCompatParcelizer(int i) {
        this.AudioAttributesCompatParcelizer = i;
    }

    private final replaceDelegatee MediaBrowserCompatItemReceiver() {
        return (replaceDelegatee) this.MediaBrowserCompatItemReceiver.getRemoteActionCompatParcelizer();
    }

    private final void write(replaceDelegatee replacedelegatee) {
        this.MediaBrowserCompatItemReceiver.write(replacedelegatee);
    }

    public final replaceDelegatee read() {
        return MediaBrowserCompatItemReceiver();
    }

    public final void IconCompatParcelizer(replaceDelegatee replacedelegatee) {
        parseDigitsRecursive.Companion companion = parseDigitsRecursive.INSTANCE;
        parseDigitsRecursive parsedigitsrecursiveIconCompatParcelizer = companion.IconCompatParcelizer();
        getAnswerMap<Object, getShowPopup> getanswermapAudioAttributesImplApi26Parcelizer = parsedigitsrecursiveIconCompatParcelizer != null ? parsedigitsrecursiveIconCompatParcelizer.AudioAttributesImplApi26Parcelizer() : null;
        parseDigitsRecursive parsedigitsrecursive = companion.read(parsedigitsrecursiveIconCompatParcelizer);
        try {
            if (replacedelegatee != MediaBrowserCompatItemReceiver()) {
                write(replacedelegatee);
                if (this.IconCompatParcelizer > 0) {
                    replaceDelegatee.IconCompatParcelizer iconCompatParcelizer = this.RemoteActionCompatParcelizer;
                    if (iconCompatParcelizer != null) {
                        iconCompatParcelizer.AudioAttributesImplApi26Parcelizer();
                    }
                    this.RemoteActionCompatParcelizer = replacedelegatee != null ? replacedelegatee.AudioAttributesCompatParcelizer() : null;
                }
            }
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        } finally {
            companion.AudioAttributesCompatParcelizer(parsedigitsrecursiveIconCompatParcelizer, parsedigitsrecursive, getanswermapAudioAttributesImplApi26Parcelizer);
        }
    }

    @Override // kotlin.replaceDelegatee
    public final replaceDelegatee.IconCompatParcelizer AudioAttributesCompatParcelizer() {
        if (this.AudioAttributesImplBaseParcelizer) {
            getRootStableInsets.AudioAttributesCompatParcelizer("Pin should not be called on an already disposed item ");
        }
        if (this.IconCompatParcelizer == 0) {
            this.read.RemoteActionCompatParcelizer(this);
            replaceDelegatee replacedelegatee = read();
            this.RemoteActionCompatParcelizer = replacedelegatee != null ? replacedelegatee.AudioAttributesCompatParcelizer() : null;
        }
        this.IconCompatParcelizer++;
        return this;
    }

    @Override // o.replaceDelegatee.IconCompatParcelizer
    public final void AudioAttributesImplApi26Parcelizer() {
        if (this.AudioAttributesImplBaseParcelizer) {
            return;
        }
        if (this.IconCompatParcelizer <= 0) {
            getRootStableInsets.AudioAttributesCompatParcelizer("Release should only be called once");
        }
        int i = this.IconCompatParcelizer - 1;
        this.IconCompatParcelizer = i;
        if (i == 0) {
            this.read.read(this);
            replaceDelegatee.IconCompatParcelizer iconCompatParcelizer = this.RemoteActionCompatParcelizer;
            if (iconCompatParcelizer != null) {
                iconCompatParcelizer.AudioAttributesImplApi26Parcelizer();
            }
            this.RemoteActionCompatParcelizer = null;
        }
    }

    public final void RemoteActionCompatParcelizer() {
        this.AudioAttributesImplBaseParcelizer = true;
    }
}
