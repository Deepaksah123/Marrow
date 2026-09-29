package kotlin;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow2.ui.main.viewmodel.HomeNavigationActivityViewModel;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.VisibilityChecker;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes.dex */
public abstract class zaO extends zabr {
    private copyToBuffer IconCompatParcelizer = new copyToBuffer();
    private final RenewEligible write;
    private static final byte[] $$u = {10, -58, 112, 6};
    private static final int $$x = 94;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$y = {TarConstants.LF_FIFO, -78, 96, -9, -74, 14, -7, -4, -2, 25, -12, -21, -14, -7, -7, -26, 8, 10, -13, -8, -12, -22, -74, 74, -14, -18, 2, -24, 17, 3, -10, -52, 35, -11, -6, -24, 10, -45, 8, 8, -24, -7, -2, -12, 8, -30, 4, 10, -1, -7, -4, -24, -45, 25, 8, -20, -3, -10, -52, 35, -11, -6, -24, 10, -45, 8, 8, -24, -7, -2, -12, 8, -30, 4, -74, TarConstants.LF_NORMAL, -11, 6, -60, 26, -3, 2, -11, -8, -24, -10, -24, 18, -6, -8, -11, -22, -13, 3, -48, 32, -6, -14, -21, 10};
    private static final int $$z = 29;
    private static final byte[] $$g = {3, -120, 17, 23, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, -12, -3, 4, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$h = 181;
    private static int AudioAttributesImplBaseParcelizer = 0;
    private static int AudioAttributesImplApi26Parcelizer = 1;
    private static char RemoteActionCompatParcelizer = 30668;
    private static char AudioAttributesCompatParcelizer = 37078;
    private static char read = 8403;
    private static char MediaBrowserCompatCustomActionResultReceiver = 45048;
    private static char[] MediaBrowserCompatItemReceiver = {6474, 6488, 6835, 6493, 6479, 6839, 6833, 6525, 6523, 6476, 6429, 6477, 6430, 6416, 6407, 6475, 6489, 6469, 6468, 6428, 6425, 6426, 6417, 6464, 6836, 6418, 6490, 6481, 6492, 6465, 6505, 6478, 6427, 6473, 6832, 6491, 6838, 6524, 6472, 6467, 6424, 6471, 6431, 6406, 6507, 6496, 6834, 6470, 6494};
    private static char AudioAttributesImplApi21Parcelizer = 11445;

    private static String $$A(int i, byte b, short s) {
        int i2 = (s * 4) + 122;
        int i3 = (i * 4) + 4;
        byte[] bArr = $$u;
        int i4 = b * 2;
        byte[] bArr2 = new byte[i4 + 1];
        int i5 = -1;
        if (bArr == null) {
            i5 = -1;
            i2 = (-i3) + i4;
            i3++;
        }
        while (true) {
            int i6 = i5 + 1;
            bArr2[i6] = (byte) i2;
            if (i6 == i4) {
                return new String(bArr2, 0);
            }
            int i7 = i2;
            i5 = i6;
            i2 = (-bArr[i3]) + i7;
            i3++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void k(int r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 4
            int r6 = 44 - r6
            int r8 = 114 - r8
            byte[] r0 = kotlin.zaO.$$g
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L11
            r4 = r6
            r8 = r7
            r3 = r2
            goto L26
        L11:
            r3 = r2
            r5 = r8
            r8 = r7
            r7 = r5
        L15:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            r4 = r0[r8]
        L26:
            int r7 = r7 + r4
            int r7 = r7 + (-1)
            int r8 = r8 + 1
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zaO.k(int, short, int, java.lang.Object[]):void");
    }

    private static void l(short s, short s2, byte b, Object[] objArr) {
        int i = 74 - b;
        int i2 = s + 73;
        byte[] bArr = $$y;
        byte[] bArr2 = new byte[s2 + 20];
        int i3 = s2 + 19;
        int i4 = -1;
        if (bArr == null) {
            i2 = i3 + i + 9;
            i++;
            i4 = -1;
        }
        while (true) {
            int i5 = i4 + 1;
            bArr2[i5] = (byte) i2;
            if (i5 == i3) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i6 = i;
            i2 = i2 + bArr[i] + 9;
            i = i6 + 1;
            i4 = i5;
        }
    }

    public zaO() {
        zaO zao = this;
        this.write = new VirtualAnnotatedMember(toMagicModuleMetaDataUcModel.write(HomeNavigationActivityViewModel.class), new AnonymousClass3(zao), new AnonymousClass1(zao), new AnonymousClass4(zao));
    }

    public static final /* synthetic */ void IconCompatParcelizer(zaO zao) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 9;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        zao.MediaBrowserCompatItemReceiver();
        if (i3 != 0) {
            int i4 = 5 / 0;
        }
        int i5 = AudioAttributesImplBaseParcelizer + 123;
        AudioAttributesImplApi26Parcelizer = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final HomeNavigationActivityViewModel MediaBrowserCompatCustomActionResultReceiver() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 23;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        HomeNavigationActivityViewModel homeNavigationActivityViewModel = (HomeNavigationActivityViewModel) this.write.RemoteActionCompatParcelizer();
        if (i3 != 0) {
            throw null;
        }
        int i4 = AudioAttributesImplBaseParcelizer + 61;
        AudioAttributesImplApi26Parcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            return homeNavigationActivityViewModel;
        }
        throw null;
    }

    public final copyToBuffer AudioAttributesImplBaseParcelizer() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 125;
        int i3 = i2 % 128;
        AudioAttributesImplBaseParcelizer = i3;
        int i4 = i2 % 2;
        copyToBuffer copytobuffer = this.IconCompatParcelizer;
        int i5 = i3 + 85;
        AudioAttributesImplApi26Parcelizer = i5 % 128;
        if (i5 % 2 != 0) {
            return copytobuffer;
        }
        throw null;
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class IconCompatParcelizer extends MagicModuleRepositoryImpl_Factory implements getCreatedOnDateMs<getShowPopup> {
        @Override // kotlin.getCreatedOnDateMs
        public final /* synthetic */ getShowPopup invoke() {
            write();
            return getShowPopup.INSTANCE;
        }

        public final void write() {
            zaO.IconCompatParcelizer((zaO) this.AudioAttributesImplApi26Parcelizer);
        }

        IconCompatParcelizer(Object obj) {
            super(0, obj, zaO.class, "onBackStackChange", "onBackStackChange()V", 0);
        }
    }

    /* JADX INFO: renamed from: o.zaO$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "IconCompatParcelizer", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ MediaBrowserCompatMediaItem $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            return this.$write.getDefaultViewModelProviderFactory();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem) {
            super(0);
            this.$write = mediaBrowserCompatMediaItem;
        }
    }

    /* JADX INFO: renamed from: o.zaO$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "AudioAttributesCompatParcelizer", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ MediaBrowserCompatMediaItem $RemoteActionCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return this.$RemoteActionCompatParcelizer.getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem) {
            super(0);
            this.$RemoteActionCompatParcelizer = mediaBrowserCompatMediaItem;
        }
    }

    /* JADX INFO: renamed from: o.zaO$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "IconCompatParcelizer", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass4 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ getCreatedOnDateMs $RemoteActionCompatParcelizer = null;
        private /* synthetic */ MediaBrowserCompatMediaItem $read;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final withFieldVisibility invoke() {
            return this.$read.getDefaultViewModelCreationExtras();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem) {
            super(0);
            this.$read = mediaBrowserCompatMediaItem;
        }
    }

    private static void i(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        isStopped isstopped = new isStopped();
        char[] cArr2 = new char[cArr.length];
        int i4 = 0;
        isstopped.read = 0;
        char[] cArr3 = new char[2];
        while (isstopped.read < cArr.length) {
            int i5 = $11 + 99;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                cArr3[1] = cArr[isstopped.read];
                cArr3[1] = cArr[isstopped.read - 1];
                i2 = 1;
            } else {
                cArr3[i4] = cArr[isstopped.read];
                cArr3[1] = cArr[isstopped.read + 1];
                i2 = i4;
            }
            int i6 = 58224;
            while (i2 < 16) {
                char c = cArr3[1];
                char c2 = cArr3[i4];
                char[] cArr4 = cArr3;
                try {
                    Object[] objArr2 = {Integer.valueOf(c), Integer.valueOf((c2 + i6) ^ ((c2 << 4) + ((char) (((long) read) ^ 1193402106669854891L)))), Integer.valueOf(c2 >>> 5), Integer.valueOf(MediaBrowserCompatCustomActionResultReceiver)};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(815477582);
                    if (objRemoteActionCompatParcelizer == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objRemoteActionCompatParcelizer = startForeground.read((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 1504 - ExpandableListView.getPackedPositionType(0L), TextUtils.indexOf((CharSequence) "", '0', 0) + 22, 1322448859, false, $$A(b, b2, b2), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    cArr4[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr4[0]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) RemoteActionCompatParcelizer) ^ 1193402106669854891L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(AudioAttributesCompatParcelizer)};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(815477582);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 1504 - (ViewConfiguration.getPressedStateDuration() >> 16), 21 - (ViewConfiguration.getPressedStateDuration() >> 16), 1322448859, false, $$A(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i2++;
                    cArr3 = cArr4;
                    i4 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[isstopped.read] = cArr5[0];
            cArr2[isstopped.read + 1] = cArr5[1];
            Object[] objArr4 = {isstopped, isstopped};
            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-167774474);
            if (objRemoteActionCompatParcelizer3 == null) {
                objRemoteActionCompatParcelizer3 = startForeground.read((char) (ViewConfiguration.getScrollBarSize() >> 8), 9016 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 58 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -1950993821, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
            int i7 = $11 + 77;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 5 / 5;
            }
            cArr3 = cArr5;
            i4 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01bb  */
    @Override // kotlin.zabr, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r30) {
        /*
            Method dump skipped, instruction units count: 2488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zaO.onCreate(android.os.Bundle):void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, android.app.Activity
    public void onDestroy() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 105;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            this.IconCompatParcelizer.write();
            super.onDestroy();
            int i3 = AudioAttributesImplApi26Parcelizer + 53;
            AudioAttributesImplBaseParcelizer = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        this.IconCompatParcelizer.write();
        super.onDestroy();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void AudioAttributesImplApi26Parcelizer() {
        int i = 2 % 2;
        copyToBuffer copytobuffer = this.IconCompatParcelizer;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(supportFragmentManager, "");
        copytobuffer.RemoteActionCompatParcelizer(supportFragmentManager, new getCreatedOnDateMs() { // from class: o.zabu
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return Integer.valueOf(zaO.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer));
            }
        }, new getCreatedOnDateMs() { // from class: o.zabt
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return Integer.valueOf(zaO.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer));
            }
        }, new IconCompatParcelizer(this));
        int i2 = AudioAttributesImplBaseParcelizer + 37;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final int write(zaO zao) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 79;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        HomeNavigationActivityViewModel homeNavigationActivityViewModelMediaBrowserCompatCustomActionResultReceiver = zao.MediaBrowserCompatCustomActionResultReceiver();
        if (i3 == 0) {
            return homeNavigationActivityViewModelMediaBrowserCompatCustomActionResultReceiver.getAudioAttributesCompatParcelizer();
        }
        homeNavigationActivityViewModelMediaBrowserCompatCustomActionResultReceiver.getAudioAttributesCompatParcelizer();
        throw null;
    }

    private static final int read(zaO zao) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 97;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        HomeNavigationActivityViewModel homeNavigationActivityViewModelMediaBrowserCompatCustomActionResultReceiver = zao.MediaBrowserCompatCustomActionResultReceiver();
        if (i3 != 0) {
            return homeNavigationActivityViewModelMediaBrowserCompatCustomActionResultReceiver.getIconCompatParcelizer();
        }
        homeNavigationActivityViewModelMediaBrowserCompatCustomActionResultReceiver.getIconCompatParcelizer();
        throw null;
    }

    private final void MediaBrowserCompatItemReceiver() {
        int i = 2 % 2;
        MediaBrowserCompatCustomActionResultReceiver().AudioAttributesCompatParcelizer(AudioAttributesImplApi21Parcelizer().AudioAttributesImplApi21Parcelizer.getChildCount());
        MediaBrowserCompatCustomActionResultReceiver().RemoteActionCompatParcelizer(AudioAttributesImplApi21Parcelizer().MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.getChildCount());
        boolean z = true;
        AudioAttributesImplApi21Parcelizer().MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.setClickable(AudioAttributesImplApi21Parcelizer().MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.getChildCount() > 0);
        FrameLayout frameLayout = AudioAttributesImplApi21Parcelizer().AudioAttributesImplApi21Parcelizer;
        if (AudioAttributesImplApi21Parcelizer().AudioAttributesImplApi21Parcelizer.getChildCount() > 0) {
            int i2 = AudioAttributesImplApi26Parcelizer;
            int i3 = i2 + 81;
            AudioAttributesImplBaseParcelizer = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 15;
            AudioAttributesImplBaseParcelizer = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 4;
            }
        } else {
            z = false;
        }
        frameLayout.setClickable(z);
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, android.app.Activity
    public void onBackPressed() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 101;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        super.onBackPressed();
        int i4 = AudioAttributesImplBaseParcelizer + 119;
        AudioAttributesImplApi26Parcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void j(byte b, int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        needsStartedService needsstartedservice = new needsStartedService();
        char[] cArr2 = MediaBrowserCompatItemReceiver;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i4 = 0; i4 < length; i4++) {
                int i5 = $11 + 47;
                $10 = i5 % 128;
                int i6 = i5 % 2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1527982763);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) View.MeasureSpec.makeMeasureSpec(0, 0), 7015 - (ViewConfiguration.getScrollBarSize() >> 8), KeyEvent.getDeadChar(0, 0) + 30, -626716224, false, "o", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
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
        Object[] objArr3 = {Integer.valueOf(AudioAttributesImplApi21Parcelizer)};
        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1527982763);
        if (objRemoteActionCompatParcelizer2 == null) {
            objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getEdgeSlop() >> 16), ((Process.getThreadPriority(0) + 20) >> 6) + 7015, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 30, -626716224, false, "o", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
            int i7 = $10 + 27;
            $11 = i7 % 128;
            int i8 = i7 % 2;
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i9 = $10 + 125;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                needsstartedservice.AudioAttributesCompatParcelizer = 1;
            } else {
                needsstartedservice.AudioAttributesCompatParcelizer = 0;
            }
            while (needsstartedservice.AudioAttributesCompatParcelizer < i2) {
                int i10 = $10 + 31;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                needsstartedservice.write = cArr[needsstartedservice.AudioAttributesCompatParcelizer];
                needsstartedservice.RemoteActionCompatParcelizer = cArr[needsstartedservice.AudioAttributesCompatParcelizer + 1];
                if (needsstartedservice.write == needsstartedservice.RemoteActionCompatParcelizer) {
                    cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = (char) (needsstartedservice.write - b);
                    cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = (char) (needsstartedservice.RemoteActionCompatParcelizer - b);
                    obj = obj2;
                } else {
                    Object[] objArr4 = {needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(105000849);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) ((ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 48193), (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 20126, AndroidCharacter.getMirror('0') - 28, 2014046980, false, "n", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue() == needsstartedservice.AudioAttributesImplBaseParcelizer) {
                        int i12 = $11 + 99;
                        $10 = i12 % 128;
                        int i13 = i12 % 2;
                        Object[] objArr5 = {needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice};
                        Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(50135433);
                        if (objRemoteActionCompatParcelizer4 == null) {
                            objRemoteActionCompatParcelizer4 = startForeground.read((char) Color.alpha(0), Gravity.getAbsoluteGravity(0, 0) + 19368, 18 - (ViewConfiguration.getTouchSlop() >> 8), 2092221724, false, "k", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).intValue();
                        int i14 = (needsstartedservice.read * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                        cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr2[iIntValue];
                        cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr2[i14];
                    } else {
                        obj = null;
                        if (needsstartedservice.IconCompatParcelizer == needsstartedservice.read) {
                            needsstartedservice.MediaBrowserCompatItemReceiver = ((needsstartedservice.MediaBrowserCompatItemReceiver + cCharValue) - 1) % cCharValue;
                            needsstartedservice.AudioAttributesImplBaseParcelizer = ((needsstartedservice.AudioAttributesImplBaseParcelizer + cCharValue) - 1) % cCharValue;
                            int i15 = (needsstartedservice.IconCompatParcelizer * cCharValue) + needsstartedservice.MediaBrowserCompatItemReceiver;
                            int i16 = (needsstartedservice.read * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr2[i15];
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr2[i16];
                        } else {
                            int i17 = (needsstartedservice.IconCompatParcelizer * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                            int i18 = (needsstartedservice.read * cCharValue) + needsstartedservice.MediaBrowserCompatItemReceiver;
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr2[i17];
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr2[i18];
                        }
                    }
                }
                needsstartedservice.AudioAttributesCompatParcelizer += 2;
                obj2 = obj;
            }
        }
        for (int i19 = 0; i19 < i; i19++) {
            cArr4[i19] = (char) (cArr4[i19] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00ea  */
    @Override // kotlin.zabr, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onResume() {
        /*
            Method dump skipped, instruction units count: 416
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zaO.onResume():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00dc  */
    @Override // kotlin.zabr, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onPause() {
        /*
            Method dump skipped, instruction units count: 536
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zaO.onPause():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:180:0x0ab9 A[Catch: all -> 0x0306, TryCatch #8 {all -> 0x0306, blocks: (B:178:0x0ab3, B:180:0x0ab9, B:181:0x0ae3, B:211:0x0edd, B:213:0x0ee3, B:214:0x0f08, B:247:0x1297, B:249:0x129d, B:250:0x12bf, B:228:0x1097, B:230:0x10b9, B:231:0x1105, B:70:0x0448, B:72:0x044e, B:73:0x0474, B:21:0x0104, B:23:0x010a, B:24:0x0133, B:26:0x0277, B:28:0x02a7, B:29:0x0300), top: B:286:0x0104 }] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0b72  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0bb8  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0c10  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0ebd  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0f98  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0fda  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x102c  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x1278  */
    /* JADX WARN: Removed duplicated region for block: B:311:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.zabr, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r33) {
        /*
            Method dump skipped, instruction units count: 5614
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zaO.attachBaseContext(android.content.Context):void");
    }

    public static /* synthetic */ int AudioAttributesCompatParcelizer(zaO zao) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 93;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        int i4 = read(zao);
        int i5 = AudioAttributesImplApi26Parcelizer + 115;
        AudioAttributesImplBaseParcelizer = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public static /* synthetic */ int RemoteActionCompatParcelizer(zaO zao) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 39;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            return write(zao);
        }
        write(zao);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // kotlin.zabr, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 117;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            int i4 = 5 / 0;
        }
        int i5 = AudioAttributesImplBaseParcelizer + 55;
        AudioAttributesImplApi26Parcelizer = i5 % 128;
        int i6 = i5 % 2;
    }
}
