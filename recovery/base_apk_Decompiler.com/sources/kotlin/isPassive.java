package kotlin;

import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\b0\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ-\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\b0\u00062\u0006\u0010\u0005\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\fJ%\u0010\r\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\b0\u0006¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\b0\u00062\u0006\u0010\u0005\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\t\u0010\u0010"}, d2 = {"Lo/isPassive;", "", "<init>", "()V", "", "p0", "Lo/getSubscriptionExpiresOn;", "", "", "RemoteActionCompatParcelizer", "(Z)Lo/getSubscriptionExpiresOn;", "Lo/StreetViewPanoramaViewzzb;", "(Lo/StreetViewPanoramaViewzzb;)Lo/getSubscriptionExpiresOn;", "write", "()Lo/getSubscriptionExpiresOn;", "", "(I)Lo/getSubscriptionExpiresOn;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class isPassive {
    public static final isPassive INSTANCE = new isPassive();

    public static final /* synthetic */ class RemoteActionCompatParcelizer {
        public static final /* synthetic */ int[] IconCompatParcelizer;

        static {
            int[] iArr = new int[StreetViewPanoramaViewzzb.values().length];
            try {
                iArr[StreetViewPanoramaViewzzb.read.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StreetViewPanoramaViewzzb.write.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StreetViewPanoramaViewzzb.IconCompatParcelizer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StreetViewPanoramaViewzzb.RemoteActionCompatParcelizer.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            IconCompatParcelizer = iArr;
        }
    }

    private isPassive() {
    }

    public static Pair<String, Map<String, Object>> RemoteActionCompatParcelizer(boolean p0) {
        return new Pair<>("settings_vibrate", VideoTimelineResponseBody.read(setAction.write("toggle", p0 ? "on" : "off")));
    }

    public static Pair<String, Map<String, Object>> RemoteActionCompatParcelizer(StreetViewPanoramaViewzzb p0) {
        String str;
        toMagicModuleMetaRepoModel.write(p0, "");
        int i = RemoteActionCompatParcelizer.IconCompatParcelizer[p0.ordinal()];
        if (i == 1) {
            str = "qb_only";
        } else if (i == 2) {
            str = "bm_only";
        } else if (i == 3) {
            str = "qb_and_bm";
        } else {
            if (i != 4) {
                throw new RenewEligibleCreator();
            }
            str = "";
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase, "");
        return new Pair<>("settings_reset", VideoTimelineResponseBody.read(setAction.write("reset_section", lowerCase)));
    }

    public static Pair<String, Map<String, Object>> write() {
        return new Pair<>("settings_change_password", VideoTimelineResponseBody.read());
    }

    @getMagicModuleMeta
    public static final Pair<String, Map<String, Object>> RemoteActionCompatParcelizer(int p0) {
        buildResolutionString.IconCompatParcelizer("TrainingApplication_event", "logout()");
        return new Pair<>("logout", VideoTimelineResponseBody.read(setAction.write("logout_error_code", Integer.valueOf(p0))));
    }
}
