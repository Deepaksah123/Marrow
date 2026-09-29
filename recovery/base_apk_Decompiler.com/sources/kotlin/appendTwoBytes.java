package kotlin;

import android.graphics.Paint;
import android.graphics.Shader;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J\u0013\u0010\b\u001a\u00060\u0002j\u0002`\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u000b\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\nR\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u001e\u0010\u0012\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0011R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R$\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00158W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0016\"\u0004\b\u000b\u0010\u0017R$\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u00198W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u001a\"\u0004\b\u000e\u0010\u001bR$\u0010\u001f\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\f8W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u001d\"\u0004\b\u000b\u0010\u001eR\u001e\u0010!\u001a\u00020 2\u0006\u0010\u0003\u001a\u00020 8V@WX\u0096\u000e¢\u0006\u0006\"\u0004\b\u0012\u0010\u001eR$\u0010#\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00158W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b\"\u0010\u0016\"\u0004\b\u0012\u0010\u0017R$\u0010%\u001a\u00020$2\u0006\u0010\u0003\u001a\u00020$8W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010\u001d\"\u0004\b\u000e\u0010\u001eR$\u0010'\u001a\u00020&2\u0006\u0010\u0003\u001a\u00020&8W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\b\u0010\u001eR$\u0010)\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00158W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b(\u0010\u0016\"\u0004\b\u000e\u0010\u0017R$\u0010+\u001a\u00020*2\u0006\u0010\u0003\u001a\u00020*8W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b#\u0010\u001d\"\u0004\b\u0018\u0010\u001eR4\u0010(\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u00102\u000e\u0010\u0003\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u00108W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b!\u0010,\"\u0004\b\u0018\u0010-R(\u0010\"\u001a\u0004\u0018\u00010\u00132\b\u0010\u0003\u001a\u0004\u0018\u00010\u00138W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010.\"\u0004\b\u000e\u0010/R.\u00104\u001a\u0004\u0018\u0001002\b\u0010\u0003\u001a\u0004\u0018\u0001008\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\b\u0018\u00101\u001a\u0004\b%\u00102\"\u0004\b\u000e\u00103"}, d2 = {"Lo/appendTwoBytes;", "Lo/releaseBuffers;", "Landroid/graphics/Paint;", "p0", "<init>", "(Landroid/graphics/Paint;)V", "()V", "Lo/IconCompatParcelizer;", "IconCompatParcelizer", "()Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "RemoteActionCompatParcelizer", "Lo/createInstance;", "I", "AudioAttributesCompatParcelizer", "Landroid/graphics/Shader;", "Lo/AudioAttributesCompatParcelizer;", "Landroid/graphics/Shader;", "write", "Lo/switchAndReturnNext;", "Lo/switchAndReturnNext;", "", "()F", "(F)V", "read", "Lo/switchToNext;", "()J", "(J)V", "AudioAttributesImplApi26Parcelizer", "()I", "(I)V", "MediaBrowserCompatCustomActionResultReceiver", "Lo/ThreadLocalBufferManager;", "MediaBrowserCompatItemReceiver", "MediaMetadataCompat", "AudioAttributesImplApi21Parcelizer", "Lo/findAutoDetectVisibility;", "AudioAttributesImplBaseParcelizer", "Lo/findCreatorBinding;", "RatingCompat", "MediaBrowserCompatMediaItem", "MediaDescriptionCompat", "Lo/TextBuffer;", "MediaBrowserCompatSearchResultReceiver", "()Landroid/graphics/Shader;", "(Landroid/graphics/Shader;)V", "()Lo/switchAndReturnNext;", "(Lo/switchAndReturnNext;)V", "Lo/setCurrentLength;", "Lo/setCurrentLength;", "()Lo/setCurrentLength;", "(Lo/setCurrentLength;)V", "onAddQueueItem"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class appendTwoBytes implements releaseBuffers {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private Shader write;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private Paint RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private int AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private setCurrentLength onAddQueueItem;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private switchAndReturnNext IconCompatParcelizer;

    public appendTwoBytes(Paint paint) {
        this.RemoteActionCompatParcelizer = paint;
        this.AudioAttributesCompatParcelizer = createInstance.INSTANCE.onPrepare();
    }

    public appendTwoBytes() {
        this(fromInitial.read());
    }

    @Override // kotlin.releaseBuffers
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final Paint getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.releaseBuffers
    public final float write() {
        return fromInitial.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer);
    }

    @Override // kotlin.releaseBuffers
    public final void RemoteActionCompatParcelizer(float f) {
        fromInitial.IconCompatParcelizer(this.RemoteActionCompatParcelizer, f);
    }

    @Override // kotlin.releaseBuffers
    public final long AudioAttributesCompatParcelizer() {
        return fromInitial.read(this.RemoteActionCompatParcelizer);
    }

    @Override // kotlin.releaseBuffers
    public final void AudioAttributesCompatParcelizer(long j) {
        fromInitial.IconCompatParcelizer(this.RemoteActionCompatParcelizer, j);
    }

    @Override // kotlin.releaseBuffers
    /* JADX INFO: renamed from: read, reason: from getter */
    public final int getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.releaseBuffers
    public final void RemoteActionCompatParcelizer(int i) {
        if (createInstance.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, i)) {
            return;
        }
        this.AudioAttributesCompatParcelizer = i;
        fromInitial.write(this.RemoteActionCompatParcelizer, i);
    }

    @Override // kotlin.releaseBuffers
    public final void write(int i) {
        fromInitial.read(this.RemoteActionCompatParcelizer, i);
    }

    @Override // kotlin.releaseBuffers
    public final float MediaMetadataCompat() {
        return fromInitial.AudioAttributesImplBaseParcelizer(this.RemoteActionCompatParcelizer);
    }

    @Override // kotlin.releaseBuffers
    public final void write(float f) {
        fromInitial.write(this.RemoteActionCompatParcelizer, f);
    }

    @Override // kotlin.releaseBuffers
    public final int MediaBrowserCompatCustomActionResultReceiver() {
        return fromInitial.IconCompatParcelizer(this.RemoteActionCompatParcelizer);
    }

    @Override // kotlin.releaseBuffers
    public final void AudioAttributesCompatParcelizer(int i) {
        fromInitial.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, i);
    }

    @Override // kotlin.releaseBuffers
    public final int AudioAttributesImplApi26Parcelizer() {
        return fromInitial.AudioAttributesImplApi26Parcelizer(this.RemoteActionCompatParcelizer);
    }

    @Override // kotlin.releaseBuffers
    public final void IconCompatParcelizer(int i) {
        fromInitial.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, i);
    }

    @Override // kotlin.releaseBuffers
    public final float MediaBrowserCompatMediaItem() {
        return fromInitial.MediaBrowserCompatCustomActionResultReceiver(this.RemoteActionCompatParcelizer);
    }

    @Override // kotlin.releaseBuffers
    public final void AudioAttributesCompatParcelizer(float f) {
        fromInitial.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, f);
    }

    @Override // kotlin.releaseBuffers
    public final int AudioAttributesImplApi21Parcelizer() {
        return fromInitial.write(this.RemoteActionCompatParcelizer);
    }

    @Override // kotlin.releaseBuffers
    public final void read(int i) {
        fromInitial.IconCompatParcelizer(this.RemoteActionCompatParcelizer, i);
    }

    @Override // kotlin.releaseBuffers
    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final Shader getWrite() {
        return this.write;
    }

    @Override // kotlin.releaseBuffers
    public final void read(Shader shader) {
        this.write = shader;
        fromInitial.read(this.RemoteActionCompatParcelizer, shader);
    }

    @Override // kotlin.releaseBuffers
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final switchAndReturnNext getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // kotlin.releaseBuffers
    public final void AudioAttributesCompatParcelizer(switchAndReturnNext switchandreturnnext) {
        this.IconCompatParcelizer = switchandreturnnext;
        fromInitial.write(this.RemoteActionCompatParcelizer, switchandreturnnext);
    }

    @Override // kotlin.releaseBuffers
    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final setCurrentLength getOnAddQueueItem() {
        return this.onAddQueueItem;
    }

    @Override // kotlin.releaseBuffers
    public final void AudioAttributesCompatParcelizer(setCurrentLength setcurrentlength) {
        fromInitial.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, setcurrentlength);
        this.onAddQueueItem = setcurrentlength;
    }
}
