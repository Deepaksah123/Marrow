package kotlin;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\rB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\t0\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\fJ/\u0010\r\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\t0\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\fJ/\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\t0\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\fJ'\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\t0\bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\t0\bH\u0007¢\u0006\u0004\b\n\u0010\u000f"}, d2 = {"Lo/standardContainsKey;", "", "<init>", "()V", "", "p0", "Lo/standardContainsKey$write;", "p1", "Lo/getSubscriptionExpiresOn;", "", "AudioAttributesCompatParcelizer", "(Ljava/lang/String;Lo/standardContainsKey$write;)Lo/getSubscriptionExpiresOn;", "(Ljava/lang/String;)Lo/getSubscriptionExpiresOn;", "write", "RemoteActionCompatParcelizer", "()Lo/getSubscriptionExpiresOn;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class standardContainsKey {
    public static final standardContainsKey INSTANCE = new standardContainsKey();

    private standardContainsKey() {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\n\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\b"}, d2 = {"Lo/standardContainsKey$write;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "RemoteActionCompatParcelizer", "Ljava/lang/String;", "IconCompatParcelizer", "()Ljava/lang/String;", "AudioAttributesCompatParcelizer", "write"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class write {
        private static final /* synthetic */ write[] AudioAttributesCompatParcelizer;

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        private final String AudioAttributesCompatParcelizer;
        public static final write write = new write("PLAYBACK_TYPE_AUTO_VALUE", 0, TtmlNode.TEXT_EMPHASIS_AUTO);
        public static final write IconCompatParcelizer = new write("PLAYBACK_TYPE_MANUAL_VALUE", 1, "manual");

        private write(String str, int i, String str2) {
            this.AudioAttributesCompatParcelizer = str2;
        }

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
        public final String getAudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        static {
            write[] writeVarArrAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
            AudioAttributesCompatParcelizer = writeVarArrAudioAttributesCompatParcelizer;
            getMagicModuleTimeline.IconCompatParcelizer(writeVarArrAudioAttributesCompatParcelizer);
        }

        private static final /* synthetic */ write[] AudioAttributesCompatParcelizer() {
            return new write[]{write, IconCompatParcelizer};
        }

        public static write valueOf(String str) {
            return (write) Enum.valueOf(write.class, str);
        }

        public static write[] values() {
            return (write[]) AudioAttributesCompatParcelizer.clone();
        }
    }

    @getMagicModuleMeta
    public static final Pair<String, Map<String, Object>> AudioAttributesCompatParcelizer(String p0, write p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        return setAction.write("video_skip_intro_clicked", VideoTimelineResponseBody.RemoteActionCompatParcelizer(setAction.write("skip_intro_type", p1.getAudioAttributesCompatParcelizer()), setAction.write("subject_id", p0)));
    }

    @getMagicModuleMeta
    public static final Pair<String, Map<String, Object>> AudioAttributesCompatParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return setAction.write("video_skip_intro_shown", VideoTimelineResponseBody.read(setAction.write("subject_id", p0)));
    }

    @getMagicModuleMeta
    public static final Pair<String, Map<String, Object>> write(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return new Pair<>("video_internal_pip_activated", VideoTimelineResponseBody.read(setAction.write("source", p0)));
    }

    @getMagicModuleMeta
    public static final Pair<String, Map<String, Object>> RemoteActionCompatParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return new Pair<>("video_internal_pip_closed", VideoTimelineResponseBody.read(setAction.write("source", p0)));
    }

    @getMagicModuleMeta
    public static final Pair<String, Map<String, Object>> RemoteActionCompatParcelizer() {
        return new Pair<>("video_internal_pip_docked", VideoTimelineResponseBody.read());
    }

    @getMagicModuleMeta
    public static final Pair<String, Map<String, Object>> AudioAttributesCompatParcelizer() {
        return new Pair<>("external_pip_expand", VideoTimelineResponseBody.read());
    }
}
