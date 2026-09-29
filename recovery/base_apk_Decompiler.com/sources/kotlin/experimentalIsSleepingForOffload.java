package kotlin;

import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class experimentalIsSleepingForOffload extends experimentalSetOffloadSchedulingEnabled<lambdanew11> {
    public experimentalIsSleepingForOffload(copyWithMediaPeriodId copywithmediaperiodid, InputStream inputStream) {
        super(copywithmediaperiodid, inputStream);
    }

    public final lambdanew11 RemoteActionCompatParcelizer() throws ExoPlaybackExceptionType {
        byte[] bArrAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(8);
        long j = bArrAudioAttributesCompatParcelizer[0] & 255;
        long j2 = bArrAudioAttributesCompatParcelizer[1] & 255;
        long j3 = bArrAudioAttributesCompatParcelizer[2] & 255;
        long j4 = bArrAudioAttributesCompatParcelizer[3] & 255;
        long j5 = bArrAudioAttributesCompatParcelizer[4] & 255;
        return new lambdanew11(Double.longBitsToDouble((((((((((((((j << 8) | j2) << 8) | j3) << 8) | j4) << 8) | j5) << 8) | (bArrAudioAttributesCompatParcelizer[5] & 255)) << 8) | ((long) (bArrAudioAttributesCompatParcelizer[6] & 255))) << 8) | ((long) (bArrAudioAttributesCompatParcelizer[7] & 255))));
    }
}
