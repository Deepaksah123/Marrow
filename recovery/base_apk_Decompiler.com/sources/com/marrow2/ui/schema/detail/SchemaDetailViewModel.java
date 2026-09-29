package com.marrow2.ui.schema.detail;

import com.marrow2.ui.schema.detail.SchemaDetailViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.CmcdHeadersFactoryCmcdObjectBuilder;
import kotlin.IntermediateLoginResponseBody;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.Metadata;
import kotlin.NetworkTypeObserverApi31DisplayInfoCallback;
import kotlin.POJOPropertyBuilder5;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.RenewEligibleCreator;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.SntpClient1;
import kotlin.SurfaceInfo;
import kotlin.TypeResolutionContextBasic;
import kotlin.VerifyNewNumberRequest;
import kotlin.getAnswerMap;
import kotlin.getDisplaySizeV17;
import kotlin.getMagicModuleStats;
import kotlin.getResolutionSize;
import kotlin.getShowPopup;
import kotlin.getYear;
import kotlin.isSeekPending;
import kotlin.obtainSystemMessage;
import kotlin.onDisplayInfoChanged;
import kotlin.setSdkPayload;
import kotlin.setStartTime;
import kotlin.setUpdatedStatus;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.updateLoadingFinished;
import kotlin.zzle;
import kotlin.zzlh;
import kotlin.zzli;
import kotlin.zzlj;
import kotlin.zzlk;
import kotlin.zzll;
import org.apache.commons.compress.archivers.zip.UnixStat;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u0003\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0015\u0010\u001dR\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0019\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010 R\u0014\u0010#\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010'R\u0014\u0010$\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020-0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010.R\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020-0/8\u0007¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b\u0015\u00102R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002030,8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010.R \u0010\u0013\u001a\b\u0012\u0004\u0012\u0002030/8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u00101\u001a\u0004\b#\u00102R\u001a\u00105\u001a\b\u0012\u0004\u0012\u0002040,8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u0010.R \u00106\u001a\b\u0012\u0004\u0012\u0002040/8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u00101\u001a\u0004\b(\u00102"}, d2 = {"Lcom/marrow2/ui/schema/detail/SchemaDetailViewModel;", "Lo/POJOPropertyBuilderWithMember;", "Lo/POJOPropertyBuilder5;", "p0", "Lo/SurfaceInfo;", "p1", "Lo/SntpClient1;", "p2", "Lo/getDisplaySizeV17;", "p3", "Lo/NetworkTypeObserverApi31DisplayInfoCallback;", "p4", "Lo/isSeekPending;", "p5", "<init>", "(Lo/POJOPropertyBuilder5;Lo/SurfaceInfo;Lo/SntpClient1;Lo/getDisplaySizeV17;Lo/NetworkTypeObserverApi31DisplayInfoCallback;Lo/isSeekPending;)V", "", "AudioAttributesImplApi26Parcelizer", "()V", "MediaBrowserCompatItemReceiver", "Lo/zzlj;", "read", "(Lo/zzlj;)V", "", "Lo/onDisplayInfoChanged;", "write", "(Ljava/lang/String;Lo/onDisplayInfoChanged;)V", "", "Lo/obtainSystemMessage;", "(Ljava/lang/String;Lo/onDisplayInfoChanged;)Ljava/util/List;", "AudioAttributesImplApi21Parcelizer", "Lo/SurfaceInfo;", "Lo/SntpClient1;", "MediaDescriptionCompat", "Lo/getDisplaySizeV17;", "IconCompatParcelizer", "AudioAttributesImplBaseParcelizer", "Lo/NetworkTypeObserverApi31DisplayInfoCallback;", "RemoteActionCompatParcelizer", "Lo/isSeekPending;", "AudioAttributesCompatParcelizer", "Lo/zzlh;", "MediaBrowserCompatCustomActionResultReceiver", "Lo/zzlh;", "Lo/getResolutionSize;", "Lo/zzli;", "Lo/getResolutionSize;", "Lo/setUpdatedStatus;", "MediaBrowserCompatMediaItem", "Lo/setUpdatedStatus;", "()Lo/setUpdatedStatus;", "", "Lo/zzll;", "MediaMetadataCompat", "RatingCompat"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SchemaDetailViewModel extends POJOPropertyBuilderWithMember {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<zzli> AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final SurfaceInfo read;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final SntpClient1 write;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final NetworkTypeObserverApi31DisplayInfoCallback RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final isSeekPending AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final zzlh AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final setUpdatedStatus<zzll> RatingCompat;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private final setUpdatedStatus<zzli> MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private final getDisplaySizeV17 IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<zzll> MediaMetadataCompat;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final setUpdatedStatus<Boolean> MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final getResolutionSize<Boolean> AudioAttributesImplApi26Parcelizer;

    @setSdkPayload
    public SchemaDetailViewModel(POJOPropertyBuilder5 pOJOPropertyBuilder5, SurfaceInfo surfaceInfo, SntpClient1 sntpClient1, getDisplaySizeV17 getdisplaysizev17, NetworkTypeObserverApi31DisplayInfoCallback networkTypeObserverApi31DisplayInfoCallback, isSeekPending isseekpending) {
        toMagicModuleMetaRepoModel.write(pOJOPropertyBuilder5, "");
        toMagicModuleMetaRepoModel.write(surfaceInfo, "");
        toMagicModuleMetaRepoModel.write(sntpClient1, "");
        toMagicModuleMetaRepoModel.write(getdisplaysizev17, "");
        toMagicModuleMetaRepoModel.write(networkTypeObserverApi31DisplayInfoCallback, "");
        toMagicModuleMetaRepoModel.write(isseekpending, "");
        this.read = surfaceInfo;
        this.write = sntpClient1;
        this.IconCompatParcelizer = getdisplaysizev17;
        this.RemoteActionCompatParcelizer = networkTypeObserverApi31DisplayInfoCallback;
        this.AudioAttributesCompatParcelizer = isseekpending;
        zzlh.Companion companion = zzlh.INSTANCE;
        zzlh zzlhVarWrite = zzlh.Companion.write(pOJOPropertyBuilder5);
        this.AudioAttributesImplBaseParcelizer = zzlhVarWrite;
        getResolutionSize<zzli> getresolutionsizeRemoteActionCompatParcelizer = setStartTime.RemoteActionCompatParcelizer(new zzli(null, null, null, null, false, null, null, null, false, UnixStat.DEFAULT_LINK_PERM, null));
        this.AudioAttributesImplApi21Parcelizer = getresolutionsizeRemoteActionCompatParcelizer;
        this.MediaBrowserCompatCustomActionResultReceiver = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer);
        getResolutionSize<Boolean> getresolutionsizeRemoteActionCompatParcelizer2 = setStartTime.RemoteActionCompatParcelizer(Boolean.FALSE);
        this.AudioAttributesImplApi26Parcelizer = getresolutionsizeRemoteActionCompatParcelizer2;
        this.MediaBrowserCompatItemReceiver = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer2);
        getResolutionSize<zzll> getresolutionsizeRemoteActionCompatParcelizer3 = setStartTime.RemoteActionCompatParcelizer(zzll.read.INSTANCE);
        this.MediaMetadataCompat = getresolutionsizeRemoteActionCompatParcelizer3;
        this.RatingCompat = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer3);
        zzli zzliVarIconCompatParcelizer = getresolutionsizeRemoteActionCompatParcelizer.IconCompatParcelizer();
        getresolutionsizeRemoteActionCompatParcelizer.write(zzli.RemoteActionCompatParcelizer((383 & 1) != 0 ? zzliVarIconCompatParcelizer.IconCompatParcelizer : zzlhVarWrite.getRead(), (383 & 2) != 0 ? zzliVarIconCompatParcelizer.AudioAttributesImplApi21Parcelizer : zzlhVarWrite.getWrite(), (383 & 4) != 0 ? zzliVarIconCompatParcelizer.MediaBrowserCompatItemReceiver : null, (383 & 8) != 0 ? zzliVarIconCompatParcelizer.read : null, (383 & 16) != 0 ? zzliVarIconCompatParcelizer.AudioAttributesCompatParcelizer : false, (383 & 32) != 0 ? zzliVarIconCompatParcelizer.AudioAttributesImplApi26Parcelizer : null, (383 & 64) != 0 ? zzliVarIconCompatParcelizer.write : null, (383 & 128) != 0 ? zzliVarIconCompatParcelizer.RemoteActionCompatParcelizer : null, (383 & 256) != 0 ? zzliVarIconCompatParcelizer.AudioAttributesImplBaseParcelizer : false));
        AudioAttributesImplApi26Parcelizer();
    }

    public final setUpdatedStatus<zzli> read() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final setUpdatedStatus<Boolean> IconCompatParcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final setUpdatedStatus<zzll> AudioAttributesCompatParcelizer() {
        return this.RatingCompat;
    }

    static final class write extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int write;

        /* JADX WARN: Code restructure failed: missing block: B:19:0x00bb, code lost:
        
            if (r2 != r1) goto L21;
         */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r30) {
            /*
                Method dump skipped, instruction units count: 419
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.schema.detail.SchemaDetailViewModel.write.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        write(SampleVideos<? super write> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return SchemaDetailViewModel.this.new write(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void AudioAttributesImplApi26Parcelizer() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new write(null), new MagicModuleSubmissionRequestBody() { // from class: o.zzbQ
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return SchemaDetailViewModel.read(this.write, ((Integer) obj).intValue(), (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(SchemaDetailViewModel schemaDetailViewModel, int i, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        schemaDetailViewModel.AudioAttributesImplApi26Parcelizer.write(Boolean.FALSE);
        if (i == 502) {
            schemaDetailViewModel.MediaMetadataCompat.write(zzll.IconCompatParcelizer.INSTANCE);
        } else {
            schemaDetailViewModel.MediaMetadataCompat.write(new zzll.RemoteActionCompatParcelizer(str));
        }
        return getShowPopup.INSTANCE;
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int read;

        public static final /* synthetic */ class AudioAttributesCompatParcelizer {
            public static final /* synthetic */ int[] RemoteActionCompatParcelizer;

            static {
                int[] iArr = new int[zzlk.values().length];
                try {
                    iArr[zzlk.write.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[zzlk.IconCompatParcelizer.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[zzlk.read.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[zzlk.RemoteActionCompatParcelizer.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                RemoteActionCompatParcelizer = iArr;
            }
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.read = 1;
                obj = SchemaDetailViewModel.this.read.write(SchemaDetailViewModel.this.AudioAttributesImplBaseParcelizer.getRead(), this);
                if (obj == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            List<obtainSystemMessage> list = (List) obj;
            ArrayList arrayList = new ArrayList();
            int i2 = AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer[SchemaDetailViewModel.this.read().IconCompatParcelizer().getWrite().ordinal()];
            if (i2 == 1) {
                for (obtainSystemMessage obtainsystemmessage : list) {
                    List<obtainSystemMessage.AudioAttributesCompatParcelizer> listRemoteActionCompatParcelizer = obtainsystemmessage.RemoteActionCompatParcelizer();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : listRemoteActionCompatParcelizer) {
                        obtainSystemMessage.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (obtainSystemMessage.AudioAttributesCompatParcelizer) obj2;
                        if (audioAttributesCompatParcelizer.RemoteActionCompatParcelizer() != audioAttributesCompatParcelizer.write() && audioAttributesCompatParcelizer.RemoteActionCompatParcelizer() > 0) {
                            arrayList2.add(obj2);
                        }
                    }
                    ArrayList arrayList3 = arrayList2;
                    if (!arrayList3.isEmpty()) {
                        arrayList.add(obtainSystemMessage.read(obtainsystemmessage.AudioAttributesCompatParcelizer, obtainsystemmessage.read, obtainsystemmessage.IconCompatParcelizer, obtainsystemmessage.write, obtainsystemmessage.MediaBrowserCompatItemReceiver, arrayList3));
                    }
                }
            } else if (i2 == 2) {
                for (obtainSystemMessage obtainsystemmessage2 : list) {
                    List<obtainSystemMessage.AudioAttributesCompatParcelizer> listRemoteActionCompatParcelizer2 = obtainsystemmessage2.RemoteActionCompatParcelizer();
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj3 : listRemoteActionCompatParcelizer2) {
                        obtainSystemMessage.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer2 = (obtainSystemMessage.AudioAttributesCompatParcelizer) obj3;
                        if (audioAttributesCompatParcelizer2.RemoteActionCompatParcelizer() == audioAttributesCompatParcelizer2.write()) {
                            arrayList4.add(obj3);
                        }
                    }
                    ArrayList arrayList5 = arrayList4;
                    if (!arrayList5.isEmpty()) {
                        arrayList.add(obtainSystemMessage.read(obtainsystemmessage2.AudioAttributesCompatParcelizer, obtainsystemmessage2.read, obtainsystemmessage2.IconCompatParcelizer, obtainsystemmessage2.write, obtainsystemmessage2.MediaBrowserCompatItemReceiver, arrayList5));
                    }
                }
            } else if (i2 != 3) {
                if (i2 != 4) {
                    throw new RenewEligibleCreator();
                }
                arrayList.addAll(list);
            } else {
                for (obtainSystemMessage obtainsystemmessage3 : list) {
                    List<obtainSystemMessage.AudioAttributesCompatParcelizer> listRemoteActionCompatParcelizer3 = obtainsystemmessage3.RemoteActionCompatParcelizer();
                    ArrayList arrayList6 = new ArrayList();
                    for (Object obj4 : listRemoteActionCompatParcelizer3) {
                        if (((obtainSystemMessage.AudioAttributesCompatParcelizer) obj4).RemoteActionCompatParcelizer() == 0) {
                            arrayList6.add(obj4);
                        }
                    }
                    ArrayList arrayList7 = arrayList6;
                    if (!arrayList7.isEmpty()) {
                        arrayList.add(obtainSystemMessage.read(obtainsystemmessage3.AudioAttributesCompatParcelizer, obtainsystemmessage3.read, obtainsystemmessage3.IconCompatParcelizer, obtainsystemmessage3.write, obtainsystemmessage3.MediaBrowserCompatItemReceiver, arrayList7));
                    }
                }
            }
            getResolutionSize getresolutionsize = SchemaDetailViewModel.this.AudioAttributesImplApi21Parcelizer;
            zzli zzliVar = (zzli) SchemaDetailViewModel.this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer();
            getresolutionsize.write(zzli.RemoteActionCompatParcelizer((383 & 1) != 0 ? zzliVar.IconCompatParcelizer : null, (383 & 2) != 0 ? zzliVar.AudioAttributesImplApi21Parcelizer : null, (383 & 4) != 0 ? zzliVar.MediaBrowserCompatItemReceiver : null, (383 & 8) != 0 ? zzliVar.read : null, (383 & 16) != 0 ? zzliVar.AudioAttributesCompatParcelizer : false, (383 & 32) != 0 ? zzliVar.AudioAttributesImplApi26Parcelizer : null, (383 & 64) != 0 ? zzliVar.write : null, (383 & 128) != 0 ? zzliVar.RemoteActionCompatParcelizer : arrayList, (383 & 256) != 0 ? zzliVar.AudioAttributesImplBaseParcelizer : false));
            return getShowPopup.INSTANCE;
        }

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return SchemaDetailViewModel.this.new RemoteActionCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MediaBrowserCompatItemReceiver() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new RemoteActionCompatParcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.zzlc
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return SchemaDetailViewModel.RemoteActionCompatParcelizer((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    public final void read(zzlj p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, zzlj.read.INSTANCE)) {
            this.MediaMetadataCompat.write(zzll.read.INSTANCE);
            return;
        }
        if (p0 instanceof zzlj.IconCompatParcelizer) {
            zzlj.IconCompatParcelizer iconCompatParcelizer = (zzlj.IconCompatParcelizer) p0;
            write(iconCompatParcelizer.AudioAttributesCompatParcelizer(), iconCompatParcelizer.IconCompatParcelizer());
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, zzlj.AudioAttributesCompatParcelizer.INSTANCE)) {
            zzlk audioAttributesImplApi26Parcelizer = this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer().getAudioAttributesImplApi26Parcelizer();
            getResolutionSize<zzli> getresolutionsize = this.AudioAttributesImplApi21Parcelizer;
            zzli zzliVarIconCompatParcelizer = getresolutionsize.IconCompatParcelizer();
            getresolutionsize.write(zzli.RemoteActionCompatParcelizer((383 & 1) != 0 ? zzliVarIconCompatParcelizer.IconCompatParcelizer : null, (383 & 2) != 0 ? zzliVarIconCompatParcelizer.AudioAttributesImplApi21Parcelizer : null, (383 & 4) != 0 ? zzliVarIconCompatParcelizer.MediaBrowserCompatItemReceiver : null, (383 & 8) != 0 ? zzliVarIconCompatParcelizer.read : null, (383 & 16) != 0 ? zzliVarIconCompatParcelizer.AudioAttributesCompatParcelizer : false, (383 & 32) != 0 ? zzliVarIconCompatParcelizer.AudioAttributesImplApi26Parcelizer : zzlk.RemoteActionCompatParcelizer, (383 & 64) != 0 ? zzliVarIconCompatParcelizer.write : audioAttributesImplApi26Parcelizer, (383 & 128) != 0 ? zzliVarIconCompatParcelizer.RemoteActionCompatParcelizer : null, (383 & 256) != 0 ? zzliVarIconCompatParcelizer.AudioAttributesImplBaseParcelizer : false));
            MediaBrowserCompatItemReceiver();
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, zzlj.RemoteActionCompatParcelizer.INSTANCE)) {
            if (this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer().getAudioAttributesCompatParcelizer()) {
                getResolutionSize<zzli> getresolutionsize2 = this.AudioAttributesImplApi21Parcelizer;
                zzli zzliVarIconCompatParcelizer2 = getresolutionsize2.IconCompatParcelizer();
                getresolutionsize2.write(zzli.RemoteActionCompatParcelizer((383 & 1) != 0 ? zzliVarIconCompatParcelizer2.IconCompatParcelizer : null, (383 & 2) != 0 ? zzliVarIconCompatParcelizer2.AudioAttributesImplApi21Parcelizer : null, (383 & 4) != 0 ? zzliVarIconCompatParcelizer2.MediaBrowserCompatItemReceiver : null, (383 & 8) != 0 ? zzliVarIconCompatParcelizer2.read : null, (383 & 16) != 0 ? zzliVarIconCompatParcelizer2.AudioAttributesCompatParcelizer : false, (383 & 32) != 0 ? zzliVarIconCompatParcelizer2.AudioAttributesImplApi26Parcelizer : zzlk.RemoteActionCompatParcelizer, (383 & 64) != 0 ? zzliVarIconCompatParcelizer2.write : null, (383 & 128) != 0 ? zzliVarIconCompatParcelizer2.RemoteActionCompatParcelizer : null, (383 & 256) != 0 ? zzliVarIconCompatParcelizer2.AudioAttributesImplBaseParcelizer : false));
                return;
            } else {
                getResolutionSize<zzli> getresolutionsize3 = this.AudioAttributesImplApi21Parcelizer;
                zzli zzliVarIconCompatParcelizer3 = getresolutionsize3.IconCompatParcelizer();
                getresolutionsize3.write(zzli.RemoteActionCompatParcelizer((383 & 1) != 0 ? zzliVarIconCompatParcelizer3.IconCompatParcelizer : null, (383 & 2) != 0 ? zzliVarIconCompatParcelizer3.AudioAttributesImplApi21Parcelizer : null, (383 & 4) != 0 ? zzliVarIconCompatParcelizer3.MediaBrowserCompatItemReceiver : null, (383 & 8) != 0 ? zzliVarIconCompatParcelizer3.read : null, (383 & 16) != 0 ? zzliVarIconCompatParcelizer3.AudioAttributesCompatParcelizer : true, (383 & 32) != 0 ? zzliVarIconCompatParcelizer3.AudioAttributesImplApi26Parcelizer : this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer().getWrite(), (383 & 64) != 0 ? zzliVarIconCompatParcelizer3.write : null, (383 & 128) != 0 ? zzliVarIconCompatParcelizer3.RemoteActionCompatParcelizer : null, (383 & 256) != 0 ? zzliVarIconCompatParcelizer3.AudioAttributesImplBaseParcelizer : false));
                return;
            }
        }
        if (p0 instanceof zzlj.write) {
            getResolutionSize<zzli> getresolutionsize4 = this.AudioAttributesImplApi21Parcelizer;
            zzli zzliVarIconCompatParcelizer4 = getresolutionsize4.IconCompatParcelizer();
            getresolutionsize4.write(zzli.RemoteActionCompatParcelizer((383 & 1) != 0 ? zzliVarIconCompatParcelizer4.IconCompatParcelizer : null, (383 & 2) != 0 ? zzliVarIconCompatParcelizer4.AudioAttributesImplApi21Parcelizer : null, (383 & 4) != 0 ? zzliVarIconCompatParcelizer4.MediaBrowserCompatItemReceiver : null, (383 & 8) != 0 ? zzliVarIconCompatParcelizer4.read : null, (383 & 16) != 0 ? zzliVarIconCompatParcelizer4.AudioAttributesCompatParcelizer : false, (383 & 32) != 0 ? zzliVarIconCompatParcelizer4.AudioAttributesImplApi26Parcelizer : ((zzlj.write) p0).AudioAttributesCompatParcelizer(), (383 & 64) != 0 ? zzliVarIconCompatParcelizer4.write : null, (383 & 128) != 0 ? zzliVarIconCompatParcelizer4.RemoteActionCompatParcelizer : null, (383 & 256) != 0 ? zzliVarIconCompatParcelizer4.AudioAttributesImplBaseParcelizer : false));
        } else {
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, zzlj.AudioAttributesImplApi21Parcelizer.INSTANCE)) {
                AudioAttributesImplApi26Parcelizer();
                return;
            }
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, zzlj.MediaBrowserCompatItemReceiver.INSTANCE)) {
                AudioAttributesImplApi26Parcelizer();
            } else {
                if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, zzlj.AudioAttributesImplBaseParcelizer.INSTANCE)) {
                    throw new RenewEligibleCreator();
                }
                zzli zzliVarIconCompatParcelizer5 = this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer();
                isSeekPending isseekpending = this.AudioAttributesCompatParcelizer;
                zzle zzleVar = zzle.INSTANCE;
                isseekpending.write(zzle.IconCompatParcelizer(zzliVarIconCompatParcelizer5.getIconCompatParcelizer(), zzliVarIconCompatParcelizer5.getMediaBrowserCompatItemReceiver().getAudioAttributesImplBaseParcelizer()), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
            }
        }
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ String AudioAttributesCompatParcelizer;
        private /* synthetic */ onDisplayInfoChanged RemoteActionCompatParcelizer;
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.write = 1;
                if (SchemaDetailViewModel.this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer, this) == objIconCompatParcelizer) {
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
        AudioAttributesCompatParcelizer(String str, onDisplayInfoChanged ondisplayinfochanged, SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
            this.AudioAttributesCompatParcelizer = str;
            this.RemoteActionCompatParcelizer = ondisplayinfochanged;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return SchemaDetailViewModel.this.new AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void write(final String p0, onDisplayInfoChanged p1) {
        getResolutionSize<zzli> getresolutionsize = this.AudioAttributesImplApi21Parcelizer;
        zzli zzliVarIconCompatParcelizer = getresolutionsize.IconCompatParcelizer();
        getresolutionsize.write(zzli.RemoteActionCompatParcelizer((383 & 1) != 0 ? zzliVarIconCompatParcelizer.IconCompatParcelizer : null, (383 & 2) != 0 ? zzliVarIconCompatParcelizer.AudioAttributesImplApi21Parcelizer : null, (383 & 4) != 0 ? zzliVarIconCompatParcelizer.MediaBrowserCompatItemReceiver : null, (383 & 8) != 0 ? zzliVarIconCompatParcelizer.read : null, (383 & 16) != 0 ? zzliVarIconCompatParcelizer.AudioAttributesCompatParcelizer : false, (383 & 32) != 0 ? zzliVarIconCompatParcelizer.AudioAttributesImplApi26Parcelizer : null, (383 & 64) != 0 ? zzliVarIconCompatParcelizer.write : null, (383 & 128) != 0 ? zzliVarIconCompatParcelizer.RemoteActionCompatParcelizer : read(p0, p1), (383 & 256) != 0 ? zzliVarIconCompatParcelizer.AudioAttributesImplBaseParcelizer : false));
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AudioAttributesCompatParcelizer(p0, p1, null), new MagicModuleSubmissionRequestBody() { // from class: o.zzld
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return SchemaDetailViewModel.IconCompatParcelizer(this.RemoteActionCompatParcelizer, p0, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(SchemaDetailViewModel schemaDetailViewModel, String str, String str2) {
        toMagicModuleMetaRepoModel.write(str2, "");
        schemaDetailViewModel.MediaMetadataCompat.write(new zzll.RemoteActionCompatParcelizer(str2));
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(schemaDetailViewModel), schemaDetailViewModel.new IconCompatParcelizer(str, null), new MagicModuleSubmissionRequestBody() { // from class: o.zzbR
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return SchemaDetailViewModel.AudioAttributesCompatParcelizer((String) obj2);
            }
        });
        return getShowPopup.INSTANCE;
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;
        private /* synthetic */ String RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.IconCompatParcelizer = 1;
                obj = SchemaDetailViewModel.this.RemoteActionCompatParcelizer.write(this.RemoteActionCompatParcelizer, this);
                if (obj == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            getResolutionSize getresolutionsize = SchemaDetailViewModel.this.AudioAttributesImplApi21Parcelizer;
            zzli zzliVar = (zzli) SchemaDetailViewModel.this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer();
            getresolutionsize.write(zzli.RemoteActionCompatParcelizer((383 & 1) != 0 ? zzliVar.IconCompatParcelizer : null, (383 & 2) != 0 ? zzliVar.AudioAttributesImplApi21Parcelizer : null, (383 & 4) != 0 ? zzliVar.MediaBrowserCompatItemReceiver : null, (383 & 8) != 0 ? zzliVar.read : null, (383 & 16) != 0 ? zzliVar.AudioAttributesCompatParcelizer : false, (383 & 32) != 0 ? zzliVar.AudioAttributesImplApi26Parcelizer : null, (383 & 64) != 0 ? zzliVar.write : null, (383 & 128) != 0 ? zzliVar.RemoteActionCompatParcelizer : SchemaDetailViewModel.this.read(this.RemoteActionCompatParcelizer, (onDisplayInfoChanged) obj), (383 & 256) != 0 ? zzliVar.AudioAttributesImplBaseParcelizer : false));
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(String str, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
            this.RemoteActionCompatParcelizer = str;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return SchemaDetailViewModel.this.new IconCompatParcelizer(this.RemoteActionCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<obtainSystemMessage> read(String p0, onDisplayInfoChanged p1) {
        List<obtainSystemMessage> listRemoteActionCompatParcelizer = this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer().RemoteActionCompatParcelizer();
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) listRemoteActionCompatParcelizer, 10));
        for (obtainSystemMessage obtainsystemmessage : listRemoteActionCompatParcelizer) {
            List<obtainSystemMessage.AudioAttributesCompatParcelizer> listRemoteActionCompatParcelizer2 = obtainsystemmessage.RemoteActionCompatParcelizer();
            ArrayList arrayList2 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) listRemoteActionCompatParcelizer2, 10));
            for (obtainSystemMessage.AudioAttributesCompatParcelizer audioAttributesCompatParcelizerIconCompatParcelizer : listRemoteActionCompatParcelizer2) {
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) audioAttributesCompatParcelizerIconCompatParcelizer.IconCompatParcelizer(), (Object) p0)) {
                    audioAttributesCompatParcelizerIconCompatParcelizer = obtainSystemMessage.AudioAttributesCompatParcelizer.IconCompatParcelizer(audioAttributesCompatParcelizerIconCompatParcelizer.RemoteActionCompatParcelizer, p1, audioAttributesCompatParcelizerIconCompatParcelizer.read, audioAttributesCompatParcelizerIconCompatParcelizer.IconCompatParcelizer, audioAttributesCompatParcelizerIconCompatParcelizer.AudioAttributesCompatParcelizer);
                }
                arrayList2.add(audioAttributesCompatParcelizerIconCompatParcelizer);
            }
            arrayList.add(obtainSystemMessage.read(obtainsystemmessage.AudioAttributesCompatParcelizer, obtainsystemmessage.read, obtainsystemmessage.IconCompatParcelizer, obtainsystemmessage.write, obtainsystemmessage.MediaBrowserCompatItemReceiver, arrayList2));
        }
        return arrayList;
    }
}
