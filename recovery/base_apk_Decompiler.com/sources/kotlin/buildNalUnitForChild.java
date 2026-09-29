package kotlin;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0017\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0013R\u001a\u0010\u001b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0014\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0014\u0010\u0013R\u001a\u0010\u0019\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001b\u0010\u0013R\u001a\u0010\u0016\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u0011"}, d2 = {"Lo/buildNalUnitForChild;", "Lo/isStartTagIgnorePrefix;", "", "p0", "Lo/XmlPullParserUtil;", "p1", "p2", "p3", "", "p4", "<init>", "(Ljava/lang/String;Lo/XmlPullParserUtil;Ljava/lang/String;Ljava/lang/String;I)V", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "write", "Ljava/lang/String;", "RemoteActionCompatParcelizer", "IconCompatParcelizer", "Lo/XmlPullParserUtil;", "AudioAttributesCompatParcelizer", "()Lo/XmlPullParserUtil;", "read", "I"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class buildNalUnitForChild extends isStartTagIgnorePrefix {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int MediaBrowserCompatSearchResultReceiver = 0;
    private static int MediaMetadataCompat = 1;
    private final String AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final String write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final XmlPullParserUtil read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final int RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final String IconCompatParcelizer;
    private static char[] AudioAttributesImplApi26Parcelizer = {44963, 45022, 44995, 45002, 44989, 44994, 45036, 45030, 45050, 45025, 45027, 45021, 44981, 45004, 44983, 44995, 45028, 45025, 45033, 45022, 44984, 45000, 45036, 45030, 45050, 45025, 45027, 45021, 44981, 45007, 44994, 44980, 45040, 45054, 45055, 45047, 45008, 44996, 45048, 45041, 45055, 45016, 45008, 45015, 44979, 44989, 44988, 44992, 44999, 44979, 44989, 45005, 45026, 45054, 45048, 45029, 45031, 45049, 45029, 45031, 45048, 45030, 45048, 45048, 45049, 45008, 45021, 45049, 45025, 44985, 45028, 45025, 45033, 45022, 44984, 45000, 45036, 45030, 45050, 45025, 45027, 45021, 44981, 45007, 44994, 44989, 44994, 45036, 45030, 45050, 45025, 45027, 45021, 44981, 45004, 44983, 44981, 45022, 44995, 45002, 44989, 45037, 45024, 45052, 45028, 45030, 45051, 45028, 45011, 44978, 45019, 45051, 45027, 45030, 45051, 45028, 45027, 44994, 44995, 45036, 45030, 45050, 45025, 44987, 45032, 45010, 45032, 45030, 45036, 45030, 45025, 45036, 45038, 45037, 45037, 45021, 45011, 45036, 45038, 45036, 44986, 45037, 45027, 45025, 45050, 45030, 45036, 44995, 44994, 45027, 45028, 45051, 45030, 45027, 45051, 45019, 44997, 45028, 44999, 44981, 45010, 45032, 45037, 45036, 45038, 45036, 45011, 45021, 45037, 45037, 45038, 45036, 45025, 44985, 45036, 45021, 45009, 45024, 45024, 45025, 45036, 45030, 45032, 45010, 45032, 45037, 45036, 44986, 45037, 45027, 45025, 45050, 45030, 45036, 44995, 44994, 45027, 45028, 45051, 45030, 45027, 45051, 45019, 44997, 45028, 44999, 44981, 45010, 45032, 45037, 45036, 45038, 45036, 45021, 45009, 45024, 45024, 44989, 45024, 45026, 45028, 45049, 45030, 45025, 45049, 45054, 45024, 44991, 45039, 45025, 45025, 45005, 45018, 45030, 45038, 45030, 45049, 45031, 45028, 45052, 45017, 44994, 45038, 45025, 45049, 45019, 44978, 45022, 45025, 45049, 45028, 45037, 45037, 45036, 45032, 45024, 45030, 45023, 45017, 45032, 45025, 45051, 45050, 45055, 44994, 44824, 44830, 44830, 44816, 44806, 44803, 44820, 44843, 44818, 44831, 44991, 45039, 45025, 45025, 45005, 45018, 45030, 45038, 45030, 45049, 45031, 45028, 45052, 45017, 44994, 45038, 45025, 45049, 45019, 45001, 45004, 44984, 44990, 44980, 45022, 45025, 45049, 45028, 45037, 45037, 45036, 45032, 45024, 45030};
    private static char[] MediaBrowserCompatCustomActionResultReceiver = {28233, 28235, 28250, 28350, 28239, 28237, 28229, 28320, 28227, 28342, 28288, 28315, 28318, 28311, 28224, 28234, 28252, 28225, 28231, 28254, 28349, 28251, 28332, 28247, 28335, 28333, 28232, 28236, 28228, 28226};
    private static int AudioAttributesImplBaseParcelizer = 411397870;
    private static boolean AudioAttributesImplApi21Parcelizer = true;
    private static boolean MediaBrowserCompatItemReceiver = true;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public buildNalUnitForChild(String str, XmlPullParserUtil xmlPullParserUtil, String str2, String str3, int i) {
        super(str, xmlPullParserUtil, str2, str3);
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(xmlPullParserUtil, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        this.IconCompatParcelizer = str;
        this.read = xmlPullParserUtil;
        this.write = str2;
        this.AudioAttributesCompatParcelizer = str3;
        this.RemoteActionCompatParcelizer = i;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ buildNalUnitForChild(String str, XmlPullParserUtil xmlPullParserUtil, String str2, String str3, int i, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        if ((i2 & 16) != 0) {
            int i3 = MediaBrowserCompatSearchResultReceiver + 117;
            MediaMetadataCompat = i3 % 128;
            i = i3 % 2 == 0 ? 1 : 0;
            int i4 = 2 % 2;
        }
        this(str, xmlPullParserUtil, str2, str3, i);
    }

    public final String RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 121;
        int i3 = i2 % 128;
        MediaBrowserCompatSearchResultReceiver = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.IconCompatParcelizer;
        int i4 = i3 + 41;
        MediaMetadataCompat = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final XmlPullParserUtil AudioAttributesCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver;
        int i3 = i2 + 81;
        MediaMetadataCompat = i3 % 128;
        int i4 = i3 % 2;
        XmlPullParserUtil xmlPullParserUtil = this.read;
        int i5 = i2 + 119;
        MediaMetadataCompat = i5 % 128;
        if (i5 % 2 != 0) {
            return xmlPullParserUtil;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String write() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 3;
        MediaMetadataCompat = i2 % 128;
        if (i2 % 2 != 0) {
            return this.write;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String read() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 7;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        if (i2 % 2 == 0) {
            return this.AudioAttributesCompatParcelizer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 93;
        int i3 = i2 % 128;
        MediaMetadataCompat = i3;
        int i4 = i2 % 2;
        int i5 = this.RemoteActionCompatParcelizer;
        int i6 = i3 + 99;
        MediaBrowserCompatSearchResultReceiver = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    private static void b(int i, byte[] bArr, char[] cArr, int[] iArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notifyDownloads notifydownloads = new notifyDownloads();
        char[] cArr2 = MediaBrowserCompatCustomActionResultReceiver;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                int i4 = $10 + 85;
                $11 = i4 % 128;
                int i5 = i4 % 2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i3])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-298077624);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (Color.blue(0) + 44862), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 18944, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 28, -1871546659, false, CmcdHeadersFactory.STREAMING_FORMAT_SS, new Class[]{Integer.TYPE});
                    }
                    cArr3[i3] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i6 = $10 + 109;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 5 / 2;
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(AudioAttributesImplBaseParcelizer)};
        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(680566917);
        if (objRemoteActionCompatParcelizer2 == null) {
            objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), (ViewConfiguration.getFadingEdgeLength() >> 16) + 19033, 75 - Color.argb(0, 0, 0, 0), 1457087504, false, "r", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
        if (!(!MediaBrowserCompatItemReceiver)) {
            notifydownloads.AudioAttributesCompatParcelizer = bArr.length;
            char[] cArr4 = new char[notifydownloads.AudioAttributesCompatParcelizer];
            notifydownloads.IconCompatParcelizer = 0;
            while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
                int i8 = $10 + 75;
                $11 = i8 % 128;
                if (i8 % 2 == 0) {
                    cArr4[notifydownloads.IconCompatParcelizer] = (char) (cArr2[bArr[(notifydownloads.AudioAttributesCompatParcelizer >>> 1) / notifydownloads.IconCompatParcelizer] + i] / iIntValue);
                    Object[] objArr4 = {notifydownloads, notifydownloads};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1593953308);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) TextUtils.indexOf("", "", 0), View.MeasureSpec.getMode(0) + 11439, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 13, -558368911, false, "q", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                } else {
                    cArr4[notifydownloads.IconCompatParcelizer] = (char) (cArr2[bArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] + i] - iIntValue);
                    Object[] objArr5 = {notifydownloads, notifydownloads};
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1593953308);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        objRemoteActionCompatParcelizer4 = startForeground.read((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 11439, TextUtils.getTrimmedLength("") + 14, -558368911, false, "q", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
                }
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!AudioAttributesImplApi21Parcelizer) {
            notifydownloads.AudioAttributesCompatParcelizer = iArr.length;
            char[] cArr5 = new char[notifydownloads.AudioAttributesCompatParcelizer];
            notifydownloads.IconCompatParcelizer = 0;
            while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
                cArr5[notifydownloads.IconCompatParcelizer] = (char) (cArr2[iArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] - i] - iIntValue);
                notifydownloads.IconCompatParcelizer++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        notifydownloads.AudioAttributesCompatParcelizer = cArr.length;
        char[] cArr6 = new char[notifydownloads.AudioAttributesCompatParcelizer];
        notifydownloads.IconCompatParcelizer = 0;
        while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
            int i9 = $11 + 57;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                cArr6[notifydownloads.IconCompatParcelizer] = (char) (cArr2[cArr[(notifydownloads.AudioAttributesCompatParcelizer + 1) / notifydownloads.IconCompatParcelizer] / i] % iIntValue);
                Object[] objArr6 = {notifydownloads, notifydownloads};
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-1593953308);
                if (objRemoteActionCompatParcelizer5 == null) {
                    objRemoteActionCompatParcelizer5 = startForeground.read((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), Color.alpha(0) + 11439, (Process.myPid() >> 22) + 14, -558368911, false, "q", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6);
            } else {
                cArr6[notifydownloads.IconCompatParcelizer] = (char) (cArr2[cArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] - i] - iIntValue);
                Object[] objArr7 = {notifydownloads, notifydownloads};
                Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-1593953308);
                if (objRemoteActionCompatParcelizer6 == null) {
                    objRemoteActionCompatParcelizer6 = startForeground.read((char) (1 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), 11439 - TextUtils.indexOf("", ""), KeyEvent.normalizeMetaState(0) + 14, -558368911, false, "q", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer6).invoke(null, objArr7);
            }
        }
        objArr[0] = new String(cArr6);
    }

    private static void a(byte[] bArr, int[] iArr, boolean z, Object[] objArr) throws Throwable {
        int i;
        int i2 = 2 % 2;
        buildSetStopReasonIntent buildsetstopreasonintent = new buildSetStopReasonIntent();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = AudioAttributesImplApi26Parcelizer;
        float f = BitmapDescriptorFactory.HUE_RED;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i7])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-338863922);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), Color.red(0) + 11613, 20 - (AudioTrack.getMinVolume() > f ? 1 : (AudioTrack.getMinVolume() == f ? 0 : -1)), -1786471333, false, "u", new Class[]{Integer.TYPE});
                    }
                    cArr2[i7] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    i7++;
                    f = BitmapDescriptorFactory.HUE_RED;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr, i3, cArr3, 0, i4);
        if (bArr != null) {
            char[] cArr4 = new char[i4];
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            char c = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i4) {
                if (bArr[buildsetstopreasonintent.RemoteActionCompatParcelizer] == 1) {
                    int i8 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1429458299);
                        if (objRemoteActionCompatParcelizer2 == null) {
                            objRemoteActionCompatParcelizer2 = startForeground.read((char) View.getDefaultSize(0, 0), 22958 - ImageFormat.getBitsPerPixel(0), 43 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), -729418224, false, "x", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i8] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    int i9 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    Object[] objArr4 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(1859710730);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (31589 - TextUtils.indexOf("", "", 0)), 9863 - View.getDefaultSize(0, 0), 65 - (ViewConfiguration.getPressedStateDuration() >> 16), 277949343, false, "v", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i9] = ((Character) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).charValue();
                    int i10 = $11 + 25;
                    $10 = i10 % 128;
                    int i11 = i10 % 2;
                }
                c = cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer];
                Object[] objArr5 = {buildsetstopreasonintent, buildsetstopreasonintent};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1104966666);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (37822 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 9754, (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 26, 1066774687, false, "B", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i12 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr3, i12, i6);
            System.arraycopy(cArr5, i6, cArr3, 0, i12);
        }
        if (z) {
            char[] cArr6 = new char[i4];
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i4) {
                int i13 = $10 + 113;
                $11 = i13 % 128;
                int i14 = i13 % 2;
                cArr6[buildsetstopreasonintent.RemoteActionCompatParcelizer] = cArr3[(i4 - buildsetstopreasonintent.RemoteActionCompatParcelizer) - 1];
                buildsetstopreasonintent.RemoteActionCompatParcelizer++;
            }
            cArr3 = cArr6;
        }
        if (i5 > 0) {
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i4) {
                int i15 = $11 + 107;
                $10 = i15 % 128;
                if (i15 % 2 != 0) {
                    cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] = (char) (cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] >> iArr[2]);
                    i = buildsetstopreasonintent.RemoteActionCompatParcelizer << 1;
                } else {
                    cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] = (char) (cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] - iArr[2]);
                    i = buildsetstopreasonintent.RemoteActionCompatParcelizer + 1;
                }
                buildsetstopreasonintent.RemoteActionCompatParcelizer = i;
            }
        }
        objArr[0] = new String(cArr3);
    }

    public final boolean equals(Object p0) {
        int i = 2 % 2;
        if (this == p0) {
            int i2 = MediaMetadataCompat + 21;
            MediaBrowserCompatSearchResultReceiver = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(p0 instanceof buildNalUnitForChild)) {
            return false;
        }
        buildNalUnitForChild buildnalunitforchild = (buildNalUnitForChild) p0;
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) buildnalunitforchild.IconCompatParcelizer) || this.read != buildnalunitforchild.read) {
            return false;
        }
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) buildnalunitforchild.write)) {
            int i4 = MediaBrowserCompatSearchResultReceiver + 3;
            MediaMetadataCompat = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) buildnalunitforchild.AudioAttributesCompatParcelizer)) {
            int i6 = MediaBrowserCompatSearchResultReceiver + 101;
            MediaMetadataCompat = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (this.RemoteActionCompatParcelizer == buildnalunitforchild.RemoteActionCompatParcelizer) {
            return true;
        }
        int i8 = MediaBrowserCompatSearchResultReceiver + 11;
        MediaMetadataCompat = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 81;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((this.IconCompatParcelizer.hashCode() * 31) + this.read.hashCode()) * 31) + this.write.hashCode()) * 31) + this.AudioAttributesCompatParcelizer.hashCode()) * 31) + Integer.hashCode(this.RemoteActionCompatParcelizer);
        int i4 = MediaMetadataCompat + 95;
        MediaBrowserCompatSearchResultReceiver = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = this.IconCompatParcelizer;
        XmlPullParserUtil xmlPullParserUtil = this.read;
        String str2 = this.write;
        String str3 = this.AudioAttributesCompatParcelizer;
        int i2 = this.RemoteActionCompatParcelizer;
        StringBuilder sb = new StringBuilder("buildNalUnitForChild(IconCompatParcelizer=");
        sb.append(str);
        sb.append(", read=");
        sb.append(xmlPullParserUtil);
        sb.append(", write=");
        sb.append(str2);
        sb.append(", AudioAttributesCompatParcelizer=");
        sb.append(str3);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(i2);
        sb.append(")");
        String string = sb.toString();
        int i3 = MediaBrowserCompatSearchResultReceiver + 57;
        MediaMetadataCompat = i3 % 128;
        if (i3 % 2 != 0) {
            return string;
        }
        throw null;
    }

    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v49 */
    /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
        java.util.NoSuchElementException
        	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
        	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    public static java.lang.Object[] read(android.content.Context r22, int r23, int r24) {
        /*
            Method dump skipped, instruction units count: 2498
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.buildNalUnitForChild.read(android.content.Context, int, int):java.lang.Object[]");
    }
}
