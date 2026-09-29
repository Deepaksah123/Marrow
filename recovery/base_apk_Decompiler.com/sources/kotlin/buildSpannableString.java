package kotlin;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.TrainingApplication;
import com.marrow.ui.activities.error.ErrorViewModel;
import com.marrow.ui.activities.onboarding.splash.SplashActivity;
import in.juspay.hypernfc.NfcBridge;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.MediaItemLocalConfigurationExternalSyntheticLambda1;
import kotlin.Metadata;
import kotlin.VisibilityChecker;
import kotlin.buildClutMapTable;
import kotlin.generateDefault2BitClutEntries;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0003J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0017\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0019\u0010\u0003J\u000f\u0010\u001a\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001a\u0010\u0003J\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"R\u001b\u0010\u0012\u001a\u00020#8CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001b\u0010-\u001a\u00020(8CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,"}, d2 = {"Lo/buildSpannableString;", "Lcom/marrow/ui/activities/base/BaseActivity;", "<init>", "()V", "", "handleMediaPlayPauseIfPendingOnHandler", "()I", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "onCustomAction", "onCommand", "onFastForward", "onPlayFromMediaId", "onPlayFromUri", "", "IconCompatParcelizer", "(I)Z", "p1", "Landroid/content/Intent;", "p2", "onActivityResult", "(IILandroid/content/Intent;)V", "onPlay", "onMediaButtonEvent", "Lo/handlePreambleAddressCode;", "AudioAttributesImplApi26Parcelizer", "()Lo/handlePreambleAddressCode;", "ai_", "()Z", "Lo/NavigationBarViewSavedState;", "onAddQueueItem", "()Lo/NavigationBarViewSavedState;", "Lo/parseEvent;", "write", "Lo/setSessionInfo;", "MediaDescriptionCompat", "()Lo/parseEvent;", "Lcom/marrow/ui/activities/error/ErrorViewModel;", "read", "Lo/RenewEligible;", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "()Lcom/marrow/ui/activities/error/ErrorViewModel;", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class buildSpannableString extends CeaDecoder {
    private static char[] AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int MediaBrowserCompatCustomActionResultReceiver;
    private static int MediaBrowserCompatMediaItem;
    private static int MediaBrowserCompatSearchResultReceiver;
    private static byte[] MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private static boolean MediaDescriptionCompat;
    private static int MediaMetadataCompat;
    private static boolean RatingCompat;
    private static /* synthetic */ isResolutionNotSupported<Object>[] RemoteActionCompatParcelizer;
    private static short[] onCommand;
    private static int onPause;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final RenewEligible RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final setSessionInfo IconCompatParcelizer;
    private static final byte[] $$c = {62, -25, -124, -119};
    private static final int $$f = 13;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {59, 77, -89, -73, 62, -72, 11, -18, 40, -39, 9, -9, -1, 14, -24, -14, 5, 4, -22, -11, -5, -8, 12, 33, -37, -20, 8, -9, -2, 40, -47, -1, -6, 12, -22, 33, -20, -20, 12, -5, -10, 0, -20, 18, -16, -15, -1, 60, -60, -11, -3, 5, -8, 4, TarConstants.LF_BLK, -54, -16, 7, -17, 0, 3, 2, TarConstants.LF_CHR, -66, 9, -22, 12, -16, 6, 5, -14, 59, -56, -8, -4, -10, 63, -24, -40, -4, -10, 73, -16, 2, 6, -14, 12};
    private static final int $$h = 206;
    private static final byte[] $$a = {16, -111, 25, -45, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, -12, -3, 4, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$b = 46;
    private static int onAddQueueItem = 0;
    private static int onCustomAction = 0;
    private static int handleMediaPlayPauseIfPendingOnHandler = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$i(int r6, byte r7, int r8) {
        /*
            int r6 = r6 * 2
            int r6 = r6 + 112
            int r7 = r7 * 4
            int r7 = 3 - r7
            int r8 = r8 * 4
            int r0 = 1 - r8
            byte[] r1 = kotlin.buildSpannableString.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            int r8 = 0 - r8
            if (r1 != 0) goto L19
            r3 = r7
            r7 = r8
            r4 = r2
            goto L30
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r7 = r7 + 1
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L27:
            r4 = r1[r7]
            int r3 = r3 + 1
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L30:
            int r6 = -r6
            int r6 = r6 + r7
            r7 = r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.buildSpannableString.$$i(int, byte, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(byte r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = kotlin.buildSpannableString.$$a
            int r7 = r7 + 4
            int r1 = r6 + 4
            int r8 = 114 - r8
            byte[] r1 = new byte[r1]
            int r6 = r6 + 3
            r2 = -1
            if (r0 != 0) goto L13
            r3 = r6
            r8 = r7
            r4 = r2
            goto L2d
        L13:
            r3 = r2
        L14:
            int r3 = r3 + 1
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L26
            java.lang.String r6 = new java.lang.String
            r7 = 0
            r6.<init>(r1, r7)
            r9[r7] = r6
            return
        L26:
            r4 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2d:
            int r3 = r3 + r7
            int r7 = r3 + (-1)
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.buildSpannableString.c(byte, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(int r5, int r6, short r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = kotlin.buildSpannableString.$$g
            int r5 = 119 - r5
            int r1 = r6 + 5
            int r7 = 82 - r7
            byte[] r1 = new byte[r1]
            int r6 = r6 + 4
            r2 = 0
            if (r0 != 0) goto L12
            r4 = r6
            r3 = r2
            goto L26
        L12:
            r3 = r2
        L13:
            int r7 = r7 + 1
            byte r4 = (byte) r5
            r1[r3] = r4
            if (r3 != r6) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L22:
            r4 = r0[r7]
            int r3 = r3 + 1
        L26:
            int r4 = -r4
            int r5 = r5 + r4
            int r5 = r5 + (-3)
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.buildSpannableString.d(int, int, short, java.lang.Object[]):void");
    }

    public static /* synthetic */ Object write(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = i3 | i6;
        int i8 = ~((~i6) | i3);
        int i9 = ~i3;
        int i10 = i8 | (~(i9 | i2 | i6));
        int i11 = (~(i6 | i9)) | i2;
        int i12 = i3 + i2 + i + (2127773517 * i4) + (1026174006 * i5);
        int i13 = i12 * i12;
        int i14 = (i3 * (-484454144)) + 743702528 + ((-484454144) * i2) + (i7 * (-1605095679)) + (1605095679 * i10) + ((-1605095679) * i11) + ((-2089549824) * i) + (367263744 * i4) + ((-1434976256) * i5) + (1105526784 * i13);
        int i15 = (i3 * 21308160) + 1622758390 + (i2 * 21308160) + (i7 * 947) + (i10 * (-947)) + (i11 * 947) + (i * 21309107) + (i4 * 1708896471) + (i5 * 664464834) + (i13 * 287244288);
        int i16 = i14 + (i15 * i15 * 966983680);
        if (i16 == 1) {
            return IconCompatParcelizer(objArr);
        }
        if (i16 == 2) {
            return AudioAttributesCompatParcelizer(objArr);
        }
        if (i16 == 3) {
            return write(objArr);
        }
        if (i16 == 4) {
            Context context = (Context) objArr[0];
            int iIntValue = ((Number) objArr[1]).intValue();
            String str = (String) objArr[2];
            int i17 = 2 % 2;
            int i18 = handleMediaPlayPauseIfPendingOnHandler + 21;
            onCustomAction = i18 % 128;
            int i19 = i18 % 2;
            Intent intentIconCompatParcelizer = Companion.IconCompatParcelizer(context, iIntValue, str);
            int i20 = handleMediaPlayPauseIfPendingOnHandler + 67;
            onCustomAction = i20 % 128;
            int i21 = i20 % 2;
            return intentIconCompatParcelizer;
        }
        if (i16 == 5) {
            return read(objArr);
        }
        final buildSpannableString buildspannablestring = (buildSpannableString) objArr[0];
        int i22 = 2 % 2;
        parseEvent parseeventMediaDescriptionCompat = buildspannablestring.MediaDescriptionCompat();
        FrameLayout frameLayout = parseeventMediaDescriptionCompat.write;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(frameLayout, "");
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(frameLayout);
        parseeventMediaDescriptionCompat.AudioAttributesCompatParcelizer.setText(buildspannablestring.MediaDescriptionCompat("error_msg"));
        parseeventMediaDescriptionCompat.IconCompatParcelizer.setText(buildspannablestring.getString(R.string.ok));
        parseeventMediaDescriptionCompat.IconCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.isDefined
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                buildSpannableString.IconCompatParcelizer(this.read);
            }
        });
        int i23 = handleMediaPlayPauseIfPendingOnHandler + 57;
        onCustomAction = i23 % 128;
        int i24 = i23 % 2;
        return null;
    }

    public buildSpannableString() {
        buildSpannableString buildspannablestring = this;
        this.IconCompatParcelizer = parseTrackTiming.write(buildspannablestring, SessionDescriptionParser.RemoteActionCompatParcelizer(), new read());
        this.RemoteActionCompatParcelizer = new VirtualAnnotatedMember(toMagicModuleMetaDataUcModel.write(ErrorViewModel.class), new AnonymousClass1(buildspannablestring), new AnonymousClass2(buildspannablestring), new AnonymousClass5(buildspannablestring));
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        buildSpannableString buildspannablestring = (buildSpannableString) objArr[0];
        int i = 2 % 2;
        int i2 = onCustomAction + 113;
        handleMediaPlayPauseIfPendingOnHandler = i2 % 128;
        int i3 = i2 % 2;
        ErrorViewModel errorViewModelMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = buildspannablestring.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        int i4 = onCustomAction + 65;
        handleMediaPlayPauseIfPendingOnHandler = i4 % 128;
        if (i4 % 2 != 0) {
            return errorViewModelMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final parseEvent MediaDescriptionCompat() {
        setSessionInfo setsessioninfo;
        isResolutionNotSupported<?> isresolutionnotsupported;
        int i = 2 % 2;
        int i2 = handleMediaPlayPauseIfPendingOnHandler + 15;
        onCustomAction = i2 % 128;
        if (i2 % 2 != 0) {
            setsessioninfo = this.IconCompatParcelizer;
            isresolutionnotsupported = RemoteActionCompatParcelizer[1];
        } else {
            setsessioninfo = this.IconCompatParcelizer;
            isresolutionnotsupported = RemoteActionCompatParcelizer[0];
        }
        parseEvent parseevent = (parseEvent) setsessioninfo.read(this, isresolutionnotsupported);
        int i3 = onCustomAction + 121;
        handleMediaPlayPauseIfPendingOnHandler = i3 % 128;
        int i4 = i3 % 2;
        return parseevent;
    }

    private final ErrorViewModel MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        int i = 2 % 2;
        int i2 = handleMediaPlayPauseIfPendingOnHandler + 51;
        onCustomAction = i2 % 128;
        int i3 = i2 % 2;
        Object objRemoteActionCompatParcelizer = this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
        if (i3 == 0) {
            return (ErrorViewModel) objRemoteActionCompatParcelizer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: loaded from: classes3.dex */
    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                NewNumberOtpResendRequest<generateDefault2BitClutEntries> newNumberOtpResendRequest = ((ErrorViewModel) buildSpannableString.write(new Object[]{buildSpannableString.this}, NfcBridge.Companion.write(), 2132660277, -2132660276, NfcBridge.Companion.write(), NfcBridge.Companion.write(), NfcBridge.Companion.write())).read();
                final buildSpannableString buildspannablestring = buildSpannableString.this;
                this.IconCompatParcelizer = 1;
                if (newNumberOtpResendRequest.write(new getValidationToken() { // from class: o.buildSpannableString.AudioAttributesCompatParcelizer.2
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return read((generateDefault2BitClutEntries) obj2);
                    }

                    private Object read(generateDefault2BitClutEntries generatedefault2bitclutentries) {
                        buildSpannableString buildspannablestring2 = buildspannablestring;
                        if (generatedefault2bitclutentries instanceof generateDefault2BitClutEntries.IconCompatParcelizer) {
                            buildSpannableString buildspannablestring3 = buildspannablestring2;
                            String string = buildspannablestring2.getString(com.marrow.R.string.device_limit_exceed);
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
                            String strAudioAttributesCompatParcelizer = parseDuration.AudioAttributesCompatParcelizer(buildspannablestring3);
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strAudioAttributesCompatParcelizer, "");
                            generateDefault2BitClutEntries.IconCompatParcelizer iconCompatParcelizer = (generateDefault2BitClutEntries.IconCompatParcelizer) generatedefault2bitclutentries;
                            DataSink.RemoteActionCompatParcelizer(buildspannablestring3, "legal@marrowmed.com", string, populateHttpRequestHeaders.AudioAttributesCompatParcelizer(strAudioAttributesCompatParcelizer, iconCompatParcelizer.AudioAttributesCompatParcelizer(), iconCompatParcelizer.RemoteActionCompatParcelizer()));
                        }
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
            return buildSpannableString.this.new AudioAttributesCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public static final class read implements getAnswerMap<buildSpannableString, parseEvent> {
        private static parseEvent write(buildSpannableString buildspannablestring) {
            toMagicModuleMetaRepoModel.write(buildspannablestring, "");
            return parseEvent.RemoteActionCompatParcelizer(SessionDescriptionParser.AudioAttributesCompatParcelizer(buildspannablestring));
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [o.getApplicationLabel, o.parseEvent] */
        @Override // kotlin.getAnswerMap
        public final /* synthetic */ parseEvent invoke(buildSpannableString buildspannablestring) {
            return write(buildspannablestring);
        }
    }

    /* JADX INFO: renamed from: o.buildSpannableString$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "read", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass2 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ MediaBrowserCompatMediaItem $IconCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            return this.$IconCompatParcelizer.getDefaultViewModelProviderFactory();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem) {
            super(0);
            this.$IconCompatParcelizer = mediaBrowserCompatMediaItem;
        }
    }

    /* JADX INFO: renamed from: o.buildSpannableString$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "read", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ MediaBrowserCompatMediaItem $IconCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return this.$IconCompatParcelizer.getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem) {
            super(0);
            this.$IconCompatParcelizer = mediaBrowserCompatMediaItem;
        }
    }

    /* JADX INFO: renamed from: o.buildSpannableString$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "read", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ getCreatedOnDateMs $IconCompatParcelizer = null;
        private /* synthetic */ MediaBrowserCompatMediaItem $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final withFieldVisibility invoke() {
            return this.$write.getDefaultViewModelCreationExtras();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem) {
            super(0);
            this.$write = mediaBrowserCompatMediaItem;
        }
    }

    private static void a(int i, byte[] bArr, char[] cArr, int[] iArr, Object[] objArr) throws Throwable {
        int i2;
        char[] cArr2;
        int i3 = 2 % 2;
        notifyDownloads notifydownloads = new notifyDownloads();
        char[] cArr3 = AudioAttributesCompatParcelizer;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            for (int i4 = 0; i4 < length; i4++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i4])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-298077624);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (44862 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 18943, 28 - ExpandableListView.getPackedPositionGroup(0L), -1871546659, false, CmcdHeadersFactory.STREAMING_FORMAT_SS, new Class[]{Integer.TYPE});
                    }
                    cArr4[i4] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr4;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(MediaBrowserCompatCustomActionResultReceiver)};
            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(680566917);
            if (objRemoteActionCompatParcelizer2 == null) {
                objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 19033 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 74 - MotionEvent.axisFromString(""), 1457087504, false, "r", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
            if (RatingCompat) {
                int i5 = $10 + 69;
                $11 = i5 % 128;
                int i6 = i5 % 2;
                notifydownloads.AudioAttributesCompatParcelizer = bArr.length;
                char[] cArr5 = new char[notifydownloads.AudioAttributesCompatParcelizer];
                notifydownloads.IconCompatParcelizer = 0;
                while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
                    cArr5[notifydownloads.IconCompatParcelizer] = (char) (cArr3[bArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] + i] - iIntValue);
                    Object[] objArr4 = {notifydownloads, notifydownloads};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1593953308);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) Color.blue(0), (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 11439, View.getDefaultSize(0, 0) + 14, -558368911, false, "q", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                }
                objArr[0] = new String(cArr5);
                return;
            }
            if (!MediaDescriptionCompat) {
                notifydownloads.AudioAttributesCompatParcelizer = iArr.length;
                char[] cArr6 = new char[notifydownloads.AudioAttributesCompatParcelizer];
                notifydownloads.IconCompatParcelizer = 0;
                while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
                    int i7 = $10 + 77;
                    $11 = i7 % 128;
                    if (i7 % 2 == 0) {
                        cArr6[notifydownloads.IconCompatParcelizer] = (char) (cArr3[iArr[(notifydownloads.AudioAttributesCompatParcelizer >> 1) >> notifydownloads.IconCompatParcelizer] + i] / iIntValue);
                        i2 = notifydownloads.IconCompatParcelizer;
                    } else {
                        cArr6[notifydownloads.IconCompatParcelizer] = (char) (cArr3[iArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] - i] - iIntValue);
                        i2 = notifydownloads.IconCompatParcelizer + 1;
                    }
                    notifydownloads.IconCompatParcelizer = i2;
                }
                objArr[0] = new String(cArr6);
                return;
            }
            int i8 = $11 + 125;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                notifydownloads.AudioAttributesCompatParcelizer = cArr.length;
                cArr2 = new char[notifydownloads.AudioAttributesCompatParcelizer];
                notifydownloads.IconCompatParcelizer = 1;
            } else {
                notifydownloads.AudioAttributesCompatParcelizer = cArr.length;
                cArr2 = new char[notifydownloads.AudioAttributesCompatParcelizer];
                notifydownloads.IconCompatParcelizer = 0;
            }
            while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
                cArr2[notifydownloads.IconCompatParcelizer] = (char) (cArr3[cArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] - i] - iIntValue);
                Object[] objArr5 = {notifydownloads, notifydownloads};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1593953308);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), 11438 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), ((byte) KeyEvent.getModifierMetaStateMask()) + 15, -558368911, false, "q", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
                int i9 = $11 + 61;
                $10 = i9 % 128;
                int i10 = i9 % 2;
            }
            objArr[0] = new String(cArr2);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    /* JADX INFO: renamed from: o.buildSpannableString$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lo/buildSpannableString$IconCompatParcelizer;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "p1", "", "p2", "Landroid/content/Intent;", "IconCompatParcelizer", "(Landroid/content/Context;ILjava/lang/String;)Landroid/content/Intent;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static Intent IconCompatParcelizer(Context p0, int p1, String p2) {
            toMagicModuleMetaRepoModel.write(p0, "");
            Intent intent = new Intent(p0, (Class<?>) buildSpannableString.class);
            intent.putExtra("error_type", p1);
            intent.putExtra("error_msg", p2);
            return intent;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0084 A[PHI: r4
      0x0084: PHI (r4v10 byte[] A[IMMUTABLE_TYPE]) = (r4v9 byte[]), (r4v19 byte[]) binds: [B:18:0x0082, B:15:0x007d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x015f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void b(int r24, short r25, int r26, int r27, byte r28, java.lang.Object[] r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 687
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.buildSpannableString.b(int, short, int, int, byte, java.lang.Object[]):void");
    }

    @Override // kotlin.CeaDecoder, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onCreate(Bundle p0) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object[] objArr2 = new Object[1];
        a(127 - (ViewConfiguration.getPressedStateDuration() >> 16), new byte[]{-120, -120, -117, -118, -123, -124, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, null, null, objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        a(View.resolveSizeAndState(0, 0, 0) + 127, new byte[]{-125, -122, -114, -115, -116}, null, null, objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                int i2 = onCustomAction + 45;
                handleMediaPlayPauseIfPendingOnHandler = i2 % 128;
                int i3 = i2 % 2;
                Object[] objArr4 = new Object[1];
                b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 157, (short) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1734578654, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 71546446, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 42), objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 92, new byte[]{-126, -123, -122, -112, -127, -118, -122, -109, -110, -110, -111, -112, -126, -117, -124, -124, -113, -118}, null, null, objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            if (baseContext != null) {
                int i4 = handleMediaPlayPauseIfPendingOnHandler + 63;
                onCustomAction = i4 % 128;
                int i5 = i4 % 2;
                try {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (4535 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 6054 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 42 - View.combineMeasuredStates(0, 0), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr6 = new Object[1];
                    b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 157, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35), 1734578656 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion, 71546446 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.marrow.R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2), (byte) (Color.red(0) + 127), objArr6);
                    String str = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    a((TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 127, new byte[]{-107, -98, -117, -105, -118, -117, -97, -101, -105, -100, -102, -103, -108, -105, -102, -108, -125, -103, -97, -125, -125, -104, -107, -101, -108, -98, -99, -97, -98, -104, -100, -108, -108, -99, -107, -102, -108, -103, -103, -104, -102, -100, -101, -106, -102, -127, -117, -127, -106, -125, -103, -108, -104, -125, -107, -105, -106, -107, -127, -107, -108, -118, -118, -108}, null, null, objArr7);
                    String str2 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    a(127 - Drawable.resolveOpacity(0, 0), new byte[]{-101, -106, -107, -106, -104, -105, -104, -103, -118, -98, -106, -103, -127, -97, -125, -105, -127, -108, -99, -118, -108, -117, -99, -103, -97, -98, -117, -127, -117, -107, -127, -100, -101, -103, -106, -98, -102, -125, -117, -102, -99, -98, -103, -99, -103, -104, -127, -101, -125, -125, -127, -101, -103, -105, -125, -125, -101, -118, -99, -103, -125, -127, -103, -104}, null, null, objArr8);
                    String str3 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.marrow.R.string.exo_track_resolution).substring(0, 4).codePointAt(2) - 158, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) + 1734578587, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.marrow.R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 71546526, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.marrow.R.string.exo_item_list).substring(0, 4).length() - 63), objArr9);
                    String str4 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) + 18, new byte[]{-99, -121, -100, -103, -121, -102}, null, null, objArr10);
                    String str5 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    a((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(com.marrow.R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 126, new byte[]{-106, -106, -127, -103, -97, -118, -117, -107, -99, -127, -107, -97, -96, -108, -99, -104, -102, -96, -107, -100, -106, -100, -96, -97, -101, -97, -101, -96, -103, -103, -99, -106, -107, -104, -103, -99}, null, null, objArr11);
                    Object[] objArr12 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr11[0], 86400};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(448819875);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) TextUtils.indexOf("", "", 0), ExpandableListView.getPackedPositionGroup(0L) + 6030, 23 - TextUtils.lastIndexOf("", '0', 0), 1686746678, false, "AudioAttributesCompatParcelizer", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
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
            char c = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 13182);
            int iMyPid = (Process.myPid() >> 22) + 1649;
            int iAxisFromString = MotionEvent.axisFromString("") + 27;
            byte b = (byte) ($$b & 248);
            byte[] bArr = $$a;
            Object[] objArr13 = new Object[1];
            c(b, bArr[17], bArr[62], objArr13);
            objRemoteActionCompatParcelizer3 = startForeground.read(c, iMyPid, iAxisFromString, -133433128, false, (String) objArr13[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer3).getLong(null) != -1) {
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer4 == null) {
                char c2 = (char) (13183 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)));
                int iIndexOf = 1649 - TextUtils.indexOf("", "", 0, 0);
                int iIndexOf2 = 26 - TextUtils.indexOf("", "");
                byte[] bArr2 = $$a;
                Object[] objArr14 = new Object[1];
                c((byte) (-bArr2[8]), (short) (-bArr2[65]), bArr2[9], objArr14);
                objRemoteActionCompatParcelizer4 = startForeground.read(c2, iIndexOf, iIndexOf2, -1033747278, false, (String) objArr14[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer4).get(null);
        } else {
            Object[] objArr15 = new Object[1];
            b(ExpandableListView.getPackedPositionChild(0L) - 121, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1734578663, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.marrow.R.string.exo_track_resolution).substring(0, 4).length() + 71546593, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 43), objArr15);
            Class<?> cls3 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            b((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(com.marrow.R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) - 123, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.marrow.R.string.exo_track_resolution).substring(0, 4).length() - 4), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1734578696, View.MeasureSpec.getMode(0) + 71546613, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 115), objArr16);
            int iIntValue2 = ((Integer) cls3.getMethod((String) objArr16[0], Object.class).invoke(null, this)).intValue();
            int i6 = onCustomAction + 17;
            handleMediaPlayPauseIfPendingOnHandler = i6 % 128;
            int i7 = i6 % 2;
            try {
                Object[] objArr17 = {Integer.valueOf(iIntValue2), 0, -603769374};
                byte[] bArr3 = $$g;
                byte b2 = bArr3[26];
                byte b3 = (byte) (-bArr3[40]);
                Object[] objArr18 = new Object[1];
                d(b2, b3, (byte) (b3 | 69), objArr18);
                Class<?> cls4 = Class.forName((String) objArr18[0]);
                Object[] objArr19 = new Object[1];
                d((byte) (-bArr3[24]), (byte) 23, (byte) 65, objArr19);
                objArr = (Object[]) cls4.getMethod((String) objArr19[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr17);
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer5 == null) {
                    char cArgb = (char) (Color.argb(0, 0, 0, 0) + 13183);
                    int iIndexOf3 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1650;
                    int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 27;
                    byte[] bArr4 = $$a;
                    Object[] objArr20 = new Object[1];
                    c((byte) (-bArr4[8]), (short) (-bArr4[65]), bArr4[9], objArr20);
                    objRemoteActionCompatParcelizer5 = startForeground.read(cArgb, iIndexOf3, packedPositionChild, -1033747278, false, (String) objArr20[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer5).set(null, objArr);
                try {
                    Object[] objArr21 = new Object[1];
                    b(ImageFormat.getBitsPerPixel(0) - 121, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.marrow.R.string.exo_track_resolution).substring(0, 4).length() - 4), (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(com.marrow.R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 1734578688, 71546629 - (ViewConfiguration.getPressedStateDuration() >> 16), (byte) (TextUtils.getCapsMode("", 0, 0) + 65), objArr21);
                    Class<?> cls5 = Class.forName((String) objArr21[0]);
                    Object[] objArr22 = new Object[1];
                    b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 157, (short) (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) + 1734578579, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 71546641, (byte) ((-32) - View.getDefaultSize(0, 0)), objArr22);
                    long jLongValue = ((Long) cls5.getDeclaredMethod((String) objArr22[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer6 == null) {
                        char cAxisFromString = (char) (MotionEvent.axisFromString("") + 13184);
                        int offsetAfter = TextUtils.getOffsetAfter("", 0) + 1649;
                        int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 26;
                        Object[] objArr23 = new Object[1];
                        c((byte) (-$$a[8]), (short) 75, r4[9], objArr23);
                        objRemoteActionCompatParcelizer6 = startForeground.read(cAxisFromString, offsetAfter, minimumFlingVelocity, 54351865, false, (String) objArr23[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer7 == null) {
                        char c3 = (char) ((ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 13182);
                        int i8 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1648;
                        int mirror = 'J' - AndroidCharacter.getMirror('0');
                        byte b4 = (byte) ($$b & 248);
                        byte[] bArr5 = $$a;
                        Object[] objArr24 = new Object[1];
                        c(b4, bArr5[17], bArr5[62], objArr24);
                        objRemoteActionCompatParcelizer7 = startForeground.read(c3, i8, mirror, -133433128, false, (String) objArr24[0], null);
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
        int i9 = ((int[]) objArr[3])[0];
        int i10 = ((int[]) objArr[2])[0];
        if (i10 != i9) {
            long j = -1;
            long j2 = ((long) (i10 ^ i9)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = j2 | (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32));
            Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(-1407079962);
            if (objRemoteActionCompatParcelizer8 == null) {
                objRemoteActionCompatParcelizer8 = startForeground.read((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 4535), 6054 - Color.red(0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
            }
            Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer8).invoke(null, null);
            try {
                Object[] objArr25 = {-122343810, Long.valueOf(j4), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
                Class cls6 = (Class) startForeground.IconCompatParcelizer((char) ExpandableListView.getPackedPositionType(0L), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 6031, 25 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                Object[] objArr26 = new Object[1];
                d((byte) (-$$g[24]), (byte) 23, (byte) 65, objArr26);
                cls6.getMethod((String) objArr26[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke2, objArr25);
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        super.onCreate(p0);
        onCommand();
        onCustomAction();
    }

    private final void onCustomAction() {
        int i = 2 % 2;
        CmcdConfigurationRequestConfig.read(this, new AudioAttributesCompatParcelizer(null));
        int i2 = handleMediaPlayPauseIfPendingOnHandler + 105;
        onCustomAction = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 31 / 0;
        }
    }

    private final void onCommand() {
        int i = 2 % 2;
        int iWrite = write("error_type", -1);
        if (((Boolean) write(new Object[]{Integer.valueOf(iWrite)}, NfcBridge.Companion.write(), -883261863, 883261865, NfcBridge.Companion.write(), NfcBridge.Companion.write(), NfcBridge.Companion.write())).booleanValue()) {
            int i2 = onCustomAction + 107;
            handleMediaPlayPauseIfPendingOnHandler = i2 % 128;
            if (i2 % 2 != 0) {
                onPlayFromUri();
                return;
            } else {
                onPlayFromUri();
                int i3 = 36 / 0;
                return;
            }
        }
        if (iWrite == 1307) {
            int i4 = handleMediaPlayPauseIfPendingOnHandler + 111;
            onCustomAction = i4 % 128;
            if (i4 % 2 == 0) {
                write(new Object[]{this}, NfcBridge.Companion.write(), -1363537384, 1363537384, NfcBridge.Companion.write(), NfcBridge.Companion.write(), NfcBridge.Companion.write());
                return;
            } else {
                write(new Object[]{this}, NfcBridge.Companion.write(), -1363537384, 1363537384, NfcBridge.Companion.write(), NfcBridge.Companion.write(), NfcBridge.Companion.write());
                int i5 = 44 / 0;
                return;
            }
        }
        onPlayFromMediaId();
    }

    private static final void MediaBrowserCompatCustomActionResultReceiver(buildSpannableString buildspannablestring) {
        int i = 2 % 2;
        int i2 = handleMediaPlayPauseIfPendingOnHandler + 75;
        onCustomAction = i2 % 128;
        int i3 = i2 % 2;
        buildspannablestring.onMediaButtonEvent();
        if (i3 != 0) {
            int i4 = 64 / 0;
        }
    }

    private static final void AudioAttributesImplBaseParcelizer(buildSpannableString buildspannablestring) {
        int i = 2 % 2;
        int i2 = handleMediaPlayPauseIfPendingOnHandler + 101;
        onCustomAction = i2 % 128;
        int i3 = i2 % 2;
        buildspannablestring.onPlay();
        if (i3 != 0) {
            throw null;
        }
        int i4 = onCustomAction + 69;
        handleMediaPlayPauseIfPendingOnHandler = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void onPlayFromMediaId() {
        int i = 2 % 2;
        String strMediaDescriptionCompat = MediaDescriptionCompat("error_msg");
        parseEvent parseeventMediaDescriptionCompat = MediaDescriptionCompat();
        FrameLayout frameLayout = parseeventMediaDescriptionCompat.write;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(frameLayout, "");
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(frameLayout);
        parseeventMediaDescriptionCompat.AudioAttributesCompatParcelizer.setText(strMediaDescriptionCompat);
        parseeventMediaDescriptionCompat.IconCompatParcelizer.setText(getString(R.string.ok));
        parseeventMediaDescriptionCompat.IconCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.Cea708DecoderCueInfoBuilder
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                buildSpannableString.RemoteActionCompatParcelizer(this.write);
            }
        });
        int i2 = onCustomAction + 115;
        handleMediaPlayPauseIfPendingOnHandler = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private static final void AudioAttributesImplApi26Parcelizer(buildSpannableString buildspannablestring) {
        int i = 2 % 2;
        int i2 = onCustomAction + 13;
        handleMediaPlayPauseIfPendingOnHandler = i2 % 128;
        int i3 = i2 % 2;
        buildspannablestring.onPlay();
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void MediaBrowserCompatItemReceiver(buildSpannableString buildspannablestring) {
        int i = 2 % 2;
        int i2 = handleMediaPlayPauseIfPendingOnHandler + 7;
        onCustomAction = i2 % 128;
        int i3 = i2 % 2;
        buildspannablestring.onPlay();
        int i4 = handleMediaPlayPauseIfPendingOnHandler + 91;
        onCustomAction = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void MediaBrowserCompatMediaItem(buildSpannableString buildspannablestring) {
        int i = 2 % 2;
        int i2 = handleMediaPlayPauseIfPendingOnHandler + 103;
        onCustomAction = i2 % 128;
        int i3 = i2 % 2;
        buildspannablestring.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().read(buildClutMapTable.RemoteActionCompatParcelizer.INSTANCE);
        int i4 = onCustomAction + 45;
        handleMediaPlayPauseIfPendingOnHandler = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void onPlayFromUri() {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.buildSpannableString.onPlayFromUri():void");
    }

    private static /* synthetic */ Object AudioAttributesCompatParcelizer(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        int i = 2 % 2;
        int i2 = onCustomAction + 123;
        handleMediaPlayPauseIfPendingOnHandler = i2 % 128;
        int i3 = i2 % 2;
        boolean zContains = getKycMessage.IconCompatParcelizer(1204, 1203, 1205).contains(Integer.valueOf(iIntValue));
        int i4 = onCustomAction + 51;
        handleMediaPlayPauseIfPendingOnHandler = i4 % 128;
        if (i4 % 2 != 0) {
            return Boolean.valueOf(zContains);
        }
        throw null;
    }

    @Override // com.marrow.ui.activities.base.BaseActivity, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, android.app.Activity
    public final void onActivityResult(int p0, int p1, Intent p2) {
        int i = 2 % 2;
        int i2 = onCustomAction + 37;
        handleMediaPlayPauseIfPendingOnHandler = i2 % 128;
        int i3 = i2 % 2;
        if (p0 == 0) {
            onCommand();
            return;
        }
        super.onActivityResult(p0, p1, p2);
        int i4 = handleMediaPlayPauseIfPendingOnHandler + 61;
        onCustomAction = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private final void onPlay() {
        int i = 2 % 2;
        int i2 = onCustomAction + 27;
        handleMediaPlayPauseIfPendingOnHandler = i2 % 128;
        int i3 = i2 % 2;
        finish();
        int i4 = handleMediaPlayPauseIfPendingOnHandler + 67;
        onCustomAction = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void onMediaButtonEvent() {
        int i = 2 % 2;
        startActivity(new Intent(this, (Class<?>) SplashActivity.class));
        finish();
        int i2 = onCustomAction + 13;
        handleMediaPlayPauseIfPendingOnHandler = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.marrow.ui.activities.base.BaseActivity
    public final handlePreambleAddressCode AudioAttributesImplApi26Parcelizer() {
        int i = 2 % 2;
        int i2 = handleMediaPlayPauseIfPendingOnHandler + 47;
        onCustomAction = i2 % 128;
        int i3 = i2 % 2;
        isServiceSwitchCommand isserviceswitchcommand = this.MediaBrowserCompatItemReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(isserviceswitchcommand, "");
        isServiceSwitchCommand isserviceswitchcommand2 = isserviceswitchcommand;
        if (i3 != 0) {
            throw null;
        }
        int i4 = handleMediaPlayPauseIfPendingOnHandler + 23;
        onCustomAction = i4 % 128;
        int i5 = i4 % 2;
        return isserviceswitchcommand2;
    }

    @Override // com.marrow.ui.activities.base.BaseActivity
    public final NavigationBarViewSavedState onAddQueueItem() {
        int i = 2 % 2;
        NavigationBarViewSavedState navigationBarViewSavedState = new NavigationBarViewSavedState(CmcdConfigurationRequestConfig.RemoteActionCompatParcelizer(), null, null, 6, null);
        int i2 = handleMediaPlayPauseIfPendingOnHandler + 119;
        onCustomAction = i2 % 128;
        if (i2 % 2 == 0) {
            return navigationBarViewSavedState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // kotlin.CeaDecoder, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onResume() throws Throwable {
        int i = 2 % 2;
        int i2 = onCustomAction + 97;
        handleMediaPlayPauseIfPendingOnHandler = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i4 = onCustomAction + 53;
            handleMediaPlayPauseIfPendingOnHandler = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr = new Object[1];
            b((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(com.marrow.R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) - 123, (short) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 1734578685 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.marrow.R.string.exo_item_list).substring(0, 4).length(), 71546419 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.marrow.R.string.exo_track_resolution).substring(0, 4).codePointAt(0), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.marrow.R.string.exo_track_resolution).substring(0, 4).codePointAt(0) + 15), objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.marrow.R.string.exo_track_resolution).substring(0, 4).length() + 123, new byte[]{-126, -123, -122, -112, -127, -118, -122, -109, -110, -110, -111, -112, -126, -117, -124, -124, -113, -118}, null, null, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (View.getDefaultSize(0, 0) + 4535), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 6053, 42 - Color.blue(0), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(823471051);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (Color.rgb(0, 0, 0) + BlockingViewModel_HiltModulesKeyModule.OKHTTP_CLIENT_WINDOW_SIZE), 6029 - Process.getGidForName(""), View.resolveSizeAndState(0, 0, 0) + 24, 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        super.onResume();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00e9  */
    @Override // kotlin.CeaDecoder, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 371
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.buildSpannableString.onPause():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0bf1 A[Catch: all -> 0x0cb4, TryCatch #10 {all -> 0x0cb4, blocks: (B:143:0x0bdc, B:145:0x0bf1, B:146:0x0c21), top: B:279:0x0bdc, outer: #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0c34 A[Catch: all -> 0x0caa, TryCatch #5 {all -> 0x0caa, blocks: (B:147:0x0c27, B:149:0x0c34, B:150:0x0ca2), top: B:271:0x0c27, outer: #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0dca  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0e1d  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0e79  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x1233  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x131e  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x136a  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x13c4  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x1818  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0bc2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:294:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.CeaDecoder, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void attachBaseContext(android.content.Context r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 6560
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.buildSpannableString.attachBaseContext(android.content.Context):void");
    }

    public static /* synthetic */ void read(buildSpannableString buildspannablestring) {
        int i = 2 % 2;
        int i2 = handleMediaPlayPauseIfPendingOnHandler + 47;
        onCustomAction = i2 % 128;
        int i3 = i2 % 2;
        MediaBrowserCompatItemReceiver(buildspannablestring);
        if (i3 != 0) {
            int i4 = 27 / 0;
        }
    }

    public static /* synthetic */ void RemoteActionCompatParcelizer(buildSpannableString buildspannablestring) {
        int i = 2 % 2;
        int i2 = onCustomAction + 41;
        handleMediaPlayPauseIfPendingOnHandler = i2 % 128;
        int i3 = i2 % 2;
        AudioAttributesImplBaseParcelizer(buildspannablestring);
        int i4 = handleMediaPlayPauseIfPendingOnHandler + 85;
        onCustomAction = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void write(buildSpannableString buildspannablestring) {
        int i = 2 % 2;
        int i2 = handleMediaPlayPauseIfPendingOnHandler + 43;
        onCustomAction = i2 % 128;
        int i3 = i2 % 2;
        MediaBrowserCompatMediaItem(buildspannablestring);
        if (i3 != 0) {
            throw null;
        }
        int i4 = onCustomAction + 13;
        handleMediaPlayPauseIfPendingOnHandler = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void IconCompatParcelizer(buildSpannableString buildspannablestring) {
        int i = 2 % 2;
        int i2 = onCustomAction + 25;
        handleMediaPlayPauseIfPendingOnHandler = i2 % 128;
        int i3 = i2 % 2;
        MediaBrowserCompatCustomActionResultReceiver(buildspannablestring);
        if (i3 == 0) {
            int i4 = 67 / 0;
        }
    }

    static {
        onPause = 1;
        AudioAttributesImplBaseParcelizer();
        RemoteActionCompatParcelizer = new isResolutionNotSupported[]{toMagicModuleMetaDataUcModel.write(new downloadMagicModuleMetalambda0(buildSpannableString.class, "binding", "getBinding()Lcom/marrow/databinding/ActivityErrorBinding;", 0))};
        INSTANCE = new Companion(null);
        int i = onAddQueueItem + 49;
        onPause = i % 128;
        int i2 = i % 2;
    }

    public static final /* synthetic */ ErrorViewModel AudioAttributesImplApi21Parcelizer(buildSpannableString buildspannablestring) {
        return (ErrorViewModel) write(new Object[]{buildspannablestring}, NfcBridge.Companion.write(), 2132660277, -2132660276, NfcBridge.Companion.write(), NfcBridge.Companion.write(), NfcBridge.Companion.write());
    }

    private static boolean IconCompatParcelizer(int p0) {
        return ((Boolean) write(new Object[]{Integer.valueOf(p0)}, NfcBridge.Companion.write(), -883261863, 883261865, NfcBridge.Companion.write(), NfcBridge.Companion.write(), NfcBridge.Companion.write())).booleanValue();
    }

    @getMagicModuleMeta
    public static final Intent read(Context context, int i, String str) {
        return (Intent) write(new Object[]{context, Integer.valueOf(i), str}, NfcBridge.Companion.write(), -1385055354, 1385055358, NfcBridge.Companion.write(), NfcBridge.Companion.write(), NfcBridge.Companion.write());
    }

    private final void onFastForward() {
        write(new Object[]{this}, NfcBridge.Companion.write(), -1363537384, 1363537384, NfcBridge.Companion.write(), NfcBridge.Companion.write(), NfcBridge.Companion.write());
    }

    @Override // com.marrow.ui.activities.base.BaseActivity
    public final int handleMediaPlayPauseIfPendingOnHandler() {
        int i = 2 % 2;
        int i2 = handleMediaPlayPauseIfPendingOnHandler;
        int i3 = i2 + 51;
        onCustomAction = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 9;
        onCustomAction = i5 % 128;
        int i6 = i5 % 2;
        return com.marrow.R.layout.activity_error;
    }

    @Override // com.marrow.ui.activities.base.BaseActivity
    public final boolean ai_() {
        return ((Boolean) write(new Object[]{this}, NfcBridge.Companion.write(), -1438544496, 1438544499, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1786894445, MediaItemLocalConfigurationExternalSyntheticLambda1.read.IconCompatParcelizer(), MediaItemLocalConfigurationExternalSyntheticLambda1.read.IconCompatParcelizer())).booleanValue();
    }

    @Override // kotlin.CeaDecoder, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onStart() {
        int i = 2 % 2;
        int i2 = handleMediaPlayPauseIfPendingOnHandler + 5;
        onCustomAction = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = handleMediaPlayPauseIfPendingOnHandler + 37;
        onCustomAction = i4 % 128;
        int i5 = i4 % 2;
    }

    static void AudioAttributesImplBaseParcelizer() {
        AudioAttributesCompatParcelizer = new char[]{28462, 28451, 28461, 28479, 28448, 28454, 28515, 28476, 28417, 28460, 28458, 28450, 28470, 28442, 28474, 28477, 28430, 28449, 28453, 28513, 28536, 28539, 28538, 28463, 28542, 28534, 28537, 28541, 28543, 28540, 28459, 28514};
        MediaBrowserCompatCustomActionResultReceiver = 411398065;
        MediaDescriptionCompat = true;
        RatingCompat = true;
        MediaBrowserCompatSearchResultReceiver = 882232095;
        MediaBrowserCompatMediaItem = -819363122;
        MediaMetadataCompat = 1471540439;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = new byte[]{22, -128, 127, 112, -119, -105, TarConstants.LF_PAX_EXTENDED_HEADER_UC, -122, -120, 112, -114, 118, -110, -95, -112, 61, -125, -116, -80, 73, TarConstants.LF_PAX_EXTENDED_HEADER_LC, 121, 126, -115, 117, -114, 0, TarConstants.LF_CONTIG, -27, -55, -53, TarConstants.LF_BLK, -50, 7, -27, 29, TarConstants.LF_CONTIG, -55, TarConstants.LF_DIR, -25, -52, 5, -3, TarConstants.LF_FIFO, -55, TarConstants.LF_FIFO, 26, -27, 6, -26, TarConstants.LF_CONTIG, 27, -55, -6, -53, 5, TarConstants.LF_FIFO, -3, TarConstants.LF_CHR, 25, TarConstants.LF_FIFO, -55, -28, -50, TarConstants.LF_DIR, -54, 26, -55, TarConstants.LF_DIR, -55, TarConstants.LF_DIR, -2, TarConstants.LF_CHR, 26, 125, -115, 116, 123, -99, 99, 68, -113, -50, TarConstants.LF_DIR, -55, 115, 124, -116, -117, 119, 72, -76, -117, 125, 64, -80, -116, 126, 71, -69, -127, 99, -98, 118, -116, 125, -128, 99, -98, 124, TarConstants.LF_GNUTYPE_LONGLINK, -56, 115, 96, -116, -99, 97, -114, -127, TarConstants.LF_PAX_EXTENDED_HEADER_LC, -122, TarConstants.LF_BLK, -55, 125, -124, -117, 116, -113, -117, 127, 113, 122, -113, 71, 114, -121, -75, 113, -114, 114, 126, 32, -15, 8, -8, 3, -33, -36, 62, 0, -12, 12, -57, TarConstants.LF_BLK, 18, -20, 14, 32, -53, 63, -26, 17, 63, -40, -45, 5, -49, -63, 63, -52, -61, -53, TarConstants.LF_LINK, 42, -2, 2, -11, -33, 32, -2, 7, -9, 12, -48, -45, 77, -14, -73, 60, 13, 12, 11, -8, 0, -5, 33, -81, TarConstants.LF_GNUTYPE_SPARSE, -94, 95, 92, -85, 68, -71, -88, -91, 84, TarConstants.LF_PAX_EXTENDED_HEADER_UC, -94, 80, 37, -61, -60, 62, -62, 56, -60, 60, -62, 62, -57};
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onCustomAction;
        int i3 = i2 + 73;
        handleMediaPlayPauseIfPendingOnHandler = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 27;
        handleMediaPlayPauseIfPendingOnHandler = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 57 / 0;
        }
        return false;
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        buildSpannableString buildspannablestring = (buildSpannableString) objArr[0];
        int i = 2 % 2;
        int i2 = onCustomAction + 9;
        handleMediaPlayPauseIfPendingOnHandler = i2 % 128;
        int i3 = i2 % 2;
        AudioAttributesImplApi26Parcelizer(buildspannablestring);
        if (i3 == 0) {
            throw null;
        }
        int i4 = onCustomAction + 75;
        handleMediaPlayPauseIfPendingOnHandler = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }
}
