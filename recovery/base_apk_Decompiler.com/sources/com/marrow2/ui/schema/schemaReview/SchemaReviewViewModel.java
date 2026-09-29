package com.marrow2.ui.schema.schemaReview;

import com.marrow2.ui.schema.schemaReview.SchemaReviewViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.CmcdHeadersFactoryCmcdObjectBuilder;
import kotlin.CurrentLocationRequestBuilder;
import kotlin.IntermediateLoginResponseBody;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.Metadata;
import kotlin.POJOPropertyBuilder5;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.Pair;
import kotlin.QBankStatsResponse;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.SurfaceInfo;
import kotlin.TypeResolutionContextBasic;
import kotlin.VerifyNewNumberRequest;
import kotlin.getAnswerMap;
import kotlin.getDisplaySizeV17;
import kotlin.getInitialTrigger;
import kotlin.getMagicModuleStats;
import kotlin.getMediaMimeType;
import kotlin.getMimeTypeFromMp4ObjectType;
import kotlin.getResolutionSize;
import kotlin.getShowPopup;
import kotlin.getYear;
import kotlin.isSeekPending;
import kotlin.setDurationMillis;
import kotlin.setMenuAlignmentMode;
import kotlin.setMessage;
import kotlin.setSdkPayload;
import kotlin.setStartTime;
import kotlin.setUpdatedStatus;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.updateLoadingFinished;
import org.apache.commons.compress.archivers.tar.TarConstants;
import org.apache.commons.compress.archivers.zip.UnixStat;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0013J\u0015\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u000f¢\u0006\u0004\b\u001a\u0010\u0013J\r\u0010\u001b\u001a\u00020\u000f¢\u0006\u0004\b\u001b\u0010\u0013J\u0015\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001d\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0018\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0010\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010!\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010%R\u0014\u0010(\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010'R\u0017\u0010\u0014\u001a\u00020)8\u0007¢\u0006\f\n\u0004\b\u001b\u0010*\u001a\u0004\b!\u0010+R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020-0,8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010.R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020-0/8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u00100\u001a\u0004\b(\u00101R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002020,8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010.R \u00103\u001a\b\u0012\u0004\u0012\u0002020/8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u00100\u001a\u0004\b\u001d\u00101R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\u000e0,8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b(\u0010.R \u0010#\u001a\b\u0012\u0004\u0012\u00020\u000e0/8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b3\u00100\u001a\u0004\b3\u00101"}, d2 = {"Lcom/marrow2/ui/schema/schemaReview/SchemaReviewViewModel;", "Lo/POJOPropertyBuilderWithMember;", "Lo/POJOPropertyBuilder5;", "p0", "Lo/SurfaceInfo;", "p1", "Lo/getMimeTypeFromMp4ObjectType;", "p2", "Lo/getDisplaySizeV17;", "p3", "Lo/isSeekPending;", "p4", "<init>", "(Lo/POJOPropertyBuilder5;Lo/SurfaceInfo;Lo/getMimeTypeFromMp4ObjectType;Lo/getDisplaySizeV17;Lo/isSeekPending;)V", "", "", "RemoteActionCompatParcelizer", "(Z)V", "AudioAttributesImplApi21Parcelizer", "()V", "MediaBrowserCompatItemReceiver", "MediaBrowserCompatMediaItem", "MediaBrowserCompatSearchResultReceiver", "Lo/getMediaMimeType;", "write", "(Lo/getMediaMimeType;)V", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesImplBaseParcelizer", "", "AudioAttributesCompatParcelizer", "(I)V", "MediaDescriptionCompat", "Lo/SurfaceInfo;", "read", "Lo/getMimeTypeFromMp4ObjectType;", "RatingCompat", "Lo/getDisplaySizeV17;", "Lo/isSeekPending;", "Lo/setDurationMillis;", "Lo/setDurationMillis;", "IconCompatParcelizer", "", "Ljava/lang/String;", "()Ljava/lang/String;", "Lo/getResolutionSize;", "Lo/getInitialTrigger;", "Lo/getResolutionSize;", "Lo/setUpdatedStatus;", "Lo/setUpdatedStatus;", "()Lo/setUpdatedStatus;", "Lo/CurrentLocationRequestBuilder;", "AudioAttributesImplApi26Parcelizer", "MediaMetadataCompat"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SchemaReviewViewModel extends POJOPropertyBuilderWithMember {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final isSeekPending read;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final setDurationMillis IconCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final setUpdatedStatus<Boolean> RatingCompat;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final String MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<Boolean> MediaMetadataCompat;
    private final setUpdatedStatus<getInitialTrigger> MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final setUpdatedStatus<CurrentLocationRequestBuilder> AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private final SurfaceInfo AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private final getDisplaySizeV17 RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<getInitialTrigger> AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final getMimeTypeFromMp4ObjectType write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final getResolutionSize<CurrentLocationRequestBuilder> AudioAttributesImplApi21Parcelizer;

    @setSdkPayload
    public SchemaReviewViewModel(POJOPropertyBuilder5 pOJOPropertyBuilder5, SurfaceInfo surfaceInfo, getMimeTypeFromMp4ObjectType getmimetypefrommp4objecttype, getDisplaySizeV17 getdisplaysizev17, isSeekPending isseekpending) {
        toMagicModuleMetaRepoModel.write(pOJOPropertyBuilder5, "");
        toMagicModuleMetaRepoModel.write(surfaceInfo, "");
        toMagicModuleMetaRepoModel.write(getmimetypefrommp4objecttype, "");
        toMagicModuleMetaRepoModel.write(getdisplaysizev17, "");
        toMagicModuleMetaRepoModel.write(isseekpending, "");
        this.AudioAttributesCompatParcelizer = surfaceInfo;
        this.write = getmimetypefrommp4objecttype;
        this.RemoteActionCompatParcelizer = getdisplaysizev17;
        this.read = isseekpending;
        setDurationMillis.Companion companion = setDurationMillis.INSTANCE;
        setDurationMillis setdurationmillisWrite = setDurationMillis.Companion.write(pOJOPropertyBuilder5);
        this.IconCompatParcelizer = setdurationmillisWrite;
        this.MediaBrowserCompatItemReceiver = setdurationmillisWrite.getIconCompatParcelizer();
        getResolutionSize<getInitialTrigger> getresolutionsizeRemoteActionCompatParcelizer = setStartTime.RemoteActionCompatParcelizer(new getInitialTrigger(null, null, false, false, false, null, null, null, 0, UnixStat.DEFAULT_LINK_PERM, null));
        this.AudioAttributesImplBaseParcelizer = getresolutionsizeRemoteActionCompatParcelizer;
        this.MediaBrowserCompatCustomActionResultReceiver = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer);
        getResolutionSize<CurrentLocationRequestBuilder> getresolutionsizeRemoteActionCompatParcelizer2 = setStartTime.RemoteActionCompatParcelizer(new CurrentLocationRequestBuilder(null, null, null, 7, null));
        this.AudioAttributesImplApi21Parcelizer = getresolutionsizeRemoteActionCompatParcelizer2;
        this.AudioAttributesImplApi26Parcelizer = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer2);
        getResolutionSize<Boolean> getresolutionsizeRemoteActionCompatParcelizer3 = setStartTime.RemoteActionCompatParcelizer(Boolean.TRUE);
        this.MediaMetadataCompat = getresolutionsizeRemoteActionCompatParcelizer3;
        this.RatingCompat = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer3);
        getresolutionsizeRemoteActionCompatParcelizer.write(new getInitialTrigger(setdurationmillisWrite.getRead(), null, false, false, false, null, null, null, 0, 510, null));
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AnonymousClass2(null), new MagicModuleSubmissionRequestBody() { // from class: o.DetectedActivity
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return SchemaReviewViewModel.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, (String) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final String getMediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final setUpdatedStatus<getInitialTrigger> IconCompatParcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final setUpdatedStatus<CurrentLocationRequestBuilder> AudioAttributesCompatParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final setUpdatedStatus<Boolean> AudioAttributesImplApi26Parcelizer() {
        return this.RatingCompat;
    }

    /* JADX INFO: renamed from: com.marrow2.ui.schema.schemaReview.SchemaReviewViewModel$2, reason: invalid class name */
    static final class AnonymousClass2 extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private Object AudioAttributesCompatParcelizer;
        private int IconCompatParcelizer;
        private int MediaBrowserCompatCustomActionResultReceiver;
        private Object RemoteActionCompatParcelizer;
        private Object read;
        private Object write;

        /* JADX WARN: Removed duplicated region for block: B:18:0x00c0  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x00c2  */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instruction units count: 226
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.schema.schemaReview.SchemaReviewViewModel.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        AnonymousClass2(SampleVideos<? super AnonymousClass2> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return SchemaReviewViewModel.this.new AnonymousClass2(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AnonymousClass2) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(SchemaReviewViewModel schemaReviewViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        schemaReviewViewModel.MediaMetadataCompat.write(Boolean.FALSE);
        return getShowPopup.INSTANCE;
    }

    static final class read extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;
        private /* synthetic */ boolean write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.RemoteActionCompatParcelizer = 1;
                if (SchemaReviewViewModel.this.RemoteActionCompatParcelizer.write(this.write, this) == objIconCompatParcelizer) {
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
        read(boolean z, SampleVideos<? super read> sampleVideos) {
            super(1, sampleVideos);
            this.write = z;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return SchemaReviewViewModel.this.new read(this.write, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplBaseParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    public final void RemoteActionCompatParcelizer(boolean p0) {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new read(p0, null), new MagicModuleSubmissionRequestBody() { // from class: o.getDurationMillis
            private static final byte[] $$a = {118, 56, TarConstants.LF_SYMLINK, 93, -19, -10, -3, 20, -6, 5};
            private static final int $$b = 225;
            private static int RemoteActionCompatParcelizer = 0;
            private static int write = 1;

            /* JADX WARN: Removed duplicated region for block: B:17:0x01fc  */
            /* JADX WARN: Removed duplicated region for block: B:18:0x01fe  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public static java.lang.Object[] IconCompatParcelizer(int r37, int r38, int r39) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 2661
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.getDurationMillis.IconCompatParcelizer(int, int, int):java.lang.Object[]");
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002d). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static void a(short r6, short r7, short r8, java.lang.Object[] r9) {
                /*
                    int r6 = r6 * 39
                    int r6 = r6 + 75
                    byte[] r0 = kotlin.getDurationMillis.$$a
                    int r7 = r7 * 3
                    int r1 = r7 + 4
                    int r8 = r8 * 3
                    int r8 = r8 + 4
                    byte[] r1 = new byte[r1]
                    int r7 = r7 + 3
                    r2 = 0
                    if (r0 != 0) goto L18
                    r3 = r8
                    r4 = r2
                    goto L2d
                L18:
                    r3 = r2
                L19:
                    byte r4 = (byte) r6
                    r1[r3] = r4
                    int r4 = r3 + 1
                    if (r3 != r7) goto L28
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    r9[r2] = r6
                    return
                L28:
                    r3 = r0[r8]
                    r5 = r3
                    r3 = r8
                    r8 = r5
                L2d:
                    int r6 = r6 + r8
                    int r8 = r3 + 1
                    int r6 = r6 + 6
                    r3 = r4
                    goto L19
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.getDurationMillis.a(short, short, short, java.lang.Object[]):void");
            }

            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return SchemaReviewViewModel.AudioAttributesImplBaseParcelizer((String) obj2);
            }
        });
        getResolutionSize<getInitialTrigger> getresolutionsize = this.AudioAttributesImplBaseParcelizer;
        getInitialTrigger getinitialtriggerIconCompatParcelizer = getresolutionsize.IconCompatParcelizer();
        getresolutionsize.write(getInitialTrigger.write((217 & 1) != 0 ? getinitialtriggerIconCompatParcelizer.AudioAttributesImplBaseParcelizer : null, (217 & 2) != 0 ? getinitialtriggerIconCompatParcelizer.RemoteActionCompatParcelizer : null, (217 & 4) != 0 ? getinitialtriggerIconCompatParcelizer.AudioAttributesImplApi21Parcelizer : p0, (217 & 8) != 0 ? getinitialtriggerIconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver : false, (217 & 16) != 0 ? getinitialtriggerIconCompatParcelizer.MediaBrowserCompatItemReceiver : false, (217 & 32) != 0 ? getinitialtriggerIconCompatParcelizer.IconCompatParcelizer : null, (217 & 64) != 0 ? getinitialtriggerIconCompatParcelizer.read : null, (217 & 128) != 0 ? getinitialtriggerIconCompatParcelizer.write : null, (217 & 256) != 0 ? getinitialtriggerIconCompatParcelizer.AudioAttributesCompatParcelizer : 0));
        isSeekPending isseekpending = this.read;
        setMenuAlignmentMode setmenualignmentmode = setMenuAlignmentMode.INSTANCE;
        isseekpending.write("qb_toggle_answer", setMenuAlignmentMode.write(this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer().getAudioAttributesImplApi21Parcelizer()), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
    }

    public final void AudioAttributesImplApi21Parcelizer() {
        getResolutionSize<getInitialTrigger> getresolutionsize = this.AudioAttributesImplBaseParcelizer;
        getInitialTrigger getinitialtriggerIconCompatParcelizer = getresolutionsize.IconCompatParcelizer();
        getresolutionsize.write(getInitialTrigger.write((217 & 1) != 0 ? getinitialtriggerIconCompatParcelizer.AudioAttributesImplBaseParcelizer : null, (217 & 2) != 0 ? getinitialtriggerIconCompatParcelizer.RemoteActionCompatParcelizer : null, (217 & 4) != 0 ? getinitialtriggerIconCompatParcelizer.AudioAttributesImplApi21Parcelizer : false, (217 & 8) != 0 ? getinitialtriggerIconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver : !this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer().getMediaBrowserCompatCustomActionResultReceiver(), (217 & 16) != 0 ? getinitialtriggerIconCompatParcelizer.MediaBrowserCompatItemReceiver : false, (217 & 32) != 0 ? getinitialtriggerIconCompatParcelizer.IconCompatParcelizer : null, (217 & 64) != 0 ? getinitialtriggerIconCompatParcelizer.read : null, (217 & 128) != 0 ? getinitialtriggerIconCompatParcelizer.write : null, (217 & 256) != 0 ? getinitialtriggerIconCompatParcelizer.AudioAttributesCompatParcelizer : 0));
        isSeekPending isseekpending = this.read;
        setMenuAlignmentMode setmenualignmentmode = setMenuAlignmentMode.INSTANCE;
        isseekpending.write("qb_toggle_grid", setMenuAlignmentMode.RemoteActionCompatParcelizer(!this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer().getMediaBrowserCompatCustomActionResultReceiver()), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
    }

    public final void MediaBrowserCompatItemReceiver() {
        if (!this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer().getMediaBrowserCompatItemReceiver()) {
            MediaBrowserCompatSearchResultReceiver();
        } else {
            MediaBrowserCompatMediaItem();
        }
    }

    private final void MediaBrowserCompatMediaItem() {
        getResolutionSize<CurrentLocationRequestBuilder> getresolutionsize = this.AudioAttributesImplApi21Parcelizer;
        getresolutionsize.write(CurrentLocationRequestBuilder.AudioAttributesCompatParcelizer(getresolutionsize.IconCompatParcelizer(), null, getMediaMimeType.AudioAttributesImplBaseParcelizer, IntermediateLoginResponseBody.RemoteActionCompatParcelizer(), 1));
        getResolutionSize<getInitialTrigger> getresolutionsize2 = this.AudioAttributesImplBaseParcelizer;
        getInitialTrigger getinitialtriggerIconCompatParcelizer = getresolutionsize2.IconCompatParcelizer();
        getresolutionsize2.write(getInitialTrigger.write((217 & 1) != 0 ? getinitialtriggerIconCompatParcelizer.AudioAttributesImplBaseParcelizer : null, (217 & 2) != 0 ? getinitialtriggerIconCompatParcelizer.RemoteActionCompatParcelizer : null, (217 & 4) != 0 ? getinitialtriggerIconCompatParcelizer.AudioAttributesImplApi21Parcelizer : false, (217 & 8) != 0 ? getinitialtriggerIconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver : false, (217 & 16) != 0 ? getinitialtriggerIconCompatParcelizer.MediaBrowserCompatItemReceiver : false, (217 & 32) != 0 ? getinitialtriggerIconCompatParcelizer.IconCompatParcelizer : null, (217 & 64) != 0 ? getinitialtriggerIconCompatParcelizer.read : null, (217 & 128) != 0 ? getinitialtriggerIconCompatParcelizer.write : null, (217 & 256) != 0 ? getinitialtriggerIconCompatParcelizer.AudioAttributesCompatParcelizer : 0));
    }

    static final class write extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private Object RemoteActionCompatParcelizer;
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            setMessage setmessage;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.write = 1;
                obj = SchemaReviewViewModel.this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver(SchemaReviewViewModel.this.IconCompatParcelizer.getAudioAttributesCompatParcelizer(), this);
                if (obj != objIconCompatParcelizer) {
                }
                return objIconCompatParcelizer;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                setmessage = (setMessage) this.RemoteActionCompatParcelizer;
                SdkPayloadData.IconCompatParcelizer(obj);
                int iIntValue = ((Number) obj).intValue();
                ArrayList arrayList = new ArrayList();
                arrayList.add(new Pair(getMediaMimeType.AudioAttributesImplBaseParcelizer, QBankStatsResponse.RemoteActionCompatParcelizer(setmessage.getMediaBrowserCompatCustomActionResultReceiver())));
                arrayList.add(new Pair(getMediaMimeType.AudioAttributesCompatParcelizer, QBankStatsResponse.RemoteActionCompatParcelizer(iIntValue)));
                arrayList.add(new Pair(getMediaMimeType.AudioAttributesImplApi26Parcelizer, QBankStatsResponse.RemoteActionCompatParcelizer(setmessage.getAudioAttributesImplApi26Parcelizer())));
                arrayList.add(new Pair(getMediaMimeType.MediaMetadataCompat, QBankStatsResponse.RemoteActionCompatParcelizer(setmessage.getAudioAttributesImplBaseParcelizer())));
                arrayList.add(new Pair(getMediaMimeType.MediaBrowserCompatItemReceiver, QBankStatsResponse.RemoteActionCompatParcelizer(setmessage.MediaBrowserCompatItemReceiver())));
                SchemaReviewViewModel.this.AudioAttributesImplApi21Parcelizer.write(CurrentLocationRequestBuilder.AudioAttributesCompatParcelizer(SchemaReviewViewModel.this.AudioAttributesCompatParcelizer().IconCompatParcelizer(), null, ((CurrentLocationRequestBuilder) SchemaReviewViewModel.this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer()).getWrite(), arrayList, 1));
                getResolutionSize getresolutionsize = SchemaReviewViewModel.this.AudioAttributesImplBaseParcelizer;
                getInitialTrigger getinitialtrigger = (getInitialTrigger) SchemaReviewViewModel.this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer();
                getresolutionsize.write(getInitialTrigger.write((217 & 1) != 0 ? getinitialtrigger.AudioAttributesImplBaseParcelizer : null, (217 & 2) != 0 ? getinitialtrigger.RemoteActionCompatParcelizer : null, (217 & 4) != 0 ? getinitialtrigger.AudioAttributesImplApi21Parcelizer : false, (217 & 8) != 0 ? getinitialtrigger.MediaBrowserCompatCustomActionResultReceiver : false, (217 & 16) != 0 ? getinitialtrigger.MediaBrowserCompatItemReceiver : true, (217 & 32) != 0 ? getinitialtrigger.IconCompatParcelizer : null, (217 & 64) != 0 ? getinitialtrigger.read : null, (217 & 128) != 0 ? getinitialtrigger.write : null, (217 & 256) != 0 ? getinitialtrigger.AudioAttributesCompatParcelizer : 0));
                return getShowPopup.INSTANCE;
            }
            SdkPayloadData.IconCompatParcelizer(obj);
            setMessage setmessage2 = (setMessage) obj;
            this.RemoteActionCompatParcelizer = setmessage2;
            this.write = 2;
            Object objRemoteActionCompatParcelizer = SchemaReviewViewModel.this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(SchemaReviewViewModel.this.IconCompatParcelizer.getAudioAttributesCompatParcelizer(), this);
            if (objRemoteActionCompatParcelizer != objIconCompatParcelizer) {
                setmessage = setmessage2;
                obj = objRemoteActionCompatParcelizer;
                int iIntValue2 = ((Number) obj).intValue();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(new Pair(getMediaMimeType.AudioAttributesImplBaseParcelizer, QBankStatsResponse.RemoteActionCompatParcelizer(setmessage.getMediaBrowserCompatCustomActionResultReceiver())));
                arrayList2.add(new Pair(getMediaMimeType.AudioAttributesCompatParcelizer, QBankStatsResponse.RemoteActionCompatParcelizer(iIntValue2)));
                arrayList2.add(new Pair(getMediaMimeType.AudioAttributesImplApi26Parcelizer, QBankStatsResponse.RemoteActionCompatParcelizer(setmessage.getAudioAttributesImplApi26Parcelizer())));
                arrayList2.add(new Pair(getMediaMimeType.MediaMetadataCompat, QBankStatsResponse.RemoteActionCompatParcelizer(setmessage.getAudioAttributesImplBaseParcelizer())));
                arrayList2.add(new Pair(getMediaMimeType.MediaBrowserCompatItemReceiver, QBankStatsResponse.RemoteActionCompatParcelizer(setmessage.MediaBrowserCompatItemReceiver())));
                SchemaReviewViewModel.this.AudioAttributesImplApi21Parcelizer.write(CurrentLocationRequestBuilder.AudioAttributesCompatParcelizer(SchemaReviewViewModel.this.AudioAttributesCompatParcelizer().IconCompatParcelizer(), null, ((CurrentLocationRequestBuilder) SchemaReviewViewModel.this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer()).getWrite(), arrayList2, 1));
                getResolutionSize getresolutionsize2 = SchemaReviewViewModel.this.AudioAttributesImplBaseParcelizer;
                getInitialTrigger getinitialtrigger2 = (getInitialTrigger) SchemaReviewViewModel.this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer();
                getresolutionsize2.write(getInitialTrigger.write((217 & 1) != 0 ? getinitialtrigger2.AudioAttributesImplBaseParcelizer : null, (217 & 2) != 0 ? getinitialtrigger2.RemoteActionCompatParcelizer : null, (217 & 4) != 0 ? getinitialtrigger2.AudioAttributesImplApi21Parcelizer : false, (217 & 8) != 0 ? getinitialtrigger2.MediaBrowserCompatCustomActionResultReceiver : false, (217 & 16) != 0 ? getinitialtrigger2.MediaBrowserCompatItemReceiver : true, (217 & 32) != 0 ? getinitialtrigger2.IconCompatParcelizer : null, (217 & 64) != 0 ? getinitialtrigger2.read : null, (217 & 128) != 0 ? getinitialtrigger2.write : null, (217 & 256) != 0 ? getinitialtrigger2.AudioAttributesCompatParcelizer : 0));
                return getShowPopup.INSTANCE;
            }
            return objIconCompatParcelizer;
        }

        write(SampleVideos<? super write> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return SchemaReviewViewModel.this.new write(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void MediaBrowserCompatSearchResultReceiver() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new write(null), new MagicModuleSubmissionRequestBody() { // from class: o.CurrentLocationRequest
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return SchemaReviewViewModel.write((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    public final void write(getMediaMimeType p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        getResolutionSize<CurrentLocationRequestBuilder> getresolutionsize = this.AudioAttributesImplApi21Parcelizer;
        getresolutionsize.write(CurrentLocationRequestBuilder.AudioAttributesCompatParcelizer(getresolutionsize.IconCompatParcelizer(), null, p0, null, 5));
    }

    public final void MediaBrowserCompatCustomActionResultReceiver() {
        this.AudioAttributesImplApi21Parcelizer.write(CurrentLocationRequestBuilder.AudioAttributesCompatParcelizer(this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer(), null, getMediaMimeType.AudioAttributesImplBaseParcelizer, null, 5));
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.AudioAttributesCompatParcelizer = 1;
                obj = SchemaReviewViewModel.this.AudioAttributesCompatParcelizer.write(SchemaReviewViewModel.this.IconCompatParcelizer.getAudioAttributesCompatParcelizer(), ((CurrentLocationRequestBuilder) SchemaReviewViewModel.this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer()).getRead(), this);
                if (obj == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            List list = (List) obj;
            getResolutionSize getresolutionsize = SchemaReviewViewModel.this.AudioAttributesImplApi21Parcelizer;
            getresolutionsize.write(CurrentLocationRequestBuilder.IconCompatParcelizer(((CurrentLocationRequestBuilder) SchemaReviewViewModel.this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer()).getRead(), getMediaMimeType.AudioAttributesImplBaseParcelizer, IntermediateLoginResponseBody.RemoteActionCompatParcelizer()));
            getResolutionSize getresolutionsize2 = SchemaReviewViewModel.this.AudioAttributesImplBaseParcelizer;
            getInitialTrigger getinitialtrigger = (getInitialTrigger) SchemaReviewViewModel.this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer();
            getresolutionsize2.write(getInitialTrigger.write((217 & 1) != 0 ? getinitialtrigger.AudioAttributesImplBaseParcelizer : null, (217 & 2) != 0 ? getinitialtrigger.RemoteActionCompatParcelizer : list, (217 & 4) != 0 ? getinitialtrigger.AudioAttributesImplApi21Parcelizer : false, (217 & 8) != 0 ? getinitialtrigger.MediaBrowserCompatCustomActionResultReceiver : false, (217 & 16) != 0 ? getinitialtrigger.MediaBrowserCompatItemReceiver : false, (217 & 32) != 0 ? getinitialtrigger.IconCompatParcelizer : null, (217 & 64) != 0 ? getinitialtrigger.read : null, (217 & 128) != 0 ? getinitialtrigger.write : null, (217 & 256) != 0 ? getinitialtrigger.AudioAttributesCompatParcelizer : 0));
            return getShowPopup.INSTANCE;
        }

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return SchemaReviewViewModel.this.new RemoteActionCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public final void AudioAttributesImplBaseParcelizer() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new RemoteActionCompatParcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.getMaxUpdateAgeMillis
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return SchemaReviewViewModel.MediaBrowserCompatItemReceiver((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatItemReceiver(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    public final void AudioAttributesCompatParcelizer(int p0) {
        getResolutionSize<getInitialTrigger> getresolutionsize = this.AudioAttributesImplBaseParcelizer;
        getInitialTrigger getinitialtriggerIconCompatParcelizer = getresolutionsize.IconCompatParcelizer();
        getresolutionsize.write(getInitialTrigger.write((217 & 1) != 0 ? getinitialtriggerIconCompatParcelizer.AudioAttributesImplBaseParcelizer : null, (217 & 2) != 0 ? getinitialtriggerIconCompatParcelizer.RemoteActionCompatParcelizer : null, (217 & 4) != 0 ? getinitialtriggerIconCompatParcelizer.AudioAttributesImplApi21Parcelizer : false, (217 & 8) != 0 ? getinitialtriggerIconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver : false, (217 & 16) != 0 ? getinitialtriggerIconCompatParcelizer.MediaBrowserCompatItemReceiver : false, (217 & 32) != 0 ? getinitialtriggerIconCompatParcelizer.IconCompatParcelizer : null, (217 & 64) != 0 ? getinitialtriggerIconCompatParcelizer.read : null, (217 & 128) != 0 ? getinitialtriggerIconCompatParcelizer.write : null, (217 & 256) != 0 ? getinitialtriggerIconCompatParcelizer.AudioAttributesCompatParcelizer : p0));
    }
}
