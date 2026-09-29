package com.marrow2.ui.pearl.relatedmcq;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.marrow2.ui.pearl.relatedmcq.RelatedMcqViewModel;
import java.util.Iterator;
import java.util.List;
import kotlin.C0201setMcqCount;
import kotlin.CmcdHeadersFactoryCmcdObjectBuilder;
import kotlin.IntermediateLoginResponseBody;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.Metadata;
import kotlin.NetworkTypeObserverApi31DisplayInfoCallback;
import kotlin.NewNumberOtpResendRequest;
import kotlin.POJOPropertyBuilder5;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.QBankStatsResponse;
import kotlin.RenewEligibleCreator;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.TopUserCompanion;
import kotlin.TypeResolutionContextBasic;
import kotlin.VerifyNewNumberRequest;
import kotlin._qbuf;
import kotlin.allSamplesAreSyncSamples;
import kotlin.createNotificationChannel;
import kotlin.fromCursor;
import kotlin.getAnswerMap;
import kotlin.getLastName;
import kotlin.getMagicModuleStats;
import kotlin.getMimeTypeFromMp4ObjectType;
import kotlin.getResolutionSize;
import kotlin.getShowPopup;
import kotlin.getYear;
import kotlin.isSeekPending;
import kotlin.mapOf;
import kotlin.mapOfKeyValueArrays;
import kotlin.mutableSetOfWithSize;
import kotlin.onDisplayInfoChanged;
import kotlin.setSdkPayload;
import kotlin.setStartTime;
import kotlin.setUpdatedStatus;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.updateLoadingFinished;
import kotlin.zzbV;
import kotlin.zzhs;
import kotlin.zzkx;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u001a\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0010\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0017\u0010#\u001a\u00020%8\u0007¢\u0006\f\n\u0004\b\u0018\u0010&\u001a\u0004\b\u001a\u0010'R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020)0(8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010*R\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020)0+8G¢\u0006\u0006\u001a\u0004\b#\u0010,R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020.0-8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010/R \u00104\u001a\b\u0012\u0004\u0012\u00020.008\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b\u0016\u00103R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u0014058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u00106R \u0010:\u001a\b\u0012\u0004\u0012\u00020\u0014078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b4\u00108\u001a\u0004\b\u001f\u00109R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020\u0014058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u00106R \u0010<\u001a\b\u0012\u0004\u0012\u00020\u0014078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b;\u00108\u001a\u0004\b!\u00109"}, d2 = {"Lcom/marrow2/ui/pearl/relatedmcq/RelatedMcqViewModel;", "Lo/POJOPropertyBuilderWithMember;", "Lo/POJOPropertyBuilder5;", "p0", "Lo/NetworkTypeObserverApi31DisplayInfoCallback;", "p1", "Lo/getMimeTypeFromMp4ObjectType;", "p2", "Lo/allSamplesAreSyncSamples;", "p3", "Lo/isSeekPending;", "p4", "<init>", "(Lo/POJOPropertyBuilder5;Lo/NetworkTypeObserverApi31DisplayInfoCallback;Lo/getMimeTypeFromMp4ObjectType;Lo/allSamplesAreSyncSamples;Lo/isSeekPending;)V", "Lo/mutableSetOfWithSize;", "", "RemoteActionCompatParcelizer", "(Lo/mutableSetOfWithSize;)V", "", "Lo/onDisplayInfoChanged;", "", "Lo/zzhs;", "IconCompatParcelizer", "(Ljava/lang/String;Lo/onDisplayInfoChanged;ZLo/zzhs;)V", "AudioAttributesImplBaseParcelizer", "(Ljava/lang/String;)V", "AudioAttributesCompatParcelizer", "(Z)V", "AudioAttributesImplApi21Parcelizer", "Lo/NetworkTypeObserverApi31DisplayInfoCallback;", "write", "MediaBrowserCompatCustomActionResultReceiver", "Lo/getMimeTypeFromMp4ObjectType;", "MediaBrowserCompatItemReceiver", "Lo/allSamplesAreSyncSamples;", "read", "Lo/isSeekPending;", "Lo/mapOf;", "Lo/mapOf;", "()Lo/mapOf;", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "Lo/createNotificationChannel;", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "", "()Ljava/util/List;", "Lo/fromCursor;", "Lo/mapOfKeyValueArrays;", "Lo/fromCursor;", "Lo/NewNumberOtpResendRequest;", "MediaBrowserCompatMediaItem", "Lo/NewNumberOtpResendRequest;", "()Lo/NewNumberOtpResendRequest;", "AudioAttributesImplApi26Parcelizer", "Lo/getResolutionSize;", "Lo/getResolutionSize;", "Lo/setUpdatedStatus;", "Lo/setUpdatedStatus;", "()Lo/setUpdatedStatus;", "MediaBrowserCompatSearchResultReceiver", "MediaMetadataCompat", "RatingCompat"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RelatedMcqViewModel extends POJOPropertyBuilderWithMember {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<Boolean> AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final NetworkTypeObserverApi31DisplayInfoCallback write;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final setUpdatedStatus<Boolean> MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final mapOf read;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final fromCursor<mapOfKeyValueArrays> MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final getMimeTypeFromMp4ObjectType IconCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final allSamplesAreSyncSamples AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private final NewNumberOtpResendRequest<mapOfKeyValueArrays> AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private final setUpdatedStatus<Boolean> RatingCompat;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<Boolean> MediaMetadataCompat;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final isSeekPending RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final SnapshotStateList<createNotificationChannel> AudioAttributesImplApi21Parcelizer;

    public static final /* synthetic */ class IconCompatParcelizer {
        public static final /* synthetic */ int[] write;

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
            write = iArr;
        }
    }

    @setSdkPayload
    public RelatedMcqViewModel(POJOPropertyBuilder5 pOJOPropertyBuilder5, NetworkTypeObserverApi31DisplayInfoCallback networkTypeObserverApi31DisplayInfoCallback, getMimeTypeFromMp4ObjectType getmimetypefrommp4objecttype, allSamplesAreSyncSamples allsamplesaresyncsamples, isSeekPending isseekpending) {
        toMagicModuleMetaRepoModel.write(pOJOPropertyBuilder5, "");
        toMagicModuleMetaRepoModel.write(networkTypeObserverApi31DisplayInfoCallback, "");
        toMagicModuleMetaRepoModel.write(getmimetypefrommp4objecttype, "");
        toMagicModuleMetaRepoModel.write(allsamplesaresyncsamples, "");
        toMagicModuleMetaRepoModel.write(isseekpending, "");
        this.write = networkTypeObserverApi31DisplayInfoCallback;
        this.IconCompatParcelizer = getmimetypefrommp4objecttype;
        this.AudioAttributesCompatParcelizer = allsamplesaresyncsamples;
        this.RemoteActionCompatParcelizer = isseekpending;
        mapOf.Companion companion = mapOf.INSTANCE;
        this.read = mapOf.Companion.RemoteActionCompatParcelizer(pOJOPropertyBuilder5);
        this.AudioAttributesImplApi21Parcelizer = _qbuf.write();
        fromCursor<mapOfKeyValueArrays> fromcursor = getLastName.read(0, null, 7);
        this.MediaBrowserCompatItemReceiver = fromcursor;
        this.AudioAttributesImplApi26Parcelizer = VerifyNewNumberRequest.AudioAttributesCompatParcelizer(fromcursor);
        getResolutionSize<Boolean> getresolutionsizeRemoteActionCompatParcelizer = setStartTime.RemoteActionCompatParcelizer(Boolean.TRUE);
        this.AudioAttributesImplBaseParcelizer = getresolutionsizeRemoteActionCompatParcelizer;
        this.MediaBrowserCompatSearchResultReceiver = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer);
        getResolutionSize<Boolean> getresolutionsizeRemoteActionCompatParcelizer2 = setStartTime.RemoteActionCompatParcelizer(Boolean.FALSE);
        this.MediaMetadataCompat = getresolutionsizeRemoteActionCompatParcelizer2;
        this.RatingCompat = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer2);
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AnonymousClass3(null), new MagicModuleSubmissionRequestBody() { // from class: o.currentThreadTimeMillis
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return RelatedMcqViewModel.write(this.RemoteActionCompatParcelizer, (String) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final mapOf getRead() {
        return this.read;
    }

    public final List<createNotificationChannel> read() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final NewNumberOtpResendRequest<mapOfKeyValueArrays> IconCompatParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final setUpdatedStatus<Boolean> MediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    public final setUpdatedStatus<Boolean> MediaBrowserCompatItemReceiver() {
        return this.RatingCompat;
    }

    /* JADX INFO: renamed from: com.marrow2.ui.pearl.relatedmcq.RelatedMcqViewModel$3, reason: invalid class name */
    static final class AnonymousClass3 extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;
        private Object read;
        private Object write;

        /* JADX WARN: Removed duplicated region for block: B:19:0x0093  */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                int r1 = r10.IconCompatParcelizer
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2a
                if (r1 == r4) goto L26
                if (r1 == r3) goto L22
                if (r1 != r2) goto L1a
                java.lang.Object r0 = r10.write
                androidx.compose.runtime.snapshots.SnapshotStateList r0 = (androidx.compose.runtime.snapshots.SnapshotStateList) r0
                kotlin.SdkPayloadData.IconCompatParcelizer(r11)
                goto L94
            L1a:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r11)
                throw r10
            L22:
                kotlin.SdkPayloadData.IconCompatParcelizer(r11)
                goto L74
            L26:
                kotlin.SdkPayloadData.IconCompatParcelizer(r11)
                goto L55
            L2a:
                kotlin.SdkPayloadData.IconCompatParcelizer(r11)
                com.marrow2.ui.pearl.relatedmcq.RelatedMcqViewModel r11 = com.marrow2.ui.pearl.relatedmcq.RelatedMcqViewModel.this
                o.getResolutionSize r11 = com.marrow2.ui.pearl.relatedmcq.RelatedMcqViewModel.AudioAttributesCompatParcelizer(r11)
                java.lang.Boolean r1 = kotlin.QBankStatsResponse.AudioAttributesCompatParcelizer(r4)
                r11.write(r1)
                com.marrow2.ui.pearl.relatedmcq.RelatedMcqViewModel r11 = com.marrow2.ui.pearl.relatedmcq.RelatedMcqViewModel.this
                o.NetworkTypeObserverApi31DisplayInfoCallback r11 = com.marrow2.ui.pearl.relatedmcq.RelatedMcqViewModel.IconCompatParcelizer(r11)
                com.marrow2.ui.pearl.relatedmcq.RelatedMcqViewModel r1 = com.marrow2.ui.pearl.relatedmcq.RelatedMcqViewModel.this
                o.mapOf r1 = r1.getRead()
                java.lang.String r1 = r1.getAudioAttributesCompatParcelizer()
                r5 = r10
                o.SampleVideos r5 = (kotlin.SampleVideos) r5
                r10.IconCompatParcelizer = r4
                java.lang.Object r11 = r11.AudioAttributesCompatParcelizer(r1, r5)
                if (r11 == r0) goto Laa
            L55:
                com.marrow2.ui.pearl.relatedmcq.RelatedMcqViewModel r11 = com.marrow2.ui.pearl.relatedmcq.RelatedMcqViewModel.this
                o.getMimeTypeFromMp4ObjectType r4 = com.marrow2.ui.pearl.relatedmcq.RelatedMcqViewModel.read(r11)
                com.marrow2.ui.pearl.relatedmcq.RelatedMcqViewModel r11 = com.marrow2.ui.pearl.relatedmcq.RelatedMcqViewModel.this
                o.mapOf r11 = r11.getRead()
                java.lang.String r5 = r11.getAudioAttributesCompatParcelizer()
                o.getMediaMimeType r6 = kotlin.getMediaMimeType.AudioAttributesImplBaseParcelizer
                r9 = r10
                o.SampleVideos r9 = (kotlin.SampleVideos) r9
                r10.IconCompatParcelizer = r3
                r7 = 0
                r8 = 0
                java.lang.Object r11 = r4.write(r5, r6, r7, r8, r9)
                if (r11 == r0) goto Laa
            L74:
                java.util.List r11 = (java.util.List) r11
                com.marrow2.ui.pearl.relatedmcq.RelatedMcqViewModel r1 = com.marrow2.ui.pearl.relatedmcq.RelatedMcqViewModel.this
                androidx.compose.runtime.snapshots.SnapshotStateList r1 = com.marrow2.ui.pearl.relatedmcq.RelatedMcqViewModel.write(r1)
                com.marrow2.ui.pearl.relatedmcq.RelatedMcqViewModel r3 = com.marrow2.ui.pearl.relatedmcq.RelatedMcqViewModel.this
                o.NetworkTypeObserverApi31DisplayInfoCallback r3 = com.marrow2.ui.pearl.relatedmcq.RelatedMcqViewModel.IconCompatParcelizer(r3)
                r4 = r10
                o.SampleVideos r4 = (kotlin.SampleVideos) r4
                r5 = 0
                r10.read = r5
                r10.write = r1
                r10.IconCompatParcelizer = r2
                java.lang.Object r11 = r3.RemoteActionCompatParcelizer(r11, r4)
                if (r11 != r0) goto L93
                goto Laa
            L93:
                r0 = r1
            L94:
                java.util.Collection r11 = (java.util.Collection) r11
                r0.addAll(r11)
                com.marrow2.ui.pearl.relatedmcq.RelatedMcqViewModel r10 = com.marrow2.ui.pearl.relatedmcq.RelatedMcqViewModel.this
                o.getResolutionSize r10 = com.marrow2.ui.pearl.relatedmcq.RelatedMcqViewModel.AudioAttributesCompatParcelizer(r10)
                r11 = 0
                java.lang.Boolean r11 = kotlin.QBankStatsResponse.AudioAttributesCompatParcelizer(r11)
                r10.write(r11)
                o.getShowPopup r10 = kotlin.getShowPopup.INSTANCE
                return r10
            Laa:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.pearl.relatedmcq.RelatedMcqViewModel.AnonymousClass3.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        AnonymousClass3(SampleVideos<? super AnonymousClass3> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return RelatedMcqViewModel.this.new AnonymousClass3(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AnonymousClass3) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ String AudioAttributesCompatParcelizer;
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.write = 1;
                if (RelatedMcqViewModel.this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer(new mapOfKeyValueArrays.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer), this) == objIconCompatParcelizer) {
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
        RemoteActionCompatParcelizer(String str, SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.AudioAttributesCompatParcelizer = str;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return RelatedMcqViewModel.this.new RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(RelatedMcqViewModel relatedMcqViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        relatedMcqViewModel.AudioAttributesImplBaseParcelizer.write(Boolean.FALSE);
        C0201setMcqCount.IconCompatParcelizer(TypeResolutionContextBasic.write(relatedMcqViewModel), null, null, relatedMcqViewModel.new RemoteActionCompatParcelizer(str, null), 3);
        return getShowPopup.INSTANCE;
    }

    public final void RemoteActionCompatParcelizer(mutableSetOfWithSize p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (p0 instanceof mutableSetOfWithSize.IconCompatParcelizer) {
            mutableSetOfWithSize.IconCompatParcelizer iconCompatParcelizer = (mutableSetOfWithSize.IconCompatParcelizer) p0;
            IconCompatParcelizer(iconCompatParcelizer.getWrite(), iconCompatParcelizer.getAudioAttributesCompatParcelizer(), iconCompatParcelizer.getRead(), iconCompatParcelizer.getIconCompatParcelizer());
        } else if (p0 instanceof mutableSetOfWithSize.RemoteActionCompatParcelizer) {
            AudioAttributesImplBaseParcelizer(((mutableSetOfWithSize.RemoteActionCompatParcelizer) p0).write());
        } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, mutableSetOfWithSize.read.INSTANCE)) {
            AudioAttributesCompatParcelizer(true);
        } else {
            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, mutableSetOfWithSize.write.INSTANCE)) {
                throw new RenewEligibleCreator();
            }
            AudioAttributesCompatParcelizer(false);
        }
    }

    private final void IconCompatParcelizer(final String p0, onDisplayInfoChanged p1, boolean p2, zzhs p3) {
        zzkx zzkxVar;
        Iterator<createNotificationChannel> it = this.AudioAttributesImplApi21Parcelizer.iterator();
        final int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) it.next().getIconCompatParcelizer(), (Object) p0)) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            SnapshotStateList<createNotificationChannel> snapshotStateList = this.AudioAttributesImplApi21Parcelizer;
            createNotificationChannel createnotificationchannel = snapshotStateList.get(i);
            snapshotStateList.set(i, createNotificationChannel.RemoteActionCompatParcelizer(createnotificationchannel.IconCompatParcelizer, createnotificationchannel.AudioAttributesCompatParcelizer, p1, createnotificationchannel.MediaBrowserCompatCustomActionResultReceiver, createnotificationchannel.AudioAttributesImplBaseParcelizer, createnotificationchannel.AudioAttributesImplApi21Parcelizer, createnotificationchannel.RemoteActionCompatParcelizer));
            if (p2) {
                return;
            }
            int i2 = IconCompatParcelizer.write[p3.ordinal()];
            if (i2 == 1) {
                zzkxVar = zzkx.AudioAttributesImplBaseParcelizer;
            } else if (i2 == 2) {
                zzkxVar = zzkx.RemoteActionCompatParcelizer;
            } else if (i2 == 3) {
                zzkxVar = zzkx.IconCompatParcelizer;
            } else {
                zzkxVar = zzkx.AudioAttributesImplApi21Parcelizer;
            }
            this.RemoteActionCompatParcelizer.write(zzbV.RemoteActionCompatParcelizer(p1.ordinal(), zzkxVar), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
            CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new read(p0, p1, null), new MagicModuleSubmissionRequestBody() { // from class: o.ClockCC
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return RelatedMcqViewModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, p0, i, (String) obj2);
                }
            });
        }
    }

    static final class read extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ onDisplayInfoChanged AudioAttributesCompatParcelizer;
        private /* synthetic */ String IconCompatParcelizer;
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.RemoteActionCompatParcelizer = 1;
                if (RelatedMcqViewModel.this.write.RemoteActionCompatParcelizer(this.IconCompatParcelizer, this.AudioAttributesCompatParcelizer, this) == objIconCompatParcelizer) {
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
        read(String str, onDisplayInfoChanged ondisplayinfochanged, SampleVideos<? super read> sampleVideos) {
            super(1, sampleVideos);
            this.IconCompatParcelizer = str;
            this.AudioAttributesCompatParcelizer = ondisplayinfochanged;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return RelatedMcqViewModel.this.new read(this.IconCompatParcelizer, this.AudioAttributesCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class write extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ String AudioAttributesCompatParcelizer;
        private /* synthetic */ String IconCompatParcelizer;
        private /* synthetic */ int RemoteActionCompatParcelizer;
        private int read;

        /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
        
            if (r6 == r0) goto L17;
         */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                int r1 = r5.read
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.SdkPayloadData.IconCompatParcelizer(r6)
                goto L4d
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L1a:
                kotlin.SdkPayloadData.IconCompatParcelizer(r6)
                goto L39
            L1e:
                kotlin.SdkPayloadData.IconCompatParcelizer(r6)
                com.marrow2.ui.pearl.relatedmcq.RelatedMcqViewModel r6 = com.marrow2.ui.pearl.relatedmcq.RelatedMcqViewModel.this
                o.fromCursor r6 = com.marrow2.ui.pearl.relatedmcq.RelatedMcqViewModel.MediaBrowserCompatCustomActionResultReceiver(r6)
                o.mapOfKeyValueArrays$write r1 = new o.mapOfKeyValueArrays$write
                java.lang.String r4 = r5.AudioAttributesCompatParcelizer
                r1.<init>(r4)
                r4 = r5
                o.SampleVideos r4 = (kotlin.SampleVideos) r4
                r5.read = r3
                java.lang.Object r6 = r6.RemoteActionCompatParcelizer(r1, r4)
                if (r6 == r0) goto L6f
            L39:
                com.marrow2.ui.pearl.relatedmcq.RelatedMcqViewModel r6 = com.marrow2.ui.pearl.relatedmcq.RelatedMcqViewModel.this
                o.NetworkTypeObserverApi31DisplayInfoCallback r6 = com.marrow2.ui.pearl.relatedmcq.RelatedMcqViewModel.IconCompatParcelizer(r6)
                java.lang.String r1 = r5.IconCompatParcelizer
                r3 = r5
                o.SampleVideos r3 = (kotlin.SampleVideos) r3
                r5.read = r2
                java.lang.Object r6 = r6.write(r1, r3)
                if (r6 != r0) goto L4d
                goto L6f
            L4d:
                o.onDisplayInfoChanged r6 = (kotlin.onDisplayInfoChanged) r6
                com.marrow2.ui.pearl.relatedmcq.RelatedMcqViewModel r0 = com.marrow2.ui.pearl.relatedmcq.RelatedMcqViewModel.this
                androidx.compose.runtime.snapshots.SnapshotStateList r0 = com.marrow2.ui.pearl.relatedmcq.RelatedMcqViewModel.write(r0)
                int r1 = r5.RemoteActionCompatParcelizer
                com.marrow2.ui.pearl.relatedmcq.RelatedMcqViewModel r2 = com.marrow2.ui.pearl.relatedmcq.RelatedMcqViewModel.this
                androidx.compose.runtime.snapshots.SnapshotStateList r2 = com.marrow2.ui.pearl.relatedmcq.RelatedMcqViewModel.write(r2)
                int r5 = r5.RemoteActionCompatParcelizer
                java.lang.Object r5 = r2.get(r5)
                o.createNotificationChannel r5 = (kotlin.createNotificationChannel) r5
                o.createNotificationChannel r5 = kotlin.createNotificationChannel.read(r5, r6)
                r0.set(r1, r5)
                o.getShowPopup r5 = kotlin.getShowPopup.INSTANCE
                return r5
            L6f:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.pearl.relatedmcq.RelatedMcqViewModel.write.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        write(String str, String str2, int i, SampleVideos<? super write> sampleVideos) {
            super(1, sampleVideos);
            this.AudioAttributesCompatParcelizer = str;
            this.IconCompatParcelizer = str2;
            this.RemoteActionCompatParcelizer = i;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return RelatedMcqViewModel.this.new write(this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(RelatedMcqViewModel relatedMcqViewModel, String str, int i, String str2) {
        toMagicModuleMetaRepoModel.write(str2, "");
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(relatedMcqViewModel), relatedMcqViewModel.new write(str2, str, i, null), new MagicModuleSubmissionRequestBody() { // from class: o.defaultcurrentThreadTimeMillis
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return RelatedMcqViewModel.write((String) obj2);
            }
        });
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    static final class MediaBrowserCompatItemReceiver extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ String IconCompatParcelizer;
        private Object RemoteActionCompatParcelizer;
        private int write;

        /* JADX WARN: Code restructure failed: missing block: B:22:0x008b, code lost:
        
            if (r7.read.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer(new o.mapOfKeyValueArrays.read(r7.read.getRead().getAudioAttributesCompatParcelizer(), r7.IconCompatParcelizer), r7) == r0) goto L26;
         */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                int r1 = r7.write
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L20
                if (r1 == r3) goto L1c
                if (r1 != r2) goto L14
                kotlin.SdkPayloadData.IconCompatParcelizer(r8)
                goto L8e
            L14:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L1c:
                kotlin.SdkPayloadData.IconCompatParcelizer(r8)
                goto L69
            L20:
                kotlin.SdkPayloadData.IconCompatParcelizer(r8)
                com.marrow2.ui.pearl.relatedmcq.RelatedMcqViewModel r8 = com.marrow2.ui.pearl.relatedmcq.RelatedMcqViewModel.this
                androidx.compose.runtime.snapshots.SnapshotStateList r8 = com.marrow2.ui.pearl.relatedmcq.RelatedMcqViewModel.write(r8)
                java.lang.Iterable r8 = (java.lang.Iterable) r8
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                java.util.Collection r1 = (java.util.Collection) r1
                java.util.Iterator r8 = r8.iterator()
            L36:
                boolean r5 = r8.hasNext()
                if (r5 == 0) goto L54
                java.lang.Object r5 = r8.next()
                o.createNotificationChannel r5 = (kotlin.createNotificationChannel) r5
                boolean r6 = r5.getRemoteActionCompatParcelizer()
                if (r6 != 0) goto L4d
                java.lang.String r5 = r5.getIconCompatParcelizer()
                goto L4e
            L4d:
                r5 = r4
            L4e:
                if (r5 == 0) goto L36
                r1.add(r5)
                goto L36
            L54:
                java.util.List r1 = (java.util.List) r1
                com.marrow2.ui.pearl.relatedmcq.RelatedMcqViewModel r8 = com.marrow2.ui.pearl.relatedmcq.RelatedMcqViewModel.this
                o.allSamplesAreSyncSamples r8 = com.marrow2.ui.pearl.relatedmcq.RelatedMcqViewModel.RemoteActionCompatParcelizer(r8)
                r5 = r7
                o.SampleVideos r5 = (kotlin.SampleVideos) r5
                r7.RemoteActionCompatParcelizer = r4
                r7.write = r3
                java.lang.Object r8 = r8.write(r1, r5)
                if (r8 == r0) goto L91
            L69:
                com.marrow2.ui.pearl.relatedmcq.RelatedMcqViewModel r8 = com.marrow2.ui.pearl.relatedmcq.RelatedMcqViewModel.this
                o.fromCursor r8 = com.marrow2.ui.pearl.relatedmcq.RelatedMcqViewModel.MediaBrowserCompatCustomActionResultReceiver(r8)
                com.marrow2.ui.pearl.relatedmcq.RelatedMcqViewModel r1 = com.marrow2.ui.pearl.relatedmcq.RelatedMcqViewModel.this
                o.mapOf r1 = r1.getRead()
                java.lang.String r1 = r1.getAudioAttributesCompatParcelizer()
                java.lang.String r3 = r7.IconCompatParcelizer
                o.mapOfKeyValueArrays$read r5 = new o.mapOfKeyValueArrays$read
                r5.<init>(r1, r3)
                r1 = r7
                o.SampleVideos r1 = (kotlin.SampleVideos) r1
                r7.RemoteActionCompatParcelizer = r4
                r7.write = r2
                java.lang.Object r7 = r8.RemoteActionCompatParcelizer(r5, r1)
                if (r7 != r0) goto L8e
                goto L91
            L8e:
                o.getShowPopup r7 = kotlin.getShowPopup.INSTANCE
                return r7
            L91:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.pearl.relatedmcq.RelatedMcqViewModel.MediaBrowserCompatItemReceiver.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        MediaBrowserCompatItemReceiver(String str, SampleVideos<? super MediaBrowserCompatItemReceiver> sampleVideos) {
            super(1, sampleVideos);
            this.IconCompatParcelizer = str;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return RelatedMcqViewModel.this.new MediaBrowserCompatItemReceiver(this.IconCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatItemReceiver) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void AudioAttributesImplBaseParcelizer(String p0) {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new MediaBrowserCompatItemReceiver(p0, null), new MagicModuleSubmissionRequestBody() { // from class: o.isPackageSide
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return RelatedMcqViewModel.AudioAttributesCompatParcelizer(this.write, (String) obj2);
            }
        });
    }

    static final class AudioAttributesImplBaseParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ String AudioAttributesCompatParcelizer;
        private int IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.IconCompatParcelizer = 1;
                if (RelatedMcqViewModel.this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer(new mapOfKeyValueArrays.write(this.AudioAttributesCompatParcelizer), this) == objIconCompatParcelizer) {
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
        AudioAttributesImplBaseParcelizer(String str, SampleVideos<? super AudioAttributesImplBaseParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.AudioAttributesCompatParcelizer = str;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return RelatedMcqViewModel.this.new AudioAttributesImplBaseParcelizer(this.AudioAttributesCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplBaseParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(RelatedMcqViewModel relatedMcqViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        C0201setMcqCount.IconCompatParcelizer(TypeResolutionContextBasic.write(relatedMcqViewModel), null, null, relatedMcqViewModel.new AudioAttributesImplBaseParcelizer(str, null), 3);
        return getShowPopup.INSTANCE;
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;
        private /* synthetic */ boolean read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            RelatedMcqViewModel.this.MediaMetadataCompat.write(QBankStatsResponse.AudioAttributesCompatParcelizer(this.read));
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesCompatParcelizer(boolean z, SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
            this.read = z;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return RelatedMcqViewModel.this.new AudioAttributesCompatParcelizer(this.read, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void AudioAttributesCompatParcelizer(boolean p0) {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AudioAttributesCompatParcelizer(p0, null), new MagicModuleSubmissionRequestBody() { // from class: o.CollectionUtils
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return RelatedMcqViewModel.read((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }
}
