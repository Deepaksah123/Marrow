package kotlin;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.material.appbar.MaterialToolbar;
import com.marrow.R;
import com.marrow2.domain.custom_module.model.CustomModuleTopicListModel;
import com.marrow2.ui.custom_module.creation.viewmodel.CustomModuleTopicSelectionViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.VisibilityChecker;
import kotlin.getDeviceMetaData;
import kotlin.setAlignItems;
import kotlin.showUserChallenge;
import kotlin.withFieldVisibility;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00162\u00020\u00012\u00020\u0002:\u0001\u0016B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J+\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0004J\u000f\u0010\u0012\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0004J\u000f\u0010\u0013\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0004J\u001f\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0011\u001a\u00020\u000e2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00140\u0018H\u0002¢\u0006\u0004\b\u0011\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001a\u0010\u0004J\u000f\u0010\u001b\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001b\u0010\u0004R\u0016\u0010\u001a\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001dR\u001b\u0010\u0016\u001a\u00020\u001e8CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0016\u0010!R\u0014\u0010\u0011\u001a\u00020\"8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010#R\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00140\u00188\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010$"}, d2 = {"Lo/TokenData;", "Landroidx/fragment/app/Fragment;", "Lo/setAlignItems$AudioAttributesCompatParcelizer;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "read", "AudioAttributesImplApi21Parcelizer", "AudioAttributesImplApi26Parcelizer", "Lcom/marrow2/domain/custom_module/model/CustomModuleTopicListModel;", "", "write", "(Lcom/marrow2/domain/custom_module/model/CustomModuleTopicListModel;Z)V", "", "(Ljava/util/List;)V", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer", "Lo/sniffQuietly;", "Lo/sniffQuietly;", "Lcom/marrow2/ui/custom_module/creation/viewmodel/CustomModuleTopicSelectionViewModel;", "IconCompatParcelizer", "Lo/RenewEligible;", "()Lcom/marrow2/ui/custom_module/creation/viewmodel/CustomModuleTopicSelectionViewModel;", "Lo/setAlignItems;", "Lo/setAlignItems;", "Ljava/util/List;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TokenData extends setWorkAuthenticatorEnabled implements setAlignItems.AudioAttributesCompatParcelizer {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private sniffQuietly RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final RenewEligible write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final setAlignItems read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private List<CustomModuleTopicListModel> AudioAttributesCompatParcelizer;

    public TokenData() {
        TokenData tokenData = this;
        RenewEligible renewEligibleWrite = getRenewExpiresOn.write(RenewEligibleCompanion.read, new AnonymousClass4(new AnonymousClass2(tokenData)));
        this.write = _resolveFieldVsGetter.RemoteActionCompatParcelizer(toMagicModuleMetaDataUcModel.write(CustomModuleTopicSelectionViewModel.class), new AnonymousClass5(renewEligibleWrite), new AnonymousClass3(renewEligibleWrite), new AnonymousClass1(tokenData, renewEligibleWrite));
        this.read = new setAlignItems(this);
        this.AudioAttributesCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CustomModuleTopicSelectionViewModel write() {
        return (CustomModuleTopicSelectionViewModel) this.write.RemoteActionCompatParcelizer();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        sniffQuietly sniffquietlyWrite = sniffQuietly.write(p0, p1);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(sniffquietlyWrite, "");
        this.RemoteActionCompatParcelizer = sniffquietlyWrite;
        if (sniffquietlyWrite == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            sniffquietlyWrite = null;
        }
        ConstraintLayout constraintLayoutIconCompatParcelizer = sniffquietlyWrite.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayoutIconCompatParcelizer, "");
        return constraintLayoutIconCompatParcelizer;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View p0, Bundle p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onViewCreated(p0, p1);
        read();
        AudioAttributesImplApi21Parcelizer();
        AudioAttributesCompatParcelizer();
        RemoteActionCompatParcelizer();
        AudioAttributesImplApi26Parcelizer();
    }

    private final void read() {
        sniffQuietly sniffquietly = this.RemoteActionCompatParcelizer;
        sniffQuietly sniffquietly2 = null;
        if (sniffquietly == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            sniffquietly = null;
        }
        MaterialToolbar materialToolbar = sniffquietly.AudioAttributesImplApi26Parcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(materialToolbar, "");
        getHttpMethodString.read((View) materialToolbar, true, false, true, true, 0, 50);
        sniffQuietly sniffquietly3 = this.RemoteActionCompatParcelizer;
        if (sniffquietly3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            sniffquietly2 = sniffquietly3;
        }
        LinearLayout linearLayout = sniffquietly2.write;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
        getHttpMethodString.read((View) linearLayout, false, true, true, true, 0, 49);
    }

    private final void AudioAttributesImplApi21Parcelizer() {
        if (DeviceProperties.isTablet(requireContext())) {
            Context contextRequireContext = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
            sniffQuietly sniffquietly = this.RemoteActionCompatParcelizer;
            sniffQuietly sniffquietly2 = null;
            if (sniffquietly == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                sniffquietly = null;
            }
            LinearLayout linearLayout = sniffquietly.read;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
            bytesRead.AudioAttributesCompatParcelizer(contextRequireContext, linearLayout);
            Context contextRequireContext2 = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext2, "");
            sniffQuietly sniffquietly3 = this.RemoteActionCompatParcelizer;
            if (sniffquietly3 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            } else {
                sniffquietly2 = sniffquietly3;
            }
            RecyclerView recyclerView = sniffquietly2.AudioAttributesCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(recyclerView, "");
            bytesRead.AudioAttributesCompatParcelizer(contextRequireContext2, recyclerView);
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
                setUpdatedStatus<showUserChallenge> setupdatedstatus = TokenData.this.write().read();
                final TokenData tokenData = TokenData.this;
                this.read = 1;
                if (setupdatedstatus.write(new getValidationToken() { // from class: o.TokenData.AudioAttributesCompatParcelizer.2
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return write((showUserChallenge) obj2);
                    }

                    private Object write(showUserChallenge showuserchallenge) throws Exception {
                        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(showuserchallenge, showUserChallenge.IconCompatParcelizer.INSTANCE)) {
                            tokenData.write().IconCompatParcelizer(getDeviceMetaData.write.INSTANCE);
                            tokenData.requireActivity().finish();
                        } else if (showuserchallenge instanceof showUserChallenge.AudioAttributesCompatParcelizer) {
                            maybeGetTypeVariable maybegettypevariableRequireActivity = tokenData.requireActivity();
                            Intent intent = new Intent();
                            showUserChallenge.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (showUserChallenge.AudioAttributesCompatParcelizer) showuserchallenge;
                            intent.putExtra("selectedTopics", new ArrayList(audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer()));
                            intent.putExtra("rootId", audioAttributesCompatParcelizer.read());
                            intent.putExtra("areAllTopicsSelected", audioAttributesCompatParcelizer.RemoteActionCompatParcelizer());
                            getShowPopup getshowpopup = getShowPopup.INSTANCE;
                            maybegettypevariableRequireActivity.setResult(-1, intent);
                            tokenData.requireActivity().finish();
                        }
                        tokenData.write().IconCompatParcelizer(getDeviceMetaData.write.INSTANCE);
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
            return TokenData.this.new AudioAttributesCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void AudioAttributesImplApi26Parcelizer() {
        TokenData tokenData = this;
        setBitrateKbps.RemoteActionCompatParcelizer(tokenData, new AudioAttributesCompatParcelizer(null));
        setBitrateKbps.RemoteActionCompatParcelizer(tokenData, new RemoteActionCompatParcelizer(null));
        setBitrateKbps.RemoteActionCompatParcelizer(tokenData, new IconCompatParcelizer(null));
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<String> setupdatedstatusAudioAttributesCompatParcelizer = TokenData.this.write().AudioAttributesCompatParcelizer();
                final TokenData tokenData = TokenData.this;
                this.IconCompatParcelizer = 1;
                if (setupdatedstatusAudioAttributesCompatParcelizer.write(new getValidationToken() { // from class: o.TokenData.RemoteActionCompatParcelizer.1
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return RemoteActionCompatParcelizer((String) obj2);
                    }

                    private Object RemoteActionCompatParcelizer(String str) {
                        sniffQuietly sniffquietly = tokenData.RemoteActionCompatParcelizer;
                        if (sniffquietly == null) {
                            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            sniffquietly = null;
                        }
                        sniffquietly.AudioAttributesImplBaseParcelizer.setText(str);
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
            return TokenData.this.new RemoteActionCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<DataSourceBitmapLoaderExternalSyntheticLambda0<List<CustomModuleTopicListModel>>> setupdatedstatusMediaBrowserCompatCustomActionResultReceiver = TokenData.this.write().MediaBrowserCompatCustomActionResultReceiver();
                final TokenData tokenData = TokenData.this;
                this.AudioAttributesCompatParcelizer = 1;
                if (setupdatedstatusMediaBrowserCompatCustomActionResultReceiver.write(new getValidationToken() { // from class: o.TokenData.IconCompatParcelizer.4
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return RemoteActionCompatParcelizer((DataSourceBitmapLoaderExternalSyntheticLambda0) obj2);
                    }

                    private Object RemoteActionCompatParcelizer(DataSourceBitmapLoaderExternalSyntheticLambda0<List<CustomModuleTopicListModel>> dataSourceBitmapLoaderExternalSyntheticLambda0) {
                        if (dataSourceBitmapLoaderExternalSyntheticLambda0 instanceof decodeBitmap) {
                            V vRemoteActionCompatParcelizer = ((decodeBitmap) dataSourceBitmapLoaderExternalSyntheticLambda0).RemoteActionCompatParcelizer();
                            TokenData tokenData2 = tokenData;
                            List list = (List) vRemoteActionCompatParcelizer;
                            ArrayList arrayList = new ArrayList();
                            for (T t : list) {
                                if (((CustomModuleTopicListModel) t).getRead()) {
                                    arrayList.add(t);
                                }
                            }
                            ArrayList arrayList2 = arrayList;
                            tokenData2.AudioAttributesCompatParcelizer = arrayList2;
                            sniffQuietly sniffquietly = null;
                            if (arrayList2.size() == list.size()) {
                                sniffQuietly sniffquietly2 = tokenData2.RemoteActionCompatParcelizer;
                                if (sniffquietly2 == null) {
                                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                    sniffquietly2 = null;
                                }
                                sniffquietly2.AudioAttributesImplApi21Parcelizer.setChecked(true);
                                sniffQuietly sniffquietly3 = tokenData2.RemoteActionCompatParcelizer;
                                if (sniffquietly3 == null) {
                                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                } else {
                                    sniffquietly = sniffquietly3;
                                }
                                sniffquietly.MediaBrowserCompatCustomActionResultReceiver.setChecked(false);
                            } else {
                                sniffQuietly sniffquietly4 = tokenData2.RemoteActionCompatParcelizer;
                                if (sniffquietly4 == null) {
                                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                    sniffquietly4 = null;
                                }
                                sniffquietly4.AudioAttributesImplApi21Parcelizer.setChecked(false);
                                sniffQuietly sniffquietly5 = tokenData2.RemoteActionCompatParcelizer;
                                if (sniffquietly5 == null) {
                                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                } else {
                                    sniffquietly = sniffquietly5;
                                }
                                sniffquietly.MediaBrowserCompatCustomActionResultReceiver.setChecked(true);
                            }
                            tokenData2.read((List<CustomModuleTopicListModel>) list);
                        } else if (!(dataSourceBitmapLoaderExternalSyntheticLambda0 instanceof setStreamingFormat)) {
                            if (!(dataSourceBitmapLoaderExternalSyntheticLambda0 instanceof setTopBitrateKbps)) {
                                throw new RenewEligibleCreator();
                            }
                            tokenData.requireActivity().finish();
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
            return TokenData.this.new IconCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: o.TokenData$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Landroidx/fragment/app/Fragment;", "AudioAttributesCompatParcelizer", "()Landroidx/fragment/app/Fragment;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass2 extends MagicModuleUseCase implements getCreatedOnDateMs<Fragment> {
        private /* synthetic */ Fragment $AudioAttributesCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.$AudioAttributesCompatParcelizer;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Fragment fragment) {
            super(0);
            this.$AudioAttributesCompatParcelizer = fragment;
        }
    }

    /* JADX INFO: renamed from: o.TokenData$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/TypeResolutionContext;", "read", "()Lo/TypeResolutionContext;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass4 extends MagicModuleUseCase implements getCreatedOnDateMs<TypeResolutionContext> {
        private /* synthetic */ getCreatedOnDateMs $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final TypeResolutionContext invoke() {
            return (TypeResolutionContext) this.$write.invoke();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(getCreatedOnDateMs getcreatedondatems) {
            super(0);
            this.$write = getcreatedondatems;
        }
    }

    /* JADX INFO: renamed from: o.TokenData$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "read", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ RenewEligible $AudioAttributesCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return _resolveFieldVsGetter.write(this.$AudioAttributesCompatParcelizer).getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(RenewEligible renewEligible) {
            super(0);
            this.$AudioAttributesCompatParcelizer = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.TokenData$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "write", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ getCreatedOnDateMs $AudioAttributesCompatParcelizer = null;
        private /* synthetic */ RenewEligible $IconCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final withFieldVisibility invoke() {
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$IconCompatParcelizer);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return anyexplicitswithoutignoral != null ? anyexplicitswithoutignoral.getDefaultViewModelCreationExtras() : withFieldVisibility.write.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(RenewEligible renewEligible) {
            super(0);
            this.$IconCompatParcelizer = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.TokenData$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "AudioAttributesCompatParcelizer", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ RenewEligible $IconCompatParcelizer;
        private /* synthetic */ Fragment $read;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            VisibilityChecker.RemoteActionCompatParcelizer defaultViewModelProviderFactory;
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$IconCompatParcelizer);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return (anyexplicitswithoutignoral == null || (defaultViewModelProviderFactory = anyexplicitswithoutignoral.getDefaultViewModelProviderFactory()) == null) ? this.$read.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Fragment fragment, RenewEligible renewEligible) {
            super(0);
            this.$read = fragment;
            this.$IconCompatParcelizer = renewEligible;
        }
    }

    @Override // o.setAlignItems.AudioAttributesCompatParcelizer
    public final void write(CustomModuleTopicListModel p0, boolean p1) throws Exception {
        toMagicModuleMetaRepoModel.write(p0, "");
        write().IconCompatParcelizer(new getDeviceMetaData.AudioAttributesImplApi21Parcelizer(p0, p1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void read(List<CustomModuleTopicListModel> p0) {
        this.read.read(p0);
    }

    private final void RemoteActionCompatParcelizer() {
        sniffQuietly sniffquietly = this.RemoteActionCompatParcelizer;
        sniffQuietly sniffquietly2 = null;
        if (sniffquietly == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            sniffquietly = null;
        }
        sniffquietly.AudioAttributesImplApi26Parcelizer.setNavigationOnClickListener(new View.OnClickListener() { // from class: o.zzg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Exception {
                TokenData.IconCompatParcelizer(this.AudioAttributesCompatParcelizer);
            }
        });
        sniffQuietly sniffquietly3 = this.RemoteActionCompatParcelizer;
        if (sniffquietly3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            sniffquietly3 = null;
        }
        sniffquietly3.IconCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.UserRecoverableAuthException
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Exception {
                TokenData.AudioAttributesImplBaseParcelizer(this.AudioAttributesCompatParcelizer);
            }
        });
        sniffQuietly sniffquietly4 = this.RemoteActionCompatParcelizer;
        if (sniffquietly4 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            sniffquietly2 = sniffquietly4;
        }
        sniffquietly2.RemoteActionCompatParcelizer.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: o.GooglePlayServicesAvailabilityException
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i) throws Exception {
                TokenData.read(this.IconCompatParcelizer, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IconCompatParcelizer(TokenData tokenData) throws Exception {
        tokenData.write().IconCompatParcelizer(getDeviceMetaData.IconCompatParcelizer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesImplBaseParcelizer(TokenData tokenData) throws Exception {
        sniffQuietly sniffquietly = tokenData.RemoteActionCompatParcelizer;
        if (sniffquietly == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            sniffquietly = null;
        }
        if (sniffquietly.MediaBrowserCompatCustomActionResultReceiver.isChecked() && tokenData.AudioAttributesCompatParcelizer.isEmpty()) {
            TokenData tokenData2 = tokenData;
            String string = tokenData.getResources().getString(R.string.toast_custom_module_minimum_one_topic_error);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
            CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer(tokenData2, string, 0);
            return;
        }
        tokenData.write().IconCompatParcelizer(getDeviceMetaData.RemoteActionCompatParcelizer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void read(TokenData tokenData, int i) throws Exception {
        sniffQuietly sniffquietly = null;
        switch (i) {
            case R.id.topicsAll /* 2131364006 */:
                sniffQuietly sniffquietly2 = tokenData.RemoteActionCompatParcelizer;
                if (sniffquietly2 == null) {
                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                } else {
                    sniffquietly = sniffquietly2;
                }
                if (sniffquietly.AudioAttributesImplApi21Parcelizer.isChecked()) {
                    tokenData.write().IconCompatParcelizer(getDeviceMetaData.AudioAttributesCompatParcelizer.INSTANCE);
                }
                break;
            case R.id.topicsChoose /* 2131364007 */:
                sniffQuietly sniffquietly3 = tokenData.RemoteActionCompatParcelizer;
                if (sniffquietly3 == null) {
                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                } else {
                    sniffquietly = sniffquietly3;
                }
                if (sniffquietly.MediaBrowserCompatCustomActionResultReceiver.isChecked()) {
                    tokenData.write().IconCompatParcelizer(getDeviceMetaData.read.INSTANCE);
                }
                break;
        }
    }

    private final void AudioAttributesCompatParcelizer() {
        int i;
        sniffQuietly sniffquietly = this.RemoteActionCompatParcelizer;
        if (sniffquietly == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            sniffquietly = null;
        }
        RecyclerView recyclerView = sniffquietly.AudioAttributesCompatParcelizer;
        requireContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setItemAnimator(null);
        recyclerView.setAdapter(this.read);
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

    /* JADX INFO: renamed from: o.TokenData$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/TokenData$write;", "", "<init>", "()V", "Lo/WorkAccountClient;", "p0", "Landroidx/fragment/app/Fragment;", "write", "(Lo/WorkAccountClient;)Landroidx/fragment/app/Fragment;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static Fragment write(WorkAccountClient p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            TokenData tokenData = new TokenData();
            tokenData.setArguments(p0.RemoteActionCompatParcelizer());
            return tokenData;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
