package kotlin;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.designsystem.theme.ColorKt;
import com.marrow.designsystem.theme.MarrowTheme;
import com.marrow.designsystem.theme.TypeKt;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.getTestPattern;
import org.apache.commons.compress.archivers.tar.TarConstants;
import org.apache.commons.compress.utils.CharsetNames;

/* JADX INFO: loaded from: classes3.dex */
public final class requiresGooglePlayServices {

    public static final /* synthetic */ class RemoteActionCompatParcelizer {
        public static final /* synthetic */ int[] RemoteActionCompatParcelizer;
        public static final /* synthetic */ int[] write;

        static {
            int[] iArr = new int[reconnect.values().length];
            try {
                iArr[reconnect.write.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[reconnect.RemoteActionCompatParcelizer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[reconnect.IconCompatParcelizer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[reconnect.AudioAttributesCompatParcelizer.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[reconnect.read.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            write = iArr;
            int[] iArr2 = new int[getContextAttributionTag.values().length];
            try {
                iArr2[getContextAttributionTag.read.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[getContextAttributionTag.AudioAttributesCompatParcelizer.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[getContextAttributionTag.IconCompatParcelizer.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[getContextAttributionTag.write.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            RemoteActionCompatParcelizer = iArr2;
        }
    }

    public static final void IconCompatParcelizer(final List<unregisterConnectionCallbacks> list, _handleOddName _handleoddname, boolean z, final MagicModuleSubmissionRequestBody<? super unregisterConnectionCallbacks, ? super Boolean, getShowPopup> magicModuleSubmissionRequestBody, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i, final int i2) {
        int i3;
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(magicModuleSubmissionRequestBody, "");
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(-1429034699);
        if ((i & 6) == 0) {
            i3 = (_handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(list) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(_handleoddname) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= RendererCapabilities.MODE_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(magicModuleSubmissionRequestBody) ? 2048 : 1024;
        }
        int i6 = i3;
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i6 & 1171) != 1170, i6 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
        } else {
            if (i4 != 0) {
                _handleoddname = _handleOddName.INSTANCE;
            }
            if (i5 != 0) {
                z = false;
            }
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1429034699, i6, -1, "com.marrow2.ui.home.compose.HomeTestSuggestionList (HomeTestSuggestionList.kt:67)");
            }
            _handleOddName _handleoddnameRemoteActionCompatParcelizer$default = isAdded.RemoteActionCompatParcelizer$default(_handleoddname, BitmapDescriptorFactory.HUE_RED, 1, null);
            withTypeHandler withtypehandler = setValue.read(WindowInsetsCompatImpl30.INSTANCE.MediaBrowserCompatCustomActionResultReceiver(), _skipWSOrEnd.INSTANCE.RatingCompat(), _handleunrecognizedcharacterescapeWrite, 0);
            int iHashCode = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, _handleoddnameRemoteActionCompatParcelizer$default);
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
            _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(1727303822);
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                AudioAttributesCompatParcelizer((unregisterConnectionCallbacks) it.next(), null, z, magicModuleSubmissionRequestBody, _handleunrecognizedcharacterescapeWrite, i6 & 8064, 2);
            }
            _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
            _handleunrecognizedcharacterescapeWrite.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        final _handleOddName _handleoddname2 = _handleoddname;
        final boolean z2 = z;
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.requiresSignIn
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return requiresGooglePlayServices.IconCompatParcelizer(list, _handleoddname2, z2, magicModuleSubmissionRequestBody, i, i2, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void AudioAttributesCompatParcelizer(final kotlin.unregisterConnectionCallbacks r37, kotlin._handleOddName r38, boolean r39, final kotlin.MagicModuleSubmissionRequestBody<? super kotlin.unregisterConnectionCallbacks, ? super java.lang.Boolean, kotlin.getShowPopup> r40, kotlin._handleUnrecognizedCharacterEscape r41, final int r42, final int r43) {
        /*
            Method dump skipped, instruction units count: 1198
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.requiresGooglePlayServices.AudioAttributesCompatParcelizer(o.unregisterConnectionCallbacks, o._handleOddName, boolean, o.MagicModuleSubmissionRequestBody, o._handleUnrecognizedCharacterEscape, int, int):void");
    }

    static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ String AudioAttributesCompatParcelizer;
        private long AudioAttributesImplBaseParcelizer;
        private /* synthetic */ unregisterConnectionCallbacks IconCompatParcelizer;
        private int MediaBrowserCompatItemReceiver;
        private /* synthetic */ String RemoteActionCompatParcelizer;
        private /* synthetic */ boolean read;
        private /* synthetic */ InputAccessor<String> write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.MediaBrowserCompatItemReceiver;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                if (!this.read) {
                    requiresGooglePlayServices.read(this.write, this.IconCompatParcelizer.getRead());
                    return getShowPopup.INSTANCE;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            do {
                long onPlay = this.IconCompatParcelizer.getOnPlay() - System.currentTimeMillis();
                if (onPlay <= 0) {
                    requiresGooglePlayServices.read(this.write, this.RemoteActionCompatParcelizer);
                    return getShowPopup.INSTANCE;
                }
                InputAccessor<String> inputAccessor = this.write;
                String str = this.AudioAttributesCompatParcelizer;
                String strWrite = loadBitmap.write(onPlay);
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" ");
                sb.append(strWrite);
                requiresGooglePlayServices.read(inputAccessor, sb.toString());
                getTestPattern.RemoteActionCompatParcelizer remoteActionCompatParcelizer = getTestPattern.read;
                this.AudioAttributesImplBaseParcelizer = onPlay;
                this.MediaBrowserCompatItemReceiver = 1;
            } while (setCountry.RemoteActionCompatParcelizer(getUserSubmissionTimestamp.IconCompatParcelizer(1000, isAnonymous.RemoteActionCompatParcelizer), this) != objIconCompatParcelizer);
            return objIconCompatParcelizer;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        write(boolean z, unregisterConnectionCallbacks unregisterconnectioncallbacks, String str, String str2, InputAccessor<String> inputAccessor, SampleVideos<? super write> sampleVideos) {
            super(2, sampleVideos);
            this.read = z;
            this.IconCompatParcelizer = unregisterconnectioncallbacks;
            this.AudioAttributesCompatParcelizer = str;
            this.RemoteActionCompatParcelizer = str2;
            this.write = inputAccessor;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new write(this.read, this.IconCompatParcelizer, this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer, this.write, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private static final String IconCompatParcelizer(InputAccessor<String> inputAccessor) {
        return inputAccessor.getRemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, unregisterConnectionCallbacks unregisterconnectioncallbacks, boolean z) {
        magicModuleSubmissionRequestBody.invoke(unregisterconnectioncallbacks, Boolean.valueOf(z));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(unregisterConnectionCallbacks unregisterconnectioncallbacks, String str, InputAccessor inputAccessor, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2;
        int i2;
        int i3;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape3;
        int i4;
        int i5;
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(431789996, i, -1, "com.marrow2.ui.home.compose.HomeTestSuggestionCard.<anonymous>.<anonymous> (HomeTestSuggestionList.kt:162)");
            }
            _handleOddName _handleoddnameRemoteActionCompatParcelizer$default = isAdded.RemoteActionCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null);
            withTypeHandler withtypehandlerWrite = AbsSavedState1.write(_skipWSOrEnd.INSTANCE.MediaBrowserCompatSearchResultReceiver(), false);
            int iHashCode = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescape.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, _handleoddnameRemoteActionCompatParcelizer$default);
            getCreatedOnDateMs<getDependencies> getcreatedondatemsIconCompatParcelizer = getDependencies.INSTANCE.IconCompatParcelizer();
            if (!(_handleunrecognizedcharacterescape.MediaMetadataCompat() instanceof _closeInput)) {
                _getBigDecimal.write();
            }
            _handleunrecognizedcharacterescape.onPrepareFromMediaId();
            if (_handleunrecognizedcharacterescape.getParcelableVolumeInfo()) {
                _handleunrecognizedcharacterescape.read(getcreatedondatemsIconCompatParcelizer);
            } else {
                _handleunrecognizedcharacterescape.onPlayFromUri();
            }
            _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape4 = NumberOutput.read(_handleunrecognizedcharacterescape);
            NumberOutput.write(_handleunrecognizedcharacterescape4, withtypehandlerWrite, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape4, _getchardescHandleMediaPlayPauseIfPendingOnHandler, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape4, Integer.valueOf(iHashCode), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape4, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape4, _handleoddnameRemoteActionCompatParcelizer, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            setDrawerElevation setdrawerelevation = setDrawerElevation.INSTANCE;
            _handleOddName _handleoddnameWrite = getParentFragment.write(isAdded.RemoteActionCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null), assignParameter.IconCompatParcelizer(10.0f), assignParameter.IconCompatParcelizer(16.0f));
            withTypeHandler withtypehandlerWrite2 = AbsSavedState1.write(_skipWSOrEnd.INSTANCE.MediaBrowserCompatSearchResultReceiver(), false);
            int iHashCode2 = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler2 = _handleunrecognizedcharacterescape.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer2 = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, _handleoddnameWrite);
            getCreatedOnDateMs<getDependencies> getcreatedondatemsIconCompatParcelizer2 = getDependencies.INSTANCE.IconCompatParcelizer();
            if (!(_handleunrecognizedcharacterescape.MediaMetadataCompat() instanceof _closeInput)) {
                _getBigDecimal.write();
            }
            _handleunrecognizedcharacterescape.onPrepareFromMediaId();
            if (_handleunrecognizedcharacterescape.getParcelableVolumeInfo()) {
                _handleunrecognizedcharacterescape.read(getcreatedondatemsIconCompatParcelizer2);
            } else {
                _handleunrecognizedcharacterescape.onPlayFromUri();
            }
            _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape5 = NumberOutput.read(_handleunrecognizedcharacterescape);
            NumberOutput.write(_handleunrecognizedcharacterescape5, withtypehandlerWrite2, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape5, _getchardescHandleMediaPlayPauseIfPendingOnHandler2, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape5, Integer.valueOf(iHashCode2), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape5, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape5, _handleoddnameRemoteActionCompatParcelizer2, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            setDrawerElevation setdrawerelevation2 = setDrawerElevation.INSTANCE;
            _handleOddName _handleoddnameRemoteActionCompatParcelizer$default2 = isAdded.RemoteActionCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null);
            withTypeHandler withtypehandler = setValue.read(WindowInsetsCompatImpl30.INSTANCE.MediaBrowserCompatCustomActionResultReceiver(), _skipWSOrEnd.INSTANCE.AudioAttributesImplApi21Parcelizer(), _handleunrecognizedcharacterescape, 48);
            int iHashCode3 = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler3 = _handleunrecognizedcharacterescape.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer3 = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, _handleoddnameRemoteActionCompatParcelizer$default2);
            getCreatedOnDateMs<getDependencies> getcreatedondatemsIconCompatParcelizer3 = getDependencies.INSTANCE.IconCompatParcelizer();
            if (!(_handleunrecognizedcharacterescape.MediaMetadataCompat() instanceof _closeInput)) {
                _getBigDecimal.write();
            }
            _handleunrecognizedcharacterescape.onPrepareFromMediaId();
            if (_handleunrecognizedcharacterescape.getParcelableVolumeInfo()) {
                _handleunrecognizedcharacterescape.read(getcreatedondatemsIconCompatParcelizer3);
            } else {
                _handleunrecognizedcharacterescape.onPlayFromUri();
            }
            _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape6 = NumberOutput.read(_handleunrecognizedcharacterescape);
            NumberOutput.write(_handleunrecognizedcharacterescape6, withtypehandler, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape6, _getchardescHandleMediaPlayPauseIfPendingOnHandler3, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape6, Integer.valueOf(iHashCode3), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape6, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape6, _handleoddnameRemoteActionCompatParcelizer3, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            DrawerLayoutSavedState drawerLayoutSavedState = DrawerLayoutSavedState.INSTANCE;
            _handleOddName _handleoddnameAudioAttributesCompatParcelizer$default = getParentFragment.AudioAttributesCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, assignParameter.IconCompatParcelizer(5.0f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null);
            withTypeHandler withtypehandlerWrite3 = AbsSavedState1.write(_skipWSOrEnd.INSTANCE.MediaDescriptionCompat(), false);
            int iHashCode4 = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler4 = _handleunrecognizedcharacterescape.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer4 = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, _handleoddnameAudioAttributesCompatParcelizer$default);
            getCreatedOnDateMs<getDependencies> getcreatedondatemsIconCompatParcelizer4 = getDependencies.INSTANCE.IconCompatParcelizer();
            if (!(_handleunrecognizedcharacterescape.MediaMetadataCompat() instanceof _closeInput)) {
                _getBigDecimal.write();
            }
            _handleunrecognizedcharacterescape.onPrepareFromMediaId();
            if (_handleunrecognizedcharacterescape.getParcelableVolumeInfo()) {
                _handleunrecognizedcharacterescape.read(getcreatedondatemsIconCompatParcelizer4);
            } else {
                _handleunrecognizedcharacterescape.onPlayFromUri();
            }
            _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape7 = NumberOutput.read(_handleunrecognizedcharacterescape);
            NumberOutput.write(_handleunrecognizedcharacterescape7, withtypehandlerWrite3, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape7, _getchardescHandleMediaPlayPauseIfPendingOnHandler4, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape7, Integer.valueOf(iHashCode4), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape7, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape7, _handleoddnameRemoteActionCompatParcelizer4, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            setDrawerElevation setdrawerelevation3 = setDrawerElevation.INSTANCE;
            value.read(getDefaultSetterInfo.RemoteActionCompatParcelizer(R.drawable.icv_test_home, _handleunrecognizedcharacterescape, 6), null, null, ColorKt.addOnNewIntentListener(), _handleunrecognizedcharacterescape, isAnnotationBundle.read | 48, 4);
            String strRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(unregisterconnectioncallbacks.getMediaBrowserCompatCustomActionResultReceiver());
            deserializeWithObjectId deserializewithobjectidWrite = TypeKt.write(enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescape, enabled.RemoteActionCompatParcelizer));
            MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
            _copyCurrentStringValue.IconCompatParcelizer(strRemoteActionCompatParcelizer, null, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, MarrowTheme.RemoteActionCompatParcelizer).getOnSkipToNext(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, deserializewithobjectidWrite, _handleunrecognizedcharacterescape, 0, 0, 65530);
            _handleunrecognizedcharacterescape.AudioAttributesImplBaseParcelizer();
            _handleOddName _handleoddnameAudioAttributesCompatParcelizer$default2 = getParentFragment.AudioAttributesCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, assignParameter.IconCompatParcelizer(13.0f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null);
            withTypeHandler withtypehandlerIconCompatParcelizer = getTag.IconCompatParcelizer(WindowInsetsCompatImpl30.INSTANCE.AudioAttributesImplApi21Parcelizer(), _skipWSOrEnd.INSTANCE.MediaBrowserCompatCustomActionResultReceiver(), _handleunrecognizedcharacterescape, 48);
            int iHashCode5 = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler5 = _handleunrecognizedcharacterescape.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer5 = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, _handleoddnameAudioAttributesCompatParcelizer$default2);
            getCreatedOnDateMs<getDependencies> getcreatedondatemsIconCompatParcelizer5 = getDependencies.INSTANCE.IconCompatParcelizer();
            if (!(_handleunrecognizedcharacterescape.MediaMetadataCompat() instanceof _closeInput)) {
                _getBigDecimal.write();
            }
            _handleunrecognizedcharacterescape.onPrepareFromMediaId();
            if (_handleunrecognizedcharacterescape.getParcelableVolumeInfo()) {
                _handleunrecognizedcharacterescape.read(getcreatedondatemsIconCompatParcelizer5);
            } else {
                _handleunrecognizedcharacterescape.onPlayFromUri();
            }
            _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape8 = NumberOutput.read(_handleunrecognizedcharacterescape);
            NumberOutput.write(_handleunrecognizedcharacterescape8, withtypehandlerIconCompatParcelizer, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape8, _getchardescHandleMediaPlayPauseIfPendingOnHandler5, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape8, Integer.valueOf(iHashCode5), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape8, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape8, _handleoddnameRemoteActionCompatParcelizer5, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            getView getview = getView.INSTANCE;
            String write2 = unregisterconnectioncallbacks.getWrite();
            deserializeWithObjectId deserializewithobjectidRemoteActionCompatParcelizer = TypeKt.RemoteActionCompatParcelizer(enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescape, enabled.RemoteActionCompatParcelizer));
            MarrowTheme marrowTheme2 = MarrowTheme.INSTANCE;
            _copyCurrentStringValue.IconCompatParcelizer(write2, null, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, MarrowTheme.RemoteActionCompatParcelizer).getOnSkipToNext(), 0L, null, null, null, 0L, null, assignIndexes.write(assignIndexes.INSTANCE.write()), 0L, 0, false, 0, 0, null, deserializewithobjectidRemoteActionCompatParcelizer, _handleunrecognizedcharacterescape, 0, 0, 65018);
            if (!unregisterconnectioncallbacks.getMediaBrowserCompatItemReceiver()) {
                _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescape;
                i2 = 6;
                i3 = 0;
                _handleunrecognizedcharacterescape2.IconCompatParcelizer(431124944);
            } else {
                _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescape;
                _handleunrecognizedcharacterescape2.IconCompatParcelizer(439857861);
                i2 = 6;
                isInLayout.RemoteActionCompatParcelizer(isAdded.AudioAttributesImplApi26Parcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(8.0f)), _handleunrecognizedcharacterescape2, 6);
                i3 = 0;
                IconCompatParcelizer(_handleunrecognizedcharacterescape2, 0);
            }
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            if (!unregisterconnectioncallbacks.getMediaBrowserCompatSearchResultReceiver()) {
                _handleunrecognizedcharacterescape2.IconCompatParcelizer(431124944);
            } else {
                _handleunrecognizedcharacterescape2.IconCompatParcelizer(440044202);
                isInLayout.RemoteActionCompatParcelizer(isAdded.AudioAttributesImplApi26Parcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(8.0f)), _handleunrecognizedcharacterescape2, i2);
                AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescape2, i3);
            }
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            _handleunrecognizedcharacterescape.AudioAttributesImplBaseParcelizer();
            String strIconCompatParcelizer = IconCompatParcelizer(inputAccessor);
            deserializeWithObjectId deserializewithobjectidMediaBrowserCompatItemReceiver = TypeKt.MediaBrowserCompatItemReceiver(enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescape2, enabled.RemoteActionCompatParcelizer));
            MarrowTheme marrowTheme3 = MarrowTheme.INSTANCE;
            _copyCurrentStringValue.IconCompatParcelizer(strIconCompatParcelizer, getParentFragment.AudioAttributesCompatParcelizer$default(isAdded.RemoteActionCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null), BitmapDescriptorFactory.HUE_RED, assignParameter.IconCompatParcelizer(4.0f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null), MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2, MarrowTheme.RemoteActionCompatParcelizer).getOnSetPlaybackSpeed(), 0L, null, null, null, 0L, null, assignIndexes.write(assignIndexes.INSTANCE.write()), 0L, 0, false, 0, 0, null, deserializewithobjectidMediaBrowserCompatItemReceiver, _handleunrecognizedcharacterescape, 48, 0, 65016);
            if (unregisterconnectioncallbacks.getMediaBrowserCompatMediaItem()) {
                _handleunrecognizedcharacterescape.IconCompatParcelizer(827777532);
                String iconCompatParcelizer = unregisterconnectioncallbacks.getIconCompatParcelizer();
                deserializeWithObjectId deserializewithobjectidAudioAttributesImplApi21Parcelizer = TypeKt.AudioAttributesImplApi21Parcelizer(enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescape, enabled.RemoteActionCompatParcelizer));
                MarrowTheme marrowTheme4 = MarrowTheme.INSTANCE;
                _copyCurrentStringValue.IconCompatParcelizer(iconCompatParcelizer, getParentFragment.AudioAttributesCompatParcelizer$default(isAdded.RemoteActionCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null), BitmapDescriptorFactory.HUE_RED, assignParameter.IconCompatParcelizer(4.0f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null), MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, MarrowTheme.RemoteActionCompatParcelizer).getOnSetRating(), 0L, null, null, null, 0L, null, assignIndexes.write(assignIndexes.INSTANCE.write()), 0L, 0, false, 0, 0, null, deserializewithobjectidAudioAttributesImplApi21Parcelizer, _handleunrecognizedcharacterescape, 48, 0, 65016);
                _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
                _handleunrecognizedcharacterescape3 = _handleunrecognizedcharacterescape;
                i4 = 818200020;
            } else {
                _handleunrecognizedcharacterescape3 = _handleunrecognizedcharacterescape;
                i4 = 818200020;
                _handleunrecognizedcharacterescape3.IconCompatParcelizer(818200020);
                _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            }
            if (!unregisterconnectioncallbacks.getMediaMetadataCompat()) {
                i5 = 0;
                _handleunrecognizedcharacterescape3.IconCompatParcelizer(i4);
            } else {
                _handleunrecognizedcharacterescape3.IconCompatParcelizer(828278275);
                i5 = 0;
                RemoteActionCompatParcelizer(str, getParentFragment.AudioAttributesCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, assignParameter.IconCompatParcelizer(8.0f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null), _handleunrecognizedcharacterescape3, 48, 0);
            }
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            _handleunrecognizedcharacterescape.AudioAttributesImplBaseParcelizer();
            if (unregisterconnectioncallbacks.MediaBrowserCompatSearchResultReceiver()) {
                _handleunrecognizedcharacterescape3.IconCompatParcelizer(-1871248391);
                value.read(getDefaultSetterInfo.RemoteActionCompatParcelizer(R.drawable.icv_fc_pause, _handleunrecognizedcharacterescape3, 6), null, isAdded.AudioAttributesImplBaseParcelizer(getParentFragment.IconCompatParcelizer(setdrawerelevation2.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, _skipWSOrEnd.INSTANCE.MediaMetadataCompat()), assignParameter.IconCompatParcelizer(2.0f)), assignParameter.IconCompatParcelizer(20.0f)), enabled.INSTANCE.write(_handleunrecognizedcharacterescape3, enabled.RemoteActionCompatParcelizer).AudioAttributesImplApi26Parcelizer(), _handleunrecognizedcharacterescape, isAnnotationBundle.read | 48, 0);
                _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            } else {
                if (!unregisterconnectioncallbacks.IconCompatParcelizer()) {
                    _handleunrecognizedcharacterescape3.IconCompatParcelizer(-1881714518);
                } else {
                    _handleunrecognizedcharacterescape3.IconCompatParcelizer(-1870806548);
                    write(unregisterconnectioncallbacks.getAudioAttributesImplApi26Parcelizer(), unregisterconnectioncallbacks.getAudioAttributesImplApi21Parcelizer(), setdrawerelevation2.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, _skipWSOrEnd.INSTANCE.MediaMetadataCompat()), _handleunrecognizedcharacterescape, 0, 0);
                }
                _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            }
            _handleunrecognizedcharacterescape.AudioAttributesImplBaseParcelizer();
            if (!unregisterconnectioncallbacks.getOnCustomAction()) {
                _handleunrecognizedcharacterescape3.IconCompatParcelizer(1935342800);
            } else {
                _handleunrecognizedcharacterescape3.IconCompatParcelizer(1946774236);
                AudioAttributesCompatParcelizer(getParentFragment.IconCompatParcelizer(setdrawerelevation.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, _skipWSOrEnd.INSTANCE.MediaBrowserCompatSearchResultReceiver()), assignParameter.IconCompatParcelizer(2.0f)), _handleunrecognizedcharacterescape3, i5, i5);
            }
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            _handleunrecognizedcharacterescape.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    private static final String RemoteActionCompatParcelizer(getContextAttributionTag getcontextattributiontag) {
        int i = RemoteActionCompatParcelizer.RemoteActionCompatParcelizer[getcontextattributiontag.ordinal()];
        if (i == 1) {
            return "";
        }
        if (i == 2) {
            return "G";
        }
        if (i == 3) {
            return "M";
        }
        if (i != 4) {
            throw new RenewEligibleCreator();
        }
        return "S";
    }

    private static final void IconCompatParcelizer(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i) {
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(60853244);
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(i != 0, i & 1)) {
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            _handleunrecognizedcharacterescape2.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(60853244, i, -1, "com.marrow2.ui.home.compose.UpcomingBadge (HomeTestSuggestionList.kt:280)");
            }
            String upperCase = singleArgCreatorDefaultsToProperties.read(R.string.label_home_upcoming, _handleunrecognizedcharacterescapeWrite, 6).toUpperCase(Locale.ROOT);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(upperCase, "");
            deserializeWithObjectId deserializewithobjectidMediaBrowserCompatMediaItem = TypeKt.MediaBrowserCompatMediaItem(enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer));
            long jMediaBrowserCompatSearchResultReceiver = enabled.INSTANCE.write(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer).MediaBrowserCompatSearchResultReceiver();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer = _handleUnexpectedValue.RemoteActionCompatParcelizer(_handleOddName.INSTANCE, setPlayer.RemoteActionCompatParcelizer(assignParameter.IconCompatParcelizer(4.0f)));
            MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            _copyCurrentStringValue.IconCompatParcelizer(upperCase, getParentFragment.write(getFrameEndSchedulerui.IconCompatParcelizer$default(_handleoddnameRemoteActionCompatParcelizer, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, MarrowTheme.RemoteActionCompatParcelizer).getR8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8(), null, 2, null), assignParameter.IconCompatParcelizer(6.0f), assignParameter.IconCompatParcelizer(2.0f)), jMediaBrowserCompatSearchResultReceiver, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, deserializewithobjectidMediaBrowserCompatMediaItem, _handleunrecognizedcharacterescape2, 0, 0, 65528);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescape2.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.ApiException
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return requiresGooglePlayServices.RemoteActionCompatParcelizer(i, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    private static final void AudioAttributesCompatParcelizer(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i) {
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(341577743);
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(i != 0, i & 1)) {
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            _handleunrecognizedcharacterescape2.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(341577743, i, -1, "com.marrow2.ui.home.compose.LiveChip (HomeTestSuggestionList.kt:293)");
            }
            _handleOddName _handleoddnameWrite = getParentFragment.write(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(3.0f), assignParameter.IconCompatParcelizer(2.0f));
            withTypeHandler withtypehandlerIconCompatParcelizer = getTag.IconCompatParcelizer(WindowInsetsCompatImpl30.INSTANCE.AudioAttributesImplApi21Parcelizer(), _skipWSOrEnd.INSTANCE.MediaBrowserCompatCustomActionResultReceiver(), _handleunrecognizedcharacterescapeWrite, 48);
            int iHashCode = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, _handleoddnameWrite);
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
            _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape3 = NumberOutput.read(_handleunrecognizedcharacterescapeWrite);
            NumberOutput.write(_handleunrecognizedcharacterescape3, withtypehandlerIconCompatParcelizer, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape3, _getchardescHandleMediaPlayPauseIfPendingOnHandler, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape3, Integer.valueOf(iHashCode), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape3, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape3, _handleoddnameRemoteActionCompatParcelizer, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            getView getview = getView.INSTANCE;
            _handleOddName _handleoddnameRemoteActionCompatParcelizer2 = _handleUnexpectedValue.RemoteActionCompatParcelizer(isAdded.AudioAttributesImplBaseParcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(10.0f)), setPlayer.IconCompatParcelizer());
            MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
            AbsSavedState1.RemoteActionCompatParcelizer(getFrameEndSchedulerui.IconCompatParcelizer$default(_handleoddnameRemoteActionCompatParcelizer2, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, MarrowTheme.RemoteActionCompatParcelizer).getOnPrepareFromMediaId(), null, 2, null), _handleunrecognizedcharacterescapeWrite, 0);
            isInLayout.RemoteActionCompatParcelizer(isAdded.AudioAttributesImplApi26Parcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(2.0f)), _handleunrecognizedcharacterescapeWrite, 6);
            String upperCase = singleArgCreatorDefaultsToProperties.read(R.string.label_home_live, _handleunrecognizedcharacterescapeWrite, 6).toUpperCase(Locale.ROOT);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(upperCase, "");
            deserializeWithObjectId deserializewithobjectidMediaBrowserCompatCustomActionResultReceiver = TypeKt.MediaBrowserCompatCustomActionResultReceiver(enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer));
            MarrowTheme marrowTheme2 = MarrowTheme.INSTANCE;
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            _copyCurrentStringValue.IconCompatParcelizer(upperCase, null, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, MarrowTheme.RemoteActionCompatParcelizer).getOnPrepareFromMediaId(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, deserializewithobjectidMediaBrowserCompatCustomActionResultReceiver, _handleunrecognizedcharacterescape2, 0, 0, 65530);
            _handleunrecognizedcharacterescape2.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescape2.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.BooleanResult
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return requiresGooglePlayServices.AudioAttributesCompatParcelizer(i, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void write(final boolean r31, final boolean r32, kotlin._handleOddName r33, kotlin._handleUnrecognizedCharacterEscape r34, final int r35, final int r36) {
        /*
            Method dump skipped, instruction units count: 509
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.requiresGooglePlayServices.write(boolean, boolean, o._handleOddName, o._handleUnrecognizedCharacterEscape, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void RemoteActionCompatParcelizer(final java.lang.String r27, kotlin._handleOddName r28, kotlin._handleUnrecognizedCharacterEscape r29, final int r30, final int r31) {
        /*
            Method dump skipped, instruction units count: 442
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.requiresGooglePlayServices.RemoteActionCompatParcelizer(java.lang.String, o._handleOddName, o._handleUnrecognizedCharacterEscape, int, int):void");
    }

    private static final void AudioAttributesCompatParcelizer(_handleOddName _handleoddname, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i, final int i2) {
        final _handleOddName _handleoddname2;
        int i3;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(-1286030257);
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
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i3 & 3) != 2, i3 & 1)) {
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            _handleunrecognizedcharacterescape2.onPrepareFromSearch();
        } else {
            _handleOddName _handleoddname3 = i4 != 0 ? _handleOddName.INSTANCE : _handleoddname2;
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1286030257, i3, -1, "com.marrow2.ui.home.compose.ResultsOutBadge (HomeTestSuggestionList.kt:365)");
            }
            String upperCase = singleArgCreatorDefaultsToProperties.read(R.string.text_results_out, _handleunrecognizedcharacterescapeWrite, 6).toUpperCase(Locale.ROOT);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(upperCase, "");
            deserializeWithObjectId deserializewithobjectidMediaBrowserCompatMediaItem = TypeKt.MediaBrowserCompatMediaItem(enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer));
            long jMediaBrowserCompatItemReceiver = enabled.INSTANCE.write(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer).MediaBrowserCompatItemReceiver();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer = _handleUnexpectedValue.RemoteActionCompatParcelizer(_handleoddname3, setPlayer.AudioAttributesCompatParcelizer$default(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, assignParameter.IconCompatParcelizer(4.0f), BitmapDescriptorFactory.HUE_RED, 11, null));
            MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
            _handleOddName _handleoddname4 = _handleoddname3;
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            _copyCurrentStringValue.IconCompatParcelizer(upperCase, getParentFragment.write(getFrameEndSchedulerui.IconCompatParcelizer$default(_handleoddnameRemoteActionCompatParcelizer, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, MarrowTheme.RemoteActionCompatParcelizer).getOnPlayFromSearch(), null, 2, null), assignParameter.IconCompatParcelizer(24.0f), assignParameter.IconCompatParcelizer(4.0f)), jMediaBrowserCompatItemReceiver, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, deserializewithobjectidMediaBrowserCompatMediaItem, _handleunrecognizedcharacterescape2, 0, 0, 65528);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
            _handleoddname2 = _handleoddname4;
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescape2.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.requiresAccount
                private static int AudioAttributesImplApi21Parcelizer;
                private static int AudioAttributesImplApi26Parcelizer;
                private static int AudioAttributesImplBaseParcelizer;
                private static int[] IconCompatParcelizer;
                private static byte[] MediaBrowserCompatCustomActionResultReceiver;
                private static int MediaBrowserCompatItemReceiver;
                private static final byte[] MediaBrowserCompatMediaItem;
                private static short[] MediaBrowserCompatSearchResultReceiver;
                private static final int RatingCompat;
                private static int read;
                private static final byte[] $$c = {122, -64, TarConstants.LF_SYMLINK, -113};
                private static final int $$d = 104;
                private static int $10 = 0;
                private static int $11 = 1;
                private static final byte[] $$a = {14, -40, -35, 110, 26, 12, -1, -43, 44, -2, 3, -15, 19, -36, 17, 17, -15, 2, 7, -3, 17, -21, 13};
                private static final int $$b = 105;

                /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                private static java.lang.String $$e(byte r6, byte r7, short r8) {
                    /*
                        int r6 = r6 + 4
                        byte[] r0 = kotlin.requiresAccount.$$c
                        int r7 = r7 * 2
                        int r1 = r7 + 1
                        int r8 = r8 * 4
                        int r8 = r8 + 112
                        byte[] r1 = new byte[r1]
                        r2 = 0
                        if (r0 != 0) goto L14
                        r3 = r6
                        r4 = r2
                        goto L2c
                    L14:
                        r3 = r2
                        r5 = r8
                        r8 = r6
                        r6 = r5
                    L18:
                        byte r4 = (byte) r6
                        int r8 = r8 + 1
                        r1[r3] = r4
                        int r4 = r3 + 1
                        if (r3 != r7) goto L27
                        java.lang.String r6 = new java.lang.String
                        r6.<init>(r1, r2)
                        return r6
                    L27:
                        r3 = r0[r8]
                        r5 = r3
                        r3 = r8
                        r8 = r5
                    L2c:
                        int r6 = r6 + r8
                        r8 = r3
                        r3 = r4
                        goto L18
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.requiresAccount.$$e(byte, byte, short):java.lang.String");
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                private static void d(byte r6, int r7, byte r8, java.lang.Object[] r9) {
                    /*
                        int r6 = r6 * 2
                        int r6 = r6 + 20
                        int r7 = r7 * 2
                        int r7 = 73 - r7
                        byte[] r0 = kotlin.requiresAccount.$$a
                        int r8 = r8 * 4
                        int r8 = 4 - r8
                        byte[] r1 = new byte[r6]
                        r2 = 0
                        if (r0 != 0) goto L17
                        r3 = r6
                        r7 = r8
                        r5 = r2
                        goto L29
                    L17:
                        r3 = r2
                    L18:
                        byte r4 = (byte) r7
                        int r5 = r3 + 1
                        r1[r3] = r4
                        if (r5 != r6) goto L27
                        java.lang.String r6 = new java.lang.String
                        r6.<init>(r1, r2)
                        r9[r2] = r6
                        return
                    L27:
                        r3 = r0[r8]
                    L29:
                        int r8 = r8 + 1
                        int r7 = r7 + r3
                        r3 = r5
                        goto L18
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.requiresAccount.d(byte, int, byte, java.lang.Object[]):void");
                }

                private static void c(int i5, int[] iArr, Object[] objArr) throws Throwable {
                    int length;
                    int[] iArr2;
                    int length2;
                    int[] iArr3;
                    int i6;
                    int i7 = 2 % 2;
                    buildRemoveAllDownloadsIntent buildremovealldownloadsintent = new buildRemoveAllDownloadsIntent();
                    char[] cArr = new char[4];
                    char[] cArr2 = new char[iArr.length * 2];
                    int[] iArr4 = IconCompatParcelizer;
                    int i8 = -470782045;
                    long j = 0;
                    if (iArr4 != null) {
                        int i9 = $10 + 97;
                        $11 = i9 % 128;
                        if (i9 % 2 == 0) {
                            length2 = iArr4.length;
                            iArr3 = new int[length2];
                            i6 = 1;
                        } else {
                            length2 = iArr4.length;
                            iArr3 = new int[length2];
                            i6 = 0;
                        }
                        while (i6 < length2) {
                            try {
                                Object[] objArr2 = {Integer.valueOf(iArr4[i6])};
                                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(i8);
                                if (objRemoteActionCompatParcelizer == null) {
                                    objRemoteActionCompatParcelizer = startForeground.read((char) ((-16733521) - Color.rgb(0, 0, 0)), (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)) + 23296, TextUtils.getCapsMode("", 0, 0) + 15, -1648776394, false, "A", new Class[]{Integer.TYPE});
                                }
                                iArr3[i6] = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                                i6++;
                                i8 = -470782045;
                                j = 0;
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        }
                        iArr4 = iArr3;
                    }
                    int length3 = iArr4.length;
                    int[] iArr5 = new int[length3];
                    int[] iArr6 = IconCompatParcelizer;
                    int i10 = 43695;
                    if (iArr6 != null) {
                        int i11 = $10 + 73;
                        $11 = i11 % 128;
                        if (i11 % 2 == 0) {
                            length = iArr6.length;
                            iArr2 = new int[length];
                        } else {
                            length = iArr6.length;
                            iArr2 = new int[length];
                        }
                        int i12 = 0;
                        while (i12 < length) {
                            int i13 = $10 + 93;
                            $11 = i13 % 128;
                            int i14 = i13 % 2;
                            Object[] objArr3 = {Integer.valueOf(iArr6[i12])};
                            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-470782045);
                            if (objRemoteActionCompatParcelizer2 == null) {
                                objRemoteActionCompatParcelizer2 = startForeground.read((char) (i10 - Color.red(0)), 23298 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 15 - View.resolveSizeAndState(0, 0, 0), -1648776394, false, "A", new Class[]{Integer.TYPE});
                            }
                            iArr2[i12] = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                            i12++;
                            i10 = 43695;
                        }
                        iArr6 = iArr2;
                    }
                    System.arraycopy(iArr6, 0, iArr5, 0, length3);
                    buildremovealldownloadsintent.RemoteActionCompatParcelizer = 0;
                    int i15 = $10 + 115;
                    $11 = i15 % 128;
                    int i16 = i15 % 2;
                    while (buildremovealldownloadsintent.RemoteActionCompatParcelizer < iArr.length) {
                        int i17 = $10 + 11;
                        $11 = i17 % 128;
                        int i18 = i17 % 2;
                        cArr[0] = (char) (iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer] >> 16);
                        cArr[1] = (char) iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer];
                        cArr[2] = (char) (iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer + 1] >> 16);
                        cArr[3] = (char) iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer + 1];
                        buildremovealldownloadsintent.AudioAttributesCompatParcelizer = (cArr[0] << 16) + cArr[1];
                        buildremovealldownloadsintent.read = (cArr[2] << 16) + cArr[3];
                        buildRemoveAllDownloadsIntent.read(iArr5);
                        for (int i19 = 0; i19 < 16; i19++) {
                            buildremovealldownloadsintent.AudioAttributesCompatParcelizer ^= iArr5[i19];
                            Object[] objArr4 = {buildremovealldownloadsintent, Integer.valueOf(buildRemoveAllDownloadsIntent.read(buildremovealldownloadsintent.AudioAttributesCompatParcelizer)), buildremovealldownloadsintent, buildremovealldownloadsintent};
                            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1112267823);
                            if (objRemoteActionCompatParcelizer3 == null) {
                                objRemoteActionCompatParcelizer3 = startForeground.read((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 43695), 23297 - View.MeasureSpec.makeMeasureSpec(0, 0), (Process.myPid() >> 22) + 15, -1006770364, false, "C", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                            }
                            int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue();
                            buildremovealldownloadsintent.AudioAttributesCompatParcelizer = buildremovealldownloadsintent.read;
                            buildremovealldownloadsintent.read = iIntValue;
                        }
                        int i20 = buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
                        buildremovealldownloadsintent.AudioAttributesCompatParcelizer = buildremovealldownloadsintent.read;
                        buildremovealldownloadsintent.read = i20;
                        buildremovealldownloadsintent.read ^= iArr5[16];
                        buildremovealldownloadsintent.AudioAttributesCompatParcelizer ^= iArr5[17];
                        int i21 = buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
                        int i22 = buildremovealldownloadsintent.read;
                        cArr[0] = (char) (buildremovealldownloadsintent.AudioAttributesCompatParcelizer >>> 16);
                        cArr[1] = (char) buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
                        cArr[2] = (char) (buildremovealldownloadsintent.read >>> 16);
                        cArr[3] = (char) buildremovealldownloadsintent.read;
                        buildRemoveAllDownloadsIntent.read(iArr5);
                        cArr2[buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2] = cArr[0];
                        cArr2[(buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2) + 1] = cArr[1];
                        cArr2[(buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2) + 2] = cArr[2];
                        cArr2[(buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2) + 3] = cArr[3];
                        Object[] objArr5 = {buildremovealldownloadsintent, buildremovealldownloadsintent};
                        Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(516305436);
                        if (objRemoteActionCompatParcelizer4 == null) {
                            objRemoteActionCompatParcelizer4 = startForeground.read((char) ((-16729022) - Color.rgb(0, 0, 0)), Color.alpha(0) + 20126, 21 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 1620047497, false, "I", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
                    }
                    objArr[0] = new String(cArr2, 0, i5);
                }

                private static void b(int i5, byte b, short s, int i6, int i7, Object[] objArr) throws Throwable {
                    long j;
                    boolean z;
                    int i8;
                    buildResumeDownloadsIntent buildresumedownloadsintent = new buildResumeDownloadsIntent();
                    StringBuilder sb = new StringBuilder();
                    try {
                        int i9 = 1;
                        Object[] objArr2 = {Integer.valueOf(i7), Integer.valueOf(AudioAttributesImplApi26Parcelizer)};
                        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(559968424);
                        char c = '0';
                        if (objRemoteActionCompatParcelizer == null) {
                            objRemoteActionCompatParcelizer = startForeground.read((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), 24296 - MotionEvent.axisFromString(""), 12 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 1596568637, false, CmcdHeadersFactory.STREAM_TYPE_LIVE, new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                        int i10 = -1;
                        int i11 = iIntValue == -1 ? 1 : 0;
                        long j2 = 0;
                        if (i11 == 0) {
                            j = 7899112766888837815L;
                        } else {
                            byte[] bArr = MediaBrowserCompatCustomActionResultReceiver;
                            if (bArr != null) {
                                int length = bArr.length;
                                byte[] bArr2 = new byte[length];
                                int i12 = 0;
                                while (i12 < length) {
                                    Object[] objArr3 = new Object[i9];
                                    objArr3[0] = Integer.valueOf(bArr[i12]);
                                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(28234468);
                                    if (objRemoteActionCompatParcelizer2 == null) {
                                        char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                                        int iIndexOf = TextUtils.indexOf("", c, 0, 0) + 3083;
                                        int i13 = 129 - (SystemClock.elapsedRealtime() > j2 ? 1 : (SystemClock.elapsedRealtime() == j2 ? 0 : -1));
                                        byte b2 = (byte) i10;
                                        byte b3 = (byte) (b2 + 1);
                                        objRemoteActionCompatParcelizer2 = startForeground.read(fadingEdgeLength, iIndexOf, i13, 2145850993, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE});
                                    }
                                    bArr2[i12] = ((Byte) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).byteValue();
                                    i12++;
                                    i9 = 1;
                                    i10 = -1;
                                    c = '0';
                                    j2 = 0;
                                }
                                bArr = bArr2;
                            }
                            if (bArr != null) {
                                byte[] bArr3 = MediaBrowserCompatCustomActionResultReceiver;
                                Object[] objArr4 = {Integer.valueOf(i5), Integer.valueOf(AudioAttributesImplApi21Parcelizer)};
                                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(559968424);
                                if (objRemoteActionCompatParcelizer3 == null) {
                                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 24297 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 13 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 1596568637, false, CmcdHeadersFactory.STREAM_TYPE_LIVE, new Class[]{Integer.TYPE, Integer.TYPE});
                                }
                                iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue()]) ^ 7899112766888837815L)) + ((int) (((long) AudioAttributesImplApi26Parcelizer) ^ 7899112766888837815L)));
                                j = 7899112766888837815L;
                            } else {
                                j = 7899112766888837815L;
                                iIntValue = (short) (((short) (((long) MediaBrowserCompatSearchResultReceiver[i5 + ((int) (((long) AudioAttributesImplApi21Parcelizer) ^ 7899112766888837815L))]) ^ 7899112766888837815L)) + ((int) (((long) AudioAttributesImplApi26Parcelizer) ^ 7899112766888837815L)));
                            }
                        }
                        if (iIntValue > 0) {
                            buildresumedownloadsintent.read = ((i5 + iIntValue) - 2) + ((int) (((long) AudioAttributesImplApi21Parcelizer) ^ j)) + i11;
                            Object[] objArr5 = {buildresumedownloadsintent, Integer.valueOf(i6), Integer.valueOf(MediaBrowserCompatItemReceiver), sb};
                            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(107629512);
                            if (objRemoteActionCompatParcelizer4 == null) {
                                objRemoteActionCompatParcelizer4 = startForeground.read((char) (34134 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), 13432 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 22 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 2015596381, false, "t", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                            }
                            ((StringBuilder) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).append(buildresumedownloadsintent.IconCompatParcelizer);
                            buildresumedownloadsintent.RemoteActionCompatParcelizer = buildresumedownloadsintent.IconCompatParcelizer;
                            byte[] bArr4 = MediaBrowserCompatCustomActionResultReceiver;
                            if (bArr4 != null) {
                                int length2 = bArr4.length;
                                byte[] bArr5 = new byte[length2];
                                for (int i14 = 0; i14 < length2; i14++) {
                                    bArr5[i14] = (byte) (((long) bArr4[i14]) ^ 7899112766888837815L);
                                }
                                bArr4 = bArr5;
                            }
                            if (bArr4 != null) {
                                i8 = 1;
                                z = true;
                            } else {
                                z = false;
                                i8 = 1;
                            }
                            while (true) {
                                buildresumedownloadsintent.AudioAttributesCompatParcelizer = i8;
                                if (buildresumedownloadsintent.AudioAttributesCompatParcelizer >= iIntValue) {
                                    break;
                                }
                                if (z) {
                                    byte[] bArr6 = MediaBrowserCompatCustomActionResultReceiver;
                                    buildresumedownloadsintent.read = buildresumedownloadsintent.read - 1;
                                    buildresumedownloadsintent.IconCompatParcelizer = (char) (buildresumedownloadsintent.RemoteActionCompatParcelizer + (((byte) (((byte) (((long) bArr6[r3]) ^ 7899112766888837815L)) + s)) ^ b));
                                } else {
                                    short[] sArr = MediaBrowserCompatSearchResultReceiver;
                                    buildresumedownloadsintent.read = buildresumedownloadsintent.read - 1;
                                    buildresumedownloadsintent.IconCompatParcelizer = (char) (buildresumedownloadsintent.RemoteActionCompatParcelizer + (((short) (((short) (((long) sArr[r3]) ^ 7899112766888837815L)) + s)) ^ b));
                                }
                                sb.append(buildresumedownloadsintent.IconCompatParcelizer);
                                buildresumedownloadsintent.RemoteActionCompatParcelizer = buildresumedownloadsintent.IconCompatParcelizer;
                                i8 = buildresumedownloadsintent.AudioAttributesCompatParcelizer + 1;
                            }
                        }
                        objArr[0] = sb.toString();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }

                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = 2 % 2;
                    int i6 = AudioAttributesImplBaseParcelizer + 5;
                    read = i6 % 128;
                    int i7 = i6 % 2;
                    getShowPopup getshowpopupAudioAttributesCompatParcelizer = requiresGooglePlayServices.AudioAttributesCompatParcelizer(_handleoddname2, i, i2, (_handleUnrecognizedCharacterEscape) obj);
                    int i8 = AudioAttributesImplBaseParcelizer + 81;
                    read = i8 % 128;
                    if (i8 % 2 == 0) {
                        return getshowpopupAudioAttributesCompatParcelizer;
                    }
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }

                /* JADX WARN: Removed duplicated region for block: B:132:0x083c A[Catch: all -> 0x08a9, TryCatch #5 {all -> 0x08a9, blocks: (B:116:0x081a, B:130:0x0835, B:132:0x083c, B:133:0x083d, B:142:0x085d, B:150:0x08a1, B:143:0x0867, B:144:0x087b, B:149:0x0898), top: B:193:0x081a }] */
                /* JADX WARN: Removed duplicated region for block: B:133:0x083d A[Catch: all -> 0x08a9, TryCatch #5 {all -> 0x08a9, blocks: (B:116:0x081a, B:130:0x0835, B:132:0x083c, B:133:0x083d, B:142:0x085d, B:150:0x08a1, B:143:0x0867, B:144:0x087b, B:149:0x0898), top: B:193:0x081a }] */
                /* JADX WARN: Removed duplicated region for block: B:167:0x08eb A[PHI: r23
                  0x08eb: PHI (r23v11 int) = (r23v2 int), (r23v3 int), (r23v5 int), (r23v9 int), (r23v12 int) binds: [B:161:0x08d4, B:157:0x08b7, B:145:0x0887, B:151:0x08a6, B:19:0x0467] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:174:0x08fc  */
                /* JADX WARN: Removed duplicated region for block: B:234:0x090a A[SYNTHETIC] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public static void write(android.content.Context r28, long r29, long r31) throws java.lang.Throwable {
                    /*
                        Method dump skipped, instruction units count: 2398
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.requiresAccount.write(android.content.Context, long, long):void");
                }

                static {
                    byte[] bArr = new byte[530];
                    System.arraycopy(">ç\u0084\u0089ó\nò\u0003\u0006\u00056¸\r\u0004îIØí\u0004î4Ô\u0001\bý\u0002ò\u0003\u0011í\u000bú\u0001\u0002ñ-Ûý\r\u0001õ+Þï\u000bú\u0001#æì%ëü\böú\u0001ó\nò\u0003\u0006\u00056Çõ\u0011ñ\bÿ\u0006ðEëÔ\u0003ýý\r\u0001\u0002ñ\u001aë\u0000\u0002*Ô\u0001ú\u0002\u0003\u0003ù\u001fëü\böú\u0001ó\nò\u0003\u0006\u00056¿üEÛÚ\u0006ÿ\u000fø*×ý\føî\u0003\u0000\r÷ú ìö\r\u0004ý\u0010ëü\b\u0018äý\u0000\u0003ö\u0002ñ'ìé\u000füø\b'Ú\u0003û\u0007\u0011ñùý\fúõûó\nò\u0003\u0006\u00056¸\r\u0004îIãæì4Ï\u0011÷ú\u0006ì6Ô\u000bÿ\u001fÔ\u0003\u0002\u001aß\u0002\tû\u0007\të\u00153Â\u000bó\u00079Ûß\u0002\tû\u0007\u000b\u0005ó\nò\u0003\u0006\u00056Çõ\u0011ñ\bÿ\u0006ðEåÜ\fú\u0002\u001f×ý\u0005\fí\u0002ñ2Ùõ\u0001#ëó\"çñ\u0013ùó\nò\u0003\u0006\u00056·\u000e\u0005ý\u0002ñFéÍ\b\u000fó\n\u0003ÿö\u0007\u0019ãöÿ\u001eí\u0004î\u0002ñ$ïþø\u0006\u0001\u0014áü\nõ\u000bú\u0001(×ý+Õ\u0003ú\u0005\u0003\u0004\u0003õ\të\u00153Â\u000bó\u00079åÛú\u000fþ\u0002ó\u0015õ÷\u0010\u0016éûú\u001eõõ÷\u0010ó\nò\u0003\u0006\u00056Á\b\u0001û\b3íÌ\u0011ûú\u001bâ\u0011þø\u0002ñ'ìé\"ç\u0003÷\b\b\të\u00153Â\u000bó\u00079Úìö\u0003ø\u0016ÿö\u0007\u0002ñ1âì\u0002\u000e\të\u00153Â\u000bó\u00079ßíø\u0005\u0002ï\të\u00153Â\u000bó\u00079âÝ\u0001\u0007û\t\u000b\të\u00153Â\u000bó\u00079¼\rÿú\u0007\u0002ïFíÞ\u0000þò\u0000\n\u0007ö\u0007\u0016íø\u0005\u0002ï\u000eñ3Þ\u0000þò\u0000\n\u0007ö\u0007\të\u00153Â\u000bó\u00079¼\rÿú\u0007\u0002ïFáèñ\fù\u000bûø\u0007\u0004\u0006\u000fâ\të\u00153Â\u000bó\u00079ßíø\u0005\u0002ï9".getBytes(CharsetNames.ISO_8859_1), 0, bArr, 0, 530);
                    MediaBrowserCompatMediaItem = bArr;
                    RatingCompat = 8;
                    AudioAttributesCompatParcelizer();
                    read = 0;
                    AudioAttributesImplBaseParcelizer = 1;
                    IconCompatParcelizer = new int[]{1819299472, 1493110939, 1556399902, -68361265, 59625503, -1212335146, -137727945, 1726242005, 1386461754, 1237213224, 1197476361, 1848314408, -492258913, 1105286898, 483112465, -815035081, -46952014, 751025679};
                }

                static void AudioAttributesCompatParcelizer() {
                    AudioAttributesImplApi21Parcelizer = -1897549217;
                    AudioAttributesImplApi26Parcelizer = -1140791670;
                    MediaBrowserCompatItemReceiver = -1036375913;
                    MediaBrowserCompatCustomActionResultReceiver = new byte[]{-49, -52, -49, -74, -49, -52, -49, -73, -50, -52, -49, 72, -75, -52, -49, -79, -52, -51, 73, -76, -52, -49, 72, -75, -51, 72, -76, -58, 73, -77, -58, -78, -77, -52, -49, -79, -51, -53, -49, -79, -51, -53, -49, -70, -52, -53, -49, -69, -53, -53, -49, -79, -52, -51, -68, -54, -53, -49, -70, -53, -51, -69, -54, -51, -68, -63, -51, -67, -63, -53, -49, -74, -64, -53, -49, -74, -49, -51, -73, -49, -53, -49, -73, -50, -51, -70, -51, -53, 72, -50, -53, -49, -69, -52, -53, 72, -75, -51, -70, -51, -53, -70, -51, -53, 73, -75, -53, -49, -69, -52, -53, -78, -76, -53, -49, -78, -77, -51, 73, -76, -51, -78, -77, -51, -79, -58, -54, -49, 72, -50, -52, -73, -64, -53, -70, -51, -54, -49, -79, -51, -52, -69, -52, -54, -49, -70, -52, -52, -68, -53, -54, -49, -69, -53, -52, -73, -64, -53, -67, -54, -54, -49, -70, -51, -53, -74, -63, -54, -49, -73, -64, -54, -49, -68, -54, -52, -67, -63, -52, -74, -64, -52, -73, -49, -52, 72, -50, -52, 73, -75, -52, 72, -49, -54, -49, -69, -52, -53, -79, -58, -53, 73, -50, -54, -49, -70, -51, -53, -78, -75, -54, -49, -69, -52, -53, -78, -75, -54, -49, -67, -54, -53, -79, -62, -49, -70, -39, -49, -69, -40, -49, -73, -64, -53, -68, -57, -49, -73, -64, -53, -67, -58, -49, 73, -53, -74, -51, -49, -73, -52, -49, -79, -61, -69, -39, 72, -53, -49, -67, -57, -74, -58, -73, -51, 72, -52, 73, -53, 73, -54};
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0028). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                private static void a(short r6, short r7, byte r8, java.lang.Object[] r9) {
                    /*
                        int r6 = r6 + 84
                        int r7 = r7 + 4
                        byte[] r0 = kotlin.requiresAccount.MediaBrowserCompatMediaItem
                        int r1 = r8 + 3
                        byte[] r1 = new byte[r1]
                        int r8 = r8 + 2
                        r2 = 0
                        if (r0 != 0) goto L12
                        r3 = r7
                        r4 = r2
                        goto L28
                    L12:
                        r3 = r2
                    L13:
                        byte r4 = (byte) r6
                        r1[r3] = r4
                        if (r3 != r8) goto L20
                        java.lang.String r6 = new java.lang.String
                        r6.<init>(r1, r2)
                        r9[r2] = r6
                        return
                    L20:
                        int r3 = r3 + 1
                        r4 = r0[r7]
                        r5 = r3
                        r3 = r7
                        r7 = r4
                        r4 = r5
                    L28:
                        int r7 = -r7
                        int r3 = r3 + 1
                        int r6 = r6 + r7
                        r7 = r3
                        r3 = r4
                        goto L13
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.requiresAccount.a(short, short, byte, java.lang.Object[]):void");
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void read(InputAccessor<String> inputAccessor, String str) {
        inputAccessor.write(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(unregisterConnectionCallbacks unregisterconnectioncallbacks, _handleOddName _handleoddname, boolean z, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, int i, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        AudioAttributesCompatParcelizer(unregisterconnectioncallbacks, _handleoddname, z, magicModuleSubmissionRequestBody, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1), i2);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(List list, _handleOddName _handleoddname, boolean z, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, int i, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        IconCompatParcelizer((List<unregisterConnectionCallbacks>) list, _handleoddname, z, (MagicModuleSubmissionRequestBody<? super unregisterConnectionCallbacks, ? super Boolean, getShowPopup>) magicModuleSubmissionRequestBody, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1), i2);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(boolean z, boolean z2, _handleOddName _handleoddname, int i, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        write(z, z2, _handleoddname, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1), i2);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(_handleOddName _handleoddname, int i, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        AudioAttributesCompatParcelizer(_handleoddname, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1), i2);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(String str, _handleOddName _handleoddname, int i, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        RemoteActionCompatParcelizer(str, _handleoddname, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1), i2);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        IconCompatParcelizer(_handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1));
        return getShowPopup.INSTANCE;
    }
}
