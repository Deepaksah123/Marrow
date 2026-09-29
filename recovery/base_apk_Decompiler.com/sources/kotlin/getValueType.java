package kotlin;

import kotlin.Metadata;
import kotlin.replace;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lo/getValueType;", "", "<init>", "()V", "Lo/JsonParserDelegate;", "p0", "Lo/deserializeFromNumber;", "p1", "", "write", "(Lo/JsonParserDelegate;Lo/deserializeFromNumber;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getValueType {
    public static final getValueType INSTANCE = new getValueType();

    private getValueType() {
    }

    public final void write(JsonParserDelegate p0, deserializeFromNumber p1) {
        long jAudioAttributesCompatParcelizer;
        boolean z = p1.RemoteActionCompatParcelizer() && !paramName.write(p1.getIconCompatParcelizer().getMediaBrowserCompatCustomActionResultReceiver(), paramName.INSTANCE.IconCompatParcelizer());
        if (z) {
            long j = -1;
            WritableTypeIdInclusion writableTypeIdInclusion = BufferRecycler.read(getReferencedType.INSTANCE.write(), calloc.write((((long) Float.floatToRawIntBits((int) p1.getRead())) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) Float.floatToRawIntBits((int) (p1.getRead() >> 32))) << 32)));
            p0.IconCompatParcelizer();
            JsonParserDelegate.RemoteActionCompatParcelizer$default(p0, writableTypeIdInclusion, 0, 2, null);
        }
        _findPropertyUnwrapper audioAttributesCompatParcelizer = p1.getIconCompatParcelizer().getRead().getAudioAttributesCompatParcelizer();
        renameAll mediaMetadataCompat = audioAttributesCompatParcelizer.getMediaMetadataCompat();
        if (mediaMetadataCompat == null) {
            mediaMetadataCompat = renameAll.INSTANCE.write();
        }
        renameAll renameall = mediaMetadataCompat;
        nopInstance mediaBrowserCompatSearchResultReceiver = audioAttributesCompatParcelizer.getMediaBrowserCompatSearchResultReceiver();
        if (mediaBrowserCompatSearchResultReceiver == null) {
            mediaBrowserCompatSearchResultReceiver = nopInstance.INSTANCE.RemoteActionCompatParcelizer();
        }
        nopInstance nopinstance = mediaBrowserCompatSearchResultReceiver;
        findTypeResolver onCustomAction = audioAttributesCompatParcelizer.getOnCustomAction();
        if (onCustomAction == null) {
            onCustomAction = findTypeResolver.INSTANCE;
        }
        findViews findviews = onCustomAction;
        try {
            Instantiatable instantiatableIconCompatParcelizer = audioAttributesCompatParcelizer.IconCompatParcelizer();
            if (instantiatableIconCompatParcelizer != null) {
                p1.getWrite().RemoteActionCompatParcelizer(p0, instantiatableIconCompatParcelizer, (64 & 4) != 0 ? Float.NaN : audioAttributesCompatParcelizer.getIconCompatParcelizer() != replace.read.INSTANCE ? audioAttributesCompatParcelizer.getIconCompatParcelizer().getWrite() : 1.0f, (64 & 8) != 0 ? null : nopinstance, (64 & 16) != 0 ? null : renameall, (64 & 32) != 0 ? null : findviews, (64 & 64) != 0 ? findSetterInfo.INSTANCE.write() : 0);
            } else {
                if (audioAttributesCompatParcelizer.getIconCompatParcelizer() != replace.read.INSTANCE) {
                    jAudioAttributesCompatParcelizer = audioAttributesCompatParcelizer.getIconCompatParcelizer().getIconCompatParcelizer();
                } else {
                    jAudioAttributesCompatParcelizer = switchToNext.INSTANCE.AudioAttributesCompatParcelizer();
                }
                p1.getWrite().RemoteActionCompatParcelizer(p0, (32 & 2) != 0 ? switchToNext.INSTANCE.AudioAttributesImplApi21Parcelizer() : jAudioAttributesCompatParcelizer, (32 & 4) != 0 ? null : nopinstance, (32 & 8) != 0 ? null : renameall, (32 & 16) == 0 ? findviews : null, (32 & 32) != 0 ? findSetterInfo.INSTANCE.write() : 0);
            }
            if (z) {
                p0.AudioAttributesCompatParcelizer();
            }
        } catch (Throwable th) {
            if (z) {
                p0.AudioAttributesCompatParcelizer();
            }
            throw th;
        }
    }
}
