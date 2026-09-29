package kotlin;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.marrow.data.models.user.NotesDispatchAddressRequestKt;
import com.marrow2.ui.test.gtanalytics.GTAnalyticsViewModel;
import kotlin.Metadata;
import kotlin.SuccessContinuation;
import kotlin.VisibilityChecker;
import kotlin.forCanceled;
import kotlin.isEmailRequired;
import kotlin.isShippingAddressRequired;
import kotlin.setActionUri;
import kotlin.setReferenceCounted;
import kotlin.withFieldVisibility;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u0010\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0013H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001a²\u0006\n\u0010\u001b\u001a\u00020\u001cX\u008a\u0084\u0002"}, d2 = {"Lcom/marrow2/ui/test/gtanalytics/GTAnalyticsFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "gtAnalyticsViewModel", "Lcom/marrow2/ui/test/gtanalytics/GTAnalyticsViewModel;", "getGtAnalyticsViewModel", "()Lcom/marrow2/ui/test/gtanalytics/GTAnalyticsViewModel;", "gtAnalyticsViewModel$delegate", "Lkotlin/Lazy;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "handleUiAction", "event", "Lcom/marrow2/ui/test/gtanalytics/model/GtAnalyticsUIAction;", "showInfoSheet", "Companion", "app_release", NotesDispatchAddressRequestKt.KEY_STATE, "Lcom/marrow2/ui/test/gtanalytics/model/GtAnalyticsUiState;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class isHeld extends Tasks {
    public static final AudioAttributesCompatParcelizer IconCompatParcelizer = new AudioAttributesCompatParcelizer(null);
    private final RenewEligible write;

    public isHeld() {
        isHeld isheld = this;
        RenewEligible renewEligibleWrite = getRenewExpiresOn.write(RenewEligibleCompanion.read, new AnonymousClass1(new AnonymousClass5(isheld)));
        this.write = _resolveFieldVsGetter.RemoteActionCompatParcelizer(toMagicModuleMetaDataUcModel.write(GTAnalyticsViewModel.class), new AnonymousClass2(renewEligibleWrite), new AnonymousClass3(renewEligibleWrite), new AnonymousClass4(isheld, renewEligibleWrite));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GTAnalyticsViewModel read() {
        return (GTAnalyticsViewModel) this.write.RemoteActionCompatParcelizer();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        toMagicModuleMetaRepoModel.write(inflater, "");
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setContent(multiplyFft.IconCompatParcelizer(1392873738, true, new MagicModuleSubmissionRequestBody() { // from class: o.Continuation
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return isHeld.read(this.IconCompatParcelizer, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
            }
        }));
        return composeView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(final isHeld isheld, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1392873738, i, -1, "com.marrow2.ui.test.gtanalytics.GTAnalyticsFragment.onCreateView.<anonymous>.<anonymous> (GTAnalyticsFragment.kt:37)");
            }
            parseDouble parsedouble = _qbuf.read(isheld.read().read(), (CurrentQuery) null, _handleunrecognizedcharacterescape, 0, 1);
            isEmailRequired isemailrequiredAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer((parseDouble<? extends isEmailRequired>) parsedouble);
            boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(parsedouble);
            boolean zIconCompatParcelizer = _handleunrecognizedcharacterescape.IconCompatParcelizer(isheld);
            Object objOnPause = _handleunrecognizedcharacterescape.onPause();
            if ((zAudioAttributesCompatParcelizer | zIconCompatParcelizer) || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = (MagicModuleSubmissionRequestBody) new read(parsedouble, isheld, null);
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
            }
            StreamReadException.IconCompatParcelizer(isemailrequiredAudioAttributesCompatParcelizer, (MagicModuleSubmissionRequestBody) objOnPause, _handleunrecognizedcharacterescape, 0);
            isEmailRequired isemailrequiredAudioAttributesCompatParcelizer2 = AudioAttributesCompatParcelizer((parseDouble<? extends isEmailRequired>) parsedouble);
            boolean zIconCompatParcelizer2 = _handleunrecognizedcharacterescape.IconCompatParcelizer(isheld);
            Object objOnPause2 = _handleunrecognizedcharacterescape.onPause();
            if (zIconCompatParcelizer2 || objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause2 = new getCreatedOnDateMs() { // from class: o.isCancellationRequested
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return isHeld.MediaBrowserCompatCustomActionResultReceiver(this.read);
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause2);
            }
            getCreatedOnDateMs getcreatedondatems = (getCreatedOnDateMs) objOnPause2;
            boolean zIconCompatParcelizer3 = _handleunrecognizedcharacterescape.IconCompatParcelizer(isheld);
            Object objOnPause3 = _handleunrecognizedcharacterescape.onPause();
            if (zIconCompatParcelizer3 || objOnPause3 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause3 = new getAnswerMap() { // from class: o.onCanceledRequested
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return isHeld.AudioAttributesCompatParcelizer(this.write, ((Integer) obj).intValue());
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause3);
            }
            getAnswerMap getanswermap = (getAnswerMap) objOnPause3;
            boolean zIconCompatParcelizer4 = _handleunrecognizedcharacterescape.IconCompatParcelizer(isheld);
            Object objOnPause4 = _handleunrecognizedcharacterescape.onPause();
            if (zIconCompatParcelizer4 || objOnPause4 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause4 = new getAnswerMap() { // from class: o.CancellationTokenSource
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return isHeld.read(this.write, (PaymentDataRequestBuilder) obj);
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause4);
            }
            getAnswerMap getanswermap2 = (getAnswerMap) objOnPause4;
            boolean zIconCompatParcelizer5 = _handleunrecognizedcharacterescape.IconCompatParcelizer(isheld);
            Object objOnPause5 = _handleunrecognizedcharacterescape.onPause();
            if (zIconCompatParcelizer5 || objOnPause5 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause5 = new getCreatedOnDateMs() { // from class: o.CancellationToken
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return isHeld.AudioAttributesImplApi26Parcelizer(this.AudioAttributesCompatParcelizer);
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause5);
            }
            getCreatedOnDateMs getcreatedondatems2 = (getCreatedOnDateMs) objOnPause5;
            boolean zIconCompatParcelizer6 = _handleunrecognizedcharacterescape.IconCompatParcelizer(isheld);
            Object objOnPause6 = _handleunrecognizedcharacterescape.onPause();
            if (zIconCompatParcelizer6 || objOnPause6 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause6 = new MagicModuleSubmissionRequestBody() { // from class: o.OnCanceledListener
                    @Override // kotlin.MagicModuleSubmissionRequestBody
                    public final Object invoke(Object obj, Object obj2) {
                        return isHeld.IconCompatParcelizer(this.IconCompatParcelizer, (String) obj, (String) obj2);
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause6);
            }
            MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody = (MagicModuleSubmissionRequestBody) objOnPause6;
            boolean zIconCompatParcelizer7 = _handleunrecognizedcharacterescape.IconCompatParcelizer(isheld);
            Object objOnPause7 = _handleunrecognizedcharacterescape.onPause();
            if (zIconCompatParcelizer7 || objOnPause7 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause7 = new getAnswerMap() { // from class: o.nativeOnComplete
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return isHeld.IconCompatParcelizer(this.read, ((Integer) obj).intValue());
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause7);
            }
            getAnswerMap getanswermap3 = (getAnswerMap) objOnPause7;
            boolean zIconCompatParcelizer8 = _handleunrecognizedcharacterescape.IconCompatParcelizer(isheld);
            Object objOnPause8 = _handleunrecognizedcharacterescape.onPause();
            if (zIconCompatParcelizer8 || objOnPause8 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause8 = new getAnswerMap() { // from class: o.NativeOnCompleteListener
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return isHeld.AudioAttributesCompatParcelizer(this.read, (String) obj);
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause8);
            }
            getAnswerMap getanswermap4 = (getAnswerMap) objOnPause8;
            boolean zIconCompatParcelizer9 = _handleunrecognizedcharacterescape.IconCompatParcelizer(isheld);
            Object objOnPause9 = _handleunrecognizedcharacterescape.onPause();
            if (zIconCompatParcelizer9 || objOnPause9 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause9 = new getCreatedOnDateMs() { // from class: o.CodePackage
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return isHeld.MediaBrowserCompatItemReceiver(this.RemoteActionCompatParcelizer);
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause9);
            }
            getCreatedOnDateMs getcreatedondatems3 = (getCreatedOnDateMs) objOnPause9;
            boolean zIconCompatParcelizer10 = _handleunrecognizedcharacterescape.IconCompatParcelizer(isheld);
            Object objOnPause10 = _handleunrecognizedcharacterescape.onPause();
            if (zIconCompatParcelizer10 || objOnPause10 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause10 = new getCreatedOnDateMs() { // from class: o.GCoreWakefulBroadcastReceiver
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return isHeld.AudioAttributesImplBaseParcelizer(this.AudioAttributesCompatParcelizer);
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause10);
            }
            getGiftCardWalletObject.read(isemailrequiredAudioAttributesCompatParcelizer2, (getCreatedOnDateMs<getShowPopup>) getcreatedondatems, (getAnswerMap<? super Integer, getShowPopup>) getanswermap, (getAnswerMap<? super PaymentDataRequestBuilder, getShowPopup>) getanswermap2, (getCreatedOnDateMs<getShowPopup>) getcreatedondatems2, (MagicModuleSubmissionRequestBody<? super String, ? super String, getShowPopup>) magicModuleSubmissionRequestBody, (getAnswerMap<? super Integer, getShowPopup>) getanswermap3, (getAnswerMap<? super String, getShowPopup>) getanswermap4, (getCreatedOnDateMs<getShowPopup>) getcreatedondatems3, (getCreatedOnDateMs<getShowPopup>) objOnPause10, _handleunrecognizedcharacterescape, 0);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ isHeld RemoteActionCompatParcelizer;
        private /* synthetic */ parseDouble<isEmailRequired> read;
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            isEmailRequired isemailrequiredAudioAttributesCompatParcelizer = isHeld.AudioAttributesCompatParcelizer(this.read);
            isEmailRequired.read readVar = isemailrequiredAudioAttributesCompatParcelizer instanceof isEmailRequired.read ? (isEmailRequired.read) isemailrequiredAudioAttributesCompatParcelizer : null;
            if (readVar != null) {
                isHeld isheld = this.RemoteActionCompatParcelizer;
                CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer(isheld, readVar.read(), 0);
                isheld.requireActivity().finish();
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        read(parseDouble<? extends isEmailRequired> parsedouble, isHeld isheld, SampleVideos<? super read> sampleVideos) {
            super(2, sampleVideos);
            this.read = parsedouble;
            this.RemoteActionCompatParcelizer = isheld;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new read(this.read, this.RemoteActionCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatCustomActionResultReceiver(isHeld isheld) {
        isheld.requireActivity().onBackPressed();
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(isHeld isheld, int i) {
        isheld.read().AudioAttributesCompatParcelizer(new setReferenceCounted.IconCompatParcelizer(i));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(isHeld isheld, PaymentDataRequestBuilder paymentDataRequestBuilder) {
        toMagicModuleMetaRepoModel.write(paymentDataRequestBuilder, "");
        isheld.read().AudioAttributesCompatParcelizer(new setReferenceCounted.MediaBrowserCompatItemReceiver(paymentDataRequestBuilder));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplApi26Parcelizer(isHeld isheld) {
        isheld.read().AudioAttributesCompatParcelizer(setReferenceCounted.AudioAttributesImplBaseParcelizer.INSTANCE);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(isHeld isheld, String str, String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        isheld.read().AudioAttributesCompatParcelizer(new setReferenceCounted.MediaBrowserCompatCustomActionResultReceiver(str, str2));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(isHeld isheld, int i) {
        isheld.read().AudioAttributesCompatParcelizer(new setReferenceCounted.write(i));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(isHeld isheld, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        isheld.read().AudioAttributesCompatParcelizer(new setReferenceCounted.MediaDescriptionCompat(str));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatItemReceiver(isHeld isheld) {
        isheld.read().AudioAttributesCompatParcelizer(setReferenceCounted.AudioAttributesImplApi26Parcelizer.INSTANCE);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplBaseParcelizer(isHeld isheld) {
        isheld.read().AudioAttributesCompatParcelizer(setReferenceCounted.AudioAttributesImplApi21Parcelizer.INSTANCE);
        return getShowPopup.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle savedInstanceState) {
        toMagicModuleMetaRepoModel.write(view, "");
        super.onViewCreated(view, savedInstanceState);
        getChildFragmentManager().IconCompatParcelizer("performance_analytics_info_dismiss", this, new _addFields() { // from class: o.WakeLock
            @Override // kotlin._addFields
            public final void AudioAttributesCompatParcelizer(String str, Bundle bundle) {
                isHeld.write(this.write, str, bundle);
            }
        });
        setBitrateKbps.read(this, new IconCompatParcelizer(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void write(isHeld isheld, String str, Bundle bundle) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(bundle, "");
        forCanceled.Companion companion = forCanceled.INSTANCE;
        isheld.read().AudioAttributesCompatParcelizer(new setReferenceCounted.RemoteActionCompatParcelizer(forCanceled.Companion.write(bundle)));
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                NewNumberOtpResendRequest<isShippingAddressRequired> newNumberOtpResendRequestIconCompatParcelizer = isHeld.this.read().IconCompatParcelizer();
                final isHeld isheld = isHeld.this;
                this.write = 1;
                if (newNumberOtpResendRequestIconCompatParcelizer.write(new getValidationToken() { // from class: o.isHeld.IconCompatParcelizer.3
                    private Object write(isShippingAddressRequired isshippingaddressrequired) {
                        isheld.write(isshippingaddressrequired);
                        return getShowPopup.INSTANCE;
                    }

                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return write((isShippingAddressRequired) obj2);
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

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return isHeld.this.new IconCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void write(isShippingAddressRequired isshippingaddressrequired) {
        if (isshippingaddressrequired instanceof isShippingAddressRequired.write) {
            SuccessContinuation.Companion companion = SuccessContinuation.INSTANCE;
            Context contextRequireContext = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
            isShippingAddressRequired.write writeVar = (isShippingAddressRequired.write) isshippingaddressrequired;
            startActivity(SuccessContinuation.Companion.RemoteActionCompatParcelizer(contextRequireContext, new whenAll(writeVar.IconCompatParcelizer(), writeVar.RemoteActionCompatParcelizer(), writeVar.AudioAttributesCompatParcelizer())));
            return;
        }
        if (isshippingaddressrequired instanceof isShippingAddressRequired.read) {
            setActionUri.Companion companion2 = setActionUri.INSTANCE;
            Context contextRequireContext2 = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext2, "");
            startActivity(setActionUri.Companion.read(contextRequireContext2, new setExpandedTitleTypeface(((isShippingAddressRequired.read) isshippingaddressrequired).RemoteActionCompatParcelizer(), false)));
            return;
        }
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(isshippingaddressrequired, isShippingAddressRequired.IconCompatParcelizer.INSTANCE)) {
            throw new RenewEligibleCreator();
        }
        RemoteActionCompatParcelizer();
    }

    /* JADX INFO: renamed from: o.isHeld$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Landroidx/fragment/app/Fragment;", "AudioAttributesCompatParcelizer", "()Landroidx/fragment/app/Fragment;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<Fragment> {
        private /* synthetic */ Fragment $RemoteActionCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.$RemoteActionCompatParcelizer;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(Fragment fragment) {
            super(0);
            this.$RemoteActionCompatParcelizer = fragment;
        }
    }

    /* JADX INFO: renamed from: o.isHeld$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/TypeResolutionContext;", "IconCompatParcelizer", "()Lo/TypeResolutionContext;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<TypeResolutionContext> {
        private /* synthetic */ getCreatedOnDateMs $AudioAttributesCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final TypeResolutionContext invoke() {
            return (TypeResolutionContext) this.$AudioAttributesCompatParcelizer.invoke();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(getCreatedOnDateMs getcreatedondatems) {
            super(0);
            this.$AudioAttributesCompatParcelizer = getcreatedondatems;
        }
    }

    /* JADX INFO: renamed from: o.isHeld$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "IconCompatParcelizer", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass2 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ RenewEligible $RemoteActionCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return _resolveFieldVsGetter.write(this.$RemoteActionCompatParcelizer).getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(RenewEligible renewEligible) {
            super(0);
            this.$RemoteActionCompatParcelizer = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.isHeld$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "IconCompatParcelizer", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ RenewEligible $AudioAttributesCompatParcelizer;
        private /* synthetic */ getCreatedOnDateMs $read = null;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final withFieldVisibility invoke() {
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$AudioAttributesCompatParcelizer);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return anyexplicitswithoutignoral != null ? anyexplicitswithoutignoral.getDefaultViewModelCreationExtras() : withFieldVisibility.write.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(RenewEligible renewEligible) {
            super(0);
            this.$AudioAttributesCompatParcelizer = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.isHeld$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "IconCompatParcelizer", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass4 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ Fragment $RemoteActionCompatParcelizer;
        private /* synthetic */ RenewEligible $read;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            VisibilityChecker.RemoteActionCompatParcelizer defaultViewModelProviderFactory;
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$read);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return (anyexplicitswithoutignoral == null || (defaultViewModelProviderFactory = anyexplicitswithoutignoral.getDefaultViewModelProviderFactory()) == null) ? this.$RemoteActionCompatParcelizer.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(Fragment fragment, RenewEligible renewEligible) {
            super(0);
            this.$RemoteActionCompatParcelizer = fragment;
            this.$read = renewEligible;
        }
    }

    private final void RemoteActionCompatParcelizer() {
        if (getChildFragmentManager().findFragmentByTag("performance_analytics_info_sheet") != null) {
            return;
        }
        forCanceled.Companion companion = forCanceled.INSTANCE;
        forCanceled.Companion.IconCompatParcelizer().show(getChildFragmentManager(), "performance_analytics_info_sheet");
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/isHeld$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "Lo/isHeld;", "write", "()Lo/isHeld;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer {
        private AudioAttributesCompatParcelizer() {
        }

        public static isHeld write() {
            return new isHeld();
        }

        public /* synthetic */ AudioAttributesCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final isEmailRequired AudioAttributesCompatParcelizer(parseDouble<? extends isEmailRequired> parsedouble) {
        return parsedouble.getRemoteActionCompatParcelizer();
    }
}
