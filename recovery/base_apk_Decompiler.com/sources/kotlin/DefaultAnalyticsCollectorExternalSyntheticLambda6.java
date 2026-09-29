package kotlin;

import android.net.Uri;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b)\u0018\u0000 %2\u00020\u0001:\u0002%&BÅ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u001e\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\f0\f\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0004\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u0002¢\u0006\u0004\b \u0010!R\u0017\u0010%\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010!R\u001a\u0010&\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b\"\u0010!R,\u0010$\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\f0\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010\"\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010)\u001a\u0004\b%\u0010*R\u001c\u0010'\u001a\u0004\u0018\u00010\u00168\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b'\u0010-R\u001a\u0010/\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010#\u001a\u0004\b&\u0010!R\u0014\u00100\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b/\u0010#R\u0014\u00102\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010.\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b2\u0010#R\u001c\u0010+\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b3\u00101\u001a\u0004\b.\u00104R\u001c\u0010 \u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b5\u00101\u001a\u0004\b0\u00104R\u001a\u00105\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u00101\u001a\u0004\b2\u00104R\u001a\u00106\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b+\u00108R\u0014\u00103\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b9\u00101R\u0014\u00109\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b:\u00101R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u001c\u0010>\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b=\u00101\u001a\u0004\b/\u00104R\u0014\u0010:\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b>\u0010#R\u0014\u0010;\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b?\u0010#"}, d2 = {"Lo/DefaultAnalyticsCollectorExternalSyntheticLambda6;", "", "", "p0", "", "p1", "p2", "", "p3", "Ljava/util/EnumSet;", "Lo/DefaultAnalyticsCollectorExternalSyntheticLambda9;", "p4", "", "Lo/DefaultAnalyticsCollectorExternalSyntheticLambda6$read;", "p5", "p6", "Lo/DefaultAnalyticsCollectorExternalSyntheticLambda55;", "p7", "p8", "p9", "p10", "p11", "Lorg/json/JSONArray;", "p12", "p13", "p14", "p15", "p16", "p17", "p18", "<init>", "(ZLjava/lang/String;ZILjava/util/EnumSet;Ljava/util/Map;ZLo/DefaultAnalyticsCollectorExternalSyntheticLambda55;Ljava/lang/String;Ljava/lang/String;ZZLorg/json/JSONArray;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "MediaDescriptionCompat", "()Z", "write", "Z", "IconCompatParcelizer", "AudioAttributesCompatParcelizer", "read", "RemoteActionCompatParcelizer", "Ljava/util/Map;", "Lo/DefaultAnalyticsCollectorExternalSyntheticLambda55;", "()Lo/DefaultAnalyticsCollectorExternalSyntheticLambda55;", "AudioAttributesImplApi26Parcelizer", "Lorg/json/JSONArray;", "()Lorg/json/JSONArray;", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesImplApi21Parcelizer", "MediaBrowserCompatItemReceiver", "Ljava/lang/String;", "AudioAttributesImplBaseParcelizer", "MediaBrowserCompatSearchResultReceiver", "()Ljava/lang/String;", "MediaMetadataCompat", "RatingCompat", "I", "()I", "MediaBrowserCompatMediaItem", "onCommand", "onCustomAction", "Ljava/util/EnumSet;", "onAddQueueItem", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "handleMediaPlayPauseIfPendingOnHandler"}, k = 1, mv = {1, 4, 0})
public final class DefaultAnalyticsCollectorExternalSyntheticLambda6 {

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final boolean MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final JSONArray RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final boolean MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final DefaultAnalyticsCollectorExternalSyntheticLambda55 write;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final boolean AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final String AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private final String MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private final String AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from kotlin metadata */
    private final boolean onCommand;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private final String MediaMetadataCompat;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private final String MediaDescriptionCompat;
    private final int RatingCompat;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final Map<String, Map<String, read>> IconCompatParcelizer;

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
    private final boolean onCustomAction;

    /* JADX INFO: renamed from: onAddQueueItem, reason: from kotlin metadata */
    private final String MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    /* JADX INFO: renamed from: onCommand, reason: from kotlin metadata */
    private final String MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: onCustomAction, reason: from kotlin metadata */
    private final EnumSet<DefaultAnalyticsCollectorExternalSyntheticLambda9> onAddQueueItem;
    private final boolean read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final boolean AudioAttributesCompatParcelizer;

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultAnalyticsCollectorExternalSyntheticLambda6(boolean z, String str, boolean z2, int i, EnumSet<DefaultAnalyticsCollectorExternalSyntheticLambda9> enumSet, Map<String, ? extends Map<String, read>> map, boolean z3, DefaultAnalyticsCollectorExternalSyntheticLambda55 defaultAnalyticsCollectorExternalSyntheticLambda55, String str2, String str3, boolean z4, boolean z5, JSONArray jSONArray, String str4, boolean z6, boolean z7, String str5, String str6, String str7) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(enumSet, "");
        toMagicModuleMetaRepoModel.write(map, "");
        toMagicModuleMetaRepoModel.write(defaultAnalyticsCollectorExternalSyntheticLambda55, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        this.onCommand = z;
        this.AudioAttributesImplBaseParcelizer = str;
        this.MediaBrowserCompatCustomActionResultReceiver = z2;
        this.RatingCompat = i;
        this.onAddQueueItem = enumSet;
        this.IconCompatParcelizer = map;
        this.AudioAttributesCompatParcelizer = z3;
        this.write = defaultAnalyticsCollectorExternalSyntheticLambda55;
        this.MediaBrowserCompatSearchResultReceiver = str2;
        this.MediaBrowserCompatMediaItem = str3;
        this.AudioAttributesImplApi21Parcelizer = z4;
        this.read = z5;
        this.RemoteActionCompatParcelizer = jSONArray;
        this.MediaMetadataCompat = str4;
        this.onCustomAction = z6;
        this.MediaBrowserCompatItemReceiver = z7;
        this.AudioAttributesImplApi26Parcelizer = str5;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = str6;
        this.MediaDescriptionCompat = str7;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final int getRatingCompat() {
        return this.RatingCompat;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final boolean getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final DefaultAnalyticsCollectorExternalSyntheticLambda55 getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final boolean getAudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final boolean getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final JSONArray getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final String getMediaMetadataCompat() {
        return this.MediaMetadataCompat;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final String getAudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final String getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final String getMediaDescriptionCompat() {
        return this.MediaDescriptionCompat;
    }

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from getter */
    public final boolean getOnCommand() {
        return this.onCommand;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\f\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B-\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u000f\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013"}, d2 = {"Lo/DefaultAnalyticsCollectorExternalSyntheticLambda6$read;", "", "", "p0", "p1", "Landroid/net/Uri;", "p2", "", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;[I)V", "RemoteActionCompatParcelizer", "Ljava/lang/String;", "AudioAttributesCompatParcelizer", "()Ljava/lang/String;", "read", "write", "Landroid/net/Uri;", "IconCompatParcelizer", "[I"}, k = 1, mv = {1, 4, 0})
    public static final class read {

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        private final String IconCompatParcelizer;

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        private final String read;

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        private final int[] RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        private final Uri AudioAttributesCompatParcelizer;

        public /* synthetic */ read(String str, String str2, Uri uri, int[] iArr, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this(str, str2, uri, iArr);
        }

        private read(String str, String str2, Uri uri, int[] iArr) {
            this.read = str;
            this.IconCompatParcelizer = str2;
            this.AudioAttributesCompatParcelizer = uri;
            this.RemoteActionCompatParcelizer = iArr;
        }

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
        public final String getRead() {
            return this.read;
        }

        /* JADX INFO: renamed from: write, reason: from getter */
        public final String getIconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        /* JADX INFO: renamed from: o.DefaultAnalyticsCollectorExternalSyntheticLambda6$read$IconCompatParcelizer, reason: from kotlin metadata */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u0007\u001a\u0004\u0018\u00010\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0007\u0010\u000b"}, d2 = {"Lo/DefaultAnalyticsCollectorExternalSyntheticLambda6$read$IconCompatParcelizer;", "", "<init>", "()V", "Lorg/json/JSONObject;", "p0", "Lo/DefaultAnalyticsCollectorExternalSyntheticLambda6$read;", "write", "(Lorg/json/JSONObject;)Lo/DefaultAnalyticsCollectorExternalSyntheticLambda6$read;", "Lorg/json/JSONArray;", "", "(Lorg/json/JSONArray;)[I"}, k = 1, mv = {1, 4, 0})
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
                this();
            }

            public final read write(JSONObject p0) {
                toMagicModuleMetaRepoModel.write(p0, "");
                String strOptString = p0.optString("name");
                if (DefaultAnalyticsCollectorMediaPeriodQueueTracker.IconCompatParcelizer(strOptString)) {
                    return null;
                }
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strOptString, "");
                List listWrite = TestGroupLSModel.write(strOptString, new String[]{"|"}, 0, 6);
                if (listWrite.size() != 2) {
                    return null;
                }
                String str = (String) IntermediateLoginResponseBody.RatingCompat(listWrite);
                String str2 = (String) IntermediateLoginResponseBody.MediaBrowserCompatMediaItem(listWrite);
                if (DefaultAnalyticsCollectorMediaPeriodQueueTracker.IconCompatParcelizer(str) || DefaultAnalyticsCollectorMediaPeriodQueueTracker.IconCompatParcelizer(str2)) {
                    return null;
                }
                String strOptString2 = p0.optString("url");
                return new read(str, str2, DefaultAnalyticsCollectorMediaPeriodQueueTracker.IconCompatParcelizer(strOptString2) ? null : Uri.parse(strOptString2), write(p0.optJSONArray("versions")), null);
            }

            /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static int[] write(org.json.JSONArray r7) {
                /*
                    if (r7 == 0) goto L36
                    int r0 = r7.length()
                    int[] r1 = new int[r0]
                    r2 = 0
                L9:
                    if (r2 >= r0) goto L35
                    r3 = -1
                    int r4 = r7.optInt(r2, r3)
                    if (r4 != r3) goto L2f
                    java.lang.String r5 = r7.optString(r2)
                    boolean r6 = kotlin.DefaultAnalyticsCollectorMediaPeriodQueueTracker.IconCompatParcelizer(r5)
                    if (r6 != 0) goto L2f
                    java.lang.String r4 = ""
                    kotlin.toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r5, r4)     // Catch: java.lang.NumberFormatException -> L26
                    int r3 = java.lang.Integer.parseInt(r5)     // Catch: java.lang.NumberFormatException -> L26
                    goto L30
                L26:
                    r4 = move-exception
                    java.lang.String r5 = "FacebookSDK"
                    java.lang.Exception r4 = (java.lang.Exception) r4
                    kotlin.DefaultAnalyticsCollectorMediaPeriodQueueTracker.IconCompatParcelizer(r5, r4)
                    goto L30
                L2f:
                    r3 = r4
                L30:
                    r1[r2] = r3
                    int r2 = r2 + 1
                    goto L9
                L35:
                    return r1
                L36:
                    r7 = 0
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: o.DefaultAnalyticsCollectorExternalSyntheticLambda6.read.Companion.write(org.json.JSONArray):int[]");
            }
        }
    }
}
