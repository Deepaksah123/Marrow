package com.marrow2.ui.plan.plan_validity.viewmodel;

import com.marrow2.ui.plan.plan_validity.viewmodel.PlanValidityViewModel;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.CmcdHeadersFactoryCmcdObjectBuilder;
import kotlin.DynamiteModule;
import kotlin.IntermediateLoginResponseBody;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.Metadata;
import kotlin.OnDelegateCreatedListener;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.QBankStatsResponse;
import kotlin.RemoteCreator;
import kotlin.RenewEligibleCreator;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.TypeResolutionContextBasic;
import kotlin.VerifyNewNumberRequest;
import kotlin.binarySearchCeil;
import kotlin.getAnswerMap;
import kotlin.getConfigExpirySeconds;
import kotlin.getDisplaySizeV17;
import kotlin.getLocalVersion;
import kotlin.getMagicModuleStats;
import kotlin.getPlayoutDurationForMediaDuration;
import kotlin.getRemoteVersion;
import kotlin.getResolutionSize;
import kotlin.getShowPopup;
import kotlin.getYear;
import kotlin.parseDtsxChannelConfiguration;
import kotlin.setSdkPayload;
import kotlin.setStartTime;
import kotlin.setUpdatedStatus;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.unwrap;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0017R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00160\u00198\u0007¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0011\u0010\u001cR \u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u00158\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R&\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u00198\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b\u0014\u0010\u001cR \u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u001d0\u00158\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0017R&\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u001d0\u00198\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b\n\u0010\u001cR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020#0\u00158\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0017R \u0010\f\u001a\b\u0012\u0004\u0012\u00020#0\u00198\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u001b\u001a\u0004\b!\u0010\u001cR\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u00158\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0017R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020%0\u00198\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001b\u001a\u0004\b\u0012\u0010\u001c"}, d2 = {"Lcom/marrow2/ui/plan/plan_validity/viewmodel/PlanValidityViewModel;", "Lo/POJOPropertyBuilderWithMember;", "Lo/getDisplaySizeV17;", "p0", "Lo/binarySearchCeil;", "p1", "<init>", "(Lo/getDisplaySizeV17;Lo/binarySearchCeil;)V", "Lo/getRemoteVersion;", "", "AudioAttributesCompatParcelizer", "(Lo/getRemoteVersion;)V", "MediaBrowserCompatItemReceiver", "()V", "AudioAttributesImplApi21Parcelizer", "MediaBrowserCompatSearchResultReceiver", "Lo/getDisplaySizeV17;", "read", "MediaBrowserCompatCustomActionResultReceiver", "Lo/binarySearchCeil;", "IconCompatParcelizer", "Lo/getResolutionSize;", "Lo/getLocalVersion;", "Lo/getResolutionSize;", "RemoteActionCompatParcelizer", "Lo/setUpdatedStatus;", "RatingCompat", "Lo/setUpdatedStatus;", "()Lo/setUpdatedStatus;", "", "Lo/DynamiteModule;", "write", "AudioAttributesImplBaseParcelizer", "AudioAttributesImplApi26Parcelizer", "Lo/OnDelegateCreatedListener;", "Lo/unwrap;", "MediaBrowserCompatMediaItem", ""}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PlanValidityViewModel extends POJOPropertyBuilderWithMember {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<Boolean> MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final setUpdatedStatus<Boolean> MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final getResolutionSize<unwrap> AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final setUpdatedStatus<List<DynamiteModule>> AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<getLocalVersion> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final binarySearchCeil IconCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final setUpdatedStatus<List<OnDelegateCreatedListener>> MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private final setUpdatedStatus<unwrap> MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private final getDisplaySizeV17 read;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private final setUpdatedStatus<getLocalVersion> AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<List<DynamiteModule>> write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final getResolutionSize<List<OnDelegateCreatedListener>> AudioAttributesImplBaseParcelizer;

    @setSdkPayload
    public PlanValidityViewModel(getDisplaySizeV17 getdisplaysizev17, binarySearchCeil binarysearchceil) {
        toMagicModuleMetaRepoModel.write(getdisplaysizev17, "");
        toMagicModuleMetaRepoModel.write(binarysearchceil, "");
        this.read = getdisplaysizev17;
        this.IconCompatParcelizer = binarysearchceil;
        getResolutionSize<getLocalVersion> getresolutionsizeRemoteActionCompatParcelizer = setStartTime.RemoteActionCompatParcelizer(new getLocalVersion(false, null, false, null, false, null, false, 127, null));
        this.RemoteActionCompatParcelizer = getresolutionsizeRemoteActionCompatParcelizer;
        this.AudioAttributesCompatParcelizer = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer);
        getResolutionSize<List<DynamiteModule>> getresolutionsizeRemoteActionCompatParcelizer2 = setStartTime.RemoteActionCompatParcelizer(IntermediateLoginResponseBody.RemoteActionCompatParcelizer());
        this.write = getresolutionsizeRemoteActionCompatParcelizer2;
        this.AudioAttributesImplApi26Parcelizer = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer2);
        getResolutionSize<List<OnDelegateCreatedListener>> getresolutionsizeRemoteActionCompatParcelizer3 = setStartTime.RemoteActionCompatParcelizer(IntermediateLoginResponseBody.RemoteActionCompatParcelizer());
        this.AudioAttributesImplBaseParcelizer = getresolutionsizeRemoteActionCompatParcelizer3;
        this.MediaBrowserCompatCustomActionResultReceiver = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer3);
        getResolutionSize<unwrap> getresolutionsizeRemoteActionCompatParcelizer4 = setStartTime.RemoteActionCompatParcelizer(unwrap.RemoteActionCompatParcelizer.INSTANCE);
        this.AudioAttributesImplApi21Parcelizer = getresolutionsizeRemoteActionCompatParcelizer4;
        this.MediaBrowserCompatItemReceiver = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer4);
        getResolutionSize<Boolean> getresolutionsizeRemoteActionCompatParcelizer5 = setStartTime.RemoteActionCompatParcelizer(Boolean.FALSE);
        this.MediaBrowserCompatMediaItem = getresolutionsizeRemoteActionCompatParcelizer5;
        this.MediaBrowserCompatSearchResultReceiver = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer5);
        MediaBrowserCompatItemReceiver();
        AudioAttributesImplApi21Parcelizer();
    }

    public final setUpdatedStatus<getLocalVersion> read() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final setUpdatedStatus<List<DynamiteModule>> IconCompatParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final setUpdatedStatus<List<OnDelegateCreatedListener>> AudioAttributesCompatParcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final setUpdatedStatus<unwrap> AudioAttributesImplApi26Parcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final setUpdatedStatus<Boolean> MediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    public final void AudioAttributesCompatParcelizer(getRemoteVersion p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, getRemoteVersion.IconCompatParcelizer.INSTANCE)) {
            this.AudioAttributesImplApi21Parcelizer.write(unwrap.RemoteActionCompatParcelizer.INSTANCE);
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, getRemoteVersion.read.INSTANCE)) {
            getResolutionSize<unwrap> getresolutionsize = this.AudioAttributesImplApi21Parcelizer;
            parseDtsxChannelConfiguration.Companion companion = parseDtsxChannelConfiguration.INSTANCE;
            getresolutionsize.write(new unwrap.IconCompatParcelizer(parseDtsxChannelConfiguration.Companion.AudioAttributesCompatParcelizer()));
        } else {
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, getRemoteVersion.write.INSTANCE)) {
                this.AudioAttributesImplApi21Parcelizer.write(unwrap.AudioAttributesCompatParcelizer.INSTANCE);
                return;
            }
            if (p0 instanceof getRemoteVersion.AudioAttributesCompatParcelizer) {
                this.AudioAttributesImplApi21Parcelizer.write(new unwrap.read(((getRemoteVersion.AudioAttributesCompatParcelizer) p0).write()));
            } else {
                if (!(p0 instanceof getRemoteVersion.RemoteActionCompatParcelizer)) {
                    throw new RenewEligibleCreator();
                }
                getResolutionSize<getLocalVersion> getresolutionsize2 = this.RemoteActionCompatParcelizer;
                getresolutionsize2.write(getLocalVersion.RemoteActionCompatParcelizer(getresolutionsize2.IconCompatParcelizer(), false, null, false, null, false, null, !this.RemoteActionCompatParcelizer.IconCompatParcelizer().getRead(), 63));
            }
        }
    }

    private final void MediaBrowserCompatItemReceiver() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new IconCompatParcelizer(System.currentTimeMillis(), null), new MagicModuleSubmissionRequestBody() { // from class: o.RemoteCreatorRemoteCreatorException
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return PlanValidityViewModel.write((String) obj2);
            }
        });
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;
        private Object AudioAttributesImplApi21Parcelizer;
        private long AudioAttributesImplApi26Parcelizer;
        private Object AudioAttributesImplBaseParcelizer;
        private int IconCompatParcelizer;
        private Object MediaBrowserCompatCustomActionResultReceiver;
        private Object MediaBrowserCompatItemReceiver;
        private Object MediaBrowserCompatMediaItem;
        private Object MediaBrowserCompatSearchResultReceiver;
        private Object MediaDescriptionCompat;
        private int MediaMetadataCompat;
        private Object RatingCompat;
        private /* synthetic */ long RemoteActionCompatParcelizer;
        private int read;
        private int write;

        /* JADX WARN: Code restructure failed: missing block: B:11:0x004f, code lost:
        
            if (r2 != r1) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x016d, code lost:
        
            if (r2 == r1) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x019c, code lost:
        
            return r1;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:15:0x006e  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0199  */
        /* JADX WARN: Type inference failed for: r13v12 */
        /* JADX WARN: Type inference failed for: r13v14 */
        /* JADX WARN: Type inference failed for: r13v16 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00b3 -> B:45:0x0188). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00ea -> B:45:0x0188). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x011c -> B:45:0x0188). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x016d -> B:39:0x0170). Please report as a decompilation issue!!! */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r23) {
            /*
                Method dump skipped, instruction units count: 413
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.plan.plan_validity.viewmodel.PlanValidityViewModel.IconCompatParcelizer.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(long j, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
            this.RemoteActionCompatParcelizer = j;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return PlanValidityViewModel.this.new IconCompatParcelizer(this.RemoteActionCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class write extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;

        public static final class AudioAttributesCompatParcelizer<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return getConfigExpirySeconds.read(Long.valueOf(((OnDelegateCreatedListener) t2).IconCompatParcelizer()), Long.valueOf(((OnDelegateCreatedListener) t).IconCompatParcelizer()));
            }
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                PlanValidityViewModel.this.MediaBrowserCompatMediaItem.write(QBankStatsResponse.AudioAttributesCompatParcelizer(true));
                this.AudioAttributesCompatParcelizer = 1;
                obj = PlanValidityViewModel.this.read.onCommand(this);
                if (obj == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            Iterable iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(RemoteCreator.AudioAttributesCompatParcelizer((getPlayoutDurationForMediaDuration) it.next()));
            }
            ArrayList arrayList2 = arrayList;
            IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Iterable) arrayList2, (Comparator) new AudioAttributesCompatParcelizer());
            OnDelegateCreatedListener onDelegateCreatedListener = (OnDelegateCreatedListener) IntermediateLoginResponseBody.MediaBrowserCompatSearchResultReceiver((List) arrayList2);
            if (onDelegateCreatedListener != null) {
                onDelegateCreatedListener.write(true);
            }
            PlanValidityViewModel.this.AudioAttributesImplBaseParcelizer.write(arrayList2);
            PlanValidityViewModel.this.MediaBrowserCompatMediaItem.write(QBankStatsResponse.AudioAttributesCompatParcelizer(false));
            return getShowPopup.INSTANCE;
        }

        write(SampleVideos<? super write> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return PlanValidityViewModel.this.new write(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    private final void AudioAttributesImplApi21Parcelizer() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new write(null), new MagicModuleSubmissionRequestBody() { // from class: o.SupportFragmentWrapper
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return PlanValidityViewModel.IconCompatParcelizer(this.RemoteActionCompatParcelizer, ((Integer) obj).intValue(), (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(PlanValidityViewModel planValidityViewModel, int i, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        planValidityViewModel.MediaBrowserCompatMediaItem.write(Boolean.FALSE);
        if (i == 502) {
            planValidityViewModel.AudioAttributesImplApi21Parcelizer.write(unwrap.MediaBrowserCompatCustomActionResultReceiver.INSTANCE);
        } else {
            planValidityViewModel.AudioAttributesImplApi21Parcelizer.write(unwrap.write.INSTANCE);
        }
        return getShowPopup.INSTANCE;
    }
}
