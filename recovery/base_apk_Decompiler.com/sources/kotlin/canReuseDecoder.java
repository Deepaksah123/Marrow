package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class canReuseDecoder extends MagicModuleUseCase implements getCreatedOnDateMs {
    private /* synthetic */ setPassthroughBufferDurationUs RemoteActionCompatParcelizer;
    private /* synthetic */ DefaultAudioSinkApi31 read;
    private /* synthetic */ DecoderAudioRendererAudioSinkListener write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public canReuseDecoder(DefaultAudioSinkApi31 defaultAudioSinkApi31, setPassthroughBufferDurationUs setpassthroughbufferdurationus, DecoderAudioRendererAudioSinkListener decoderAudioRendererAudioSinkListener) {
        super(0);
        this.read = defaultAudioSinkApi31;
        this.RemoteActionCompatParcelizer = setpassthroughbufferdurationus;
        this.write = decoderAudioRendererAudioSinkListener;
    }

    @Override // kotlin.getCreatedOnDateMs
    public final Object invoke() {
        String iconCompatParcelizer;
        String str;
        DefaultAudioSinkApi31 defaultAudioSinkApi31 = this.read;
        setPassthroughBufferDurationUs setpassthroughbufferdurationus = this.RemoteActionCompatParcelizer;
        if (defaultAudioSinkApi31 instanceof codecNeedsDiscardChannelsWorkaround) {
            updateSessionsWithTimelineChange updatesessionswithtimelinechange = (updateSessionsWithTimelineChange) ((codecNeedsDiscardChannelsWorkaround) defaultAudioSinkApi31).IconCompatParcelizer;
            if (updatesessionswithtimelinechange instanceof updateCurrentSession) {
                str = "ApiKeyExpired";
            } else if (updatesessionswithtimelinechange instanceof getSessionForMediaPeriodId) {
                str = "ApiKeyNotFound";
            } else if (updatesessionswithtimelinechange instanceof belongsToSession) {
                str = "ApiKeyRequired";
            } else if (updatesessionswithtimelinechange instanceof finishAllSessions) {
                str = "ClientTimeout";
            } else if (updatesessionswithtimelinechange instanceof updateSessionsWithDiscontinuity) {
                str = "Failed";
            } else if (updatesessionswithtimelinechange instanceof resolveWindowIndexToNewTimeline) {
                str = "HeaderRestricted";
            } else if (updatesessionswithtimelinechange instanceof maybeSetWindowSequenceNumber) {
                str = "InstallationMethodRestricted";
            } else if (updatesessionswithtimelinechange instanceof canReportPendingFormatUpdate) {
                str = "NetworkError";
            } else if (updatesessionswithtimelinechange instanceof finishCurrentSession) {
                str = "NotAvailableForCrawlBots";
            } else if (updatesessionswithtimelinechange instanceof getDrmInitData) {
                str = "NotAvailableWithoutUA";
            } else if (updatesessionswithtimelinechange instanceof getStreamType) {
                str = "OriginNotAvailable";
            } else if (updatesessionswithtimelinechange instanceof getLanguageAndRegion) {
                str = "PackageNotAuthorized";
            } else if (updatesessionswithtimelinechange instanceof getNetworkType) {
                str = "RequestCannotBeParsed";
            } else if (updatesessionswithtimelinechange instanceof getDrmType) {
                str = "RequestTimeout";
            } else if (updatesessionswithtimelinechange instanceof maybeAddSessions) {
                str = "ResponseCannotBeParsed";
            } else if (updatesessionswithtimelinechange instanceof maybeReportPlaybackError) {
                str = "SubscriptionNotActive";
            } else if (updatesessionswithtimelinechange instanceof maybeReportPlaybackStateChange) {
                str = "TooManyRequest";
            } else if (updatesessionswithtimelinechange instanceof getTrackChangeReason) {
                str = "UnknownError";
            } else if (updatesessionswithtimelinechange instanceof maybeUpdateTimelineMetadata) {
                str = "UnsupportedVersion";
            } else if (updatesessionswithtimelinechange instanceof maybeUpdateAudioFormat) {
                str = "WrongRegion";
            } else if (updatesessionswithtimelinechange instanceof isFinishedAtEventTime) {
                str = "InvalidProxyIntegrationHeaders";
            } else if (updatesessionswithtimelinechange instanceof MediaMetricsListener) {
                str = "InvalidProxyIntegrationSecret";
            } else {
                if (!(updatesessionswithtimelinechange instanceof getErrorInfo)) {
                    throw new RenewEligibleCreator();
                }
                str = "ProxyIntegrationSecretEnvironmentMismatch";
            }
            setpassthroughbufferdurationus.IconCompatParcelizer = str;
        }
        setPassthroughBufferDurationUs setpassthroughbufferdurationus2 = this.RemoteActionCompatParcelizer;
        DefaultAudioSinkApi31 defaultAudioSinkApi312 = this.read;
        if (defaultAudioSinkApi312 instanceof Ac4Util) {
            iconCompatParcelizer = ((access402) ((Ac4Util) defaultAudioSinkApi312).RemoteActionCompatParcelizer).getMediaBrowserCompatItemReceiver();
        } else {
            if (!(defaultAudioSinkApi312 instanceof codecNeedsDiscardChannelsWorkaround)) {
                throw new RenewEligibleCreator();
            }
            iconCompatParcelizer = ((updateSessionsWithTimelineChange) ((codecNeedsDiscardChannelsWorkaround) defaultAudioSinkApi312).IconCompatParcelizer).getIconCompatParcelizer();
        }
        setpassthroughbufferdurationus2.AudioAttributesCompatParcelizer = iconCompatParcelizer;
        if (this.read instanceof Ac4Util) {
            onOutputStreamOffsetUsChanged onoutputstreamoffsetuschanged = this.write.AudioAttributesCompatParcelizer;
            synchronized (onoutputstreamoffsetuschanged) {
                onoutputstreamoffsetuschanged.AudioAttributesCompatParcelizer.IconCompatParcelizer(IntermediateLoginResponseBody.RemoteActionCompatParcelizer());
            }
        }
        this.write.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer);
        return getShowPopup.INSTANCE;
    }
}
