package kotlin;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.internal.location.zze;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateSelector;
import com.google.android.material.datepicker.DayViewDecorator;
import com.google.android.material.datepicker.Month;
import com.google.android.material.internal.CheckableImageButton;
import com.marrow.TrainingApplication;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.calculateNextSearchBytePosition;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes5.dex */
public final class setMp3ExtractorFlags<S> extends argCount {
    private static int $10 = 0;
    private static int $11 = 1;
    private static Object AudioAttributesCompatParcelizer;
    private static Object IconCompatParcelizer;
    private static Object RemoteActionCompatParcelizer;
    private static int onRewind;
    private static int onSetPlaybackSpeed;
    private Button AudioAttributesImplApi21Parcelizer;
    private CalendarConstraints AudioAttributesImplApi26Parcelizer;
    private DateSelector<S> AudioAttributesImplBaseParcelizer;
    private boolean MediaBrowserCompatCustomActionResultReceiver;
    private DayViewDecorator MediaBrowserCompatItemReceiver;
    private TextView MediaBrowserCompatMediaItem;
    private CheckableImageButton MediaBrowserCompatSearchResultReceiver;
    private int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private TextView MediaDescriptionCompat;
    private boolean MediaMetadataCompat;
    private CharSequence RatingCompat;
    private CharSequence handleMediaPlayPauseIfPendingOnHandler;
    private int onAddQueueItem;
    private CharSequence onCommand;
    private int onCustomAction;
    private int onPause;
    private CharSequence onPlayFromSearch;
    private int onPlayFromUri;
    private CharSequence onPrepare;
    private DefaultExtractorsFactoryExternalSyntheticLambda0<S> onPrepareFromMediaId;
    private int onPrepareFromSearch;
    private CharSequence onPrepareFromUri;
    private int onRemoveQueueItemAt;
    private CharSequence onSeekTo;
    private frameSizeBytesByTypeNb read;
    private setMatroskaExtractorFlags<S> write;
    private static final byte[] $$d = {77, 21, 89, -51, 61, -61, -2, -19, 34, -27, -19, -7, 4, -7, 3, 19, -41, 5, 7, 27, -48, -1, -2, 38, -48, -3, -4, 5, -2, -21, 7, -17, 9, -15, -9, 40, -24, -17, 9, -10, -2, -17, 1, 5, -15, 11, -23, -12, -6, -9, 11, 32, -38, -21, 7, -10, -3, 39, -48, -2, -7, 11, -23, 32, -21, -21, 11, -6, -11, -1, -21, 17, -17};
    private static final int $$e = 222;
    private static final byte[] $$a = {10, -96, 35, -27, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$b = 22;
    private static int onSetRating = 0;
    private static int onSetCaptioningEnabled = 1;
    private static int onRemoveQueueItem = 0;
    private final LinkedHashSet<setMp4ExtractorFlags<? super S>> onPlayFromMediaId = new LinkedHashSet<>();
    private final LinkedHashSet<View.OnClickListener> onPlay = new LinkedHashSet<>();
    private final LinkedHashSet<DialogInterface.OnCancelListener> onMediaButtonEvent = new LinkedHashSet<>();
    private final LinkedHashSet<DialogInterface.OnDismissListener> onFastForward = new LinkedHashSet<>();

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(short r7, byte r8, int r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 + 4
            int r7 = r7 * 10
            int r7 = r7 + 34
            byte[] r0 = kotlin.setMp3ExtractorFlags.$$a
            int r9 = r9 * 12
            int r9 = r9 + 65
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r7
            r9 = r8
            r4 = r2
            goto L2c
        L15:
            r3 = r2
        L16:
            int r8 = r8 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r7) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L27:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r6
        L2c:
            int r3 = -r3
            int r8 = r8 + r3
            int r8 = r8 + (-1)
            r3 = r4
            r6 = r9
            r9 = r8
            r8 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setMp3ExtractorFlags.a(short, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(byte r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = kotlin.setMp3ExtractorFlags.$$d
            int r8 = 119 - r8
            int r1 = 39 - r6
            int r7 = r7 * 2
            int r7 = 46 - r7
            byte[] r1 = new byte[r1]
            int r6 = 38 - r6
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r6
            r8 = r7
            r4 = r2
            goto L2c
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r7 = -r7
            int r3 = r3 + r7
            int r7 = r8 + 1
            int r8 = r3 + (-4)
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setMp3ExtractorFlags.c(byte, short, int, java.lang.Object[]):void");
    }

    public static /* synthetic */ Object write(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~(i5 | i6);
        int i8 = ~(i6 | i2);
        int i9 = i7 | i8;
        int i10 = ~i5;
        int i11 = ~i6;
        int i12 = (~(i10 | i2)) | (~(i10 | i11)) | (~(i11 | i2));
        int i13 = ~i2;
        int i14 = i12 | (~(i13 | i5 | i6));
        int i15 = (~(i13 | i11)) | i5 | i8;
        int i16 = i5 + i6 + i + (1962400304 * i4) + (1167700406 * i3);
        int i17 = i16 * i16;
        int i18 = ((i5 * (-1019457937)) - 559939584) + ((-1019457937) * i6) + (2001489518 * i9) + (i14 * (-2001489518)) + ((-2001489518) * i15) + (1274019840 * i) + ((-1660944384) * i4) + ((-325058560) * i3) + (867827712 * i17);
        int i19 = ((i5 * (-1629562239)) - 1134582380) + (i6 * (-1629562239)) + (i9 * (-910)) + (i14 * 910) + (i15 * 910) + (i * (-1629561329)) + (i4 * (-1621399344)) + (i3 * (-873382486)) + (i17 * 1407582208);
        int i20 = i18 + (i19 * i19 * (-1895432192));
        if (i20 == 1) {
            return IconCompatParcelizer(objArr);
        }
        if (i20 == 2) {
            return RemoteActionCompatParcelizer(objArr);
        }
        if (i20 != 3) {
            if (i20 == 4) {
                return read(objArr);
            }
            if (i20 == 5) {
                return write(objArr);
            }
            Context context = (Context) objArr[0];
            int i21 = 2 % 2;
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{R.attr.state_checked}, getDefaultViewModelCreationExtras.write(context, calculateNextSearchBytePosition.MediaBrowserCompatItemReceiver.material_ic_calendar_black_24dp));
            stateListDrawable.addState(new int[0], getDefaultViewModelCreationExtras.write(context, calculateNextSearchBytePosition.MediaBrowserCompatItemReceiver.material_ic_edit_black_24dp));
            int i22 = onSetCaptioningEnabled + 43;
            onSetRating = i22 % 128;
            int i23 = i22 % 2;
            return stateListDrawable;
        }
        setMp3ExtractorFlags setmp3extractorflags = (setMp3ExtractorFlags) objArr[0];
        int i24 = 2 % 2;
        int i25 = onSetRating + 53;
        onSetCaptioningEnabled = i25 % 128;
        int i26 = i25 % 2;
        int iAudioAttributesCompatParcelizer = zze.AudioAttributesCompatParcelizer();
        DateSelector dateSelector = (DateSelector) write(zze.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer, zze.AudioAttributesCompatParcelizer(), zze.AudioAttributesCompatParcelizer(), 158135142, new Object[]{setmp3extractorflags}, -158135137);
        setmp3extractorflags.requireContext();
        String strIconCompatParcelizer = dateSelector.IconCompatParcelizer();
        int i27 = onSetRating + 21;
        onSetCaptioningEnabled = i27 % 128;
        int i28 = i27 % 2;
        return strIconCompatParcelizer;
    }

    static /* synthetic */ LinkedHashSet AudioAttributesCompatParcelizer(setMp3ExtractorFlags setmp3extractorflags) {
        int i = 2 % 2;
        int i2 = onSetRating + 21;
        int i3 = i2 % 128;
        onSetCaptioningEnabled = i3;
        int i4 = i2 % 2;
        LinkedHashSet<View.OnClickListener> linkedHashSet = setmp3extractorflags.onPlay;
        int i5 = i3 + 73;
        onSetRating = i5 % 128;
        int i6 = i5 % 2;
        return linkedHashSet;
    }

    static /* synthetic */ LinkedHashSet RemoteActionCompatParcelizer(setMp3ExtractorFlags setmp3extractorflags) {
        int i = 2 % 2;
        int i2 = onSetRating;
        int i3 = i2 + 115;
        onSetCaptioningEnabled = i3 % 128;
        int i4 = i3 % 2;
        LinkedHashSet<setMp4ExtractorFlags<? super S>> linkedHashSet = setmp3extractorflags.onPlayFromMediaId;
        if (i4 == 0) {
            int i5 = 62 / 0;
        }
        int i6 = i2 + 59;
        onSetCaptioningEnabled = i6 % 128;
        int i7 = i6 % 2;
        return linkedHashSet;
    }

    static /* synthetic */ Button read(setMp3ExtractorFlags setmp3extractorflags) {
        int i = 2 % 2;
        int i2 = onSetRating;
        int i3 = i2 + 57;
        onSetCaptioningEnabled = i3 % 128;
        int i4 = i3 % 2;
        Button button = setmp3extractorflags.AudioAttributesImplApi21Parcelizer;
        int i5 = i2 + 75;
        onSetCaptioningEnabled = i5 % 128;
        int i6 = i5 % 2;
        return button;
    }

    static /* synthetic */ DateSelector write(setMp3ExtractorFlags setmp3extractorflags) {
        int i = 2 % 2;
        int i2 = onSetRating + 101;
        onSetCaptioningEnabled = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {setmp3extractorflags};
        int iAudioAttributesCompatParcelizer = zze.AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer2 = zze.AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer3 = zze.AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer4 = zze.AudioAttributesCompatParcelizer();
        if (i3 == 0) {
            throw null;
        }
        DateSelector dateSelector = (DateSelector) write(iAudioAttributesCompatParcelizer2, iAudioAttributesCompatParcelizer, iAudioAttributesCompatParcelizer4, iAudioAttributesCompatParcelizer3, 158135142, objArr, -158135137);
        int i4 = onSetCaptioningEnabled + 71;
        onSetRating = i4 % 128;
        int i5 = i4 % 2;
        return dateSelector;
    }

    static {
        onSetPlaybackSpeed = 1;
        IconCompatParcelizer();
        IconCompatParcelizer = "CONFIRM_BUTTON_TAG";
        AudioAttributesCompatParcelizer = "CANCEL_BUTTON_TAG";
        RemoteActionCompatParcelizer = "TOGGLE_BUTTON_TAG";
        int i = onRemoveQueueItem + 17;
        onSetPlaybackSpeed = i % 128;
        int i2 = i % 2;
    }

    private static void b(int i, boolean z, char[] cArr, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        clearDownloadManagerHelpers cleardownloadmanagerhelpers = new clearDownloadManagerHelpers();
        char[] cArr2 = new char[i2];
        cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer = 0;
        while (cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer < i2) {
            cleardownloadmanagerhelpers.RemoteActionCompatParcelizer = cArr[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer];
            cArr2[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer] = (char) (i3 + cleardownloadmanagerhelpers.RemoteActionCompatParcelizer);
            int i5 = cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i5]), Integer.valueOf(onRewind)};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-579447922);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), ExpandableListView.getPackedPositionGroup(0L) + 23704, 32 - TextUtils.indexOf("", "", 0), -1556113637, false, CmcdHeadersFactory.OBJECT_TYPE_AUDIO_ONLY, new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i5] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-322440307);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (Color.alpha(0) + 44862), Drawable.resolveOpacity(0, 0) + 18944, TextUtils.indexOf((CharSequence) "", '0', 0) + 29, -1836173544, false, "c", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i > 0) {
            cleardownloadmanagerhelpers.write = i;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - cleardownloadmanagerhelpers.write, cleardownloadmanagerhelpers.write);
            System.arraycopy(cArr3, cleardownloadmanagerhelpers.write, cArr2, 0, i2 - cleardownloadmanagerhelpers.write);
            int i6 = $11 + 25;
            $10 = i6 % 128;
            int i7 = i6 % 2;
        }
        if (z) {
            char[] cArr4 = new char[i2];
            cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer = 0;
            while (cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer < i2) {
                cArr4[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer] = cArr2[(i2 - cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer) - 1];
                Object[] objArr4 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-322440307);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (44863 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 18944 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 28 - Color.green(0), -1836173544, false, "c", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                int i8 = $11 + 11;
                $10 = i8 % 128;
                int i9 = i8 % 2;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    public final String AudioAttributesCompatParcelizer() {
        int i = 2 % 2;
        int i2 = onSetCaptioningEnabled + 75;
        onSetRating = i2 % 128;
        int i3 = i2 % 2;
        int iAudioAttributesCompatParcelizer = zze.AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer2 = zze.AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer3 = zze.AudioAttributesCompatParcelizer();
        DateSelector dateSelector = (DateSelector) write(iAudioAttributesCompatParcelizer2, iAudioAttributesCompatParcelizer, zze.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer3, 158135142, new Object[]{this}, -158135137);
        getContext();
        String strAudioAttributesImplApi21Parcelizer = dateSelector.AudioAttributesImplApi21Parcelizer();
        int i4 = onSetRating + 67;
        onSetCaptioningEnabled = i4 % 128;
        if (i4 % 2 != 0) {
            return strAudioAttributesImplApi21Parcelizer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // kotlin.argCount, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        Month monthWrite;
        int i = 2 % 2;
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.onPause);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.AudioAttributesImplBaseParcelizer);
        CalendarConstraints.IconCompatParcelizer iconCompatParcelizer = new CalendarConstraints.IconCompatParcelizer(this.AudioAttributesImplApi26Parcelizer);
        setMatroskaExtractorFlags<S> setmatroskaextractorflags = this.write;
        if (setmatroskaextractorflags == null) {
            int i2 = onSetRating + 89;
            onSetCaptioningEnabled = i2 % 128;
            int i3 = i2 % 2;
            monthWrite = null;
        } else {
            monthWrite = setmatroskaextractorflags.write();
        }
        if (monthWrite != null) {
            int i4 = onSetCaptioningEnabled + 121;
            onSetRating = i4 % 128;
            int i5 = i4 % 2;
            iconCompatParcelizer.RemoteActionCompatParcelizer(monthWrite.read);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", iconCompatParcelizer.write());
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.MediaBrowserCompatItemReceiver);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.onRemoveQueueItemAt);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.onSeekTo);
        bundle.putInt("INPUT_MODE_KEY", this.onCustomAction);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.onPrepareFromSearch);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.onPlayFromSearch);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.onPlayFromUri);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.onPrepare);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.onAddQueueItem);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.handleMediaPlayPauseIfPendingOnHandler);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.onCommand);
    }

    @Override // kotlin.argCount, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) throws Throwable {
        Object[] objArr;
        char c;
        Bundle arguments;
        int i = 2 % 2;
        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2042479539);
        if (objRemoteActionCompatParcelizer == null) {
            char jumpTapTimeout = (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 13183);
            int iMyPid = (Process.myPid() >> 22) + 1649;
            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 27;
            byte b = $$a[17];
            Object[] objArr2 = new Object[1];
            a(b, r2[53], b, objArr2);
            objRemoteActionCompatParcelizer = startForeground.read(jumpTapTimeout, iMyPid, iLastIndexOf, -133433128, false, (String) objArr2[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer).getLong(null) != -1) {
            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer2 == null) {
                char cResolveSizeAndState = (char) (13183 - View.resolveSizeAndState(0, 0, 0));
                int keyRepeatTimeout = 1649 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                int offsetBefore = 26 - TextUtils.getOffsetBefore("", 0);
                byte b2 = $$a[5];
                Object[] objArr3 = new Object[1];
                a(b2, r2[65], b2, objArr3);
                objRemoteActionCompatParcelizer2 = startForeground.read(cResolveSizeAndState, keyRepeatTimeout, offsetBefore, -1033747278, false, (String) objArr3[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer2).get(null);
            c = 3;
        } else {
            Object[] objArr4 = new Object[1];
            b(8 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), true, new char[]{'\f', 65535, '\n', 65484, 65535, 20, 65535, '\b', 11, 3, 18, 17, 23, 65521, 65484, 5}, 16 - TextUtils.indexOf("", "", 0, 0), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 157, objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            b(16 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), true, new char[]{65535, 65534, '\t', 65501, 2, '\r', 65531, 65506, 19, 14, 3, 14, '\b', 65535, 65534, 3}, 16 - (ViewConfiguration.getPressedStateDuration() >> 16), 161 - TextUtils.indexOf((CharSequence) "", '0'), objArr5);
            try {
                Object[] objArr6 = {Integer.valueOf(((Integer) cls.getMethod((String) objArr5[0], Object.class).invoke(null, this)).intValue()), 0, 1376623134};
                byte[] bArr = $$d;
                Object[] objArr7 = new Object[1];
                c((byte) (bArr[42] - 1), bArr[1], (byte) ($$e & 40), objArr7);
                Class<?> cls2 = Class.forName((String) objArr7[0]);
                byte b3 = bArr[8];
                byte b4 = (byte) (-bArr[6]);
                Object[] objArr8 = new Object[1];
                c(b3, b4, (byte) (b4 - 2), objArr8);
                objArr = (Object[]) cls2.getMethod((String) objArr8[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr6);
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer3 == null) {
                    char maxKeyCode = (char) ((KeyEvent.getMaxKeyCode() >> 16) + 13183);
                    int i2 = (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 1649;
                    int trimmedLength = 26 - TextUtils.getTrimmedLength("");
                    byte b5 = $$a[5];
                    Object[] objArr9 = new Object[1];
                    a(b5, r11[65], b5, objArr9);
                    objRemoteActionCompatParcelizer3 = startForeground.read(maxKeyCode, i2, trimmedLength, -1033747278, false, (String) objArr9[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer3).set(null, objArr);
                try {
                    Object[] objArr10 = new Object[1];
                    b(TextUtils.indexOf((CharSequence) "", '0', 0) + 19, true, new char[]{65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534, '\b', 0, '\f', '\t'}, 22 - Color.argb(0, 0, 0, 0), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 158, objArr10);
                    Class<?> cls3 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    b(3 - KeyEvent.normalizeMetaState(0), true, new char[]{65530, 5, 65534, 65534, 6, 2, '\r', 5, 65530, 65534, 65515, 65533, 65534, '\f', '\t'}, 14 - ((byte) KeyEvent.getModifierMetaStateMask()), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 164, objArr11);
                    long jLongValue = ((Long) cls3.getDeclaredMethod((String) objArr11[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        char cMyPid = (char) ((Process.myPid() >> 22) + 13183);
                        int i3 = 1648 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                        int i4 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 25;
                        byte b6 = $$a[5];
                        byte b7 = b6;
                        Object[] objArr12 = new Object[1];
                        a(b7, (byte) (b7 | TarConstants.LF_GNUTYPE_LONGLINK), b6, objArr12);
                        objRemoteActionCompatParcelizer4 = startForeground.read(cMyPid, i3, i4, 54351865, false, (String) objArr12[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer4).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer5 == null) {
                        char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 13184);
                        int i5 = 1649 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                        int trimmedLength2 = TextUtils.getTrimmedLength("") + 26;
                        byte b8 = $$a[17];
                        Object[] objArr13 = new Object[1];
                        a(b8, r6[53], b8, objArr13);
                        objRemoteActionCompatParcelizer5 = startForeground.read(cIndexOf, i5, trimmedLength2, -133433128, false, (String) objArr13[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer5).set(null, lValueOf2);
                    c = 3;
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i6 = ((int[]) objArr[c])[0];
        int i7 = ((int[]) objArr[2])[0];
        if (i7 != i6) {
            long j = -1;
            long j2 = 0;
            long j3 = (((long) (i6 ^ i7)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) 2) << 32) | (j2 - ((j2 >> 63) << 32));
            try {
                Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer6 == null) {
                    objRemoteActionCompatParcelizer6 = startForeground.read((char) (4535 - ExpandableListView.getPackedPositionType(0L)), View.combineMeasuredStates(0, 0) + 6054, View.MeasureSpec.getMode(0) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer6).invoke(null, null);
                try {
                    Object[] objArr14 = {525737223, Long.valueOf(j3), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
                    Class cls4 = (Class) startForeground.IconCompatParcelizer((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), (KeyEvent.getMaxKeyCode() >> 16) + 6030, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 24);
                    byte[] bArr2 = $$d;
                    byte b9 = bArr2[45];
                    byte b10 = (byte) (bArr2[42] - 1);
                    Object[] objArr15 = new Object[1];
                    c(b9, b10, (byte) (b10 | 37), objArr15);
                    cls4.getMethod((String) objArr15[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke, objArr14);
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        super.onCreate(bundle);
        if (bundle == null) {
            arguments = getArguments();
            int i8 = onSetCaptioningEnabled + 63;
            onSetRating = i8 % 128;
            int i9 = i8 % 2;
        } else {
            arguments = bundle;
        }
        this.onPause = arguments.getInt("OVERRIDE_THEME_RES_ID");
        this.AudioAttributesImplBaseParcelizer = (DateSelector) arguments.getParcelable("DATE_SELECTOR_KEY");
        this.AudioAttributesImplApi26Parcelizer = (CalendarConstraints) arguments.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.MediaBrowserCompatItemReceiver = (DayViewDecorator) arguments.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.onRemoveQueueItemAt = arguments.getInt("TITLE_TEXT_RES_ID_KEY");
        this.onSeekTo = arguments.getCharSequence("TITLE_TEXT_KEY");
        this.onCustomAction = arguments.getInt("INPUT_MODE_KEY");
        this.onPrepareFromSearch = arguments.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.onPlayFromSearch = arguments.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.onPlayFromUri = arguments.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.onPrepare = arguments.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.onAddQueueItem = arguments.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.handleMediaPlayPauseIfPendingOnHandler = arguments.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = arguments.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.onCommand = arguments.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence text = this.onSeekTo;
        if (text == null) {
            int i10 = onSetCaptioningEnabled + 49;
            onSetRating = i10 % 128;
            if (i10 % 2 != 0) {
                text = requireContext().getResources().getText(this.onRemoveQueueItemAt);
                int i11 = 57 / 0;
            } else {
                text = requireContext().getResources().getText(this.onRemoveQueueItemAt);
            }
        }
        this.RatingCompat = text;
        this.onPrepareFromUri = read(text);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        r3 = com.google.android.gms.internal.location.zze.AudioAttributesCompatParcelizer();
        r2 = com.google.android.gms.internal.location.zze.AudioAttributesCompatParcelizer();
        r5 = com.google.android.gms.internal.location.zze.AudioAttributesCompatParcelizer();
        r9 = ((com.google.android.material.datepicker.DateSelector) write(r2, r3, com.google.android.gms.internal.location.zze.AudioAttributesCompatParcelizer(), r5, 158135142, new java.lang.Object[]{r9}, -158135137)).write();
        r1 = kotlin.setMp3ExtractorFlags.onSetRating + 109;
        kotlin.setMp3ExtractorFlags.onSetCaptioningEnabled = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0049, code lost:
    
        if ((r1 % 2) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004b, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r1 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r1 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int AudioAttributesImplBaseParcelizer() {
        /*
            r9 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = kotlin.setMp3ExtractorFlags.onSetRating
            int r1 = r1 + 37
            int r2 = r1 % 128
            kotlin.setMp3ExtractorFlags.onSetCaptioningEnabled = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L17
            int r1 = r9.onPause
            r2 = 54
            int r2 = r2 / 0
            if (r1 == 0) goto L1c
            goto L1b
        L17:
            int r1 = r9.onPause
            if (r1 == 0) goto L1c
        L1b:
            return r1
        L1c:
            java.lang.Object[] r7 = new java.lang.Object[]{r9}
            int r3 = com.google.android.gms.internal.location.zze.AudioAttributesCompatParcelizer()
            int r2 = com.google.android.gms.internal.location.zze.AudioAttributesCompatParcelizer()
            int r5 = com.google.android.gms.internal.location.zze.AudioAttributesCompatParcelizer()
            int r4 = com.google.android.gms.internal.location.zze.AudioAttributesCompatParcelizer()
            r6 = 158135142(0x96cf366, float:2.8521912E-33)
            r8 = -158135137(0xfffffffff6930c9f, float:-1.4912571E33)
            java.lang.Object r9 = write(r2, r3, r4, r5, r6, r7, r8)
            com.google.android.material.datepicker.DateSelector r9 = (com.google.android.material.datepicker.DateSelector) r9
            int r9 = r9.write()
            int r1 = kotlin.setMp3ExtractorFlags.onSetRating
            int r1 = r1 + 109
            int r2 = r1 % 128
            kotlin.setMp3ExtractorFlags.onSetCaptioningEnabled = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L4c
            return r9
        L4c:
            r9 = 0
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setMp3ExtractorFlags.AudioAttributesImplBaseParcelizer():int");
    }

    @Override // kotlin.argCount
    public final Dialog onCreateDialog(Bundle bundle) {
        int i = 2 % 2;
        Context contextRequireContext = requireContext();
        requireContext();
        Dialog dialog = new Dialog(contextRequireContext, AudioAttributesImplBaseParcelizer());
        Context context = dialog.getContext();
        this.MediaMetadataCompat = AudioAttributesCompatParcelizer(context);
        this.read = new frameSizeBytesByTypeNb(context, null, calculateNextSearchBytePosition.IconCompatParcelizer.materialCalendarStyle, calculateNextSearchBytePosition.MediaBrowserCompatMediaItem.Widget_MaterialComponents_MaterialCalendar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, calculateNextSearchBytePosition.MediaMetadataCompat.MaterialCalendar, calculateNextSearchBytePosition.IconCompatParcelizer.materialCalendarStyle, calculateNextSearchBytePosition.MediaBrowserCompatMediaItem.Widget_MaterialComponents_MaterialCalendar);
        int color = typedArrayObtainStyledAttributes.getColor(calculateNextSearchBytePosition.MediaMetadataCompat.MaterialCalendar_backgroundTint, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.read.RemoteActionCompatParcelizer(context);
        this.read.AudioAttributesImplApi21Parcelizer(ColorStateList.valueOf(color));
        this.read.handleMediaPlayPauseIfPendingOnHandler(InvalidTypeIdException.AudioAttributesImplBaseParcelizer(dialog.getWindow().getDecorView()));
        int i2 = onSetRating + 75;
        onSetCaptioningEnabled = i2 % 128;
        int i3 = i2 % 2;
        return dialog;
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        int i;
        setMp3ExtractorFlags setmp3extractorflags = (setMp3ExtractorFlags) objArr[0];
        LayoutInflater layoutInflater = (LayoutInflater) objArr[1];
        ViewGroup viewGroup = (ViewGroup) objArr[2];
        int i2 = 2 % 2;
        if (setmp3extractorflags.MediaMetadataCompat) {
            int i3 = onSetRating + 65;
            onSetCaptioningEnabled = i3 % 128;
            int i4 = i3 % 2;
            i = calculateNextSearchBytePosition.MediaBrowserCompatCustomActionResultReceiver.mtrl_picker_fullscreen;
        } else {
            i = calculateNextSearchBytePosition.MediaBrowserCompatCustomActionResultReceiver.mtrl_picker_dialog;
        }
        View viewInflate = layoutInflater.inflate(i, viewGroup);
        Context context = viewInflate.getContext();
        DayViewDecorator dayViewDecorator = setmp3extractorflags.MediaBrowserCompatItemReceiver;
        if (setmp3extractorflags.MediaMetadataCompat) {
            viewInflate.findViewById(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(write(context), -2));
        } else {
            viewInflate.findViewById(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(write(context), -1));
        }
        TextView textView = (TextView) viewInflate.findViewById(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.mtrl_picker_header_selection_text);
        setmp3extractorflags.MediaDescriptionCompat = textView;
        InvalidTypeIdException.AudioAttributesImplApi21Parcelizer(textView, 1);
        setmp3extractorflags.MediaBrowserCompatSearchResultReceiver = (CheckableImageButton) viewInflate.findViewById(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.mtrl_picker_header_toggle);
        setmp3extractorflags.MediaBrowserCompatMediaItem = (TextView) viewInflate.findViewById(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.mtrl_picker_title_text);
        setmp3extractorflags.read(context);
        setmp3extractorflags.AudioAttributesImplApi21Parcelizer = (Button) viewInflate.findViewById(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.confirm_button);
        int iAudioAttributesCompatParcelizer = zze.AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer2 = zze.AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer3 = zze.AudioAttributesCompatParcelizer();
        if (((DateSelector) write(iAudioAttributesCompatParcelizer2, iAudioAttributesCompatParcelizer, zze.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer3, 158135142, new Object[]{setmp3extractorflags}, -158135137)).MediaBrowserCompatItemReceiver()) {
            setmp3extractorflags.AudioAttributesImplApi21Parcelizer.setEnabled(true);
        } else {
            setmp3extractorflags.AudioAttributesImplApi21Parcelizer.setEnabled(false);
        }
        setmp3extractorflags.AudioAttributesImplApi21Parcelizer.setTag(IconCompatParcelizer);
        CharSequence charSequence = setmp3extractorflags.onPlayFromSearch;
        if (charSequence != null) {
            setmp3extractorflags.AudioAttributesImplApi21Parcelizer.setText(charSequence);
        } else {
            int i5 = setmp3extractorflags.onPrepareFromSearch;
            if (i5 != 0) {
                int i6 = onSetRating + 11;
                onSetCaptioningEnabled = i6 % 128;
                if (i6 % 2 == 0) {
                    setmp3extractorflags.AudioAttributesImplApi21Parcelizer.setText(i5);
                    int i7 = 31 / 0;
                } else {
                    setmp3extractorflags.AudioAttributesImplApi21Parcelizer.setText(i5);
                }
            }
        }
        CharSequence charSequence2 = setmp3extractorflags.onPrepare;
        if (charSequence2 != null) {
            setmp3extractorflags.AudioAttributesImplApi21Parcelizer.setContentDescription(charSequence2);
        } else if (setmp3extractorflags.onPlayFromUri != 0) {
            setmp3extractorflags.AudioAttributesImplApi21Parcelizer.setContentDescription(setmp3extractorflags.getContext().getResources().getText(setmp3extractorflags.onPlayFromUri));
        }
        setmp3extractorflags.AudioAttributesImplApi21Parcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.setMp3ExtractorFlags.3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                for (setMp4ExtractorFlags setmp4extractorflags : setMp3ExtractorFlags.RemoteActionCompatParcelizer(setMp3ExtractorFlags.this)) {
                    setMp3ExtractorFlags.this.RemoteActionCompatParcelizer();
                }
                setMp3ExtractorFlags.this.dismiss();
            }
        });
        Button button = (Button) viewInflate.findViewById(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.cancel_button);
        button.setTag(AudioAttributesCompatParcelizer);
        CharSequence charSequence3 = setmp3extractorflags.handleMediaPlayPauseIfPendingOnHandler;
        if (charSequence3 != null) {
            int i8 = onSetRating + 27;
            onSetCaptioningEnabled = i8 % 128;
            int i9 = i8 % 2;
            button.setText(charSequence3);
        } else {
            int i10 = setmp3extractorflags.onAddQueueItem;
            if (i10 != 0) {
                button.setText(i10);
            }
        }
        CharSequence charSequence4 = setmp3extractorflags.onCommand;
        if (charSequence4 != null) {
            int i11 = onSetRating + 113;
            onSetCaptioningEnabled = i11 % 128;
            int i12 = i11 % 2;
            button.setContentDescription(charSequence4);
        } else if (setmp3extractorflags.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver != 0) {
            int i13 = onSetCaptioningEnabled + 41;
            onSetRating = i13 % 128;
            if (i13 % 2 != 0) {
                button.setContentDescription(setmp3extractorflags.getContext().getResources().getText(setmp3extractorflags.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver));
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            button.setContentDescription(setmp3extractorflags.getContext().getResources().getText(setmp3extractorflags.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver));
        }
        button.setOnClickListener(new View.OnClickListener() { // from class: o.setMp3ExtractorFlags.4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Iterator it = setMp3ExtractorFlags.AudioAttributesCompatParcelizer(setMp3ExtractorFlags.this).iterator();
                while (it.hasNext()) {
                    ((View.OnClickListener) it.next()).onClick(view);
                }
                setMp3ExtractorFlags.this.dismiss();
            }
        });
        return viewInflate;
    }

    @Override // kotlin.argCount, androidx.fragment.app.Fragment
    public final void onStart() {
        int i = 2 % 2;
        int i2 = onSetCaptioningEnabled + 61;
        onSetRating = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        Window window = requireDialog().getWindow();
        if (this.MediaMetadataCompat) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.read);
            IconCompatParcelizer(window);
            int i4 = onSetRating + 105;
            onSetCaptioningEnabled = i4 % 128;
            int i5 = i4 % 2;
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(calculateNextSearchBytePosition.write.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.read, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new maybeLoadExtractorConstructor(requireDialog(), rect));
        }
        AudioAttributesImplApi21Parcelizer();
    }

    @Override // kotlin.argCount, androidx.fragment.app.Fragment
    public final void onStop() {
        int i = 2 % 2;
        int i2 = onSetCaptioningEnabled + 95;
        onSetRating = i2 % 128;
        if (i2 % 2 != 0) {
            this.onPrepareFromMediaId.AudioAttributesImplApi26Parcelizer();
            super.onStop();
            int i3 = 91 / 0;
        } else {
            this.onPrepareFromMediaId.AudioAttributesImplApi26Parcelizer();
            super.onStop();
        }
        int i4 = onSetRating + 9;
        onSetCaptioningEnabled = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 90 / 0;
        }
    }

    @Override // kotlin.argCount, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onSetRating + 47;
        onSetCaptioningEnabled = i2 % 128;
        if (i2 % 2 == 0) {
            this.onMediaButtonEvent.iterator();
            throw null;
        }
        Iterator<DialogInterface.OnCancelListener> it = this.onMediaButtonEvent.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
        int i3 = onSetRating + 11;
        onSetCaptioningEnabled = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // kotlin.argCount, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i = 2 % 2;
        Iterator<DialogInterface.OnDismissListener> it = this.onFastForward.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
            int i2 = onSetRating + 95;
            onSetCaptioningEnabled = i2 % 128;
            int i3 = i2 % 2;
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            int i4 = onSetCaptioningEnabled + 33;
            onSetRating = i4 % 128;
            int i5 = i4 % 2;
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    public final S RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = onSetCaptioningEnabled + 15;
        onSetRating = i2 % 128;
        int i3 = i2 % 2;
        int iAudioAttributesCompatParcelizer = zze.AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer2 = zze.AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer3 = zze.AudioAttributesCompatParcelizer();
        S s = (S) ((DateSelector) write(iAudioAttributesCompatParcelizer2, iAudioAttributesCompatParcelizer, zze.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer3, 158135142, new Object[]{this}, -158135137)).RemoteActionCompatParcelizer();
        int i4 = onSetRating + 103;
        onSetCaptioningEnabled = i4 % 128;
        if (i4 % 2 != 0) {
            return s;
        }
        throw null;
    }

    private void IconCompatParcelizer(Window window) {
        int i = 2 % 2;
        int i2 = onSetRating + 27;
        int i3 = i2 % 128;
        onSetCaptioningEnabled = i3;
        if (i2 % 2 != 0) {
            if (!this.MediaBrowserCompatCustomActionResultReceiver) {
                final View viewFindViewById = requireView().findViewById(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.fullscreen_header);
                ExtractorOutput1.IconCompatParcelizer(window, checkAndPeekStreamMarker.RemoteActionCompatParcelizer(viewFindViewById));
                final int paddingTop = viewFindViewById.getPaddingTop();
                final int i4 = viewFindViewById.getLayoutParams().height;
                InvalidTypeIdException.read(viewFindViewById, new finishBranchObject() { // from class: o.setMp3ExtractorFlags.5
                    @Override // kotlin.finishBranchObject
                    public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                        int i5 = windowInsetsCompat.read(WindowInsetsCompat.MediaBrowserCompatItemReceiver.AudioAttributesImplBaseParcelizer()).write;
                        if (i4 >= 0) {
                            viewFindViewById.getLayoutParams().height = i4 + i5;
                            View view2 = viewFindViewById;
                            view2.setLayoutParams(view2.getLayoutParams());
                        }
                        View view3 = viewFindViewById;
                        view3.setPadding(view3.getPaddingLeft(), paddingTop + i5, viewFindViewById.getPaddingRight(), viewFindViewById.getPaddingBottom());
                        return windowInsetsCompat;
                    }
                });
                this.MediaBrowserCompatCustomActionResultReceiver = true;
                return;
            }
            int i5 = i3 + 33;
            onSetRating = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c A[PHI: r1
      0x003c: PHI (r1v7 android.widget.TextView) = (r1v4 android.widget.TextView), (r1v5 android.widget.TextView), (r1v8 android.widget.TextView) binds: [B:8:0x001a, B:10:0x0020, B:5:0x0013] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c A[PHI: r1
      0x001c: PHI (r1v5 android.widget.TextView) = (r1v4 android.widget.TextView), (r1v8 android.widget.TextView) binds: [B:8:0x001a, B:5:0x0013] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void MediaBrowserCompatCustomActionResultReceiver() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = kotlin.setMp3ExtractorFlags.onSetCaptioningEnabled
            int r1 = r1 + 51
            int r2 = r1 % 128
            kotlin.setMp3ExtractorFlags.onSetRating = r2
            int r1 = r1 % r0
            r2 = 1
            if (r1 == 0) goto L16
            android.widget.TextView r1 = r5.MediaBrowserCompatMediaItem
            int r3 = r5.onCustomAction
            if (r3 != r2) goto L3c
            goto L1c
        L16:
            android.widget.TextView r1 = r5.MediaBrowserCompatMediaItem
            int r3 = r5.onCustomAction
            if (r3 != r2) goto L3c
        L1c:
            boolean r2 = r5.MediaBrowserCompatItemReceiver()
            if (r2 == 0) goto L3c
            int r2 = kotlin.setMp3ExtractorFlags.onSetRating
            int r3 = r2 + 97
            int r4 = r3 % 128
            kotlin.setMp3ExtractorFlags.onSetCaptioningEnabled = r4
            int r3 = r3 % r0
            if (r3 == 0) goto L37
            java.lang.CharSequence r5 = r5.onPrepareFromUri
            int r2 = r2 + 101
            int r3 = r2 % 128
            kotlin.setMp3ExtractorFlags.onSetCaptioningEnabled = r3
            int r2 = r2 % r0
            goto L3e
        L37:
            r5 = 0
            r5.hashCode()
            throw r5
        L3c:
            java.lang.CharSequence r5 = r5.RatingCompat
        L3e:
            r1.setText(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setMp3ExtractorFlags.MediaBrowserCompatCustomActionResultReceiver():void");
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        setMp3ExtractorFlags setmp3extractorflags = (setMp3ExtractorFlags) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = onSetRating + 93;
        onSetCaptioningEnabled = i2 % 128;
        int i3 = i2 % 2;
        TextView textView = setmp3extractorflags.MediaDescriptionCompat;
        int iAudioAttributesCompatParcelizer = zze.AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer2 = zze.AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer3 = zze.AudioAttributesCompatParcelizer();
        textView.setContentDescription((String) write(iAudioAttributesCompatParcelizer2, iAudioAttributesCompatParcelizer, zze.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer3, -479842458, new Object[]{setmp3extractorflags}, 479842461));
        setmp3extractorflags.MediaDescriptionCompat.setText(str);
        int i4 = onSetRating + 47;
        onSetCaptioningEnabled = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x007a A[PHI: r1
      0x007a: PHI (r1v5 int) = (r1v4 int), (r1v12 int) binds: [B:8:0x0078, B:5:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void AudioAttributesImplApi21Parcelizer() {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setMp3ExtractorFlags.AudioAttributesImplApi21Parcelizer():void");
    }

    private void read(Context context) {
        boolean z;
        int i = 2 % 2;
        int i2 = onSetRating + 75;
        onSetCaptioningEnabled = i2 % 128;
        int i3 = i2 % 2;
        this.MediaBrowserCompatSearchResultReceiver.setTag(RemoteActionCompatParcelizer);
        CheckableImageButton checkableImageButton = this.MediaBrowserCompatSearchResultReceiver;
        int iAudioAttributesCompatParcelizer = zze.AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer2 = zze.AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer3 = zze.AudioAttributesCompatParcelizer();
        checkableImageButton.setImageDrawable((Drawable) write(iAudioAttributesCompatParcelizer2, iAudioAttributesCompatParcelizer, zze.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer3, 1817536459, new Object[]{context}, -1817536459));
        CheckableImageButton checkableImageButton2 = this.MediaBrowserCompatSearchResultReceiver;
        if (this.onCustomAction != 0) {
            int i4 = onSetCaptioningEnabled + 5;
            onSetRating = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        } else {
            int i6 = onSetRating + 9;
            onSetCaptioningEnabled = i6 % 128;
            int i7 = i6 % 2;
            z = false;
        }
        checkableImageButton2.setChecked(z);
        InvalidTypeIdException.AudioAttributesCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver, (deserializeUsingCustom) null);
        read(this.MediaBrowserCompatSearchResultReceiver);
        this.MediaBrowserCompatSearchResultReceiver.setOnClickListener(new View.OnClickListener() { // from class: o.setFlacExtractorFlags
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr = {this.AudioAttributesCompatParcelizer};
                int iAudioAttributesCompatParcelizer4 = zze.AudioAttributesCompatParcelizer();
                setMp3ExtractorFlags.write(zze.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer4, zze.AudioAttributesCompatParcelizer(), zze.AudioAttributesCompatParcelizer(), -1233894915, objArr, 1233894916);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object IconCompatParcelizer(java.lang.Object[] r11) {
        /*
            r0 = 0
            r11 = r11[r0]
            o.setMp3ExtractorFlags r11 = (kotlin.setMp3ExtractorFlags) r11
            r1 = 2
            int r2 = r1 % r1
            int r2 = kotlin.setMp3ExtractorFlags.onSetRating
            int r2 = r2 + 81
            int r3 = r2 % 128
            kotlin.setMp3ExtractorFlags.onSetCaptioningEnabled = r3
            int r2 = r2 % r1
            r3 = 1
            if (r2 != 0) goto L47
            android.widget.Button r2 = r11.AudioAttributesImplApi21Parcelizer
            java.lang.Object[] r9 = new java.lang.Object[]{r11}
            int r5 = com.google.android.gms.internal.location.zze.AudioAttributesCompatParcelizer()
            int r4 = com.google.android.gms.internal.location.zze.AudioAttributesCompatParcelizer()
            int r7 = com.google.android.gms.internal.location.zze.AudioAttributesCompatParcelizer()
            int r6 = com.google.android.gms.internal.location.zze.AudioAttributesCompatParcelizer()
            r8 = 158135142(0x96cf366, float:2.8521912E-33)
            r10 = -158135137(0xfffffffff6930c9f, float:-1.4912571E33)
            java.lang.Object r4 = write(r4, r5, r6, r7, r8, r9, r10)
            com.google.android.material.datepicker.DateSelector r4 = (com.google.android.material.datepicker.DateSelector) r4
            boolean r4 = r4.MediaBrowserCompatItemReceiver()
            r2.setEnabled(r4)
            com.google.android.material.internal.CheckableImageButton r2 = r11.MediaBrowserCompatSearchResultReceiver
            r2.toggle()
            int r2 = r11.onCustomAction
            if (r2 != 0) goto L83
            goto L79
        L47:
            android.widget.Button r2 = r11.AudioAttributesImplApi21Parcelizer
            java.lang.Object[] r9 = new java.lang.Object[]{r11}
            int r5 = com.google.android.gms.internal.location.zze.AudioAttributesCompatParcelizer()
            int r4 = com.google.android.gms.internal.location.zze.AudioAttributesCompatParcelizer()
            int r7 = com.google.android.gms.internal.location.zze.AudioAttributesCompatParcelizer()
            int r6 = com.google.android.gms.internal.location.zze.AudioAttributesCompatParcelizer()
            r8 = 158135142(0x96cf366, float:2.8521912E-33)
            r10 = -158135137(0xfffffffff6930c9f, float:-1.4912571E33)
            java.lang.Object r4 = write(r4, r5, r6, r7, r8, r9, r10)
            com.google.android.material.datepicker.DateSelector r4 = (com.google.android.material.datepicker.DateSelector) r4
            boolean r4 = r4.MediaBrowserCompatItemReceiver()
            r2.setEnabled(r4)
            com.google.android.material.internal.CheckableImageButton r2 = r11.MediaBrowserCompatSearchResultReceiver
            r2.toggle()
            int r2 = r11.onCustomAction
            if (r2 != r3) goto L83
        L79:
            int r2 = kotlin.setMp3ExtractorFlags.onSetCaptioningEnabled
            int r2 = r2 + 71
            int r3 = r2 % 128
            kotlin.setMp3ExtractorFlags.onSetRating = r3
            int r2 = r2 % r1
            goto L84
        L83:
            r0 = r3
        L84:
            r11.onCustomAction = r0
            com.google.android.material.internal.CheckableImageButton r0 = r11.MediaBrowserCompatSearchResultReceiver
            r11.read(r0)
            r11.AudioAttributesImplApi21Parcelizer()
            r11 = 0
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setMp3ExtractorFlags.IconCompatParcelizer(java.lang.Object[]):java.lang.Object");
    }

    private void read(CheckableImageButton checkableImageButton) {
        String string;
        int i;
        int i2 = 2 % 2;
        if (this.onCustomAction == 1) {
            string = checkableImageButton.getContext().getString(calculateNextSearchBytePosition.MediaBrowserCompatSearchResultReceiver.mtrl_picker_toggle_to_calendar_input_mode);
            i = onSetCaptioningEnabled + 61;
            onSetRating = i % 128;
        } else {
            string = checkableImageButton.getContext().getString(calculateNextSearchBytePosition.MediaBrowserCompatSearchResultReceiver.mtrl_picker_toggle_to_text_input_mode);
            i = onSetRating + 7;
            onSetCaptioningEnabled = i % 128;
        }
        int i3 = i % 2;
        this.MediaBrowserCompatSearchResultReceiver.setContentDescription(string);
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        setMp3ExtractorFlags setmp3extractorflags = (setMp3ExtractorFlags) objArr[0];
        int i = 2 % 2;
        int i2 = onSetCaptioningEnabled + 29;
        onSetRating = i2 % 128;
        int i3 = i2 % 2;
        if (setmp3extractorflags.AudioAttributesImplBaseParcelizer == null) {
            setmp3extractorflags.AudioAttributesImplBaseParcelizer = (DateSelector) setmp3extractorflags.getArguments().getParcelable("DATE_SELECTOR_KEY");
            int i4 = onSetCaptioningEnabled + 57;
            onSetRating = i4 % 128;
            int i5 = i4 % 2;
        }
        DateSelector<S> dateSelector = setmp3extractorflags.AudioAttributesImplBaseParcelizer;
        int i6 = onSetCaptioningEnabled + 97;
        onSetRating = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 4 / 0;
        }
        return dateSelector;
    }

    private static CharSequence read(CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = onSetCaptioningEnabled;
        int i3 = i2 + 115;
        onSetRating = i3 % 128;
        int i4 = i3 % 2;
        if (charSequence == null) {
            int i5 = i2 + 67;
            onSetRating = i5 % 128;
            if (i5 % 2 == 0) {
                return null;
            }
            throw null;
        }
        int i6 = i2 + 63;
        onSetRating = i6 % 128;
        int i7 = i6 % 2;
        String[] strArrSplit = TextUtils.split(String.valueOf(charSequence), "\n");
        if (strArrSplit.length <= 1) {
            return charSequence;
        }
        String str = strArrSplit[0];
        int i8 = onSetCaptioningEnabled + 111;
        onSetRating = i8 % 128;
        int i9 = i8 % 2;
        return str;
    }

    private boolean MediaBrowserCompatItemReceiver() {
        int i = 2 % 2;
        if (getResources().getConfiguration().orientation == 2) {
            int i2 = onSetCaptioningEnabled + 9;
            onSetRating = i2 % 128;
            return i2 % 2 == 0;
        }
        int i3 = onSetRating + 61;
        onSetCaptioningEnabled = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 79 / 0;
        }
        return false;
    }

    public static boolean AudioAttributesCompatParcelizer(Context context) {
        int i = 2 % 2;
        int i2 = onSetCaptioningEnabled + 17;
        onSetRating = i2 % 128;
        int i3 = i2 % 2;
        boolean z = read(context, R.attr.windowFullscreen);
        int i4 = onSetRating + 53;
        onSetCaptioningEnabled = i4 % 128;
        if (i4 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static boolean IconCompatParcelizer(Context context) {
        boolean z;
        int i = 2 % 2;
        int i2 = onSetRating + 31;
        onSetCaptioningEnabled = i2 % 128;
        if (i2 % 2 == 0) {
            z = read(context, calculateNextSearchBytePosition.IconCompatParcelizer.nestedScrollable);
            int i3 = 92 / 0;
        } else {
            z = read(context, calculateNextSearchBytePosition.IconCompatParcelizer.nestedScrollable);
        }
        int i4 = onSetRating + 91;
        onSetCaptioningEnabled = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    private static boolean read(Context context, int i) {
        int i2 = 2 % 2;
        int i3 = onSetCaptioningEnabled + 75;
        onSetRating = i3 % 128;
        int i4 = i3 % 2;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(SeekPoint.read(context, calculateNextSearchBytePosition.IconCompatParcelizer.materialCalendarStyle, setMatroskaExtractorFlags.class.getCanonicalName()), new int[]{i});
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        int i5 = onSetCaptioningEnabled + 15;
        onSetRating = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }

    private static int write(Context context) {
        int i = 2 % 2;
        int i2 = onSetCaptioningEnabled + 107;
        onSetRating = i2 % 128;
        int i3 = i2 % 2;
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(calculateNextSearchBytePosition.write.mtrl_calendar_content_padding);
        int i4 = Month.AudioAttributesCompatParcelizer().write;
        int dimensionPixelSize = (dimensionPixelOffset << 1) + (resources.getDimensionPixelSize(calculateNextSearchBytePosition.write.mtrl_calendar_day_width) * i4) + ((i4 - 1) * resources.getDimensionPixelOffset(calculateNextSearchBytePosition.write.mtrl_calendar_month_horizontal_padding));
        int i5 = onSetCaptioningEnabled + 33;
        onSetRating = i5 % 128;
        int i6 = i5 % 2;
        return dimensionPixelSize;
    }

    private static Drawable RemoteActionCompatParcelizer(Context context) {
        int iAudioAttributesCompatParcelizer = zze.AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer2 = zze.AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer3 = zze.AudioAttributesCompatParcelizer();
        return (Drawable) write(iAudioAttributesCompatParcelizer2, iAudioAttributesCompatParcelizer, zze.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer3, 1817536459, new Object[]{context}, -1817536459);
    }

    private DateSelector<S> read() {
        int iAudioAttributesCompatParcelizer = zze.AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer2 = zze.AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer3 = zze.AudioAttributesCompatParcelizer();
        return (DateSelector) write(iAudioAttributesCompatParcelizer2, iAudioAttributesCompatParcelizer, zze.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer3, 158135142, new Object[]{this}, -158135137);
    }

    private String AudioAttributesImplApi26Parcelizer() {
        int iAudioAttributesCompatParcelizer = zze.AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer2 = zze.AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer3 = zze.AudioAttributesCompatParcelizer();
        return (String) write(iAudioAttributesCompatParcelizer2, iAudioAttributesCompatParcelizer, zze.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer3, -479842458, new Object[]{this}, 479842461);
    }

    final /* synthetic */ void write() {
        int iAudioAttributesCompatParcelizer = zze.AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer2 = zze.AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer3 = zze.AudioAttributesCompatParcelizer();
        write(iAudioAttributesCompatParcelizer2, iAudioAttributesCompatParcelizer, zze.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer3, -1233894915, new Object[]{this}, 1233894916);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int iAudioAttributesCompatParcelizer = zze.AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer2 = zze.AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer3 = zze.AudioAttributesCompatParcelizer();
        return (View) write(iAudioAttributesCompatParcelizer2, iAudioAttributesCompatParcelizer, zze.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer3, 2095622892, new Object[]{this, layoutInflater, viewGroup, bundle}, -2095622888);
    }

    final void read(String str) {
        int iAudioAttributesCompatParcelizer = zze.AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer2 = zze.AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer3 = zze.AudioAttributesCompatParcelizer();
        write(iAudioAttributesCompatParcelizer2, iAudioAttributesCompatParcelizer, zze.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer3, -1418065873, new Object[]{this, str}, 1418065875);
    }

    static void IconCompatParcelizer() {
        onRewind = 1000326151;
    }
}
