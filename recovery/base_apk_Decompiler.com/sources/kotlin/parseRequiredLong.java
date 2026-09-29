package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
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
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.appcompat.widget.Toolbar;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.TrainingApplication;
import com.marrow.data.models.user.PhoneNumber;
import com.marrow.ui.views.CustomTextView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.MagicModuleUseCaseImplWhenMappings;
import kotlin.Metadata;
import kotlin.applyLegacyRendererOverrides;
import kotlin.parseRequiredLong;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u001aB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0005J\u000f\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0005J\u001f\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0005J\u000f\u0010\u0018\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0018\u0010\u0005J\u000f\u0010\u0019\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0019\u0010\u0005J\u0017\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010\u0015\u001a\u00020\u001f2\u0006\u0010\r\u001a\u00020\u001c2\b\u0010\u0014\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010 J!\u0010!\u001a\u00020\u001f2\u0006\u0010\r\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u000eH\u0002¢\u0006\u0004\b#\u0010\u0005J'\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001a\u0010$J\u000f\u0010%\u001a\u00020\u000eH\u0004¢\u0006\u0004\b%\u0010\u0005J\u000f\u0010&\u001a\u00020\u000eH\u0004¢\u0006\u0004\b&\u0010\u0005R\u0016\u0010)\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010*R\u001b\u0010\u0015\u001a\u00020+8CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010,\u001a\u0004\b-\u0010.R\u0014\u0010!\u001a\u00020\u00138WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u0010'\u001a\u00020\u00138WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00100R\u0014\u00103\u001a\u00020\u00138WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00100R\u0014\u00105\u001a\u00020\u00138WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00100"}, d2 = {"Lo/parseRequiredLong;", "Lo/convertMessageToByteArray;", "Lo/parseRequiredInt;", "Lo/buildTrackEncryptionBoxes;", "<init>", "()V", "Landroidx/appcompat/widget/Toolbar;", "onCommand", "()Landroidx/appcompat/widget/Toolbar;", "", "handleMediaPlayPauseIfPendingOnHandler", "()I", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "onPlayFromUri", "onPrepare", "", "p1", "AudioAttributesCompatParcelizer", "(Ljava/lang/String;Ljava/lang/String;)V", "MediaSessionCompatResultReceiverWrapper", "setSessionImpl", "MediaSessionCompatToken", "write", "(Ljava/lang/String;)V", "Landroid/webkit/WebView;", "Landroid/net/Uri;", "p2", "", "(Landroid/webkit/WebView;Landroid/net/Uri;Ljava/lang/String;)Z", "IconCompatParcelizer", "(Ljava/lang/String;)Z", "onPrepareFromMediaId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "MediaSessionCompatQueueItem", "onPlayFromMediaId", "read", "Z", "RemoteActionCompatParcelizer", "Ljava/lang/String;", "Lo/parseInitialization;", "Lo/setSessionInfo;", "onPrepareFromSearch", "()Lo/parseInitialization;", "onPlay", "()Ljava/lang/String;", "onCustomAction", "onFastForward", "AudioAttributesImplApi26Parcelizer", "onMediaButtonEvent", "MediaBrowserCompatItemReceiver"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class parseRequiredLong extends handleChildInline<parseRequiredInt> implements buildTrackEncryptionBoxes {
    private static long MediaBrowserCompatCustomActionResultReceiver;
    private static long MediaBrowserCompatMediaItem;
    private static char MediaBrowserCompatSearchResultReceiver;
    private static int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private static char[] MediaDescriptionCompat;
    private static int MediaMetadataCompat;
    private static /* synthetic */ isResolutionNotSupported<Object>[] RemoteActionCompatParcelizer;
    private final setSessionInfo AudioAttributesCompatParcelizer = parseTrackTiming.write(this, SessionDescriptionParser.RemoteActionCompatParcelizer(), new AudioAttributesCompatParcelizer());

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private String write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private boolean RemoteActionCompatParcelizer;
    private static final byte[] $$u = {3, 113, -44, TarConstants.LF_BLK};
    private static final int $$x = 2;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$E = {106, -113, -78, 7, 61, -61, -2, -19, 47, -39, -10, -15, -2, -5, 11, -3, 11, -31, -7, -5, -2, 9, 0, -16, 35, -45, -7, 1, 8, -23, -23, -12, -6, -9, 11, 32, -38, -21, 7, -10, -3, 39, -48, -2, -7, 11, -23, 32, -21, -21, 11, -6, -11, -1, -21, 17, -17, 61, -41, -37, 15, -23, -5, -2, 42, -55, 17, -6, -15, -8, 7, -10, -3, 29, -24, -19, -4, 7, -17};
    private static final int $$F = 169;
    private static final byte[] $$j = {9, -34, 82, 56, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, 12, 3, -4, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$k = 33;
    private static int handleMediaPlayPauseIfPendingOnHandler = 1;
    private static int RatingCompat = 0;
    private static int onCustomAction = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$A(byte r7, int r8, int r9) {
        /*
            int r8 = r8 * 2
            int r8 = 103 - r8
            int r9 = r9 * 3
            int r9 = r9 + 1
            byte[] r0 = kotlin.parseRequiredLong.$$u
            int r7 = r7 * 4
            int r7 = 4 - r7
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L17
            r8 = r7
            r3 = r9
            r4 = r2
            goto L2b
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r9) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            r3 = r0[r7]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L2b:
            int r7 = -r7
            int r8 = r8 + 1
            int r7 = r7 + r3
            r3 = r4
            r6 = r8
            r8 = r7
            r7 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.parseRequiredLong.$$A(byte, int, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void o(int r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 4
            byte[] r0 = kotlin.parseRequiredLong.$$j
            int r1 = r8 + 4
            int r7 = r7 + 65
            byte[] r1 = new byte[r1]
            int r8 = r8 + 3
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r8
            r4 = r2
            goto L2a
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r6 = r6 + 1
            if (r3 != r8) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L22:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2a:
            int r7 = -r7
            int r3 = r3 + r7
            int r7 = r3 + (-1)
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.parseRequiredLong.o(int, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void p(short r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 4
            int r6 = r6 * 29
            int r6 = r6 + 82
            byte[] r0 = kotlin.parseRequiredLong.$$E
            int r1 = r7 + 23
            byte[] r1 = new byte[r1]
            int r7 = r7 + 22
            r2 = 0
            if (r0 != 0) goto L15
            r4 = r7
            r6 = r8
            r3 = r2
            goto L2c
        L15:
            r3 = r2
        L16:
            int r8 = r8 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r8
            r8 = r6
            r6 = r5
        L2c:
            int r4 = -r4
            int r8 = r8 + r4
            int r8 = r8 + (-4)
            r5 = r8
            r8 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.parseRequiredLong.p(short, int, short, java.lang.Object[]):void");
    }

    public static /* synthetic */ Object write(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i5;
        int i8 = ~(i7 | i);
        int i9 = ~i2;
        int i10 = ~i;
        int i11 = i8 | (~(i9 | i10 | i5));
        int i12 = (~(i | i9 | i5)) | (~(i10 | i7));
        int i13 = ~(i7 | i9);
        int i14 = i2 + i5 + i6 + (762713021 * i3) + (1579510587 * i4);
        int i15 = i14 * i14;
        int i16 = ((i2 * (-1846875272)) - 1480523776) + ((-1846875272) * i5) + (i11 * (-1613556599)) + (i12 * (-1613556599)) + ((-1613556599) * i13) + (834535424 * i6) + ((-750387200) * i3) + ((-523632640) * i4) + ((-1971257344) * i15);
        int i17 = ((i2 * (-1364308824)) - 1074288667) + (i5 * (-1364308824)) + (i11 * 659) + (i12 * 659) + (i13 * 659) + (i6 * (-1364308165)) + (i3 * (-893132913)) + (i4 * 986770329) + (i15 * (-1162149888));
        int i18 = i16 + (i17 * i17 * (-1529413632));
        if (i18 == 1) {
            return IconCompatParcelizer(objArr);
        }
        if (i18 == 2) {
            parseRequiredLong parserequiredlong = (parseRequiredLong) objArr[0];
            int i19 = 2 % 2;
            int i20 = RatingCompat + 19;
            onCustomAction = i20 % 128;
            int i21 = i20 % 2;
            parserequiredlong.MediaSessionCompatResultReceiverWrapper();
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
            int i22 = RatingCompat + 41;
            onCustomAction = i22 % 128;
            int i23 = i22 % 2;
            return getshowpopup;
        }
        if (i18 == 3) {
            return write(objArr);
        }
        parseRequiredLong parserequiredlong2 = (parseRequiredLong) objArr[0];
        int i24 = 2 % 2;
        int i25 = RatingCompat + 69;
        int i26 = i25 % 128;
        onCustomAction = i26;
        int i27 = i25 % 2;
        String str = parserequiredlong2.write;
        int i28 = i26 + 101;
        RatingCompat = i28 % 128;
        int i29 = i28 % 2;
        return str;
    }

    public static final /* synthetic */ void AudioAttributesCompatParcelizer(parseRequiredLong parserequiredlong) {
        int i = 2 % 2;
        int i2 = RatingCompat + 5;
        onCustomAction = i2 % 128;
        int i3 = i2 % 2;
        parserequiredlong.MediaSessionCompatResultReceiverWrapper();
        if (i3 == 0) {
            throw null;
        }
        int i4 = RatingCompat + 1;
        onCustomAction = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ void IconCompatParcelizer(parseRequiredLong parserequiredlong) {
        int i = 2 % 2;
        int i2 = onCustomAction + 77;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        parserequiredlong.setSessionImpl();
        int i4 = onCustomAction + 67;
        RatingCompat = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ parseInitialization RemoteActionCompatParcelizer(parseRequiredLong parserequiredlong) {
        int i = 2 % 2;
        int i2 = RatingCompat + 21;
        onCustomAction = i2 % 128;
        int i3 = i2 % 2;
        parseInitialization parseinitializationOnPrepareFromSearch = parserequiredlong.onPrepareFromSearch();
        int i4 = RatingCompat + 41;
        onCustomAction = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 62 / 0;
        }
        return parseinitializationOnPrepareFromSearch;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final parseInitialization onPrepareFromSearch() {
        int i = 2 % 2;
        int i2 = RatingCompat + 55;
        onCustomAction = i2 % 128;
        int i3 = i2 % 2;
        parseInitialization parseinitialization = (parseInitialization) this.AudioAttributesCompatParcelizer.read(this, RemoteActionCompatParcelizer[0]);
        int i4 = RatingCompat + 91;
        onCustomAction = i4 % 128;
        int i5 = i4 % 2;
        return parseinitialization;
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        parseRequiredLong parserequiredlong = (parseRequiredLong) objArr[0];
        int i = 2 % 2;
        int i2 = RatingCompat + 15;
        onCustomAction = i2 % 128;
        int i3 = i2 % 2;
        Toolbar toolbar = parserequiredlong.onPrepareFromSearch().AudioAttributesImplApi21Parcelizer.write;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(toolbar, "");
        int i4 = RatingCompat + 27;
        onCustomAction = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 55 / 0;
        }
        return toolbar;
    }

    public static final class AudioAttributesCompatParcelizer implements getAnswerMap<parseRequiredLong, parseInitialization> {
        private static parseInitialization write(parseRequiredLong parserequiredlong) {
            toMagicModuleMetaRepoModel.write(parserequiredlong, "");
            return parseInitialization.write(SessionDescriptionParser.AudioAttributesCompatParcelizer(parserequiredlong));
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [o.getApplicationLabel, o.parseInitialization] */
        @Override // kotlin.getAnswerMap
        public final /* synthetic */ parseInitialization invoke(parseRequiredLong parserequiredlong) {
            return write(parserequiredlong);
        }
    }

    public static final class read implements applyLegacyRendererOverrides.RemoteActionCompatParcelizer {
        read() {
        }

        @Override // o.applyLegacyRendererOverrides.RemoteActionCompatParcelizer
        public final void write(PhoneNumber phoneNumber, String str) {
            toMagicModuleMetaRepoModel.write(phoneNumber, "");
            toMagicModuleMetaRepoModel.write(str, "");
            ((parseRequiredInt) parseRequiredLong.this.getMPresenter()).IconCompatParcelizer(phoneNumber, str);
        }
    }

    private static void n(char c, int i, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        DownloadService downloadService = new DownloadService();
        long[] jArr = new long[i];
        downloadService.write = 0;
        while (downloadService.write < i) {
            int i4 = downloadService.write;
            try {
                Object[] objArr2 = {Integer.valueOf(MediaDescriptionCompat[i2 + i4])};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1659892375);
                if (objRemoteActionCompatParcelizer == null) {
                    char c2 = (char) (36621 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 2340;
                    int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 28;
                    byte b = (byte) ($$x - 2);
                    byte b2 = (byte) (b + 1);
                    objRemoteActionCompatParcelizer = startForeground.read(c2, iMakeMeasureSpec, windowTouchSlop, 480654850, false, $$A(b, b2, (byte) (b2 - 1)), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(MediaBrowserCompatMediaItem), Integer.valueOf(c)};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(955774634);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) TextUtils.indexOf("", ""), Color.rgb(0, 0, 0) + 16786917, (ViewConfiguration.getPressedStateDuration() >> 16) + 26, 1186869823, false, "d", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i4] = ((Long) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {downloadService, downloadService};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-452087292);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 23783 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 32 - ((byte) KeyEvent.getModifierMetaStateMask()), -1690012015, false, "b", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                int i5 = $10 + 83;
                $11 = i5 % 128;
                int i6 = i5 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i];
        downloadService.write = 0;
        while (downloadService.write < i) {
            int i7 = $11 + 77;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            cArr[downloadService.write] = (char) jArr[downloadService.write];
            Object[] objArr5 = {downloadService, downloadService};
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-452087292);
            if (objRemoteActionCompatParcelizer4 == null) {
                objRemoteActionCompatParcelizer4 = startForeground.read((char) (Process.myPid() >> 22), 23784 - View.resolveSize(0, 0), TextUtils.lastIndexOf("", '0', 0, 0) + 34, -1690012015, false, "b", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr);
    }

    private static void m(char[] cArr, char[] cArr2, int i, char[] cArr3, char c, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        notifyDownloadRemoved notifydownloadremoved = new notifyDownloadRemoved();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr3.length;
        char[] cArr6 = new char[length3];
        notifydownloadremoved.AudioAttributesCompatParcelizer = 0;
        int i5 = $11 + 83;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        while (notifydownloadremoved.AudioAttributesCompatParcelizer < length3) {
            int i7 = $11 + 49;
            $10 = i7 % 128;
            int i8 = i7 % i3;
            try {
                Object[] objArr2 = {notifydownloadremoved};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(718099963);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) KeyEvent.normalizeMetaState(0), 22747 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 36 - View.MeasureSpec.getSize(0), 1417974126, false, "j", new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {notifydownloadremoved};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(247211480);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b = (byte) ($$x - 2);
                    byte b2 = b;
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (Gravity.getAbsoluteGravity(0, 0) + 31369), 2721 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 38, 1895162189, false, $$A(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {notifydownloadremoved, Integer.valueOf(cArr4[notifydownloadremoved.AudioAttributesCompatParcelizer % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1336303982);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (TextUtils.lastIndexOf("", '0', 0) + 1), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 15712, 64 - TextUtils.indexOf("", "", 0, 0), -837789177, false, "f", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1602228082);
                if (objRemoteActionCompatParcelizer4 == null) {
                    i2 = 2;
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (40976 - TextUtils.getOffsetAfter("", 0)), 6121 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), View.combineMeasuredStates(0, 0) + 29, -566873061, false, "m", new Class[]{Integer.TYPE, Integer.TYPE});
                } else {
                    i2 = 2;
                }
                cArr5[iIntValue2] = ((Character) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = notifydownloadremoved.write;
                cArr6[notifydownloadremoved.AudioAttributesCompatParcelizer] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[notifydownloadremoved.AudioAttributesCompatParcelizer])) ^ (MediaBrowserCompatCustomActionResultReceiver ^ (-3498762522182953692L))) ^ ((long) ((int) (((long) MediaMetadataCompat) ^ (-3498762522182953692L))))) ^ ((long) ((char) (((long) MediaBrowserCompatSearchResultReceiver) ^ (-3498762522182953692L)))));
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

    public static final class IconCompatParcelizer extends WebChromeClient {
        private /* synthetic */ MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer write;

        IconCompatParcelizer(MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer iconCompatParcelizer) {
            this.write = iconCompatParcelizer;
        }

        @Override // android.webkit.WebChromeClient
        public final void onProgressChanged(WebView webView, int i) {
            super.onProgressChanged(webView, i);
            Object[] objArr = {parseRequiredLong.this};
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(parseRequiredLong.write(getModuleMessage.IconCompatParcelizer(), -786667759, getModuleMessage.IconCompatParcelizer(), getModuleMessage.IconCompatParcelizer(), 786667759, getModuleMessage.IconCompatParcelizer(), objArr), (Object) "image_attribution")) {
                this.write.AudioAttributesCompatParcelizer++;
                if (this.write.AudioAttributesCompatParcelizer == 2 && i == 100) {
                    parseRequiredLong.AudioAttributesCompatParcelizer(parseRequiredLong.this);
                }
            }
        }
    }

    public static final class RemoteActionCompatParcelizer extends WebViewClient {
        private /* synthetic */ String write;

        RemoteActionCompatParcelizer(String str) {
            this.write = str;
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            toMagicModuleMetaRepoModel.write(webView, "");
            toMagicModuleMetaRepoModel.write(str, "");
            super.onPageFinished(webView, str);
            parseRequiredLong.IconCompatParcelizer(parseRequiredLong.this);
            if (TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(str, "file:///android_asset/#")) {
                return;
            }
            ProgressBar progressBar = parseRequiredLong.RemoteActionCompatParcelizer(parseRequiredLong.this).write;
            final parseRequiredLong parserequiredlong = parseRequiredLong.this;
            progressBar.postDelayed(new Runnable() { // from class: o.SsManifestParserProtectionParser
                @Override // java.lang.Runnable
                public final void run() {
                    parseRequiredLong.RemoteActionCompatParcelizer.write(parserequiredlong);
                }
            }, 1200L);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void write(parseRequiredLong parserequiredlong) {
            if (parserequiredlong.AudioAttributesImplApi21Parcelizer()) {
                return;
            }
            parserequiredlong.onPlayFromMediaId();
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            toMagicModuleMetaRepoModel.write(webView, "");
            buildResolutionString.IconCompatParcelizer("webview shouldOverrideUrlLoading", String.valueOf(str));
            if (str != null) {
                return parseRequiredLong.this.AudioAttributesCompatParcelizer(webView, Uri.parse(str), str);
            }
            return false;
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            toMagicModuleMetaRepoModel.write(webView, "");
            toMagicModuleMetaRepoModel.write(webResourceRequest, "");
            return parseRequiredLong.this.AudioAttributesCompatParcelizer(webView, webResourceRequest.getUrl(), this.write);
        }
    }

    @Override // kotlin.handleChildInline, kotlin.convertMessageToByteArray, com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onCreate(Bundle p0) {
        Object[] objArr;
        int i = 2 % 2;
        Object[] objArr2 = new Object[1];
        m(new char[]{0, 0, 0, 0}, new char[]{17855, 31912, 18261, 19383}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35, new char[]{26111, 27157, 20343, 44110, 39273, 27846, 43077, 62714, 54366, 60008, 64334, 12239, 14398, 28056, 25816, 62813, 54206, 25649}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 46909), objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        m(new char[]{0, 0, 0, 0}, new char[]{22077, 62131, 10454, 52444}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 688737460, new char[]{57602, 39233, 16017, 53669, 59725}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(3) + 56245), objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                int i2 = RatingCompat + 27;
                onCustomAction = i2 % 128;
                int i3 = i2 % 2;
                Object[] objArr4 = new Object[1];
                m(new char[]{0, 0, 0, 0}, new char[]{9236, 56258, 2364, 6969}, Color.red(0), new char[]{49148, 60996, 9291, 13487, 43166, 25598, 55388, 17403, 65437, 26229, 12370, 19425, 51259, 29647, 43185, 36563, 36151, 15809, 17303, 41777, 24923, 41719, 18476, 25521, 57490, 60453}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 14566), objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                n((char) (View.resolveSizeAndState(0, 0, 0) + 53617), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) - 96, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) - 111, objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            if (baseContext != null) {
                try {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (4535 - (Process.myPid() >> 22)), 6055 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 42 - TextUtils.getTrimmedLength(""), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr6 = new Object[1];
                    n((char) ((ViewConfiguration.getTouchSlop() >> 8) + 28695), Color.blue(0) + 48, 18 - TextUtils.indexOf("", "", 0, 0), objArr6);
                    String str = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    n((char) Drawable.resolveOpacity(0, 0), ExpandableListView.getPackedPositionType(0L) + 64, 66 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), objArr7);
                    String str2 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    n((char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 12609), 64 - View.resolveSize(0, 0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) + 21, objArr8);
                    String str3 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    n((char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() - 4), (ViewConfiguration.getScrollBarSize() >> 8) + 67, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(0) + 157, objArr9);
                    String str4 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    m(new char[]{0, 0, 0, 0}, new char[]{28199, 56984, 26095, 39060}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 10, new char[]{64886, 8432, 9812, 9158, 25489, 60784}, (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 37988), objArr10);
                    String str5 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    n((char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 42626), ExpandableListView.getPackedPositionChild(0L) + 37, 261 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr11);
                    Object[] objArr12 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr11[0], 86400};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(448819875);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) TextUtils.indexOf("", "", 0, 0), 6029 - Process.getGidForName(""), TextUtils.indexOf("", "", 0) + 24, 1686746678, false, "AudioAttributesCompatParcelizer", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
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
            char c = (char) (13183 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)));
            int offsetBefore = TextUtils.getOffsetBefore("", 0) + 1649;
            int deadChar = KeyEvent.getDeadChar(0, 0) + 26;
            Object[] objArr13 = new Object[1];
            o(r5[53], r5[140], (byte) ($$j[61] - 1), objArr13);
            objRemoteActionCompatParcelizer3 = startForeground.read(c, offsetBefore, deadChar, -133433128, false, (String) objArr13[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer3).getLong(null) != -1) {
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer4 == null) {
                char c2 = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 13182);
                int i4 = 1650 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                int iRed = Color.red(0) + 26;
                byte[] bArr = $$j;
                Object[] objArr14 = new Object[1];
                o(bArr[65], bArr[5], bArr[8], objArr14);
                objRemoteActionCompatParcelizer4 = startForeground.read(c2, i4, iRed, -1033747278, false, (String) objArr14[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer4).get(null);
        } else {
            Object[] objArr15 = new Object[1];
            m(new char[]{0, 0, 0, 0}, new char[]{917, 11081, 38063, 15137}, (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), new char[]{36334, 24573, 45107, 44497, 50018, 27210, 40732, 62329, 54124, 18135, 56133, 25829, 64447, 45146, 4115, 39791}, (char) ((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 8595), objArr15);
            Class<?> cls3 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            m(new char[]{0, 0, 0, 0}, new char[]{30271, 56021, 49082, 12487}, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) - 1, new char[]{52407, 10535, 10023, 14958, 4765, 11332, 40796, 42055, 21936, 59134, 6118, 44538, 31860, 32503, 18533, 59462}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(2) + 51099), objArr16);
            try {
                Object[] objArr17 = {Integer.valueOf(((Integer) cls3.getMethod((String) objArr16[0], Object.class).invoke(null, this)).intValue()), 0, -1128842409};
                byte[] bArr2 = $$E;
                Object[] objArr18 = new Object[1];
                p(bArr2[27], (byte) (-bArr2[76]), bArr2[53], objArr18);
                Class<?> cls4 = Class.forName((String) objArr18[0]);
                Object[] objArr19 = new Object[1];
                p(bArr2[22], (byte) (-bArr2[13]), (byte) 25, objArr19);
                objArr = (Object[]) cls4.getMethod((String) objArr19[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr17);
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer5 == null) {
                    char cBlue = (char) (Color.blue(0) + 13183);
                    int scrollDefaultDelay = 1649 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                    int i5 = 27 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                    byte[] bArr3 = $$j;
                    Object[] objArr20 = new Object[1];
                    o(bArr3[65], bArr3[5], bArr3[8], objArr20);
                    objRemoteActionCompatParcelizer5 = startForeground.read(cBlue, scrollDefaultDelay, i5, -1033747278, false, (String) objArr20[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer5).set(null, objArr);
                try {
                    Object[] objArr21 = new Object[1];
                    m(new char[]{0, 0, 0, 0}, new char[]{52331, 40811, 32104, 24453}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(1) - 49, new char[]{38917, 48461, 18301, 50029, 49357, 28895, 26683, 10088, 14599, 60629, 40860, 6458, 21035, 265, 27542, 32338, 16840, 59994, 31290, 51682, 31889, 13055}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(2) - 36), objArr21);
                    Class<?> cls5 = Class.forName((String) objArr21[0]);
                    Object[] objArr22 = new Object[1];
                    n((char) (KeyEvent.normalizeMetaState(0) + 27398), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 11, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 287, objArr22);
                    long jLongValue = ((Long) cls5.getDeclaredMethod((String) objArr22[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer6 == null) {
                        char c3 = (char) (13184 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)));
                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 1650;
                        int i6 = 26 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                        byte[] bArr4 = $$j;
                        Object[] objArr23 = new Object[1];
                        o((short) 75, bArr4[5], bArr4[8], objArr23);
                        objRemoteActionCompatParcelizer6 = startForeground.read(c3, iIndexOf, i6, 54351865, false, (String) objArr23[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer7 == null) {
                        char c4 = (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 13183);
                        int iArgb = Color.argb(0, 0, 0, 0) + 1649;
                        int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 26;
                        Object[] objArr24 = new Object[1];
                        o(r7[53], r7[140], (byte) ($$j[61] - 1), objArr24);
                        objRemoteActionCompatParcelizer7 = startForeground.read(c4, iArgb, keyRepeatDelay, -133433128, false, (String) objArr24[0], null);
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
        int i7 = ((int[]) objArr[3])[0];
        int i8 = ((int[]) objArr[2])[0];
        if (i8 != i7) {
            long j = -1;
            long j2 = 0;
            long j3 = (((((long) 0) << 32) | (j - ((j >> 63) << 32))) & ((long) (i8 ^ i7))) | (((long) 2) << 32) | (j2 - ((j2 >> 63) << 32));
            Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(-1407079962);
            if (objRemoteActionCompatParcelizer8 == null) {
                objRemoteActionCompatParcelizer8 = startForeground.read((char) (4535 - (ViewConfiguration.getPressedStateDuration() >> 16)), AndroidCharacter.getMirror('0') + 6006, 42 - (ViewConfiguration.getWindowTouchSlop() >> 8), -764908173, false, "IconCompatParcelizer", new Class[0]);
            }
            Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer8).invoke(null, null);
            try {
                Object[] objArr25 = {2110559924, Long.valueOf(j3), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
                Class cls6 = (Class) startForeground.IconCompatParcelizer((char) (ViewConfiguration.getTouchSlop() >> 8), View.combineMeasuredStates(0, 0) + 6030, 24 - (ViewConfiguration.getJumpTapTimeout() >> 16));
                Object[] objArr26 = new Object[1];
                p(r2[22], (byte) (-$$E[13]), (byte) 25, objArr26);
                cls6.getMethod((String) objArr26[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke2, objArr25);
                int i9 = onCustomAction + 85;
                RatingCompat = i9 % 128;
                int i10 = i9 % 2;
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        super.onCreate(p0);
        onPrepareFromSearch().RemoteActionCompatParcelizer.getSettings().setJavaScriptEnabled(true);
        if (getIntent().getStringExtra("source") != null) {
            this.write = getIntent().getStringExtra("source");
        }
        CustomTextView customTextView = onPrepareFromSearch().IconCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView, "");
        RemoteActionCompatParcelizer(customTextView, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.parseBoolean
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return parseRequiredLong.read(this.write);
            }
        });
        MediaSessionCompatResultReceiverWrapper();
    }

    @Override // kotlin.buildTrackEncryptionBoxes
    public final void onPlayFromUri() {
        int i = 2 % 2;
        applyLegacyRendererOverrides applylegacyrendereroverrides = new applyLegacyRendererOverrides(this);
        applylegacyrendereroverrides.RemoteActionCompatParcelizer(new read());
        RemoteActionCompatParcelizer();
        this.AudioAttributesImplApi21Parcelizer = applylegacyrendereroverrides;
        this.AudioAttributesImplApi21Parcelizer.show();
        int i2 = RatingCompat + 37;
        onCustomAction = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // kotlin.buildTrackEncryptionBoxes
    public final void onPrepare() {
        int i = 2 % 2;
        getLastChunkDurationUs getlastchunkdurationus = new getLastChunkDurationUs(this, 0, 2, null);
        String string = getString(R.string.text_already_callback_active);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        getlastchunkdurationus.read(string);
        getlastchunkdurationus.show();
        int i2 = onCustomAction + 67;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // kotlin.buildTrackEncryptionBoxes
    public final void AudioAttributesCompatParcelizer(String p0, String p1) {
        int i = 2 % 2;
        int i2 = onCustomAction + 73;
        RatingCompat = i2 % 128;
        if (i2 % 2 == 0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            String string = getString(R.string.support_email);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
            scheduleUpdate.AudioAttributesCompatParcelizer(this, string, p0, p1);
            return;
        }
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        String string2 = getString(R.string.support_email);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
        scheduleUpdate.AudioAttributesCompatParcelizer(this, string2, p0, p1);
        int i3 = 29 / 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003f A[PHI: r1
      0x003f: PHI (r1v6 int) = (r1v5 int), (r1v9 int) binds: [B:8:0x003d, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void MediaSessionCompatResultReceiverWrapper() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = kotlin.parseRequiredLong.RatingCompat
            int r1 = r1 + 15
            int r2 = r1 % 128
            kotlin.parseRequiredLong.onCustomAction = r2
            int r1 = r1 % r0
            java.lang.String r2 = "extra_web_content"
            java.lang.String r3 = "extra_web_type"
            if (r1 != 0) goto L29
            r5.setSessionImpl()
            android.content.Intent r1 = r5.getIntent()
            r4 = 1
            int r1 = r1.getIntExtra(r3, r4)
            android.content.Intent r3 = r5.getIntent()
            java.lang.String r2 = r3.getStringExtra(r2)
            if (r2 != 0) goto L4f
            goto L3f
        L29:
            r5.setSessionImpl()
            android.content.Intent r1 = r5.getIntent()
            r4 = 0
            int r1 = r1.getIntExtra(r3, r4)
            android.content.Intent r3 = r5.getIntent()
            java.lang.String r2 = r3.getStringExtra(r2)
            if (r2 != 0) goto L4f
        L3f:
            int r2 = kotlin.parseRequiredLong.onCustomAction
            int r2 = r2 + 33
            int r3 = r2 % 128
            kotlin.parseRequiredLong.RatingCompat = r3
            int r2 = r2 % r0
            if (r2 != 0) goto L4d
            java.lang.String r2 = ""
            goto L4f
        L4d:
            r5 = 0
            throw r5
        L4f:
            if (r1 == 0) goto L68
            int r2 = kotlin.parseRequiredLong.onCustomAction
            int r2 = r2 + 77
            int r3 = r2 % 128
            kotlin.parseRequiredLong.RatingCompat = r3
            int r2 = r2 % r0
            if (r2 == 0) goto L60
            r0 = 5
            if (r1 == r0) goto L64
            goto L63
        L60:
            r0 = 4
            if (r1 == r0) goto L64
        L63:
            return
        L64:
            r5.onPrepareFromMediaId()
            return
        L68:
            r5.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.parseRequiredLong.MediaSessionCompatResultReceiverWrapper():void");
    }

    private final void setSessionImpl() {
        FrameLayout frameLayout;
        int i;
        int i2 = 2 % 2;
        int i3 = onCustomAction + 117;
        RatingCompat = i3 % 128;
        if (i3 % 2 != 0) {
            frameLayout = onPrepareFromSearch().AudioAttributesCompatParcelizer;
            i = 81;
        } else {
            frameLayout = onPrepareFromSearch().AudioAttributesCompatParcelizer;
            i = 8;
        }
        frameLayout.setVisibility(i);
        this.RemoteActionCompatParcelizer = false;
    }

    private final void MediaSessionCompatToken() {
        int i = 2 % 2;
        int i2 = onCustomAction + 11;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        this.RemoteActionCompatParcelizer = true;
        onPrepareFromSearch().AudioAttributesCompatParcelizer.setVisibility(0);
        onPrepareFromSearch().read.setText(getString(R.string.text_error_possible_reason_no_internet));
    }

    private final void write(String p0) {
        int i = 2 % 2;
        if (!aC_()) {
            int i2 = onCustomAction + 71;
            RatingCompat = i2 % 128;
            if (i2 % 2 == 0) {
                MediaSessionCompatToken();
                return;
            }
            MediaSessionCompatToken();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        write(getModuleMessage.IconCompatParcelizer(), 31511723, getModuleMessage.IconCompatParcelizer(), getModuleMessage.IconCompatParcelizer(), -31511720, getModuleMessage.IconCompatParcelizer(), new Object[]{this});
        onPrepareFromSearch().RemoteActionCompatParcelizer.loadUrl(p0);
        onPrepareFromSearch().RemoteActionCompatParcelizer.getSettings().setCacheMode(2);
        onPrepareFromSearch().RemoteActionCompatParcelizer.setWebChromeClient(new IconCompatParcelizer(new MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer()));
        onPrepareFromSearch().RemoteActionCompatParcelizer.setWebViewClient(new RemoteActionCompatParcelizer(p0));
        int i3 = onCustomAction + 13;
        RatingCompat = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean AudioAttributesCompatParcelizer(android.webkit.WebView r8, android.net.Uri r9, java.lang.String r10) {
        /*
            Method dump skipped, instruction units count: 291
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.parseRequiredLong.AudioAttributesCompatParcelizer(android.webkit.WebView, android.net.Uri, java.lang.String):boolean");
    }

    private boolean IconCompatParcelizer(String str) {
        int i = 2 % 2;
        int i2 = onCustomAction + 75;
        RatingCompat = i2 % 128;
        if (i2 % 2 != 0) {
            toMagicModuleMetaRepoModel.write(str, "");
            joinWithSeparator.write(this, str);
            throw null;
        }
        toMagicModuleMetaRepoModel.write(str, "");
        boolean zWrite = joinWithSeparator.write(this, str);
        int i3 = RatingCompat + 59;
        onCustomAction = i3 % 128;
        int i4 = i3 % 2;
        return zWrite;
    }

    private final void onPrepareFromMediaId() {
        int i = 2 % 2;
        if (aC_()) {
            return;
        }
        int i2 = RatingCompat + 11;
        onCustomAction = i2 % 128;
        int i3 = i2 % 2;
        MediaSessionCompatToken();
        int i4 = RatingCompat + 27;
        onCustomAction = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // kotlin.buildTrackEncryptionBoxes
    public final String onPlay() {
        int i = 2 % 2;
        String str = Build.MANUFACTURER;
        String str2 = Build.DEVICE;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" - ");
        sb.append(str2);
        String string = sb.toString();
        int i2 = RatingCompat + 35;
        onCustomAction = i2 % 128;
        if (i2 % 2 != 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // kotlin.buildTrackEncryptionBoxes
    public final String onCustomAction() {
        int i = 2 % 2;
        int i2 = onCustomAction + 105;
        RatingCompat = i2 % 128;
        if (i2 % 2 == 0) {
            return "12.0.0";
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // kotlin.buildTrackEncryptionBoxes
    public final String onFastForward() {
        int i = 2 % 2;
        int i2 = RatingCompat;
        int i3 = i2 + 91;
        onCustomAction = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 59;
        onCustomAction = i5 % 128;
        if (i5 % 2 != 0) {
            return "496";
        }
        throw null;
    }

    @Override // kotlin.buildTrackEncryptionBoxes
    public final String onMediaButtonEvent() {
        int i = 2 % 2;
        int i2 = RatingCompat + 73;
        onCustomAction = i2 % 128;
        int i3 = i2 % 2;
        String str = Build.VERSION.RELEASE;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        int i4 = onCustomAction + 71;
        RatingCompat = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    @Override // kotlin.buildTrackEncryptionBoxes
    public final void write(String p0, String p1, String p2) {
        int i = 2 % 2;
        int i2 = onCustomAction + 53;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        scheduleUpdate.AudioAttributesCompatParcelizer(this, p0, p1, p2);
        int i4 = RatingCompat + 77;
        onCustomAction = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        parseRequiredLong parserequiredlong = (parseRequiredLong) objArr[0];
        int i = 2 % 2;
        int i2 = onCustomAction + 65;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        ProgressBar progressBar = parserequiredlong.onPrepareFromSearch().write;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar, "");
        PlayerControlViewExternalSyntheticLambda1.write(progressBar);
        if (i3 == 0) {
            return null;
        }
        throw null;
    }

    protected final void onPlayFromMediaId() {
        int i = 2 % 2;
        int i2 = onCustomAction + 45;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        ProgressBar progressBar = onPrepareFromSearch().write;
        if (i3 == 0) {
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar, "");
            PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(progressBar);
        } else {
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar, "");
            PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(progressBar);
            int i4 = 45 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00ae  */
    @Override // kotlin.handleChildInline, kotlin.convertMessageToByteArray, com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onResume() {
        /*
            Method dump skipped, instruction units count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.parseRequiredLong.onResume():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // kotlin.handleChildInline, kotlin.convertMessageToByteArray, com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onPause() {
        /*
            Method dump skipped, instruction units count: 420
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.parseRequiredLong.onPause():void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(39:0|2|(2:(2:7|(1:13)(1:12))(1:14)|(9:16|255|17|(1:19)|20|21|22|(1:24)|25)(1:29))(0)|30|260|(25:32|(3:34|(4:36|39|40|(1:42)(1:43))|44)(2:37|(3:39|40|(0)(0))(1:44))|81|275|82|(1:84)|85|(3:87|(1:89)|90)(19:91|92|267|93|(1:95)|96|97|261|98|(1:100)|101|102|103|(1:105)|106|(1:108)|109|(1:111)|112)|113|(4:116|(13:283|118|(3:120|(3:123|124|121)|287)|125|278|126|(1:128)|129|130|131|269|132|286)(1:285)|284|114)|282|167|(1:169)|170|(3:172|(1:174)|175)(13:177|276|178|179|(1:181)|182|265|183|184|(1:186)|187|(1:189)|190)|176|191|(6:193|194|(1:196)|197|198|199)|200|(1:202)|203|(3:205|(1:207)|208)(14:210|211|(1:213)|214|215|(1:217)|218|256|219|220|(1:222)|223|(1:225)|226)|209|227|(7:229|230|(1:232)|233|234|235|236)(1:288))|48|271|49|(1:51)|52|263|53|(1:55)|56|81|275|82|(0)|85|(0)(0)|113|(1:114)|282|167|(0)|170|(0)(0)|176|191|(0)|200|(0)|203|(0)(0)|209|227|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0b98, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0b99, code lost:
    
        r8 = new java.lang.Object[1];
        n((char) (((android.content.Context) java.lang.Class.forName(r28).getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 20228), ((android.content.Context) java.lang.Class.forName(r28).getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 24, ((android.content.Context) java.lang.Class.forName(r28).getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) + 198, r8);
        r5 = (java.lang.String) r8[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0bff, code lost:
    
        r4 = new java.io.ByteArrayOutputStream();
        r6 = new java.io.PrintStream(r4);
        r0.printStackTrace(r6);
        r6.close();
        r2 = r4.toString(org.apache.commons.compress.utils.CharsetNames.UTF_8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0c16, code lost:
    
        r2 = java.lang.String.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0c1a, code lost:
    
        r4 = new java.util.ArrayList(2);
        r4.add(r2);
        r4.add(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0c29, code lost:
    
        r2 = kotlin.startForeground.RemoteActionCompatParcelizer(-1407079962);
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0c2d, code lost:
    
        if (r2 == null) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0c2f, code lost:
    
        r2 = kotlin.startForeground.read((char) (android.graphics.Color.red(0) + 4535), android.text.TextUtils.lastIndexOf("", '0') + 6055, 42 - android.text.TextUtils.getOffsetAfter("", 0), -764908173, false, "IconCompatParcelizer", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0c58, code lost:
    
        r2 = ((java.lang.reflect.Method) r2).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0c64, code lost:
    
        r7 = new java.lang.Object[]{1857563279, 81604378625L, r4, com.marrow.TrainingApplication.RemoteActionCompatParcelizer(), false};
        r4 = (java.lang.Class) kotlin.startForeground.IconCompatParcelizer((char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1)) + 6031, 25 - (android.os.SystemClock.uptimeMillis() > 0 ? 1 : (android.os.SystemClock.uptimeMillis() == 0 ? 0 : -1)));
        r10 = new java.lang.Object[1];
        p(r5[22], (byte) (-kotlin.parseRequiredLong.$$E[13]), (byte) 25, r10);
        r4.getMethod((java.lang.String) r10[0], java.lang.Integer.TYPE, java.lang.Long.TYPE, java.util.List.class, java.lang.String.class, java.lang.Boolean.TYPE).invoke(r2, r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0a69 A[Catch: all -> 0x0b98, TryCatch #11 {all -> 0x0b98, blocks: (B:82:0x061f, B:84:0x0625, B:85:0x0666, B:87:0x0673, B:89:0x067c, B:90:0x06c5, B:113:0x0a5f, B:114:0x0a63, B:116:0x0a69, B:118:0x0a80, B:121:0x0a8d, B:123:0x0a90, B:130:0x0af4, B:136:0x0b72, B:138:0x0b78, B:139:0x0b79, B:141:0x0b7b, B:143:0x0b82, B:144:0x0b83, B:91:0x06d0, B:103:0x08ba, B:105:0x08c0, B:106:0x0901, B:108:0x09bf, B:109:0x0a03, B:111:0x0a19, B:112:0x0a59, B:146:0x0b85, B:148:0x0b8c, B:149:0x0b8d, B:151:0x0b8f, B:153:0x0b96, B:154:0x0b97, B:98:0x082f, B:100:0x0844, B:101:0x08ae, B:93:0x07e2, B:95:0x07f4, B:96:0x0828, B:132:0x0af9, B:126:0x0abb, B:128:0x0ac1, B:129:0x0aed), top: B:275:0x061f, outer: #0, inners: #4, #7, #8, #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0ceb  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0d39  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0d89  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x109b  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x1179  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x11be  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x121e  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x14fd  */
    /* JADX WARN: Removed duplicated region for block: B:288:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0625 A[Catch: all -> 0x0b98, TryCatch #11 {all -> 0x0b98, blocks: (B:82:0x061f, B:84:0x0625, B:85:0x0666, B:87:0x0673, B:89:0x067c, B:90:0x06c5, B:113:0x0a5f, B:114:0x0a63, B:116:0x0a69, B:118:0x0a80, B:121:0x0a8d, B:123:0x0a90, B:130:0x0af4, B:136:0x0b72, B:138:0x0b78, B:139:0x0b79, B:141:0x0b7b, B:143:0x0b82, B:144:0x0b83, B:91:0x06d0, B:103:0x08ba, B:105:0x08c0, B:106:0x0901, B:108:0x09bf, B:109:0x0a03, B:111:0x0a19, B:112:0x0a59, B:146:0x0b85, B:148:0x0b8c, B:149:0x0b8d, B:151:0x0b8f, B:153:0x0b96, B:154:0x0b97, B:98:0x082f, B:100:0x0844, B:101:0x08ae, B:93:0x07e2, B:95:0x07f4, B:96:0x0828, B:132:0x0af9, B:126:0x0abb, B:128:0x0ac1, B:129:0x0aed), top: B:275:0x061f, outer: #0, inners: #4, #7, #8, #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0673 A[Catch: all -> 0x0b98, TryCatch #11 {all -> 0x0b98, blocks: (B:82:0x061f, B:84:0x0625, B:85:0x0666, B:87:0x0673, B:89:0x067c, B:90:0x06c5, B:113:0x0a5f, B:114:0x0a63, B:116:0x0a69, B:118:0x0a80, B:121:0x0a8d, B:123:0x0a90, B:130:0x0af4, B:136:0x0b72, B:138:0x0b78, B:139:0x0b79, B:141:0x0b7b, B:143:0x0b82, B:144:0x0b83, B:91:0x06d0, B:103:0x08ba, B:105:0x08c0, B:106:0x0901, B:108:0x09bf, B:109:0x0a03, B:111:0x0a19, B:112:0x0a59, B:146:0x0b85, B:148:0x0b8c, B:149:0x0b8d, B:151:0x0b8f, B:153:0x0b96, B:154:0x0b97, B:98:0x082f, B:100:0x0844, B:101:0x08ae, B:93:0x07e2, B:95:0x07f4, B:96:0x0828, B:132:0x0af9, B:126:0x0abb, B:128:0x0ac1, B:129:0x0aed), top: B:275:0x061f, outer: #0, inners: #4, #7, #8, #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x06d0 A[Catch: all -> 0x0b98, TRY_LEAVE, TryCatch #11 {all -> 0x0b98, blocks: (B:82:0x061f, B:84:0x0625, B:85:0x0666, B:87:0x0673, B:89:0x067c, B:90:0x06c5, B:113:0x0a5f, B:114:0x0a63, B:116:0x0a69, B:118:0x0a80, B:121:0x0a8d, B:123:0x0a90, B:130:0x0af4, B:136:0x0b72, B:138:0x0b78, B:139:0x0b79, B:141:0x0b7b, B:143:0x0b82, B:144:0x0b83, B:91:0x06d0, B:103:0x08ba, B:105:0x08c0, B:106:0x0901, B:108:0x09bf, B:109:0x0a03, B:111:0x0a19, B:112:0x0a59, B:146:0x0b85, B:148:0x0b8c, B:149:0x0b8d, B:151:0x0b8f, B:153:0x0b96, B:154:0x0b97, B:98:0x082f, B:100:0x0844, B:101:0x08ae, B:93:0x07e2, B:95:0x07f4, B:96:0x0828, B:132:0x0af9, B:126:0x0abb, B:128:0x0ac1, B:129:0x0aed), top: B:275:0x061f, outer: #0, inners: #4, #7, #8, #13 }] */
    @Override // kotlin.handleChildInline, kotlin.convertMessageToByteArray, com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r42) {
        /*
            Method dump skipped, instruction units count: 6086
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.parseRequiredLong.attachBaseContext(android.content.Context):void");
    }

    public static /* synthetic */ getShowPopup read(parseRequiredLong parserequiredlong) {
        int i = 2 % 2;
        int i2 = RatingCompat + 39;
        onCustomAction = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {parserequiredlong};
        int iIconCompatParcelizer = getModuleMessage.IconCompatParcelizer();
        int iIconCompatParcelizer2 = getModuleMessage.IconCompatParcelizer();
        int iIconCompatParcelizer3 = getModuleMessage.IconCompatParcelizer();
        int iIconCompatParcelizer4 = getModuleMessage.IconCompatParcelizer();
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        getShowPopup getshowpopup = (getShowPopup) write(iIconCompatParcelizer, -358987276, iIconCompatParcelizer3, iIconCompatParcelizer4, 358987278, iIconCompatParcelizer2, objArr);
        int i4 = RatingCompat + 85;
        onCustomAction = i4 % 128;
        int i5 = i4 % 2;
        return getshowpopup;
    }

    static {
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = 0;
        onPlayFromSearch();
        RemoteActionCompatParcelizer = new isResolutionNotSupported[]{toMagicModuleMetaDataUcModel.write(new downloadMagicModuleMetalambda0(parseRequiredLong.class, "binding", "getBinding()Lcom/marrow/databinding/ActivityInternalWebViewBinding;", 0))};
        INSTANCE = new Companion(null);
        int i = handleMediaPlayPauseIfPendingOnHandler + 45;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ String write(parseRequiredLong parserequiredlong) {
        int iIconCompatParcelizer = getModuleMessage.IconCompatParcelizer();
        int iIconCompatParcelizer2 = getModuleMessage.IconCompatParcelizer();
        return (String) write(iIconCompatParcelizer, -786667759, getModuleMessage.IconCompatParcelizer(), getModuleMessage.IconCompatParcelizer(), 786667759, iIconCompatParcelizer2, new Object[]{parserequiredlong});
    }

    private static final getShowPopup MediaBrowserCompatItemReceiver(parseRequiredLong parserequiredlong) {
        int iIconCompatParcelizer = getModuleMessage.IconCompatParcelizer();
        int iIconCompatParcelizer2 = getModuleMessage.IconCompatParcelizer();
        return (getShowPopup) write(iIconCompatParcelizer, -358987276, getModuleMessage.IconCompatParcelizer(), getModuleMessage.IconCompatParcelizer(), 358987278, iIconCompatParcelizer2, new Object[]{parserequiredlong});
    }

    @Override // com.marrow.ui.activities.base.BaseActivity
    public int handleMediaPlayPauseIfPendingOnHandler() {
        int i = 2 % 2;
        int i2 = RatingCompat + 49;
        int i3 = i2 % 128;
        onCustomAction = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 79;
        RatingCompat = i5 % 128;
        int i6 = i5 % 2;
        return R.layout.activity_internal_web_view;
    }

    @Override // kotlin.convertMessageToByteArray
    public final Toolbar onCommand() {
        int iIconCompatParcelizer = getModuleMessage.IconCompatParcelizer();
        int iIconCompatParcelizer2 = getModuleMessage.IconCompatParcelizer();
        return (Toolbar) write(iIconCompatParcelizer, 2085678430, getModuleMessage.IconCompatParcelizer(), getModuleMessage.IconCompatParcelizer(), -2085678429, iIconCompatParcelizer2, new Object[]{this});
    }

    private void MediaSessionCompatQueueItem() {
        int iIconCompatParcelizer = getModuleMessage.IconCompatParcelizer();
        int iIconCompatParcelizer2 = getModuleMessage.IconCompatParcelizer();
        write(iIconCompatParcelizer, 31511723, getModuleMessage.IconCompatParcelizer(), getModuleMessage.IconCompatParcelizer(), -31511720, iIconCompatParcelizer2, new Object[]{this});
    }

    @Override // kotlin.handleChildInline, kotlin.convertMessageToByteArray, com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = RatingCompat + 105;
        onCustomAction = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            int i4 = 64 / 0;
        }
    }

    static void onPlayFromSearch() {
        MediaBrowserCompatCustomActionResultReceiver = -3498762522182953692L;
        MediaMetadataCompat = -136981212;
        MediaBrowserCompatSearchResultReceiver = (char) 46183;
        MediaDescriptionCompat = new char[]{3358, 59881, 50381, 41900, 40604, 30070, 20559, 20251, 10757, 1764, 64987, 55487, 46994, 37489, 35143, 25659, 17154, 16354, 44152, 18639, 26089, 734, 16380, 54298, 61756, 61022, 35623, 42948, 23778, 31113, 5874, 13072, 10289, 50433, 57915, 40591, 48042, 20632, 19900, 27147, 1835, 15381, 55611, 62852, 37621, 36801, 42164, 16727, 32375, 6932, 12382, 11560, 51663, 59069, 33757, 47357, 21791, 29291, 28503, 1057, 8392, 56805, 64143, 38831, 35859, 43313, 56380, 14478, 5549, 29343, 20415, 41992, 33149, 40477, 64305, 55250, 11426, 2501, 26288, 17232, 22566, 46357, 37501, 61080, 52159, 8326, 15790, 6721, 30574, 19458, 43382, 34244, 58087, 65415, 54441, 12614, 3680, 27395, 16412, 23865, 47500, 38652, 62414, 51387, 9561, 635, 7964, 29746, 20612, 44451, 35524, 59367, 64595, 55591, 13836, 4900, 28619, 17647, 41353, 48800, 39758, 61550, 52492, 10867, 1683, 25524, 30853, 22004, 45633, 36708, 60715, 2457, 9450, 17294, 32508, 38174, 45164, 44886, 51749, 59076, 7606, 14547, 22525, 29253, 26979, 33794, 41825, 57305, 64249, 4555, 3311, 11021, 17964, 32076, 39016, 46293, 54263, 52939, 58854, 2, 16166, 23118, 29021, 27689, 34972, 42991, 49804, 63913, 5148, 13160, 11856, 17778, 25030, 40114, 48006, 55030, 52503, 59495, 1868, 8764, 24285, 30203, 37068, 36842, 43532, 49533, 64576, 6962, 14214, 21232, 18883, 25827, 33537, 48686, 56420, 14489, 5562, 29407, 20475, 42067, 33125, 40452, 64352, 55172, 11439, 2507, 26361, 17171, 22573, 46422, 37490, 61081, 52141, 8337, 15852, 6673, 30504, 19550, 43381, 34177, 58037, 65494, 54499, 12549, 3708, 27476, 16473, 23916, 47516, 38571, 62427, 51448, 9503, 554, 8022, 29792, 20680, 44452, 35535, 59372, 64589, 55586, 13900, 4980, 28625, 17590, 41430, 48894, 39711, 61480, 52544, 10810, 1664, 25573, 30879, 22004, 45572, 36662, 58402, 49497, 56957, 31387, 40569, 45833, 54333, 59675, 766, 10206, 14527, 23948, 29048, 35333, 44858, 49219, 58857, 65235, 5040, 13453, 18543, 27990, 34339, 39775, 48366, 53711, 60083, 4055, 9063, 17426, 22816, 29186, 38833, 43156, 52720, 59064, 64457, 8061, 12380, 46959, 21383, 32425, 6617, 9469, 53002, 59944, 62847, 36967, 48258, 18348, 25301, 3567, 10250, 13089, 37663, 30712, 23248, 15804, 150, 60280, 52826, 53566, 46106, 39156, 25553};
        MediaBrowserCompatMediaItem = 6030005608174270701L;
    }
}
