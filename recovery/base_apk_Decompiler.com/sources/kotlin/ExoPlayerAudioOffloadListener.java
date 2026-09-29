package kotlin;

import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class ExoPlayerAudioOffloadListener extends experimentalSetOffloadSchedulingEnabled<lambdanew9> {
    public ExoPlayerAudioOffloadListener(copyWithMediaPeriodId copywithmediaperiodid, InputStream inputStream) {
        super(copywithmediaperiodid, inputStream);
    }

    public final lambdanew9 write() throws ExoPlaybackExceptionType {
        byte[] bArrAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(4);
        return new lambdanew9(Float.intBitsToFloat((bArrAudioAttributesCompatParcelizer[3] & 255) | ((((((bArrAudioAttributesCompatParcelizer[0] & 255) << 8) | (bArrAudioAttributesCompatParcelizer[1] & 255)) << 8) | (bArrAudioAttributesCompatParcelizer[2] & 255)) << 8)));
    }
}
