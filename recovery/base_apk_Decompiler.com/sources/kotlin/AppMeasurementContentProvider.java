package kotlin;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.charts.RadarChart;
import com.google.android.material.appbar.AppBarLayout;
import com.marrow.R;
import com.marrow.ui.activities.plan.PlanActivity;
import com.marrow2.ui.test.analytics.TestAnalyticsViewModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import kotlin.AppMeasurementSdkEventInterceptor;
import kotlin.Metadata;
import kotlin.VisibilityChecker;
import kotlin.getAutofillClient;
import kotlin.onOpen;
import kotlin.onPostExecute;
import kotlin.postKeyRequest;
import kotlin.setExpandedTitleTextSize;
import kotlin.setForceApplySystemWindowInsetTop;
import kotlin.withFieldVisibility;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000 .2\u00020\u0001:\u0001.B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u0003J!\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0003J\u0017\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0013\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00192\b\u0010\u0007\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001c\u0010\u0003J\u000f\u0010\u001d\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001d\u0010\u0003J\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\u0013\u0010\u001fJ\u001f\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020 H\u0002¢\u0006\u0004\b\u0013\u0010!J\u000f\u0010\"\u001a\u00020\rH\u0002¢\u0006\u0004\b\"\u0010\u0003J-\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020#2\u0006\u0010\u0007\u001a\u00020#2\u0006\u0010\t\u001a\u00020$2\u0006\u0010%\u001a\u00020#¢\u0006\u0004\b\u0015\u0010&J\u0017\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020'H\u0002¢\u0006\u0004\b\u0015\u0010(R\u001b\u0010\u0011\u001a\u00020)8CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010*\u001a\u0004\b\u0015\u0010+R\u0018\u0010.\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010-R\u0014\u0010\u0015\u001a\u00020,8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010/R\u0016\u0010\u001a\u001a\u0002008\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0015\u00101R\u0016\u0010\u0013\u001a\u0002028\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u001c\u00103R\u0016\u00106\u001a\u0002048\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0011\u00105R\u0014\u0010\"\u001a\u0002078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b6\u00108"}, d2 = {"Lo/AppMeasurementContentProvider;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "onDestroyView", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "RemoteActionCompatParcelizer", "AudioAttributesImplApi21Parcelizer", "read", "Lo/ProviderInstallerProviderInstallListener;", "AudioAttributesCompatParcelizer", "(Lo/ProviderInstallerProviderInstallListener;)V", "", "(J)V", "", "write", "(Ljava/lang/String;Ljava/lang/String;)V", "MediaBrowserCompatItemReceiver", "AudioAttributesImplApi26Parcelizer", "Lo/installIfNeededAsync;", "(Lo/installIfNeededAsync;)V", "Lo/getMediaMimeType;", "(Ljava/lang/String;Lo/getMediaMimeType;)V", "MediaBrowserCompatCustomActionResultReceiver", "", "", "p3", "(IIZI)V", "Lo/ProviderInstaller;", "(Lo/ProviderInstaller;)V", "Lcom/marrow2/ui/test/analytics/TestAnalyticsViewModel;", "Lo/RenewEligible;", "()Lcom/marrow2/ui/test/analytics/TestAnalyticsViewModel;", "Lo/HlsMediaPeriod;", "Lo/HlsMediaPeriod;", "IconCompatParcelizer", "()Lo/HlsMediaPeriod;", "Lo/AppMeasurementSdkEventInterceptor;", "Lo/AppMeasurementSdkEventInterceptor;", "Lo/setContentScrimResource;", "Lo/setContentScrimResource;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "AudioAttributesImplBaseParcelizer", "Lo/AppMeasurementContentProvider$RatingCompat;", "Lo/AppMeasurementContentProvider$RatingCompat;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AppMeasurementContentProvider extends VisibleRegion {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private AppMeasurementSdkEventInterceptor write;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final RatingCompat MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private setContentScrimResource read;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private LinearLayoutManager AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private HlsMediaPeriod IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final RenewEligible RemoteActionCompatParcelizer;

    public AppMeasurementContentProvider() {
        AppMeasurementContentProvider appMeasurementContentProvider = this;
        RenewEligible renewEligibleWrite = getRenewExpiresOn.write(RenewEligibleCompanion.read, new AnonymousClass1(new AnonymousClass4(appMeasurementContentProvider)));
        this.RemoteActionCompatParcelizer = _resolveFieldVsGetter.RemoteActionCompatParcelizer(toMagicModuleMetaDataUcModel.write(TestAnalyticsViewModel.class), new AnonymousClass5(renewEligibleWrite), new AnonymousClass2(renewEligibleWrite), new AnonymousClass3(appMeasurementContentProvider, renewEligibleWrite));
        this.MediaBrowserCompatCustomActionResultReceiver = new RatingCompat();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TestAnalyticsViewModel AudioAttributesCompatParcelizer() {
        return (TestAnalyticsViewModel) this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HlsMediaPeriod write() {
        HlsMediaPeriod hlsMediaPeriod = this.IconCompatParcelizer;
        toMagicModuleMetaRepoModel.write(hlsMediaPeriod);
        return hlsMediaPeriod;
    }

    public static final class RatingCompat extends RecyclerView.MediaBrowserCompatSearchResultReceiver {
        RatingCompat() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatSearchResultReceiver
        public final void AudioAttributesCompatParcelizer(RecyclerView recyclerView, int i) {
            toMagicModuleMetaRepoModel.write(recyclerView, "");
            super.AudioAttributesCompatParcelizer(recyclerView, i);
            RecyclerView.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiverAudioAttributesImplApi21Parcelizer = recyclerView.AudioAttributesImplApi21Parcelizer();
            toMagicModuleMetaRepoModel.read(mediaBrowserCompatItemReceiverAudioAttributesImplApi21Parcelizer, "");
            int iMediaBrowserCompatMediaItem = ((LinearLayoutManager) mediaBrowserCompatItemReceiverAudioAttributesImplApi21Parcelizer).MediaBrowserCompatMediaItem();
            ProviderInstaller providerInstallerRemoteActionCompatParcelizer = AppMeasurementContentProvider.this.AudioAttributesCompatParcelizer().IconCompatParcelizer().IconCompatParcelizer().RemoteActionCompatParcelizer();
            if (providerInstallerRemoteActionCompatParcelizer != null) {
                AppMeasurementContentProvider.this.AudioAttributesCompatParcelizer(i, iMediaBrowserCompatMediaItem, providerInstallerRemoteActionCompatParcelizer.write(), providerInstallerRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer());
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.IconCompatParcelizer = HlsMediaPeriod.AudioAttributesCompatParcelizer(p0, p1);
        CoordinatorLayout coordinatorLayoutIconCompatParcelizer = write().IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(coordinatorLayoutIconCompatParcelizer, "");
        return coordinatorLayoutIconCompatParcelizer;
    }

    /* JADX INFO: renamed from: o.AppMeasurementContentProvider$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Landroidx/fragment/app/Fragment;", "IconCompatParcelizer", "()Landroidx/fragment/app/Fragment;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass4 extends MagicModuleUseCase implements getCreatedOnDateMs<Fragment> {
        private /* synthetic */ Fragment $AudioAttributesCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.$AudioAttributesCompatParcelizer;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(Fragment fragment) {
            super(0);
            this.$AudioAttributesCompatParcelizer = fragment;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.IconCompatParcelizer = null;
    }

    /* JADX INFO: renamed from: o.AppMeasurementContentProvider$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/TypeResolutionContext;", "read", "()Lo/TypeResolutionContext;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<TypeResolutionContext> {
        private /* synthetic */ getCreatedOnDateMs $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final TypeResolutionContext invoke() {
            return (TypeResolutionContext) this.$write.invoke();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(getCreatedOnDateMs getcreatedondatems) {
            super(0);
            this.$write = getcreatedondatems;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View p0, Bundle p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onViewCreated(p0, p1);
        RemoteActionCompatParcelizer();
        isSeekPending isseekpendingIconCompatParcelizer = RtspHeadersBuilder.IconCompatParcelizer();
        String name = getClass().getName();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(name, "");
        isseekpendingIconCompatParcelizer.RemoteActionCompatParcelizer("testAnalytics", name, IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new updateLoadingFinished[]{updateLoadingFinished.AudioAttributesCompatParcelizer, updateLoadingFinished.RemoteActionCompatParcelizer}));
        read();
        AudioAttributesImplApi26Parcelizer();
        MediaBrowserCompatItemReceiver();
        AudioAttributesImplApi21Parcelizer();
    }

    /* JADX INFO: renamed from: o.AppMeasurementContentProvider$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "write", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        public static int RemoteActionCompatParcelizer;
        public static int write;
        private /* synthetic */ RenewEligible $AudioAttributesCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return _resolveFieldVsGetter.write(this.$AudioAttributesCompatParcelizer).getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(RenewEligible renewEligible) {
            super(0);
            this.$AudioAttributesCompatParcelizer = renewEligible;
        }

        public static int RemoteActionCompatParcelizer() {
            int i = write;
            int i2 = i % 9498938;
            write = i + 1;
            if (i2 != 0) {
                return RemoteActionCompatParcelizer;
            }
            int iNextInt = new Random().nextInt();
            RemoteActionCompatParcelizer = iNextInt;
            return iNextInt;
        }
    }

    /* JADX INFO: renamed from: o.AppMeasurementContentProvider$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "read", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass2 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ getCreatedOnDateMs $IconCompatParcelizer = null;
        private /* synthetic */ RenewEligible $RemoteActionCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final withFieldVisibility invoke() {
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$RemoteActionCompatParcelizer);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return anyexplicitswithoutignoral != null ? anyexplicitswithoutignoral.getDefaultViewModelCreationExtras() : withFieldVisibility.write.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(RenewEligible renewEligible) {
            super(0);
            this.$RemoteActionCompatParcelizer = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.AppMeasurementContentProvider$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "RemoteActionCompatParcelizer", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ Fragment $RemoteActionCompatParcelizer;
        private /* synthetic */ RenewEligible $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            VisibilityChecker.RemoteActionCompatParcelizer defaultViewModelProviderFactory;
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$write);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return (anyexplicitswithoutignoral == null || (defaultViewModelProviderFactory = anyexplicitswithoutignoral.getDefaultViewModelProviderFactory()) == null) ? this.$RemoteActionCompatParcelizer.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Fragment fragment, RenewEligible renewEligible) {
            super(0);
            this.$RemoteActionCompatParcelizer = fragment;
            this.$write = renewEligible;
        }
    }

    private final void RemoteActionCompatParcelizer() {
        AppBarLayout appBarLayout = write().write;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(appBarLayout, "");
        getHttpMethodString.read((View) appBarLayout, true, false, true, true, 0, 50);
        NestedScrollView nestedScrollView = write().AudioAttributesImplBaseParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(nestedScrollView, "");
        getHttpMethodString.read((View) nestedScrollView, false, true, true, true, 0, 49);
        Button button = write().read;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(button, "");
        getHttpMethodString.RemoteActionCompatParcelizer(button, false, true, true, true, 0, 49);
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<Boolean> setupdatedstatusMediaDescriptionCompat = AppMeasurementContentProvider.this.AudioAttributesCompatParcelizer().MediaDescriptionCompat();
                final AppMeasurementContentProvider appMeasurementContentProvider = AppMeasurementContentProvider.this;
                this.AudioAttributesCompatParcelizer = 1;
                if (setupdatedstatusMediaDescriptionCompat.write(new getValidationToken() { // from class: o.AppMeasurementContentProvider.RemoteActionCompatParcelizer.2
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return AudioAttributesCompatParcelizer(((Boolean) obj2).booleanValue());
                    }

                    private Object AudioAttributesCompatParcelizer(boolean z) {
                        ProgressBar progressBar = appMeasurementContentProvider.write().AudioAttributesCompatParcelizer;
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar, "");
                        ProgressBar progressBar2 = progressBar;
                        if (z) {
                            bytesRead.AudioAttributesImplApi21Parcelizer(progressBar2);
                        } else {
                            bytesRead.MediaBrowserCompatCustomActionResultReceiver(progressBar2);
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
            return AppMeasurementContentProvider.this.new RemoteActionCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void AudioAttributesImplApi21Parcelizer() {
        AppMeasurementContentProvider appMeasurementContentProvider = this;
        setBitrateKbps.read(appMeasurementContentProvider, new RemoteActionCompatParcelizer(null));
        setBitrateKbps.read(appMeasurementContentProvider, new AudioAttributesCompatParcelizer(null));
        setBitrateKbps.read(appMeasurementContentProvider, new AudioAttributesImplApi26Parcelizer(null));
        setBitrateKbps.read(appMeasurementContentProvider, new MediaBrowserCompatItemReceiver(null));
        setBitrateKbps.read(appMeasurementContentProvider, new AudioAttributesImplApi21Parcelizer(null));
        setBitrateKbps.read(appMeasurementContentProvider, new AudioAttributesImplBaseParcelizer(null));
        setBitrateKbps.RemoteActionCompatParcelizer(appMeasurementContentProvider, new MediaBrowserCompatCustomActionResultReceiver(null));
        setBitrateKbps.RemoteActionCompatParcelizer(appMeasurementContentProvider, new MediaBrowserCompatSearchResultReceiver(null));
        setBitrateKbps.read(appMeasurementContentProvider, new MediaBrowserCompatMediaItem(null));
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<String> setupdatedstatusAudioAttributesImplApi21Parcelizer = AppMeasurementContentProvider.this.AudioAttributesCompatParcelizer().AudioAttributesImplApi21Parcelizer();
                final AppMeasurementContentProvider appMeasurementContentProvider = AppMeasurementContentProvider.this;
                this.RemoteActionCompatParcelizer = 1;
                if (setupdatedstatusAudioAttributesImplApi21Parcelizer.write(new getValidationToken() { // from class: o.AppMeasurementContentProvider.AudioAttributesCompatParcelizer.3
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return read((String) obj2);
                    }

                    private Object read(String str) {
                        appMeasurementContentProvider.write().MediaBrowserCompatCustomActionResultReceiver.setTitle(str);
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
            return AppMeasurementContentProvider.this.new AudioAttributesCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class AudioAttributesImplApi26Parcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<String> setupdatedstatus = AppMeasurementContentProvider.this.AudioAttributesCompatParcelizer().read();
                final AppMeasurementContentProvider appMeasurementContentProvider = AppMeasurementContentProvider.this;
                this.IconCompatParcelizer = 1;
                if (setupdatedstatus.write(new getValidationToken() { // from class: o.AppMeasurementContentProvider.AudioAttributesImplApi26Parcelizer.4
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return write((String) obj2);
                    }

                    private Object write(String str) {
                        String str2 = str;
                        if (str2.length() > 0) {
                            Toast.makeText(appMeasurementContentProvider.requireContext(), str2, 0).show();
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

        AudioAttributesImplApi26Parcelizer(SampleVideos<? super AudioAttributesImplApi26Parcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return AppMeasurementContentProvider.this.new AudioAttributesImplApi26Parcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplApi26Parcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class MediaBrowserCompatItemReceiver extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<ProviderInstallerProviderInstallListener> setupdatedstatusMediaBrowserCompatCustomActionResultReceiver = AppMeasurementContentProvider.this.AudioAttributesCompatParcelizer().MediaBrowserCompatCustomActionResultReceiver();
                final AppMeasurementContentProvider appMeasurementContentProvider = AppMeasurementContentProvider.this;
                this.AudioAttributesCompatParcelizer = 1;
                if (setupdatedstatusMediaBrowserCompatCustomActionResultReceiver.write(new getValidationToken() { // from class: o.AppMeasurementContentProvider.MediaBrowserCompatItemReceiver.2
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return RemoteActionCompatParcelizer((ProviderInstallerProviderInstallListener) obj2);
                    }

                    private Object RemoteActionCompatParcelizer(ProviderInstallerProviderInstallListener providerInstallerProviderInstallListener) {
                        appMeasurementContentProvider.AudioAttributesCompatParcelizer(providerInstallerProviderInstallListener);
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

        MediaBrowserCompatItemReceiver(SampleVideos<? super MediaBrowserCompatItemReceiver> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return AppMeasurementContentProvider.this.new MediaBrowserCompatItemReceiver(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatItemReceiver) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class AudioAttributesImplApi21Parcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<installIfNeededAsync> setupdatedstatusAudioAttributesCompatParcelizer = AppMeasurementContentProvider.this.AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer();
                final AppMeasurementContentProvider appMeasurementContentProvider = AppMeasurementContentProvider.this;
                this.RemoteActionCompatParcelizer = 1;
                if (setupdatedstatusAudioAttributesCompatParcelizer.write(new getValidationToken() { // from class: o.AppMeasurementContentProvider.AudioAttributesImplApi21Parcelizer.4
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return RemoteActionCompatParcelizer((installIfNeededAsync) obj2);
                    }

                    private Object RemoteActionCompatParcelizer(installIfNeededAsync installifneededasync) {
                        if (installifneededasync.getRemoteActionCompatParcelizer() > 0) {
                            appMeasurementContentProvider.read(installifneededasync);
                        } else {
                            TextView textView = appMeasurementContentProvider.write().AudioAttributesImplApi21Parcelizer;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
                            bytesRead.MediaBrowserCompatCustomActionResultReceiver(textView);
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

        AudioAttributesImplApi21Parcelizer(SampleVideos<? super AudioAttributesImplApi21Parcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return AppMeasurementContentProvider.this.new AudioAttributesImplApi21Parcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplApi21Parcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class AudioAttributesImplBaseParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<onOpen> setupdatedstatusMediaBrowserCompatItemReceiver = AppMeasurementContentProvider.this.AudioAttributesCompatParcelizer().MediaBrowserCompatItemReceiver();
                final AppMeasurementContentProvider appMeasurementContentProvider = AppMeasurementContentProvider.this;
                this.AudioAttributesCompatParcelizer = 1;
                if (setupdatedstatusMediaBrowserCompatItemReceiver.write(new getValidationToken() { // from class: o.AppMeasurementContentProvider.AudioAttributesImplBaseParcelizer.2
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return write((onOpen) obj2);
                    }

                    private Object write(onOpen onopen) {
                        if (onopen instanceof onOpen.RemoteActionCompatParcelizer) {
                            onOpen.RemoteActionCompatParcelizer remoteActionCompatParcelizer = (onOpen.RemoteActionCompatParcelizer) onopen;
                            appMeasurementContentProvider.read(remoteActionCompatParcelizer.IconCompatParcelizer(), remoteActionCompatParcelizer.AudioAttributesCompatParcelizer());
                        } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(onopen, onOpen.AudioAttributesCompatParcelizer.INSTANCE)) {
                            appMeasurementContentProvider.MediaBrowserCompatCustomActionResultReceiver();
                        } else if (onopen instanceof onOpen.read) {
                            appMeasurementContentProvider.read(((onOpen.read) onopen).write());
                        } else {
                            toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(onopen, onOpen.write.INSTANCE);
                        }
                        appMeasurementContentProvider.AudioAttributesCompatParcelizer().write(onPostExecute.RemoteActionCompatParcelizer.INSTANCE);
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

        AudioAttributesImplBaseParcelizer(SampleVideos<? super AudioAttributesImplBaseParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return AppMeasurementContentProvider.this.new AudioAttributesImplBaseParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplBaseParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class MediaBrowserCompatCustomActionResultReceiver extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<List<setExpandedTitleTextSize>> setupdatedstatusAudioAttributesImplApi26Parcelizer = AppMeasurementContentProvider.this.AudioAttributesCompatParcelizer().AudioAttributesImplApi26Parcelizer();
                final AppMeasurementContentProvider appMeasurementContentProvider = AppMeasurementContentProvider.this;
                this.RemoteActionCompatParcelizer = 1;
                if (setupdatedstatusAudioAttributesImplApi26Parcelizer.write(new getValidationToken() { // from class: o.AppMeasurementContentProvider.MediaBrowserCompatCustomActionResultReceiver.4
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return write((List) obj2);
                    }

                    private Object write(List<? extends setExpandedTitleTextSize> list) {
                        setContentScrimResource setcontentscrimresource = appMeasurementContentProvider.read;
                        if (setcontentscrimresource == null) {
                            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            setcontentscrimresource = null;
                        }
                        setcontentscrimresource.read(list);
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
            return AppMeasurementContentProvider.this.new MediaBrowserCompatCustomActionResultReceiver(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatCustomActionResultReceiver) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class MediaBrowserCompatSearchResultReceiver extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<setExpandedTitleMarginStart> setupdatedstatusAudioAttributesImplBaseParcelizer = AppMeasurementContentProvider.this.AudioAttributesCompatParcelizer().AudioAttributesImplBaseParcelizer();
                final AppMeasurementContentProvider appMeasurementContentProvider = AppMeasurementContentProvider.this;
                this.IconCompatParcelizer = 1;
                if (setupdatedstatusAudioAttributesImplBaseParcelizer.write(new getValidationToken() { // from class: o.AppMeasurementContentProvider.MediaBrowserCompatSearchResultReceiver.5
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return AudioAttributesCompatParcelizer((setExpandedTitleMarginStart) obj2);
                    }

                    private Object AudioAttributesCompatParcelizer(setExpandedTitleMarginStart setexpandedtitlemarginstart) {
                        setContentScrimResource setcontentscrimresource = appMeasurementContentProvider.read;
                        if (setcontentscrimresource == null) {
                            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            setcontentscrimresource = null;
                        }
                        setcontentscrimresource.AudioAttributesCompatParcelizer(setexpandedtitlemarginstart.RemoteActionCompatParcelizer());
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

        MediaBrowserCompatSearchResultReceiver(SampleVideos<? super MediaBrowserCompatSearchResultReceiver> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return AppMeasurementContentProvider.this.new MediaBrowserCompatSearchResultReceiver(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatSearchResultReceiver) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class MediaBrowserCompatMediaItem extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<DataSourceBitmapLoaderExternalSyntheticLambda0<ProviderInstaller>> setupdatedstatusIconCompatParcelizer = AppMeasurementContentProvider.this.AudioAttributesCompatParcelizer().IconCompatParcelizer();
                final AppMeasurementContentProvider appMeasurementContentProvider = AppMeasurementContentProvider.this;
                this.AudioAttributesCompatParcelizer = 1;
                if (setupdatedstatusIconCompatParcelizer.write(new getValidationToken() { // from class: o.AppMeasurementContentProvider.MediaBrowserCompatMediaItem.4
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return write((DataSourceBitmapLoaderExternalSyntheticLambda0) obj2);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    private Object write(DataSourceBitmapLoaderExternalSyntheticLambda0<ProviderInstaller> dataSourceBitmapLoaderExternalSyntheticLambda0) {
                        if (dataSourceBitmapLoaderExternalSyntheticLambda0 instanceof decodeBitmap) {
                            ProgressBar progressBar = appMeasurementContentProvider.write().AudioAttributesCompatParcelizer;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar, "");
                            bytesRead.AudioAttributesImplApi21Parcelizer(progressBar);
                            appMeasurementContentProvider.AudioAttributesCompatParcelizer((ProviderInstaller) ((decodeBitmap) dataSourceBitmapLoaderExternalSyntheticLambda0).RemoteActionCompatParcelizer());
                        } else if (dataSourceBitmapLoaderExternalSyntheticLambda0 instanceof setStreamingFormat) {
                            ProgressBar progressBar2 = appMeasurementContentProvider.write().AudioAttributesCompatParcelizer;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar2, "");
                            bytesRead.AudioAttributesImplApi21Parcelizer(progressBar2);
                        } else if (dataSourceBitmapLoaderExternalSyntheticLambda0 instanceof setTopBitrateKbps) {
                            ProgressBar progressBar3 = appMeasurementContentProvider.write().AudioAttributesCompatParcelizer;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar3, "");
                            bytesRead.MediaBrowserCompatCustomActionResultReceiver(progressBar3);
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

        MediaBrowserCompatMediaItem(SampleVideos<? super MediaBrowserCompatMediaItem> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return AppMeasurementContentProvider.this.new MediaBrowserCompatMediaItem(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatMediaItem) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void read() {
        HlsMediaPeriod hlsMediaPeriodWrite = write();
        boolean z = getResources().getBoolean(R.bool.is_tablet);
        hlsMediaPeriodWrite.AudioAttributesImplApi26Parcelizer.setRotationEnabled(false);
        hlsMediaPeriodWrite.AudioAttributesImplApi26Parcelizer.onPrepareFromUri().onPrepareFromUri();
        getError geterrorHandleMediaPlayPauseIfPendingOnHandler = hlsMediaPeriodWrite.AudioAttributesImplApi26Parcelizer.handleMediaPlayPauseIfPendingOnHandler();
        geterrorHandleMediaPlayPauseIfPendingOnHandler.write(Typeface.DEFAULT);
        geterrorHandleMediaPlayPauseIfPendingOnHandler.onPlayFromMediaId();
        geterrorHandleMediaPlayPauseIfPendingOnHandler.onPause();
        geterrorHandleMediaPlayPauseIfPendingOnHandler.onAddQueueItem();
        hasSessionId sessionImpl = hlsMediaPeriodWrite.AudioAttributesImplApi26Parcelizer.setSessionImpl();
        sessionImpl.write(Typeface.DEFAULT);
        sessionImpl.AudioAttributesCompatParcelizer(z ? 12.0f : 6.5f);
        sessionImpl.IconCompatParcelizer(_isNaN.getColor(requireContext(), R.color.steel_grey));
        sessionImpl.onSeekTo();
        sessionImpl.onRemoveQueueItemAt();
        postKeyRequest postkeyrequestOnSetRepeatMode = hlsMediaPeriodWrite.AudioAttributesImplApi26Parcelizer.onSetRepeatMode();
        postkeyrequestOnSetRepeatMode.AudioAttributesCompatParcelizer(postKeyRequest.write.BOTTOM);
        postkeyrequestOnSetRepeatMode.read(postKeyRequest.read.CENTER);
        postkeyrequestOnSetRepeatMode.write(postKeyRequest.IconCompatParcelizer.HORIZONTAL);
        postkeyrequestOnSetRepeatMode.onPlayFromMediaId();
        postkeyrequestOnSetRepeatMode.AudioAttributesCompatParcelizer(z ? 12.0f : 10.0f);
        postkeyrequestOnSetRepeatMode.onPlay();
        postkeyrequestOnSetRepeatMode.write(Typeface.DEFAULT);
        postkeyrequestOnSetRepeatMode.IconCompatParcelizer(_isNaN.getColor(requireContext(), R.color.slate));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AudioAttributesCompatParcelizer(ProviderInstallerProviderInstallListener p0) {
        int remoteActionCompatParcelizer = p0.getRemoteActionCompatParcelizer();
        if (remoteActionCompatParcelizer == -2) {
            write().RemoteActionCompatParcelizer.write.setText(getString(R.string.text_rank_list_unavailable));
        } else if (remoteActionCompatParcelizer == -1) {
            write().RemoteActionCompatParcelizer.write.setText(getString(R.string.f_test_score_result_on_date, loadBitmap.RemoteActionCompatParcelizer(p0.getAudioAttributesCompatParcelizer(), "dd MMM")));
        } else {
            write().RemoteActionCompatParcelizer.write.setText(String.valueOf(p0.getRemoteActionCompatParcelizer()));
        }
        getMediaPlaylistUrls getmediaplaylisturls = write().IconCompatParcelizer;
        write().RemoteActionCompatParcelizer.IconCompatParcelizer.setText(getString(R.string.f_test_rank_out_of, Integer.valueOf(p0.getRead())));
        getmediaplaylisturls.MediaBrowserCompatItemReceiver.setEnabled(p0.getAudioAttributesImplApi21Parcelizer());
        getmediaplaylisturls.MediaBrowserCompatMediaItem.setEnabled(p0.getMediaBrowserCompatItemReceiver());
        getmediaplaylisturls.AudioAttributesImplApi26Parcelizer.setEnabled(p0.getMediaBrowserCompatCustomActionResultReceiver());
        getmediaplaylisturls.IconCompatParcelizer.setText(String.valueOf(p0.getIconCompatParcelizer()));
        getmediaplaylisturls.MediaBrowserCompatCustomActionResultReceiver.setText(String.valueOf(p0.getWrite()));
        getmediaplaylisturls.AudioAttributesImplApi21Parcelizer.setText(String.valueOf(p0.getAudioAttributesImplBaseParcelizer()));
        final installIfNeeded installifneeded = new installIfNeeded(p0.getRatingCompat(), p0.getMediaDescriptionCompat(), p0.getOnCommand(), p0.getAudioAttributesCompatParcelizer());
        getmediaplaylisturls.MediaBrowserCompatItemReceiver.setOnClickListener(new View.OnClickListener() { // from class: o.AppMeasurementOnEventListener
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AppMeasurementContentProvider.read(this.IconCompatParcelizer, installifneeded);
            }
        });
        getmediaplaylisturls.MediaBrowserCompatMediaItem.setOnClickListener(new View.OnClickListener() { // from class: o.insert
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AppMeasurementContentProvider.write(this.read, installifneeded);
            }
        });
        getmediaplaylisturls.AudioAttributesImplApi26Parcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.query
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AppMeasurementContentProvider.MediaBrowserCompatItemReceiver(this.IconCompatParcelizer, installifneeded);
            }
        });
        if (p0.getAudioAttributesImplApi26Parcelizer() > 0) {
            getmediaplaylisturls.write.setProgress((int) ((p0.getIconCompatParcelizer() / p0.getAudioAttributesImplApi26Parcelizer()) * 100.0f), true);
            getmediaplaylisturls.RatingCompat.setProgress((int) ((p0.getWrite() / p0.getAudioAttributesImplApi26Parcelizer()) * 100.0f), true);
            getmediaplaylisturls.read.setProgress((int) ((p0.getAudioAttributesImplBaseParcelizer() / p0.getAudioAttributesImplApi26Parcelizer()) * 100.0f), true);
        }
        if (p0.getMediaBrowserCompatSearchResultReceiver() != 0.0d) {
            getmediaplaylisturls.AudioAttributesCompatParcelizer.setText(getString(R.string.f_test_result_percentile, Double.valueOf(p0.getMediaBrowserCompatSearchResultReceiver())));
        } else {
            getmediaplaylisturls.AudioAttributesCompatParcelizer.setText(getString(R.string.f_test_result_percentile_na));
        }
        getmediaplaylisturls.RemoteActionCompatParcelizer.setText(getAudioUsageForStreamType.IconCompatParcelizer(p0.getOnCustomAction(), p0.getMediaMetadataCompat()));
        getmediaplaylisturls.AudioAttributesImplBaseParcelizer.setText(getString(R.string.f_test_performance_score_out_of, Integer.valueOf(p0.getMediaBrowserCompatMediaItem())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void read(AppMeasurementContentProvider appMeasurementContentProvider, installIfNeeded installifneeded) {
        appMeasurementContentProvider.AudioAttributesCompatParcelizer().write(new onPostExecute.IconCompatParcelizer(installifneeded, getMediaMimeType.AudioAttributesImplApi26Parcelizer));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void write(AppMeasurementContentProvider appMeasurementContentProvider, installIfNeeded installifneeded) {
        appMeasurementContentProvider.AudioAttributesCompatParcelizer().write(new onPostExecute.IconCompatParcelizer(installifneeded, getMediaMimeType.MediaMetadataCompat));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MediaBrowserCompatItemReceiver(AppMeasurementContentProvider appMeasurementContentProvider, installIfNeeded installifneeded) {
        appMeasurementContentProvider.AudioAttributesCompatParcelizer().write(new onPostExecute.IconCompatParcelizer(installifneeded, getMediaMimeType.MediaBrowserCompatItemReceiver));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void read(long p0) {
        AppMeasurementContentProvider appMeasurementContentProvider = this;
        String string = getString(R.string.toast_rank_list_review_available_on, loadBitmap.RemoteActionCompatParcelizer(p0, "dd MMM"));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer(appMeasurementContentProvider, string, 0);
    }

    public final void write(String p0, String p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        setForceApplySystemWindowInsetTop.Companion companion = setForceApplySystemWindowInsetTop.INSTANCE;
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        startActivity(setForceApplySystemWindowInsetTop.Companion.AudioAttributesCompatParcelizer(contextRequireContext, new setStaticLayoutBuilderConfigurer(p0, true, false, false, null, p1, null, 92, null)));
    }

    public static final class write implements AppMeasurementSdkEventInterceptor.AudioAttributesCompatParcelizer {
        write() {
        }

        @Override // o.AppMeasurementSdkEventInterceptor.AudioAttributesCompatParcelizer
        public final void RemoteActionCompatParcelizer(String str, String str2, int i) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            AppMeasurementContentProvider.this.write(str2, str);
        }
    }

    private final void MediaBrowserCompatItemReceiver() {
        this.write = new AppMeasurementSdkEventInterceptor(new write());
        this.read = new setContentScrimResource(new read());
        getContext();
        this.AudioAttributesImplBaseParcelizer = new LinearLayoutManager();
        RecyclerView recyclerView = write().MediaBrowserCompatItemReceiver;
        LinearLayoutManager linearLayoutManager = this.AudioAttributesImplBaseParcelizer;
        setContentScrimResource setcontentscrimresource = null;
        if (linearLayoutManager == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            linearLayoutManager = null;
        }
        recyclerView.setLayoutManager(linearLayoutManager);
        setContentScrimResource setcontentscrimresource2 = this.read;
        if (setcontentscrimresource2 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            setcontentscrimresource = setcontentscrimresource2;
        }
        recyclerView.setAdapter(setcontentscrimresource);
    }

    public static final class read implements setCollapsedTitleTextSize {
        read() {
        }

        @Override // kotlin.setCollapsedTitleTextSize
        public final void write(int i, setExpandedTitleTextSize.IconCompatParcelizer iconCompatParcelizer) {
            toMagicModuleMetaRepoModel.write(iconCompatParcelizer, "");
        }
    }

    private final void AudioAttributesImplApi26Parcelizer() {
        Toolbar toolbar = write().MediaBrowserCompatCustomActionResultReceiver;
        toolbar.setNavigationIcon(_isNaN.getDrawable(requireContext(), R.drawable.ic_arrow_back));
        toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: o.AppMeasurementJobService
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AppMeasurementContentProvider.AudioAttributesImplApi21Parcelizer(this.write);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesImplApi21Parcelizer(AppMeasurementContentProvider appMeasurementContentProvider) {
        appMeasurementContentProvider.requireActivity().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void read(installIfNeededAsync p0) {
        TextView textView = write().AudioAttributesImplApi21Parcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
        bytesRead.AudioAttributesImplApi21Parcelizer(textView);
        RadarChart radarChart = write().AudioAttributesImplApi26Parcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(radarChart, "");
        bytesRead.AudioAttributesImplApi21Parcelizer(radarChart);
        TextView textView2 = write().MediaMetadataCompat;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView2, "");
        bytesRead.AudioAttributesImplApi21Parcelizer(textView2);
        List<String> listWrite = p0.write();
        int remoteActionCompatParcelizer = p0.getRemoteActionCompatParcelizer();
        String string = getString(R.string.text_analytics_minor_subjects_title);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        listWrite.add(remoteActionCompatParcelizer - 1, string);
        onReferenceCountIncremented onreferencecountincremented = new onReferenceCountIncremented(p0.read(), getString(R.string.text_test_analytics_graph_legend_current_user));
        onreferencecountincremented.read(_isNaN.getDrawable(requireContext(), R.drawable.bg_graph_gradient_my_score));
        onreferencecountincremented.write(getResources().getColor(R.color.current_user_percentile_graph));
        onreferencecountincremented.onSkipToNext();
        onreferencecountincremented.onRewind();
        onreferencecountincremented.MediaSessionCompatToken();
        onreferencecountincremented.read(postKeyRequest.RemoteActionCompatParcelizer.CIRCLE);
        onReferenceCountIncremented onreferencecountincremented2 = new onReferenceCountIncremented(p0.IconCompatParcelizer(), getString(R.string.text_test_analytics_graph_legend_topper));
        onreferencecountincremented2.read(_isNaN.getDrawable(requireContext(), R.drawable.bg_graph_gradient_topper));
        onreferencecountincremented2.write(_isNaN.getColor(requireContext(), R.color.topper_percentile_graph));
        onreferencecountincremented2.onSkipToNext();
        onreferencecountincremented2.onRewind();
        onreferencecountincremented2.MediaSessionCompatToken();
        onreferencecountincremented2.read(postKeyRequest.RemoteActionCompatParcelizer.CIRCLE);
        write().AudioAttributesImplApi26Parcelizer.setSessionImpl().AudioAttributesCompatParcelizer(new MediaDescriptionCompat(p0));
        ArrayList arrayList = new ArrayList();
        arrayList.add(onreferencecountincremented2);
        arrayList.add(onreferencecountincremented);
        RadarChart radarChart2 = write().AudioAttributesImplApi26Parcelizer;
        maybeRetryRequest mayberetryrequest = new maybeRetryRequest(arrayList);
        mayberetryrequest.RatingCompat();
        mayberetryrequest.MediaMetadataCompat();
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        mayberetryrequest.write(CmcdConfigurationRequestConfig.read(contextRequireContext, R.attr.colorOnBackground, R.color.white));
        radarChart2.setData(mayberetryrequest);
        write().AudioAttributesImplApi26Parcelizer.invalidate();
    }

    public static final class MediaDescriptionCompat extends DefaultDrmSessionResponseHandler {
        private /* synthetic */ installIfNeededAsync RemoteActionCompatParcelizer;

        MediaDescriptionCompat(installIfNeededAsync installifneededasync) {
            this.RemoteActionCompatParcelizer = installifneededasync;
        }

        @Override // kotlin.DefaultDrmSessionResponseHandler
        public final String read(float f) {
            return this.RemoteActionCompatParcelizer.write().get(((int) f) % this.RemoteActionCompatParcelizer.write().size());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void read(String p0, getMediaMimeType p1) {
        setForceApplySystemWindowInsetTop.Companion companion = setForceApplySystemWindowInsetTop.INSTANCE;
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        startActivity(setForceApplySystemWindowInsetTop.Companion.AudioAttributesCompatParcelizer(contextRequireContext, new setStaticLayoutBuilderConfigurer(p0, true, false, false, p1, null, null, 108, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MediaBrowserCompatCustomActionResultReceiver() {
        getAutofillClient.Companion companion = getAutofillClient.INSTANCE;
        String string = getString(R.string.text_pro_placeholder_dialog_msg, "test");
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        String string2 = getString(R.string.view_plans);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
        String string3 = getString(R.string.go_back);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string3, "");
        getAutofillClient getautofillclientAudioAttributesCompatParcelizer = getAutofillClient.Companion.AudioAttributesCompatParcelizer(null, string, string2, string3, 0, null, false, false, null, 497);
        FragmentManager childFragmentManager = getChildFragmentManager();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(childFragmentManager, "");
        getBrowserClient.IconCompatParcelizer(getautofillclientAudioAttributesCompatParcelizer, childFragmentManager, new getCreatedOnDateMs() { // from class: o.attachInfo
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return AppMeasurementContentProvider.AudioAttributesImplApi26Parcelizer(this.IconCompatParcelizer);
            }
        }, null, 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplApi26Parcelizer(AppMeasurementContentProvider appMeasurementContentProvider) {
        PlanActivity.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = PlanActivity.RemoteActionCompatParcelizer;
        Context contextRequireContext = appMeasurementContentProvider.requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        String lowerCase = "PRO_TEST_ACCESSED".toLowerCase(Locale.ROOT);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase, "");
        appMeasurementContentProvider.startActivity(PlanActivity.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(contextRequireContext, "Pro Subscription Dialog", lowerCase));
        return getShowPopup.INSTANCE;
    }

    public final void AudioAttributesCompatParcelizer(int p0, int p1, boolean p2, int p3) {
        if (p2) {
            Button button = write().read;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(button, "");
            bytesRead.MediaBrowserCompatCustomActionResultReceiver(button);
        } else {
            if (p0 == 0 && p1 < p3) {
                Button button2 = write().read;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(button2, "");
                bytesRead.AudioAttributesImplApi21Parcelizer(button2);
                isKeyAllowed.RemoteActionCompatParcelizer(write().read);
                return;
            }
            Button button3 = write().read;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(button3, "");
            bytesRead.MediaBrowserCompatCustomActionResultReceiver(button3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AudioAttributesCompatParcelizer(final ProviderInstaller p0) {
        ProgressBar progressBar = write().AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar, "");
        bytesRead.MediaBrowserCompatCustomActionResultReceiver(progressBar);
        if (p0.write()) {
            Button button = write().read;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(button, "");
            bytesRead.MediaBrowserCompatCustomActionResultReceiver(button);
        } else {
            Button button2 = write().read;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(button2, "");
            bytesRead.AudioAttributesImplApi21Parcelizer(button2);
        }
        write().read.setOnClickListener(new View.OnClickListener() { // from class: o.onUnbind
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AppMeasurementContentProvider.read(p0, this);
            }
        });
        write().MediaBrowserCompatItemReceiver.write(this.MediaBrowserCompatCustomActionResultReceiver);
        write().MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void read(final ProviderInstaller providerInstaller, final AppMeasurementContentProvider appMeasurementContentProvider) {
        int iAudioAttributesCompatParcelizer;
        if (providerInstaller.AudioAttributesCompatParcelizer() != -1) {
            appMeasurementContentProvider.write().write.setExpanded(false, true);
            int height = appMeasurementContentProvider.write().AudioAttributesImplApi26Parcelizer.getHeight();
            LinearLayoutManager linearLayoutManager = appMeasurementContentProvider.AudioAttributesImplBaseParcelizer;
            LinearLayoutManager linearLayoutManager2 = null;
            if (linearLayoutManager == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                linearLayoutManager = null;
            }
            View viewMediaBrowserCompatCustomActionResultReceiver = linearLayoutManager.MediaBrowserCompatCustomActionResultReceiver(providerInstaller.AudioAttributesCompatParcelizer());
            int height2 = viewMediaBrowserCompatCustomActionResultReceiver != null ? viewMediaBrowserCompatCustomActionResultReceiver.getHeight() : 0;
            if (providerInstaller.AudioAttributesCompatParcelizer() == 0) {
                iAudioAttributesCompatParcelizer = height + (height2 / 2) + 100;
            } else {
                int iAudioAttributesCompatParcelizer2 = providerInstaller.AudioAttributesCompatParcelizer();
                LinearLayoutManager linearLayoutManager3 = appMeasurementContentProvider.AudioAttributesImplBaseParcelizer;
                if (linearLayoutManager3 == null) {
                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                    linearLayoutManager3 = null;
                }
                if (iAudioAttributesCompatParcelizer2 == linearLayoutManager3.onPlay()) {
                    iAudioAttributesCompatParcelizer = height + appMeasurementContentProvider.write().MediaBrowserCompatItemReceiver.getHeight();
                } else {
                    LinearLayoutManager linearLayoutManager4 = appMeasurementContentProvider.AudioAttributesImplBaseParcelizer;
                    if (linearLayoutManager4 == null) {
                        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                    } else {
                        linearLayoutManager2 = linearLayoutManager4;
                    }
                    View viewMediaBrowserCompatCustomActionResultReceiver2 = linearLayoutManager2.MediaBrowserCompatCustomActionResultReceiver(providerInstaller.AudioAttributesCompatParcelizer() - 1);
                    iAudioAttributesCompatParcelizer = height + ((providerInstaller.AudioAttributesCompatParcelizer() - 1) * (viewMediaBrowserCompatCustomActionResultReceiver2 != null ? viewMediaBrowserCompatCustomActionResultReceiver2.getHeight() : 0)) + (height2 / 2);
                }
            }
            appMeasurementContentProvider.write().AudioAttributesImplBaseParcelizer.scrollTo(appMeasurementContentProvider.write().AudioAttributesImplBaseParcelizer.getScrollX(), iAudioAttributesCompatParcelizer);
            appMeasurementContentProvider.write().MediaBrowserCompatItemReceiver.post(new Runnable() { // from class: o.doGoAsync
                @Override // java.lang.Runnable
                public final void run() {
                    AppMeasurementContentProvider.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, providerInstaller);
                }
            });
            isKeyAllowed.IconCompatParcelizer(appMeasurementContentProvider.write().read);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IconCompatParcelizer(AppMeasurementContentProvider appMeasurementContentProvider, ProviderInstaller providerInstaller) {
        appMeasurementContentProvider.write().MediaBrowserCompatItemReceiver.AudioAttributesImplBaseParcelizer(providerInstaller.AudioAttributesCompatParcelizer());
    }

    /* JADX INFO: renamed from: o.AppMeasurementContentProvider$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/AppMeasurementContentProvider$IconCompatParcelizer;", "", "<init>", "()V", "Lo/onProviderInstallFailed;", "p0", "Lo/AppMeasurementContentProvider;", "AudioAttributesCompatParcelizer", "(Lo/onProviderInstallFailed;)Lo/AppMeasurementContentProvider;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static AppMeasurementContentProvider AudioAttributesCompatParcelizer(onProviderInstallFailed p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            AppMeasurementContentProvider appMeasurementContentProvider = new AppMeasurementContentProvider();
            appMeasurementContentProvider.setArguments(p0.AudioAttributesCompatParcelizer());
            return appMeasurementContentProvider;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
