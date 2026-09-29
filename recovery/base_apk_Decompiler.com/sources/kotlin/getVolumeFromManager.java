package kotlin;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.google.android.gms.common.Scopes;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.StarRating;
import kotlin.lambdareplaceMediaItems5comgoogleandroidexoplayer2SimpleBasePlayer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010!\n\u0002\b\u0002\b\u0000\u0018\u0000 -2\u00020\u0001:\u0001-By\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010\"\u001a\u00020!2\u0006\u0010\u0003\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J/\u0010'\u001a\u00020!2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020$2\b\u0010\u0007\u001a\u0004\u0018\u00010%2\u0006\u0010\t\u001a\u00020&¢\u0006\u0004\b'\u0010(J\r\u0010*\u001a\u00020)¢\u0006\u0004\b*\u0010+J\u001d\u0010-\u001a\u00020!2\u0006\u0010\u0003\u001a\u00020$2\u0006\u0010\u0005\u001a\u00020,¢\u0006\u0004\b-\u0010.J\u0015\u0010\"\u001a\u00020&2\u0006\u0010\u0003\u001a\u00020$¢\u0006\u0004\b\"\u0010/J\u0017\u0010*\u001a\u00020&2\u0006\u0010\u0003\u001a\u00020%H\u0002¢\u0006\u0004\b*\u00100J\u001b\u0010'\u001a\u0004\u0018\u0001012\b\u0010\u0003\u001a\u0004\u0018\u00010%H\u0002¢\u0006\u0004\b'\u00102J\u001d\u0010*\u001a\u00020!2\u0006\u0010\u0003\u001a\u00020$2\u0006\u0010\u0005\u001a\u00020,¢\u0006\u0004\b*\u0010.J\u0017\u0010*\u001a\u00020!2\u0006\u0010\u0003\u001a\u000203H\u0002¢\u0006\u0004\b*\u00104J\u0017\u00105\u001a\u00020&2\u0006\u0010\u0003\u001a\u000203H\u0002¢\u0006\u0004\b5\u00106J9\u0010'\u001a\u00020&2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020$2\b\u0010\u0007\u001a\u0004\u0018\u0001072\b\u0010\t\u001a\u0004\u0018\u00010%2\u0006\u0010\u000b\u001a\u00020&¢\u0006\u0004\b'\u00108J5\u0010\"\u001a\u00020&2\u0006\u0010\u0003\u001a\u00020$2\u0006\u0010\u0005\u001a\u0002092\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020!0:2\u0006\u0010\t\u001a\u00020&H\u0002¢\u0006\u0004\b\"\u0010;J\u001f\u0010*\u001a\u00020!2\u0006\u0010\u0003\u001a\u0002092\u0006\u0010\u0005\u001a\u00020<H\u0002¢\u0006\u0004\b*\u0010=J)\u0010*\u001a\u00020!2\b\u0010\u0003\u001a\u0004\u0018\u0001012\u0006\u0010\u0005\u001a\u00020<2\u0006\u0010\u0007\u001a\u00020&H\u0002¢\u0006\u0004\b*\u0010>J\u001f\u0010*\u001a\u0002032\u0006\u0010\u0003\u001a\u00020$2\u0006\u0010\u0005\u001a\u000209H\u0002¢\u0006\u0004\b*\u0010?J\u0017\u00105\u001a\u0002032\u0006\u0010\u0003\u001a\u000209H\u0002¢\u0006\u0004\b5\u0010@J\u0017\u0010\"\u001a\u0002032\u0006\u0010\u0003\u001a\u000209H\u0002¢\u0006\u0004\b\"\u0010@J\u0017\u0010'\u001a\u00020&2\u0006\u0010\u0003\u001a\u000203H\u0002¢\u0006\u0004\b'\u00106J\u001f\u0010'\u001a\u00020!2\u0006\u0010\u0003\u001a\u0002032\u0006\u0010\u0005\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010AJ\u0017\u0010-\u001a\u00020&2\u0006\u0010\u0003\u001a\u000203H\u0002¢\u0006\u0004\b-\u00106J5\u0010*\u001a\u00020&2\u0006\u0010\u0003\u001a\u0002032\u0006\u0010\u0005\u001a\u00020&2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020!0:2\u0006\u0010\t\u001a\u00020&H\u0002¢\u0006\u0004\b*\u0010BJ\u0015\u0010C\u001a\u00020&2\u0006\u0010\u0003\u001a\u000203¢\u0006\u0004\bC\u00106J\u0017\u0010\"\u001a\u00020!2\u0006\u0010\u0003\u001a\u000203H\u0002¢\u0006\u0004\b\"\u00104J\u0017\u0010*\u001a\u00020&2\u0006\u0010\u0003\u001a\u000209H\u0002¢\u0006\u0004\b*\u0010DJ\u0017\u0010\"\u001a\u00020!2\u0006\u0010\u0003\u001a\u000207H\u0002¢\u0006\u0004\b\"\u0010EJ\u0017\u0010\"\u001a\u00020!2\u0006\u0010\u0003\u001a\u00020%H\u0002¢\u0006\u0004\b\"\u0010FJ\u0019\u00105\u001a\u00020!2\b\u0010\u0003\u001a\u0004\u0018\u00010%H\u0002¢\u0006\u0004\b5\u0010FJ\u0017\u00105\u001a\u00020!2\u0006\u0010\u0003\u001a\u00020)H\u0002¢\u0006\u0004\b5\u0010GJ\u0017\u0010-\u001a\u00020!2\u0006\u0010\u0003\u001a\u00020%H\u0002¢\u0006\u0004\b-\u0010FJ\u0017\u0010*\u001a\u00020!2\u0006\u0010\u0003\u001a\u00020&H\u0002¢\u0006\u0004\b*\u0010HR\u0014\u00105\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010'\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010KR\u0014\u0010-\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010*\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010\"\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010C\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010I\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010TR\u0014\u0010R\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010UR\u0014\u0010P\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010N\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010XR\u0014\u0010[\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010^\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010V\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010_R\u0014\u0010L\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0016\u0010`\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u0016\u0010\\\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010cR\u0016\u0010b\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010cR\u001a\u0010g\u001a\b\u0012\u0004\u0012\u00020 0e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010fR\u0011\u0010Y\u001a\u00020)8G¢\u0006\u0006\u001a\u0004\b\"\u0010+"}, d2 = {"Lo/getVolumeFromManager;", "", "Landroid/content/Context;", "p0", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "p1", "Lo/getChildTimelines;", "p2", "Lo/copyWithPlaceholderTimeline;", "p3", "Lo/getUids;", "p4", "Lo/lambdaprepare7;", "p5", "Lo/addAllCommands;", "p6", "Lo/setMuted;", "p7", "Lo/blockUntilConstructorFinished;", "p8", "Lo/isServerSideInsertedAdGroup;", "p9", "Lo/getMutedFromManager;", "p10", "Lo/increaseVolume;", "p11", "Lo/r8lambdayqk5n84OlDC9DTin4ovqV23B95c;", "p12", "Lo/PlaylistTimeline1;", "p13", "<init>", "(Landroid/content/Context;Lcom/clevertap/android/sdk/CleverTapInstanceConfig;Lo/getChildTimelines;Lo/copyWithPlaceholderTimeline;Lo/getUids;Lo/lambdaprepare7;Lo/addAllCommands;Lo/setMuted;Lo/blockUntilConstructorFinished;Lo/isServerSideInsertedAdGroup;Lo/getMutedFromManager;Lo/increaseVolume;Lo/r8lambdayqk5n84OlDC9DTin4ovqV23B95c;Lo/PlaylistTimeline1;)V", "Lo/getStarRating;", "", "IconCompatParcelizer", "(Lo/getStarRating;)V", "Lo/lambdasetVideoSurfaceHolder18;", "", "", "RemoteActionCompatParcelizer", "(Landroid/content/Context;Lo/lambdasetVideoSurfaceHolder18;Ljava/lang/String;Z)V", "", "AudioAttributesCompatParcelizer", "()I", "Ljava/lang/Runnable;", "write", "(Lo/lambdasetVideoSurfaceHolder18;Ljava/lang/Runnable;)V", "(Lo/lambdasetVideoSurfaceHolder18;)Z", "(Ljava/lang/String;)Z", "Lorg/json/JSONObject;", "(Ljava/lang/String;)Lorg/json/JSONObject;", "Lo/Timeline;", "(Lo/Timeline;)V", "read", "(Lo/Timeline;)Z", "Lorg/json/JSONArray;", "(Landroid/content/Context;Lo/lambdasetVideoSurfaceHolder18;Lorg/json/JSONArray;Ljava/lang/String;Z)Z", "Lo/r8lambdagjbcDhYZsg12wwvfvBSOoM0KvOQ;", "Lkotlin/Function0;", "(Lo/lambdasetVideoSurfaceHolder18;Lo/r8lambdagjbcDhYZsg12wwvfvBSOoM0KvOQ;Lo/getCreatedOnDateMs;Z)Z", "Lo/StarRating;", "(Lo/r8lambdagjbcDhYZsg12wwvfvBSOoM0KvOQ;Lo/StarRating;)V", "(Lorg/json/JSONObject;Lo/StarRating;Z)V", "(Lo/lambdasetVideoSurfaceHolder18;Lo/r8lambdagjbcDhYZsg12wwvfvBSOoM0KvOQ;)Lo/Timeline;", "(Lo/r8lambdagjbcDhYZsg12wwvfvBSOoM0KvOQ;)Lo/Timeline;", "(Lo/Timeline;Ljava/lang/String;)V", "(Lo/Timeline;ZLo/getCreatedOnDateMs;Z)Z", "AudioAttributesImplApi26Parcelizer", "(Lo/r8lambdagjbcDhYZsg12wwvfvBSOoM0KvOQ;)Z", "(Lorg/json/JSONArray;)V", "(Ljava/lang/String;)V", "(I)V", "(Z)V", "AudioAttributesImplBaseParcelizer", "Landroid/content/Context;", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "MediaDescriptionCompat", "Lo/getChildTimelines;", "AudioAttributesImplApi21Parcelizer", "Lo/copyWithPlaceholderTimeline;", "MediaBrowserCompatCustomActionResultReceiver", "Lo/getUids;", "MediaBrowserCompatItemReceiver", "Lo/lambdaprepare7;", "Lo/addAllCommands;", "Lo/setMuted;", "MediaBrowserCompatMediaItem", "Lo/blockUntilConstructorFinished;", "Lo/isServerSideInsertedAdGroup;", "onAddQueueItem", "Lo/getMutedFromManager;", "MediaBrowserCompatSearchResultReceiver", "onCustomAction", "Lo/increaseVolume;", "RatingCompat", "Lo/r8lambdayqk5n84OlDC9DTin4ovqV23B95c;", "MediaMetadataCompat", "Lo/PlaylistTimeline1;", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "I", "handleMediaPlayPauseIfPendingOnHandler", "", "Ljava/util/List;", "onCommand"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getVolumeFromManager {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final r8lambdayqk5n84OlDC9DTin4ovqV23B95c MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final copyWithPlaceholderTimeline AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final setMuted MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final Context read;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final CleverTapInstanceConfig RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final getUids IconCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final lambdaprepare7 AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private final blockUntilConstructorFinished MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from kotlin metadata */
    private int MediaMetadataCompat;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private final getChildTimelines write;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private final PlaylistTimeline1 MediaDescriptionCompat;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private final List<getStarRating> onCommand;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final isServerSideInsertedAdGroup AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
    private int onCustomAction;

    /* JADX INFO: renamed from: onAddQueueItem, reason: from kotlin metadata */
    private final getMutedFromManager MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: onCustomAction, reason: from kotlin metadata */
    private final increaseVolume RatingCompat;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final addAllCommands AudioAttributesImplBaseParcelizer;

    public final /* synthetic */ class AudioAttributesCompatParcelizer {
        public static final /* synthetic */ int[] AudioAttributesCompatParcelizer;

        static {
            int[] iArr = new int[lambdasetVideoSurfaceHolder18.values().length];
            try {
                iArr[lambdasetVideoSurfaceHolder18.VARIABLES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[lambdasetVideoSurfaceHolder18.REGULAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[lambdasetVideoSurfaceHolder18.PUSH_NOTIFICATION_VIEWED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            AudioAttributesCompatParcelizer = iArr;
        }
    }

    private getVolumeFromManager(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, getChildTimelines getchildtimelines, copyWithPlaceholderTimeline copywithplaceholdertimeline, getUids getuids, lambdaprepare7 lambdaprepare7Var, addAllCommands addallcommands, setMuted setmuted, blockUntilConstructorFinished blockuntilconstructorfinished, isServerSideInsertedAdGroup isserversideinsertedadgroup, getMutedFromManager getmutedfrommanager, increaseVolume increasevolume, r8lambdayqk5n84OlDC9DTin4ovqV23B95c r8lambdayqk5n84oldc9dtin4ovqv23b95c, PlaylistTimeline1 playlistTimeline1) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(cleverTapInstanceConfig, "");
        toMagicModuleMetaRepoModel.write(getchildtimelines, "");
        toMagicModuleMetaRepoModel.write(copywithplaceholdertimeline, "");
        toMagicModuleMetaRepoModel.write(getuids, "");
        toMagicModuleMetaRepoModel.write(lambdaprepare7Var, "");
        toMagicModuleMetaRepoModel.write(addallcommands, "");
        toMagicModuleMetaRepoModel.write(setmuted, "");
        toMagicModuleMetaRepoModel.write(blockuntilconstructorfinished, "");
        toMagicModuleMetaRepoModel.write(isserversideinsertedadgroup, "");
        toMagicModuleMetaRepoModel.write(getmutedfrommanager, "");
        toMagicModuleMetaRepoModel.write(increasevolume, "");
        toMagicModuleMetaRepoModel.write(r8lambdayqk5n84oldc9dtin4ovqv23b95c, "");
        toMagicModuleMetaRepoModel.write(playlistTimeline1, "");
        this.read = context;
        this.RemoteActionCompatParcelizer = cleverTapInstanceConfig;
        this.write = getchildtimelines;
        this.AudioAttributesCompatParcelizer = copywithplaceholdertimeline;
        this.IconCompatParcelizer = getuids;
        this.AudioAttributesImplApi26Parcelizer = lambdaprepare7Var;
        this.AudioAttributesImplBaseParcelizer = addallcommands;
        this.MediaBrowserCompatItemReceiver = setmuted;
        this.MediaBrowserCompatCustomActionResultReceiver = blockuntilconstructorfinished;
        this.AudioAttributesImplApi21Parcelizer = isserversideinsertedadgroup;
        this.MediaBrowserCompatSearchResultReceiver = getmutedfrommanager;
        this.RatingCompat = increasevolume;
        this.MediaBrowserCompatMediaItem = r8lambdayqk5n84oldc9dtin4ovqv23b95c;
        this.MediaDescriptionCompat = playlistTimeline1;
        this.onCommand = new ArrayList();
    }

    public /* synthetic */ getVolumeFromManager(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, getChildTimelines getchildtimelines, copyWithPlaceholderTimeline copywithplaceholdertimeline, getUids getuids, lambdaprepare7 lambdaprepare7Var, addAllCommands addallcommands, setMuted setmuted, blockUntilConstructorFinished blockuntilconstructorfinished, isServerSideInsertedAdGroup isserversideinsertedadgroup, getMutedFromManager getmutedfrommanager, increaseVolume increasevolume, r8lambdayqk5n84OlDC9DTin4ovqV23B95c r8lambdayqk5n84oldc9dtin4ovqv23b95c, PlaylistTimeline1 playlistTimeline1, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(context, cleverTapInstanceConfig, getchildtimelines, copywithplaceholdertimeline, getuids, lambdaprepare7Var, addallcommands, setmuted, blockuntilconstructorfinished, isserversideinsertedadgroup, getmutedfrommanager, increasevolume, r8lambdayqk5n84oldc9dtin4ovqv23b95c, (i & 8192) != 0 ? cleverTapInstanceConfig.MediaBrowserCompatItemReceiver() : playlistTimeline1);
    }

    public final void IconCompatParcelizer(getStarRating p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.onCommand.add(p0);
    }

    public final void RemoteActionCompatParcelizer(Context p0, lambdasetVideoSurfaceHolder18 p1, String p2, boolean p3) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        this.RemoteActionCompatParcelizer.MediaBrowserCompatItemReceiver().write(this.RemoteActionCompatParcelizer.write(), "Somebody has invoked me to send the queue to CleverTap servers");
        lambdasetDeviceVolume22 lambdasetdevicevolume22 = null;
        boolean z = true;
        while (z) {
            lambdasetDeviceVolume22 lambdasetdevicevolume22Write = this.AudioAttributesImplApi26Parcelizer.write(p0, lambdasetdevicevolume22, p1);
            if (lambdasetdevicevolume22Write.AudioAttributesCompatParcelizer()) {
                this.RemoteActionCompatParcelizer.MediaBrowserCompatItemReceiver().write(this.RemoteActionCompatParcelizer.write(), "No events in the queue, failing");
                if (p1 == lambdasetVideoSurfaceHolder18.PUSH_NOTIFICATION_VIEWED) {
                    if ((lambdasetdevicevolume22 != null ? lambdasetdevicevolume22.read() : null) != null) {
                        try {
                            JSONArray jSONArray = lambdasetdevicevolume22.read();
                            toMagicModuleMetaRepoModel.write(jSONArray);
                            IconCompatParcelizer(jSONArray);
                            return;
                        } catch (Exception unused) {
                            this.RemoteActionCompatParcelizer.MediaBrowserCompatItemReceiver().write(this.RemoteActionCompatParcelizer.write(), "met with exception while notifying listeners for PushImpressionSentToServer event");
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            JSONArray jSONArray2 = lambdasetdevicevolume22Write.read();
            if (jSONArray2 == null || jSONArray2.length() <= 0) {
                this.RemoteActionCompatParcelizer.MediaBrowserCompatItemReceiver().write(this.RemoteActionCompatParcelizer.write(), "No events in the queue, failing");
                return;
            }
            boolean zRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(p0, p1, jSONArray2, p2, p3);
            if (!zRemoteActionCompatParcelizer) {
                this.IconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver();
                this.IconCompatParcelizer.read(jSONArray2, false);
            } else {
                this.IconCompatParcelizer.read(jSONArray2, true);
            }
            lambdasetdevicevolume22 = lambdasetdevicevolume22Write;
            z = zRemoteActionCompatParcelizer;
        }
    }

    public final int AudioAttributesCompatParcelizer() {
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = this.MediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, this.onCustomAction);
        PlaylistTimeline1 playlistTimeline1 = this.MediaDescriptionCompat;
        String strWrite = this.RemoteActionCompatParcelizer.write();
        StringBuilder sb = new StringBuilder("Setting delay frequency to ");
        sb.append(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        playlistTimeline1.IconCompatParcelizer(strWrite, sb.toString());
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    public final void write(lambdasetVideoSurfaceHolder18 p0, Runnable p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        this.MediaMetadataCompat = 0;
        AudioAttributesCompatParcelizer(p0, p1);
    }

    public final boolean IconCompatParcelizer(lambdasetVideoSurfaceHolder18 p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        boolean zWrite = this.MediaBrowserCompatItemReceiver.write(p0 == lambdasetVideoSurfaceHolder18.PUSH_NOTIFICATION_VIEWED);
        boolean z = this.MediaMetadataCompat > 5;
        if (z) {
            read((String) null);
        }
        return zWrite || z;
    }

    private int IconCompatParcelizer() {
        return this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer().getRemoteActionCompatParcelizer();
    }

    private final boolean AudioAttributesCompatParcelizer(String p0) {
        return !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) p0, (Object) this.MediaBrowserCompatSearchResultReceiver.read());
    }

    private final JSONObject RemoteActionCompatParcelizer(String p0) {
        return this.RatingCompat.write(p0);
    }

    private void AudioAttributesCompatParcelizer(lambdasetVideoSurfaceHolder18 p0, Runnable p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        try {
            Timeline timelineWrite = this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer().write(p0 == lambdasetVideoSurfaceHolder18.PUSH_NOTIFICATION_VIEWED);
            try {
                Timeline timeline = timelineWrite;
                if (timeline.AudioAttributesCompatParcelizer()) {
                    this.MediaDescriptionCompat.write(this.RemoteActionCompatParcelizer.write(), "Received success from handshake :)");
                    if (read(timeline)) {
                        MagicModuleMetaLSModel.IconCompatParcelizer(timelineWrite, null);
                        return;
                    } else {
                        AudioAttributesCompatParcelizer(timeline);
                        this.MediaDescriptionCompat.write(this.RemoteActionCompatParcelizer.write(), "We are not muted");
                        p1.run();
                    }
                } else {
                    PlaylistTimeline1 playlistTimeline1 = this.MediaDescriptionCompat;
                    String strWrite = this.RemoteActionCompatParcelizer.write();
                    StringBuilder sb = new StringBuilder("Invalid HTTP status code received for handshake - ");
                    sb.append(timeline.RemoteActionCompatParcelizer());
                    playlistTimeline1.write(strWrite, sb.toString());
                }
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
                MagicModuleMetaLSModel.IconCompatParcelizer(timelineWrite, null);
            } finally {
            }
        } catch (Exception e) {
            PlaylistTimeline1 playlistTimeline12 = this.MediaDescriptionCompat;
            this.RemoteActionCompatParcelizer.write();
            playlistTimeline12.IconCompatParcelizer();
        }
    }

    private final void AudioAttributesCompatParcelizer(Timeline p0) {
        String strWrite = p0.write("X-WZRK-RD");
        RendererWakeupListener.MediaMetadataCompat();
        String str = strWrite;
        if (str == null || TestGroupLSModel.IconCompatParcelizer((CharSequence) str)) {
            return;
        }
        String strWrite2 = p0.write("X-WZRK-SPIKY-RD");
        RendererWakeupListener.MediaMetadataCompat();
        AudioAttributesCompatParcelizer(false);
        read(strWrite);
        RendererWakeupListener.MediaMetadataCompat();
        if (strWrite2 == null) {
            write(strWrite);
        } else {
            write(strWrite2);
        }
    }

    private final boolean read(Timeline p0) {
        String string;
        String strWrite = p0.write("X-WZRK-MUTE");
        if (strWrite != null && (string = TestGroupLSModel.AudioAttributesImplApi26Parcelizer((CharSequence) strWrite).toString()) != null) {
            if (string.length() <= 0) {
                string = null;
            }
            if (string != null) {
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) string, (Object) "true")) {
                    AudioAttributesCompatParcelizer(true);
                    return true;
                }
                AudioAttributesCompatParcelizer(false);
            }
        }
        return false;
    }

    public final boolean RemoteActionCompatParcelizer(Context p0, lambdasetVideoSurfaceHolder18 p1, JSONArray p2, String p3, boolean p4) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        if (p2 != null && p2.length() > 0) {
            if (this.write.MediaBrowserCompatCustomActionResultReceiver() == null) {
                this.MediaDescriptionCompat.IconCompatParcelizer(this.RemoteActionCompatParcelizer.write(), "CleverTap Id not finalized, unable to send queue");
                return false;
            }
            StarRating.Companion companion = StarRating.INSTANCE;
            final StarRating starRating = StarRating.Companion.read(p1);
            JSONObject jSONObjectRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(p3);
            AudioAttributesCompatParcelizer(jSONObjectRemoteActionCompatParcelizer, starRating, p2.optJSONObject(0).has(Scopes.PROFILE));
            final r8lambdagjbcDhYZsg12wwvfvBSOoM0KvOQ r8lambdagjbcdhyzsg12wwvfvbsoom0kvoq = new r8lambdagjbcDhYZsg12wwvfvBSOoM0KvOQ(jSONObjectRemoteActionCompatParcelizer, p2);
            PlaylistTimeline1 playlistTimeline1 = this.MediaDescriptionCompat;
            String strWrite = this.RemoteActionCompatParcelizer.write();
            StringBuilder sb = new StringBuilder("Send queue contains ");
            sb.append(p2.length());
            sb.append(" items: ");
            sb.append(r8lambdagjbcdhyzsg12wwvfvbsoom0kvoq);
            playlistTimeline1.IconCompatParcelizer(strWrite, sb.toString());
            try {
                return IconCompatParcelizer(p1, r8lambdagjbcdhyzsg12wwvfvbsoom0kvoq, new getCreatedOnDateMs() { // from class: o.StarRatingExternalSyntheticLambda0
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return getVolumeFromManager.write(this.AudioAttributesCompatParcelizer, r8lambdagjbcdhyzsg12wwvfvbsoom0kvoq, starRating);
                    }
                }, p4);
            } catch (Exception e) {
                this.onCustomAction++;
                this.MediaMetadataCompat++;
                PlaylistTimeline1 playlistTimeline12 = this.MediaDescriptionCompat;
                this.RemoteActionCompatParcelizer.write();
                playlistTimeline12.write();
                if (this.AudioAttributesImplBaseParcelizer.read() != null) {
                    this.AudioAttributesImplBaseParcelizer.read().RemoteActionCompatParcelizer(p0);
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(getVolumeFromManager getvolumefrommanager, r8lambdagjbcDhYZsg12wwvfvBSOoM0KvOQ r8lambdagjbcdhyzsg12wwvfvbsoom0kvoq, StarRating starRating) {
        toMagicModuleMetaRepoModel.write(getvolumefrommanager, "");
        toMagicModuleMetaRepoModel.write(r8lambdagjbcdhyzsg12wwvfvbsoom0kvoq, "");
        toMagicModuleMetaRepoModel.write(starRating, "");
        getvolumefrommanager.AudioAttributesCompatParcelizer(r8lambdagjbcdhyzsg12wwvfvbsoom0kvoq, starRating);
        return getShowPopup.INSTANCE;
    }

    private final boolean IconCompatParcelizer(lambdasetVideoSurfaceHolder18 p0, r8lambdagjbcDhYZsg12wwvfvBSOoM0KvOQ p1, getCreatedOnDateMs<getShowPopup> p2, boolean p3) {
        boolean zRemoteActionCompatParcelizer;
        Timeline timelineAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(p0, p1);
        try {
            Timeline timeline = timelineAudioAttributesCompatParcelizer;
            this.onCustomAction = 0;
            int i = AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer[p0.ordinal()];
            if (i == 1) {
                zRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(timeline);
            } else if (i == 2) {
                zRemoteActionCompatParcelizer = AudioAttributesCompatParcelizer(timeline, AudioAttributesCompatParcelizer(p1), p2, p3);
                if (!zRemoteActionCompatParcelizer) {
                    i = this.MediaMetadataCompat + 1;
                }
                this.MediaMetadataCompat = i;
            } else {
                if (i != 3) {
                    throw new RenewEligibleCreator();
                }
                zRemoteActionCompatParcelizer = write(timeline);
                this.MediaMetadataCompat = zRemoteActionCompatParcelizer ? 0 : this.MediaMetadataCompat + 1;
            }
            MagicModuleMetaLSModel.IconCompatParcelizer(timelineAudioAttributesCompatParcelizer, null);
            return zRemoteActionCompatParcelizer;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                MagicModuleMetaLSModel.IconCompatParcelizer(timelineAudioAttributesCompatParcelizer, th);
                throw th2;
            }
        }
    }

    private final void AudioAttributesCompatParcelizer(r8lambdagjbcDhYZsg12wwvfvBSOoM0KvOQ p0, StarRating p1) {
        if (p0.AudioAttributesCompatParcelizer() != null) {
            for (getStarRating getstarrating : this.onCommand) {
                boolean zHas = p0.write().optJSONObject(0).has(Scopes.PROFILE);
                JSONObject jSONObjectAudioAttributesCompatParcelizer = p0.AudioAttributesCompatParcelizer();
                lambdareplaceMediaItems5comgoogleandroidexoplayer2SimpleBasePlayer.Companion companion = lambdareplaceMediaItems5comgoogleandroidexoplayer2SimpleBasePlayer.INSTANCE;
                getstarrating.AudioAttributesCompatParcelizer(jSONObjectAudioAttributesCompatParcelizer, p1, lambdareplaceMediaItems5comgoogleandroidexoplayer2SimpleBasePlayer.Companion.write(zHas));
            }
        }
    }

    private final void AudioAttributesCompatParcelizer(JSONObject p0, StarRating p1, boolean p2) {
        if (p0 != null) {
            for (getStarRating getstarrating : this.onCommand) {
                lambdareplaceMediaItems5comgoogleandroidexoplayer2SimpleBasePlayer.Companion companion = lambdareplaceMediaItems5comgoogleandroidexoplayer2SimpleBasePlayer.INSTANCE;
                JSONObject jSONObjectIconCompatParcelizer = getstarrating.IconCompatParcelizer(p1, lambdareplaceMediaItems5comgoogleandroidexoplayer2SimpleBasePlayer.Companion.write(p2));
                if (jSONObjectIconCompatParcelizer != null) {
                    PlayerPlaybackSuppressionReason.IconCompatParcelizer(p0, jSONObjectIconCompatParcelizer);
                }
            }
        }
    }

    private final Timeline AudioAttributesCompatParcelizer(lambdasetVideoSurfaceHolder18 p0, r8lambdagjbcDhYZsg12wwvfvBSOoM0KvOQ p1) {
        int i = AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer[p0.ordinal()];
        if (i == 1) {
            return this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer().RemoteActionCompatParcelizer(p1);
        }
        if (i == 2) {
            return read(p1);
        }
        if (i != 3) {
            throw new RenewEligibleCreator();
        }
        return IconCompatParcelizer(p1);
    }

    private final Timeline read(r8lambdagjbcDhYZsg12wwvfvBSOoM0KvOQ p0) throws JSONException {
        if (this.RemoteActionCompatParcelizer.onAddQueueItem() && !this.AudioAttributesCompatParcelizer.onRemoveQueueItemAt()) {
            ThumbRating thumbRatingAudioAttributesCompatParcelizer = this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer(p0.toString());
            String strIconCompatParcelizer = this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer();
            if (thumbRatingAudioAttributesCompatParcelizer instanceof StreamVolumeManagerVolumeChangeReceiverExternalSyntheticLambda0) {
                StreamVolumeManagerVolumeChangeReceiverExternalSyntheticLambda0 streamVolumeManagerVolumeChangeReceiverExternalSyntheticLambda0 = (StreamVolumeManagerVolumeChangeReceiverExternalSyntheticLambda0) thumbRatingAudioAttributesCompatParcelizer;
                String strIconCompatParcelizer2 = streamVolumeManagerVolumeChangeReceiverExternalSyntheticLambda0.IconCompatParcelizer();
                toMagicModuleMetaRepoModel.write((Object) strIconCompatParcelizer);
                String str = new setStreamType(strIconCompatParcelizer2, strIconCompatParcelizer, streamVolumeManagerVolumeChangeReceiverExternalSyntheticLambda0.write()).read();
                this.MediaDescriptionCompat.read();
                return this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer().write(str, true);
            }
            this.MediaDescriptionCompat.read();
        }
        return this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer().write(p0.toString(), false);
    }

    private final Timeline IconCompatParcelizer(r8lambdagjbcDhYZsg12wwvfvBSOoM0KvOQ p0) {
        return this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer().write(p0.toString());
    }

    private final boolean RemoteActionCompatParcelizer(Timeline p0) {
        if (p0.AudioAttributesCompatParcelizer()) {
            String strWrite = p0.write();
            JSONObject jSONObject = PlayerPlaybackSuppressionReason.read(strWrite);
            this.MediaDescriptionCompat.write(this.RemoteActionCompatParcelizer.write(), "Processing variables response : ".concat(String.valueOf(jSONObject)));
            this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer(jSONObject, strWrite, this.read);
            return true;
        }
        RemoteActionCompatParcelizer(p0, "Variables");
        return false;
    }

    private final void RemoteActionCompatParcelizer(Timeline p0, String p1) {
        int iRemoteActionCompatParcelizer = p0.RemoteActionCompatParcelizer();
        if (iRemoteActionCompatParcelizer != 400) {
            if (iRemoteActionCompatParcelizer == 401) {
                this.MediaDescriptionCompat.AudioAttributesCompatParcelizer();
                return;
            }
            PlaylistTimeline1 playlistTimeline1 = this.MediaDescriptionCompat;
            p0.RemoteActionCompatParcelizer();
            playlistTimeline1.AudioAttributesCompatParcelizer();
            return;
        }
        JSONObject jSONObject = PlayerPlaybackSuppressionReason.read(p0.write());
        if (jSONObject != null && !TextUtils.isEmpty(jSONObject.optString("error"))) {
            jSONObject.optString("error");
            this.MediaDescriptionCompat.AudioAttributesCompatParcelizer();
        } else {
            this.MediaDescriptionCompat.AudioAttributesCompatParcelizer();
        }
    }

    private final boolean write(Timeline p0) {
        if (!p0.AudioAttributesCompatParcelizer()) {
            PlaylistTimeline1 playlistTimeline1 = this.MediaDescriptionCompat;
            p0.RemoteActionCompatParcelizer();
            playlistTimeline1.RemoteActionCompatParcelizer();
            return false;
        }
        if (AudioAttributesImplApi26Parcelizer(p0) || read(p0)) {
            return false;
        }
        AudioAttributesCompatParcelizer(p0);
        this.MediaDescriptionCompat.IconCompatParcelizer(this.RemoteActionCompatParcelizer.write(), "Push Impressions sent successfully");
        this.MediaBrowserCompatSearchResultReceiver.AudioAttributesCompatParcelizer(IconCompatParcelizer());
        read(IconCompatParcelizer());
        PlaylistTimeline1 playlistTimeline12 = this.MediaDescriptionCompat;
        String strWrite = this.RemoteActionCompatParcelizer.write();
        StringBuilder sb = new StringBuilder("Processing response : ");
        sb.append(PlayerPlaybackSuppressionReason.read(p0.write()));
        playlistTimeline12.write(strWrite, sb.toString());
        return true;
    }

    private final boolean AudioAttributesCompatParcelizer(Timeline p0, boolean p1, getCreatedOnDateMs<getShowPopup> p2, boolean p3) {
        if (!p0.AudioAttributesCompatParcelizer()) {
            IconCompatParcelizer(p0);
            return false;
        }
        if (AudioAttributesImplApi26Parcelizer(p0) || read(p0)) {
            return false;
        }
        AudioAttributesCompatParcelizer(p0);
        p2.invoke();
        this.MediaDescriptionCompat.IconCompatParcelizer(this.RemoteActionCompatParcelizer.write(), "Queue sent successfully");
        this.MediaBrowserCompatSearchResultReceiver.AudioAttributesCompatParcelizer(IconCompatParcelizer());
        read(IconCompatParcelizer());
        String strWrite = p0.write();
        JSONObject jSONObject = PlayerPlaybackSuppressionReason.read(strWrite);
        this.MediaDescriptionCompat.write(this.RemoteActionCompatParcelizer.write(), "Processing response : ".concat(String.valueOf(jSONObject)));
        String str = strWrite;
        if (str == null || TestGroupLSModel.IconCompatParcelizer((CharSequence) str) || jSONObject == null) {
            return true;
        }
        if (Boolean.parseBoolean(p0.write("X-CleverTap-Encryption-Enabled"))) {
            ThumbRating thumbRatingIconCompatParcelizer = this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(strWrite);
            if (thumbRatingIconCompatParcelizer instanceof isMuted) {
                this.MediaDescriptionCompat.write(this.RemoteActionCompatParcelizer.write(), "Failed to decrypt response");
                return false;
            }
            if (!(thumbRatingIconCompatParcelizer instanceof StreamVolumeManagerVolumeChangeReceiverExternalSyntheticLambda0)) {
                throw new RenewEligibleCreator();
            }
            strWrite = ((StreamVolumeManagerVolumeChangeReceiverExternalSyntheticLambda0) thumbRatingIconCompatParcelizer).IconCompatParcelizer();
            jSONObject = PlayerPlaybackSuppressionReason.read(strWrite);
            this.MediaDescriptionCompat.read();
        }
        this.MediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer(p1, jSONObject, strWrite, p3);
        return true;
    }

    private boolean AudioAttributesImplApi26Parcelizer(Timeline p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        String strWrite = p0.write("X-WZRK-RD");
        if (!PlayerPlaybackSuppressionReason.AudioAttributesCompatParcelizer(strWrite) || !AudioAttributesCompatParcelizer(strWrite)) {
            return false;
        }
        read(strWrite);
        PlaylistTimeline1 playlistTimeline1 = this.MediaDescriptionCompat;
        String strWrite2 = this.RemoteActionCompatParcelizer.write();
        StringBuilder sb = new StringBuilder("The domain has changed to ");
        sb.append(strWrite);
        sb.append(". The request will be retried shortly.");
        playlistTimeline1.IconCompatParcelizer(strWrite2, sb.toString());
        return true;
    }

    private final void IconCompatParcelizer(Timeline p0) {
        PlaylistTimeline1 playlistTimeline1 = this.MediaDescriptionCompat;
        p0.RemoteActionCompatParcelizer();
        playlistTimeline1.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer = p0.RemoteActionCompatParcelizer();
        if (iRemoteActionCompatParcelizer == 402) {
            this.MediaDescriptionCompat.read();
            this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver(true);
        } else {
            if (iRemoteActionCompatParcelizer != 419) {
                return;
            }
            this.MediaDescriptionCompat.read();
            this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver(true);
        }
    }

    private static boolean AudioAttributesCompatParcelizer(r8lambdagjbcDhYZsg12wwvfvBSOoM0KvOQ p0) {
        int length = p0.write().length();
        for (int i = 0; i < length; i++) {
            try {
                JSONObject jSONObject = p0.write().getJSONObject(i);
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) "event", (Object) jSONObject.getString("type"))) {
                    String string = jSONObject.getString("evtName");
                    if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) "App Launched", (Object) string) || toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) "wzrk_fetch", (Object) string)) {
                        return true;
                    }
                } else {
                    continue;
                }
            } catch (JSONException unused) {
            }
        }
        return false;
    }

    private final void IconCompatParcelizer(JSONArray p0) throws JSONException {
        int length = p0.length();
        for (int i = 0; i < length; i++) {
            try {
                JSONObject jSONObjectOptJSONObject = p0.getJSONObject(i).optJSONObject("evtData");
                if (jSONObjectOptJSONObject != null) {
                    String strRemoteActionCompatParcelizer = getAdState.RemoteActionCompatParcelizer(jSONObjectOptJSONObject.optString("wzrk_acct_id"), jSONObjectOptJSONObject.optString("wzrk_pid"));
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strRemoteActionCompatParcelizer, "");
                    IconCompatParcelizer(strRemoteActionCompatParcelizer);
                }
            } catch (JSONException unused) {
                this.MediaDescriptionCompat.write(this.RemoteActionCompatParcelizer.write(), "Encountered an exception while parsing the push notification viewed event queue");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.MediaDescriptionCompat.write(this.RemoteActionCompatParcelizer.write(), "push notification viewed event sent successfully");
    }

    private final void IconCompatParcelizer(String p0) {
        setContentPositionMs setcontentpositionms = PlayerTimelineChangeReason.read(p0);
        if (setcontentpositionms != null) {
            PlaylistTimeline1 playlistTimeline1 = this.MediaDescriptionCompat;
            String strWrite = this.RemoteActionCompatParcelizer.write();
            StringBuilder sb = new StringBuilder("notifying listener ");
            sb.append(p0);
            sb.append(", that push impression sent successfully");
            playlistTimeline1.write(strWrite, sb.toString());
            setcontentpositionms.AudioAttributesCompatParcelizer();
        }
    }

    private final void read(String p0) {
        this.MediaDescriptionCompat.write(this.RemoteActionCompatParcelizer.write(), "Setting domain to ".concat(String.valueOf(p0)));
        this.MediaBrowserCompatSearchResultReceiver.write(p0);
        this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer().RemoteActionCompatParcelizer(p0);
        if (this.AudioAttributesImplBaseParcelizer.RatingCompat() != null) {
            if (p0 != null) {
                this.AudioAttributesImplBaseParcelizer.RatingCompat();
                RendererCapabilitiesListener.RemoteActionCompatParcelizer(p0);
            } else {
                this.AudioAttributesImplBaseParcelizer.RatingCompat();
            }
        }
    }

    private final void read(int p0) {
        if (this.MediaBrowserCompatSearchResultReceiver.write() > 0) {
            return;
        }
        this.MediaBrowserCompatSearchResultReceiver.write(p0);
    }

    private final void write(String p0) {
        this.MediaDescriptionCompat.write(this.RemoteActionCompatParcelizer.write(), "Setting spiky domain to ".concat(String.valueOf(p0)));
        this.MediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer(p0);
        this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer().read(p0);
    }

    private final void AudioAttributesCompatParcelizer(boolean p0) {
        if (p0) {
            this.MediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer(true);
            this.MediaBrowserCompatSearchResultReceiver.write((String) null);
            TracksExternalSyntheticLambda0.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer).read().read("CommsManager#setMuted", new Callable() { // from class: o.StreamVolumeManager
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return getVolumeFromManager.AudioAttributesCompatParcelizer(this.write);
                }
            });
            return;
        }
        this.MediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(getVolumeFromManager getvolumefrommanager) {
        toMagicModuleMetaRepoModel.write(getvolumefrommanager, "");
        getvolumefrommanager.AudioAttributesImplApi26Parcelizer.write(getvolumefrommanager.read);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: renamed from: o.getVolumeFromManager$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/getVolumeFromManager$write;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "write", "(Landroid/content/Context;)Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static boolean write(Context p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            try {
                Object systemService = p0.getSystemService("connectivity");
                ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
                if (connectivityManager == null) {
                    return true;
                }
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null) {
                    if (activeNetworkInfo.isConnected()) {
                        return true;
                    }
                }
                return false;
            } catch (Exception unused) {
                return true;
            }
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    @getMagicModuleMeta
    public static final boolean RemoteActionCompatParcelizer(Context context) {
        return Companion.write(context);
    }
}
