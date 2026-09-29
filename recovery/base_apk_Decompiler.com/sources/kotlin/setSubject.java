package kotlin;

import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.isInternMode;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes4.dex */
public final class setSubject {
    private static final Map<String, setDownloaded> write;
    private static final getSubject IconCompatParcelizer = new getSubject(VideoSubModel.NULLABLE, false);
    private static final getSubject AudioAttributesCompatParcelizer = new getSubject(VideoSubModel.NOT_NULL, false);
    private static final getSubject RemoteActionCompatParcelizer = new getSubject(VideoSubModel.NOT_NULL, true);

    static {
        getPeopleSolved getpeoplesolved = getPeopleSolved.AudioAttributesCompatParcelizer;
        String strAudioAttributesCompatParcelizer = getPeopleSolved.AudioAttributesCompatParcelizer("Object");
        String strRemoteActionCompatParcelizer = getPeopleSolved.RemoteActionCompatParcelizer("Predicate");
        String strRemoteActionCompatParcelizer2 = getPeopleSolved.RemoteActionCompatParcelizer("Function");
        String strRemoteActionCompatParcelizer3 = getPeopleSolved.RemoteActionCompatParcelizer("Consumer");
        String strRemoteActionCompatParcelizer4 = getPeopleSolved.RemoteActionCompatParcelizer("BiFunction");
        String strRemoteActionCompatParcelizer5 = getPeopleSolved.RemoteActionCompatParcelizer("BiConsumer");
        String strRemoteActionCompatParcelizer6 = getPeopleSolved.RemoteActionCompatParcelizer("UnaryOperator");
        String strWrite = getPeopleSolved.write("stream/Stream");
        String strWrite2 = getPeopleSolved.write("Optional");
        isInternMode isinternmode = new isInternMode();
        new isInternMode.write(isinternmode, getPeopleSolved.write("Iterator")).write("forEachRemaining", new write(strRemoteActionCompatParcelizer3));
        new isInternMode.write(isinternmode, getPeopleSolved.AudioAttributesCompatParcelizer("Iterable")).write("spliterator", new AudioAttributesImplBaseParcelizer(getpeoplesolved));
        isInternMode.write writeVar = new isInternMode.write(isinternmode, getPeopleSolved.write("Collection"));
        writeVar.write("removeIf", new MediaBrowserCompatCustomActionResultReceiver(strRemoteActionCompatParcelizer));
        writeVar.write("stream", new AudioAttributesImplApi21Parcelizer(strWrite));
        writeVar.write("parallelStream", new AudioAttributesImplApi26Parcelizer(strWrite));
        new isInternMode.write(isinternmode, getPeopleSolved.write("List")).write("replaceAll", new MediaBrowserCompatMediaItem(strRemoteActionCompatParcelizer6));
        isInternMode.write writeVar2 = new isInternMode.write(isinternmode, getPeopleSolved.write("Map"));
        writeVar2.write("forEach", new MediaDescriptionCompat(strRemoteActionCompatParcelizer5));
        writeVar2.write("putIfAbsent", new RatingCompat(strAudioAttributesCompatParcelizer));
        writeVar2.write("replace", new MediaMetadataCompat(strAudioAttributesCompatParcelizer));
        writeVar2.write("replace", new MediaBrowserCompatSearchResultReceiver(strAudioAttributesCompatParcelizer));
        writeVar2.write("replaceAll", new handleMediaPlayPauseIfPendingOnHandler(strRemoteActionCompatParcelizer4));
        writeVar2.write("compute", new onAddQueueItem(strAudioAttributesCompatParcelizer, strRemoteActionCompatParcelizer4));
        writeVar2.write("computeIfAbsent", new MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(strAudioAttributesCompatParcelizer, strRemoteActionCompatParcelizer2));
        writeVar2.write("computeIfPresent", new onCommand(strAudioAttributesCompatParcelizer, strRemoteActionCompatParcelizer4));
        writeVar2.write("merge", new onCustomAction(strAudioAttributesCompatParcelizer, strRemoteActionCompatParcelizer4));
        isInternMode.write writeVar3 = new isInternMode.write(isinternmode, strWrite2);
        writeVar3.write("empty", new onPlayFromMediaId(strWrite2));
        writeVar3.write("of", new onPlay(strAudioAttributesCompatParcelizer, strWrite2));
        writeVar3.write("ofNullable", new onPause(strAudioAttributesCompatParcelizer, strWrite2));
        writeVar3.write("get", new onMediaButtonEvent(strAudioAttributesCompatParcelizer));
        writeVar3.write("ifPresent", new onFastForward(strRemoteActionCompatParcelizer3));
        new isInternMode.write(isinternmode, getPeopleSolved.AudioAttributesCompatParcelizer("ref/Reference")).write("get", new onPrepare(strAudioAttributesCompatParcelizer));
        new isInternMode.write(isinternmode, strRemoteActionCompatParcelizer).write("test", new onPlayFromSearch(strAudioAttributesCompatParcelizer));
        new isInternMode.write(isinternmode, getPeopleSolved.RemoteActionCompatParcelizer("BiPredicate")).write("test", new onPrepareFromMediaId(strAudioAttributesCompatParcelizer));
        new isInternMode.write(isinternmode, strRemoteActionCompatParcelizer3).write("accept", new AudioAttributesCompatParcelizer(strAudioAttributesCompatParcelizer));
        new isInternMode.write(isinternmode, strRemoteActionCompatParcelizer5).write("accept", new RemoteActionCompatParcelizer(strAudioAttributesCompatParcelizer));
        new isInternMode.write(isinternmode, strRemoteActionCompatParcelizer2).write("apply", new read(strAudioAttributesCompatParcelizer));
        new isInternMode.write(isinternmode, strRemoteActionCompatParcelizer4).write("apply", new IconCompatParcelizer(strAudioAttributesCompatParcelizer));
        new isInternMode.write(isinternmode, getPeopleSolved.RemoteActionCompatParcelizer("Supplier")).write("get", new MediaBrowserCompatItemReceiver(strAudioAttributesCompatParcelizer));
        write = isinternmode.AudioAttributesCompatParcelizer();
    }

    public static final Map<String, setDownloaded> IconCompatParcelizer() {
        return write;
    }

    static final class write extends MagicModuleUseCase implements getAnswerMap<isInternMode.write.C0116write, getShowPopup> {
        private /* synthetic */ String read;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(isInternMode.write.C0116write c0116write) {
            IconCompatParcelizer(c0116write);
            return getShowPopup.INSTANCE;
        }

        private void IconCompatParcelizer(isInternMode.write.C0116write c0116write) {
            toMagicModuleMetaRepoModel.write(c0116write, "");
            c0116write.write(this.read, setSubject.AudioAttributesCompatParcelizer, setSubject.AudioAttributesCompatParcelizer);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        write(String str) {
            super(1);
            this.read = str;
        }
    }

    static final class AudioAttributesImplBaseParcelizer extends MagicModuleUseCase implements getAnswerMap<isInternMode.write.C0116write, getShowPopup> {
        private /* synthetic */ getPeopleSolved IconCompatParcelizer;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(isInternMode.write.C0116write c0116write) {
            read(c0116write);
            return getShowPopup.INSTANCE;
        }

        private void read(isInternMode.write.C0116write c0116write) {
            toMagicModuleMetaRepoModel.write(c0116write, "");
            c0116write.read(getPeopleSolved.write("Spliterator"), setSubject.AudioAttributesCompatParcelizer, setSubject.AudioAttributesCompatParcelizer);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesImplBaseParcelizer(getPeopleSolved getpeoplesolved) {
            super(1);
            this.IconCompatParcelizer = getpeoplesolved;
        }
    }

    static final class MediaBrowserCompatCustomActionResultReceiver extends MagicModuleUseCase implements getAnswerMap<isInternMode.write.C0116write, getShowPopup> {
        private /* synthetic */ String IconCompatParcelizer;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(isInternMode.write.C0116write c0116write) {
            RemoteActionCompatParcelizer(c0116write);
            return getShowPopup.INSTANCE;
        }

        private void RemoteActionCompatParcelizer(isInternMode.write.C0116write c0116write) {
            toMagicModuleMetaRepoModel.write(c0116write, "");
            c0116write.write(this.IconCompatParcelizer, setSubject.AudioAttributesCompatParcelizer, setSubject.AudioAttributesCompatParcelizer);
            c0116write.write(setOption2AnsweredCount.BOOLEAN);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        MediaBrowserCompatCustomActionResultReceiver(String str) {
            super(1);
            this.IconCompatParcelizer = str;
        }
    }

    static final class AudioAttributesImplApi21Parcelizer extends MagicModuleUseCase implements getAnswerMap<isInternMode.write.C0116write, getShowPopup> {
        private /* synthetic */ String write;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(isInternMode.write.C0116write c0116write) {
            AudioAttributesCompatParcelizer(c0116write);
            return getShowPopup.INSTANCE;
        }

        private void AudioAttributesCompatParcelizer(isInternMode.write.C0116write c0116write) {
            toMagicModuleMetaRepoModel.write(c0116write, "");
            c0116write.read(this.write, setSubject.AudioAttributesCompatParcelizer, setSubject.AudioAttributesCompatParcelizer);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesImplApi21Parcelizer(String str) {
            super(1);
            this.write = str;
        }
    }

    static final class AudioAttributesImplApi26Parcelizer extends MagicModuleUseCase implements getAnswerMap<isInternMode.write.C0116write, getShowPopup> {
        private /* synthetic */ String read;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(isInternMode.write.C0116write c0116write) {
            write(c0116write);
            return getShowPopup.INSTANCE;
        }

        private void write(isInternMode.write.C0116write c0116write) {
            toMagicModuleMetaRepoModel.write(c0116write, "");
            c0116write.read(this.read, setSubject.AudioAttributesCompatParcelizer, setSubject.AudioAttributesCompatParcelizer);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesImplApi26Parcelizer(String str) {
            super(1);
            this.read = str;
        }
    }

    static final class MediaBrowserCompatMediaItem extends MagicModuleUseCase implements getAnswerMap<isInternMode.write.C0116write, getShowPopup> {
        private /* synthetic */ String RemoteActionCompatParcelizer;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(isInternMode.write.C0116write c0116write) {
            RemoteActionCompatParcelizer(c0116write);
            return getShowPopup.INSTANCE;
        }

        private void RemoteActionCompatParcelizer(isInternMode.write.C0116write c0116write) {
            toMagicModuleMetaRepoModel.write(c0116write, "");
            c0116write.write(this.RemoteActionCompatParcelizer, setSubject.AudioAttributesCompatParcelizer, setSubject.AudioAttributesCompatParcelizer);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        MediaBrowserCompatMediaItem(String str) {
            super(1);
            this.RemoteActionCompatParcelizer = str;
        }
    }

    static final class MediaDescriptionCompat extends MagicModuleUseCase implements getAnswerMap<isInternMode.write.C0116write, getShowPopup> {
        private /* synthetic */ String read;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(isInternMode.write.C0116write c0116write) {
            RemoteActionCompatParcelizer(c0116write);
            return getShowPopup.INSTANCE;
        }

        private void RemoteActionCompatParcelizer(isInternMode.write.C0116write c0116write) {
            toMagicModuleMetaRepoModel.write(c0116write, "");
            c0116write.write(this.read, setSubject.AudioAttributesCompatParcelizer, setSubject.AudioAttributesCompatParcelizer, setSubject.AudioAttributesCompatParcelizer);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        MediaDescriptionCompat(String str) {
            super(1);
            this.read = str;
        }
    }

    static final class RatingCompat extends MagicModuleUseCase implements getAnswerMap<isInternMode.write.C0116write, getShowPopup> {
        private /* synthetic */ String read;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(isInternMode.write.C0116write c0116write) {
            RemoteActionCompatParcelizer(c0116write);
            return getShowPopup.INSTANCE;
        }

        private void RemoteActionCompatParcelizer(isInternMode.write.C0116write c0116write) {
            toMagicModuleMetaRepoModel.write(c0116write, "");
            c0116write.write(this.read, setSubject.AudioAttributesCompatParcelizer);
            c0116write.write(this.read, setSubject.AudioAttributesCompatParcelizer);
            c0116write.read(this.read, setSubject.IconCompatParcelizer);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        RatingCompat(String str) {
            super(1);
            this.read = str;
        }
    }

    static final class MediaMetadataCompat extends MagicModuleUseCase implements getAnswerMap<isInternMode.write.C0116write, getShowPopup> {
        private /* synthetic */ String read;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(isInternMode.write.C0116write c0116write) {
            read(c0116write);
            return getShowPopup.INSTANCE;
        }

        private void read(isInternMode.write.C0116write c0116write) {
            toMagicModuleMetaRepoModel.write(c0116write, "");
            c0116write.write(this.read, setSubject.AudioAttributesCompatParcelizer);
            c0116write.write(this.read, setSubject.AudioAttributesCompatParcelizer);
            c0116write.read(this.read, setSubject.IconCompatParcelizer);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        MediaMetadataCompat(String str) {
            super(1);
            this.read = str;
        }
    }

    static final class handleMediaPlayPauseIfPendingOnHandler extends MagicModuleUseCase implements getAnswerMap<isInternMode.write.C0116write, getShowPopup> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int AudioAttributesCompatParcelizer;
        private static int IconCompatParcelizer;
        private static char[] RemoteActionCompatParcelizer;
        private static int write;
        private /* synthetic */ String read;
        private static final byte[] $$a = {36, -60, 17, 26, -26, -12, 1, 43, -44, 2, -3, 15, -19, 36, -17, -17, 15, -2, -7, 3, -17, 21, -13};
        private static final int $$b = 223;
        private static final byte[] AudioAttributesImplApi26Parcelizer = {104, 109, 121, 73, -13, 10, -14, 3, 6, 5, TarConstants.LF_FIFO, -70, 15, -19, 4, 70, -38, -17, -19, 4, 31, -31, 11, -3, -7, -5, 10, -1, -19, 41, -23, 9, -21, 21, TarConstants.LF_CHR, -62, 11, -13, 7, 57, -21, -37, 7, -17, 31, -18, -12, -4, 16, -9, 11, -2, -13, 10, -14, 3, 6, 5, TarConstants.LF_FIFO, -72, 13, 4, -18, 73, -40, -19, 4, -18, TarConstants.LF_BLK, -44, 1, 8, -3, 2, -14, 3, 17, -19, 11, -6, 1, 2, -15, 45, -37, -3, 13, 1, -11, 43, -34, -17, 11, -6, 1, 35, -26, -20, 37, -21, -4, 8, -10, -6, 1, -13, 10, -14, 3, 6, 5, TarConstants.LF_FIFO, -57, -11, 17, -15, 8, -1, 6, -16, 69, -27, -36, 12, -6, 2, 31, -41, -3, 5, 12, -19, 2, -15, TarConstants.LF_SYMLINK, -39, -11, 1, 35, -21, -13, 34, -25, -15, 19, -7, -13, 10, -14, 3, 6, 5, TarConstants.LF_FIFO, -72, 13, 4, -18, 73, -29, -26, -20, TarConstants.LF_BLK, -49, 17, -9, -6, 6, -20, TarConstants.LF_FIFO, -44, 11, -1, 31, -44, 3, 2, 26, -33, 2, 9, -5, 7, 9, -21, 21, TarConstants.LF_CHR, -62, 11, -13, 7, 57, -37, -33, 2, 9, -5, 7, -13, 10, -14, 3, 6, 5, TarConstants.LF_FIFO, -65, -4, 69, -34, -34, 3, 12, -2, -14, 0, -12, 37, -21, 5, 3, 4, 3, -11, 9, -21, 21, TarConstants.LF_CHR, -62, 11, -13, 7, 57, -27, -37, -6, 15, -2, 2, -13, 21, -11, -9, 16, 22, -23, -5, -6, 30, -11, -11, -9, 16, 9, -21, 21, TarConstants.LF_CHR, -62, 11, -13, 7, 57, -38, -20, -10, 3, -8, 22, -1, -10, 7, 2, -15, TarConstants.LF_LINK, -30, -20, 2, 14, 9, -21, 21, TarConstants.LF_CHR, -62, 11, -13, 7, 57, -33, -19, -8, 5, 2, -17, 9, -21, 21, TarConstants.LF_CHR, -62, 11, -13, 7, 57, -30, -35, 1, 7, -5, 9, 11, 9, -21, 21, TarConstants.LF_CHR, -62, 11, -13, 7, 57, -68, 13, -1, -6, 7, 2, -17, 70, -19, -34, 0, -2, -14, 0, 10, 7, -10, 7, 22, -19, -8, 5, 2, -17, 14, -15, TarConstants.LF_CHR, -34, 0, -2, -14, 0, 10, 7, -10, 7, 9, -21, 21, TarConstants.LF_CHR, -62, 11, -13, 7, 57, -68, 13, -1, -6, 7, 2, -17, 70, -31, -24, -15, 12, -7, 11, -5, -8, 7, 4, 6, 15, -30, 9, -21, 21, TarConstants.LF_CHR, -62, 11, -13, 7, 57, -33, -19, -8, 5, 2, -17, 57};
        private static final int MediaBrowserCompatCustomActionResultReceiver = 3;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002e). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void d(int r6, int r7, short r8, java.lang.Object[] r9) {
            /*
                int r6 = r6 * 3
                int r6 = 73 - r6
                int r8 = r8 * 2
                int r8 = 4 - r8
                byte[] r0 = o.setSubject.handleMediaPlayPauseIfPendingOnHandler.$$a
                int r7 = r7 * 4
                int r1 = 20 - r7
                byte[] r1 = new byte[r1]
                int r7 = 19 - r7
                r2 = 0
                if (r0 != 0) goto L18
                r3 = r8
                r4 = r2
                goto L2e
            L18:
                r3 = r2
            L19:
                byte r4 = (byte) r6
                r1[r3] = r4
                if (r3 != r7) goto L26
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L26:
                r4 = r0[r8]
                int r3 = r3 + 1
                r5 = r3
                r3 = r8
                r8 = r4
                r4 = r5
            L2e:
                int r8 = -r8
                int r6 = r6 + r8
                int r8 = r3 + 1
                r3 = r4
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: o.setSubject.handleMediaPlayPauseIfPendingOnHandler.d(int, int, short, java.lang.Object[]):void");
        }

        private static void b(int i, int i2, char[] cArr, int i3, boolean z, Object[] objArr) throws Throwable {
            clearDownloadManagerHelpers cleardownloadmanagerhelpers = new clearDownloadManagerHelpers();
            char[] cArr2 = new char[i];
            cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer = 0;
            while (cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer < i) {
                cleardownloadmanagerhelpers.RemoteActionCompatParcelizer = cArr[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer];
                cArr2[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer] = (char) (i3 + cleardownloadmanagerhelpers.RemoteActionCompatParcelizer);
                int i4 = cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4]), Integer.valueOf(write)};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-579447922);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) ((Process.getThreadPriority(0) + 20) >> 6), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 23703, TextUtils.lastIndexOf("", '0') + 33, -1556113637, false, CmcdHeadersFactory.OBJECT_TYPE_AUDIO_ONLY, new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr2[i4] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-322440307);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (44862 - Drawable.resolveOpacity(0, 0)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 18944, (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 28, -1836173544, false, "c", new Class[]{Object.class, Object.class});
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
            if (i2 > 0) {
                cleardownloadmanagerhelpers.write = i2;
                char[] cArr3 = new char[i];
                System.arraycopy(cArr2, 0, cArr3, 0, i);
                System.arraycopy(cArr3, 0, cArr2, i - cleardownloadmanagerhelpers.write, cleardownloadmanagerhelpers.write);
                System.arraycopy(cArr3, cleardownloadmanagerhelpers.write, cArr2, 0, i - cleardownloadmanagerhelpers.write);
            }
            if (z) {
                char[] cArr4 = new char[i];
                cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer = 0;
                while (cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer < i) {
                    cArr4[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer] = cArr2[(i - cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer) - 1];
                    Object[] objArr4 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-322440307);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 44862), 18945 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 28 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), -1836173544, false, "c", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                }
                cArr2 = cArr4;
            }
            objArr[0] = new String(cArr2);
        }

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(isInternMode.write.C0116write c0116write) {
            int i = 2 % 2;
            int i2 = AudioAttributesCompatParcelizer + 93;
            IconCompatParcelizer = i2 % 128;
            int i3 = i2 % 2;
            IconCompatParcelizer(c0116write);
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
            if (i3 != 0) {
                throw null;
            }
            int i4 = AudioAttributesCompatParcelizer + 71;
            IconCompatParcelizer = i4 % 128;
            int i5 = i4 % 2;
            return getshowpopup;
        }

        private void IconCompatParcelizer(isInternMode.write.C0116write c0116write) {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 1;
            AudioAttributesCompatParcelizer = i2 % 128;
            int i3 = i2 % 2;
            toMagicModuleMetaRepoModel.write(c0116write, "");
            c0116write.write(this.read, setSubject.AudioAttributesCompatParcelizer, setSubject.AudioAttributesCompatParcelizer, setSubject.AudioAttributesCompatParcelizer, setSubject.AudioAttributesCompatParcelizer);
            int i4 = IconCompatParcelizer + 15;
            AudioAttributesCompatParcelizer = i4 % 128;
            int i5 = i4 % 2;
        }

        private static void c(byte[] bArr, boolean z, int[] iArr, Object[] objArr) throws Throwable {
            char[] cArr;
            int i;
            int i2 = 2 % 2;
            buildSetStopReasonIntent buildsetstopreasonintent = new buildSetStopReasonIntent();
            int i3 = iArr[0];
            int i4 = iArr[1];
            int i5 = iArr[2];
            int i6 = iArr[3];
            char[] cArr2 = RemoteActionCompatParcelizer;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i7 = 0;
                while (i7 < length) {
                    int i8 = $10 + 67;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-338863922);
                        if (objRemoteActionCompatParcelizer == null) {
                            objRemoteActionCompatParcelizer = startForeground.read((char) (Process.myPid() >> 22), Gravity.getAbsoluteGravity(0, 0) + 11613, 20 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -1786471333, false, "u", new Class[]{Integer.TYPE});
                        }
                        cArr3[i7] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                        i7++;
                        int i10 = $11 + 45;
                        $10 = i10 % 128;
                        int i11 = i10 % 2;
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
            char[] cArr4 = new char[i4];
            System.arraycopy(cArr2, i3, cArr4, 0, i4);
            if (bArr != null) {
                int i12 = $11 + 69;
                $10 = i12 % 128;
                int i13 = i12 % 2;
                char[] cArr5 = new char[i4];
                buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
                char c = 0;
                while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i4) {
                    int i14 = $11 + 69;
                    $10 = i14 % 128;
                    int i15 = i14 % 2;
                    if (bArr[buildsetstopreasonintent.RemoteActionCompatParcelizer] == 1) {
                        int i16 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                        Object[] objArr3 = {Integer.valueOf(cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1429458299);
                        if (objRemoteActionCompatParcelizer2 == null) {
                            objRemoteActionCompatParcelizer2 = startForeground.read((char) TextUtils.getTrimmedLength(""), View.MeasureSpec.getSize(0) + 22959, ((Process.getThreadPriority(0) + 20) >> 6) + 43, -729418224, false, "x", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr5[i16] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                        int i17 = $10 + 109;
                        $11 = i17 % 128;
                        if (i17 % 2 == 0) {
                            int i18 = 5 % 5;
                        }
                    } else {
                        int i19 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                        Object[] objArr4 = {Integer.valueOf(cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(1859710730);
                        if (objRemoteActionCompatParcelizer3 == null) {
                            objRemoteActionCompatParcelizer3 = startForeground.read((char) (31590 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 9864 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), View.resolveSize(0, 0) + 65, 277949343, false, "v", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr5[i19] = ((Character) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).charValue();
                    }
                    c = cArr5[buildsetstopreasonintent.RemoteActionCompatParcelizer];
                    Object[] objArr5 = {buildsetstopreasonintent, buildsetstopreasonintent};
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1104966666);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        objRemoteActionCompatParcelizer4 = startForeground.read((char) (AndroidCharacter.getMirror('0') + 37774), TextUtils.getOffsetBefore("", 0) + 9754, 28 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 1066774687, false, "B", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
                }
                cArr4 = cArr5;
            }
            if (i6 > 0) {
                char[] cArr6 = new char[i4];
                System.arraycopy(cArr4, 0, cArr6, 0, i4);
                int i20 = i4 - i6;
                System.arraycopy(cArr6, 0, cArr4, i20, i6);
                System.arraycopy(cArr6, i6, cArr4, 0, i20);
            }
            if (z) {
                int i21 = $11 + 59;
                $10 = i21 % 128;
                if (i21 % 2 != 0) {
                    cArr = new char[i4];
                    buildsetstopreasonintent.RemoteActionCompatParcelizer = 1;
                } else {
                    cArr = new char[i4];
                    buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
                }
                while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i4) {
                    int i22 = $11 + 107;
                    $10 = i22 % 128;
                    if (i22 % 2 != 0) {
                        cArr[buildsetstopreasonintent.RemoteActionCompatParcelizer] = cArr4[(i4 >> buildsetstopreasonintent.RemoteActionCompatParcelizer) / 0];
                        i = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    } else {
                        cArr[buildsetstopreasonintent.RemoteActionCompatParcelizer] = cArr4[(i4 - buildsetstopreasonintent.RemoteActionCompatParcelizer) - 1];
                        i = buildsetstopreasonintent.RemoteActionCompatParcelizer + 1;
                    }
                    buildsetstopreasonintent.RemoteActionCompatParcelizer = i;
                }
                cArr4 = cArr;
            }
            if (i5 > 0) {
                buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
                while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i4) {
                    cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer] = (char) (cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer] - iArr[2]);
                    buildsetstopreasonintent.RemoteActionCompatParcelizer++;
                    int i23 = $11 + 23;
                    $10 = i23 % 128;
                    int i24 = i23 % 2;
                }
            }
            objArr[0] = new String(cArr4);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        handleMediaPlayPauseIfPendingOnHandler(String str) {
            super(1);
            this.read = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:149:0x0742  */
        /* JADX WARN: Removed duplicated region for block: B:201:0x0751 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r3v1 */
        /* JADX WARN: Type inference failed for: r3v14 */
        /* JADX WARN: Type inference failed for: r3v15 */
        /* JADX WARN: Type inference failed for: r3v16 */
        /* JADX WARN: Type inference failed for: r3v17 */
        /* JADX WARN: Type inference failed for: r3v18 */
        /* JADX WARN: Type inference failed for: r3v19 */
        /* JADX WARN: Type inference failed for: r3v20 */
        /* JADX WARN: Type inference failed for: r3v21 */
        /* JADX WARN: Type inference failed for: r3v22 */
        /* JADX WARN: Type inference failed for: r3v23 */
        /* JADX WARN: Type inference failed for: r3v24 */
        /* JADX WARN: Type inference failed for: r3v25 */
        /* JADX WARN: Type inference failed for: r3v26 */
        /* JADX WARN: Type inference failed for: r3v3 */
        /* JADX WARN: Type inference failed for: r3v4 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static void RemoteActionCompatParcelizer(android.content.Context r26, long r27, long r29) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 2261
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.setSubject.handleMediaPlayPauseIfPendingOnHandler.RemoteActionCompatParcelizer(android.content.Context, long, long):void");
        }

        static {
            read();
            IconCompatParcelizer = 0;
            AudioAttributesCompatParcelizer = 1;
            RemoteActionCompatParcelizer = new char[]{44994};
        }

        static void read() {
            write = 1000326231;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0026). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void a(int r7, int r8, int r9, java.lang.Object[] r10) {
            /*
                int r8 = r8 + 4
                byte[] r0 = o.setSubject.handleMediaPlayPauseIfPendingOnHandler.AudioAttributesImplApi26Parcelizer
                int r9 = 34 - r9
                int r7 = r7 + 84
                byte[] r1 = new byte[r9]
                r2 = 0
                if (r0 != 0) goto L11
                r3 = r8
                r7 = r9
                r4 = r2
                goto L26
            L11:
                r3 = r2
            L12:
                int r4 = r3 + 1
                byte r5 = (byte) r7
                r1[r3] = r5
                if (r4 != r9) goto L21
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L21:
                r3 = r0[r8]
                r6 = r3
                r3 = r8
                r8 = r6
            L26:
                int r8 = -r8
                int r7 = r7 + r8
                int r8 = r3 + 1
                r3 = r4
                goto L12
            */
            throw new UnsupportedOperationException("Method not decompiled: o.setSubject.handleMediaPlayPauseIfPendingOnHandler.a(int, int, int, java.lang.Object[]):void");
        }
    }

    static final class MediaBrowserCompatSearchResultReceiver extends MagicModuleUseCase implements getAnswerMap<isInternMode.write.C0116write, getShowPopup> {
        private /* synthetic */ String read;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(isInternMode.write.C0116write c0116write) {
            AudioAttributesCompatParcelizer(c0116write);
            return getShowPopup.INSTANCE;
        }

        private void AudioAttributesCompatParcelizer(isInternMode.write.C0116write c0116write) {
            toMagicModuleMetaRepoModel.write(c0116write, "");
            c0116write.write(this.read, setSubject.AudioAttributesCompatParcelizer);
            c0116write.write(this.read, setSubject.AudioAttributesCompatParcelizer);
            c0116write.write(this.read, setSubject.AudioAttributesCompatParcelizer);
            c0116write.write(setOption2AnsweredCount.BOOLEAN);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        MediaBrowserCompatSearchResultReceiver(String str) {
            super(1);
            this.read = str;
        }
    }

    static final class onAddQueueItem extends MagicModuleUseCase implements getAnswerMap<isInternMode.write.C0116write, getShowPopup> {
        private /* synthetic */ String IconCompatParcelizer;
        private /* synthetic */ String write;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(isInternMode.write.C0116write c0116write) {
            write(c0116write);
            return getShowPopup.INSTANCE;
        }

        private void write(isInternMode.write.C0116write c0116write) {
            toMagicModuleMetaRepoModel.write(c0116write, "");
            c0116write.write(this.IconCompatParcelizer, setSubject.AudioAttributesCompatParcelizer);
            c0116write.write(this.write, setSubject.AudioAttributesCompatParcelizer, setSubject.AudioAttributesCompatParcelizer, setSubject.IconCompatParcelizer, setSubject.IconCompatParcelizer);
            c0116write.read(this.IconCompatParcelizer, setSubject.IconCompatParcelizer);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onAddQueueItem(String str, String str2) {
            super(1);
            this.IconCompatParcelizer = str;
            this.write = str2;
        }
    }

    static final class MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver extends MagicModuleUseCase implements getAnswerMap<isInternMode.write.C0116write, getShowPopup> {
        private /* synthetic */ String IconCompatParcelizer;
        private /* synthetic */ String RemoteActionCompatParcelizer;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(isInternMode.write.C0116write c0116write) {
            RemoteActionCompatParcelizer(c0116write);
            return getShowPopup.INSTANCE;
        }

        private void RemoteActionCompatParcelizer(isInternMode.write.C0116write c0116write) {
            toMagicModuleMetaRepoModel.write(c0116write, "");
            c0116write.write(this.IconCompatParcelizer, setSubject.AudioAttributesCompatParcelizer);
            c0116write.write(this.RemoteActionCompatParcelizer, setSubject.AudioAttributesCompatParcelizer, setSubject.AudioAttributesCompatParcelizer, setSubject.AudioAttributesCompatParcelizer);
            c0116write.read(this.IconCompatParcelizer, setSubject.AudioAttributesCompatParcelizer);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(String str, String str2) {
            super(1);
            this.IconCompatParcelizer = str;
            this.RemoteActionCompatParcelizer = str2;
        }
    }

    static final class onCommand extends MagicModuleUseCase implements getAnswerMap<isInternMode.write.C0116write, getShowPopup> {
        private /* synthetic */ String IconCompatParcelizer;
        private /* synthetic */ String write;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(isInternMode.write.C0116write c0116write) {
            write(c0116write);
            return getShowPopup.INSTANCE;
        }

        private void write(isInternMode.write.C0116write c0116write) {
            toMagicModuleMetaRepoModel.write(c0116write, "");
            c0116write.write(this.write, setSubject.AudioAttributesCompatParcelizer);
            c0116write.write(this.IconCompatParcelizer, setSubject.AudioAttributesCompatParcelizer, setSubject.AudioAttributesCompatParcelizer, setSubject.RemoteActionCompatParcelizer, setSubject.IconCompatParcelizer);
            c0116write.read(this.write, setSubject.IconCompatParcelizer);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onCommand(String str, String str2) {
            super(1);
            this.write = str;
            this.IconCompatParcelizer = str2;
        }
    }

    static final class onCustomAction extends MagicModuleUseCase implements getAnswerMap<isInternMode.write.C0116write, getShowPopup> {
        private /* synthetic */ String IconCompatParcelizer;
        private /* synthetic */ String write;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(isInternMode.write.C0116write c0116write) {
            IconCompatParcelizer(c0116write);
            return getShowPopup.INSTANCE;
        }

        private void IconCompatParcelizer(isInternMode.write.C0116write c0116write) {
            toMagicModuleMetaRepoModel.write(c0116write, "");
            c0116write.write(this.IconCompatParcelizer, setSubject.AudioAttributesCompatParcelizer);
            c0116write.write(this.IconCompatParcelizer, setSubject.RemoteActionCompatParcelizer);
            c0116write.write(this.write, setSubject.AudioAttributesCompatParcelizer, setSubject.RemoteActionCompatParcelizer, setSubject.RemoteActionCompatParcelizer, setSubject.IconCompatParcelizer);
            c0116write.read(this.IconCompatParcelizer, setSubject.IconCompatParcelizer);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onCustomAction(String str, String str2) {
            super(1);
            this.IconCompatParcelizer = str;
            this.write = str2;
        }
    }

    static final class onPlayFromMediaId extends MagicModuleUseCase implements getAnswerMap<isInternMode.write.C0116write, getShowPopup> {
        private /* synthetic */ String RemoteActionCompatParcelizer;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(isInternMode.write.C0116write c0116write) {
            AudioAttributesCompatParcelizer(c0116write);
            return getShowPopup.INSTANCE;
        }

        private void AudioAttributesCompatParcelizer(isInternMode.write.C0116write c0116write) {
            toMagicModuleMetaRepoModel.write(c0116write, "");
            c0116write.read(this.RemoteActionCompatParcelizer, setSubject.AudioAttributesCompatParcelizer, setSubject.RemoteActionCompatParcelizer);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onPlayFromMediaId(String str) {
            super(1);
            this.RemoteActionCompatParcelizer = str;
        }
    }

    static final class onPlay extends MagicModuleUseCase implements getAnswerMap<isInternMode.write.C0116write, getShowPopup> {
        public static int AudioAttributesCompatParcelizer;
        public static int RemoteActionCompatParcelizer;
        private /* synthetic */ String IconCompatParcelizer;
        private /* synthetic */ String read;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(isInternMode.write.C0116write c0116write) {
            write(c0116write);
            return getShowPopup.INSTANCE;
        }

        private void write(isInternMode.write.C0116write c0116write) {
            toMagicModuleMetaRepoModel.write(c0116write, "");
            c0116write.write(this.read, setSubject.RemoteActionCompatParcelizer);
            c0116write.read(this.IconCompatParcelizer, setSubject.AudioAttributesCompatParcelizer, setSubject.RemoteActionCompatParcelizer);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onPlay(String str, String str2) {
            super(1);
            this.read = str;
            this.IconCompatParcelizer = str2;
        }

        public static int read() {
            int i = AudioAttributesCompatParcelizer;
            int i2 = i % 6699298;
            AudioAttributesCompatParcelizer = i + 1;
            if (i2 != 0) {
                return RemoteActionCompatParcelizer;
            }
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            RemoteActionCompatParcelizer = startUptimeMillis;
            return startUptimeMillis;
        }
    }

    static final class onPause extends MagicModuleUseCase implements getAnswerMap<isInternMode.write.C0116write, getShowPopup> {
        private /* synthetic */ String IconCompatParcelizer;
        private /* synthetic */ String RemoteActionCompatParcelizer;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(isInternMode.write.C0116write c0116write) {
            read(c0116write);
            return getShowPopup.INSTANCE;
        }

        private void read(isInternMode.write.C0116write c0116write) {
            toMagicModuleMetaRepoModel.write(c0116write, "");
            c0116write.write(this.IconCompatParcelizer, setSubject.IconCompatParcelizer);
            c0116write.read(this.RemoteActionCompatParcelizer, setSubject.AudioAttributesCompatParcelizer, setSubject.RemoteActionCompatParcelizer);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onPause(String str, String str2) {
            super(1);
            this.IconCompatParcelizer = str;
            this.RemoteActionCompatParcelizer = str2;
        }
    }

    static final class onMediaButtonEvent extends MagicModuleUseCase implements getAnswerMap<isInternMode.write.C0116write, getShowPopup> {
        private /* synthetic */ String RemoteActionCompatParcelizer;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(isInternMode.write.C0116write c0116write) {
            RemoteActionCompatParcelizer(c0116write);
            return getShowPopup.INSTANCE;
        }

        private void RemoteActionCompatParcelizer(isInternMode.write.C0116write c0116write) {
            toMagicModuleMetaRepoModel.write(c0116write, "");
            c0116write.read(this.RemoteActionCompatParcelizer, setSubject.RemoteActionCompatParcelizer);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onMediaButtonEvent(String str) {
            super(1);
            this.RemoteActionCompatParcelizer = str;
        }
    }

    static final class onFastForward extends MagicModuleUseCase implements getAnswerMap<isInternMode.write.C0116write, getShowPopup> {
        private /* synthetic */ String write;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(isInternMode.write.C0116write c0116write) {
            write(c0116write);
            return getShowPopup.INSTANCE;
        }

        private void write(isInternMode.write.C0116write c0116write) {
            toMagicModuleMetaRepoModel.write(c0116write, "");
            c0116write.write(this.write, setSubject.AudioAttributesCompatParcelizer, setSubject.RemoteActionCompatParcelizer);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onFastForward(String str) {
            super(1);
            this.write = str;
        }
    }

    static final class onPrepare extends MagicModuleUseCase implements getAnswerMap<isInternMode.write.C0116write, getShowPopup> {
        private /* synthetic */ String RemoteActionCompatParcelizer;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(isInternMode.write.C0116write c0116write) {
            RemoteActionCompatParcelizer(c0116write);
            return getShowPopup.INSTANCE;
        }

        private void RemoteActionCompatParcelizer(isInternMode.write.C0116write c0116write) {
            toMagicModuleMetaRepoModel.write(c0116write, "");
            c0116write.read(this.RemoteActionCompatParcelizer, setSubject.IconCompatParcelizer);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onPrepare(String str) {
            super(1);
            this.RemoteActionCompatParcelizer = str;
        }
    }

    static final class onPlayFromSearch extends MagicModuleUseCase implements getAnswerMap<isInternMode.write.C0116write, getShowPopup> {
        private /* synthetic */ String IconCompatParcelizer;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(isInternMode.write.C0116write c0116write) {
            write(c0116write);
            return getShowPopup.INSTANCE;
        }

        private void write(isInternMode.write.C0116write c0116write) {
            toMagicModuleMetaRepoModel.write(c0116write, "");
            c0116write.write(this.IconCompatParcelizer, setSubject.AudioAttributesCompatParcelizer);
            c0116write.write(setOption2AnsweredCount.BOOLEAN);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onPlayFromSearch(String str) {
            super(1);
            this.IconCompatParcelizer = str;
        }
    }

    static final class onPrepareFromMediaId extends MagicModuleUseCase implements getAnswerMap<isInternMode.write.C0116write, getShowPopup> {
        private /* synthetic */ String write;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(isInternMode.write.C0116write c0116write) {
            read(c0116write);
            return getShowPopup.INSTANCE;
        }

        private void read(isInternMode.write.C0116write c0116write) {
            toMagicModuleMetaRepoModel.write(c0116write, "");
            c0116write.write(this.write, setSubject.AudioAttributesCompatParcelizer);
            c0116write.write(this.write, setSubject.AudioAttributesCompatParcelizer);
            c0116write.write(setOption2AnsweredCount.BOOLEAN);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onPrepareFromMediaId(String str) {
            super(1);
            this.write = str;
        }
    }

    static final class AudioAttributesCompatParcelizer extends MagicModuleUseCase implements getAnswerMap<isInternMode.write.C0116write, getShowPopup> {
        private /* synthetic */ String read;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(isInternMode.write.C0116write c0116write) {
            read(c0116write);
            return getShowPopup.INSTANCE;
        }

        private void read(isInternMode.write.C0116write c0116write) {
            toMagicModuleMetaRepoModel.write(c0116write, "");
            c0116write.write(this.read, setSubject.AudioAttributesCompatParcelizer);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesCompatParcelizer(String str) {
            super(1);
            this.read = str;
        }
    }

    static final class RemoteActionCompatParcelizer extends MagicModuleUseCase implements getAnswerMap<isInternMode.write.C0116write, getShowPopup> {
        private /* synthetic */ String RemoteActionCompatParcelizer;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(isInternMode.write.C0116write c0116write) {
            AudioAttributesCompatParcelizer(c0116write);
            return getShowPopup.INSTANCE;
        }

        private void AudioAttributesCompatParcelizer(isInternMode.write.C0116write c0116write) {
            toMagicModuleMetaRepoModel.write(c0116write, "");
            c0116write.write(this.RemoteActionCompatParcelizer, setSubject.AudioAttributesCompatParcelizer);
            c0116write.write(this.RemoteActionCompatParcelizer, setSubject.AudioAttributesCompatParcelizer);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        RemoteActionCompatParcelizer(String str) {
            super(1);
            this.RemoteActionCompatParcelizer = str;
        }
    }

    static final class read extends MagicModuleUseCase implements getAnswerMap<isInternMode.write.C0116write, getShowPopup> {
        private /* synthetic */ String read;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(isInternMode.write.C0116write c0116write) {
            RemoteActionCompatParcelizer(c0116write);
            return getShowPopup.INSTANCE;
        }

        private void RemoteActionCompatParcelizer(isInternMode.write.C0116write c0116write) {
            toMagicModuleMetaRepoModel.write(c0116write, "");
            c0116write.write(this.read, setSubject.AudioAttributesCompatParcelizer);
            c0116write.read(this.read, setSubject.AudioAttributesCompatParcelizer);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        read(String str) {
            super(1);
            this.read = str;
        }
    }

    static final class IconCompatParcelizer extends MagicModuleUseCase implements getAnswerMap<isInternMode.write.C0116write, getShowPopup> {
        private /* synthetic */ String read;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(isInternMode.write.C0116write c0116write) {
            AudioAttributesCompatParcelizer(c0116write);
            return getShowPopup.INSTANCE;
        }

        private void AudioAttributesCompatParcelizer(isInternMode.write.C0116write c0116write) {
            toMagicModuleMetaRepoModel.write(c0116write, "");
            c0116write.write(this.read, setSubject.AudioAttributesCompatParcelizer);
            c0116write.write(this.read, setSubject.AudioAttributesCompatParcelizer);
            c0116write.read(this.read, setSubject.AudioAttributesCompatParcelizer);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(String str) {
            super(1);
            this.read = str;
        }
    }

    static final class MediaBrowserCompatItemReceiver extends MagicModuleUseCase implements getAnswerMap<isInternMode.write.C0116write, getShowPopup> {
        private /* synthetic */ String write;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(isInternMode.write.C0116write c0116write) {
            AudioAttributesCompatParcelizer(c0116write);
            return getShowPopup.INSTANCE;
        }

        private void AudioAttributesCompatParcelizer(isInternMode.write.C0116write c0116write) {
            toMagicModuleMetaRepoModel.write(c0116write, "");
            c0116write.read(this.write, setSubject.AudioAttributesCompatParcelizer);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        MediaBrowserCompatItemReceiver(String str) {
            super(1);
            this.write = str;
        }
    }
}
