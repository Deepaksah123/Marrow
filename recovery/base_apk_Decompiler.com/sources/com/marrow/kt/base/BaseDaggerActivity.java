package com.marrow.kt.base;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.TrainingApplication;
import com.marrow.data.models.ResponseError;
import com.marrow.data.models.plan.PlanGroup$$ExternalSyntheticLambda0;
import com.marrow.kt.base.BaseDaggerActivity;
import com.marrow.ui.activities.base.BaseActivity;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.BaseUrl;
import kotlin.DownloadService;
import kotlin.MediaSessionConnectorCustomActionProvider;
import kotlin.Metadata;
import kotlin.ResolvableApiException;
import kotlin.buildResolutionString;
import kotlin.canceledPendingResult;
import kotlin.getBasicChar;
import kotlin.getChannel;
import kotlin.getCreatedOnDateMs;
import kotlin.getExtendedEsFrChar;
import kotlin.getNextEventTime;
import kotlin.getProvider;
import kotlin.getShowPopup;
import kotlin.getTrackName;
import kotlin.handlePreambleAddressCode;
import kotlin.hasSelectionOverride;
import kotlin.isSpecialNorthAmericanChar;
import kotlin.notifyDownloadRemoved;
import kotlin.setSdkPayload;
import kotlin.setSelectedItemId;
import kotlin.startForeground;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.updateShuffleButton;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\tJ\u000f\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\tJ\u000f\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\tJ\u001f\u0010\u0015\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001f\u0010\tJ\u000f\u0010 \u001a\u00020\fH\u0016¢\u0006\u0004\b \u0010\tJ\u0017\u0010\"\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u0011\u0010%\u001a\u0004\u0018\u00010$H\u0014¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010'H\u0014¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\fH\u0014¢\u0006\u0004\b*\u0010\tJ\u000f\u0010+\u001a\u00020\u001cH\u0014¢\u0006\u0004\b+\u0010\u001eJ\u001f\u0010.\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020,2\u0006\u0010\u0014\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u000b\u001a\u000200H\u0016¢\u0006\u0004\b\u0015\u00101J\u000f\u00102\u001a\u00020\u001cH\u0016¢\u0006\u0004\b2\u0010\u001eJ\u000f\u00103\u001a\u00020\fH\u0016¢\u0006\u0004\b3\u0010\tJ\u0017\u0010\u001a\u001a\u00020\f2\u0006\u0010\u000b\u001a\u000204H\u0016¢\u0006\u0004\b\u001a\u00105J\u0017\u00106\u001a\u00020\f2\u0006\u0010\u000b\u001a\u000204H\u0016¢\u0006\u0004\b6\u00105J\u000f\u00107\u001a\u00020\fH\u0016¢\u0006\u0004\b7\u0010\tJ\u000f\u00108\u001a\u00020\u001cH\u0016¢\u0006\u0004\b8\u0010\u001eJ\u001f\u0010.\u001a\u00020\f2\u0006\u0010\u000b\u001a\u0002042\u0006\u0010\u0014\u001a\u000204H\u0016¢\u0006\u0004\b.\u00109J\u0015\u0010:\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020,¢\u0006\u0004\b:\u0010\tJ\u0017\u0010;\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b;\u0010\u000eJ\u0017\u0010<\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b<\u0010\u000eJ)\u0010>\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020,2\u0006\u0010\u0014\u001a\u00020,2\b\u0010=\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b>\u0010?J\u0017\u0010@\u001a\u0002042\u0006\u0010\u000b\u001a\u00020,H\u0016¢\u0006\u0004\b@\u0010AJ+\u0010\u001a\u001a\u0002042\u0006\u0010\u000b\u001a\u00020,2\u0012\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020B0'\"\u00020BH\u0016¢\u0006\u0004\b\u001a\u0010CJ\u001f\u0010\u0017\u001a\u00020\f2\u0006\u0010\u000b\u001a\u0002042\u0006\u0010\u0014\u001a\u000204H\u0016¢\u0006\u0004\b\u0017\u00109J\u0017\u0010.\u001a\u00020\f2\u0006\u0010\u000b\u001a\u000204H\u0016¢\u0006\u0004\b.\u00105J/\u0010\u0017\u001a\u00020\f2\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020!0'\"\u00020!2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0D¢\u0006\u0004\b\u0017\u0010EJ\u001f\u0010.\u001a\u00020\f*\u00020!2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0D¢\u0006\u0004\b.\u0010FR\"\u0010G\u001a\u00028\u00008\u0007@\u0007X\u0087.¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010L"}, d2 = {"Lcom/marrow/kt/base/BaseDaggerActivity;", "Lo/getExtendedEsFrChar;", "P", "Lcom/marrow/ui/activities/base/BaseActivity;", "Lo/getBasicChar;", "Lo/getChannel;", "Lo/getNextEventTime;", "Landroid/view/View$OnClickListener;", "<init>", "()V", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "finish", "onStart", "onStop", "Landroid/content/BroadcastReceiver;", "Landroid/content/IntentFilter;", "p1", "write", "(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V", "IconCompatParcelizer", "(Landroid/content/BroadcastReceiver;)V", "Landroid/content/Intent;", "AudioAttributesCompatParcelizer", "(Landroid/content/Intent;)V", "", "RatingCompat", "()Z", "onPause", "onResume", "Landroid/view/View;", "onClick", "(Landroid/view/View;)V", "Lo/handlePreambleAddressCode;", "AudioAttributesImplApi26Parcelizer", "()Lo/handlePreambleAddressCode;", "", "MediaBrowserCompatCustomActionResultReceiver", "()[Lo/handlePreambleAddressCode;", "onDestroy", "MediaBrowserCompatSearchResultReceiver", "", "Lo/hasSelectionOverride;", "RemoteActionCompatParcelizer", "(Lo/hasSelectionOverride;)V", "Lcom/marrow/data/models/ResponseError;", "(Lcom/marrow/data/models/ResponseError;)V", "aC_", "AudioAttributesImplBaseParcelizer", "", "(Ljava/lang/String;)V", "read", "MediaBrowserCompatMediaItem", "AudioAttributesImplApi21Parcelizer", "(Ljava/lang/String;Ljava/lang/String;)V", "MediaDescriptionCompat", "onSaveInstanceState", "onRestoreInstanceState", "p2", "onActivityResult", "(IILandroid/content/Intent;)V", "MediaBrowserCompatItemReceiver", "()Ljava/lang/String;", "", "([Ljava/lang/Object;)Ljava/lang/String;", "Lkotlin/Function0;", "([Landroid/view/View;Lo/getCreatedOnDateMs;)V", "(Landroid/view/View;Lo/getCreatedOnDateMs;)V", "mPresenter", "Lo/getExtendedEsFrChar;", "getMPresenter", "()Lo/getExtendedEsFrChar;", "setMPresenter", "(Lo/getExtendedEsFrChar;)V"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class BaseDaggerActivity<P extends getExtendedEsFrChar> extends BaseActivity implements getBasicChar, getChannel, getNextEventTime, View.OnClickListener {

    @setSdkPayload
    public P mPresenter;
    private static final byte[] $$c = {45, 96, -22, -65};
    private static final int $$f = 87;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$v = {98, -46, 102, 39, -61, 35, 28, 3, 9, -4, -26, TarConstants.LF_NORMAL, -7, 5, 2, -9, 23, -1, 5, 14, -25, 23, 13, -6, 5, 17, -9, 17, -43, TarConstants.LF_NORMAL, -7, 5, 2, -18, 24, 27, -30, 15, 15, 13, -12, 18, -9, 0, 7, 23, 12, 6, 9, -11, -32, 38, 21, -7, 10, 3, -39, TarConstants.LF_NORMAL, 2, 7, -11, 23, -32, 21, 21, -11, 6, 11, 1, 21, -17, 17, -61, 61, 2, 19, -47, 39, 10, 15, 2, 5, -11, 3, -11, 31, 7, 5, 2, -9, 0, 16, -35, 45, 7, -1, -8, 23};
    private static final int $$w = 164;
    private static final byte[] $$a = {122, -64, TarConstants.LF_SYMLINK, -113, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, 12, 3, -4, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$b = 99;
    private static int MediaBrowserCompatCustomActionResultReceiver = 0;
    private static int MediaBrowserCompatSearchResultReceiver = 1;
    private static char[] RemoteActionCompatParcelizer = {56429, 54970, 51672, 64758, 63235, 59997, 40312, 38858, 35491, 48615, 45138, 43796, 24158, 20635, 19391, 32449, 29183, 25639, 30469, 32193, 25257, 22421, 23678, 16751, 13906, 15530, 8649, 5780, 7028, 'I', 62772, 64487, 57554, 54704, 55939, 53073, 46126, 47435, 45049, 38077, 39311, 36448, 29516, 30721, 28414, 21444, 22718, 19809, 12819, 10018, 11288, 4820, 1967, 3201, 61822, 58916, 60168, 53732, 50911, 52112, 45107, 42310, 43554, 37112, 34194, 35492, 32669, 25692, 26994, 24076, 17635, 18866, 16024, 9078, 10329, 7514, 1003, 2199, 64994, 57968, 55115, 56352, 49411, 47041, 48302, 50180, 52939, 53692, 58497, 61299, 62007, 17043, 18504, 22387, 25118, 27127, 29867, 896, 2424, 5196, 8961, 11959, 13777, 49383, 52852, 54597, 57407, 61205, 64206, 33212, 35984, 39459, 41259, 44033, 48100, 18055, 19854, 23344, 26203, 27958, 30908, 1938, 4847, 6544, 10008, 12839, 14623, 56422, 54965, 51658, 64741, 63298, 59992, 40317, 38794, 35499, 48570, 45103, 43837, 24159, 20608, 19385, 32457, 56425, 54968, 51677, 64756, 63263, 59985, 40312, 38838, 35497, 48629, 45072, 43824, 24133, 20633, 19385, 15187, 12685, 12014, 7131, 4158, 3433, 31296, 28861, 28062, 23241, 22311, 47451, 45962, 44261, 39387, 37431, 36712, 63556, 62131, 61333, 55497, 54567};
    private static long write = 287484148930959060L;
    private static long IconCompatParcelizer = 4251950502514466983L;
    private static int read = -136981212;
    private static char AudioAttributesCompatParcelizer = 54564;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$i(int r5, short r6, short r7) {
        /*
            byte[] r0 = com.marrow.kt.base.BaseDaggerActivity.$$c
            int r6 = r6 * 3
            int r6 = r6 + 4
            int r7 = r7 * 2
            int r7 = r7 + 101
            int r5 = r5 * 2
            int r1 = r5 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L17
            r4 = r7
            r3 = r2
            r7 = r5
            goto L27
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r5) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L23:
            int r3 = r3 + 1
            r4 = r0[r6]
        L27:
            int r7 = r7 + r4
            int r6 = r6 + 1
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.kt.base.BaseDaggerActivity.$$i(int, short, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(int r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.marrow.kt.base.BaseDaggerActivity.$$a
            int r1 = 44 - r7
            int r6 = r6 + 4
            int r8 = 114 - r8
            byte[] r1 = new byte[r1]
            int r7 = 43 - r7
            r2 = 0
            if (r0 != 0) goto L13
            r8 = r6
            r3 = r7
            r4 = r2
            goto L2a
        L13:
            r3 = r2
            r5 = r8
            r8 = r6
            r6 = r5
        L17:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            int r8 = r8 + 1
            r3 = r0[r8]
        L2a:
            int r3 = -r3
            int r6 = r6 + r3
            int r6 = r6 + (-1)
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.kt.base.BaseDaggerActivity.c(int, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(byte r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r0 = r6 + 4
            int r8 = r8 + 82
            int r7 = r7 + 4
            byte[] r1 = com.marrow.kt.base.BaseDaggerActivity.$$v
            byte[] r0 = new byte[r0]
            int r6 = r6 + 3
            r2 = 0
            if (r1 != 0) goto L13
            r4 = r6
            r8 = r7
            r3 = r2
            goto L28
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r6) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L21:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r5
        L28:
            int r7 = r7 + r4
            int r7 = r7 + (-4)
            int r8 = r8 + 1
            r5 = r8
            r8 = r7
            r7 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.kt.base.BaseDaggerActivity.d(byte, byte, short, java.lang.Object[]):void");
    }

    public static /* synthetic */ Object read(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i2;
        int i8 = (~(i7 | i3)) | i4;
        int i9 = (~(i7 | (~i3))) | (~((~i4) | i7)) | (~(i4 | i2 | i3));
        int i10 = ~(i3 | i4);
        int i11 = i4 + i2 + i6 + ((-813770285) * i5) + (135932771 * i);
        int i12 = i11 * i11;
        int i13 = (526900465 * i4) + 74317824 + ((-1745228167) * i2) + ((-249289968) * i8) + (2022838664 * i9) + ((-2022838664) * i10) + (277610496 * i6) + (1331953664 * i5) + ((-366739456) * i) + ((-1308753920) * i12);
        int i14 = (i4 * 1149714451) + 247108311 + (i2 * 1149714091) + (i8 * (-720)) + (i9 * (-360)) + (i10 * 360) + (i6 * 1149713731) + (i5 * 1918847289) + (i * (-2006650391)) + (i12 * 460980224);
        int i15 = i13 + (i14 * i14 * (-1418592256));
        if (i15 != 1) {
            return i15 != 2 ? i15 != 3 ? IconCompatParcelizer(objArr) : write(objArr) : read(objArr);
        }
        BaseDaggerActivity baseDaggerActivity = (BaseDaggerActivity) objArr[0];
        int i16 = 2 % 2;
        int i17 = MediaBrowserCompatSearchResultReceiver + 89;
        MediaBrowserCompatCustomActionResultReceiver = i17 % 128;
        int i18 = i17 % 2;
        String string = baseDaggerActivity.getString(R.string.dlg_title_update_college);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        int i19 = MediaBrowserCompatCustomActionResultReceiver + 113;
        MediaBrowserCompatSearchResultReceiver = i19 % 128;
        int i20 = i19 % 2;
        return string;
    }

    public final P getMPresenter() {
        int i = 2 % 2;
        P p = this.mPresenter;
        if (p == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            return null;
        }
        int i2 = MediaBrowserCompatSearchResultReceiver + 121;
        int i3 = i2 % 128;
        MediaBrowserCompatCustomActionResultReceiver = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 55;
        MediaBrowserCompatSearchResultReceiver = i5 % 128;
        int i6 = i5 % 2;
        return p;
    }

    public final void setMPresenter(P p) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 7;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        if (i2 % 2 != 0) {
            toMagicModuleMetaRepoModel.write(p, "");
            this.mPresenter = p;
        } else {
            toMagicModuleMetaRepoModel.write(p, "");
            this.mPresenter = p;
            int i3 = 42 / 0;
        }
    }

    private static void a(char c, int i, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        DownloadService downloadService = new DownloadService();
        long[] jArr = new long[i2];
        downloadService.write = 0;
        while (downloadService.write < i2) {
            int i4 = downloadService.write;
            try {
                Object[] objArr2 = {Integer.valueOf(RemoteActionCompatParcelizer[i + i4])};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1659892375);
                if (objRemoteActionCompatParcelizer == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer = startForeground.read((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 36620), 2340 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 28 - KeyEvent.getDeadChar(0, 0), 480654850, false, $$i(b, b2, b2), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(write), Integer.valueOf(c)};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(955774634);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) View.MeasureSpec.makeMeasureSpec(0, 0), 9701 - (ViewConfiguration.getPressedStateDuration() >> 16), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 26, 1186869823, false, "d", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i4] = ((Long) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {downloadService, downloadService};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-452087292);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) View.resolveSize(0, 0), 23785 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 32 - ImageFormat.getBitsPerPixel(0), -1690012015, false, "b", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        downloadService.write = 0;
        int i5 = $11 + 1;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        while (downloadService.write < i2) {
            int i7 = $11 + 65;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            cArr[downloadService.write] = (char) jArr[downloadService.write];
            Object[] objArr5 = {downloadService, downloadService};
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-452087292);
            if (objRemoteActionCompatParcelizer4 == null) {
                objRemoteActionCompatParcelizer4 = startForeground.read((char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 23783, TextUtils.lastIndexOf("", '0', 0) + 34, -1690012015, false, "b", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
            int i9 = $11 + 87;
            $10 = i9 % 128;
            int i10 = i9 % 2;
        }
        String str = new String(cArr);
        int i11 = $11 + 109;
        $10 = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
        objArr[0] = str;
    }

    private static void b(char[] cArr, char c, char[] cArr2, char[] cArr3, int i, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        notifyDownloadRemoved notifydownloadremoved = new notifyDownloadRemoved();
        int length = cArr.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr3.length;
        char[] cArr6 = new char[length3];
        notifydownloadremoved.AudioAttributesCompatParcelizer = 0;
        while (notifydownloadremoved.AudioAttributesCompatParcelizer < length3) {
            int i4 = $11 + 27;
            $10 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {notifydownloadremoved};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(718099963);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) ((ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) - 1), ExpandableListView.getPackedPositionChild(0L) + 22749, View.MeasureSpec.makeMeasureSpec(0, 0) + 36, 1417974126, false, "j", new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {notifydownloadremoved};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(247211480);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (31369 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), 2721 - Color.argb(0, 0, 0, 0), ExpandableListView.getPackedPositionChild(0L) + 39, 1895162189, false, $$i(b, b2, (byte) (b2 + 1)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {notifydownloadremoved, Integer.valueOf(cArr4[notifydownloadremoved.AudioAttributesCompatParcelizer % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1336303982);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (TextUtils.lastIndexOf("", '0') + 1), 15713 - (ViewConfiguration.getDoubleTapTimeout() >> 16), Color.argb(0, 0, 0, 0) + 64, -837789177, false, "f", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1602228082);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (40976 - TextUtils.indexOf("", "", 0)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 6122, View.resolveSizeAndState(0, 0, 0) + 29, -566873061, false, "m", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = notifydownloadremoved.write;
                cArr6[notifydownloadremoved.AudioAttributesCompatParcelizer] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[notifydownloadremoved.AudioAttributesCompatParcelizer])) ^ (IconCompatParcelizer ^ (-3498762522182953692L))) ^ ((long) ((int) (((long) read) ^ (-3498762522182953692L))))) ^ ((long) ((char) (((long) AudioAttributesCompatParcelizer) ^ (-3498762522182953692L)))));
                notifydownloadremoved.AudioAttributesCompatParcelizer++;
                int i6 = $11 + 25;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                i2 = 2;
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

    @Override // com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onCreate(Bundle p0) throws Throwable {
        Object[] objArr;
        char c;
        char c2;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 37;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = new Object[1];
        a((char) Color.red(0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 10, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 17, objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        b(new char[]{19348, 57457, 1479, 15451}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 23297), new char[]{62851, 48958, 4209, 62576}, new char[]{14401, 52711, 40863, 57189, 23772}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 941592280, objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr4 = new Object[1];
                b(new char[]{7178, 64042, 5228, 23252}, (char) (ExpandableListView.getPackedPositionGroup(0L) + 54292), new char[]{62851, 48958, 4209, 62576}, new char[]{43935, 15333, 34021, 16982, 50834, 41177, 38409, 46633, 38817, 13039, 59781, 17526, 21606, 17879, 35483, 14645, 13299, 22738, 53060, 183, 4613, 31966, 37398, 49120, 34687, 10650}, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) - 1, objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                b(new char[]{53032, 19990, 24965, 40201}, (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 2400), new char[]{62851, 48958, 4209, 62576}, new char[]{52429, 49376, 62021, 27980, 6405, 27350, 58400, 16391, 63434, 30430, 23595, 61192, 34962, 55415, 64306, 59124, 18687, 5736}, Process.myPid() >> 22, objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                int i4 = MediaBrowserCompatSearchResultReceiver + 69;
                MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
                int i5 = i4 % 2;
                baseContext = (((baseContext instanceof ContextWrapper) ^ true) || ((ContextWrapper) baseContext).getBaseContext() != null) ? baseContext.getApplicationContext() : null;
            }
            if (baseContext != null) {
                try {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (MotionEvent.axisFromString("") + 4536), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 6054, View.MeasureSpec.getSize(0) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr6 = new Object[1];
                    b(new char[]{53460, 37120, 3959, 22312}, (char) Color.green(0), new char[]{62851, 48958, 4209, 62576}, new char[]{23210, 54353, 7944, 38550, 3174, 33226, 41983, 49270, 53099, 41043, 43251, 15570, 35665, 24894, 52472, 56226, 59819, 18015, 38025, 22633, 9000, 19907, 19989, 18350, 52795, 57843, 6489, 10602, 33554, 47155, 36897, 28780, 1150, 25215, 13901, 36423, 7555, 25059, 4593, 34562, 60128, 44912, 60964, 1101, 22696, 19920, 5875, 58269}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) - 109, objArr6);
                    String str = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    b(new char[]{62555, 33871, 49466, 43942}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) - 109), new char[]{62851, 48958, 4209, 62576}, new char[]{42266, 46513, 59586, 56546, 34165, 29646, 22366, 13462, 54962, 16991, 40821, 31209, 42475, 33689, 48588, 22933, 6499, 18011, 1870, 7517, 57717, 31769, 9555, 33721, 8889, 21423, 1720, 12584, 27029, 39248, 15230, 13202, 42575, 9597, 37684, 56389, 63062, 12827, 16100, 2442, 36055, 17734, 60313, 7918, 45848, 44416, 36958, 8510, 10253, 39814, 29108, 42953, 60454, 7565, 45525, 47730, 14310, 9761, 62111, 63715, 49397, 39620, 36882, 49800}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(1) - 49, objArr7);
                    String str2 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    b(new char[]{18350, 25007, 25854, 55209}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 10), new char[]{62851, 48958, 4209, 62576}, new char[]{49631, 65011, 27002, 58202, 60522, 10019, 60271, 47967, 42513, 20957, 53837, 9874, 37808, 6971, 35523, 11558, 20472, 26753, 63522, 20178, 35010, 50804, 59119, 45243, 44802, 2648, 13755, 35519, 23224, 3823, 34223, 29280, 20709, 56403, 19773, 46488, 16883, 54798, 27094, 65361, 56189, 59839, 62971, 13495, 28029, 25715, 20006, 2166, 50315, 29530, 46483, 44467, 1345, 21506, 23097, 64739, 37543, 62157, 59152, 7455, 21705, 28141, 1020, 14862}, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) - 1, objArr8);
                    String str3 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    a((char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 43838), (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 18, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 63, objArr9);
                    String str4 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    a((char) (6192 - TextUtils.indexOf((CharSequence) "", '0')), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 75, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) - 108, objArr10);
                    String str5 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    a((char) (View.MeasureSpec.getSize(0) + 40621), 91 - (ViewConfiguration.getJumpTapTimeout() >> 16), 37 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr11);
                    Object[] objArr12 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr11[0], 86400};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(448819875);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 6030, 25 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 1686746678, false, "AudioAttributesCompatParcelizer", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr12);
                    int i6 = MediaBrowserCompatSearchResultReceiver + 17;
                    MediaBrowserCompatCustomActionResultReceiver = i6 % 128;
                    int i7 = i6 % 2;
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
            char packedPositionType = (char) (13183 - ExpandableListView.getPackedPositionType(0L));
            int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1649;
            int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 26;
            Object[] objArr13 = new Object[1];
            c(r4[53], r4[5], (byte) (-$$a[62]), objArr13);
            objRemoteActionCompatParcelizer3 = startForeground.read(packedPositionType, scrollBarFadeDuration, packedPositionGroup, -133433128, false, (String) objArr13[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer3).getLong(null) != -1) {
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer4 == null) {
                char cBlue = (char) (Color.blue(0) + 13183);
                int i8 = 1648 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                int packedPositionChild = 25 - ExpandableListView.getPackedPositionChild(0L);
                Object[] objArr14 = new Object[1];
                c(r0[65], r0[30], (byte) (-$$a[9]), objArr14);
                objRemoteActionCompatParcelizer4 = startForeground.read(cBlue, i8, packedPositionChild, -1033747278, false, (String) objArr14[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer4).get(null);
            c2 = 3;
            c = 2;
        } else {
            Object[] objArr15 = new Object[1];
            a((char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) - 114), Color.argb(0, 0, 0, 0) + 127, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 12, objArr15);
            Class<?> cls3 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            b(new char[]{26039, 43973, 17838, 52670}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(1) + 48660), new char[]{62851, 48958, 4209, 62576}, new char[]{32017, 23065, 381, 44275, 61181, 36305, 59784, 51792, 39221, 65289, 6506, 3820, 30357, 33689, 3712, 25840}, MotionEvent.axisFromString("") + 1, objArr16);
            int iIntValue2 = ((Integer) cls3.getMethod((String) objArr16[0], Object.class).invoke(null, this)).intValue();
            int i9 = MediaBrowserCompatCustomActionResultReceiver + 55;
            MediaBrowserCompatSearchResultReceiver = i9 % 128;
            int i10 = i9 % 2;
            try {
                Object[] objArr17 = {Integer.valueOf(iIntValue2), 0, -1756096054};
                byte[] bArr = $$v;
                byte b = bArr[5];
                byte b2 = bArr[43];
                Object[] objArr18 = new Object[1];
                d(b, b2, (byte) (b2 | 29), objArr18);
                Class<?> cls4 = Class.forName((String) objArr18[0]);
                Object[] objArr19 = new Object[1];
                d(bArr[43], bArr[51], (byte) (-bArr[50]), objArr19);
                objArr = (Object[]) cls4.getMethod((String) objArr19[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr17);
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer5 == null) {
                    char packedPositionGroup2 = (char) (13183 - ExpandableListView.getPackedPositionGroup(0L));
                    int i11 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1648;
                    int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 26;
                    Object[] objArr20 = new Object[1];
                    c(r5[65], r5[30], (byte) (-$$a[9]), objArr20);
                    objRemoteActionCompatParcelizer5 = startForeground.read(packedPositionGroup2, i11, fadingEdgeLength, -1033747278, false, (String) objArr20[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer5).set(null, objArr);
                try {
                    Object[] objArr21 = new Object[1];
                    b(new char[]{55037, 56223, 15046, 13416}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(2) - 36), new char[]{62851, 48958, 4209, 62576}, new char[]{3001, 55085, 64486, 19242, 37085, 48162, 23612, 'B', 61154, 12155, 58178, 60482, 19783, 60343, 36524, 10021, 18413, 63434, 15279, 42034, 61865, 33471}, View.MeasureSpec.getMode(0), objArr21);
                    Class<?> cls5 = Class.forName((String) objArr21[0]);
                    Object[] objArr22 = new Object[1];
                    a((char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(0) - 37), View.getDefaultSize(0, 0) + 143, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 5, objArr22);
                    long jLongValue = ((Long) cls5.getDeclaredMethod((String) objArr22[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer6 == null) {
                        char tapTimeout = (char) ((ViewConfiguration.getTapTimeout() >> 16) + 13183);
                        int keyRepeatDelay = 1649 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                        int jumpTapTimeout = 26 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                        Object[] objArr23 = new Object[1];
                        c((short) 75, r6[30], (byte) (-$$a[9]), objArr23);
                        objRemoteActionCompatParcelizer6 = startForeground.read(tapTimeout, keyRepeatDelay, jumpTapTimeout, 54351865, false, (String) objArr23[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer7 == null) {
                        char c3 = (char) ((AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 13183);
                        int capsMode = 1649 - TextUtils.getCapsMode("", 0, 0);
                        int iCombineMeasuredStates = 26 - View.combineMeasuredStates(0, 0);
                        Object[] objArr24 = new Object[1];
                        c(r3[53], r3[5], (byte) (-$$a[62]), objArr24);
                        objRemoteActionCompatParcelizer7 = startForeground.read(c3, capsMode, iCombineMeasuredStates, -133433128, false, (String) objArr24[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer7).set(null, lValueOf2);
                    int i12 = MediaBrowserCompatSearchResultReceiver + 73;
                    MediaBrowserCompatCustomActionResultReceiver = i12 % 128;
                    c = 2;
                    int i13 = i12 % 2;
                    c2 = 3;
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
        int i14 = ((int[]) objArr[c2])[0];
        int i15 = ((int[]) objArr[c])[0];
        if (i15 != i14) {
            long j = -1;
            long j2 = ((long) (i15 ^ i14)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = j2 | (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32));
            Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(-1407079962);
            if (objRemoteActionCompatParcelizer8 == null) {
                objRemoteActionCompatParcelizer8 = startForeground.read((char) (4535 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 6054, 42 - (ViewConfiguration.getEdgeSlop() >> 16), -764908173, false, "IconCompatParcelizer", new Class[0]);
            }
            Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer8).invoke(null, null);
            ArrayList arrayList = new ArrayList();
            String strRemoteActionCompatParcelizer = TrainingApplication.RemoteActionCompatParcelizer();
            int i16 = MediaBrowserCompatSearchResultReceiver + 27;
            MediaBrowserCompatCustomActionResultReceiver = i16 % 128;
            int i17 = i16 % 2;
            try {
                Object[] objArr25 = {-1807222984, Long.valueOf(j4), arrayList, strRemoteActionCompatParcelizer, true};
                Class cls6 = (Class) startForeground.IconCompatParcelizer((char) View.MeasureSpec.getSize(0), 6030 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 24 - View.MeasureSpec.getSize(0));
                byte[] bArr2 = $$v;
                Object[] objArr26 = new Object[1];
                d(bArr2[34], (byte) ($$w >>> 2), bArr2[43], objArr26);
                cls6.getMethod((String) objArr26[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke2, objArr25);
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        buildResolutionString.read(getClass(), "frames : dagger:", System.currentTimeMillis());
        super.onCreate(p0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0037, code lost:
    
        if ((r4 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        r4 = null;
        r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        overridePendingTransition(0, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        if (MediaBrowserCompatSearchResultReceiver() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if (MediaBrowserCompatSearchResultReceiver() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        overridePendingTransition(com.marrow.R.anim.trans_right_in, com.marrow.R.anim.trans_right_out);
        r4 = com.marrow.kt.base.BaseDaggerActivity.MediaBrowserCompatSearchResultReceiver + 43;
        com.marrow.kt.base.BaseDaggerActivity.MediaBrowserCompatCustomActionResultReceiver = r4 % 128;
     */
    @Override // com.marrow.ui.activities.base.BaseActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void finish() {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.marrow.kt.base.BaseDaggerActivity.MediaBrowserCompatSearchResultReceiver
            int r1 = r1 + 1
            int r2 = r1 % 128
            com.marrow.kt.base.BaseDaggerActivity.MediaBrowserCompatCustomActionResultReceiver = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L1c
            super.finish()
            boolean r1 = r4.MediaBrowserCompatSearchResultReceiver()
            r3 = 85
            int r3 = r3 / r2
            if (r1 == 0) goto L3f
            goto L25
        L1c:
            super.finish()
            boolean r1 = r4.MediaBrowserCompatSearchResultReceiver()
            if (r1 == 0) goto L3f
        L25:
            r1 = 2130772025(0x7f010039, float:1.7147157E38)
            r2 = 2130772026(0x7f01003a, float:1.7147159E38)
            r4.overridePendingTransition(r1, r2)
            int r4 = com.marrow.kt.base.BaseDaggerActivity.MediaBrowserCompatSearchResultReceiver
            int r4 = r4 + 43
            int r1 = r4 % 128
            com.marrow.kt.base.BaseDaggerActivity.MediaBrowserCompatCustomActionResultReceiver = r1
            int r4 = r4 % r0
            if (r4 != 0) goto L3a
            return
        L3a:
            r4 = 0
            r4.hashCode()
            throw r4
        L3f:
            r4.overridePendingTransition(r2, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.kt.base.BaseDaggerActivity.finish():void");
    }

    @Override // com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 21;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        getMPresenter().AudioAttributesImplApi21Parcelizer();
        int i4 = MediaBrowserCompatSearchResultReceiver + 51;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, android.app.Activity
    public void onStop() throws NoSuchMethodException {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 17;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        getMPresenter().MediaBrowserCompatSearchResultReceiver();
        super.onStop();
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 53;
        MediaBrowserCompatSearchResultReceiver = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.marrow.ui.activities.base.BaseActivity
    public final void write(BroadcastReceiver p0, IntentFilter p1) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 99;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        getProvider.getInstance(this).registerReceiver(p0, p1);
        int i4 = MediaBrowserCompatSearchResultReceiver + 43;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.marrow.ui.activities.base.BaseActivity
    public final void IconCompatParcelizer(BroadcastReceiver p0) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 11;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        if (i2 % 2 == 0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            getProvider.getInstance(this).IconCompatParcelizer(p0);
            int i3 = 47 / 0;
        } else {
            toMagicModuleMetaRepoModel.write(p0, "");
            getProvider.getInstance(this).IconCompatParcelizer(p0);
        }
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 55;
        MediaBrowserCompatSearchResultReceiver = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.marrow.ui.activities.base.BaseActivity, kotlin.getNextEventTime
    public final void AudioAttributesCompatParcelizer(Intent p0) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 3;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        if (i2 % 2 != 0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            getProvider.getInstance(this).AudioAttributesCompatParcelizer(p0);
        } else {
            toMagicModuleMetaRepoModel.write(p0, "");
            getProvider.getInstance(this).AudioAttributesCompatParcelizer(p0);
            int i3 = 73 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 520
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.kt.base.BaseDaggerActivity.onPause():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 438
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.kt.base.BaseDaggerActivity.onResume():void");
    }

    @Override // com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, android.app.Activity
    public void onDestroy() throws NoSuchMethodException {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 59;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        if (i2 % 2 == 0) {
            getMPresenter().AudioAttributesImplApi26Parcelizer();
            super.onDestroy();
            int i3 = MediaBrowserCompatSearchResultReceiver + 55;
            MediaBrowserCompatCustomActionResultReceiver = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        getMPresenter().AudioAttributesImplApi26Parcelizer();
        super.onDestroy();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.marrow.ui.activities.base.BaseActivity
    public final boolean MediaBrowserCompatSearchResultReceiver() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 55;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        return getIntent().getBooleanExtra("key_override_transition", true);
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        BaseDaggerActivity baseDaggerActivity = (BaseDaggerActivity) objArr[0];
        hasSelectionOverride hasselectionoverride = (hasSelectionOverride) objArr[1];
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 83;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            toMagicModuleMetaRepoModel.write(hasselectionoverride, "");
            baseDaggerActivity.getSupportFragmentManager().IconCompatParcelizer().write(R.id.video_fragment_container, hasselectionoverride).RemoteActionCompatParcelizer();
            return null;
        }
        toMagicModuleMetaRepoModel.write(hasselectionoverride, "");
        baseDaggerActivity.getSupportFragmentManager().IconCompatParcelizer().write(R.id.video_fragment_container, hasselectionoverride).RemoteActionCompatParcelizer();
        obj.hashCode();
        throw null;
    }

    @Override // com.marrow.ui.activities.base.BaseActivity, kotlin.getExtendedPtDeChar
    public void write(ResponseError p0) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 69;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        if (i2 % 2 != 0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            int iIconCompatParcelizer = MediaSessionConnectorCustomActionProvider.IconCompatParcelizer();
            int iIconCompatParcelizer2 = MediaSessionConnectorCustomActionProvider.IconCompatParcelizer();
            int iIconCompatParcelizer3 = MediaSessionConnectorCustomActionProvider.IconCompatParcelizer();
            AudioAttributesCompatParcelizer((String) updateShuffleButton.IconCompatParcelizer(iIconCompatParcelizer2, -953939975, MediaSessionConnectorCustomActionProvider.IconCompatParcelizer(), iIconCompatParcelizer3, 953939977, new Object[]{p0, this}, iIconCompatParcelizer));
            int i3 = 38 / 0;
        } else {
            toMagicModuleMetaRepoModel.write(p0, "");
            int iIconCompatParcelizer4 = MediaSessionConnectorCustomActionProvider.IconCompatParcelizer();
            int iIconCompatParcelizer5 = MediaSessionConnectorCustomActionProvider.IconCompatParcelizer();
            int iIconCompatParcelizer6 = MediaSessionConnectorCustomActionProvider.IconCompatParcelizer();
            AudioAttributesCompatParcelizer((String) updateShuffleButton.IconCompatParcelizer(iIconCompatParcelizer5, -953939975, MediaSessionConnectorCustomActionProvider.IconCompatParcelizer(), iIconCompatParcelizer6, 953939977, new Object[]{p0, this}, iIconCompatParcelizer4));
        }
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 39;
        MediaBrowserCompatSearchResultReceiver = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.marrow.ui.activities.base.BaseActivity, kotlin.getChannel
    public final boolean aC_() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 119;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        boolean zWrite = getTrackName.write(this);
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 71;
        MediaBrowserCompatSearchResultReceiver = i4 % 128;
        int i5 = i4 % 2;
        return zWrite;
    }

    @Override // kotlin.getBasicChar
    public final void AudioAttributesImplBaseParcelizer() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 35;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        finish();
        int i4 = MediaBrowserCompatSearchResultReceiver + 111;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // kotlin.getExtendedPtDeChar
    public void AudioAttributesCompatParcelizer(String p0) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 65;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        if (i2 % 2 != 0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            handleMediaPlayPauseIfPendingOnHandler(p0);
        } else {
            toMagicModuleMetaRepoModel.write(p0, "");
            handleMediaPlayPauseIfPendingOnHandler(p0);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override // kotlin.getExtendedPtDeChar
    public void read(String p0) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 89;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        if (i2 % 2 == 0) {
            toMagicModuleMetaRepoModel.write(p0, "");
        } else {
            toMagicModuleMetaRepoModel.write(p0, "");
        }
        Toast.makeText(this, p0, 1).show();
        int i3 = MediaBrowserCompatCustomActionResultReceiver + 1;
        MediaBrowserCompatSearchResultReceiver = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // kotlin.getExtendedPtDeChar
    public void MediaBrowserCompatMediaItem() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 1;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this, Integer.valueOf(R.string.app_error_no_internet)};
        int iIconCompatParcelizer = PlanGroup$$ExternalSyntheticLambda0.IconCompatParcelizer();
        int iIconCompatParcelizer2 = PlanGroup$$ExternalSyntheticLambda0.IconCompatParcelizer();
        BaseActivity.RemoteActionCompatParcelizer(objArr, iIconCompatParcelizer, 1520881339, PlanGroup$$ExternalSyntheticLambda0.IconCompatParcelizer(), PlanGroup$$ExternalSyntheticLambda0.IconCompatParcelizer(), iIconCompatParcelizer2, -1520881339);
        int i4 = MediaBrowserCompatSearchResultReceiver + 65;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final boolean AudioAttributesImplApi21Parcelizer() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 119;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsDestroyed = isDestroyed();
        int i4 = MediaBrowserCompatSearchResultReceiver + 35;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        int i5 = i4 % 2;
        return zIsDestroyed;
    }

    @Override // kotlin.getNextEventTime
    public final void RemoteActionCompatParcelizer(String p0, String p1) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 37;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        isSpecialNorthAmericanChar.Companion companion = isSpecialNorthAmericanChar.INSTANCE;
        AudioAttributesCompatParcelizer(isSpecialNorthAmericanChar.Companion.RemoteActionCompatParcelizer(p0, p1));
        int i4 = MediaBrowserCompatSearchResultReceiver + 105;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 27 / 0;
        }
    }

    public final void MediaDescriptionCompat() {
        int i = 2 % 2;
        Fragment fragmentFindFragmentById = getSupportFragmentManager().findFragmentById(R.id.video_notes_container);
        if (fragmentFindFragmentById != null) {
            int i2 = MediaBrowserCompatSearchResultReceiver + 55;
            MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
            int i3 = i2 % 2;
            getSupportFragmentManager().IconCompatParcelizer().read(fragmentFindFragmentById).write();
            int i4 = MediaBrowserCompatCustomActionResultReceiver + 91;
            MediaBrowserCompatSearchResultReceiver = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 5 % 5;
            }
        }
    }

    @Override // com.marrow.ui.activities.base.BaseActivity, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onSaveInstanceState(Bundle p0) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 11;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        if (i2 % 2 != 0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            BaseUrl.IconCompatParcelizer(getMPresenter().AudioAttributesImplBaseParcelizer(), p0);
            super.onSaveInstanceState(p0);
        } else {
            toMagicModuleMetaRepoModel.write(p0, "");
            BaseUrl.IconCompatParcelizer(getMPresenter().AudioAttributesImplBaseParcelizer(), p0);
            super.onSaveInstanceState(p0);
            int i3 = 78 / 0;
        }
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(Bundle p0) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 111;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        if (i2 % 2 == 0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            super.onRestoreInstanceState(p0);
            getMPresenter().write(BaseUrl.write(p0));
            throw null;
        }
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onRestoreInstanceState(p0);
        getMPresenter().write(BaseUrl.write(p0));
        int i3 = MediaBrowserCompatCustomActionResultReceiver + 119;
        MediaBrowserCompatSearchResultReceiver = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.marrow.ui.activities.base.BaseActivity, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, android.app.Activity
    public void onActivityResult(int p0, int p1, Intent p2) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 67;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        if (i2 % 2 == 0) {
            getMPresenter();
            if (p2 != null) {
                BaseUrl.write(p2.getExtras());
                int i3 = MediaBrowserCompatCustomActionResultReceiver + 113;
                MediaBrowserCompatSearchResultReceiver = i3 % 128;
                int i4 = i3 % 2;
            }
            super.onActivityResult(p0, p1, p2);
            return;
        }
        getMPresenter();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String AudioAttributesCompatParcelizer(Object... objArr) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 125;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(objArr, "");
        String string = getString(R.string.watch_next_video, Arrays.copyOf(objArr, objArr.length));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        int i4 = MediaBrowserCompatSearchResultReceiver + 13;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        if (i4 % 2 == 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void IconCompatParcelizer(String p0, String p1) {
        int i = 2 % 2;
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        ResolvableApiException.Companion iconCompatParcelizer = ResolvableApiException.INSTANCE;
        startActivityForResult(ResolvableApiException.Companion.read(this, new canceledPendingResult(p0, p1, null, 4, null)), 901);
        int i2 = MediaBrowserCompatSearchResultReceiver + 95;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void RemoteActionCompatParcelizer(String p0) {
        int i = 2 % 2;
        toMagicModuleMetaRepoModel.write(p0, "");
        try {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(p0)));
            int i2 = MediaBrowserCompatSearchResultReceiver + 71;
            MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
            int i3 = i2 % 2;
        } catch (Exception unused) {
            IconCompatParcelizer(p0, "");
        }
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        getCreatedOnDateMs getcreatedondatems = (getCreatedOnDateMs) objArr[0];
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 19;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        getcreatedondatems.invoke();
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        int i4 = MediaBrowserCompatSearchResultReceiver + 91;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        if (i4 % 2 == 0) {
            return getshowpopup;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void IconCompatParcelizer(View[] p0, final getCreatedOnDateMs<getShowPopup> p1) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 81;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        if (i2 % 2 != 0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
        } else {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
        }
        int length = p0.length;
        int i3 = MediaBrowserCompatCustomActionResultReceiver + 85;
        MediaBrowserCompatSearchResultReceiver = i3 % 128;
        int i4 = i3 % 2;
        for (int i5 = 0; i5 < 2; i5++) {
            RemoteActionCompatParcelizer(p0[i5], (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.r8lambdanIdAVhuvCCf7tWOpNRJA108HsE
                @Override // kotlin.getCreatedOnDateMs
                public final Object invoke() {
                    return BaseDaggerActivity.RemoteActionCompatParcelizer(p1);
                }
            });
        }
    }

    public static void RemoteActionCompatParcelizer(View view, final getCreatedOnDateMs<getShowPopup> getcreatedondatems) {
        int i = 2 % 2;
        toMagicModuleMetaRepoModel.write(view, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        view.setOnClickListener(new View.OnClickListener() { // from class: o.lambdasend0comgoogleandroidexoplayer2sourcertspRtspMessageChannelSender
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BaseDaggerActivity.read(getcreatedondatems);
            }
        });
        int i2 = MediaBrowserCompatSearchResultReceiver + 125;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        getCreatedOnDateMs getcreatedondatems = (getCreatedOnDateMs) objArr[0];
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 65;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        getcreatedondatems.invoke();
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 117;
        MediaBrowserCompatSearchResultReceiver = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x0c16 A[Catch: all -> 0x0442, TryCatch #0 {all -> 0x0442, blocks: (B:214:0x13b2, B:216:0x13b8, B:217:0x13e7, B:250:0x183e, B:252:0x1844, B:253:0x186c, B:231:0x15f4, B:233:0x1617, B:234:0x1668, B:175:0x0e92, B:177:0x0e98, B:178:0x0eba, B:127:0x0c10, B:129:0x0c16, B:130:0x0c45, B:19:0x0152, B:21:0x0158, B:22:0x0181, B:24:0x03b1, B:26:0x03e2, B:27:0x043c, B:135:0x0cdf, B:139:0x0cef, B:143:0x0cfb, B:144:0x0d01, B:145:0x0d02, B:161:0x0dd5, B:163:0x0ddb, B:164:0x0ddc, B:166:0x0dde, B:168:0x0de5, B:169:0x0de6), top: B:275:0x0152, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0f50  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0f9e  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x1057  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x1391  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x1477  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x14b7  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x1509  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x181b  */
    /* JADX WARN: Removed duplicated region for block: B:315:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0131  */
    @Override // com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 6970
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.kt.base.BaseDaggerActivity.attachBaseContext(android.content.Context):void");
    }

    public static /* synthetic */ void read(getCreatedOnDateMs getcreatedondatems) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 41;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = setSelectedItemId.read();
            int i4 = setSelectedItemId.read();
            int i5 = setSelectedItemId.read();
            read(setSelectedItemId.read(), -1536125479, i3, 1536125482, i5, i4, new Object[]{getcreatedondatems});
            throw null;
        }
        int i6 = setSelectedItemId.read();
        int i7 = setSelectedItemId.read();
        int i8 = setSelectedItemId.read();
        read(setSelectedItemId.read(), -1536125479, i6, 1536125482, i8, i7, new Object[]{getcreatedondatems});
        int i9 = MediaBrowserCompatCustomActionResultReceiver + 99;
        MediaBrowserCompatSearchResultReceiver = i9 % 128;
        int i10 = i9 % 2;
    }

    public static /* synthetic */ getShowPopup RemoteActionCompatParcelizer(getCreatedOnDateMs getcreatedondatems) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 7;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = setSelectedItemId.read();
            int i4 = setSelectedItemId.read();
            int i5 = setSelectedItemId.read();
            return (getShowPopup) read(setSelectedItemId.read(), -335101569, i3, 335101569, i5, i4, new Object[]{getcreatedondatems});
        }
        int i6 = setSelectedItemId.read();
        int i7 = setSelectedItemId.read();
        int i8 = setSelectedItemId.read();
        throw null;
    }

    private static final getShowPopup write(getCreatedOnDateMs getcreatedondatems) {
        int i = setSelectedItemId.read();
        int i2 = setSelectedItemId.read();
        int i3 = setSelectedItemId.read();
        return (getShowPopup) read(setSelectedItemId.read(), -335101569, i, 335101569, i3, i2, new Object[]{getcreatedondatems});
    }

    private static final void IconCompatParcelizer(getCreatedOnDateMs getcreatedondatems) {
        int i = setSelectedItemId.read();
        int i2 = setSelectedItemId.read();
        int i3 = setSelectedItemId.read();
        read(setSelectedItemId.read(), -1536125479, i, 1536125482, i3, i2, new Object[]{getcreatedondatems});
    }

    @Override // com.marrow.ui.activities.base.BaseActivity
    public final handlePreambleAddressCode AudioAttributesImplApi26Parcelizer() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 65;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.marrow.ui.activities.base.BaseActivity
    public handlePreambleAddressCode[] MediaBrowserCompatCustomActionResultReceiver() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver;
        int i3 = i2 + 7;
        MediaBrowserCompatSearchResultReceiver = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = i2 + 23;
        MediaBrowserCompatSearchResultReceiver = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public final String MediaBrowserCompatItemReceiver() {
        int i = setSelectedItemId.read();
        int i2 = setSelectedItemId.read();
        int i3 = setSelectedItemId.read();
        return (String) read(setSelectedItemId.read(), -1639108719, i, 1639108720, i3, i2, new Object[]{this});
    }

    @Override // com.marrow.ui.activities.base.BaseActivity
    public boolean RatingCompat() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver;
        int i3 = i2 + 19;
        MediaBrowserCompatSearchResultReceiver = i3 % 128;
        boolean z = i3 % 2 == 0;
        int i4 = i2 + 89;
        MediaBrowserCompatSearchResultReceiver = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    @Override // com.marrow.ui.activities.base.BaseActivity, android.view.View.OnClickListener
    public void onClick(View p0) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 21;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(p0, "");
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 107;
        MediaBrowserCompatSearchResultReceiver = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.marrow.ui.activities.base.BaseActivity
    public final void RemoteActionCompatParcelizer(hasSelectionOverride hasselectionoverride) {
        int i = setSelectedItemId.read();
        int i2 = setSelectedItemId.read();
        int i3 = setSelectedItemId.read();
        read(setSelectedItemId.read(), -1879510680, i, 1879510682, i3, i2, new Object[]{this, hasselectionoverride});
    }
}
