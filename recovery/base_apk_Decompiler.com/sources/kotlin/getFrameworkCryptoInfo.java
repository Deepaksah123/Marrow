package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class getFrameworkCryptoInfo {
    private ensureUpdated AudioAttributesCompatParcelizer;
    private boolean RemoteActionCompatParcelizer;

    public getFrameworkCryptoInfo(ensureUpdated ensureupdated, boolean z) {
        this.AudioAttributesCompatParcelizer = ensureupdated;
        this.RemoteActionCompatParcelizer = z;
    }

    public final DefaultAudioSinkApi31 RemoteActionCompatParcelizer(dequeueOutputBuffer dequeueoutputbuffer, Integer num, TeeAudioProcessorAudioBufferSink teeAudioProcessorAudioBufferSink, CreationTime creationTime) {
        DefaultAudioSinkApi31 codecneedsdiscardchannelsworkaround;
        Long lRemoteActionCompatParcelizer = buildAudioTrackWithRetry.RemoteActionCompatParcelizer();
        Long lValueOf = null;
        Long lValueOf2 = num != null ? Long.valueOf(num.intValue()) : null;
        Long lValueOf3 = (lRemoteActionCompatParcelizer == null || lValueOf2 == null) ? null : Long.valueOf(lValueOf2.longValue() + lRemoteActionCompatParcelizer.longValue());
        byte[] bArr = ((releaseOutputBufferInternal) this.AudioAttributesCompatParcelizer).write(dequeueoutputbuffer, num, num, teeAudioProcessorAudioBufferSink, creationTime).IconCompatParcelizer;
        createInputBuffer createinputbuffer = new createInputBuffer(bArr, this.RemoteActionCompatParcelizer);
        if (bArr == null) {
            codecneedsdiscardchannelsworkaround = new codecNeedsDiscardChannelsWorkaround(new canReportPendingFormatUpdate(null, 1, null));
        } else {
            Object gettrackchangereason = createinputbuffer.AudioAttributesCompatParcelizer;
            access402 access402Var = createinputbuffer.write;
            if (gettrackchangereason != null || access402Var == null) {
                if (gettrackchangereason == null) {
                    gettrackchangereason = new getTrackChangeReason(null, null, 3, null);
                }
                codecneedsdiscardchannelsworkaround = new codecNeedsDiscardChannelsWorkaround(gettrackchangereason);
            } else {
                codecneedsdiscardchannelsworkaround = new Ac4Util(access402Var);
            }
        }
        if (codecneedsdiscardchannelsworkaround instanceof Ac4Util) {
            return codecneedsdiscardchannelsworkaround;
        }
        if (!(codecneedsdiscardchannelsworkaround instanceof codecNeedsDiscardChannelsWorkaround)) {
            throw new RenewEligibleCreator();
        }
        Object finishallsessions = (updateSessionsWithTimelineChange) ((codecNeedsDiscardChannelsWorkaround) codecneedsdiscardchannelsworkaround).IconCompatParcelizer;
        if (finishallsessions instanceof canReportPendingFormatUpdate) {
            if (lValueOf3 != null) {
                long jLongValue = lValueOf3.longValue();
                Long lRemoteActionCompatParcelizer2 = buildAudioTrackWithRetry.RemoteActionCompatParcelizer();
                if (lRemoteActionCompatParcelizer2 != null) {
                    lValueOf = Long.valueOf(jLongValue - lRemoteActionCompatParcelizer2.longValue());
                }
            }
            if (lValueOf != null && lValueOf.longValue() < 0) {
                finishallsessions = new finishAllSessions();
            }
        }
        return new codecNeedsDiscardChannelsWorkaround(finishallsessions);
    }
}
