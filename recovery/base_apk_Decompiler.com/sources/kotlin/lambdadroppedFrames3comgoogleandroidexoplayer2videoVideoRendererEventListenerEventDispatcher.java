package kotlin;

import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u000fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u000b0\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ%\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u000b0\n¢\u0006\u0004\b\f\u0010\u000e"}, d2 = {"Lo/lambdadroppedFrames3comgoogleandroidexoplayer2videoVideoRendererEventListenerEventDispatcher;", "", "<init>", "()V", "Lo/limit;", "p0", "", "p1", "Lo/lambdadroppedFrames3comgoogleandroidexoplayer2videoVideoRendererEventListenerEventDispatcher$read;", "p2", "Lo/getSubscriptionExpiresOn;", "", "RemoteActionCompatParcelizer", "(Lo/limit;Ljava/lang/String;Lo/lambdadroppedFrames3comgoogleandroidexoplayer2videoVideoRendererEventListenerEventDispatcher$read;)Lo/getSubscriptionExpiresOn;", "()Lo/getSubscriptionExpiresOn;", "read"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class lambdadroppedFrames3comgoogleandroidexoplayer2videoVideoRendererEventListenerEventDispatcher {
    public static final lambdadroppedFrames3comgoogleandroidexoplayer2videoVideoRendererEventListenerEventDispatcher INSTANCE = new lambdadroppedFrames3comgoogleandroidexoplayer2videoVideoRendererEventListenerEventDispatcher();

    private lambdadroppedFrames3comgoogleandroidexoplayer2videoVideoRendererEventListenerEventDispatcher() {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\n\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\b"}, d2 = {"Lo/lambdadroppedFrames3comgoogleandroidexoplayer2videoVideoRendererEventListenerEventDispatcher$read;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "RemoteActionCompatParcelizer", "Ljava/lang/String;", "read", "()Ljava/lang/String;", "IconCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class read {
        private static final /* synthetic */ read[] AudioAttributesCompatParcelizer;
        public static final read IconCompatParcelizer = new read("LOGIN", 0, "login");
        public static final read read = new read("SIGNUP", 1, "signup");

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        private final String IconCompatParcelizer;

        private read(String str, int i, String str2) {
            this.IconCompatParcelizer = str2;
        }

        /* JADX INFO: renamed from: read, reason: from getter */
        public final String getIconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        static {
            read[] readVarArrAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
            AudioAttributesCompatParcelizer = readVarArrAudioAttributesCompatParcelizer;
            getMagicModuleTimeline.IconCompatParcelizer(readVarArrAudioAttributesCompatParcelizer);
        }

        private static final /* synthetic */ read[] AudioAttributesCompatParcelizer() {
            return new read[]{IconCompatParcelizer, read};
        }

        public static read valueOf(String str) {
            return (read) Enum.valueOf(read.class, str);
        }

        public static read[] values() {
            return (read[]) AudioAttributesCompatParcelizer.clone();
        }
    }

    public static Pair<String, Map<String, Object>> RemoteActionCompatParcelizer(limit p0, String p1, read p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        String strConcat = TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(p1, "+") ? p1 : null;
        if (strConcat == null) {
            strConcat = "+".concat(String.valueOf(p1));
        }
        return new Pair<>("otp_requested", VideoTimelineResponseBody.RemoteActionCompatParcelizer(setAction.write("otp_mode", p0.getRemoteActionCompatParcelizer()), setAction.write("phone_number_country_code", strConcat), setAction.write("source", p2.getIconCompatParcelizer())));
    }

    public static Pair<String, Map<String, Object>> RemoteActionCompatParcelizer() {
        return new Pair<>("signup_change_number", VideoTimelineResponseBody.read());
    }
}
