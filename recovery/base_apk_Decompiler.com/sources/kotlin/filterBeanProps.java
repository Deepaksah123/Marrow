package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0010"}, d2 = {"Lo/filterBeanProps;", "Lo/buildBuilderBasedDeserializer;", "", "p0", "Lo/constructSetterlessProperty;", "p1", "<init>", "(Ljava/lang/CharSequence;Lo/constructSetterlessProperty;)V", "", "AudioAttributesImplApi26Parcelizer", "(I)I", "RemoteActionCompatParcelizer", "read", "AudioAttributesCompatParcelizer", "write", "Ljava/lang/CharSequence;", "Lo/constructSetterlessProperty;", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class filterBeanProps implements buildBuilderBasedDeserializer {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final constructSetterlessProperty IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final CharSequence RemoteActionCompatParcelizer;

    public filterBeanProps(CharSequence charSequence, constructSetterlessProperty constructsetterlessproperty) {
        this.RemoteActionCompatParcelizer = charSequence;
        this.IconCompatParcelizer = constructsetterlessproperty;
    }

    @Override // kotlin.buildBuilderBasedDeserializer
    public final int AudioAttributesImplApi26Parcelizer(int p0) {
        do {
            p0 = this.IconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(p0);
            if (p0 == -1) {
                return -1;
            }
        } while (Character.isWhitespace(this.RemoteActionCompatParcelizer.charAt(p0)));
        return p0;
    }

    @Override // kotlin.buildBuilderBasedDeserializer
    public final int RemoteActionCompatParcelizer(int p0) {
        do {
            p0 = this.IconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(p0);
            if (p0 == -1 || p0 == 0) {
                return -1;
            }
        } while (Character.isWhitespace(this.RemoteActionCompatParcelizer.charAt(p0 - 1)));
        return p0;
    }

    @Override // kotlin.buildBuilderBasedDeserializer
    public final int read(int p0) {
        do {
            p0 = this.IconCompatParcelizer.MediaBrowserCompatItemReceiver(p0);
            if (p0 == -1 || p0 == this.RemoteActionCompatParcelizer.length()) {
                return -1;
            }
        } while (Character.isWhitespace(this.RemoteActionCompatParcelizer.charAt(p0)));
        return p0;
    }

    @Override // kotlin.buildBuilderBasedDeserializer
    public final int AudioAttributesCompatParcelizer(int p0) {
        do {
            p0 = this.IconCompatParcelizer.MediaBrowserCompatItemReceiver(p0);
            if (p0 == -1) {
                return -1;
            }
        } while (Character.isWhitespace(this.RemoteActionCompatParcelizer.charAt(p0 - 1)));
        return p0;
    }
}
