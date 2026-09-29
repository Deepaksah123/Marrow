package kotlin;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.Fragment;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.material.chip.Chip;
import com.marrow.R;
import com.marrow.data.models.ResponseError;
import com.marrow2.data.tag.local.model.TagLSModel;
import com.marrow2.ui.feedback.viewmodel.LessonFeedbackViewModel;
import java.util.Iterator;
import java.util.List;
import kotlin.ErrorDialogFragment;
import kotlin.Metadata;
import kotlin.VisibilityChecker;
import kotlin._init_lambda4;
import kotlin.getOriginalPriority;
import kotlin.getService;
import kotlin.onLoaderReset;
import kotlin.shouldEscapeCharacter;
import kotlin.withFieldVisibility;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 /2\u00020\u0001:\u0001/B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0003J=\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001a\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001e\u0010\u0003J\u000f\u0010\u001f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001f\u0010\u0003J\u000f\u0010 \u001a\u00020\rH\u0002¢\u0006\u0004\b \u0010\u0003J\u001d\u0010\u001a\u001a\u00020\r2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020!0\u0016H\u0002¢\u0006\u0004\b\u001a\u0010\"J\u000f\u0010#\u001a\u00020\rH\u0002¢\u0006\u0004\b#\u0010\u0003J\u000f\u0010$\u001a\u00020\rH\u0002¢\u0006\u0004\b$\u0010\u0003J\u000f\u0010%\u001a\u00020\rH\u0002¢\u0006\u0004\b%\u0010\u0003J\u000f\u0010&\u001a\u00020\rH\u0002¢\u0006\u0004\b&\u0010\u0003R\u0016\u0010\u001a\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010(R\u001b\u0010$\u001a\u00020)8CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010*\u001a\u0004\b\u001a\u0010+R\u001e\u0010\u0010\u001a\f\u0012\b\u0012\u0006*\u00020-0-0,8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010."}, d2 = {"Lo/CloudMessagingReceiverIntentKeys;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "read", "RemoteActionCompatParcelizer", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesImplBaseParcelizer", "", "", "", "p3", "Lo/readBlockToCache;", "p4", "write", "(Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Lo/readBlockToCache;)V", "Lo/startResolutionForResult;", "(Lo/startResolutionForResult;)V", "MediaBrowserCompatSearchResultReceiver", "RatingCompat", "AudioAttributesImplApi26Parcelizer", "Lcom/marrow2/data/tag/local/model/TagLSModel;", "(Ljava/util/List;)V", "MediaBrowserCompatItemReceiver", "AudioAttributesCompatParcelizer", "AudioAttributesImplApi21Parcelizer", "MediaBrowserCompatMediaItem", "Lo/getChunkPublicationState;", "Lo/getChunkPublicationState;", "Lcom/marrow2/ui/feedback/viewmodel/LessonFeedbackViewModel;", "Lo/RenewEligible;", "()Lcom/marrow2/ui/feedback/viewmodel/LessonFeedbackViewModel;", "Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;", "Landroid/content/Intent;", "Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;", "IconCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CloudMessagingReceiverIntentKeys extends CloudMessagingReceiverIntentActionKeys {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final RenewEligible AudioAttributesCompatParcelizer;
    private final r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<Intent> read;
    private getChunkPublicationState write;

    public CloudMessagingReceiverIntentKeys() {
        CloudMessagingReceiverIntentKeys cloudMessagingReceiverIntentKeys = this;
        RenewEligible renewEligibleWrite = getRenewExpiresOn.write(RenewEligibleCompanion.read, new AnonymousClass3(new AnonymousClass1(cloudMessagingReceiverIntentKeys)));
        this.AudioAttributesCompatParcelizer = _resolveFieldVsGetter.RemoteActionCompatParcelizer(toMagicModuleMetaDataUcModel.write(LessonFeedbackViewModel.class), new AnonymousClass2(renewEligibleWrite), new AnonymousClass5(renewEligibleWrite), new AnonymousClass4(cloudMessagingReceiverIntentKeys, renewEligibleWrite));
        r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<Intent> r8lambdaibk6u1hk7j3awkl_wn934v2uvi8RegisterForActivityResult = registerForActivityResult(new _init_lambda4.AudioAttributesImplApi26Parcelizer(), new r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() { // from class: o.Rpc
            @Override // kotlin.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM
            public final void IconCompatParcelizer(Object obj) {
                CloudMessagingReceiverIntentKeys.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, (ActivityResult) obj);
            }
        });
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r8lambdaibk6u1hk7j3awkl_wn934v2uvi8RegisterForActivityResult, "");
        this.read = r8lambdaibk6u1hk7j3awkl_wn934v2uvi8RegisterForActivityResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LessonFeedbackViewModel write() {
        return (LessonFeedbackViewModel) this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesCompatParcelizer(CloudMessagingReceiverIntentKeys cloudMessagingReceiverIntentKeys, ActivityResult activityResult) {
        Intent read2;
        toMagicModuleMetaRepoModel.write(activityResult, "");
        if (activityResult.getRemoteActionCompatParcelizer() == -1 && (read2 = activityResult.getRead()) != null && read2.getBooleanExtra("submissionResult", false)) {
            cloudMessagingReceiverIntentKeys.AudioAttributesImplApi26Parcelizer();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        getChunkPublicationState getchunkpublicationstateRemoteActionCompatParcelizer = getChunkPublicationState.RemoteActionCompatParcelizer(p0, p1);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getchunkpublicationstateRemoteActionCompatParcelizer, "");
        this.write = getchunkpublicationstateRemoteActionCompatParcelizer;
        if (getchunkpublicationstateRemoteActionCompatParcelizer == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            getchunkpublicationstateRemoteActionCompatParcelizer = null;
        }
        ConstraintLayout constraintLayout = getchunkpublicationstateRemoteActionCompatParcelizer.MediaDescriptionCompat;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout, "");
        return constraintLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View p0, Bundle p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onViewCreated(p0, p1);
        read();
        RemoteActionCompatParcelizer();
        MediaBrowserCompatMediaItem();
        MediaBrowserCompatItemReceiver();
        AudioAttributesImplBaseParcelizer();
        MediaBrowserCompatCustomActionResultReceiver();
    }

    private final void read() {
        getChunkPublicationState getchunkpublicationstate = this.write;
        if (getchunkpublicationstate == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            getchunkpublicationstate = null;
        }
        ConstraintLayout constraintLayout = getchunkpublicationstate.MediaDescriptionCompat;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout, "");
        getHttpMethodString.read((View) constraintLayout, true, true, true, true, 0, 48);
    }

    private final void RemoteActionCompatParcelizer() {
        getChunkPublicationState getchunkpublicationstate = this.write;
        if (getchunkpublicationstate == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            getchunkpublicationstate = null;
        }
        onDraw.IconCompatParcelizer((View) getchunkpublicationstate.MediaBrowserCompatCustomActionResultReceiver, ResponseError.NO_INTERNET_ERROR, 200);
    }

    private final void MediaBrowserCompatCustomActionResultReceiver() {
        getChunkPublicationState getchunkpublicationstate = this.write;
        getChunkPublicationState getchunkpublicationstate2 = null;
        if (getchunkpublicationstate == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            getchunkpublicationstate = null;
        }
        EditText editText = getchunkpublicationstate.AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(editText, "");
        getChunkPublicationState getchunkpublicationstate3 = this.write;
        if (getchunkpublicationstate3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            getchunkpublicationstate2 = getchunkpublicationstate3;
        }
        TextView textView = getchunkpublicationstate2.write;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
        buildEndStateNotification.RemoteActionCompatParcelizer(editText, textView, new getCreatedOnDateMs() { // from class: o.AccountPicker
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return CloudMessagingReceiverIntentKeys.onCommand(this.RemoteActionCompatParcelizer);
            }
        }, new getCreatedOnDateMs() { // from class: o.then
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return CloudMessagingReceiverIntentKeys.onAddQueueItem(this.IconCompatParcelizer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onCommand(CloudMessagingReceiverIntentKeys cloudMessagingReceiverIntentKeys) {
        getChunkPublicationState getchunkpublicationstate = cloudMessagingReceiverIntentKeys.write;
        getChunkPublicationState getchunkpublicationstate2 = null;
        if (getchunkpublicationstate == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            getchunkpublicationstate = null;
        }
        getchunkpublicationstate.AudioAttributesCompatParcelizer.setBackgroundResource(R.drawable.drw_edit_text_background_error);
        getChunkPublicationState getchunkpublicationstate3 = cloudMessagingReceiverIntentKeys.write;
        if (getchunkpublicationstate3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            getchunkpublicationstate2 = getchunkpublicationstate3;
        }
        getchunkpublicationstate2.write.setTextColor(_isNaN.getColor(cloudMessagingReceiverIntentKeys.requireContext(), R.color.v1_onsurfaceRed));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onAddQueueItem(CloudMessagingReceiverIntentKeys cloudMessagingReceiverIntentKeys) {
        getChunkPublicationState getchunkpublicationstate = cloudMessagingReceiverIntentKeys.write;
        getChunkPublicationState getchunkpublicationstate2 = null;
        if (getchunkpublicationstate == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            getchunkpublicationstate = null;
        }
        getchunkpublicationstate.AudioAttributesCompatParcelizer.setBackgroundResource(R.drawable.drw_edit_text_background);
        getChunkPublicationState getchunkpublicationstate3 = cloudMessagingReceiverIntentKeys.write;
        if (getchunkpublicationstate3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            getchunkpublicationstate2 = getchunkpublicationstate3;
        }
        getchunkpublicationstate2.write.setTextColor(_isNaN.getColor(cloudMessagingReceiverIntentKeys.requireContext(), R.color.v1_onbackgroundsurface3));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: renamed from: o.CloudMessagingReceiverIntentKeys$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Landroidx/fragment/app/Fragment;", "write", "()Landroidx/fragment/app/Fragment;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<Fragment> {
        private /* synthetic */ Fragment $IconCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.$IconCompatParcelizer;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Fragment fragment) {
            super(0);
            this.$IconCompatParcelizer = fragment;
        }
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<String> setupdatedstatus = CloudMessagingReceiverIntentKeys.this.write().read();
                final CloudMessagingReceiverIntentKeys cloudMessagingReceiverIntentKeys = CloudMessagingReceiverIntentKeys.this;
                this.RemoteActionCompatParcelizer = 1;
                if (setupdatedstatus.write(new getValidationToken() { // from class: o.CloudMessagingReceiverIntentKeys.AudioAttributesCompatParcelizer.1
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return read((String) obj2);
                    }

                    private Object read(String str) {
                        if (str.length() > 0) {
                            PlayerControlViewExternalSyntheticLambda1.write(cloudMessagingReceiverIntentKeys, str);
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

        AudioAttributesCompatParcelizer(SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return CloudMessagingReceiverIntentKeys.this.new AudioAttributesCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void AudioAttributesImplBaseParcelizer() {
        CloudMessagingReceiverIntentKeys cloudMessagingReceiverIntentKeys = this;
        setBitrateKbps.read(cloudMessagingReceiverIntentKeys, new AudioAttributesCompatParcelizer(null));
        setBitrateKbps.read(cloudMessagingReceiverIntentKeys, new read(null));
        setBitrateKbps.read(cloudMessagingReceiverIntentKeys, new write(null));
        setBitrateKbps.read(cloudMessagingReceiverIntentKeys, new RemoteActionCompatParcelizer(null));
        setBitrateKbps.RemoteActionCompatParcelizer(cloudMessagingReceiverIntentKeys, new MediaBrowserCompatCustomActionResultReceiver(null));
    }

    /* JADX INFO: renamed from: o.CloudMessagingReceiverIntentKeys$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/TypeResolutionContext;", "write", "()Lo/TypeResolutionContext;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<TypeResolutionContext> {
        private /* synthetic */ getCreatedOnDateMs $read;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final TypeResolutionContext invoke() {
            return (TypeResolutionContext) this.$read.invoke();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(getCreatedOnDateMs getcreatedondatems) {
            super(0);
            this.$read = getcreatedondatems;
        }
    }

    /* JADX INFO: renamed from: o.CloudMessagingReceiverIntentKeys$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "RemoteActionCompatParcelizer", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass2 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ RenewEligible $RemoteActionCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return _resolveFieldVsGetter.write(this.$RemoteActionCompatParcelizer).getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(RenewEligible renewEligible) {
            super(0);
            this.$RemoteActionCompatParcelizer = renewEligible;
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
                setUpdatedStatus<startResolutionForResult> setupdatedstatusAudioAttributesCompatParcelizer = CloudMessagingReceiverIntentKeys.this.write().AudioAttributesCompatParcelizer();
                final CloudMessagingReceiverIntentKeys cloudMessagingReceiverIntentKeys = CloudMessagingReceiverIntentKeys.this;
                this.RemoteActionCompatParcelizer = 1;
                if (setupdatedstatusAudioAttributesCompatParcelizer.write(new getValidationToken() { // from class: o.CloudMessagingReceiverIntentKeys.read.3
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return write((startResolutionForResult) obj2);
                    }

                    private Object write(startResolutionForResult startresolutionforresult) {
                        getChunkPublicationState getchunkpublicationstate = null;
                        if (startresolutionforresult.getWrite()) {
                            getChunkPublicationState getchunkpublicationstate2 = cloudMessagingReceiverIntentKeys.write;
                            if (getchunkpublicationstate2 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                getchunkpublicationstate2 = null;
                            }
                            Group group = getchunkpublicationstate2.read;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(group, "");
                            bytesRead.MediaBrowserCompatCustomActionResultReceiver(group);
                            onDraw.IconCompatParcelizer((View) getchunkpublicationstate2.MediaBrowserCompatItemReceiver, 0, 300);
                            cloudMessagingReceiverIntentKeys.RatingCompat();
                        } else if (startresolutionforresult.getAudioAttributesCompatParcelizer() > 0) {
                            getChunkPublicationState getchunkpublicationstate3 = cloudMessagingReceiverIntentKeys.write;
                            if (getchunkpublicationstate3 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                getchunkpublicationstate3 = null;
                            }
                            getchunkpublicationstate3.AudioAttributesCompatParcelizer.setText("");
                            Group group2 = getchunkpublicationstate3.read;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(group2, "");
                            bytesRead.AudioAttributesImplApi21Parcelizer(group2);
                            LinearLayout linearLayout = getchunkpublicationstate3.MediaBrowserCompatItemReceiver;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
                            bytesRead.MediaBrowserCompatCustomActionResultReceiver(linearLayout);
                            shouldEscapeCharacter.Companion companion = shouldEscapeCharacter.INSTANCE;
                            shouldEscapeCharacter.Companion.IconCompatParcelizer((View) getchunkpublicationstate3.AudioAttributesCompatParcelizer);
                            cloudMessagingReceiverIntentKeys.MediaBrowserCompatSearchResultReceiver();
                        } else {
                            getChunkPublicationState getchunkpublicationstate4 = cloudMessagingReceiverIntentKeys.write;
                            if (getchunkpublicationstate4 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                getchunkpublicationstate4 = null;
                            }
                            Group group3 = getchunkpublicationstate4.read;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(group3, "");
                            bytesRead.MediaBrowserCompatCustomActionResultReceiver(group3);
                            LinearLayout linearLayout2 = getchunkpublicationstate4.MediaBrowserCompatItemReceiver;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout2, "");
                            bytesRead.MediaBrowserCompatCustomActionResultReceiver(linearLayout2);
                        }
                        if (!startresolutionforresult.write().isEmpty()) {
                            cloudMessagingReceiverIntentKeys.write(startresolutionforresult);
                        }
                        getChunkPublicationState getchunkpublicationstate5 = cloudMessagingReceiverIntentKeys.write;
                        if (getchunkpublicationstate5 == null) {
                            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                        } else {
                            getchunkpublicationstate = getchunkpublicationstate5;
                        }
                        if (getchunkpublicationstate.MediaBrowserCompatCustomActionResultReceiver.getRating() != startresolutionforresult.getAudioAttributesCompatParcelizer()) {
                            getchunkpublicationstate.MediaBrowserCompatCustomActionResultReceiver.setRating(startresolutionforresult.getAudioAttributesCompatParcelizer());
                        }
                        getchunkpublicationstate.IconCompatParcelizer.setSelected(startresolutionforresult.getRemoteActionCompatParcelizer());
                        getchunkpublicationstate.IconCompatParcelizer.setClickable(startresolutionforresult.getRemoteActionCompatParcelizer());
                        if (startresolutionforresult.getRemoteActionCompatParcelizer()) {
                            getchunkpublicationstate.IconCompatParcelizer.setAlpha(1.0f);
                        } else {
                            getchunkpublicationstate.IconCompatParcelizer.setAlpha(0.5f);
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

        read(SampleVideos<? super read> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return CloudMessagingReceiverIntentKeys.this.new read(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: o.CloudMessagingReceiverIntentKeys$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "AudioAttributesCompatParcelizer", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ RenewEligible $RemoteActionCompatParcelizer;
        private /* synthetic */ getCreatedOnDateMs $write = null;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final withFieldVisibility invoke() {
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$RemoteActionCompatParcelizer);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return anyexplicitswithoutignoral != null ? anyexplicitswithoutignoral.getDefaultViewModelCreationExtras() : withFieldVisibility.write.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(RenewEligible renewEligible) {
            super(0);
            this.$RemoteActionCompatParcelizer = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.CloudMessagingReceiverIntentKeys$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "AudioAttributesCompatParcelizer", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass4 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ Fragment $AudioAttributesCompatParcelizer;
        private /* synthetic */ RenewEligible $IconCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            VisibilityChecker.RemoteActionCompatParcelizer defaultViewModelProviderFactory;
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$IconCompatParcelizer);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return (anyexplicitswithoutignoral == null || (defaultViewModelProviderFactory = anyexplicitswithoutignoral.getDefaultViewModelProviderFactory()) == null) ? this.$AudioAttributesCompatParcelizer.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(Fragment fragment, RenewEligible renewEligible) {
            super(0);
            this.$AudioAttributesCompatParcelizer = fragment;
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
                setUpdatedStatus<LessonFeedbackViewModel.RemoteActionCompatParcelizer> setupdatedstatusIconCompatParcelizer = CloudMessagingReceiverIntentKeys.this.write().IconCompatParcelizer();
                final CloudMessagingReceiverIntentKeys cloudMessagingReceiverIntentKeys = CloudMessagingReceiverIntentKeys.this;
                this.write = 1;
                if (setupdatedstatusIconCompatParcelizer.write(new getValidationToken() { // from class: o.CloudMessagingReceiverIntentKeys.write.3

                    /* JADX INFO: renamed from: o.CloudMessagingReceiverIntentKeys$write$3$write, reason: collision with other inner class name */
                    public static final /* synthetic */ class C0021write {
                        public static final /* synthetic */ int[] IconCompatParcelizer;

                        static {
                            int[] iArr = new int[LessonFeedbackViewModel.RemoteActionCompatParcelizer.values().length];
                            try {
                                iArr[LessonFeedbackViewModel.RemoteActionCompatParcelizer.read.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[LessonFeedbackViewModel.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            IconCompatParcelizer = iArr;
                        }
                    }

                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return RemoteActionCompatParcelizer((LessonFeedbackViewModel.RemoteActionCompatParcelizer) obj2);
                    }

                    private Object RemoteActionCompatParcelizer(LessonFeedbackViewModel.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
                        int i2;
                        if (remoteActionCompatParcelizer != null) {
                            CloudMessagingReceiverIntentKeys cloudMessagingReceiverIntentKeys2 = cloudMessagingReceiverIntentKeys;
                            getChunkPublicationState getchunkpublicationstate = cloudMessagingReceiverIntentKeys2.write;
                            if (getchunkpublicationstate == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                getchunkpublicationstate = null;
                            }
                            TextView textView = getchunkpublicationstate.RatingCompat;
                            int i3 = C0021write.IconCompatParcelizer[remoteActionCompatParcelizer.ordinal()];
                            if (i3 == 1) {
                                i2 = R.string.rate_qbank_module;
                            } else {
                                if (i3 != 2) {
                                    throw new RenewEligibleCreator();
                                }
                                i2 = R.string.rate_module;
                            }
                            textView.setText(cloudMessagingReceiverIntentKeys2.getString(i2));
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
            return CloudMessagingReceiverIntentKeys.this.new write(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<getService> setupdatedstatusMediaBrowserCompatItemReceiver = CloudMessagingReceiverIntentKeys.this.write().MediaBrowserCompatItemReceiver();
                final CloudMessagingReceiverIntentKeys cloudMessagingReceiverIntentKeys = CloudMessagingReceiverIntentKeys.this;
                this.RemoteActionCompatParcelizer = 1;
                if (setupdatedstatusMediaBrowserCompatItemReceiver.write(new getValidationToken() { // from class: o.CloudMessagingReceiverIntentKeys.RemoteActionCompatParcelizer.1
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return RemoteActionCompatParcelizer((getService) obj2);
                    }

                    private Object RemoteActionCompatParcelizer(getService getservice) {
                        if (getservice instanceof getService.RemoteActionCompatParcelizer) {
                            getService.RemoteActionCompatParcelizer remoteActionCompatParcelizer = (getService.RemoteActionCompatParcelizer) getservice;
                            cloudMessagingReceiverIntentKeys.write(remoteActionCompatParcelizer.write(), remoteActionCompatParcelizer.RemoteActionCompatParcelizer(), remoteActionCompatParcelizer.AudioAttributesCompatParcelizer(), remoteActionCompatParcelizer.read(), remoteActionCompatParcelizer.IconCompatParcelizer());
                        } else if (getservice instanceof getService.AudioAttributesCompatParcelizer) {
                            cloudMessagingReceiverIntentKeys.AudioAttributesImplApi26Parcelizer();
                        } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getservice, getService.read.INSTANCE)) {
                            cloudMessagingReceiverIntentKeys.AudioAttributesCompatParcelizer();
                        } else if (getservice instanceof getService.IconCompatParcelizer) {
                            cloudMessagingReceiverIntentKeys.AudioAttributesImplApi21Parcelizer();
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
            return CloudMessagingReceiverIntentKeys.this.new RemoteActionCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class MediaBrowserCompatCustomActionResultReceiver extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<DataSourceBitmapLoaderExternalSyntheticLambda0<List<TagLSModel>>> setupdatedstatusAudioAttributesImplBaseParcelizer = CloudMessagingReceiverIntentKeys.this.write().AudioAttributesImplBaseParcelizer();
                final CloudMessagingReceiverIntentKeys cloudMessagingReceiverIntentKeys = CloudMessagingReceiverIntentKeys.this;
                this.write = 1;
                if (setupdatedstatusAudioAttributesImplBaseParcelizer.write(new getValidationToken() { // from class: o.CloudMessagingReceiverIntentKeys.MediaBrowserCompatCustomActionResultReceiver.5
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return RemoteActionCompatParcelizer((DataSourceBitmapLoaderExternalSyntheticLambda0) obj2);
                    }

                    private Object RemoteActionCompatParcelizer(DataSourceBitmapLoaderExternalSyntheticLambda0<List<TagLSModel>> dataSourceBitmapLoaderExternalSyntheticLambda0) {
                        if (dataSourceBitmapLoaderExternalSyntheticLambda0 instanceof setTopBitrateKbps) {
                            cloudMessagingReceiverIntentKeys.requireActivity().finish();
                        } else if (!(dataSourceBitmapLoaderExternalSyntheticLambda0 instanceof setStreamingFormat)) {
                            if (!(dataSourceBitmapLoaderExternalSyntheticLambda0 instanceof decodeBitmap)) {
                                throw new RenewEligibleCreator();
                            }
                            decodeBitmap decodebitmap = (decodeBitmap) dataSourceBitmapLoaderExternalSyntheticLambda0;
                            if (((List) decodebitmap.RemoteActionCompatParcelizer()).isEmpty()) {
                                getChunkPublicationState getchunkpublicationstate = cloudMessagingReceiverIntentKeys.write;
                                if (getchunkpublicationstate == null) {
                                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                    getchunkpublicationstate = null;
                                }
                                Group group = getchunkpublicationstate.read;
                                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(group, "");
                                bytesRead.MediaBrowserCompatCustomActionResultReceiver(group);
                            } else {
                                cloudMessagingReceiverIntentKeys.write((List<TagLSModel>) decodebitmap.RemoteActionCompatParcelizer());
                            }
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

        MediaBrowserCompatCustomActionResultReceiver(SampleVideos<? super MediaBrowserCompatCustomActionResultReceiver> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return CloudMessagingReceiverIntentKeys.this.new MediaBrowserCompatCustomActionResultReceiver(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatCustomActionResultReceiver) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void write(String p0, String p1, int p2, List<String> p3, readBlockToCache p4) {
        r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<Intent> r8lambdaibk6u1hk7j3awkl_wn934v2uvi8 = this.read;
        onLoaderReset.Companion companion = onLoaderReset.INSTANCE;
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        r8lambdaibk6u1hk7j3awkl_wn934v2uvi8.read(onLoaderReset.Companion.AudioAttributesCompatParcelizer(contextRequireContext, new BlockingServiceConnection(null, p0, p1, p2, p3, 0, p4, 33, null)));
        write().read(ErrorDialogFragment.read.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void write(startResolutionForResult p0) {
        getChunkPublicationState getchunkpublicationstate = this.write;
        if (getchunkpublicationstate == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            getchunkpublicationstate = null;
        }
        FlexboxLayout flexboxLayout = getchunkpublicationstate.MediaBrowserCompatSearchResultReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(flexboxLayout, "");
        Iterator<View> itWrite = getSerializerForJavaNioFilePath.read(flexboxLayout).write();
        while (itWrite.hasNext()) {
            View next = itWrite.next();
            toMagicModuleMetaRepoModel.read(next, "");
            Chip chip = (Chip) next;
            chip.setSelected(IntermediateLoginResponseBody.AudioAttributesCompatParcelizer(p0.write(), chip.getTag()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MediaBrowserCompatSearchResultReceiver() {
        getChunkPublicationState getchunkpublicationstate = this.write;
        getChunkPublicationState getchunkpublicationstate2 = null;
        if (getchunkpublicationstate == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            getchunkpublicationstate = null;
        }
        LinearLayout linearLayout = getchunkpublicationstate.AudioAttributesImplApi21Parcelizer;
        getChunkPublicationState getchunkpublicationstate3 = this.write;
        if (getchunkpublicationstate3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            getchunkpublicationstate3 = null;
        }
        linearLayout.setBackgroundColor(createExtractors.RemoteActionCompatParcelizer(getchunkpublicationstate3.AudioAttributesImplApi21Parcelizer, R.attr.colorSurface));
        getChunkPublicationState getchunkpublicationstate4 = this.write;
        if (getchunkpublicationstate4 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            getchunkpublicationstate4 = null;
        }
        ViewGroup.LayoutParams layoutParams = getchunkpublicationstate4.AudioAttributesImplApi21Parcelizer.getLayoutParams();
        toMagicModuleMetaRepoModel.read(layoutParams, "");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2._init_lambda4 = -1;
        getChunkPublicationState getchunkpublicationstate5 = this.write;
        if (getchunkpublicationstate5 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            getchunkpublicationstate5 = null;
        }
        layoutParams2.read = getchunkpublicationstate5.MediaDescriptionCompat.getId();
        getChunkPublicationState getchunkpublicationstate6 = this.write;
        if (getchunkpublicationstate6 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            getchunkpublicationstate2 = getchunkpublicationstate6;
        }
        getchunkpublicationstate2.AudioAttributesImplApi21Parcelizer.requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void RatingCompat() {
        getChunkPublicationState getchunkpublicationstate = this.write;
        getChunkPublicationState getchunkpublicationstate2 = null;
        if (getchunkpublicationstate == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            getchunkpublicationstate = null;
        }
        LinearLayout linearLayout = getchunkpublicationstate.AudioAttributesImplApi21Parcelizer;
        getChunkPublicationState getchunkpublicationstate3 = this.write;
        if (getchunkpublicationstate3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            getchunkpublicationstate3 = null;
        }
        linearLayout.setBackgroundColor(createExtractors.RemoteActionCompatParcelizer(getchunkpublicationstate3.AudioAttributesImplApi21Parcelizer, R.attr.backgroundColor));
        getChunkPublicationState getchunkpublicationstate4 = this.write;
        if (getchunkpublicationstate4 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            getchunkpublicationstate4 = null;
        }
        ViewGroup.LayoutParams layoutParams = getchunkpublicationstate4.AudioAttributesImplApi21Parcelizer.getLayoutParams();
        toMagicModuleMetaRepoModel.read(layoutParams, "");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        getChunkPublicationState getchunkpublicationstate5 = this.write;
        if (getchunkpublicationstate5 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            getchunkpublicationstate5 = null;
        }
        layoutParams2._init_lambda4 = getchunkpublicationstate5.MediaBrowserCompatItemReceiver.getId();
        layoutParams2.read = -1;
        layoutParams2.setMargins(0, 24, 0, 0);
        getChunkPublicationState getchunkpublicationstate6 = this.write;
        if (getchunkpublicationstate6 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            getchunkpublicationstate6 = null;
        }
        getchunkpublicationstate6.AudioAttributesImplApi21Parcelizer.requestLayout();
        getChunkPublicationState getchunkpublicationstate7 = this.write;
        if (getchunkpublicationstate7 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            getchunkpublicationstate2 = getchunkpublicationstate7;
        }
        onDraw.IconCompatParcelizer((View) getchunkpublicationstate2.AudioAttributesImplApi21Parcelizer, 0, 300);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AudioAttributesImplApi26Parcelizer() {
        getOriginalPriority.Companion companion = getOriginalPriority.INSTANCE;
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        startActivity(getOriginalPriority.Companion.IconCompatParcelizer(contextRequireContext).addFlags(33554432));
        write().read(ErrorDialogFragment.read.INSTANCE);
        requireActivity().finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void write(List<TagLSModel> p0) {
        getChunkPublicationState getchunkpublicationstate = this.write;
        if (getchunkpublicationstate == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            getchunkpublicationstate = null;
        }
        getchunkpublicationstate.MediaBrowserCompatSearchResultReceiver.removeAllViews();
        for (final TagLSModel tagLSModel : p0) {
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
            getChunkPublicationState getchunkpublicationstate2 = this.write;
            if (getchunkpublicationstate2 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                getchunkpublicationstate2 = null;
            }
            View viewInflate = layoutInflaterFrom.inflate(R.layout.rv_item_tag_selection, (ViewGroup) getchunkpublicationstate2.MediaBrowserCompatSearchResultReceiver, false);
            toMagicModuleMetaRepoModel.read(viewInflate, "");
            final Chip chip = (Chip) viewInflate;
            chip.setText(tagLSModel.getTitle());
            chip.setTag(tagLSModel.getTitle());
            chip.setSelected(false);
            chip.setOnClickListener(new View.OnClickListener() { // from class: o.newChooseAccountIntent
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CloudMessagingReceiverIntentKeys.read(chip, this, tagLSModel);
                }
            });
            getChunkPublicationState getchunkpublicationstate3 = this.write;
            if (getchunkpublicationstate3 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                getchunkpublicationstate3 = null;
            }
            getchunkpublicationstate3.MediaBrowserCompatSearchResultReceiver.addView(chip);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void read(Chip chip, CloudMessagingReceiverIntentKeys cloudMessagingReceiverIntentKeys, TagLSModel tagLSModel) {
        chip.setSelected(!chip.isSelected());
        cloudMessagingReceiverIntentKeys.write().read(new ErrorDialogFragment.AudioAttributesImplApi21Parcelizer(tagLSModel));
    }

    private final void MediaBrowserCompatItemReceiver() {
        final getChunkPublicationState getchunkpublicationstate = this.write;
        if (getchunkpublicationstate == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            getchunkpublicationstate = null;
        }
        getchunkpublicationstate.MediaBrowserCompatCustomActionResultReceiver.setOnRatingBarChangedListener(new RatingBar.OnRatingBarChangeListener() { // from class: o.IMessengerCompat
            @Override // android.widget.RatingBar.OnRatingBarChangeListener
            public final void onRatingChanged(RatingBar ratingBar, float f, boolean z) {
                CloudMessagingReceiverIntentKeys.AudioAttributesCompatParcelizer(this.read, f);
            }
        });
        getchunkpublicationstate.MediaBrowserCompatMediaItem.setOnClickListener(new View.OnClickListener() { // from class: o.IMessengerCompatProxy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CloudMessagingReceiverIntentKeys.MediaDescriptionCompat(this.read);
            }
        });
        getchunkpublicationstate.IconCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.zzaa
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CloudMessagingReceiverIntentKeys.RemoteActionCompatParcelizer(getchunkpublicationstate, this);
            }
        });
        getchunkpublicationstate.RemoteActionCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.IMessengerCompatImpl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CloudMessagingReceiverIntentKeys.MediaBrowserCompatMediaItem(this.read);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesCompatParcelizer(CloudMessagingReceiverIntentKeys cloudMessagingReceiverIntentKeys, float f) {
        cloudMessagingReceiverIntentKeys.write().read(new ErrorDialogFragment.IconCompatParcelizer((int) f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MediaDescriptionCompat(CloudMessagingReceiverIntentKeys cloudMessagingReceiverIntentKeys) {
        cloudMessagingReceiverIntentKeys.write().read(ErrorDialogFragment.write.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RemoteActionCompatParcelizer(getChunkPublicationState getchunkpublicationstate, CloudMessagingReceiverIntentKeys cloudMessagingReceiverIntentKeys) {
        if (getchunkpublicationstate.IconCompatParcelizer.isSelected()) {
            LessonFeedbackViewModel lessonFeedbackViewModelWrite = cloudMessagingReceiverIntentKeys.write();
            getChunkPublicationState getchunkpublicationstate2 = cloudMessagingReceiverIntentKeys.write;
            if (getchunkpublicationstate2 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                getchunkpublicationstate2 = null;
            }
            lessonFeedbackViewModelWrite.read(new ErrorDialogFragment.AudioAttributesImplBaseParcelizer(getchunkpublicationstate2.AudioAttributesCompatParcelizer.getText().toString()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MediaBrowserCompatMediaItem(CloudMessagingReceiverIntentKeys cloudMessagingReceiverIntentKeys) {
        cloudMessagingReceiverIntentKeys.AudioAttributesCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AudioAttributesCompatParcelizer() {
        write().read(ErrorDialogFragment.read.INSTANCE);
        maybeGetTypeVariable activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AudioAttributesImplApi21Parcelizer() {
        new setResultCallback();
        maybeGetTypeVariable maybegettypevariableRequireActivity = requireActivity();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(maybegettypevariableRequireActivity, "");
        setResultCallback.AudioAttributesCompatParcelizer(maybegettypevariableRequireActivity, new getCreatedOnDateMs() { // from class: o.zzz
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return CloudMessagingReceiverIntentKeys.MediaBrowserCompatSearchResultReceiver(this.AudioAttributesCompatParcelizer);
            }
        }, new getAnswerMap() { // from class: o.loadClass
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return CloudMessagingReceiverIntentKeys.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, (Exception) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatSearchResultReceiver(CloudMessagingReceiverIntentKeys cloudMessagingReceiverIntentKeys) {
        cloudMessagingReceiverIntentKeys.write().read(ErrorDialogFragment.AudioAttributesCompatParcelizer.INSTANCE);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(CloudMessagingReceiverIntentKeys cloudMessagingReceiverIntentKeys, Exception exc) {
        cloudMessagingReceiverIntentKeys.write().read(new ErrorDialogFragment.RemoteActionCompatParcelizer(exc));
        return getShowPopup.INSTANCE;
    }

    private final void MediaBrowserCompatMediaItem() {
        if (DeviceProperties.isTablet(requireContext())) {
            Context contextRequireContext = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
            getChunkPublicationState getchunkpublicationstate = this.write;
            getChunkPublicationState getchunkpublicationstate2 = null;
            if (getchunkpublicationstate == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                getchunkpublicationstate = null;
            }
            LinearLayout linearLayout = getchunkpublicationstate.AudioAttributesImplBaseParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
            bytesRead.IconCompatParcelizer(contextRequireContext, linearLayout);
            Context contextRequireContext2 = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext2, "");
            getChunkPublicationState getchunkpublicationstate3 = this.write;
            if (getchunkpublicationstate3 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                getchunkpublicationstate3 = null;
            }
            ConstraintLayout constraintLayout = getchunkpublicationstate3.AudioAttributesImplApi26Parcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout, "");
            bytesRead.IconCompatParcelizer(contextRequireContext2, constraintLayout);
            Context contextRequireContext3 = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext3, "");
            getChunkPublicationState getchunkpublicationstate4 = this.write;
            if (getchunkpublicationstate4 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                getchunkpublicationstate4 = null;
            }
            LinearLayout linearLayout2 = getchunkpublicationstate4.MediaBrowserCompatItemReceiver;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout2, "");
            bytesRead.IconCompatParcelizer(contextRequireContext3, linearLayout2);
            Context contextRequireContext4 = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext4, "");
            getChunkPublicationState getchunkpublicationstate5 = this.write;
            if (getchunkpublicationstate5 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            } else {
                getchunkpublicationstate2 = getchunkpublicationstate5;
            }
            LinearLayout linearLayout3 = getchunkpublicationstate2.AudioAttributesImplApi21Parcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout3, "");
            PlayerControlViewExternalSyntheticLambda1.IconCompatParcelizer(contextRequireContext4, linearLayout3);
        }
    }

    /* JADX INFO: renamed from: o.CloudMessagingReceiverIntentKeys$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/CloudMessagingReceiverIntentKeys$IconCompatParcelizer;", "", "<init>", "()V", "Lo/setTitleOverrideText;", "p0", "Lo/CloudMessagingReceiverIntentKeys;", "RemoteActionCompatParcelizer", "(Lo/setTitleOverrideText;)Lo/CloudMessagingReceiverIntentKeys;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static CloudMessagingReceiverIntentKeys RemoteActionCompatParcelizer(setTitleOverrideText p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            CloudMessagingReceiverIntentKeys cloudMessagingReceiverIntentKeys = new CloudMessagingReceiverIntentKeys();
            cloudMessagingReceiverIntentKeys.setArguments(p0.read());
            return cloudMessagingReceiverIntentKeys;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
