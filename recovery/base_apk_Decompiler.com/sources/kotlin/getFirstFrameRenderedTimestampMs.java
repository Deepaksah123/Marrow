package kotlin;

/* JADX INFO: loaded from: classes4.dex */
final class getFirstFrameRenderedTimestampMs extends ThemeStateCompanion<Integer> implements setUpdatedStatus<Integer> {
    public getFirstFrameRenderedTimestampMs(int i) {
        super(1, Integer.MAX_VALUE, setAddressLine2.AudioAttributesCompatParcelizer);
        RemoteActionCompatParcelizer(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.setUpdatedStatus
    /* JADX INFO: renamed from: RatingCompat, reason: merged with bridge method [inline-methods] */
    public Integer IconCompatParcelizer() {
        int iIntValue;
        synchronized (this) {
            iIntValue = MediaBrowserCompatCustomActionResultReceiver().intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    public final boolean IconCompatParcelizer(int i) {
        boolean zRemoteActionCompatParcelizer;
        synchronized (this) {
            zRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(Integer.valueOf(MediaBrowserCompatCustomActionResultReceiver().intValue() + i));
        }
        return zRemoteActionCompatParcelizer;
    }
}
