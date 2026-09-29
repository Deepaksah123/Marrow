package kotlin;

import androidx.media3.exoplayer.ExoPlayer;
import com.marrow.data.api.models.response.payment.PaymentStatusResponseKt;
import com.marrow.data.models.LessonMcqUpdateInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin._deserializeWithNativeTypeId;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JO\u0010\u0011\u001a\u001a\u0012\u0004\u0012\u00020\u000f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u00100\u000e2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012JM\u0010\u0014\u001a\u001a\u0012\u0004\u0012\u00020\u000f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u00100\u000e2\u0006\u0010\u0005\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0018\u001a\u00020\u000f2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0007\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u000f*\u00020\fH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u0011\u001a\u00020\u001c2\u0006\u0010\u0005\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u0011\u0010\u001dJ\u001f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\b\u0010\u0005\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u001eJ\u0017\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u001fH\u0002¢\u0006\u0004\b\u0011\u0010 J\u0017\u0010!\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010 "}, d2 = {"Lo/getAccountOrDefault;", "", "<init>", "()V", "Landroidx/media3/exoplayer/ExoPlayer;", "p0", "Lo/BinderWrapper;", "p1", "Lo/ConnectionTelemetryConfiguration;", "p2", "Lo/ClientSettings;", "p3", "", "p4", "Lo/getSubscriptionExpiresOn;", "", "", "RemoteActionCompatParcelizer", "(Landroidx/media3/exoplayer/ExoPlayer;Lo/BinderWrapper;Lo/ConnectionTelemetryConfiguration;Lo/ClientSettings;Z)Lo/getSubscriptionExpiresOn;", "Lo/validateSubClassName;", "IconCompatParcelizer", "(Lo/validateSubClassName;Ljava/lang/String;ZZLo/ConnectionTelemetryConfiguration;)Lo/getSubscriptionExpiresOn;", "", "", "AudioAttributesCompatParcelizer", "(Ljava/util/List;Lo/validateSubClassName;)Ljava/lang/String;", "write", "(Z)Ljava/lang/String;", "", "(J)J", "(Ljava/lang/Throwable;)Ljava/util/List;", "", "(I)Ljava/lang/String;", "read"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class getAccountOrDefault {
    public static final getAccountOrDefault INSTANCE = new getAccountOrDefault();

    private getAccountOrDefault() {
    }

    public static Pair<String, Map<String, Object>> RemoteActionCompatParcelizer(ExoPlayer p0, BinderWrapper p1, ConnectionTelemetryConfiguration p2, ClientSettings p3, boolean p4) {
        String strRemoteActionCompatParcelizer;
        String str;
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        toMagicModuleMetaRepoModel.write(p3, "");
        Pair[] pairArr = new Pair[15];
        pairArr[0] = setAction.write(LessonMcqUpdateInfo.KEY_MCQ_ID, p2.getRead());
        pairArr[1] = setAction.write("has_player", write(p0 != null));
        pairArr[2] = setAction.write("phase", p3.name());
        pairArr[3] = setAction.write("attempt_no", Long.valueOf(p2.getRemoteActionCompatParcelizer()));
        pairArr[4] = setAction.write("ms_since_prev_tap", Long.valueOf(RemoteActionCompatParcelizer(p2.getWrite())));
        pairArr[5] = setAction.write("is_active", write(p1.AudioAttributesCompatParcelizer()));
        pairArr[6] = setAction.write("in_viewport", write(p1.IconCompatParcelizer()));
        pairArr[7] = setAction.write("is_foreground", write(p1.RemoteActionCompatParcelizer()));
        pairArr[8] = setAction.write("display_mode", p1.write().name());
        String str2 = "NO_PLAYER";
        if (p0 == null || (strRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(p0.onRewind())) == null) {
            strRemoteActionCompatParcelizer = "NO_PLAYER";
        }
        pairArr[9] = setAction.write("playback_state", strRemoteActionCompatParcelizer);
        pairArr[10] = setAction.write("play_when_ready", write(p0 != null ? p0.onPrepareFromUri() : false));
        if (p0 != null && (str = read(p0.onSeekTo())) != null) {
            str2 = str;
        }
        pairArr[11] = setAction.write("suppression_reason", str2);
        pairArr[12] = setAction.write("position_ms", Long.valueOf(p0 != null ? p0.onPlayFromUri() : 0L));
        pairArr[13] = setAction.write("buffered_pct", Long.valueOf(p0 != null ? p0.IconCompatParcelizer() : 0));
        pairArr[14] = setAction.write("url_kind", p4 ? "fallback" : "primary");
        return new Pair<>("mcq_video_play_tapped", VideoTimelineResponseBody.RemoteActionCompatParcelizer(pairArr));
    }

    public static Pair<String, Map<String, Object>> IconCompatParcelizer(validateSubClassName p0, String p1, boolean p2, boolean p3, ConnectionTelemetryConfiguration p4) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p4, "");
        List<Throwable> listAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(p0.getCause());
        ArrayList arrayList = new ArrayList();
        for (Object obj : listAudioAttributesCompatParcelizer) {
            if (obj instanceof _deserializeWithNativeTypeId.write) {
                arrayList.add(obj);
            }
        }
        _deserializeWithNativeTypeId.write writeVar = (_deserializeWithNativeTypeId.write) IntermediateLoginResponseBody.MediaBrowserCompatSearchResultReceiver((List) arrayList);
        int i = writeVar != null ? writeVar.AudioAttributesImplApi26Parcelizer : -1;
        Pair[] pairArr = new Pair[10];
        pairArr[0] = setAction.write("error_code", Long.valueOf(p0.IconCompatParcelizer));
        pairArr[1] = setAction.write("error_code_name", p0.RemoteActionCompatParcelizer());
        String message = p0.getMessage();
        pairArr[2] = setAction.write(PaymentStatusResponseKt.KEY_ERROR_MESSAGE, message != null ? message : "");
        pairArr[3] = setAction.write("error_class", AudioAttributesCompatParcelizer(listAudioAttributesCompatParcelizer, p0));
        pairArr[4] = setAction.write("http_status", Long.valueOf(i));
        pairArr[5] = setAction.write("is_network_error", write(p3));
        pairArr[6] = setAction.write("video_url", p1);
        pairArr[7] = setAction.write("did_attempt_fallback", write(p2));
        pairArr[8] = setAction.write(LessonMcqUpdateInfo.KEY_MCQ_ID, p4.getRead());
        pairArr[9] = setAction.write("attempt_no", Long.valueOf(p4.getRemoteActionCompatParcelizer()));
        return new Pair<>("mcq_video_playback_failed", VideoTimelineResponseBody.RemoteActionCompatParcelizer(pairArr));
    }

    private static String AudioAttributesCompatParcelizer(List<? extends Throwable> p0, validateSubClassName p1) {
        Object next;
        Iterator<T> it = p0.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            String name = ((Throwable) next).getClass().getName();
            toMagicModuleMetaRepoModel.write((Object) name);
            if (TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(name, "java.") || TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(name, "javax.")) {
                break;
            }
        }
        validateSubClassName validatesubclassname = (Throwable) next;
        if (validatesubclassname == null && (validatesubclassname = (Throwable) IntermediateLoginResponseBody.MediaBrowserCompatSearchResultReceiver((List) p0)) == null) {
            validatesubclassname = p1;
        }
        String simpleName = validatesubclassname.getClass().getSimpleName();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(simpleName, "");
        return simpleName;
    }

    private static String write(boolean z) {
        return String.valueOf(z);
    }

    private static long RemoteActionCompatParcelizer(long p0) {
        if (p0 == 0) {
            return -1L;
        }
        return System.currentTimeMillis() - p0;
    }

    private static List<Throwable> AudioAttributesCompatParcelizer(Throwable p0) {
        return StateResult.MediaBrowserCompatItemReceiver(StateResult.AudioAttributesImplApi21Parcelizer(StateResult.RemoteActionCompatParcelizer(p0, (getAnswerMap<? super Throwable, ? extends Throwable>) new getAnswerMap() { // from class: o.getGravityForPopups
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return getAccountOrDefault.write((Throwable) obj);
            }
        })));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable write(Throwable th) {
        toMagicModuleMetaRepoModel.write(th, "");
        Throwable cause = th.getCause();
        if (cause == null || cause == th) {
            return null;
        }
        return cause;
    }

    private static String RemoteActionCompatParcelizer(int p0) {
        if (p0 == 1) {
            return "IDLE";
        }
        if (p0 == 2) {
            return "BUFFERING";
        }
        if (p0 == 3) {
            return "READY";
        }
        if (p0 == 4) {
            return "ENDED";
        }
        return "STATE_".concat(String.valueOf(p0));
    }

    private static String read(int p0) {
        if (p0 == 0) {
            return "NONE";
        }
        if (p0 == 1) {
            return "TRANSIENT_AUDIO_FOCUS_LOSS";
        }
        return "REASON_".concat(String.valueOf(p0));
    }
}
