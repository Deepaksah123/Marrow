package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class bind implements BundledChunkExtractorExternalSyntheticLambda0 {
    private getSegmentNum IconCompatParcelizer;
    private getSegmentUrl write;

    @setSdkPayload
    public bind(getSegmentUrl getsegmenturl, getSegmentNum getsegmentnum) {
        this.write = getsegmenturl;
        this.IconCompatParcelizer = getsegmentnum;
    }

    @Override // kotlin.BundledChunkExtractorExternalSyntheticLambda0
    public final String RemoteActionCompatParcelizer(String str) {
        return parseDolbyChannelConfiguration.AudioAttributesCompatParcelizer((CharSequence) str) ? "" : this.write.AudioAttributesImplBaseParcelizer(str);
    }

    @Override // kotlin.BundledChunkExtractorExternalSyntheticLambda0
    public final String RemoteActionCompatParcelizer(String str, String str2) {
        return this.IconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(str, str2);
    }
}
