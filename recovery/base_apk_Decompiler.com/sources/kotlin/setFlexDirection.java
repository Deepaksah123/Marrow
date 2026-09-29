package kotlin;

import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ScrollView;
import android.widget.SpinnerAdapter;
import androidx.fragment.app.Fragment;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.material.slider.Slider;
import com.marrow.R;
import com.marrow2.domain.custom_module.model.CustomModuleUCModel;
import com.marrow2.ui.custom_module.creation.viewmodel.CustomModuleAddOnsViewModel;
import com.marrow2.ui.custom_module.creation.viewmodel.CustomModuleCreationViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC0287zzf;
import kotlin.AuthorizationRequestBuilder;
import kotlin.Metadata;
import kotlin.VisibilityChecker;
import kotlin.getRpId;
import kotlin.removeWorkAccount;
import kotlin.setFlexDirection;
import kotlin.setWorkAuthenticatorEnabledWithResult;
import kotlin.shouldEscapeCharacter;
import kotlin.withFieldVisibility;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 K2\u00020\u0001:\u0001KB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001cH\u0016J\u001a\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010 \u001a\u00020\u001cH\u0002J\b\u0010!\u001a\u00020\u001cH\u0002J.\u0010\"\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020$2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0002J6\u0010,\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020.2\b\b\u0002\u0010/\u001a\u0002002\b\b\u0002\u00101\u001a\u0002002\b\b\u0002\u00102\u001a\u0002032\u0006\u00104\u001a\u00020$H\u0002J$\u00105\u001a\u00020\u001c2\f\u00106\u001a\b\u0012\u0004\u0012\u0002070&2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&H\u0002J\u0012\u00108\u001a\u00020\u001c2\b\b\u0002\u00109\u001a\u00020$H\u0002J\b\u0010:\u001a\u00020\u001cH\u0002J\u0016\u0010;\u001a\u00020\u001c2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020=0&H\u0002J\u0018\u0010>\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020$2\u0006\u0010?\u001a\u00020)H\u0002J \u0010@\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020$2\u0006\u0010A\u001a\u00020)2\u0006\u0010B\u001a\u00020CH\u0002J \u0010D\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020$2\u0006\u0010E\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0002J \u0010F\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020$2\u0006\u0010G\u001a\u00020)2\u0006\u0010B\u001a\u00020CH\u0002J\u0010\u0010H\u001a\u00020\u001c2\u0006\u0010I\u001a\u000203H\u0002J\b\u0010J\u001a\u00020\u001cH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006L"}, d2 = {"Lcom/marrow2/ui/custom_module/creation/fragment/CustomModuleAddOnsSelectionFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "binding", "Lcom/marrow/databinding/FragmentCustomModuleAddOnsSelectionBinding;", "viewModel", "Lcom/marrow2/ui/custom_module/creation/viewmodel/CustomModuleAddOnsViewModel;", "getViewModel", "()Lcom/marrow2/ui/custom_module/creation/viewmodel/CustomModuleAddOnsViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "sharedViewModel", "Lcom/marrow2/ui/custom_module/creation/viewmodel/CustomModuleCreationViewModel;", "getSharedViewModel", "()Lcom/marrow2/ui/custom_module/creation/viewmodel/CustomModuleCreationViewModel;", "sharedViewModel$delegate", "creationModel", "Lcom/marrow2/ui/custom_module/creation/model/CustomModuleCreationArgs;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "", "onStop", "onViewCreated", "view", "setMargins", "setObservers", "handleBookmarkView", "source", "", "multibookmarkCount", "", "Lcom/marrow2/domain/mcq/model/MultiBookmarkCounterUCModel;", "bookmarkRd", "Landroid/widget/RadioButton;", "layoutCmSubBookmarksBinding", "Lcom/marrow/databinding/LayoutCmSubBookmarksBinding;", "renderBookmarkCheckboxUi", "checkboxView", "Landroid/widget/CheckBox;", "isChecked", "", "isEnabled", "viewAlpha", "", "displayText", "initQuestionSource", "questionSource", "Lcom/marrow2/ui/custom_module/creation/model/CustomModuleCreationQuestionsSource;", "openJoinByCodeBottomSheet", "inviteCode", "listeners", "initQuestionLimits", "questionsLimit", "", "onAllMcqSelected", "allRadioButton", "onQbankSelected", "qbankRadioButton", "layoutCmSubCheckboxesBinding", "Lcom/marrow/databinding/LayoutCmSubCheckboxesBinding;", "onBookmarkedSelected", "sourceBookmarked", "onTestSelected", "grandTest", "setSlideText", AppMeasurementSdk.ConditionalUserProperty.VALUE, "onDestroyView", "Companion", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class setFlexDirection extends getClient {
    public static final IconCompatParcelizer RemoteActionCompatParcelizer = new IconCompatParcelizer(null);
    private createExtractorByFileType AudioAttributesCompatParcelizer;
    private final RenewEligible IconCompatParcelizer;
    private final RenewEligible read;
    private WorkAccountClient write;

    public static final /* synthetic */ class read {
        public static final /* synthetic */ int[] read;
        public static final /* synthetic */ int[] write;

        static {
            int[] iArr = new int[onDisplayInfoChanged.values().length];
            try {
                iArr[onDisplayInfoChanged.read.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[onDisplayInfoChanged.AudioAttributesCompatParcelizer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[onDisplayInfoChanged.write.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[onDisplayInfoChanged.IconCompatParcelizer.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            write = iArr;
            int[] iArr2 = new int[WorkAccountApiAddAccountResult.values().length];
            try {
                iArr2[WorkAccountApiAddAccountResult.AudioAttributesCompatParcelizer.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[WorkAccountApiAddAccountResult.IconCompatParcelizer.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            read = iArr2;
        }
    }

    public setFlexDirection() {
        setFlexDirection setflexdirection = this;
        RenewEligible renewEligibleWrite = getRenewExpiresOn.write(RenewEligibleCompanion.read, new AnonymousClass3(new AnonymousClass2(setflexdirection)));
        this.read = _resolveFieldVsGetter.RemoteActionCompatParcelizer(toMagicModuleMetaDataUcModel.write(CustomModuleAddOnsViewModel.class), new AnonymousClass5(renewEligibleWrite), new AnonymousClass4(renewEligibleWrite), new AnonymousClass1(setflexdirection, renewEligibleWrite));
        RenewEligible renewEligibleWrite2 = getRenewExpiresOn.write(RenewEligibleCompanion.read, new AnonymousClass8(new getCreatedOnDateMs() { // from class: o.FlexboxLayoutManagerLayoutParams
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return setFlexDirection.MediaMetadataCompat(this.write);
            }
        }));
        this.IconCompatParcelizer = _resolveFieldVsGetter.RemoteActionCompatParcelizer(toMagicModuleMetaDataUcModel.write(CustomModuleCreationViewModel.class), new AnonymousClass10(renewEligibleWrite2), new AnonymousClass9(renewEligibleWrite2), new AnonymousClass7(setflexdirection, renewEligibleWrite2));
        this.write = new WorkAccountClient(0, null, null, null, null, false, null, null, false, 0, null, null, false, 0L, 0L, false, null, 131071, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CustomModuleAddOnsViewModel read() {
        return (CustomModuleAddOnsViewModel) this.read.RemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TypeResolutionContext MediaMetadataCompat(setFlexDirection setflexdirection) {
        Fragment fragmentRequireParentFragment = setflexdirection.requireParentFragment();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(fragmentRequireParentFragment, "");
        return fragmentRequireParentFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CustomModuleCreationViewModel RemoteActionCompatParcelizer() {
        return (CustomModuleCreationViewModel) this.IconCompatParcelizer.RemoteActionCompatParcelizer();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        toMagicModuleMetaRepoModel.write(inflater, "");
        createExtractorByFileType createextractorbyfiletypeIconCompatParcelizer = createExtractorByFileType.IconCompatParcelizer(inflater, container);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(createextractorbyfiletypeIconCompatParcelizer, "");
        this.AudioAttributesCompatParcelizer = createextractorbyfiletypeIconCompatParcelizer;
        if (createextractorbyfiletypeIconCompatParcelizer == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            createextractorbyfiletypeIconCompatParcelizer = null;
        }
        LinearLayout linearLayoutIconCompatParcelizer = createextractorbyfiletypeIconCompatParcelizer.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayoutIconCompatParcelizer, "");
        return linearLayoutIconCompatParcelizer;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        RemoteActionCompatParcelizer().read(AbstractC0287zzf.MediaBrowserCompatCustomActionResultReceiver.INSTANCE);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        RemoteActionCompatParcelizer().read(new AbstractC0287zzf.MediaMetadataCompat(this.write));
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle savedInstanceState) {
        toMagicModuleMetaRepoModel.write(view, "");
        super.onViewCreated(view, savedInstanceState);
        AudioAttributesCompatParcelizer();
        MediaBrowserCompatItemReceiver();
        write();
    }

    /* JADX INFO: renamed from: o.setFlexDirection$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Landroidx/fragment/app/Fragment;", "RemoteActionCompatParcelizer", "()Landroidx/fragment/app/Fragment;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass2 extends MagicModuleUseCase implements getCreatedOnDateMs<Fragment> {
        private /* synthetic */ Fragment $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.$write;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Fragment fragment) {
            super(0);
            this.$write = fragment;
        }
    }

    private final void AudioAttributesCompatParcelizer() {
        if (DeviceProperties.isTablet(requireContext())) {
            Context contextRequireContext = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
            createExtractorByFileType createextractorbyfiletype = this.AudioAttributesCompatParcelizer;
            createExtractorByFileType createextractorbyfiletype2 = null;
            if (createextractorbyfiletype == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                createextractorbyfiletype = null;
            }
            LinearLayout linearLayout = createextractorbyfiletype.AudioAttributesCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
            bytesRead.AudioAttributesCompatParcelizer(contextRequireContext, linearLayout);
            Context contextRequireContext2 = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext2, "");
            createExtractorByFileType createextractorbyfiletype3 = this.AudioAttributesCompatParcelizer;
            if (createextractorbyfiletype3 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                createextractorbyfiletype3 = null;
            }
            LinearLayout linearLayout2 = createextractorbyfiletype3.RemoteActionCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout2, "");
            bytesRead.AudioAttributesCompatParcelizer(contextRequireContext2, linearLayout2);
            Context contextRequireContext3 = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext3, "");
            createExtractorByFileType createextractorbyfiletype4 = this.AudioAttributesCompatParcelizer;
            if (createextractorbyfiletype4 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            } else {
                createextractorbyfiletype2 = createextractorbyfiletype4;
            }
            LinearLayout linearLayout3 = createextractorbyfiletype2.read;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout3, "");
            bytesRead.AudioAttributesCompatParcelizer(contextRequireContext3, linearLayout3);
        }
    }

    /* JADX INFO: renamed from: o.setFlexDirection$3, reason: invalid class name */
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

    /* JADX INFO: renamed from: o.setFlexDirection$8, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/TypeResolutionContext;", "AudioAttributesCompatParcelizer", "()Lo/TypeResolutionContext;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass8 extends MagicModuleUseCase implements getCreatedOnDateMs<TypeResolutionContext> {
        private /* synthetic */ getCreatedOnDateMs $AudioAttributesCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final TypeResolutionContext invoke() {
            return (TypeResolutionContext) this.$AudioAttributesCompatParcelizer.invoke();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass8(getCreatedOnDateMs getcreatedondatems) {
            super(0);
            this.$AudioAttributesCompatParcelizer = getcreatedondatems;
        }
    }

    /* JADX INFO: renamed from: o.setFlexDirection$10, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "RemoteActionCompatParcelizer", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass10 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ RenewEligible $IconCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return _resolveFieldVsGetter.write(this.$IconCompatParcelizer).getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass10(RenewEligible renewEligible) {
            super(0);
            this.$IconCompatParcelizer = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.setFlexDirection$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "AudioAttributesCompatParcelizer", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ RenewEligible $RemoteActionCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return _resolveFieldVsGetter.write(this.$RemoteActionCompatParcelizer).getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(RenewEligible renewEligible) {
            super(0);
            this.$RemoteActionCompatParcelizer = renewEligible;
        }
    }

    static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<WorkAccountClient> setupdatedstatus = setFlexDirection.this.read().read();
                final setFlexDirection setflexdirection = setFlexDirection.this;
                this.IconCompatParcelizer = 1;
                if (setupdatedstatus.write(new getValidationToken() { // from class: o.setFlexDirection.write.3
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return write((WorkAccountClient) obj2);
                    }

                    private Object write(WorkAccountClient workAccountClient) {
                        setflexdirection.write = workAccountClient;
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
            return setFlexDirection.this.new write(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: o.setFlexDirection$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "AudioAttributesCompatParcelizer", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass4 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ getCreatedOnDateMs $AudioAttributesCompatParcelizer = null;
        private /* synthetic */ RenewEligible $IconCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
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

    /* JADX INFO: renamed from: o.setFlexDirection$9, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "read", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass9 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ RenewEligible $AudioAttributesCompatParcelizer;
        private /* synthetic */ getCreatedOnDateMs $IconCompatParcelizer = null;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final withFieldVisibility invoke() {
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$AudioAttributesCompatParcelizer);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return anyexplicitswithoutignoral != null ? anyexplicitswithoutignoral.getDefaultViewModelCreationExtras() : withFieldVisibility.write.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass9(RenewEligible renewEligible) {
            super(0);
            this.$AudioAttributesCompatParcelizer = renewEligible;
        }
    }

    private final void MediaBrowserCompatItemReceiver() {
        setFlexDirection setflexdirection = this;
        setBitrateKbps.read(setflexdirection, new write(null));
        setBitrateKbps.read(setflexdirection, new AudioAttributesCompatParcelizer(null));
        setBitrateKbps.read(setflexdirection, new AudioAttributesImplApi21Parcelizer(null));
        setBitrateKbps.read(setflexdirection, new MediaBrowserCompatItemReceiver(null));
        setBitrateKbps.read(setflexdirection, new MediaBrowserCompatCustomActionResultReceiver(null));
        getChildFragmentManager().IconCompatParcelizer("CustomModuleJoinByCodeDialogSuccessKey", getViewLifecycleOwner(), new _addFields() { // from class: o.AdvertisingIdClient
            @Override // kotlin._addFields
            public final void AudioAttributesCompatParcelizer(String str, Bundle bundle) {
                setFlexDirection.IconCompatParcelizer(this.IconCompatParcelizer, str, bundle);
            }
        });
        getChildFragmentManager().IconCompatParcelizer("CustomModuleJoinByCodeDialogDismissKey", getViewLifecycleOwner(), new _addFields() { // from class: o.getIsAdIdFakeForDebugLogging
            @Override // kotlin._addFields
            public final void AudioAttributesCompatParcelizer(String str, Bundle bundle) {
                setFlexDirection.RemoteActionCompatParcelizer(this.write, str, bundle);
            }
        });
    }

    /* JADX INFO: renamed from: o.setFlexDirection$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "RemoteActionCompatParcelizer", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ Fragment $AudioAttributesCompatParcelizer;
        private /* synthetic */ RenewEligible $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            VisibilityChecker.RemoteActionCompatParcelizer defaultViewModelProviderFactory;
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$write);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return (anyexplicitswithoutignoral == null || (defaultViewModelProviderFactory = anyexplicitswithoutignoral.getDefaultViewModelProviderFactory()) == null) ? this.$AudioAttributesCompatParcelizer.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Fragment fragment, RenewEligible renewEligible) {
            super(0);
            this.$AudioAttributesCompatParcelizer = fragment;
            this.$write = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.setFlexDirection$7, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "IconCompatParcelizer", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass7 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ RenewEligible $IconCompatParcelizer;
        private /* synthetic */ Fragment $read;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            VisibilityChecker.RemoteActionCompatParcelizer defaultViewModelProviderFactory;
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$IconCompatParcelizer);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return (anyexplicitswithoutignoral == null || (defaultViewModelProviderFactory = anyexplicitswithoutignoral.getDefaultViewModelProviderFactory()) == null) ? this.$read.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(Fragment fragment, RenewEligible renewEligible) {
            super(0);
            this.$read = fragment;
            this.$IconCompatParcelizer = renewEligible;
        }
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<WorkAccountClient> setupdatedstatusAudioAttributesImplBaseParcelizer = setFlexDirection.this.RemoteActionCompatParcelizer().AudioAttributesImplBaseParcelizer();
                final setFlexDirection setflexdirection = setFlexDirection.this;
                this.read = 1;
                if (setupdatedstatusAudioAttributesImplBaseParcelizer.write(new getValidationToken() { // from class: o.setFlexDirection.AudioAttributesCompatParcelizer.3
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return RemoteActionCompatParcelizer((WorkAccountClient) obj2);
                    }

                    private Object RemoteActionCompatParcelizer(WorkAccountClient workAccountClient) {
                        String audioAttributesCompatParcelizer;
                        setflexdirection.read().read(workAccountClient);
                        CustomModuleUCModel audioAttributesImplApi21Parcelizer = workAccountClient.getAudioAttributesImplApi21Parcelizer();
                        if (audioAttributesImplApi21Parcelizer != null && (audioAttributesCompatParcelizer = audioAttributesImplApi21Parcelizer.getAudioAttributesCompatParcelizer()) != null) {
                            if (TestGroupLSModel.IconCompatParcelizer((CharSequence) audioAttributesCompatParcelizer)) {
                                audioAttributesCompatParcelizer = null;
                            }
                            if (audioAttributesCompatParcelizer != null) {
                                setflexdirection.write(audioAttributesCompatParcelizer);
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

        AudioAttributesCompatParcelizer(SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return setFlexDirection.this.new AudioAttributesCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class AudioAttributesImplApi21Parcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<buildClient> setupdatedstatusAudioAttributesCompatParcelizer = setFlexDirection.this.read().AudioAttributesCompatParcelizer();
                final setFlexDirection setflexdirection = setFlexDirection.this;
                this.IconCompatParcelizer = 1;
                if (setupdatedstatusAudioAttributesCompatParcelizer.write(new getValidationToken() { // from class: o.setFlexDirection.AudioAttributesImplApi21Parcelizer.2
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return read((buildClient) obj2);
                    }

                    private Object read(buildClient buildclient) {
                        setflexdirection.RemoteActionCompatParcelizer(buildclient.AudioAttributesCompatParcelizer());
                        setflexdirection.RemoteActionCompatParcelizer(buildclient.write(), buildclient.IconCompatParcelizer());
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

        AudioAttributesImplApi21Parcelizer(SampleVideos<? super AudioAttributesImplApi21Parcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return setFlexDirection.this.new AudioAttributesImplApi21Parcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplApi21Parcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class MediaBrowserCompatItemReceiver extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: o.setFlexDirection$MediaBrowserCompatItemReceiver$1, reason: invalid class name */
        static final class AnonymousClass1<T> implements getValidationToken {
            private /* synthetic */ setFlexDirection AudioAttributesCompatParcelizer;

            @Override // kotlin.getValidationToken
            public final /* synthetic */ Object IconCompatParcelizer(Object obj, SampleVideos sampleVideos) {
                return write((DataSourceBitmapLoaderExternalSyntheticLambda0) obj);
            }

            /* JADX WARN: Multi-variable type inference failed */
            private Object write(DataSourceBitmapLoaderExternalSyntheticLambda0<Boolean> dataSourceBitmapLoaderExternalSyntheticLambda0) {
                if (dataSourceBitmapLoaderExternalSyntheticLambda0 instanceof decodeBitmap) {
                    createExtractorByFileType createextractorbyfiletype = null;
                    if (((Boolean) ((decodeBitmap) dataSourceBitmapLoaderExternalSyntheticLambda0).RemoteActionCompatParcelizer()).booleanValue()) {
                        createExtractorByFileType createextractorbyfiletype2 = this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer;
                        if (createextractorbyfiletype2 == null) {
                            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            createextractorbyfiletype2 = null;
                        }
                        FrameLayout frameLayout = createextractorbyfiletype2.MediaDescriptionCompat.read;
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(frameLayout, "");
                        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(frameLayout);
                        createExtractorByFileType createextractorbyfiletype3 = this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer;
                        if (createextractorbyfiletype3 == null) {
                            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                        } else {
                            createextractorbyfiletype = createextractorbyfiletype3;
                        }
                        View view = createextractorbyfiletype.RatingCompat;
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(view, "");
                        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(view);
                    } else {
                        createExtractorByFileType createextractorbyfiletype4 = this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer;
                        if (createextractorbyfiletype4 == null) {
                            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            createextractorbyfiletype4 = null;
                        }
                        ScrollView scrollView = createextractorbyfiletype4.AudioAttributesImplApi26Parcelizer;
                        final setFlexDirection setflexdirection = this.AudioAttributesCompatParcelizer;
                        scrollView.post(new Runnable() { // from class: o.getInfo
                            @Override // java.lang.Runnable
                            public final void run() {
                                setFlexDirection.MediaBrowserCompatItemReceiver.AnonymousClass1.AudioAttributesCompatParcelizer(setflexdirection);
                            }
                        });
                        createExtractorByFileType createextractorbyfiletype5 = this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer;
                        if (createextractorbyfiletype5 == null) {
                            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            createextractorbyfiletype5 = null;
                        }
                        FrameLayout frameLayout2 = createextractorbyfiletype5.MediaDescriptionCompat.read;
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(frameLayout2, "");
                        PlayerControlViewExternalSyntheticLambda1.write(frameLayout2);
                        createExtractorByFileType createextractorbyfiletype6 = this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer;
                        if (createextractorbyfiletype6 == null) {
                            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                        } else {
                            createextractorbyfiletype = createextractorbyfiletype6;
                        }
                        View view2 = createextractorbyfiletype.RatingCompat;
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(view2, "");
                        PlayerControlViewExternalSyntheticLambda1.write(view2);
                    }
                }
                return getShowPopup.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void AudioAttributesCompatParcelizer(setFlexDirection setflexdirection) {
                createExtractorByFileType createextractorbyfiletype = setflexdirection.AudioAttributesCompatParcelizer;
                if (createextractorbyfiletype == null) {
                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                    createextractorbyfiletype = null;
                }
                createextractorbyfiletype.AudioAttributesImplApi26Parcelizer.fullScroll(TsExtractor.TS_STREAM_TYPE_HDMV_DTS);
            }

            AnonymousClass1(setFlexDirection setflexdirection) {
                this.AudioAttributesCompatParcelizer = setflexdirection;
            }
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.RemoteActionCompatParcelizer = 1;
                if (setFlexDirection.this.read().AudioAttributesImplApi26Parcelizer().write(new AnonymousClass1(setFlexDirection.this), this) == objIconCompatParcelizer) {
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

        MediaBrowserCompatItemReceiver(SampleVideos<? super MediaBrowserCompatItemReceiver> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return setFlexDirection.this.new MediaBrowserCompatItemReceiver(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatItemReceiver) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class MediaBrowserCompatCustomActionResultReceiver extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<setWorkAuthenticatorEnabledWithResult> setupdatedstatusIconCompatParcelizer = setFlexDirection.this.read().IconCompatParcelizer();
                final setFlexDirection setflexdirection = setFlexDirection.this;
                this.read = 1;
                if (setupdatedstatusIconCompatParcelizer.write(new getValidationToken() { // from class: o.setFlexDirection.MediaBrowserCompatCustomActionResultReceiver.3
                    @Override // kotlin.getValidationToken
                    public final /* bridge */ /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return IconCompatParcelizer((setWorkAuthenticatorEnabledWithResult) obj2);
                    }

                    private Object IconCompatParcelizer(setWorkAuthenticatorEnabledWithResult setworkauthenticatorenabledwithresult) {
                        if (!(setworkauthenticatorenabledwithresult instanceof setWorkAuthenticatorEnabledWithResult.AudioAttributesCompatParcelizer) && !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(setworkauthenticatorenabledwithresult, setWorkAuthenticatorEnabledWithResult.read.INSTANCE)) {
                            if (!(setworkauthenticatorenabledwithresult instanceof setWorkAuthenticatorEnabledWithResult.RemoteActionCompatParcelizer)) {
                                throw new RenewEligibleCreator();
                            }
                            AuthorizationRequestBuilder.Companion companion = AuthorizationRequestBuilder.INSTANCE;
                            Context contextRequireContext = setflexdirection.requireContext();
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
                            setflexdirection.startActivity(AuthorizationRequestBuilder.Companion.AudioAttributesCompatParcelizer(contextRequireContext, new WorkAccountClient(((setWorkAuthenticatorEnabledWithResult.RemoteActionCompatParcelizer) setworkauthenticatorenabledwithresult).AudioAttributesCompatParcelizer(), true), null));
                            setflexdirection.requireActivity().finish();
                            setflexdirection.read().read(removeWorkAccount.AudioAttributesCompatParcelizer.INSTANCE);
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
            return setFlexDirection.this.new MediaBrowserCompatCustomActionResultReceiver(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatCustomActionResultReceiver) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IconCompatParcelizer(setFlexDirection setflexdirection, String str, Bundle bundle) {
        CustomModuleUCModel customModuleUCModel;
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(bundle, "");
        if (!bundle.containsKey("data") || (customModuleUCModel = (CustomModuleUCModel) StdKeyDeserializerDelegatingKD.IconCompatParcelizer(bundle, "data", CustomModuleUCModel.class)) == null) {
            return;
        }
        setflexdirection.read().read(new removeWorkAccount.AudioAttributesImplApi26Parcelizer(customModuleUCModel));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RemoteActionCompatParcelizer(setFlexDirection setflexdirection, String str, Bundle bundle) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(bundle, "");
        maybeGetTypeVariable activity = setflexdirection.getActivity();
        if (activity != null) {
            CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer(activity, R.attr.colorSurface);
        }
    }

    private final void IconCompatParcelizer(final String str, List<putInt> list, final RadioButton radioButton, final setIsPrepared setisprepared) {
        Object next;
        if (list.isEmpty()) {
            radioButton.setEnabled(false);
            radioButton.setAlpha(0.5f);
            return;
        }
        for (onDisplayInfoChanged ondisplayinfochanged : IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new onDisplayInfoChanged[]{onDisplayInfoChanged.AudioAttributesCompatParcelizer, onDisplayInfoChanged.IconCompatParcelizer, onDisplayInfoChanged.write})) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (((putInt) next).getRead() == ondisplayinfochanged) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            putInt putint = (putInt) next;
            int remoteActionCompatParcelizer = putint != null ? putint.getRemoteActionCompatParcelizer() : 0;
            boolean z = remoteActionCompatParcelizer != 0;
            float f = z ? 1.0f : 0.5f;
            int i = read.write[ondisplayinfochanged.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    CheckBox checkBox = setisprepared.read;
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(checkBox, "");
                    String string = getString(R.string.bookmark_count, Integer.valueOf(remoteActionCompatParcelizer));
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
                    RemoteActionCompatParcelizer(checkBox, true, z, f, string);
                } else if (i == 3) {
                    CheckBox checkBox2 = setisprepared.AudioAttributesCompatParcelizer;
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(checkBox2, "");
                    String string2 = getString(R.string.bookmark_count, Integer.valueOf(remoteActionCompatParcelizer));
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
                    RemoteActionCompatParcelizer(checkBox2, true, z, f, string2);
                } else {
                    if (i != 4) {
                        throw new RenewEligibleCreator();
                    }
                    CheckBox checkBox3 = setisprepared.IconCompatParcelizer;
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(checkBox3, "");
                    String string3 = getString(R.string.bookmark_count, Integer.valueOf(remoteActionCompatParcelizer));
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string3, "");
                    RemoteActionCompatParcelizer(checkBox3, true, z, f, string3);
                }
            }
        }
        setisprepared.read.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.setShowDividerVertical
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                setFlexDirection.IconCompatParcelizer(this.RemoteActionCompatParcelizer, str, radioButton, setisprepared);
            }
        });
        setisprepared.AudioAttributesCompatParcelizer.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.setShowDividerHorizontal
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                setFlexDirection.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, str, radioButton, setisprepared);
            }
        });
        setisprepared.IconCompatParcelizer.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.setMaxLine
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                setFlexDirection.MediaBrowserCompatItemReceiver(this.read, str, radioButton, setisprepared);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IconCompatParcelizer(setFlexDirection setflexdirection, String str, RadioButton radioButton, setIsPrepared setisprepared) {
        setflexdirection.AudioAttributesCompatParcelizer(str, radioButton, setisprepared);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesCompatParcelizer(setFlexDirection setflexdirection, String str, RadioButton radioButton, setIsPrepared setisprepared) {
        setflexdirection.AudioAttributesCompatParcelizer(str, radioButton, setisprepared);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MediaBrowserCompatItemReceiver(setFlexDirection setflexdirection, String str, RadioButton radioButton, setIsPrepared setisprepared) {
        setflexdirection.AudioAttributesCompatParcelizer(str, radioButton, setisprepared);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void RemoteActionCompatParcelizer(CheckBox checkBox, boolean z, boolean z2, float f, String str) {
        checkBox.setChecked(true);
        checkBox.setEnabled(z2);
        checkBox.setAlpha(f);
        checkBox.setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void RemoteActionCompatParcelizer(List<AuthProxyOptions> list, List<putInt> list2) {
        Iterator it;
        createExtractorByFileType createextractorbyfiletype = this.AudioAttributesCompatParcelizer;
        if (createextractorbyfiletype == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            createextractorbyfiletype = null;
        }
        createextractorbyfiletype.MediaBrowserCompatItemReceiver.removeAllViews();
        int[][] iArr = {new int[]{-16842912}, new int[]{android.R.attr.state_checked}};
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        int i = CmcdConfigurationRequestConfig.read(contextRequireContext, R.attr.onSurfaceBgOutline, R.color.n_70);
        Context contextRequireContext2 = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext2, "");
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{i, CmcdConfigurationRequestConfig.read(contextRequireContext2, R.attr.colorPrimary, R.color.mb_50)});
        Iterator it2 = list.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            Object next = it2.next();
            if (i2 < 0) {
                IntermediateLoginResponseBody.read();
            }
            final AuthProxyOptions authProxyOptions = (AuthProxyOptions) next;
            final RadioButton radioButton = new RadioButton(requireContext());
            radioButton.setButtonTintList(colorStateList);
            shouldEscapeCharacter.Companion companion = shouldEscapeCharacter.INSTANCE;
            Context contextRequireContext3 = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext3, "");
            radioButton.setTextColor(shouldEscapeCharacter.Companion.read(contextRequireContext3, R.attr.onBackgroundSurface2, new TypedValue(), true));
            shouldEscapeCharacter.Companion companion2 = shouldEscapeCharacter.INSTANCE;
            Context contextRequireContext4 = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext4, "");
            radioButton.setTextAppearance(shouldEscapeCharacter.Companion.AudioAttributesCompatParcelizer(contextRequireContext4, R.attr.heading6, new TypedValue(), true));
            RadioButton radioButton2 = radioButton;
            Context contextRequireContext5 = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext5, "");
            int i3 = DataSourceBitmapLoaderExternalSyntheticLambda1.read(contextRequireContext5, 12);
            radioButton2.setPadding(i3, i3, i3, i3);
            radioButton.setText(authProxyOptions.getWrite());
            radioButton.setTag(authProxyOptions.getAudioAttributesCompatParcelizer());
            createExtractorByFileType createextractorbyfiletype2 = this.AudioAttributesCompatParcelizer;
            if (createextractorbyfiletype2 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                createextractorbyfiletype2 = null;
            }
            createextractorbyfiletype2.MediaBrowserCompatItemReceiver.addView(radioButton2);
            int i4 = read.read[authProxyOptions.getRead().ordinal()];
            if (i4 != 1) {
                if (i4 == 2) {
                    radioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.SearchIntents
                        @Override // android.widget.CompoundButton.OnCheckedChangeListener
                        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                            setFlexDirection.write(this.AudioAttributesCompatParcelizer, authProxyOptions, radioButton);
                        }
                    });
                } else {
                    final onTracksEnded ontracksendedWrite = onTracksEnded.write(getLayoutInflater());
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(ontracksendedWrite, "");
                    LinearLayout linearLayoutIconCompatParcelizer = ontracksendedWrite.IconCompatParcelizer();
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayoutIconCompatParcelizer, "");
                    PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(linearLayoutIconCompatParcelizer);
                    CheckBox checkBox = ontracksendedWrite.RemoteActionCompatParcelizer;
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(checkBox, "");
                    CheckBox checkBox2 = ontracksendedWrite.read;
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(checkBox2, "");
                    CheckBox checkBox3 = ontracksendedWrite.write;
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(checkBox3, "");
                    if (authProxyOptions.getRead() == WorkAccountApiAddAccountResult.write) {
                        List<AccountTransferClient> listMediaBrowserCompatItemReceiver = RemoteActionCompatParcelizer().AudioAttributesImplBaseParcelizer().IconCompatParcelizer().MediaBrowserCompatItemReceiver();
                        boolean zContains = listMediaBrowserCompatItemReceiver.contains(AccountTransferClient.read);
                        boolean zContains2 = listMediaBrowserCompatItemReceiver.contains(AccountTransferClient.write);
                        boolean zContains3 = listMediaBrowserCompatItemReceiver.contains(AccountTransferClient.MediaBrowserCompatItemReceiver);
                        boolean z = (zContains || zContains2 || zContains3) ? false : true;
                        if (z) {
                            zContains = true;
                        }
                        checkBox.setChecked(zContains);
                        if (z) {
                            zContains2 = true;
                        }
                        checkBox2.setChecked(zContains2);
                        checkBox3.setChecked(z ? true : zContains3);
                        Iterator it3 = IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new CheckBox[]{checkBox, checkBox2, checkBox3}).iterator();
                        while (it3.hasNext()) {
                            ((CheckBox) it3.next()).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.ReserveIntents
                                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                                public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                                    setFlexDirection.RemoteActionCompatParcelizer(this.write, authProxyOptions, radioButton, ontracksendedWrite);
                                }
                            });
                        }
                    } else if (authProxyOptions.getRead() == WorkAccountApiAddAccountResult.read) {
                        checkBox.setText(R.string.text_attempted);
                        checkBox2.setText(R.string.text_incorrect);
                        checkBox3.setText(R.string.text_unattempted);
                        List<AccountTransferClient> listMediaBrowserCompatItemReceiver2 = RemoteActionCompatParcelizer().AudioAttributesImplBaseParcelizer().IconCompatParcelizer().MediaBrowserCompatItemReceiver();
                        boolean zContains4 = listMediaBrowserCompatItemReceiver2.contains(AccountTransferClient.AudioAttributesCompatParcelizer);
                        boolean zContains5 = listMediaBrowserCompatItemReceiver2.contains(AccountTransferClient.RemoteActionCompatParcelizer);
                        boolean zContains6 = listMediaBrowserCompatItemReceiver2.contains(AccountTransferClient.MediaBrowserCompatCustomActionResultReceiver);
                        boolean z2 = (zContains4 || zContains5 || zContains6) ? false : true;
                        if (z2) {
                            zContains4 = true;
                        }
                        checkBox.setChecked(zContains4);
                        if (z2) {
                            zContains5 = true;
                        }
                        checkBox2.setChecked(zContains5);
                        checkBox3.setChecked(z2 ? true : zContains6);
                        Iterator it4 = IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new CheckBox[]{checkBox, checkBox2, checkBox3}).iterator();
                        while (it4.hasNext()) {
                            ((CheckBox) it4.next()).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.setShowDivider
                                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                                public final void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
                                    setFlexDirection.AudioAttributesCompatParcelizer(this.read, authProxyOptions, radioButton, ontracksendedWrite);
                                }
                            });
                        }
                    }
                    radioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.FlexboxLayoutLayoutParams
                        @Override // android.widget.CompoundButton.OnCheckedChangeListener
                        public final void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
                            setFlexDirection.IconCompatParcelizer(ontracksendedWrite, authProxyOptions, this, radioButton, z3);
                        }
                    });
                    createExtractorByFileType createextractorbyfiletype3 = this.AudioAttributesCompatParcelizer;
                    if (createextractorbyfiletype3 == null) {
                        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                        createextractorbyfiletype3 = null;
                    }
                    createextractorbyfiletype3.MediaBrowserCompatItemReceiver.addView(ontracksendedWrite.IconCompatParcelizer());
                }
                it = it2;
            } else {
                final setIsPrepared setispreparedAudioAttributesCompatParcelizer = setIsPrepared.AudioAttributesCompatParcelizer(getLayoutInflater());
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(setispreparedAudioAttributesCompatParcelizer, "");
                LinearLayout linearLayoutIconCompatParcelizer2 = setispreparedAudioAttributesCompatParcelizer.IconCompatParcelizer();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayoutIconCompatParcelizer2, "");
                PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(linearLayoutIconCompatParcelizer2);
                IconCompatParcelizer(authProxyOptions.getAudioAttributesCompatParcelizer(), list2, radioButton, setispreparedAudioAttributesCompatParcelizer);
                List<AccountTransferClient> listMediaBrowserCompatItemReceiver3 = RemoteActionCompatParcelizer().AudioAttributesImplBaseParcelizer().IconCompatParcelizer().MediaBrowserCompatItemReceiver();
                boolean zContains7 = listMediaBrowserCompatItemReceiver3.contains(AccountTransferClient.IconCompatParcelizer);
                boolean zContains8 = listMediaBrowserCompatItemReceiver3.contains(AccountTransferClient.AudioAttributesImplBaseParcelizer);
                boolean zContains9 = listMediaBrowserCompatItemReceiver3.contains(AccountTransferClient.AudioAttributesImplApi21Parcelizer);
                boolean z3 = (zContains7 || zContains8 || zContains9) ? false : true;
                boolean zIsEnabled = setispreparedAudioAttributesCompatParcelizer.read.isEnabled();
                boolean zIsEnabled2 = setispreparedAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer.isEnabled();
                boolean zIsEnabled3 = setispreparedAudioAttributesCompatParcelizer.IconCompatParcelizer.isEnabled();
                it = it2;
                CheckBox checkBox4 = setispreparedAudioAttributesCompatParcelizer.read;
                if (z3 && zIsEnabled) {
                    zContains7 = true;
                }
                checkBox4.setChecked(zContains7);
                CheckBox checkBox5 = setispreparedAudioAttributesCompatParcelizer.IconCompatParcelizer;
                if (z3 && zIsEnabled3) {
                    zContains8 = true;
                }
                checkBox5.setChecked(zContains8);
                setispreparedAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer.setChecked((z3 && zIsEnabled2) ? true : zContains9);
                radioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.setFlexLines
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z4) {
                        setFlexDirection.RemoteActionCompatParcelizer(setispreparedAudioAttributesCompatParcelizer, this, authProxyOptions, radioButton, z4);
                    }
                });
                createExtractorByFileType createextractorbyfiletype4 = this.AudioAttributesCompatParcelizer;
                if (createextractorbyfiletype4 == null) {
                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                    createextractorbyfiletype4 = null;
                }
                createextractorbyfiletype4.MediaBrowserCompatItemReceiver.addView(setispreparedAudioAttributesCompatParcelizer.IconCompatParcelizer());
            }
            radioButton.setChecked(toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) RemoteActionCompatParcelizer().AudioAttributesImplBaseParcelizer().IconCompatParcelizer().getMediaBrowserCompatSearchResultReceiver(), radioButton.getTag()));
            i2++;
            it2 = it;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RemoteActionCompatParcelizer(setIsPrepared setisprepared, setFlexDirection setflexdirection, AuthProxyOptions authProxyOptions, RadioButton radioButton, boolean z) {
        LinearLayout linearLayoutIconCompatParcelizer = setisprepared.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayoutIconCompatParcelizer, "");
        linearLayoutIconCompatParcelizer.setVisibility(z ? 0 : 8);
        setflexdirection.AudioAttributesCompatParcelizer(authProxyOptions.getAudioAttributesCompatParcelizer(), radioButton, setisprepared);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void write(setFlexDirection setflexdirection, AuthProxyOptions authProxyOptions, RadioButton radioButton) {
        setflexdirection.RemoteActionCompatParcelizer(authProxyOptions.getAudioAttributesCompatParcelizer(), radioButton);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RemoteActionCompatParcelizer(setFlexDirection setflexdirection, AuthProxyOptions authProxyOptions, RadioButton radioButton, onTracksEnded ontracksended) {
        setflexdirection.RemoteActionCompatParcelizer(authProxyOptions.getAudioAttributesCompatParcelizer(), radioButton, ontracksended);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesCompatParcelizer(setFlexDirection setflexdirection, AuthProxyOptions authProxyOptions, RadioButton radioButton, onTracksEnded ontracksended) {
        setflexdirection.write(authProxyOptions.getAudioAttributesCompatParcelizer(), radioButton, ontracksended);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IconCompatParcelizer(onTracksEnded ontracksended, AuthProxyOptions authProxyOptions, setFlexDirection setflexdirection, RadioButton radioButton, boolean z) {
        LinearLayout linearLayoutIconCompatParcelizer = ontracksended.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayoutIconCompatParcelizer, "");
        linearLayoutIconCompatParcelizer.setVisibility(z ? 0 : 8);
        if (authProxyOptions.getRead() == WorkAccountApiAddAccountResult.write) {
            setflexdirection.RemoteActionCompatParcelizer(authProxyOptions.getAudioAttributesCompatParcelizer(), radioButton, ontracksended);
        }
        if (authProxyOptions.getRead() == WorkAccountApiAddAccountResult.read) {
            setflexdirection.write(authProxyOptions.getAudioAttributesCompatParcelizer(), radioButton, ontracksended);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void write(String str) {
        maybeGetTypeVariable activity = getActivity();
        if (activity != null) {
            CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer(activity, R.attr.backgroundColor);
        }
        Fragment fragmentFindFragmentByTag = getChildFragmentManager().findFragmentByTag("join_cm");
        if (fragmentFindFragmentByTag != null) {
            getChildFragmentManager().IconCompatParcelizer().read(fragmentFindFragmentByTag).write();
        }
        getRpId.Companion iconCompatParcelizer = getRpId.INSTANCE;
        getRpId.Companion.read(str).show(getChildFragmentManager(), "join_cm");
    }

    private final void write() {
        createExtractorByFileType createextractorbyfiletype = this.AudioAttributesCompatParcelizer;
        createExtractorByFileType createextractorbyfiletype2 = null;
        if (createextractorbyfiletype == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            createextractorbyfiletype = null;
        }
        createextractorbyfiletype.MediaDescriptionCompat.AudioAttributesCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.FlexboxLayoutManagerSavedState
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                setFlexDirection.AudioAttributesImplApi26Parcelizer(this.RemoteActionCompatParcelizer);
            }
        });
        createExtractorByFileType createextractorbyfiletype3 = this.AudioAttributesCompatParcelizer;
        if (createextractorbyfiletype3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            createextractorbyfiletype3 = null;
        }
        createextractorbyfiletype3.IconCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.setFlexWrap
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                setFlexDirection.MediaBrowserCompatItemReceiver(this.write);
            }
        });
        createExtractorByFileType createextractorbyfiletype4 = this.AudioAttributesCompatParcelizer;
        if (createextractorbyfiletype4 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            createextractorbyfiletype4 = null;
        }
        createextractorbyfiletype4.MediaMetadataCompat.setOnItemSelectedListener(new RemoteActionCompatParcelizer());
        createExtractorByFileType createextractorbyfiletype5 = this.AudioAttributesCompatParcelizer;
        if (createextractorbyfiletype5 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            createextractorbyfiletype5 = null;
        }
        createextractorbyfiletype5.MediaBrowserCompatCustomActionResultReceiver.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.FlexboxLayoutManager
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                setFlexDirection.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, z);
            }
        });
        createExtractorByFileType createextractorbyfiletype6 = this.AudioAttributesCompatParcelizer;
        if (createextractorbyfiletype6 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            createextractorbyfiletype6 = null;
        }
        createextractorbyfiletype6.AudioAttributesImplBaseParcelizer.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.NoteIntents
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                setFlexDirection.read(this.AudioAttributesCompatParcelizer, z);
            }
        });
        createExtractorByFileType createextractorbyfiletype7 = this.AudioAttributesCompatParcelizer;
        if (createextractorbyfiletype7 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            createextractorbyfiletype7 = null;
        }
        createextractorbyfiletype7.AudioAttributesImplApi21Parcelizer.write(new Slider.RemoteActionCompatParcelizer() { // from class: o.ItemListIntents
            @Override // com.google.android.material.slider.Slider.RemoteActionCompatParcelizer, kotlin.AviExtractorAviSeekMap
            /* JADX INFO: renamed from: read */
            public final void AudioAttributesCompatParcelizer(Slider slider, float f, boolean z) {
                setFlexDirection.IconCompatParcelizer(this.read, slider, f);
            }
        });
        createExtractorByFileType createextractorbyfiletype8 = this.AudioAttributesCompatParcelizer;
        if (createextractorbyfiletype8 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            createextractorbyfiletype2 = createextractorbyfiletype8;
        }
        createextractorbyfiletype2.onAddQueueItem.setOnClickListener(new View.OnClickListener() { // from class: o.getAdvertisingIdInfo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                setFlexDirection.MediaBrowserCompatCustomActionResultReceiver(this.IconCompatParcelizer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesImplApi26Parcelizer(setFlexDirection setflexdirection) {
        createExtractorByFileType createextractorbyfiletype = setflexdirection.AudioAttributesCompatParcelizer;
        if (createextractorbyfiletype == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            createextractorbyfiletype = null;
        }
        FrameLayout frameLayout = createextractorbyfiletype.MediaDescriptionCompat.read;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(frameLayout, "");
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(frameLayout);
        setflexdirection.read().read(removeWorkAccount.AudioAttributesImplApi21Parcelizer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MediaBrowserCompatItemReceiver(setFlexDirection setflexdirection) {
        WorkAccountClient workAccountClientIconCompatParcelizer = setflexdirection.read().read().IconCompatParcelizer();
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) workAccountClientIconCompatParcelizer.getMediaBrowserCompatSearchResultReceiver(), (Object) "all") && workAccountClientIconCompatParcelizer.MediaBrowserCompatItemReceiver().isEmpty()) {
            setFlexDirection setflexdirection2 = setflexdirection;
            String string = setflexdirection.getResources().getString(R.string.error_select_type, workAccountClientIconCompatParcelizer.getMediaBrowserCompatSearchResultReceiver());
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
            CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer(setflexdirection2, string, 0);
            return;
        }
        withAlwaysAsId.read(setflexdirection, "requestKey", _getIndexResolver.write(setAction.write("isNext", Boolean.TRUE), setAction.write("currentFrag", 0)));
    }

    public static final class RemoteActionCompatParcelizer implements AdapterView.OnItemSelectedListener {
        RemoteActionCompatParcelizer() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            CustomModuleAddOnsViewModel customModuleAddOnsViewModel = setFlexDirection.this.read();
            createExtractorByFileType createextractorbyfiletype = setFlexDirection.this.AudioAttributesCompatParcelizer;
            if (createextractorbyfiletype == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                createextractorbyfiletype = null;
            }
            Object item = createextractorbyfiletype.MediaMetadataCompat.getAdapter().getItem(i);
            customModuleAddOnsViewModel.read(new removeWorkAccount.IconCompatParcelizer(item instanceof Integer ? (Integer) item : null));
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onNothingSelected(AdapterView<?> adapterView) {
            setFlexDirection.this.read().read(new removeWorkAccount.IconCompatParcelizer(null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesCompatParcelizer(setFlexDirection setflexdirection, boolean z) {
        createExtractorByFileType createextractorbyfiletype = null;
        if (z) {
            createExtractorByFileType createextractorbyfiletype2 = setflexdirection.AudioAttributesCompatParcelizer;
            if (createextractorbyfiletype2 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                createextractorbyfiletype2 = null;
            }
            Slider slider = createextractorbyfiletype2.AudioAttributesImplApi21Parcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(slider, "");
            PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(slider);
            createExtractorByFileType createextractorbyfiletype3 = setflexdirection.AudioAttributesCompatParcelizer;
            if (createextractorbyfiletype3 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            } else {
                createextractorbyfiletype = createextractorbyfiletype3;
            }
            LinearLayout linearLayout = createextractorbyfiletype.write;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
            PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(linearLayout);
            setflexdirection.read().read(new removeWorkAccount.read("all"));
            return;
        }
        createExtractorByFileType createextractorbyfiletype4 = setflexdirection.AudioAttributesCompatParcelizer;
        if (createextractorbyfiletype4 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            createextractorbyfiletype4 = null;
        }
        Slider slider2 = createextractorbyfiletype4.AudioAttributesImplApi21Parcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(slider2, "");
        PlayerControlViewExternalSyntheticLambda1.write(slider2);
        createExtractorByFileType createextractorbyfiletype5 = setflexdirection.AudioAttributesCompatParcelizer;
        if (createextractorbyfiletype5 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            createextractorbyfiletype = createextractorbyfiletype5;
        }
        LinearLayout linearLayout2 = createextractorbyfiletype.write;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout2, "");
        PlayerControlViewExternalSyntheticLambda1.write(linearLayout2);
        setflexdirection.read().read(new removeWorkAccount.read("medium"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void read(setFlexDirection setflexdirection, boolean z) {
        createExtractorByFileType createextractorbyfiletype = null;
        if (z) {
            createExtractorByFileType createextractorbyfiletype2 = setflexdirection.AudioAttributesCompatParcelizer;
            if (createextractorbyfiletype2 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                createextractorbyfiletype2 = null;
            }
            Slider slider = createextractorbyfiletype2.AudioAttributesImplApi21Parcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(slider, "");
            PlayerControlViewExternalSyntheticLambda1.write(slider);
            createExtractorByFileType createextractorbyfiletype3 = setflexdirection.AudioAttributesCompatParcelizer;
            if (createextractorbyfiletype3 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            } else {
                createextractorbyfiletype = createextractorbyfiletype3;
            }
            LinearLayout linearLayout = createextractorbyfiletype.write;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
            PlayerControlViewExternalSyntheticLambda1.write(linearLayout);
            return;
        }
        createExtractorByFileType createextractorbyfiletype4 = setflexdirection.AudioAttributesCompatParcelizer;
        if (createextractorbyfiletype4 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            createextractorbyfiletype4 = null;
        }
        Slider slider2 = createextractorbyfiletype4.AudioAttributesImplApi21Parcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(slider2, "");
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(slider2);
        createExtractorByFileType createextractorbyfiletype5 = setflexdirection.AudioAttributesCompatParcelizer;
        if (createextractorbyfiletype5 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            createextractorbyfiletype = createextractorbyfiletype5;
        }
        LinearLayout linearLayout2 = createextractorbyfiletype.write;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout2, "");
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(linearLayout2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IconCompatParcelizer(setFlexDirection setflexdirection, Slider slider, float f) {
        toMagicModuleMetaRepoModel.write(slider, "");
        setflexdirection.AudioAttributesCompatParcelizer(f);
        if (f == BitmapDescriptorFactory.HUE_RED) {
            setflexdirection.read().read(new removeWorkAccount.read("easy"));
        } else if (f == 0.5f) {
            setflexdirection.read().read(new removeWorkAccount.read("medium"));
        } else if (f == 1.0f) {
            setflexdirection.read().read(new removeWorkAccount.read("hard"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MediaBrowserCompatCustomActionResultReceiver(setFlexDirection setflexdirection) {
        setflexdirection.write("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void RemoteActionCompatParcelizer(List<Integer> list) {
        ArrayAdapter arrayAdapter = new ArrayAdapter(requireContext(), R.layout.marrow_simple_spinner_item, list);
        arrayAdapter.setDropDownViewResource(R.layout.spinner_tv_item);
        createExtractorByFileType createextractorbyfiletype = this.AudioAttributesCompatParcelizer;
        createExtractorByFileType createextractorbyfiletype2 = null;
        if (createextractorbyfiletype == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            createextractorbyfiletype = null;
        }
        createextractorbyfiletype.MediaMetadataCompat.setAdapter((SpinnerAdapter) arrayAdapter);
        int iIndexOf = list.indexOf(Integer.valueOf(RemoteActionCompatParcelizer().AudioAttributesImplBaseParcelizer().IconCompatParcelizer().getMediaBrowserCompatItemReceiver()));
        if (iIndexOf == -1) {
            iIndexOf = 0;
        }
        createExtractorByFileType createextractorbyfiletype3 = this.AudioAttributesCompatParcelizer;
        if (createextractorbyfiletype3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            createextractorbyfiletype2 = createextractorbyfiletype3;
        }
        createextractorbyfiletype2.MediaMetadataCompat.setSelection(iIndexOf);
    }

    private final void RemoteActionCompatParcelizer(String str, RadioButton radioButton) {
        if (radioButton.isChecked()) {
            read().read(new removeWorkAccount.write(str, IntermediateLoginResponseBody.RemoteActionCompatParcelizer()));
        }
    }

    private final void write(String str, RadioButton radioButton, onTracksEnded ontracksended) {
        if (radioButton.isChecked()) {
            ArrayList arrayList = new ArrayList();
            if (ontracksended.RemoteActionCompatParcelizer.isChecked()) {
                arrayList.add(AccountTransferClient.AudioAttributesCompatParcelizer);
            }
            if (ontracksended.read.isChecked()) {
                arrayList.add(AccountTransferClient.RemoteActionCompatParcelizer);
            }
            if (ontracksended.write.isChecked()) {
                arrayList.add(AccountTransferClient.MediaBrowserCompatCustomActionResultReceiver);
            }
            read().read(new removeWorkAccount.write(str, arrayList));
        }
    }

    private final void AudioAttributesCompatParcelizer(String str, RadioButton radioButton, setIsPrepared setisprepared) {
        if (radioButton.isChecked()) {
            ArrayList arrayList = new ArrayList();
            if (setisprepared.read.isChecked()) {
                arrayList.add(AccountTransferClient.IconCompatParcelizer);
            }
            if (setisprepared.IconCompatParcelizer.isChecked()) {
                arrayList.add(AccountTransferClient.AudioAttributesImplBaseParcelizer);
            }
            if (setisprepared.AudioAttributesCompatParcelizer.isChecked()) {
                arrayList.add(AccountTransferClient.AudioAttributesImplApi21Parcelizer);
            }
            read().read(new removeWorkAccount.write(str, arrayList));
        }
    }

    private final void RemoteActionCompatParcelizer(String str, RadioButton radioButton, onTracksEnded ontracksended) {
        if (radioButton.isChecked()) {
            ArrayList arrayList = new ArrayList();
            if (ontracksended.RemoteActionCompatParcelizer.isChecked()) {
                arrayList.add(AccountTransferClient.read);
            }
            if (ontracksended.read.isChecked()) {
                arrayList.add(AccountTransferClient.write);
            }
            if (ontracksended.write.isChecked()) {
                arrayList.add(AccountTransferClient.MediaBrowserCompatItemReceiver);
            }
            read().read(new removeWorkAccount.write(str, arrayList));
        }
    }

    private final void AudioAttributesCompatParcelizer(float f) {
        shouldEscapeCharacter.Companion companion = shouldEscapeCharacter.INSTANCE;
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        int i = shouldEscapeCharacter.Companion.read(contextRequireContext, R.attr.onBackgroundSurface2, new TypedValue(), true);
        shouldEscapeCharacter.Companion companion2 = shouldEscapeCharacter.INSTANCE;
        Context contextRequireContext2 = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext2, "");
        int i2 = shouldEscapeCharacter.Companion.read(contextRequireContext2, R.attr.onSurfaceBlue, new TypedValue(), true);
        createExtractorByFileType createextractorbyfiletype = this.AudioAttributesCompatParcelizer;
        if (createextractorbyfiletype == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            createextractorbyfiletype = null;
        }
        createextractorbyfiletype.MediaBrowserCompatMediaItem.setTextColor(i);
        createextractorbyfiletype.MediaBrowserCompatMediaItem.setTypeface(createextractorbyfiletype.MediaBrowserCompatMediaItem.getTypeface(), 0);
        createextractorbyfiletype.onCommand.setTextColor(i);
        createextractorbyfiletype.onCommand.setTypeface(createextractorbyfiletype.onCommand.getTypeface(), 0);
        createextractorbyfiletype.MediaBrowserCompatSearchResultReceiver.setTextColor(i);
        createextractorbyfiletype.MediaBrowserCompatSearchResultReceiver.setTypeface(createextractorbyfiletype.MediaBrowserCompatSearchResultReceiver.getTypeface(), 0);
        if (f == BitmapDescriptorFactory.HUE_RED) {
            createextractorbyfiletype.MediaBrowserCompatMediaItem.setTextColor(i2);
            createextractorbyfiletype.MediaBrowserCompatMediaItem.setTypeface(createextractorbyfiletype.MediaBrowserCompatMediaItem.getTypeface(), 1);
        } else if (f == 0.5f) {
            createextractorbyfiletype.onCommand.setTextColor(i2);
            createextractorbyfiletype.onCommand.setTypeface(createextractorbyfiletype.onCommand.getTypeface(), 1);
        } else if (f == 1.0f) {
            createextractorbyfiletype.MediaBrowserCompatSearchResultReceiver.setTextColor(i2);
            createextractorbyfiletype.MediaBrowserCompatSearchResultReceiver.setTypeface(createextractorbyfiletype.MediaBrowserCompatSearchResultReceiver.getTypeface(), 1);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/setFlexDirection$IconCompatParcelizer;", "", "<init>", "()V", "Landroidx/fragment/app/Fragment;", "read", "()Landroidx/fragment/app/Fragment;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public static Fragment read() {
            return new setFlexDirection();
        }

        public /* synthetic */ IconCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        getChildFragmentManager().IconCompatParcelizer("CustomModuleJoinByCodeDialogSuccessKey");
        getChildFragmentManager().IconCompatParcelizer("CustomModuleJoinByCodeDialogDismissKey");
    }
}
