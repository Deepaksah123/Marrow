package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class Id3DecoderFramePredicate implements getSubFrameCount {
    private final int IconCompatParcelizer;
    private final String RemoteActionCompatParcelizer;

    Id3DecoderFramePredicate(String str, int i) {
        this.RemoteActionCompatParcelizer = str;
        this.IconCompatParcelizer = i;
    }

    @Override // kotlin.getSubFrameCount
    public final long IconCompatParcelizer() {
        if (this.IconCompatParcelizer == 0) {
            return 0L;
        }
        String strAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer();
        try {
            return Long.valueOf(strAudioAttributesImplApi26Parcelizer).longValue();
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", strAudioAttributesImplApi26Parcelizer, "long"), e);
        }
    }

    @Override // kotlin.getSubFrameCount
    public final double read() {
        if (this.IconCompatParcelizer == 0) {
            return 0.0d;
        }
        String strAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer();
        try {
            return Double.valueOf(strAudioAttributesImplApi26Parcelizer).doubleValue();
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", strAudioAttributesImplApi26Parcelizer, "double"), e);
        }
    }

    @Override // kotlin.getSubFrameCount
    public final String RemoteActionCompatParcelizer() {
        if (this.IconCompatParcelizer == 0) {
            return "";
        }
        MediaBrowserCompatItemReceiver();
        return this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.getSubFrameCount
    public final boolean AudioAttributesCompatParcelizer() throws IllegalArgumentException {
        if (this.IconCompatParcelizer == 0) {
            return false;
        }
        String strAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer();
        if (getCharset.read.matcher(strAudioAttributesImplApi26Parcelizer).matches()) {
            return true;
        }
        if (getCharset.IconCompatParcelizer.matcher(strAudioAttributesImplApi26Parcelizer).matches()) {
            return false;
        }
        throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", strAudioAttributesImplApi26Parcelizer, "boolean"));
    }

    @Override // kotlin.getSubFrameCount
    public final int write() {
        return this.IconCompatParcelizer;
    }

    private void MediaBrowserCompatItemReceiver() {
        if (this.RemoteActionCompatParcelizer == null) {
            throw new IllegalArgumentException("Value is null, and cannot be converted to the desired type.");
        }
    }

    private String AudioAttributesImplApi26Parcelizer() {
        return RemoteActionCompatParcelizer().trim();
    }
}
