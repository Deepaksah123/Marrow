package kotlin;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.designsystem.theme.AppTheme;
import com.marrow.designsystem.theme.MarrowTheme;
import com.marrow.designsystem.theme.ThemeKt;
import com.marrow.designsystem.theme.TypeKt;
import java.util.Locale;
import kotlin._handleOddName;
import org.apache.commons.compress.archivers.cpio.CpioConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class getSignInClient {
    public static final void IconCompatParcelizer(_handleOddName _handleoddname, final boolean z, final String str, final String str2, final String str3, final String str4, final String str5, final getCreatedOnDateMs<getShowPopup> getcreatedondatems, final getCreatedOnDateMs<getShowPopup> getcreatedondatems2, final getCreatedOnDateMs<getShowPopup> getcreatedondatems3, final getCreatedOnDateMs<getShowPopup> getcreatedondatems4, boolean z2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2;
        final _handleOddName _handleoddname2;
        final boolean z3;
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        toMagicModuleMetaRepoModel.write(str5, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems2, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems3, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems4, "");
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(-1416668543);
        int i6 = i3 & 1;
        if (i6 != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = i | (_handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(_handleoddname) ? 4 : 2);
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(z) ? 32 : 16;
        }
        if ((i & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(str2) ? 2048 : 1024;
        }
        if ((i & CpioConstants.C_ISBLK) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(str3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(str4) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((1572864 & i) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(str5) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems2) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems3) ? 536870912 : 268435456;
        }
        int i7 = i4;
        if ((i2 & 6) == 0) {
            i5 = i2 | (_handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems4) ? 4 : 2);
        } else {
            i5 = i2;
        }
        int i8 = i3 & 2048;
        if (i8 != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(z2) ? 32 : 16;
        }
        int i9 = i5;
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(((i7 & 306783379) == 306783378 && (i9 & 19) == 18) ? false : true, i7 & 1)) {
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            _handleunrecognizedcharacterescape2.onPrepareFromSearch();
            _handleoddname2 = _handleoddname;
            z3 = z2;
        } else {
            _handleOddName _handleoddname3 = i6 != 0 ? _handleOddName.INSTANCE : _handleoddname;
            boolean z4 = i8 != 0 ? true : z2;
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1416668543, i7, i9, "com.marrow2.ui.custom_module.play.UI.ExitConfirmationBottomSheet (ExitConfirmationBottomSheet.kt:36)");
            }
            getPattern getpattern = z ? getPattern.RemoteActionCompatParcelizer : getPattern.AudioAttributesCompatParcelizer;
            int i10 = i7 & 112;
            boolean z5 = i10 == 32;
            Object objOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if (z5 || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new getAnswerMap() { // from class: o.getScopes
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(getSignInClient.read(z, (getPattern) obj));
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause);
            }
            _equal _equalVarAudioAttributesCompatParcelizer = mode.AudioAttributesCompatParcelizer(getpattern, null, (getAnswerMap) objOnPause, true, _handleunrecognizedcharacterescapeWrite, 3072, 2);
            boolean z6 = i10 == 32;
            boolean zIconCompatParcelizer = _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(_equalVarAudioAttributesCompatParcelizer);
            IconCompatParcelizer iconCompatParcelizerOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if ((z6 | zIconCompatParcelizer) || iconCompatParcelizerOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                iconCompatParcelizerOnPause = new IconCompatParcelizer(z, _equalVarAudioAttributesCompatParcelizer, null);
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(iconCompatParcelizerOnPause);
            }
            StreamReadException.IconCompatParcelizer(Boolean.valueOf(z), (MagicModuleSubmissionRequestBody) iconCompatParcelizerOnPause, _handleunrecognizedcharacterescapeWrite, (i7 >> 3) & 14);
            getPattern getpatternRemoteActionCompatParcelizer = _equalVarAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
            boolean zIconCompatParcelizer2 = _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(_equalVarAudioAttributesCompatParcelizer);
            boolean z7 = (1879048192 & i7) == 536870912;
            RemoteActionCompatParcelizer remoteActionCompatParcelizerOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if ((z7 | zIconCompatParcelizer2) || remoteActionCompatParcelizerOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                remoteActionCompatParcelizerOnPause = new RemoteActionCompatParcelizer(_equalVarAudioAttributesCompatParcelizer, getcreatedondatems3, null);
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(remoteActionCompatParcelizerOnPause);
            }
            StreamReadException.IconCompatParcelizer(getpatternRemoteActionCompatParcelizer, (MagicModuleSubmissionRequestBody) remoteActionCompatParcelizerOnPause, _handleunrecognizedcharacterescapeWrite, 0);
            long jAudioAttributesCompatParcelizer$default = switchToNext.AudioAttributesCompatParcelizer$default(switchToNext.INSTANCE.AudioAttributesCompatParcelizer(), 0.5f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
            setShowFastForwardButton setshowfastforwardbuttonAudioAttributesCompatParcelizer$default = setPlayer.AudioAttributesCompatParcelizer$default(assignParameter.IconCompatParcelizer(4.0f), assignParameter.IconCompatParcelizer(4.0f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 12, null);
            float fIconCompatParcelizer = assignParameter.IconCompatParcelizer(8.0f);
            final _handleOddName _handleoddname4 = _handleoddname3;
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            final boolean z8 = z4;
            FastIntegerMathUInt128 fastIntegerMathUInt128AudioAttributesCompatParcelizer = multiplyFft.AudioAttributesCompatParcelizer(496476463, true, new getModuleData() { // from class: o.setScopes
                @Override // kotlin.getModuleData
                public final Object AudioAttributesCompatParcelizer(Object obj, Object obj2, Object obj3) {
                    return getSignInClient.AudioAttributesCompatParcelizer(_handleoddname4, str, str2, getcreatedondatems, str4, getcreatedondatems2, z8, str3, str5, getcreatedondatems4, (DrawerLayoutLayoutParams) obj, (_handleUnrecognizedCharacterEscape) obj2, ((Integer) obj3).intValue());
                }
            }, _handleunrecognizedcharacterescape2, 54);
            setShowFastForwardButton setshowfastforwardbutton = setshowfastforwardbuttonAudioAttributesCompatParcelizer$default;
            saveAccountLinkingToken saveaccountlinkingtoken = saveAccountLinkingToken.AudioAttributesCompatParcelizer;
            mode.IconCompatParcelizer(fastIntegerMathUInt128AudioAttributesCompatParcelizer, _handleoddname3, _equalVarAudioAttributesCompatParcelizer, false, setshowfastforwardbutton, fIconCompatParcelizer, 0L, 0L, jAudioAttributesCompatParcelizer$default, saveAccountLinkingToken.read(), _handleunrecognizedcharacterescape2, ((i7 << 3) & 112) | 906166278 | (_equal.IconCompatParcelizer << 6), 200);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
            z3 = z4;
            _handleoddname2 = _handleoddname3;
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescape2.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.setConsentPendingIntent
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return getSignInClient.RemoteActionCompatParcelizer(_handleoddname2, z, str, str2, str3, str4, str5, getcreatedondatems, getcreatedondatems2, getcreatedondatems3, getcreatedondatems4, z3, i, i2, i3, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean read(boolean z, getPattern getpattern) {
        toMagicModuleMetaRepoModel.write(getpattern, "");
        return (getpattern == getPattern.AudioAttributesCompatParcelizer && z) ? false : true;
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ _equal AudioAttributesCompatParcelizer;
        private int read;
        private /* synthetic */ boolean write;

        /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
        
            if (r4.AudioAttributesCompatParcelizer.read(r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
        
            if (r4.AudioAttributesCompatParcelizer.IconCompatParcelizer(r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x003d, code lost:
        
            return r0;
         */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                int r1 = r4.read
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1b
                if (r1 == r3) goto L17
                if (r1 != r2) goto Lf
                goto L17
            Lf:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L17:
                kotlin.SdkPayloadData.IconCompatParcelizer(r5)
                goto L3e
            L1b:
                kotlin.SdkPayloadData.IconCompatParcelizer(r5)
                boolean r5 = r4.write
                if (r5 == 0) goto L30
                o._equal r5 = r4.AudioAttributesCompatParcelizer
                r1 = r4
                o.SampleVideos r1 = (kotlin.SampleVideos) r1
                r4.read = r3
                java.lang.Object r4 = r5.read(r1)
                if (r4 != r0) goto L3e
                goto L3d
            L30:
                o._equal r5 = r4.AudioAttributesCompatParcelizer
                r1 = r4
                o.SampleVideos r1 = (kotlin.SampleVideos) r1
                r4.read = r2
                java.lang.Object r4 = r5.IconCompatParcelizer(r1)
                if (r4 != r0) goto L3e
            L3d:
                return r0
            L3e:
                o.getShowPopup r4 = kotlin.getShowPopup.INSTANCE
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: o.getSignInClient.IconCompatParcelizer.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(boolean z, _equal _equalVar, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.write = z;
            this.AudioAttributesCompatParcelizer = _equalVar;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new IconCompatParcelizer(this.write, this.AudioAttributesCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;
        private /* synthetic */ _equal read;
        private /* synthetic */ getCreatedOnDateMs<getShowPopup> write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            if (this.read.RemoteActionCompatParcelizer() == getPattern.AudioAttributesCompatParcelizer) {
                this.write.invoke();
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        RemoteActionCompatParcelizer(_equal _equalVar, getCreatedOnDateMs<getShowPopup> getcreatedondatems, SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.read = _equalVar;
            this.write = getcreatedondatems;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new RemoteActionCompatParcelizer(this.read, this.write, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(final _handleOddName _handleoddname, final String str, final String str2, final getCreatedOnDateMs getcreatedondatems, final String str3, final getCreatedOnDateMs getcreatedondatems2, final boolean z, final String str4, final String str5, final getCreatedOnDateMs getcreatedondatems3, DrawerLayoutLayoutParams drawerLayoutLayoutParams, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        toMagicModuleMetaRepoModel.write(drawerLayoutLayoutParams, "");
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 17) != 16, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(496476463, i, -1, "com.marrow2.ui.custom_module.play.UI.ExitConfirmationBottomSheet.<anonymous> (ExitConfirmationBottomSheet.kt:63)");
            }
            ThemeKt.read((AppTheme) null, false, (MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup>) multiplyFft.AudioAttributesCompatParcelizer(1278139311, true, new MagicModuleSubmissionRequestBody() { // from class: o.getSignInPassword
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return getSignInClient.read(_handleoddname, str, str2, getcreatedondatems, str3, getcreatedondatems2, z, str4, str5, getcreatedondatems3, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            }, _handleunrecognizedcharacterescape, 54), _handleunrecognizedcharacterescape, RendererCapabilities.MODE_SUPPORT_MASK, 3);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(final _handleOddName _handleoddname, final String str, final String str2, final getCreatedOnDateMs getcreatedondatems, final String str3, final getCreatedOnDateMs getcreatedondatems2, final boolean z, final String str4, final String str5, final getCreatedOnDateMs getcreatedondatems3, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1278139311, i, -1, "com.marrow2.ui.custom_module.play.UI.ExitConfirmationBottomSheet.<anonymous>.<anonymous> (ExitConfirmationBottomSheet.kt:64)");
            }
            Nulls.AudioAttributesCompatParcelizer(null, null, switchToNext.INSTANCE.AudioAttributesImplBaseParcelizer(), 0L, null, BitmapDescriptorFactory.HUE_RED, multiplyFft.AudioAttributesCompatParcelizer(-1648272141, true, new MagicModuleSubmissionRequestBody() { // from class: o.getTokenType
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return getSignInClient.AudioAttributesCompatParcelizer(_handleoddname, str, str2, getcreatedondatems, str3, getcreatedondatems2, z, str4, str5, getcreatedondatems3, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            }, _handleunrecognizedcharacterescape, 54), _handleunrecognizedcharacterescape, 1573248, 59);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(_handleOddName _handleoddname, String str, String str2, getCreatedOnDateMs getcreatedondatems, final String str3, getCreatedOnDateMs getcreatedondatems2, final boolean z, final String str4, final String str5, getCreatedOnDateMs getcreatedondatems3, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        _handleOddName.Companion companion;
        int i2;
        int i3;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2;
        int i4;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape3 = _handleunrecognizedcharacterescape;
        if (!_handleunrecognizedcharacterescape3.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1648272141, i, -1, "com.marrow2.ui.custom_module.play.UI.ExitConfirmationBottomSheet.<anonymous>.<anonymous>.<anonymous> (ExitConfirmationBottomSheet.kt:65)");
            }
            _handleOddName _handleoddnameRemoteActionCompatParcelizer$default = isAdded.RemoteActionCompatParcelizer$default(_handleoddname, BitmapDescriptorFactory.HUE_RED, 1, null);
            if (VideoRendererEventListenerEventDispatcherExternalSyntheticLambda8.read((Configuration) _handleunrecognizedcharacterescape3.write(AndroidCompositionLocals_androidKt.read()))) {
                companion = onInflate.read(_handleOddName.INSTANCE);
            } else {
                companion = _handleOddName.INSTANCE;
            }
            _handleOddName _handleoddnameIconCompatParcelizer$default = getFrameEndSchedulerui.IconCompatParcelizer$default(_handleoddnameRemoteActionCompatParcelizer$default.AudioAttributesCompatParcelizer(companion), enabled.INSTANCE.write(_handleunrecognizedcharacterescape3, enabled.RemoteActionCompatParcelizer).MediaBrowserCompatSearchResultReceiver(), null, 2, null);
            withTypeHandler withtypehandler = setValue.read(WindowInsetsCompatImpl30.INSTANCE.MediaBrowserCompatCustomActionResultReceiver(), _skipWSOrEnd.INSTANCE.AudioAttributesImplApi21Parcelizer(), _handleunrecognizedcharacterescape3, 48);
            int iHashCode = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape3, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescape.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape3, _handleoddnameIconCompatParcelizer$default);
            getCreatedOnDateMs<getDependencies> getcreatedondatemsIconCompatParcelizer = getDependencies.INSTANCE.IconCompatParcelizer();
            if (!(_handleunrecognizedcharacterescape.MediaMetadataCompat() instanceof _closeInput)) {
                _getBigDecimal.write();
            }
            _handleunrecognizedcharacterescape.onPrepareFromMediaId();
            if (_handleunrecognizedcharacterescape.getParcelableVolumeInfo()) {
                _handleunrecognizedcharacterescape3.read(getcreatedondatemsIconCompatParcelizer);
            } else {
                _handleunrecognizedcharacterescape.onPlayFromUri();
            }
            _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape4 = NumberOutput.read(_handleunrecognizedcharacterescape);
            NumberOutput.write(_handleunrecognizedcharacterescape4, withtypehandler, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape4, _getchardescHandleMediaPlayPauseIfPendingOnHandler, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape4, Integer.valueOf(iHashCode), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape4, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape4, _handleoddnameRemoteActionCompatParcelizer, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            DrawerLayoutSavedState drawerLayoutSavedState = DrawerLayoutSavedState.INSTANCE;
            if (str.length() > 0) {
                _handleunrecognizedcharacterescape3.IconCompatParcelizer(1203676603);
                _copyCurrentStringValue.IconCompatParcelizer(str, getParentFragment.write(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(28.0f), assignParameter.IconCompatParcelizer(28.0f)), enabled.INSTANCE.write(_handleunrecognizedcharacterescape3, enabled.RemoteActionCompatParcelizer).MediaBrowserCompatItemReceiver(), 0L, null, null, null, 0L, null, assignIndexes.write(assignIndexes.INSTANCE.write()), 0L, 0, false, 0, 0, null, enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescape3, enabled.RemoteActionCompatParcelizer).getRemoteActionCompatParcelizer(), _handleunrecognizedcharacterescape, 48, 0, 65016);
                _handleunrecognizedcharacterescape3 = _handleunrecognizedcharacterescape;
                i2 = 1200577657;
            } else {
                i2 = 1200577657;
                _handleunrecognizedcharacterescape3.IconCompatParcelizer(1200577657);
            }
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            if (str2.length() <= 0) {
                i3 = i2;
                _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescape3;
                _handleunrecognizedcharacterescape2.IconCompatParcelizer(i3);
            } else {
                _handleunrecognizedcharacterescape3.IconCompatParcelizer(1204134287);
                isInLayout.RemoteActionCompatParcelizer(isAdded.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(8.0f)), _handleunrecognizedcharacterescape3, 6);
                deserializeWithObjectId deserializewithobjectidAudioAttributesCompatParcelizer = TypeKt.AudioAttributesCompatParcelizer(enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescape3, enabled.RemoteActionCompatParcelizer));
                MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
                _copyCurrentStringValue.IconCompatParcelizer(str2, null, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape3, MarrowTheme.RemoteActionCompatParcelizer).getOnSetPlaybackSpeed(), 0L, null, null, null, 0L, null, assignIndexes.write(assignIndexes.INSTANCE.write()), 0L, 0, false, 0, 0, null, deserializewithobjectidAudioAttributesCompatParcelizer, _handleunrecognizedcharacterescape, 0, 0, 65018);
                _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescape;
                i3 = 1200577657;
            }
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            isInLayout.RemoteActionCompatParcelizer(isAdded.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(20.0f)), _handleunrecognizedcharacterescape2, 6);
            int i5 = i3;
            CloseImageView.AudioAttributesCompatParcelizer(getcreatedondatems, getParentFragment.write$default(isAdded.RemoteActionCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null), assignParameter.IconCompatParcelizer(28.0f), BitmapDescriptorFactory.HUE_RED, 2, null), false, null, null, null, null, null, getParentFragment.write(assignParameter.IconCompatParcelizer(24.0f), assignParameter.IconCompatParcelizer(12.0f)), multiplyFft.AudioAttributesCompatParcelizer(2030429657, true, new getModuleData() { // from class: o.getConsentPendingIntent
                @Override // kotlin.getModuleData
                public final Object AudioAttributesCompatParcelizer(Object obj, Object obj2, Object obj3) {
                    return getSignInClient.IconCompatParcelizer(z, str4, (getViewLifecycleOwnerLiveData) obj, (_handleUnrecognizedCharacterEscape) obj2, ((Integer) obj3).intValue());
                }
            }, _handleunrecognizedcharacterescape2, 54), _handleunrecognizedcharacterescape, 805306416, 252);
            if (str3.length() <= 0) {
                i4 = 54;
                _handleunrecognizedcharacterescape2.IconCompatParcelizer(i5);
            } else {
                _handleunrecognizedcharacterescape2.IconCompatParcelizer(1205409596);
                i4 = 54;
                CloseImageView.RemoteActionCompatParcelizer(getcreatedondatems2, null, false, null, null, null, null, null, null, multiplyFft.AudioAttributesCompatParcelizer(-1017876807, true, new getModuleData() { // from class: o.getServiceId
                    @Override // kotlin.getModuleData
                    public final Object AudioAttributesCompatParcelizer(Object obj, Object obj2, Object obj3) {
                        return getSignInClient.IconCompatParcelizer(str3, (getViewLifecycleOwnerLiveData) obj, (_handleUnrecognizedCharacterEscape) obj2, ((Integer) obj3).intValue());
                    }
                }, _handleunrecognizedcharacterescape2, 54), _handleunrecognizedcharacterescape, C.ENCODING_PCM_32BIT, 510);
            }
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            _handleOddName _handleoddnameWrite = getParentFragment.write(getFrameEndSchedulerui.IconCompatParcelizer$default(isAdded.RemoteActionCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null), enabled.INSTANCE.write(_handleunrecognizedcharacterescape2, enabled.RemoteActionCompatParcelizer).read(), null, 2, null), assignParameter.IconCompatParcelizer(28.0f), assignParameter.IconCompatParcelizer(12.0f));
            withTypeHandler withtypehandlerWrite = AbsSavedState1.write(_skipWSOrEnd.INSTANCE.MediaBrowserCompatSearchResultReceiver(), false);
            int iHashCode2 = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler2 = _handleunrecognizedcharacterescape.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer2 = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2, _handleoddnameWrite);
            getCreatedOnDateMs<getDependencies> getcreatedondatemsIconCompatParcelizer2 = getDependencies.INSTANCE.IconCompatParcelizer();
            if (!(_handleunrecognizedcharacterescape.MediaMetadataCompat() instanceof _closeInput)) {
                _getBigDecimal.write();
            }
            _handleunrecognizedcharacterescape.onPrepareFromMediaId();
            if (_handleunrecognizedcharacterescape.getParcelableVolumeInfo()) {
                _handleunrecognizedcharacterescape2.read(getcreatedondatemsIconCompatParcelizer2);
            } else {
                _handleunrecognizedcharacterescape.onPlayFromUri();
            }
            _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape5 = NumberOutput.read(_handleunrecognizedcharacterescape);
            NumberOutput.write(_handleunrecognizedcharacterescape5, withtypehandlerWrite, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape5, _getchardescHandleMediaPlayPauseIfPendingOnHandler2, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape5, Integer.valueOf(iHashCode2), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape5, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape5, _handleoddnameRemoteActionCompatParcelizer2, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            setDrawerElevation setdrawerelevation = setDrawerElevation.INSTANCE;
            if (str5.length() > 0) {
                _handleunrecognizedcharacterescape2.IconCompatParcelizer(720916837);
                CloseImageView.AudioAttributesCompatParcelizer(getcreatedondatems3, isAdded.RemoteActionCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null), false, null, null, null, null, CleverTapInstanceConfig.write.AudioAttributesCompatParcelizer(enabled.INSTANCE.write(_handleunrecognizedcharacterescape2, enabled.RemoteActionCompatParcelizer).AudioAttributesImplApi21Parcelizer(), 0L, 0L, 0L, _handleunrecognizedcharacterescape, CleverTapInstanceConfig.IconCompatParcelizer << 12, 14), null, multiplyFft.AudioAttributesCompatParcelizer(-1361251014, true, new getModuleData() { // from class: o.SaveAccountLinkingTokenRequestBuilder
                    @Override // kotlin.getModuleData
                    public final Object AudioAttributesCompatParcelizer(Object obj, Object obj2, Object obj3) {
                        return getSignInClient.AudioAttributesCompatParcelizer(str5, (getViewLifecycleOwnerLiveData) obj, (_handleUnrecognizedCharacterEscape) obj2, ((Integer) obj3).intValue());
                    }
                }, _handleunrecognizedcharacterescape2, i4), _handleunrecognizedcharacterescape, 805306416, 380);
            } else {
                _handleunrecognizedcharacterescape2.IconCompatParcelizer(715265971);
            }
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            _handleunrecognizedcharacterescape.AudioAttributesImplBaseParcelizer();
            _handleunrecognizedcharacterescape.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(boolean z, String str, getViewLifecycleOwnerLiveData getviewlifecycleownerlivedata, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        String str2;
        toMagicModuleMetaRepoModel.write(getviewlifecycleownerlivedata, "");
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 17) != 16, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(2030429657, i, -1, "com.marrow2.ui.custom_module.play.UI.ExitConfirmationBottomSheet.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ExitConfirmationBottomSheet.kt:107)");
            }
            if (z) {
                String upperCase = str.toUpperCase(Locale.ROOT);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(upperCase, "");
                str2 = upperCase;
            } else {
                str2 = str;
            }
            _copyCurrentStringValue.IconCompatParcelizer(str2, null, enabled.INSTANCE.write(_handleunrecognizedcharacterescape, enabled.RemoteActionCompatParcelizer).AudioAttributesCompatParcelizer(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TypeKt.IconCompatParcelizer(enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescape, enabled.RemoteActionCompatParcelizer)), _handleunrecognizedcharacterescape, 0, 0, 65530);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(String str, getViewLifecycleOwnerLiveData getviewlifecycleownerlivedata, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        toMagicModuleMetaRepoModel.write(getviewlifecycleownerlivedata, "");
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 17) != 16, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1017876807, i, -1, "com.marrow2.ui.custom_module.play.UI.ExitConfirmationBottomSheet.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ExitConfirmationBottomSheet.kt:116)");
            }
            MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
            _copyCurrentStringValue.IconCompatParcelizer(str, null, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, MarrowTheme.RemoteActionCompatParcelizer).getR8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TypeKt.RemoteActionCompatParcelizer(enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescape, enabled.RemoteActionCompatParcelizer)), _handleunrecognizedcharacterescape, 0, 0, 65530);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(String str, getViewLifecycleOwnerLiveData getviewlifecycleownerlivedata, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        toMagicModuleMetaRepoModel.write(getviewlifecycleownerlivedata, "");
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 17) != 16, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1361251014, i, -1, "com.marrow2.ui.custom_module.play.UI.ExitConfirmationBottomSheet.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ExitConfirmationBottomSheet.kt:138)");
            }
            MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
            _copyCurrentStringValue.IconCompatParcelizer(str, null, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, MarrowTheme.RemoteActionCompatParcelizer).getRemoteActionCompatParcelizer(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TypeKt.IconCompatParcelizer(enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescape, enabled.RemoteActionCompatParcelizer)), _handleunrecognizedcharacterescape, 0, 0, 65530);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(_handleOddName _handleoddname, boolean z, String str, String str2, String str3, String str4, String str5, getCreatedOnDateMs getcreatedondatems, getCreatedOnDateMs getcreatedondatems2, getCreatedOnDateMs getcreatedondatems3, getCreatedOnDateMs getcreatedondatems4, boolean z2, int i, int i2, int i3, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        IconCompatParcelizer(_handleoddname, z, str, str2, str3, str4, str5, (getCreatedOnDateMs<getShowPopup>) getcreatedondatems, (getCreatedOnDateMs<getShowPopup>) getcreatedondatems2, (getCreatedOnDateMs<getShowPopup>) getcreatedondatems3, (getCreatedOnDateMs<getShowPopup>) getcreatedondatems4, z2, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1), _appendEscaped.RemoteActionCompatParcelizer(i2), i3);
        return getShowPopup.INSTANCE;
    }
}
