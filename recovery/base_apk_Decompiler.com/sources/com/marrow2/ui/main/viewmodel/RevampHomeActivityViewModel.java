package com.marrow2.ui.main.viewmodel;

import com.marrow2.ui.main.viewmodel.RevampHomeActivityViewModel;
import kotlin.CmcdHeadersFactoryCmcdObjectBuilder;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.Metadata;
import kotlin.NetworkTypeObserverApi31DisplayInfoCallback;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.ParsableNalUnitBitArray;
import kotlin.RenewEligibleCreator;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.TopUserCompanion;
import kotlin.TypeResolutionContextBasic;
import kotlin.VerifyNewNumberRequest;
import kotlin.crc32;
import kotlin.getAnswerMap;
import kotlin.getDisplaySizeV17;
import kotlin.getMagicModuleStats;
import kotlin.getPlatform;
import kotlin.getResolutionSize;
import kotlin.getShowPopup;
import kotlin.getTotalMcq;
import kotlin.getYear;
import kotlin.readSynchSafeInt;
import kotlin.readTimestamp;
import kotlin.setModifiedEndTimestampMs;
import kotlin.setSdkPayload;
import kotlin.setStartTime;
import kotlin.setUpdatedStatus;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0017\u001cBA\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0015¢\u0006\u0004\b\u0013\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u0017\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u0018\u0010\u0014J(\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\u0019H\u0082@¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001a\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u001a\u0010\u0014J\u0010\u0010\u001c\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u001c\u0010\u0014R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001fR\u0014\u0010\u0017\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u001c\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\"R\u0014\u0010\u0013\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010#\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010%R\u0014\u0010'\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010&R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020)0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010*R\u001d\u0010.\u001a\b\u0012\u0004\u0012\u00020)0+8\u0007¢\u0006\f\n\u0004\b'\u0010,\u001a\u0004\b\u0018\u0010-"}, d2 = {"Lcom/marrow2/ui/main/viewmodel/RevampHomeActivityViewModel;", "Lo/POJOPropertyBuilderWithMember;", "Lo/getDisplaySizeV17;", "p0", "Lo/readSynchSafeInt;", "p1", "Lo/readTimestamp;", "p2", "Lo/ParsableNalUnitBitArray;", "p3", "Lo/crc32;", "p4", "Lo/NetworkTypeObserverApi31DisplayInfoCallback;", "p5", "Lo/getPlatform;", "p6", "<init>", "(Lo/getDisplaySizeV17;Lo/readSynchSafeInt;Lo/readTimestamp;Lo/ParsableNalUnitBitArray;Lo/crc32;Lo/NetworkTypeObserverApi31DisplayInfoCallback;Lo/getPlatform;)V", "", "read", "(Lo/SampleVideos;)Ljava/lang/Object;", "Lcom/marrow2/ui/main/viewmodel/RevampHomeActivityViewModel$write;", "(Lcom/marrow2/ui/main/viewmodel/RevampHomeActivityViewModel$write;)V", "IconCompatParcelizer", "AudioAttributesCompatParcelizer", "", "RemoteActionCompatParcelizer", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/SampleVideos;)Ljava/lang/Object;", "write", "MediaBrowserCompatItemReceiver", "Lo/getDisplaySizeV17;", "Lo/readSynchSafeInt;", "MediaBrowserCompatCustomActionResultReceiver", "Lo/readTimestamp;", "Lo/ParsableNalUnitBitArray;", "AudioAttributesImplApi21Parcelizer", "Lo/crc32;", "Lo/NetworkTypeObserverApi31DisplayInfoCallback;", "Lo/getPlatform;", "AudioAttributesImplApi26Parcelizer", "Lo/getResolutionSize;", "Lcom/marrow2/ui/main/viewmodel/RevampHomeActivityViewModel$IconCompatParcelizer;", "Lo/getResolutionSize;", "Lo/setUpdatedStatus;", "Lo/setUpdatedStatus;", "()Lo/setUpdatedStatus;", "AudioAttributesImplBaseParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RevampHomeActivityViewModel extends POJOPropertyBuilderWithMember {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final ParsableNalUnitBitArray write;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final crc32 read;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final setUpdatedStatus<IconCompatParcelizer> AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final NetworkTypeObserverApi31DisplayInfoCallback AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final readTimestamp IconCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final getDisplaySizeV17 RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<IconCompatParcelizer> MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final readSynchSafeInt AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final getPlatform AudioAttributesImplApi26Parcelizer;

    static final class AudioAttributesCompatParcelizer extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        Object IconCompatParcelizer;
        int RemoteActionCompatParcelizer;
        /* synthetic */ Object read;
        int write;

        AudioAttributesCompatParcelizer(SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.read = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            return RevampHomeActivityViewModel.this.read(this);
        }
    }

    static final class AudioAttributesImplApi26Parcelizer extends getTotalMcq {
        /* synthetic */ Object IconCompatParcelizer;
        int read;

        AudioAttributesImplApi26Parcelizer(SampleVideos<? super AudioAttributesImplApi26Parcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.IconCompatParcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            return RevampHomeActivityViewModel.this.AudioAttributesCompatParcelizer(this);
        }
    }

    static final class AudioAttributesImplBaseParcelizer extends getTotalMcq {
        /* synthetic */ Object AudioAttributesCompatParcelizer;
        long IconCompatParcelizer;
        int read;
        boolean write;

        AudioAttributesImplBaseParcelizer(SampleVideos<? super AudioAttributesImplBaseParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesCompatParcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            return RevampHomeActivityViewModel.this.RemoteActionCompatParcelizer(this);
        }
    }

    static final class RemoteActionCompatParcelizer extends getTotalMcq {
        int AudioAttributesCompatParcelizer;
        /* synthetic */ Object IconCompatParcelizer;

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.IconCompatParcelizer = obj;
            this.AudioAttributesCompatParcelizer |= Integer.MIN_VALUE;
            return RevampHomeActivityViewModel.this.write(this);
        }
    }

    static final class read extends getTotalMcq {
        int AudioAttributesCompatParcelizer;
        /* synthetic */ Object AudioAttributesImplApi26Parcelizer;
        Object IconCompatParcelizer;
        int MediaBrowserCompatItemReceiver;
        int RemoteActionCompatParcelizer;
        int read;
        int write;

        read(SampleVideos<? super read> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesImplApi26Parcelizer = obj;
            this.MediaBrowserCompatItemReceiver |= Integer.MIN_VALUE;
            return RevampHomeActivityViewModel.this.IconCompatParcelizer(this);
        }
    }

    @setSdkPayload
    public RevampHomeActivityViewModel(getDisplaySizeV17 getdisplaysizev17, readSynchSafeInt readsynchsafeint, readTimestamp readtimestamp, ParsableNalUnitBitArray parsableNalUnitBitArray, crc32 crc32Var, NetworkTypeObserverApi31DisplayInfoCallback networkTypeObserverApi31DisplayInfoCallback, getPlatform getplatform) {
        toMagicModuleMetaRepoModel.write(getdisplaysizev17, "");
        toMagicModuleMetaRepoModel.write(readsynchsafeint, "");
        toMagicModuleMetaRepoModel.write(readtimestamp, "");
        toMagicModuleMetaRepoModel.write(parsableNalUnitBitArray, "");
        toMagicModuleMetaRepoModel.write(crc32Var, "");
        toMagicModuleMetaRepoModel.write(networkTypeObserverApi31DisplayInfoCallback, "");
        toMagicModuleMetaRepoModel.write(getplatform, "");
        this.RemoteActionCompatParcelizer = getdisplaysizev17;
        this.AudioAttributesCompatParcelizer = readsynchsafeint;
        this.IconCompatParcelizer = readtimestamp;
        this.write = parsableNalUnitBitArray;
        this.read = crc32Var;
        this.AudioAttributesImplApi21Parcelizer = networkTypeObserverApi31DisplayInfoCallback;
        this.AudioAttributesImplApi26Parcelizer = getplatform;
        getResolutionSize<IconCompatParcelizer> getresolutionsizeRemoteActionCompatParcelizer = setStartTime.RemoteActionCompatParcelizer(IconCompatParcelizer.read.INSTANCE);
        this.MediaBrowserCompatItemReceiver = getresolutionsizeRemoteActionCompatParcelizer;
        this.AudioAttributesImplBaseParcelizer = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer);
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AnonymousClass5(null), new MagicModuleSubmissionRequestBody() { // from class: o.DataHolderBuilder
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return RevampHomeActivityViewModel.RemoteActionCompatParcelizer((String) obj2);
            }
        });
    }

    public final setUpdatedStatus<IconCompatParcelizer> AudioAttributesCompatParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    /* JADX INFO: loaded from: classes3.dex */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/marrow2/ui/main/viewmodel/RevampHomeActivityViewModel$IconCompatParcelizer;", "", "<init>", "()V", "read", "AudioAttributesCompatParcelizer", "Lcom/marrow2/ui/main/viewmodel/RevampHomeActivityViewModel$IconCompatParcelizer$AudioAttributesCompatParcelizer;", "Lcom/marrow2/ui/main/viewmodel/RevampHomeActivityViewModel$IconCompatParcelizer$read;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class IconCompatParcelizer {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/marrow2/ui/main/viewmodel/RevampHomeActivityViewModel$IconCompatParcelizer$read;", "Lcom/marrow2/ui/main/viewmodel/RevampHomeActivityViewModel$IconCompatParcelizer;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class read extends IconCompatParcelizer {
            public static final read INSTANCE = new read();

            private read() {
                super(null);
            }
        }

        private IconCompatParcelizer() {
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/marrow2/ui/main/viewmodel/RevampHomeActivityViewModel$IconCompatParcelizer$AudioAttributesCompatParcelizer;", "Lcom/marrow2/ui/main/viewmodel/RevampHomeActivityViewModel$IconCompatParcelizer;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class AudioAttributesCompatParcelizer extends IconCompatParcelizer {
            public static final AudioAttributesCompatParcelizer INSTANCE = new AudioAttributesCompatParcelizer();

            private AudioAttributesCompatParcelizer() {
                super(null);
            }
        }

        public /* synthetic */ IconCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/marrow2/ui/main/viewmodel/RevampHomeActivityViewModel$write;", "", "<init>", "()V", "write", "IconCompatParcelizer", "Lcom/marrow2/ui/main/viewmodel/RevampHomeActivityViewModel$write$write;", "Lcom/marrow2/ui/main/viewmodel/RevampHomeActivityViewModel$write$IconCompatParcelizer;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class write {

        /* JADX INFO: renamed from: com.marrow2.ui.main.viewmodel.RevampHomeActivityViewModel$write$write, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/marrow2/ui/main/viewmodel/RevampHomeActivityViewModel$write$write;", "Lcom/marrow2/ui/main/viewmodel/RevampHomeActivityViewModel$write;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class C0008write extends write {
            public static final C0008write INSTANCE = new C0008write();

            private C0008write() {
                super(null);
            }
        }

        private write() {
        }

        public static final class IconCompatParcelizer extends write {
            private final String AudioAttributesCompatParcelizer;
            private final String IconCompatParcelizer;
            private final String write;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public IconCompatParcelizer(String str, String str2, String str3) {
                super(null);
                toMagicModuleMetaRepoModel.write(str, "");
                toMagicModuleMetaRepoModel.write(str2, "");
                toMagicModuleMetaRepoModel.write(str3, "");
                this.write = str;
                this.IconCompatParcelizer = str2;
                this.AudioAttributesCompatParcelizer = str3;
            }

            public final String AudioAttributesCompatParcelizer() {
                return this.IconCompatParcelizer;
            }

            public final String IconCompatParcelizer() {
                return this.write;
            }

            public final String read() {
                return this.AudioAttributesCompatParcelizer;
            }
        }

        public /* synthetic */ write(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.marrow2.ui.main.viewmodel.RevampHomeActivityViewModel$5, reason: invalid class name */
    /* JADX INFO: loaded from: classes3.dex */
    static final class AnonymousClass5 extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;

        /* JADX INFO: renamed from: com.marrow2.ui.main.viewmodel.RevampHomeActivityViewModel$5$1, reason: invalid class name */
        static final class AnonymousClass1 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
            private int IconCompatParcelizer;
            private /* synthetic */ RevampHomeActivityViewModel read;

            /* JADX WARN: Code restructure failed: missing block: B:25:0x0075, code lost:
            
                if (r7.read.write(r7) != r0) goto L27;
             */
            /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
            @Override // kotlin.getMonthName
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                /*
                    r7 = this;
                    java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                    int r1 = r7.IconCompatParcelizer
                    r2 = 5
                    r3 = 4
                    r4 = 3
                    r5 = 2
                    r6 = 1
                    if (r1 == 0) goto L33
                    if (r1 == r6) goto L2f
                    if (r1 == r5) goto L2b
                    if (r1 == r4) goto L27
                    if (r1 == r3) goto L23
                    if (r1 != r2) goto L1b
                    kotlin.SdkPayloadData.IconCompatParcelizer(r8)
                    goto L78
                L1b:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L23:
                    kotlin.SdkPayloadData.IconCompatParcelizer(r8)
                    goto L6a
                L27:
                    kotlin.SdkPayloadData.IconCompatParcelizer(r8)
                    goto L5d
                L2b:
                    kotlin.SdkPayloadData.IconCompatParcelizer(r8)
                    goto L50
                L2f:
                    kotlin.SdkPayloadData.IconCompatParcelizer(r8)
                    goto L43
                L33:
                    kotlin.SdkPayloadData.IconCompatParcelizer(r8)
                    com.marrow2.ui.main.viewmodel.RevampHomeActivityViewModel r8 = r7.read
                    r1 = r7
                    o.SampleVideos r1 = (kotlin.SampleVideos) r1
                    r7.IconCompatParcelizer = r6
                    java.lang.Object r8 = com.marrow2.ui.main.viewmodel.RevampHomeActivityViewModel.AudioAttributesCompatParcelizer(r8, r1)
                    if (r8 == r0) goto L7b
                L43:
                    com.marrow2.ui.main.viewmodel.RevampHomeActivityViewModel r8 = r7.read
                    r1 = r7
                    o.SampleVideos r1 = (kotlin.SampleVideos) r1
                    r7.IconCompatParcelizer = r5
                    java.lang.Object r8 = com.marrow2.ui.main.viewmodel.RevampHomeActivityViewModel.RemoteActionCompatParcelizer(r8, r1)
                    if (r8 == r0) goto L7b
                L50:
                    com.marrow2.ui.main.viewmodel.RevampHomeActivityViewModel r8 = r7.read
                    r1 = r7
                    o.SampleVideos r1 = (kotlin.SampleVideos) r1
                    r7.IconCompatParcelizer = r4
                    java.lang.Object r8 = com.marrow2.ui.main.viewmodel.RevampHomeActivityViewModel.write(r8, r1)
                    if (r8 == r0) goto L7b
                L5d:
                    com.marrow2.ui.main.viewmodel.RevampHomeActivityViewModel r8 = r7.read
                    r1 = r7
                    o.SampleVideos r1 = (kotlin.SampleVideos) r1
                    r7.IconCompatParcelizer = r3
                    java.lang.Object r8 = com.marrow2.ui.main.viewmodel.RevampHomeActivityViewModel.read(r8, r1)
                    if (r8 == r0) goto L7b
                L6a:
                    com.marrow2.ui.main.viewmodel.RevampHomeActivityViewModel r8 = r7.read
                    r1 = r7
                    o.SampleVideos r1 = (kotlin.SampleVideos) r1
                    r7.IconCompatParcelizer = r2
                    java.lang.Object r7 = com.marrow2.ui.main.viewmodel.RevampHomeActivityViewModel.IconCompatParcelizer(r8, r1)
                    if (r7 != r0) goto L78
                    goto L7b
                L78:
                    o.getShowPopup r7 = kotlin.getShowPopup.INSTANCE
                    return r7
                L7b:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.main.viewmodel.RevampHomeActivityViewModel.AnonymousClass5.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(RevampHomeActivityViewModel revampHomeActivityViewModel, SampleVideos<? super AnonymousClass1> sampleVideos) {
                super(2, sampleVideos);
                this.read = revampHomeActivityViewModel;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                return new AnonymousClass1(this.read, sampleVideos);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((AnonymousClass1) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.IconCompatParcelizer = 1;
                if (setModifiedEndTimestampMs.RemoteActionCompatParcelizer(RevampHomeActivityViewModel.this.AudioAttributesImplApi26Parcelizer, new AnonymousClass1(RevampHomeActivityViewModel.this, null), this) == objIconCompatParcelizer) {
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

        AnonymousClass5(SampleVideos<? super AnonymousClass5> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return RevampHomeActivityViewModel.this.new AnonymousClass5(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AnonymousClass5) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0094, code lost:
    
        if (kotlin.setBandwidthStatistic.IconCompatParcelizer(r2, r8, r9, r0) != r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object read(kotlin.SampleVideos<? super kotlin.getShowPopup> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.marrow2.ui.main.viewmodel.RevampHomeActivityViewModel.AudioAttributesCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r9
            com.marrow2.ui.main.viewmodel.RevampHomeActivityViewModel$AudioAttributesCompatParcelizer r0 = (com.marrow2.ui.main.viewmodel.RevampHomeActivityViewModel.AudioAttributesCompatParcelizer) r0
            int r1 = r0.RemoteActionCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r9 = r0.RemoteActionCompatParcelizer
            int r9 = r9 + r2
            r0.RemoteActionCompatParcelizer = r9
            goto L19
        L14:
            com.marrow2.ui.main.viewmodel.RevampHomeActivityViewModel$AudioAttributesCompatParcelizer r0 = new com.marrow2.ui.main.viewmodel.RevampHomeActivityViewModel$AudioAttributesCompatParcelizer
            r0.<init>(r9)
        L19:
            java.lang.Object r9 = r0.read
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.RemoteActionCompatParcelizer
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L52
            if (r2 == r5) goto L46
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)
            goto L97
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            int r8 = r0.write
            java.lang.Object r2 = r0.AudioAttributesCompatParcelizer
            o.readTimestamp r2 = (kotlin.readTimestamp) r2
            java.lang.Object r4 = r0.IconCompatParcelizer
            o.setBandwidthStatistic r4 = (kotlin.setBandwidthStatistic) r4
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)
            goto L83
        L46:
            java.lang.Object r2 = r0.AudioAttributesCompatParcelizer
            o.readTimestamp r2 = (kotlin.readTimestamp) r2
            java.lang.Object r5 = r0.IconCompatParcelizer
            o.setBandwidthStatistic r5 = (kotlin.setBandwidthStatistic) r5
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)
            goto L6a
        L52:
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)
            o.setBandwidthStatistic r9 = kotlin.setBandwidthStatistic.INSTANCE
            o.readTimestamp r2 = r8.IconCompatParcelizer
            o.getDisplaySizeV17 r6 = r8.RemoteActionCompatParcelizer
            r0.IconCompatParcelizer = r9
            r0.AudioAttributesCompatParcelizer = r2
            r0.RemoteActionCompatParcelizer = r5
            java.lang.Object r5 = r6.AudioAttributesImplApi26Parcelizer(r0)
            if (r5 == r1) goto L9a
            r7 = r5
            r5 = r9
            r9 = r7
        L6a:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            o.getDisplaySizeV17 r8 = r8.RemoteActionCompatParcelizer
            r0.IconCompatParcelizer = r5
            r0.AudioAttributesCompatParcelizer = r2
            r0.write = r9
            r0.RemoteActionCompatParcelizer = r4
            java.lang.Object r8 = r8.MediaBrowserCompatMediaItem(r0)
            if (r8 == r1) goto L9a
            r7 = r9
            r9 = r8
            r8 = r7
        L83:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            r4 = 0
            r0.IconCompatParcelizer = r4
            r0.AudioAttributesCompatParcelizer = r4
            r0.RemoteActionCompatParcelizer = r3
            java.lang.Object r8 = kotlin.setBandwidthStatistic.IconCompatParcelizer(r2, r8, r9, r0)
            if (r8 != r1) goto L97
            goto L9a
        L97:
            o.getShowPopup r8 = kotlin.getShowPopup.INSTANCE
            return r8
        L9a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.main.viewmodel.RevampHomeActivityViewModel.read(o.SampleVideos):java.lang.Object");
    }

    static final class AudioAttributesImplApi21Parcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;
        private /* synthetic */ write RemoteActionCompatParcelizer;
        private /* synthetic */ RevampHomeActivityViewModel write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                write writeVar = this.RemoteActionCompatParcelizer;
                if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(writeVar, write.C0008write.INSTANCE)) {
                    if (writeVar instanceof write.IconCompatParcelizer) {
                        this.AudioAttributesCompatParcelizer = 1;
                        if (this.write.RemoteActionCompatParcelizer(((write.IconCompatParcelizer) this.RemoteActionCompatParcelizer).IconCompatParcelizer(), ((write.IconCompatParcelizer) this.RemoteActionCompatParcelizer).AudioAttributesCompatParcelizer(), ((write.IconCompatParcelizer) this.RemoteActionCompatParcelizer).read(), this) == objIconCompatParcelizer) {
                            return objIconCompatParcelizer;
                        }
                    } else {
                        throw new RenewEligibleCreator();
                    }
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
        AudioAttributesImplApi21Parcelizer(write writeVar, RevampHomeActivityViewModel revampHomeActivityViewModel, SampleVideos<? super AudioAttributesImplApi21Parcelizer> sampleVideos) {
            super(1, sampleVideos);
            this.RemoteActionCompatParcelizer = writeVar;
            this.write = revampHomeActivityViewModel;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return new AudioAttributesImplApi21Parcelizer(this.RemoteActionCompatParcelizer, this.write, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplApi21Parcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public final void read(write p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AudioAttributesImplApi21Parcelizer(p0, this, null), new MagicModuleSubmissionRequestBody() { // from class: o.EntityBuffer
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return RevampHomeActivityViewModel.write((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f7, code lost:
    
        if (r11.ParcelableVolumeInfo(r0) != r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object IconCompatParcelizer(kotlin.SampleVideos<? super kotlin.getShowPopup> r12) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.main.viewmodel.RevampHomeActivityViewModel.IconCompatParcelizer(o.SampleVideos):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object AudioAttributesCompatParcelizer(kotlin.SampleVideos<? super kotlin.getShowPopup> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.marrow2.ui.main.viewmodel.RevampHomeActivityViewModel.AudioAttributesImplApi26Parcelizer
            if (r0 == 0) goto L14
            r0 = r8
            com.marrow2.ui.main.viewmodel.RevampHomeActivityViewModel$AudioAttributesImplApi26Parcelizer r0 = (com.marrow2.ui.main.viewmodel.RevampHomeActivityViewModel.AudioAttributesImplApi26Parcelizer) r0
            int r1 = r0.read
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r8 = r0.read
            int r8 = r8 + r2
            r0.read = r8
            goto L19
        L14:
            com.marrow2.ui.main.viewmodel.RevampHomeActivityViewModel$AudioAttributesImplApi26Parcelizer r0 = new com.marrow2.ui.main.viewmodel.RevampHomeActivityViewModel$AudioAttributesImplApi26Parcelizer
            r0.<init>(r8)
        L19:
            java.lang.Object r8 = r0.IconCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.read
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            goto L40
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            o.getDisplaySizeV17 r8 = r7.RemoteActionCompatParcelizer
            r0.read = r3
            java.lang.Object r8 = r8.MediaBrowserCompatSearchResultReceiver(r0)
            if (r8 != r1) goto L40
            return r1
        L40:
            java.lang.Number r8 = (java.lang.Number) r8
            long r0 = r8.longValue()
            o.fromAdPlaybackState r8 = kotlin.fromAdPlaybackState.read
            r2 = 3
            r4 = 0
            r6 = 62
            boolean r8 = kotlin.fromAdPlaybackState.read(r0, r2, r4, r6)
            if (r8 == 0) goto L5b
            o.getResolutionSize<com.marrow2.ui.main.viewmodel.RevampHomeActivityViewModel$IconCompatParcelizer> r7 = r7.MediaBrowserCompatItemReceiver
            com.marrow2.ui.main.viewmodel.RevampHomeActivityViewModel$IconCompatParcelizer$AudioAttributesCompatParcelizer r8 = com.marrow2.ui.main.viewmodel.RevampHomeActivityViewModel.IconCompatParcelizer.AudioAttributesCompatParcelizer.INSTANCE
            r7.write(r8)
        L5b:
            o.getShowPopup r7 = kotlin.getShowPopup.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.main.viewmodel.RevampHomeActivityViewModel.AudioAttributesCompatParcelizer(o.SampleVideos):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object RemoteActionCompatParcelizer(String str, String str2, String str3, SampleVideos<? super getShowPopup> sampleVideos) {
        Object objRemoteActionCompatParcelizer = this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(str, str2, str3, sampleVideos);
        return objRemoteActionCompatParcelizer == getYear.IconCompatParcelizer() ? objRemoteActionCompatParcelizer : getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0074, code lost:
    
        if (r13.onSkipToQueueItem(r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object RemoteActionCompatParcelizer(kotlin.SampleVideos<? super kotlin.getShowPopup> r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof com.marrow2.ui.main.viewmodel.RevampHomeActivityViewModel.AudioAttributesImplBaseParcelizer
            if (r0 == 0) goto L14
            r0 = r14
            com.marrow2.ui.main.viewmodel.RevampHomeActivityViewModel$AudioAttributesImplBaseParcelizer r0 = (com.marrow2.ui.main.viewmodel.RevampHomeActivityViewModel.AudioAttributesImplBaseParcelizer) r0
            int r1 = r0.read
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r14 = r0.read
            int r14 = r14 + r2
            r0.read = r14
            goto L19
        L14:
            com.marrow2.ui.main.viewmodel.RevampHomeActivityViewModel$AudioAttributesImplBaseParcelizer r0 = new com.marrow2.ui.main.viewmodel.RevampHomeActivityViewModel$AudioAttributesImplBaseParcelizer
            r0.<init>(r14)
        L19:
            java.lang.Object r14 = r0.AudioAttributesCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.read
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            boolean r13 = r0.write
            long r0 = r0.IconCompatParcelizer
            kotlin.SdkPayloadData.IconCompatParcelizer(r14)
            goto L77
        L31:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L39:
            kotlin.SdkPayloadData.IconCompatParcelizer(r14)
            goto L4a
        L3d:
            kotlin.SdkPayloadData.IconCompatParcelizer(r14)
            o.getDisplaySizeV17 r14 = r13.RemoteActionCompatParcelizer
            r0.read = r4
            java.lang.Object r14 = r14.MediaDescriptionCompat(r0)
            if (r14 == r1) goto L7d
        L4a:
            java.lang.Number r14 = (java.lang.Number) r14
            long r11 = r14.longValue()
            o.fromAdPlaybackState r14 = kotlin.fromAdPlaybackState.read
            r6 = 1
            r8 = 0
            r10 = 62
            r4 = r11
            boolean r14 = kotlin.fromAdPlaybackState.read(r4, r6, r8, r10)
            if (r14 == 0) goto L7a
            o.getSelectedIndexInTrackGroup$AudioAttributesCompatParcelizer r2 = kotlin.getSelectedIndexInTrackGroup.INSTANCE
            com.marrow.designsystem.theme.AppTheme r2 = com.marrow.designsystem.theme.AppThemeManager.read()
            kotlin.getSelectedIndexInTrackGroup.Companion.IconCompatParcelizer(r2)
            o.getDisplaySizeV17 r13 = r13.RemoteActionCompatParcelizer
            r0.IconCompatParcelizer = r11
            r0.write = r14
            r0.read = r3
            java.lang.Object r13 = r13.onSkipToQueueItem(r0)
            if (r13 != r1) goto L77
            goto L7d
        L77:
            o.getShowPopup r13 = kotlin.getShowPopup.INSTANCE
            return r13
        L7a:
            o.getShowPopup r13 = kotlin.getShowPopup.INSTANCE
            return r13
        L7d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.main.viewmodel.RevampHomeActivityViewModel.RemoteActionCompatParcelizer(o.SampleVideos):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object write(kotlin.SampleVideos<? super kotlin.getShowPopup> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.marrow2.ui.main.viewmodel.RevampHomeActivityViewModel.RemoteActionCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r5
            com.marrow2.ui.main.viewmodel.RevampHomeActivityViewModel$RemoteActionCompatParcelizer r0 = (com.marrow2.ui.main.viewmodel.RevampHomeActivityViewModel.RemoteActionCompatParcelizer) r0
            int r1 = r0.AudioAttributesCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r5 = r0.AudioAttributesCompatParcelizer
            int r5 = r5 + r2
            r0.AudioAttributesCompatParcelizer = r5
            goto L19
        L14:
            com.marrow2.ui.main.viewmodel.RevampHomeActivityViewModel$RemoteActionCompatParcelizer r0 = new com.marrow2.ui.main.viewmodel.RevampHomeActivityViewModel$RemoteActionCompatParcelizer
            r0.<init>(r5)
        L19:
            java.lang.Object r5 = r0.IconCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.AudioAttributesCompatParcelizer
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            kotlin.SdkPayloadData.IconCompatParcelizer(r5)
            goto L40
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L32:
            kotlin.SdkPayloadData.IconCompatParcelizer(r5)
            o.readSynchSafeInt r4 = r4.AudioAttributesCompatParcelizer
            r0.AudioAttributesCompatParcelizer = r3
            java.lang.Object r5 = r4.MediaMetadataCompat(r0)
            if (r5 != r1) goto L40
            return r1
        L40:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r4 = r5.booleanValue()
            if (r4 == 0) goto L4b
            kotlin.getLatestBitrateEstimate.write()
        L4b:
            o.getShowPopup r4 = kotlin.getShowPopup.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.main.viewmodel.RevampHomeActivityViewModel.write(o.SampleVideos):java.lang.Object");
    }
}
