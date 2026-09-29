package kotlin;

import java.util.Map;
import kotlin.C0177getRfBanners;

/* JADX INFO: loaded from: classes2.dex */
public final class maybeUpdateMaxRebufferTimeMs extends MagicModuleUseCase implements getCreatedOnDateMs {
    private /* synthetic */ Integer AudioAttributesCompatParcelizer = null;
    private /* synthetic */ getAnswerMap AudioAttributesImplBaseParcelizer;
    private /* synthetic */ Long IconCompatParcelizer;
    private /* synthetic */ getAnswerMap MediaBrowserCompatItemReceiver;
    private /* synthetic */ String RemoteActionCompatParcelizer;
    private /* synthetic */ Map read;
    private /* synthetic */ PlayerId write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public maybeUpdateMaxRebufferTimeMs(PlayerId playerId, Long l, Integer num, Map map, String str, getAnswerMap getanswermap, getAnswerMap getanswermap2) {
        super(0);
        this.write = playerId;
        this.IconCompatParcelizer = l;
        this.read = map;
        this.RemoteActionCompatParcelizer = str;
        this.AudioAttributesImplBaseParcelizer = getanswermap;
        this.MediaBrowserCompatItemReceiver = getanswermap2;
    }

    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, java.lang.String, o.MagicModuleRepositoryImplExternalSyntheticLambda0] */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // kotlin.getCreatedOnDateMs
    public final Object invoke() {
        DefaultAudioSinkApi31 defaultAudioSinkApi31;
        ?? r6;
        int i;
        int i2;
        Object obj;
        boolean z;
        boolean z2;
        Object gettrackchangereason;
        DefaultAudioSinkApi31 defaultAudioSinkApi312 = (DefaultAudioSinkApi31) this.write.read.RemoteActionCompatParcelizer();
        Long l = this.IconCompatParcelizer;
        Integer num = this.AudioAttributesCompatParcelizer;
        Map map = this.read;
        String str = this.RemoteActionCompatParcelizer;
        getAnswerMap getanswermap = this.AudioAttributesImplBaseParcelizer;
        getAnswerMap getanswermap2 = this.MediaBrowserCompatItemReceiver;
        if (defaultAudioSinkApi312 instanceof Ac4Util) {
            DecoderAudioRendererAudioSinkListener decoderAudioRendererAudioSinkListener = (DecoderAudioRendererAudioSinkListener) ((Ac4Util) defaultAudioSinkApi312).RemoteActionCompatParcelizer;
            Long lValueOf = num != null ? Long.valueOf(num.intValue()) : null;
            writeBuffer writebuffer = new writeBuffer((l == null || lValueOf == null) ? null : Long.valueOf(lValueOf.longValue() + l.longValue()));
            defaultAudioSinkApi31 = defaultAudioSinkApi312;
            setPassthroughBufferDurationUs setpassthroughbufferdurationus = new setPassthroughBufferDurationUs(null, null, num, l, null, null, null, null, null, 1003);
            Long lIconCompatParcelizer = writebuffer.IconCompatParcelizer();
            i2 = 0;
            DefaultAudioSinkApi31 defaultAudioSinkApi31Write = onProcessedStreamChange.write(lIconCompatParcelizer != null ? lIconCompatParcelizer.longValue() : Long.MAX_VALUE, false, new isDiagonal(decoderAudioRendererAudioSinkListener, map, str, writebuffer, setpassthroughbufferdurationus));
            if (defaultAudioSinkApi31Write instanceof Ac4Util) {
                i = 1;
                z = false;
            } else {
                if (!(defaultAudioSinkApi31Write instanceof codecNeedsDiscardChannelsWorkaround)) {
                    throw new RenewEligibleCreator();
                }
                updatePaddingBuffer updatepaddingbuffer = (updatePaddingBuffer) ((codecNeedsDiscardChannelsWorkaround) defaultAudioSinkApi31Write).IconCompatParcelizer;
                if (updatepaddingbuffer instanceof MpegAudioUtil) {
                    gettrackchangereason = new finishAllSessions();
                    i = 1;
                    z2 = false;
                } else {
                    if (!(updatepaddingbuffer instanceof getPreSkipSamples)) {
                        throw new RenewEligibleCreator();
                    }
                    i = 1;
                    z2 = false;
                    gettrackchangereason = new getTrackChangeReason(null, updatepaddingbuffer.read.toString(), 1, null);
                }
                defaultAudioSinkApi31Write = new codecNeedsDiscardChannelsWorkaround(gettrackchangereason);
                z = z2;
            }
            DefaultAudioSinkApi31 defaultAudioSinkApi31Write2 = DefaultAudioSinkConfiguration.write(defaultAudioSinkApi31Write);
            setpassthroughbufferdurationus.MediaBrowserCompatItemReceiver = buildAudioTrackWithRetry.RemoteActionCompatParcelizer();
            DefaultAudioSinkConfiguration.AudioAttributesCompatParcelizer(getFramesPerEncodedSample.read(new maybeUpdateLatency(new canReuseDecoder(defaultAudioSinkApi31Write2, setpassthroughbufferdurationus, decoderAudioRendererAudioSinkListener))));
            if (defaultAudioSinkApi31Write2 instanceof Ac4Util) {
                getanswermap.invoke((access402) ((Ac4Util) defaultAudioSinkApi31Write2).RemoteActionCompatParcelizer);
                r6 = z;
            } else {
                if (!(defaultAudioSinkApi31Write2 instanceof codecNeedsDiscardChannelsWorkaround)) {
                    throw new RenewEligibleCreator();
                }
                getanswermap2.invoke((updateSessionsWithTimelineChange) ((codecNeedsDiscardChannelsWorkaround) defaultAudioSinkApi31Write2).IconCompatParcelizer);
                r6 = z;
            }
        } else {
            defaultAudioSinkApi31 = defaultAudioSinkApi312;
            r6 = 0;
            i = 1;
            i2 = 0;
        }
        getAnswerMap getanswermap3 = this.MediaBrowserCompatItemReceiver;
        DefaultAudioSinkApi31 defaultAudioSinkApi313 = defaultAudioSinkApi31;
        if (defaultAudioSinkApi313 instanceof codecNeedsDiscardChannelsWorkaround) {
            Throwable th = (Throwable) ((codecNeedsDiscardChannelsWorkaround) defaultAudioSinkApi313).IconCompatParcelizer;
            StringBuilder sb = new StringBuilder("Internal unexpected error occurred. Please contact support.\n");
            sb.append(th.toString());
            sb.append('\n');
            try {
                C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
                obj = C0177getRfBanners.read(th.getStackTrace());
            } catch (Throwable th2) {
                C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer2 = C0177getRfBanners.IconCompatParcelizer;
                obj = C0177getRfBanners.read(SdkPayloadData.write(th2));
            }
            Object[] objArr = (Object[]) setForHeaderData.read(DefaultAudioSinkConfiguration.AudioAttributesCompatParcelizer(obj), r6);
            if (objArr == null) {
                objArr = new StackTraceElement[i2];
            }
            sb.append(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(getOrderDetails.AudioAttributesImplBaseParcelizer(objArr), "\n", null, null, 0, null, getSinkFormatSupport.RemoteActionCompatParcelizer, 30));
            sb.append('\n');
            getanswermap3.invoke(new getTrackChangeReason(r6, sb.toString(), i, r6));
        }
        return getShowPopup.INSTANCE;
    }
}
