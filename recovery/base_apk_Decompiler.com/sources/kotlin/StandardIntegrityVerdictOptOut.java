package kotlin;

import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0012B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JU\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\r0\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJE\u0010\u0010\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\r0\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0012\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\r0\f¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0014\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\r0\f¢\u0006\u0004\b\u0014\u0010\u0013J%\u0010\u0015\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\r0\f¢\u0006\u0004\b\u0015\u0010\u0013"}, d2 = {"Lo/StandardIntegrityVerdictOptOut;", "", "<init>", "()V", "", "p0", "p1", "p2", "p3", "p4", "Lo/StandardIntegrityVerdictOptOut$read;", "p5", "Lo/getSubscriptionExpiresOn;", "", "IconCompatParcelizer", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/StandardIntegrityVerdictOptOut$read;)Lo/getSubscriptionExpiresOn;", "write", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo/getSubscriptionExpiresOn;", "read", "()Lo/getSubscriptionExpiresOn;", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StandardIntegrityVerdictOptOut {
    public static final StandardIntegrityVerdictOptOut INSTANCE = new StandardIntegrityVerdictOptOut();

    public static final /* synthetic */ class IconCompatParcelizer {
        public static final /* synthetic */ int[] RemoteActionCompatParcelizer;

        static {
            int[] iArr = new int[read.values().length];
            try {
                iArr[read.read.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[read.AudioAttributesImplBaseParcelizer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[read.AudioAttributesImplApi21Parcelizer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[read.MediaBrowserCompatItemReceiver.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[read.AudioAttributesCompatParcelizer.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[read.MediaBrowserCompatCustomActionResultReceiver.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[read.write.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[read.RemoteActionCompatParcelizer.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[read.IconCompatParcelizer.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            RemoteActionCompatParcelizer = iArr;
        }
    }

    private StandardIntegrityVerdictOptOut() {
    }

    public static Pair<String, Map<String, Object>> IconCompatParcelizer(String p0, String p1, String p2, String p3, String p4, read p5) {
        String str;
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        toMagicModuleMetaRepoModel.write(p3, "");
        toMagicModuleMetaRepoModel.write(p4, "");
        toMagicModuleMetaRepoModel.write(p5, "");
        HashMap map = new HashMap();
        HashMap map2 = map;
        switch (IconCompatParcelizer.RemoteActionCompatParcelizer[p5.ordinal()]) {
            case 1:
                str = "video_all";
                break;
            case 2:
                str = "video_paused";
                break;
            case 3:
                str = "video_completed";
                break;
            case 4:
                str = "video_unattempted";
                break;
            case 5:
                str = "suggested_home";
                break;
            case 6:
                str = "watch_next";
                break;
            case 7:
                str = "search";
                break;
            case 8:
                str = "suggested_watch_next";
                break;
            case 9:
                str = "suggested_continue_watching";
                break;
            default:
                throw new RenewEligibleCreator();
        }
        map2.put("source", str);
        map2.put("lesson_id", p0);
        map2.put("subject_id", p1);
        map2.put("subject_title", p4);
        map2.put("lesson_title", p3);
        map2.put("child_subject_id", p2);
        return new Pair<>("video_lesson_opened", map);
    }

    public static Pair<String, Map<String, Object>> write(String p0, String p1, String p2, String p3) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        toMagicModuleMetaRepoModel.write(p3, "");
        return new Pair<>("video_continue_watching_dismissed", VideoTimelineResponseBody.RemoteActionCompatParcelizer(setAction.write("lesson_id", p0), setAction.write("subject_id", p1), setAction.write("subject_title", p3), setAction.write("lesson_title", p2)));
    }

    public static Pair<String, Map<String, Object>> read() {
        return setAction.write("video_index", VideoTimelineResponseBody.read());
    }

    public static Pair<String, Map<String, Object>> RemoteActionCompatParcelizer() {
        return setAction.write("video_editor_description", VideoTimelineResponseBody.read(setAction.write("toggle", "show")));
    }

    public static Pair<String, Map<String, Object>> AudioAttributesCompatParcelizer() {
        return setAction.write("video_editor_description", VideoTimelineResponseBody.read(setAction.write("toggle", "hide")));
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f"}, d2 = {"Lo/StandardIntegrityVerdictOptOut$read;", "", "<init>", "(Ljava/lang/String;I)V", "read", "AudioAttributesImplBaseParcelizer", "AudioAttributesImplApi21Parcelizer", "MediaBrowserCompatItemReceiver", "AudioAttributesCompatParcelizer", "MediaBrowserCompatCustomActionResultReceiver", "RemoteActionCompatParcelizer", "IconCompatParcelizer", "write"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class read {
        private static final /* synthetic */ read[] AudioAttributesImplApi26Parcelizer;
        public static final read read = new read("VIDEO_TAB_ALL", 0);
        public static final read AudioAttributesImplBaseParcelizer = new read("VIDEO_TAB_PAUSED", 1);
        public static final read AudioAttributesImplApi21Parcelizer = new read("VIDEO_TAB_COMPLETED", 2);
        public static final read MediaBrowserCompatItemReceiver = new read("VIDEO_TAB_UNATTEMPTED", 3);
        public static final read AudioAttributesCompatParcelizer = new read("SUGGESTED_HOME", 4);
        public static final read MediaBrowserCompatCustomActionResultReceiver = new read("WATCH_NEXT", 5);
        public static final read RemoteActionCompatParcelizer = new read("VIDEO_SUGGESTED_WATCH_NEXT", 6);
        public static final read IconCompatParcelizer = new read("VIDEO_SUGGESTED_CONTINUE_WATCH", 7);
        public static final read write = new read("SEARCH", 8);

        private read(String str, int i) {
        }

        static {
            read[] readVarArr = read();
            AudioAttributesImplApi26Parcelizer = readVarArr;
            getMagicModuleTimeline.IconCompatParcelizer(readVarArr);
        }

        private static final /* synthetic */ read[] read() {
            return new read[]{read, AudioAttributesImplBaseParcelizer, AudioAttributesImplApi21Parcelizer, MediaBrowserCompatItemReceiver, AudioAttributesCompatParcelizer, MediaBrowserCompatCustomActionResultReceiver, RemoteActionCompatParcelizer, IconCompatParcelizer, write};
        }

        public static read valueOf(String str) {
            return (read) Enum.valueOf(read.class, str);
        }

        public static read[] values() {
            return (read[]) AudioAttributesImplApi26Parcelizer.clone();
        }
    }
}
