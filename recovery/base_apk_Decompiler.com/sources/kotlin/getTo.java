package kotlin;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.util.DeviceProperties;
import com.marrow.R;
import com.marrow2.ui.feedback.viewmodel.AdditionalFeedbackViewModel;
import kotlin.Metadata;
import kotlin.VisibilityChecker;
import kotlin.getServiceWithTimeout;
import kotlin.withFieldVisibility;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0003R\u0016\u0010\u0010\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0016R\u001b\u0010\u0014\u001a\u00020\u00178CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a"}, d2 = {"Lo/getTo;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "AudioAttributesCompatParcelizer", "AudioAttributesImplApi26Parcelizer", "MediaBrowserCompatCustomActionResultReceiver", "read", "write", "Lo/recreate;", "Lo/recreate;", "Lcom/marrow2/ui/feedback/viewmodel/AdditionalFeedbackViewModel;", "RemoteActionCompatParcelizer", "Lo/RenewEligible;", "()Lcom/marrow2/ui/feedback/viewmodel/AdditionalFeedbackViewModel;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class getTo extends getBroadcastExecutor {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final RenewEligible write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private recreate AudioAttributesCompatParcelizer;

    public getTo() {
        getTo getto = this;
        RenewEligible renewEligibleWrite = getRenewExpiresOn.write(RenewEligibleCompanion.read, new AnonymousClass2(new AnonymousClass3(getto)));
        this.write = _resolveFieldVsGetter.RemoteActionCompatParcelizer(toMagicModuleMetaDataUcModel.write(AdditionalFeedbackViewModel.class), new AnonymousClass5(renewEligibleWrite), new AnonymousClass4(renewEligibleWrite), new AnonymousClass1(getto, renewEligibleWrite));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AdditionalFeedbackViewModel RemoteActionCompatParcelizer() {
        return (AdditionalFeedbackViewModel) this.write.RemoteActionCompatParcelizer();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        recreate recreateVar = recreate.read(p0, p1);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(recreateVar, "");
        this.AudioAttributesCompatParcelizer = recreateVar;
        if (recreateVar == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            recreateVar = null;
        }
        LinearLayout linearLayoutIconCompatParcelizer = recreateVar.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayoutIconCompatParcelizer, "");
        return linearLayoutIconCompatParcelizer;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View p0, Bundle p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onViewCreated(p0, p1);
        AudioAttributesCompatParcelizer();
        MediaBrowserCompatCustomActionResultReceiver();
        write();
        read();
        AudioAttributesImplApi26Parcelizer();
    }

    private final void AudioAttributesCompatParcelizer() {
        recreate recreateVar = this.AudioAttributesCompatParcelizer;
        if (recreateVar == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            recreateVar = null;
        }
        LinearLayout linearLayout = recreateVar.IconCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
        getHttpMethodString.read((View) linearLayout, true, true, true, true, 0, 48);
    }

    private final void AudioAttributesImplApi26Parcelizer() {
        recreate recreateVar = this.AudioAttributesCompatParcelizer;
        recreate recreateVar2 = null;
        if (recreateVar == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            recreateVar = null;
        }
        EditText editText = recreateVar.read;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(editText, "");
        recreate recreateVar3 = this.AudioAttributesCompatParcelizer;
        if (recreateVar3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            recreateVar2 = recreateVar3;
        }
        TextView textView = recreateVar2.AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
        buildEndStateNotification.RemoteActionCompatParcelizer(editText, textView, new getCreatedOnDateMs() { // from class: o.CloudMessagingReceiver
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return getTo.MediaBrowserCompatCustomActionResultReceiver(this.write);
            }
        }, new getCreatedOnDateMs() { // from class: o.getTtl
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return getTo.AudioAttributesImplBaseParcelizer(this.AudioAttributesCompatParcelizer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatCustomActionResultReceiver(getTo getto) {
        recreate recreateVar = getto.AudioAttributesCompatParcelizer;
        recreate recreateVar2 = null;
        if (recreateVar == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            recreateVar = null;
        }
        recreateVar.read.setBackgroundResource(R.drawable.drw_edit_text_background_error);
        recreate recreateVar3 = getto.AudioAttributesCompatParcelizer;
        if (recreateVar3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            recreateVar2 = recreateVar3;
        }
        recreateVar2.AudioAttributesCompatParcelizer.setTextColor(_isNaN.getColor(getto.requireContext(), R.color.v1_onsurfaceRed));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplBaseParcelizer(getTo getto) {
        recreate recreateVar = getto.AudioAttributesCompatParcelizer;
        recreate recreateVar2 = null;
        if (recreateVar == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            recreateVar = null;
        }
        recreateVar.read.setBackgroundResource(R.drawable.drw_edit_text_background);
        recreate recreateVar3 = getto.AudioAttributesCompatParcelizer;
        if (recreateVar3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            recreateVar2 = recreateVar3;
        }
        recreateVar2.AudioAttributesCompatParcelizer.setTextColor(_isNaN.getColor(getto.requireContext(), R.color.v1_onbackgroundsurface3));
        return getShowPopup.INSTANCE;
    }

    private final void MediaBrowserCompatCustomActionResultReceiver() {
        if (DeviceProperties.isTablet(requireContext())) {
            Context contextRequireContext = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
            recreate recreateVar = this.AudioAttributesCompatParcelizer;
            recreate recreateVar2 = null;
            if (recreateVar == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                recreateVar = null;
            }
            TextView textView = recreateVar.AudioAttributesImplApi21Parcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
            PlayerControlViewExternalSyntheticLambda1.IconCompatParcelizer(contextRequireContext, textView);
            Context contextRequireContext2 = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext2, "");
            recreate recreateVar3 = this.AudioAttributesCompatParcelizer;
            if (recreateVar3 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                recreateVar3 = null;
            }
            EditText editText = recreateVar3.read;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(editText, "");
            bytesRead.IconCompatParcelizer(contextRequireContext2, editText);
            Context contextRequireContext3 = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext3, "");
            recreate recreateVar4 = this.AudioAttributesCompatParcelizer;
            if (recreateVar4 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            } else {
                recreateVar2 = recreateVar4;
            }
            Button button = recreateVar2.write;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(button, "");
            bytesRead.IconCompatParcelizer(contextRequireContext3, button);
        }
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<String> setupdatedstatus = getTo.this.RemoteActionCompatParcelizer().read();
                final getTo getto = getTo.this;
                this.write = 1;
                if (setupdatedstatus.write(new getValidationToken() { // from class: o.getTo.RemoteActionCompatParcelizer.4
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return AudioAttributesCompatParcelizer((String) obj2);
                    }

                    private Object AudioAttributesCompatParcelizer(String str) {
                        if (str.length() > 0) {
                            CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer(getto, str, 0);
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
            throw new PlanDetailsCreator();
        }

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return getTo.this.new RemoteActionCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void read() {
        getTo getto = this;
        setBitrateKbps.read(getto, new RemoteActionCompatParcelizer(null));
        setBitrateKbps.read(getto, new write(null));
    }

    static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<getServiceWithTimeout> setupdatedstatusAudioAttributesCompatParcelizer = getTo.this.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer();
                final getTo getto = getTo.this;
                this.write = 1;
                if (setupdatedstatusAudioAttributesCompatParcelizer.write(new getValidationToken() { // from class: o.getTo.write.5
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return RemoteActionCompatParcelizer((getServiceWithTimeout) obj2);
                    }

                    private Object RemoteActionCompatParcelizer(getServiceWithTimeout getservicewithtimeout) {
                        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getservicewithtimeout, getServiceWithTimeout.RemoteActionCompatParcelizer.INSTANCE)) {
                            getto.RemoteActionCompatParcelizer().read(getServiceWithTimeout.IconCompatParcelizer.INSTANCE);
                            getto.requireActivity().setResult(-1, new Intent().putExtra("submissionResult", true));
                            getto.requireActivity().finish();
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
            throw new PlanDetailsCreator();
        }

        write(SampleVideos<? super write> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return getTo.this.new write(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: o.getTo$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Landroidx/fragment/app/Fragment;", "write", "()Landroidx/fragment/app/Fragment;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<Fragment> {
        private /* synthetic */ Fragment $IconCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.$IconCompatParcelizer;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Fragment fragment) {
            super(0);
            this.$IconCompatParcelizer = fragment;
        }
    }

    /* JADX INFO: renamed from: o.getTo$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/TypeResolutionContext;", "AudioAttributesCompatParcelizer", "()Lo/TypeResolutionContext;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass2 extends MagicModuleUseCase implements getCreatedOnDateMs<TypeResolutionContext> {
        private /* synthetic */ getCreatedOnDateMs $IconCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final TypeResolutionContext invoke() {
            return (TypeResolutionContext) this.$IconCompatParcelizer.invoke();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(getCreatedOnDateMs getcreatedondatems) {
            super(0);
            this.$IconCompatParcelizer = getcreatedondatems;
        }
    }

    /* JADX INFO: renamed from: o.getTo$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "RemoteActionCompatParcelizer", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ RenewEligible $IconCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return _resolveFieldVsGetter.write(this.$IconCompatParcelizer).getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(RenewEligible renewEligible) {
            super(0);
            this.$IconCompatParcelizer = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.getTo$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "AudioAttributesCompatParcelizer", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass4 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ getCreatedOnDateMs $RemoteActionCompatParcelizer = null;
        private /* synthetic */ RenewEligible $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final withFieldVisibility invoke() {
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$write);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return anyexplicitswithoutignoral != null ? anyexplicitswithoutignoral.getDefaultViewModelCreationExtras() : withFieldVisibility.write.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(RenewEligible renewEligible) {
            super(0);
            this.$write = renewEligible;
        }
    }

    private final void write() {
        recreate recreateVar = this.AudioAttributesCompatParcelizer;
        recreate recreateVar2 = null;
        if (recreateVar == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            recreateVar = null;
        }
        recreateVar.write.setOnClickListener(new View.OnClickListener() { // from class: o.CloudMessageMessagePriority
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                getTo.AudioAttributesImplApi26Parcelizer(this.AudioAttributesCompatParcelizer);
            }
        });
        recreate recreateVar3 = this.AudioAttributesCompatParcelizer;
        if (recreateVar3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            recreateVar2 = recreateVar3;
        }
        recreateVar2.RemoteActionCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.getSentTime
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                getTo.MediaBrowserCompatItemReceiver(this.AudioAttributesCompatParcelizer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesImplApi26Parcelizer(getTo getto) {
        AdditionalFeedbackViewModel additionalFeedbackViewModelRemoteActionCompatParcelizer = getto.RemoteActionCompatParcelizer();
        recreate recreateVar = getto.AudioAttributesCompatParcelizer;
        if (recreateVar == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            recreateVar = null;
        }
        additionalFeedbackViewModelRemoteActionCompatParcelizer.read(new getServiceWithTimeout.read(recreateVar.read.getText().toString()));
    }

    /* JADX INFO: renamed from: o.getTo$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "write", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ RenewEligible $read;
        private /* synthetic */ Fragment $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            VisibilityChecker.RemoteActionCompatParcelizer defaultViewModelProviderFactory;
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$read);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return (anyexplicitswithoutignoral == null || (defaultViewModelProviderFactory = anyexplicitswithoutignoral.getDefaultViewModelProviderFactory()) == null) ? this.$write.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Fragment fragment, RenewEligible renewEligible) {
            super(0);
            this.$write = fragment;
            this.$read = renewEligible;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MediaBrowserCompatItemReceiver(getTo getto) {
        getto.requireActivity().setResult(-1, new Intent().putExtra("submissionResult", false));
        getto.requireActivity().finish();
    }

    /* JADX INFO: renamed from: o.getTo$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/getTo$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "Lo/BlockingServiceConnection;", "p0", "Lo/getTo;", "IconCompatParcelizer", "(Lo/BlockingServiceConnection;)Lo/getTo;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static getTo IconCompatParcelizer(BlockingServiceConnection p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            getTo getto = new getTo();
            getto.setArguments(p0.write());
            return getto;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
