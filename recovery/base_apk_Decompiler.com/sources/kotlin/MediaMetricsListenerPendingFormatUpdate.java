package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class MediaMetricsListenerPendingFormatUpdate extends MagicModuleUseCase implements getCreatedOnDateMs {
    private /* synthetic */ getMeanElapsedTimeMs RemoteActionCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaMetricsListenerPendingFormatUpdate(getMeanElapsedTimeMs getmeanelapsedtimems) {
        super(0);
        this.RemoteActionCompatParcelizer = getmeanelapsedtimems;
    }

    @Override // kotlin.getCreatedOnDateMs
    public final Object invoke() {
        DefaultAudioSinkApi31 codecneedsdiscardchannelsworkaround;
        byte[] bArr;
        getMeanElapsedTimeMs getmeanelapsedtimems = this.RemoteActionCompatParcelizer;
        getPacketDurationUs getpacketdurationus = getmeanelapsedtimems.RemoteActionCompatParcelizer;
        try {
            bArr = ((releaseOutputBufferInternal) getpacketdurationus.read).write(new adjustRate(getpacketdurationus.IconCompatParcelizer), null, null, setVersion.write, CryptoConfig.write).IconCompatParcelizer;
        } catch (Throwable th) {
            codecneedsdiscardchannelsworkaround = new codecNeedsDiscardChannelsWorkaround(th);
        }
        if (bArr == null) {
            throw new Exception();
        }
        codecneedsdiscardchannelsworkaround = new Ac4Util(bArr);
        if (codecneedsdiscardchannelsworkaround instanceof Ac4Util) {
            byte[] bArr2 = (byte[]) ((Ac4Util) codecneedsdiscardchannelsworkaround).RemoteActionCompatParcelizer;
            codecneedsdiscardchannelsworkaround = ((maybeUpdateTextFormat) getmeanelapsedtimems.read).AudioAttributesCompatParcelizer(bArr2, getmeanelapsedtimems.IconCompatParcelizer);
            if (codecneedsdiscardchannelsworkaround instanceof Ac4Util) {
                codecneedsdiscardchannelsworkaround = new Ac4Util(setAction.write((createOutputBuffer) ((Ac4Util) codecneedsdiscardchannelsworkaround).RemoteActionCompatParcelizer, bArr2));
            } else if (!(codecneedsdiscardchannelsworkaround instanceof codecNeedsDiscardChannelsWorkaround)) {
                throw new RenewEligibleCreator();
            }
        } else if (!(codecneedsdiscardchannelsworkaround instanceof codecNeedsDiscardChannelsWorkaround)) {
            throw new RenewEligibleCreator();
        }
        if (codecneedsdiscardchannelsworkaround instanceof Ac4Util) {
            Ac4Util ac4Util = (Ac4Util) codecneedsdiscardchannelsworkaround;
            if (!(((createOutputBuffer) ((Pair) ac4Util.RemoteActionCompatParcelizer).write()).IconCompatParcelizer instanceof getMeanRebufferTimeMs)) {
                codecneedsdiscardchannelsworkaround = new codecNeedsDiscardChannelsWorkaround(new Exception(""));
            }
        } else if (!(codecneedsdiscardchannelsworkaround instanceof codecNeedsDiscardChannelsWorkaround)) {
            throw new RenewEligibleCreator();
        }
        if (codecneedsdiscardchannelsworkaround instanceof Ac4Util) {
            Pair pair = (Pair) ((Ac4Util) codecneedsdiscardchannelsworkaround).RemoteActionCompatParcelizer;
            getMeanBandwidth getmeanbandwidth = getmeanelapsedtimems.write;
            byte[] bArr3 = (byte[]) pair.IconCompatParcelizer();
            String strWrite = getmeanelapsedtimems.AudioAttributesCompatParcelizer.write();
            getSkippedFrames getskippedframes = (getSkippedFrames) getmeanbandwidth;
            synchronized (getskippedframes) {
                onProcessedStreamChange.read(new buildNativeOrderByteArray(getskippedframes, strWrite, bArr3));
            }
        }
        return getShowPopup.INSTANCE;
    }
}
