package kotlin;

import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00060\u0004¢\u0006\u0004\b\u0007\u0010\bJ5\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00060\u00042\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\u000bJ%\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00060\u0004¢\u0006\u0004\b\f\u0010\bJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00060\u00042\u0006\u0010\t\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0012\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00060\u00042\u0006\u0010\t\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00060\u0004¢\u0006\u0004\b\u000f\u0010\b"}, d2 = {"Lo/zzbV;", "", "<init>", "()V", "Lo/getSubscriptionExpiresOn;", "", "", "read", "()Lo/getSubscriptionExpiresOn;", "p0", "p1", "(Ljava/lang/String;Ljava/lang/String;)Lo/getSubscriptionExpiresOn;", "AudioAttributesCompatParcelizer", "", "Lo/zzkx;", "RemoteActionCompatParcelizer", "(ILo/zzkx;)Lo/getSubscriptionExpiresOn;", "", "IconCompatParcelizer", "(Z)Lo/getSubscriptionExpiresOn;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class zzbV {
    public static final zzbV INSTANCE = new zzbV();

    public static final /* synthetic */ class read {
        public static final /* synthetic */ int[] IconCompatParcelizer;

        static {
            int[] iArr = new int[zzkx.values().length];
            try {
                iArr[zzkx.AudioAttributesImplApi21Parcelizer.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[zzkx.AudioAttributesImplBaseParcelizer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[zzkx.AudioAttributesImplApi26Parcelizer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[zzkx.IconCompatParcelizer.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[zzkx.AudioAttributesCompatParcelizer.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[zzkx.RemoteActionCompatParcelizer.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[zzkx.read.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[zzkx.MediaBrowserCompatItemReceiver.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[zzkx.MediaBrowserCompatCustomActionResultReceiver.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[zzkx.write.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            IconCompatParcelizer = iArr;
        }
    }

    private zzbV() {
    }

    public static Pair<String, Map<String, Object>> read() {
        return new Pair<>("mcq_copy", new HashMap());
    }

    public static Pair<String, Map<String, Object>> read(String p0, String p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        HashMap map = new HashMap();
        HashMap map2 = map;
        map2.put("error", p0);
        map2.put("message", p1);
        return new Pair<>("mcq_report", map);
    }

    public static Pair<String, Map<String, Object>> AudioAttributesCompatParcelizer() {
        return new Pair<>("mcq_share", new HashMap());
    }

    @getMagicModuleMeta
    public static final Pair<String, Map<String, Object>> RemoteActionCompatParcelizer(int p0, zzkx p1) {
        String str = "";
        toMagicModuleMetaRepoModel.write(p1, "");
        HashMap map = new HashMap();
        HashMap map2 = map;
        map2.put("bookmark_type", Integer.valueOf(p0));
        switch (read.IconCompatParcelizer[p1.ordinal()]) {
            case 1:
                break;
            case 2:
                str = "qb_review_list";
                break;
            case 3:
                str = "qb_review_detail";
                break;
            case 4:
                str = "cm_review_list";
                break;
            case 5:
                str = "cm_review_detail";
                break;
            case 6:
                str = "bm_review_list";
                break;
            case 7:
                str = "bm_review_detail";
                break;
            case 8:
                str = "qb_solve";
                break;
            case 9:
                str = "cm_solve";
                break;
            case 10:
                str = "bm_solve";
                break;
            default:
                throw new RenewEligibleCreator();
        }
        map2.put("source", str);
        return new Pair<>("mcq_bookmark", map);
    }

    public static Pair<String, Map<String, Object>> IconCompatParcelizer(boolean p0) {
        HashMap map = new HashMap();
        map.put("toggle", p0 ? "show" : "hide");
        return new Pair<>("mcq_toggle_answer", map);
    }

    public static Pair<String, Map<String, Object>> RemoteActionCompatParcelizer() {
        HashMap map = new HashMap();
        map.put("source", "cm_solve");
        return new Pair<>("mcq_star", map);
    }
}
