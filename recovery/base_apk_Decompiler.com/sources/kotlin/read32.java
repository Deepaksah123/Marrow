package kotlin;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.setBandwidthEstimator;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ.\u0010\u0012\u001a\u00020\u00102\u001c\u0010\u0003\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000eH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0014H\u0096@¢\u0006\u0004\b\u0012\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0012\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b\u0012\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b\u001a\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b\u001b\u0010\u0018J\u0010\u0010\u001c\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b\u001c\u0010\u0018J\u0010\u0010\u001d\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b\u001d\u0010\u0018J\u0010\u0010\u001e\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\u0014H\u0096@¢\u0006\u0004\b\u001f\u0010\u0018J\u0010\u0010!\u001a\u00020 H\u0096@¢\u0006\u0004\b!\u0010\u0018J\u0010\u0010\"\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b\"\u0010\u0018J\u0010\u0010#\u001a\u00020\u0014H\u0096@¢\u0006\u0004\b#\u0010\u0018J\u0010\u0010\u0017\u001a\u00020$H\u0096@¢\u0006\u0004\b\u0017\u0010%J\u0012\u0010\u001e\u001a\u0004\u0018\u00010&H\u0096@¢\u0006\u0004\b\u001e\u0010%J\u0010\u0010\u001a\u001a\u00020'H\u0096@¢\u0006\u0004\b\u001a\u0010%J\u0010\u0010\u0019\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b\u0019\u0010%J\u0010\u0010\u0012\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b\u0012\u0010%R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010(R\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010)R\u0014\u0010\u001e\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010*R\u0014\u0010\u0017\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010+R\u0014\u0010\u001a\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010,"}, d2 = {"Lo/read32;", "Lo/readTimestamp;", "Lo/TopUserCompanion;", "p0", "Lo/getPlatform;", "p1", "Lo/r8lambdaPCVErwyXpSEovkAdoO9nP03HIVc;", "p2", "Lo/unlockFolder;", "p3", "Lo/DefaultBandwidthMeter1;", "p4", "<init>", "(Lo/TopUserCompanion;Lo/getPlatform;Lo/r8lambdaPCVErwyXpSEovkAdoO9nP03HIVc;Lo/unlockFolder;Lo/DefaultBandwidthMeter1;)V", "Lkotlin/Function1;", "Lo/SampleVideos;", "", "", "write", "(Lo/getAnswerMap;Lo/SampleVideos;)Ljava/lang/Object;", "", "(IILo/SampleVideos;)Ljava/lang/Object;", "", "IconCompatParcelizer", "()Ljava/lang/Object;", "RemoteActionCompatParcelizer", "read", "AudioAttributesImplBaseParcelizer", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesImplApi21Parcelizer", "AudioAttributesCompatParcelizer", "MediaBrowserCompatSearchResultReceiver", "", "MediaDescriptionCompat", "AudioAttributesImplApi26Parcelizer", "MediaBrowserCompatItemReceiver", "Lo/SlidingPercentileBandwidthStatisticSample;", "(Lo/SampleVideos;)Ljava/lang/Object;", "Lo/PercentileTimeToFirstByteEstimator;", "Lo/setTimeToFirstByteEstimator;", "Lo/TopUserCompanion;", "Lo/getPlatform;", "Lo/r8lambdaPCVErwyXpSEovkAdoO9nP03HIVc;", "Lo/unlockFolder;", "Lo/DefaultBandwidthMeter1;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class read32 implements readTimestamp {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final unlockFolder IconCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final getPlatform RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final r8lambdaPCVErwyXpSEovkAdoO9nP03HIVc AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final DefaultBandwidthMeter1 read;
    private final TopUserCompanion write;

    static final class IconCompatParcelizer extends getTotalMcq {
        /* synthetic */ Object IconCompatParcelizer;
        int RemoteActionCompatParcelizer;
        Object write;

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.IconCompatParcelizer = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            return read32.this.write(null, this);
        }
    }

    @setSdkPayload
    public read32(TopUserCompanion topUserCompanion, getPlatform getplatform, r8lambdaPCVErwyXpSEovkAdoO9nP03HIVc r8lambdapcverwyxpseovkadoo9np03hivc, unlockFolder unlockfolder, DefaultBandwidthMeter1 defaultBandwidthMeter1) {
        toMagicModuleMetaRepoModel.write(topUserCompanion, "");
        toMagicModuleMetaRepoModel.write(getplatform, "");
        toMagicModuleMetaRepoModel.write(r8lambdapcverwyxpseovkadoo9np03hivc, "");
        toMagicModuleMetaRepoModel.write(unlockfolder, "");
        toMagicModuleMetaRepoModel.write(defaultBandwidthMeter1, "");
        this.write = topUserCompanion;
        this.RemoteActionCompatParcelizer = getplatform;
        this.AudioAttributesCompatParcelizer = r8lambdapcverwyxpseovkadoo9np03hivc;
        this.IconCompatParcelizer = unlockfolder;
        this.read = defaultBandwidthMeter1;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlin.readTimestamp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object write(final kotlin.getAnswerMap<? super kotlin.SampleVideos<? super kotlin.getShowPopup>, ? extends java.lang.Object> r5, kotlin.SampleVideos<? super kotlin.getShowPopup> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof o.read32.IconCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r6
            o.read32$IconCompatParcelizer r0 = (o.read32.IconCompatParcelizer) r0
            int r1 = r0.RemoteActionCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r6 = r0.RemoteActionCompatParcelizer
            int r6 = r6 + r2
            r0.RemoteActionCompatParcelizer = r6
            goto L19
        L14:
            o.read32$IconCompatParcelizer r0 = new o.read32$IconCompatParcelizer
            r0.<init>(r6)
        L19:
            java.lang.Object r6 = r0.IconCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.RemoteActionCompatParcelizer
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r5 = r0.write
            o.getAnswerMap r5 = (kotlin.getAnswerMap) r5
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)
            goto L46
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)
            o.unlockFolder r6 = r4.IconCompatParcelizer
            r0.write = r5
            r0.RemoteActionCompatParcelizer = r3
            java.lang.Object r6 = r6.onRewind(r0)
            if (r6 != r1) goto L46
            return r1
        L46:
            java.lang.Number r6 = (java.lang.Number) r6
            long r0 = r6.longValue()
            o.r8lambdaPCVErwyXpSEovkAdoO9nP03HIVc r6 = r4.AudioAttributesCompatParcelizer
            o.setNtpHost r2 = new o.setNtpHost
            r2.<init>()
            r6.IconCompatParcelizer(r0, r2)
            o.getShowPopup r4 = kotlin.getShowPopup.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.read32.write(o.getAnswerMap, o.SampleVideos):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(read32 read32Var, getAnswerMap getanswermap, setBandwidthEstimator setbandwidthestimator) {
        toMagicModuleMetaRepoModel.write(setbandwidthestimator, "");
        if (setbandwidthestimator instanceof setBandwidthEstimator.IconCompatParcelizer) {
            read32Var.AudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer();
            CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(read32Var.write, read32Var.new write(getanswermap, null), new MagicModuleSubmissionRequestBody() { // from class: o.loadNtpTimeOffsetMs
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return read32.AudioAttributesCompatParcelizer((String) obj2);
                }
            });
        } else {
            if (!(setbandwidthestimator instanceof setBandwidthEstimator.read)) {
                throw new RenewEligibleCreator();
            }
            CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(read32Var.write, read32Var.new RemoteActionCompatParcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.getNtpHost
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return read32.IconCompatParcelizer((String) obj2);
                }
            });
        }
        return getShowPopup.INSTANCE;
    }

    static final class write extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;
        private /* synthetic */ getAnswerMap<SampleVideos<? super getShowPopup>, Object> write;

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
        
            if (r6.invoke(r5) == r0) goto L17;
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
                int r1 = r5.IconCompatParcelizer
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.SdkPayloadData.IconCompatParcelizer(r6)
                goto L3f
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L1a:
                kotlin.SdkPayloadData.IconCompatParcelizer(r6)
                goto L34
            L1e:
                kotlin.SdkPayloadData.IconCompatParcelizer(r6)
                o.read32 r6 = kotlin.read32.this
                o.unlockFolder r6 = kotlin.read32.IconCompatParcelizer(r6)
                r1 = r5
                o.SampleVideos r1 = (kotlin.SampleVideos) r1
                r5.IconCompatParcelizer = r3
                r3 = 1
                java.lang.Object r6 = r6.AudioAttributesImplApi26Parcelizer(r3, r1)
                if (r6 == r0) goto L42
            L34:
                o.getAnswerMap<o.SampleVideos<? super o.getShowPopup>, java.lang.Object> r6 = r5.write
                r5.IconCompatParcelizer = r2
                java.lang.Object r5 = r6.invoke(r5)
                if (r5 != r0) goto L3f
                goto L42
            L3f:
                o.getShowPopup r5 = kotlin.getShowPopup.INSTANCE
                return r5
            L42:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.read32.write.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        write(getAnswerMap<? super SampleVideos<? super getShowPopup>, ? extends Object> getanswermap, SampleVideos<? super write> sampleVideos) {
            super(1, sampleVideos);
            this.write = getanswermap;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return read32.this.new write(this.write, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.read = 1;
                if (read32.this.IconCompatParcelizer.AudioAttributesImplApi26Parcelizer(0L, this) == objIconCompatParcelizer) {
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
            return read32.this.new RemoteActionCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ int AudioAttributesCompatParcelizer;
        private int RemoteActionCompatParcelizer;
        private /* synthetic */ int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            read32.this.AudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer();
            Map<String, Map<String, List<writeTimestamp>>> mapOnCommand = read32.this.AudioAttributesCompatParcelizer.onCommand();
            SntpClientNtpTimeLoadable[] sntpClientNtpTimeLoadableArrValues = SntpClientNtpTimeLoadable.values();
            ArrayList<SntpClientNtpTimeLoadable> arrayList = new ArrayList();
            for (SntpClientNtpTimeLoadable sntpClientNtpTimeLoadable : sntpClientNtpTimeLoadableArrValues) {
                if (sntpClientNtpTimeLoadable.getAudioAttributesCompatParcelizer()) {
                    arrayList.add(sntpClientNtpTimeLoadable);
                }
            }
            int i = this.AudioAttributesCompatParcelizer;
            for (SntpClientNtpTimeLoadable sntpClientNtpTimeLoadable2 : arrayList) {
                Map<String, List<writeTimestamp>> map = mapOnCommand.get(sntpClientNtpTimeLoadable2.getIconCompatParcelizer());
                List<writeTimestamp> list = map != null ? map.get(sntpClientNtpTimeLoadable2.getRemoteActionCompatParcelizer()) : null;
                if (list != null) {
                    for (writeTimestamp writetimestamp : list) {
                        if (writetimestamp.read() == i) {
                            writetimestamp.RemoteActionCompatParcelizer();
                        }
                    }
                }
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesCompatParcelizer(int i, int i2, SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.AudioAttributesCompatParcelizer = i;
            this.write = i2;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return read32.this.new AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, this.write, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.readTimestamp
    public final Object write(int i, int i2, SampleVideos<? super getShowPopup> sampleVideos) {
        Object objRemoteActionCompatParcelizer = setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, new AudioAttributesCompatParcelizer(i, i2, null), sampleVideos);
        return objRemoteActionCompatParcelizer == getYear.IconCompatParcelizer() ? objRemoteActionCompatParcelizer : getShowPopup.INSTANCE;
    }

    @Override // kotlin.readTimestamp
    public final Object IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer.IconCompatParcelizer();
    }

    @Override // kotlin.readTimestamp
    public final Object write() {
        return this.AudioAttributesCompatParcelizer.write();
    }

    @Override // kotlin.readTimestamp
    public final Object RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer.read();
    }

    @Override // kotlin.readTimestamp
    public final Object read() {
        return this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
    }

    @Override // kotlin.readTimestamp
    public final Object AudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer();
    }

    @Override // kotlin.readTimestamp
    public final Object MediaBrowserCompatCustomActionResultReceiver() {
        return this.AudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver();
    }

    @Override // kotlin.readTimestamp
    public final Object AudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer();
    }

    @Override // kotlin.readTimestamp
    public final Object AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.readTimestamp
    public final Object MediaBrowserCompatSearchResultReceiver() {
        return this.AudioAttributesCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
    }

    @Override // kotlin.readTimestamp
    public final Object MediaDescriptionCompat() {
        return this.AudioAttributesCompatParcelizer.onFastForward();
    }

    @Override // kotlin.readTimestamp
    public final Object AudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesCompatParcelizer.MediaMetadataCompat();
    }

    @Override // kotlin.readTimestamp
    public final Object MediaBrowserCompatItemReceiver() {
        return this.AudioAttributesCompatParcelizer.MediaDescriptionCompat();
    }

    @Override // kotlin.readTimestamp
    public final Object IconCompatParcelizer(SampleVideos<? super SlidingPercentileBandwidthStatisticSample> sampleVideos) {
        this.AudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer();
        return this.AudioAttributesCompatParcelizer.read(sampleVideos);
    }

    static final class MediaBrowserCompatCustomActionResultReceiver extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super PercentileTimeToFirstByteEstimator>, Object> {
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
                return obj;
            }
            SdkPayloadData.IconCompatParcelizer(obj);
            read32.this.AudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer();
            this.read = 1;
            Object objRemoteActionCompatParcelizer = read32.this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(this);
            return objRemoteActionCompatParcelizer == objIconCompatParcelizer ? objIconCompatParcelizer : objRemoteActionCompatParcelizer;
        }

        MediaBrowserCompatCustomActionResultReceiver(SampleVideos<? super MediaBrowserCompatCustomActionResultReceiver> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return read32.this.new MediaBrowserCompatCustomActionResultReceiver(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super PercentileTimeToFirstByteEstimator> sampleVideos) {
            return ((MediaBrowserCompatCustomActionResultReceiver) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.readTimestamp
    public final Object AudioAttributesCompatParcelizer(SampleVideos<? super PercentileTimeToFirstByteEstimator> sampleVideos) {
        return setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, new MediaBrowserCompatCustomActionResultReceiver(null), sampleVideos);
    }

    @Override // kotlin.readTimestamp
    public final Object read(SampleVideos<? super setTimeToFirstByteEstimator> sampleVideos) {
        return this.AudioAttributesCompatParcelizer.IconCompatParcelizer(sampleVideos);
    }

    static final class AudioAttributesImplApi26Parcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super Boolean>, Object> {
        private int AudioAttributesCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
                return obj;
            }
            SdkPayloadData.IconCompatParcelizer(obj);
            r8lambdaPCVErwyXpSEovkAdoO9nP03HIVc r8lambdapcverwyxpseovkadoo9np03hivc = read32.this.AudioAttributesCompatParcelizer;
            this.AudioAttributesCompatParcelizer = 1;
            return r8lambdapcverwyxpseovkadoo9np03hivc.onPrepareFromMediaId();
        }

        AudioAttributesImplApi26Parcelizer(SampleVideos<? super AudioAttributesImplApi26Parcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return read32.this.new AudioAttributesImplApi26Parcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super Boolean> sampleVideos) {
            return ((AudioAttributesImplApi26Parcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.readTimestamp
    public final Object RemoteActionCompatParcelizer(SampleVideos<? super Boolean> sampleVideos) {
        return setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, new AudioAttributesImplApi26Parcelizer(null), sampleVideos);
    }

    static final class MediaBrowserCompatItemReceiver extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super Boolean>, Object> {
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            int i = this.write;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
                return obj;
            }
            SdkPayloadData.IconCompatParcelizer(obj);
            r8lambdaPCVErwyXpSEovkAdoO9nP03HIVc r8lambdapcverwyxpseovkadoo9np03hivc = read32.this.AudioAttributesCompatParcelizer;
            this.write = 1;
            return r8lambdapcverwyxpseovkadoo9np03hivc.onPrepareFromSearch();
        }

        MediaBrowserCompatItemReceiver(SampleVideos<? super MediaBrowserCompatItemReceiver> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return read32.this.new MediaBrowserCompatItemReceiver(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super Boolean> sampleVideos) {
            return ((MediaBrowserCompatItemReceiver) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.readTimestamp
    public final Object write(SampleVideos<? super Boolean> sampleVideos) {
        return setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, new MediaBrowserCompatItemReceiver(null), sampleVideos);
    }
}
