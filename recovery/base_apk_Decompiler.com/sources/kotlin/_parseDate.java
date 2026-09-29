package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001b\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/_deserializeAltString;", "", "p0", "write", "(Lo/_deserializeAltString;Z)Z"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class _parseDate {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] RemoteActionCompatParcelizer;

        static {
            int[] iArr = new int[_deserializeAltString.values().length];
            try {
                iArr[_deserializeAltString.write.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[_deserializeAltString.AudioAttributesCompatParcelizer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[_deserializeAltString.read.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            RemoteActionCompatParcelizer = iArr;
        }
    }

    public static final boolean write(_deserializeAltString _deserializealtstring, boolean z) {
        int i = WhenMappings.RemoteActionCompatParcelizer[_deserializealtstring.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        if (i == 3) {
            return z;
        }
        throw new RenewEligibleCreator();
    }
}
