package kotlin;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.util.DeviceProperties;
import com.marrow.R;
import com.marrow2.ui.common.google_sign_in.GoogleSignUpViewModel;
import com.marrow2.ui.signup.email.viewmodel.SignUpEmailViewModel;
import kotlin.Metadata;
import kotlin.PatternItem;
import kotlin.StreetViewSource;
import kotlin.StringResourceValueReader;
import kotlin.VisibilityChecker;
import kotlin.addHole;
import kotlin.shouldEscapeCharacter;
import kotlin.withFieldVisibility;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0003R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0010\u001a\u00020\u00188CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u001bR\u001b\u0010\u0019\u001a\u00020\u001c8CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u0015\u0010\u001dR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001f"}, d2 = {"Lo/flat;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "write", "AudioAttributesImplApi26Parcelizer", "AudioAttributesCompatParcelizer", "MediaBrowserCompatCustomActionResultReceiver", "Lo/publish;", "read", "Lo/publish;", "RemoteActionCompatParcelizer", "Lcom/marrow2/ui/signup/email/viewmodel/SignUpEmailViewModel;", "IconCompatParcelizer", "Lo/RenewEligible;", "()Lcom/marrow2/ui/signup/email/viewmodel/SignUpEmailViewModel;", "Lcom/marrow2/ui/common/google_sign_in/GoogleSignUpViewModel;", "()Lcom/marrow2/ui/common/google_sign_in/GoogleSignUpViewModel;", "Lo/extractRoll;", "Lo/extractRoll;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class flat extends getInfoWindowAnchorU {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private extractRoll AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final RenewEligible write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final RenewEligible IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private publish RemoteActionCompatParcelizer;

    public flat() {
        flat flatVar = this;
        RenewEligible renewEligibleWrite = getRenewExpiresOn.write(RenewEligibleCompanion.read, new AnonymousClass1(new AnonymousClass3(flatVar)));
        this.write = _resolveFieldVsGetter.RemoteActionCompatParcelizer(toMagicModuleMetaDataUcModel.write(SignUpEmailViewModel.class), new AnonymousClass5(renewEligibleWrite), new AnonymousClass2(renewEligibleWrite), new AnonymousClass10(flatVar, renewEligibleWrite));
        RenewEligible renewEligibleWrite2 = getRenewExpiresOn.write(RenewEligibleCompanion.read, new AnonymousClass6(new AnonymousClass9(flatVar)));
        this.IconCompatParcelizer = _resolveFieldVsGetter.RemoteActionCompatParcelizer(toMagicModuleMetaDataUcModel.write(GoogleSignUpViewModel.class), new AnonymousClass7(renewEligibleWrite2), new AnonymousClass8(renewEligibleWrite2), new AnonymousClass4(flatVar, renewEligibleWrite2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SignUpEmailViewModel RemoteActionCompatParcelizer() {
        return (SignUpEmailViewModel) this.write.RemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GoogleSignUpViewModel read() {
        return (GoogleSignUpViewModel) this.IconCompatParcelizer.RemoteActionCompatParcelizer();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        publish publishVarIconCompatParcelizer = publish.IconCompatParcelizer(p0, p1);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(publishVarIconCompatParcelizer, "");
        this.RemoteActionCompatParcelizer = publishVarIconCompatParcelizer;
        if (publishVarIconCompatParcelizer == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            publishVarIconCompatParcelizer = null;
        }
        ConstraintLayout constraintLayoutIconCompatParcelizer = publishVarIconCompatParcelizer.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayoutIconCompatParcelizer, "");
        return constraintLayoutIconCompatParcelizer;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View p0, Bundle p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onViewCreated(p0, p1);
        write();
        AudioAttributesCompatParcelizer();
        MediaBrowserCompatCustomActionResultReceiver();
        AudioAttributesImplApi26Parcelizer();
        flat flatVar = this;
        publish publishVar = this.RemoteActionCompatParcelizer;
        if (publishVar == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            publishVar = null;
        }
        CardView cardView = publishVar.write;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(cardView, "");
        this.AudioAttributesCompatParcelizer = new extractRoll(flatVar, cardView, read(), new getCreatedOnDateMs() { // from class: o.rotation
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return flat.MediaBrowserCompatItemReceiver(this.write);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatItemReceiver(flat flatVar) {
        flatVar.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer(addHole.RemoteActionCompatParcelizer.INSTANCE);
        return getShowPopup.INSTANCE;
    }

    public static final class IconCompatParcelizer implements TextWatcher {
        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public IconCompatParcelizer() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            flat.this.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer(new addHole.AudioAttributesCompatParcelizer(String.valueOf(editable)));
            flat.this.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer(addHole.read.INSTANCE);
        }
    }

    private final void write() {
        publish publishVar = this.RemoteActionCompatParcelizer;
        publish publishVar2 = null;
        if (publishVar == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            publishVar = null;
        }
        Toolbar toolbar = publishVar.AudioAttributesImplBaseParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(toolbar, "");
        getHttpMethodString.read((View) toolbar, true, false, true, true, 0, 50);
        publish publishVar3 = this.RemoteActionCompatParcelizer;
        if (publishVar3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            publishVar2 = publishVar3;
        }
        ScrollView scrollView = publishVar2.MediaBrowserCompatCustomActionResultReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(scrollView, "");
        getHttpMethodString.read((View) scrollView, false, true, true, true, 0, 49);
    }

    private final void AudioAttributesImplApi26Parcelizer() {
        if (DeviceProperties.isTablet(requireContext())) {
            Context contextRequireContext = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
            publish publishVar = this.RemoteActionCompatParcelizer;
            if (publishVar == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                publishVar = null;
            }
            LinearLayout linearLayout = publishVar.IconCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
            bytesRead.AudioAttributesCompatParcelizer(contextRequireContext, linearLayout);
        }
    }

    private final void AudioAttributesCompatParcelizer() {
        publish publishVar = this.RemoteActionCompatParcelizer;
        publish publishVar2 = null;
        if (publishVar == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            publishVar = null;
        }
        publishVar.AudioAttributesCompatParcelizer.requestFocus();
        publish publishVar3 = this.RemoteActionCompatParcelizer;
        if (publishVar3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            publishVar3 = null;
        }
        publishVar3.AudioAttributesImplBaseParcelizer.setNavigationOnClickListener(new View.OnClickListener() { // from class: o.infoWindowAnchor
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                flat.MediaBrowserCompatCustomActionResultReceiver(this.AudioAttributesCompatParcelizer);
            }
        });
        publish publishVar4 = this.RemoteActionCompatParcelizer;
        if (publishVar4 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            publishVar4 = null;
        }
        EditText editText = publishVar4.AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(editText, "");
        editText.addTextChangedListener(new IconCompatParcelizer());
        publish publishVar5 = this.RemoteActionCompatParcelizer;
        if (publishVar5 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            publishVar2 = publishVar5;
        }
        Button button = publishVar2.RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(button, "");
        bytesRead.IconCompatParcelizer(button, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.snippet
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return flat.AudioAttributesImplApi21Parcelizer(this.read);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MediaBrowserCompatCustomActionResultReceiver(flat flatVar) {
        maybeGetTypeVariable activity = flatVar.getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplApi21Parcelizer(flat flatVar) {
        flatVar.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer(addHole.write.INSTANCE);
        return getShowPopup.INSTANCE;
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<Boolean> setupdatedstatusAudioAttributesCompatParcelizer = flat.this.read().AudioAttributesCompatParcelizer();
                final flat flatVar = flat.this;
                this.AudioAttributesCompatParcelizer = 1;
                if (setupdatedstatusAudioAttributesCompatParcelizer.write(new getValidationToken() { // from class: o.flat.RemoteActionCompatParcelizer.5
                    @Override // kotlin.getValidationToken
                    public final /* bridge */ /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return IconCompatParcelizer(((Boolean) obj2).booleanValue());
                    }

                    private Object IconCompatParcelizer(boolean z) {
                        publish publishVar = flatVar.RemoteActionCompatParcelizer;
                        if (publishVar == null) {
                            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            publishVar = null;
                        }
                        ProgressBar progressBar = publishVar.read;
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar, "");
                        progressBar.setVisibility(z ? 0 : 8);
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
            throw new PlanDetailsCreator();
        }

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return flat.this.new RemoteActionCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void MediaBrowserCompatCustomActionResultReceiver() {
        flat flatVar = this;
        setBitrateKbps.RemoteActionCompatParcelizer(flatVar, new RemoteActionCompatParcelizer(null));
        setBitrateKbps.RemoteActionCompatParcelizer(flatVar, new AudioAttributesCompatParcelizer(null));
        setBitrateKbps.read(flatVar, new read(null));
    }

    /* JADX INFO: renamed from: o.flat$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Landroidx/fragment/app/Fragment;", "read", "()Landroidx/fragment/app/Fragment;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<Fragment> {
        private /* synthetic */ Fragment $IconCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.$IconCompatParcelizer;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Fragment fragment) {
            super(0);
            this.$IconCompatParcelizer = fragment;
        }
    }

    /* JADX INFO: renamed from: o.flat$9, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Landroidx/fragment/app/Fragment;", "RemoteActionCompatParcelizer", "()Landroidx/fragment/app/Fragment;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass9 extends MagicModuleUseCase implements getCreatedOnDateMs<Fragment> {
        private /* synthetic */ Fragment $RemoteActionCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.$RemoteActionCompatParcelizer;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass9(Fragment fragment) {
            super(0);
            this.$RemoteActionCompatParcelizer = fragment;
        }
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<PatternItem> setupdatedstatus = flat.this.RemoteActionCompatParcelizer().read();
                final flat flatVar = flat.this;
                this.AudioAttributesCompatParcelizer = 1;
                if (setupdatedstatus.write(new getValidationToken() { // from class: o.flat.AudioAttributesCompatParcelizer.4
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return read((PatternItem) obj2);
                    }

                    private Object read(PatternItem patternItem) {
                        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(patternItem, PatternItem.read.INSTANCE)) {
                            if (patternItem instanceof PatternItem.IconCompatParcelizer) {
                                StringResourceValueReader.Companion companion = StringResourceValueReader.INSTANCE;
                                Context contextRequireContext = flatVar.requireContext();
                                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
                                flatVar.startActivity(StringResourceValueReader.Companion.IconCompatParcelizer(contextRequireContext, ((PatternItem.IconCompatParcelizer) patternItem).AudioAttributesCompatParcelizer()));
                            } else if (patternItem instanceof PatternItem.AudioAttributesCompatParcelizer) {
                                CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer(flatVar, ((PatternItem.AudioAttributesCompatParcelizer) patternItem).IconCompatParcelizer(), 0);
                            } else if (patternItem instanceof PatternItem.AudioAttributesImplApi21Parcelizer) {
                                flat flatVar2 = flatVar;
                                StreetViewSource.Companion companion2 = StreetViewSource.INSTANCE;
                                Context contextRequireContext2 = flatVar.requireContext();
                                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext2, "");
                                flatVar2.startActivity(StreetViewSource.Companion.IconCompatParcelizer(contextRequireContext2, ((PatternItem.AudioAttributesImplApi21Parcelizer) patternItem).AudioAttributesCompatParcelizer()));
                            } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(patternItem, PatternItem.MediaBrowserCompatCustomActionResultReceiver.INSTANCE)) {
                                flat flatVar3 = flatVar;
                                flat flatVar4 = flatVar3;
                                String string = flatVar3.getString(R.string.app_error_no_internet);
                                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
                                CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer(flatVar4, string, 0);
                            } else {
                                publish publishVar = null;
                                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(patternItem, PatternItem.RemoteActionCompatParcelizer.INSTANCE)) {
                                    publish publishVar2 = flatVar.RemoteActionCompatParcelizer;
                                    if (publishVar2 == null) {
                                        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                    } else {
                                        publishVar = publishVar2;
                                    }
                                    publishVar.AudioAttributesCompatParcelizer.setError(flatVar.getString(R.string.emailid_invalid));
                                } else {
                                    if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(patternItem, PatternItem.write.INSTANCE)) {
                                        throw new RenewEligibleCreator();
                                    }
                                    shouldEscapeCharacter.Companion companion3 = shouldEscapeCharacter.INSTANCE;
                                    publish publishVar3 = flatVar.RemoteActionCompatParcelizer;
                                    if (publishVar3 == null) {
                                        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                    } else {
                                        publishVar = publishVar3;
                                    }
                                    shouldEscapeCharacter.Companion.IconCompatParcelizer((View) publishVar.AudioAttributesCompatParcelizer);
                                }
                            }
                        }
                        flatVar.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer(addHole.read.INSTANCE);
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
            throw new PlanDetailsCreator();
        }

        AudioAttributesCompatParcelizer(SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return flat.this.new AudioAttributesCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: o.flat$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/TypeResolutionContext;", "read", "()Lo/TypeResolutionContext;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<TypeResolutionContext> {
        private /* synthetic */ getCreatedOnDateMs $read;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final TypeResolutionContext invoke() {
            return (TypeResolutionContext) this.$read.invoke();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(getCreatedOnDateMs getcreatedondatems) {
            super(0);
            this.$read = getcreatedondatems;
        }
    }

    /* JADX INFO: renamed from: o.flat$6, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/TypeResolutionContext;", "IconCompatParcelizer", "()Lo/TypeResolutionContext;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass6 extends MagicModuleUseCase implements getCreatedOnDateMs<TypeResolutionContext> {
        private /* synthetic */ getCreatedOnDateMs $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final TypeResolutionContext invoke() {
            return (TypeResolutionContext) this.$write.invoke();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(getCreatedOnDateMs getcreatedondatems) {
            super(0);
            this.$write = getcreatedondatems;
        }
    }

    /* JADX INFO: renamed from: o.flat$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "write", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ RenewEligible $IconCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return _resolveFieldVsGetter.write(this.$IconCompatParcelizer).getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(RenewEligible renewEligible) {
            super(0);
            this.$IconCompatParcelizer = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.flat$7, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "AudioAttributesCompatParcelizer", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass7 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ RenewEligible $RemoteActionCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return _resolveFieldVsGetter.write(this.$RemoteActionCompatParcelizer).getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(RenewEligible renewEligible) {
            super(0);
            this.$RemoteActionCompatParcelizer = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.flat$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "AudioAttributesCompatParcelizer", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass2 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ getCreatedOnDateMs $RemoteActionCompatParcelizer = null;
        private /* synthetic */ RenewEligible $read;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final withFieldVisibility invoke() {
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$read);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return anyexplicitswithoutignoral != null ? anyexplicitswithoutignoral.getDefaultViewModelCreationExtras() : withFieldVisibility.write.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(RenewEligible renewEligible) {
            super(0);
            this.$read = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.flat$8, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "IconCompatParcelizer", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass8 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ RenewEligible $AudioAttributesCompatParcelizer;
        private /* synthetic */ getCreatedOnDateMs $RemoteActionCompatParcelizer = null;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final withFieldVisibility invoke() {
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$AudioAttributesCompatParcelizer);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return anyexplicitswithoutignoral != null ? anyexplicitswithoutignoral.getDefaultViewModelCreationExtras() : withFieldVisibility.write.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass8(RenewEligible renewEligible) {
            super(0);
            this.$AudioAttributesCompatParcelizer = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.flat$10, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "IconCompatParcelizer", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass10 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ RenewEligible $AudioAttributesCompatParcelizer;
        private /* synthetic */ Fragment $read;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            VisibilityChecker.RemoteActionCompatParcelizer defaultViewModelProviderFactory;
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$AudioAttributesCompatParcelizer);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return (anyexplicitswithoutignoral == null || (defaultViewModelProviderFactory = anyexplicitswithoutignoral.getDefaultViewModelProviderFactory()) == null) ? this.$read.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass10(Fragment fragment, RenewEligible renewEligible) {
            super(0);
            this.$read = fragment;
            this.$AudioAttributesCompatParcelizer = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.flat$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "AudioAttributesCompatParcelizer", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass4 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ RenewEligible $AudioAttributesCompatParcelizer;
        private /* synthetic */ Fragment $IconCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            VisibilityChecker.RemoteActionCompatParcelizer defaultViewModelProviderFactory;
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$AudioAttributesCompatParcelizer);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return (anyexplicitswithoutignoral == null || (defaultViewModelProviderFactory = anyexplicitswithoutignoral.getDefaultViewModelProviderFactory()) == null) ? this.$IconCompatParcelizer.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(Fragment fragment, RenewEligible renewEligible) {
            super(0);
            this.$IconCompatParcelizer = fragment;
            this.$AudioAttributesCompatParcelizer = renewEligible;
        }
    }

    static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<Boolean> setupdatedstatusIconCompatParcelizer = flat.this.RemoteActionCompatParcelizer().IconCompatParcelizer();
                final flat flatVar = flat.this;
                this.RemoteActionCompatParcelizer = 1;
                if (setupdatedstatusIconCompatParcelizer.write(new getValidationToken() { // from class: o.flat.read.2
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return RemoteActionCompatParcelizer(((Boolean) obj2).booleanValue());
                    }

                    private Object RemoteActionCompatParcelizer(boolean z) {
                        publish publishVar = flatVar.RemoteActionCompatParcelizer;
                        if (publishVar == null) {
                            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            publishVar = null;
                        }
                        ProgressBar progressBar = publishVar.read;
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar, "");
                        progressBar.setVisibility(z ? 0 : 8);
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
            throw new PlanDetailsCreator();
        }

        read(SampleVideos<? super read> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return flat.this.new read(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: o.flat$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/flat$write;", "", "<init>", "()V", "Lo/flat;", "AudioAttributesCompatParcelizer", "()Lo/flat;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static flat AudioAttributesCompatParcelizer() {
            return new flat();
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
