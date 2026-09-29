package kotlin;

import com.marrow.data.models.custommodule.FilterParams;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004\u0016\u0011\f\u0013B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\b0\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ-\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\b0\u00062\u0006\u0010\u0005\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ%\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\b0\u0006¢\u0006\u0004\b\t\u0010\u000eJ5\u0010\u0011\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\b0\u00062\u0006\u0010\u0005\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J-\u0010\u0013\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\b0\u00062\u0006\u0010\u0005\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u0016\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\b0\u00062\u0006\u0010\u0005\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J?\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\b0\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\t\u0010\u0019J-\u0010\u0011\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\b0\u00062\u0006\u0010\u0005\u001a\u00020\u0015¢\u0006\u0004\b\u0011\u0010\u0017J-\u0010\u0013\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\b0\u00062\u0006\u0010\u0005\u001a\u00020\u0015¢\u0006\u0004\b\u0013\u0010\u0017J5\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\b0\u00062\u0006\u0010\u0005\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00020\u001b¢\u0006\u0004\b\t\u0010\u001cJ-\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\b0\u00062\u0006\u0010\u0005\u001a\u00020\u0015¢\u0006\u0004\b\f\u0010\u0017J-\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\b0\u00062\u0006\u0010\u0005\u001a\u00020\u0015¢\u0006\u0004\b\t\u0010\u0017J%\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\b0\u0006¢\u0006\u0004\b\f\u0010\u000eJ%\u0010\u0011\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\b0\u0006¢\u0006\u0004\b\u0011\u0010\u000eJ5\u0010\u0016\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\b0\u00062\u0006\u0010\u0005\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0016\u0010\u0012J%\u0010\u0013\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\b0\u0006¢\u0006\u0004\b\u0013\u0010\u000eJ-\u0010\u0013\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\b0\u00062\u0006\u0010\u0005\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u001dJ/\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\b0\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\u0014J/\u0010\u0016\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\b0\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0016\u0010\u0014J\u0019\u0010\u0011\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u001eJ\u001f\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\b*\u00020\u0015H\u0002¢\u0006\u0004\b\u001f\u0010 "}, d2 = {"Lo/setFastestInterval;", "", "<init>", "()V", "Lo/setFastestInterval$write;", "p0", "Lo/getSubscriptionExpiresOn;", "", "", "AudioAttributesCompatParcelizer", "(Lo/setFastestInterval$write;)Lo/getSubscriptionExpiresOn;", "Lo/setFastestInterval$IconCompatParcelizer;", "IconCompatParcelizer", "(Lo/setFastestInterval$IconCompatParcelizer;)Lo/getSubscriptionExpiresOn;", "()Lo/getSubscriptionExpiresOn;", "", "p1", "write", "(Ljava/lang/String;Z)Lo/getSubscriptionExpiresOn;", "RemoteActionCompatParcelizer", "(Ljava/lang/String;)Lo/getSubscriptionExpiresOn;", "Lo/setFastestInterval$read;", "read", "(Lo/setFastestInterval$read;)Lo/getSubscriptionExpiresOn;", "p2", "(Ljava/lang/String;ZLo/setFastestInterval$read;)Lo/getSubscriptionExpiresOn;", "Lo/setFastestInterval$RemoteActionCompatParcelizer;", "", "(Lo/setFastestInterval$RemoteActionCompatParcelizer;I)Lo/getSubscriptionExpiresOn;", "(Z)Lo/getSubscriptionExpiresOn;", "(Ljava/lang/String;)Ljava/lang/String;", "AudioAttributesImplBaseParcelizer", "(Lo/setFastestInterval$read;)Ljava/util/Map;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class setFastestInterval {
    public static final setFastestInterval INSTANCE = new setFastestInterval();

    private setFastestInterval() {
    }

    public static Pair<String, Map<String, Object>> AudioAttributesCompatParcelizer(write p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        String lowerCase = p0.toString().toLowerCase(Locale.ROOT);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase, "");
        return new Pair<>("purchase_your_plan_validity", VideoTimelineResponseBody.read(setAction.write("source", lowerCase)));
    }

    public static Pair<String, Map<String, Object>> IconCompatParcelizer(IconCompatParcelizer p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        String lowerCase = p0.toString().toLowerCase(Locale.ROOT);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase, "");
        return new Pair<>("purchase_eoi", VideoTimelineResponseBody.read(setAction.write("source", lowerCase)));
    }

    public static Pair<String, Map<String, Object>> AudioAttributesCompatParcelizer() {
        return new Pair<>("purchase_view_plans", VideoTimelineResponseBody.read());
    }

    public static Pair<String, Map<String, Object>> write(String p0, boolean p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return new Pair<>("purchase_plan_detail", VideoTimelineResponseBody.RemoteActionCompatParcelizer(setAction.write("group_id", p0), setAction.write("source", p1 ? "renew_banner" : "plan_list_page")));
    }

    public static Pair<String, Map<String, Object>> RemoteActionCompatParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return new Pair<>("purchase_view_durations", VideoTimelineResponseBody.read(setAction.write("group_id", p0)));
    }

    public static Pair<String, Map<String, Object>> read(read p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return new Pair<>("purchase_select_duration", AudioAttributesImplBaseParcelizer(p0));
    }

    public static Pair<String, Map<String, Object>> AudioAttributesCompatParcelizer(String p0, boolean p1, read p2) {
        toMagicModuleMetaRepoModel.write(p2, "");
        Map mapRemoteActionCompatParcelizer = VideoTimelineResponseBody.RemoteActionCompatParcelizer();
        if (p0 == null) {
            p0 = "";
        }
        mapRemoteActionCompatParcelizer.put("coupon_code", p0);
        mapRemoteActionCompatParcelizer.put("referral_coupon_applied", Boolean.valueOf(p1));
        mapRemoteActionCompatParcelizer.putAll(AudioAttributesImplBaseParcelizer(p2));
        return new Pair<>("purchase_buy", VideoTimelineResponseBody.read(mapRemoteActionCompatParcelizer));
    }

    public static Pair<String, Map<String, Object>> write(read p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return new Pair<>("purchase_apply_referral_code_clicked", AudioAttributesImplBaseParcelizer(p0));
    }

    public static Pair<String, Map<String, Object>> RemoteActionCompatParcelizer(read p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return new Pair<>("purchase_referral_code_applied", AudioAttributesImplBaseParcelizer(p0));
    }

    public static Pair<String, Map<String, Object>> AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer p0, int p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        String lowerCase = p0.toString().toLowerCase(Locale.ROOT);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase, "");
        return new Pair<>("purchase_coupon_applied", VideoTimelineResponseBody.RemoteActionCompatParcelizer(setAction.write(FilterParams.KEY_MODE, lowerCase), setAction.write("coupon_type", Integer.valueOf(p1))));
    }

    public static Pair<String, Map<String, Object>> IconCompatParcelizer(read p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return new Pair<>("purchase_success", AudioAttributesImplBaseParcelizer(p0));
    }

    public static Pair<String, Map<String, Object>> AudioAttributesCompatParcelizer(read p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return new Pair<>("purchase_failure", AudioAttributesImplBaseParcelizer(p0));
    }

    public static Pair<String, Map<String, Object>> IconCompatParcelizer() {
        return new Pair<>("purchase_get_free_extension_copy", VideoTimelineResponseBody.read());
    }

    public static Pair<String, Map<String, Object>> write() {
        return new Pair<>("purchase_get_free_extension_share", VideoTimelineResponseBody.read());
    }

    public static Pair<String, Map<String, Object>> read(String p0, boolean p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return new Pair<>("purchase_plan_list", VideoTimelineResponseBody.RemoteActionCompatParcelizer(setAction.write("source", p0), setAction.write("pro_user", Boolean.valueOf(p1))));
    }

    public static Pair<String, Map<String, Object>> RemoteActionCompatParcelizer() {
        return setAction.write("notes_sticky_banner_viewed", VideoTimelineResponseBody.read());
    }

    public static Pair<String, Map<String, Object>> RemoteActionCompatParcelizer(boolean p0) {
        return setAction.write("notes_add_clicked", VideoTimelineResponseBody.read(setAction.write("add_state", p0 ? "add" : "remove")));
    }

    public static Pair<String, Map<String, Object>> AudioAttributesCompatParcelizer(String p0) {
        return new Pair<>("purchase_add_videos", VideoTimelineResponseBody.read(setAction.write("source", write(p0))));
    }

    public static Pair<String, Map<String, Object>> read(String p0) {
        return new Pair<>("purchase_add_videos_buy_now", VideoTimelineResponseBody.read(setAction.write("source", write(p0))));
    }

    private static String write(String p0) {
        if (p0 == null) {
            return "unknown";
        }
        switch (p0.hashCode()) {
            case -2136638786:
                if (!p0.equals("qbank_screen")) {
                    return "unknown";
                }
                String lowerCase = "QBANK_TAB".toLowerCase(Locale.ROOT);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase, "");
                return lowerCase;
            case -250585140:
                if (!p0.equals("home_screen")) {
                    return "unknown";
                }
                String lowerCase2 = "HOMEPAGE".toLowerCase(Locale.ROOT);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase2, "");
                return lowerCase2;
            case 629233382:
                if (!p0.equals("deeplink")) {
                    return "unknown";
                }
                String lowerCase3 = "DEEPLINK".toLowerCase(Locale.ROOT);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase3, "");
                return lowerCase3;
            case 1718754539:
                if (!p0.equals("left_nav")) {
                    return "unknown";
                }
                String lowerCase4 = "HAMBURGER_MENU".toLowerCase(Locale.ROOT);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase4, "");
                return lowerCase4;
            default:
                return "unknown";
        }
    }

    public static final class read {
        private final String AudioAttributesCompatParcelizer;
        private final String IconCompatParcelizer;
        private final String write;

        public read(String str, String str2, String str3) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            toMagicModuleMetaRepoModel.write(str3, "");
            this.IconCompatParcelizer = str;
            this.AudioAttributesCompatParcelizer = str2;
            this.write = str3;
        }

        public final String AudioAttributesCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final String IconCompatParcelizer() {
            return this.write;
        }

        public final String RemoteActionCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof read)) {
                return false;
            }
            read readVar = (read) obj;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) readVar.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) readVar.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) readVar.write);
        }

        public final int hashCode() {
            return (((this.IconCompatParcelizer.hashCode() * 31) + this.AudioAttributesCompatParcelizer.hashCode()) * 31) + this.write.hashCode();
        }

        public final String toString() {
            String str = this.IconCompatParcelizer;
            String str2 = this.AudioAttributesCompatParcelizer;
            String str3 = this.write;
            StringBuilder sb = new StringBuilder("SubscriptionAnalyticsPlanData(groupId=");
            sb.append(str);
            sb.append(", planId=");
            sb.append(str2);
            sb.append(", duration=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }
    }

    private static Map<String, String> AudioAttributesImplBaseParcelizer(read readVar) {
        Pair pairWrite = setAction.write("group_id", readVar.AudioAttributesCompatParcelizer());
        Pair pairWrite2 = setAction.write("plan_id", readVar.RemoteActionCompatParcelizer());
        String lowerCase = readVar.IconCompatParcelizer().toLowerCase(Locale.ROOT);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase, "");
        return VideoTimelineResponseBody.RemoteActionCompatParcelizer(pairWrite, pairWrite2, setAction.write("duration", lowerCase));
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lo/setFastestInterval$write;", "", "<init>", "(Ljava/lang/String;I)V", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class write {
        private static final /* synthetic */ write[] IconCompatParcelizer;
        public static final write AudioAttributesCompatParcelizer = new write("SETTINGS", 0);
        private static write RemoteActionCompatParcelizer = new write("HAMBURGER_MENU", 1);

        private write(String str, int i) {
        }

        static {
            write[] writeVarArrAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
            IconCompatParcelizer = writeVarArrAudioAttributesCompatParcelizer;
            getMagicModuleTimeline.IconCompatParcelizer(writeVarArrAudioAttributesCompatParcelizer);
        }

        private static final /* synthetic */ write[] AudioAttributesCompatParcelizer() {
            return new write[]{AudioAttributesCompatParcelizer, RemoteActionCompatParcelizer};
        }

        public static write valueOf(String str) {
            return (write) Enum.valueOf(write.class, str);
        }

        public static write[] values() {
            return (write[]) IconCompatParcelizer.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lo/setFastestInterval$IconCompatParcelizer;", "", "<init>", "(Ljava/lang/String;I)V", "write", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class IconCompatParcelizer {
        private static final /* synthetic */ IconCompatParcelizer[] read;
        public static final IconCompatParcelizer write = new IconCompatParcelizer("PLAN_LIST", 0);
        public static final IconCompatParcelizer AudioAttributesCompatParcelizer = new IconCompatParcelizer("LEARN_MORE", 1);

        private IconCompatParcelizer(String str, int i) {
        }

        static {
            IconCompatParcelizer[] iconCompatParcelizerArrRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
            read = iconCompatParcelizerArrRemoteActionCompatParcelizer;
            getMagicModuleTimeline.IconCompatParcelizer(iconCompatParcelizerArrRemoteActionCompatParcelizer);
        }

        private static final /* synthetic */ IconCompatParcelizer[] RemoteActionCompatParcelizer() {
            return new IconCompatParcelizer[]{write, AudioAttributesCompatParcelizer};
        }

        public static IconCompatParcelizer valueOf(String str) {
            return (IconCompatParcelizer) Enum.valueOf(IconCompatParcelizer.class, str);
        }

        public static IconCompatParcelizer[] values() {
            return (IconCompatParcelizer[]) read.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lo/setFastestInterval$RemoteActionCompatParcelizer;", "", "<init>", "(Ljava/lang/String;I)V", "write", "read"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer {
        private static final /* synthetic */ RemoteActionCompatParcelizer[] AudioAttributesCompatParcelizer;
        public static final RemoteActionCompatParcelizer write = new RemoteActionCompatParcelizer("AUTO", 0);
        public static final RemoteActionCompatParcelizer read = new RemoteActionCompatParcelizer("MANUAL", 1);

        private RemoteActionCompatParcelizer(String str, int i) {
        }

        static {
            RemoteActionCompatParcelizer[] remoteActionCompatParcelizerArrWrite = write();
            AudioAttributesCompatParcelizer = remoteActionCompatParcelizerArrWrite;
            getMagicModuleTimeline.IconCompatParcelizer(remoteActionCompatParcelizerArrWrite);
        }

        private static final /* synthetic */ RemoteActionCompatParcelizer[] write() {
            return new RemoteActionCompatParcelizer[]{write, read};
        }

        public static RemoteActionCompatParcelizer valueOf(String str) {
            return (RemoteActionCompatParcelizer) Enum.valueOf(RemoteActionCompatParcelizer.class, str);
        }

        public static RemoteActionCompatParcelizer[] values() {
            return (RemoteActionCompatParcelizer[]) AudioAttributesCompatParcelizer.clone();
        }
    }
}
