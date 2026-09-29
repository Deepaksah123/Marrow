package kotlin;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.MagicModuleUseCaseImplWhenMappings;
import kotlin.Metadata;
import kotlin.getPeriodIndexFromWindowPosition;
import kotlin.lambdadecreaseDeviceVolume27;
import org.apache.commons.compress.archivers.tar.TarConstants;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0080\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0016\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u001bJ\u001f\u0010\u0019\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0019\u0010\u001dJ'\u0010\u0016\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u001e2\u0006\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u001fJ\u001f\u0010\u0019\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0019\u0010 J\u001f\u0010\u0011\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010 J\u001f\u0010\u0016\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010 J\u0017\u0010!\u001a\u00020\u001e2\u0006\u0010\u0003\u001a\u00020\u0013H\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010\u0014\u001a\u00020\u001e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010#J\u001a\u0010$\u001a\u00020\u00132\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010,R\u0014\u0010!\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u0011\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010/R\u0014\u0010\u0014\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u00100R\u0014\u00102\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u00101"}, d2 = {"Lo/getPositionDiscontinuityReason;", "", "", "p0", "", "p1", "Lo/PlaylistTimeline1;", "p2", "Lo/getPeriodIndexFromWindowPosition;", "p3", "Lo/getSurfaceHolderSize;", "p4", "Lo/lambdaclearVideoOutput21;", "p5", "<init>", "(Ljava/lang/String;ILo/PlaylistTimeline1;Lo/getPeriodIndexFromWindowPosition;Lo/getSurfaceHolderSize;Lo/lambdaclearVideoOutput21;)V", "", "read", "()V", "", "IconCompatParcelizer", "(ZZ)Z", "RemoteActionCompatParcelizer", "Lorg/json/JSONObject;", "()Lorg/json/JSONObject;", "AudioAttributesCompatParcelizer", "(Z)Z", "()Z", "Lo/lambdadecreaseDeviceVolume27;", "(ZLjava/lang/String;)Lo/lambdadecreaseDeviceVolume27;", "Lo/lambdadecreaseDeviceVolume26;", "(Lo/lambdadecreaseDeviceVolume26;Lo/lambdadecreaseDeviceVolume26;Ljava/lang/String;)Lo/lambdadecreaseDeviceVolume27;", "(Lo/lambdadecreaseDeviceVolume26;Ljava/lang/String;)Lo/lambdadecreaseDeviceVolume27;", "write", "(Z)Lo/lambdadecreaseDeviceVolume26;", "(Ljava/lang/String;)Lo/lambdadecreaseDeviceVolume26;", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "AudioAttributesImplApi21Parcelizer", "Ljava/lang/String;", "I", "AudioAttributesImplBaseParcelizer", "Lo/PlaylistTimeline1;", "Lo/getPeriodIndexFromWindowPosition;", "Lo/getSurfaceHolderSize;", "Lo/lambdaclearVideoOutput21;", "MediaBrowserCompatCustomActionResultReceiver"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class getPositionDiscontinuityReason {

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final String RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final PlaylistTimeline1 write;
    private final getSurfaceHolderSize IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final lambdaclearVideoOutput21 MediaBrowserCompatCustomActionResultReceiver;
    private final getPeriodIndexFromWindowPosition read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final int AudioAttributesCompatParcelizer;

    public final /* synthetic */ class write {
        public static final /* synthetic */ int[] AudioAttributesCompatParcelizer;

        static {
            int[] iArr = new int[lambdadecreaseDeviceVolume26.values().length];
            try {
                iArr[lambdadecreaseDeviceVolume26.write.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[lambdadecreaseDeviceVolume26.RemoteActionCompatParcelizer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[lambdadecreaseDeviceVolume26.IconCompatParcelizer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            AudioAttributesCompatParcelizer = iArr;
        }
    }

    public getPositionDiscontinuityReason(String str, int i, PlaylistTimeline1 playlistTimeline1, getPeriodIndexFromWindowPosition getperiodindexfromwindowposition, getSurfaceHolderSize getsurfaceholdersize, lambdaclearVideoOutput21 lambdaclearvideooutput21) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(playlistTimeline1, "");
        toMagicModuleMetaRepoModel.write(getperiodindexfromwindowposition, "");
        toMagicModuleMetaRepoModel.write(getsurfaceholdersize, "");
        toMagicModuleMetaRepoModel.write(lambdaclearvideooutput21, "");
        this.RemoteActionCompatParcelizer = str;
        this.AudioAttributesCompatParcelizer = i;
        this.write = playlistTimeline1;
        this.read = getperiodindexfromwindowposition;
        this.IconCompatParcelizer = getsurfaceholdersize;
        this.MediaBrowserCompatCustomActionResultReceiver = lambdaclearvideooutput21;
    }

    public final void read() {
        int iRemoteActionCompatParcelizer = this.IconCompatParcelizer.RemoteActionCompatParcelizer();
        int iIconCompatParcelizer = this.IconCompatParcelizer.IconCompatParcelizer();
        boolean zAudioAttributesCompatParcelizer = this.IconCompatParcelizer.AudioAttributesCompatParcelizer();
        if (!zAudioAttributesCompatParcelizer || (iRemoteActionCompatParcelizer != this.AudioAttributesCompatParcelizer && iIconCompatParcelizer != -1)) {
            iIconCompatParcelizer = 1;
        }
        this.IconCompatParcelizer.IconCompatParcelizer(this.AudioAttributesCompatParcelizer);
        if (iIconCompatParcelizer == 0) {
            PlaylistTimeline1 playlistTimeline1 = this.write;
            String str = this.RemoteActionCompatParcelizer;
            StringBuilder sb = new StringBuilder("Migration not required: config-encryption-level ");
            sb.append(this.AudioAttributesCompatParcelizer);
            sb.append(", stored-encryption-level ");
            sb.append(iRemoteActionCompatParcelizer);
            playlistTimeline1.write(str, sb.toString());
            return;
        }
        PlaylistTimeline1 playlistTimeline12 = this.write;
        String str2 = this.RemoteActionCompatParcelizer;
        StringBuilder sb2 = new StringBuilder("Starting migration from encryption level ");
        sb2.append(iRemoteActionCompatParcelizer);
        sb2.append(" to ");
        sb2.append(this.AudioAttributesCompatParcelizer);
        sb2.append(" with migrationFailureCount ");
        sb2.append(iIconCompatParcelizer);
        sb2.append(" and isSSInAppDataMigrated ");
        sb2.append(zAudioAttributesCompatParcelizer);
        playlistTimeline12.write(str2, sb2.toString());
        boolean zIconCompatParcelizer = IconCompatParcelizer(this.AudioAttributesCompatParcelizer == getTimelineChangeReason.AudioAttributesCompatParcelizer.getAudioAttributesCompatParcelizer(), iIconCompatParcelizer == -1);
        this.IconCompatParcelizer.write(zIconCompatParcelizer);
        this.IconCompatParcelizer.read(zIconCompatParcelizer);
    }

    private final boolean IconCompatParcelizer(boolean p0, boolean p1) {
        return RemoteActionCompatParcelizer(p0, p1) && AudioAttributesCompatParcelizer(p0) && IconCompatParcelizer();
    }

    private final boolean RemoteActionCompatParcelizer(boolean p0, boolean p1) {
        String strIconCompatParcelizer;
        this.write.write(this.RemoteActionCompatParcelizer, "Migrating encryption level for cachedGUIDsKey prefs");
        if (p1) {
            JSONObject jSONObjectRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
            int length = jSONObjectRemoteActionCompatParcelizer.length();
            this.MediaBrowserCompatCustomActionResultReceiver.read(length);
            if (length == 0) {
                this.MediaBrowserCompatCustomActionResultReceiver.read();
                return true;
            }
            strIconCompatParcelizer = jSONObjectRemoteActionCompatParcelizer.toString();
            toMagicModuleMetaRepoModel.write((Object) strIconCompatParcelizer);
        } else {
            strIconCompatParcelizer = this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer();
            if (strIconCompatParcelizer == null) {
                return true;
            }
        }
        lambdadecreaseDeviceVolume27 lambdadecreasedevicevolume27AudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(p0, strIconCompatParcelizer);
        this.MediaBrowserCompatCustomActionResultReceiver.write(lambdadecreasedevicevolume27AudioAttributesCompatParcelizer.getRead());
        PlaylistTimeline1 playlistTimeline1 = this.write;
        String str = this.RemoteActionCompatParcelizer;
        StringBuilder sb = new StringBuilder("Cached GUIDs migrated with success = ");
        sb.append(lambdadecreasedevicevolume27AudioAttributesCompatParcelizer);
        sb.append(".migrationSuccessful = ");
        sb.append(lambdadecreasedevicevolume27AudioAttributesCompatParcelizer.getRead());
        playlistTimeline1.write(str, sb.toString());
        return lambdadecreasedevicevolume27AudioAttributesCompatParcelizer.getAudioAttributesCompatParcelizer();
    }

    private final JSONObject RemoteActionCompatParcelizer() {
        JSONObject jSONObjectRemoteActionCompatParcelizer = this.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer();
        JSONObject jSONObject = new JSONObject();
        try {
            Iterator<String> itKeys = jSONObjectRemoteActionCompatParcelizer.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                toMagicModuleMetaRepoModel.write((Object) next);
                List listWrite = TestGroupLSModel.write(next, new String[]{"_"}, 2, 2);
                String str = (String) listWrite.get(0);
                lambdadecreaseDeviceVolume27 lambdadecreasedevicevolume27AudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(false, (String) listWrite.get(1));
                if (lambdadecreasedevicevolume27AudioAttributesCompatParcelizer.getAudioAttributesCompatParcelizer()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append('_');
                    sb.append(lambdadecreasedevicevolume27AudioAttributesCompatParcelizer.getRead());
                    jSONObject.put(sb.toString(), jSONObjectRemoteActionCompatParcelizer.get(next));
                }
            }
            return jSONObject;
        } catch (Throwable th) {
            this.write.write(this.RemoteActionCompatParcelizer, "Error migrating format for cached GUIDs: Clearing and starting fresh ".concat(String.valueOf(th)));
            return jSONObject;
        }
    }

    private final boolean AudioAttributesCompatParcelizer(boolean p0) {
        this.write.write(this.RemoteActionCompatParcelizer, "Migrating encryption level for user profiles in DB");
        boolean z = true;
        for (Map.Entry<String, JSONObject> entry : this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer().entrySet()) {
            String key = entry.getKey();
            JSONObject value = entry.getValue();
            try {
                HashSet<String> hashSet = getTimelines.AudioAttributesImplBaseParcelizer;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(hashSet, "");
                for (String str : hashSet) {
                    toMagicModuleMetaRepoModel.write((Object) str);
                    String strWrite = onSeekStarted.write(value, str);
                    if (strWrite != null) {
                        lambdadecreaseDeviceVolume27 lambdadecreasedevicevolume27AudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(p0, strWrite);
                        z = z && lambdadecreasedevicevolume27AudioAttributesCompatParcelizer.getAudioAttributesCompatParcelizer();
                        value.put(str, lambdadecreasedevicevolume27AudioAttributesCompatParcelizer.getRead());
                    }
                }
                PlaylistTimeline1 playlistTimeline1 = this.write;
                String str2 = this.RemoteActionCompatParcelizer;
                StringBuilder sb = new StringBuilder();
                sb.append("DB migrated with success = ");
                sb.append(z);
                sb.append(" = ");
                sb.append(value);
                playlistTimeline1.write(str2, sb.toString());
            } catch (Exception e) {
                PlaylistTimeline1 playlistTimeline12 = this.write;
                String str3 = this.RemoteActionCompatParcelizer;
                StringBuilder sb2 = new StringBuilder("Error migrating profile ");
                sb2.append(key);
                sb2.append(": ");
                sb2.append(e);
                playlistTimeline12.write(str3, sb2.toString());
            }
            if (this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer(key, value) <= -1) {
                z = false;
            }
        }
        return z;
    }

    private final boolean IconCompatParcelizer() {
        this.write.write(this.RemoteActionCompatParcelizer, "Migrating encryption for InAppData");
        final MagicModuleUseCaseImplWhenMappings.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new MagicModuleUseCaseImplWhenMappings.AudioAttributesCompatParcelizer();
        audioAttributesCompatParcelizer.IconCompatParcelizer = true;
        getAnswerMap<? super String, String> getanswermap = new getAnswerMap() { // from class: o.getStateWithNewPlaylistAndPosition
            private static boolean AudioAttributesImplApi21Parcelizer;
            private static int AudioAttributesImplApi26Parcelizer;
            private static char[] AudioAttributesImplBaseParcelizer;
            private static int IconCompatParcelizer;
            private static int MediaBrowserCompatCustomActionResultReceiver;
            private static int MediaBrowserCompatItemReceiver;
            private static boolean RatingCompat;
            private static long RemoteActionCompatParcelizer;
            private static char read;
            private static final byte[] $$c = {3, 110, -29, 16};
            private static final int $$d = 143;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {109, -42, -99, -39, -26, -12, 1, 43, -44, 2, -3, 15, -19, 36, -17, -17, 15, -2, -7, 3, -17, 21, -13};
            private static final int $$b = 118;
            private static final byte[] MediaBrowserCompatSearchResultReceiver = {62, -25, -124, -119, -13, 10, -14, 3, 6, 5, TarConstants.LF_FIFO, -72, 13, 4, -18, 73, -40, -19, 4, -18, TarConstants.LF_BLK, -44, 1, 8, -3, 2, -14, 3, 17, -19, 11, -6, 1, 2, -15, 41, -26, -20, 39, -19, -11, 11, 4, -19, 32, -21, -4, 8, -10, -6, 1, -13, 10, -14, 3, 6, 5, TarConstants.LF_FIFO, -72, 13, 4, -18, 73, -29, -26, -20, TarConstants.LF_BLK, -49, 17, -9, -6, -1, -3, 5, 12, -11, 3, -17, 21, 24, -24, -15, 19, 14, -33, 19, -19, 15, 9, -21, 21, TarConstants.LF_CHR, -62, 11, -13, 7, 57, -37, -33, 2, 9, -5, 7, 3, 4, 3, -11, 9, -21, 21, TarConstants.LF_CHR, -62, 11, -13, 7, 57, -27, -37, -6, 15, -2, 2, -13, 21, -11, -9, 16, 22, -23, -5, -6, 30, -11, -11, -9, 16, -13, 10, -14, 3, 6, 5, TarConstants.LF_FIFO, -70, 15, -19, 4, 70, -38, -17, -19, 4, 31, -31, 11, -3, -7, -5, 10, -1, -19, 41, -23, 9, -21, 21, TarConstants.LF_CHR, -62, 11, -13, 7, 57, -21, -37, 7, -17, 31, -18, -12, -4, 16, -9, 11, -2, 2, -15, 39, -34, 11, -5, 3, -3, 4, -13, 37, -24, -15, 19, 14, -33, 19, -19, 15, 24, -20, -18, 8, 9, -21, 21, TarConstants.LF_CHR, -62, 11, -13, 7, 57, -38, -20, -10, 3, -8, 22, -1, -10, 7, 2, -15, TarConstants.LF_LINK, -30, -20, 2, 14, 9, -21, 21, TarConstants.LF_CHR, -62, 11, -13, 7, 57, -33, -19, -8, 5, 2, -17, 9, -21, 21, TarConstants.LF_CHR, -62, 11, -13, 7, 57, -30, -35, 1, 7, -5, 9, 11, 9, -21, 21, TarConstants.LF_CHR, -62, 11, -13, 7, 57, -68, 13, -1, -6, 7, 2, -17, 70, -19, -34, 0, -2, -14, 0, 10, 7, -10, 7, 22, -19, -8, 5, 2, -17, 14, -15, TarConstants.LF_CHR, -34, 0, -2, -14, 0, 10, 7, -10, 7, 9, -21, 21, TarConstants.LF_CHR, -62, 11, -13, 7, 57, -68, 13, -1, -6, 7, 2, -17, 70, -31, -24, -15, 12, -7, 11, -5, -8, 7, 4, 6, 15, -30, 9, -21, 21, TarConstants.LF_CHR, -62, 11, -13, 7, 57, -33, -19, -8, 5, 2, -17, 57};
            private static final int MediaMetadataCompat = 8;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0031). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static java.lang.String $$e(int r6, byte r7, int r8) {
                /*
                    int r6 = r6 * 4
                    int r6 = 3 - r6
                    byte[] r0 = kotlin.getStateWithNewPlaylistAndPosition.$$c
                    int r7 = r7 * 4
                    int r7 = 103 - r7
                    int r8 = r8 * 2
                    int r1 = 1 - r8
                    byte[] r1 = new byte[r1]
                    r2 = 0
                    int r8 = 0 - r8
                    r3 = -1
                    if (r0 != 0) goto L19
                    r4 = r3
                    r3 = r6
                    goto L31
                L19:
                    r5 = r7
                    r7 = r6
                    r6 = r5
                L1c:
                    int r3 = r3 + 1
                    byte r4 = (byte) r6
                    r1[r3] = r4
                    if (r3 != r8) goto L29
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    return r6
                L29:
                    int r7 = r7 + 1
                    r4 = r0[r7]
                    r5 = r3
                    r3 = r7
                    r7 = r4
                    r4 = r5
                L31:
                    int r7 = -r7
                    int r6 = r6 + r7
                    r7 = r3
                    r3 = r4
                    goto L1c
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.getStateWithNewPlaylistAndPosition.$$e(int, byte, int):java.lang.String");
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002e). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static void d(int r6, int r7, int r8, java.lang.Object[] r9) {
                /*
                    int r6 = r6 * 2
                    int r0 = 20 - r6
                    int r8 = r8 * 3
                    int r8 = 4 - r8
                    int r7 = r7 * 2
                    int r7 = 73 - r7
                    byte[] r1 = kotlin.getStateWithNewPlaylistAndPosition.$$a
                    byte[] r0 = new byte[r0]
                    int r6 = 19 - r6
                    r2 = 0
                    if (r1 != 0) goto L19
                    r4 = r6
                    r7 = r8
                    r3 = r2
                    goto L2e
                L19:
                    r3 = r2
                    r5 = r8
                    r8 = r7
                    r7 = r5
                L1d:
                    byte r4 = (byte) r8
                    r0[r3] = r4
                    if (r3 != r6) goto L2a
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r0, r2)
                    r9[r2] = r6
                    return
                L2a:
                    int r3 = r3 + 1
                    r4 = r1[r7]
                L2e:
                    int r4 = -r4
                    int r8 = r8 + r4
                    int r7 = r7 + 1
                    goto L1d
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.getStateWithNewPlaylistAndPosition.d(int, int, int, java.lang.Object[]):void");
            }

            private static void c(int i, char[] cArr, char[] cArr2, char c, char[] cArr3, Object[] objArr) throws Throwable {
                int i2;
                int i3 = 2;
                int i4 = 2 % 2;
                notifyDownloadRemoved notifydownloadremoved = new notifyDownloadRemoved();
                int length = cArr2.length;
                char[] cArr4 = new char[length];
                int length2 = cArr3.length;
                char[] cArr5 = new char[length2];
                System.arraycopy(cArr2, 0, cArr4, 0, length);
                System.arraycopy(cArr3, 0, cArr5, 0, length2);
                cArr4[0] = (char) (cArr4[0] ^ c);
                cArr5[2] = (char) (cArr5[2] + ((char) i));
                int length3 = cArr.length;
                char[] cArr6 = new char[length3];
                notifydownloadremoved.AudioAttributesCompatParcelizer = 0;
                int i5 = $10 + 111;
                $11 = i5 % 128;
                int i6 = i5 % 2;
                while (notifydownloadremoved.AudioAttributesCompatParcelizer < length3) {
                    int i7 = $10 + 29;
                    $11 = i7 % 128;
                    int i8 = i7 % i3;
                    try {
                        Object[] objArr2 = {notifydownloadremoved};
                        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(718099963);
                        if (objRemoteActionCompatParcelizer == null) {
                            objRemoteActionCompatParcelizer = startForeground.read((char) TextUtils.indexOf("", "", 0), 22748 - View.getDefaultSize(0, 0), 37 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 1417974126, false, "j", new Class[]{Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                        Object[] objArr3 = {notifydownloadremoved};
                        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(247211480);
                        if (objRemoteActionCompatParcelizer2 == null) {
                            byte b = (byte) 0;
                            byte b2 = b;
                            objRemoteActionCompatParcelizer2 = startForeground.read((char) (31368 - TextUtils.indexOf((CharSequence) "", '0', 0)), Color.alpha(0) + 2721, 37 - TextUtils.lastIndexOf("", '0'), 1895162189, false, $$e(b, b2, b2), new Class[]{Object.class});
                        }
                        int iIntValue2 = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                        Object[] objArr4 = {notifydownloadremoved, Integer.valueOf(cArr4[notifydownloadremoved.AudioAttributesCompatParcelizer % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1336303982);
                        if (objRemoteActionCompatParcelizer3 == null) {
                            objRemoteActionCompatParcelizer3 = startForeground.read((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 15713 - (Process.myPid() >> 22), 64 - KeyEvent.keyCodeFromString(""), -837789177, false, "f", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                        Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1602228082);
                        if (objRemoteActionCompatParcelizer4 == null) {
                            i2 = 2;
                            objRemoteActionCompatParcelizer4 = startForeground.read((char) (TextUtils.indexOf("", "", 0) + 40976), (KeyEvent.getMaxKeyCode() >> 16) + 6122, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 29, -566873061, false, "m", new Class[]{Integer.TYPE, Integer.TYPE});
                        } else {
                            i2 = 2;
                        }
                        cArr5[iIntValue2] = ((Character) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).charValue();
                        cArr4[iIntValue2] = notifydownloadremoved.write;
                        cArr6[notifydownloadremoved.AudioAttributesCompatParcelizer] = (char) (((((long) (cArr4[iIntValue2] ^ cArr[notifydownloadremoved.AudioAttributesCompatParcelizer])) ^ (RemoteActionCompatParcelizer ^ (-3498762522182953692L))) ^ ((long) ((int) (((long) IconCompatParcelizer) ^ (-3498762522182953692L))))) ^ ((long) ((char) (((long) read) ^ (-3498762522182953692L)))));
                        notifydownloadremoved.AudioAttributesCompatParcelizer++;
                        i3 = i2;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                objArr[0] = new String(cArr6);
            }

            private static void b(byte[] bArr, int i, char[] cArr, int[] iArr, Object[] objArr) throws Throwable {
                notifyDownloads notifydownloads = new notifyDownloads();
                char[] cArr2 = AudioAttributesImplBaseParcelizer;
                long j = 0;
                if (cArr2 != null) {
                    int length = cArr2.length;
                    char[] cArr3 = new char[length];
                    int i2 = 0;
                    while (i2 < length) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr2[i2])};
                            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-298077624);
                            if (objRemoteActionCompatParcelizer == null) {
                                objRemoteActionCompatParcelizer = startForeground.read((char) (44862 - KeyEvent.keyCodeFromString("")), (ViewConfiguration.getEdgeSlop() >> 16) + 18944, (ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1)) + 29, -1871546659, false, CmcdHeadersFactory.STREAMING_FORMAT_SS, new Class[]{Integer.TYPE});
                            }
                            cArr3[i2] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                            i2++;
                            j = 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    cArr2 = cArr3;
                }
                Object[] objArr3 = {Integer.valueOf(MediaBrowserCompatItemReceiver)};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(680566917);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 19033 - TextUtils.getOffsetBefore("", 0), MotionEvent.axisFromString("") + 76, 1457087504, false, "r", new Class[]{Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                if (RatingCompat) {
                    notifydownloads.AudioAttributesCompatParcelizer = bArr.length;
                    char[] cArr4 = new char[notifydownloads.AudioAttributesCompatParcelizer];
                    notifydownloads.IconCompatParcelizer = 0;
                    while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
                        cArr4[notifydownloads.IconCompatParcelizer] = (char) (cArr2[bArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] + i] - iIntValue);
                        Object[] objArr4 = {notifydownloads, notifydownloads};
                        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1593953308);
                        if (objRemoteActionCompatParcelizer3 == null) {
                            objRemoteActionCompatParcelizer3 = startForeground.read((char) (AndroidCharacter.getMirror('0') - '0'), View.getDefaultSize(0, 0) + 11439, 13 - ExpandableListView.getPackedPositionChild(0L), -558368911, false, "q", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                    }
                    objArr[0] = new String(cArr4);
                    return;
                }
                if (AudioAttributesImplApi21Parcelizer) {
                    notifydownloads.AudioAttributesCompatParcelizer = cArr.length;
                    char[] cArr5 = new char[notifydownloads.AudioAttributesCompatParcelizer];
                    notifydownloads.IconCompatParcelizer = 0;
                    while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
                        cArr5[notifydownloads.IconCompatParcelizer] = (char) (cArr2[cArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] - i] - iIntValue);
                        Object[] objArr5 = {notifydownloads, notifydownloads};
                        Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1593953308);
                        if (objRemoteActionCompatParcelizer4 == null) {
                            objRemoteActionCompatParcelizer4 = startForeground.read((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 11439 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), Color.argb(0, 0, 0, 0) + 14, -558368911, false, "q", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
                    }
                    objArr[0] = new String(cArr5);
                    return;
                }
                notifydownloads.AudioAttributesCompatParcelizer = iArr.length;
                char[] cArr6 = new char[notifydownloads.AudioAttributesCompatParcelizer];
                notifydownloads.IconCompatParcelizer = 0;
                while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
                    cArr6[notifydownloads.IconCompatParcelizer] = (char) (cArr2[iArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] - i] - iIntValue);
                    notifydownloads.IconCompatParcelizer++;
                }
                objArr[0] = new String(cArr6);
            }

            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = MediaBrowserCompatCustomActionResultReceiver + 61;
                AudioAttributesImplApi26Parcelizer = i2 % 128;
                Object obj2 = null;
                if (i2 % 2 == 0) {
                    String strAudioAttributesCompatParcelizer = getPositionDiscontinuityReason.AudioAttributesCompatParcelizer(this.write, audioAttributesCompatParcelizer, (String) obj);
                    int i3 = AudioAttributesImplApi26Parcelizer + 97;
                    MediaBrowserCompatCustomActionResultReceiver = i3 % 128;
                    if (i3 % 2 != 0) {
                        return strAudioAttributesCompatParcelizer;
                    }
                    obj2.hashCode();
                    throw null;
                }
                getPositionDiscontinuityReason.AudioAttributesCompatParcelizer(this.write, audioAttributesCompatParcelizer, (String) obj);
                obj2.hashCode();
                throw null;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:157:0x06ce  */
            /* JADX WARN: Removed duplicated region for block: B:209:0x06dc A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public static void read(android.content.Context r19, long r20, long r22) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 2054
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.getStateWithNewPlaylistAndPosition.read(android.content.Context, long, long):void");
            }

            static {
                read();
                AudioAttributesImplApi26Parcelizer = 0;
                MediaBrowserCompatCustomActionResultReceiver = 1;
                RemoteActionCompatParcelizer = -3136912457412256340L;
                IconCompatParcelizer = -136981212;
                read = (char) 54564;
            }

            static void read() {
                AudioAttributesImplBaseParcelizer = new char[]{28568, 28564, 28571, 28565, 28562, 28561, 28563, 28567, 28560, 28590, 28591, 28588};
                MediaBrowserCompatItemReceiver = 411398119;
                AudioAttributesImplApi21Parcelizer = true;
                RatingCompat = true;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0028). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static void a(short r6, short r7, byte r8, java.lang.Object[] r9) {
                /*
                    int r6 = r6 + 84
                    int r7 = r7 + 4
                    byte[] r0 = kotlin.getStateWithNewPlaylistAndPosition.MediaBrowserCompatSearchResultReceiver
                    int r1 = r8 + 4
                    byte[] r1 = new byte[r1]
                    int r8 = r8 + 3
                    r2 = 0
                    if (r0 != 0) goto L12
                    r3 = r7
                    r4 = r2
                    goto L28
                L12:
                    r3 = r2
                L13:
                    byte r4 = (byte) r6
                    r1[r3] = r4
                    if (r3 != r8) goto L20
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    r9[r2] = r6
                    return
                L20:
                    int r3 = r3 + 1
                    r4 = r0[r7]
                    r5 = r3
                    r3 = r7
                    r7 = r4
                    r4 = r5
                L28:
                    int r7 = -r7
                    int r3 = r3 + 1
                    int r6 = r6 + r7
                    r7 = r3
                    r3 = r4
                    goto L13
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.getStateWithNewPlaylistAndPosition.a(short, short, byte, java.lang.Object[]):void");
            }
        };
        this.MediaBrowserCompatCustomActionResultReceiver.write(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new String[]{"inapp_notifs_cs", "inApp"}), getanswermap);
        return audioAttributesCompatParcelizer.IconCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String AudioAttributesCompatParcelizer(getPositionDiscontinuityReason getpositiondiscontinuityreason, MagicModuleUseCaseImplWhenMappings.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, String str) {
        toMagicModuleMetaRepoModel.write(getpositiondiscontinuityreason, "");
        toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizer, "");
        toMagicModuleMetaRepoModel.write(str, "");
        lambdadecreaseDeviceVolume27 lambdadecreasedevicevolume27AudioAttributesCompatParcelizer = getpositiondiscontinuityreason.AudioAttributesCompatParcelizer(true, str);
        audioAttributesCompatParcelizer.IconCompatParcelizer = audioAttributesCompatParcelizer.IconCompatParcelizer && lambdadecreasedevicevolume27AudioAttributesCompatParcelizer.getAudioAttributesCompatParcelizer();
        return lambdadecreasedevicevolume27AudioAttributesCompatParcelizer.getRead();
    }

    private final lambdadecreaseDeviceVolume27 AudioAttributesCompatParcelizer(boolean p0, String p1) {
        return RemoteActionCompatParcelizer(IconCompatParcelizer(p1), write(p0), p1);
    }

    private final lambdadecreaseDeviceVolume27 RemoteActionCompatParcelizer(lambdadecreaseDeviceVolume26 p0, lambdadecreaseDeviceVolume26 p1, String p2) {
        if (p0 == p1) {
            return new lambdadecreaseDeviceVolume27(p2, true);
        }
        int i = write.AudioAttributesCompatParcelizer[p0.ordinal()];
        if (i == 1) {
            return AudioAttributesCompatParcelizer(p1, p2);
        }
        if (i == 2) {
            return read(p1, p2);
        }
        if (i != 3) {
            throw new RenewEligibleCreator();
        }
        return RemoteActionCompatParcelizer(p1, p2);
    }

    private final lambdadecreaseDeviceVolume27 AudioAttributesCompatParcelizer(lambdadecreaseDeviceVolume26 p0, String p1) {
        String strWrite = this.read.write(p1, getPeriodIndexFromWindowPosition.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer);
        int i = write.AudioAttributesCompatParcelizer[p0.ordinal()];
        if (i == 2) {
            String strRemoteActionCompatParcelizer = strWrite != null ? this.read.RemoteActionCompatParcelizer(strWrite, getPeriodIndexFromWindowPosition.AudioAttributesCompatParcelizer.read) : null;
            return new lambdadecreaseDeviceVolume27(strRemoteActionCompatParcelizer == null ? strWrite : strRemoteActionCompatParcelizer, strRemoteActionCompatParcelizer != null || strWrite == null);
        }
        if (i == 3) {
            if (strWrite != null) {
                p1 = strWrite;
            }
            return new lambdadecreaseDeviceVolume27(p1, strWrite != null);
        }
        this.write.write(this.RemoteActionCompatParcelizer, "Invalid transition from ENCRYPTED_AES to ".concat(String.valueOf(p0)));
        lambdadecreaseDeviceVolume27.Companion companion = lambdadecreaseDeviceVolume27.INSTANCE;
        return lambdadecreaseDeviceVolume27.Companion.write(p1);
    }

    private final lambdadecreaseDeviceVolume27 read(lambdadecreaseDeviceVolume26 p0, String p1) {
        String strWrite = this.read.write(p1, getPeriodIndexFromWindowPosition.AudioAttributesCompatParcelizer.read);
        if (write.AudioAttributesCompatParcelizer[p0.ordinal()] == 3) {
            if (strWrite != null) {
                p1 = strWrite;
            }
            return new lambdadecreaseDeviceVolume27(p1, strWrite != null);
        }
        this.write.write(this.RemoteActionCompatParcelizer, "Invalid transition from ENCRYPTED_AES_GCM to ".concat(String.valueOf(p0)));
        lambdadecreaseDeviceVolume27.Companion companion = lambdadecreaseDeviceVolume27.INSTANCE;
        return lambdadecreaseDeviceVolume27.Companion.write(p1);
    }

    private final lambdadecreaseDeviceVolume27 RemoteActionCompatParcelizer(lambdadecreaseDeviceVolume26 p0, String p1) {
        if (write.AudioAttributesCompatParcelizer[p0.ordinal()] == 2) {
            String strRemoteActionCompatParcelizer = this.read.RemoteActionCompatParcelizer(p1, getPeriodIndexFromWindowPosition.AudioAttributesCompatParcelizer.read);
            if (strRemoteActionCompatParcelizer != null) {
                p1 = strRemoteActionCompatParcelizer;
            }
            return new lambdadecreaseDeviceVolume27(p1, strRemoteActionCompatParcelizer != null);
        }
        this.write.write(this.RemoteActionCompatParcelizer, "Invalid transition from PLAIN_TEXT to ".concat(String.valueOf(p0)));
        lambdadecreaseDeviceVolume27.Companion companion = lambdadecreaseDeviceVolume27.INSTANCE;
        return lambdadecreaseDeviceVolume27.Companion.write(p1);
    }

    private static lambdadecreaseDeviceVolume26 write(boolean p0) {
        if (p0) {
            return lambdadecreaseDeviceVolume26.RemoteActionCompatParcelizer;
        }
        return lambdadecreaseDeviceVolume26.IconCompatParcelizer;
    }

    private static lambdadecreaseDeviceVolume26 IconCompatParcelizer(String p0) {
        getPeriodIndexFromWindowPosition.write writeVar = getPeriodIndexFromWindowPosition.AudioAttributesCompatParcelizer;
        if (getPeriodIndexFromWindowPosition.write.AudioAttributesCompatParcelizer(p0)) {
            return lambdadecreaseDeviceVolume26.write;
        }
        getPeriodIndexFromWindowPosition.write writeVar2 = getPeriodIndexFromWindowPosition.AudioAttributesCompatParcelizer;
        return getPeriodIndexFromWindowPosition.write.RemoteActionCompatParcelizer(p0) ? lambdadecreaseDeviceVolume26.RemoteActionCompatParcelizer : lambdadecreaseDeviceVolume26.IconCompatParcelizer;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof getPositionDiscontinuityReason)) {
            return false;
        }
        getPositionDiscontinuityReason getpositiondiscontinuityreason = (getPositionDiscontinuityReason) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) getpositiondiscontinuityreason.RemoteActionCompatParcelizer) && this.AudioAttributesCompatParcelizer == getpositiondiscontinuityreason.AudioAttributesCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, getpositiondiscontinuityreason.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, getpositiondiscontinuityreason.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, getpositiondiscontinuityreason.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, getpositiondiscontinuityreason.MediaBrowserCompatCustomActionResultReceiver);
    }

    public final int hashCode() {
        return (((((((((this.RemoteActionCompatParcelizer.hashCode() * 31) + Integer.hashCode(this.AudioAttributesCompatParcelizer)) * 31) + this.write.hashCode()) * 31) + this.read.hashCode()) * 31) + this.IconCompatParcelizer.hashCode()) * 31) + this.MediaBrowserCompatCustomActionResultReceiver.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("getPositionDiscontinuityReason(RemoteActionCompatParcelizer=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", AudioAttributesCompatParcelizer=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(", write=");
        sb.append(this.write);
        sb.append(", read=");
        sb.append(this.read);
        sb.append(", IconCompatParcelizer=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", MediaBrowserCompatCustomActionResultReceiver=");
        sb.append(this.MediaBrowserCompatCustomActionResultReceiver);
        sb.append(')');
        return sb.toString();
    }
}
