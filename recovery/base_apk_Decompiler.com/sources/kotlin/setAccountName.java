package kotlin;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import androidx.activity.result.ActivityResult;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.util.DeviceProperties;
import com.marrow.R;
import com.marrow2.domain.custom_module.model.CustomModuleSubjectListModel;
import com.marrow2.ui.custom_module.creation.viewmodel.CustomModuleCreationViewModel;
import com.marrow2.ui.custom_module.creation.viewmodel.CustomModuleSubjectSelectionViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC0287zzf;
import kotlin.Metadata;
import kotlin.Ranim;
import kotlin.Ranimator;
import kotlin.VisibilityChecker;
import kotlin._init_lambda4;
import kotlin.onTouch;
import kotlin.setAlignContent;
import kotlin.withFieldVisibility;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000 \u00152\u00020\u00012\u00020\u0002:\u0001\u0015B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\u0004J+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0011\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0013\u0010\u0004J\u000f\u0010\u0014\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0014\u0010\u0004J\u000f\u0010\u0015\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0015\u0010\u0004J\u000f\u0010\u0016\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0016\u0010\u0004J\u001d\u0010\u0014\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002¢\u0006\u0004\b\u0014\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010 R\u001b\u0010\u001b\u001a\u00020\"8CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u001d\u0010%R\u001b\u0010\u001d\u001a\u00020&8CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010$\u001a\u0004\b!\u0010'R\u0018\u0010\u0015\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010)R\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020+0*8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b!\u0010,"}, d2 = {"Lo/setAccountName;", "Landroidx/fragment/app/Fragment;", "Lo/setAlignContent$IconCompatParcelizer;", "<init>", "()V", "", "onStart", "onStop", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "MediaBrowserCompatItemReceiver", "AudioAttributesCompatParcelizer", "write", "AudioAttributesImplBaseParcelizer", "", "Lcom/marrow2/domain/custom_module/model/CustomModuleSubjectListModel;", "(Ljava/util/List;)V", "", "IconCompatParcelizer", "(Lcom/marrow2/domain/custom_module/model/CustomModuleSubjectListModel;Z)V", "read", "(Lcom/marrow2/domain/custom_module/model/CustomModuleSubjectListModel;)V", "Lo/createExtractor;", "Lo/createExtractor;", "RemoteActionCompatParcelizer", "Lcom/marrow2/ui/custom_module/creation/viewmodel/CustomModuleSubjectSelectionViewModel;", "AudioAttributesImplApi21Parcelizer", "Lo/RenewEligible;", "()Lcom/marrow2/ui/custom_module/creation/viewmodel/CustomModuleSubjectSelectionViewModel;", "Lcom/marrow2/ui/custom_module/creation/viewmodel/CustomModuleCreationViewModel;", "()Lcom/marrow2/ui/custom_module/creation/viewmodel/CustomModuleCreationViewModel;", "Lo/setAlignContent;", "Lo/setAlignContent;", "Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;", "Landroid/content/Intent;", "Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class setAccountName extends WorkAccount implements setAlignContent.IconCompatParcelizer {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final RenewEligible read;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final RenewEligible IconCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private setAlignContent write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<Intent> AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private createExtractor RemoteActionCompatParcelizer;

    public setAccountName() {
        setAccountName setaccountname = this;
        RenewEligible renewEligibleWrite = getRenewExpiresOn.write(RenewEligibleCompanion.read, new AnonymousClass1(new AnonymousClass2(setaccountname)));
        this.IconCompatParcelizer = _resolveFieldVsGetter.RemoteActionCompatParcelizer(toMagicModuleMetaDataUcModel.write(CustomModuleSubjectSelectionViewModel.class), new AnonymousClass3(renewEligibleWrite), new AnonymousClass4(renewEligibleWrite), new AnonymousClass5(setaccountname, renewEligibleWrite));
        RenewEligible renewEligibleWrite2 = getRenewExpiresOn.write(RenewEligibleCompanion.read, new AnonymousClass7(new getCreatedOnDateMs() { // from class: o.CookieUtil
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return setAccountName.AudioAttributesImplApi26Parcelizer(this.AudioAttributesCompatParcelizer);
            }
        }));
        this.read = _resolveFieldVsGetter.RemoteActionCompatParcelizer(toMagicModuleMetaDataUcModel.write(CustomModuleCreationViewModel.class), new AnonymousClass6(renewEligibleWrite2), new AnonymousClass8(renewEligibleWrite2), new AnonymousClass9(setaccountname, renewEligibleWrite2));
        r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<Intent> r8lambdaibk6u1hk7j3awkl_wn934v2uvi8RegisterForActivityResult = registerForActivityResult(new _init_lambda4.AudioAttributesImplApi26Parcelizer(), new r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() { // from class: o.AccountChangeEventsResponse
            @Override // kotlin.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM
            public final void IconCompatParcelizer(Object obj) {
                setAccountName.write(this.AudioAttributesCompatParcelizer, (ActivityResult) obj);
            }
        });
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r8lambdaibk6u1hk7j3awkl_wn934v2uvi8RegisterForActivityResult, "");
        this.AudioAttributesCompatParcelizer = r8lambdaibk6u1hk7j3awkl_wn934v2uvi8RegisterForActivityResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CustomModuleSubjectSelectionViewModel read() {
        return (CustomModuleSubjectSelectionViewModel) this.IconCompatParcelizer.RemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TypeResolutionContext AudioAttributesImplApi26Parcelizer(setAccountName setaccountname) {
        Fragment fragmentRequireParentFragment = setaccountname.requireParentFragment();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(fragmentRequireParentFragment, "");
        return fragmentRequireParentFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CustomModuleCreationViewModel RemoteActionCompatParcelizer() {
        return (CustomModuleCreationViewModel) this.read.RemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void write(setAccountName setaccountname, ActivityResult activityResult) {
        Intent read2;
        Bundle extras;
        String string;
        Bundle extras2;
        Bundle extras3;
        toMagicModuleMetaRepoModel.write(activityResult, "");
        ArrayList<String> stringArrayList = null;
        ActivityResult activityResult2 = activityResult.getRemoteActionCompatParcelizer() == -1 ? activityResult : null;
        if (activityResult2 == null || (read2 = activityResult2.getRead()) == null || (extras = read2.getExtras()) == null || (string = extras.getString("rootId")) == null) {
            return;
        }
        Intent read3 = activityResult.getRead();
        if (read3 != null && (extras3 = read3.getExtras()) != null) {
            stringArrayList = extras3.getStringArrayList("selectedTopics");
        }
        ArrayList<String> arrayListRemoteActionCompatParcelizer = stringArrayList;
        if (arrayListRemoteActionCompatParcelizer == null) {
            arrayListRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        Intent read4 = activityResult.getRead();
        setaccountname.read().write(new Ranim.AudioAttributesImplBaseParcelizer(string, arrayListRemoteActionCompatParcelizer, (read4 == null || (extras2 = read4.getExtras()) == null) ? true : extras2.getBoolean("areAllTopicsSelected")));
    }

    static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<WorkAccountClient> setupdatedstatusAudioAttributesImplBaseParcelizer = setAccountName.this.RemoteActionCompatParcelizer().AudioAttributesImplBaseParcelizer();
                final setAccountName setaccountname = setAccountName.this;
                this.read = 1;
                if (setupdatedstatusAudioAttributesImplBaseParcelizer.write(new getValidationToken() { // from class: o.setAccountName.read.5
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return write((WorkAccountClient) obj2);
                    }

                    private Object write(WorkAccountClient workAccountClient) {
                        setaccountname.read().read(workAccountClient);
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
            return setAccountName.this.new read(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        setBitrateKbps.read(this, new read(null));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        RemoteActionCompatParcelizer().read(new AbstractC0287zzf.MediaMetadataCompat(read().read().IconCompatParcelizer()));
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        createExtractor createextractor = createExtractor.read(p0, p1);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(createextractor, "");
        this.RemoteActionCompatParcelizer = createextractor;
        if (createextractor == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            createextractor = null;
        }
        LinearLayout linearLayoutIconCompatParcelizer = createextractor.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayoutIconCompatParcelizer, "");
        return linearLayoutIconCompatParcelizer;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View p0, Bundle p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onViewCreated(p0, p1);
        MediaBrowserCompatItemReceiver();
        AudioAttributesCompatParcelizer();
        write();
        AudioAttributesImplBaseParcelizer();
    }

    private final void MediaBrowserCompatItemReceiver() {
        if (DeviceProperties.isTablet(requireContext())) {
            Context contextRequireContext = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
            createExtractor createextractor = this.RemoteActionCompatParcelizer;
            createExtractor createextractor2 = null;
            if (createextractor == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                createextractor = null;
            }
            LinearLayout linearLayout = createextractor.IconCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
            bytesRead.AudioAttributesCompatParcelizer(contextRequireContext, linearLayout);
            Context contextRequireContext2 = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext2, "");
            createExtractor createextractor3 = this.RemoteActionCompatParcelizer;
            if (createextractor3 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                createextractor3 = null;
            }
            RecyclerView recyclerView = createextractor3.AudioAttributesImplBaseParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(recyclerView, "");
            bytesRead.AudioAttributesCompatParcelizer(contextRequireContext2, recyclerView);
            Context contextRequireContext3 = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext3, "");
            createExtractor createextractor4 = this.RemoteActionCompatParcelizer;
            if (createextractor4 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            } else {
                createextractor2 = createextractor4;
            }
            ConstraintLayout constraintLayout = createextractor2.read;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout, "");
            bytesRead.AudioAttributesCompatParcelizer(contextRequireContext3, constraintLayout);
        }
    }

    private final void AudioAttributesCompatParcelizer() {
        int i;
        createExtractor createextractor = this.RemoteActionCompatParcelizer;
        if (createextractor == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            createextractor = null;
        }
        RecyclerView recyclerView = createextractor.AudioAttributesImplBaseParcelizer;
        List<AccountTransferClient> listMediaBrowserCompatItemReceiver = RemoteActionCompatParcelizer().AudioAttributesImplBaseParcelizer().IconCompatParcelizer().MediaBrowserCompatItemReceiver();
        this.write = new setAlignContent(this, !(listMediaBrowserCompatItemReceiver.contains(AccountTransferClient.read) || listMediaBrowserCompatItemReceiver.contains(AccountTransferClient.write) || listMediaBrowserCompatItemReceiver.contains(AccountTransferClient.MediaBrowserCompatItemReceiver)));
        requireContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setItemAnimator(null);
        recyclerView.setAdapter(this.write);
        if (DeviceProperties.isTablet(requireContext())) {
            Context contextRequireContext = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
            i = PlayerControlViewExternalSyntheticLambda1.read(contextRequireContext);
        } else {
            i = setObjectType.read(24);
        }
        Context contextRequireContext2 = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext2, "");
        recyclerView.AudioAttributesCompatParcelizer(new CmcdHeadersFactoryCmcdObject(contextRequireContext2, i, false, 4, null));
    }

    /* JADX INFO: renamed from: o.setAccountName$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Landroidx/fragment/app/Fragment;", "IconCompatParcelizer", "()Landroidx/fragment/app/Fragment;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass2 extends MagicModuleUseCase implements getCreatedOnDateMs<Fragment> {
        private /* synthetic */ Fragment $AudioAttributesCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.$AudioAttributesCompatParcelizer;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Fragment fragment) {
            super(0);
            this.$AudioAttributesCompatParcelizer = fragment;
        }
    }

    /* JADX INFO: renamed from: o.setAccountName$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/TypeResolutionContext;", "AudioAttributesCompatParcelizer", "()Lo/TypeResolutionContext;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<TypeResolutionContext> {
        private /* synthetic */ getCreatedOnDateMs $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final TypeResolutionContext invoke() {
            return (TypeResolutionContext) this.$write.invoke();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(getCreatedOnDateMs getcreatedondatems) {
            super(0);
            this.$write = getcreatedondatems;
        }
    }

    /* JADX INFO: renamed from: o.setAccountName$7, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/TypeResolutionContext;", "RemoteActionCompatParcelizer", "()Lo/TypeResolutionContext;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass7 extends MagicModuleUseCase implements getCreatedOnDateMs<TypeResolutionContext> {
        private /* synthetic */ getCreatedOnDateMs $IconCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final TypeResolutionContext invoke() {
            return (TypeResolutionContext) this.$IconCompatParcelizer.invoke();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(getCreatedOnDateMs getcreatedondatems) {
            super(0);
            this.$IconCompatParcelizer = getcreatedondatems;
        }
    }

    private final void write() {
        createExtractor createextractor = this.RemoteActionCompatParcelizer;
        createExtractor createextractor2 = null;
        if (createextractor == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            createextractor = null;
        }
        createextractor.RemoteActionCompatParcelizer.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: o.getCookieUrl
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i) {
                setAccountName.read(this.write, i);
            }
        });
        createExtractor createextractor3 = this.RemoteActionCompatParcelizer;
        if (createextractor3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            createextractor3 = null;
        }
        createextractor3.AudioAttributesCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.getEvents
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                setAccountName.AudioAttributesImplApi21Parcelizer(this.IconCompatParcelizer);
            }
        });
        createExtractor createextractor4 = this.RemoteActionCompatParcelizer;
        if (createextractor4 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            createextractor2 = createextractor4;
        }
        createextractor2.write.setOnClickListener(new View.OnClickListener() { // from class: o.getCookieValue
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                setAccountName.MediaBrowserCompatCustomActionResultReceiver(this.write);
            }
        });
    }

    /* JADX INFO: renamed from: o.setAccountName$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "read", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ RenewEligible $AudioAttributesCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return _resolveFieldVsGetter.write(this.$AudioAttributesCompatParcelizer).getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(RenewEligible renewEligible) {
            super(0);
            this.$AudioAttributesCompatParcelizer = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.setAccountName$6, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "RemoteActionCompatParcelizer", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass6 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ RenewEligible $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return _resolveFieldVsGetter.write(this.$write).getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(RenewEligible renewEligible) {
            super(0);
            this.$write = renewEligible;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void read(setAccountName setaccountname, int i) {
        createExtractor createextractor = null;
        switch (i) {
            case R.id.subjectsAll /* 2131363866 */:
                createExtractor createextractor2 = setaccountname.RemoteActionCompatParcelizer;
                if (createextractor2 == null) {
                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                } else {
                    createextractor = createextractor2;
                }
                if (createextractor.MediaBrowserCompatCustomActionResultReceiver.isChecked()) {
                    setaccountname.read().write(Ranim.read.INSTANCE);
                }
                break;
            case R.id.subjectsChoose /* 2131363867 */:
                createExtractor createextractor3 = setaccountname.RemoteActionCompatParcelizer;
                if (createextractor3 == null) {
                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                } else {
                    createextractor = createextractor3;
                }
                if (createextractor.AudioAttributesImplApi26Parcelizer.isChecked()) {
                    setaccountname.read().write(Ranim.write.INSTANCE);
                }
                break;
        }
    }

    /* JADX INFO: renamed from: o.setAccountName$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "IconCompatParcelizer", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass4 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ RenewEligible $IconCompatParcelizer;
        private /* synthetic */ getCreatedOnDateMs $read = null;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final withFieldVisibility invoke() {
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$IconCompatParcelizer);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return anyexplicitswithoutignoral != null ? anyexplicitswithoutignoral.getDefaultViewModelCreationExtras() : withFieldVisibility.write.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(RenewEligible renewEligible) {
            super(0);
            this.$IconCompatParcelizer = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.setAccountName$8, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "read", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass8 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ getCreatedOnDateMs $AudioAttributesCompatParcelizer = null;
        private /* synthetic */ RenewEligible $read;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final withFieldVisibility invoke() {
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$read);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return anyexplicitswithoutignoral != null ? anyexplicitswithoutignoral.getDefaultViewModelCreationExtras() : withFieldVisibility.write.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass8(RenewEligible renewEligible) {
            super(0);
            this.$read = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.setAccountName$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "AudioAttributesCompatParcelizer", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ Fragment $IconCompatParcelizer;
        private /* synthetic */ RenewEligible $read;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            VisibilityChecker.RemoteActionCompatParcelizer defaultViewModelProviderFactory;
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$read);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return (anyexplicitswithoutignoral == null || (defaultViewModelProviderFactory = anyexplicitswithoutignoral.getDefaultViewModelProviderFactory()) == null) ? this.$IconCompatParcelizer.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(Fragment fragment, RenewEligible renewEligible) {
            super(0);
            this.$IconCompatParcelizer = fragment;
            this.$read = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.setAccountName$9, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "AudioAttributesCompatParcelizer", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass9 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
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
        public AnonymousClass9(Fragment fragment, RenewEligible renewEligible) {
            super(0);
            this.$RemoteActionCompatParcelizer = fragment;
            this.$write = renewEligible;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesImplApi21Parcelizer(setAccountName setaccountname) {
        if (setaccountname.read().read().IconCompatParcelizer().MediaBrowserCompatSearchResultReceiver().isEmpty()) {
            setAccountName setaccountname2 = setaccountname;
            String string = setaccountname.getResources().getString(R.string.error_select_subject);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
            CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer(setaccountname2, string, 0);
            return;
        }
        withAlwaysAsId.read(setaccountname, "requestKey", _getIndexResolver.write(setAction.write("isNext", Boolean.TRUE), setAction.write("currentFrag", 1)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MediaBrowserCompatCustomActionResultReceiver(setAccountName setaccountname) {
        withAlwaysAsId.read(setaccountname, "requestKey", _getIndexResolver.write(setAction.write("isNext", Boolean.FALSE), setAction.write("currentFrag", 1)));
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<DataSourceBitmapLoaderExternalSyntheticLambda0<List<CustomModuleSubjectListModel>>> setupdatedstatusIconCompatParcelizer = setAccountName.this.read().IconCompatParcelizer();
                final setAccountName setaccountname = setAccountName.this;
                this.RemoteActionCompatParcelizer = 1;
                if (setupdatedstatusIconCompatParcelizer.write(new getValidationToken() { // from class: o.setAccountName.IconCompatParcelizer.2
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return read((DataSourceBitmapLoaderExternalSyntheticLambda0) obj2);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
                    /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
                    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    private java.lang.Object read(kotlin.DataSourceBitmapLoaderExternalSyntheticLambda0<java.util.List<com.marrow2.domain.custom_module.model.CustomModuleSubjectListModel>> r6) {
                        /*
                            r5 = this;
                            boolean r0 = r6 instanceof kotlin.decodeBitmap
                            if (r0 == 0) goto L67
                            o.decodeBitmap r6 = (kotlin.decodeBitmap) r6
                            java.lang.Object r0 = r6.RemoteActionCompatParcelizer()
                            java.lang.Iterable r0 = (java.lang.Iterable) r0
                            boolean r1 = r0 instanceof java.util.Collection
                            r2 = 1
                            if (r1 == 0) goto L1b
                            r1 = r0
                            java.util.Collection r1 = (java.util.Collection) r1
                            boolean r1 = r1.isEmpty()
                            if (r1 == 0) goto L1b
                            goto L33
                        L1b:
                            java.util.Iterator r0 = r0.iterator()
                        L1f:
                            boolean r1 = r0.hasNext()
                            if (r1 == 0) goto L33
                            java.lang.Object r1 = r0.next()
                            com.marrow2.domain.custom_module.model.CustomModuleSubjectListModel r1 = (com.marrow2.domain.custom_module.model.CustomModuleSubjectListModel) r1
                            boolean r1 = r1.getWrite()
                            if (r1 != 0) goto L1f
                            r0 = 0
                            goto L34
                        L33:
                            r0 = r2
                        L34:
                            o.setAccountName r1 = r1
                            o.createExtractor r1 = kotlin.setAccountName.read(r1)
                            r3 = 0
                            java.lang.String r4 = ""
                            if (r1 != 0) goto L43
                            kotlin.toMagicModuleMetaRepoModel.IconCompatParcelizer(r4)
                            r1 = r3
                        L43:
                            android.widget.RadioButton r1 = r1.MediaBrowserCompatCustomActionResultReceiver
                            r1.setChecked(r0)
                            o.setAccountName r1 = r1
                            o.createExtractor r1 = kotlin.setAccountName.read(r1)
                            if (r1 != 0) goto L54
                            kotlin.toMagicModuleMetaRepoModel.IconCompatParcelizer(r4)
                            goto L55
                        L54:
                            r3 = r1
                        L55:
                            android.widget.RadioButton r1 = r3.AudioAttributesImplApi26Parcelizer
                            r0 = r0 ^ r2
                            r1.setChecked(r0)
                            o.setAccountName r5 = r1
                            java.lang.Object r6 = r6.RemoteActionCompatParcelizer()
                            java.util.List r6 = (java.util.List) r6
                            kotlin.setAccountName.RemoteActionCompatParcelizer(r5, r6)
                            goto L7f
                        L67:
                            boolean r0 = r6 instanceof kotlin.setStreamingFormat
                            if (r0 != 0) goto L7f
                            boolean r6 = r6 instanceof kotlin.setTopBitrateKbps
                            if (r6 == 0) goto L79
                            o.setAccountName r5 = r1
                            o.maybeGetTypeVariable r5 = r5.requireActivity()
                            r5.finish()
                            goto L7f
                        L79:
                            o.RenewEligibleCreator r5 = new o.RenewEligibleCreator
                            r5.<init>()
                            throw r5
                        L7f:
                            o.getShowPopup r5 = kotlin.getShowPopup.INSTANCE
                            return r5
                        */
                        throw new UnsupportedOperationException("Method not decompiled: o.setAccountName.IconCompatParcelizer.AnonymousClass2.read(o.DataSourceBitmapLoaderExternalSyntheticLambda0):java.lang.Object");
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
            return setAccountName.this.new IconCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void AudioAttributesImplBaseParcelizer() {
        setAccountName setaccountname = this;
        setBitrateKbps.read(setaccountname, new IconCompatParcelizer(null));
        setBitrateKbps.read(setaccountname, new AudioAttributesCompatParcelizer(null));
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<Ranimator> setupdatedstatusAudioAttributesCompatParcelizer = setAccountName.this.read().AudioAttributesCompatParcelizer();
                final setAccountName setaccountname = setAccountName.this;
                this.RemoteActionCompatParcelizer = 1;
                if (setupdatedstatusAudioAttributesCompatParcelizer.write(new getValidationToken() { // from class: o.setAccountName.AudioAttributesCompatParcelizer.2
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return AudioAttributesCompatParcelizer((Ranimator) obj2);
                    }

                    private Object AudioAttributesCompatParcelizer(Ranimator ranimator) {
                        if (ranimator instanceof Ranimator.RemoteActionCompatParcelizer) {
                            r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 r8lambdaibk6u1hk7j3awkl_wn934v2uvi8 = setaccountname.AudioAttributesCompatParcelizer;
                            onTouch.Companion writeVar = onTouch.INSTANCE;
                            Context contextRequireContext = setaccountname.requireContext();
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
                            r8lambdaibk6u1hk7j3awkl_wn934v2uvi8.read(onTouch.Companion.AudioAttributesCompatParcelizer(contextRequireContext, ((Ranimator.RemoteActionCompatParcelizer) ranimator).read()));
                            setaccountname.read().write(Ranim.IconCompatParcelizer.INSTANCE);
                        }
                        setaccountname.read().write(Ranim.IconCompatParcelizer.INSTANCE);
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
            return setAccountName.this.new AudioAttributesCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AudioAttributesCompatParcelizer(List<CustomModuleSubjectListModel> p0) {
        setAlignContent setaligncontent = this.write;
        if (setaligncontent != null) {
            setaligncontent.read(p0);
        }
    }

    @Override // o.setAlignContent.IconCompatParcelizer
    public final void IconCompatParcelizer(CustomModuleSubjectListModel p0, boolean p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        read().write(new Ranim.RemoteActionCompatParcelizer(p0, p1));
    }

    @Override // o.setAlignContent.IconCompatParcelizer
    public final void read(CustomModuleSubjectListModel p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        read().write(new Ranim.AudioAttributesCompatParcelizer(p0));
    }

    /* JADX INFO: renamed from: o.setAccountName$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/setAccountName$write;", "", "<init>", "()V", "Landroidx/fragment/app/Fragment;", "read", "()Landroidx/fragment/app/Fragment;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static Fragment read() {
            return new setAccountName();
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
