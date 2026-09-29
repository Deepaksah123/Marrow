package kotlin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.marrow.R;
import com.marrow.data.models.common.CourseConfigKeyConstantsKt;
import com.marrow.ui.views.CustomTextView;
import com.marrow.ui.views.ZoomableLinearLayoutManager;
import com.marrow2.ui.video.notes.custom_view.ZoomableRecyclerViewV2;
import com.marrow2.ui.video.notes.viewmodel.VideoNotesViewModel;
import kotlin.Metadata;
import kotlin.VisibilityChecker;
import kotlin.invokeSuspend;
import kotlin.isSpecialNorthAmericanChar;
import kotlin.onPageFinished;
import kotlin.onReceivedError;
import kotlin.setSelectionOverridesFromBundle;
import kotlin.shouldInterceptRequest;
import kotlin.withFieldVisibility;
import kotlin.zzscd;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000  2\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J!\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ'\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0014\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0003J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0003J\u000f\u0010\u0019\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u0003J\u000f\u0010\u001a\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u0003J\u000f\u0010\u001b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001b\u0010\u0003J\u000f\u0010\u001c\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001c\u0010\u0003R\u001b\u0010 \u001a\u00020\u001d8CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u001e\u001a\u0004\b\u0016\u0010\u001fR\u001b\u0010#\u001a\u00020!8CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\"\u001a\u0004\b#\u0010$R\u001b\u0010\u0016\u001a\u00020%8CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\"\u001a\u0004\b \u0010&R\u0016\u0010\u0014\u001a\u00020'8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u000e\u0010(R\u0016\u0010*\u001a\u00020\r8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010)R\u0018\u0010\u000e\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010,R\u0014\u0010\u0018\u001a\u00020-8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010.R\u0016\u0010\u0010\u001a\u00020/8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b*\u00100"}, d2 = {"Lo/invokeSuspend;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "", "onStart", "Landroid/view/View;", "p0", "Landroid/os/Bundle;", "p1", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "AudioAttributesImplApi26Parcelizer", "", "MediaBrowserCompatCustomActionResultReceiver", "()Z", "AudioAttributesImplBaseParcelizer", "", "", "p2", "RemoteActionCompatParcelizer", "(Ljava/lang/String;ILjava/lang/String;)V", "read", "(I)V", "AudioAttributesImplApi21Parcelizer", "MediaBrowserCompatItemReceiver", "MediaMetadataCompat", "onStop", "onDestroy", "Lo/deriveOverridingDrmInitData;", "Lo/setSessionInfo;", "()Lo/deriveOverridingDrmInitData;", "write", "Lo/onPageFinished;", "Lo/RenewEligible;", "AudioAttributesCompatParcelizer", "()Lo/onPageFinished;", "Lcom/marrow2/ui/video/notes/viewmodel/VideoNotesViewModel;", "()Lcom/marrow2/ui/video/notes/viewmodel/VideoNotesViewModel;", "Lo/execute0E7RQCE;", "Lo/execute0E7RQCE;", "Z", "IconCompatParcelizer", "Lo/setSelectionOverridesFromBundle;", "Lo/setSelectionOverridesFromBundle;", "Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatSearchResultReceiver;", "Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatSearchResultReceiver;", "Lo/invokeSuspend$read;", "Lo/invokeSuspend$read;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class invokeSuspend extends getAction {
    private static /* synthetic */ isResolutionNotSupported<Object>[] AudioAttributesCompatParcelizer = {toMagicModuleMetaDataUcModel.write(new downloadMagicModuleMetalambda0(invokeSuspend.class, "binding", "getBinding()Lcom/marrow/databinding/FragmentVideoNotesBinding;", 0))};

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final RenewEligible AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final RecyclerView.MediaBrowserCompatSearchResultReceiver AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private boolean IconCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private read AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private execute0E7RQCE RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final RenewEligible read;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private setSelectionOverridesFromBundle MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final setSessionInfo write;

    public invokeSuspend() {
        super((byte) 0);
        invokeSuspend invokesuspend = this;
        this.write = SessionDescription.IconCompatParcelizer(invokesuspend, new MediaBrowserCompatCustomActionResultReceiver(), new getAnswerMap() { // from class: o.executegIAlus
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return invokeSuspend.write(this.IconCompatParcelizer, (deriveOverridingDrmInitData) obj);
            }
        });
        this.AudioAttributesCompatParcelizer = getRenewExpiresOn.RemoteActionCompatParcelizer(new getCreatedOnDateMs() { // from class: o.RecaptchaActionCompanion
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return invokeSuspend.MediaBrowserCompatItemReceiver(this.read);
            }
        });
        RenewEligible renewEligibleWrite = getRenewExpiresOn.write(RenewEligibleCompanion.read, new AnonymousClass1(new AnonymousClass3(invokesuspend)));
        this.read = _resolveFieldVsGetter.RemoteActionCompatParcelizer(toMagicModuleMetaDataUcModel.write(VideoNotesViewModel.class), new AnonymousClass4(renewEligibleWrite), new AnonymousClass2(renewEligibleWrite), new AnonymousClass5(invokesuspend, renewEligibleWrite));
        this.IconCompatParcelizer = true;
        this.AudioAttributesImplApi21Parcelizer = new AudioAttributesImplApi21Parcelizer();
        this.AudioAttributesImplBaseParcelizer = new read();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final deriveOverridingDrmInitData read() {
        return (deriveOverridingDrmInitData) this.write.read(this, AudioAttributesCompatParcelizer[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(invokeSuspend invokesuspend, deriveOverridingDrmInitData deriveoverridingdrminitdata) {
        toMagicModuleMetaRepoModel.write(deriveoverridingdrminitdata, "");
        ZoomableRecyclerViewV2 zoomableRecyclerViewV2 = deriveoverridingdrminitdata.read;
        if (zoomableRecyclerViewV2 != null) {
            zoomableRecyclerViewV2.setAdapter(null);
            zoomableRecyclerViewV2.write(invokesuspend.AudioAttributesImplApi21Parcelizer);
        }
        return getShowPopup.INSTANCE;
    }

    private final onPageFinished AudioAttributesCompatParcelizer() {
        return (onPageFinished) this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final onPageFinished MediaBrowserCompatItemReceiver(invokeSuspend invokesuspend) {
        onPageFinished.Companion companion = onPageFinished.INSTANCE;
        Bundle bundleRequireArguments = invokesuspend.requireArguments();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(bundleRequireArguments, "");
        return onPageFinished.Companion.read(bundleRequireArguments);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final VideoNotesViewModel write() {
        return (VideoNotesViewModel) this.read.RemoteActionCompatParcelizer();
    }

    public static final class AudioAttributesImplApi21Parcelizer extends RecyclerView.MediaBrowserCompatSearchResultReceiver {
        AudioAttributesImplApi21Parcelizer() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatSearchResultReceiver
        public final void RemoteActionCompatParcelizer(RecyclerView recyclerView, int i, int i2) {
            toMagicModuleMetaRepoModel.write(recyclerView, "");
            if (i2 != 0) {
                RecyclerView.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiverAudioAttributesImplApi21Parcelizer = recyclerView.AudioAttributesImplApi21Parcelizer();
                toMagicModuleMetaRepoModel.read(mediaBrowserCompatItemReceiverAudioAttributesImplApi21Parcelizer, "");
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) mediaBrowserCompatItemReceiverAudioAttributesImplApi21Parcelizer;
                int iMediaBrowserCompatItemReceiver = linearLayoutManager.MediaBrowserCompatItemReceiver();
                int iMediaMetadataCompat = linearLayoutManager.MediaMetadataCompat();
                recyclerView.getGlobalVisibleRect(new Rect());
                if (iMediaBrowserCompatItemReceiver <= iMediaMetadataCompat) {
                    double d = 0.0d;
                    while (true) {
                        View viewWrite = linearLayoutManager.write(iMediaBrowserCompatItemReceiver);
                        if (viewWrite != null) {
                            invokeSuspend invokesuspend = invokeSuspend.this;
                            double dIconCompatParcelizer = PlayerControlViewExternalSyntheticLambda1.IconCompatParcelizer(viewWrite);
                            if (dIconCompatParcelizer > d) {
                                invokesuspend.write().read(new onReceivedError.AudioAttributesCompatParcelizer(iMediaBrowserCompatItemReceiver + 1));
                                d = dIconCompatParcelizer;
                            }
                        }
                        if (iMediaBrowserCompatItemReceiver == iMediaMetadataCompat) {
                            break;
                        } else {
                            iMediaBrowserCompatItemReceiver++;
                        }
                    }
                }
            }
            super.RemoteActionCompatParcelizer(recyclerView, i, i2);
        }
    }

    public static final class read extends isXdsControlCode {
        read() {
        }

        @Override // kotlin.isXdsControlCode
        public final void RemoteActionCompatParcelizer(String str) {
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) "video_config_changed", (Object) str)) {
                ZoomableRecyclerViewV2 zoomableRecyclerViewV2 = invokeSuspend.this.read().read;
                final invokeSuspend invokesuspend = invokeSuspend.this;
                zoomableRecyclerViewV2.post(new Runnable() { // from class: o.RecaptchaClient
                    @Override // java.lang.Runnable
                    public final void run() {
                        invokeSuspend.read.read(invokesuspend);
                    }
                });
                invokeSuspend.this.AudioAttributesImplApi26Parcelizer();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void read(invokeSuspend invokesuspend) {
            ZoomableRecyclerViewV2 zoomableRecyclerViewV2 = invokesuspend.read().read;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(zoomableRecyclerViewV2, "");
            zoomableRecyclerViewV2.RemoteActionCompatParcelizer((Float) null, (Float) null);
            execute0E7RQCE execute0e7rqce = invokesuspend.RemoteActionCompatParcelizer;
            if (execute0e7rqce == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                execute0e7rqce = null;
            }
            execute0e7rqce.AudioAttributesCompatParcelizer(invokesuspend.read().IconCompatParcelizer().getMeasuredWidth());
            invokesuspend.write().read(onReceivedError.IconCompatParcelizer.INSTANCE);
        }

        @Override // kotlin.isXdsControlCode, android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    }

    /* JADX INFO: renamed from: o.invokeSuspend$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Landroidx/fragment/app/Fragment;", "IconCompatParcelizer", "()Landroidx/fragment/app/Fragment;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<Fragment> {
        private /* synthetic */ Fragment $AudioAttributesCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.$AudioAttributesCompatParcelizer;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Fragment fragment) {
            super(0);
            this.$AudioAttributesCompatParcelizer = fragment;
        }
    }

    /* JADX INFO: renamed from: o.invokeSuspend$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/TypeResolutionContext;", "RemoteActionCompatParcelizer", "()Lo/TypeResolutionContext;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<TypeResolutionContext> {
        private /* synthetic */ getCreatedOnDateMs $RemoteActionCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final TypeResolutionContext invoke() {
            return (TypeResolutionContext) this.$RemoteActionCompatParcelizer.invoke();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(getCreatedOnDateMs getcreatedondatems) {
            super(0);
            this.$RemoteActionCompatParcelizer = getcreatedondatems;
        }
    }

    /* JADX INFO: renamed from: o.invokeSuspend$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "AudioAttributesCompatParcelizer", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass4 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ RenewEligible $RemoteActionCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return _resolveFieldVsGetter.write(this.$RemoteActionCompatParcelizer).getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(RenewEligible renewEligible) {
            super(0);
            this.$RemoteActionCompatParcelizer = renewEligible;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        MediaBrowserCompatItemReceiver();
        super.onStart();
    }

    /* JADX INFO: renamed from: o.invokeSuspend$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "IconCompatParcelizer", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass2 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ RenewEligible $IconCompatParcelizer;
        private /* synthetic */ getCreatedOnDateMs $write = null;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final withFieldVisibility invoke() {
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$IconCompatParcelizer);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return anyexplicitswithoutignoral != null ? anyexplicitswithoutignoral.getDefaultViewModelCreationExtras() : withFieldVisibility.write.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(RenewEligible renewEligible) {
            super(0);
            this.$IconCompatParcelizer = renewEligible;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View p0, Bundle p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onViewCreated(p0, p1);
        this.RemoteActionCompatParcelizer = new execute0E7RQCE(new MagicModuleSubmissionRequestBody() { // from class: o.custom
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return invokeSuspend.AudioAttributesCompatParcelizer(this.IconCompatParcelizer, (cs) obj, (Exception) obj2);
            }
        });
        ZoomableRecyclerViewV2 zoomableRecyclerViewV2 = read().read;
        execute0E7RQCE execute0e7rqce = this.RemoteActionCompatParcelizer;
        if (execute0e7rqce == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            execute0e7rqce = null;
        }
        zoomableRecyclerViewV2.setAdapter(execute0e7rqce);
        ZoomableRecyclerViewV2 zoomableRecyclerViewV22 = read().read;
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        zoomableRecyclerViewV22.setLayoutManager(new ZoomableLinearLayoutManager(contextRequireContext));
        read().read.RemoteActionCompatParcelizer(this.AudioAttributesImplApi21Parcelizer);
        AudioAttributesImplApi26Parcelizer();
        read().RemoteActionCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.RecaptchagetClient1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                invokeSuspend.MediaBrowserCompatCustomActionResultReceiver(this.RemoteActionCompatParcelizer);
            }
        });
        read().read.post(new Runnable() { // from class: o.RecaptchaAction
            @Override // java.lang.Runnable
            public final void run() {
                invokeSuspend.AudioAttributesImplApi26Parcelizer(this.read);
            }
        });
        if (this.IconCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) AudioAttributesCompatParcelizer().getRemoteActionCompatParcelizer(), (Object) "player_controls")) {
            withAlwaysAsId.read(this, "video_notes_ready_result", _getIndexResolver.write(setAction.write("is_video_notes_ready", Boolean.TRUE)));
            this.IconCompatParcelizer = false;
        }
        if (AudioAttributesCompatParcelizer().getAudioAttributesCompatParcelizer().length() == 0) {
            requireActivity().finish();
        }
        AudioAttributesImplApi21Parcelizer();
    }

    /* JADX INFO: renamed from: o.invokeSuspend$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "write", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ Fragment $AudioAttributesCompatParcelizer;
        private /* synthetic */ RenewEligible $IconCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            VisibilityChecker.RemoteActionCompatParcelizer defaultViewModelProviderFactory;
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$IconCompatParcelizer);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return (anyexplicitswithoutignoral == null || (defaultViewModelProviderFactory = anyexplicitswithoutignoral.getDefaultViewModelProviderFactory()) == null) ? this.$AudioAttributesCompatParcelizer.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(Fragment fragment, RenewEligible renewEligible) {
            super(0);
            this.$AudioAttributesCompatParcelizer = fragment;
            this.$IconCompatParcelizer = renewEligible;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(invokeSuspend invokesuspend, cs csVar, Exception exc) {
        toMagicModuleMetaRepoModel.write(csVar, "");
        toMagicModuleMetaRepoModel.write(exc, "");
        invokesuspend.write().read(new onReceivedError.write(csVar, exc));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MediaBrowserCompatCustomActionResultReceiver(invokeSuspend invokesuspend) {
        invokesuspend.write().read(onReceivedError.AudioAttributesImplApi21Parcelizer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesImplApi26Parcelizer(invokeSuspend invokesuspend) {
        execute0E7RQCE execute0e7rqce = invokesuspend.RemoteActionCompatParcelizer;
        if (execute0e7rqce == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            execute0e7rqce = null;
        }
        execute0e7rqce.AudioAttributesCompatParcelizer(invokesuspend.read().IconCompatParcelizer().getMeasuredWidth());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AudioAttributesImplApi26Parcelizer() {
        read().RemoteActionCompatParcelizer.setImageResource((MediaBrowserCompatCustomActionResultReceiver() || !AudioAttributesImplBaseParcelizer()) ? R.drawable.ic_notes_feedback_phone : R.drawable.ic_notes_feedback_tab);
    }

    private final boolean MediaBrowserCompatCustomActionResultReceiver() {
        if (!AudioAttributesCompatParcelizer().getIconCompatParcelizer()) {
            return false;
        }
        updateNavigation updatenavigation = updateNavigation.INSTANCE;
        maybeGetTypeVariable maybegettypevariableRequireActivity = requireActivity();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(maybegettypevariableRequireActivity, "");
        return !updateNavigation.read((Activity) maybegettypevariableRequireActivity);
    }

    private final boolean AudioAttributesImplBaseParcelizer() {
        return getResources().getBoolean(R.bool.is_tablet);
    }

    public static final class MediaBrowserCompatCustomActionResultReceiver implements getAnswerMap<invokeSuspend, deriveOverridingDrmInitData> {
        /* JADX WARN: Type inference failed for: r0v1, types: [o.deriveOverridingDrmInitData, o.getApplicationLabel] */
        @Override // kotlin.getAnswerMap
        public final /* synthetic */ deriveOverridingDrmInitData invoke(invokeSuspend invokesuspend) {
            return RemoteActionCompatParcelizer(invokesuspend);
        }

        private static deriveOverridingDrmInitData RemoteActionCompatParcelizer(invokeSuspend invokesuspend) {
            toMagicModuleMetaRepoModel.write(invokesuspend, "");
            return deriveOverridingDrmInitData.RemoteActionCompatParcelizer(invokesuspend.requireView());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void RemoteActionCompatParcelizer(String p0, int p1, String p2) {
        RemoteActionCompatParcelizer();
        setSelectionOverridesFromBundle.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = setSelectionOverridesFromBundle.IconCompatParcelizer;
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        setSelectionOverridesFromBundle setselectionoverridesfrombundleWrite = setSelectionOverridesFromBundle.AudioAttributesCompatParcelizer.write(contextRequireContext, p0, p1, p2);
        this.MediaBrowserCompatCustomActionResultReceiver = setselectionoverridesfrombundleWrite;
        setselectionoverridesfrombundleWrite.show();
    }

    private final void RemoteActionCompatParcelizer() {
        setSelectionOverridesFromBundle setselectionoverridesfrombundle;
        setSelectionOverridesFromBundle setselectionoverridesfrombundle2 = this.MediaBrowserCompatCustomActionResultReceiver;
        if (setselectionoverridesfrombundle2 == null || !setselectionoverridesfrombundle2.isShowing() || (setselectionoverridesfrombundle = this.MediaBrowserCompatCustomActionResultReceiver) == null) {
            return;
        }
        setselectionoverridesfrombundle.dismiss();
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ invokeSuspend AudioAttributesCompatParcelizer;
        private int IconCompatParcelizer;
        private /* synthetic */ int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.IconCompatParcelizer = 1;
                if (setCountry.IconCompatParcelizer(100L, this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            if (this.write >= 0) {
                RecyclerView.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiverAudioAttributesImplApi21Parcelizer = this.AudioAttributesCompatParcelizer.read().read.AudioAttributesImplApi21Parcelizer();
                ZoomableLinearLayoutManager zoomableLinearLayoutManager = mediaBrowserCompatItemReceiverAudioAttributesImplApi21Parcelizer instanceof ZoomableLinearLayoutManager ? (ZoomableLinearLayoutManager) mediaBrowserCompatItemReceiverAudioAttributesImplApi21Parcelizer : null;
                if (zoomableLinearLayoutManager != null) {
                    zoomableLinearLayoutManager.read(this.write - 1);
                }
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        RemoteActionCompatParcelizer(int i, invokeSuspend invokesuspend, SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.write = i;
            this.AudioAttributesCompatParcelizer = invokesuspend;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new RemoteActionCompatParcelizer(this.write, this.AudioAttributesCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void read(int p0) {
        hasGetter viewLifecycleOwner = getViewLifecycleOwner();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewLifecycleOwner, "");
        C0201setMcqCount.IconCompatParcelizer(getInternalName.RemoteActionCompatParcelizer(viewLifecycleOwner), null, null, new RemoteActionCompatParcelizer(p0, this, null), 3);
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<shouldInterceptRequest> setupdatedstatus = invokeSuspend.this.write().read();
                final invokeSuspend invokesuspend = invokeSuspend.this;
                this.RemoteActionCompatParcelizer = 1;
                if (setupdatedstatus.write(new getValidationToken() { // from class: o.invokeSuspend.IconCompatParcelizer.5
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return read((shouldInterceptRequest) obj2);
                    }

                    private Object read(shouldInterceptRequest shouldinterceptrequest) {
                        if (shouldinterceptrequest instanceof shouldInterceptRequest.AudioAttributesCompatParcelizer) {
                            LinearLayout linearLayout = invokesuspend.read().AudioAttributesCompatParcelizer;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
                            bytesRead.MediaBrowserCompatCustomActionResultReceiver(linearLayout);
                            invokeSuspend invokesuspend2 = invokesuspend;
                            String strIconCompatParcelizer = ((shouldInterceptRequest.AudioAttributesCompatParcelizer) shouldinterceptrequest).IconCompatParcelizer();
                            if (strIconCompatParcelizer == null) {
                                strIconCompatParcelizer = invokesuspend.getString(R.string.something_went_wrong);
                                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strIconCompatParcelizer, "");
                            }
                            CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer(invokesuspend2, strIconCompatParcelizer, 0);
                        } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(shouldinterceptrequest, shouldInterceptRequest.IconCompatParcelizer.INSTANCE)) {
                            LinearLayout linearLayout2 = invokesuspend.read().AudioAttributesCompatParcelizer;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout2, "");
                            PlayerControlViewExternalSyntheticLambda1.write(linearLayout2);
                            invokesuspend.read().IconCompatParcelizer.setText(invokesuspend.getString(R.string.f_loading_notes, CourseConfigKeyConstantsKt.KEY_NOTES));
                        } else if (shouldinterceptrequest instanceof shouldInterceptRequest.read) {
                            LinearLayout linearLayout3 = invokesuspend.read().AudioAttributesCompatParcelizer;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout3, "");
                            bytesRead.MediaBrowserCompatCustomActionResultReceiver(linearLayout3);
                            CustomTextView customTextView = invokesuspend.read().write;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView, "");
                            PlayerControlViewExternalSyntheticLambda1.write((View) customTextView);
                            String strIconCompatParcelizer2 = ((shouldInterceptRequest.read) shouldinterceptrequest).IconCompatParcelizer();
                            String str = strIconCompatParcelizer2;
                            if (str == null || str.length() == 0) {
                                strIconCompatParcelizer2 = invokesuspend.getString(R.string.f_no_notes_present);
                            }
                            invokesuspend.read().write.setText(strIconCompatParcelizer2);
                        } else if (shouldinterceptrequest instanceof shouldInterceptRequest.write) {
                            LinearLayout linearLayout4 = invokesuspend.read().AudioAttributesCompatParcelizer;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout4, "");
                            bytesRead.MediaBrowserCompatCustomActionResultReceiver(linearLayout4);
                            ZoomableRecyclerViewV2 zoomableRecyclerViewV2 = invokesuspend.read().read;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(zoomableRecyclerViewV2, "");
                            PlayerControlViewExternalSyntheticLambda1.write(zoomableRecyclerViewV2);
                            execute0E7RQCE execute0e7rqce = invokesuspend.RemoteActionCompatParcelizer;
                            execute0E7RQCE execute0e7rqce2 = null;
                            if (execute0e7rqce == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                execute0e7rqce = null;
                            }
                            shouldInterceptRequest.write writeVar = (shouldInterceptRequest.write) shouldinterceptrequest;
                            execute0e7rqce.RemoteActionCompatParcelizer(writeVar.write());
                            execute0E7RQCE execute0e7rqce3 = invokesuspend.RemoteActionCompatParcelizer;
                            if (execute0e7rqce3 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            } else {
                                execute0e7rqce2 = execute0e7rqce3;
                            }
                            execute0e7rqce2.read(writeVar.RemoteActionCompatParcelizer());
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
            throw new PlanDetailsCreator();
        }

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return invokeSuspend.this.new IconCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void AudioAttributesImplApi21Parcelizer() {
        invokeSuspend invokesuspend = this;
        setBitrateKbps.read(invokesuspend, new IconCompatParcelizer(null));
        setBitrateKbps.read(invokesuspend, new AudioAttributesCompatParcelizer(null));
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<zzscd> setupdatedstatusAudioAttributesCompatParcelizer = invokeSuspend.this.write().AudioAttributesCompatParcelizer();
                final invokeSuspend invokesuspend = invokeSuspend.this;
                this.write = 1;
                if (setupdatedstatusAudioAttributesCompatParcelizer.write(new getValidationToken() { // from class: o.invokeSuspend.AudioAttributesCompatParcelizer.1
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return AudioAttributesCompatParcelizer((zzscd) obj2);
                    }

                    private Object AudioAttributesCompatParcelizer(zzscd zzscdVar) {
                        if (zzscdVar instanceof zzscd.write) {
                            zzscd.write writeVar = (zzscd.write) zzscdVar;
                            invokesuspend.RemoteActionCompatParcelizer(writeVar.write(), writeVar.IconCompatParcelizer(), writeVar.AudioAttributesCompatParcelizer());
                            getProvider getprovider = getProvider.getInstance(invokesuspend.requireContext());
                            isSpecialNorthAmericanChar.Companion companion = isSpecialNorthAmericanChar.INSTANCE;
                            getprovider.AudioAttributesCompatParcelizer(isSpecialNorthAmericanChar.Companion.RemoteActionCompatParcelizer("VideoNotesFragment", "feedback-dialog-open"));
                        } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(zzscdVar, zzscd.RemoteActionCompatParcelizer.INSTANCE)) {
                            invokeSuspend invokesuspend2 = invokesuspend;
                            invokeSuspend invokesuspend3 = invokesuspend2;
                            String string = invokesuspend2.getString(R.string.feedback_dialog_load_fail);
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
                            CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer(invokesuspend3, string, 0);
                        } else if (zzscdVar instanceof zzscd.AudioAttributesCompatParcelizer) {
                            invokesuspend.read(((zzscd.AudioAttributesCompatParcelizer) zzscdVar).RemoteActionCompatParcelizer());
                        } else if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(zzscdVar, zzscd.read.INSTANCE)) {
                            throw new RenewEligibleCreator();
                        }
                        invokesuspend.write().read(onReceivedError.read.INSTANCE);
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
            return invokeSuspend.this.new AudioAttributesCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void MediaBrowserCompatItemReceiver() {
        getProvider getprovider = getProvider.getInstance(requireContext());
        read readVar = this.AudioAttributesImplBaseParcelizer;
        getprovider.registerReceiver(readVar, readVar.AudioAttributesCompatParcelizer());
    }

    private final void MediaMetadataCompat() {
        getProvider.getInstance(requireContext()).IconCompatParcelizer(this.AudioAttributesImplBaseParcelizer);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        MediaMetadataCompat();
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        RemoteActionCompatParcelizer();
        super.onDestroy();
    }

    /* JADX INFO: renamed from: o.invokeSuspend$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/invokeSuspend$write;", "", "<init>", "()V", "Lo/onPageFinished;", "p0", "Lo/invokeSuspend;", "write", "(Lo/onPageFinished;)Lo/invokeSuspend;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static invokeSuspend write(onPageFinished p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            invokeSuspend invokesuspend = new invokeSuspend();
            invokesuspend.setArguments(p0.MediaBrowserCompatItemReceiver());
            return invokesuspend;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
