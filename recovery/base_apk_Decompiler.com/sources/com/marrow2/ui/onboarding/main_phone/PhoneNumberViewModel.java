package com.marrow2.ui.onboarding.main_phone;

import com.marrow2.ui.onboarding.main_phone.PhoneNumberViewModel;
import java.util.concurrent.CancellationException;
import kotlin.C0201setMcqCount;
import kotlin.CmcdHeadersFactoryCmcdObjectBuilder;
import kotlin.IntermediateLoginResponseBody;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.MergingMediaPeriodTimeOffsetMediaPeriod;
import kotlin.Metadata;
import kotlin.POJOPropertyBuilder5;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.PlayerControlViewExternalSyntheticLambda0;
import kotlin.QBankStatsResponse;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.TestGroupLSModel;
import kotlin.TopUserCompanion;
import kotlin.TypeResolutionContextBasic;
import kotlin.VerifyNewNumberRequest;
import kotlin.getAnswerMap;
import kotlin.getInfoWindowAnchorV;
import kotlin.getMagicModuleStats;
import kotlin.getPcmEncoding;
import kotlin.getResolutionSize;
import kotlin.getShowPopup;
import kotlin.getTotalMcq;
import kotlin.getYear;
import kotlin.isSeekPending;
import kotlin.limit;
import kotlin.peekChar;
import kotlin.readHeader;
import kotlin.readIBinder;
import kotlin.readIntegerObject;
import kotlin.readList;
import kotlin.readLongObject;
import kotlin.readSize;
import kotlin.setPassingYear;
import kotlin.setSdkPayload;
import kotlin.setStartTime;
import kotlin.setUpdatedStatus;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.updateLoadingFinished;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ(\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0015H\u0082@¢\u0006\u0004\b\u0013\u0010\u0016J \u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u000bH\u0082@¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0013\u001a\u00020\u000bH\u0082@¢\u0006\u0004\b\u0013\u0010\u001cJ\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u001dR\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\f\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010\u0018\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010*\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010\u000e\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010'R\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020-0,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010.R\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020-0/8\u0007¢\u0006\f\n\u0004\b\u000e\u00100\u001a\u0004\b\f\u00101R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u0002020,8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010.R \u00104\u001a\b\u0012\u0004\u0012\u0002020/8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b3\u00100\u001a\u0004\b*\u00101R\u001a\u00103\u001a\b\u0012\u0004\u0012\u0002050,8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b4\u0010.R \u0010\u001e\u001a\b\u0012\u0004\u0012\u0002050/8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b6\u00100\u001a\u0004\b \u00101R\u001a\u00108\u001a\b\u0012\u0004\u0012\u0002070,8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010.R \u0010(\u001a\b\u0012\u0004\u0012\u0002070/8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u00100\u001a\u0004\b\"\u00101R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00170,8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010.R \u00109\u001a\b\u0012\u0004\u0012\u00020\u00170/8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b8\u00100\u001a\u0004\b4\u00101R\u0018\u0010+\u001a\u0004\u0018\u00010:8\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0018\u0010;"}, d2 = {"Lcom/marrow2/ui/onboarding/main_phone/PhoneNumberViewModel;", "Lo/POJOPropertyBuilderWithMember;", "Lo/POJOPropertyBuilder5;", "p0", "Lo/peekChar;", "p1", "Lo/isSeekPending;", "p2", "<init>", "(Lo/POJOPropertyBuilder5;Lo/peekChar;Lo/isSeekPending;)V", "Lo/readHeader;", "", "IconCompatParcelizer", "(Lo/readHeader;)V", "MediaBrowserCompatItemReceiver", "()V", "", "", "Lo/limit;", "RemoteActionCompatParcelizer", "(ILjava/lang/String;Lo/limit;Lo/SampleVideos;)Ljava/lang/Object;", "Lo/getPcmEncoding;", "(Lo/limit;Lo/getPcmEncoding;Lo/SampleVideos;)Ljava/lang/Object;", "", "write", "(ZLo/limit;Lo/SampleVideos;)Ljava/lang/Object;", "AudioAttributesImplApi21Parcelizer", "()Ljava/lang/Object;", "(Lo/SampleVideos;)Ljava/lang/Object;", "(Ljava/lang/String;)V", "RatingCompat", "Lo/peekChar;", "AudioAttributesImplBaseParcelizer", "Lo/isSeekPending;", "AudioAttributesCompatParcelizer", "Lo/readList;", "MediaBrowserCompatSearchResultReceiver", "Lo/readList;", "MediaBrowserCompatCustomActionResultReceiver", "I", "MediaDescriptionCompat", "Ljava/lang/String;", "read", "handleMediaPlayPauseIfPendingOnHandler", "Lo/getResolutionSize;", "Lo/readLongObject;", "Lo/getResolutionSize;", "Lo/setUpdatedStatus;", "Lo/setUpdatedStatus;", "()Lo/setUpdatedStatus;", "Lo/readIBinder;", "MediaBrowserCompatMediaItem", "AudioAttributesImplApi26Parcelizer", "Lo/readSize;", "onCommand", "Lo/readIntegerObject;", "MediaMetadataCompat", "onAddQueueItem", "Lo/setPassingYear;", "Lo/setPassingYear;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PhoneNumberViewModel extends POJOPropertyBuilderWithMember {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<readIBinder> MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final setUpdatedStatus<readIntegerObject> MediaDescriptionCompat;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final getResolutionSize<readSize> MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final isSeekPending AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<Boolean> MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private int write;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final setUpdatedStatus<readLongObject> AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private final setUpdatedStatus<readIBinder> AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private final readList IconCompatParcelizer;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private String read;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private final setUpdatedStatus<Boolean> onAddQueueItem;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private final peekChar RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<readIntegerObject> MediaMetadataCompat;

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
    private int MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: onCommand, reason: from kotlin metadata */
    private final setUpdatedStatus<readSize> RatingCompat;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private getResolutionSize<readLongObject> AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public setPassingYear handleMediaPlayPauseIfPendingOnHandler;

    public static final /* synthetic */ class AudioAttributesCompatParcelizer {
        public static final /* synthetic */ int[] write;

        static {
            int[] iArr = new int[limit.values().length];
            try {
                iArr[limit.AudioAttributesCompatParcelizer.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[limit.IconCompatParcelizer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            write = iArr;
        }
    }

    static final class AudioAttributesImplApi21Parcelizer extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        /* synthetic */ Object IconCompatParcelizer;
        int read;
        boolean write;

        AudioAttributesImplApi21Parcelizer(SampleVideos<? super AudioAttributesImplApi21Parcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.IconCompatParcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            return PhoneNumberViewModel.read(PhoneNumberViewModel.this, this);
        }
    }

    static final class IconCompatParcelizer extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        /* synthetic */ Object AudioAttributesImplBaseParcelizer;
        Object IconCompatParcelizer;
        int RemoteActionCompatParcelizer;
        Object read;
        int write;

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesImplBaseParcelizer = obj;
            this.write |= Integer.MIN_VALUE;
            return PhoneNumberViewModel.this.RemoteActionCompatParcelizer(0, null, null, this);
        }
    }

    static final class RemoteActionCompatParcelizer extends getTotalMcq {
        Object IconCompatParcelizer;
        /* synthetic */ Object RemoteActionCompatParcelizer;
        int write;

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.RemoteActionCompatParcelizer = obj;
            this.write |= Integer.MIN_VALUE;
            return PhoneNumberViewModel.this.RemoteActionCompatParcelizer(this);
        }
    }

    static final class write extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        /* synthetic */ Object AudioAttributesImplApi21Parcelizer;
        long IconCompatParcelizer;
        Object RemoteActionCompatParcelizer;
        int read;
        int write;

        write(SampleVideos<? super write> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesImplApi21Parcelizer = obj;
            this.write |= Integer.MIN_VALUE;
            return PhoneNumberViewModel.AudioAttributesCompatParcelizer(PhoneNumberViewModel.this, this);
        }
    }

    @setSdkPayload
    public PhoneNumberViewModel(POJOPropertyBuilder5 pOJOPropertyBuilder5, peekChar peekchar, isSeekPending isseekpending) {
        toMagicModuleMetaRepoModel.write(pOJOPropertyBuilder5, "");
        toMagicModuleMetaRepoModel.write(peekchar, "");
        toMagicModuleMetaRepoModel.write(isseekpending, "");
        this.RemoteActionCompatParcelizer = peekchar;
        this.AudioAttributesCompatParcelizer = isseekpending;
        readList.Companion companion = readList.INSTANCE;
        readList readlistRemoteActionCompatParcelizer = readList.Companion.RemoteActionCompatParcelizer(pOJOPropertyBuilder5);
        this.IconCompatParcelizer = readlistRemoteActionCompatParcelizer;
        Integer numAudioAttributesImplApi26Parcelizer = TestGroupLSModel.AudioAttributesImplApi26Parcelizer(TestGroupLSModel.read(readlistRemoteActionCompatParcelizer.getAudioAttributesCompatParcelizer(), "+", "", false));
        this.write = numAudioAttributesImplApi26Parcelizer != null ? numAudioAttributesImplApi26Parcelizer.intValue() : 91;
        String strIconCompatParcelizer = PlayerControlViewExternalSyntheticLambda0.IconCompatParcelizer(TestGroupLSModel.AudioAttributesImplApi26Parcelizer((CharSequence) readlistRemoteActionCompatParcelizer.getWrite()).toString());
        this.read = strIconCompatParcelizer;
        getResolutionSize<readLongObject> getresolutionsizeRemoteActionCompatParcelizer = setStartTime.RemoteActionCompatParcelizer(new readLongObject.IconCompatParcelizer(this.write, strIconCompatParcelizer));
        this.AudioAttributesImplApi21Parcelizer = getresolutionsizeRemoteActionCompatParcelizer;
        this.AudioAttributesImplBaseParcelizer = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer);
        getResolutionSize<readIBinder> getresolutionsizeRemoteActionCompatParcelizer2 = setStartTime.RemoteActionCompatParcelizer(readIBinder.IconCompatParcelizer.INSTANCE);
        this.MediaBrowserCompatCustomActionResultReceiver = getresolutionsizeRemoteActionCompatParcelizer2;
        this.AudioAttributesImplApi26Parcelizer = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer2);
        readSize.write writeVar = readSize.write;
        getResolutionSize<readSize> getresolutionsizeRemoteActionCompatParcelizer3 = setStartTime.RemoteActionCompatParcelizer(readSize.read(readSize.write.write(), false, false, true, 3));
        this.MediaBrowserCompatMediaItem = getresolutionsizeRemoteActionCompatParcelizer3;
        this.RatingCompat = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer3);
        getResolutionSize<readIntegerObject> getresolutionsizeRemoteActionCompatParcelizer4 = setStartTime.RemoteActionCompatParcelizer(readIntegerObject.RemoteActionCompatParcelizer.INSTANCE);
        this.MediaMetadataCompat = getresolutionsizeRemoteActionCompatParcelizer4;
        this.MediaDescriptionCompat = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer4);
        getResolutionSize<Boolean> getresolutionsizeRemoteActionCompatParcelizer5 = setStartTime.RemoteActionCompatParcelizer(Boolean.FALSE);
        this.MediaBrowserCompatSearchResultReceiver = getresolutionsizeRemoteActionCompatParcelizer5;
        this.onAddQueueItem = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer5);
        MediaBrowserCompatItemReceiver();
        getInfoWindowAnchorV getinfowindowanchorv = getInfoWindowAnchorV.INSTANCE;
        isseekpending.write(getInfoWindowAnchorV.read(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
    }

    public static final /* synthetic */ Object AudioAttributesCompatParcelizer(PhoneNumberViewModel phoneNumberViewModel, SampleVideos sampleVideos) {
        return phoneNumberViewModel.RemoteActionCompatParcelizer((limit) null, (getPcmEncoding) null, (SampleVideos<? super getShowPopup>) sampleVideos);
    }

    public static final /* synthetic */ Object read(PhoneNumberViewModel phoneNumberViewModel, SampleVideos sampleVideos) {
        return phoneNumberViewModel.write(false, null, sampleVideos);
    }

    public final setUpdatedStatus<readLongObject> IconCompatParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final setUpdatedStatus<readIBinder> read() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final setUpdatedStatus<readSize> AudioAttributesImplBaseParcelizer() {
        return this.RatingCompat;
    }

    public final setUpdatedStatus<readIntegerObject> AudioAttributesCompatParcelizer() {
        return this.MediaDescriptionCompat;
    }

    public final setUpdatedStatus<Boolean> AudioAttributesImplApi26Parcelizer() {
        return this.onAddQueueItem;
    }

    static final class read extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ PhoneNumberViewModel IconCompatParcelizer;
        private /* synthetic */ readHeader RemoteActionCompatParcelizer;
        private int read;

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
        
            if (r6.IconCompatParcelizer.RemoteActionCompatParcelizer(((o.readHeader.read) r7).RemoteActionCompatParcelizer(), ((o.readHeader.read) r6.RemoteActionCompatParcelizer).write(), ((o.readHeader.read) r6.RemoteActionCompatParcelizer).AudioAttributesCompatParcelizer(), r6) == r0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x008e, code lost:
        
            if (r6.IconCompatParcelizer.RemoteActionCompatParcelizer(r6) == r0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0090, code lost:
        
            return r0;
         */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                Method dump skipped, instruction units count: 234
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.onboarding.main_phone.PhoneNumberViewModel.read.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        read(readHeader readheader, PhoneNumberViewModel phoneNumberViewModel, SampleVideos<? super read> sampleVideos) {
            super(1, sampleVideos);
            this.RemoteActionCompatParcelizer = readheader;
            this.IconCompatParcelizer = phoneNumberViewModel;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return new read(this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public final void IconCompatParcelizer(readHeader p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new read(p0, this, null), new MagicModuleSubmissionRequestBody() { // from class: o.readChar
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return PhoneNumberViewModel.RemoteActionCompatParcelizer(this.write, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(PhoneNumberViewModel phoneNumberViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        phoneNumberViewModel.MediaBrowserCompatSearchResultReceiver.write(Boolean.FALSE);
        phoneNumberViewModel.MediaMetadataCompat.write(new readIntegerObject.read(str));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MediaBrowserCompatItemReceiver() {
        setPassingYear setpassingyear = this.handleMediaPlayPauseIfPendingOnHandler;
        if (setpassingyear != null) {
            setpassingyear.RemoteActionCompatParcelizer((CancellationException) null);
        }
        this.MediaMetadataCompat.write(readIntegerObject.write.INSTANCE);
        this.AudioAttributesImplApi21Parcelizer.write(new readLongObject.IconCompatParcelizer(this.write, this.read));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0088, code lost:
    
        if (RemoteActionCompatParcelizer(r8, (kotlin.getPcmEncoding) r9, r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object RemoteActionCompatParcelizer(int r6, java.lang.String r7, kotlin.limit r8, kotlin.SampleVideos<? super kotlin.getShowPopup> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.marrow2.ui.onboarding.main_phone.PhoneNumberViewModel.IconCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r9
            com.marrow2.ui.onboarding.main_phone.PhoneNumberViewModel$IconCompatParcelizer r0 = (com.marrow2.ui.onboarding.main_phone.PhoneNumberViewModel.IconCompatParcelizer) r0
            int r1 = r0.write
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r9 = r0.write
            int r9 = r9 + r2
            r0.write = r9
            goto L19
        L14:
            com.marrow2.ui.onboarding.main_phone.PhoneNumberViewModel$IconCompatParcelizer r0 = new com.marrow2.ui.onboarding.main_phone.PhoneNumberViewModel$IconCompatParcelizer
            r0.<init>(r9)
        L19:
            java.lang.Object r9 = r0.AudioAttributesImplBaseParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.write
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L50
            if (r2 == r4) goto L41
            if (r2 != r3) goto L39
            int r5 = r0.RemoteActionCompatParcelizer
            java.lang.Object r5 = r0.IconCompatParcelizer
            java.lang.Object r5 = r0.read
            o.limit r5 = (kotlin.limit) r5
            java.lang.Object r5 = r0.AudioAttributesCompatParcelizer
            java.lang.String r5 = (java.lang.String) r5
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)
            goto L8b
        L39:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L41:
            int r6 = r0.RemoteActionCompatParcelizer
            java.lang.Object r7 = r0.read
            r8 = r7
            o.limit r8 = (kotlin.limit) r8
            java.lang.Object r7 = r0.AudioAttributesCompatParcelizer
            java.lang.String r7 = (java.lang.String) r7
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)
            goto L66
        L50:
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)
            r5.write = r6
            r5.read = r7
            r0.AudioAttributesCompatParcelizer = r7
            r0.read = r8
            r0.RemoteActionCompatParcelizer = r6
            r0.write = r4
            r9 = 0
            java.lang.Object r9 = r5.write(r9, r8, r0)
            if (r9 == r1) goto L8e
        L66:
            o.getPcmEncoding r9 = (kotlin.getPcmEncoding) r9
            o.getResolutionSize<o.readIBinder> r2 = r5.MediaBrowserCompatCustomActionResultReceiver
            o.readIBinder$IconCompatParcelizer r4 = o.readIBinder.IconCompatParcelizer.INSTANCE
            r2.write(r4)
            o.getResolutionSize<o.readLongObject> r2 = r5.AudioAttributesImplApi21Parcelizer
            o.readLongObject$read r4 = new o.readLongObject$read
            r4.<init>(r6, r7)
            r2.write(r4)
            r7 = 0
            r0.AudioAttributesCompatParcelizer = r7
            r0.read = r7
            r0.IconCompatParcelizer = r7
            r0.RemoteActionCompatParcelizer = r6
            r0.write = r3
            java.lang.Object r5 = r5.RemoteActionCompatParcelizer(r8, r9, r0)
            if (r5 != r1) goto L8b
            goto L8e
        L8b:
            o.getShowPopup r5 = kotlin.getShowPopup.INSTANCE
            return r5
        L8e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.onboarding.main_phone.PhoneNumberViewModel.RemoteActionCompatParcelizer(int, java.lang.String, o.limit, o.SampleVideos):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object RemoteActionCompatParcelizer(kotlin.limit r11, kotlin.getPcmEncoding r12, kotlin.SampleVideos<? super kotlin.getShowPopup> r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof com.marrow2.ui.onboarding.main_phone.PhoneNumberViewModel.write
            if (r0 == 0) goto L14
            r0 = r13
            com.marrow2.ui.onboarding.main_phone.PhoneNumberViewModel$write r0 = (com.marrow2.ui.onboarding.main_phone.PhoneNumberViewModel.write) r0
            int r1 = r0.write
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r13 = r0.write
            int r13 = r13 + r2
            r0.write = r13
            goto L19
        L14:
            com.marrow2.ui.onboarding.main_phone.PhoneNumberViewModel$write r0 = new com.marrow2.ui.onboarding.main_phone.PhoneNumberViewModel$write
            r0.<init>(r13)
        L19:
            java.lang.Object r13 = r0.AudioAttributesImplApi21Parcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.write
            r3 = 4
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3f
            if (r2 != r4) goto L37
            int r11 = r0.read
            long r11 = r0.IconCompatParcelizer
            java.lang.Object r11 = r0.AudioAttributesCompatParcelizer
            r12 = r11
            o.getPcmEncoding r12 = (kotlin.getPcmEncoding) r12
            java.lang.Object r11 = r0.RemoteActionCompatParcelizer
            kotlin.SdkPayloadData.IconCompatParcelizer(r13)
            goto L9a
        L37:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3f:
            kotlin.SdkPayloadData.IconCompatParcelizer(r13)
            int[] r13 = com.marrow2.ui.onboarding.main_phone.PhoneNumberViewModel.AudioAttributesCompatParcelizer.write
            int r11 = r11.ordinal()
            r11 = r13[r11]
            if (r11 == r4) goto L65
            r12 = 2
            if (r11 != r12) goto L5f
            o.getResolutionSize<o.readSize> r10 = r10.MediaBrowserCompatMediaItem
            java.lang.Object r11 = r10.IconCompatParcelizer()
            o.readSize r11 = (kotlin.readSize) r11
            o.readSize r11 = kotlin.readSize.read(r11, r5, r4, r5, r3)
            r10.write(r11)
            goto Lad
        L5f:
            o.RenewEligibleCreator r10 = new o.RenewEligibleCreator
            r10.<init>()
            throw r10
        L65:
            boolean r11 = r12.getAudioAttributesCompatParcelizer()
            if (r11 == 0) goto L9a
            o.getResolutionSize<o.readSize> r11 = r10.MediaBrowserCompatMediaItem
            java.lang.Object r11 = r11.IconCompatParcelizer()
            o.readSize r11 = (kotlin.readSize) r11
            boolean r11 = r11.getRemoteActionCompatParcelizer()
            if (r11 == 0) goto L9a
            java.lang.Long r11 = r12.getWrite()
            if (r11 == 0) goto L9a
            java.lang.Number r11 = (java.lang.Number) r11
            long r6 = r11.longValue()
            r11 = 0
            r0.RemoteActionCompatParcelizer = r11
            r0.AudioAttributesCompatParcelizer = r12
            r0.IconCompatParcelizer = r6
            r0.read = r5
            r0.write = r4
            r8 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 * r8
            java.lang.Object r11 = kotlin.setCountry.IconCompatParcelizer(r6, r0)
            if (r11 != r1) goto L9a
            return r1
        L9a:
            o.getResolutionSize<o.readSize> r10 = r10.MediaBrowserCompatMediaItem
            java.lang.Object r11 = r10.IconCompatParcelizer()
            o.readSize r11 = (kotlin.readSize) r11
            boolean r12 = r12.getAudioAttributesCompatParcelizer()
            o.readSize r11 = kotlin.readSize.read(r11, r12, r5, r5, r3)
            r10.write(r11)
        Lad:
            o.getShowPopup r10 = kotlin.getShowPopup.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.onboarding.main_phone.PhoneNumberViewModel.RemoteActionCompatParcelizer(o.limit, o.getPcmEncoding, o.SampleVideos):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object write(boolean r9, kotlin.limit r10, kotlin.SampleVideos<? super kotlin.getPcmEncoding> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.marrow2.ui.onboarding.main_phone.PhoneNumberViewModel.AudioAttributesImplApi21Parcelizer
            if (r0 == 0) goto L14
            r0 = r11
            com.marrow2.ui.onboarding.main_phone.PhoneNumberViewModel$AudioAttributesImplApi21Parcelizer r0 = (com.marrow2.ui.onboarding.main_phone.PhoneNumberViewModel.AudioAttributesImplApi21Parcelizer) r0
            int r1 = r0.read
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r11 = r0.read
            int r11 = r11 + r2
            r0.read = r11
            goto L19
        L14:
            com.marrow2.ui.onboarding.main_phone.PhoneNumberViewModel$AudioAttributesImplApi21Parcelizer r0 = new com.marrow2.ui.onboarding.main_phone.PhoneNumberViewModel$AudioAttributesImplApi21Parcelizer
            r0.<init>(r11)
        L19:
            r7 = r0
            java.lang.Object r11 = r7.IconCompatParcelizer
            java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
            int r1 = r7.read
            r2 = 1
            if (r1 == 0) goto L3a
            if (r1 != r2) goto L32
            boolean r9 = r7.write
            java.lang.Object r9 = r7.AudioAttributesCompatParcelizer
            r10 = r9
            o.limit r10 = (kotlin.limit) r10
            kotlin.SdkPayloadData.IconCompatParcelizer(r11)
            goto L67
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3a:
            kotlin.SdkPayloadData.IconCompatParcelizer(r11)
            o.getResolutionSize<java.lang.Boolean> r11 = r8.MediaBrowserCompatSearchResultReceiver
            java.lang.Boolean r1 = kotlin.QBankStatsResponse.AudioAttributesCompatParcelizer(r2)
            r11.write(r1)
            o.peekChar r1 = r8.RemoteActionCompatParcelizer
            if (r9 == 0) goto L51
            int r11 = r8.MediaBrowserCompatItemReceiver
            if (r11 == 0) goto L51
            com.marrow2.data.user.remote.model.onboarding.OtpRetryType r11 = com.marrow2.data.user.remote.model.onboarding.OtpRetryType.OTP_TYPE_CALL
            goto L53
        L51:
            com.marrow2.data.user.remote.model.onboarding.OtpRetryType r11 = com.marrow2.data.user.remote.model.onboarding.OtpRetryType.DEFAULT
        L53:
            int r3 = r8.write
            java.lang.String r4 = r8.read
            r7.AudioAttributesCompatParcelizer = r10
            r7.write = r9
            r7.read = r2
            r5 = 0
            r2 = r11
            r6 = r10
            java.lang.Object r11 = r1.IconCompatParcelizer(r2, r3, r4, r5, r6, r7)
            if (r11 != r0) goto L67
            return r0
        L67:
            o.getPcmEncoding r11 = (kotlin.getPcmEncoding) r11
            o.getResolutionSize<java.lang.Boolean> r9 = r8.MediaBrowserCompatSearchResultReceiver
            r0 = 0
            java.lang.Boolean r0 = kotlin.QBankStatsResponse.AudioAttributesCompatParcelizer(r0)
            r9.write(r0)
            o.isSeekPending r9 = r8.AudioAttributesCompatParcelizer
            o.lambdadroppedFrames3comgoogleandroidexoplayer2videoVideoRendererEventListenerEventDispatcher r0 = kotlin.lambdadroppedFrames3comgoogleandroidexoplayer2videoVideoRendererEventListenerEventDispatcher.INSTANCE
            int r8 = r8.write
            o.lambdadroppedFrames3comgoogleandroidexoplayer2videoVideoRendererEventListenerEventDispatcher$read r0 = o.lambdadroppedFrames3comgoogleandroidexoplayer2videoVideoRendererEventListenerEventDispatcher.read.read
            java.lang.String r8 = java.lang.String.valueOf(r8)
            o.getSubscriptionExpiresOn r8 = kotlin.lambdadroppedFrames3comgoogleandroidexoplayer2videoVideoRendererEventListenerEventDispatcher.RemoteActionCompatParcelizer(r10, r8, r0)
            o.updateLoadingFinished r10 = kotlin.updateLoadingFinished.IconCompatParcelizer
            java.util.List r10 = kotlin.IntermediateLoginResponseBody.RemoteActionCompatParcelizer(r10)
            r9.write(r8, r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.onboarding.main_phone.PhoneNumberViewModel.write(boolean, o.limit, o.SampleVideos):java.lang.Object");
    }

    static final class AudioAttributesImplApi26Parcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private Object AudioAttributesCompatParcelizer;
        private int AudioAttributesImplBaseParcelizer;
        private int IconCompatParcelizer;
        private int RemoteActionCompatParcelizer;
        private int read;
        private int write;

        /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0051  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x004c -> B:13:0x004f). Please report as a decompilation issue!!! */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                int r1 = r8.AudioAttributesImplBaseParcelizer
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L20
                if (r1 != r3) goto L18
                int r1 = r8.read
                int r4 = r8.write
                java.lang.Object r5 = r8.AudioAttributesCompatParcelizer
                com.marrow2.ui.onboarding.main_phone.PhoneNumberViewModel r5 = (com.marrow2.ui.onboarding.main_phone.PhoneNumberViewModel) r5
                kotlin.SdkPayloadData.IconCompatParcelizer(r9)
                goto L4f
            L18:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L20:
                kotlin.SdkPayloadData.IconCompatParcelizer(r9)
                com.marrow2.ui.onboarding.main_phone.PhoneNumberViewModel r9 = com.marrow2.ui.onboarding.main_phone.PhoneNumberViewModel.this
                r1 = 60
                r5 = r9
                r4 = r1
                r1 = r2
            L2a:
                if (r1 >= r4) goto L51
                o.getResolutionSize r9 = com.marrow2.ui.onboarding.main_phone.PhoneNumberViewModel.AudioAttributesImplBaseParcelizer(r5)
                o.readIBinder$AudioAttributesCompatParcelizer r6 = new o.readIBinder$AudioAttributesCompatParcelizer
                int r7 = 60 - r1
                r6.<init>(r7)
                r9.write(r6)
                r8.AudioAttributesCompatParcelizer = r5
                r8.write = r4
                r8.read = r1
                r8.IconCompatParcelizer = r1
                r8.RemoteActionCompatParcelizer = r2
                r8.AudioAttributesImplBaseParcelizer = r3
                r6 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r9 = kotlin.setCountry.IconCompatParcelizer(r6, r8)
                if (r9 != r0) goto L4f
                return r0
            L4f:
                int r1 = r1 + r3
                goto L2a
            L51:
                com.marrow2.ui.onboarding.main_phone.PhoneNumberViewModel r8 = com.marrow2.ui.onboarding.main_phone.PhoneNumberViewModel.this
                o.getResolutionSize r8 = com.marrow2.ui.onboarding.main_phone.PhoneNumberViewModel.AudioAttributesImplBaseParcelizer(r8)
                o.readIBinder$read r9 = o.readIBinder.read.INSTANCE
                r8.write(r9)
                o.getShowPopup r8 = kotlin.getShowPopup.INSTANCE
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.onboarding.main_phone.PhoneNumberViewModel.AudioAttributesImplApi26Parcelizer.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        AudioAttributesImplApi26Parcelizer(SampleVideos<? super AudioAttributesImplApi26Parcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return PhoneNumberViewModel.this.new AudioAttributesImplApi26Parcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplApi26Parcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final Object AudioAttributesImplApi21Parcelizer() {
        setPassingYear setpassingyear = this.handleMediaPlayPauseIfPendingOnHandler;
        if (setpassingyear != null) {
            setpassingyear.RemoteActionCompatParcelizer((CancellationException) null);
        }
        this.handleMediaPlayPauseIfPendingOnHandler = C0201setMcqCount.IconCompatParcelizer(TypeResolutionContextBasic.write(this), null, null, new AudioAttributesImplApi26Parcelizer(null), 3);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
    
        if (RemoteActionCompatParcelizer(r2, (kotlin.getPcmEncoding) r8, r0) != r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object RemoteActionCompatParcelizer(kotlin.SampleVideos<? super kotlin.getShowPopup> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.marrow2.ui.onboarding.main_phone.PhoneNumberViewModel.RemoteActionCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r8
            com.marrow2.ui.onboarding.main_phone.PhoneNumberViewModel$RemoteActionCompatParcelizer r0 = (com.marrow2.ui.onboarding.main_phone.PhoneNumberViewModel.RemoteActionCompatParcelizer) r0
            int r1 = r0.write
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r8 = r0.write
            int r8 = r8 + r2
            r0.write = r8
            goto L19
        L14:
            com.marrow2.ui.onboarding.main_phone.PhoneNumberViewModel$RemoteActionCompatParcelizer r0 = new com.marrow2.ui.onboarding.main_phone.PhoneNumberViewModel$RemoteActionCompatParcelizer
            r0.<init>(r8)
        L19:
            java.lang.Object r8 = r0.RemoteActionCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.write
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L45
            if (r2 == r6) goto L41
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r7 = r0.IconCompatParcelizer
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            goto L6c
        L33:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3b:
            java.lang.Object r1 = r0.IconCompatParcelizer
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            goto L60
        L41:
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            goto L52
        L45:
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            o.limit r8 = kotlin.limit.AudioAttributesCompatParcelizer
            r0.write = r6
            java.lang.Object r8 = r7.write(r6, r8, r0)
            if (r8 == r1) goto L6f
        L52:
            o.getPcmEncoding r8 = (kotlin.getPcmEncoding) r8
            o.limit r2 = kotlin.limit.AudioAttributesCompatParcelizer
            r0.IconCompatParcelizer = r5
            r0.write = r4
            java.lang.Object r8 = r7.RemoteActionCompatParcelizer(r2, r8, r0)
            if (r8 == r1) goto L6f
        L60:
            int r8 = r7.MediaBrowserCompatItemReceiver
            int r8 = r8 + r6
            r7.MediaBrowserCompatItemReceiver = r8
            r0.IconCompatParcelizer = r5
            r0.write = r3
            r7.AudioAttributesImplApi21Parcelizer()
        L6c:
            o.getShowPopup r7 = kotlin.getShowPopup.INSTANCE
            return r7
        L6f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.onboarding.main_phone.PhoneNumberViewModel.RemoteActionCompatParcelizer(o.SampleVideos):java.lang.Object");
    }

    static final class MediaBrowserCompatItemReceiver extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ String RemoteActionCompatParcelizer;
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                isSeekPending isseekpending = PhoneNumberViewModel.this.AudioAttributesCompatParcelizer;
                getInfoWindowAnchorV getinfowindowanchorv = getInfoWindowAnchorV.INSTANCE;
                isseekpending.write(getInfoWindowAnchorV.MediaBrowserCompatItemReceiver(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
                PhoneNumberViewModel.this.MediaBrowserCompatSearchResultReceiver.write(QBankStatsResponse.AudioAttributesCompatParcelizer(true));
                this.write = 1;
                if (PhoneNumberViewModel.this.RemoteActionCompatParcelizer.IconCompatParcelizer(PhoneNumberViewModel.this.write, PhoneNumberViewModel.this.read, this.RemoteActionCompatParcelizer, this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            MergingMediaPeriodTimeOffsetMediaPeriod.Companion companion = MergingMediaPeriodTimeOffsetMediaPeriod.INSTANCE;
            MergingMediaPeriodTimeOffsetMediaPeriod.Companion.AudioAttributesCompatParcelizer(String.valueOf(PhoneNumberViewModel.this.write), PhoneNumberViewModel.this.read, true, -1, "");
            PhoneNumberViewModel.this.MediaBrowserCompatSearchResultReceiver.write(QBankStatsResponse.AudioAttributesCompatParcelizer(false));
            PhoneNumberViewModel.this.MediaMetadataCompat.write(readIntegerObject.AudioAttributesCompatParcelizer.INSTANCE);
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        MediaBrowserCompatItemReceiver(String str, SampleVideos<? super MediaBrowserCompatItemReceiver> sampleVideos) {
            super(1, sampleVideos);
            this.RemoteActionCompatParcelizer = str;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return PhoneNumberViewModel.this.new MediaBrowserCompatItemReceiver(this.RemoteActionCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatItemReceiver) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void RemoteActionCompatParcelizer(String p0) {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new MediaBrowserCompatItemReceiver(p0, null), new MagicModuleSubmissionRequestBody() { // from class: o.readByte
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return PhoneNumberViewModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, ((Integer) obj).intValue(), (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(PhoneNumberViewModel phoneNumberViewModel, int i, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        phoneNumberViewModel.MediaBrowserCompatSearchResultReceiver.write(Boolean.FALSE);
        MergingMediaPeriodTimeOffsetMediaPeriod.Companion companion = MergingMediaPeriodTimeOffsetMediaPeriod.INSTANCE;
        int i2 = phoneNumberViewModel.write;
        MergingMediaPeriodTimeOffsetMediaPeriod.Companion.AudioAttributesCompatParcelizer(String.valueOf(i2), phoneNumberViewModel.read.toString(), false, i, str);
        phoneNumberViewModel.MediaMetadataCompat.write(new readIntegerObject.IconCompatParcelizer(str));
        return getShowPopup.INSTANCE;
    }
}
