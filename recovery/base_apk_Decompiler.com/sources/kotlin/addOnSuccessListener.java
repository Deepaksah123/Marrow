package kotlin;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.material.snackbar.Snackbar;
import com.marrow.R;
import com.marrow.data.models.user.NotesDispatchAddressRequestKt;
import com.marrow2.ui.test.gtanalytics.GTAnalyticsSubjectViewModel;
import kotlin.Metadata;
import kotlin.VisibilityChecker;
import kotlin.forCanceled;
import kotlin.getPaymentMethodTokenizationParameters;
import kotlin.isPhoneNumberRequired;
import kotlin.setReferenceCounted;
import kotlin.shouldEscapeCharacter;
import kotlin.withFieldVisibility;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u0010\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0013H\u0002J\u0010\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001bH\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001d²\u0006\n\u0010\u001e\u001a\u00020\u001fX\u008a\u0084\u0002"}, d2 = {"Lcom/marrow2/ui/test/gtanalytics/GtAnalyticsSubjectFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "gtAnalyticsViewModel", "Lcom/marrow2/ui/test/gtanalytics/GTAnalyticsSubjectViewModel;", "getGtAnalyticsViewModel", "()Lcom/marrow2/ui/test/gtanalytics/GTAnalyticsSubjectViewModel;", "gtAnalyticsViewModel$delegate", "Lkotlin/Lazy;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "handleUiAction", "event", "Lcom/marrow2/ui/test/gtanalytics/model/GtAnalyticsSubjectUIAction;", "showInfoSheet", "showNoWeakLessonsSnackbar", "message", "", "Companion", "app_release", NotesDispatchAddressRequestKt.KEY_STATE, "Lcom/marrow2/ui/test/gtanalytics/model/GtAnalyticsSubjectUiState;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class addOnSuccessListener extends forException {
    public static final IconCompatParcelizer AudioAttributesCompatParcelizer = new IconCompatParcelizer(null);
    private final RenewEligible RemoteActionCompatParcelizer;

    public addOnSuccessListener() {
        addOnSuccessListener addonsuccesslistener = this;
        RenewEligible renewEligibleWrite = getRenewExpiresOn.write(RenewEligibleCompanion.read, new AnonymousClass3(new AnonymousClass2(addonsuccesslistener)));
        this.RemoteActionCompatParcelizer = _resolveFieldVsGetter.RemoteActionCompatParcelizer(toMagicModuleMetaDataUcModel.write(GTAnalyticsSubjectViewModel.class), new AnonymousClass4(renewEligibleWrite), new AnonymousClass1(renewEligibleWrite), new AnonymousClass5(addonsuccesslistener, renewEligibleWrite));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GTAnalyticsSubjectViewModel write() {
        return (GTAnalyticsSubjectViewModel) this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        toMagicModuleMetaRepoModel.write(inflater, "");
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setContent(multiplyFft.IconCompatParcelizer(1180147996, true, new MagicModuleSubmissionRequestBody() { // from class: o.trySetException
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return addOnSuccessListener.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
            }
        }));
        return composeView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(final addOnSuccessListener addonsuccesslistener, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1180147996, i, -1, "com.marrow2.ui.test.gtanalytics.GtAnalyticsSubjectFragment.onCreateView.<anonymous>.<anonymous> (GtAnalyticsSubjectFragment.kt:41)");
            }
            parseDouble parsedouble = _qbuf.read(addonsuccesslistener.write().IconCompatParcelizer(), (CurrentQuery) null, _handleunrecognizedcharacterescape, 0, 1);
            isPhoneNumberRequired isphonenumberrequiredIconCompatParcelizer = IconCompatParcelizer((parseDouble<? extends isPhoneNumberRequired>) parsedouble);
            boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(parsedouble);
            boolean zIconCompatParcelizer = _handleunrecognizedcharacterescape.IconCompatParcelizer(addonsuccesslistener);
            Object objOnPause = _handleunrecognizedcharacterescape.onPause();
            if ((zAudioAttributesCompatParcelizer | zIconCompatParcelizer) || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = (MagicModuleSubmissionRequestBody) new RemoteActionCompatParcelizer(parsedouble, addonsuccesslistener, null);
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
            }
            StreamReadException.IconCompatParcelizer(isphonenumberrequiredIconCompatParcelizer, (MagicModuleSubmissionRequestBody) objOnPause, _handleunrecognizedcharacterescape, 0);
            isPhoneNumberRequired isphonenumberrequiredIconCompatParcelizer2 = IconCompatParcelizer((parseDouble<? extends isPhoneNumberRequired>) parsedouble);
            boolean zIconCompatParcelizer2 = _handleunrecognizedcharacterescape.IconCompatParcelizer(addonsuccesslistener);
            Object objOnPause2 = _handleunrecognizedcharacterescape.onPause();
            if (zIconCompatParcelizer2 || objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause2 = new getCreatedOnDateMs() { // from class: o.isComplete
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return addOnSuccessListener.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer);
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause2);
            }
            getCreatedOnDateMs getcreatedondatems = (getCreatedOnDateMs) objOnPause2;
            boolean zIconCompatParcelizer3 = _handleunrecognizedcharacterescape.IconCompatParcelizer(addonsuccesslistener);
            Object objOnPause3 = _handleunrecognizedcharacterescape.onPause();
            if (zIconCompatParcelizer3 || objOnPause3 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause3 = new getAnswerMap() { // from class: o.isSuccessful
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return addOnSuccessListener.RemoteActionCompatParcelizer(this.IconCompatParcelizer, ((Integer) obj).intValue());
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause3);
            }
            getAnswerMap getanswermap = (getAnswerMap) objOnPause3;
            boolean zIconCompatParcelizer4 = _handleunrecognizedcharacterescape.IconCompatParcelizer(addonsuccesslistener);
            Object objOnPause4 = _handleunrecognizedcharacterescape.onPause();
            if (zIconCompatParcelizer4 || objOnPause4 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause4 = new getCreatedOnDateMs() { // from class: o.continueWith
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return addOnSuccessListener.MediaBrowserCompatItemReceiver(this.AudioAttributesCompatParcelizer);
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause4);
            }
            getCreatedOnDateMs getcreatedondatems2 = (getCreatedOnDateMs) objOnPause4;
            boolean zIconCompatParcelizer5 = _handleunrecognizedcharacterescape.IconCompatParcelizer(addonsuccesslistener);
            Object objOnPause5 = _handleunrecognizedcharacterescape.onPause();
            if (zIconCompatParcelizer5 || objOnPause5 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause5 = new getAnswerMap() { // from class: o.continueWithTask
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return addOnSuccessListener.IconCompatParcelizer(this.write, (String) obj);
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause5);
            }
            getAnswerMap getanswermap2 = (getAnswerMap) objOnPause5;
            boolean zIconCompatParcelizer6 = _handleunrecognizedcharacterescape.IconCompatParcelizer(addonsuccesslistener);
            Object objOnPause6 = _handleunrecognizedcharacterescape.onPause();
            if (zIconCompatParcelizer6 || objOnPause6 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause6 = new getCreatedOnDateMs() { // from class: o.trySetResult
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return addOnSuccessListener.AudioAttributesImplBaseParcelizer(this.read);
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause6);
            }
            setCreateMode.RemoteActionCompatParcelizer(isphonenumberrequiredIconCompatParcelizer2, (getCreatedOnDateMs<getShowPopup>) getcreatedondatems, (getAnswerMap<? super Integer, getShowPopup>) getanswermap, (getCreatedOnDateMs<getShowPopup>) getcreatedondatems2, (getAnswerMap<? super String, getShowPopup>) getanswermap2, (getCreatedOnDateMs<getShowPopup>) objOnPause6, _handleunrecognizedcharacterescape, 0);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ addOnSuccessListener AudioAttributesCompatParcelizer;
        private /* synthetic */ parseDouble<isPhoneNumberRequired> IconCompatParcelizer;
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            isPhoneNumberRequired isphonenumberrequiredIconCompatParcelizer = addOnSuccessListener.IconCompatParcelizer(this.IconCompatParcelizer);
            isPhoneNumberRequired.RemoteActionCompatParcelizer remoteActionCompatParcelizer = isphonenumberrequiredIconCompatParcelizer instanceof isPhoneNumberRequired.RemoteActionCompatParcelizer ? (isPhoneNumberRequired.RemoteActionCompatParcelizer) isphonenumberrequiredIconCompatParcelizer : null;
            if (remoteActionCompatParcelizer != null) {
                addOnSuccessListener addonsuccesslistener = this.AudioAttributesCompatParcelizer;
                CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer(addonsuccesslistener, remoteActionCompatParcelizer.IconCompatParcelizer(), 0);
                addonsuccesslistener.requireActivity().finish();
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        RemoteActionCompatParcelizer(parseDouble<? extends isPhoneNumberRequired> parsedouble, addOnSuccessListener addonsuccesslistener, SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.IconCompatParcelizer = parsedouble;
            this.AudioAttributesCompatParcelizer = addonsuccesslistener;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new RemoteActionCompatParcelizer(this.IconCompatParcelizer, this.AudioAttributesCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(addOnSuccessListener addonsuccesslistener) {
        addonsuccesslistener.requireActivity().onBackPressed();
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(addOnSuccessListener addonsuccesslistener, int i) {
        addonsuccesslistener.write().RemoteActionCompatParcelizer(new setReferenceCounted.write(i));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatItemReceiver(addOnSuccessListener addonsuccesslistener) {
        addonsuccesslistener.write().RemoteActionCompatParcelizer(setReferenceCounted.AudioAttributesImplBaseParcelizer.INSTANCE);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(addOnSuccessListener addonsuccesslistener, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        addonsuccesslistener.write().RemoteActionCompatParcelizer(new setReferenceCounted.MediaBrowserCompatMediaItem(str));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplBaseParcelizer(addOnSuccessListener addonsuccesslistener) {
        addonsuccesslistener.write().RemoteActionCompatParcelizer(setReferenceCounted.AudioAttributesCompatParcelizer.INSTANCE);
        return getShowPopup.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle savedInstanceState) {
        toMagicModuleMetaRepoModel.write(view, "");
        super.onViewCreated(view, savedInstanceState);
        getChildFragmentManager().IconCompatParcelizer("performance_analytics_info_dismiss", this, new _addFields() { // from class: o.onSuccessTask
            @Override // kotlin._addFields
            public final void AudioAttributesCompatParcelizer(String str, Bundle bundle) {
                addOnSuccessListener.AudioAttributesCompatParcelizer(this.read, str, bundle);
            }
        });
        setBitrateKbps.read(this, new write(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesCompatParcelizer(addOnSuccessListener addonsuccesslistener, String str, Bundle bundle) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(bundle, "");
        forCanceled.Companion companion = forCanceled.INSTANCE;
        addonsuccesslistener.write().RemoteActionCompatParcelizer(new setReferenceCounted.RemoteActionCompatParcelizer(forCanceled.Companion.write(bundle)));
    }

    static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                NewNumberOtpResendRequest<getPaymentMethodTokenizationParameters> newNumberOtpResendRequestAudioAttributesCompatParcelizer = addOnSuccessListener.this.write().AudioAttributesCompatParcelizer();
                final addOnSuccessListener addonsuccesslistener = addOnSuccessListener.this;
                this.write = 1;
                if (newNumberOtpResendRequestAudioAttributesCompatParcelizer.write(new getValidationToken() { // from class: o.addOnSuccessListener.write.4
                    private Object write(getPaymentMethodTokenizationParameters getpaymentmethodtokenizationparameters) {
                        addonsuccesslistener.read(getpaymentmethodtokenizationparameters);
                        return getShowPopup.INSTANCE;
                    }

                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return write((getPaymentMethodTokenizationParameters) obj2);
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

        write(SampleVideos<? super write> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return addOnSuccessListener.this.new write(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void read(getPaymentMethodTokenizationParameters getpaymentmethodtokenizationparameters) {
        if (getpaymentmethodtokenizationparameters instanceof getPaymentMethodTokenizationParameters.read) {
            String string = getString(R.string.gta_no_weak_lessons_toast, Integer.valueOf(((getPaymentMethodTokenizationParameters.read) getpaymentmethodtokenizationparameters).AudioAttributesCompatParcelizer()));
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
            IconCompatParcelizer(string);
        } else {
            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getpaymentmethodtokenizationparameters, getPaymentMethodTokenizationParameters.AudioAttributesCompatParcelizer.INSTANCE)) {
                throw new RenewEligibleCreator();
            }
            AudioAttributesCompatParcelizer();
        }
    }

    private final void AudioAttributesCompatParcelizer() {
        if (getChildFragmentManager().findFragmentByTag("performance_analytics_info_sheet") != null) {
            return;
        }
        forCanceled.Companion companion = forCanceled.INSTANCE;
        forCanceled.Companion.IconCompatParcelizer().show(getChildFragmentManager(), "performance_analytics_info_sheet");
    }

    /* JADX INFO: renamed from: o.addOnSuccessListener$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Landroidx/fragment/app/Fragment;", "write", "()Landroidx/fragment/app/Fragment;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass2 extends MagicModuleUseCase implements getCreatedOnDateMs<Fragment> {
        private /* synthetic */ Fragment $IconCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.$IconCompatParcelizer;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Fragment fragment) {
            super(0);
            this.$IconCompatParcelizer = fragment;
        }
    }

    private final void IconCompatParcelizer(String str) {
        View view = getView();
        if (view == null) {
            return;
        }
        Context context = view.getContext();
        Snackbar snackbarIconCompatParcelizer = Snackbar.IconCompatParcelizer(view, str, 0);
        shouldEscapeCharacter.Companion companion = shouldEscapeCharacter.INSTANCE;
        toMagicModuleMetaRepoModel.write(context);
        Snackbar snackbarAudioAttributesImplBaseParcelizer = snackbarIconCompatParcelizer.AudioAttributesImplBaseParcelizer(shouldEscapeCharacter.Companion.read(context, R.attr.inverse, new TypedValue(), true));
        shouldEscapeCharacter.Companion companion2 = shouldEscapeCharacter.INSTANCE;
        Snackbar snackbarAudioAttributesImplApi21Parcelizer = snackbarAudioAttributesImplBaseParcelizer.AudioAttributesImplApi21Parcelizer(shouldEscapeCharacter.Companion.read(context, R.attr.onInverse, new TypedValue(), true));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(snackbarAudioAttributesImplApi21Parcelizer, "");
        TextView textView = (TextView) snackbarAudioAttributesImplApi21Parcelizer.IconCompatParcelizer().findViewById(R.id.snackbar_text);
        if (textView != null) {
            textView.setMaxLines(4);
            textView.setGravity(17);
            textView.setTextAlignment(4);
        }
        snackbarAudioAttributesImplApi21Parcelizer.AudioAttributesImplApi21Parcelizer();
    }

    /* JADX INFO: renamed from: o.addOnSuccessListener$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/TypeResolutionContext;", "write", "()Lo/TypeResolutionContext;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<TypeResolutionContext> {
        private /* synthetic */ getCreatedOnDateMs $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final TypeResolutionContext invoke() {
            return (TypeResolutionContext) this.$write.invoke();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(getCreatedOnDateMs getcreatedondatems) {
            super(0);
            this.$write = getcreatedondatems;
        }
    }

    /* JADX INFO: renamed from: o.addOnSuccessListener$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "write", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass4 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ RenewEligible $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return _resolveFieldVsGetter.write(this.$write).getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(RenewEligible renewEligible) {
            super(0);
            this.$write = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.addOnSuccessListener$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "read", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ RenewEligible $AudioAttributesCompatParcelizer;
        private /* synthetic */ getCreatedOnDateMs $RemoteActionCompatParcelizer = null;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final withFieldVisibility invoke() {
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$AudioAttributesCompatParcelizer);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return anyexplicitswithoutignoral != null ? anyexplicitswithoutignoral.getDefaultViewModelCreationExtras() : withFieldVisibility.write.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RenewEligible renewEligible) {
            super(0);
            this.$AudioAttributesCompatParcelizer = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.addOnSuccessListener$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "AudioAttributesCompatParcelizer", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ Fragment $RemoteActionCompatParcelizer;
        private /* synthetic */ RenewEligible $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            VisibilityChecker.RemoteActionCompatParcelizer defaultViewModelProviderFactory;
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$write);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return (anyexplicitswithoutignoral == null || (defaultViewModelProviderFactory = anyexplicitswithoutignoral.getDefaultViewModelProviderFactory()) == null) ? this.$RemoteActionCompatParcelizer.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(Fragment fragment, RenewEligible renewEligible) {
            super(0);
            this.$RemoteActionCompatParcelizer = fragment;
            this.$write = renewEligible;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/addOnSuccessListener$IconCompatParcelizer;", "", "<init>", "()V", "Lo/whenAll;", "p0", "Lo/addOnSuccessListener;", "RemoteActionCompatParcelizer", "(Lo/whenAll;)Lo/addOnSuccessListener;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        @getMagicModuleMeta
        public static addOnSuccessListener RemoteActionCompatParcelizer(whenAll p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            addOnSuccessListener addonsuccesslistener = new addOnSuccessListener();
            addonsuccesslistener.setArguments(p0.RemoteActionCompatParcelizer());
            return addonsuccesslistener;
        }

        public /* synthetic */ IconCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final isPhoneNumberRequired IconCompatParcelizer(parseDouble<? extends isPhoneNumberRequired> parsedouble) {
        return parsedouble.getRemoteActionCompatParcelizer();
    }
}
