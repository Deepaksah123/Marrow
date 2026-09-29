package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/deserializeFromNumber;", "", "p0", "Lo/_properties;", "read", "(Lo/deserializeFromNumber;I)Lo/_properties;", "", "RemoteActionCompatParcelizer", "(Lo/deserializeFromNumber;I)Z"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class requestModelBuild {
    public static final _properties read(deserializeFromNumber deserializefromnumber, int i) {
        return RemoteActionCompatParcelizer(deserializefromnumber, i) ? deserializefromnumber.AudioAttributesImplApi21Parcelizer(i) : deserializefromnumber.RemoteActionCompatParcelizer(i);
    }

    private static final boolean RemoteActionCompatParcelizer(deserializeFromNumber deserializefromnumber, int i) {
        if (deserializefromnumber.getIconCompatParcelizer().getWrite().length() != 0) {
            int iAudioAttributesCompatParcelizer = deserializefromnumber.AudioAttributesCompatParcelizer(i);
            if (i != 0 && iAudioAttributesCompatParcelizer == deserializefromnumber.AudioAttributesCompatParcelizer(i - 1)) {
                return false;
            }
            if (i != deserializefromnumber.getIconCompatParcelizer().getWrite().length() && iAudioAttributesCompatParcelizer == deserializefromnumber.AudioAttributesCompatParcelizer(i + 1)) {
                return false;
            }
        }
        return true;
    }
}
