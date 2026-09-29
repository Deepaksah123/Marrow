package kotlin;

/* JADX INFO: loaded from: classes3.dex */
final class MatroskaExtractorFlags extends handleBlockAddIDExtraData {
    private /* synthetic */ assertOutputInitialized RemoteActionCompatParcelizer;

    MatroskaExtractorFlags(assertOutputInitialized assertoutputinitialized) {
        this.RemoteActionCompatParcelizer = assertoutputinitialized;
    }

    @Override // kotlin.handleBlockAddIDExtraData
    public final void read() {
        assertOutputInitialized assertoutputinitialized = this.RemoteActionCompatParcelizer;
        if (assertoutputinitialized.MediaBrowserCompatSearchResultReceiver != null) {
            assertoutputinitialized.write.read("Unbind from service.", new Object[0]);
            assertOutputInitialized assertoutputinitialized2 = this.RemoteActionCompatParcelizer;
            assertoutputinitialized2.IconCompatParcelizer.unbindService(assertoutputinitialized2.RatingCompat);
            this.RemoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer = false;
            this.RemoteActionCompatParcelizer.MediaBrowserCompatSearchResultReceiver = null;
            this.RemoteActionCompatParcelizer.RatingCompat = null;
        }
        this.RemoteActionCompatParcelizer.read();
    }
}
