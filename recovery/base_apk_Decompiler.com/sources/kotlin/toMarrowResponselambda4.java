package kotlin;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.designsystem.theme.MarrowTheme;
import com.marrow.designsystem.theme.TypeKt;
import java.util.List;
import kotlin._handleOddName;
import kotlin._skipWSOrEnd;
import org.apache.commons.compress.archivers.cpio.CpioConstants;

/* JADX INFO: loaded from: classes4.dex */
public final class toMarrowResponselambda4 {
    public static final void AudioAttributesCompatParcelizer(_handleOddName _handleoddname, final getFirstInstallDbVersion getfirstinstalldbversion, final int i, final int i2, final boolean z, final getCreatedOnDateMs<getShowPopup> getcreatedondatems, final MagicModuleSubmissionRequestBody<? super String, ? super getLastDbVersion, getShowPopup> magicModuleSubmissionRequestBody, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i3, final int i4) {
        _handleOddName _handleoddname2;
        int i5;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2;
        SlowMotionData slowMotionData;
        Boolean bool;
        int i6;
        int i7;
        int i8;
        _handleOddName _handleoddname3;
        int i9;
        int i10;
        int i11;
        toMagicModuleMetaRepoModel.write(getfirstinstalldbversion, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        toMagicModuleMetaRepoModel.write(magicModuleSubmissionRequestBody, "");
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(-96190883);
        int i12 = i4 & 1;
        if (i12 != 0) {
            i5 = i3 | 6;
            _handleoddname2 = _handleoddname;
        } else if ((i3 & 6) == 0) {
            _handleoddname2 = _handleoddname;
            i5 = (_handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(_handleoddname2) ? 4 : 2) | i3;
        } else {
            _handleoddname2 = _handleoddname;
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(getfirstinstalldbversion) ? 32 : 16;
        }
        if ((i3 & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i5 |= _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(i) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(i2) ? 2048 : 1024;
        }
        if ((i3 & CpioConstants.C_ISBLK) == 0) {
            i5 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(z) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i5 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((1572864 & i3) == 0) {
            i5 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(magicModuleSubmissionRequestBody) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        int i13 = i5;
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((599187 & i13) != 599186, i13 & 1)) {
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            _handleunrecognizedcharacterescape2.onPrepareFromSearch();
        } else {
            _handleOddName _handleoddname4 = i12 != 0 ? _handleOddName.INSTANCE : _handleoddname2;
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-96190883, i13, -1, "com.marrow2.ui.video.revision_video.listing.RevisionSubjectCard (RevisionSubjectCard.kt:59)");
            }
            Object objOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if (objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = UrlLinkFrame.RemoteActionCompatParcelizer();
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause);
            }
            SlowMotionData slowMotionData2 = (SlowMotionData) objOnPause;
            Object objOnPause2 = _handleunrecognizedcharacterescapeWrite.onPause();
            if (objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause2 = StreamReadException.RemoteActionCompatParcelizer(VideoSessionResponseBody.RemoteActionCompatParcelizer, _handleunrecognizedcharacterescapeWrite);
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause2);
            }
            TopUserCompanion topUserCompanion = (TopUserCompanion) objOnPause2;
            Boolean audioAttributesCompatParcelizer = getfirstinstalldbversion.getAudioAttributesCompatParcelizer();
            int i14 = i13 & 112;
            boolean z2 = i14 == 32;
            boolean zIconCompatParcelizer = _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(topUserCompanion);
            boolean z3 = (i13 & 896) == 256;
            boolean z4 = (i13 & 7168) == 2048;
            boolean zIconCompatParcelizer2 = _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(slowMotionData2);
            read readVarOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if (((z3 | z2 | zIconCompatParcelizer | z4) || zIconCompatParcelizer2) || readVarOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                slowMotionData = slowMotionData2;
                bool = audioAttributesCompatParcelizer;
                i6 = i13;
                i7 = i14;
                i8 = 0;
                _handleoddname3 = _handleoddname4;
                readVarOnPause = new read(getfirstinstalldbversion, topUserCompanion, i, i2, slowMotionData, null);
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(readVarOnPause);
            } else {
                i7 = i14;
                slowMotionData = slowMotionData2;
                _handleoddname3 = _handleoddname4;
                bool = audioAttributesCompatParcelizer;
                i8 = 0;
                i6 = i13;
            }
            StreamReadException.IconCompatParcelizer(bool, (MagicModuleSubmissionRequestBody) readVarOnPause, _handleunrecognizedcharacterescapeWrite, i8);
            _handleoddname2 = _handleoddname3;
            _handleOddName _handleoddnameWrite = getParentFragment.write(UrlLinkFrame.write(VideoRendererEventListenerEventDispatcherExternalSyntheticLambda5.AudioAttributesCompatParcelizer(isAdded.RemoteActionCompatParcelizer$default(_handleoddname2, BitmapDescriptorFactory.HUE_RED, 1, null), null, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 15), slowMotionData), assignParameter.IconCompatParcelizer(16.0f), assignParameter.IconCompatParcelizer(16.0f));
            withTypeHandler withtypehandler = setValue.read(WindowInsetsCompatImpl30.INSTANCE.MediaBrowserCompatCustomActionResultReceiver(), _skipWSOrEnd.INSTANCE.RatingCompat(), _handleunrecognizedcharacterescapeWrite, i8);
            int iHashCode = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, i8));
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
            NumberOutput.write(_handleunrecognizedcharacterescape3, withtypehandler, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape3, _getchardescHandleMediaPlayPauseIfPendingOnHandler, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape3, Integer.valueOf(iHashCode), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape3, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape3, _handleoddnameRemoteActionCompatParcelizer, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            DrawerLayoutSavedState drawerLayoutSavedState = DrawerLayoutSavedState.INSTANCE;
            int i15 = (i6 & 458752) == 131072 ? 1 : i8;
            Object objOnPause3 = _handleunrecognizedcharacterescapeWrite.onPause();
            if (i15 != 0 || objOnPause3 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause3 = new getCreatedOnDateMs() { // from class: o.ResponseExtensionsKtExternalSyntheticLambda1
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return toMarrowResponselambda4.RemoteActionCompatParcelizer(getcreatedondatems);
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause3);
            }
            RemoteActionCompatParcelizer(getfirstinstalldbversion, (getCreatedOnDateMs<getShowPopup>) objOnPause3, _handleunrecognizedcharacterescapeWrite, (i6 >> 3) & 14);
            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getfirstinstalldbversion.getAudioAttributesCompatParcelizer(), Boolean.TRUE) || !getfirstinstalldbversion.RemoteActionCompatParcelizer()) {
                _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
                _handleunrecognizedcharacterescape2.IconCompatParcelizer(-1534298641);
            } else {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(-1530825711);
                isInLayout.RemoteActionCompatParcelizer(isAdded.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(16.0f)), _handleunrecognizedcharacterescapeWrite, 6);
                List<getLastDbVersion> listAudioAttributesImplApi21Parcelizer = getfirstinstalldbversion.AudioAttributesImplApi21Parcelizer();
                if ((i6 & 3670016) == 1048576) {
                    i10 = i7;
                    i11 = 32;
                    i9 = 1;
                } else {
                    i9 = i8;
                    i10 = i7;
                    i11 = 32;
                }
                int i16 = i10 == i11 ? 1 : i8;
                Object objOnPause4 = _handleunrecognizedcharacterescapeWrite.onPause();
                if ((i9 | i16) != 0 || objOnPause4 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                    objOnPause4 = new getAnswerMap() { // from class: o.toMarrowResponselambda6
                        @Override // kotlin.getAnswerMap
                        public final Object invoke(Object obj) {
                            return toMarrowResponselambda4.RemoteActionCompatParcelizer(magicModuleSubmissionRequestBody, getfirstinstalldbversion, (getLastDbVersion) obj);
                        }
                    };
                    _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause4);
                }
                _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
                write(null, listAudioAttributesImplApi21Parcelizer, z, (getAnswerMap) objOnPause4, _handleunrecognizedcharacterescapeWrite, (i6 >> 6) & 896, 1);
            }
            _handleunrecognizedcharacterescape2.MediaBrowserCompatCustomActionResultReceiver();
            _handleunrecognizedcharacterescape2.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        final _handleOddName _handleoddname5 = _handleoddname2;
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescape2.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.ResponseExtensionsKtExternalSyntheticLambda13
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return toMarrowResponselambda4.write(_handleoddname5, getfirstinstalldbversion, i, i2, z, getcreatedondatems, magicModuleSubmissionRequestBody, i3, i4, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ TopUserCompanion AudioAttributesCompatParcelizer;
        private /* synthetic */ getFirstInstallDbVersion IconCompatParcelizer;
        private int MediaBrowserCompatCustomActionResultReceiver;
        private /* synthetic */ SlowMotionData RemoteActionCompatParcelizer;
        private /* synthetic */ int read;
        private /* synthetic */ int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer.getAudioAttributesCompatParcelizer(), QBankStatsResponse.AudioAttributesCompatParcelizer(true))) {
                C0201setMcqCount.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, null, null, new AnonymousClass3(this.read, this.write, this.RemoteActionCompatParcelizer, null), 3);
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX INFO: renamed from: o.toMarrowResponselambda4$read$3, reason: invalid class name */
        static final class AnonymousClass3 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
            private /* synthetic */ int AudioAttributesCompatParcelizer;
            private /* synthetic */ SlowMotionData RemoteActionCompatParcelizer;
            private int read;
            private /* synthetic */ int write;

            /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
            
                if (kotlin.SlowMotionData.AudioAttributesCompatParcelizer$default(r6.RemoteActionCompatParcelizer, null, r6, 1, null) != r0) goto L17;
             */
            @Override // kotlin.getMonthName
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                /*
                    r6 = this;
                    java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                    int r1 = r6.read
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L1e
                    if (r1 == r3) goto L1a
                    if (r1 != r2) goto L12
                    kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                    goto L44
                L12:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L1a:
                    kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                    goto L35
                L1e:
                    kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                    int r7 = r6.write
                    int r1 = r6.AudioAttributesCompatParcelizer
                    int r1 = r1 - r3
                    if (r7 != r1) goto L44
                    r7 = r6
                    o.SampleVideos r7 = (kotlin.SampleVideos) r7
                    r6.read = r3
                    r4 = 250(0xfa, double:1.235E-321)
                    java.lang.Object r7 = kotlin.setCountry.IconCompatParcelizer(r4, r7)
                    if (r7 == r0) goto L43
                L35:
                    o.SlowMotionData r7 = r6.RemoteActionCompatParcelizer
                    r1 = r6
                    o.SampleVideos r1 = (kotlin.SampleVideos) r1
                    r6.read = r2
                    r6 = 0
                    java.lang.Object r6 = kotlin.SlowMotionData.AudioAttributesCompatParcelizer$default(r7, r6, r1, r3, r6)
                    if (r6 != r0) goto L44
                L43:
                    return r0
                L44:
                    o.getShowPopup r6 = kotlin.getShowPopup.INSTANCE
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: o.toMarrowResponselambda4.read.AnonymousClass3.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(int i, int i2, SlowMotionData slowMotionData, SampleVideos<? super AnonymousClass3> sampleVideos) {
                super(2, sampleVideos);
                this.write = i;
                this.AudioAttributesCompatParcelizer = i2;
                this.RemoteActionCompatParcelizer = slowMotionData;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                return new AnonymousClass3(this.write, this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer, sampleVideos);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((AnonymousClass3) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        read(getFirstInstallDbVersion getfirstinstalldbversion, TopUserCompanion topUserCompanion, int i, int i2, SlowMotionData slowMotionData, SampleVideos<? super read> sampleVideos) {
            super(2, sampleVideos);
            this.IconCompatParcelizer = getfirstinstalldbversion;
            this.AudioAttributesCompatParcelizer = topUserCompanion;
            this.read = i;
            this.write = i2;
            this.RemoteActionCompatParcelizer = slowMotionData;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new read(this.IconCompatParcelizer, this.AudioAttributesCompatParcelizer, this.read, this.write, this.RemoteActionCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(getCreatedOnDateMs getcreatedondatems) {
        getcreatedondatems.invoke();
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, getFirstInstallDbVersion getfirstinstalldbversion, getLastDbVersion getlastdbversion) {
        toMagicModuleMetaRepoModel.write(getlastdbversion, "");
        magicModuleSubmissionRequestBody.invoke(getfirstinstalldbversion.getRemoteActionCompatParcelizer(), getlastdbversion);
        return getShowPopup.INSTANCE;
    }

    private static final void RemoteActionCompatParcelizer(final getFirstInstallDbVersion getfirstinstalldbversion, final getCreatedOnDateMs<getShowPopup> getcreatedondatems, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i) {
        int i2;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(-1983041558);
        if ((i & 6) == 0) {
            i2 = (_handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(getfirstinstalldbversion) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getcreatedondatems) ? 32 : 16;
        }
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i2 & 19) != 18, i2 & 1)) {
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            _handleunrecognizedcharacterescape2.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1983041558, i2, -1, "com.marrow2.ui.video.revision_video.listing.SubjectHeader (RevisionSubjectCard.kt:112)");
            }
            final depositSchemaProperty depositschemaproperty = (depositSchemaProperty) _handleunrecognizedcharacterescapeWrite.write(getDefaultNullValueSerializer.MediaBrowserCompatItemReceiver());
            _handleOddName _handleoddnameRemoteActionCompatParcelizer$default = isAdded.RemoteActionCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null);
            boolean zIconCompatParcelizer = _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(depositschemaproperty);
            boolean z = (i2 & 112) == 32;
            Object objOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if ((z | zIconCompatParcelizer) || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new getCreatedOnDateMs() { // from class: o.ResponseExtensionsKtExternalSyntheticLambda11
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return toMarrowResponselambda4.read(depositschemaproperty, getcreatedondatems);
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause);
            }
            _handleOddName _handleoddnameWrite = splitRtspMessageBody.write(_handleoddnameRemoteActionCompatParcelizer$default, (getCreatedOnDateMs) objOnPause);
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
            read(getfirstinstalldbversion.getWrite(), assignParameter.IconCompatParcelizer(36.0f), _handleunrecognizedcharacterescapeWrite, 48, 0);
            isInLayout.RemoteActionCompatParcelizer(isAdded.AudioAttributesImplApi26Parcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(12.0f)), _handleunrecognizedcharacterescapeWrite, 6);
            _handleOddName _handleoddnameRemoteActionCompatParcelizer$default2 = getViewLifecycleOwnerLiveData.RemoteActionCompatParcelizer$default(getview, _handleOddName.INSTANCE, 1.0f, false, 2, null);
            withTypeHandler withtypehandler = setValue.read(WindowInsetsCompatImpl30.INSTANCE.MediaBrowserCompatCustomActionResultReceiver(), _skipWSOrEnd.INSTANCE.RatingCompat(), _handleunrecognizedcharacterescapeWrite, 0);
            int iHashCode2 = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler2 = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer2 = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, _handleoddnameRemoteActionCompatParcelizer$default2);
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
            _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape4 = NumberOutput.read(_handleunrecognizedcharacterescapeWrite);
            NumberOutput.write(_handleunrecognizedcharacterescape4, withtypehandler, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape4, _getchardescHandleMediaPlayPauseIfPendingOnHandler2, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape4, Integer.valueOf(iHashCode2), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape4, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape4, _handleoddnameRemoteActionCompatParcelizer2, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            DrawerLayoutSavedState drawerLayoutSavedState = DrawerLayoutSavedState.INSTANCE;
            _copyCurrentStringValue.IconCompatParcelizer(getfirstinstalldbversion.getRemoteActionCompatParcelizer(), null, enabled.INSTANCE.write(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer).MediaBrowserCompatItemReceiver(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TypeKt.RemoteActionCompatParcelizer(enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer)), _handleunrecognizedcharacterescapeWrite, 0, 0, 65530);
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            isInLayout.RemoteActionCompatParcelizer(isAdded.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(4.0f)), _handleunrecognizedcharacterescape2, 6);
            write(getfirstinstalldbversion.getIconCompatParcelizer(), getfirstinstalldbversion.getAudioAttributesImplBaseParcelizer(), getfirstinstalldbversion.AudioAttributesImplApi26Parcelizer(), _handleunrecognizedcharacterescape2, 0);
            _handleunrecognizedcharacterescape2.AudioAttributesImplBaseParcelizer();
            isAnnotationBundle isannotationbundleRemoteActionCompatParcelizer = getDefaultSetterInfo.RemoteActionCompatParcelizer(toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getfirstinstalldbversion.getAudioAttributesCompatParcelizer(), Boolean.TRUE) ? R.drawable.ic_keyboard_arrow_up : R.drawable.ic_arrow_down, _handleunrecognizedcharacterescape2, 0);
            String str = toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getfirstinstalldbversion.getAudioAttributesCompatParcelizer(), Boolean.TRUE) ? "Collapse" : "Expand";
            MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
            value.read(isannotationbundleRemoteActionCompatParcelizer, str, getParentFragment.IconCompatParcelizer(isAdded.AudioAttributesImplBaseParcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(24.0f)), assignParameter.IconCompatParcelizer(6.0f)), MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2, MarrowTheme.RemoteActionCompatParcelizer).getOnSetRating(), _handleunrecognizedcharacterescape2, isAnnotationBundle.read | RendererCapabilities.MODE_SUPPORT_MASK, 0);
            _handleunrecognizedcharacterescape2.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescape2.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.ResponseExtensionsKtExternalSyntheticLambda10
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return toMarrowResponselambda4.IconCompatParcelizer(getfirstinstalldbversion, getcreatedondatems, i, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(depositSchemaProperty depositschemaproperty, getCreatedOnDateMs getcreatedondatems) {
        depositschemaproperty.AudioAttributesCompatParcelizer(isNonStaticInnerClass.INSTANCE.AudioAttributesImplApi26Parcelizer());
        getcreatedondatems.invoke();
        return getShowPopup.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void read(final java.lang.String r19, float r20, kotlin._handleUnrecognizedCharacterEscape r21, final int r22, final int r23) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.toMarrowResponselambda4.read(java.lang.String, float, o._handleUnrecognizedCharacterEscape, int, int):void");
    }

    private static final void write(final int i, final int i2, final String str, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i3) {
        int i4;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(-308593022);
        if ((i3 & 6) == 0) {
            i4 = (_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(i) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(i2) ? 32 : 16;
        }
        if ((i3 & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i4 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(str) ? 256 : 128;
        }
        int i5 = i4;
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i5 & 147) != 146, i5 & 1)) {
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            _handleunrecognizedcharacterescape2.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-308593022, i5, -1, "com.marrow2.ui.video.revision_video.listing.SubjectProgress (RevisionSubjectCard.kt:193)");
            }
            _skipWSOrEnd.read readVarMediaBrowserCompatCustomActionResultReceiver = _skipWSOrEnd.INSTANCE.MediaBrowserCompatCustomActionResultReceiver();
            _handleOddName.Companion companion = _handleOddName.INSTANCE;
            withTypeHandler withtypehandlerIconCompatParcelizer = getTag.IconCompatParcelizer(WindowInsetsCompatImpl30.INSTANCE.AudioAttributesImplApi21Parcelizer(), readVarMediaBrowserCompatCustomActionResultReceiver, _handleunrecognizedcharacterescapeWrite, 48);
            int iHashCode = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, companion);
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
            if (i == i2) {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(1688597635);
                isAnnotationBundle isannotationbundleRemoteActionCompatParcelizer = getDefaultSetterInfo.RemoteActionCompatParcelizer(R.drawable.ic_qbank_done, _handleunrecognizedcharacterescapeWrite, 6);
                MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
                value.read(isannotationbundleRemoteActionCompatParcelizer, "Completed", getParentFragment.IconCompatParcelizer(isAdded.AudioAttributesImplBaseParcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(14.0f)), assignParameter.IconCompatParcelizer(2.0f)), MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, MarrowTheme.RemoteActionCompatParcelizer).getOnPlayFromMediaId(), _handleunrecognizedcharacterescapeWrite, isAnnotationBundle.read | 432, 0);
                isInLayout.RemoteActionCompatParcelizer(isAdded.AudioAttributesImplApi26Parcelizer(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(4.0f)), _handleunrecognizedcharacterescapeWrite, 6);
            } else {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(1682255996);
            }
            _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
            deserializeWithObjectId deserializewithobjectidAudioAttributesImplApi26Parcelizer = TypeKt.AudioAttributesImplApi26Parcelizer(enabled.INSTANCE.IconCompatParcelizer(_handleunrecognizedcharacterescapeWrite, enabled.RemoteActionCompatParcelizer));
            MarrowTheme marrowTheme2 = MarrowTheme.INSTANCE;
            _handleunrecognizedcharacterescape2 = _handleunrecognizedcharacterescapeWrite;
            _copyCurrentStringValue.IconCompatParcelizer(str, null, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, MarrowTheme.RemoteActionCompatParcelizer).getOnSetRating(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, deserializewithobjectidAudioAttributesImplApi26Parcelizer, _handleunrecognizedcharacterescape2, (i5 >> 6) & 14, 0, 65530);
            _handleunrecognizedcharacterescape2.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescape2.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.ResponseExtensionsKtExternalSyntheticLambda15
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return toMarrowResponselambda4.IconCompatParcelizer(i, i2, str, i3, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    private static final void write(_handleOddName _handleoddname, final List<getLastDbVersion> list, final boolean z, final getAnswerMap<? super getLastDbVersion, getShowPopup> getanswermap, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i, final int i2) {
        _handleOddName _handleoddname2;
        int i3;
        _handleOddName.Companion companion;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(850973710);
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
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(list) ? 32 : 16;
        }
        if ((i & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(getanswermap) ? 2048 : 1024;
        }
        int i5 = i3;
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i5 & 1171) != 1170, i5 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
            companion = _handleoddname2;
        } else {
            companion = i4 != 0 ? _handleOddName.INSTANCE : _handleoddname2;
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(850973710, i5, -1, "com.marrow2.ui.video.revision_video.listing.RevisionVideoLessonList (RevisionSubjectCard.kt:223)");
            }
            withTypeHandler withtypehandler = setValue.read(WindowInsetsCompatImpl30.INSTANCE.MediaBrowserCompatCustomActionResultReceiver(), _skipWSOrEnd.INSTANCE.RatingCompat(), _handleunrecognizedcharacterescapeWrite, 0);
            int iHashCode = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, companion);
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
            _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(-629768180);
            for (final getLastDbVersion getlastdbversion : list) {
                int audioAttributesImplApi26Parcelizer = getlastdbversion.getAudioAttributesImplApi26Parcelizer();
                boolean z2 = (i5 & 7168) == 2048;
                boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(getlastdbversion);
                Object objOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
                if ((z2 | zAudioAttributesCompatParcelizer) || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                    objOnPause = new getCreatedOnDateMs() { // from class: o.ResponseExtensionsKtExternalSyntheticLambda0
                        @Override // kotlin.getCreatedOnDateMs
                        public final Object invoke() {
                            return toMarrowResponselambda4.RemoteActionCompatParcelizer(getanswermap, getlastdbversion);
                        }
                    };
                    _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause);
                }
                ResponseExtensionsKtExternalSyntheticLambda2.AudioAttributesCompatParcelizer(getlastdbversion, z, audioAttributesImplApi26Parcelizer, (getCreatedOnDateMs<getShowPopup>) objOnPause, _handleunrecognizedcharacterescapeWrite, (i5 >> 3) & 112);
            }
            _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
            _handleunrecognizedcharacterescapeWrite.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            final _handleOddName _handleoddname3 = companion;
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.toMarrowResponselambda2
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return toMarrowResponselambda4.IconCompatParcelizer(_handleoddname3, list, z, getanswermap, i, i2, (_handleUnrecognizedCharacterEscape) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(getAnswerMap getanswermap, getLastDbVersion getlastdbversion) {
        getanswermap.invoke(getlastdbversion);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(_handleOddName _handleoddname, getFirstInstallDbVersion getfirstinstalldbversion, int i, int i2, boolean z, getCreatedOnDateMs getcreatedondatems, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, int i3, int i4, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        AudioAttributesCompatParcelizer(_handleoddname, getfirstinstalldbversion, i, i2, z, (getCreatedOnDateMs<getShowPopup>) getcreatedondatems, (MagicModuleSubmissionRequestBody<? super String, ? super getLastDbVersion, getShowPopup>) magicModuleSubmissionRequestBody, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i3 | 1), i4);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(_handleOddName _handleoddname, List list, boolean z, getAnswerMap getanswermap, int i, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        write(_handleoddname, list, z, getanswermap, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1), i2);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(getFirstInstallDbVersion getfirstinstalldbversion, getCreatedOnDateMs getcreatedondatems, int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        RemoteActionCompatParcelizer(getfirstinstalldbversion, (getCreatedOnDateMs<getShowPopup>) getcreatedondatems, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(String str, float f, int i, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        read(str, f, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1), i2);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(int i, int i2, String str, int i3, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        write(i, i2, str, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i3 | 1));
        return getShowPopup.INSTANCE;
    }
}
