package kotlin;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.material.chip.Chip;
import com.marrow.R;
import com.marrow2.data.tag.local.model.TagLSModel;
import com.marrow2.ui.custom_module.creation.viewmodel.CustomModuleCreationViewModel;
import com.marrow2.ui.custom_module.creation.viewmodel.CustomModuleTagsViewModel;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC0287zzf;
import kotlin.AccountTransfer;
import kotlin.Metadata;
import kotlin.VisibilityChecker;
import kotlin.withFieldVisibility;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0003J\u001d\u0010\u0016\u001a\u00020\r2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0018\u001a\u00020\r2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u0016\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0016\u0010\u0003R\u0016\u0010\u0016\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001f\u001a\u00020\u001c8CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u001d\u001a\u0004\b\u001a\u0010\u001eR\u001b\u0010\u0018\u001a\u00020 8CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b\u0018\u0010!"}, d2 = {"Lo/clearToken;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "MediaBrowserCompatCustomActionResultReceiver", "onStart", "onStop", "read", "", "Lcom/marrow2/data/tag/local/model/TagLSModel;", "write", "(Ljava/util/List;)V", "AudioAttributesCompatParcelizer", "Lo/createFragmentedMp4Extractor;", "RemoteActionCompatParcelizer", "Lo/createFragmentedMp4Extractor;", "Lcom/marrow2/ui/custom_module/creation/viewmodel/CustomModuleTagsViewModel;", "Lo/RenewEligible;", "()Lcom/marrow2/ui/custom_module/creation/viewmodel/CustomModuleTagsViewModel;", "IconCompatParcelizer", "Lcom/marrow2/ui/custom_module/creation/viewmodel/CustomModuleCreationViewModel;", "()Lcom/marrow2/ui/custom_module/creation/viewmodel/CustomModuleCreationViewModel;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class clearToken extends addWorkAccount {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final RenewEligible AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private createFragmentedMp4Extractor write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final RenewEligible IconCompatParcelizer;

    public clearToken() {
        clearToken cleartoken = this;
        RenewEligible renewEligibleWrite = getRenewExpiresOn.write(RenewEligibleCompanion.read, new AnonymousClass1(new AnonymousClass3(cleartoken)));
        this.IconCompatParcelizer = _resolveFieldVsGetter.RemoteActionCompatParcelizer(toMagicModuleMetaDataUcModel.write(CustomModuleTagsViewModel.class), new AnonymousClass2(renewEligibleWrite), new AnonymousClass4(renewEligibleWrite), new AnonymousClass5(cleartoken, renewEligibleWrite));
        RenewEligible renewEligibleWrite2 = getRenewExpiresOn.write(RenewEligibleCompanion.read, new AnonymousClass7(new getCreatedOnDateMs() { // from class: o.requestGoogleAccountsAccess
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return clearToken.RatingCompat(this.IconCompatParcelizer);
            }
        }));
        this.AudioAttributesCompatParcelizer = _resolveFieldVsGetter.RemoteActionCompatParcelizer(toMagicModuleMetaDataUcModel.write(CustomModuleCreationViewModel.class), new AnonymousClass6(renewEligibleWrite2), new AnonymousClass10(renewEligibleWrite2), new AnonymousClass8(cleartoken, renewEligibleWrite2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CustomModuleTagsViewModel RemoteActionCompatParcelizer() {
        return (CustomModuleTagsViewModel) this.IconCompatParcelizer.RemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CustomModuleCreationViewModel AudioAttributesCompatParcelizer() {
        return (CustomModuleCreationViewModel) this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TypeResolutionContext RatingCompat(clearToken cleartoken) {
        Fragment fragmentRequireParentFragment = cleartoken.requireParentFragment();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(fragmentRequireParentFragment, "");
        return fragmentRequireParentFragment;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        createFragmentedMp4Extractor createfragmentedmp4extractorIconCompatParcelizer = createFragmentedMp4Extractor.IconCompatParcelizer(p0, p1);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(createfragmentedmp4extractorIconCompatParcelizer, "");
        this.write = createfragmentedmp4extractorIconCompatParcelizer;
        if (createfragmentedmp4extractorIconCompatParcelizer == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            createfragmentedmp4extractorIconCompatParcelizer = null;
        }
        LinearLayout linearLayoutIconCompatParcelizer = createfragmentedmp4extractorIconCompatParcelizer.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayoutIconCompatParcelizer, "");
        return linearLayoutIconCompatParcelizer;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View p0, Bundle p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onViewCreated(p0, p1);
        MediaBrowserCompatCustomActionResultReceiver();
        read();
        write();
    }

    private final void MediaBrowserCompatCustomActionResultReceiver() {
        if (DeviceProperties.isTablet(requireContext())) {
            Context contextRequireContext = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
            createFragmentedMp4Extractor createfragmentedmp4extractor = this.write;
            createFragmentedMp4Extractor createfragmentedmp4extractor2 = null;
            if (createfragmentedmp4extractor == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                createfragmentedmp4extractor = null;
            }
            LinearLayout linearLayout = createfragmentedmp4extractor.AudioAttributesCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
            bytesRead.AudioAttributesCompatParcelizer(contextRequireContext, linearLayout);
            Context contextRequireContext2 = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext2, "");
            createFragmentedMp4Extractor createfragmentedmp4extractor3 = this.write;
            if (createfragmentedmp4extractor3 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                createfragmentedmp4extractor3 = null;
            }
            ConstraintLayout constraintLayout = createfragmentedmp4extractor3.write;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout, "");
            bytesRead.AudioAttributesCompatParcelizer(contextRequireContext2, constraintLayout);
            Context contextRequireContext3 = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext3, "");
            createFragmentedMp4Extractor createfragmentedmp4extractor4 = this.write;
            if (createfragmentedmp4extractor4 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            } else {
                createfragmentedmp4extractor2 = createfragmentedmp4extractor4;
            }
            LinearLayout linearLayout2 = createfragmentedmp4extractor2.MediaMetadataCompat;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout2, "");
            bytesRead.AudioAttributesCompatParcelizer(contextRequireContext3, linearLayout2);
        }
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<WorkAccountClient> setupdatedstatusAudioAttributesImplBaseParcelizer = clearToken.this.AudioAttributesCompatParcelizer().AudioAttributesImplBaseParcelizer();
                final clearToken cleartoken = clearToken.this;
                this.read = 1;
                if (setupdatedstatusAudioAttributesImplBaseParcelizer.write(new getValidationToken() { // from class: o.clearToken.IconCompatParcelizer.1
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return read((WorkAccountClient) obj2);
                    }

                    private Object read(WorkAccountClient workAccountClient) {
                        cleartoken.RemoteActionCompatParcelizer().IconCompatParcelizer(workAccountClient);
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
            return clearToken.this.new IconCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        setBitrateKbps.read(this, new IconCompatParcelizer(null));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        AudioAttributesCompatParcelizer().read(new AbstractC0287zzf.MediaMetadataCompat(RemoteActionCompatParcelizer().IconCompatParcelizer().IconCompatParcelizer()));
        super.onStop();
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<List<TagLSModel>> setupdatedstatus = clearToken.this.RemoteActionCompatParcelizer().read();
                final clearToken cleartoken = clearToken.this;
                this.RemoteActionCompatParcelizer = 1;
                if (setupdatedstatus.write(new getValidationToken() { // from class: o.clearToken.RemoteActionCompatParcelizer.1
                    @Override // kotlin.getValidationToken
                    public final /* bridge */ /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return IconCompatParcelizer((List) obj2);
                    }

                    private Object IconCompatParcelizer(List<TagLSModel> list) {
                        if (!list.isEmpty()) {
                            cleartoken.AudioAttributesCompatParcelizer(list);
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
            return clearToken.this.new RemoteActionCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void read() {
        clearToken cleartoken = this;
        setBitrateKbps.read(cleartoken, new RemoteActionCompatParcelizer(null));
        setBitrateKbps.read(cleartoken, new read(null));
        setBitrateKbps.read(cleartoken, new write(null));
    }

    static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<retrieveData> setupdatedstatusAudioAttributesCompatParcelizer = clearToken.this.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer();
                final clearToken cleartoken = clearToken.this;
                this.IconCompatParcelizer = 1;
                if (setupdatedstatusAudioAttributesCompatParcelizer.write(new getValidationToken() { // from class: o.clearToken.read.4
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return AudioAttributesCompatParcelizer((retrieveData) obj2);
                    }

                    private Object AudioAttributesCompatParcelizer(retrieveData retrievedata) {
                        if (retrievedata != null) {
                            createFragmentedMp4Extractor createfragmentedmp4extractor = cleartoken.write;
                            createFragmentedMp4Extractor createfragmentedmp4extractor2 = null;
                            if (createfragmentedmp4extractor == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                createfragmentedmp4extractor = null;
                            }
                            createfragmentedmp4extractor.MediaBrowserCompatCustomActionResultReceiver.setChecked(retrievedata.IconCompatParcelizer() == notifyCompletion.AudioAttributesCompatParcelizer);
                            createFragmentedMp4Extractor createfragmentedmp4extractor3 = cleartoken.write;
                            if (createfragmentedmp4extractor3 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                createfragmentedmp4extractor3 = null;
                            }
                            createfragmentedmp4extractor3.MediaBrowserCompatItemReceiver.setChecked(retrievedata.IconCompatParcelizer() == notifyCompletion.IconCompatParcelizer);
                            createFragmentedMp4Extractor createfragmentedmp4extractor4 = cleartoken.write;
                            if (createfragmentedmp4extractor4 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            } else {
                                createfragmentedmp4extractor2 = createfragmentedmp4extractor4;
                            }
                            createfragmentedmp4extractor2.read.setChecked(retrievedata.AudioAttributesCompatParcelizer());
                            cleartoken.write(retrievedata.read());
                            return getShowPopup.INSTANCE;
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
            return clearToken.this.new read(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
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
                setUpdatedStatus<Boolean> setupdatedstatusAudioAttributesImplApi21Parcelizer = clearToken.this.RemoteActionCompatParcelizer().AudioAttributesImplApi21Parcelizer();
                final clearToken cleartoken = clearToken.this;
                this.IconCompatParcelizer = 1;
                if (setupdatedstatusAudioAttributesImplApi21Parcelizer.write(new getValidationToken() { // from class: o.clearToken.write.1
                    @Override // kotlin.getValidationToken
                    public final /* bridge */ /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return IconCompatParcelizer(((Boolean) obj2).booleanValue());
                    }

                    private Object IconCompatParcelizer(boolean z) {
                        createFragmentedMp4Extractor createfragmentedmp4extractor = null;
                        if (z) {
                            createFragmentedMp4Extractor createfragmentedmp4extractor2 = cleartoken.write;
                            if (createfragmentedmp4extractor2 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                createfragmentedmp4extractor2 = null;
                            }
                            ProgressBar progressBar = createfragmentedmp4extractor2.AudioAttributesImplApi21Parcelizer;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar, "");
                            bytesRead.AudioAttributesImplApi21Parcelizer(progressBar);
                            createFragmentedMp4Extractor createfragmentedmp4extractor3 = cleartoken.write;
                            if (createfragmentedmp4extractor3 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            } else {
                                createfragmentedmp4extractor = createfragmentedmp4extractor3;
                            }
                            ScrollView scrollView = createfragmentedmp4extractor.AudioAttributesImplApi26Parcelizer;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(scrollView, "");
                            bytesRead.MediaBrowserCompatCustomActionResultReceiver(scrollView);
                        } else {
                            createFragmentedMp4Extractor createfragmentedmp4extractor4 = cleartoken.write;
                            if (createfragmentedmp4extractor4 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                createfragmentedmp4extractor4 = null;
                            }
                            ProgressBar progressBar2 = createfragmentedmp4extractor4.AudioAttributesImplApi21Parcelizer;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar2, "");
                            bytesRead.MediaBrowserCompatCustomActionResultReceiver(progressBar2);
                            createFragmentedMp4Extractor createfragmentedmp4extractor5 = cleartoken.write;
                            if (createfragmentedmp4extractor5 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            } else {
                                createfragmentedmp4extractor = createfragmentedmp4extractor5;
                            }
                            ScrollView scrollView2 = createfragmentedmp4extractor.AudioAttributesImplApi26Parcelizer;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(scrollView2, "");
                            bytesRead.AudioAttributesImplApi21Parcelizer(scrollView2);
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
            return clearToken.this.new write(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: o.clearToken$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Landroidx/fragment/app/Fragment;", "read", "()Landroidx/fragment/app/Fragment;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<Fragment> {
        private /* synthetic */ Fragment $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.$write;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Fragment fragment) {
            super(0);
            this.$write = fragment;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void write(List<TagLSModel> p0) {
        createFragmentedMp4Extractor createfragmentedmp4extractor = this.write;
        if (createfragmentedmp4extractor == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            createfragmentedmp4extractor = null;
        }
        FlexboxLayout flexboxLayout = createfragmentedmp4extractor.AudioAttributesImplBaseParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(flexboxLayout, "");
        Iterator<View> itWrite = getSerializerForJavaNioFilePath.read(flexboxLayout).write();
        while (itWrite.hasNext()) {
            View next = itWrite.next();
            toMagicModuleMetaRepoModel.read(next, "");
            Chip chip = (Chip) next;
            List<TagLSModel> list = p0;
            boolean z = false;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) ((TagLSModel) it.next()).getTitle(), chip.getTag())) {
                        z = true;
                        break;
                    }
                }
            }
            chip.setSelected(z);
        }
    }

    /* JADX INFO: renamed from: o.clearToken$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/TypeResolutionContext;", "IconCompatParcelizer", "()Lo/TypeResolutionContext;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<TypeResolutionContext> {
        private /* synthetic */ getCreatedOnDateMs $RemoteActionCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final TypeResolutionContext invoke() {
            return (TypeResolutionContext) this.$RemoteActionCompatParcelizer.invoke();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(getCreatedOnDateMs getcreatedondatems) {
            super(0);
            this.$RemoteActionCompatParcelizer = getcreatedondatems;
        }
    }

    /* JADX INFO: renamed from: o.clearToken$7, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/TypeResolutionContext;", "IconCompatParcelizer", "()Lo/TypeResolutionContext;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass7 extends MagicModuleUseCase implements getCreatedOnDateMs<TypeResolutionContext> {
        private /* synthetic */ getCreatedOnDateMs $IconCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final TypeResolutionContext invoke() {
            return (TypeResolutionContext) this.$IconCompatParcelizer.invoke();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(getCreatedOnDateMs getcreatedondatems) {
            super(0);
            this.$IconCompatParcelizer = getcreatedondatems;
        }
    }

    /* JADX INFO: renamed from: o.clearToken$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "read", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass2 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ RenewEligible $RemoteActionCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return _resolveFieldVsGetter.write(this.$RemoteActionCompatParcelizer).getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(RenewEligible renewEligible) {
            super(0);
            this.$RemoteActionCompatParcelizer = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.clearToken$6, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "RemoteActionCompatParcelizer", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass6 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ RenewEligible $read;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return _resolveFieldVsGetter.write(this.$read).getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(RenewEligible renewEligible) {
            super(0);
            this.$read = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.clearToken$10, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "write", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass10 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ getCreatedOnDateMs $RemoteActionCompatParcelizer = null;
        private /* synthetic */ RenewEligible $read;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final withFieldVisibility invoke() {
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$read);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return anyexplicitswithoutignoral != null ? anyexplicitswithoutignoral.getDefaultViewModelCreationExtras() : withFieldVisibility.write.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass10(RenewEligible renewEligible) {
            super(0);
            this.$read = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.clearToken$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "IconCompatParcelizer", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass4 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ getCreatedOnDateMs $RemoteActionCompatParcelizer = null;
        private /* synthetic */ RenewEligible $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void AudioAttributesCompatParcelizer(List<TagLSModel> p0) {
        createFragmentedMp4Extractor createfragmentedmp4extractor = this.write;
        if (createfragmentedmp4extractor == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            createfragmentedmp4extractor = null;
        }
        createfragmentedmp4extractor.AudioAttributesImplBaseParcelizer.removeAllViews();
        for (final TagLSModel tagLSModel : p0) {
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
            createFragmentedMp4Extractor createfragmentedmp4extractor2 = this.write;
            if (createfragmentedmp4extractor2 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                createfragmentedmp4extractor2 = null;
            }
            View viewInflate = layoutInflaterFrom.inflate(R.layout.rv_item_tag_selection, (ViewGroup) createfragmentedmp4extractor2.AudioAttributesImplBaseParcelizer, false);
            toMagicModuleMetaRepoModel.read(viewInflate, "");
            Chip chip = (Chip) viewInflate;
            chip.setText(tagLSModel.getTitle());
            chip.setTag(tagLSModel.getTitle());
            chip.setSelected(true);
            chip.setOnClickListener(new View.OnClickListener() { // from class: o.getTokenWithNotification
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    clearToken.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, tagLSModel);
                }
            });
            createFragmentedMp4Extractor createfragmentedmp4extractor3 = this.write;
            if (createfragmentedmp4extractor3 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                createfragmentedmp4extractor3 = null;
            }
            createfragmentedmp4extractor3.AudioAttributesImplBaseParcelizer.addView(chip);
        }
    }

    /* JADX INFO: renamed from: o.clearToken$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "IconCompatParcelizer", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ RenewEligible $RemoteActionCompatParcelizer;
        private /* synthetic */ Fragment $read;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            VisibilityChecker.RemoteActionCompatParcelizer defaultViewModelProviderFactory;
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$RemoteActionCompatParcelizer);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return (anyexplicitswithoutignoral == null || (defaultViewModelProviderFactory = anyexplicitswithoutignoral.getDefaultViewModelProviderFactory()) == null) ? this.$read.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(Fragment fragment, RenewEligible renewEligible) {
            super(0);
            this.$read = fragment;
            this.$RemoteActionCompatParcelizer = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.clearToken$8, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "write", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass8 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ RenewEligible $AudioAttributesCompatParcelizer;
        private /* synthetic */ Fragment $read;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            VisibilityChecker.RemoteActionCompatParcelizer defaultViewModelProviderFactory;
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$AudioAttributesCompatParcelizer);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return (anyexplicitswithoutignoral == null || (defaultViewModelProviderFactory = anyexplicitswithoutignoral.getDefaultViewModelProviderFactory()) == null) ? this.$read.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass8(Fragment fragment, RenewEligible renewEligible) {
            super(0);
            this.$read = fragment;
            this.$AudioAttributesCompatParcelizer = renewEligible;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesCompatParcelizer(clearToken cleartoken, TagLSModel tagLSModel) {
        cleartoken.RemoteActionCompatParcelizer().write(new AccountTransfer.IconCompatParcelizer(tagLSModel));
    }

    private final void write() {
        createFragmentedMp4Extractor createfragmentedmp4extractor = this.write;
        createFragmentedMp4Extractor createfragmentedmp4extractor2 = null;
        if (createfragmentedmp4extractor == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            createfragmentedmp4extractor = null;
        }
        createfragmentedmp4extractor.MediaBrowserCompatCustomActionResultReceiver.setOnClickListener(new View.OnClickListener() { // from class: o.getAccountId
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                clearToken.MediaBrowserCompatCustomActionResultReceiver(this.AudioAttributesCompatParcelizer);
            }
        });
        createFragmentedMp4Extractor createfragmentedmp4extractor3 = this.write;
        if (createfragmentedmp4extractor3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            createfragmentedmp4extractor3 = null;
        }
        createfragmentedmp4extractor3.MediaBrowserCompatItemReceiver.setOnClickListener(new View.OnClickListener() { // from class: o.GoogleAuthUtil
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                clearToken.MediaMetadataCompat(this.AudioAttributesCompatParcelizer);
            }
        });
        createFragmentedMp4Extractor createfragmentedmp4extractor4 = this.write;
        if (createfragmentedmp4extractor4 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            createfragmentedmp4extractor4 = null;
        }
        createfragmentedmp4extractor4.IconCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.getAccountChangeEvents
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                clearToken.MediaBrowserCompatSearchResultReceiver(this.AudioAttributesCompatParcelizer);
            }
        });
        createFragmentedMp4Extractor createfragmentedmp4extractor5 = this.write;
        if (createfragmentedmp4extractor5 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            createfragmentedmp4extractor5 = null;
        }
        createfragmentedmp4extractor5.RemoteActionCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.removeAccount
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                clearToken.MediaDescriptionCompat(this.read);
            }
        });
        createFragmentedMp4Extractor createfragmentedmp4extractor6 = this.write;
        if (createfragmentedmp4extractor6 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            createfragmentedmp4extractor2 = createfragmentedmp4extractor6;
        }
        createfragmentedmp4extractor2.read.setOnClickListener(new View.OnClickListener() { // from class: o.invalidateToken
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                clearToken.MediaBrowserCompatMediaItem(this.RemoteActionCompatParcelizer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MediaBrowserCompatCustomActionResultReceiver(clearToken cleartoken) {
        cleartoken.RemoteActionCompatParcelizer().write(AccountTransfer.write.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MediaMetadataCompat(clearToken cleartoken) {
        cleartoken.RemoteActionCompatParcelizer().write(AccountTransfer.AudioAttributesCompatParcelizer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MediaBrowserCompatSearchResultReceiver(clearToken cleartoken) {
        createFragmentedMp4Extractor createfragmentedmp4extractor = cleartoken.write;
        if (createfragmentedmp4extractor == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            createfragmentedmp4extractor = null;
        }
        FlexboxLayout flexboxLayout = createfragmentedmp4extractor.AudioAttributesImplBaseParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(flexboxLayout, "");
        Iterator<View> itWrite = getSerializerForJavaNioFilePath.read(flexboxLayout).write();
        while (itWrite.hasNext()) {
            View next = itWrite.next();
            toMagicModuleMetaRepoModel.read(next, "");
            if (((Chip) next).isSelected()) {
                cleartoken.RemoteActionCompatParcelizer().write(AccountTransfer.read.INSTANCE);
                withAlwaysAsId.read(cleartoken, "requestKey", _getIndexResolver.write(setAction.write("isNext", Boolean.TRUE), setAction.write("currentFrag", 2)));
                return;
            }
        }
        clearToken cleartoken2 = cleartoken;
        String string = cleartoken.getResources().getString(R.string.error_select_tag);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer(cleartoken2, string, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MediaDescriptionCompat(clearToken cleartoken) {
        cleartoken.RemoteActionCompatParcelizer().write(AccountTransfer.read.INSTANCE);
        withAlwaysAsId.read(cleartoken, "requestKey", _getIndexResolver.write(setAction.write("isNext", Boolean.FALSE), setAction.write("currentFrag", 2)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MediaBrowserCompatMediaItem(clearToken cleartoken) {
        cleartoken.RemoteActionCompatParcelizer().write(AccountTransfer.RemoteActionCompatParcelizer.INSTANCE);
    }

    /* JADX INFO: renamed from: o.clearToken$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/clearToken$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "Landroidx/fragment/app/Fragment;", "RemoteActionCompatParcelizer", "()Landroidx/fragment/app/Fragment;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static Fragment RemoteActionCompatParcelizer() {
            return new clearToken();
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
