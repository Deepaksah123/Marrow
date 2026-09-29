package kotlin;

import java.util.List;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class onProcessedStreamChange {
    public static /* synthetic */ DefaultAudioSinkApi31 AudioAttributesCompatParcelizer(long j, getAnswerMap getanswermap, int i) {
        if ((i & 1) != 0) {
            j = 1000;
        }
        return write(j, true, getanswermap);
    }

    public static final DefaultAudioSinkApi31 write(long j, boolean z, getAnswerMap getanswermap) {
        Object getpreskipsamples;
        DefaultAudioSinkApi31 defaultAudioSinkApi31AudioAttributesCompatParcelizer = DefaultAudioSinkConfiguration.AudioAttributesCompatParcelizer(r8lambdamCEi04OcFi8gu0FD463twzV2nG8.write(j, true, z, new setMinPcmBufferDurationUs(getanswermap)));
        if (defaultAudioSinkApi31AudioAttributesCompatParcelizer instanceof Ac4Util) {
            return defaultAudioSinkApi31AudioAttributesCompatParcelizer;
        }
        if (!(defaultAudioSinkApi31AudioAttributesCompatParcelizer instanceof codecNeedsDiscardChannelsWorkaround)) {
            throw new RenewEligibleCreator();
        }
        Throwable th = (Throwable) ((codecNeedsDiscardChannelsWorkaround) defaultAudioSinkApi31AudioAttributesCompatParcelizer).IconCompatParcelizer;
        if (th instanceof parseMpegAudioFrameSampleCount) {
            List list = ((parseMpegAudioFrameSampleCount) th).IconCompatParcelizer;
            Throwable cause = th.getCause();
            toMagicModuleMetaRepoModel.write((Object) cause);
            getpreskipsamples = new MpegAudioUtil((TimeoutException) cause);
        } else {
            getpreskipsamples = new getPreSkipSamples(th);
        }
        return new codecNeedsDiscardChannelsWorkaround(getpreskipsamples);
    }

    public static DefaultAudioSinkApi31 read(getCreatedOnDateMs getcreatedondatems) {
        DefaultAudioSinkApi31 defaultAudioSinkApi31AudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(1000L, new getDecoderInfos(getcreatedondatems), 6);
        if (defaultAudioSinkApi31AudioAttributesCompatParcelizer instanceof Ac4Util) {
            return defaultAudioSinkApi31AudioAttributesCompatParcelizer;
        }
        if (defaultAudioSinkApi31AudioAttributesCompatParcelizer instanceof codecNeedsDiscardChannelsWorkaround) {
            return new codecNeedsDiscardChannelsWorkaround(((updatePaddingBuffer) ((codecNeedsDiscardChannelsWorkaround) defaultAudioSinkApi31AudioAttributesCompatParcelizer).IconCompatParcelizer).read);
        }
        throw new RenewEligibleCreator();
    }
}
