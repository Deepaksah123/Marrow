package kotlin;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.data.models.user.NotesDispatchAddressRequestKt;
import com.marrow.designsystem.theme.AppTheme;
import com.marrow.designsystem.theme.ThemeKt;
import com.marrow.ui.activities.learn.video.LessonVideoActivity;
import com.marrow.ui.activities.plan.PlanActivity;
import com.marrow2.ui.video.downloaded_videos.DownloadedVideoListViewModel;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Locale;
import kotlin.Cea708Decoder;
import kotlin.Metadata;
import kotlin.SwitchMaterial;
import kotlin.VisibilityChecker;
import kotlin.getAutofillClient;
import kotlin.isTrafficRestricted;
import kotlin.setOnTabSelectedListener;
import kotlin.withFieldVisibility;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\b\u0007\u0018\u0000 '2\u00020\u0001:\u0001'B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u001a\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u001c\u001a\u00020\u001aH\u0002J\b\u0010\u001d\u001a\u00020\u001aH\u0002J\b\u0010\u001e\u001a\u00020\u001aH\u0002J\b\u0010\u001f\u001a\u00020\u001aH\u0002J\b\u0010 \u001a\u00020\u001aH\u0016J\b\u0010!\u001a\u00020\u001aH\u0016J\b\u0010\"\u001a\u00020\u001aH\u0002J\b\u0010#\u001a\u00020\u001aH\u0002J\b\u0010$\u001a\u00020\u001aH\u0002J\b\u0010%\u001a\u00020\u001aH\u0002J\b\u0010&\u001a\u00020\u001aH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006(²\u0006\n\u0010)\u001a\u00020*X\u008a\u0084\u0002"}, d2 = {"Lcom/marrow2/ui/video/downloaded_videos/DownloadedVideoListFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "binding", "Lcom/marrow/databinding/FragmentDownloadedVideoListBinding;", "viewModel", "Lcom/marrow2/ui/video/downloaded_videos/DownloadedVideoListViewModel;", "getViewModel", "()Lcom/marrow2/ui/video/downloaded_videos/DownloadedVideoListViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "inProgressVideoDownloadAdapter", "Lcom/marrow2/ui/video/downloaded_videos/DownloadedVideoListAdapter;", "completedVideoDownloadAdapter", "downloadUpdateReceiver", "Lcom/marrow/receivers/video/VideoDownloadReceiver;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "addFragmentResultListeners", "applyEdgeToEdgeInsets", "setMargins", "setReceivers", "onResume", "onDestroyView", "observers", "showProDialog", "listeners", "setDownloadedCoursesComposeView", "init", "Companion", "app_release", NotesDispatchAddressRequestKt.KEY_STATE, "Lcom/marrow2/ui/video/downloaded_videos/model/DownloadVideosState;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class setMenuItemsAnimated extends setThumbStrokeColor {
    public static final write IconCompatParcelizer = new write(null);
    private final setAnimatedNavigationIcon AudioAttributesCompatParcelizer;
    private final RenewEligible AudioAttributesImplApi26Parcelizer;
    private final setAnimatedNavigationIcon RemoteActionCompatParcelizer;
    private final Cea708Decoder read;
    private removeEldestEntry write;

    public static /* synthetic */ boolean read() {
        return false;
    }

    public setMenuItemsAnimated() {
        setMenuItemsAnimated setmenuitemsanimated = this;
        RenewEligible renewEligibleWrite = getRenewExpiresOn.write(RenewEligibleCompanion.read, new AnonymousClass5(new AnonymousClass4(setmenuitemsanimated)));
        this.AudioAttributesImplApi26Parcelizer = _resolveFieldVsGetter.RemoteActionCompatParcelizer(toMagicModuleMetaDataUcModel.write(DownloadedVideoListViewModel.class), new AnonymousClass2(renewEligibleWrite), new AnonymousClass1(renewEligibleWrite), new AnonymousClass3(setmenuitemsanimated, renewEligibleWrite));
        this.RemoteActionCompatParcelizer = new setAnimatedNavigationIcon(new AudioAttributesCompatParcelizer(), new SideSheetBehavior(this));
        this.AudioAttributesCompatParcelizer = new setAnimatedNavigationIcon(new read(), new getCreatedOnDateMs() { // from class: o.setUseWindowInsetsController
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return Boolean.valueOf(setMenuItemsAnimated.read());
            }
        });
        this.read = new Cea708Decoder(new IconCompatParcelizer());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DownloadedVideoListViewModel AudioAttributesCompatParcelizer() {
        return (DownloadedVideoListViewModel) this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer();
    }

    public static final class AudioAttributesCompatParcelizer implements setThumbStrokeWidthResource {
        AudioAttributesCompatParcelizer() {
        }

        @Override // kotlin.setThumbStrokeWidthResource
        public final void IconCompatParcelizer(isTrafficRestricted.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer, "");
            setMenuItemsAnimated.this.AudioAttributesCompatParcelizer().IconCompatParcelizer(new setOnTabSelectedListener.AudioAttributesImplApi21Parcelizer(remoteActionCompatParcelizer.MediaBrowserCompatItemReceiver(), remoteActionCompatParcelizer.MediaDescriptionCompat()));
        }

        @Override // kotlin.setThumbStrokeWidthResource
        public final void read(String str, int i, String str2) throws Throwable {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            DownloadedVideoListViewModel downloadedVideoListViewModelAudioAttributesCompatParcelizer = setMenuItemsAnimated.this.AudioAttributesCompatParcelizer();
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1200052891);
            if (objRemoteActionCompatParcelizer == null) {
                objRemoteActionCompatParcelizer = startForeground.read((char) ((ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 5288), 19327 - ((byte) KeyEvent.getModifierMetaStateMask()), 21 - (ViewConfiguration.getWindowTouchSlop() >> 8), 969842190, false, "INSTANCE", null);
            }
            Object obj = ((Field) objRemoteActionCompatParcelizer).get(null);
            Context contextRequireContext = setMenuItemsAnimated.this.requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
            try {
                Object[] objArr = {contextRequireContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-920095149);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (((Process.getThreadPriority(0) + 20) >> 6) + 5289), 19327 - TextUtils.lastIndexOf("", '0', 0, 0), 22 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), -1218334010, false, "AudioAttributesCompatParcelizer", new Class[]{Context.class});
                }
                downloadedVideoListViewModelAudioAttributesCompatParcelizer.IconCompatParcelizer(new setOnTabSelectedListener.read(str, i, ((Boolean) ((Method) objRemoteActionCompatParcelizer2).invoke(obj, objArr)).booleanValue(), str2, getTrackName.write(setMenuItemsAnimated.this.requireContext())));
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }

        @Override // kotlin.setThumbStrokeWidthResource
        public final void AudioAttributesCompatParcelizer(List<String> list) {
            toMagicModuleMetaRepoModel.write(list, "");
            setMenuItemsAnimated.this.AudioAttributesCompatParcelizer().IconCompatParcelizer(new setOnTabSelectedListener.AudioAttributesImplBaseParcelizer(list));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean MediaBrowserCompatSearchResultReceiver(setMenuItemsAnimated setmenuitemsanimated) throws Throwable {
        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1200052891);
        if (objRemoteActionCompatParcelizer == null) {
            objRemoteActionCompatParcelizer = startForeground.read((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 5289), 19329 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 21 - (KeyEvent.getMaxKeyCode() >> 16), 969842190, false, "INSTANCE", null);
        }
        Object obj = ((Field) objRemoteActionCompatParcelizer).get(null);
        Context contextRequireContext = setmenuitemsanimated.requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        try {
            Object[] objArr = {contextRequireContext};
            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-920095149);
            if (objRemoteActionCompatParcelizer2 == null) {
                objRemoteActionCompatParcelizer2 = startForeground.read((char) (ImageFormat.getBitsPerPixel(0) + 5290), 19328 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (ViewConfiguration.getTapTimeout() >> 16) + 21, -1218334010, false, "AudioAttributesCompatParcelizer", new Class[]{Context.class});
            }
            return ((Boolean) ((Method) objRemoteActionCompatParcelizer2).invoke(obj, objArr)).booleanValue();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static final class read implements setThumbStrokeWidthResource {
        read() {
        }

        @Override // kotlin.setThumbStrokeWidthResource
        public final void IconCompatParcelizer(isTrafficRestricted.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer, "");
            setMenuItemsAnimated.this.AudioAttributesCompatParcelizer().IconCompatParcelizer(new setOnTabSelectedListener.AudioAttributesImplApi21Parcelizer(remoteActionCompatParcelizer.MediaBrowserCompatItemReceiver(), remoteActionCompatParcelizer.MediaDescriptionCompat()));
        }

        @Override // kotlin.setThumbStrokeWidthResource
        public final void AudioAttributesCompatParcelizer(List<String> list) {
            toMagicModuleMetaRepoModel.write(list, "");
            setMenuItemsAnimated.this.AudioAttributesCompatParcelizer().IconCompatParcelizer(new setOnTabSelectedListener.IconCompatParcelizer(list));
        }

        @Override // kotlin.setThumbStrokeWidthResource
        public final void read(String str, int i, String str2) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
        }
    }

    public static final class IconCompatParcelizer implements Cea708Decoder.IconCompatParcelizer {
        IconCompatParcelizer() {
        }

        @Override // o.Cea708Decoder.IconCompatParcelizer
        public final void write(String str, int i, String str2) {
            setMenuItemsAnimated.this.AudioAttributesCompatParcelizer().IconCompatParcelizer(new setOnTabSelectedListener.AudioAttributesCompatParcelizer(str, i));
        }
    }

    /* JADX INFO: renamed from: o.setMenuItemsAnimated$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Landroidx/fragment/app/Fragment;", "IconCompatParcelizer", "()Landroidx/fragment/app/Fragment;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass4 extends MagicModuleUseCase implements getCreatedOnDateMs<Fragment> {
        private /* synthetic */ Fragment $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.$write;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(Fragment fragment) {
            super(0);
            this.$write = fragment;
        }
    }

    /* JADX INFO: renamed from: o.setMenuItemsAnimated$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/TypeResolutionContext;", "write", "()Lo/TypeResolutionContext;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<TypeResolutionContext> {
        private /* synthetic */ getCreatedOnDateMs $read;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final TypeResolutionContext invoke() {
            return (TypeResolutionContext) this.$read.invoke();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(getCreatedOnDateMs getcreatedondatems) {
            super(0);
            this.$read = getcreatedondatems;
        }
    }

    /* JADX INFO: renamed from: o.setMenuItemsAnimated$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "AudioAttributesCompatParcelizer", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass2 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ RenewEligible $IconCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return _resolveFieldVsGetter.write(this.$IconCompatParcelizer).getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(RenewEligible renewEligible) {
            super(0);
            this.$IconCompatParcelizer = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.setMenuItemsAnimated$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "AudioAttributesCompatParcelizer", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ getCreatedOnDateMs $read = null;
        private /* synthetic */ RenewEligible $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final withFieldVisibility invoke() {
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$write);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return anyexplicitswithoutignoral != null ? anyexplicitswithoutignoral.getDefaultViewModelCreationExtras() : withFieldVisibility.write.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RenewEligible renewEligible) {
            super(0);
            this.$write = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.setMenuItemsAnimated$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "RemoteActionCompatParcelizer", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ RenewEligible $AudioAttributesCompatParcelizer;
        private /* synthetic */ Fragment $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            VisibilityChecker.RemoteActionCompatParcelizer defaultViewModelProviderFactory;
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$AudioAttributesCompatParcelizer);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return (anyexplicitswithoutignoral == null || (defaultViewModelProviderFactory = anyexplicitswithoutignoral.getDefaultViewModelProviderFactory()) == null) ? this.$write.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Fragment fragment, RenewEligible renewEligible) {
            super(0);
            this.$write = fragment;
            this.$AudioAttributesCompatParcelizer = renewEligible;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        toMagicModuleMetaRepoModel.write(inflater, "");
        removeEldestEntry removeeldestentryWrite = removeEldestEntry.write(inflater, container);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(removeeldestentryWrite, "");
        this.write = removeeldestentryWrite;
        if (removeeldestentryWrite == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            removeeldestentryWrite = null;
        }
        ConstraintLayout constraintLayout = removeeldestentryWrite.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout, "");
        return constraintLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle savedInstanceState) {
        toMagicModuleMetaRepoModel.write(view, "");
        super.onViewCreated(view, savedInstanceState);
        write();
        RemoteActionCompatParcelizer();
        AudioAttributesImplBaseParcelizer();
        AudioAttributesImplApi26Parcelizer();
        AudioAttributesImplApi21Parcelizer();
        MediaMetadataCompat();
        MediaBrowserCompatItemReceiver();
    }

    private final void RemoteActionCompatParcelizer() {
        getChildFragmentManager().IconCompatParcelizer(SmsRetrieverStatusCodes.RemoteActionCompatParcelizer.getWrite(), getViewLifecycleOwner(), new _addFields() { // from class: o.SearchViewBehavior
            @Override // kotlin._addFields
            public final void AudioAttributesCompatParcelizer(String str, Bundle bundle) {
                setMenuItemsAnimated.IconCompatParcelizer(this.IconCompatParcelizer, str, bundle);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IconCompatParcelizer(setMenuItemsAnimated setmenuitemsanimated, String str, Bundle bundle) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(bundle, "");
        if (bundle.getBoolean("positive_key_press")) {
            setmenuitemsanimated.AudioAttributesCompatParcelizer().IconCompatParcelizer(setOnTabSelectedListener.MediaBrowserCompatItemReceiver.INSTANCE);
        }
    }

    private final void write() {
        removeEldestEntry removeeldestentry = this.write;
        removeEldestEntry removeeldestentry2 = null;
        if (removeeldestentry == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            removeeldestentry = null;
        }
        ConstraintLayout constraintLayout = removeeldestentry.MediaBrowserCompatMediaItem;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout, "");
        getHttpMethodString.read((View) constraintLayout, true, false, true, true, 0, 50);
        removeEldestEntry removeeldestentry3 = this.write;
        if (removeeldestentry3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            removeeldestentry3 = null;
        }
        NestedScrollView nestedScrollView = removeeldestentry3.MediaMetadataCompat;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(nestedScrollView, "");
        getHttpMethodString.read((View) nestedScrollView, false, true, true, true, 0, 49);
        removeEldestEntry removeeldestentry4 = this.write;
        if (removeeldestentry4 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            removeeldestentry4 = null;
        }
        ConstraintLayout constraintLayout2 = removeeldestentry4.AudioAttributesImplApi26Parcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout2, "");
        getHttpMethodString.read((View) constraintLayout2, false, false, true, true, 0, 51);
        removeEldestEntry removeeldestentry5 = this.write;
        if (removeeldestentry5 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            removeeldestentry2 = removeeldestentry5;
        }
        LinearLayout linearLayout = removeeldestentry2.AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
        getHttpMethodString.read((View) linearLayout, false, true, true, true, 0, 49);
    }

    private final void MediaBrowserCompatItemReceiver() {
        if (DeviceProperties.isTablet(requireContext())) {
            Context contextRequireContext = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
            ViewGroup[] viewGroupArr = new ViewGroup[3];
            removeEldestEntry removeeldestentry = this.write;
            removeEldestEntry removeeldestentry2 = null;
            if (removeeldestentry == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                removeeldestentry = null;
            }
            LinearLayout linearLayout = removeeldestentry.AudioAttributesImplBaseParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
            viewGroupArr[0] = linearLayout;
            removeEldestEntry removeeldestentry3 = this.write;
            if (removeeldestentry3 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                removeeldestentry3 = null;
            }
            NestedScrollView nestedScrollView = removeeldestentry3.MediaMetadataCompat;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(nestedScrollView, "");
            viewGroupArr[1] = nestedScrollView;
            removeEldestEntry removeeldestentry4 = this.write;
            if (removeeldestentry4 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            } else {
                removeeldestentry2 = removeeldestentry4;
            }
            LinearLayout linearLayout2 = removeeldestentry2.AudioAttributesCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout2, "");
            viewGroupArr[2] = linearLayout2;
            bytesRead.AudioAttributesCompatParcelizer(contextRequireContext, (List<? extends View>) IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) viewGroupArr));
        }
    }

    private final void MediaMetadataCompat() {
        getProvider getprovider = getProvider.getInstance(requireContext());
        Cea708Decoder cea708Decoder = this.read;
        getprovider.registerReceiver(cea708Decoder, cea708Decoder.AudioAttributesCompatParcelizer());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        AudioAttributesCompatParcelizer().IconCompatParcelizer(setOnTabSelectedListener.AudioAttributesImplApi26Parcelizer.INSTANCE);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        getProvider.getInstance(requireContext()).IconCompatParcelizer(this.read);
        super.onDestroyView();
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<setInlineLabel> setupdatedstatusAudioAttributesCompatParcelizer = setMenuItemsAnimated.this.AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer();
                final setMenuItemsAnimated setmenuitemsanimated = setMenuItemsAnimated.this;
                this.IconCompatParcelizer = 1;
                if (setupdatedstatusAudioAttributesCompatParcelizer.write(new getValidationToken() { // from class: o.setMenuItemsAnimated.RemoteActionCompatParcelizer.2
                    @Override // kotlin.getValidationToken
                    public final /* bridge */ /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return IconCompatParcelizer((setInlineLabel) obj2);
                    }

                    private Object IconCompatParcelizer(setInlineLabel setinlinelabel) {
                        removeEldestEntry removeeldestentry = null;
                        if (setinlinelabel.getAudioAttributesImplApi26Parcelizer()) {
                            removeEldestEntry removeeldestentry2 = setmenuitemsanimated.write;
                            if (removeeldestentry2 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                removeeldestentry2 = null;
                            }
                            TextView textView = removeeldestentry2.MediaBrowserCompatItemReceiver;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
                            bytesRead.MediaBrowserCompatCustomActionResultReceiver(textView);
                            removeEldestEntry removeeldestentry3 = setmenuitemsanimated.write;
                            if (removeeldestentry3 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                removeeldestentry3 = null;
                            }
                            ConstraintLayout constraintLayout = removeeldestentry3.AudioAttributesImplApi26Parcelizer;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout, "");
                            bytesRead.MediaBrowserCompatCustomActionResultReceiver(constraintLayout);
                        } else {
                            removeEldestEntry removeeldestentry4 = setmenuitemsanimated.write;
                            if (removeeldestentry4 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                removeeldestentry4 = null;
                            }
                            TextView textView2 = removeeldestentry4.MediaBrowserCompatItemReceiver;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView2, "");
                            bytesRead.AudioAttributesImplApi21Parcelizer(textView2);
                        }
                        if (setinlinelabel.getAudioAttributesImplApi21Parcelizer()) {
                            removeEldestEntry removeeldestentry5 = setmenuitemsanimated.write;
                            if (removeeldestentry5 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                removeeldestentry5 = null;
                            }
                            removeeldestentry5.MediaBrowserCompatItemReceiver.setText(setmenuitemsanimated.getString(R.string.btn_cancel));
                            removeEldestEntry removeeldestentry6 = setmenuitemsanimated.write;
                            if (removeeldestentry6 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                removeeldestentry6 = null;
                            }
                            TextView textView3 = removeeldestentry6.MediaBrowserCompatItemReceiver;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView3, "");
                            PlayerControlViewExternalSyntheticLambda1.write(textView3);
                            removeEldestEntry removeeldestentry7 = setmenuitemsanimated.write;
                            if (removeeldestentry7 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                removeeldestentry7 = null;
                            }
                            ConstraintLayout constraintLayout2 = removeeldestentry7.AudioAttributesImplApi26Parcelizer;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout2, "");
                            bytesRead.AudioAttributesImplApi21Parcelizer(constraintLayout2);
                            removeEldestEntry removeeldestentry8 = setmenuitemsanimated.write;
                            if (removeeldestentry8 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                removeeldestentry8 = null;
                            }
                            TextView textView4 = removeeldestentry8.onAddQueueItem;
                            Context contextRequireContext = setmenuitemsanimated.requireContext();
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
                            textView4.setText(CmcdHeadersFactoryCmcdRequest.IconCompatParcelizer(contextRequireContext, R.plurals.videos_selected, setinlinelabel.getMediaBrowserCompatItemReceiver()));
                        } else {
                            removeEldestEntry removeeldestentry9 = setmenuitemsanimated.write;
                            if (removeeldestentry9 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                removeeldestentry9 = null;
                            }
                            removeeldestentry9.MediaBrowserCompatItemReceiver.setText(setmenuitemsanimated.getString(R.string.delete));
                            removeEldestEntry removeeldestentry10 = setmenuitemsanimated.write;
                            if (removeeldestentry10 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                removeeldestentry10 = null;
                            }
                            TextView textView5 = removeeldestentry10.MediaBrowserCompatItemReceiver;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView5, "");
                            bytesRead.write(textView5, R.drawable.ic_delete_icon, -1, -1, -1);
                            removeEldestEntry removeeldestentry11 = setmenuitemsanimated.write;
                            if (removeeldestentry11 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                removeeldestentry11 = null;
                            }
                            TextView textView6 = removeeldestentry11.MediaBrowserCompatItemReceiver;
                            Context contextRequireContext2 = setmenuitemsanimated.requireContext();
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext2, "");
                            textView6.setCompoundDrawablePadding(DataSourceBitmapLoaderExternalSyntheticLambda1.read(contextRequireContext2, 4));
                            removeEldestEntry removeeldestentry12 = setmenuitemsanimated.write;
                            if (removeeldestentry12 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                removeeldestentry12 = null;
                            }
                            ConstraintLayout constraintLayout3 = removeeldestentry12.AudioAttributesImplApi26Parcelizer;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout3, "");
                            bytesRead.MediaBrowserCompatCustomActionResultReceiver(constraintLayout3);
                            removeEldestEntry removeeldestentry13 = setmenuitemsanimated.write;
                            if (removeeldestentry13 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                removeeldestentry13 = null;
                            }
                            TextView textView7 = removeeldestentry13.onAddQueueItem;
                            Context contextRequireContext3 = setmenuitemsanimated.requireContext();
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext3, "");
                            textView7.setText(CmcdHeadersFactoryCmcdRequest.IconCompatParcelizer(contextRequireContext3, R.plurals.videos_selected, 0));
                        }
                        if (setinlinelabel.getMediaBrowserCompatCustomActionResultReceiver()) {
                            removeEldestEntry removeeldestentry14 = setmenuitemsanimated.write;
                            if (removeeldestentry14 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                removeeldestentry14 = null;
                            }
                            LinearLayout linearLayout = removeeldestentry14.AudioAttributesCompatParcelizer;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
                            bytesRead.AudioAttributesImplApi21Parcelizer(linearLayout);
                        } else {
                            removeEldestEntry removeeldestentry15 = setmenuitemsanimated.write;
                            if (removeeldestentry15 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                removeeldestentry15 = null;
                            }
                            LinearLayout linearLayout2 = removeeldestentry15.AudioAttributesCompatParcelizer;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout2, "");
                            bytesRead.MediaBrowserCompatCustomActionResultReceiver(linearLayout2);
                        }
                        removeEldestEntry removeeldestentry16 = setmenuitemsanimated.write;
                        if (removeeldestentry16 == null) {
                            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            removeeldestentry16 = null;
                        }
                        if (removeeldestentry16.IconCompatParcelizer.isChecked() != setinlinelabel.getAudioAttributesCompatParcelizer()) {
                            removeEldestEntry removeeldestentry17 = setmenuitemsanimated.write;
                            if (removeeldestentry17 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            } else {
                                removeeldestentry = removeeldestentry17;
                            }
                            removeeldestentry.IconCompatParcelizer.setChecked(setinlinelabel.getAudioAttributesCompatParcelizer());
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
            return setMenuItemsAnimated.this.new RemoteActionCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void AudioAttributesImplApi21Parcelizer() {
        setMenuItemsAnimated setmenuitemsanimated = this;
        setBitrateKbps.read(setmenuitemsanimated, new RemoteActionCompatParcelizer(null));
        setBitrateKbps.read(setmenuitemsanimated, new MediaBrowserCompatCustomActionResultReceiver(null));
        setBitrateKbps.read(setmenuitemsanimated, new AudioAttributesImplApi21Parcelizer(null));
        setBitrateKbps.read(setmenuitemsanimated, new AudioAttributesImplApi26Parcelizer(null));
        setBitrateKbps.read(setmenuitemsanimated, new MediaBrowserCompatItemReceiver(null));
        setBitrateKbps.read(setmenuitemsanimated, new AudioAttributesImplBaseParcelizer(null));
    }

    static final class MediaBrowserCompatCustomActionResultReceiver extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<setSelectedTabIndicator> setupdatedstatus = setMenuItemsAnimated.this.AudioAttributesCompatParcelizer().read();
                final setMenuItemsAnimated setmenuitemsanimated = setMenuItemsAnimated.this;
                this.AudioAttributesCompatParcelizer = 1;
                if (setupdatedstatus.write(new getValidationToken() { // from class: o.setMenuItemsAnimated.MediaBrowserCompatCustomActionResultReceiver.2
                    @Override // kotlin.getValidationToken
                    public final /* bridge */ /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return IconCompatParcelizer((setSelectedTabIndicator) obj2);
                    }

                    private Object IconCompatParcelizer(setSelectedTabIndicator setselectedtabindicator) {
                        removeEldestEntry removeeldestentry = null;
                        if (!setselectedtabindicator.write().isEmpty()) {
                            removeEldestEntry removeeldestentry2 = setmenuitemsanimated.write;
                            if (removeeldestentry2 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                removeeldestentry2 = null;
                            }
                            LinearLayout linearLayout = removeeldestentry2.AudioAttributesImplApi21Parcelizer;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
                            bytesRead.AudioAttributesImplApi21Parcelizer(linearLayout);
                        } else {
                            removeEldestEntry removeeldestentry3 = setmenuitemsanimated.write;
                            if (removeeldestentry3 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                removeeldestentry3 = null;
                            }
                            LinearLayout linearLayout2 = removeeldestentry3.AudioAttributesImplApi21Parcelizer;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout2, "");
                            bytesRead.MediaBrowserCompatCustomActionResultReceiver(linearLayout2);
                        }
                        removeEldestEntry removeeldestentry4 = setmenuitemsanimated.write;
                        if (removeeldestentry4 == null) {
                            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                        } else {
                            removeeldestentry = removeeldestentry4;
                        }
                        removeeldestentry.MediaDescriptionCompat.setText(setmenuitemsanimated.getString(R.string.f_label_downloaded_count, QBankStatsResponse.RemoteActionCompatParcelizer(setselectedtabindicator.write().size())));
                        setmenuitemsanimated.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(setselectedtabindicator.write(), setselectedtabindicator.read());
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
            return setMenuItemsAnimated.this.new MediaBrowserCompatCustomActionResultReceiver(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatCustomActionResultReceiver) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
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
                setUpdatedStatus<setSelectedTabIndicator> setupdatedstatusMediaBrowserCompatItemReceiver = setMenuItemsAnimated.this.AudioAttributesCompatParcelizer().MediaBrowserCompatItemReceiver();
                final setMenuItemsAnimated setmenuitemsanimated = setMenuItemsAnimated.this;
                this.RemoteActionCompatParcelizer = 1;
                if (setupdatedstatusMediaBrowserCompatItemReceiver.write(new getValidationToken() { // from class: o.setMenuItemsAnimated.AudioAttributesImplApi21Parcelizer.2
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return read((setSelectedTabIndicator) obj2);
                    }

                    private Object read(setSelectedTabIndicator setselectedtabindicator) {
                        removeEldestEntry removeeldestentry = null;
                        if (!setselectedtabindicator.write().isEmpty()) {
                            removeEldestEntry removeeldestentry2 = setmenuitemsanimated.write;
                            if (removeeldestentry2 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                removeeldestentry2 = null;
                            }
                            LinearLayout linearLayout = removeeldestentry2.MediaBrowserCompatCustomActionResultReceiver;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
                            bytesRead.AudioAttributesImplApi21Parcelizer(linearLayout);
                        } else {
                            removeEldestEntry removeeldestentry3 = setmenuitemsanimated.write;
                            if (removeeldestentry3 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                removeeldestentry3 = null;
                            }
                            LinearLayout linearLayout2 = removeeldestentry3.MediaBrowserCompatCustomActionResultReceiver;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout2, "");
                            bytesRead.MediaBrowserCompatCustomActionResultReceiver(linearLayout2);
                        }
                        removeEldestEntry removeeldestentry4 = setmenuitemsanimated.write;
                        if (removeeldestentry4 == null) {
                            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                        } else {
                            removeeldestentry = removeeldestentry4;
                        }
                        removeeldestentry.handleMediaPlayPauseIfPendingOnHandler.setText(setmenuitemsanimated.getString(R.string.f_label_downloading_count, QBankStatsResponse.RemoteActionCompatParcelizer(setselectedtabindicator.write().size())));
                        setmenuitemsanimated.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(setselectedtabindicator.write(), setselectedtabindicator.read());
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
            return setMenuItemsAnimated.this.new AudioAttributesImplApi21Parcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplApi21Parcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class AudioAttributesImplApi26Parcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<setMaxInlineActionWidth> setupdatedstatusIconCompatParcelizer = setMenuItemsAnimated.this.AudioAttributesCompatParcelizer().IconCompatParcelizer();
                final setMenuItemsAnimated setmenuitemsanimated = setMenuItemsAnimated.this;
                this.read = 1;
                if (setupdatedstatusIconCompatParcelizer.write(new getValidationToken() { // from class: o.setMenuItemsAnimated.AudioAttributesImplApi26Parcelizer.4
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return read((setMaxInlineActionWidth) obj2);
                    }

                    private Object read(setMaxInlineActionWidth setmaxinlineactionwidth) {
                        setmenuitemsanimated.AudioAttributesCompatParcelizer.read(setmaxinlineactionwidth);
                        setmenuitemsanimated.RemoteActionCompatParcelizer.read(setmaxinlineactionwidth);
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
            return setMenuItemsAnimated.this.new AudioAttributesImplApi26Parcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplApi26Parcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class MediaBrowserCompatItemReceiver extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<String> setupdatedstatusAudioAttributesImplBaseParcelizer = setMenuItemsAnimated.this.AudioAttributesCompatParcelizer().AudioAttributesImplBaseParcelizer();
                final setMenuItemsAnimated setmenuitemsanimated = setMenuItemsAnimated.this;
                this.IconCompatParcelizer = 1;
                if (setupdatedstatusAudioAttributesImplBaseParcelizer.write(new getValidationToken() { // from class: o.setMenuItemsAnimated.MediaBrowserCompatItemReceiver.1
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return write((String) obj2);
                    }

                    private Object write(String str) {
                        if (str.length() > 0) {
                            CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer(setmenuitemsanimated, str, 0);
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

        MediaBrowserCompatItemReceiver(SampleVideos<? super MediaBrowserCompatItemReceiver> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return setMenuItemsAnimated.this.new MediaBrowserCompatItemReceiver(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatItemReceiver) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
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
                setUpdatedStatus<SwitchMaterial> setupdatedstatusAudioAttributesImplApi21Parcelizer = setMenuItemsAnimated.this.AudioAttributesCompatParcelizer().AudioAttributesImplApi21Parcelizer();
                final setMenuItemsAnimated setmenuitemsanimated = setMenuItemsAnimated.this;
                this.AudioAttributesCompatParcelizer = 1;
                if (setupdatedstatusAudioAttributesImplApi21Parcelizer.write(new getValidationToken() { // from class: o.setMenuItemsAnimated.AudioAttributesImplBaseParcelizer.4
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return RemoteActionCompatParcelizer((SwitchMaterial) obj2);
                    }

                    private Object RemoteActionCompatParcelizer(SwitchMaterial switchMaterial) throws Throwable {
                        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(switchMaterial, SwitchMaterial.read.INSTANCE)) {
                            setMenuItemsAnimated setmenuitemsanimated2 = setmenuitemsanimated;
                            setMenuItemsAnimated setmenuitemsanimated3 = setmenuitemsanimated2;
                            String string = setmenuitemsanimated2.getString(R.string.app_error_no_internet);
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
                            CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer(setmenuitemsanimated3, string, 0);
                            setmenuitemsanimated.AudioAttributesCompatParcelizer().IconCompatParcelizer(setOnTabSelectedListener.RemoteActionCompatParcelizer.INSTANCE);
                        } else {
                            try {
                                if (switchMaterial instanceof SwitchMaterial.write) {
                                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1200052891);
                                    if (objRemoteActionCompatParcelizer == null) {
                                        objRemoteActionCompatParcelizer = startForeground.read((char) (5288 - TextUtils.lastIndexOf("", '0', 0)), 19327 - TextUtils.lastIndexOf("", '0', 0), View.resolveSize(0, 0) + 21, 969842190, false, "INSTANCE", null);
                                    }
                                    Object obj2 = ((Field) objRemoteActionCompatParcelizer).get(null);
                                    Context contextRequireContext = setmenuitemsanimated.requireContext();
                                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
                                    Object[] objArr = {contextRequireContext, ((SwitchMaterial.write) switchMaterial).RemoteActionCompatParcelizer()};
                                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(1647474935);
                                    if (objRemoteActionCompatParcelizer2 == null) {
                                        objRemoteActionCompatParcelizer2 = startForeground.read((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 5289), 19327 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 21, 477871202, false, "read", new Class[]{Context.class, String.class});
                                    }
                                    ((Method) objRemoteActionCompatParcelizer2).invoke(obj2, objArr);
                                    setmenuitemsanimated.AudioAttributesCompatParcelizer().IconCompatParcelizer(setOnTabSelectedListener.RemoteActionCompatParcelizer.INSTANCE);
                                } else if (switchMaterial instanceof SwitchMaterial.MediaBrowserCompatItemReceiver) {
                                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(1200052891);
                                    if (objRemoteActionCompatParcelizer3 == null) {
                                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (5289 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), 19328 - (Process.myTid() >> 22), (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 21, 969842190, false, "INSTANCE", null);
                                    }
                                    Object obj3 = ((Field) objRemoteActionCompatParcelizer3).get(null);
                                    Context contextRequireContext2 = setmenuitemsanimated.requireContext();
                                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext2, "");
                                    Object[] objArr2 = {contextRequireContext2, ((SwitchMaterial.MediaBrowserCompatItemReceiver) switchMaterial).AudioAttributesCompatParcelizer()};
                                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1840041836);
                                    if (objRemoteActionCompatParcelizer4 == null) {
                                        objRemoteActionCompatParcelizer4 = startForeground.read((char) (Color.rgb(0, 0, 0) + 16782505), 19328 - ((Process.getThreadPriority(0) + 20) >> 6), Process.getGidForName("") + 22, 333777913, false, "write", new Class[]{Context.class, String.class});
                                    }
                                    ((Method) objRemoteActionCompatParcelizer4).invoke(obj3, objArr2);
                                    setmenuitemsanimated.AudioAttributesCompatParcelizer().IconCompatParcelizer(setOnTabSelectedListener.RemoteActionCompatParcelizer.INSTANCE);
                                } else if (switchMaterial instanceof SwitchMaterial.IconCompatParcelizer) {
                                    setMenuItemsAnimated setmenuitemsanimated4 = setmenuitemsanimated;
                                    LessonVideoActivity.Companion companion = LessonVideoActivity.INSTANCE;
                                    Context contextRequireContext3 = setmenuitemsanimated.requireContext();
                                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext3, "");
                                    setmenuitemsanimated4.startActivity(LessonVideoActivity.Companion.RemoteActionCompatParcelizer(contextRequireContext3, ((SwitchMaterial.IconCompatParcelizer) switchMaterial).AudioAttributesCompatParcelizer(), 0, false, 28));
                                    setmenuitemsanimated.AudioAttributesCompatParcelizer().IconCompatParcelizer(setOnTabSelectedListener.RemoteActionCompatParcelizer.INSTANCE);
                                } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(switchMaterial, SwitchMaterial.AudioAttributesImplBaseParcelizer.INSTANCE)) {
                                    setmenuitemsanimated.MediaBrowserCompatMediaItem();
                                    setmenuitemsanimated.AudioAttributesCompatParcelizer().IconCompatParcelizer(setOnTabSelectedListener.RemoteActionCompatParcelizer.INSTANCE);
                                } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(switchMaterial, SwitchMaterial.RemoteActionCompatParcelizer.INSTANCE)) {
                                    setMenuItemsAnimated setmenuitemsanimated5 = setmenuitemsanimated;
                                    PlanActivity.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = PlanActivity.RemoteActionCompatParcelizer;
                                    Context contextRequireContext4 = setmenuitemsanimated.requireContext();
                                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext4, "");
                                    String lowerCase = "PRO_VIDEO_ACCESSED".toLowerCase(Locale.ROOT);
                                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase, "");
                                    setmenuitemsanimated5.startActivity(PlanActivity.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(contextRequireContext4, "Pro Subscription Dialog", lowerCase));
                                    setmenuitemsanimated.AudioAttributesCompatParcelizer().IconCompatParcelizer(setOnTabSelectedListener.RemoteActionCompatParcelizer.INSTANCE);
                                }
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause != null) {
                                    throw cause;
                                }
                                throw th;
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

        AudioAttributesImplBaseParcelizer(SampleVideos<? super AudioAttributesImplBaseParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return setMenuItemsAnimated.this.new AudioAttributesImplBaseParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplBaseParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MediaBrowserCompatMediaItem() {
        getAutofillClient.Companion companion = getAutofillClient.INSTANCE;
        String string = getString(R.string.video_for_paid_user);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        String string2 = getString(R.string.view_plans);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
        String string3 = getString(R.string.go_back);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string3, "");
        getAutofillClient.Companion.AudioAttributesCompatParcelizer(null, string, string2, string3, 0, SmsRetrieverStatusCodes.RemoteActionCompatParcelizer, false, false, null, 465).show(getChildFragmentManager(), (String) null);
    }

    private final void AudioAttributesImplApi26Parcelizer() {
        removeEldestEntry removeeldestentry = this.write;
        removeEldestEntry removeeldestentry2 = null;
        if (removeeldestentry == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            removeeldestentry = null;
        }
        removeeldestentry.RemoteActionCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.setHaloTintList
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                setMenuItemsAnimated.MediaMetadataCompat(this.read);
            }
        });
        removeEldestEntry removeeldestentry3 = this.write;
        if (removeeldestentry3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            removeeldestentry3 = null;
        }
        removeeldestentry3.MediaBrowserCompatItemReceiver.setOnClickListener(new View.OnClickListener() { // from class: o.BaseSlider
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                setMenuItemsAnimated.RatingCompat(this.write);
            }
        });
        removeEldestEntry removeeldestentry4 = this.write;
        if (removeeldestentry4 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            removeeldestentry4 = null;
        }
        removeeldestentry4.read.setOnClickListener(new View.OnClickListener() { // from class: o.setHaloRadiusResource
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                setMenuItemsAnimated.MediaBrowserCompatMediaItem(this.read);
            }
        });
        removeEldestEntry removeeldestentry5 = this.write;
        if (removeeldestentry5 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            removeeldestentry2 = removeeldestentry5;
        }
        removeeldestentry2.IconCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.setFocusedThumbIndex
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                setMenuItemsAnimated.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(this.RemoteActionCompatParcelizer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MediaMetadataCompat(setMenuItemsAnimated setmenuitemsanimated) {
        setmenuitemsanimated.requireActivity().finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RatingCompat(setMenuItemsAnimated setmenuitemsanimated) {
        setmenuitemsanimated.AudioAttributesCompatParcelizer().IconCompatParcelizer(setOnTabSelectedListener.MediaBrowserCompatCustomActionResultReceiver.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MediaBrowserCompatMediaItem(final setMenuItemsAnimated setmenuitemsanimated) {
        int iAudioAttributesImplApi26Parcelizer = setmenuitemsanimated.AudioAttributesCompatParcelizer().AudioAttributesImplApi26Parcelizer();
        Context contextRequireContext = setmenuitemsanimated.requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        String string = setmenuitemsanimated.getString(R.string.video_delete_confirmation, CmcdHeadersFactoryCmcdRequest.IconCompatParcelizer(contextRequireContext, R.plurals.label_videos, iAudioAttributesImplApi26Parcelizer));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        getAutofillClient.Companion companion = getAutofillClient.INSTANCE;
        String string2 = setmenuitemsanimated.getString(R.string.btn_cancel);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
        String string3 = setmenuitemsanimated.getString(R.string.yes_start_test);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string3, "");
        getAutofillClient getautofillclientAudioAttributesCompatParcelizer = getAutofillClient.Companion.AudioAttributesCompatParcelizer(string, null, string3, string2, R.drawable.ic_delete_videos, null, false, false, null, 482);
        FragmentManager childFragmentManager = setmenuitemsanimated.getChildFragmentManager();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(childFragmentManager, "");
        getBrowserClient.IconCompatParcelizer(getautofillclientAudioAttributesCompatParcelizer, childFragmentManager, new getCreatedOnDateMs() { // from class: o.SideSheetBehaviorSavedState
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return setMenuItemsAnimated.onCommand(this.RemoteActionCompatParcelizer);
            }
        }, null, 4);
        setmenuitemsanimated.AudioAttributesCompatParcelizer().IconCompatParcelizer(setOnTabSelectedListener.RemoteActionCompatParcelizer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onCommand(setMenuItemsAnimated setmenuitemsanimated) {
        setmenuitemsanimated.AudioAttributesCompatParcelizer().IconCompatParcelizer(setOnTabSelectedListener.write.INSTANCE);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(setMenuItemsAnimated setmenuitemsanimated) {
        DownloadedVideoListViewModel downloadedVideoListViewModelAudioAttributesCompatParcelizer = setmenuitemsanimated.AudioAttributesCompatParcelizer();
        removeEldestEntry removeeldestentry = setmenuitemsanimated.write;
        if (removeeldestentry == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            removeeldestentry = null;
        }
        downloadedVideoListViewModelAudioAttributesCompatParcelizer.IconCompatParcelizer(new setOnTabSelectedListener.MediaBrowserCompatSearchResultReceiver(removeeldestentry.IconCompatParcelizer.isChecked()));
    }

    private final void MediaBrowserCompatCustomActionResultReceiver() {
        removeEldestEntry removeeldestentry = this.write;
        if (removeeldestentry == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            removeeldestentry = null;
        }
        removeeldestentry.write.setContent(multiplyFft.IconCompatParcelizer(303494318, true, new MagicModuleSubmissionRequestBody() { // from class: o.setupWithSearchBar
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return setMenuItemsAnimated.read(this.IconCompatParcelizer, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(setMenuItemsAnimated setmenuitemsanimated, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(303494318, i, -1, "com.marrow2.ui.video.downloaded_videos.DownloadedVideoListFragment.setDownloadedCoursesComposeView.<anonymous> (DownloadedVideoListFragment.kt:364)");
            }
            final parseDouble parsedoubleAudioAttributesCompatParcelizer = isSetterVisible.AudioAttributesCompatParcelizer(setmenuitemsanimated.AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer(), _handleunrecognizedcharacterescape, 0);
            ThemeKt.read((AppTheme) null, false, (MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup>) multiplyFft.AudioAttributesCompatParcelizer(294963758, true, new MagicModuleSubmissionRequestBody() { // from class: o.setToolbarTouchscreenBlocksFocus
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return setMenuItemsAnimated.read(parsedoubleAudioAttributesCompatParcelizer, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            }, _handleunrecognizedcharacterescape, 54), _handleunrecognizedcharacterescape, RendererCapabilities.MODE_SUPPORT_MASK, 3);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(parseDouble parsedouble, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(294963758, i, -1, "com.marrow2.ui.video.downloaded_videos.DownloadedVideoListFragment.setDownloadedCoursesComposeView.<anonymous>.<anonymous> (DownloadedVideoListFragment.kt:367)");
            }
            if (AudioAttributesCompatParcelizer((parseDouble<setInlineLabel>) parsedouble).getAudioAttributesImplApi21Parcelizer()) {
                _handleunrecognizedcharacterescape.IconCompatParcelizer(-252570700);
            } else {
                _handleunrecognizedcharacterescape.IconCompatParcelizer(-237715934);
                setTickVisible.write(AudioAttributesCompatParcelizer((parseDouble<setInlineLabel>) parsedouble).getRead(), AudioAttributesCompatParcelizer((parseDouble<setInlineLabel>) parsedouble).getRemoteActionCompatParcelizer(), AudioAttributesCompatParcelizer((parseDouble<setInlineLabel>) parsedouble).IconCompatParcelizer(), AudioAttributesCompatParcelizer((parseDouble<setInlineLabel>) parsedouble).getWrite(), AudioAttributesCompatParcelizer((parseDouble<setInlineLabel>) parsedouble).getAudioAttributesImplApi26Parcelizer(), null, _handleunrecognizedcharacterescape, 0, 32);
            }
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    private final void AudioAttributesImplBaseParcelizer() {
        MediaBrowserCompatCustomActionResultReceiver();
        removeEldestEntry removeeldestentry = this.write;
        removeEldestEntry removeeldestentry2 = null;
        if (removeeldestentry == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            removeeldestentry = null;
        }
        RecyclerView recyclerView = removeeldestentry.RatingCompat;
        requireContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(this.RemoteActionCompatParcelizer);
        removeEldestEntry removeeldestentry3 = this.write;
        if (removeeldestentry3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            removeeldestentry2 = removeeldestentry3;
        }
        RecyclerView recyclerView2 = removeeldestentry2.MediaBrowserCompatSearchResultReceiver;
        requireContext();
        recyclerView2.setLayoutManager(new LinearLayoutManager());
        recyclerView2.setAdapter(this.AudioAttributesCompatParcelizer);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/setMenuItemsAnimated$write;", "", "<init>", "()V", "Lo/setMenuItemsAnimated;", "AudioAttributesCompatParcelizer", "()Lo/setMenuItemsAnimated;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class write {
        private write() {
        }

        @getMagicModuleMeta
        public static setMenuItemsAnimated AudioAttributesCompatParcelizer() {
            return new setMenuItemsAnimated();
        }

        public /* synthetic */ write(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    private static final setInlineLabel AudioAttributesCompatParcelizer(parseDouble<setInlineLabel> parsedouble) {
        return parsedouble.getRemoteActionCompatParcelizer();
    }
}
