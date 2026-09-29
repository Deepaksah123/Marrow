package kotlin;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Typeface;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Map;
import kotlin.Metadata;
import kotlin._handleOddName;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes2.dex */
public final class getTotalBufferedDurationUs {

    public static final class AudioAttributesCompatParcelizer extends MagicModuleUseCase implements MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> {
        private static final byte[] $$a = {43, -12, TarConstants.LF_GNUTYPE_LONGNAME, -80, -19, -10, -3, 20, -6, 5};
        private static final int $$b = 144;
        private static int onPlay = 0;
        private static int onPlayFromMediaId = 1;
        private /* synthetic */ int AudioAttributesCompatParcelizer;
        private /* synthetic */ ExoPlayerImplExternalSyntheticLambda14 AudioAttributesImplApi21Parcelizer;
        private /* synthetic */ ExoPlayerImplExternalSyntheticLambda19 AudioAttributesImplApi26Parcelizer;
        private /* synthetic */ boolean AudioAttributesImplBaseParcelizer;
        private /* synthetic */ _skipWSOrEnd IconCompatParcelizer;
        private /* synthetic */ boolean MediaBrowserCompatCustomActionResultReceiver;
        private /* synthetic */ boolean MediaBrowserCompatItemReceiver;
        private /* synthetic */ boolean MediaBrowserCompatMediaItem;
        private /* synthetic */ Map<String, Typeface> MediaBrowserCompatSearchResultReceiver;
        private /* synthetic */ onStreamTypeChanged MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        private /* synthetic */ isIgnorableServerSideAdInsertionPeriodChange MediaDescriptionCompat;
        private /* synthetic */ getContentType MediaMetadataCompat;
        private /* synthetic */ boolean RatingCompat;
        private /* synthetic */ int RemoteActionCompatParcelizer;
        private /* synthetic */ _handleOddName handleMediaPlayPauseIfPendingOnHandler;
        private /* synthetic */ boolean onAddQueueItem;
        private /* synthetic */ getCreatedOnDateMs<Float> onCommand;
        private /* synthetic */ boolean onCustomAction;
        private /* synthetic */ boolean read;
        private /* synthetic */ int write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AudioAttributesCompatParcelizer(ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19, getCreatedOnDateMs<Float> getcreatedondatems, _handleOddName _handleoddname, boolean z, boolean z2, boolean z3, boolean z4, onStreamTypeChanged onstreamtypechanged, boolean z5, isIgnorableServerSideAdInsertionPeriodChange isignorableserversideadinsertionperiodchange, _skipWSOrEnd _skipwsorend, getContentType getcontenttype, boolean z6, boolean z7, Map<String, ? extends Typeface> map, ExoPlayerImplExternalSyntheticLambda14 exoPlayerImplExternalSyntheticLambda14, boolean z8, int i, int i2, int i3) {
            super(2);
            this.AudioAttributesImplApi26Parcelizer = exoPlayerImplExternalSyntheticLambda19;
            this.onCommand = getcreatedondatems;
            this.handleMediaPlayPauseIfPendingOnHandler = _handleoddname;
            this.onAddQueueItem = z;
            this.read = z2;
            this.AudioAttributesImplBaseParcelizer = z3;
            this.RatingCompat = z4;
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = onstreamtypechanged;
            this.MediaBrowserCompatMediaItem = z5;
            this.MediaDescriptionCompat = isignorableserversideadinsertionperiodchange;
            this.IconCompatParcelizer = _skipwsorend;
            this.MediaMetadataCompat = getcontenttype;
            this.MediaBrowserCompatItemReceiver = z6;
            this.MediaBrowserCompatCustomActionResultReceiver = z7;
            this.MediaBrowserCompatSearchResultReceiver = map;
            this.AudioAttributesImplApi21Parcelizer = exoPlayerImplExternalSyntheticLambda14;
            this.onCustomAction = z8;
            this.RemoteActionCompatParcelizer = i;
            this.write = i2;
            this.AudioAttributesCompatParcelizer = i3;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002e). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void a(short r6, int r7, int r8, java.lang.Object[] r9) {
            /*
                int r8 = r8 * 3
                int r8 = r8 + 4
                int r6 = r6 * 4
                int r0 = 4 - r6
                int r7 = r7 * 39
                int r7 = 114 - r7
                byte[] r1 = o.getTotalBufferedDurationUs.AudioAttributesCompatParcelizer.$$a
                byte[] r0 = new byte[r0]
                int r6 = 3 - r6
                r2 = 0
                if (r1 != 0) goto L19
                r7 = r6
                r3 = r8
                r4 = r2
                goto L2e
            L19:
                r3 = r2
            L1a:
                byte r4 = (byte) r7
                r0[r3] = r4
                int r4 = r3 + 1
                if (r3 != r6) goto L29
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L29:
                r3 = r1[r8]
                r5 = r3
                r3 = r8
                r8 = r5
            L2e:
                int r7 = r7 + r8
                int r7 = r7 + 6
                int r8 = r3 + 1
                r3 = r4
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: o.getTotalBufferedDurationUs.AudioAttributesCompatParcelizer.a(short, int, int, java.lang.Object[]):void");
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ getShowPopup invoke(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, Integer num) {
            read(_handleunrecognizedcharacterescape);
            return getShowPopup.INSTANCE;
        }

        private void read(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
            getTotalBufferedDurationUs.read(this.AudioAttributesImplApi26Parcelizer, this.onCommand, this.handleMediaPlayPauseIfPendingOnHandler, this.onAddQueueItem, this.read, this.AudioAttributesImplBaseParcelizer, this.RatingCompat, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, this.MediaBrowserCompatMediaItem, this.MediaDescriptionCompat, this.IconCompatParcelizer, this.MediaMetadataCompat, this.MediaBrowserCompatItemReceiver, this.MediaBrowserCompatCustomActionResultReceiver, this.MediaBrowserCompatSearchResultReceiver, this.AudioAttributesImplApi21Parcelizer, this.onCustomAction, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer | 1), _appendEscaped.RemoteActionCompatParcelizer(this.write), this.AudioAttributesCompatParcelizer);
        }

        /* JADX WARN: Removed duplicated region for block: B:82:0x0734  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static java.lang.Object[] read(int r42, int r43, int r44) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 2450
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.getTotalBufferedDurationUs.AudioAttributesCompatParcelizer.read(int, int, int):java.lang.Object[]");
        }
    }

    static final class IconCompatParcelizer extends MagicModuleUseCase implements MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> {
        private /* synthetic */ _skipWSOrEnd AudioAttributesCompatParcelizer;
        private /* synthetic */ ExoPlayerImplExternalSyntheticLambda14 AudioAttributesImplApi21Parcelizer;
        private /* synthetic */ boolean AudioAttributesImplApi26Parcelizer;
        private /* synthetic */ getContentType AudioAttributesImplBaseParcelizer;
        private /* synthetic */ boolean IconCompatParcelizer;
        private /* synthetic */ ExoPlayerImplExternalSyntheticLambda19 MediaBrowserCompatCustomActionResultReceiver;
        private /* synthetic */ boolean MediaBrowserCompatItemReceiver;
        private /* synthetic */ boolean MediaBrowserCompatMediaItem;
        private /* synthetic */ isIgnorableServerSideAdInsertionPeriodChange MediaBrowserCompatSearchResultReceiver;
        private /* synthetic */ float MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        private /* synthetic */ boolean MediaDescriptionCompat;
        private /* synthetic */ boolean MediaMetadataCompat;
        private /* synthetic */ _handleOddName RatingCompat;
        private /* synthetic */ int RemoteActionCompatParcelizer;
        private /* synthetic */ boolean handleMediaPlayPauseIfPendingOnHandler;
        private /* synthetic */ onStreamTypeChanged onAddQueueItem;
        private /* synthetic */ int read;
        private /* synthetic */ int write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19, float f, _handleOddName _handleoddname, boolean z, boolean z2, boolean z3, boolean z4, onStreamTypeChanged onstreamtypechanged, boolean z5, isIgnorableServerSideAdInsertionPeriodChange isignorableserversideadinsertionperiodchange, _skipWSOrEnd _skipwsorend, getContentType getcontenttype, boolean z6, boolean z7, ExoPlayerImplExternalSyntheticLambda14 exoPlayerImplExternalSyntheticLambda14, int i, int i2, int i3) {
            super(2);
            this.MediaBrowserCompatCustomActionResultReceiver = exoPlayerImplExternalSyntheticLambda19;
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = f;
            this.RatingCompat = _handleoddname;
            this.MediaDescriptionCompat = z;
            this.IconCompatParcelizer = z2;
            this.MediaBrowserCompatItemReceiver = z3;
            this.MediaMetadataCompat = z4;
            this.onAddQueueItem = onstreamtypechanged;
            this.MediaBrowserCompatMediaItem = z5;
            this.MediaBrowserCompatSearchResultReceiver = isignorableserversideadinsertionperiodchange;
            this.AudioAttributesCompatParcelizer = _skipwsorend;
            this.AudioAttributesImplBaseParcelizer = getcontenttype;
            this.AudioAttributesImplApi26Parcelizer = z6;
            this.handleMediaPlayPauseIfPendingOnHandler = z7;
            this.AudioAttributesImplApi21Parcelizer = exoPlayerImplExternalSyntheticLambda14;
            this.RemoteActionCompatParcelizer = i;
            this.write = i2;
            this.read = i3;
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ getShowPopup invoke(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, Integer num) {
            read(_handleunrecognizedcharacterescape);
            return getShowPopup.INSTANCE;
        }

        private void read(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
            getTotalBufferedDurationUs.write(this.MediaBrowserCompatCustomActionResultReceiver, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, this.RatingCompat, this.MediaDescriptionCompat, this.IconCompatParcelizer, this.MediaBrowserCompatItemReceiver, this.MediaMetadataCompat, this.onAddQueueItem, this.MediaBrowserCompatMediaItem, this.MediaBrowserCompatSearchResultReceiver, this.AudioAttributesCompatParcelizer, this.AudioAttributesImplBaseParcelizer, this.AudioAttributesImplApi26Parcelizer, this.handleMediaPlayPauseIfPendingOnHandler, this.AudioAttributesImplApi21Parcelizer, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer | 1), _appendEscaped.RemoteActionCompatParcelizer(this.write), this.read);
        }
    }

    static final class write extends MagicModuleUseCase implements MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> {
        private /* synthetic */ int AudioAttributesCompatParcelizer;
        private /* synthetic */ boolean AudioAttributesImplApi21Parcelizer;
        private /* synthetic */ ExoPlayerImplExternalSyntheticLambda14 AudioAttributesImplApi26Parcelizer;
        private /* synthetic */ boolean AudioAttributesImplBaseParcelizer;
        private /* synthetic */ _skipWSOrEnd IconCompatParcelizer;
        private /* synthetic */ ExoPlayerImplExternalSyntheticLambda19 MediaBrowserCompatCustomActionResultReceiver;
        private /* synthetic */ boolean MediaBrowserCompatItemReceiver;
        private /* synthetic */ isIgnorableServerSideAdInsertionPeriodChange MediaBrowserCompatMediaItem;
        private /* synthetic */ boolean MediaBrowserCompatSearchResultReceiver;
        private /* synthetic */ boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        private /* synthetic */ boolean MediaDescriptionCompat;
        private /* synthetic */ getContentType MediaMetadataCompat;
        private /* synthetic */ Map<String, Typeface> RatingCompat;
        private /* synthetic */ int RemoteActionCompatParcelizer;
        private /* synthetic */ getCreatedOnDateMs<Float> handleMediaPlayPauseIfPendingOnHandler;
        private /* synthetic */ onStreamTypeChanged onAddQueueItem;
        private /* synthetic */ _handleOddName onCommand;
        private /* synthetic */ boolean onCustomAction;
        private /* synthetic */ int read;
        private /* synthetic */ boolean write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        write(ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19, getCreatedOnDateMs<Float> getcreatedondatems, _handleOddName _handleoddname, boolean z, boolean z2, boolean z3, boolean z4, onStreamTypeChanged onstreamtypechanged, boolean z5, isIgnorableServerSideAdInsertionPeriodChange isignorableserversideadinsertionperiodchange, _skipWSOrEnd _skipwsorend, getContentType getcontenttype, boolean z6, boolean z7, Map<String, ? extends Typeface> map, ExoPlayerImplExternalSyntheticLambda14 exoPlayerImplExternalSyntheticLambda14, boolean z8, int i, int i2, int i3) {
            super(2);
            this.MediaBrowserCompatCustomActionResultReceiver = exoPlayerImplExternalSyntheticLambda19;
            this.handleMediaPlayPauseIfPendingOnHandler = getcreatedondatems;
            this.onCommand = _handleoddname;
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = z;
            this.write = z2;
            this.AudioAttributesImplApi21Parcelizer = z3;
            this.MediaBrowserCompatSearchResultReceiver = z4;
            this.onAddQueueItem = onstreamtypechanged;
            this.MediaDescriptionCompat = z5;
            this.MediaBrowserCompatMediaItem = isignorableserversideadinsertionperiodchange;
            this.IconCompatParcelizer = _skipwsorend;
            this.MediaMetadataCompat = getcontenttype;
            this.AudioAttributesImplBaseParcelizer = z6;
            this.MediaBrowserCompatItemReceiver = z7;
            this.RatingCompat = map;
            this.AudioAttributesImplApi26Parcelizer = exoPlayerImplExternalSyntheticLambda14;
            this.onCustomAction = z8;
            this.read = i;
            this.AudioAttributesCompatParcelizer = i2;
            this.RemoteActionCompatParcelizer = i3;
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ getShowPopup invoke(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, Integer num) {
            AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescape);
            return getShowPopup.INSTANCE;
        }

        private void AudioAttributesCompatParcelizer(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
            getTotalBufferedDurationUs.read(this.MediaBrowserCompatCustomActionResultReceiver, this.handleMediaPlayPauseIfPendingOnHandler, this.onCommand, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, this.write, this.AudioAttributesImplApi21Parcelizer, this.MediaBrowserCompatSearchResultReceiver, this.onAddQueueItem, this.MediaDescriptionCompat, this.MediaBrowserCompatMediaItem, this.IconCompatParcelizer, this.MediaMetadataCompat, this.AudioAttributesImplBaseParcelizer, this.MediaBrowserCompatItemReceiver, this.RatingCompat, this.AudioAttributesImplApi26Parcelizer, this.onCustomAction, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(this.read | 1), _appendEscaped.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer), this.RemoteActionCompatParcelizer);
        }
    }

    public static final void read(ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19, getCreatedOnDateMs<Float> getcreatedondatems, _handleOddName _handleoddname, boolean z, boolean z2, boolean z3, boolean z4, onStreamTypeChanged onstreamtypechanged, boolean z5, isIgnorableServerSideAdInsertionPeriodChange isignorableserversideadinsertionperiodchange, _skipWSOrEnd _skipwsorend, getContentType getcontenttype, boolean z6, boolean z7, Map<String, ? extends Typeface> map, ExoPlayerImplExternalSyntheticLambda14 exoPlayerImplExternalSyntheticLambda14, boolean z8, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i, int i2, int i3) {
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(382909894);
        _handleOddName _handleoddname2 = (i3 & 4) != 0 ? _handleOddName.INSTANCE : _handleoddname;
        boolean z9 = (i3 & 8) != 0 ? false : z;
        boolean z10 = (i3 & 16) != 0 ? false : z2;
        boolean z11 = (i3 & 32) != 0 ? true : z3;
        boolean z12 = (i3 & 64) != 0 ? false : z4;
        onStreamTypeChanged onstreamtypechanged2 = (i3 & 128) != 0 ? onStreamTypeChanged.AUTOMATIC : onstreamtypechanged;
        boolean z13 = (i3 & 256) != 0 ? false : z5;
        isIgnorableServerSideAdInsertionPeriodChange isignorableserversideadinsertionperiodchange2 = (i3 & 512) != 0 ? null : isignorableserversideadinsertionperiodchange;
        _skipWSOrEnd _skipwsorendRemoteActionCompatParcelizer = (i3 & 1024) != 0 ? _skipWSOrEnd.INSTANCE.RemoteActionCompatParcelizer() : _skipwsorend;
        getContentType getcontenttypeIconCompatParcelizer = (i3 & 2048) != 0 ? getContentType.INSTANCE.IconCompatParcelizer() : getcontenttype;
        boolean z14 = (i3 & 4096) != 0 ? true : z6;
        boolean z15 = (i3 & 8192) != 0 ? false : z7;
        Map<String, ? extends Typeface> map2 = (i3 & 16384) != 0 ? null : map;
        ExoPlayerImplExternalSyntheticLambda14 exoPlayerImplExternalSyntheticLambda142 = (32768 & i3) != 0 ? ExoPlayerImplExternalSyntheticLambda14.AUTOMATIC : exoPlayerImplExternalSyntheticLambda14;
        boolean z16 = (65536 & i3) != 0 ? false : z8;
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(382909894, i, i2, "com.airbnb.lottie.compose.LottieAnimation (LottieAnimation.kt:97)");
        }
        _handleunrecognizedcharacterescapeWrite.read(185152185);
        Object objOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
        if (objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause = new ExoPlayerImplExternalSyntheticLambda6();
            _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause);
        }
        ExoPlayerImplExternalSyntheticLambda6 exoPlayerImplExternalSyntheticLambda6 = (ExoPlayerImplExternalSyntheticLambda6) objOnPause;
        _handleunrecognizedcharacterescapeWrite.RatingCompat();
        _handleunrecognizedcharacterescapeWrite.read(185152232);
        Object objOnPause2 = _handleunrecognizedcharacterescapeWrite.onPause();
        if (objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause2 = new Matrix();
            _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause2);
        }
        Matrix matrix = (Matrix) objOnPause2;
        _handleunrecognizedcharacterescapeWrite.RatingCompat();
        _handleunrecognizedcharacterescapeWrite.read(185152312);
        boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(exoPlayerImplExternalSyntheticLambda19);
        Object objOnPause3 = _handleunrecognizedcharacterescapeWrite.onPause();
        if (zAudioAttributesCompatParcelizer || objOnPause3 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause3 = available.RemoteActionCompatParcelizer$default(null, null, 2, null);
            _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause3);
        }
        InputAccessor inputAccessor = (InputAccessor) objOnPause3;
        _handleunrecognizedcharacterescapeWrite.RatingCompat();
        _handleunrecognizedcharacterescapeWrite.read(185152364);
        if (exoPlayerImplExternalSyntheticLambda19 == null || exoPlayerImplExternalSyntheticLambda19.AudioAttributesCompatParcelizer() == BitmapDescriptorFactory.HUE_RED) {
            _handleOddName _handleoddname3 = _handleoddname2;
            AbsSavedState1.RemoteActionCompatParcelizer(_handleoddname3, _handleunrecognizedcharacterescapeWrite, (i >> 6) & 14);
            _handleunrecognizedcharacterescapeWrite.RatingCompat();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
            releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
            if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
                releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new AudioAttributesCompatParcelizer(exoPlayerImplExternalSyntheticLambda19, getcreatedondatems, _handleoddname3, z9, z10, z11, z12, onstreamtypechanged2, z13, isignorableserversideadinsertionperiodchange2, _skipwsorendRemoteActionCompatParcelizer, getcontenttypeIconCompatParcelizer, z14, z15, map2, exoPlayerImplExternalSyntheticLambda142, z16, i, i2, i3));
                return;
            }
            return;
        }
        _handleunrecognizedcharacterescapeWrite.RatingCompat();
        Rect rectIconCompatParcelizer = exoPlayerImplExternalSyntheticLambda19.IconCompatParcelizer();
        _handleOddName _handleoddname4 = _handleoddname2;
        setPrimaryDirectionalMotionAxisOverrider2epLt8ui.write(getPlaceholderFirstMediaPeriodPositionUs.AudioAttributesCompatParcelizer(_handleoddname2, rectIconCompatParcelizer.width(), rectIconCompatParcelizer.height()), new AnonymousClass2(rectIconCompatParcelizer, getcontenttypeIconCompatParcelizer, _skipwsorendRemoteActionCompatParcelizer, matrix, exoPlayerImplExternalSyntheticLambda6, z12, z16, onstreamtypechanged2, exoPlayerImplExternalSyntheticLambda142, exoPlayerImplExternalSyntheticLambda19, map2, isignorableserversideadinsertionperiodchange2, z9, z10, z11, z13, z14, z15, (Context) _handleunrecognizedcharacterescapeWrite.write(AndroidCompositionLocals_androidKt.IconCompatParcelizer()), getcreatedondatems, inputAccessor), _handleunrecognizedcharacterescapeWrite, 0);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver2 = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver2 != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver2.read(new write(exoPlayerImplExternalSyntheticLambda19, getcreatedondatems, _handleoddname4, z9, z10, z11, z12, onstreamtypechanged2, z13, isignorableserversideadinsertionperiodchange2, _skipwsorendRemoteActionCompatParcelizer, getcontenttypeIconCompatParcelizer, z14, z15, map2, exoPlayerImplExternalSyntheticLambda142, z16, i, i2, i3));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final isIgnorableServerSideAdInsertionPeriodChange AudioAttributesCompatParcelizer(InputAccessor<isIgnorableServerSideAdInsertionPeriodChange> inputAccessor) {
        return inputAccessor.getRemoteActionCompatParcelizer();
    }

    /* JADX INFO: renamed from: o.getTotalBufferedDurationUs$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/findSetterInfo;", "", "AudioAttributesCompatParcelizer", "(Lo/findSetterInfo;)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class AnonymousClass2 extends MagicModuleUseCase implements getAnswerMap<findSetterInfo, getShowPopup> {
        private /* synthetic */ ExoPlayerImplExternalSyntheticLambda14 $AudioAttributesCompatParcelizer;
        private /* synthetic */ boolean $AudioAttributesImplApi21Parcelizer;
        private /* synthetic */ getContentType $AudioAttributesImplApi26Parcelizer;
        private /* synthetic */ boolean $AudioAttributesImplBaseParcelizer;
        private /* synthetic */ _skipWSOrEnd $IconCompatParcelizer;
        private /* synthetic */ Context $MediaBrowserCompatCustomActionResultReceiver;
        private /* synthetic */ ExoPlayerImplExternalSyntheticLambda19 $MediaBrowserCompatItemReceiver;
        private /* synthetic */ isIgnorableServerSideAdInsertionPeriodChange $MediaBrowserCompatMediaItem;
        private /* synthetic */ ExoPlayerImplExternalSyntheticLambda6 $MediaBrowserCompatSearchResultReceiver;
        private /* synthetic */ boolean $MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        private /* synthetic */ Map<String, Typeface> $MediaDescriptionCompat;
        private /* synthetic */ boolean $MediaMetadataCompat;
        private /* synthetic */ boolean $RatingCompat;
        private /* synthetic */ boolean $RemoteActionCompatParcelizer;
        private /* synthetic */ getCreatedOnDateMs<Float> $handleMediaPlayPauseIfPendingOnHandler;
        private /* synthetic */ boolean $onAddQueueItem;
        private /* synthetic */ Matrix $onCommand;
        private /* synthetic */ onStreamTypeChanged $onCustomAction;
        private /* synthetic */ InputAccessor<isIgnorableServerSideAdInsertionPeriodChange> $onPause;
        private /* synthetic */ boolean $read;
        private /* synthetic */ Rect $write;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(findSetterInfo findsetterinfo) {
            AudioAttributesCompatParcelizer(findsetterinfo);
            return getShowPopup.INSTANCE;
        }

        public final void AudioAttributesCompatParcelizer(findSetterInfo findsetterinfo) {
            toMagicModuleMetaRepoModel.write(findsetterinfo, "");
            Rect rect = this.$write;
            getContentType getcontenttype = this.$AudioAttributesImplApi26Parcelizer;
            _skipWSOrEnd _skipwsorend = this.$IconCompatParcelizer;
            Matrix matrix = this.$onCommand;
            ExoPlayerImplExternalSyntheticLambda6 exoPlayerImplExternalSyntheticLambda6 = this.$MediaBrowserCompatSearchResultReceiver;
            boolean z = this.$MediaMetadataCompat;
            boolean z2 = this.$onAddQueueItem;
            onStreamTypeChanged onstreamtypechanged = this.$onCustomAction;
            ExoPlayerImplExternalSyntheticLambda14 exoPlayerImplExternalSyntheticLambda14 = this.$AudioAttributesCompatParcelizer;
            ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19 = this.$MediaBrowserCompatItemReceiver;
            Map<String, Typeface> map = this.$MediaDescriptionCompat;
            isIgnorableServerSideAdInsertionPeriodChange isignorableserversideadinsertionperiodchange = this.$MediaBrowserCompatMediaItem;
            boolean z3 = this.$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
            boolean z4 = this.$RemoteActionCompatParcelizer;
            boolean z5 = this.$read;
            boolean z6 = this.$RatingCompat;
            boolean z7 = this.$AudioAttributesImplBaseParcelizer;
            boolean z8 = this.$AudioAttributesImplApi21Parcelizer;
            Context context = this.$MediaBrowserCompatCustomActionResultReceiver;
            getCreatedOnDateMs<Float> getcreatedondatems = this.$handleMediaPlayPauseIfPendingOnHandler;
            InputAccessor<isIgnorableServerSideAdInsertionPeriodChange> inputAccessor = this.$onPause;
            JsonParserDelegate jsonParserDelegateIconCompatParcelizer = findsetterinfo.getIconCompatParcelizer().IconCompatParcelizer();
            long jIconCompatParcelizer = allocCharBuffer.IconCompatParcelizer(rect.width(), rect.height());
            long j = SetterlessProperty.read(getOnline.RemoteActionCompatParcelizer(calloc.AudioAttributesCompatParcelizer(findsetterinfo.MediaBrowserCompatCustomActionResultReceiver())), getOnline.RemoteActionCompatParcelizer(calloc.RemoteActionCompatParcelizer(findsetterinfo.MediaBrowserCompatCustomActionResultReceiver())));
            long jIconCompatParcelizer2 = getcontenttype.IconCompatParcelizer(jIconCompatParcelizer, findsetterinfo.MediaBrowserCompatCustomActionResultReceiver());
            long jIconCompatParcelizer3 = _skipwsorend.IconCompatParcelizer(getTotalBufferedDurationUs.write(jIconCompatParcelizer, jIconCompatParcelizer2), j, findsetterinfo.RemoteActionCompatParcelizer());
            matrix.reset();
            matrix.preTranslate(hasReferringProperties.IconCompatParcelizer(jIconCompatParcelizer3), hasReferringProperties.AudioAttributesCompatParcelizer(jIconCompatParcelizer3));
            matrix.preScale(asInt.IconCompatParcelizer(jIconCompatParcelizer2), asInt.write(jIconCompatParcelizer2));
            exoPlayerImplExternalSyntheticLambda6.read(onAudioDecoderReleased.MergePathsApi19, z);
            exoPlayerImplExternalSyntheticLambda6.AudioAttributesImplBaseParcelizer(z2);
            exoPlayerImplExternalSyntheticLambda6.read(onstreamtypechanged);
            exoPlayerImplExternalSyntheticLambda6.AudioAttributesCompatParcelizer(exoPlayerImplExternalSyntheticLambda14);
            exoPlayerImplExternalSyntheticLambda6.write(exoPlayerImplExternalSyntheticLambda19);
            exoPlayerImplExternalSyntheticLambda6.RemoteActionCompatParcelizer(map);
            if (isignorableserversideadinsertionperiodchange != getTotalBufferedDurationUs.AudioAttributesCompatParcelizer(inputAccessor)) {
                isIgnorableServerSideAdInsertionPeriodChange isignorableserversideadinsertionperiodchangeAudioAttributesCompatParcelizer = getTotalBufferedDurationUs.AudioAttributesCompatParcelizer(inputAccessor);
                if (isignorableserversideadinsertionperiodchangeAudioAttributesCompatParcelizer != null) {
                    isignorableserversideadinsertionperiodchangeAudioAttributesCompatParcelizer.read(exoPlayerImplExternalSyntheticLambda6);
                }
                if (isignorableserversideadinsertionperiodchange != null) {
                    isignorableserversideadinsertionperiodchange.RemoteActionCompatParcelizer(exoPlayerImplExternalSyntheticLambda6);
                }
                getTotalBufferedDurationUs.AudioAttributesCompatParcelizer(inputAccessor, isignorableserversideadinsertionperiodchange);
            }
            exoPlayerImplExternalSyntheticLambda6.AudioAttributesImplApi26Parcelizer(z3);
            exoPlayerImplExternalSyntheticLambda6.read(z4);
            exoPlayerImplExternalSyntheticLambda6.write(z5);
            exoPlayerImplExternalSyntheticLambda6.MediaBrowserCompatCustomActionResultReceiver(z6);
            exoPlayerImplExternalSyntheticLambda6.AudioAttributesCompatParcelizer(z7);
            exoPlayerImplExternalSyntheticLambda6.IconCompatParcelizer(z8);
            maybeUpdateLoadingPeriod maybeupdateloadingperiodAudioAttributesImplApi21Parcelizer = exoPlayerImplExternalSyntheticLambda6.AudioAttributesImplApi21Parcelizer();
            if (!exoPlayerImplExternalSyntheticLambda6.AudioAttributesCompatParcelizer(context) && maybeupdateloadingperiodAudioAttributesImplApi21Parcelizer != null) {
                exoPlayerImplExternalSyntheticLambda6.AudioAttributesCompatParcelizer(maybeupdateloadingperiodAudioAttributesImplApi21Parcelizer.IconCompatParcelizer);
            } else {
                exoPlayerImplExternalSyntheticLambda6.AudioAttributesCompatParcelizer(getcreatedondatems.invoke().floatValue());
            }
            exoPlayerImplExternalSyntheticLambda6.setBounds(0, 0, rect.width(), rect.height());
            exoPlayerImplExternalSyntheticLambda6.AudioAttributesCompatParcelizer(balloc.RemoteActionCompatParcelizer(jsonParserDelegateIconCompatParcelizer), matrix);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(Rect rect, getContentType getcontenttype, _skipWSOrEnd _skipwsorend, Matrix matrix, ExoPlayerImplExternalSyntheticLambda6 exoPlayerImplExternalSyntheticLambda6, boolean z, boolean z2, onStreamTypeChanged onstreamtypechanged, ExoPlayerImplExternalSyntheticLambda14 exoPlayerImplExternalSyntheticLambda14, ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19, Map<String, ? extends Typeface> map, isIgnorableServerSideAdInsertionPeriodChange isignorableserversideadinsertionperiodchange, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, Context context, getCreatedOnDateMs<Float> getcreatedondatems, InputAccessor<isIgnorableServerSideAdInsertionPeriodChange> inputAccessor) {
            super(1);
            this.$write = rect;
            this.$AudioAttributesImplApi26Parcelizer = getcontenttype;
            this.$IconCompatParcelizer = _skipwsorend;
            this.$onCommand = matrix;
            this.$MediaBrowserCompatSearchResultReceiver = exoPlayerImplExternalSyntheticLambda6;
            this.$MediaMetadataCompat = z;
            this.$onAddQueueItem = z2;
            this.$onCustomAction = onstreamtypechanged;
            this.$AudioAttributesCompatParcelizer = exoPlayerImplExternalSyntheticLambda14;
            this.$MediaBrowserCompatItemReceiver = exoPlayerImplExternalSyntheticLambda19;
            this.$MediaDescriptionCompat = map;
            this.$MediaBrowserCompatMediaItem = isignorableserversideadinsertionperiodchange;
            this.$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = z3;
            this.$RemoteActionCompatParcelizer = z4;
            this.$read = z5;
            this.$RatingCompat = z6;
            this.$AudioAttributesImplBaseParcelizer = z7;
            this.$AudioAttributesImplApi21Parcelizer = z8;
            this.$MediaBrowserCompatCustomActionResultReceiver = context;
            this.$handleMediaPlayPauseIfPendingOnHandler = getcreatedondatems;
            this.$onPause = inputAccessor;
        }
    }

    @getRenewGrpId
    public static final void write(ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19, float f, _handleOddName _handleoddname, boolean z, boolean z2, boolean z3, boolean z4, onStreamTypeChanged onstreamtypechanged, boolean z5, isIgnorableServerSideAdInsertionPeriodChange isignorableserversideadinsertionperiodchange, _skipWSOrEnd _skipwsorend, getContentType getcontenttype, boolean z6, boolean z7, ExoPlayerImplExternalSyntheticLambda14 exoPlayerImplExternalSyntheticLambda14, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i, int i2, int i3) {
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(1170781710);
        _handleOddName.Companion companion = (i3 & 4) != 0 ? _handleOddName.INSTANCE : _handleoddname;
        boolean z8 = (i3 & 8) != 0 ? false : z;
        boolean z9 = (i3 & 16) != 0 ? false : z2;
        boolean z10 = (i3 & 32) != 0 ? true : z3;
        boolean z11 = (i3 & 64) != 0 ? false : z4;
        onStreamTypeChanged onstreamtypechanged2 = (i3 & 128) != 0 ? onStreamTypeChanged.AUTOMATIC : onstreamtypechanged;
        boolean z12 = (i3 & 256) != 0 ? false : z5;
        isIgnorableServerSideAdInsertionPeriodChange isignorableserversideadinsertionperiodchange2 = (i3 & 512) != 0 ? null : isignorableserversideadinsertionperiodchange;
        _skipWSOrEnd _skipwsorendRemoteActionCompatParcelizer = (i3 & 1024) != 0 ? _skipWSOrEnd.INSTANCE.RemoteActionCompatParcelizer() : _skipwsorend;
        getContentType getcontenttypeIconCompatParcelizer = (i3 & 2048) != 0 ? getContentType.INSTANCE.IconCompatParcelizer() : getcontenttype;
        boolean z13 = (i3 & 4096) != 0 ? true : z6;
        boolean z14 = (i3 & 8192) != 0 ? false : z7;
        ExoPlayerImplExternalSyntheticLambda14 exoPlayerImplExternalSyntheticLambda142 = (i3 & 16384) != 0 ? ExoPlayerImplExternalSyntheticLambda14.AUTOMATIC : exoPlayerImplExternalSyntheticLambda14;
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(1170781710, i, i2, "com.airbnb.lottie.compose.LottieAnimation (LottieAnimation.kt:172)");
        }
        _handleunrecognizedcharacterescapeWrite.read(185155711);
        boolean z15 = (((i & 112) ^ 48) > 32 && _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(f)) || (i & 48) == 32;
        AnonymousClass1 anonymousClass1OnPause = _handleunrecognizedcharacterescapeWrite.onPause();
        if (z15 || anonymousClass1OnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            anonymousClass1OnPause = new AnonymousClass1(f);
            _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((Object) anonymousClass1OnPause);
        }
        _handleunrecognizedcharacterescapeWrite.RatingCompat();
        read(exoPlayerImplExternalSyntheticLambda19, (getCreatedOnDateMs) anonymousClass1OnPause, companion, z8, z9, z10, z11, onstreamtypechanged2, z12, isignorableserversideadinsertionperiodchange2, _skipwsorendRemoteActionCompatParcelizer, getcontenttypeIconCompatParcelizer, z13, false, null, exoPlayerImplExternalSyntheticLambda142, z14, _handleunrecognizedcharacterescapeWrite, (i & 7168) | (i & 896) | 1073741832 | (57344 & i) | (i & 458752) | (i & 3670016) | (i & 29360128) | (i & 234881024), (i2 & AnalyticsListener.EVENT_DRM_SESSION_ACQUIRED) | ((i2 << 3) & 458752) | ((i2 << 9) & 3670016), CpioConstants.C_ISBLK);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new IconCompatParcelizer(exoPlayerImplExternalSyntheticLambda19, f, companion, z8, z9, z10, z11, onstreamtypechanged2, z12, isignorableserversideadinsertionperiodchange2, _skipwsorendRemoteActionCompatParcelizer, getcontenttypeIconCompatParcelizer, z13, z14, exoPlayerImplExternalSyntheticLambda142, i, i2, i3));
        }
    }

    /* JADX INFO: renamed from: o.getTotalBufferedDurationUs$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "read", "()Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<Float> {
        private /* synthetic */ float $read;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            return Float.valueOf(this.$read);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(float f) {
            super(0);
            this.$read = f;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long write(long j, long j2) {
        return SetterlessProperty.read((int) (calloc.AudioAttributesCompatParcelizer(j) * asInt.IconCompatParcelizer(j2)), (int) (calloc.RemoteActionCompatParcelizer(j) * asInt.write(j2)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesCompatParcelizer(InputAccessor<isIgnorableServerSideAdInsertionPeriodChange> inputAccessor, isIgnorableServerSideAdInsertionPeriodChange isignorableserversideadinsertionperiodchange) {
        inputAccessor.write(isignorableserversideadinsertionperiodchange);
    }
}
