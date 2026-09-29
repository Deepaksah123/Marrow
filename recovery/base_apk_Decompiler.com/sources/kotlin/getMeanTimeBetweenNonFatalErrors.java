package kotlin;

import com.fingerprintjs.android.fpjs_pro_internal.D0;

/* JADX INFO: loaded from: classes2.dex */
public final class getMeanTimeBetweenNonFatalErrors {
    private getTotalElapsedTimeMs read;

    public getMeanTimeBetweenNonFatalErrors(getTotalElapsedTimeMs gettotalelapsedtimems) {
        this.read = gettotalelapsedtimems;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v4, types: [o.DefaultAudioSinkApi31] */
    public final DefaultAudioSinkApi31 write(String str) {
        DefaultAudioSinkApi31 defaultAudioSinkApi31;
        DefaultAudioSinkApi31 defaultAudioSinkApi31RemoteActionCompatParcelizer = AudioRendererEventListenerEventDispatcherExternalSyntheticLambda0.RemoteActionCompatParcelizer(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new String[]{parseDtsAudioSampleCount.RemoteActionCompatParcelizer.write(), str}));
        if (!(defaultAudioSinkApi31RemoteActionCompatParcelizer instanceof Ac4Util)) {
            if (defaultAudioSinkApi31RemoteActionCompatParcelizer instanceof codecNeedsDiscardChannelsWorkaround) {
                return defaultAudioSinkApi31RemoteActionCompatParcelizer;
            }
            throw new RenewEligibleCreator();
        }
        String str2 = (String) ((Ac4Util) defaultAudioSinkApi31RemoteActionCompatParcelizer).RemoteActionCompatParcelizer;
        try {
            defaultAudioSinkApi31 = getTotalElapsedTimeMs.read(str2, AudioTimestampPoller.RemoteActionCompatParcelizer.write());
        } catch (getMaximumEncodedRateBytesPerSecond unused) {
            str2 = null;
        }
        try {
            if (!(defaultAudioSinkApi31 instanceof Ac4Util)) {
                if (!(defaultAudioSinkApi31 instanceof codecNeedsDiscardChannelsWorkaround)) {
                    throw new RenewEligibleCreator();
                }
                throw getMaximumEncodedRateBytesPerSecond.IconCompatParcelizer;
            }
            long jLongValue = ((Number) ((Ac4Util) defaultAudioSinkApi31).RemoteActionCompatParcelizer).longValue();
            DefaultAudioSinkApi31 defaultAudioSinkApi312 = getTotalElapsedTimeMs.read(str2, PlaybackStatsEventTimeAndException.RemoteActionCompatParcelizer.write());
            if (!(defaultAudioSinkApi312 instanceof Ac4Util)) {
                if (!(defaultAudioSinkApi312 instanceof codecNeedsDiscardChannelsWorkaround)) {
                    throw new RenewEligibleCreator();
                }
                throw getMaximumEncodedRateBytesPerSecond.IconCompatParcelizer;
            }
            long jLongValue2 = ((Number) ((Ac4Util) defaultAudioSinkApi312).RemoteActionCompatParcelizer).longValue();
            DefaultAudioSinkApi31 defaultAudioSinkApi313 = getTotalElapsedTimeMs.read(str2, renderToEndOfStream.IconCompatParcelizer.write());
            if (defaultAudioSinkApi313 instanceof Ac4Util) {
                return new Ac4Util(new D0(jLongValue, jLongValue2, ((Number) ((Ac4Util) defaultAudioSinkApi313).RemoteActionCompatParcelizer).longValue()));
            }
            if (!(defaultAudioSinkApi313 instanceof codecNeedsDiscardChannelsWorkaround)) {
                throw new RenewEligibleCreator();
            }
            throw getMaximumEncodedRateBytesPerSecond.IconCompatParcelizer;
        } catch (getMaximumEncodedRateBytesPerSecond unused2) {
            if (str2 != null) {
                return str2;
            }
            return null;
        }
    }
}
