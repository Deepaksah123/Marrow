package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001ae\u0010\u0012\u001a\u00020\u0011*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001b\u0010\u0015\u001a\u00020\u0011*\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0015\u0010\u0016"}, d2 = {"Lo/findSetterInfo;", "Lo/deserializeFromNumber;", "p0", "Lo/switchToNext;", "p1", "Lo/getReferencedType;", "p2", "", "p3", "Lo/nopInstance;", "p4", "Lo/renameAll;", "p5", "Lo/findViews;", "p6", "Lo/createInstance;", "p7", "", "IconCompatParcelizer", "(Lo/findSetterInfo;Lo/deserializeFromNumber;JJFLo/nopInstance;Lo/renameAll;Lo/findViews;I)V", "Lo/findTypeName;", "write", "(Lo/findTypeName;Lo/deserializeFromNumber;)V"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class findConvertingDeserializer {
    public static final void IconCompatParcelizer(findSetterInfo findsetterinfo, deserializeFromNumber deserializefromnumber, long j, long j2, float f, nopInstance nopinstance, renameAll renameall, findViews findviews, int i) {
        nopInstance nopinstanceOnFastForward = nopinstance == null ? deserializefromnumber.getIconCompatParcelizer().getRead().onFastForward() : nopinstance;
        renameAll renameallOnPlayFromMediaId = renameall == null ? deserializefromnumber.getIconCompatParcelizer().getRead().onPlayFromMediaId() : renameall;
        findViews findviewsAudioAttributesImplApi26Parcelizer = findviews == null ? deserializefromnumber.getIconCompatParcelizer().getRead().AudioAttributesImplApi26Parcelizer() : findviews;
        findSerializationTyping iconCompatParcelizer = findsetterinfo.getIconCompatParcelizer();
        long jAudioAttributesCompatParcelizer = iconCompatParcelizer.AudioAttributesCompatParcelizer();
        iconCompatParcelizer.IconCompatParcelizer().IconCompatParcelizer();
        try {
            findTypeName remoteActionCompatParcelizer = iconCompatParcelizer.getRemoteActionCompatParcelizer();
            long j3 = -1;
            remoteActionCompatParcelizer.RemoteActionCompatParcelizer(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (((((long) 0) << 32) | (j3 - ((j3 >> 63) << 32))) & j2)));
            write(remoteActionCompatParcelizer, deserializefromnumber);
            Instantiatable instantiatableWrite = deserializefromnumber.getIconCompatParcelizer().getRead().write();
            if (instantiatableWrite != null && j == 16) {
                deserializefromnumber.getWrite().RemoteActionCompatParcelizer(findsetterinfo.getIconCompatParcelizer().IconCompatParcelizer(), instantiatableWrite, !Float.isNaN(f) ? f : deserializefromnumber.getIconCompatParcelizer().getRead().AudioAttributesCompatParcelizer(), nopinstanceOnFastForward, renameallOnPlayFromMediaId, findviewsAudioAttributesImplApi26Parcelizer, i);
            } else {
                deserializefromnumber.getWrite().RemoteActionCompatParcelizer(findsetterinfo.getIconCompatParcelizer().IconCompatParcelizer(), isCaseInsensitive.read(j == 16 ? deserializefromnumber.getIconCompatParcelizer().getRead().MediaBrowserCompatCustomActionResultReceiver() : j, f), nopinstanceOnFastForward, renameallOnPlayFromMediaId, findviewsAudioAttributesImplApi26Parcelizer, i);
            }
        } finally {
            iconCompatParcelizer.IconCompatParcelizer().AudioAttributesCompatParcelizer();
            iconCompatParcelizer.IconCompatParcelizer(jAudioAttributesCompatParcelizer);
        }
    }

    private static final void write(findTypeName findtypename, deserializeFromNumber deserializefromnumber) {
        if (!deserializefromnumber.RemoteActionCompatParcelizer() || paramName.write(deserializefromnumber.getIconCompatParcelizer().getMediaBrowserCompatCustomActionResultReceiver(), paramName.INSTANCE.IconCompatParcelizer())) {
            return;
        }
        findTypeName.AudioAttributesCompatParcelizer$default(findtypename, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (int) (deserializefromnumber.getRead() >> 32), (int) deserializefromnumber.getRead(), 0, 16, null);
    }
}
