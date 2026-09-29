package kotlin;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.media3.exoplayer.ExoPlayer;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import kotlin.BaseGmsClient;
import kotlin.anyIgnorals;
import kotlin.getRealClientPackageName;
import kotlin.onReceiveResult;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class getUseDynamicLookup {

    public static final /* synthetic */ class IconCompatParcelizer {
        public static final /* synthetic */ int[] IconCompatParcelizer;

        static {
            int[] iArr = new int[anyIgnorals.read.values().length];
            try {
                iArr[anyIgnorals.read.ON_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[anyIgnorals.read.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            IconCompatParcelizer = iArr;
        }
    }

    public static final void AudioAttributesCompatParcelizer(_handleOddName _handleoddname, final getRealClientPackageName.IconCompatParcelizer iconCompatParcelizer, final boolean z, final String str, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i, final int i2) {
        _handleOddName _handleoddname2;
        int i3;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2;
        final _handleOddName _handleoddname3;
        getApiFeatures getapifeatures;
        _handleOddName _handleoddname4;
        final InputAccessor inputAccessor;
        onReceiveResult.read remoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.write(iconCompatParcelizer, "");
        toMagicModuleMetaRepoModel.write(str, "");
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(208232922);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            _handleoddname2 = _handleoddname;
        } else if ((i & 6) == 0) {
            _handleoddname2 = _handleoddname;
            i3 = (_handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(_handleoddname2) ? 4 : 2) | i;
        } else {
            _handleoddname2 = _handleoddname;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(iconCompatParcelizer) ? 32 : 16;
        }
        if ((i & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(str) ? 2048 : 1024;
        }
        int i5 = i3;
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i5 & 1171) != 1170, i5 & 1)) {
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            _handleunrecognizedcharacterescape2.onPrepareFromSearch();
            _handleoddname3 = _handleoddname2;
        } else {
            _handleOddName _handleoddname5 = i4 != 0 ? _handleOddName.INSTANCE : _handleoddname2;
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(208232922, i5, -1, "com.marrow2.ui.mcq.component.McqVideoPlayer (McqVideoPlayer.kt:45)");
            }
            getApiFeatures getapifeatures2 = (getApiFeatures) _handleunrecognizedcharacterescapeWrite.write(FreezableUtils.RemoteActionCompatParcelizer());
            Object objOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if (objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = available.RemoteActionCompatParcelizer$default(getApplicableScopes.IconCompatParcelizer, null, 2, null);
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause);
            }
            final InputAccessor inputAccessor2 = (InputAccessor) objOnPause;
            Object objOnPause2 = _handleunrecognizedcharacterescapeWrite.onPause();
            if (objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause2 = available.RemoteActionCompatParcelizer$default(Boolean.FALSE, null, 2, null);
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause2);
            }
            final InputAccessor inputAccessor3 = (InputAccessor) objOnPause2;
            Object objOnPause3 = _handleunrecognizedcharacterescapeWrite.onPause();
            if (objOnPause3 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause3 = available.RemoteActionCompatParcelizer$default(Boolean.TRUE, null, 2, null);
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause3);
            }
            final InputAccessor inputAccessor4 = (InputAccessor) objOnPause3;
            final hasGetter hasgetter = (hasGetter) _handleunrecognizedcharacterescapeWrite.write(isIsGetterVisible.IconCompatParcelizer());
            boolean zIconCompatParcelizer = _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(hasgetter);
            Object objOnPause4 = _handleunrecognizedcharacterescapeWrite.onPause();
            if (zIconCompatParcelizer || objOnPause4 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause4 = new getAnswerMap() { // from class: o.onPostInitHandler
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return getUseDynamicLookup.RemoteActionCompatParcelizer(hasgetter, inputAccessor4, (StreamConstraintsException) obj);
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause4);
            }
            StreamReadException.RemoteActionCompatParcelizer(hasgetter, (getAnswerMap) objOnPause4, _handleunrecognizedcharacterescapeWrite, 0);
            boolean z2 = z && AudioAttributesImplApi26Parcelizer((InputAccessor<Boolean>) inputAccessor4) && (read((InputAccessor<getApplicableScopes>) inputAccessor2) == getApplicableScopes.RemoteActionCompatParcelizer || MediaBrowserCompatCustomActionResultReceiver((InputAccessor<Boolean>) inputAccessor3));
            Object[] objArr = {getapifeatures2, iconCompatParcelizer.getRemoteActionCompatParcelizer(), iconCompatParcelizer.getAudioAttributesCompatParcelizer(), Boolean.valueOf(z2)};
            boolean zIconCompatParcelizer2 = _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getapifeatures2);
            boolean z3 = (i5 & 112) == 32;
            boolean z4 = (i5 & 7168) == 2048;
            boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(z2);
            boolean z5 = z2;
            RemoteActionCompatParcelizer remoteActionCompatParcelizerOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if (((zIconCompatParcelizer2 | z3 | z4) || zAudioAttributesCompatParcelizer) || remoteActionCompatParcelizerOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                getapifeatures = getapifeatures2;
                _handleoddname4 = _handleoddname5;
                remoteActionCompatParcelizerOnPause = new RemoteActionCompatParcelizer(getapifeatures2, iconCompatParcelizer, str, z5, inputAccessor2, null);
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(remoteActionCompatParcelizerOnPause);
            } else {
                getapifeatures = getapifeatures2;
                _handleoddname4 = _handleoddname5;
            }
            StreamReadException.AudioAttributesCompatParcelizer(objArr, (MagicModuleSubmissionRequestBody) remoteActionCompatParcelizerOnPause, _handleunrecognizedcharacterescapeWrite, 0);
            Object objOnPause5 = _handleunrecognizedcharacterescapeWrite.onPause();
            if (objOnPause5 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause5 = new getAnswerMap() { // from class: o.triggerConnectionSuspended
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return getUseDynamicLookup.read(inputAccessor3, (isAbstract) obj);
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause5);
            }
            _handleOddName _handleoddnameWrite = getNullAccessPattern.write(_handleoddname4, (getAnswerMap) objOnPause5);
            ExoPlayer exoPlayer = (ExoPlayer) isSetterVisible.AudioAttributesCompatParcelizer(getapifeatures.read(), _handleunrecognizedcharacterescapeWrite, 0).getRemoteActionCompatParcelizer();
            final parseDouble parsedoubleAudioAttributesCompatParcelizer = isSetterVisible.AudioAttributesCompatParcelizer(getapifeatures.RemoteActionCompatParcelizer(), _handleunrecognizedcharacterescapeWrite, 0);
            boolean zAudioAttributesCompatParcelizer2 = _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(parsedoubleAudioAttributesCompatParcelizer);
            Object objOnPause6 = _handleunrecognizedcharacterescapeWrite.onPause();
            if (zAudioAttributesCompatParcelizer2 || objOnPause6 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause6 = _qbuf.RemoteActionCompatParcelizer(new getCreatedOnDateMs() { // from class: o.usesClientTelemetry
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return getUseDynamicLookup.IconCompatParcelizer(parsedoubleAudioAttributesCompatParcelizer);
                    }
                });
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause6);
            }
            parseDouble parsedouble = (parseDouble) objOnPause6;
            boolean zAudioAttributesCompatParcelizer3 = _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(parsedoubleAudioAttributesCompatParcelizer);
            Object objOnPause7 = _handleunrecognizedcharacterescapeWrite.onPause();
            if (zAudioAttributesCompatParcelizer3 || objOnPause7 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause7 = new getCreatedOnDateMs() { // from class: o.setAttributionTag
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return Long.valueOf(getUseDynamicLookup.MediaBrowserCompatCustomActionResultReceiver(parsedoubleAudioAttributesCompatParcelizer));
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause7);
            }
            getCreatedOnDateMs getcreatedondatems = (getCreatedOnDateMs) objOnPause7;
            boolean zAudioAttributesCompatParcelizer4 = _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(parsedoubleAudioAttributesCompatParcelizer);
            Object objOnPause8 = _handleunrecognizedcharacterescapeWrite.onPause();
            if (zAudioAttributesCompatParcelizer4 || objOnPause8 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause8 = new getCreatedOnDateMs() { // from class: o.getTelemetryConfiguration
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return Long.valueOf(getUseDynamicLookup.AudioAttributesImplApi26Parcelizer(parsedoubleAudioAttributesCompatParcelizer));
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause8);
            }
            getCreatedOnDateMs getcreatedondatems2 = (getCreatedOnDateMs) objOnPause8;
            final parseDouble parsedouble2 = _qbuf.read(Boolean.valueOf(z), _handleunrecognizedcharacterescapeWrite, (i5 >> 6) & 14);
            final getApiFeatures getapifeatures3 = getapifeatures;
            boolean zAudioAttributesCompatParcelizer5 = _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(getapifeatures3);
            Object objOnPause9 = _handleunrecognizedcharacterescapeWrite.onPause();
            if (zAudioAttributesCompatParcelizer5 || objOnPause9 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause9 = new getCreatedOnDateMs() { // from class: o.triggerNotAvailable
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return getUseDynamicLookup.RemoteActionCompatParcelizer(getapifeatures3, parsedouble2, inputAccessor3, inputAccessor4, inputAccessor2);
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause9);
            }
            getCreatedOnDateMs getcreatedondatems3 = (getCreatedOnDateMs) objOnPause9;
            boolean zAudioAttributesCompatParcelizer6 = _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(getapifeatures3);
            Object objOnPause10 = _handleunrecognizedcharacterescapeWrite.onPause();
            if (zAudioAttributesCompatParcelizer6 || objOnPause10 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause10 = new getCreatedOnDateMs() { // from class: o.BaseGmsClientConnectionProgressReportCallbacks
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return getUseDynamicLookup.write(getapifeatures3);
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause10);
            }
            getCreatedOnDateMs getcreatedondatems4 = (getCreatedOnDateMs) objOnPause10;
            Object objOnPause11 = _handleunrecognizedcharacterescapeWrite.onPause();
            if (objOnPause11 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                inputAccessor = inputAccessor2;
                objOnPause11 = new getCreatedOnDateMs() { // from class: o.BaseGmsClientSignOutCallbacks
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return getUseDynamicLookup.write(inputAccessor);
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause11);
            } else {
                inputAccessor = inputAccessor2;
            }
            getCreatedOnDateMs getcreatedondatems5 = (getCreatedOnDateMs) objOnPause11;
            Object objOnPause12 = _handleunrecognizedcharacterescapeWrite.onPause();
            if (objOnPause12 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause12 = new getCreatedOnDateMs() { // from class: o.BaseGmsClientLegacyClientCallbackAdapter
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return getUseDynamicLookup.AudioAttributesCompatParcelizer(inputAccessor);
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause12);
            }
            getCreatedOnDateMs getcreatedondatems6 = (getCreatedOnDateMs) objOnPause12;
            if (exoPlayer == null) {
                remoteActionCompatParcelizer = onReceiveResult.write.INSTANCE;
            } else {
                remoteActionCompatParcelizer = read((InputAccessor<getApplicableScopes>) inputAccessor) == getApplicableScopes.RemoteActionCompatParcelizer ? new onReceiveResult.RemoteActionCompatParcelizer(exoPlayer) : new onReceiveResult.read(exoPlayer);
            }
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(remoteActionCompatParcelizer, onReceiveResult.write.INSTANCE)) {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(-1751495496);
                IconCompatParcelizer(_handleoddnameWrite, iconCompatParcelizer.getWrite(), (getCreatedOnDateMs<getShowPopup>) getcreatedondatems3, _handleunrecognizedcharacterescapeWrite, 0);
                _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
                _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            } else if (remoteActionCompatParcelizer instanceof onReceiveResult.read) {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(-1751488753);
                _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
                onImageLoaded.IconCompatParcelizer(_handleoddnameWrite, ((onReceiveResult.read) remoteActionCompatParcelizer).read(), iconCompatParcelizer.getWrite(), write((parseDouble<? extends ClientSettings>) parsedouble), getcreatedondatems, getcreatedondatems2, false, getcreatedondatems3, getcreatedondatems4, getcreatedondatems5, _handleunrecognizedcharacterescape2, 806879232);
                _handleunrecognizedcharacterescape2.MediaBrowserCompatCustomActionResultReceiver();
            } else {
                _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
                if (!(remoteActionCompatParcelizer instanceof onReceiveResult.RemoteActionCompatParcelizer)) {
                    _handleunrecognizedcharacterescape2.IconCompatParcelizer(-1751496515);
                    _handleunrecognizedcharacterescape2.MediaBrowserCompatCustomActionResultReceiver();
                    throw new RenewEligibleCreator();
                }
                _handleunrecognizedcharacterescape2.IconCompatParcelizer(-1751473302);
                SingleRefDataBufferIterator.AudioAttributesCompatParcelizer(((onReceiveResult.RemoteActionCompatParcelizer) remoteActionCompatParcelizer).read(), iconCompatParcelizer.getWrite(), write((parseDouble<? extends ClientSettings>) parsedouble), getcreatedondatems, getcreatedondatems2, getcreatedondatems3, getcreatedondatems4, getcreatedondatems6, _handleunrecognizedcharacterescape2, 12582912);
                _handleunrecognizedcharacterescape2.MediaBrowserCompatCustomActionResultReceiver();
            }
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
            _handleoddname3 = _handleoddname4;
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescape2.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.BaseGmsClientBaseOnConnectionFailedListener
                private static final byte[] $$c = {11, 40, -34, 98};
                private static final int $$d = PsExtractor.VIDEO_STREAM_MASK;
                private static int $10 = 0;
                private static int $11 = 1;
                private static final byte[] $$a = {10, TarConstants.LF_PAX_EXTENDED_HEADER_LC, 13, 109, 7, 11, -9, 17, -50, 19, -3, -4, TarConstants.LF_NORMAL, -49, 2, 4, 11, 9, -17, 3, 17, -12, TarConstants.LF_SYMLINK, -42, 4, -1, 17, -17, 38, -15, -15, 17, 0, -5, 5, -15, 23, -11, -24, -10, 3, 45, -42, 4, -1, 17, -17, 38, -15, -15, 17, 0, -5, 5, -15, 23, -11, 15, 6, -1, 4, -13};
                private static final int $$b = 140;
                private static int AudioAttributesImplBaseParcelizer = 0;
                private static int RatingCompat = 1;
                private static long MediaBrowserCompatCustomActionResultReceiver = -3498762522182953692L;
                private static int AudioAttributesImplApi26Parcelizer = -136981212;
                private static char AudioAttributesImplApi21Parcelizer = 29797;

                /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                private static java.lang.String $$e(short r7, short r8, short r9) {
                    /*
                        int r9 = r9 * 4
                        int r9 = r9 + 1
                        int r7 = r7 * 3
                        int r7 = r7 + 103
                        int r8 = r8 * 4
                        int r8 = 4 - r8
                        byte[] r0 = kotlin.BaseGmsClientBaseOnConnectionFailedListener.$$c
                        byte[] r1 = new byte[r9]
                        r2 = 0
                        if (r0 != 0) goto L17
                        r3 = r8
                        r7 = r9
                        r4 = r2
                        goto L2a
                    L17:
                        r3 = r2
                    L18:
                        int r4 = r3 + 1
                        byte r5 = (byte) r7
                        r1[r3] = r5
                        if (r4 != r9) goto L25
                        java.lang.String r7 = new java.lang.String
                        r7.<init>(r1, r2)
                        return r7
                    L25:
                        r3 = r0[r8]
                        r6 = r3
                        r3 = r8
                        r8 = r6
                    L2a:
                        int r8 = -r8
                        int r3 = r3 + 1
                        int r7 = r7 + r8
                        r8 = r3
                        r3 = r4
                        goto L18
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.BaseGmsClientBaseOnConnectionFailedListener.$$e(short, short, short):java.lang.String");
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0025). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                private static void b(int r7, byte r8, short r9, java.lang.Object[] r10) {
                    /*
                        int r9 = r9 + 65
                        int r7 = 31 - r7
                        int r8 = 60 - r8
                        byte[] r0 = kotlin.BaseGmsClientBaseOnConnectionFailedListener.$$a
                        byte[] r1 = new byte[r7]
                        r2 = 0
                        if (r0 != 0) goto L10
                        r3 = r7
                        r5 = r2
                        goto L25
                    L10:
                        r3 = r2
                    L11:
                        byte r4 = (byte) r9
                        int r5 = r3 + 1
                        r1[r3] = r4
                        if (r5 != r7) goto L20
                        java.lang.String r7 = new java.lang.String
                        r7.<init>(r1, r2)
                        r10[r2] = r7
                        return
                    L20:
                        r3 = r0[r8]
                        r6 = r3
                        r3 = r9
                        r9 = r6
                    L25:
                        int r9 = -r9
                        int r3 = r3 + r9
                        int r9 = r3 + 2
                        int r8 = r8 + 1
                        r3 = r5
                        goto L11
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.BaseGmsClientBaseOnConnectionFailedListener.b(int, byte, short, java.lang.Object[]):void");
                }

                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    getShowPopup getshowpopup;
                    int i6 = 2 % 2;
                    int i7 = RatingCompat + 103;
                    AudioAttributesImplBaseParcelizer = i7 % 128;
                    if (i7 % 2 != 0) {
                        getshowpopup = getUseDynamicLookup.read(_handleoddname3, iconCompatParcelizer, z, str, i, i2, (_handleUnrecognizedCharacterEscape) obj);
                        int i8 = 34 / 0;
                    } else {
                        getshowpopup = getUseDynamicLookup.read(_handleoddname3, iconCompatParcelizer, z, str, i, i2, (_handleUnrecognizedCharacterEscape) obj);
                    }
                    int i9 = RatingCompat + 113;
                    AudioAttributesImplBaseParcelizer = i9 % 128;
                    int i10 = i9 % 2;
                    return getshowpopup;
                }

                private static void a(int i6, char[] cArr, char[] cArr2, char c, char[] cArr3, Object[] objArr2) throws Throwable {
                    int i7 = 2;
                    int i8 = 2 % 2;
                    notifyDownloadRemoved notifydownloadremoved = new notifyDownloadRemoved();
                    int length = cArr3.length;
                    char[] cArr4 = new char[length];
                    int length2 = cArr.length;
                    char[] cArr5 = new char[length2];
                    System.arraycopy(cArr3, 0, cArr4, 0, length);
                    System.arraycopy(cArr, 0, cArr5, 0, length2);
                    cArr4[0] = (char) (cArr4[0] ^ c);
                    cArr5[2] = (char) (cArr5[2] + ((char) i6));
                    int length3 = cArr2.length;
                    char[] cArr6 = new char[length3];
                    notifydownloadremoved.AudioAttributesCompatParcelizer = 0;
                    while (notifydownloadremoved.AudioAttributesCompatParcelizer < length3) {
                        int i9 = $11 + 91;
                        $10 = i9 % 128;
                        int i10 = i9 % i7;
                        try {
                            Object[] objArr3 = {notifydownloadremoved};
                            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(718099963);
                            if (objRemoteActionCompatParcelizer == null) {
                                objRemoteActionCompatParcelizer = startForeground.read((char) (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 22748, Color.blue(0) + 36, 1417974126, false, "j", new Class[]{Object.class});
                            }
                            int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr3)).intValue();
                            Object[] objArr4 = {notifydownloadremoved};
                            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(247211480);
                            if (objRemoteActionCompatParcelizer2 == null) {
                                byte b = (byte) 0;
                                byte b2 = b;
                                objRemoteActionCompatParcelizer2 = startForeground.read((char) (Color.blue(0) + 31369), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2720, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 39, 1895162189, false, $$e(b, b2, b2), new Class[]{Object.class});
                            }
                            int iIntValue2 = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr4)).intValue();
                            Object[] objArr5 = {notifydownloadremoved, Integer.valueOf(cArr4[notifydownloadremoved.AudioAttributesCompatParcelizer % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1336303982);
                            if (objRemoteActionCompatParcelizer3 == null) {
                                objRemoteActionCompatParcelizer3 = startForeground.read((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), 15713 - View.MeasureSpec.getSize(0), 65 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), -837789177, false, "f", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                            }
                            ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr5);
                            Object[] objArr6 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1602228082);
                            if (objRemoteActionCompatParcelizer4 == null) {
                                objRemoteActionCompatParcelizer4 = startForeground.read((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 40976), 6122 - TextUtils.getTrimmedLength(""), 29 - View.resolveSize(0, 0), -566873061, false, "m", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr6)).charValue();
                            cArr4[iIntValue2] = notifydownloadremoved.write;
                            cArr6[notifydownloadremoved.AudioAttributesCompatParcelizer] = (char) (((((long) (cArr4[iIntValue2] ^ cArr2[notifydownloadremoved.AudioAttributesCompatParcelizer])) ^ (MediaBrowserCompatCustomActionResultReceiver ^ (-3498762522182953692L))) ^ ((long) ((int) (((long) AudioAttributesImplApi26Parcelizer) ^ (-3498762522182953692L))))) ^ ((long) ((char) (((long) AudioAttributesImplApi21Parcelizer) ^ (-3498762522182953692L)))));
                            notifydownloadremoved.AudioAttributesCompatParcelizer++;
                            int i11 = $10 + 73;
                            $11 = i11 % 128;
                            int i12 = i11 % 2;
                            i7 = 2;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    objArr2[0] = new String(cArr6);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:113:0x0390 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:37:0x0373  */
                /* JADX WARN: Type inference failed for: r15v10, types: [char[]] */
                /* JADX WARN: Type inference failed for: r15v12 */
                /* JADX WARN: Type inference failed for: r15v13 */
                /* JADX WARN: Type inference failed for: r15v14 */
                /* JADX WARN: Type inference failed for: r15v15 */
                /* JADX WARN: Type inference failed for: r15v16 */
                /* JADX WARN: Type inference failed for: r15v17 */
                /* JADX WARN: Type inference failed for: r15v18 */
                /* JADX WARN: Type inference failed for: r15v19 */
                /* JADX WARN: Type inference failed for: r15v2 */
                /* JADX WARN: Type inference failed for: r15v3 */
                /* JADX WARN: Type inference failed for: r15v34 */
                /* JADX WARN: Type inference failed for: r15v35 */
                /* JADX WARN: Type inference failed for: r15v36 */
                /* JADX WARN: Type inference failed for: r15v37 */
                /* JADX WARN: Type inference failed for: r15v38 */
                /* JADX WARN: Type inference failed for: r15v39 */
                /* JADX WARN: Type inference failed for: r15v4 */
                /* JADX WARN: Type inference failed for: r15v40 */
                /* JADX WARN: Type inference failed for: r15v5 */
                /* JADX WARN: Type inference failed for: r15v6 */
                /* JADX WARN: Type inference failed for: r15v7 */
                /* JADX WARN: Type inference failed for: r15v8 */
                /* JADX WARN: Type inference failed for: r15v9 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public static java.lang.Object[] IconCompatParcelizer(android.content.Context r32, int r33, int r34, int r35) throws java.lang.Throwable {
                    /*
                        Method dump skipped, instruction units count: 2466
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.BaseGmsClientBaseOnConnectionFailedListener.IconCompatParcelizer(android.content.Context, int, int, int):java.lang.Object[]");
                }
            });
        }
    }

    private static final getApplicableScopes read(InputAccessor<getApplicableScopes> inputAccessor) {
        return inputAccessor.getRemoteActionCompatParcelizer();
    }

    private static final boolean MediaBrowserCompatCustomActionResultReceiver(InputAccessor<Boolean> inputAccessor) {
        return inputAccessor.getRemoteActionCompatParcelizer().booleanValue();
    }

    private static final boolean AudioAttributesImplApi26Parcelizer(InputAccessor<Boolean> inputAccessor) {
        return inputAccessor.getRemoteActionCompatParcelizer().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final _wrapError RemoteActionCompatParcelizer(hasGetter hasgetter, final InputAccessor inputAccessor, StreamConstraintsException streamConstraintsException) {
        toMagicModuleMetaRepoModel.write(streamConstraintsException, "");
        findAccess findaccess = new findAccess() { // from class: o.hasConnectionInfo
            @Override // kotlin.findAccess
            public final void read(hasGetter hasgetter2, anyIgnorals.read readVar) {
                getUseDynamicLookup.RemoteActionCompatParcelizer(inputAccessor, hasgetter2, readVar);
            }
        };
        hasgetter.getLifecycle().IconCompatParcelizer(findaccess);
        return new read(hasgetter, findaccess);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RemoteActionCompatParcelizer(InputAccessor inputAccessor, hasGetter hasgetter, anyIgnorals.read readVar) {
        toMagicModuleMetaRepoModel.write(hasgetter, "");
        toMagicModuleMetaRepoModel.write(readVar, "");
        int i = IconCompatParcelizer.IconCompatParcelizer[readVar.ordinal()];
        if (i == 1) {
            AudioAttributesCompatParcelizer(inputAccessor, true);
        } else {
            if (i != 2) {
                return;
            }
            AudioAttributesCompatParcelizer(inputAccessor, false);
        }
    }

    public static final class read implements _wrapError {
        final /* synthetic */ hasGetter IconCompatParcelizer;
        private /* synthetic */ findAccess write;

        public read(hasGetter hasgetter, findAccess findaccess) {
            this.IconCompatParcelizer = hasgetter;
            this.write = findaccess;
        }

        @Override // kotlin._wrapError
        public final void RemoteActionCompatParcelizer() {
            this.IconCompatParcelizer.getLifecycle().AudioAttributesCompatParcelizer(this.write);
        }
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ boolean AudioAttributesCompatParcelizer;
        private int AudioAttributesImplBaseParcelizer;
        private /* synthetic */ getRealClientPackageName.IconCompatParcelizer IconCompatParcelizer;
        private /* synthetic */ String RemoteActionCompatParcelizer;
        private /* synthetic */ InputAccessor<getApplicableScopes> read;
        private /* synthetic */ getApiFeatures write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            this.write.onEvent(new BaseGmsClient.write(this.IconCompatParcelizer.getRemoteActionCompatParcelizer(), this.IconCompatParcelizer.getAudioAttributesCompatParcelizer(), this.RemoteActionCompatParcelizer));
            this.write.onEvent(new BaseGmsClient.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer));
            if (!this.AudioAttributesCompatParcelizer) {
                getUseDynamicLookup.RemoteActionCompatParcelizer(this.read, getApplicableScopes.IconCompatParcelizer);
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        RemoteActionCompatParcelizer(getApiFeatures getapifeatures, getRealClientPackageName.IconCompatParcelizer iconCompatParcelizer, String str, boolean z, InputAccessor<getApplicableScopes> inputAccessor, SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.write = getapifeatures;
            this.IconCompatParcelizer = iconCompatParcelizer;
            this.RemoteActionCompatParcelizer = str;
            this.AudioAttributesCompatParcelizer = z;
            this.read = inputAccessor;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new RemoteActionCompatParcelizer(this.write, this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer, this.read, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(InputAccessor inputAccessor, isAbstract isabstract) {
        toMagicModuleMetaRepoModel.write(isabstract, "");
        int iWrite = (int) isabstract.write();
        boolean z = false;
        if (iWrite > 0) {
            WritableTypeIdInclusion writableTypeIdInclusionAudioAttributesCompatParcelizer$default = hasRawClass.AudioAttributesCompatParcelizer$default(isabstract, false, 1, null);
            if ((writableTypeIdInclusionAudioAttributesCompatParcelizer$default.getIconCompatParcelizer() - writableTypeIdInclusionAudioAttributesCompatParcelizer$default.getRemoteActionCompatParcelizer()) / iWrite >= 0.5f) {
                z = true;
            }
        }
        IconCompatParcelizer((InputAccessor<Boolean>) inputAccessor, z);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClientSettings IconCompatParcelizer(parseDouble parsedouble) {
        return ((executorService) parsedouble.getRemoteActionCompatParcelizer()).getWrite();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long MediaBrowserCompatCustomActionResultReceiver(parseDouble parsedouble) {
        return ((executorService) parsedouble.getRemoteActionCompatParcelizer()).getAudioAttributesCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long AudioAttributesImplApi26Parcelizer(parseDouble parsedouble) {
        return ((executorService) parsedouble.getRemoteActionCompatParcelizer()).getRemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(getApiFeatures getapifeatures, parseDouble parsedouble, InputAccessor inputAccessor, InputAccessor inputAccessor2, InputAccessor inputAccessor3) {
        getapifeatures.onEvent(new BaseGmsClient.IconCompatParcelizer(new BinderWrapper(AudioAttributesImplApi21Parcelizer(parsedouble), MediaBrowserCompatCustomActionResultReceiver((InputAccessor<Boolean>) inputAccessor), AudioAttributesImplApi26Parcelizer((InputAccessor<Boolean>) inputAccessor2), read((InputAccessor<getApplicableScopes>) inputAccessor3))));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(getApiFeatures getapifeatures) {
        getapifeatures.onEvent(BaseGmsClient.AudioAttributesCompatParcelizer.INSTANCE);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(InputAccessor inputAccessor) {
        RemoteActionCompatParcelizer(inputAccessor, getApplicableScopes.RemoteActionCompatParcelizer);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(InputAccessor inputAccessor) {
        RemoteActionCompatParcelizer(inputAccessor, getApplicableScopes.IconCompatParcelizer);
        return getShowPopup.INSTANCE;
    }

    private static final void IconCompatParcelizer(final _handleOddName _handleoddname, final String str, final getCreatedOnDateMs<getShowPopup> getcreatedondatems, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i) {
        int i2;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(2135748833);
        if ((i & 6) == 0) {
            i2 = (_handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(_handleoddname) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(str) ? 32 : 16;
        }
        if ((i & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems) ? 256 : 128;
        }
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i2 & 147) != 146, i2 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(2135748833, i2, -1, "com.marrow2.ui.mcq.component.InactiveVideoPlaceholder (McqVideoPlayer.kt:170)");
            }
            _handleOddName _handleoddnameIconCompatParcelizer$default = getFrameEndSchedulerui.IconCompatParcelizer$default(_handleUnexpectedValue.RemoteActionCompatParcelizer(isAdded.RemoteActionCompatParcelizer$default(_handleoddname, BitmapDescriptorFactory.HUE_RED, 1, null), setPlayer.RemoteActionCompatParcelizer(getBindServiceExecutor.AudioAttributesImplBaseParcelizer())), switchToNext.INSTANCE.AudioAttributesCompatParcelizer(), null, 2, null);
            withTypeHandler withtypehandler = setValue.read(WindowInsetsCompatImpl30.INSTANCE.MediaBrowserCompatCustomActionResultReceiver(), _skipWSOrEnd.INSTANCE.RatingCompat(), _handleunrecognizedcharacterescapeWrite, 0);
            int iHashCode = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, _handleoddnameIconCompatParcelizer$default);
            getCreatedOnDateMs<getDependencies> getcreatedondatemsIconCompatParcelizer = getDependencies.INSTANCE.IconCompatParcelizer();
            if (!(_handleunrecognizedcharacterescapeWrite.MediaMetadataCompat() instanceof _closeInput)) {
                _getBigDecimal.write();
            }
            _handleunrecognizedcharacterescapeWrite.onPrepareFromMediaId();
            if (_handleunrecognizedcharacterescapeWrite.getParcelableVolumeInfo()) {
                _handleunrecognizedcharacterescapeWrite.read(getcreatedondatemsIconCompatParcelizer);
            } else {
                _handleunrecognizedcharacterescapeWrite.onPlayFromUri();
            }
            _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2 = NumberOutput.read(_handleunrecognizedcharacterescapeWrite);
            NumberOutput.write(_handleunrecognizedcharacterescape2, withtypehandler, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape2, _getchardescHandleMediaPlayPauseIfPendingOnHandler, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2, Integer.valueOf(iHashCode), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape2, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape2, _handleoddnameRemoteActionCompatParcelizer, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            DrawerLayoutSavedState drawerLayoutSavedState = DrawerLayoutSavedState.INSTANCE;
            _handleOddName _handleoddname2 = NestedScrollView.read$default(isAdded.RemoteActionCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null), 2.0f, false, 2, null);
            withTypeHandler withtypehandlerWrite = AbsSavedState1.write(_skipWSOrEnd.INSTANCE.RemoteActionCompatParcelizer(), false);
            int iHashCode2 = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler2 = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer2 = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, _handleoddname2);
            getCreatedOnDateMs<getDependencies> getcreatedondatemsIconCompatParcelizer2 = getDependencies.INSTANCE.IconCompatParcelizer();
            if (!(_handleunrecognizedcharacterescapeWrite.MediaMetadataCompat() instanceof _closeInput)) {
                _getBigDecimal.write();
            }
            _handleunrecognizedcharacterescapeWrite.onPrepareFromMediaId();
            if (_handleunrecognizedcharacterescapeWrite.getParcelableVolumeInfo()) {
                _handleunrecognizedcharacterescapeWrite.read(getcreatedondatemsIconCompatParcelizer2);
            } else {
                _handleunrecognizedcharacterescapeWrite.onPlayFromUri();
            }
            _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape3 = NumberOutput.read(_handleunrecognizedcharacterescapeWrite);
            NumberOutput.write(_handleunrecognizedcharacterescape3, withtypehandlerWrite, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape3, _getchardescHandleMediaPlayPauseIfPendingOnHandler2, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape3, Integer.valueOf(iHashCode2), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape3, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape3, _handleoddnameRemoteActionCompatParcelizer2, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            setDrawerElevation setdrawerelevation = setDrawerElevation.INSTANCE;
            onImageLoaded.RemoteActionCompatParcelizer(setdrawerelevation.IconCompatParcelizer(_handleOddName.INSTANCE), str, str.length() > 0, _handleunrecognizedcharacterescapeWrite, i2 & 112);
            onImageLoaded.IconCompatParcelizer(setdrawerelevation.IconCompatParcelizer(_handleOddName.INSTANCE), ClientSettings.RemoteActionCompatParcelizer, getcreatedondatems, _handleunrecognizedcharacterescapeWrite, (i2 & 896) | 48);
            _handleunrecognizedcharacterescapeWrite.AudioAttributesImplBaseParcelizer();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer$default = isAdded.RemoteActionCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null);
            ClientSettings clientSettings = ClientSettings.RemoteActionCompatParcelizer;
            Object objOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if (objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new getCreatedOnDateMs() { // from class: o.BaseGmsClientBaseConnectionCallbacks
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return 0L;
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause);
            }
            getCreatedOnDateMs getcreatedondatems2 = (getCreatedOnDateMs) objOnPause;
            Object objOnPause2 = _handleunrecognizedcharacterescapeWrite.onPause();
            if (objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause2 = new getCreatedOnDateMs() { // from class: o.CallbackExecutor
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return 0L;
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause2);
            }
            getCreatedOnDateMs getcreatedondatems3 = (getCreatedOnDateMs) objOnPause2;
            Object objOnPause3 = _handleunrecognizedcharacterescapeWrite.onPause();
            if (objOnPause3 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause3 = new getCreatedOnDateMs() { // from class: o.ClientIdentity
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return getUseDynamicLookup.read();
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause3);
            }
            getCreatedOnDateMs getcreatedondatems4 = (getCreatedOnDateMs) objOnPause3;
            Object objOnPause4 = _handleunrecognizedcharacterescapeWrite.onPause();
            if (objOnPause4 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause4 = new getCreatedOnDateMs() { // from class: o.getStartServicePackage
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return getUseDynamicLookup.write();
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause4);
            }
            onImageLoaded.AudioAttributesCompatParcelizer(_handleoddnameRemoteActionCompatParcelizer$default, clientSettings, (getCreatedOnDateMs<Long>) getcreatedondatems2, (getCreatedOnDateMs<Long>) getcreatedondatems3, false, getcreatedondatems, (getCreatedOnDateMs<getShowPopup>) getcreatedondatems4, (getCreatedOnDateMs<getShowPopup>) objOnPause4, _handleunrecognizedcharacterescapeWrite, ((i2 << 9) & 458752) | 14183862);
            _handleunrecognizedcharacterescapeWrite.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.onConnectedLocked
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return getUseDynamicLookup.AudioAttributesCompatParcelizer(_handleoddname, str, getcreatedondatems, i, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read() {
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write() {
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RemoteActionCompatParcelizer(InputAccessor<getApplicableScopes> inputAccessor, getApplicableScopes getapplicablescopes) {
        inputAccessor.write(getapplicablescopes);
    }

    private static final void IconCompatParcelizer(InputAccessor<Boolean> inputAccessor, boolean z) {
        inputAccessor.write(Boolean.valueOf(z));
    }

    private static final void AudioAttributesCompatParcelizer(InputAccessor<Boolean> inputAccessor, boolean z) {
        inputAccessor.write(Boolean.valueOf(z));
    }

    private static final ClientSettings write(parseDouble<? extends ClientSettings> parsedouble) {
        return parsedouble.getRemoteActionCompatParcelizer();
    }

    private static final boolean AudioAttributesImplApi21Parcelizer(parseDouble<Boolean> parsedouble) {
        return parsedouble.getRemoteActionCompatParcelizer().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(_handleOddName _handleoddname, String str, getCreatedOnDateMs getcreatedondatems, int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        IconCompatParcelizer(_handleoddname, str, (getCreatedOnDateMs<getShowPopup>) getcreatedondatems, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(_handleOddName _handleoddname, getRealClientPackageName.IconCompatParcelizer iconCompatParcelizer, boolean z, String str, int i, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        AudioAttributesCompatParcelizer(_handleoddname, iconCompatParcelizer, z, str, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1), i2);
        return getShowPopup.INSTANCE;
    }
}
