package com.marrow.kt.ui.activities.sync;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ImageView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.TrainingApplication;
import com.marrow.kt.ui.activities.sync.SyncingActivity;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.BandwidthMeterEventListenerEventDispatcherHandlerAndListener;
import kotlin.CmcdConfigurationRequestConfig;
import kotlin.CmcdHeadersFactoryCmcdObjectBuilder;
import kotlin.Descriptor;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.Metadata;
import kotlin.NavigationBarViewSavedState;
import kotlin.NewNumberOtpResendRequest;
import kotlin.RecentUpdateSubjectDetails;
import kotlin.RenewEligible;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.SessionDescriptionParser;
import kotlin.SsManifestStreamElement;
import kotlin.TopUserCompanion;
import kotlin.addChild;
import kotlin.buildRequestUri;
import kotlin.downloadMagicModuleMetalambda0;
import kotlin.getAnswerMap;
import kotlin.getChunkDurationUs;
import kotlin.getCreatedOnDateMs;
import kotlin.getExamName;
import kotlin.getInternalName;
import kotlin.getMagicModuleStats;
import kotlin.getRenewExpiresOn;
import kotlin.getShowPopup;
import kotlin.getValidationToken;
import kotlin.getYear;
import kotlin.handlePreambleAddressCode;
import kotlin.isCtrlCode;
import kotlin.isResolutionNotSupported;
import kotlin.notifyDownloadChanged;
import kotlin.notifyDownloadRemoved;
import kotlin.onDraw;
import kotlin.parseTrackTiming;
import kotlin.rendererSupportsTunneling;
import kotlin.setSdkPayload;
import kotlin.setSessionInfo;
import kotlin.startForeground;
import kotlin.toMagicModuleMetaDataUcModel;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.zadb;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u001bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0005J\u000f\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0005J!\u0010\u0014\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\u0005J\u0015\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0005J\u000f\u0010\u001b\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001b\u0010\u0005J\u000f\u0010\u001c\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u001c\u0010\u0005R\u001b\u0010\u001b\u001a\u00020\u001d8GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001b\u0010\"\u001a\u00020!8CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0016\u0010\u0014\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010&R\"\u0010(\u001a\u00020'8\u0007@\u0007X\u0087.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0016\u00101\u001a\u00020.8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u0016\u001a\u0002028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u00103"}, d2 = {"Lcom/marrow/kt/ui/activities/sync/SyncingActivity;", "Lcom/marrow/kt/base/BaseDaggerActivity;", "Lo/getChunkDurationUs;", "Lo/addChild;", "<init>", "()V", "", "handleMediaPlayPauseIfPendingOnHandler", "()I", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "Lo/NavigationBarViewSavedState;", "onAddQueueItem", "()Lo/NavigationBarViewSavedState;", "onMediaButtonEvent", "onResume", "p1", "AudioAttributesCompatParcelizer", "(Ljava/lang/Integer;I)V", "read", "", "Lo/handlePreambleAddressCode;", "MediaBrowserCompatCustomActionResultReceiver", "()[Lo/handlePreambleAddressCode;", "write", "onDestroy", "Lo/Descriptor;", "Lo/setSessionInfo;", "onCommand", "()Lo/Descriptor;", "Landroid/os/Handler;", "RemoteActionCompatParcelizer", "Lo/RenewEligible;", "onPlay", "()Landroid/os/Handler;", "I", "Lo/buildRequestUri;", "connectionMonitor", "Lo/buildRequestUri;", "getConnectionMonitor", "()Lo/buildRequestUri;", "setConnectionMonitor", "(Lo/buildRequestUri;)V", "Lo/isCtrlCode;", "MediaBrowserCompatSearchResultReceiver", "Lo/isCtrlCode;", "IconCompatParcelizer", "Lcom/marrow/kt/ui/activities/sync/SyncingActivity$read;", "Lcom/marrow/kt/ui/activities/sync/SyncingActivity$read;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SyncingActivity extends SsManifestStreamElement<getChunkDurationUs> implements addChild {
    private static /* synthetic */ isResolutionNotSupported<Object>[] IconCompatParcelizer;
    private static char MediaBrowserCompatMediaItem;
    private static long MediaDescriptionCompat;
    private static long MediaMetadataCompat;
    private static int RatingCompat;
    private static int onCommand;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    @setSdkPayload
    public buildRequestUri connectionMonitor;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private int AudioAttributesCompatParcelizer;
    private static final byte[] $$s = {115, -66, -117, -68};
    private static final int $$t = 91;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$p = {43, -12, TarConstants.LF_GNUTYPE_LONGNAME, -80, 74, -15, -38, 18, 9, 34, -9, 7, 3, 17, 0, 3, 56, -32, 20, -6, 2, 18, 5, 20, 3, 10, 44, -17, -11, 63, -21, 7, 4, 12, 61, 14, 18, -2, 24, -10, 1, 7, 4, 24, 45, -25, -8, 20, 3, 10, TarConstants.LF_BLK, -35, 11, 6, 24, -10, 45, -8, -8, 24, 7, 2, 12, -8, 30, -4, 74, -14, 7, 4, 2, -25, 12, 21, 14, 7, 7, 26, -8, -10, 13, 8, 12, 22, 74, -74, 14, 18, -2, 24, -17, -3, 10, TarConstants.LF_BLK, -35, 11, 6, 24, -10, 45, -8, -8, 24, 7, 2, 12, -8, 30, -4};
    private static final int $$q = 219;
    private static final byte[] $$g = {31, 80, -124, -66, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, 12, 3, -4, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$h = 88;
    private static int handleMediaPlayPauseIfPendingOnHandler = 0;
    private static int onAddQueueItem = 0;
    private static int onCustomAction = 1;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final setSessionInfo write = parseTrackTiming.write(this, SessionDescriptionParser.RemoteActionCompatParcelizer(), new AudioAttributesImplBaseParcelizer());
    private final RenewEligible RemoteActionCompatParcelizer = getRenewExpiresOn.RemoteActionCompatParcelizer(new getCreatedOnDateMs() { // from class: o.getNormalizedAttribute
        @Override // kotlin.getCreatedOnDateMs
        public final Object invoke() {
            return SyncingActivity.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        }
    });

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private isCtrlCode IconCompatParcelizer = new MediaBrowserCompatItemReceiver();

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final read read = new read();

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$u(byte r5, short r6, byte r7) {
        /*
            int r5 = r5 + 4
            int r6 = r6 * 3
            int r0 = r6 + 1
            byte[] r1 = com.marrow.kt.ui.activities.sync.SyncingActivity.$$s
            int r7 = r7 * 2
            int r7 = 121 - r7
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r3 = r7
            r4 = r2
            r7 = r6
            goto L27
        L15:
            r3 = r2
        L16:
            int r5 = r5 + 1
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L25:
            r3 = r1[r5]
        L27:
            int r7 = r7 + r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.kt.ui.activities.sync.SyncingActivity.$$u(byte, short, byte):java.lang.String");
    }

    public static /* synthetic */ Object AudioAttributesCompatParcelizer(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~i5;
        int i9 = i7 | i8;
        int i10 = ~(i9 | i2);
        int i11 = ~i2;
        int i12 = (~(i7 | i5)) | (~(i8 | i11)) | (~(i8 | i6));
        int i13 = ~(i11 | i9);
        int i14 = i6 + i5 + i4 + (1938118820 * i3) + ((-1869228383) * i);
        int i15 = i14 * i14;
        int i16 = (i6 * (-1046486968)) + 2037645312 + ((-1046486968) * i5) + (1604861810 * i10) + (i12 * (-1345052743)) + ((-1345052743) * i13) + (1903427584 * i4) + ((-1907359744) * i3) + (1374945280 * i) + (1516044288 * i15);
        int i17 = ((i6 * 647972376) - 1941852458) + (i5 * 647972376) + (i10 * 1702) + (i12 * 851) + (i13 * 851) + (i4 * 647973227) + (i3 * (-1260466036)) + (i * 1557372491) + (i15 * 1239351296);
        int i18 = i16 + (i17 * i17 * 490405888);
        if (i18 == 1) {
            return RemoteActionCompatParcelizer(objArr);
        }
        if (i18 == 2) {
            return write(objArr);
        }
        if (i18 != 3) {
            return read(objArr);
        }
        SyncingActivity syncingActivity = (SyncingActivity) objArr[0];
        int i19 = 2 % 2;
        int i20 = onCustomAction + 23;
        onAddQueueItem = i20 % 128;
        int i21 = i20 % 2;
        zadb.Companion remoteActionCompatParcelizer_ = zadb.INSTANCE;
        Intent intentWrite = zadb.Companion.write(syncingActivity);
        intentWrite.setFlags(335544320);
        syncingActivity.startActivity(intentWrite);
        syncingActivity.finish();
        int i22 = onAddQueueItem + 53;
        onCustomAction = i22 % 128;
        int i23 = i22 % 2;
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void k(int r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = 114 - r8
            byte[] r0 = com.marrow.kt.ui.activities.sync.SyncingActivity.$$g
            int r1 = r7 + 4
            int r6 = 191 - r6
            byte[] r1 = new byte[r1]
            int r7 = r7 + 3
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r8
            r4 = r2
            r8 = r6
            goto L29
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            r3 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r3
            r3 = r5
        L29:
            int r6 = -r6
            int r3 = r3 + r6
            int r6 = r8 + 1
            int r8 = r3 + (-1)
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.kt.ui.activities.sync.SyncingActivity.k(int, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void l(short r5, byte r6, int r7, java.lang.Object[] r8) {
        /*
            int r7 = 89 - r7
            int r0 = r6 + 5
            int r5 = 119 - r5
            byte[] r1 = com.marrow.kt.ui.activities.sync.SyncingActivity.$$p
            byte[] r0 = new byte[r0]
            int r6 = r6 + 4
            r2 = 0
            if (r1 != 0) goto L12
            r4 = r6
            r3 = r2
            goto L26
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r5
            r0[r3] = r4
            if (r3 != r6) goto L20
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L20:
            int r7 = r7 + 1
            int r3 = r3 + 1
            r4 = r1[r7]
        L26:
            int r4 = -r4
            int r5 = r5 + r4
            int r5 = r5 + 9
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.kt.ui.activities.sync.SyncingActivity.l(short, byte, int, java.lang.Object[]):void");
    }

    public static final /* synthetic */ Handler IconCompatParcelizer(SyncingActivity syncingActivity) {
        int i = 2 % 2;
        int i2 = onCustomAction + 85;
        onAddQueueItem = i2 % 128;
        if (i2 % 2 == 0) {
            return syncingActivity.onPlay();
        }
        syncingActivity.onPlay();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void IconCompatParcelizer(SyncingActivity syncingActivity, int i) {
        int i2 = 2 % 2;
        int i3 = onCustomAction + 57;
        int i4 = i3 % 128;
        onAddQueueItem = i4;
        int i5 = i3 % 2;
        syncingActivity.AudioAttributesCompatParcelizer = i;
        int i6 = i4 + 83;
        onCustomAction = i6 % 128;
        int i7 = i6 % 2;
    }

    public static final /* synthetic */ int read(SyncingActivity syncingActivity) {
        int i = 2 % 2;
        int i2 = onAddQueueItem;
        int i3 = i2 + 9;
        onCustomAction = i3 % 128;
        int i4 = i3 % 2;
        int i5 = syncingActivity.AudioAttributesCompatParcelizer;
        if (i4 == 0) {
            int i6 = 45 / 0;
        }
        int i7 = i2 + 33;
        onCustomAction = i7 % 128;
        int i8 = i7 % 2;
        return i5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Descriptor onCommand() {
        int i = 2 % 2;
        int i2 = onCustomAction + 19;
        onAddQueueItem = i2 % 128;
        return (Descriptor) this.write.read(this, i2 % 2 != 0 ? IconCompatParcelizer[1] : IconCompatParcelizer[0]);
    }

    private static final Handler onFastForward() {
        int i = 2 % 2;
        Handler handler = new Handler();
        int i2 = onAddQueueItem + 105;
        onCustomAction = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 21 / 0;
        }
        return handler;
    }

    private final Handler onPlay() {
        int i = 2 % 2;
        int i2 = onCustomAction + 43;
        onAddQueueItem = i2 % 128;
        int i3 = i2 % 2;
        Handler handler = (Handler) this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
        int i4 = onAddQueueItem + 91;
        onCustomAction = i4 % 128;
        int i5 = i4 % 2;
        return handler;
    }

    public final buildRequestUri getConnectionMonitor() {
        int i = 2 % 2;
        buildRequestUri buildrequesturi = this.connectionMonitor;
        if (buildrequesturi != null) {
            int i2 = onCustomAction + 69;
            onAddQueueItem = i2 % 128;
            int i3 = i2 % 2;
            return buildrequesturi;
        }
        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        int i4 = onCustomAction + 5;
        onAddQueueItem = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public final void setConnectionMonitor(buildRequestUri buildrequesturi) {
        int i = 2 % 2;
        int i2 = onAddQueueItem + 17;
        onCustomAction = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(buildrequesturi, "");
        this.connectionMonitor = buildrequesturi;
        int i4 = onAddQueueItem + 57;
        onCustomAction = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final class MediaBrowserCompatItemReceiver extends isCtrlCode {
        @Override // kotlin.isCtrlCode
        public final void RemoteActionCompatParcelizer(int i) {
        }

        MediaBrowserCompatItemReceiver() {
            super(0, 1, null);
        }

        @Override // kotlin.isCtrlCode
        public final void read(int i) {
            ((getChunkDurationUs) SyncingActivity.this.getMPresenter()).read();
        }

        @Override // kotlin.isCtrlCode, android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                NewNumberOtpResendRequest<Boolean> newNumberOtpResendRequestAudioAttributesCompatParcelizer = SyncingActivity.this.getConnectionMonitor().AudioAttributesCompatParcelizer();
                final SyncingActivity syncingActivity = SyncingActivity.this;
                this.AudioAttributesCompatParcelizer = 1;
                if (newNumberOtpResendRequestAudioAttributesCompatParcelizer.write(new getValidationToken() { // from class: com.marrow.kt.ui.activities.sync.SyncingActivity.AudioAttributesCompatParcelizer.2
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return write();
                    }

                    private Object write() {
                        ((getChunkDurationUs) syncingActivity.getMPresenter()).AudioAttributesCompatParcelizer();
                        return getShowPopup.INSTANCE;
                    }
                }, this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            return getShowPopup.INSTANCE;
        }

        AudioAttributesCompatParcelizer(SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return SyncingActivity.this.new AudioAttributesCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public static final class AudioAttributesImplBaseParcelizer implements getAnswerMap<SyncingActivity, Descriptor> {
        private static Descriptor IconCompatParcelizer(SyncingActivity syncingActivity) {
            toMagicModuleMetaRepoModel.write(syncingActivity, "");
            return Descriptor.AudioAttributesCompatParcelizer(SessionDescriptionParser.AudioAttributesCompatParcelizer(syncingActivity));
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [o.Descriptor, o.getApplicationLabel] */
        @Override // kotlin.getAnswerMap
        public final /* synthetic */ Descriptor invoke(SyncingActivity syncingActivity) {
            return IconCompatParcelizer(syncingActivity);
        }
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.write = 1;
                if (((getChunkDurationUs) SyncingActivity.this.getMPresenter()).AudioAttributesCompatParcelizer(this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            return getShowPopup.INSTANCE;
        }

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return SyncingActivity.this.new IconCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private static void j(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notifyDownloadChanged notifydownloadchanged = new notifyDownloadChanged();
        notifydownloadchanged.read = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        notifydownloadchanged.AudioAttributesCompatParcelizer = 0;
        while (notifydownloadchanged.AudioAttributesCompatParcelizer < cArr.length) {
            int i3 = notifydownloadchanged.AudioAttributesCompatParcelizer;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[notifydownloadchanged.AudioAttributesCompatParcelizer]), notifydownloadchanged, notifydownloadchanged};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1435583294);
                if (objRemoteActionCompatParcelizer == null) {
                    byte b = (byte) (-1);
                    byte b2 = (byte) (b + 1);
                    objRemoteActionCompatParcelizer = startForeground.read((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 38461), (ViewConfiguration.getJumpTapTimeout() >> 16) + 532, View.MeasureSpec.getMode(0) + 8, -735610793, false, $$u(b, b2, b2), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i3] = ((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue() ^ (MediaDescriptionCompat ^ 2192498202983240651L);
                Object[] objArr3 = {notifydownloadchanged, notifydownloadchanged};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(1971306176);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b3 = (byte) (-1);
                    byte b4 = (byte) (b3 + 1);
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (TextUtils.indexOf((CharSequence) "", '0') + 36622), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2340, 29 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 188119637, false, $$u(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
                int i4 = $10 + 85;
                $11 = i4 % 128;
                int i5 = i4 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr2 = new char[length];
        notifydownloadchanged.AudioAttributesCompatParcelizer = 0;
        int i6 = $11 + 97;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        while (notifydownloadchanged.AudioAttributesCompatParcelizer < cArr.length) {
            int i8 = $10 + 77;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            cArr2[notifydownloadchanged.AudioAttributesCompatParcelizer] = (char) jArr[notifydownloadchanged.AudioAttributesCompatParcelizer];
            Object[] objArr4 = {notifydownloadchanged, notifydownloadchanged};
            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(1971306176);
            if (objRemoteActionCompatParcelizer3 == null) {
                byte b5 = (byte) (-1);
                byte b6 = (byte) (b5 + 1);
                objRemoteActionCompatParcelizer3 = startForeground.read((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 36621), 2339 - TextUtils.lastIndexOf("", '0', 0, 0), 28 - TextUtils.getOffsetAfter("", 0), 188119637, false, $$u(b5, b6, (byte) (b6 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    public static final class RemoteActionCompatParcelizer implements rendererSupportsTunneling.RemoteActionCompatParcelizer {
        RemoteActionCompatParcelizer() {
        }

        @Override // o.rendererSupportsTunneling.RemoteActionCompatParcelizer
        public final boolean read() {
            return ((getChunkDurationUs) SyncingActivity.this.getMPresenter()).IconCompatParcelizer().invoke().booleanValue();
        }
    }

    public static final class read implements Runnable {
        read() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ImageView imageView = SyncingActivity.read(SyncingActivity.this) % 2 == 0 ? SyncingActivity.this.onCommand().write : SyncingActivity.this.onCommand().IconCompatParcelizer;
            toMagicModuleMetaRepoModel.write(imageView);
            onDraw.write(imageView, 1250L, 4.0f, 0.1f, BitmapDescriptorFactory.HUE_RED);
            SyncingActivity.IconCompatParcelizer(SyncingActivity.this).postDelayed(this, 650L);
            SyncingActivity.IconCompatParcelizer(SyncingActivity.this, SyncingActivity.read(SyncingActivity.this) + 1);
        }
    }

    private static void i(char[] cArr, char c, char[] cArr2, char[] cArr3, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notifyDownloadRemoved notifydownloadremoved = new notifyDownloadRemoved();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr2.length;
        char[] cArr6 = new char[length3];
        notifydownloadremoved.AudioAttributesCompatParcelizer = 0;
        while (notifydownloadremoved.AudioAttributesCompatParcelizer < length3) {
            int i3 = $11 + 29;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            try {
                Object[] objArr2 = {notifydownloadremoved};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(718099963);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 22748, 36 - KeyEvent.keyCodeFromString(""), 1417974126, false, "j", new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {notifydownloadremoved};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(247211480);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b = (byte) (-1);
                    byte b2 = (byte) (b + 1);
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (AndroidCharacter.getMirror('0') + 31321), (Process.myTid() >> 22) + 2721, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 37, 1895162189, false, $$u(b, b2, (byte) (b2 | 9)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {notifydownloadremoved, Integer.valueOf(cArr4[notifydownloadremoved.AudioAttributesCompatParcelizer % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1336303982);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (TextUtils.lastIndexOf("", '0', 0) + 1), 15713 - (ViewConfiguration.getWindowTouchSlop() >> 8), View.getDefaultSize(0, 0) + 64, -837789177, false, "f", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1602228082);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (40976 - View.getDefaultSize(0, 0)), (ViewConfiguration.getEdgeSlop() >> 16) + 6122, Process.getGidForName("") + 30, -566873061, false, "m", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = notifydownloadremoved.write;
                cArr6[notifydownloadremoved.AudioAttributesCompatParcelizer] = (char) (((((long) (cArr4[iIntValue2] ^ cArr2[notifydownloadremoved.AudioAttributesCompatParcelizer])) ^ (MediaMetadataCompat ^ (-3498762522182953692L))) ^ ((long) ((int) (((long) RatingCompat) ^ (-3498762522182953692L))))) ^ ((long) ((char) (((long) MediaBrowserCompatMediaItem) ^ (-3498762522182953692L)))));
                notifydownloadremoved.AudioAttributesCompatParcelizer++;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArr6);
        int i5 = $10 + 47;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        objArr[0] = str;
    }

    /* JADX INFO: renamed from: com.marrow.kt.ui.activities.sync.SyncingActivity$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/marrow/kt/ui/activities/sync/SyncingActivity$write;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Landroid/content/Intent;", "RemoteActionCompatParcelizer", "(Landroid/content/Context;)Landroid/content/Intent;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static Intent RemoteActionCompatParcelizer(Context p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            Intent intent = new Intent(p0, (Class<?>) SyncingActivity.class);
            intent.setFlags(335577088);
            return intent;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    @Override // kotlin.SsManifestStreamElement, com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onCreate(Bundle p0) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object[] objArr2 = new Object[1];
        i(new char[]{0, 0, 0, 0}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 822), new char[]{55258, 19807, 22910, 57633, 63087, 21015, 4889, 47541, 36361, 22418, 51060, 20346, 64837, 15605, 11831, 40043, 162, 30483}, new char[]{5118, 40164, 22834, 26371}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35, objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        j(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 10562, new char[]{4826, 15275, 16424, 28401, 46919}, objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr4 = new Object[1];
                j(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 59995, new char[]{4822, 63622, 50797, 44504, 48036, 33029, 27881, 31232, 16430, 12176, 13681, 140, 61058, 62471, 50161, 43343, 46897, 33425, 26733, 30659, 23951, 11028, 14063, 7259, 59966, 61844}, objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                j((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 57726, new char[]{4820, 62397, 53307, 46776, 38702, 30114, 23097, 14479, 6463, 65456, 56365, 41643, 33568, 24997, 17969, 9391, 1320, 60342}, objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
                int i2 = onAddQueueItem + 41;
                onCustomAction = i2 % 128;
                int i3 = i2 % 2;
            }
            if (baseContext != null) {
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            if (baseContext != null) {
                int i4 = onAddQueueItem + 61;
                onCustomAction = i4 % 128;
                int i5 = i4 % 2;
                try {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 4534), 6054 - TextUtils.getCapsMode("", 0, 0), TextUtils.indexOf("", "") + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr6 = new Object[1];
                    i(new char[]{0, 0, 0, 0}, (char) ((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) - 1), new char[]{17264, 22438, 32571, 42898, 57932, 41534, 32856, 62607, 28896, 34701, 1743, 40221, 3330, 12201, 28656, 19013, 24988, 61927, 12612, 54846, 32933, 56908, 46628, 2438, 38790, 45227, 65036, 34130, 26346, 42355, 26020, 60834, 44258, 60657, 49461, 21875, 36325, 58070, 12492, 57668, 41620, 61037, 55338, 25912, 55949, 47213, 20210, 8442}, new char[]{4204, 4963, 5426, 3725}, ViewConfiguration.getScrollBarSize() >> 8, objArr6);
                    String str = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    j(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(1) + 54312, new char[]{4743, 50829, 47718, 28556, 17380, 14187, 59542, 56558, 45130, 26017, 22953, 3334, 59051, 55811, 36365, 25526, 22342, 2875, 64660, 53269, 33909, 31170, 11557, 369, 64141, 44599, 33676, 30692, 11058, 7317, 61675, 42048, 39335, 19962, 8455, 6831, 52821, 41560, 38834, 19208, 16231, 4289, 50255, 47136, 28063, 16756, 13688, 61060, 49719, 46983, 27616, 24380, 12434, 58595, 55365, 36253, 25079, 21760, 3832, 57943, 54878, 35815, 32522, 21351}, objArr7);
                    String str2 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    j(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 43387, new char[]{4821, 48121, 16424, 61102, 46970, 24062, 59950, 45302, 22827, 59300, 35956, 23283, 58235, 35237, 22049, 64674, 34175, 21433, 63547, 34539, 12137, 62957, 33390, 10476, 61798, 40885, 9269, 62187, 39776, 8674, 52836, 38126, 15715, 52105, 36958, 16015, 50954, 28041, 14942, 49288, 26974, 14290, 56324, 27346, 13056, 55766, 26197, 3207, 54610, 25500, 2079, 54939, 32586, 1482, 53838, 30877, 334, 44946, 29764, 656, 43845, 29123, 7747, 42190}, objArr8);
                    String str3 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    i(new char[]{0, 0, 0, 0}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 60810), new char[]{37372, 28135, 42094, 65140, 44487, 65316, 10020, 14785, 43908, 11171, 19786, 54689, 5278, 51812, 28715, 10807, 42403, 62243, 14115, 39596, 47396, 44896, 14283, 17570, 50925, 14214, 26911, 34951, 65391, 65183, 37253, 4491, 3030, 30409, 2305, 30527, 47345, 12538, 10464, 26078, 64065, 61852, 23910, 16820, 6870, 38059, 3177, 1342, 27335, 7096, 45582, 17019, 53320, 29189, 46364, 46992, 45429, 29437, 10557, 16293, 9806, 44666, 60525, 34642, 50695, 52483, 12295}, new char[]{32086, 31747, 36513, 61677}, (-1585708163) - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr9);
                    String str4 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    j(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 55596, new char[]{4750, 52182, 40984, 39278, 30629, 11278}, objArr10);
                    String str5 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    i(new char[]{0, 0, 0, 0}, (char) ((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) - 1), new char[]{63444, 33658, 7873, 59709, 6307, 3539, 45897, 19660, 9163, 31203, 1299, 22246, 43112, 57882, 4670, 25860, 56335, 59509, 56789, 5406, 10173, 986, 60342, 2752, 47664, 26550, 50888, 7283, 57446, 50506, 52199, 57930, 24359, 37929, 2171, 12594}, new char[]{10054, 9131, 33786, 61969}, View.getDefaultSize(0, 0), objArr11);
                    Object[] objArr12 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr11[0], 86400};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(448819875);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) Color.alpha(0), 6030 - View.combineMeasuredStates(0, 0), Gravity.getAbsoluteGravity(0, 0) + 24, 1686746678, false, "AudioAttributesCompatParcelizer", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr12);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
        }
        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-2042479539);
        if (objRemoteActionCompatParcelizer3 == null) {
            char c = (char) (13184 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)));
            int maximumFlingVelocity = 1649 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
            int deadChar = KeyEvent.getDeadChar(0, 0) + 26;
            short s = (short) 187;
            Object[] objArr13 = new Object[1];
            k(s, (byte) (s & 108), (byte) (-$$g[62]), objArr13);
            objRemoteActionCompatParcelizer3 = startForeground.read(c, maximumFlingVelocity, deadChar, -133433128, false, (String) objArr13[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer3).getLong(null) != -1) {
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer4 == null) {
                char c2 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 13182);
                int i6 = 1650 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                int windowTouchSlop = 26 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                Object[] objArr14 = new Object[1];
                k((short) 144, r2[8], (byte) (-$$g[9]), objArr14);
                objRemoteActionCompatParcelizer4 = startForeground.read(c2, i6, windowTouchSlop, -1033747278, false, (String) objArr14[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer4).get(null);
        } else {
            Object[] objArr15 = new Object[1];
            i(new char[]{0, 0, 0, 0}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 37773), new char[]{60639, 30289, 52538, 37382, 50116, 9529, 27330, 59004, 32678, 8694, 37990, 36794, 51345, 13927, 41821, 49407}, new char[]{26120, 16857, 45166, 17299}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() - 4, objArr15);
            Class<?> cls3 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            i(new char[]{0, 0, 0, 0}, (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 11907), new char[]{3926, 16375, 6034, 65242, 56660, 37797, 65143, 18456, 27889, 20456, 47585, 51927, 42197, 25280, 30015, 63376}, new char[]{62889, 28614, 33623, 39214}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 10, objArr16);
            int iIntValue2 = ((Integer) cls3.getMethod((String) objArr16[0], Object.class).invoke(null, this)).intValue();
            int i7 = onAddQueueItem + 115;
            onCustomAction = i7 % 128;
            int i8 = i7 % 2;
            try {
                Object[] objArr17 = {Integer.valueOf(iIntValue2), 0, 335477210};
                byte[] bArr = $$p;
                byte b = bArr[81];
                Object[] objArr18 = new Object[1];
                l(b, (byte) (b | 19), (byte) 86, objArr18);
                Class<?> cls4 = Class.forName((String) objArr18[0]);
                byte b2 = bArr[14];
                byte b3 = b2;
                Object[] objArr19 = new Object[1];
                l(b2, b3, (byte) (b3 | TarConstants.LF_CONTIG), objArr19);
                objArr = (Object[]) cls4.getMethod((String) objArr19[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr17);
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer5 == null) {
                    char cResolveSizeAndState = (char) (13183 - View.resolveSizeAndState(0, 0, 0));
                    int iMyPid = 1649 - (Process.myPid() >> 22);
                    int iIndexOf = 26 - TextUtils.indexOf("", "");
                    Object[] objArr20 = new Object[1];
                    k((short) 144, r6[8], (byte) (-$$g[9]), objArr20);
                    objRemoteActionCompatParcelizer5 = startForeground.read(cResolveSizeAndState, iMyPid, iIndexOf, -1033747278, false, (String) objArr20[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer5).set(null, objArr);
                try {
                    Object[] objArr21 = new Object[1];
                    j((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 8886, new char[]{4822, 12398, 22461, 31456, 38916, 48973, 49817, 57752, 1888, 10923, 18879, 28473, 45658, 53647, 62657, 6763, 14762, 23763, 25093, 33101, 42136, 52191}, objArr21);
                    Class<?> cls5 = Class.forName((String) objArr21[0]);
                    Object[] objArr22 = new Object[1];
                    i(new char[]{0, 0, 0, 0}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 50083), new char[]{15037, 5097, 62507, 29263, 25428, 57939, 5218, 48161, 18886, 57344, 3852, 47896, 51810, 35290, 50274}, new char[]{39071, 54228, 50689, 62147}, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 30659735, objArr22);
                    long jLongValue = ((Long) cls5.getDeclaredMethod((String) objArr22[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer6 == null) {
                        char cCombineMeasuredStates = (char) (13183 - View.combineMeasuredStates(0, 0));
                        int i9 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1648;
                        int i10 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 25;
                        Object[] objArr23 = new Object[1];
                        k((short) 111, r12[8], (byte) (-$$g[9]), objArr23);
                        objRemoteActionCompatParcelizer6 = startForeground.read(cCombineMeasuredStates, i9, i10, 54351865, false, (String) objArr23[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer7 == null) {
                        char longPressTimeout = (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 13183);
                        int modifierMetaStateMask = 1648 - ((byte) KeyEvent.getModifierMetaStateMask());
                        int iArgb = 26 - Color.argb(0, 0, 0, 0);
                        short s2 = (short) 187;
                        Object[] objArr24 = new Object[1];
                        k(s2, (byte) (s2 & 108), (byte) (-$$g[62]), objArr24);
                        objRemoteActionCompatParcelizer7 = startForeground.read(longPressTimeout, modifierMetaStateMask, iArgb, -133433128, false, (String) objArr24[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer7).set(null, lValueOf2);
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        int i11 = ((int[]) objArr[3])[0];
        int i12 = ((int[]) objArr[2])[0];
        if (i12 != i11) {
            long j = -1;
            long j2 = ((long) (i12 ^ i11)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = j2 | (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32));
            Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(-1407079962);
            if (objRemoteActionCompatParcelizer8 == null) {
                objRemoteActionCompatParcelizer8 = startForeground.read((char) (View.resolveSize(0, 0) + 4535), 6054 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 43 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), -764908173, false, "IconCompatParcelizer", new Class[0]);
            }
            Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer8).invoke(null, null);
            try {
                Object[] objArr25 = {-818257525, Long.valueOf(j4), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
                Class cls6 = (Class) startForeground.IconCompatParcelizer((char) ((Process.getThreadPriority(0) + 20) >> 6), 6030 - KeyEvent.keyCodeFromString(""), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 24);
                byte[] bArr2 = $$p;
                Object[] objArr26 = new Object[1];
                l((byte) 37, (byte) (bArr2[38] - 1), (byte) (bArr2[50] - 1), objArr26);
                cls6.getMethod((String) objArr26[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke2, objArr25);
                int i13 = onCustomAction + 99;
                onAddQueueItem = i13 % 128;
                int i14 = i13 % 2;
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        super.onCreate(p0);
        ((getChunkDurationUs) getMPresenter()).RemoteActionCompatParcelizer();
        this.read.run();
        onMediaButtonEvent();
        CmcdConfigurationRequestConfig.RemoteActionCompatParcelizer(this, new AudioAttributesCompatParcelizer(null));
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        int i = 2 % 2;
        NavigationBarViewSavedState navigationBarViewSavedState = new NavigationBarViewSavedState(CmcdConfigurationRequestConfig.IconCompatParcelizer(), Integer.valueOf(R.attr.colorPrimary), Integer.valueOf(R.attr.colorSurfaceVariant5));
        int i2 = onCustomAction + 71;
        onAddQueueItem = i2 % 128;
        if (i2 % 2 == 0) {
            return navigationBarViewSavedState;
        }
        throw null;
    }

    private final void onMediaButtonEvent() {
        int i = 2 % 2;
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(getInternalName.RemoteActionCompatParcelizer(this), new IconCompatParcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.SsManifestParser
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                int iWrite = RecentUpdateSubjectDetails.read.write();
                int iWrite2 = RecentUpdateSubjectDetails.read.write();
                int iWrite3 = RecentUpdateSubjectDetails.read.write();
                return (getShowPopup) SyncingActivity.AudioAttributesCompatParcelizer(RecentUpdateSubjectDetails.read.write(), new Object[]{(String) obj2}, iWrite, iWrite3, iWrite2, 1868537563, -1868537562);
            }
        });
        int i2 = onAddQueueItem + 59;
        onCustomAction = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 44 / 0;
        }
    }

    private static final getShowPopup write(String str) {
        int i = 2 % 2;
        int i2 = onAddQueueItem + 41;
        onCustomAction = i2 % 128;
        if (i2 % 2 != 0) {
            toMagicModuleMetaRepoModel.write(str, "");
            return getShowPopup.INSTANCE;
        }
        toMagicModuleMetaRepoModel.write(str, "");
        int i3 = 45 / 0;
        return getShowPopup.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00cb  */
    @Override // kotlin.SsManifestStreamElement, com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 402
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.kt.ui.activities.sync.SyncingActivity.onResume():void");
    }

    @Override // kotlin.addChild
    public final void AudioAttributesCompatParcelizer(Integer p0, int p1) {
        int i = 2 % 2;
        rendererSupportsTunneling.read readVar = new rendererSupportsTunneling.read(this).AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer(new RemoteActionCompatParcelizer()).RemoteActionCompatParcelizer(getString(R.string.btn_retry)).read(getString(p1));
        if (p0 != null) {
            int i2 = onAddQueueItem + 121;
            onCustomAction = i2 % 128;
            int i3 = i2 % 2;
            readVar.write(getString(p0.intValue()));
            int i4 = onCustomAction + 29;
            onAddQueueItem = i4 % 128;
            int i5 = i4 % 2;
        }
        readVar.write().show();
    }

    @Override // com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity
    public final handlePreambleAddressCode[] MediaBrowserCompatCustomActionResultReceiver() {
        int i = 2 % 2;
        int i2 = onCustomAction;
        int i3 = i2 + 79;
        onAddQueueItem = i3 % 128;
        int i4 = i3 % 2;
        handlePreambleAddressCode[] handlepreambleaddresscodeArr = {this.IconCompatParcelizer};
        int i5 = i2 + 19;
        onAddQueueItem = i5 % 128;
        int i6 = i5 % 2;
        return handlepreambleaddresscodeArr;
    }

    @Override // kotlin.addChild
    public final void AudioAttributesCompatParcelizer() {
        int i = 2 % 2;
        int i2 = onAddQueueItem + 83;
        onCustomAction = i2 % 128;
        int i3 = i2 % 2;
        ImageView imageView = onCommand().write;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView, "");
        onDraw.AudioAttributesImplApi21Parcelizer(imageView);
        int i4 = onCustomAction + 63;
        onAddQueueItem = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // kotlin.addChild
    public final void write() {
        int i = 2 % 2;
        int i2 = onAddQueueItem + 57;
        onCustomAction = i2 % 128;
        int i3 = i2 % 2;
        BandwidthMeterEventListenerEventDispatcherHandlerAndListener bandwidthMeterEventListenerEventDispatcherHandlerAndListener = this.syncManager.get();
        if (i3 != 0) {
            int iOnRemoveQueueItem = getExamName.onRemoveQueueItem();
            BandwidthMeterEventListenerEventDispatcherHandlerAndListener.read(getExamName.onRemoveQueueItem(), new Object[]{bandwidthMeterEventListenerEventDispatcherHandlerAndListener}, iOnRemoveQueueItem, 1896980334, getExamName.onRemoveQueueItem(), -1896980334, getExamName.onRemoveQueueItem());
            return;
        }
        int iOnRemoveQueueItem2 = getExamName.onRemoveQueueItem();
        BandwidthMeterEventListenerEventDispatcherHandlerAndListener.read(getExamName.onRemoveQueueItem(), new Object[]{bandwidthMeterEventListenerEventDispatcherHandlerAndListener}, iOnRemoveQueueItem2, 1896980334, getExamName.onRemoveQueueItem(), -1896980334, getExamName.onRemoveQueueItem());
        int i4 = 68 / 0;
    }

    @Override // kotlin.SsManifestStreamElement, com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, android.app.Activity
    public final void onDestroy() {
        int i = 2 % 2;
        int i2 = onAddQueueItem + 45;
        onCustomAction = i2 % 128;
        int i3 = i2 % 2;
        IconCompatParcelizer(this.IconCompatParcelizer);
        onPlay().removeCallbacks(this.read);
        super.onDestroy();
        int i4 = onAddQueueItem + 99;
        onCustomAction = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00ad  */
    @Override // kotlin.SsManifestStreamElement, com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 474
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.kt.ui.activities.sync.SyncingActivity.onPause():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x08b3  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x08ec A[Catch: all -> 0x09a2, TryCatch #0 {all -> 0x09a2, blocks: (B:121:0x08e6, B:123:0x08ec, B:124:0x0919), top: B:304:0x08e6, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0a76 A[Catch: all -> 0x036b, TryCatch #8 {all -> 0x036b, blocks: (B:164:0x0a70, B:166:0x0a76, B:167:0x0aa3, B:242:0x1168, B:244:0x116e, B:245:0x1197, B:278:0x15dd, B:280:0x15e3, B:281:0x1611, B:259:0x1377, B:261:0x1396, B:262:0x13eb, B:209:0x0c99, B:211:0x0c9f, B:212:0x0cc8, B:22:0x0116, B:24:0x011c, B:25:0x0145, B:27:0x02df, B:29:0x030d, B:30:0x0365, B:172:0x0b32, B:174:0x0b36, B:195:0x0c21, B:197:0x0c27, B:198:0x0c28, B:200:0x0c2a, B:202:0x0c31, B:203:0x0c32, B:178:0x0b43, B:184:0x0b50, B:186:0x0b65, B:187:0x0b92, B:188:0x0b98, B:190:0x0ba5, B:191:0x0c17), top: B:318:0x0116, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0b30  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0b4d  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0b65 A[Catch: all -> 0x0c29, TryCatch #7 {all -> 0x0c29, blocks: (B:184:0x0b50, B:186:0x0b65, B:187:0x0b92), top: B:316:0x0b50, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0ba5 A[Catch: all -> 0x0c1f, TryCatch #18 {all -> 0x0c1f, blocks: (B:188:0x0b98, B:190:0x0ba5, B:191:0x0c17), top: B:336:0x0b98, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0d5d  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0db3  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0e0f  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x1146  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x1229  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x1270  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x12ca  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x15bc  */
    /* JADX WARN: Removed duplicated region for block: B:348:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x036f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object read(java.lang.Object[] r39) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 6700
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.kt.ui.activities.sync.SyncingActivity.read(java.lang.Object[]):java.lang.Object");
    }

    public static /* synthetic */ Handler MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        int i = 2 % 2;
        int i2 = onAddQueueItem + 53;
        onCustomAction = i2 % 128;
        if (i2 % 2 == 0) {
            onFastForward();
            throw null;
        }
        Handler handlerOnFastForward = onFastForward();
        int i3 = onAddQueueItem + 17;
        onCustomAction = i3 % 128;
        int i4 = i3 % 2;
        return handlerOnFastForward;
    }

    public static /* synthetic */ getShowPopup IconCompatParcelizer(String str) {
        int iWrite = RecentUpdateSubjectDetails.read.write();
        int iWrite2 = RecentUpdateSubjectDetails.read.write();
        int iWrite3 = RecentUpdateSubjectDetails.read.write();
        return (getShowPopup) AudioAttributesCompatParcelizer(RecentUpdateSubjectDetails.read.write(), new Object[]{str}, iWrite, iWrite3, iWrite2, 1868537563, -1868537562);
    }

    static {
        onCommand = 1;
        onPlayFromMediaId();
        IconCompatParcelizer = new isResolutionNotSupported[]{toMagicModuleMetaDataUcModel.write(new downloadMagicModuleMetalambda0(SyncingActivity.class, "binding", "getBinding()Lcom/marrow/databinding/ActivitySyncingBinding;", 0))};
        INSTANCE = new Companion(null);
        int i = handleMediaPlayPauseIfPendingOnHandler + 103;
        onCommand = i % 128;
        int i2 = i % 2;
    }

    @Override // com.marrow.ui.activities.base.BaseActivity
    public final NavigationBarViewSavedState onAddQueueItem() {
        Object[] objArr = {this};
        int iWrite = RecentUpdateSubjectDetails.read.write();
        int iWrite2 = RecentUpdateSubjectDetails.read.write();
        return (NavigationBarViewSavedState) AudioAttributesCompatParcelizer(RecentUpdateSubjectDetails.read.write(), objArr, iWrite, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(0) + 210410618, iWrite2, -1833934809, 1833934811);
    }

    @Override // com.marrow.ui.activities.base.BaseActivity
    public final int handleMediaPlayPauseIfPendingOnHandler() {
        int i = 2 % 2;
        int i2 = onCustomAction;
        int i3 = i2 + 47;
        onAddQueueItem = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 111;
        onAddQueueItem = i5 % 128;
        int i6 = i5 % 2;
        return R.layout.activity_syncing;
    }

    @Override // kotlin.addChild
    public final void read() {
        int iWrite = RecentUpdateSubjectDetails.read.write();
        int iWrite2 = RecentUpdateSubjectDetails.read.write();
        int iWrite3 = RecentUpdateSubjectDetails.read.write();
        AudioAttributesCompatParcelizer(RecentUpdateSubjectDetails.read.write(), new Object[]{this}, iWrite, iWrite3, iWrite2, 78645357, -78645354);
    }

    @Override // kotlin.SsManifestStreamElement, com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onStart() {
        int i = 2 % 2;
        int i2 = onCustomAction + 31;
        onAddQueueItem = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        super.onStart();
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = onAddQueueItem + 3;
        onCustomAction = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // kotlin.SsManifestStreamElement, com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        AudioAttributesCompatParcelizer(RecentUpdateSubjectDetails.read.write(), new Object[]{this, context}, RecentUpdateSubjectDetails.read.write(), RecentUpdateSubjectDetails.read.write(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) - 2053692225, -992459427, 992459427);
    }

    static void onPlayFromMediaId() {
        MediaMetadataCompat = -3498762522182953692L;
        RatingCompat = 1649231149;
        MediaBrowserCompatMediaItem = (char) 54564;
        MediaDescriptionCompat = 3787762199262691708L;
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        String str = (String) objArr[0];
        int i = 2 % 2;
        int i2 = onCustomAction + 99;
        onAddQueueItem = i2 % 128;
        if (i2 % 2 == 0) {
            return write(str);
        }
        write(str);
        throw null;
    }
}
