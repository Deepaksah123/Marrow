package kotlin;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.snackbar.Snackbar;
import com.marrow.R;
import com.marrow.ui.activities.learn.video.LessonVideoActivity;
import com.marrow2.ui.video.sample_videos.viewmodel.SampleVideosViewModel;
import java.util.List;
import kotlin.BookmarkRequestBody;
import kotlin.Metadata;
import kotlin.VisibilityChecker;
import kotlin.getAddressLine1;
import kotlin.getBookmarkType;
import kotlin.withFieldVisibility;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000 \u00162\u00020\u00012\u00020\u0002:\u0001\u0016B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J+\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0004J!\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0004J\u000f\u0010\u0013\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0004J\u000f\u0010\u0014\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0004J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0012\u001a\u00020\u000e2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0002¢\u0006\u0004\b\u0012\u0010\u001aR\u0016\u0010\u0012\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001b\u0010\u0016\u001a\u00020\u001e8CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u001f\u001a\u0004\b\u0016\u0010 R\u0016\u0010\u0014\u001a\u00020!8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0012\u0010\"R\u0018\u0010\u001c\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010$"}, d2 = {"Lo/getBookmarkType;", "Landroidx/fragment/app/Fragment;", "Lo/BookmarkRequestBody$IconCompatParcelizer;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "MediaBrowserCompatCustomActionResultReceiver", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "write", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer", "", "read", "(Ljava/lang/String;)V", "", "Lo/setMcqId;", "(Ljava/util/List;)V", "Lo/loadPlaylistInternal;", "IconCompatParcelizer", "Lo/loadPlaylistInternal;", "Lcom/marrow2/ui/video/sample_videos/viewmodel/SampleVideosViewModel;", "Lo/RenewEligible;", "()Lcom/marrow2/ui/video/sample_videos/viewmodel/SampleVideosViewModel;", "Lo/BookmarkRequestBody;", "Lo/BookmarkRequestBody;", "Lcom/google/android/material/snackbar/Snackbar;", "Lcom/google/android/material/snackbar/Snackbar;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class getBookmarkType extends setBookmarkType implements BookmarkRequestBody.IconCompatParcelizer {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private Snackbar IconCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private loadPlaylistInternal write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final RenewEligible read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private BookmarkRequestBody RemoteActionCompatParcelizer;

    public getBookmarkType() {
        getBookmarkType getbookmarktype = this;
        RenewEligible renewEligibleWrite = getRenewExpiresOn.write(RenewEligibleCompanion.read, new AnonymousClass4(new AnonymousClass2(getbookmarktype)));
        this.read = _resolveFieldVsGetter.RemoteActionCompatParcelizer(toMagicModuleMetaDataUcModel.write(SampleVideosViewModel.class), new AnonymousClass3(renewEligibleWrite), new AnonymousClass5(renewEligibleWrite), new AnonymousClass1(getbookmarktype, renewEligibleWrite));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SampleVideosViewModel read() {
        return (SampleVideosViewModel) this.read.RemoteActionCompatParcelizer();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        loadPlaylistInternal loadplaylistinternalAudioAttributesCompatParcelizer = loadPlaylistInternal.AudioAttributesCompatParcelizer(p0, p1);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(loadplaylistinternalAudioAttributesCompatParcelizer, "");
        this.write = loadplaylistinternalAudioAttributesCompatParcelizer;
        if (loadplaylistinternalAudioAttributesCompatParcelizer == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            loadplaylistinternalAudioAttributesCompatParcelizer = null;
        }
        LinearLayout linearLayoutIconCompatParcelizer = loadplaylistinternalAudioAttributesCompatParcelizer.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayoutIconCompatParcelizer, "");
        return linearLayoutIconCompatParcelizer;
    }

    private final void MediaBrowserCompatCustomActionResultReceiver() {
        if (DeviceProperties.isTablet(requireContext())) {
            Context contextRequireContext = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
            loadPlaylistInternal loadplaylistinternal = this.write;
            if (loadplaylistinternal == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                loadplaylistinternal = null;
            }
            NestedScrollView nestedScrollView = loadplaylistinternal.AudioAttributesCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(nestedScrollView, "");
            bytesRead.write(contextRequireContext, nestedScrollView);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View p0, Bundle p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onViewCreated(p0, p1);
        write();
        MediaBrowserCompatCustomActionResultReceiver();
        AudioAttributesCompatParcelizer();
        RemoteActionCompatParcelizer();
    }

    private final void write() {
        loadPlaylistInternal loadplaylistinternal = this.write;
        loadPlaylistInternal loadplaylistinternal2 = null;
        if (loadplaylistinternal == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            loadplaylistinternal = null;
        }
        MaterialToolbar materialToolbar = loadplaylistinternal.write;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(materialToolbar, "");
        getHttpMethodString.read((View) materialToolbar, true, false, true, true, 0, 50);
        loadPlaylistInternal loadplaylistinternal3 = this.write;
        if (loadplaylistinternal3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            loadplaylistinternal2 = loadplaylistinternal3;
        }
        NestedScrollView nestedScrollView = loadplaylistinternal2.AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(nestedScrollView, "");
        getHttpMethodString.read((View) nestedScrollView, false, true, true, true, 0, 49);
    }

    private final void AudioAttributesCompatParcelizer() {
        loadPlaylistInternal loadplaylistinternal = this.write;
        BookmarkRequestBody bookmarkRequestBody = null;
        if (loadplaylistinternal == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            loadplaylistinternal = null;
        }
        loadplaylistinternal.write.setNavigationOnClickListener(new View.OnClickListener() { // from class: o.getMcqId
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                getBookmarkType.RemoteActionCompatParcelizer(this.write);
            }
        });
        this.RemoteActionCompatParcelizer = new BookmarkRequestBody(this);
        loadPlaylistInternal loadplaylistinternal2 = this.write;
        if (loadplaylistinternal2 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            loadplaylistinternal2 = null;
        }
        RecyclerView recyclerView = loadplaylistinternal2.IconCompatParcelizer;
        BookmarkRequestBody bookmarkRequestBody2 = this.RemoteActionCompatParcelizer;
        if (bookmarkRequestBody2 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            bookmarkRequestBody = bookmarkRequestBody2;
        }
        recyclerView.setAdapter(bookmarkRequestBody);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RemoteActionCompatParcelizer(getBookmarkType getbookmarktype) {
        getbookmarktype.requireActivity().onBackPressed();
    }

    static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;

        /* JADX INFO: renamed from: o.getBookmarkType$write$1, reason: invalid class name */
        static final class AnonymousClass1 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<DataSourceBitmapLoaderExternalSyntheticLambda0<List<? extends AbstractC0202setMcqId>>, SampleVideos<? super getShowPopup>, Object> {
            private int RemoteActionCompatParcelizer;
            private /* synthetic */ getBookmarkType read;
            private /* synthetic */ Object write;

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                DataSourceBitmapLoaderExternalSyntheticLambda0 dataSourceBitmapLoaderExternalSyntheticLambda0 = (DataSourceBitmapLoaderExternalSyntheticLambda0) this.write;
                getYear.IconCompatParcelizer();
                SdkPayloadData.IconCompatParcelizer(obj);
                loadPlaylistInternal loadplaylistinternal = null;
                if (dataSourceBitmapLoaderExternalSyntheticLambda0 instanceof setTopBitrateKbps) {
                    loadPlaylistInternal loadplaylistinternal2 = this.read.write;
                    if (loadplaylistinternal2 == null) {
                        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                        loadplaylistinternal2 = null;
                    }
                    ProgressBar progressBar = loadplaylistinternal2.read;
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar, "");
                    bytesRead.MediaBrowserCompatCustomActionResultReceiver(progressBar);
                    loadPlaylistInternal loadplaylistinternal3 = this.read.write;
                    if (loadplaylistinternal3 == null) {
                        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                    } else {
                        loadplaylistinternal = loadplaylistinternal3;
                    }
                    Group group = loadplaylistinternal.RemoteActionCompatParcelizer;
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(group, "");
                    bytesRead.MediaBrowserCompatCustomActionResultReceiver(group);
                    setTopBitrateKbps settopbitratekbps = (setTopBitrateKbps) dataSourceBitmapLoaderExternalSyntheticLambda0;
                    if (settopbitratekbps.getRemoteActionCompatParcelizer() == 502) {
                        Snackbar snackbar = this.read.IconCompatParcelizer;
                        if (snackbar != null) {
                            snackbar.RemoteActionCompatParcelizer();
                        }
                        getBookmarkType getbookmarktype = this.read;
                        Snackbar snackbarAudioAttributesCompatParcelizer = Snackbar.AudioAttributesCompatParcelizer(getbookmarktype.requireView(), R.string.app_error_no_internet);
                        final getBookmarkType getbookmarktype2 = this.read;
                        getbookmarktype.IconCompatParcelizer = snackbarAudioAttributesCompatParcelizer.IconCompatParcelizer(R.string.btn_retry, new View.OnClickListener() { // from class: o.component9
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                getBookmarkType.write.AnonymousClass1.read(getbookmarktype2);
                            }
                        });
                        Snackbar snackbar2 = this.read.IconCompatParcelizer;
                        if (snackbar2 != null) {
                            snackbar2.AudioAttributesImplApi21Parcelizer();
                        }
                    } else {
                        CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer(this.read, settopbitratekbps.getWrite(), 0);
                    }
                } else if (dataSourceBitmapLoaderExternalSyntheticLambda0 instanceof setStreamingFormat) {
                    Snackbar snackbar3 = this.read.IconCompatParcelizer;
                    if (snackbar3 != null) {
                        snackbar3.RemoteActionCompatParcelizer();
                    }
                    loadPlaylistInternal loadplaylistinternal4 = this.read.write;
                    if (loadplaylistinternal4 == null) {
                        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                        loadplaylistinternal4 = null;
                    }
                    ProgressBar progressBar2 = loadplaylistinternal4.read;
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar2, "");
                    bytesRead.AudioAttributesImplApi21Parcelizer(progressBar2);
                    loadPlaylistInternal loadplaylistinternal5 = this.read.write;
                    if (loadplaylistinternal5 == null) {
                        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                    } else {
                        loadplaylistinternal = loadplaylistinternal5;
                    }
                    Group group2 = loadplaylistinternal.RemoteActionCompatParcelizer;
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(group2, "");
                    bytesRead.MediaBrowserCompatCustomActionResultReceiver(group2);
                } else if (dataSourceBitmapLoaderExternalSyntheticLambda0 instanceof decodeBitmap) {
                    Snackbar snackbar4 = this.read.IconCompatParcelizer;
                    if (snackbar4 != null) {
                        snackbar4.RemoteActionCompatParcelizer();
                    }
                    loadPlaylistInternal loadplaylistinternal6 = this.read.write;
                    if (loadplaylistinternal6 == null) {
                        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                        loadplaylistinternal6 = null;
                    }
                    ProgressBar progressBar3 = loadplaylistinternal6.read;
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar3, "");
                    bytesRead.MediaBrowserCompatCustomActionResultReceiver(progressBar3);
                    loadPlaylistInternal loadplaylistinternal7 = this.read.write;
                    if (loadplaylistinternal7 == null) {
                        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                    } else {
                        loadplaylistinternal = loadplaylistinternal7;
                    }
                    Group group3 = loadplaylistinternal.RemoteActionCompatParcelizer;
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(group3, "");
                    bytesRead.AudioAttributesImplApi21Parcelizer(group3);
                    this.read.write((List<? extends AbstractC0202setMcqId>) ((decodeBitmap) dataSourceBitmapLoaderExternalSyntheticLambda0).RemoteActionCompatParcelizer());
                } else {
                    throw new RenewEligibleCreator();
                }
                return getShowPopup.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void read(getBookmarkType getbookmarktype) {
                getbookmarktype.read().RemoteActionCompatParcelizer(getAddressLine1.read.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(getBookmarkType getbookmarktype, SampleVideos<? super AnonymousClass1> sampleVideos) {
                super(2, sampleVideos);
                this.read = getbookmarktype;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.read, sampleVideos);
                anonymousClass1.write = obj;
                return anonymousClass1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public Object invoke(DataSourceBitmapLoaderExternalSyntheticLambda0<List<AbstractC0202setMcqId>> dataSourceBitmapLoaderExternalSyntheticLambda0, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((AnonymousClass1) create(dataSourceBitmapLoaderExternalSyntheticLambda0, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.IconCompatParcelizer = 1;
                if (VerifyNewNumberRequest.AudioAttributesCompatParcelizer(getBookmarkType.this.read().IconCompatParcelizer(), new AnonymousClass1(getBookmarkType.this, null), this) == objIconCompatParcelizer) {
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
            return getBookmarkType.this.new write(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void RemoteActionCompatParcelizer() {
        getBookmarkType getbookmarktype = this;
        setBitrateKbps.RemoteActionCompatParcelizer(getbookmarktype, new write(null));
        setBitrateKbps.RemoteActionCompatParcelizer(getbookmarktype, new RemoteActionCompatParcelizer(null));
    }

    /* JADX INFO: renamed from: o.getBookmarkType$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Landroidx/fragment/app/Fragment;", "AudioAttributesCompatParcelizer", "()Landroidx/fragment/app/Fragment;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass2 extends MagicModuleUseCase implements getCreatedOnDateMs<Fragment> {
        private /* synthetic */ Fragment $RemoteActionCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.$RemoteActionCompatParcelizer;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Fragment fragment) {
            super(0);
            this.$RemoteActionCompatParcelizer = fragment;
        }
    }

    /* JADX INFO: renamed from: o.getBookmarkType$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/TypeResolutionContext;", "write", "()Lo/TypeResolutionContext;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass4 extends MagicModuleUseCase implements getCreatedOnDateMs<TypeResolutionContext> {
        private /* synthetic */ getCreatedOnDateMs $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final TypeResolutionContext invoke() {
            return (TypeResolutionContext) this.$write.invoke();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(getCreatedOnDateMs getcreatedondatems) {
            super(0);
            this.$write = getcreatedondatems;
        }
    }

    /* JADX INFO: renamed from: o.getBookmarkType$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "write", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ RenewEligible $AudioAttributesCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return _resolveFieldVsGetter.write(this.$AudioAttributesCompatParcelizer).getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(RenewEligible renewEligible) {
            super(0);
            this.$AudioAttributesCompatParcelizer = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.getBookmarkType$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "IconCompatParcelizer", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ getCreatedOnDateMs $IconCompatParcelizer = null;
        private /* synthetic */ RenewEligible $RemoteActionCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
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

    /* JADX INFO: renamed from: o.getBookmarkType$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "read", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ RenewEligible $IconCompatParcelizer;
        private /* synthetic */ Fragment $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            VisibilityChecker.RemoteActionCompatParcelizer defaultViewModelProviderFactory;
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$IconCompatParcelizer);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return (anyexplicitswithoutignoral == null || (defaultViewModelProviderFactory = anyexplicitswithoutignoral.getDefaultViewModelProviderFactory()) == null) ? this.$write.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Fragment fragment, RenewEligible renewEligible) {
            super(0);
            this.$write = fragment;
            this.$IconCompatParcelizer = renewEligible;
        }
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: o.getBookmarkType$RemoteActionCompatParcelizer$1, reason: invalid class name */
        static final class AnonymousClass1 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<DataSourceBitmapLoaderExternalSyntheticLambda0<getCity>, SampleVideos<? super getShowPopup>, Object> {
            private int AudioAttributesCompatParcelizer;
            private /* synthetic */ Object read;
            private /* synthetic */ getBookmarkType write;

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                DataSourceBitmapLoaderExternalSyntheticLambda0 dataSourceBitmapLoaderExternalSyntheticLambda0 = (DataSourceBitmapLoaderExternalSyntheticLambda0) this.read;
                getYear.IconCompatParcelizer();
                SdkPayloadData.IconCompatParcelizer(obj);
                if (dataSourceBitmapLoaderExternalSyntheticLambda0 instanceof decodeBitmap) {
                    loadPlaylistInternal loadplaylistinternal = this.write.write;
                    loadPlaylistInternal loadplaylistinternal2 = null;
                    if (loadplaylistinternal == null) {
                        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                        loadplaylistinternal = null;
                    }
                    decodeBitmap decodebitmap = (decodeBitmap) dataSourceBitmapLoaderExternalSyntheticLambda0;
                    loadplaylistinternal.AudioAttributesImplBaseParcelizer.setText(((getCity) decodebitmap.RemoteActionCompatParcelizer()).IconCompatParcelizer());
                    loadPlaylistInternal loadplaylistinternal3 = this.write.write;
                    if (loadplaylistinternal3 == null) {
                        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                        loadplaylistinternal3 = null;
                    }
                    loadplaylistinternal3.MediaBrowserCompatItemReceiver.setText(((getCity) decodebitmap.RemoteActionCompatParcelizer()).read());
                    loadPlaylistInternal loadplaylistinternal4 = this.write.write;
                    if (loadplaylistinternal4 == null) {
                        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                    } else {
                        loadplaylistinternal2 = loadplaylistinternal4;
                    }
                    loadplaylistinternal2.AudioAttributesImplApi26Parcelizer.setText(((getCity) decodebitmap.RemoteActionCompatParcelizer()).write());
                }
                return getShowPopup.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(getBookmarkType getbookmarktype, SampleVideos<? super AnonymousClass1> sampleVideos) {
                super(2, sampleVideos);
                this.write = getbookmarktype;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.write, sampleVideos);
                anonymousClass1.read = obj;
                return anonymousClass1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
            public Object invoke(DataSourceBitmapLoaderExternalSyntheticLambda0<getCity> dataSourceBitmapLoaderExternalSyntheticLambda0, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((AnonymousClass1) create(dataSourceBitmapLoaderExternalSyntheticLambda0, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.RemoteActionCompatParcelizer = 1;
                if (VerifyNewNumberRequest.AudioAttributesCompatParcelizer(getBookmarkType.this.read().AudioAttributesCompatParcelizer(), new AnonymousClass1(getBookmarkType.this, null), this) == objIconCompatParcelizer) {
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

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return getBookmarkType.this.new RemoteActionCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // o.BookmarkRequestBody.IconCompatParcelizer
    public final void read(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        LessonVideoActivity.Companion companion = LessonVideoActivity.INSTANCE;
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        startActivity(LessonVideoActivity.Companion.RemoteActionCompatParcelizer(contextRequireContext, p0, 0, false, 28));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void write(List<? extends AbstractC0202setMcqId> p0) {
        BookmarkRequestBody bookmarkRequestBody = this.RemoteActionCompatParcelizer;
        if (bookmarkRequestBody == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            bookmarkRequestBody = null;
        }
        bookmarkRequestBody.IconCompatParcelizer(p0);
    }

    /* JADX INFO: renamed from: o.getBookmarkType$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/getBookmarkType$read;", "", "<init>", "()V", "Lo/getBookmarkType;", "IconCompatParcelizer", "()Lo/getBookmarkType;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static getBookmarkType IconCompatParcelizer() {
            return new getBookmarkType();
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
