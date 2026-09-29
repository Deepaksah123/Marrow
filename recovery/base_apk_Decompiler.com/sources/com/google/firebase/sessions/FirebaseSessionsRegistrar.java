package com.google.firebase.sessions;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.DrmUtilApi18;
import kotlin.FlacReader;
import kotlin.FlacReaderFlacOggSeeker;
import kotlin.IntermediateLoginResponseBody;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.MotionPhotoMetadata1;
import kotlin.OggExtractor;
import kotlin.OggPageHeader;
import kotlin.buildSetRequirementsIntent;
import kotlin.convertGranuleToTime;
import kotlin.getPlatform;
import kotlin.hasSamples;
import kotlin.isAudioPacket;
import kotlin.onInputBufferAvailable;
import kotlin.outputMetadata;
import kotlin.packetFinished;
import kotlin.startForeground;
import kotlin.toMagicModuleMetaRepoModel;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\u0007\u001a$\u0012 \u0012\u001e\u0012\n\b\u0001\u0012\u0006*\u00020\u00060\u0006*\u000e\u0012\n\b\u0001\u0012\u0006*\u00020\u00060\u00060\u00050\u00050\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "Lo/FlacReaderFlacOggSeeker;", "", "RemoteActionCompatParcelizer", "()Ljava/util/List;"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final packetFinished<FirebaseApp> AudioAttributesCompatParcelizer = packetFinished.read(FirebaseApp.class);
    private static final packetFinished<hasSamples> write = packetFinished.read(hasSamples.class);
    private static final packetFinished<getPlatform> IconCompatParcelizer = packetFinished.RemoteActionCompatParcelizer(FlacReader.class, getPlatform.class);
    private static final packetFinished<getPlatform> read = packetFinished.RemoteActionCompatParcelizer(isAudioPacket.class, getPlatform.class);
    private static final packetFinished<DrmUtilApi18> AudioAttributesImplApi26Parcelizer = packetFinished.read(DrmUtilApi18.class);

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<FlacReaderFlacOggSeeker<? extends Object>> RemoteActionCompatParcelizer() {
        return IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new FlacReaderFlacOggSeeker[]{FlacReaderFlacOggSeeker.read(MotionPhotoMetadata1.class).IconCompatParcelizer("fire-sessions").RemoteActionCompatParcelizer(convertGranuleToTime.write(AudioAttributesCompatParcelizer)).RemoteActionCompatParcelizer(convertGranuleToTime.write(write)).RemoteActionCompatParcelizer(convertGranuleToTime.write(IconCompatParcelizer)).RemoteActionCompatParcelizer(convertGranuleToTime.write(read)).RemoteActionCompatParcelizer(convertGranuleToTime.RemoteActionCompatParcelizer(AudioAttributesImplApi26Parcelizer)).write(new OggPageHeader() { // from class: o.SlowMotionData1
            @Override // kotlin.OggPageHeader
            public final Object AudioAttributesCompatParcelizer(OggExtractor oggExtractor) {
                return FirebaseSessionsRegistrar.AudioAttributesCompatParcelizer(oggExtractor);
            }
        }).read(), outputMetadata.write("fire-sessions", "1.0.0")});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MotionPhotoMetadata1 AudioAttributesCompatParcelizer(OggExtractor oggExtractor) {
        Object objAudioAttributesCompatParcelizer = oggExtractor.AudioAttributesCompatParcelizer(AudioAttributesCompatParcelizer);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(objAudioAttributesCompatParcelizer, "");
        FirebaseApp firebaseApp = (FirebaseApp) objAudioAttributesCompatParcelizer;
        Object objAudioAttributesCompatParcelizer2 = oggExtractor.AudioAttributesCompatParcelizer(write);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(objAudioAttributesCompatParcelizer2, "");
        hasSamples hassamples = (hasSamples) objAudioAttributesCompatParcelizer2;
        Object objAudioAttributesCompatParcelizer3 = oggExtractor.AudioAttributesCompatParcelizer(IconCompatParcelizer);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(objAudioAttributesCompatParcelizer3, "");
        getPlatform getplatform = (getPlatform) objAudioAttributesCompatParcelizer3;
        Object objAudioAttributesCompatParcelizer4 = oggExtractor.AudioAttributesCompatParcelizer(read);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(objAudioAttributesCompatParcelizer4, "");
        getPlatform getplatform2 = (getPlatform) objAudioAttributesCompatParcelizer4;
        onInputBufferAvailable oninputbufferavailableWrite = oggExtractor.write(AudioAttributesImplApi26Parcelizer);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(oninputbufferavailableWrite, "");
        return new MotionPhotoMetadata1(firebaseApp, hassamples, getplatform, getplatform2, oninputbufferavailableWrite);
    }

    /* JADX INFO: renamed from: com.google.firebase.sessions.FirebaseSessionsRegistrar$RemoteActionCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R,\u0010\b\u001a\u001a\u0012\b\u0012\u0006*\u00020\u00050\u0005*\f\u0012\b\u0012\u0006*\u00020\u00050\u00050\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R,\u0010\n\u001a\u001a\u0012\b\u0012\u0006*\u00020\u00050\u0005*\f\u0012\b\u0012\u0006*\u00020\u00050\u00050\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007R,\u0010\t\u001a\u001a\u0012\b\u0012\u0006*\u00020\u000b0\u000b*\f\u0012\b\u0012\u0006*\u00020\u000b0\u000b0\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0007R,\u0010\f\u001a\u001a\u0012\b\u0012\u0006*\u00020\r0\r*\f\u0012\b\u0012\u0006*\u00020\r0\r0\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007R,\u0010\u0006\u001a\u001a\u0012\b\u0012\u0006*\u00020\u000e0\u000e*\f\u0012\b\u0012\u0006*\u00020\u000e0\u000e0\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0007"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsRegistrar$RemoteActionCompatParcelizer;", "", "<init>", "()V", "Lo/packetFinished;", "Lo/getPlatform;", "IconCompatParcelizer", "Lo/packetFinished;", "write", "read", "RemoteActionCompatParcelizer", "Lcom/google/firebase/FirebaseApp;", "AudioAttributesCompatParcelizer", "Lo/hasSamples;", "Lo/DrmUtilApi18;", "AudioAttributesImplApi26Parcelizer"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        private static int AudioAttributesCompatParcelizer;
        private static long RemoteActionCompatParcelizer;
        private static long read;
        private static int write;
        private static final byte[] $$c = {5, 107, -8, 109};
        private static final int $$d = 35;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$a = {16, -101, -28, -55, -26, -12, 1, 43, -44, 2, -3, 15, -19, 36, -17, -17, 15, -2, -7, 3, -17, 21, -13};
        private static final int $$b = 153;
        private static final byte[] IconCompatParcelizer = {36, -60, 17, 26, 13, -10, 14, -3, -6, -5, -54, 72, -13, -4, 18, -73, 40, 19, -4, 18, -52, 44, -1, -8, 3, -2, 14, -3, -17, 19, -11, 6, -1, -2, 15, -39, 28, 5, -5, 4, 8, -8, -39, 38, -3, 5, -7, -17, 15, 7, 3, -12, 6, 11, 5, -2, 15, -41, 26, 20, -39, 19, 11, -11, -4, 19, -48, 33, 7, -11, 24, -9, 21, -21, -51, 62, -11, 13, -7, -57, 37, 33, -2, -9, 5, -7, -3, -4, -3, 11, -9, 21, -21, -51, 62, -11, 13, -7, -57, 27, 37, 6, -15, 2, -2, 13, -21, 11, 9, -16, -22, 23, 5, 6, -30, 11, 11, 9, -16, 13, -10, 14, -3, -6, -5, -54, 72, -13, -4, 18, -73, 29, 26, 20, -52, TarConstants.LF_LINK, -17, 9, 6, -2, 15, -48, 33, -4, 3, -33, 37, -7, 17, -9, 21, -21, -51, 62, -11, 13, -7, -57, 38, 20, 10, -3, 8, -22, 1, 10, -7, -2, 15, -49, 30, 20, -2, -14, -9, 21, -21, -51, 62, -11, 13, -7, -57, 33, 19, 8, -5, -2, 17, -9, 21, -21, -51, 62, -11, 13, -7, -57, 30, 35, -1, -7, 5, -9, -11, -9, 21, -21, -51, 62, -11, 13, -7, -57, 68, -13, 1, 6, -7, -2, 17, -70, 19, 34, 0, 2, 14, 0, -10, -7, 10, -7, -22, 19, 8, -5, -2, 17, -14, 15, -51, 34, 0, 2, 14, 0, -10, -7, 10, -7, -9, 21, -21, -51, 62, -11, 13, -7, -57, 68, -13, 1, 6, -7, -2, 17, -70, 31, 24, 15, -12, 7, -11, 5, 8, -7, -4, -6, -15, 30, -9, 21, -21, -51, 62, -11, 13, -7, -57, 33, 19, 8, -5, -2, 17, -57};
        private static final int AudioAttributesImplApi26Parcelizer = 151;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$e(byte r5, short r6, short r7) {
            /*
                int r6 = r6 * 4
                int r6 = r6 + 4
                byte[] r0 = com.google.firebase.sessions.FirebaseSessionsRegistrar.Companion.$$c
                int r5 = r5 * 4
                int r1 = r5 + 1
                int r7 = r7 * 3
                int r7 = r7 + 104
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.FirebaseSessionsRegistrar.Companion.$$e(byte, short, short):java.lang.String");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void d(int r5, byte r6, byte r7, java.lang.Object[] r8) {
            /*
                int r6 = r6 * 4
                int r6 = 3 - r6
                int r7 = r7 * 2
                int r7 = 73 - r7
                byte[] r0 = com.google.firebase.sessions.FirebaseSessionsRegistrar.Companion.$$a
                int r5 = r5 * 2
                int r5 = 20 - r5
                byte[] r1 = new byte[r5]
                r2 = 0
                if (r0 != 0) goto L16
                r4 = r5
                r3 = r2
                goto L2a
            L16:
                r3 = r2
            L17:
                int r6 = r6 + 1
                byte r4 = (byte) r7
                r1[r3] = r4
                int r3 = r3 + 1
                if (r3 != r5) goto L28
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                r8[r2] = r5
                return
            L28:
                r4 = r0[r6]
            L2a:
                int r4 = -r4
                int r7 = r7 + r4
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.FirebaseSessionsRegistrar.Companion.d(int, byte, byte, java.lang.Object[]):void");
        }

        private static void b(int i, char[] cArr, Object[] objArr) throws Throwable {
            buildSetRequirementsIntent buildsetrequirementsintent = new buildSetRequirementsIntent();
            char[] cArrAudioAttributesCompatParcelizer = buildSetRequirementsIntent.AudioAttributesCompatParcelizer(read ^ 4027965449757546139L, cArr, i);
            buildsetrequirementsintent.write = 4;
            while (buildsetrequirementsintent.write < cArrAudioAttributesCompatParcelizer.length) {
                buildsetrequirementsintent.read = buildsetrequirementsintent.write - 4;
                int i2 = buildsetrequirementsintent.write;
                try {
                    Object[] objArr2 = {Long.valueOf(cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write] ^ cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write % 4]), Long.valueOf(buildsetrequirementsintent.read), Long.valueOf(read)};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2134927292);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (ViewConfiguration.getFadingEdgeLength() >> 16), 12424 - Gravity.getAbsoluteGravity(0, 0), Color.argb(0, 0, 0, 0) + 20, -17408815, false, CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT, new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                    }
                    cArrAudioAttributesCompatParcelizer[i2] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {buildsetrequirementsintent, buildsetrequirementsintent};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(141570176);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 1867 - TextUtils.indexOf((CharSequence) "", '0', 0), 10 - View.combineMeasuredStates(0, 0), 1983509525, false, $$e(b, b2, b2), new Class[]{Object.class, Object.class});
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
            objArr[0] = new String(cArrAudioAttributesCompatParcelizer, 4, cArrAudioAttributesCompatParcelizer.length - 4);
        }

        private Companion() {
        }

        private static void c(int i, char[] cArr, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            buildSetRequirementsIntent buildsetrequirementsintent = new buildSetRequirementsIntent();
            char[] cArrAudioAttributesCompatParcelizer = buildSetRequirementsIntent.AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer ^ 4027965449757546139L, cArr, i);
            buildsetrequirementsintent.write = 4;
            while (buildsetrequirementsintent.write < cArrAudioAttributesCompatParcelizer.length) {
                int i3 = $11 + 101;
                $10 = i3 % 128;
                int i4 = i3 % 2;
                buildsetrequirementsintent.read = buildsetrequirementsintent.write - 4;
                int i5 = buildsetrequirementsintent.write;
                try {
                    Object[] objArr2 = {Long.valueOf(cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write] ^ cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write % 4]), Long.valueOf(buildsetrequirementsintent.read), Long.valueOf(RemoteActionCompatParcelizer)};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2134927292);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (1 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), KeyEvent.getDeadChar(0, 0) + 12424, 20 - (Process.myTid() >> 22), -17408815, false, CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT, new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                    }
                    cArrAudioAttributesCompatParcelizer[i5] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {buildsetrequirementsintent, buildsetrequirementsintent};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(141570176);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 1868 - KeyEvent.getDeadChar(0, 0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 11, 1983509525, false, $$e(b, b2, b2), new Class[]{Object.class, Object.class});
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
            int i6 = $11 + 117;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            objArr[0] = str;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:153:0x061d  */
        /* JADX WARN: Removed duplicated region for block: B:201:0x062b A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static void AudioAttributesCompatParcelizer(android.content.Context r22, long r23, long r25) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 2021
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.FirebaseSessionsRegistrar.Companion.AudioAttributesCompatParcelizer(android.content.Context, long, long):void");
        }

        static {
            write();
            write = 0;
            AudioAttributesCompatParcelizer = 1;
            RemoteActionCompatParcelizer = 6248884129348902160L;
        }

        static void write() {
            read = 4139059079632772441L;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void a(int r6, short r7, int r8, java.lang.Object[] r9) {
            /*
                int r6 = r6 + 4
                int r7 = r7 + 4
                int r8 = 118 - r8
                byte[] r0 = com.google.firebase.sessions.FirebaseSessionsRegistrar.Companion.IconCompatParcelizer
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L11
                r4 = r8
                r3 = r2
                r8 = r6
                goto L26
            L11:
                r3 = r2
                r5 = r8
                r8 = r6
                r6 = r5
            L15:
                byte r4 = (byte) r6
                r1[r3] = r4
                int r3 = r3 + 1
                if (r3 != r7) goto L24
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L24:
                r4 = r0[r8]
            L26:
                int r6 = r6 + r4
                int r8 = r8 + 1
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.FirebaseSessionsRegistrar.Companion.a(int, short, int, java.lang.Object[]):void");
        }
    }
}
