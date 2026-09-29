package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class VideoAnalyticInterimSession {
    private static final accessgetVideoConfigurationC2cp RemoteActionCompatParcelizer = new accessgetVideoConfigurationC2cp("CLOSED");

    public static final <S extends setTotalFramesDropped<S>> Object read(S s, long j, MagicModuleSubmissionRequestBody<? super Long, ? super S, ? extends S> magicModuleSubmissionRequestBody) {
        while (true) {
            if (s.AudioAttributesCompatParcelizer >= j && !s.MediaBrowserCompatItemReceiver()) {
                return setWidevineMode.write(s);
            }
            Object objAudioAttributesImplApi21Parcelizer = s.AudioAttributesImplApi21Parcelizer();
            if (objAudioAttributesImplApi21Parcelizer == RemoteActionCompatParcelizer) {
                return setWidevineMode.write(RemoteActionCompatParcelizer);
            }
            S sInvoke = (S) ((getLicensingResponseTimestampMs) objAudioAttributesImplApi21Parcelizer);
            if (sInvoke == null) {
                sInvoke = magicModuleSubmissionRequestBody.invoke(Long.valueOf(s.AudioAttributesCompatParcelizer + 1), s);
                if (s.AudioAttributesCompatParcelizer(sInvoke)) {
                    if (s.MediaBrowserCompatItemReceiver()) {
                        s.AudioAttributesImplBaseParcelizer();
                    }
                }
            }
            s = (Object) sInvoke;
        }
    }

    public static final <N extends getLicensingResponseTimestampMs<N>> N RemoteActionCompatParcelizer(N n) {
        while (true) {
            Object objAudioAttributesImplApi21Parcelizer = n.AudioAttributesImplApi21Parcelizer();
            if (objAudioAttributesImplApi21Parcelizer == RemoteActionCompatParcelizer) {
                return n;
            }
            getLicensingResponseTimestampMs getlicensingresponsetimestampms = (getLicensingResponseTimestampMs) objAudioAttributesImplApi21Parcelizer;
            if (getlicensingresponsetimestampms != null) {
                n = (N) getlicensingresponsetimestampms;
            } else if (n.MediaBrowserCompatCustomActionResultReceiver()) {
                return n;
            }
        }
    }
}
