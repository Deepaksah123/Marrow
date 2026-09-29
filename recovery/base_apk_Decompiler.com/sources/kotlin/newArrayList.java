package kotlin;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.designsystem.theme.AppTheme;
import com.marrow.designsystem.theme.ThemeKt;
import com.marrow.ui.activities.plan.PlanActivity;
import com.marrow2.ui.pearl.relatedmcq.RelatedMcqViewModel;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.mapOfKeyValueArrays;
import kotlin.mutableSetOfWithSize;
import kotlin.setAppId;
import kotlin.withFieldVisibility;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lo/newArrayList;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "read"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class newArrayList extends getPackageCertificateHashBytes {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: o.newArrayList$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/newArrayList$read;", "", "<init>", "()V", "Lo/mapOf;", "p0", "Lo/newArrayList;", "read", "(Lo/mapOf;)Lo/newArrayList;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static newArrayList read(mapOf p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            newArrayList newarraylist = new newArrayList();
            newarraylist.setArguments(p0.write());
            return newarraylist;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return setBitrateKbps.AudioAttributesCompatParcelizer(this, multiplyFft.IconCompatParcelizer(-1063147299, true, new MagicModuleSubmissionRequestBody() { // from class: o.encodeUrlSafeNoPadding
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return newArrayList.IconCompatParcelizer(this.IconCompatParcelizer, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(final newArrayList newarraylist, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1063147299, i, -1, "com.marrow2.ui.pearl.relatedmcq.RelatedMcqFragment.onCreateView.<anonymous> (RelatedMcqFragment.kt:58)");
            }
            MediaSessionCompatQueueItem mediaSessionCompatQueueItem = MediaSessionCompatQueueItem.INSTANCE;
            int i2 = MediaSessionCompatQueueItem.AudioAttributesCompatParcelizer;
            onSetShuffleMode onsetshufflemodeRemoteActionCompatParcelizer = MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape);
            final onSetRating iconCompatParcelizer = onsetshufflemodeRemoteActionCompatParcelizer != null ? onsetshufflemodeRemoteActionCompatParcelizer.getIconCompatParcelizer() : null;
            ThemeKt.read((AppTheme) null, false, (MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup>) multiplyFft.AudioAttributesCompatParcelizer(1511243357, true, new MagicModuleSubmissionRequestBody() { // from class: o.decodeUrlSafe
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return newArrayList.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, iconCompatParcelizer, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            }, _handleunrecognizedcharacterescape, 54), _handleunrecognizedcharacterescape, RendererCapabilities.MODE_SUPPORT_MASK, 3);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    public static final class write implements _wrapError {
        private /* synthetic */ zzks RemoteActionCompatParcelizer;

        public write(zzks zzksVar) {
            this.RemoteActionCompatParcelizer = zzksVar;
        }

        @Override // kotlin._wrapError
        public final void RemoteActionCompatParcelizer() {
            newArrayList.this.requireContext().unregisterReceiver(this.RemoteActionCompatParcelizer);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final _wrapError write(newArrayList newarraylist, final RelatedMcqViewModel relatedMcqViewModel, StreamConstraintsException streamConstraintsException) {
        toMagicModuleMetaRepoModel.write(streamConstraintsException, "");
        zzks zzksVar = new zzks(new MagicModuleSubmissionRequestBody() { // from class: o.toWrapperArray
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return newArrayList.AudioAttributesCompatParcelizer(relatedMcqViewModel, (String) obj, (onDisplayInfoChanged) obj2);
            }
        });
        if (Build.VERSION.SDK_INT >= 34) {
            newarraylist.requireContext().registerReceiver(zzksVar, zzks.write(), 4);
        } else {
            newarraylist.requireContext().registerReceiver(zzksVar, zzks.write());
        }
        return newarraylist.new write(zzksVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(RelatedMcqViewModel relatedMcqViewModel, String str, onDisplayInfoChanged ondisplayinfochanged) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(ondisplayinfochanged, "");
        relatedMcqViewModel.RemoteActionCompatParcelizer(new mutableSetOfWithSize.IconCompatParcelizer(str, ondisplayinfochanged, true, zzhs.AudioAttributesCompatParcelizer));
        return getShowPopup.INSTANCE;
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ onSetRating AudioAttributesCompatParcelizer;
        private /* synthetic */ newArrayList IconCompatParcelizer;
        private int RemoteActionCompatParcelizer;
        private /* synthetic */ RelatedMcqViewModel read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                NewNumberOtpResendRequest<mapOfKeyValueArrays> newNumberOtpResendRequestIconCompatParcelizer = this.read.IconCompatParcelizer();
                final newArrayList newarraylist = this.IconCompatParcelizer;
                final onSetRating onsetrating = this.AudioAttributesCompatParcelizer;
                this.RemoteActionCompatParcelizer = 1;
                if (newNumberOtpResendRequestIconCompatParcelizer.write(new getValidationToken() { // from class: o.newArrayList.IconCompatParcelizer.2
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return RemoteActionCompatParcelizer((mapOfKeyValueArrays) obj2);
                    }

                    private Object RemoteActionCompatParcelizer(mapOfKeyValueArrays mapofkeyvaluearrays) {
                        if (mapofkeyvaluearrays instanceof mapOfKeyValueArrays.read) {
                            setAppId.Companion companion = setAppId.INSTANCE;
                            Context contextRequireContext = newarraylist.requireContext();
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
                            mapOfKeyValueArrays.read readVar = (mapOfKeyValueArrays.read) mapofkeyvaluearrays;
                            newarraylist.startActivity(setAppId.Companion.write(contextRequireContext, readVar.AudioAttributesCompatParcelizer(), "", readBlockToCache.RemoteActionCompatParcelizer, 0, readVar.write(), 16));
                        } else if (mapofkeyvaluearrays instanceof mapOfKeyValueArrays.write) {
                            CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer(newarraylist, ((mapOfKeyValueArrays.write) mapofkeyvaluearrays).IconCompatParcelizer(), 0);
                        } else if (mapofkeyvaluearrays instanceof mapOfKeyValueArrays.RemoteActionCompatParcelizer) {
                            CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer(newarraylist, ((mapOfKeyValueArrays.RemoteActionCompatParcelizer) mapofkeyvaluearrays).read(), 0);
                            onSetRating onsetrating2 = onsetrating;
                            if (onsetrating2 != null) {
                                onsetrating2.RemoteActionCompatParcelizer();
                            }
                        } else {
                            throw new RenewEligibleCreator();
                        }
                        return getShowPopup.INSTANCE;
                    }
                }, this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(RelatedMcqViewModel relatedMcqViewModel, newArrayList newarraylist, onSetRating onsetrating, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.read = relatedMcqViewModel;
            this.IconCompatParcelizer = newarraylist;
            this.AudioAttributesCompatParcelizer = onsetrating;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new IconCompatParcelizer(this.read, this.IconCompatParcelizer, this.AudioAttributesCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(newArrayList newarraylist) {
        Context contextRequireContext = newarraylist.requireContext();
        PlanActivity.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = PlanActivity.RemoteActionCompatParcelizer;
        Context contextRequireContext2 = newarraylist.requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext2, "");
        String lowerCase = "PRO_MCQ_ACCESSED".toLowerCase(Locale.ROOT);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase, "");
        _isNaN.startActivity(contextRequireContext, PlanActivity.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(contextRequireContext2, "Pro Subscription Dialog", lowerCase), null);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(RelatedMcqViewModel relatedMcqViewModel) {
        relatedMcqViewModel.RemoteActionCompatParcelizer(mutableSetOfWithSize.write.INSTANCE);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(RelatedMcqViewModel relatedMcqViewModel) {
        relatedMcqViewModel.RemoteActionCompatParcelizer(mutableSetOfWithSize.write.INSTANCE);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(RelatedMcqViewModel relatedMcqViewModel, onDisplayInfoChanged ondisplayinfochanged, String str) {
        toMagicModuleMetaRepoModel.write(ondisplayinfochanged, "");
        toMagicModuleMetaRepoModel.write(str, "");
        relatedMcqViewModel.RemoteActionCompatParcelizer(new mutableSetOfWithSize.IconCompatParcelizer(str, ondisplayinfochanged, false, zzhs.AudioAttributesCompatParcelizer));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(RelatedMcqViewModel relatedMcqViewModel, String str, boolean z) {
        toMagicModuleMetaRepoModel.write(str, "");
        if (z) {
            relatedMcqViewModel.RemoteActionCompatParcelizer(mutableSetOfWithSize.read.INSTANCE);
        } else {
            relatedMcqViewModel.RemoteActionCompatParcelizer(new mutableSetOfWithSize.RemoteActionCompatParcelizer(str));
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(final newArrayList newarraylist, onSetRating onsetrating, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        withFieldVisibility.write defaultViewModelCreationExtras;
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1511243357, i, -1, "com.marrow2.ui.pearl.relatedmcq.RelatedMcqFragment.onCreateView.<anonymous>.<anonymous> (RelatedMcqFragment.kt:62)");
            }
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
            final RelatedMcqViewModel relatedMcqViewModel = (RelatedMcqViewModel) JDK14UtilRawTypeName.IconCompatParcelizer(toMagicModuleMetaDataUcModel.write(RelatedMcqViewModel.class), typeResolutionContextIconCompatParcelizer, null, defaultViewModelCreationExtras, _handleunrecognizedcharacterescape, 0);
            Context contextRequireContext = newarraylist.requireContext();
            boolean zIconCompatParcelizer = _handleunrecognizedcharacterescape.IconCompatParcelizer(relatedMcqViewModel);
            boolean zIconCompatParcelizer2 = _handleunrecognizedcharacterescape.IconCompatParcelizer(newarraylist);
            Object objOnPause = _handleunrecognizedcharacterescape.onPause();
            if ((zIconCompatParcelizer | zIconCompatParcelizer2) || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new getAnswerMap() { // from class: o.toArrayList
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return newArrayList.write(this.RemoteActionCompatParcelizer, relatedMcqViewModel, (StreamConstraintsException) obj);
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
            }
            StreamReadException.RemoteActionCompatParcelizer(contextRequireContext, (getAnswerMap) objOnPause, _handleunrecognizedcharacterescape, 0);
            newArrayList newarraylist2 = newarraylist;
            boolean zIconCompatParcelizer3 = _handleunrecognizedcharacterescape.IconCompatParcelizer(relatedMcqViewModel);
            boolean zIconCompatParcelizer4 = _handleunrecognizedcharacterescape.IconCompatParcelizer(newarraylist);
            boolean zIconCompatParcelizer5 = _handleunrecognizedcharacterescape.IconCompatParcelizer(onsetrating);
            Object objOnPause2 = _handleunrecognizedcharacterescape.onPause();
            if ((zIconCompatParcelizer3 | zIconCompatParcelizer4 | zIconCompatParcelizer5) || objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause2 = (MagicModuleSubmissionRequestBody) new IconCompatParcelizer(relatedMcqViewModel, newarraylist, onsetrating, null);
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause2);
            }
            setBitrateKbps.read(newarraylist2, (MagicModuleSubmissionRequestBody) objOnPause2);
            boolean zBooleanValue = ((Boolean) isSetterVisible.AudioAttributesCompatParcelizer(relatedMcqViewModel.MediaBrowserCompatCustomActionResultReceiver(), _handleunrecognizedcharacterescape, 0).getRemoteActionCompatParcelizer()).booleanValue();
            boolean zBooleanValue2 = ((Boolean) isSetterVisible.AudioAttributesCompatParcelizer(relatedMcqViewModel.MediaBrowserCompatItemReceiver(), _handleunrecognizedcharacterescape, 0).getRemoteActionCompatParcelizer()).booleanValue();
            if (zBooleanValue) {
                _handleunrecognizedcharacterescape.IconCompatParcelizer(1605920886);
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
                JsonIdentityReference.read(null, 0L, BitmapDescriptorFactory.HUE_RED, 0L, 0, _handleunrecognizedcharacterescape, 0, 31);
                _handleunrecognizedcharacterescape.AudioAttributesImplBaseParcelizer();
                _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            } else if (zBooleanValue2) {
                _handleunrecognizedcharacterescape.IconCompatParcelizer(1606170653);
                String strRemoteActionCompatParcelizer = singleArgCreatorDefaultsToProperties.RemoteActionCompatParcelizer(R.string.text_pro_placeholder_dialog_msg, new Object[]{"MCQ"}, _handleunrecognizedcharacterescape, 6);
                String str = singleArgCreatorDefaultsToProperties.read(R.string.view_plans, _handleunrecognizedcharacterescape, 6);
                String str2 = singleArgCreatorDefaultsToProperties.read(R.string.go_back, _handleunrecognizedcharacterescape, 6);
                boolean zIconCompatParcelizer6 = _handleunrecognizedcharacterescape.IconCompatParcelizer(newarraylist);
                Object objOnPause3 = _handleunrecognizedcharacterescape.onPause();
                if (zIconCompatParcelizer6 || objOnPause3 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                    objOnPause3 = new getCreatedOnDateMs() { // from class: o.Base64Utils
                        @Override // kotlin.getCreatedOnDateMs
                        public final Object invoke() {
                            return newArrayList.IconCompatParcelizer(this.IconCompatParcelizer);
                        }
                    };
                    _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause3);
                }
                getCreatedOnDateMs getcreatedondatems = (getCreatedOnDateMs) objOnPause3;
                boolean zIconCompatParcelizer7 = _handleunrecognizedcharacterescape.IconCompatParcelizer(relatedMcqViewModel);
                Object objOnPause4 = _handleunrecognizedcharacterescape.onPause();
                if (zIconCompatParcelizer7 || objOnPause4 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                    objOnPause4 = new getCreatedOnDateMs() { // from class: o.toPrimitiveArray
                        @Override // kotlin.getCreatedOnDateMs
                        public final Object invoke() {
                            return newArrayList.write(relatedMcqViewModel);
                        }
                    };
                    _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause4);
                }
                getCreatedOnDateMs getcreatedondatems2 = (getCreatedOnDateMs) objOnPause4;
                boolean zIconCompatParcelizer8 = _handleunrecognizedcharacterescape.IconCompatParcelizer(relatedMcqViewModel);
                Object objOnPause5 = _handleunrecognizedcharacterescape.onPause();
                if (zIconCompatParcelizer8 || objOnPause5 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                    objOnPause5 = new getCreatedOnDateMs() { // from class: o.BiConsumer
                        @Override // kotlin.getCreatedOnDateMs
                        public final Object invoke() {
                            return newArrayList.read(relatedMcqViewModel);
                        }
                    };
                    _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause5);
                }
                ProxyApiProxyResult.IconCompatParcelizer(null, null, strRemoteActionCompatParcelizer, null, null, 0L, false, str, str2, true, getcreatedondatems, getcreatedondatems2, (getCreatedOnDateMs) objOnPause5, false, _handleunrecognizedcharacterescape, C.ENCODING_PCM_32BIT, 3072, 123);
                _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            } else {
                _handleunrecognizedcharacterescape.IconCompatParcelizer(1607423084);
                _handleOddName _handleoddnameIconCompatParcelizer$default2 = getFrameEndSchedulerui.IconCompatParcelizer$default(isAdded.IconCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null), enabled.INSTANCE.write(_handleunrecognizedcharacterescape, enabled.RemoteActionCompatParcelizer).read(), null, 2, null);
                List<createNotificationChannel> list = relatedMcqViewModel.read();
                boolean zIconCompatParcelizer9 = _handleunrecognizedcharacterescape.IconCompatParcelizer(relatedMcqViewModel);
                Object objOnPause6 = _handleunrecognizedcharacterescape.onPause();
                if (zIconCompatParcelizer9 || objOnPause6 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                    objOnPause6 = new MagicModuleSubmissionRequestBody() { // from class: o.decodeUrlSafeNoPadding
                        @Override // kotlin.MagicModuleSubmissionRequestBody
                        public final Object invoke(Object obj, Object obj2) {
                            return newArrayList.IconCompatParcelizer(relatedMcqViewModel, (onDisplayInfoChanged) obj, (String) obj2);
                        }
                    };
                    _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause6);
                }
                MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody = (MagicModuleSubmissionRequestBody) objOnPause6;
                boolean zIconCompatParcelizer10 = _handleunrecognizedcharacterescape.IconCompatParcelizer(relatedMcqViewModel);
                Object objOnPause7 = _handleunrecognizedcharacterescape.onPause();
                if (zIconCompatParcelizer10 || objOnPause7 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                    objOnPause7 = new MagicModuleSubmissionRequestBody() { // from class: o.ClientLibraryUtils
                        @Override // kotlin.MagicModuleSubmissionRequestBody
                        public final Object invoke(Object obj, Object obj2) {
                            return newArrayList.read(relatedMcqViewModel, (String) obj, ((Boolean) obj2).booleanValue());
                        }
                    };
                    _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause7);
                }
                DynamiteApi.IconCompatParcelizer(_handleoddnameIconCompatParcelizer$default2, list, magicModuleSubmissionRequestBody, (MagicModuleSubmissionRequestBody) objOnPause7, _handleunrecognizedcharacterescape, 0, 0);
                _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            }
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }
}
