package com.marrow2.ui.signup.college.viewmodel;

import com.marrow.data.models.test.TestIndex;
import com.marrow2.data.user.remote.model.CollegeDetails;
import com.marrow2.ui.signup.college.viewmodel.CollegeSelectionParentViewModel;
import java.util.List;
import kotlin.BitmapDescriptorFactory;
import kotlin.CmcdHeadersFactoryCmcdObjectBuilder;
import kotlin.IntermediateLoginResponseBody;
import kotlin.LatLngBounds;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.MapLifecycleDelegate;
import kotlin.Metadata;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.Pair;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.TopUserCompanion;
import kotlin.TypeResolutionContextBasic;
import kotlin.VerifyNewNumberRequest;
import kotlin.defaultMarker;
import kotlin.getAnswerMap;
import kotlin.getDisplaySizeV17;
import kotlin.getMagicModuleStats;
import kotlin.getResolutionSize;
import kotlin.getShowPopup;
import kotlin.getYear;
import kotlin.peekChar;
import kotlin.setMbbsVerificationYear;
import kotlin.setModifiedEndTimestampMs;
import kotlin.setSdkPayload;
import kotlin.setStartTime;
import kotlin.setUpdatedStatus;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\nJ\u0015\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\u0010J\u001d\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\rJ\u0019\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000b2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\b0\u0018¢\u0006\u0004\b\u0011\u0010\u001aJ\r\u0010\u001b\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\nJ\u000f\u0010\u001c\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001c\u0010\nJ\r\u0010\u001d\u001a\u00020\b¢\u0006\u0004\b\u001d\u0010\nR\u0017\u0010\u000e\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u001a\u0010\f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b'\u0010(R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020&0)8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010*\u001a\u0004\b+\u0010,R\u001e\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010-0%8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010(R\"\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010-0)8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010*\u001a\u0004\b!\u0010,R\u0016\u0010\u0013\u001a\u00020.8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\f\u0010/R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020-008\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u00101\u001a\u0004\b2\u00103"}, d2 = {"Lcom/marrow2/ui/signup/college/viewmodel/CollegeSelectionParentViewModel;", "Lo/POJOPropertyBuilderWithMember;", "Lo/peekChar;", "p0", "Lo/getDisplaySizeV17;", "p1", "<init>", "(Lo/peekChar;Lo/getDisplaySizeV17;)V", "", "MediaDescriptionCompat", "()V", "", "AudioAttributesCompatParcelizer", "()Ljava/lang/String;", "read", "onCustomAction", "(Ljava/lang/String;)V", "RemoteActionCompatParcelizer", "(Ljava/lang/String;Ljava/lang/String;)V", "AudioAttributesImplApi21Parcelizer", "Lo/getSubscriptionExpiresOn;", "", "MediaBrowserCompatCustomActionResultReceiver", "()Lo/getSubscriptionExpiresOn;", "Lkotlin/Function1;", "Lo/LatLngBounds;", "(Ljava/lang/String;Lo/getAnswerMap;)V", "MediaBrowserCompatSearchResultReceiver", "MediaMetadataCompat", "MediaBrowserCompatMediaItem", "AudioAttributesImplApi26Parcelizer", "Lo/peekChar;", "()Lo/peekChar;", "AudioAttributesImplBaseParcelizer", "Lo/getDisplaySizeV17;", "RatingCompat", "()Lo/getDisplaySizeV17;", "Lo/getResolutionSize;", "Lo/MapLifecycleDelegate;", "write", "Lo/getResolutionSize;", "Lo/setUpdatedStatus;", "Lo/setUpdatedStatus;", "IconCompatParcelizer", "()Lo/setUpdatedStatus;", "Lo/defaultMarker;", "Lo/BitmapDescriptorFactory;", "Lo/BitmapDescriptorFactory;", "", "Ljava/util/List;", "MediaBrowserCompatItemReceiver", "()Ljava/util/List;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CollegeSelectionParentViewModel extends POJOPropertyBuilderWithMember {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private BitmapDescriptorFactory AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final peekChar read;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final getDisplaySizeV17 AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final setUpdatedStatus<defaultMarker> AudioAttributesImplBaseParcelizer;
    private final List<defaultMarker> MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private getResolutionSize<defaultMarker> IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final setUpdatedStatus<MapLifecycleDelegate> RemoteActionCompatParcelizer;
    private final getResolutionSize<MapLifecycleDelegate> write;

    @setSdkPayload
    public CollegeSelectionParentViewModel(peekChar peekchar, getDisplaySizeV17 getdisplaysizev17) {
        toMagicModuleMetaRepoModel.write(peekchar, "");
        toMagicModuleMetaRepoModel.write(getdisplaysizev17, "");
        this.read = peekchar;
        this.AudioAttributesCompatParcelizer = getdisplaysizev17;
        getResolutionSize<MapLifecycleDelegate> getresolutionsizeRemoteActionCompatParcelizer = setStartTime.RemoteActionCompatParcelizer(MapLifecycleDelegate.read);
        this.write = getresolutionsizeRemoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer);
        getResolutionSize<defaultMarker> getresolutionsizeRemoteActionCompatParcelizer2 = setStartTime.RemoteActionCompatParcelizer(null);
        this.IconCompatParcelizer = getresolutionsizeRemoteActionCompatParcelizer2;
        this.AudioAttributesImplBaseParcelizer = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer2);
        this.AudioAttributesImplApi21Parcelizer = new BitmapDescriptorFactory(null, null, null, null, null, 31, null);
        this.MediaBrowserCompatCustomActionResultReceiver = IntermediateLoginResponseBody.write(defaultMarker.AudioAttributesImplApi26Parcelizer, defaultMarker.read, defaultMarker.AudioAttributesImplBaseParcelizer, defaultMarker.AudioAttributesCompatParcelizer, defaultMarker.RemoteActionCompatParcelizer, defaultMarker.IconCompatParcelizer, defaultMarker.write);
        MediaDescriptionCompat();
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final peekChar getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: RatingCompat, reason: from getter */
    public final getDisplaySizeV17 getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final setUpdatedStatus<MapLifecycleDelegate> IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final setUpdatedStatus<defaultMarker> AudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final List<defaultMarker> MediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;

        /* JADX INFO: renamed from: com.marrow2.ui.signup.college.viewmodel.CollegeSelectionParentViewModel$RemoteActionCompatParcelizer$4, reason: invalid class name */
        static final class AnonymousClass4 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
            private int AudioAttributesCompatParcelizer;
            private /* synthetic */ CollegeSelectionParentViewModel IconCompatParcelizer;
            private Object RemoteActionCompatParcelizer;

            /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x00c1  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x00ca  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x00eb  */
            /* JADX WARN: Removed duplicated region for block: B:30:0x0102  */
            @Override // kotlin.getMonthName
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r15) {
                /*
                    Method dump skipped, instruction units count: 292
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.signup.college.viewmodel.CollegeSelectionParentViewModel.RemoteActionCompatParcelizer.AnonymousClass4.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(CollegeSelectionParentViewModel collegeSelectionParentViewModel, SampleVideos<? super AnonymousClass4> sampleVideos) {
                super(2, sampleVideos);
                this.IconCompatParcelizer = collegeSelectionParentViewModel;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                return new AnonymousClass4(this.IconCompatParcelizer, sampleVideos);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((AnonymousClass4) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.IconCompatParcelizer = 1;
                if (setModifiedEndTimestampMs.RemoteActionCompatParcelizer(setMbbsVerificationYear.write(), new AnonymousClass4(CollegeSelectionParentViewModel.this, null), this) == objIconCompatParcelizer) {
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
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return CollegeSelectionParentViewModel.this.new RemoteActionCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void MediaDescriptionCompat() {
        onCustomAction();
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new RemoteActionCompatParcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.ButtCap
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return CollegeSelectionParentViewModel.RemoteActionCompatParcelizer((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    public final String AudioAttributesCompatParcelizer() {
        String write = this.AudioAttributesImplApi21Parcelizer.getWrite();
        return write == null ? "" : write;
    }

    public final String read() {
        String read2 = this.AudioAttributesImplApi21Parcelizer.getRead();
        return read2 == null ? "" : read2;
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private Object AudioAttributesCompatParcelizer;
        private Object AudioAttributesImplApi26Parcelizer;
        private Object AudioAttributesImplBaseParcelizer;
        private Object IconCompatParcelizer;
        private int MediaBrowserCompatCustomActionResultReceiver;
        private Object MediaBrowserCompatItemReceiver;
        private int RemoteActionCompatParcelizer;
        private int read;
        private int write;

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0050, code lost:
        
            if (r12 != r0) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x008c, code lost:
        
            if (r12 != r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0094, code lost:
        
            if (r1 == ((java.lang.Number) r12).intValue()) goto L23;
         */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00c7  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00ca  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x008c -> B:19:0x008e). Please report as a decompilation issue!!! */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instruction units count: 224
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.signup.college.viewmodel.CollegeSelectionParentViewModel.AudioAttributesCompatParcelizer.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        AudioAttributesCompatParcelizer(SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return CollegeSelectionParentViewModel.this.new AudioAttributesCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void onCustomAction() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AudioAttributesCompatParcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.zoom
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return CollegeSelectionParentViewModel.AudioAttributesImplApi26Parcelizer((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplApi26Parcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    public final void AudioAttributesCompatParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (this.IconCompatParcelizer.IconCompatParcelizer() == defaultMarker.read) {
            this.AudioAttributesImplApi21Parcelizer = BitmapDescriptorFactory.RemoteActionCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, "101", p0, null, null, null, 28);
        } else if (this.IconCompatParcelizer.IconCompatParcelizer() == defaultMarker.AudioAttributesImplBaseParcelizer) {
            this.AudioAttributesImplApi21Parcelizer = BitmapDescriptorFactory.RemoteActionCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, p0, "IN", null, null, null, 28);
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplApi21Parcelizer.getRemoteActionCompatParcelizer(), (Object) "101")) {
            if (!this.MediaBrowserCompatCustomActionResultReceiver.contains(defaultMarker.read)) {
                this.MediaBrowserCompatCustomActionResultReceiver.add(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((List<? extends defaultMarker>) this.MediaBrowserCompatCustomActionResultReceiver, this.IconCompatParcelizer.IconCompatParcelizer()) + 1, defaultMarker.read);
            }
        } else {
            this.MediaBrowserCompatCustomActionResultReceiver.remove(defaultMarker.read);
        }
        MediaBrowserCompatMediaItem();
    }

    public final void RemoteActionCompatParcelizer(String p0, String p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        this.AudioAttributesImplApi21Parcelizer = BitmapDescriptorFactory.RemoteActionCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, null, null, p0, p1, null, 19);
        MediaBrowserCompatMediaItem();
    }

    public final String AudioAttributesImplApi21Parcelizer() {
        String remoteActionCompatParcelizer = this.AudioAttributesImplApi21Parcelizer.getRemoteActionCompatParcelizer();
        return remoteActionCompatParcelizer == null ? TestIndex.ALL_INDIA_ID : remoteActionCompatParcelizer;
    }

    public final Pair<String, Boolean> MediaBrowserCompatCustomActionResultReceiver() {
        boolean zRemoteActionCompatParcelizer = toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplApi21Parcelizer.getRemoteActionCompatParcelizer(), (Object) "101");
        String str = TestIndex.ALL_INDIA_ID;
        if (zRemoteActionCompatParcelizer) {
            String audioAttributesCompatParcelizer = this.AudioAttributesImplApi21Parcelizer.getAudioAttributesCompatParcelizer();
            if (audioAttributesCompatParcelizer != null) {
                str = audioAttributesCompatParcelizer;
            }
            return new Pair<>(str, Boolean.TRUE);
        }
        String remoteActionCompatParcelizer = this.AudioAttributesImplApi21Parcelizer.getRemoteActionCompatParcelizer();
        if (remoteActionCompatParcelizer != null) {
            str = remoteActionCompatParcelizer;
        }
        return new Pair<>(str, Boolean.FALSE);
    }

    public final void RemoteActionCompatParcelizer(String p0, final getAnswerMap<? super LatLngBounds, getShowPopup> p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        BitmapDescriptorFactory bitmapDescriptorFactoryRemoteActionCompatParcelizer = BitmapDescriptorFactory.RemoteActionCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, null, null, null, null, p0, 15);
        this.AudioAttributesImplApi21Parcelizer = bitmapDescriptorFactoryRemoteActionCompatParcelizer;
        if (bitmapDescriptorFactoryRemoteActionCompatParcelizer.getRead() == null || this.AudioAttributesImplApi21Parcelizer.getWrite() == null || this.AudioAttributesImplApi21Parcelizer.getRemoteActionCompatParcelizer() == null || this.AudioAttributesImplApi21Parcelizer.getIconCompatParcelizer() == null) {
            return;
        }
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new read(null), new MagicModuleSubmissionRequestBody() { // from class: o.Circle
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return CollegeSelectionParentViewModel.write(p1, ((Integer) obj).intValue(), (String) obj2);
            }
        });
    }

    static final class read extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private Object read;
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                String remoteActionCompatParcelizer = CollegeSelectionParentViewModel.this.AudioAttributesImplApi21Parcelizer.getRemoteActionCompatParcelizer();
                toMagicModuleMetaRepoModel.write((Object) remoteActionCompatParcelizer);
                String write = CollegeSelectionParentViewModel.this.AudioAttributesImplApi21Parcelizer.getWrite();
                toMagicModuleMetaRepoModel.write((Object) write);
                String audioAttributesCompatParcelizer = CollegeSelectionParentViewModel.this.AudioAttributesImplApi21Parcelizer.getAudioAttributesCompatParcelizer();
                toMagicModuleMetaRepoModel.write((Object) audioAttributesCompatParcelizer);
                String read = CollegeSelectionParentViewModel.this.AudioAttributesImplApi21Parcelizer.getRead();
                toMagicModuleMetaRepoModel.write((Object) read);
                String iconCompatParcelizer = CollegeSelectionParentViewModel.this.AudioAttributesImplApi21Parcelizer.getIconCompatParcelizer();
                toMagicModuleMetaRepoModel.write((Object) iconCompatParcelizer);
                String iconCompatParcelizer2 = CollegeSelectionParentViewModel.this.AudioAttributesImplApi21Parcelizer.getIconCompatParcelizer();
                toMagicModuleMetaRepoModel.write((Object) iconCompatParcelizer2);
                CollegeDetails collegeDetails = new CollegeDetails(remoteActionCompatParcelizer, write, audioAttributesCompatParcelizer, read, 0, 0L, iconCompatParcelizer, iconCompatParcelizer2, 0, 304, null);
                this.read = null;
                this.write = 1;
                if (CollegeSelectionParentViewModel.this.getAudioAttributesCompatParcelizer().write(collegeDetails, this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            CollegeSelectionParentViewModel.this.MediaBrowserCompatMediaItem();
            return getShowPopup.INSTANCE;
        }

        read(SampleVideos<? super read> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return CollegeSelectionParentViewModel.this.new read(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(getAnswerMap getanswermap, int i, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        if (i == 502) {
            getanswermap.invoke(LatLngBounds.RemoteActionCompatParcelizer.INSTANCE);
        } else {
            getanswermap.invoke(new LatLngBounds.write(str));
        }
        return getShowPopup.INSTANCE;
    }

    public final void MediaBrowserCompatSearchResultReceiver() {
        int iMax = Math.max(0, IntermediateLoginResponseBody.RemoteActionCompatParcelizer((List<? extends defaultMarker>) this.MediaBrowserCompatCustomActionResultReceiver, this.IconCompatParcelizer.IconCompatParcelizer()) - 1);
        MediaMetadataCompat();
        this.IconCompatParcelizer.write(this.MediaBrowserCompatCustomActionResultReceiver.get(iMax));
    }

    private final void MediaMetadataCompat() {
        BitmapDescriptorFactory bitmapDescriptorFactoryRemoteActionCompatParcelizer;
        if (this.IconCompatParcelizer.IconCompatParcelizer() == defaultMarker.AudioAttributesCompatParcelizer) {
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplApi21Parcelizer.getRemoteActionCompatParcelizer(), (Object) "101")) {
                bitmapDescriptorFactoryRemoteActionCompatParcelizer = BitmapDescriptorFactory.RemoteActionCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, null, null, null, null, null, 29);
            } else {
                bitmapDescriptorFactoryRemoteActionCompatParcelizer = BitmapDescriptorFactory.RemoteActionCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, null, null, null, null, null, 30);
            }
            this.AudioAttributesImplApi21Parcelizer = bitmapDescriptorFactoryRemoteActionCompatParcelizer;
            return;
        }
        if (IntermediateLoginResponseBody.AudioAttributesCompatParcelizer(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new defaultMarker[]{defaultMarker.read, defaultMarker.AudioAttributesImplBaseParcelizer}), this.IconCompatParcelizer.IconCompatParcelizer())) {
            this.AudioAttributesImplApi21Parcelizer = BitmapDescriptorFactory.RemoteActionCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, null, null, null, null, null, 28);
        }
    }

    public final void MediaBrowserCompatMediaItem() {
        this.IconCompatParcelizer.write(this.MediaBrowserCompatCustomActionResultReceiver.get(Math.min(IntermediateLoginResponseBody.write((List) this.MediaBrowserCompatCustomActionResultReceiver), IntermediateLoginResponseBody.RemoteActionCompatParcelizer((List<? extends defaultMarker>) this.MediaBrowserCompatCustomActionResultReceiver, this.IconCompatParcelizer.IconCompatParcelizer()) + 1)));
    }
}
