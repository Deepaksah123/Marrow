package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.TrainingApplication;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/InteractiveVideoElementLSModel;", "", "<init>", "()V", "IconCompatParcelizer", "read", "RemoteActionCompatParcelizer"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class InteractiveVideoElementLSModel {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static volatile read write = read.RemoteActionCompatParcelizer;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lo/InteractiveVideoElementLSModel$read;", "", "<init>", "(Ljava/lang/String;I)V", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer", "write", "read", "IconCompatParcelizer"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class read {
        private static final /* synthetic */ read[] AudioAttributesImplApi21Parcelizer;
        public static final read RemoteActionCompatParcelizer = new read("SDK_NOT_LOADED", 0);
        public static final read AudioAttributesCompatParcelizer = new read("SDK_LOADING", 1);
        public static final read write = new read("SDK_LOADED_SUCCESSFULLY", 2);
        public static final read read = new read("SDK_LOAD_FAILED", 3);
        public static final read IconCompatParcelizer = new read("SDK_NOT_COMPATIBLE", 4);

        private read(String str, int i) {
        }

        static {
            read[] readVarArr = read();
            AudioAttributesImplApi21Parcelizer = readVarArr;
            getMagicModuleTimeline.IconCompatParcelizer(readVarArr);
        }

        private static final /* synthetic */ read[] read() {
            return new read[]{RemoteActionCompatParcelizer, AudioAttributesCompatParcelizer, write, read, IconCompatParcelizer};
        }

        public static read valueOf(String str) {
            return (read) Enum.valueOf(read.class, str);
        }

        public static read[] values() {
            return (read[]) AudioAttributesImplApi21Parcelizer.clone();
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lo/InteractiveVideoElementLSModel$RemoteActionCompatParcelizer;", "", "<init>", "()V", "read", "RemoteActionCompatParcelizer", "IconCompatParcelizer", "Lo/InteractiveVideoElementLSModel$RemoteActionCompatParcelizer$read;", "Lo/InteractiveVideoElementLSModel$RemoteActionCompatParcelizer$RemoteActionCompatParcelizer;", "Lo/InteractiveVideoElementLSModel$RemoteActionCompatParcelizer$IconCompatParcelizer;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class RemoteActionCompatParcelizer {
        private static final byte[] $$c = {104, 109, 121, 73};
        private static final int $$f = 162;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {5, 107, -8, 109, -13, -4, 3, 19, 8, 2, 5, -15, -36, 34, 17, -11, 6, -1, -43, 44, -2, 3, -15, 19, -36, 17, 17, -15, 2, 7, -3, 17, -21, 13, -2, 15, 26, 0, 11};
        private static final int $$e = 152;
        private static final byte[] $$a = {122, -64, TarConstants.LF_SYMLINK, -113, 15, -8, 16, -1, -4, -3, -52, TarConstants.LF_CONTIG, 14, 1, 8, -13, 11, 8, -68, 68, -1, -61, 21, TarConstants.LF_LINK, 2, -2, -1, -4, 0, 21, -9, 8, 1, -35, 39, -6, 11, -1, 21, -17, -27, 39, 11, -7, 23, -19, -49, 64, -9, 15, -5, -55, 40, 22, 12, -11, -2, 5, 3, -17, 19, 4, -5, -5, 2, 13, 7, -4, 7};
        private static final int $$b = 11;
        private static long RemoteActionCompatParcelizer = -5549664914489902051L;
        private static char[] read = {28419, 28421, 28436, 28521, 28440, 28444, 28417, 28423, 28425, 28443, 28442, 28513, 28418, 28507, 28431, 28506, 28429, 28445, 28488, 28439, 28447, 28416, 28606, 28432, 28526, 28420, 28438, 28516, 28434, 28536, 28433, 28541, 28539, 28435, 28427};
        private static int IconCompatParcelizer = 411398056;
        private static boolean AudioAttributesCompatParcelizer = true;
        private static boolean write = true;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$g(int r6, byte r7, short r8) {
            /*
                byte[] r0 = o.InteractiveVideoElementLSModel.RemoteActionCompatParcelizer.$$c
                int r8 = r8 * 4
                int r8 = 104 - r8
                int r7 = r7 * 3
                int r7 = 4 - r7
                int r6 = r6 * 3
                int r6 = r6 + 1
                byte[] r1 = new byte[r6]
                r2 = 0
                if (r0 != 0) goto L16
                r3 = r7
                r4 = r2
                goto L26
            L16:
                r3 = r2
            L17:
                int r4 = r3 + 1
                byte r5 = (byte) r8
                r1[r3] = r5
                if (r4 != r6) goto L24
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L24:
                r3 = r0[r7]
            L26:
                int r7 = r7 + 1
                int r8 = r8 + r3
                r3 = r4
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: o.InteractiveVideoElementLSModel.RemoteActionCompatParcelizer.$$g(int, byte, short):java.lang.String");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void c(short r6, short r7, byte r8, java.lang.Object[] r9) {
            /*
                byte[] r0 = o.InteractiveVideoElementLSModel.RemoteActionCompatParcelizer.$$a
                int r6 = r6 * 3
                int r6 = 115 - r6
                int r1 = r8 + 4
                int r7 = 66 - r7
                byte[] r1 = new byte[r1]
                int r8 = r8 + 3
                r2 = 0
                if (r0 != 0) goto L15
                r6 = r7
                r4 = r8
                r3 = r2
                goto L2a
            L15:
                r3 = r2
            L16:
                byte r4 = (byte) r6
                r1[r3] = r4
                if (r3 != r8) goto L23
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L23:
                r4 = r0[r7]
                int r3 = r3 + 1
                r5 = r7
                r7 = r6
                r6 = r5
            L2a:
                int r7 = r7 + r4
                int r7 = r7 + (-2)
                int r6 = r6 + 1
                r5 = r7
                r7 = r6
                r6 = r5
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: o.InteractiveVideoElementLSModel.RemoteActionCompatParcelizer.c(short, short, byte, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void d(int r7, byte r8, short r9, java.lang.Object[] r10) {
            /*
                int r9 = 28 - r9
                int r8 = 36 - r8
                byte[] r0 = o.InteractiveVideoElementLSModel.RemoteActionCompatParcelizer.$$d
                int r7 = 114 - r7
                byte[] r1 = new byte[r9]
                r2 = 0
                if (r0 != 0) goto L11
                r7 = r8
                r3 = r9
                r4 = r2
                goto L29
            L11:
                r3 = r2
            L12:
                r6 = r8
                r8 = r7
                r7 = r6
                int r4 = r3 + 1
                byte r5 = (byte) r8
                r1[r3] = r5
                if (r4 != r9) goto L24
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L24:
                r3 = r0[r7]
                r6 = r8
                r8 = r7
                r7 = r6
            L29:
                int r8 = r8 + 1
                int r7 = r7 + r3
                r3 = r4
                goto L12
            */
            throw new UnsupportedOperationException("Method not decompiled: o.InteractiveVideoElementLSModel.RemoteActionCompatParcelizer.d(int, byte, short, java.lang.Object[]):void");
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/InteractiveVideoElementLSModel$RemoteActionCompatParcelizer$IconCompatParcelizer;", "Lo/InteractiveVideoElementLSModel$RemoteActionCompatParcelizer;", "<init>", "()V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class IconCompatParcelizer extends RemoteActionCompatParcelizer {
            public static final IconCompatParcelizer INSTANCE = new IconCompatParcelizer();

            private IconCompatParcelizer() {
                super(null);
            }
        }

        private RemoteActionCompatParcelizer() {
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u000e"}, d2 = {"Lo/InteractiveVideoElementLSModel$RemoteActionCompatParcelizer$read;", "Lo/InteractiveVideoElementLSModel$RemoteActionCompatParcelizer;", "", "p0", "<init>", "(Ljava/lang/String;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "write", "Ljava/lang/String;", "RemoteActionCompatParcelizer"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class read extends RemoteActionCompatParcelizer {
            private final String write;

            public read(String str) {
                super(null);
                this.write = str;
            }

            public /* synthetic */ read(String str, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
                this((i & 1) != 0 ? null : str);
            }

            /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
            public final String getWrite() {
                return this.write;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public read() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public final boolean equals(Object p0) {
                if (this == p0) {
                    return true;
                }
                return (p0 instanceof read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) ((read) p0).write);
            }

            public final int hashCode() {
                String str = this.write;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                String str = this.write;
                StringBuilder sb = new StringBuilder("read(write=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }
        }

        /* JADX INFO: renamed from: o.InteractiveVideoElementLSModel$RemoteActionCompatParcelizer$RemoteActionCompatParcelizer, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/InteractiveVideoElementLSModel$RemoteActionCompatParcelizer$RemoteActionCompatParcelizer;", "Lo/InteractiveVideoElementLSModel$RemoteActionCompatParcelizer;", "<init>", "()V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class C0032RemoteActionCompatParcelizer extends RemoteActionCompatParcelizer {
            public static final C0032RemoteActionCompatParcelizer INSTANCE = new C0032RemoteActionCompatParcelizer();

            private C0032RemoteActionCompatParcelizer() {
                super(null);
            }
        }

        private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            buildSetRequirementsIntent buildsetrequirementsintent = new buildSetRequirementsIntent();
            char[] cArrAudioAttributesCompatParcelizer = buildSetRequirementsIntent.AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer ^ 4027965449757546139L, cArr, i);
            buildsetrequirementsintent.write = 4;
            while (buildsetrequirementsintent.write < cArrAudioAttributesCompatParcelizer.length) {
                int i3 = $10 + 15;
                $11 = i3 % 128;
                int i4 = i3 % 2;
                buildsetrequirementsintent.read = buildsetrequirementsintent.write - 4;
                int i5 = buildsetrequirementsintent.write;
                try {
                    Object[] objArr2 = {Long.valueOf(cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write] ^ cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write % 4]), Long.valueOf(buildsetrequirementsintent.read), Long.valueOf(RemoteActionCompatParcelizer)};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2134927292);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (TextUtils.indexOf((CharSequence) "", '0') + 1), 12424 - (ViewConfiguration.getEdgeSlop() >> 16), 21 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), -17408815, false, CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT, new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                    }
                    cArrAudioAttributesCompatParcelizer[i5] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {buildsetrequirementsintent, buildsetrequirementsintent};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(141570176);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), Drawable.resolveOpacity(0, 0) + 1868, 10 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 1983509525, false, $$g(b, b2, b2), new Class[]{Object.class, Object.class});
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
            String str = new String(cArrAudioAttributesCompatParcelizer, 4, cArrAudioAttributesCompatParcelizer.length - 4);
            int i6 = $10 + 121;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            objArr[0] = str;
        }

        private static void b(int i, byte[] bArr, char[] cArr, int[] iArr, Object[] objArr) throws Throwable {
            int length;
            char[] cArr2;
            int i2 = 2 % 2;
            notifyDownloads notifydownloads = new notifyDownloads();
            char[] cArr3 = read;
            if (cArr3 != null) {
                int i3 = $10 + 125;
                $11 = i3 % 128;
                if (i3 % 2 == 0) {
                    length = cArr3.length;
                    cArr2 = new char[length];
                } else {
                    length = cArr3.length;
                    cArr2 = new char[length];
                }
                int i4 = 0;
                while (i4 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[i4])};
                        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-298077624);
                        if (objRemoteActionCompatParcelizer == null) {
                            objRemoteActionCompatParcelizer = startForeground.read((char) (44862 - View.MeasureSpec.getSize(0)), Process.getGidForName("") + 18945, TextUtils.getCapsMode("", 0, 0) + 28, -1871546659, false, CmcdHeadersFactory.STREAMING_FORMAT_SS, new Class[]{Integer.TYPE});
                        }
                        cArr2[i4] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                        i4++;
                        int i5 = $10 + 13;
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
                cArr3 = cArr2;
            }
            Object[] objArr3 = {Integer.valueOf(IconCompatParcelizer)};
            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(680566917);
            if (objRemoteActionCompatParcelizer2 == null) {
                objRemoteActionCompatParcelizer2 = startForeground.read((char) ExpandableListView.getPackedPositionType(0L), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 19033, (KeyEvent.getMaxKeyCode() >> 16) + 75, 1457087504, false, "r", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
            if (write) {
                notifydownloads.AudioAttributesCompatParcelizer = bArr.length;
                char[] cArr4 = new char[notifydownloads.AudioAttributesCompatParcelizer];
                notifydownloads.IconCompatParcelizer = 0;
                while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
                    int i7 = $10 + 81;
                    $11 = i7 % 128;
                    if (i7 % 2 == 0) {
                        cArr4[notifydownloads.IconCompatParcelizer] = (char) (cArr3[bArr[(notifydownloads.AudioAttributesCompatParcelizer << 1) >>> notifydownloads.IconCompatParcelizer] >> i] - iIntValue);
                        Object[] objArr4 = {notifydownloads, notifydownloads};
                        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1593953308);
                        if (objRemoteActionCompatParcelizer3 == null) {
                            objRemoteActionCompatParcelizer3 = startForeground.read((char) ((ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) - 1), 11439 - View.resolveSizeAndState(0, 0, 0), 13 - TextUtils.lastIndexOf("", '0'), -558368911, false, "q", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                    } else {
                        cArr4[notifydownloads.IconCompatParcelizer] = (char) (cArr3[bArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] + i] - iIntValue);
                        Object[] objArr5 = {notifydownloads, notifydownloads};
                        Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1593953308);
                        if (objRemoteActionCompatParcelizer4 == null) {
                            objRemoteActionCompatParcelizer4 = startForeground.read((char) Drawable.resolveOpacity(0, 0), 11440 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), KeyEvent.getDeadChar(0, 0) + 14, -558368911, false, "q", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
                    }
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (!AudioAttributesCompatParcelizer) {
                notifydownloads.AudioAttributesCompatParcelizer = iArr.length;
                char[] cArr5 = new char[notifydownloads.AudioAttributesCompatParcelizer];
                notifydownloads.IconCompatParcelizer = 0;
                while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
                    int i8 = $11 + 95;
                    $10 = i8 % 128;
                    int i9 = i8 % 2;
                    cArr5[notifydownloads.IconCompatParcelizer] = (char) (cArr3[iArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] - i] - iIntValue);
                    notifydownloads.IconCompatParcelizer++;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            int i10 = $11 + 5;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            notifydownloads.AudioAttributesCompatParcelizer = cArr.length;
            char[] cArr6 = new char[notifydownloads.AudioAttributesCompatParcelizer];
            notifydownloads.IconCompatParcelizer = 0;
            while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
                cArr6[notifydownloads.IconCompatParcelizer] = (char) (cArr3[cArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] - i] - iIntValue);
                Object[] objArr6 = {notifydownloads, notifydownloads};
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-1593953308);
                if (objRemoteActionCompatParcelizer5 == null) {
                    objRemoteActionCompatParcelizer5 = startForeground.read((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 11439, 13 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), -558368911, false, "q", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6);
            }
            objArr[0] = new String(cArr6);
        }

        public /* synthetic */ RemoteActionCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:175:0x0c4c A[Catch: Exception -> 0x0c98, all -> 0x0cba, IOException -> 0x0cbe, TryCatch #19 {, blocks: (B:43:0x0624, B:44:0x0647, B:52:0x071b, B:66:0x077f, B:76:0x0812, B:108:0x09e9, B:109:0x09ec, B:111:0x09fa, B:112:0x0a40, B:114:0x0a58, B:115:0x0a9f, B:116:0x0ab0, B:118:0x0ad5, B:120:0x0b00, B:122:0x0b19, B:124:0x0b3e, B:126:0x0bbd, B:128:0x0bc5, B:199:0x0c98, B:200:0x0cb9, B:156:0x0c1d, B:157:0x0c20, B:160:0x0c25, B:162:0x0c2d, B:163:0x0c2e, B:173:0x0c44, B:175:0x0c4c, B:176:0x0c4d, B:184:0x0c65, B:186:0x0c6b, B:187:0x0c6c, B:190:0x0c7a, B:192:0x0c80, B:193:0x0c81), top: B:322:0x0624 }] */
        /* JADX WARN: Removed duplicated region for block: B:176:0x0c4d A[Catch: Exception -> 0x0c98, all -> 0x0cba, IOException -> 0x0cbe, TryCatch #19 {, blocks: (B:43:0x0624, B:44:0x0647, B:52:0x071b, B:66:0x077f, B:76:0x0812, B:108:0x09e9, B:109:0x09ec, B:111:0x09fa, B:112:0x0a40, B:114:0x0a58, B:115:0x0a9f, B:116:0x0ab0, B:118:0x0ad5, B:120:0x0b00, B:122:0x0b19, B:124:0x0b3e, B:126:0x0bbd, B:128:0x0bc5, B:199:0x0c98, B:200:0x0cb9, B:156:0x0c1d, B:157:0x0c20, B:160:0x0c25, B:162:0x0c2d, B:163:0x0c2e, B:173:0x0c44, B:175:0x0c4c, B:176:0x0c4d, B:184:0x0c65, B:186:0x0c6b, B:187:0x0c6c, B:190:0x0c7a, B:192:0x0c80, B:193:0x0c81), top: B:322:0x0624 }] */
        /* JADX WARN: Removed duplicated region for block: B:186:0x0c6b A[Catch: Exception -> 0x0c98, all -> 0x0cba, IOException -> 0x0cbe, TryCatch #19 {, blocks: (B:43:0x0624, B:44:0x0647, B:52:0x071b, B:66:0x077f, B:76:0x0812, B:108:0x09e9, B:109:0x09ec, B:111:0x09fa, B:112:0x0a40, B:114:0x0a58, B:115:0x0a9f, B:116:0x0ab0, B:118:0x0ad5, B:120:0x0b00, B:122:0x0b19, B:124:0x0b3e, B:126:0x0bbd, B:128:0x0bc5, B:199:0x0c98, B:200:0x0cb9, B:156:0x0c1d, B:157:0x0c20, B:160:0x0c25, B:162:0x0c2d, B:163:0x0c2e, B:173:0x0c44, B:175:0x0c4c, B:176:0x0c4d, B:184:0x0c65, B:186:0x0c6b, B:187:0x0c6c, B:190:0x0c7a, B:192:0x0c80, B:193:0x0c81), top: B:322:0x0624 }] */
        /* JADX WARN: Removed duplicated region for block: B:187:0x0c6c A[Catch: Exception -> 0x0c98, all -> 0x0cba, IOException -> 0x0cbe, TryCatch #19 {, blocks: (B:43:0x0624, B:44:0x0647, B:52:0x071b, B:66:0x077f, B:76:0x0812, B:108:0x09e9, B:109:0x09ec, B:111:0x09fa, B:112:0x0a40, B:114:0x0a58, B:115:0x0a9f, B:116:0x0ab0, B:118:0x0ad5, B:120:0x0b00, B:122:0x0b19, B:124:0x0b3e, B:126:0x0bbd, B:128:0x0bc5, B:199:0x0c98, B:200:0x0cb9, B:156:0x0c1d, B:157:0x0c20, B:160:0x0c25, B:162:0x0c2d, B:163:0x0c2e, B:173:0x0c44, B:175:0x0c4c, B:176:0x0c4d, B:184:0x0c65, B:186:0x0c6b, B:187:0x0c6c, B:190:0x0c7a, B:192:0x0c80, B:193:0x0c81), top: B:322:0x0624 }] */
        /* JADX WARN: Removed duplicated region for block: B:240:0x10ec A[PHI: r1 r2 r6
          0x10ec: PHI (r1v8 int) = (r1v4 int), (r1v4 int), (r1v11 int) binds: [B:216:0x0ddc, B:218:0x0e6b, B:364:0x10ec] A[DONT_GENERATE, DONT_INLINE]
          0x10ec: PHI (r2v13 java.lang.String[]) = (r2v9 java.lang.String[]), (r2v9 java.lang.String[]), (r2v19 java.lang.String[]) binds: [B:216:0x0ddc, B:218:0x0e6b, B:364:0x10ec] A[DONT_GENERATE, DONT_INLINE]
          0x10ec: PHI (r6v7 int) = (r6v6 int), (r6v6 int), (r6v9 int) binds: [B:216:0x0ddc, B:218:0x0e6b, B:364:0x10ec] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0339  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x04a4 A[PHI: r2 r3 r4 r6 r7 r10 r13 r28 r34 r35
          0x04a4: PHI (r2v45 int) = (r2v0 int), (r2v87 int) binds: [B:23:0x0337, B:351:0x04a4] A[DONT_GENERATE, DONT_INLINE]
          0x04a4: PHI (r3v59 int) = (r3v58 int), (r3v93 int) binds: [B:23:0x0337, B:351:0x04a4] A[DONT_GENERATE, DONT_INLINE]
          0x04a4: PHI (r4v63 int) = (r4v62 int), (r4v144 int) binds: [B:23:0x0337, B:351:0x04a4] A[DONT_GENERATE, DONT_INLINE]
          0x04a4: PHI (r6v33 java.lang.Object) = (r6v32 java.lang.Object), (r6v155 java.lang.Object) binds: [B:23:0x0337, B:351:0x04a4] A[DONT_GENERATE, DONT_INLINE]
          0x04a4: PHI (r7v69 int) = (r7v0 int), (r7v164 int) binds: [B:23:0x0337, B:351:0x04a4] A[DONT_GENERATE, DONT_INLINE]
          0x04a4: PHI (r10v39 int) = (r10v0 int), (r10v69 int) binds: [B:23:0x0337, B:351:0x04a4] A[DONT_GENERATE, DONT_INLINE]
          0x04a4: PHI (r13v20 int) = (r13v19 int), (r13v85 int) binds: [B:23:0x0337, B:351:0x04a4] A[DONT_GENERATE, DONT_INLINE]
          0x04a4: PHI (r28v2 long) = (r28v29 long), (r28v21 long) binds: [B:23:0x0337, B:351:0x04a4] A[DONT_GENERATE, DONT_INLINE]
          0x04a4: PHI (r34v4 ??) = (r34v27 ??), (r34v22 ??) binds: [B:23:0x0337, B:351:0x04a4] A[DONT_GENERATE, DONT_INLINE]
          0x04a4: PHI (r35v3 long) = (r35v33 long), (r35v28 long) binds: [B:23:0x0337, B:351:0x04a4] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:39:0x059c  */
        /* JADX WARN: Type inference failed for: r1v233 */
        /* JADX WARN: Type inference failed for: r1v81 */
        /* JADX WARN: Type inference failed for: r1v82 */
        /* JADX WARN: Type inference failed for: r1v84 */
        /* JADX WARN: Type inference failed for: r1v86, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r1v98 */
        /* JADX WARN: Type inference failed for: r28v10 */
        /* JADX WARN: Type inference failed for: r28v11 */
        /* JADX WARN: Type inference failed for: r28v12 */
        /* JADX WARN: Type inference failed for: r28v13 */
        /* JADX WARN: Type inference failed for: r28v14 */
        /* JADX WARN: Type inference failed for: r28v16 */
        /* JADX WARN: Type inference failed for: r28v17 */
        /* JADX WARN: Type inference failed for: r28v18 */
        /* JADX WARN: Type inference failed for: r28v19 */
        /* JADX WARN: Type inference failed for: r28v20 */
        /* JADX WARN: Type inference failed for: r28v4 */
        /* JADX WARN: Type inference failed for: r28v48 */
        /* JADX WARN: Type inference failed for: r28v49 */
        /* JADX WARN: Type inference failed for: r28v5 */
        /* JADX WARN: Type inference failed for: r28v50 */
        /* JADX WARN: Type inference failed for: r28v6 */
        /* JADX WARN: Type inference failed for: r28v7 */
        /* JADX WARN: Type inference failed for: r28v8 */
        /* JADX WARN: Type inference failed for: r28v9 */
        /* JADX WARN: Type inference failed for: r2v239 */
        /* JADX WARN: Type inference failed for: r2v60 */
        /* JADX WARN: Type inference failed for: r2v62 */
        /* JADX WARN: Type inference failed for: r34v10 */
        /* JADX WARN: Type inference failed for: r34v11 */
        /* JADX WARN: Type inference failed for: r34v12 */
        /* JADX WARN: Type inference failed for: r34v21 */
        /* JADX WARN: Type inference failed for: r34v22 */
        /* JADX WARN: Type inference failed for: r34v26 */
        /* JADX WARN: Type inference failed for: r34v27 */
        /* JADX WARN: Type inference failed for: r34v28 */
        /* JADX WARN: Type inference failed for: r34v30 */
        /* JADX WARN: Type inference failed for: r34v31 */
        /* JADX WARN: Type inference failed for: r34v32 */
        /* JADX WARN: Type inference failed for: r34v33 */
        /* JADX WARN: Type inference failed for: r34v34 */
        /* JADX WARN: Type inference failed for: r34v35 */
        /* JADX WARN: Type inference failed for: r34v4 */
        /* JADX WARN: Type inference failed for: r34v5 */
        /* JADX WARN: Type inference failed for: r34v6 */
        /* JADX WARN: Type inference failed for: r34v7 */
        /* JADX WARN: Type inference failed for: r34v8 */
        /* JADX WARN: Type inference failed for: r34v9 */
        /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.String[]] */
        /* JADX WARN: Type inference failed for: r5v25 */
        /* JADX WARN: Type inference failed for: r6v141, types: [java.lang.String[]] */
        /* JADX WARN: Type inference failed for: r6v142, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r7v245 */
        /* JADX WARN: Type inference failed for: r7v84, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r7v85 */
        /* JADX WARN: Type inference failed for: r7v86 */
        /* JADX WARN: Type inference failed for: r8v164 */
        /* JADX WARN: Type inference failed for: r8v174 */
        /* JADX WARN: Type inference failed for: r8v248 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static java.lang.Object[] RemoteActionCompatParcelizer(android.content.Context r45, int r46, int r47, int r48) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 6838
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.InteractiveVideoElementLSModel.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(android.content.Context, int, int, int):java.lang.Object[]");
        }
    }

    /* JADX INFO: renamed from: o.InteractiveVideoElementLSModel$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lo/InteractiveVideoElementLSModel$IconCompatParcelizer;", "", "<init>", "()V", "Lo/InteractiveVideoElementLSModel$read;", "read", "()Lo/InteractiveVideoElementLSModel$read;", "Lo/InteractiveVideoElementLSModel$RemoteActionCompatParcelizer;", "RemoteActionCompatParcelizer", "()Lo/InteractiveVideoElementLSModel$RemoteActionCompatParcelizer;", "", "AudioAttributesCompatParcelizer", "()Z", "write", "Lo/InteractiveVideoElementLSModel$read;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private static final byte[] $$g = {9, -88, -121, TarConstants.LF_FIFO, 61, -61, -2, -19, 29, -37, 15, -23, 11, 10, -22, -15, 8, 22, -27, -22, 35, -32, 7, -28, 9, -1, -14, -5, 47, -49, 6, 16, -35, -8, 6, -15, 7, -10, -3, 9, 0, -7};
        private static final int $$h = 139;
        private static final byte[] $$d = {64, TarConstants.LF_GNUTYPE_LONGLINK, 61, -128, 26, 12, -1, -43, 44, -2, 3, -15, 19, -36, 17, 17, -15, 2, 7, -3, 17, -21, 13};
        private static final int $$e = 91;
        private static final byte[] $$a = {98, -46, 102, 39, 43, -56, -6, 45, -5, 4, -26, 16, 46, -67, 6, -18, 2, TarConstants.LF_BLK, -41, -40, 2, -11, 6, -9, 3, 4, -26, 16, 46, -67, 6, -18, 2, TarConstants.LF_BLK, -26, -46, 6, -23, -5, 34, -40, 9, -8, -6, -18, 4, -26, 16, 46, -67, 6, -18, 2, TarConstants.LF_BLK, -42, -38, -3, 4, -10, 2, -3, -20, 29, -40, 2, -11, 6, -9, 3, 4, -26, 16, 46, -67, 6, -18, 2, TarConstants.LF_BLK, -26, -46, 6, -23, -5, -3, -20, 44, -46, 6, -23, -5, 34, -40, 9, -8, -6, -18, -8, 9, -8, 19, -34, 2, -21, 12, -22, -12, -8, 9, -8, 19, -34, 2, -21, 12, -22, -12, 68};
        private static final int $$b = 236;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void a(byte r6, int r7, short r8, java.lang.Object[] r9) {
            /*
                byte[] r0 = kotlin.InteractiveVideoElementLSModel.Companion.$$a
                int r1 = r8 + 6
                int r7 = 106 - r7
                int r6 = r6 + 98
                byte[] r1 = new byte[r1]
                int r8 = r8 + 5
                r2 = 0
                if (r0 != 0) goto L13
                r3 = r7
                r6 = r8
                r4 = r2
                goto L28
            L13:
                r3 = r2
            L14:
                byte r4 = (byte) r6
                r1[r3] = r4
                int r4 = r3 + 1
                if (r3 != r8) goto L23
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L23:
                r3 = r0[r7]
                r5 = r3
                r3 = r7
                r7 = r5
            L28:
                int r7 = -r7
                int r6 = r6 + r7
                int r6 = r6 + (-5)
                int r7 = r3 + 1
                r3 = r4
                goto L14
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.InteractiveVideoElementLSModel.Companion.a(byte, int, short, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void b(short r6, int r7, byte r8, java.lang.Object[] r9) {
            /*
                int r6 = r6 * 3
                int r6 = r6 + 73
                byte[] r0 = kotlin.InteractiveVideoElementLSModel.Companion.$$d
                int r8 = r8 * 3
                int r8 = r8 + 20
                int r7 = r7 + 4
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L15
                r3 = r7
                r6 = r8
                r4 = r2
                goto L2d
            L15:
                r3 = r2
            L16:
                int r7 = r7 + 1
                byte r4 = (byte) r6
                r1[r3] = r4
                int r3 = r3 + 1
                if (r3 != r8) goto L27
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L27:
                r4 = r0[r7]
                r5 = r3
                r3 = r7
                r7 = r4
                r4 = r5
            L2d:
                int r6 = r6 + r7
                r7 = r3
                r3 = r4
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.InteractiveVideoElementLSModel.Companion.b(short, int, byte, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002e). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void c(short r6, short r7, byte r8, java.lang.Object[] r9) {
            /*
                int r7 = r7 * 32
                int r0 = r7 + 4
                int r6 = r6 * 3
                int r6 = r6 + 111
                int r8 = r8 + 4
                byte[] r1 = kotlin.InteractiveVideoElementLSModel.Companion.$$g
                byte[] r0 = new byte[r0]
                int r7 = r7 + 3
                r2 = 0
                if (r1 != 0) goto L16
                r3 = r8
                r4 = r2
                goto L2e
            L16:
                r3 = r2
            L17:
                byte r4 = (byte) r6
                r0[r3] = r4
                int r8 = r8 + 1
                if (r3 != r7) goto L26
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L26:
                int r3 = r3 + 1
                r4 = r1[r8]
                r5 = r3
                r3 = r8
                r8 = r4
                r4 = r5
            L2e:
                int r8 = -r8
                int r6 = r6 + r8
                int r6 = r6 + (-4)
                r8 = r3
                r3 = r4
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.InteractiveVideoElementLSModel.Companion.c(short, short, byte, java.lang.Object[]):void");
        }

        private Companion() {
        }

        public static RemoteActionCompatParcelizer RemoteActionCompatParcelizer() {
            String[] strArr = Build.SUPPORTED_ABIS;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strArr, "");
            for (String str : strArr) {
                if (InteractiveMcqOption.write.contains(str)) {
                    InteractiveVideoElementLSModel.write = read.AudioAttributesCompatParcelizer;
                    byte b = (byte) 0;
                    try {
                        Object[] objArr = new Object[1];
                        a(b, $$a[2], b, objArr);
                        String str2 = (String) objArr[0];
                        ClassLoader classLoader = Companion.class.getClassLoader();
                        try {
                            Object[] objArr2 = {96126657};
                            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2072911000);
                            if (objRemoteActionCompatParcelizer == null) {
                                objRemoteActionCompatParcelizer = startForeground.read((char) (26153 - TextUtils.getOffsetBefore("", 0)), 1343 - Color.argb(0, 0, 0, 0), Color.alpha(0) + 19, -96983043, false, null, new Class[]{Integer.TYPE});
                            }
                            try {
                                Object[] objArr3 = {str2, classLoader, false, -291217042, ((Constructor) objRemoteActionCompatParcelizer).newInstance(objArr2), -291217042};
                                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-893064501);
                                if (objRemoteActionCompatParcelizer2 == null) {
                                    char c = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 61147);
                                    int i = 2146 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                    int defaultSize = 12 - View.getDefaultSize(0, 0);
                                    byte b2 = $$d[6];
                                    byte b3 = (byte) (b2 + 1);
                                    byte b4 = b2;
                                    Object[] objArr4 = new Object[1];
                                    b(b3, b4, (byte) (b4 + 1), objArr4);
                                    objRemoteActionCompatParcelizer2 = startForeground.read(c, i, defaultSize, -1265815970, false, (String) objArr4[0], new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) startForeground.IconCompatParcelizer((char) (11524 - (ViewConfiguration.getFadingEdgeLength() >> 16)), (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 574, View.MeasureSpec.getSize(0) + 41), Integer.TYPE});
                                }
                                Object[] objArr5 = (Object[]) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
                                int i2 = ((int[]) objArr5[3])[0];
                                int i3 = ((int[]) objArr5[1])[0];
                                if (i3 == i2) {
                                    Object[] objArr6 = {new int[1], new int[]{i}, strArr, new int[]{i}};
                                    int i4 = ((int[]) objArr5[0])[0];
                                    int i5 = ((int[]) objArr5[1])[0];
                                    int i6 = ((int[]) objArr5[3])[0];
                                    String[] strArr2 = (String[]) objArr5[2];
                                    int i7 = (int) Runtime.getRuntime().totalMemory();
                                    int i8 = i4 + (-2001438566) + ((~((~i7) | (-26215809))) * 433) + (((~((-1514659918) | i7)) | (-462505422)) * (-433)) + (((~(i7 | (-462505422))) | (-1540875726)) * 433);
                                    int i9 = (i8 << 13) ^ i8;
                                    int i10 = i9 ^ (i9 >>> 17);
                                    ((int[]) objArr6[0])[0] = i10 ^ (i10 << 5);
                                    Object[] objArr7 = {new int[1], new int[]{i}, strArr, new int[]{i}};
                                    int i11 = ((int[]) objArr6[0])[0];
                                    int i12 = ((int[]) objArr6[1])[0];
                                    int i13 = ((int[]) objArr6[3])[0];
                                    String[] strArr3 = strArr2;
                                    int i14 = ~(((int) Process.getElapsedCpuTime()) | 1826056702);
                                    int i15 = i11 + (((1537858870 + (((-151108637) | i14) * (-220))) + ((i14 | (-1842871807)) * 220)) - 1034950884);
                                    int i16 = (i15 << 13) ^ i15;
                                    int i17 = i16 ^ (i16 >>> 17);
                                    ((int[]) objArr7[0])[0] = i17 ^ (i17 << 5);
                                    Object[] objArr8 = {new int[1], new int[]{i}, strArr3, new int[]{i}};
                                    int i18 = ((int[]) objArr7[0])[0];
                                    int i19 = ((int[]) objArr7[1])[0];
                                    int i20 = ((int[]) objArr7[3])[0];
                                    int i21 = i18 + ((((~((-1643033819) | r5)) | 1912915354) * 398) - 185878590) + (((~((~Process.myPid()) | (-1643033819))) | 1912915354) * 398);
                                    int i22 = (i21 << 13) ^ i21;
                                    int i23 = i22 ^ (i22 >>> 17);
                                    ((int[]) objArr8[0])[0] = i23 ^ (i23 << 5);
                                } else {
                                    ArrayList arrayList = new ArrayList();
                                    String[] strArr4 = (String[]) objArr5[2];
                                    if (strArr4 != null) {
                                        for (String str3 : strArr4) {
                                            arrayList.add(str3);
                                        }
                                    }
                                    Context applicationContext = (Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null);
                                    if (applicationContext != null) {
                                        applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
                                    }
                                    if (Looper.myLooper() == null) {
                                        applicationContext = null;
                                    }
                                    long j = i2 ^ i3;
                                    long j2 = -1;
                                    try {
                                        Object[] objArr9 = {applicationContext, Long.valueOf((((j2 - ((j2 >> 63) << 32)) | (((long) 0) << 32)) & j) ^ 1101265030994722816L), 256408118L};
                                        byte[] bArr = $$g;
                                        byte b5 = bArr[40];
                                        byte b6 = bArr[25];
                                        Object[] objArr10 = new Object[1];
                                        c(b5, (byte) (-b6), b6, objArr10);
                                        Class<?> cls = Class.forName((String) objArr10[0]);
                                        byte b7 = (byte) (-bArr[25]);
                                        byte b8 = bArr[40];
                                        Object[] objArr11 = new Object[1];
                                        c(b7, b8, (byte) (b8 | 34), objArr11);
                                        cls.getMethod((String) objArr11[0], Context.class, Long.TYPE, Long.TYPE).invoke(null, objArr9);
                                        Object[] objArr12 = {new int[1], new int[]{i}, strArr, new int[]{i}};
                                        int i24 = ((int[]) objArr5[0])[0];
                                        int i25 = ((int[]) objArr5[1])[0];
                                        int i26 = ((int[]) objArr5[3])[0];
                                        String[] strArr5 = (String[]) objArr5[2];
                                        int i27 = i24 + ((((~((-4493329) | r4)) | 1167198600) * 501) - 924938334) + ((~((~((int) SystemClock.elapsedRealtime())) | (-4493329))) * 501);
                                        int i28 = (i27 << 13) ^ i27;
                                        int i29 = i28 ^ (i28 >>> 17);
                                        ((int[]) objArr12[0])[0] = i29 ^ (i29 << 5);
                                        long j3 = -1;
                                        long j4 = ((((long) 0) << 32) | (j3 - ((j3 >> 63) << 32))) & j;
                                        long j5 = 0;
                                        long j6 = j4 | (((long) 10) << 32) | (j5 - ((j5 >> 63) << 32));
                                        try {
                                            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                                            if (objRemoteActionCompatParcelizer3 == null) {
                                                objRemoteActionCompatParcelizer3 = startForeground.read((char) (4535 - KeyEvent.normalizeMetaState(0)), (ViewConfiguration.getEdgeSlop() >> 16) + 6054, 42 - View.resolveSizeAndState(0, 0, 0), -764908173, false, "IconCompatParcelizer", new Class[0]);
                                            }
                                            Object objInvoke = ((Method) objRemoteActionCompatParcelizer3).invoke(null, null);
                                            try {
                                                Object[] objArr13 = {96126657, Long.valueOf(j6), arrayList, TrainingApplication.RemoteActionCompatParcelizer(), false, false};
                                                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1458445422);
                                                if (objRemoteActionCompatParcelizer4 == null) {
                                                    objRemoteActionCompatParcelizer4 = startForeground.read((char) TextUtils.indexOf("", "", 0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 6029, 24 - ExpandableListView.getPackedPositionGroup(0L), 682088699, false, "IconCompatParcelizer", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                                                }
                                                ((Method) objRemoteActionCompatParcelizer4).invoke(objInvoke, objArr13);
                                                Object[] objArr14 = {new int[1], new int[]{i}, strArr, new int[]{i}};
                                                int i30 = ((int[]) objArr12[0])[0];
                                                int i31 = ((int[]) objArr12[1])[0];
                                                int i32 = ((int[]) objArr12[3])[0];
                                                String[] strArr6 = (String[]) objArr12[2];
                                                int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                                                int i33 = i30 + 1632273238 + (((~((-369182237) | elapsedCpuTime)) | (~((~elapsedCpuTime) | 1607983102))) * (-318)) + (((~(374593468 | elapsedCpuTime)) | 1233389634) * (-318)) + (((~(elapsedCpuTime | (-374593469))) | (-1602571871)) * 318);
                                                int i34 = (i33 << 13) ^ i33;
                                                int i35 = i34 ^ (i34 >>> 17);
                                                ((int[]) objArr14[0])[0] = i35 ^ (i35 << 5);
                                                Toast.makeText((Context) null, i3 / (((i3 - 1) * i3) % 2), 0).show();
                                                Object[] objArr15 = {new int[1], new int[]{i}, strArr, new int[]{i}};
                                                int i36 = ((int[]) objArr14[0])[0];
                                                int i37 = ((int[]) objArr14[1])[0];
                                                int i38 = ((int[]) objArr14[3])[0];
                                                String[] strArr7 = (String[]) objArr14[2];
                                                int iMyTid = Process.myTid();
                                                int i39 = i36 + 259252818 + ((~((~iMyTid) | 1977163254)) * (-116)) + ((84936804 | iMyTid) * 116) + (((~(iMyTid | (-1892228535))) | 2084) * 116);
                                                int i40 = (i39 << 13) ^ i39;
                                                int i41 = i40 ^ (i40 >>> 17);
                                                ((int[]) objArr15[0])[0] = i41 ^ (i41 << 5);
                                            } catch (Throwable th) {
                                                Throwable cause = th.getCause();
                                                if (cause != null) {
                                                    throw cause;
                                                }
                                                throw th;
                                            }
                                        } catch (Throwable th2) {
                                            Throwable cause2 = th2.getCause();
                                            if (cause2 != null) {
                                                throw cause2;
                                            }
                                            throw th2;
                                        }
                                    } catch (Throwable th3) {
                                        Throwable cause3 = th3.getCause();
                                        if (cause3 != null) {
                                            throw cause3;
                                        }
                                        throw th3;
                                    }
                                }
                                try {
                                    byte[] bArr2 = $$a;
                                    Object[] objArr16 = new Object[1];
                                    a((byte) (-bArr2[42]), (byte) (bArr2[0] - 1), (byte) (-bArr2[21]), objArr16);
                                    Class<?> cls2 = Class.forName((String) objArr16[0]);
                                    Object[] objArr17 = new Object[1];
                                    a((byte) (-bArr2[42]), (byte) 81, (byte) (bArr2[11] - 1), objArr17);
                                    Class<?> cls3 = Class.forName((String) objArr17[0]);
                                    byte b9 = (byte) (-bArr2[42]);
                                    Object[] objArr18 = new Object[1];
                                    a(b9, (byte) (b9 | TarConstants.LF_DIR), (byte) (-bArr2[58]), objArr18);
                                    Class<?> cls4 = Class.forName((String) objArr18[0]);
                                    Object[] objArr19 = new Object[1];
                                    a((byte) (-bArr2[8]), bArr2[12], bArr2[9], objArr19);
                                    Object objInvoke2 = cls2.getMethod((String) objArr19[0], new Class[0]).invoke(null, new Object[0]);
                                    Object[] objArr20 = new Object[1];
                                    a((byte) (-bArr2[42]), (byte) 37, bArr2[41], objArr20);
                                    Class<?> cls5 = Class.forName((String) objArr20[0]);
                                    Object[] objArr21 = new Object[1];
                                    a((byte) (-bArr2[8]), (byte) (-bArr2[37]), (byte) (-bArr2[42]), objArr21);
                                    Object objInvoke3 = cls5.getMethod((String) objArr21[0], new Class[0]).invoke(Companion.class, new Object[0]);
                                    if (Build.VERSION.SDK_INT <= 24) {
                                        byte b10 = (byte) (-bArr2[58]);
                                        Object[] objArr22 = new Object[1];
                                        a(b10, b10, (byte) (-bArr2[8]), objArr22);
                                        Method declaredMethod = cls2.getDeclaredMethod((String) objArr22[0], cls4, cls3);
                                        declaredMethod.setAccessible(true);
                                        declaredMethod.invoke(objInvoke2, str2, objInvoke3);
                                    } else {
                                        Object[] objArr23 = new Object[1];
                                        a((byte) (-bArr2[58]), b, bArr2[14], objArr23);
                                        Method declaredMethod2 = cls2.getDeclaredMethod((String) objArr23[0], cls3, cls4);
                                        declaredMethod2.setAccessible(true);
                                        declaredMethod2.invoke(objInvoke2, objInvoke3, str2);
                                    }
                                    InteractiveVideoElementLSModel.write = read.write;
                                    return RemoteActionCompatParcelizer.IconCompatParcelizer.INSTANCE;
                                } catch (InvocationTargetException e) {
                                    Throwable cause4 = e.getCause();
                                    if (cause4 != null) {
                                        throw cause4;
                                    }
                                    throw e;
                                }
                            } catch (Throwable th4) {
                                Throwable cause5 = th4.getCause();
                                if (cause5 != null) {
                                    throw cause5;
                                }
                                throw th4;
                            }
                        } catch (Throwable th5) {
                            Throwable cause6 = th5.getCause();
                            if (cause6 != null) {
                                throw cause6;
                            }
                            throw th5;
                        }
                    } catch (Throwable th6) {
                        InteractiveVideoElementLSModel.write = read.read;
                        return new RemoteActionCompatParcelizer.read(th6.getMessage());
                    }
                }
            }
            InteractiveVideoElementLSModel.write = read.IconCompatParcelizer;
            return RemoteActionCompatParcelizer.C0032RemoteActionCompatParcelizer.INSTANCE;
        }

        public static boolean AudioAttributesCompatParcelizer() {
            return InteractiveVideoElementLSModel.write == read.write;
        }

        public static read read() {
            return InteractiveVideoElementLSModel.write;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
