package kotlin;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.material.appbar.MaterialToolbar;
import com.marrow.R;
import com.marrow2.ui.custom_module.creation.viewmodel.CustomModuleCreationViewModel;
import java.util.List;
import java.util.Locale;
import kotlin.AbstractC0287zzf;
import kotlin.AccountChangeEvent;
import kotlin.AuthorizationRequestBuilder;
import kotlin.Metadata;
import kotlin.VisibilityChecker;
import kotlin.clearToken;
import kotlin.getAutofillClient;
import kotlin.setAccountName;
import kotlin.setFlexDirection;
import kotlin.withFieldVisibility;
import kotlin.zaac;
import kotlin.zadb;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0003J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0003J\u000f\u0010\u0015\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0015\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0016\u0010\u0003J\u000f\u0010\u0017\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0017\u0010\u0003J\u0017\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u0019\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001d\u0010\u0003J\u000f\u0010\u001e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001e\u0010\u0003J)\u0010 \u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u001b2\u0006\u0010\u0007\u001a\u00020\u001b2\b\u0010\t\u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b \u0010!R\u001b\u0010\u0010\u001a\u00020\"8CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R\u0016\u0010'\u001a\u00020&8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b'\u0010("}, d2 = {"Lo/setShouldSkipGmsCoreVersionCheck;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "RemoteActionCompatParcelizer", "AudioAttributesImplBaseParcelizer", "write", "MediaBrowserCompatCustomActionResultReceiver", "MediaBrowserCompatItemReceiver", "MediaMetadataCompat", "AudioAttributesImplApi21Parcelizer", "AudioAttributesImplApi26Parcelizer", "", "read", "(Z)V", "", "(I)V", "RatingCompat", "MediaBrowserCompatSearchResultReceiver", "Landroid/content/Intent;", "onActivityResult", "(IILandroid/content/Intent;)V", "Lcom/marrow2/ui/custom_module/creation/viewmodel/CustomModuleCreationViewModel;", "AudioAttributesCompatParcelizer", "Lo/RenewEligible;", "()Lcom/marrow2/ui/custom_module/creation/viewmodel/CustomModuleCreationViewModel;", "Lo/createDataSource;", "IconCompatParcelizer", "Lo/createDataSource;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class setShouldSkipGmsCoreVersionCheck extends UserRecoverableNotifiedException {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final RenewEligible RemoteActionCompatParcelizer;
    private createDataSource IconCompatParcelizer;

    public setShouldSkipGmsCoreVersionCheck() {
        setShouldSkipGmsCoreVersionCheck setshouldskipgmscoreversioncheck = this;
        RenewEligible renewEligibleWrite = getRenewExpiresOn.write(RenewEligibleCompanion.read, new AnonymousClass4(new AnonymousClass2(setshouldskipgmscoreversioncheck)));
        this.RemoteActionCompatParcelizer = _resolveFieldVsGetter.RemoteActionCompatParcelizer(toMagicModuleMetaDataUcModel.write(CustomModuleCreationViewModel.class), new AnonymousClass1(renewEligibleWrite), new AnonymousClass5(renewEligibleWrite), new AnonymousClass3(setshouldskipgmscoreversioncheck, renewEligibleWrite));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CustomModuleCreationViewModel AudioAttributesCompatParcelizer() {
        return (CustomModuleCreationViewModel) this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        createDataSource createdatasourceWrite = createDataSource.write(p0, p1);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(createdatasourceWrite, "");
        this.IconCompatParcelizer = createdatasourceWrite;
        if (createdatasourceWrite == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            createdatasourceWrite = null;
        }
        ConstraintLayout constraintLayoutIconCompatParcelizer = createdatasourceWrite.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayoutIconCompatParcelizer, "");
        return constraintLayoutIconCompatParcelizer;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View p0, Bundle p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onViewCreated(p0, p1);
        RemoteActionCompatParcelizer();
        if (p1 == null) {
            setFlexDirection.IconCompatParcelizer iconCompatParcelizer = setFlexDirection.RemoteActionCompatParcelizer;
            CmcdConfigurationRequestConfig.write(this, R.id.cmFrameLayout, setFlexDirection.IconCompatParcelizer.read());
        }
        AudioAttributesImplBaseParcelizer();
        MediaBrowserCompatCustomActionResultReceiver();
    }

    private final void RemoteActionCompatParcelizer() {
        createDataSource createdatasource = this.IconCompatParcelizer;
        createDataSource createdatasource2 = null;
        if (createdatasource == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            createdatasource = null;
        }
        MaterialToolbar materialToolbar = createdatasource.MediaBrowserCompatMediaItem;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(materialToolbar, "");
        getHttpMethodString.read((View) materialToolbar, true, false, true, true, 0, 50);
        createDataSource createdatasource3 = this.IconCompatParcelizer;
        if (createdatasource3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            createdatasource3 = null;
        }
        ConstraintLayout constraintLayout = createdatasource3.MediaBrowserCompatItemReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout, "");
        getHttpMethodString.read((View) constraintLayout, false, false, true, true, 0, 51);
        createDataSource createdatasource4 = this.IconCompatParcelizer;
        if (createdatasource4 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            createdatasource4 = null;
        }
        ConstraintLayout constraintLayout2 = createdatasource4.write;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout2, "");
        getHttpMethodString.read((View) constraintLayout2, false, false, true, true, 0, 51);
        createDataSource createdatasource5 = this.IconCompatParcelizer;
        if (createdatasource5 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            createdatasource2 = createdatasource5;
        }
        LinearLayout linearLayout = createdatasource2.AudioAttributesImplBaseParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
        getHttpMethodString.read((View) linearLayout, false, true, true, true, 0, 49);
    }

    private final void AudioAttributesImplBaseParcelizer() {
        if (DeviceProperties.isTablet(requireContext())) {
            Context contextRequireContext = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
            ConstraintLayout[] constraintLayoutArr = new ConstraintLayout[2];
            createDataSource createdatasource = this.IconCompatParcelizer;
            createDataSource createdatasource2 = null;
            if (createdatasource == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                createdatasource = null;
            }
            constraintLayoutArr[0] = createdatasource.RemoteActionCompatParcelizer;
            createDataSource createdatasource3 = this.IconCompatParcelizer;
            if (createdatasource3 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            } else {
                createdatasource2 = createdatasource3;
            }
            constraintLayoutArr[1] = createdatasource2.MediaDescriptionCompat;
            bytesRead.IconCompatParcelizer(contextRequireContext, (List<? extends View>) IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) constraintLayoutArr));
        }
    }

    public final void write() {
        Fragment fragmentFindFragmentById = getChildFragmentManager().findFragmentById(R.id.cmFrameLayout);
        if (fragmentFindFragmentById instanceof setAccountName) {
            AudioAttributesCompatParcelizer().read(1);
            CustomModuleCreationViewModel customModuleCreationViewModelAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
            customModuleCreationViewModelAudioAttributesCompatParcelizer.read(customModuleCreationViewModelAudioAttributesCompatParcelizer.getMediaBrowserCompatCustomActionResultReceiver() - 1);
            getChildFragmentManager().onPrepareFromUri();
        } else if (fragmentFindFragmentById instanceof clearToken) {
            AudioAttributesCompatParcelizer().read(2);
            CustomModuleCreationViewModel customModuleCreationViewModelAudioAttributesCompatParcelizer2 = AudioAttributesCompatParcelizer();
            customModuleCreationViewModelAudioAttributesCompatParcelizer2.read(customModuleCreationViewModelAudioAttributesCompatParcelizer2.getMediaBrowserCompatCustomActionResultReceiver() - 1);
            getChildFragmentManager().onPrepareFromUri();
        } else if (fragmentFindFragmentById instanceof AccountChangeEvent) {
            AudioAttributesCompatParcelizer().read(3);
            CustomModuleCreationViewModel customModuleCreationViewModelAudioAttributesCompatParcelizer3 = AudioAttributesCompatParcelizer();
            customModuleCreationViewModelAudioAttributesCompatParcelizer3.read(customModuleCreationViewModelAudioAttributesCompatParcelizer3.getMediaBrowserCompatCustomActionResultReceiver() - 1);
            getChildFragmentManager().onPrepareFromUri();
        } else {
            zadb.Companion companion = zadb.INSTANCE;
            Context contextRequireContext = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
            Intent intentWrite = zadb.Companion.write(contextRequireContext);
            intentWrite.addFlags(603979776);
            startActivity(intentWrite);
            requireActivity().finish();
        }
        RatingCompat();
    }

    /* JADX INFO: renamed from: o.setShouldSkipGmsCoreVersionCheck$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Landroidx/fragment/app/Fragment;", "write", "()Landroidx/fragment/app/Fragment;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass2 extends MagicModuleUseCase implements getCreatedOnDateMs<Fragment> {
        private /* synthetic */ Fragment $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.$write;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Fragment fragment) {
            super(0);
            this.$write = fragment;
        }
    }

    /* JADX INFO: renamed from: o.setShouldSkipGmsCoreVersionCheck$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/TypeResolutionContext;", "AudioAttributesCompatParcelizer", "()Lo/TypeResolutionContext;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass4 extends MagicModuleUseCase implements getCreatedOnDateMs<TypeResolutionContext> {
        private /* synthetic */ getCreatedOnDateMs $IconCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final TypeResolutionContext invoke() {
            return (TypeResolutionContext) this.$IconCompatParcelizer.invoke();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(getCreatedOnDateMs getcreatedondatems) {
            super(0);
            this.$IconCompatParcelizer = getcreatedondatems;
        }
    }

    /* JADX INFO: renamed from: o.setShouldSkipGmsCoreVersionCheck$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "read", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ RenewEligible $IconCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return _resolveFieldVsGetter.write(this.$IconCompatParcelizer).getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RenewEligible renewEligible) {
            super(0);
            this.$IconCompatParcelizer = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.setShouldSkipGmsCoreVersionCheck$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "AudioAttributesCompatParcelizer", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ RenewEligible $RemoteActionCompatParcelizer;
        private /* synthetic */ getCreatedOnDateMs $read = null;

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

    private final void MediaBrowserCompatCustomActionResultReceiver() {
        createDataSource createdatasource = this.IconCompatParcelizer;
        if (createdatasource == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            createdatasource = null;
        }
        createdatasource.MediaBrowserCompatMediaItem.write(R.menu.menu_close);
        createDataSource createdatasource2 = this.IconCompatParcelizer;
        if (createdatasource2 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            createdatasource2 = null;
        }
        createdatasource2.MediaBrowserCompatMediaItem.setNavigationIcon((Drawable) null);
        AudioAttributesImplApi21Parcelizer();
        MediaBrowserCompatItemReceiver();
        RatingCompat();
    }

    /* JADX INFO: renamed from: o.setShouldSkipGmsCoreVersionCheck$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "write", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ Fragment $AudioAttributesCompatParcelizer;
        private /* synthetic */ RenewEligible $read;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            VisibilityChecker.RemoteActionCompatParcelizer defaultViewModelProviderFactory;
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$read);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return (anyexplicitswithoutignoral == null || (defaultViewModelProviderFactory = anyexplicitswithoutignoral.getDefaultViewModelProviderFactory()) == null) ? this.$AudioAttributesCompatParcelizer.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Fragment fragment, RenewEligible renewEligible) {
            super(0);
            this.$AudioAttributesCompatParcelizer = fragment;
            this.$read = renewEligible;
        }
    }

    static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<Integer> setupdatedstatusIconCompatParcelizer = setShouldSkipGmsCoreVersionCheck.this.AudioAttributesCompatParcelizer().IconCompatParcelizer();
                final setShouldSkipGmsCoreVersionCheck setshouldskipgmscoreversioncheck = setShouldSkipGmsCoreVersionCheck.this;
                this.RemoteActionCompatParcelizer = 1;
                if (setupdatedstatusIconCompatParcelizer.write(new getValidationToken() { // from class: o.setShouldSkipGmsCoreVersionCheck.write.5
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return write();
                    }

                    private Object write() {
                        setshouldskipgmscoreversioncheck.RatingCompat();
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
            return setShouldSkipGmsCoreVersionCheck.this.new write(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void MediaBrowserCompatItemReceiver() {
        setShouldSkipGmsCoreVersionCheck setshouldskipgmscoreversioncheck = this;
        setBitrateKbps.RemoteActionCompatParcelizer(setshouldskipgmscoreversioncheck, new write(null));
        setBitrateKbps.RemoteActionCompatParcelizer(setshouldskipgmscoreversioncheck, new read(null));
    }

    static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<AbstractC0287zzf> setupdatedstatusAudioAttributesCompatParcelizer = setShouldSkipGmsCoreVersionCheck.this.AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer();
                final setShouldSkipGmsCoreVersionCheck setshouldskipgmscoreversioncheck = setShouldSkipGmsCoreVersionCheck.this;
                this.read = 1;
                if (setupdatedstatusAudioAttributesCompatParcelizer.write(new getValidationToken() { // from class: o.setShouldSkipGmsCoreVersionCheck.read.3
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return read((AbstractC0287zzf) obj2);
                    }

                    private Object read(AbstractC0287zzf abstractC0287zzf) {
                        createDataSource createdatasource = null;
                        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(abstractC0287zzf, AbstractC0287zzf.read.INSTANCE)) {
                            createDataSource createdatasource2 = setshouldskipgmscoreversioncheck.IconCompatParcelizer;
                            if (createdatasource2 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                createdatasource2 = null;
                            }
                            ConstraintLayout constraintLayout = createdatasource2.write;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout, "");
                            PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(constraintLayout);
                            createDataSource createdatasource3 = setshouldskipgmscoreversioncheck.IconCompatParcelizer;
                            if (createdatasource3 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            } else {
                                createdatasource = createdatasource3;
                            }
                            ConstraintLayout constraintLayout2 = createdatasource.MediaBrowserCompatItemReceiver;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout2, "");
                            PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(constraintLayout2);
                        } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(abstractC0287zzf, AbstractC0287zzf.AudioAttributesImplApi26Parcelizer.INSTANCE)) {
                            createDataSource createdatasource4 = setshouldskipgmscoreversioncheck.IconCompatParcelizer;
                            if (createdatasource4 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                createdatasource4 = null;
                            }
                            ConstraintLayout constraintLayout3 = createdatasource4.write;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout3, "");
                            PlayerControlViewExternalSyntheticLambda1.write(constraintLayout3);
                            createDataSource createdatasource5 = setshouldskipgmscoreversioncheck.IconCompatParcelizer;
                            if (createdatasource5 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            } else {
                                createdatasource = createdatasource5;
                            }
                            ConstraintLayout constraintLayout4 = createdatasource.MediaBrowserCompatItemReceiver;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout4, "");
                            PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(constraintLayout4);
                        } else if (abstractC0287zzf instanceof AbstractC0287zzf.MediaBrowserCompatSearchResultReceiver) {
                            createDataSource createdatasource6 = setshouldskipgmscoreversioncheck.IconCompatParcelizer;
                            if (createdatasource6 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                createdatasource6 = null;
                            }
                            ConstraintLayout constraintLayout5 = createdatasource6.write;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout5, "");
                            PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(constraintLayout5);
                            createDataSource createdatasource7 = setshouldskipgmscoreversioncheck.IconCompatParcelizer;
                            if (createdatasource7 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                createdatasource7 = null;
                            }
                            ConstraintLayout constraintLayout6 = createdatasource7.MediaBrowserCompatItemReceiver;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout6, "");
                            PlayerControlViewExternalSyntheticLambda1.write(constraintLayout6);
                            List listWrite = TestGroupLSModel.write(((AbstractC0287zzf.MediaBrowserCompatSearchResultReceiver) abstractC0287zzf).AudioAttributesCompatParcelizer(), new String[]{" "}, 0, 6);
                            if (listWrite.size() > 1) {
                                createDataSource createdatasource8 = setshouldskipgmscoreversioncheck.IconCompatParcelizer;
                                if (createdatasource8 == null) {
                                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                } else {
                                    createdatasource = createdatasource8;
                                }
                                createdatasource.MediaBrowserCompatSearchResultReceiver.setText(setshouldskipgmscoreversioncheck.getString(R.string.magic_module_module_name, listWrite.get(1)));
                            } else {
                                createDataSource createdatasource9 = setshouldskipgmscoreversioncheck.IconCompatParcelizer;
                                if (createdatasource9 == null) {
                                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                } else {
                                    createdatasource = createdatasource9;
                                }
                                createdatasource.MediaBrowserCompatSearchResultReceiver.setText("");
                            }
                        } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(abstractC0287zzf, AbstractC0287zzf.AudioAttributesImplApi21Parcelizer.INSTANCE)) {
                            setshouldskipgmscoreversioncheck.MediaMetadataCompat();
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
            return setShouldSkipGmsCoreVersionCheck.this.new read(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MediaMetadataCompat() {
        getAutofillClient.Companion companion = getAutofillClient.INSTANCE;
        String string = getString(R.string.cm_dialog_exit_title);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        String string2 = getString(R.string.no_let_me_continue);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
        String string3 = getString(R.string.cm_dialog_exit_yes);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string3, "");
        getAutofillClient getautofillclientAudioAttributesCompatParcelizer = getAutofillClient.Companion.AudioAttributesCompatParcelizer(string, null, string2, string3, 0, null, false, false, null, 498);
        FragmentManager childFragmentManager = getChildFragmentManager();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(childFragmentManager, "");
        getBrowserClient.write(getautofillclientAudioAttributesCompatParcelizer, childFragmentManager, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.zzc
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return setShouldSkipGmsCoreVersionCheck.MediaDescriptionCompat();
            }
        }, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.AdvertisingIdClientInfo
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return setShouldSkipGmsCoreVersionCheck.AudioAttributesImplBaseParcelizer(this.IconCompatParcelizer);
            }
        });
        AudioAttributesCompatParcelizer().read(AbstractC0287zzf.RemoteActionCompatParcelizer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplBaseParcelizer(setShouldSkipGmsCoreVersionCheck setshouldskipgmscoreversioncheck) {
        maybeGetTypeVariable activity = setshouldskipgmscoreversioncheck.getActivity();
        if (activity != null) {
            activity.finish();
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaDescriptionCompat() {
        return getShowPopup.INSTANCE;
    }

    private final void AudioAttributesImplApi21Parcelizer() {
        createDataSource createdatasource = this.IconCompatParcelizer;
        createDataSource createdatasource2 = null;
        if (createdatasource == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            createdatasource = null;
        }
        createdatasource.write.setOnClickListener(new View.OnClickListener() { // from class: o.finalize
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                setShouldSkipGmsCoreVersionCheck.MediaBrowserCompatItemReceiver(this.RemoteActionCompatParcelizer);
            }
        });
        createDataSource createdatasource3 = this.IconCompatParcelizer;
        if (createdatasource3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            createdatasource3 = null;
        }
        createdatasource3.RatingCompat.setOnClickListener(new View.OnClickListener() { // from class: o.zze
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                setShouldSkipGmsCoreVersionCheck.MediaBrowserCompatCustomActionResultReceiver(this.read);
            }
        });
        getChildFragmentManager().IconCompatParcelizer("requestKey", this, new _addFields() { // from class: o.zza
            @Override // kotlin._addFields
            public final void AudioAttributesCompatParcelizer(String str, Bundle bundle) {
                setShouldSkipGmsCoreVersionCheck.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, str, bundle);
            }
        });
        createDataSource createdatasource4 = this.IconCompatParcelizer;
        if (createdatasource4 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            createdatasource2 = createdatasource4;
        }
        createdatasource2.MediaBrowserCompatMediaItem.setOnMenuItemClickListener(new Toolbar.IconCompatParcelizer() { // from class: o.zzb
            @Override // androidx.appcompat.widget.Toolbar.IconCompatParcelizer
            public final boolean read(MenuItem menuItem) {
                return setShouldSkipGmsCoreVersionCheck.write(this.IconCompatParcelizer, menuItem);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MediaBrowserCompatItemReceiver(setShouldSkipGmsCoreVersionCheck setshouldskipgmscoreversioncheck) {
        CustomModuleCreationViewModel customModuleCreationViewModelAudioAttributesCompatParcelizer = setshouldskipgmscoreversioncheck.AudioAttributesCompatParcelizer();
        String lowerCase = "CM_BANNER".toLowerCase(Locale.ROOT);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase, "");
        customModuleCreationViewModelAudioAttributesCompatParcelizer.read(new AbstractC0287zzf.AudioAttributesCompatParcelizer(lowerCase));
        setshouldskipgmscoreversioncheck.AudioAttributesImplApi26Parcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MediaBrowserCompatCustomActionResultReceiver(setShouldSkipGmsCoreVersionCheck setshouldskipgmscoreversioncheck) {
        CustomModuleCreationViewModel customModuleCreationViewModelAudioAttributesCompatParcelizer = setshouldskipgmscoreversioncheck.AudioAttributesCompatParcelizer();
        String lowerCase = "CM_CARD".toLowerCase(Locale.ROOT);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase, "");
        customModuleCreationViewModelAudioAttributesCompatParcelizer.read(new AbstractC0287zzf.AudioAttributesCompatParcelizer(lowerCase));
        setshouldskipgmscoreversioncheck.AudioAttributesImplApi26Parcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IconCompatParcelizer(setShouldSkipGmsCoreVersionCheck setshouldskipgmscoreversioncheck, String str, Bundle bundle) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(bundle, "");
        boolean z = bundle.getBoolean("isNext");
        setshouldskipgmscoreversioncheck.AudioAttributesCompatParcelizer().read(bundle.getInt("currentFrag"));
        setshouldskipgmscoreversioncheck.read(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean write(setShouldSkipGmsCoreVersionCheck setshouldskipgmscoreversioncheck, MenuItem menuItem) {
        Integer numValueOf = menuItem != null ? Integer.valueOf(menuItem.getItemId()) : null;
        if (numValueOf == null || numValueOf.intValue() != R.id.closeFile) {
            return true;
        }
        setshouldskipgmscoreversioncheck.AudioAttributesCompatParcelizer().read(AbstractC0287zzf.IconCompatParcelizer.INSTANCE);
        return true;
    }

    private final void AudioAttributesImplApi26Parcelizer() {
        zaac.Companion companion = zaac.INSTANCE;
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        startActivityForResult(zaac.Companion.RemoteActionCompatParcelizer(contextRequireContext, false), 100);
    }

    private final void read(boolean p0) {
        if (p0) {
            if (AudioAttributesCompatParcelizer().getMediaBrowserCompatCustomActionResultReceiver() == 3) {
                if (!getTrackName.write(requireContext())) {
                    String string = getString(R.string.app_error_no_internet);
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
                    CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer(this, string, 0);
                } else {
                    AudioAttributesCompatParcelizer().read(AbstractC0287zzf.write.INSTANCE);
                    AuthorizationRequestBuilder.Companion companion = AuthorizationRequestBuilder.INSTANCE;
                    Context contextRequireContext = requireContext();
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
                    startActivity(AuthorizationRequestBuilder.Companion.AudioAttributesCompatParcelizer(contextRequireContext, AudioAttributesCompatParcelizer().AudioAttributesImplBaseParcelizer().IconCompatParcelizer(), null));
                    requireActivity().finish();
                }
            } else {
                CustomModuleCreationViewModel customModuleCreationViewModelAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
                customModuleCreationViewModelAudioAttributesCompatParcelizer.read(customModuleCreationViewModelAudioAttributesCompatParcelizer.getMediaBrowserCompatCustomActionResultReceiver() + 1);
                read(AudioAttributesCompatParcelizer().getMediaBrowserCompatCustomActionResultReceiver());
            }
        } else {
            AudioAttributesCompatParcelizer().read(r3.getMediaBrowserCompatCustomActionResultReceiver() - 1);
            getChildFragmentManager().onPrepareFromUri();
        }
        RatingCompat();
    }

    private final void read(int p0) {
        if (p0 == 0) {
            setFlexDirection.IconCompatParcelizer iconCompatParcelizer = setFlexDirection.RemoteActionCompatParcelizer;
            CmcdConfigurationRequestConfig.RemoteActionCompatParcelizer(this, R.id.cmFrameLayout, setFlexDirection.IconCompatParcelizer.read());
        } else if (p0 == 1) {
            setAccountName.Companion companion = setAccountName.INSTANCE;
            CmcdConfigurationRequestConfig.RemoteActionCompatParcelizer(this, R.id.cmFrameLayout, setAccountName.Companion.read());
        } else if (p0 == 2) {
            clearToken.Companion companion2 = clearToken.INSTANCE;
            CmcdConfigurationRequestConfig.RemoteActionCompatParcelizer(this, R.id.cmFrameLayout, clearToken.Companion.RemoteActionCompatParcelizer());
        } else if (p0 == 3) {
            AccountChangeEvent.Companion companion3 = AccountChangeEvent.INSTANCE;
            CmcdConfigurationRequestConfig.RemoteActionCompatParcelizer(this, R.id.cmFrameLayout, AccountChangeEvent.Companion.IconCompatParcelizer());
        }
        MediaBrowserCompatSearchResultReceiver();
        AudioAttributesCompatParcelizer().read(new AbstractC0287zzf.MediaBrowserCompatItemReceiver(p0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void RatingCompat() {
        MediaBrowserCompatSearchResultReceiver();
        createDataSource createdatasource = this.IconCompatParcelizer;
        if (createdatasource == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            createdatasource = null;
        }
        int i = 0;
        createdatasource.AudioAttributesCompatParcelizer.setSelected(false);
        createDataSource createdatasource2 = this.IconCompatParcelizer;
        if (createdatasource2 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            createdatasource2 = null;
        }
        createdatasource2.read.setSelected(false);
        createDataSource createdatasource3 = this.IconCompatParcelizer;
        if (createdatasource3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            createdatasource3 = null;
        }
        createdatasource3.AudioAttributesImplApi21Parcelizer.setSelected(false);
        createDataSource createdatasource4 = this.IconCompatParcelizer;
        if (createdatasource4 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            createdatasource4 = null;
        }
        createdatasource4.MediaBrowserCompatCustomActionResultReceiver.setSelected(false);
        int mediaBrowserCompatCustomActionResultReceiver = AudioAttributesCompatParcelizer().getMediaBrowserCompatCustomActionResultReceiver();
        if (mediaBrowserCompatCustomActionResultReceiver < 0) {
            return;
        }
        while (true) {
            createDataSource createdatasource5 = this.IconCompatParcelizer;
            if (createdatasource5 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                createdatasource5 = null;
            }
            createdatasource5.AudioAttributesImplApi26Parcelizer.getChildAt(i).setSelected(true);
            if (i == mediaBrowserCompatCustomActionResultReceiver) {
                return;
            } else {
                i++;
            }
        }
    }

    private final void MediaBrowserCompatSearchResultReceiver() {
        int i = AudioAttributesCompatParcelizer().getMediaBrowserCompatCustomActionResultReceiver() == 0 ? R.attr.colorSurface : R.attr.backgroundColor;
        createDataSource createdatasource = this.IconCompatParcelizer;
        if (createdatasource == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            createdatasource = null;
        }
        ConstraintLayout constraintLayout = createdatasource.IconCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout, "");
        PlayerControlViewExternalSyntheticLambda1.IconCompatParcelizer(constraintLayout, i);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int p0, int p1, Intent p2) {
        super.onActivityResult(p0, p1, p2);
        AudioAttributesCompatParcelizer().read(AbstractC0287zzf.AudioAttributesImplBaseParcelizer.INSTANCE);
    }

    /* JADX INFO: renamed from: o.setShouldSkipGmsCoreVersionCheck$RemoteActionCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/setShouldSkipGmsCoreVersionCheck$RemoteActionCompatParcelizer;", "", "<init>", "()V", "Lo/WorkAccountClient;", "p0", "Landroidx/fragment/app/Fragment;", "IconCompatParcelizer", "(Lo/WorkAccountClient;)Landroidx/fragment/app/Fragment;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static Fragment IconCompatParcelizer(WorkAccountClient p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            setShouldSkipGmsCoreVersionCheck setshouldskipgmscoreversioncheck = new setShouldSkipGmsCoreVersionCheck();
            setshouldskipgmscoreversioncheck.setArguments(p0.RemoteActionCompatParcelizer());
            return setshouldskipgmscoreversioncheck;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
