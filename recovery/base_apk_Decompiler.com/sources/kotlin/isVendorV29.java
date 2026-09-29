package kotlin;

/* JADX INFO: loaded from: classes3.dex */
final class isVendorV29 {
    private final onInputBufferAvailable<DrmUtilApi18> AudioAttributesCompatParcelizer;
    private isDeniedByServerException<getWrappedMetadataBytes> IconCompatParcelizer;
    private final String RemoteActionCompatParcelizer;

    static {
        MediaCodecRendererDecoderInitializationException.IconCompatParcelizer();
    }

    isVendorV29(onInputBufferAvailable<DrmUtilApi18> oninputbufferavailable, String str) {
        this.RemoteActionCompatParcelizer = str;
        this.AudioAttributesCompatParcelizer = oninputbufferavailable;
    }

    public final void write(getWrappedMetadataBytes getwrappedmetadatabytes) {
        if (IconCompatParcelizer()) {
            this.IconCompatParcelizer.AudioAttributesCompatParcelizer(isNotProvisionedException.AudioAttributesCompatParcelizer(getwrappedmetadatabytes));
        }
    }

    private boolean IconCompatParcelizer() {
        DrmUtilApi18 drmUtilApi18Write;
        if (this.IconCompatParcelizer == null && (drmUtilApi18Write = this.AudioAttributesCompatParcelizer.write()) != null) {
            this.IconCompatParcelizer = drmUtilApi18Write.write(this.RemoteActionCompatParcelizer, DrmSessionManagerDrmSessionReference.IconCompatParcelizer("proto"), new isMediaDrmStateException() { // from class: o.lambdasortByScore3
                @Override // kotlin.isMediaDrmStateException
                public final Object AudioAttributesCompatParcelizer(Object obj) {
                    return ((getWrappedMetadataBytes) obj).onPause();
                }
            });
        }
        return this.IconCompatParcelizer != null;
    }
}
