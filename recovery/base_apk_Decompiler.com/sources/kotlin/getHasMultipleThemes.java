package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class getHasMultipleThemes extends getDecoderName<ThemeStateCompanion<?>> {
    public static int RemoteActionCompatParcelizer;
    public static int write;
    public long AudioAttributesCompatParcelizer = -1;
    public SampleVideos<? super getShowPopup> read;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getDecoderName
    /* JADX INFO: renamed from: read, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean RemoteActionCompatParcelizer(ThemeStateCompanion<?> themeStateCompanion) {
        if (this.AudioAttributesCompatParcelizer >= 0) {
            return false;
        }
        this.AudioAttributesCompatParcelizer = themeStateCompanion.AudioAttributesImplApi26Parcelizer();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getDecoderName
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public SampleVideos<getShowPopup>[] read(ThemeStateCompanion<?> themeStateCompanion) {
        getCollegeId.write();
        long j = this.AudioAttributesCompatParcelizer;
        this.AudioAttributesCompatParcelizer = -1L;
        this.read = null;
        return themeStateCompanion.read(j);
    }

    public static int read() {
        int i = write;
        int i2 = i % 9936044;
        write = i + 1;
        if (i2 != 0) {
            return RemoteActionCompatParcelizer;
        }
        int i3 = (int) Runtime.getRuntime().totalMemory();
        RemoteActionCompatParcelizer = i3;
        return i3;
    }
}
