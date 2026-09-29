package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class loge implements printInternalError {
    private final DashMediaSourceUtcTimestampCallback RemoteActionCompatParcelizer;

    @setSdkPayload
    public loge(DashMediaSourceUtcTimestampCallback dashMediaSourceUtcTimestampCallback) {
        toMagicModuleMetaRepoModel.write(dashMediaSourceUtcTimestampCallback, "");
        this.RemoteActionCompatParcelizer = dashMediaSourceUtcTimestampCallback;
    }

    @Override // kotlin.printInternalError
    public final Object write(FlagSet flagSet) {
        this.RemoteActionCompatParcelizer.read(inferFileTypeFromUri.IconCompatParcelizer(flagSet));
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.printInternalError
    public final Object RemoteActionCompatParcelizer(String str) {
        long[] jArrMediaBrowserCompatItemReceiver = this.RemoteActionCompatParcelizer.MediaBrowserCompatItemReceiver(str);
        return new Pair(QBankStatsResponse.RemoteActionCompatParcelizer(jArrMediaBrowserCompatItemReceiver[0]), QBankStatsResponse.RemoteActionCompatParcelizer(jArrMediaBrowserCompatItemReceiver[1]));
    }

    @Override // kotlin.printInternalError
    public final Object IconCompatParcelizer(String str) {
        this.RemoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(str);
        return getShowPopup.INSTANCE;
    }
}
