package kotlin;

/* JADX INFO: loaded from: classes5.dex */
final class onKeyStatusChange<T> implements isDeniedByServerException<T> {
    private final ExoMediaDrmProvider AudioAttributesCompatParcelizer;
    private final isMediaDrmStateException<T, byte[]> IconCompatParcelizer;
    private final String RemoteActionCompatParcelizer;
    private final FrameworkMediaDrm read;
    private final DrmSessionManagerDrmSessionReference write;

    onKeyStatusChange(ExoMediaDrmProvider exoMediaDrmProvider, String str, DrmSessionManagerDrmSessionReference drmSessionManagerDrmSessionReference, isMediaDrmStateException<T, byte[]> ismediadrmstateexception, FrameworkMediaDrm frameworkMediaDrm) {
        this.AudioAttributesCompatParcelizer = exoMediaDrmProvider;
        this.RemoteActionCompatParcelizer = str;
        this.write = drmSessionManagerDrmSessionReference;
        this.IconCompatParcelizer = ismediadrmstateexception;
        this.read = frameworkMediaDrm;
    }

    @Override // kotlin.isDeniedByServerException
    public final void AudioAttributesCompatParcelizer(isNotProvisionedException<T> isnotprovisionedexception) {
        AudioAttributesCompatParcelizer(isnotprovisionedexception, new DummyExoMediaDrm() { // from class: o.adjustLicenseServerUrl
            @Override // kotlin.DummyExoMediaDrm
            public final void RemoteActionCompatParcelizer(Exception exc) {
            }
        });
    }

    @Override // kotlin.isDeniedByServerException
    public final void AudioAttributesCompatParcelizer(isNotProvisionedException<T> isnotprovisionedexception, DummyExoMediaDrm dummyExoMediaDrm) {
        this.read.read(ExoMediaDrmProvisionRequest.AudioAttributesImplApi21Parcelizer().read(this.AudioAttributesCompatParcelizer).RemoteActionCompatParcelizer((isNotProvisionedException<?>) isnotprovisionedexception).RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer).AudioAttributesCompatParcelizer((isMediaDrmStateException<?, byte[]>) this.IconCompatParcelizer).AudioAttributesCompatParcelizer(this.write).IconCompatParcelizer(), dummyExoMediaDrm);
    }

    final ExoMediaDrmProvider write() {
        return this.AudioAttributesCompatParcelizer;
    }
}
