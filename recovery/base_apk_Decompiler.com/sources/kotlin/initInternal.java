package kotlin;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow2.ui.bookmark.landing.BookmarkLandingViewModel;
import kotlin._handleOddName;
import kotlin.adjustmentAllowed;
import kotlin.anyIgnorals;
import kotlin.isTransferHdr;
import kotlin.updateSurfacePlaybackFrameRate;
import kotlin.withFieldVisibility;

/* JADX INFO: loaded from: classes3.dex */
public final class initInternal {
    public static final initInternal RemoteActionCompatParcelizer = new initInternal();
    private static MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> read = multiplyFft.IconCompatParcelizer(409728130, false, new MagicModuleSubmissionRequestBody() { // from class: o.PlaceholderSurface1
        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final Object invoke(Object obj, Object obj2) {
            return initInternal.write((_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
        }
    });
    private static MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> IconCompatParcelizer = multiplyFft.IconCompatParcelizer(-872869145, false, new MagicModuleSubmissionRequestBody() { // from class: o.getVideoDecoderOutputBufferRenderer
        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final Object invoke(Object obj, Object obj2) {
            return initInternal.AudioAttributesImplApi21Parcelizer((_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
        }
    });

    static {
        multiplyFft.IconCompatParcelizer(-345477722, false, new MagicModuleSubmissionRequestBody() { // from class: o.onSurfaceChanged
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return initInternal.IconCompatParcelizer((_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(409728130, i, -1, "com.marrow2.ui.bookmark.landing.ComposableSingletons$BookmarkLandingFragmentKt.lambda$409728130.<anonymous> (BookmarkLandingFragment.kt:56)");
            }
            maybeRegisterFrame.write(_handleunrecognizedcharacterescape, 0);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplApi21Parcelizer(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        withFieldVisibility.write defaultViewModelCreationExtras;
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-872869145, i, -1, "com.marrow2.ui.bookmark.landing.ComposableSingletons$BookmarkLandingFragmentKt.lambda$-872869145.<anonymous> (BookmarkLandingFragment.kt:75)");
            }
            final Context context = (Context) _handleunrecognizedcharacterescape.write(AndroidCompositionLocals_androidKt.IconCompatParcelizer());
            MediaSessionCompatQueueItem mediaSessionCompatQueueItem = MediaSessionCompatQueueItem.INSTANCE;
            int i2 = MediaSessionCompatQueueItem.AudioAttributesCompatParcelizer;
            onSetShuffleMode onsetshufflemodeRemoteActionCompatParcelizer = MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape);
            final onSetRating iconCompatParcelizer = onsetshufflemodeRemoteActionCompatParcelizer != null ? onsetshufflemodeRemoteActionCompatParcelizer.getIconCompatParcelizer() : null;
            JDK14Util jDK14Util = JDK14Util.INSTANCE;
            TypeResolutionContext typeResolutionContextIconCompatParcelizer = JDK14Util.IconCompatParcelizer(_handleunrecognizedcharacterescape, 6);
            if (typeResolutionContextIconCompatParcelizer == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            if (typeResolutionContextIconCompatParcelizer instanceof anyExplicitsWithoutIgnoral) {
                defaultViewModelCreationExtras = ((anyExplicitsWithoutIgnoral) typeResolutionContextIconCompatParcelizer).getDefaultViewModelCreationExtras();
            } else {
                defaultViewModelCreationExtras = withFieldVisibility.write.INSTANCE;
            }
            final BookmarkLandingViewModel bookmarkLandingViewModel = (BookmarkLandingViewModel) JDK14UtilRawTypeName.IconCompatParcelizer(toMagicModuleMetaDataUcModel.write(BookmarkLandingViewModel.class), typeResolutionContextIconCompatParcelizer, null, defaultViewModelCreationExtras, _handleunrecognizedcharacterescape, 0);
            maybeBuildDisplayHelper maybebuilddisplayhelper = (maybeBuildDisplayHelper) isSetterVisible.AudioAttributesCompatParcelizer(bookmarkLandingViewModel.AudioAttributesCompatParcelizer(), _handleunrecognizedcharacterescape, 0).getRemoteActionCompatParcelizer();
            updateSurfacePlaybackFrameRate updatesurfaceplaybackframerate = (updateSurfacePlaybackFrameRate) isSetterVisible.AudioAttributesCompatParcelizer(bookmarkLandingViewModel.IconCompatParcelizer(), _handleunrecognizedcharacterescape, 0).getRemoteActionCompatParcelizer();
            boolean zIconCompatParcelizer = _handleunrecognizedcharacterescape.IconCompatParcelizer(bookmarkLandingViewModel);
            Object objOnPause = _handleunrecognizedcharacterescape.onPause();
            if (zIconCompatParcelizer || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new getAnswerMap() { // from class: o.VideoFrameReleaseHelper
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return initInternal.AudioAttributesCompatParcelizer(bookmarkLandingViewModel, (anyIgnorals.read) obj);
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
            }
            renderedFirstFrame.AudioAttributesCompatParcelizer(null, (getAnswerMap) objOnPause, _handleunrecognizedcharacterescape, 0, 1);
            if (maybebuilddisplayhelper.getWrite()) {
                _handleunrecognizedcharacterescape.IconCompatParcelizer(-1911995518);
                _handleOddName _handleoddnameIconCompatParcelizer$default = isAdded.IconCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null);
                withTypeHandler withtypehandlerWrite = AbsSavedState1.write(_skipWSOrEnd.INSTANCE.RemoteActionCompatParcelizer(), false);
                int iHashCode = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, 0));
                _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescape.handleMediaPlayPauseIfPendingOnHandler();
                _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, _handleoddnameIconCompatParcelizer$default);
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
                JsonIdentityReference.read(isAdded.read(_handleOddName.INSTANCE, assignParameter.IconCompatParcelizer(32.0f), assignParameter.IconCompatParcelizer(32.0f)), 0L, BitmapDescriptorFactory.HUE_RED, 0L, 0, _handleunrecognizedcharacterescape, 6, 30);
                _handleunrecognizedcharacterescape.AudioAttributesImplBaseParcelizer();
                _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            } else {
                _handleunrecognizedcharacterescape.IconCompatParcelizer(-1911679876);
                _handleOddName.Companion companion = _handleOddName.INSTANCE;
                withTypeHandler withtypehandlerWrite2 = AbsSavedState1.write(_skipWSOrEnd.INSTANCE.MediaBrowserCompatSearchResultReceiver(), false);
                int iHashCode2 = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, 0));
                _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler2 = _handleunrecognizedcharacterescape.handleMediaPlayPauseIfPendingOnHandler();
                _handleOddName _handleoddnameRemoteActionCompatParcelizer2 = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, companion);
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
                boolean zIconCompatParcelizer2 = _handleunrecognizedcharacterescape.IconCompatParcelizer(iconCompatParcelizer);
                Object objOnPause2 = _handleunrecognizedcharacterescape.onPause();
                if (zIconCompatParcelizer2 || objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                    objOnPause2 = new getCreatedOnDateMs() { // from class: o.newInstanceV17
                        @Override // kotlin.getCreatedOnDateMs
                        public final Object invoke() {
                            return initInternal.AudioAttributesCompatParcelizer(iconCompatParcelizer);
                        }
                    };
                    _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause2);
                }
                getCreatedOnDateMs getcreatedondatems = (getCreatedOnDateMs) objOnPause2;
                boolean zIconCompatParcelizer3 = _handleunrecognizedcharacterescape.IconCompatParcelizer(context);
                boolean zIconCompatParcelizer4 = _handleunrecognizedcharacterescape.IconCompatParcelizer(bookmarkLandingViewModel);
                Object objOnPause3 = _handleunrecognizedcharacterescape.onPause();
                if ((zIconCompatParcelizer3 | zIconCompatParcelizer4) || objOnPause3 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                    objOnPause3 = new getAnswerMap() { // from class: o.VideoDecoderGLSurfaceViewRenderer
                        @Override // kotlin.getAnswerMap
                        public final Object invoke(Object obj) {
                            return initInternal.RemoteActionCompatParcelizer(context, bookmarkLandingViewModel, (onDisplayInfoChanged) obj);
                        }
                    };
                    _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause3);
                }
                getAnswerMap getanswermap = (getAnswerMap) objOnPause3;
                boolean zIconCompatParcelizer5 = _handleunrecognizedcharacterescape.IconCompatParcelizer(context);
                boolean zIconCompatParcelizer6 = _handleunrecognizedcharacterescape.IconCompatParcelizer(bookmarkLandingViewModel);
                Object objOnPause4 = _handleunrecognizedcharacterescape.onPause();
                if ((zIconCompatParcelizer5 | zIconCompatParcelizer6) || objOnPause4 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                    objOnPause4 = new MagicModuleSubmissionRequestBody() { // from class: o.isSecureSupported
                        @Override // kotlin.MagicModuleSubmissionRequestBody
                        public final Object invoke(Object obj, Object obj2) {
                            return initInternal.IconCompatParcelizer(context, bookmarkLandingViewModel, (String) obj, (String) obj2);
                        }
                    };
                    _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause4);
                }
                MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody = (MagicModuleSubmissionRequestBody) objOnPause4;
                boolean zIconCompatParcelizer7 = _handleunrecognizedcharacterescape.IconCompatParcelizer(context);
                boolean zIconCompatParcelizer8 = _handleunrecognizedcharacterescape.IconCompatParcelizer(bookmarkLandingViewModel);
                Object objOnPause5 = _handleunrecognizedcharacterescape.onPause();
                if ((zIconCompatParcelizer7 | zIconCompatParcelizer8) || objOnPause5 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                    objOnPause5 = new getCreatedOnDateMs() { // from class: o.onDrawFrame
                        @Override // kotlin.getCreatedOnDateMs
                        public final Object invoke() {
                            return initInternal.AudioAttributesCompatParcelizer(context, bookmarkLandingViewModel);
                        }
                    };
                    _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause5);
                }
                updateSurfaceMediaFrameRate.IconCompatParcelizer(maybebuilddisplayhelper, getcreatedondatems, getanswermap, magicModuleSubmissionRequestBody, (getCreatedOnDateMs) objOnPause5, _handleunrecognizedcharacterescape, 0);
                _handleunrecognizedcharacterescape.AudioAttributesImplBaseParcelizer();
                _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            }
            if (updatesurfaceplaybackframerate instanceof updateSurfacePlaybackFrameRate.write) {
                _handleunrecognizedcharacterescape.IconCompatParcelizer(-1910357974);
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
                boolean zIconCompatParcelizer9 = _handleunrecognizedcharacterescape.IconCompatParcelizer(context);
                boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(updatesurfaceplaybackframerate);
                Object objOnPause6 = _handleunrecognizedcharacterescape.onPause();
                if ((zIconCompatParcelizer9 | zAudioAttributesCompatParcelizer) || objOnPause6 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                    objOnPause6 = (MagicModuleSubmissionRequestBody) new write(context, updatesurfaceplaybackframerate, null);
                    _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause6);
                }
                StreamReadException.IconCompatParcelizer(getshowpopup, (MagicModuleSubmissionRequestBody) objOnPause6, _handleunrecognizedcharacterescape, 6);
                bookmarkLandingViewModel.write(adjustmentAllowed.AudioAttributesCompatParcelizer.INSTANCE);
                _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            } else {
                if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(updatesurfaceplaybackframerate, updateSurfacePlaybackFrameRate.read.INSTANCE)) {
                    _handleunrecognizedcharacterescape.IconCompatParcelizer(-1308552752);
                    _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
                    throw new RenewEligibleCreator();
                }
                _handleunrecognizedcharacterescape.IconCompatParcelizer(-1910108021);
                _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            }
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(BookmarkLandingViewModel bookmarkLandingViewModel, anyIgnorals.read readVar) {
        toMagicModuleMetaRepoModel.write(readVar, "");
        bookmarkLandingViewModel.write(new adjustmentAllowed.write(readVar));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(onSetRating onsetrating) {
        if (onsetrating != null) {
            onsetrating.RemoteActionCompatParcelizer();
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(Context context, BookmarkLandingViewModel bookmarkLandingViewModel) {
        isTransferHdr.Companion readVar = isTransferHdr.INSTANCE;
        context.startActivity(isTransferHdr.Companion.IconCompatParcelizer(context, new isoColorPrimariesToColorSpace(null, null, isBufferLate.IconCompatParcelizer, null, 11, null)));
        bookmarkLandingViewModel.write(adjustmentAllowed.read.INSTANCE);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(Context context, BookmarkLandingViewModel bookmarkLandingViewModel, onDisplayInfoChanged ondisplayinfochanged) {
        toMagicModuleMetaRepoModel.write(ondisplayinfochanged, "");
        isTransferHdr.Companion readVar = isTransferHdr.INSTANCE;
        context.startActivity(isTransferHdr.Companion.IconCompatParcelizer(context, new isoColorPrimariesToColorSpace(null, ondisplayinfochanged, isBufferLate.IconCompatParcelizer, null, 9, null)));
        bookmarkLandingViewModel.write(new adjustmentAllowed.IconCompatParcelizer(NonNullApi.IconCompatParcelizer(ondisplayinfochanged)));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(Context context, BookmarkLandingViewModel bookmarkLandingViewModel, String str, String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        isTransferHdr.Companion readVar = isTransferHdr.INSTANCE;
        context.startActivity(isTransferHdr.Companion.IconCompatParcelizer(context, new isoColorPrimariesToColorSpace(str, null, isBufferLate.IconCompatParcelizer, null, 10, null)));
        bookmarkLandingViewModel.write(new adjustmentAllowed.AudioAttributesImplApi26Parcelizer(str2));
        return getShowPopup.INSTANCE;
    }

    static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ updateSurfacePlaybackFrameRate IconCompatParcelizer;
        private /* synthetic */ Context RemoteActionCompatParcelizer;
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            CmcdConfigurationRequestConfig.read(this.RemoteActionCompatParcelizer, ((updateSurfacePlaybackFrameRate.write) this.IconCompatParcelizer).AudioAttributesCompatParcelizer(), 0);
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        write(Context context, updateSurfacePlaybackFrameRate updatesurfaceplaybackframerate, SampleVideos<? super write> sampleVideos) {
            super(2, sampleVideos);
            this.RemoteActionCompatParcelizer = context;
            this.IconCompatParcelizer = updatesurfaceplaybackframerate;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new write(this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-345477722, i, -1, "com.marrow2.ui.bookmark.landing.ComposableSingletons$BookmarkLandingFragmentKt.lambda$-345477722.<anonymous> (BookmarkLandingFragment.kt:138)");
            }
            maybeBuildDisplayHelper maybebuilddisplayhelper = new maybeBuildDisplayHelper(false, 1000, IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new clearSurfaceFrameRate[]{new clearSurfaceFrameRate(onDisplayInfoChanged.write, 100), new clearSurfaceFrameRate(onDisplayInfoChanged.write, 100), new clearSurfaceFrameRate(onDisplayInfoChanged.write, 100)}), IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new adjustReleaseTime[]{new adjustReleaseTime("", "dsadasd", 100), new adjustReleaseTime("", "dsadasd", 100), new adjustReleaseTime("", "dsadasd", 100), new adjustReleaseTime("", "dsadasd", 100)}), null, 16, null);
            Object objOnPause = _handleunrecognizedcharacterescape.onPause();
            if (objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new getCreatedOnDateMs() { // from class: o.setupTextures
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return initInternal.IconCompatParcelizer();
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
            }
            getCreatedOnDateMs getcreatedondatems = (getCreatedOnDateMs) objOnPause;
            Object objOnPause2 = _handleunrecognizedcharacterescape.onPause();
            if (objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause2 = new getAnswerMap() { // from class: o.r8lambdaz4bsodAnebKxSHBPWxla4gMIg
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return initInternal.AudioAttributesCompatParcelizer((onDisplayInfoChanged) obj);
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause2);
            }
            getAnswerMap getanswermap = (getAnswerMap) objOnPause2;
            Object objOnPause3 = _handleunrecognizedcharacterescape.onPause();
            if (objOnPause3 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause3 = new MagicModuleSubmissionRequestBody() { // from class: o.onSurfaceCreated
                    @Override // kotlin.MagicModuleSubmissionRequestBody
                    public final Object invoke(Object obj, Object obj2) {
                        return initInternal.read((String) obj, (String) obj2);
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause3);
            }
            MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody = (MagicModuleSubmissionRequestBody) objOnPause3;
            Object objOnPause4 = _handleunrecognizedcharacterescape.onPause();
            if (objOnPause4 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause4 = new getCreatedOnDateMs() { // from class: o.VideoDecoderOutputBufferRenderer
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return initInternal.MediaBrowserCompatCustomActionResultReceiver();
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause4);
            }
            updateSurfaceMediaFrameRate.IconCompatParcelizer(maybebuilddisplayhelper, getcreatedondatems, getanswermap, magicModuleSubmissionRequestBody, (getCreatedOnDateMs) objOnPause4, _handleunrecognizedcharacterescape, 28080);
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
    public static final getShowPopup MediaBrowserCompatCustomActionResultReceiver() {
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(onDisplayInfoChanged ondisplayinfochanged) {
        toMagicModuleMetaRepoModel.write(ondisplayinfochanged, "");
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(String str, String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        return getShowPopup.INSTANCE;
    }

    public static MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> AudioAttributesCompatParcelizer() {
        return IconCompatParcelizer;
    }

    public static MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> read() {
        return read;
    }
}
