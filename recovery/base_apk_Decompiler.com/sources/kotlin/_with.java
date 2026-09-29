package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u0011\u0010\u0007\u001a\u00020\u0003*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/hasValueTypeDeserializer;", "", "p0", "Lo/AbstractDeserializer;", "read", "(Lo/hasValueTypeDeserializer;I)Lo/AbstractDeserializer;", "IconCompatParcelizer", "RemoteActionCompatParcelizer", "(Lo/hasValueTypeDeserializer;)Lo/AbstractDeserializer;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class _with {
    public static final AbstractDeserializer read(hasValueTypeDeserializer hasvaluetypedeserializer, int i) {
        AbstractDeserializer read = hasvaluetypedeserializer.getRead();
        int iMediaBrowserCompatCustomActionResultReceiver = findProperty.MediaBrowserCompatCustomActionResultReceiver(hasvaluetypedeserializer.getAudioAttributesCompatParcelizer());
        int i2 = iMediaBrowserCompatCustomActionResultReceiver - i;
        if (((i ^ iMediaBrowserCompatCustomActionResultReceiver) & (iMediaBrowserCompatCustomActionResultReceiver ^ i2)) < 0) {
            i2 = 0;
        }
        return read.subSequence(Math.max(0, i2), findProperty.MediaBrowserCompatCustomActionResultReceiver(hasvaluetypedeserializer.getAudioAttributesCompatParcelizer()));
    }

    public static final AbstractDeserializer IconCompatParcelizer(hasValueTypeDeserializer hasvaluetypedeserializer, int i) {
        AbstractDeserializer read = hasvaluetypedeserializer.getRead();
        int iAudioAttributesImplApi26Parcelizer = findProperty.AudioAttributesImplApi26Parcelizer(hasvaluetypedeserializer.getAudioAttributesCompatParcelizer());
        int iAudioAttributesImplApi26Parcelizer2 = findProperty.AudioAttributesImplApi26Parcelizer(hasvaluetypedeserializer.getAudioAttributesCompatParcelizer());
        int length = iAudioAttributesImplApi26Parcelizer2 + i;
        if (((i ^ length) & (iAudioAttributesImplApi26Parcelizer2 ^ length)) < 0) {
            length = hasvaluetypedeserializer.AudioAttributesCompatParcelizer().length();
        }
        return read.subSequence(iAudioAttributesImplApi26Parcelizer, Math.min(length, hasvaluetypedeserializer.AudioAttributesCompatParcelizer().length()));
    }

    public static final AbstractDeserializer RemoteActionCompatParcelizer(hasValueTypeDeserializer hasvaluetypedeserializer) {
        return hasvaluetypedeserializer.getRead().read(hasvaluetypedeserializer.getAudioAttributesCompatParcelizer());
    }
}
