package kotlin;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.util.DeviceProperties;
import com.marrow.R;
import com.marrow2.ui.notespurchase.NotesPurchaseActivityViewModel;
import com.marrow2.ui.notespurchase.billingdetails.NotesPurchaseBillingDetailsViewModel;
import com.marrow2.ui.payment.PaymentActivity;
import com.marrow2.ui.payment.model.DeliveryAddressModel;
import com.marrow2.ui.payment.model.PaymentArgs;
import kotlin.GmsClient;
import kotlin.IGmsServiceBroker;
import kotlin.ImagesContract;
import kotlin.Metadata;
import kotlin.VisibilityChecker;
import kotlin._init_lambda4;
import kotlin.validateScopes;
import kotlin.withFieldVisibility;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000 $2\u00020\u0001:\u0001$B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0003JI\u0010\u001a\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00132\b\u0010\u0007\u001a\u0004\u0018\u00010\u00132\b\u0010\t\u001a\u0004\u0018\u00010\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001c\u0010\u0003R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u001eR\u0014\u0010!\u001a\u00020\u001d8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u001b\u0010$\u001a\u00020\"8CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b!\u0010#\u001a\u0004\b$\u0010%R\u001b\u0010\u0010\u001a\u00020&8CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010#\u001a\u0004\b\u001a\u0010'R\u001e\u0010\u001f\u001a\f\u0012\b\u0012\u0006*\u00020)0)0(8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010*"}, d2 = {"Lo/IGmsServiceBrokerStub;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "read", "AudioAttributesImplApi21Parcelizer", "MediaBrowserCompatItemReceiver", "", "", "p3", "", "p4", "Lcom/marrow2/ui/payment/model/DeliveryAddressModel;", "p5", "write", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Lcom/marrow2/ui/payment/model/DeliveryAddressModel;)V", "onDestroyView", "Lo/onPlaylistError;", "Lo/onPlaylistError;", "RemoteActionCompatParcelizer", "()Lo/onPlaylistError;", "IconCompatParcelizer", "Lcom/marrow2/ui/notespurchase/billingdetails/NotesPurchaseBillingDetailsViewModel;", "Lo/RenewEligible;", "AudioAttributesCompatParcelizer", "()Lcom/marrow2/ui/notespurchase/billingdetails/NotesPurchaseBillingDetailsViewModel;", "Lcom/marrow2/ui/notespurchase/NotesPurchaseActivityViewModel;", "()Lcom/marrow2/ui/notespurchase/NotesPurchaseActivityViewModel;", "Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;", "Landroid/content/Intent;", "Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IGmsServiceBrokerStub extends LibraryVersion {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final RenewEligible AudioAttributesCompatParcelizer;
    private final r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<Intent> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private onPlaylistError write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final RenewEligible read;

    public IGmsServiceBrokerStub() {
        IGmsServiceBrokerStub iGmsServiceBrokerStub = this;
        RenewEligible renewEligibleWrite = getRenewExpiresOn.write(RenewEligibleCompanion.read, new AnonymousClass1(new AnonymousClass5(iGmsServiceBrokerStub)));
        this.AudioAttributesCompatParcelizer = _resolveFieldVsGetter.RemoteActionCompatParcelizer(toMagicModuleMetaDataUcModel.write(NotesPurchaseBillingDetailsViewModel.class), new AnonymousClass7(renewEligibleWrite), new AnonymousClass8(renewEligibleWrite), new AnonymousClass6(iGmsServiceBrokerStub, renewEligibleWrite));
        this.read = _resolveFieldVsGetter.RemoteActionCompatParcelizer(toMagicModuleMetaDataUcModel.write(NotesPurchaseActivityViewModel.class), new AnonymousClass4(iGmsServiceBrokerStub), new AnonymousClass2(iGmsServiceBrokerStub), new AnonymousClass3(iGmsServiceBrokerStub));
        r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<Intent> r8lambdaibk6u1hk7j3awkl_wn934v2uvi8RegisterForActivityResult = registerForActivityResult(new _init_lambda4.AudioAttributesImplApi26Parcelizer(), new r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() { // from class: o.equal
            @Override // kotlin.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM
            public final void IconCompatParcelizer(Object obj) {
                IGmsServiceBrokerStub.read(this.RemoteActionCompatParcelizer, (ActivityResult) obj);
            }
        });
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r8lambdaibk6u1hk7j3awkl_wn934v2uvi8RegisterForActivityResult, "");
        this.RemoteActionCompatParcelizer = r8lambdaibk6u1hk7j3awkl_wn934v2uvi8RegisterForActivityResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final onPlaylistError RemoteActionCompatParcelizer() {
        onPlaylistError onplaylisterror = this.write;
        toMagicModuleMetaRepoModel.write(onplaylisterror);
        return onplaylisterror;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NotesPurchaseBillingDetailsViewModel AudioAttributesCompatParcelizer() {
        return (NotesPurchaseBillingDetailsViewModel) this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NotesPurchaseActivityViewModel write() {
        return (NotesPurchaseActivityViewModel) this.read.RemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void read(IGmsServiceBrokerStub iGmsServiceBrokerStub, ActivityResult activityResult) {
        toMagicModuleMetaRepoModel.write(activityResult, "");
        if (activityResult.getRemoteActionCompatParcelizer() == -1) {
            Intent read = activityResult.getRead();
            String stringExtra = read != null ? read.getStringExtra("paymentStatusMessage") : null;
            if (stringExtra != null) {
                CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer(iGmsServiceBrokerStub, stringExtra, 0);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.write = onPlaylistError.read(p0, p1);
        ConstraintLayout constraintLayoutIconCompatParcelizer = RemoteActionCompatParcelizer().IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayoutIconCompatParcelizer, "");
        return constraintLayoutIconCompatParcelizer;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View p0, Bundle p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onViewCreated(p0, p1);
        write().IconCompatParcelizer(new validateScopes.IconCompatParcelizer("Billing Details"));
        write().IconCompatParcelizer(validateScopes.AudioAttributesCompatParcelizer.INSTANCE);
        read();
        MediaBrowserCompatItemReceiver();
        AudioAttributesImplApi21Parcelizer();
    }

    private final void read() {
        if (DeviceProperties.isTablet(requireContext())) {
            Context contextRequireContext = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
            ConstraintLayout constraintLayoutIconCompatParcelizer = RemoteActionCompatParcelizer().IconCompatParcelizer.IconCompatParcelizer();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayoutIconCompatParcelizer, "");
            bytesRead.write(contextRequireContext, constraintLayoutIconCompatParcelizer);
            Context contextRequireContext2 = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext2, "");
            ConstraintLayout constraintLayoutIconCompatParcelizer2 = RemoteActionCompatParcelizer().read.IconCompatParcelizer();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayoutIconCompatParcelizer2, "");
            bytesRead.write(contextRequireContext2, constraintLayoutIconCompatParcelizer2);
            Context contextRequireContext3 = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext3, "");
            Button button = RemoteActionCompatParcelizer().RemoteActionCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(button, "");
            bytesRead.IconCompatParcelizer(contextRequireContext3, button);
        }
    }

    private final void AudioAttributesImplApi21Parcelizer() {
        RemoteActionCompatParcelizer().RemoteActionCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.Objects
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IGmsServiceBrokerStub.read(this.RemoteActionCompatParcelizer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void read(IGmsServiceBrokerStub iGmsServiceBrokerStub) {
        iGmsServiceBrokerStub.AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer(IGmsServiceBroker.write.INSTANCE);
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<toTask> setupdatedstatusIconCompatParcelizer = IGmsServiceBrokerStub.this.AudioAttributesCompatParcelizer().IconCompatParcelizer();
                final IGmsServiceBrokerStub iGmsServiceBrokerStub = IGmsServiceBrokerStub.this;
                this.read = 1;
                if (setupdatedstatusIconCompatParcelizer.write(new getValidationToken() { // from class: o.IGmsServiceBrokerStub.IconCompatParcelizer.4
                    @Override // kotlin.getValidationToken
                    public final /* bridge */ /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return IconCompatParcelizer((toTask) obj2);
                    }

                    private Object IconCompatParcelizer(toTask totask) {
                        onPlaylistError onplaylisterrorRemoteActionCompatParcelizer = iGmsServiceBrokerStub.RemoteActionCompatParcelizer();
                        IGmsServiceBrokerStub iGmsServiceBrokerStub2 = iGmsServiceBrokerStub;
                        onplaylisterrorRemoteActionCompatParcelizer.IconCompatParcelizer.read.setText(totask.getAudioAttributesImplApi26Parcelizer());
                        onplaylisterrorRemoteActionCompatParcelizer.IconCompatParcelizer.RemoteActionCompatParcelizer.setText(totask.getAudioAttributesImplBaseParcelizer());
                        onplaylisterrorRemoteActionCompatParcelizer.IconCompatParcelizer.IconCompatParcelizer.setText(totask.getRead());
                        onplaylisterrorRemoteActionCompatParcelizer.IconCompatParcelizer.AudioAttributesCompatParcelizer.setText(totask.getAudioAttributesCompatParcelizer());
                        onplaylisterrorRemoteActionCompatParcelizer.read.RemoteActionCompatParcelizer.setText(totask.getIconCompatParcelizer());
                        onplaylisterrorRemoteActionCompatParcelizer.read.AudioAttributesCompatParcelizer.setText(totask.getWrite());
                        onplaylisterrorRemoteActionCompatParcelizer.read.MediaBrowserCompatCustomActionResultReceiver.setText(totask.getOnCommand());
                        onplaylisterrorRemoteActionCompatParcelizer.read.write.setText(totask.getRemoteActionCompatParcelizer());
                        onplaylisterrorRemoteActionCompatParcelizer.read.AudioAttributesImplApi26Parcelizer.setText(totask.getMediaMetadataCompat());
                        onplaylisterrorRemoteActionCompatParcelizer.read.MediaBrowserCompatItemReceiver.setText(totask.getAudioAttributesImplApi21Parcelizer());
                        TextView textView = onplaylisterrorRemoteActionCompatParcelizer.read.read;
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
                        textView.setVisibility(!totask.getHandleMediaPlayPauseIfPendingOnHandler() ? 0 : 8);
                        TextView textView2 = onplaylisterrorRemoteActionCompatParcelizer.read.write;
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView2, "");
                        textView2.setVisibility(!totask.getHandleMediaPlayPauseIfPendingOnHandler() ? 0 : 8);
                        TextView textView3 = onplaylisterrorRemoteActionCompatParcelizer.read.AudioAttributesImplApi21Parcelizer;
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView3, "");
                        textView3.setVisibility(!totask.getHandleMediaPlayPauseIfPendingOnHandler() ? 0 : 8);
                        TextView textView4 = onplaylisterrorRemoteActionCompatParcelizer.read.AudioAttributesImplApi26Parcelizer;
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView4, "");
                        textView4.setVisibility(!totask.getHandleMediaPlayPauseIfPendingOnHandler() ? 0 : 8);
                        TextView textView5 = onplaylisterrorRemoteActionCompatParcelizer.read.IconCompatParcelizer;
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView5, "");
                        textView5.setVisibility(totask.getHandleMediaPlayPauseIfPendingOnHandler() ? 0 : 8);
                        TextView textView6 = onplaylisterrorRemoteActionCompatParcelizer.read.MediaBrowserCompatItemReceiver;
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView6, "");
                        textView6.setVisibility(totask.getHandleMediaPlayPauseIfPendingOnHandler() ? 0 : 8);
                        onplaylisterrorRemoteActionCompatParcelizer.read.AudioAttributesImplBaseParcelizer.setText(totask.getOnAddQueueItem());
                        onplaylisterrorRemoteActionCompatParcelizer.RemoteActionCompatParcelizer.setText(iGmsServiceBrokerStub2.getString(R.string.notes_purchase_confirm_and_pay, totask.getOnAddQueueItem()));
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

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return IGmsServiceBrokerStub.this.new IconCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void MediaBrowserCompatItemReceiver() {
        IGmsServiceBrokerStub iGmsServiceBrokerStub = this;
        setBitrateKbps.read(iGmsServiceBrokerStub, new IconCompatParcelizer(null));
        setBitrateKbps.read(iGmsServiceBrokerStub, new RemoteActionCompatParcelizer(null));
        setBitrateKbps.read(iGmsServiceBrokerStub, new write(null));
    }

    /* JADX INFO: renamed from: o.IGmsServiceBrokerStub$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Landroidx/fragment/app/Fragment;", "RemoteActionCompatParcelizer", "()Landroidx/fragment/app/Fragment;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<Fragment> {
        private /* synthetic */ Fragment $IconCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.$IconCompatParcelizer;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(Fragment fragment) {
            super(0);
            this.$IconCompatParcelizer = fragment;
        }
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<GmsClient> setupdatedstatusAudioAttributesCompatParcelizer = IGmsServiceBrokerStub.this.write().AudioAttributesCompatParcelizer();
                final IGmsServiceBrokerStub iGmsServiceBrokerStub = IGmsServiceBrokerStub.this;
                this.AudioAttributesCompatParcelizer = 1;
                if (setupdatedstatusAudioAttributesCompatParcelizer.write(new getValidationToken() { // from class: o.IGmsServiceBrokerStub.RemoteActionCompatParcelizer.5
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return RemoteActionCompatParcelizer((GmsClient) obj2);
                    }

                    private Object RemoteActionCompatParcelizer(GmsClient gmsClient) {
                        if (gmsClient instanceof GmsClient.read) {
                            iGmsServiceBrokerStub.AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer(new IGmsServiceBroker.IconCompatParcelizer(((GmsClient.read) gmsClient).IconCompatParcelizer()));
                        } else if (!(gmsClient instanceof GmsClient.write) && !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(gmsClient, GmsClient.AudioAttributesCompatParcelizer.INSTANCE)) {
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
            throw new PlanDetailsCreator();
        }

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return IGmsServiceBrokerStub.this.new RemoteActionCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: o.IGmsServiceBrokerStub$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/TypeResolutionContext;", "AudioAttributesCompatParcelizer", "()Lo/TypeResolutionContext;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<TypeResolutionContext> {
        private /* synthetic */ getCreatedOnDateMs $IconCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final TypeResolutionContext invoke() {
            return (TypeResolutionContext) this.$IconCompatParcelizer.invoke();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(getCreatedOnDateMs getcreatedondatems) {
            super(0);
            this.$IconCompatParcelizer = getcreatedondatems;
        }
    }

    /* JADX INFO: renamed from: o.IGmsServiceBrokerStub$7, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "write", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass7 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ RenewEligible $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return _resolveFieldVsGetter.write(this.$write).getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(RenewEligible renewEligible) {
            super(0);
            this.$write = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.IGmsServiceBrokerStub$8, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "AudioAttributesCompatParcelizer", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass8 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ RenewEligible $IconCompatParcelizer;
        private /* synthetic */ getCreatedOnDateMs $RemoteActionCompatParcelizer = null;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final withFieldVisibility invoke() {
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$IconCompatParcelizer);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return anyexplicitswithoutignoral != null ? anyexplicitswithoutignoral.getDefaultViewModelCreationExtras() : withFieldVisibility.write.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass8(RenewEligible renewEligible) {
            super(0);
            this.$IconCompatParcelizer = renewEligible;
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
                NewNumberOtpResendRequest<ImagesContract> newNumberOtpResendRequest = IGmsServiceBrokerStub.this.AudioAttributesCompatParcelizer().read();
                final IGmsServiceBrokerStub iGmsServiceBrokerStub = IGmsServiceBrokerStub.this;
                this.write = 1;
                if (newNumberOtpResendRequest.write(new getValidationToken() { // from class: o.IGmsServiceBrokerStub.write.4
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return RemoteActionCompatParcelizer((ImagesContract) obj2);
                    }

                    private Object RemoteActionCompatParcelizer(ImagesContract imagesContract) {
                        if (!(imagesContract instanceof ImagesContract.IconCompatParcelizer)) {
                            throw new RenewEligibleCreator();
                        }
                        if (getTrackName.write(iGmsServiceBrokerStub.requireContext())) {
                            ImagesContract.IconCompatParcelizer iconCompatParcelizer = (ImagesContract.IconCompatParcelizer) imagesContract;
                            iGmsServiceBrokerStub.write(iconCompatParcelizer.read(), iconCompatParcelizer.IconCompatParcelizer(), iconCompatParcelizer.AudioAttributesImplApi26Parcelizer(), iconCompatParcelizer.RemoteActionCompatParcelizer(), iconCompatParcelizer.write(), iconCompatParcelizer.AudioAttributesCompatParcelizer());
                        } else {
                            IGmsServiceBrokerStub iGmsServiceBrokerStub2 = iGmsServiceBrokerStub;
                            IGmsServiceBrokerStub iGmsServiceBrokerStub3 = iGmsServiceBrokerStub2;
                            String string = iGmsServiceBrokerStub2.getString(R.string.app_error_no_internet);
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
                            CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer(iGmsServiceBrokerStub3, string, 0);
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
            return IGmsServiceBrokerStub.this.new write(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: o.IGmsServiceBrokerStub$6, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "read", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass6 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ RenewEligible $AudioAttributesCompatParcelizer;
        private /* synthetic */ Fragment $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            VisibilityChecker.RemoteActionCompatParcelizer defaultViewModelProviderFactory;
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$AudioAttributesCompatParcelizer);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return (anyexplicitswithoutignoral == null || (defaultViewModelProviderFactory = anyexplicitswithoutignoral.getDefaultViewModelProviderFactory()) == null) ? this.$write.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(Fragment fragment, RenewEligible renewEligible) {
            super(0);
            this.$write = fragment;
            this.$AudioAttributesCompatParcelizer = renewEligible;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void write(String p0, String p1, String p2, Integer p3, Double p4, DeliveryAddressModel p5) {
        PaymentArgs paymentArgs = new PaymentArgs(p0, p1, p2, p3, p4, p5);
        PaymentActivity.write writeVar = PaymentActivity.read;
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        this.RemoteActionCompatParcelizer.read(PaymentActivity.write.write(contextRequireContext, paymentArgs));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.write = null;
        super.onDestroyView();
    }

    /* JADX INFO: renamed from: o.IGmsServiceBrokerStub$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/IGmsServiceBrokerStub$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "Lo/MethodInvocation;", "p0", "Lo/IGmsServiceBrokerStub;", "RemoteActionCompatParcelizer", "(Lo/MethodInvocation;)Lo/IGmsServiceBrokerStub;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static IGmsServiceBrokerStub RemoteActionCompatParcelizer(MethodInvocation p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            IGmsServiceBrokerStub iGmsServiceBrokerStub = new IGmsServiceBrokerStub();
            iGmsServiceBrokerStub.setArguments(p0.AudioAttributesImplBaseParcelizer());
            return iGmsServiceBrokerStub;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    /* JADX INFO: renamed from: o.IGmsServiceBrokerStub$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "AudioAttributesCompatParcelizer", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass4 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ Fragment $read;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return this.$read.requireActivity().getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(Fragment fragment) {
            super(0);
            this.$read = fragment;
        }
    }

    /* JADX INFO: renamed from: o.IGmsServiceBrokerStub$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "AudioAttributesCompatParcelizer", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass2 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ getCreatedOnDateMs $IconCompatParcelizer = null;
        private /* synthetic */ Fragment $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final withFieldVisibility invoke() {
            return this.$write.requireActivity().getDefaultViewModelCreationExtras();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Fragment fragment) {
            super(0);
            this.$write = fragment;
        }
    }

    /* JADX INFO: renamed from: o.IGmsServiceBrokerStub$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "AudioAttributesCompatParcelizer", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ Fragment $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            return this.$write.requireActivity().getDefaultViewModelProviderFactory();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Fragment fragment) {
            super(0);
            this.$write = fragment;
        }
    }
}
