package kotlin;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.util.DeviceProperties;
import com.marrow.R;
import com.marrow2.ui.plan.post_purchase.notespurchase.NotesPurchaseThankYouViewModel;
import kotlin.AttachmentUnsupportedAttachmentException;
import kotlin.AuthenticationExtensionsBuilder;
import kotlin.Metadata;
import kotlin.VisibilityChecker;
import kotlin.withFieldVisibility;
import kotlin.zadb;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0003J+\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00142\b\u0010\u0007\u001a\u0004\u0018\u00010\u00142\b\u0010\t\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0017\u0010\u0003J\u000f\u0010\u0018\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0018\u0010\u0003R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u00198CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u001bR\u001b\u0010\u0010\u001a\u00020\u001d8CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 "}, d2 = {"Lo/getFidoAppIdExtension;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "write", "AudioAttributesImplApi26Parcelizer", "MediaBrowserCompatItemReceiver", "AudioAttributesImplApi21Parcelizer", "", "read", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "RemoteActionCompatParcelizer", "onDestroyView", "Lo/setIsPrimaryTimestampSource;", "Lo/setIsPrimaryTimestampSource;", "()Lo/setIsPrimaryTimestampSource;", "IconCompatParcelizer", "Lcom/marrow2/ui/plan/post_purchase/notespurchase/NotesPurchaseThankYouViewModel;", "AudioAttributesCompatParcelizer", "Lo/RenewEligible;", "()Lcom/marrow2/ui/plan/post_purchase/notespurchase/NotesPurchaseThankYouViewModel;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class getFidoAppIdExtension extends AttestationConveyancePreferenceUnsupportedAttestationConveyancePreferenceException {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final RenewEligible write;
    private setIsPrimaryTimestampSource read;

    public getFidoAppIdExtension() {
        getFidoAppIdExtension getfidoappidextension = this;
        RenewEligible renewEligibleWrite = getRenewExpiresOn.write(RenewEligibleCompanion.read, new AnonymousClass3(new AnonymousClass4(getfidoappidextension)));
        this.write = _resolveFieldVsGetter.RemoteActionCompatParcelizer(toMagicModuleMetaDataUcModel.write(NotesPurchaseThankYouViewModel.class), new AnonymousClass1(renewEligibleWrite), new AnonymousClass2(renewEligibleWrite), new AnonymousClass5(getfidoappidextension, renewEligibleWrite));
    }

    private final setIsPrimaryTimestampSource read() {
        setIsPrimaryTimestampSource setisprimarytimestampsource = this.read;
        toMagicModuleMetaRepoModel.write(setisprimarytimestampsource);
        return setisprimarytimestampsource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NotesPurchaseThankYouViewModel AudioAttributesCompatParcelizer() {
        return (NotesPurchaseThankYouViewModel) this.write.RemoteActionCompatParcelizer();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.read = setIsPrimaryTimestampSource.read(p0, p1);
        RemoteActionCompatParcelizer();
        ScrollView scrollView = read().IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(scrollView, "");
        return scrollView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View p0, Bundle p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onViewCreated(p0, p1);
        write();
        AudioAttributesImplApi26Parcelizer();
        onSetRating onBackPressedDispatcher = requireActivity().getIconCompatParcelizer();
        hasGetter viewLifecycleOwner = getViewLifecycleOwner();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewLifecycleOwner, "");
        onBackPressedDispatcher.AudioAttributesCompatParcelizer(viewLifecycleOwner, new IconCompatParcelizer());
        AudioAttributesImplApi21Parcelizer();
        MediaBrowserCompatItemReceiver();
    }

    public static final class IconCompatParcelizer extends onRemoveQueueItemAt {
        IconCompatParcelizer() {
            super(true);
        }

        @Override // kotlin.onRemoveQueueItemAt
        public final void handleOnBackPressed() {
            setEnabled(false);
            getFidoAppIdExtension.this.AudioAttributesCompatParcelizer().IconCompatParcelizer(AuthenticationExtensionsBuilder.IconCompatParcelizer.INSTANCE);
        }
    }

    private final void write() {
        ImageView imageView = read().IconCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView, "");
        getHttpMethodString.RemoteActionCompatParcelizer(imageView, true, false, false, true, 0, 54);
    }

    private final void AudioAttributesImplApi26Parcelizer() {
        if (DeviceProperties.isTablet(requireContext())) {
            Context contextRequireContext = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
            ConstraintLayout constraintLayout = read().RemoteActionCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout, "");
            bytesRead.IconCompatParcelizer(contextRequireContext, constraintLayout);
            Context contextRequireContext2 = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext2, "");
            ConstraintLayout constraintLayoutRemoteActionCompatParcelizer = read().AudioAttributesCompatParcelizer.IconCompatParcelizer();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayoutRemoteActionCompatParcelizer, "");
            bytesRead.write(contextRequireContext2, constraintLayoutRemoteActionCompatParcelizer);
        }
    }

    static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                NewNumberOtpResendRequest<AttachmentUnsupportedAttachmentException> newNumberOtpResendRequestIconCompatParcelizer = getFidoAppIdExtension.this.AudioAttributesCompatParcelizer().IconCompatParcelizer();
                final getFidoAppIdExtension getfidoappidextension = getFidoAppIdExtension.this;
                this.write = 1;
                if (newNumberOtpResendRequestIconCompatParcelizer.write(new getValidationToken() { // from class: o.getFidoAppIdExtension.write.4
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return read((AttachmentUnsupportedAttachmentException) obj2);
                    }

                    private Object read(AttachmentUnsupportedAttachmentException attachmentUnsupportedAttachmentException) {
                        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(attachmentUnsupportedAttachmentException, AttachmentUnsupportedAttachmentException.RemoteActionCompatParcelizer.INSTANCE)) {
                            getFidoAppIdExtension getfidoappidextension2 = getfidoappidextension;
                            zadb.Companion remoteActionCompatParcelizer_ = zadb.INSTANCE;
                            Context contextRequireContext = getfidoappidextension.requireContext();
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
                            Intent intentWrite = zadb.Companion.write(contextRequireContext);
                            intentWrite.addFlags(603979776);
                            getfidoappidextension2.startActivity(intentWrite);
                        } else if (attachmentUnsupportedAttachmentException instanceof AttachmentUnsupportedAttachmentException.IconCompatParcelizer) {
                            ProjectionDrawMode.AudioAttributesCompatParcelizer(getfidoappidextension, ((AttachmentUnsupportedAttachmentException.IconCompatParcelizer) attachmentUnsupportedAttachmentException).write());
                        } else {
                            if (!(attachmentUnsupportedAttachmentException instanceof AttachmentUnsupportedAttachmentException.read)) {
                                throw new RenewEligibleCreator();
                            }
                            getFidoAppIdExtension getfidoappidextension3 = getfidoappidextension;
                            String string = getfidoappidextension3.getString(R.string.support_email);
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
                            AttachmentUnsupportedAttachmentException.read readVar = (AttachmentUnsupportedAttachmentException.read) attachmentUnsupportedAttachmentException;
                            getfidoappidextension3.read(string, readVar.AudioAttributesCompatParcelizer(), readVar.RemoteActionCompatParcelizer());
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

        write(SampleVideos<? super write> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return getFidoAppIdExtension.this.new write(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void MediaBrowserCompatItemReceiver() {
        setBitrateKbps.read(this, new write(null));
    }

    private final void AudioAttributesImplApi21Parcelizer() {
        setIsPrimaryTimestampSource setisprimarytimestampsource = read();
        setisprimarytimestampsource.read.setOnClickListener(new View.OnClickListener() { // from class: o.AttestationConveyancePreference
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                getFidoAppIdExtension.AudioAttributesImplApi26Parcelizer(this.IconCompatParcelizer);
            }
        });
        setisprimarytimestampsource.write.setOnClickListener(new AuthenticationExtensions(this));
        setisprimarytimestampsource.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.setFido2Extension
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                getFidoAppIdExtension.MediaBrowserCompatItemReceiver(this.read);
            }
        });
        setisprimarytimestampsource.AudioAttributesCompatParcelizer.write.setOnClickListener(new View.OnClickListener() { // from class: o.getUserVerificationMethodExtension
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                getFidoAppIdExtension.AudioAttributesImplApi21Parcelizer(this.read);
            }
        });
        setisprimarytimestampsource.IconCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.setUserVerificationMethodExtension
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                getFidoAppIdExtension.MediaMetadataCompat(this.AudioAttributesCompatParcelizer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesImplApi26Parcelizer(getFidoAppIdExtension getfidoappidextension) {
        getfidoappidextension.AudioAttributesCompatParcelizer().IconCompatParcelizer(AuthenticationExtensionsBuilder.AudioAttributesCompatParcelizer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesImplBaseParcelizer(getFidoAppIdExtension getfidoappidextension) {
        getfidoappidextension.AudioAttributesCompatParcelizer().IconCompatParcelizer(AuthenticationExtensionsBuilder.MediaBrowserCompatItemReceiver.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MediaBrowserCompatItemReceiver(getFidoAppIdExtension getfidoappidextension) {
        getfidoappidextension.AudioAttributesCompatParcelizer().IconCompatParcelizer(AuthenticationExtensionsBuilder.RemoteActionCompatParcelizer.INSTANCE);
    }

    /* JADX INFO: renamed from: o.getFidoAppIdExtension$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Landroidx/fragment/app/Fragment;", "write", "()Landroidx/fragment/app/Fragment;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass4 extends MagicModuleUseCase implements getCreatedOnDateMs<Fragment> {
        private /* synthetic */ Fragment $AudioAttributesCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.$AudioAttributesCompatParcelizer;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(Fragment fragment) {
            super(0);
            this.$AudioAttributesCompatParcelizer = fragment;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesImplApi21Parcelizer(getFidoAppIdExtension getfidoappidextension) {
        getfidoappidextension.AudioAttributesCompatParcelizer().IconCompatParcelizer(AuthenticationExtensionsBuilder.write.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MediaMetadataCompat(getFidoAppIdExtension getfidoappidextension) {
        getfidoappidextension.AudioAttributesCompatParcelizer().IconCompatParcelizer(AuthenticationExtensionsBuilder.read.INSTANCE);
    }

    /* JADX INFO: renamed from: o.getFidoAppIdExtension$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/TypeResolutionContext;", "AudioAttributesCompatParcelizer", "()Lo/TypeResolutionContext;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<TypeResolutionContext> {
        private /* synthetic */ getCreatedOnDateMs $IconCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final TypeResolutionContext invoke() {
            return (TypeResolutionContext) this.$IconCompatParcelizer.invoke();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(getCreatedOnDateMs getcreatedondatems) {
            super(0);
            this.$IconCompatParcelizer = getcreatedondatems;
        }
    }

    /* JADX INFO: renamed from: o.getFidoAppIdExtension$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "AudioAttributesCompatParcelizer", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ RenewEligible $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return _resolveFieldVsGetter.write(this.$write).getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RenewEligible renewEligible) {
            super(0);
            this.$write = renewEligible;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void read(String p0, String p1, String p2) {
        Context contextRequireContext = requireContext();
        if (p1 == null) {
            p1 = "";
        }
        if (p2 == null) {
            p2 = "";
        }
        DataSink.RemoteActionCompatParcelizer(contextRequireContext, p0, p1, p2);
    }

    /* JADX INFO: renamed from: o.getFidoAppIdExtension$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "write", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass2 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ getCreatedOnDateMs $IconCompatParcelizer = null;
        private /* synthetic */ RenewEligible $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final withFieldVisibility invoke() {
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$write);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return anyexplicitswithoutignoral != null ? anyexplicitswithoutignoral.getDefaultViewModelCreationExtras() : withFieldVisibility.write.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(RenewEligible renewEligible) {
            super(0);
            this.$write = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.getFidoAppIdExtension$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "AudioAttributesCompatParcelizer", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ Fragment $RemoteActionCompatParcelizer;
        private /* synthetic */ RenewEligible $read;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            VisibilityChecker.RemoteActionCompatParcelizer defaultViewModelProviderFactory;
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$read);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return (anyexplicitswithoutignoral == null || (defaultViewModelProviderFactory = anyexplicitswithoutignoral.getDefaultViewModelProviderFactory()) == null) ? this.$RemoteActionCompatParcelizer.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(Fragment fragment, RenewEligible renewEligible) {
            super(0);
            this.$RemoteActionCompatParcelizer = fragment;
            this.$read = renewEligible;
        }
    }

    private final void RemoteActionCompatParcelizer() {
        Window window;
        maybeGetTypeVariable activity = getActivity();
        if (activity == null || (window = activity.getWindow()) == null) {
            return;
        }
        window.setStatusBarColor(requireContext().getColor(R.color.n_80));
        window.setNavigationBarColor(requireContext().getColor(R.color.n_85));
        window.getDecorView().setSystemUiVisibility(0);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.read = null;
        super.onDestroyView();
    }

    /* JADX INFO: renamed from: o.getFidoAppIdExtension$RemoteActionCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/getFidoAppIdExtension$RemoteActionCompatParcelizer;", "", "<init>", "()V", "Lo/getFidoAppIdExtension;", "AudioAttributesCompatParcelizer", "()Lo/getFidoAppIdExtension;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static getFidoAppIdExtension AudioAttributesCompatParcelizer() {
            return new getFidoAppIdExtension();
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
