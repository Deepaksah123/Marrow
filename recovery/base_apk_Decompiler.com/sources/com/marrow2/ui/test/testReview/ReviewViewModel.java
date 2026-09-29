package com.marrow2.ui.test.testReview;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.marrow2.ui.test.testReview.ReviewViewModel;
import java.util.Iterator;
import java.util.List;
import kotlin.CmcdHeadersFactoryCmcdObjectBuilder;
import kotlin.IntermediateLoginResponseBody;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.Metadata;
import kotlin.NetworkTypeObserverApi31DisplayInfoCallback;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.Pair;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.TypeResolutionContextBasic;
import kotlin.VerifyNewNumberRequest;
import kotlin._qbuf;
import kotlin.createNotificationChannel;
import kotlin.getAnswerMap;
import kotlin.getDisplaySizeV17;
import kotlin.getMagicModuleStats;
import kotlin.getResolutionSize;
import kotlin.getShowPopup;
import kotlin.getYear;
import kotlin.isSeekPending;
import kotlin.onDisplayInfoChanged;
import kotlin.setSdkPayload;
import kotlin.setStartTime;
import kotlin.setUpdatedStatus;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.updateLoadingFinished;
import kotlin.zzbV;
import kotlin.zzhs;
import kotlin.zzht;
import kotlin.zzhu;
import kotlin.zzkx;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 :2\u00020\u0001:\u0001:B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ$\u0010'\u001a\u00020(2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001d0\"2\u0006\u0010&\u001a\u00020\u001d2\u0006\u0010)\u001a\u00020*J\u000e\u0010+\u001a\u00020(2\u0006\u0010,\u001a\u00020\u0012J\u000e\u0010-\u001a\u00020(2\u0006\u0010.\u001a\u00020*J(\u0010/\u001a\u00020(2\u0006\u00100\u001a\u00020\u001d2\u0006\u00101\u001a\u00020\u001e2\b\b\u0002\u00102\u001a\u00020\u00122\u0006\u00103\u001a\u000204J\u0006\u00105\u001a\u00020(J\u0006\u00106\u001a\u00020(J\u0006\u00107\u001a\u00020(J\u0006\u00108\u001a\u00020(J\u0006\u00109\u001a\u00020(R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0010R\"\u0010\u001b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001c0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R%\u0010\u001f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001c0\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0010R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00160\"8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001d0\"X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u001dX\u0082.¢\u0006\u0002\n\u0000¨\u0006;"}, d2 = {"Lcom/marrow2/ui/test/testReview/ReviewViewModel;", "Landroidx/lifecycle/ViewModel;", "mcqUseCase", "Lcom/marrow2/domain/mcq/McqUseCase;", "userUseCase", "Lcom/marrow2/domain/user/UserUseCase;", "analytics", "Lcom/marrow/dranalytics/base/AnalyticPublisher;", "<init>", "(Lcom/marrow2/domain/mcq/McqUseCase;Lcom/marrow2/domain/user/UserUseCase;Lcom/marrow/dranalytics/base/AnalyticPublisher;)V", "_reviewUiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/marrow2/ui/review_components/model/ReviewUIState;", "reviewUiState", "Lkotlinx/coroutines/flow/StateFlow;", "getReviewUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "_isLoading", "", "isLoading", "_mcqListContents", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "Lcom/marrow2/domain/mcq/model/McqListingUCModel;", "_navigateState", "Lcom/marrow2/ui/review_components/model/ReviewNavigateUiState;", "navigateState", "getNavigateState", "_bookmarkBroadcastDispatcher", "Lkotlin/Pair;", "", "Lcom/marrow2/domain/mcq/model/BookmarkType;", "bookmarkBroadcastDispatcher", "getBookmarkBroadcastDispatcher", "mcqListContents", "", "getMcqListContents", "()Ljava/util/List;", "mcqIds", "parentId", "initMcqs", "", "currentPagerPosition", "", "setShowAnswerParent", "showAnswer", "onItemSelected", "position", "onBookmarked", "mcqId", "bookmarkType", "uiOnly", "parentType", "Lcom/marrow2/ui/review_components/model/ReviewParentType;", "clearBookmarkBroadCast", "onShakeTooltipShown", "onDoubleTapOverlayShown", "onDoubleTapDialogueShown", "clearNavigation", "Companion", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ReviewViewModel extends POJOPropertyBuilderWithMember {
    public static final read IconCompatParcelizer = new read(null);
    private final SnapshotStateList<createNotificationChannel> AudioAttributesCompatParcelizer;
    private final setUpdatedStatus<Boolean> AudioAttributesImplApi21Parcelizer;
    private final setUpdatedStatus<Pair<String, onDisplayInfoChanged>> AudioAttributesImplApi26Parcelizer;
    private List<String> AudioAttributesImplBaseParcelizer;
    private final getResolutionSize<zzhu> MediaBrowserCompatCustomActionResultReceiver;
    private final isSeekPending MediaBrowserCompatItemReceiver;
    private final setUpdatedStatus<zzhu> MediaBrowserCompatMediaItem;
    private final NetworkTypeObserverApi31DisplayInfoCallback MediaBrowserCompatSearchResultReceiver;
    private final setUpdatedStatus<zzht> MediaDescriptionCompat;
    private String MediaMetadataCompat;
    private final getDisplaySizeV17 RatingCompat;
    private final getResolutionSize<Boolean> RemoteActionCompatParcelizer;
    private final getResolutionSize<Pair<String, onDisplayInfoChanged>> read;
    private final getResolutionSize<zzht> write;

    public static final /* synthetic */ class AudioAttributesCompatParcelizer {
        public static final /* synthetic */ int[] AudioAttributesCompatParcelizer;

        static {
            int[] iArr = new int[zzhs.values().length];
            try {
                iArr[zzhs.write.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[zzhs.RemoteActionCompatParcelizer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[zzhs.read.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            AudioAttributesCompatParcelizer = iArr;
        }
    }

    @setSdkPayload
    public ReviewViewModel(NetworkTypeObserverApi31DisplayInfoCallback networkTypeObserverApi31DisplayInfoCallback, getDisplaySizeV17 getdisplaysizev17, isSeekPending isseekpending) {
        toMagicModuleMetaRepoModel.write(networkTypeObserverApi31DisplayInfoCallback, "");
        toMagicModuleMetaRepoModel.write(getdisplaysizev17, "");
        toMagicModuleMetaRepoModel.write(isseekpending, "");
        this.MediaBrowserCompatSearchResultReceiver = networkTypeObserverApi31DisplayInfoCallback;
        this.RatingCompat = getdisplaysizev17;
        this.MediaBrowserCompatItemReceiver = isseekpending;
        getResolutionSize<zzhu> getresolutionsizeRemoteActionCompatParcelizer = setStartTime.RemoteActionCompatParcelizer(new zzhu(0, null, null, false, false, false, false, 127, null));
        this.MediaBrowserCompatCustomActionResultReceiver = getresolutionsizeRemoteActionCompatParcelizer;
        this.MediaBrowserCompatMediaItem = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer);
        getResolutionSize<Boolean> getresolutionsizeRemoteActionCompatParcelizer2 = setStartTime.RemoteActionCompatParcelizer(Boolean.TRUE);
        this.RemoteActionCompatParcelizer = getresolutionsizeRemoteActionCompatParcelizer2;
        this.AudioAttributesImplApi21Parcelizer = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer2);
        this.AudioAttributesCompatParcelizer = _qbuf.write();
        getResolutionSize<zzht> getresolutionsizeRemoteActionCompatParcelizer3 = setStartTime.RemoteActionCompatParcelizer(zzht.write.INSTANCE);
        this.write = getresolutionsizeRemoteActionCompatParcelizer3;
        this.MediaDescriptionCompat = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer3);
        getResolutionSize<Pair<String, onDisplayInfoChanged>> getresolutionsizeRemoteActionCompatParcelizer4 = setStartTime.RemoteActionCompatParcelizer(null);
        this.read = getresolutionsizeRemoteActionCompatParcelizer4;
        this.AudioAttributesImplApi26Parcelizer = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer4);
    }

    public final setUpdatedStatus<zzhu> MediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatMediaItem;
    }

    public final setUpdatedStatus<Boolean> MediaBrowserCompatItemReceiver() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final setUpdatedStatus<zzht> AudioAttributesImplApi21Parcelizer() {
        return this.MediaDescriptionCompat;
    }

    public final setUpdatedStatus<Pair<String, onDisplayInfoChanged>> IconCompatParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final List<createNotificationChannel> AudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final void write(List<String> list, String str, int i) {
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(str, "");
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer().RemoteActionCompatParcelizer(), list)) {
            return;
        }
        this.MediaMetadataCompat = str;
        this.AudioAttributesImplBaseParcelizer = list;
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new RemoteActionCompatParcelizer(list, i, str, null), new MagicModuleSubmissionRequestBody() { // from class: o.setFabAnimationMode
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return ReviewViewModel.AudioAttributesCompatParcelizer(this.write, (String) obj2);
            }
        });
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;
        private Object AudioAttributesImplApi26Parcelizer;
        private int AudioAttributesImplBaseParcelizer;
        private /* synthetic */ String IconCompatParcelizer;
        private int MediaBrowserCompatCustomActionResultReceiver;
        private /* synthetic */ List<String> RemoteActionCompatParcelizer;
        private int read;
        private /* synthetic */ int write;

        /* JADX WARN: Removed duplicated region for block: B:21:0x00b3  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00b5  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00d5  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00d7  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00f9  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00fc  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0119  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x011b  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x011e  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0120  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0123  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0126  */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                Method dump skipped, instruction units count: 324
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.test.testReview.ReviewViewModel.RemoteActionCompatParcelizer.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        RemoteActionCompatParcelizer(List<String> list, int i, String str, SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
            this.RemoteActionCompatParcelizer = list;
            this.write = i;
            this.IconCompatParcelizer = str;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return ReviewViewModel.this.new RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, this.write, this.IconCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(ReviewViewModel reviewViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        reviewViewModel.RemoteActionCompatParcelizer.write(Boolean.FALSE);
        reviewViewModel.write.write(new zzht.AudioAttributesCompatParcelizer(str));
        return getShowPopup.INSTANCE;
    }

    public final void IconCompatParcelizer(boolean z) {
        getResolutionSize<zzhu> getresolutionsize = this.MediaBrowserCompatCustomActionResultReceiver;
        getresolutionsize.write(zzhu.IconCompatParcelizer(getresolutionsize.IconCompatParcelizer(), 0, null, null, false, false, false, z, 63));
    }

    public final void IconCompatParcelizer(int i) {
        getResolutionSize<zzhu> getresolutionsize = this.MediaBrowserCompatCustomActionResultReceiver;
        getresolutionsize.write(zzhu.IconCompatParcelizer(getresolutionsize.IconCompatParcelizer(), i, null, null, false, false, false, false, 126));
    }

    public final void write(final String str, onDisplayInfoChanged ondisplayinfochanged, boolean z, zzhs zzhsVar) {
        zzkx zzkxVar;
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(ondisplayinfochanged, "");
        toMagicModuleMetaRepoModel.write(zzhsVar, "");
        Iterator<createNotificationChannel> it = this.AudioAttributesCompatParcelizer.iterator();
        final int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) it.next().getIconCompatParcelizer(), (Object) str)) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            SnapshotStateList<createNotificationChannel> snapshotStateList = this.AudioAttributesCompatParcelizer;
            createNotificationChannel createnotificationchannel = snapshotStateList.get(i);
            snapshotStateList.set(i, createNotificationChannel.RemoteActionCompatParcelizer(createnotificationchannel.IconCompatParcelizer, createnotificationchannel.AudioAttributesCompatParcelizer, ondisplayinfochanged, createnotificationchannel.MediaBrowserCompatCustomActionResultReceiver, createnotificationchannel.AudioAttributesImplBaseParcelizer, createnotificationchannel.AudioAttributesImplApi21Parcelizer, createnotificationchannel.RemoteActionCompatParcelizer));
            if (z) {
                return;
            }
            int i2 = AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer[zzhsVar.ordinal()];
            if (i2 == 1) {
                zzkxVar = zzkx.AudioAttributesImplBaseParcelizer;
            } else if (i2 == 2) {
                zzkxVar = zzkx.RemoteActionCompatParcelizer;
            } else if (i2 == 3) {
                zzkxVar = zzkx.IconCompatParcelizer;
            } else {
                zzkxVar = zzkx.AudioAttributesImplApi21Parcelizer;
            }
            this.MediaBrowserCompatItemReceiver.write(zzbV.RemoteActionCompatParcelizer(ondisplayinfochanged.ordinal(), zzkxVar), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
            this.read.write(new Pair<>(str, ondisplayinfochanged));
            CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new write(str, ondisplayinfochanged, null), new MagicModuleSubmissionRequestBody() { // from class: o.setFabCradleMargin
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return ReviewViewModel.RemoteActionCompatParcelizer(this.write, str, i, (String) obj2);
                }
            });
        }
    }

    static final class write extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;
        private /* synthetic */ String read;
        private /* synthetic */ onDisplayInfoChanged write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.IconCompatParcelizer = 1;
                if (ReviewViewModel.this.MediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer(this.read, this.write, this) == objIconCompatParcelizer) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        write(String str, onDisplayInfoChanged ondisplayinfochanged, SampleVideos<? super write> sampleVideos) {
            super(1, sampleVideos);
            this.read = str;
            this.write = ondisplayinfochanged;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return ReviewViewModel.this.new write(this.read, this.write, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(ReviewViewModel reviewViewModel, String str, int i, String str2) {
        toMagicModuleMetaRepoModel.write(str2, "");
        reviewViewModel.write.write(new zzht.AudioAttributesCompatParcelizer(str2));
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(reviewViewModel), reviewViewModel.new IconCompatParcelizer(str, i, null), new MagicModuleSubmissionRequestBody() { // from class: o.setFabAlignmentModeEndMargin
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return ReviewViewModel.AudioAttributesImplBaseParcelizer((String) obj2);
            }
        });
        return getShowPopup.INSTANCE;
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;
        private /* synthetic */ String IconCompatParcelizer;
        private /* synthetic */ int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.AudioAttributesCompatParcelizer = 1;
                obj = ReviewViewModel.this.MediaBrowserCompatSearchResultReceiver.write(this.IconCompatParcelizer, this);
                if (obj == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            onDisplayInfoChanged ondisplayinfochanged = (onDisplayInfoChanged) obj;
            SnapshotStateList snapshotStateList = ReviewViewModel.this.AudioAttributesCompatParcelizer;
            int i2 = this.write;
            createNotificationChannel createnotificationchannel = (createNotificationChannel) ReviewViewModel.this.AudioAttributesCompatParcelizer.get(this.write);
            snapshotStateList.set(i2, createNotificationChannel.RemoteActionCompatParcelizer(createnotificationchannel.IconCompatParcelizer, createnotificationchannel.AudioAttributesCompatParcelizer, ondisplayinfochanged, createnotificationchannel.MediaBrowserCompatCustomActionResultReceiver, createnotificationchannel.AudioAttributesImplBaseParcelizer, createnotificationchannel.AudioAttributesImplApi21Parcelizer, createnotificationchannel.RemoteActionCompatParcelizer));
            ReviewViewModel.this.read.write(new Pair(this.IconCompatParcelizer, ondisplayinfochanged));
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(String str, int i, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
            this.IconCompatParcelizer = str;
            this.write = i;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return ReviewViewModel.this.new IconCompatParcelizer(this.IconCompatParcelizer, this.write, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplBaseParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    public final void AudioAttributesCompatParcelizer() {
        this.read.write(null);
    }

    static final class AudioAttributesImplBaseParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.read = 1;
                if (ReviewViewModel.this.RatingCompat.setSessionImpl(this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            ReviewViewModel.this.MediaBrowserCompatCustomActionResultReceiver.write(zzhu.IconCompatParcelizer((zzhu) ReviewViewModel.this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(), 0, null, null, true, false, false, false, 103));
            return getShowPopup.INSTANCE;
        }

        AudioAttributesImplBaseParcelizer(SampleVideos<? super AudioAttributesImplBaseParcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return ReviewViewModel.this.new AudioAttributesImplBaseParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplBaseParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public final void MediaBrowserCompatSearchResultReceiver() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AudioAttributesImplBaseParcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.BottomAppBarBehavior
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return ReviewViewModel.AudioAttributesImplApi26Parcelizer((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplApi26Parcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    static final class MediaBrowserCompatItemReceiver extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0078, code lost:
        
            if (r12.RemoteActionCompatParcelizer.RatingCompat.onStop(r12) != r0) goto L19;
         */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                int r1 = r12.AudioAttributesCompatParcelizer
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L25
                if (r1 == r4) goto L21
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                kotlin.SdkPayloadData.IconCompatParcelizer(r13)
                goto L7b
            L15:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r13)
                throw r12
            L1d:
                kotlin.SdkPayloadData.IconCompatParcelizer(r13)
                goto L46
            L21:
                kotlin.SdkPayloadData.IconCompatParcelizer(r13)
                goto L39
            L25:
                kotlin.SdkPayloadData.IconCompatParcelizer(r13)
                com.marrow2.ui.test.testReview.ReviewViewModel r13 = com.marrow2.ui.test.testReview.ReviewViewModel.this
                o.getDisplaySizeV17 r13 = com.marrow2.ui.test.testReview.ReviewViewModel.AudioAttributesCompatParcelizer(r13)
                r1 = r12
                o.SampleVideos r1 = (kotlin.SampleVideos) r1
                r12.AudioAttributesCompatParcelizer = r4
                java.lang.Object r13 = r13.onSetRating(r1)
                if (r13 == r0) goto L7e
            L39:
                r13 = r12
                o.SampleVideos r13 = (kotlin.SampleVideos) r13
                r12.AudioAttributesCompatParcelizer = r3
                r3 = 200(0xc8, double:9.9E-322)
                java.lang.Object r13 = kotlin.setCountry.IconCompatParcelizer(r3, r13)
                if (r13 == r0) goto L7e
            L46:
                com.marrow2.ui.test.testReview.ReviewViewModel r13 = com.marrow2.ui.test.testReview.ReviewViewModel.this
                o.getResolutionSize r13 = com.marrow2.ui.test.testReview.ReviewViewModel.AudioAttributesImplApi26Parcelizer(r13)
                com.marrow2.ui.test.testReview.ReviewViewModel r1 = com.marrow2.ui.test.testReview.ReviewViewModel.this
                o.getResolutionSize r1 = com.marrow2.ui.test.testReview.ReviewViewModel.AudioAttributesImplApi26Parcelizer(r1)
                java.lang.Object r1 = r1.IconCompatParcelizer()
                r3 = r1
                o.zzhu r3 = (kotlin.zzhu) r3
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 1
                r10 = 0
                r11 = 87
                o.zzhu r1 = kotlin.zzhu.IconCompatParcelizer(r3, r4, r5, r6, r7, r8, r9, r10, r11)
                r13.write(r1)
                com.marrow2.ui.test.testReview.ReviewViewModel r13 = com.marrow2.ui.test.testReview.ReviewViewModel.this
                o.getDisplaySizeV17 r13 = com.marrow2.ui.test.testReview.ReviewViewModel.AudioAttributesCompatParcelizer(r13)
                r1 = r12
                o.SampleVideos r1 = (kotlin.SampleVideos) r1
                r12.AudioAttributesCompatParcelizer = r2
                java.lang.Object r12 = r13.onStop(r1)
                if (r12 != r0) goto L7b
                goto L7e
            L7b:
                o.getShowPopup r12 = kotlin.getShowPopup.INSTANCE
                return r12
            L7e:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.test.testReview.ReviewViewModel.MediaBrowserCompatItemReceiver.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        MediaBrowserCompatItemReceiver(SampleVideos<? super MediaBrowserCompatItemReceiver> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return ReviewViewModel.this.new MediaBrowserCompatItemReceiver(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatItemReceiver) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public final void RatingCompat() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new MediaBrowserCompatItemReceiver(null), new MagicModuleSubmissionRequestBody() { // from class: o.setHideOnScroll
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return ReviewViewModel.AudioAttributesImplApi21Parcelizer((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplApi21Parcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    static final class AudioAttributesImplApi21Parcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            ReviewViewModel.this.MediaBrowserCompatCustomActionResultReceiver.write(zzhu.IconCompatParcelizer((zzhu) ReviewViewModel.this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(), 0, null, null, false, false, false, false, 95));
            return getShowPopup.INSTANCE;
        }

        AudioAttributesImplApi21Parcelizer(SampleVideos<? super AudioAttributesImplApi21Parcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return ReviewViewModel.this.new AudioAttributesImplApi21Parcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplApi21Parcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public final void AudioAttributesImplBaseParcelizer() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AudioAttributesImplApi21Parcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.setFabAnchorMode
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return ReviewViewModel.MediaBrowserCompatCustomActionResultReceiver((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatCustomActionResultReceiver(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    public final void read() {
        this.write.write(zzht.write.INSTANCE);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/marrow2/ui/test/testReview/ReviewViewModel$read;", "", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class read {
        private read() {
        }

        public /* synthetic */ read(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
