package kotlin;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.deserializeTypedFromArray;

/* JADX INFO: loaded from: classes2.dex */
public abstract class getTypeInclusion implements deserializeTypedFromArray {
    private boolean IconCompatParcelizer;
    private ByteBuffer RemoteActionCompatParcelizer = AudioAttributesCompatParcelizer;
    private ByteBuffer MediaBrowserCompatItemReceiver = AudioAttributesCompatParcelizer;
    private deserializeTypedFromArray.IconCompatParcelizer AudioAttributesImplApi21Parcelizer = deserializeTypedFromArray.IconCompatParcelizer.read;
    private deserializeTypedFromArray.IconCompatParcelizer AudioAttributesImplBaseParcelizer = deserializeTypedFromArray.IconCompatParcelizer.read;
    public deserializeTypedFromArray.IconCompatParcelizer write = deserializeTypedFromArray.IconCompatParcelizer.read;
    public deserializeTypedFromArray.IconCompatParcelizer read = deserializeTypedFromArray.IconCompatParcelizer.read;

    protected void AudioAttributesImplApi21Parcelizer() {
    }

    protected void AudioAttributesImplBaseParcelizer() {
    }

    protected void MediaBrowserCompatCustomActionResultReceiver() {
    }

    @Override // kotlin.deserializeTypedFromArray
    public final deserializeTypedFromArray.IconCompatParcelizer RemoteActionCompatParcelizer(deserializeTypedFromArray.IconCompatParcelizer iconCompatParcelizer) throws deserializeTypedFromArray.RemoteActionCompatParcelizer {
        this.AudioAttributesImplApi21Parcelizer = iconCompatParcelizer;
        this.AudioAttributesImplBaseParcelizer = IconCompatParcelizer(iconCompatParcelizer);
        return read() ? this.AudioAttributesImplBaseParcelizer : deserializeTypedFromArray.IconCompatParcelizer.read;
    }

    @Override // kotlin.deserializeTypedFromArray
    public boolean read() {
        return this.AudioAttributesImplBaseParcelizer != deserializeTypedFromArray.IconCompatParcelizer.read;
    }

    @Override // kotlin.deserializeTypedFromArray
    public final void write() {
        this.IconCompatParcelizer = true;
        AudioAttributesImplApi21Parcelizer();
    }

    @Override // kotlin.deserializeTypedFromArray
    public ByteBuffer IconCompatParcelizer() {
        ByteBuffer byteBuffer = this.MediaBrowserCompatItemReceiver;
        this.MediaBrowserCompatItemReceiver = AudioAttributesCompatParcelizer;
        return byteBuffer;
    }

    @Override // kotlin.deserializeTypedFromArray
    public boolean RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer && this.MediaBrowserCompatItemReceiver == AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.deserializeTypedFromArray
    public final void AudioAttributesCompatParcelizer() {
        this.MediaBrowserCompatItemReceiver = AudioAttributesCompatParcelizer;
        this.IconCompatParcelizer = false;
        this.write = this.AudioAttributesImplApi21Parcelizer;
        this.read = this.AudioAttributesImplBaseParcelizer;
        AudioAttributesImplBaseParcelizer();
    }

    @Override // kotlin.deserializeTypedFromArray
    public final void AudioAttributesImplApi26Parcelizer() {
        AudioAttributesCompatParcelizer();
        this.RemoteActionCompatParcelizer = AudioAttributesCompatParcelizer;
        this.AudioAttributesImplApi21Parcelizer = deserializeTypedFromArray.IconCompatParcelizer.read;
        this.AudioAttributesImplBaseParcelizer = deserializeTypedFromArray.IconCompatParcelizer.read;
        this.write = deserializeTypedFromArray.IconCompatParcelizer.read;
        this.read = deserializeTypedFromArray.IconCompatParcelizer.read;
        MediaBrowserCompatCustomActionResultReceiver();
    }

    protected final ByteBuffer RemoteActionCompatParcelizer(int i) {
        if (this.RemoteActionCompatParcelizer.capacity() < i) {
            this.RemoteActionCompatParcelizer = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.RemoteActionCompatParcelizer.clear();
        }
        ByteBuffer byteBuffer = this.RemoteActionCompatParcelizer;
        this.MediaBrowserCompatItemReceiver = byteBuffer;
        return byteBuffer;
    }

    protected final boolean MediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver.hasRemaining();
    }

    protected deserializeTypedFromArray.IconCompatParcelizer IconCompatParcelizer(deserializeTypedFromArray.IconCompatParcelizer iconCompatParcelizer) throws deserializeTypedFromArray.RemoteActionCompatParcelizer {
        return deserializeTypedFromArray.IconCompatParcelizer.read;
    }
}
