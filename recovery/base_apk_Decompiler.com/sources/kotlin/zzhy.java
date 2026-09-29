package kotlin;

import android.content.Context;
import android.os.Build;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow2.ui.review_components.McqReviewViewModel;
import java.util.List;
import kotlin._handleOddName;
import kotlin.buildCacheKey;
import kotlin.zzks;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhy {

    public static final /* synthetic */ class AudioAttributesImplApi26Parcelizer {
        public static final /* synthetic */ int[] write;

        static {
            int[] iArr = new int[zzjc.values().length];
            try {
                iArr[zzjc.IconCompatParcelizer.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[zzjc.RemoteActionCompatParcelizer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[zzjc.write.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            write = iArr;
        }
    }

    public static final class RemoteActionCompatParcelizer implements _wrapError {
        private /* synthetic */ zzks IconCompatParcelizer;
        private /* synthetic */ Context write;

        public RemoteActionCompatParcelizer(Context context, zzks zzksVar) {
            this.write = context;
            this.IconCompatParcelizer = zzksVar;
        }

        @Override // kotlin._wrapError
        public final void RemoteActionCompatParcelizer() {
            this.write.unregisterReceiver(this.IconCompatParcelizer);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:212:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void read(kotlin._handleOddName r28, final boolean r29, final kotlin.zzhs r30, final java.lang.String r31, final kotlin.zzjc r32, final java.lang.String r33, final int r34, final boolean r35, kotlin.setDouble r36, kotlin.getCreatedOnDateMs<kotlin.getShowPopup> r37, final boolean r38, kotlin.getExtraArgs r39, final boolean r40, kotlin._handleUnrecognizedCharacterEscape r41, final int r42, final int r43, final int r44) {
        /*
            Method dump skipped, instruction units count: 1048
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zzhy.read(o._handleOddName, boolean, o.zzhs, java.lang.String, o.zzjc, java.lang.String, int, boolean, o.setDouble, o.getCreatedOnDateMs, boolean, o.getExtraArgs, boolean, o._handleUnrecognizedCharacterEscape, int, int, int):void");
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ Pair<String, onDisplayInfoChanged> IconCompatParcelizer;
        private /* synthetic */ Context RemoteActionCompatParcelizer;
        private /* synthetic */ McqReviewViewModel read;
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            if (this.IconCompatParcelizer != null) {
                zzks.Companion companion = zzks.INSTANCE;
                zzks.Companion.read(this.RemoteActionCompatParcelizer, this.IconCompatParcelizer.write(), this.IconCompatParcelizer.IconCompatParcelizer());
            }
            this.read.IconCompatParcelizer();
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        IconCompatParcelizer(Pair<String, ? extends onDisplayInfoChanged> pair, Context context, McqReviewViewModel mcqReviewViewModel, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.IconCompatParcelizer = pair;
            this.RemoteActionCompatParcelizer = context;
            this.read = mcqReviewViewModel;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new IconCompatParcelizer(this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, this.read, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final _wrapError write(Context context, final McqReviewViewModel mcqReviewViewModel, final zzhs zzhsVar, final boolean z, StreamConstraintsException streamConstraintsException) {
        toMagicModuleMetaRepoModel.write(streamConstraintsException, "");
        zzks zzksVar = new zzks(new MagicModuleSubmissionRequestBody() { // from class: o.zzhv
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return zzhy.read(mcqReviewViewModel, zzhsVar, z, (String) obj, (onDisplayInfoChanged) obj2);
            }
        });
        if (Build.VERSION.SDK_INT >= 34) {
            context.registerReceiver(zzksVar, zzks.write(), 4);
        } else {
            context.registerReceiver(zzksVar, zzks.write());
        }
        return new RemoteActionCompatParcelizer(context, zzksVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(McqReviewViewModel mcqReviewViewModel, zzhs zzhsVar, boolean z, String str, onDisplayInfoChanged ondisplayinfochanged) throws Exception {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(ondisplayinfochanged, "");
        mcqReviewViewModel.IconCompatParcelizer(str, ondisplayinfochanged, true, zzhsVar, z);
        return getShowPopup.INSTANCE;
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ zzhs AudioAttributesCompatParcelizer;
        private /* synthetic */ String IconCompatParcelizer;
        private int RemoteActionCompatParcelizer;
        private /* synthetic */ McqReviewViewModel read;
        private /* synthetic */ String write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            this.read.AudioAttributesCompatParcelizer(this.IconCompatParcelizer, this.write, this.AudioAttributesCompatParcelizer);
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesCompatParcelizer(McqReviewViewModel mcqReviewViewModel, String str, String str2, zzhs zzhsVar, SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.read = mcqReviewViewModel;
            this.IconCompatParcelizer = str;
            this.write = str2;
            this.AudioAttributesCompatParcelizer = zzhsVar;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new AudioAttributesCompatParcelizer(this.read, this.IconCompatParcelizer, this.write, this.AudioAttributesCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private static final boolean RemoteActionCompatParcelizer(InputAccessor<Boolean> inputAccessor) {
        return inputAccessor.getRemoteActionCompatParcelizer().booleanValue();
    }

    static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ InputAccessor<Boolean> IconCompatParcelizer;
        private int RemoteActionCompatParcelizer;
        private /* synthetic */ boolean write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            zzhy.write(this.IconCompatParcelizer, this.write);
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        write(boolean z, InputAccessor<Boolean> inputAccessor, SampleVideos<? super write> sampleVideos) {
            super(2, sampleVideos);
            this.write = z;
            this.IconCompatParcelizer = inputAccessor;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new write(this.write, this.IconCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(McqReviewViewModel mcqReviewViewModel, String str, String str2, List list, boolean z, boolean z2, boolean z3, List list2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(list2, "");
        mcqReviewViewModel.write(str2, str, list, z, z2, z3, list2);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplApi21Parcelizer(McqReviewViewModel mcqReviewViewModel) {
        mcqReviewViewModel.AudioAttributesCompatParcelizer();
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final getShowPopup IconCompatParcelizer(final McqReviewViewModel mcqReviewViewModel, _handleOddName _handleoddname, boolean z, zzjc zzjcVar, List list, int i, boolean z2, boolean z3, final zzhs zzhsVar, final boolean z4, getExtraArgs getextraargs, setDouble setdouble, getCreatedOnDateMs getcreatedondatems, final InputAccessor inputAccessor, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i2) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i2 & 3) != 2, i2 & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1319895007, i2, -1, "com.marrow2.ui.review_components.ui.ReviewMcqContentPage.<anonymous> (ReviewMcqContent.kt:125)");
            }
            DataSourceBitmapLoaderExternalSyntheticLambda0 dataSourceBitmapLoaderExternalSyntheticLambda0 = (DataSourceBitmapLoaderExternalSyntheticLambda0) isSetterVisible.AudioAttributesCompatParcelizer(mcqReviewViewModel.AudioAttributesImplApi21Parcelizer(), _handleunrecognizedcharacterescape, 0).getRemoteActionCompatParcelizer();
            if (dataSourceBitmapLoaderExternalSyntheticLambda0 instanceof decodeBitmap) {
                _handleunrecognizedcharacterescape.IconCompatParcelizer(566833257);
                zzhr zzhrVar = (zzhr) ((decodeBitmap) dataSourceBitmapLoaderExternalSyntheticLambda0).RemoteActionCompatParcelizer();
                _skipWSOrEnd _skipwsorendRemoteActionCompatParcelizer = _skipWSOrEnd.INSTANCE.RemoteActionCompatParcelizer();
                _handleOddName.Companion companion = _handleOddName.INSTANCE;
                withTypeHandler withtypehandlerWrite = AbsSavedState1.write(_skipwsorendRemoteActionCompatParcelizer, false);
                int iHashCode = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, 0));
                _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescape.handleMediaPlayPauseIfPendingOnHandler();
                _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, companion);
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
                _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2 = NumberOutput.read(_handleunrecognizedcharacterescape);
                NumberOutput.write(_handleunrecognizedcharacterescape2, withtypehandlerWrite, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
                NumberOutput.write(_handleunrecognizedcharacterescape2, _getchardescHandleMediaPlayPauseIfPendingOnHandler, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
                NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2, Integer.valueOf(iHashCode), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
                NumberOutput.write(_handleunrecognizedcharacterescape2, getDependencies.INSTANCE.write());
                NumberOutput.write(_handleunrecognizedcharacterescape2, _handleoddnameRemoteActionCompatParcelizer, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
                setDrawerElevation setdrawerelevation = setDrawerElevation.INSTANCE;
                if (z) {
                    _handleunrecognizedcharacterescape.IconCompatParcelizer(-1256997400);
                    _handleOddName _handleoddnameIconCompatParcelizer$default = isAdded.IconCompatParcelizer$default(getFrameEndSchedulerui.IconCompatParcelizer$default(_parseFloatThatStartsWithPeriod.IconCompatParcelizer(_handleOddName.INSTANCE, 6.0f), switchToNext.AudioAttributesCompatParcelizer$default(switchToNext.INSTANCE.AudioAttributesCompatParcelizer(), 0.6f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), null, 2, null), BitmapDescriptorFactory.HUE_RED, 1, null);
                    Object objOnPause = _handleunrecognizedcharacterescape.onPause();
                    if (objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                        objOnPause = new getCreatedOnDateMs() { // from class: o.getIntrinsicHeight
                            @Override // kotlin.getCreatedOnDateMs
                            public final Object invoke() {
                                return zzhy.IconCompatParcelizer();
                            }
                        };
                        _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
                    }
                    _handleOddName _handleoddnameWrite = splitRtspMessageBody.write(_handleoddnameIconCompatParcelizer$default, (getCreatedOnDateMs) objOnPause);
                    withTypeHandler withtypehandlerWrite2 = AbsSavedState1.write(_skipWSOrEnd.INSTANCE.RemoteActionCompatParcelizer(), false);
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
                    _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape3 = NumberOutput.read(_handleunrecognizedcharacterescape);
                    NumberOutput.write(_handleunrecognizedcharacterescape3, withtypehandlerWrite2, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
                    NumberOutput.write(_handleunrecognizedcharacterescape3, _getchardescHandleMediaPlayPauseIfPendingOnHandler2, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
                    NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape3, Integer.valueOf(iHashCode2), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
                    NumberOutput.write(_handleunrecognizedcharacterescape3, getDependencies.INSTANCE.write());
                    NumberOutput.write(_handleunrecognizedcharacterescape3, _handleoddnameRemoteActionCompatParcelizer2, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
                    setDrawerElevation setdrawerelevation2 = setDrawerElevation.INSTANCE;
                    JsonIdentityReference.read(null, 0L, BitmapDescriptorFactory.HUE_RED, 0L, 0, _handleunrecognizedcharacterescape, 0, 31);
                    _handleunrecognizedcharacterescape.AudioAttributesImplBaseParcelizer();
                } else {
                    _handleunrecognizedcharacterescape.IconCompatParcelizer(-317993343);
                }
                _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
                int i3 = AudioAttributesImplApi26Parcelizer.write[zzjcVar.ordinal()];
                if (i3 == 1) {
                    _handleunrecognizedcharacterescape.IconCompatParcelizer(-311704528);
                    _handleOddName _handleoddnameRemoteActionCompatParcelizer$default = isAdded.RemoteActionCompatParcelizer$default(_handleoddname, BitmapDescriptorFactory.HUE_RED, 1, null);
                    boolean zRemoteActionCompatParcelizer = RemoteActionCompatParcelizer((InputAccessor<Boolean>) inputAccessor);
                    onDisplayInfoChanged ondisplayinfochanged = zzhrVar.read();
                    boolean zIconCompatParcelizer = _handleunrecognizedcharacterescape.IconCompatParcelizer(mcqReviewViewModel);
                    Object objOnPause2 = _handleunrecognizedcharacterescape.onPause();
                    if (zIconCompatParcelizer || objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                        objOnPause2 = new getCreatedOnDateMs() { // from class: o.newDrawable
                            @Override // kotlin.getCreatedOnDateMs
                            public final Object invoke() {
                                return zzhy.MediaBrowserCompatMediaItem(mcqReviewViewModel);
                            }
                        };
                        _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause2);
                    }
                    getCreatedOnDateMs getcreatedondatems2 = (getCreatedOnDateMs) objOnPause2;
                    boolean zIconCompatParcelizer2 = _handleunrecognizedcharacterescape.IconCompatParcelizer(mcqReviewViewModel);
                    boolean zRemoteActionCompatParcelizer2 = _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(zzhsVar.ordinal());
                    boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(z4);
                    Object objOnPause3 = _handleunrecognizedcharacterescape.onPause();
                    if ((zIconCompatParcelizer2 | zRemoteActionCompatParcelizer2 | zAudioAttributesCompatParcelizer) || objOnPause3 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                        objOnPause3 = new MagicModuleSubmissionRequestBody() { // from class: o.scheduleDrawable
                            @Override // kotlin.MagicModuleSubmissionRequestBody
                            public final Object invoke(Object obj, Object obj2) {
                                return zzhy.IconCompatParcelizer(mcqReviewViewModel, zzhsVar, z4, (onDisplayInfoChanged) obj, (String) obj2);
                            }
                        };
                        _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause3);
                    }
                    MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody = (MagicModuleSubmissionRequestBody) objOnPause3;
                    boolean zIconCompatParcelizer3 = _handleunrecognizedcharacterescape.IconCompatParcelizer(mcqReviewViewModel);
                    Object objOnPause4 = _handleunrecognizedcharacterescape.onPause();
                    if (zIconCompatParcelizer3 || objOnPause4 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                        objOnPause4 = new getCreatedOnDateMs() { // from class: o.mutate
                            @Override // kotlin.getCreatedOnDateMs
                            public final Object invoke() {
                                return zzhy.MediaBrowserCompatSearchResultReceiver(mcqReviewViewModel);
                            }
                        };
                        _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause4);
                    }
                    getCreatedOnDateMs getcreatedondatems3 = (getCreatedOnDateMs) objOnPause4;
                    Object objOnPause5 = _handleunrecognizedcharacterescape.onPause();
                    if (objOnPause5 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                        objOnPause5 = new getCreatedOnDateMs() { // from class: o.spliterator
                            @Override // kotlin.getCreatedOnDateMs
                            public final Object invoke() {
                                return zzhy.read(inputAccessor);
                            }
                        };
                        _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause5);
                    }
                    clearTileCache.AudioAttributesCompatParcelizer(_handleoddnameRemoteActionCompatParcelizer$default, zzhrVar, (List<buildCacheKey.IconCompatParcelizer>) list, i, zRemoteActionCompatParcelizer, z2, ondisplayinfochanged, z3, (getCreatedOnDateMs<getShowPopup>) getcreatedondatems2, (MagicModuleSubmissionRequestBody<? super onDisplayInfoChanged, ? super String, getShowPopup>) magicModuleSubmissionRequestBody, (getCreatedOnDateMs<getShowPopup>) getcreatedondatems3, (getCreatedOnDateMs<getShowPopup>) objOnPause5, getextraargs, _handleunrecognizedcharacterescape, 0, 48, 0);
                    _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
                    getShowPopup getshowpopup = getShowPopup.INSTANCE;
                } else if (i3 == 2) {
                    _handleunrecognizedcharacterescape.IconCompatParcelizer(-310205058);
                    _handleOddName _handleoddnameRemoteActionCompatParcelizer$default2 = isAdded.RemoteActionCompatParcelizer$default(_handleoddname, BitmapDescriptorFactory.HUE_RED, 1, null);
                    boolean zRemoteActionCompatParcelizer3 = RemoteActionCompatParcelizer((InputAccessor<Boolean>) inputAccessor);
                    onDisplayInfoChanged ondisplayinfochanged2 = zzhrVar.read();
                    boolean zIconCompatParcelizer4 = _handleunrecognizedcharacterescape.IconCompatParcelizer(mcqReviewViewModel);
                    boolean zRemoteActionCompatParcelizer4 = _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(zzhsVar.ordinal());
                    boolean zAudioAttributesCompatParcelizer2 = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(z4);
                    Object objOnPause6 = _handleunrecognizedcharacterescape.onPause();
                    if ((zIconCompatParcelizer4 | zRemoteActionCompatParcelizer4 | zAudioAttributesCompatParcelizer2) || objOnPause6 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                        objOnPause6 = new MagicModuleSubmissionRequestBody() { // from class: o.unscheduleDrawable
                            @Override // kotlin.MagicModuleSubmissionRequestBody
                            public final Object invoke(Object obj, Object obj2) {
                                return zzhy.AudioAttributesImplApi26Parcelizer(mcqReviewViewModel, zzhsVar, z4, (onDisplayInfoChanged) obj, (String) obj2);
                            }
                        };
                        _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause6);
                    }
                    MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody2 = (MagicModuleSubmissionRequestBody) objOnPause6;
                    boolean zIconCompatParcelizer5 = _handleunrecognizedcharacterescape.IconCompatParcelizer(mcqReviewViewModel);
                    Object objOnPause7 = _handleunrecognizedcharacterescape.onPause();
                    if (zIconCompatParcelizer5 || objOnPause7 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                        objOnPause7 = new getCreatedOnDateMs() { // from class: o.zzhw
                            @Override // kotlin.getCreatedOnDateMs
                            public final Object invoke() {
                                return zzhy.RatingCompat(mcqReviewViewModel);
                            }
                        };
                        _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause7);
                    }
                    getCreatedOnDateMs getcreatedondatems4 = (getCreatedOnDateMs) objOnPause7;
                    boolean zIconCompatParcelizer6 = _handleunrecognizedcharacterescape.IconCompatParcelizer(mcqReviewViewModel);
                    Object objOnPause8 = _handleunrecognizedcharacterescape.onPause();
                    if (zIconCompatParcelizer6 || objOnPause8 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                        objOnPause8 = new getCreatedOnDateMs() { // from class: o.invalidateDrawable
                            @Override // kotlin.getCreatedOnDateMs
                            public final Object invoke() {
                                return zzhy.MediaMetadataCompat(mcqReviewViewModel);
                            }
                        };
                        _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause8);
                    }
                    getCreatedOnDateMs getcreatedondatems5 = (getCreatedOnDateMs) objOnPause8;
                    Object objOnPause9 = _handleunrecognizedcharacterescape.onPause();
                    if (objOnPause9 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                        objOnPause9 = new getCreatedOnDateMs() { // from class: o.transactAndReadExceptionReturnVoid
                            @Override // kotlin.getCreatedOnDateMs
                            public final Object invoke() {
                                return zzhy.AudioAttributesCompatParcelizer(inputAccessor);
                            }
                        };
                        _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause9);
                    }
                    clearTileCache.AudioAttributesCompatParcelizer(_handleoddnameRemoteActionCompatParcelizer$default2, zzhrVar, (List<buildCacheKey.IconCompatParcelizer>) list, i, zRemoteActionCompatParcelizer3, z2, ondisplayinfochanged2, z3, (MagicModuleSubmissionRequestBody<? super onDisplayInfoChanged, ? super String, getShowPopup>) magicModuleSubmissionRequestBody2, (getCreatedOnDateMs<getShowPopup>) getcreatedondatems4, (getCreatedOnDateMs<getShowPopup>) getcreatedondatems5, (getCreatedOnDateMs<getShowPopup>) objOnPause9, _handleunrecognizedcharacterescape, 0, 48, 0);
                    _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
                    getShowPopup getshowpopup2 = getShowPopup.INSTANCE;
                } else {
                    if (i3 != 3) {
                        _handleunrecognizedcharacterescape.IconCompatParcelizer(-1256981342);
                        _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
                        throw new RenewEligibleCreator();
                    }
                    _handleunrecognizedcharacterescape.IconCompatParcelizer(-308715012);
                    _handleOddName _handleoddnameRemoteActionCompatParcelizer$default3 = isAdded.RemoteActionCompatParcelizer$default(_handleoddname, BitmapDescriptorFactory.HUE_RED, 1, null);
                    boolean zRemoteActionCompatParcelizer5 = RemoteActionCompatParcelizer((InputAccessor<Boolean>) inputAccessor);
                    if (setdouble == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                    if (getcreatedondatems != null) {
                        boolean zIconCompatParcelizer7 = _handleunrecognizedcharacterescape.IconCompatParcelizer(mcqReviewViewModel);
                        Object objOnPause10 = _handleunrecognizedcharacterescape.onPause();
                        if (zIconCompatParcelizer7 || objOnPause10 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                            objOnPause10 = new getCreatedOnDateMs() { // from class: o.subList
                                @Override // kotlin.getCreatedOnDateMs
                                public final Object invoke() {
                                    return zzhy.MediaBrowserCompatItemReceiver(mcqReviewViewModel);
                                }
                            };
                            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause10);
                        }
                        getCreatedOnDateMs getcreatedondatems6 = (getCreatedOnDateMs) objOnPause10;
                        boolean zIconCompatParcelizer8 = _handleunrecognizedcharacterescape.IconCompatParcelizer(mcqReviewViewModel);
                        Object objOnPause11 = _handleunrecognizedcharacterescape.onPause();
                        if (zIconCompatParcelizer8 || objOnPause11 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                            objOnPause11 = new getCreatedOnDateMs() { // from class: o.getIntrinsicWidth
                                @Override // kotlin.getCreatedOnDateMs
                                public final Object invoke() {
                                    return zzhy.AudioAttributesImplBaseParcelizer(mcqReviewViewModel);
                                }
                            };
                            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause11);
                        }
                        getCreatedOnDateMs getcreatedondatems7 = (getCreatedOnDateMs) objOnPause11;
                        Object objOnPause12 = _handleunrecognizedcharacterescape.onPause();
                        if (objOnPause12 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                            objOnPause12 = new getCreatedOnDateMs() { // from class: o.zzhz
                                @Override // kotlin.getCreatedOnDateMs
                                public final Object invoke() {
                                    return zzhy.AudioAttributesCompatParcelizer();
                                }
                            };
                            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause12);
                        }
                        getCreatedOnDateMs getcreatedondatems8 = (getCreatedOnDateMs) objOnPause12;
                        boolean zIconCompatParcelizer9 = _handleunrecognizedcharacterescape.IconCompatParcelizer(mcqReviewViewModel);
                        boolean zRemoteActionCompatParcelizer6 = _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(zzhsVar.ordinal());
                        boolean zAudioAttributesCompatParcelizer3 = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(z4);
                        Object objOnPause13 = _handleunrecognizedcharacterescape.onPause();
                        if ((zIconCompatParcelizer9 | zRemoteActionCompatParcelizer6 | zAudioAttributesCompatParcelizer3) || objOnPause13 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                            objOnPause13 = new MagicModuleSubmissionRequestBody() { // from class: o.getConstantState
                                @Override // kotlin.MagicModuleSubmissionRequestBody
                                public final Object invoke(Object obj, Object obj2) {
                                    return zzhy.RemoteActionCompatParcelizer(mcqReviewViewModel, zzhsVar, z4, (onDisplayInfoChanged) obj, (String) obj2);
                                }
                            };
                            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause13);
                        }
                        clearTileCache.IconCompatParcelizer(_handleoddnameRemoteActionCompatParcelizer$default3, zzhrVar, list, i, zRemoteActionCompatParcelizer5, z2, z3, setdouble, getcreatedondatems6, getcreatedondatems7, getcreatedondatems8, getcreatedondatems, zzhsVar, (MagicModuleSubmissionRequestBody) objOnPause13, _handleunrecognizedcharacterescape, 0, 6, 0);
                        _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
                        getShowPopup getshowpopup3 = getShowPopup.INSTANCE;
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                _handleunrecognizedcharacterescape.AudioAttributesImplBaseParcelizer();
                _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            } else if (dataSourceBitmapLoaderExternalSyntheticLambda0 instanceof setStreamingFormat) {
                _handleunrecognizedcharacterescape.IconCompatParcelizer(571586425);
                _handleOddName _handleoddnameIconCompatParcelizer$default2 = isAdded.IconCompatParcelizer$default(isAdded.RemoteActionCompatParcelizer$default(_handleoddname, BitmapDescriptorFactory.HUE_RED, 1, null), assignParameter.IconCompatParcelizer(500.0f), BitmapDescriptorFactory.HUE_RED, 2, (Object) null);
                withTypeHandler withtypehandlerWrite3 = AbsSavedState1.write(_skipWSOrEnd.INSTANCE.RemoteActionCompatParcelizer(), false);
                int iHashCode3 = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, 0));
                _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler3 = _handleunrecognizedcharacterescape.handleMediaPlayPauseIfPendingOnHandler();
                _handleOddName _handleoddnameRemoteActionCompatParcelizer3 = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, _handleoddnameIconCompatParcelizer$default2);
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
                _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape4 = NumberOutput.read(_handleunrecognizedcharacterescape);
                NumberOutput.write(_handleunrecognizedcharacterescape4, withtypehandlerWrite3, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
                NumberOutput.write(_handleunrecognizedcharacterescape4, _getchardescHandleMediaPlayPauseIfPendingOnHandler3, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
                NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape4, Integer.valueOf(iHashCode3), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
                NumberOutput.write(_handleunrecognizedcharacterescape4, getDependencies.INSTANCE.write());
                NumberOutput.write(_handleunrecognizedcharacterescape4, _handleoddnameRemoteActionCompatParcelizer3, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
                setDrawerElevation setdrawerelevation3 = setDrawerElevation.INSTANCE;
                JsonIdentityReference.read(null, 0L, BitmapDescriptorFactory.HUE_RED, 0L, 0, _handleunrecognizedcharacterescape, 0, 31);
                _handleunrecognizedcharacterescape.AudioAttributesImplBaseParcelizer();
                _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            } else {
                if (!(dataSourceBitmapLoaderExternalSyntheticLambda0 instanceof setTopBitrateKbps)) {
                    _handleunrecognizedcharacterescape.IconCompatParcelizer(1403755717);
                    _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
                    throw new RenewEligibleCreator();
                }
                _handleunrecognizedcharacterescape.IconCompatParcelizer(572398997);
                Context context = (Context) _handleunrecognizedcharacterescape.write(AndroidCompositionLocals_androidKt.IconCompatParcelizer());
                getShowPopup getshowpopup4 = getShowPopup.INSTANCE;
                boolean zIconCompatParcelizer10 = _handleunrecognizedcharacterescape.IconCompatParcelizer(dataSourceBitmapLoaderExternalSyntheticLambda0);
                boolean zIconCompatParcelizer11 = _handleunrecognizedcharacterescape.IconCompatParcelizer(context);
                Object objOnPause14 = _handleunrecognizedcharacterescape.onPause();
                if ((zIconCompatParcelizer10 | zIconCompatParcelizer11) || objOnPause14 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                    objOnPause14 = (MagicModuleSubmissionRequestBody) new read(dataSourceBitmapLoaderExternalSyntheticLambda0, context, null);
                    _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause14);
                }
                StreamReadException.IconCompatParcelizer(getshowpopup4, (MagicModuleSubmissionRequestBody) objOnPause14, _handleunrecognizedcharacterescape, 6);
                _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            }
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer() {
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(McqReviewViewModel mcqReviewViewModel, zzhs zzhsVar, boolean z, onDisplayInfoChanged ondisplayinfochanged, String str) throws Exception {
        toMagicModuleMetaRepoModel.write(ondisplayinfochanged, "");
        toMagicModuleMetaRepoModel.write(str, "");
        mcqReviewViewModel.IconCompatParcelizer(str, ondisplayinfochanged, false, zzhsVar, z);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatMediaItem(McqReviewViewModel mcqReviewViewModel) {
        mcqReviewViewModel.RatingCompat();
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatSearchResultReceiver(McqReviewViewModel mcqReviewViewModel) {
        mcqReviewViewModel.MediaDescriptionCompat();
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(InputAccessor inputAccessor) {
        write(inputAccessor, !RemoteActionCompatParcelizer((InputAccessor<Boolean>) inputAccessor));
        isSeekPending isseekpendingIconCompatParcelizer = RtspHeadersBuilder.IconCompatParcelizer();
        zzbV zzbv = zzbV.INSTANCE;
        isseekpendingIconCompatParcelizer.write(zzbV.IconCompatParcelizer(RemoteActionCompatParcelizer((InputAccessor<Boolean>) inputAccessor)), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplApi26Parcelizer(McqReviewViewModel mcqReviewViewModel, zzhs zzhsVar, boolean z, onDisplayInfoChanged ondisplayinfochanged, String str) throws Exception {
        toMagicModuleMetaRepoModel.write(ondisplayinfochanged, "");
        toMagicModuleMetaRepoModel.write(str, "");
        mcqReviewViewModel.IconCompatParcelizer(str, ondisplayinfochanged, false, zzhsVar, z);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RatingCompat(McqReviewViewModel mcqReviewViewModel) {
        mcqReviewViewModel.RatingCompat();
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaMetadataCompat(McqReviewViewModel mcqReviewViewModel) {
        mcqReviewViewModel.MediaDescriptionCompat();
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(InputAccessor inputAccessor) {
        write(inputAccessor, !RemoteActionCompatParcelizer((InputAccessor<Boolean>) inputAccessor));
        isSeekPending isseekpendingIconCompatParcelizer = RtspHeadersBuilder.IconCompatParcelizer();
        zzbV zzbv = zzbV.INSTANCE;
        isseekpendingIconCompatParcelizer.write(zzbV.IconCompatParcelizer(RemoteActionCompatParcelizer((InputAccessor<Boolean>) inputAccessor)), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatItemReceiver(McqReviewViewModel mcqReviewViewModel) {
        mcqReviewViewModel.RatingCompat();
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplBaseParcelizer(McqReviewViewModel mcqReviewViewModel) {
        mcqReviewViewModel.MediaDescriptionCompat();
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer() {
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(McqReviewViewModel mcqReviewViewModel, zzhs zzhsVar, boolean z, onDisplayInfoChanged ondisplayinfochanged, String str) throws Exception {
        toMagicModuleMetaRepoModel.write(ondisplayinfochanged, "");
        toMagicModuleMetaRepoModel.write(str, "");
        mcqReviewViewModel.IconCompatParcelizer(str, ondisplayinfochanged, false, zzhsVar, z);
        return getShowPopup.INSTANCE;
    }

    static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;
        private /* synthetic */ Context read;
        private /* synthetic */ DataSourceBitmapLoaderExternalSyntheticLambda0<zzhr> write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            if (((setTopBitrateKbps) this.write).getWrite().length() > 0) {
                CmcdConfigurationRequestConfig.read(this.read, ((setTopBitrateKbps) this.write).getWrite(), 0);
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        read(DataSourceBitmapLoaderExternalSyntheticLambda0<zzhr> dataSourceBitmapLoaderExternalSyntheticLambda0, Context context, SampleVideos<? super read> sampleVideos) {
            super(2, sampleVideos);
            this.write = dataSourceBitmapLoaderExternalSyntheticLambda0;
            this.read = context;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new read(this.write, this.read, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void write(InputAccessor<Boolean> inputAccessor, boolean z) {
        inputAccessor.write(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(_handleOddName _handleoddname, boolean z, zzhs zzhsVar, String str, zzjc zzjcVar, String str2, int i, boolean z2, setDouble setdouble, getCreatedOnDateMs getcreatedondatems, boolean z3, getExtraArgs getextraargs, boolean z4, int i2, int i3, int i4, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        read(_handleoddname, z, zzhsVar, str, zzjcVar, str2, i, z2, setdouble, getcreatedondatems, z3, getextraargs, z4, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i2 | 1), _appendEscaped.RemoteActionCompatParcelizer(i3), i4);
        return getShowPopup.INSTANCE;
    }
}
