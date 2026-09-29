package kotlin;

import java.util.Arrays;
import kotlin.lambdaonLoadStarted0comgoogleandroidexoplayer2MediaSourceListForwardingEventListener;

/* JADX INFO: loaded from: classes2.dex */
public final class onDrmKeysRemoved implements lambdaonLoadStarted0comgoogleandroidexoplayer2MediaSourceListForwardingEventListener {
    private byte[] AudioAttributesCompatParcelizer;
    private String IconCompatParcelizer;
    private getEventParameters MediaBrowserCompatCustomActionResultReceiver;
    private String RemoteActionCompatParcelizer;
    private lambdaonLoadStarted0comgoogleandroidexoplayer2MediaSourceListForwardingEventListener.RemoteActionCompatParcelizer read;
    private lambdaonDownstreamFormatChanged5comgoogleandroidexoplayer2MediaSourceListForwardingEventListener write;

    public onDrmKeysRemoved(String str, lambdaonDownstreamFormatChanged5comgoogleandroidexoplayer2MediaSourceListForwardingEventListener lambdaondownstreamformatchanged5comgoogleandroidexoplayer2mediasourcelistforwardingeventlistener, String str2, String str3) {
        this(lambdaonDrmKeysLoaded7comgoogleandroidexoplayer2MediaSourceListForwardingEventListener.write(str), lambdaondownstreamformatchanged5comgoogleandroidexoplayer2mediasourcelistforwardingeventlistener, str2, str3);
    }

    public onDrmKeysRemoved(byte[] bArr, lambdaonDownstreamFormatChanged5comgoogleandroidexoplayer2MediaSourceListForwardingEventListener lambdaondownstreamformatchanged5comgoogleandroidexoplayer2mediasourcelistforwardingeventlistener, String str, String str2) {
        if (bArr == null) {
            throw new IllegalArgumentException("Param id cannot be null");
        }
        if (bArr.length == 0) {
            throw new IllegalArgumentException("Param id cannot be empty");
        }
        if (lambdaondownstreamformatchanged5comgoogleandroidexoplayer2mediasourcelistforwardingeventlistener == null) {
            throw new IllegalArgumentException("Param tagValueType cannot be null");
        }
        this.AudioAttributesCompatParcelizer = bArr;
        this.IconCompatParcelizer = str;
        this.RemoteActionCompatParcelizer = str2;
        this.write = lambdaondownstreamformatchanged5comgoogleandroidexoplayer2mediasourcelistforwardingeventlistener;
        if (lambdaonDrmKeysLoaded7comgoogleandroidexoplayer2MediaSourceListForwardingEventListener.IconCompatParcelizer(bArr[0], 5)) {
            this.MediaBrowserCompatCustomActionResultReceiver = getEventParameters.CONSTRUCTED;
        } else {
            this.MediaBrowserCompatCustomActionResultReceiver = getEventParameters.PRIMITIVE;
        }
        byte b = (byte) ((bArr[0] >>> 6) & 3);
        if (b == 1) {
            this.read = lambdaonLoadStarted0comgoogleandroidexoplayer2MediaSourceListForwardingEventListener.RemoteActionCompatParcelizer.APPLICATION;
            return;
        }
        if (b == 2) {
            this.read = lambdaonLoadStarted0comgoogleandroidexoplayer2MediaSourceListForwardingEventListener.RemoteActionCompatParcelizer.CONTEXT_SPECIFIC;
        } else if (b == 3) {
            this.read = lambdaonLoadStarted0comgoogleandroidexoplayer2MediaSourceListForwardingEventListener.RemoteActionCompatParcelizer.PRIVATE;
        } else {
            this.read = lambdaonLoadStarted0comgoogleandroidexoplayer2MediaSourceListForwardingEventListener.RemoteActionCompatParcelizer.UNIVERSAL;
        }
    }

    @Override // kotlin.lambdaonLoadStarted0comgoogleandroidexoplayer2MediaSourceListForwardingEventListener
    public final boolean IconCompatParcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver == getEventParameters.CONSTRUCTED;
    }

    @Override // kotlin.lambdaonLoadStarted0comgoogleandroidexoplayer2MediaSourceListForwardingEventListener
    public final byte[] RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    private String AudioAttributesCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    private lambdaonDownstreamFormatChanged5comgoogleandroidexoplayer2MediaSourceListForwardingEventListener write() {
        return this.write;
    }

    private getEventParameters read() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof lambdaonLoadStarted0comgoogleandroidexoplayer2MediaSourceListForwardingEventListener)) {
            return false;
        }
        lambdaonLoadStarted0comgoogleandroidexoplayer2MediaSourceListForwardingEventListener lambdaonloadstarted0comgoogleandroidexoplayer2mediasourcelistforwardingeventlistener = (lambdaonLoadStarted0comgoogleandroidexoplayer2MediaSourceListForwardingEventListener) obj;
        if (RemoteActionCompatParcelizer().length != lambdaonloadstarted0comgoogleandroidexoplayer2mediasourcelistforwardingeventlistener.RemoteActionCompatParcelizer().length) {
            return false;
        }
        return Arrays.equals(RemoteActionCompatParcelizer(), lambdaonloadstarted0comgoogleandroidexoplayer2mediasourcelistforwardingeventlistener.RemoteActionCompatParcelizer());
    }

    public final int hashCode() {
        return Arrays.hashCode(this.AudioAttributesCompatParcelizer) + 177;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Tag[");
        sb.append(lambdaonDrmKeysLoaded7comgoogleandroidexoplayer2MediaSourceListForwardingEventListener.RemoteActionCompatParcelizer(RemoteActionCompatParcelizer()));
        sb.append("] Name=");
        sb.append(AudioAttributesCompatParcelizer());
        sb.append(", TagType=");
        sb.append(read());
        sb.append(", ValueType=");
        sb.append(write());
        sb.append(", Class=");
        sb.append(this.read);
        return sb.toString();
    }
}
