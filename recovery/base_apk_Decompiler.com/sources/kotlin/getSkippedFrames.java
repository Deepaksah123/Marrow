package kotlin;

import java.io.FileNotFoundException;

/* JADX INFO: loaded from: classes2.dex */
public final class getSkippedFrames implements getMeanBandwidth {
    private static String AudioAttributesCompatParcelizer = setAudioTrackBufferSizeProvider.AudioAttributesCompatParcelizer.write();
    public final String IconCompatParcelizer;

    public getSkippedFrames(String str) {
        String string;
        if (str != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append('/');
            sb.append(AudioAttributesCompatParcelizer);
            string = sb.toString();
        } else {
            string = null;
        }
        this.IconCompatParcelizer = string;
    }

    public final DefaultAudioSinkApi31 write(byte[] bArr, String str) {
        DefaultAudioSinkApi31 defaultAudioSinkApi31;
        synchronized (this) {
            defaultAudioSinkApi31 = onProcessedStreamChange.read(new buildNativeOrderByteArray(this, str, bArr));
        }
        return defaultAudioSinkApi31;
    }

    public final DefaultAudioSinkApi31 read(String str) {
        DefaultAudioSinkApi31 defaultAudioSinkApi31Write;
        synchronized (this) {
            defaultAudioSinkApi31Write = DefaultAudioSinkConfiguration.write(onProcessedStreamChange.read(new packetizeInternal(this, str)));
            if (!(defaultAudioSinkApi31Write instanceof Ac4Util)) {
                if (!(defaultAudioSinkApi31Write instanceof codecNeedsDiscardChannelsWorkaround)) {
                    throw new RenewEligibleCreator();
                }
                defaultAudioSinkApi31Write = new codecNeedsDiscardChannelsWorkaround(((Throwable) ((codecNeedsDiscardChannelsWorkaround) defaultAudioSinkApi31Write).IconCompatParcelizer) instanceof FileNotFoundException ? dispatchEvent.IconCompatParcelizer : maybeUpdateMetricsBuilderValues.write);
            }
        }
        return defaultAudioSinkApi31Write;
    }
}
