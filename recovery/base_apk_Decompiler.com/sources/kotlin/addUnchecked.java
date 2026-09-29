package kotlin;

import java.util.List;
import java.util.Locale;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 &2\u00020\u0001:\u0001&BA\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u0016H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0014\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u0014\u0010\u0018J \u0010\u0017\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u001aH\u0096@¢\u0006\u0004\b\u0017\u0010\u001cJ\u001e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00162\u0006\u0010\u0003\u001a\u00020\u0019H\u0096@¢\u0006\u0004\b\u001e\u0010\u001fJ\u001e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00162\u0006\u0010\u0003\u001a\u00020\u0019H\u0082@¢\u0006\u0004\b\u0017\u0010\u001fJ&\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u00162\u0006\u0010\u0003\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u001aH\u0082@¢\u0006\u0004\b\u0014\u0010\u001cJ(\u0010\u001e\u001a\u00020#2\u0006\u0010\u0003\u001a\u00020 2\u0006\u0010\u0005\u001a\u00020!2\u0006\u0010\u0007\u001a\u00020\"H\u0082@¢\u0006\u0004\b\u001e\u0010$J*\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010\u0003\u001a\u00020 2\u0006\u0010\u0005\u001a\u00020!2\u0006\u0010\u0007\u001a\u00020\"H\u0082@¢\u0006\u0004\b&\u0010$J\u0017\u0010&\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u0019H\u0002¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010(R\u0014\u0010\u001e\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010&\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010.R\u0014\u0010\u0014\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010/R\u0014\u00100\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u00102"}, d2 = {"Lo/addUnchecked;", "Lo/TimedValueQueue;", "Lo/closeCurrentOutputStream;", "p0", "Lo/getPlayerStateString;", "p1", "Lo/unlockFolder;", "p2", "Lo/copyWithMutationsApplied;", "p3", "Lo/intersects;", "p4", "Lo/uptimeMillis;", "p5", "Lo/DefaultBandwidthMeter1;", "p6", "<init>", "(Lo/closeCurrentOutputStream;Lo/getPlayerStateString;Lo/unlockFolder;Lo/copyWithMutationsApplied;Lo/intersects;Lo/uptimeMillis;Lo/DefaultBandwidthMeter1;)V", "Lo/getFirstSampleTimestampUs;", "", "RemoteActionCompatParcelizer", "(Lo/getFirstSampleTimestampUs;Lo/SampleVideos;)Ljava/lang/Object;", "", "AudioAttributesCompatParcelizer", "(Lo/SampleVideos;)Ljava/lang/Object;", "", "Lo/getAttributeValueIgnorePrefix;", "Lo/adjustSampleTimestamp;", "(Ljava/lang/String;Lo/getAttributeValueIgnorePrefix;Lo/SampleVideos;)Ljava/lang/Object;", "Lo/ptsToUs;", "IconCompatParcelizer", "(Ljava/lang/String;Lo/SampleVideos;)Ljava/lang/Object;", "Lo/toBundleSparseArray;", "Lo/XmlPullParserUtil;", "", "Lo/getTimestampOffsetUs;", "(Lo/toBundleSparseArray;Lo/XmlPullParserUtil;ZLo/SampleVideos;)Ljava/lang/Object;", "Lo/usToWrappedPts;", "read", "(Ljava/lang/String;)Ljava/lang/String;", "Lo/closeCurrentOutputStream;", "MediaBrowserCompatCustomActionResultReceiver", "Lo/getPlayerStateString;", "AudioAttributesImplApi26Parcelizer", "Lo/unlockFolder;", "write", "Lo/copyWithMutationsApplied;", "Lo/intersects;", "AudioAttributesImplApi21Parcelizer", "Lo/uptimeMillis;", "Lo/DefaultBandwidthMeter1;", "AudioAttributesImplBaseParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class addUnchecked implements TimedValueQueue {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final intersects RemoteActionCompatParcelizer;
    private final uptimeMillis AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final unlockFolder write;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final copyWithMutationsApplied read;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final getPlayerStateString IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final closeCurrentOutputStream AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final DefaultBandwidthMeter1 AudioAttributesImplBaseParcelizer;

    public static final /* synthetic */ class AudioAttributesCompatParcelizer {
        public static final /* synthetic */ int[] read;

        static {
            int[] iArr = new int[XmlPullParserUtil.values().length];
            try {
                iArr[XmlPullParserUtil.AudioAttributesCompatParcelizer.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[XmlPullParserUtil.MediaBrowserCompatItemReceiver.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[XmlPullParserUtil.write.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[XmlPullParserUtil.AudioAttributesImplApi21Parcelizer.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[XmlPullParserUtil.IconCompatParcelizer.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[XmlPullParserUtil.MediaBrowserCompatCustomActionResultReceiver.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[XmlPullParserUtil.RemoteActionCompatParcelizer.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[XmlPullParserUtil.AudioAttributesImplBaseParcelizer.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[XmlPullParserUtil.read.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[XmlPullParserUtil.AudioAttributesImplApi26Parcelizer.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[XmlPullParserUtil.MediaBrowserCompatSearchResultReceiver.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            read = iArr;
        }
    }

    static final class AudioAttributesImplApi21Parcelizer extends getTotalMcq {
        /* synthetic */ Object AudioAttributesCompatParcelizer;
        Object IconCompatParcelizer;
        int read;
        Object write;

        AudioAttributesImplApi21Parcelizer(SampleVideos<? super AudioAttributesImplApi21Parcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesCompatParcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            return addUnchecked.this.RemoteActionCompatParcelizer(null, this);
        }
    }

    static final class AudioAttributesImplApi26Parcelizer extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        Object IconCompatParcelizer;
        /* synthetic */ Object RemoteActionCompatParcelizer;
        int read;
        Object write;

        AudioAttributesImplApi26Parcelizer(SampleVideos<? super AudioAttributesImplApi26Parcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.RemoteActionCompatParcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            return addUnchecked.this.AudioAttributesCompatParcelizer(null, null, this);
        }
    }

    static final class AudioAttributesImplBaseParcelizer extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        boolean AudioAttributesImplApi21Parcelizer;
        Object AudioAttributesImplApi26Parcelizer;
        int AudioAttributesImplBaseParcelizer;
        Object IconCompatParcelizer;
        Object MediaBrowserCompatCustomActionResultReceiver;
        Object MediaBrowserCompatItemReceiver;
        /* synthetic */ Object MediaMetadataCompat;
        int RemoteActionCompatParcelizer;
        Object read;
        int write;

        AudioAttributesImplBaseParcelizer(SampleVideos<? super AudioAttributesImplBaseParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.MediaMetadataCompat = obj;
            this.AudioAttributesImplBaseParcelizer |= Integer.MIN_VALUE;
            return addUnchecked.write(addUnchecked.this, this);
        }
    }

    static final class IconCompatParcelizer extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        Object AudioAttributesImplApi21Parcelizer;
        /* synthetic */ Object AudioAttributesImplApi26Parcelizer;
        Object AudioAttributesImplBaseParcelizer;
        int IconCompatParcelizer;
        int MediaBrowserCompatCustomActionResultReceiver;
        Object MediaBrowserCompatItemReceiver;
        Object RemoteActionCompatParcelizer;
        Object read;
        Object write;

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesImplApi26Parcelizer = obj;
            this.MediaBrowserCompatCustomActionResultReceiver |= Integer.MIN_VALUE;
            return addUnchecked.this.IconCompatParcelizer((String) null, this);
        }
    }

    static final class MediaBrowserCompatCustomActionResultReceiver extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        Object IconCompatParcelizer;
        /* synthetic */ Object MediaBrowserCompatCustomActionResultReceiver;
        int RemoteActionCompatParcelizer;
        boolean read;
        Object write;

        MediaBrowserCompatCustomActionResultReceiver(SampleVideos<? super MediaBrowserCompatCustomActionResultReceiver> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.MediaBrowserCompatCustomActionResultReceiver = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            return addUnchecked.read(addUnchecked.this, this);
        }
    }

    static final class MediaBrowserCompatItemReceiver extends getTotalMcq {
        int AudioAttributesCompatParcelizer;
        Object AudioAttributesImplApi21Parcelizer;
        Object AudioAttributesImplApi26Parcelizer;
        Object AudioAttributesImplBaseParcelizer;
        int IconCompatParcelizer;
        Object MediaBrowserCompatCustomActionResultReceiver;
        Object MediaBrowserCompatItemReceiver;
        Object MediaBrowserCompatMediaItem;
        Object MediaBrowserCompatSearchResultReceiver;
        Object MediaDescriptionCompat;
        Object MediaMetadataCompat;
        Object RatingCompat;
        int RemoteActionCompatParcelizer;
        int handleMediaPlayPauseIfPendingOnHandler;
        Object onAddQueueItem;
        /* synthetic */ Object onCommand;
        boolean onCustomAction;
        int read;
        int write;

        MediaBrowserCompatItemReceiver(SampleVideos<? super MediaBrowserCompatItemReceiver> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.onCommand = obj;
            this.handleMediaPlayPauseIfPendingOnHandler |= Integer.MIN_VALUE;
            return addUnchecked.AudioAttributesCompatParcelizer(addUnchecked.this, this);
        }
    }

    static final class RemoteActionCompatParcelizer extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        /* synthetic */ Object AudioAttributesImplApi21Parcelizer;
        int AudioAttributesImplApi26Parcelizer;
        Object AudioAttributesImplBaseParcelizer;
        int IconCompatParcelizer;
        Object MediaBrowserCompatItemReceiver;
        Object RemoteActionCompatParcelizer;
        Object read;
        Object write;

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesImplApi21Parcelizer = obj;
            this.AudioAttributesImplApi26Parcelizer |= Integer.MIN_VALUE;
            return addUnchecked.IconCompatParcelizer(addUnchecked.this, this);
        }
    }

    static final class write extends getTotalMcq {
        int AudioAttributesCompatParcelizer;
        Object AudioAttributesImplApi21Parcelizer;
        Object AudioAttributesImplApi26Parcelizer;
        Object AudioAttributesImplBaseParcelizer;
        int IconCompatParcelizer;
        Object MediaBrowserCompatCustomActionResultReceiver;
        Object MediaBrowserCompatItemReceiver;
        Object MediaBrowserCompatMediaItem;
        boolean MediaDescriptionCompat;
        int MediaMetadataCompat;
        /* synthetic */ Object RatingCompat;
        Object RemoteActionCompatParcelizer;
        Object read;
        int write;

        write(SampleVideos<? super write> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.RatingCompat = obj;
            this.MediaMetadataCompat |= Integer.MIN_VALUE;
            return addUnchecked.this.AudioAttributesCompatParcelizer(this);
        }
    }

    @setSdkPayload
    public addUnchecked(closeCurrentOutputStream closecurrentoutputstream, getPlayerStateString getplayerstatestring, unlockFolder unlockfolder, copyWithMutationsApplied copywithmutationsapplied, intersects intersectsVar, uptimeMillis uptimemillis, DefaultBandwidthMeter1 defaultBandwidthMeter1) {
        toMagicModuleMetaRepoModel.write(closecurrentoutputstream, "");
        toMagicModuleMetaRepoModel.write(getplayerstatestring, "");
        toMagicModuleMetaRepoModel.write(unlockfolder, "");
        toMagicModuleMetaRepoModel.write(copywithmutationsapplied, "");
        toMagicModuleMetaRepoModel.write(intersectsVar, "");
        toMagicModuleMetaRepoModel.write(uptimemillis, "");
        toMagicModuleMetaRepoModel.write(defaultBandwidthMeter1, "");
        this.AudioAttributesCompatParcelizer = closecurrentoutputstream;
        this.IconCompatParcelizer = getplayerstatestring;
        this.write = unlockfolder;
        this.read = copywithmutationsapplied;
        this.RemoteActionCompatParcelizer = intersectsVar;
        this.AudioAttributesImplApi21Parcelizer = uptimemillis;
        this.AudioAttributesImplBaseParcelizer = defaultBandwidthMeter1;
    }

    public static final /* synthetic */ Object AudioAttributesCompatParcelizer(addUnchecked addunchecked, SampleVideos sampleVideos) {
        return addunchecked.RemoteActionCompatParcelizer(null, null, sampleVideos);
    }

    public static final /* synthetic */ Object IconCompatParcelizer(addUnchecked addunchecked, SampleVideos sampleVideos) {
        return addunchecked.AudioAttributesCompatParcelizer((String) null, (SampleVideos<? super List<ptsToUs>>) sampleVideos);
    }

    public static final /* synthetic */ Object read(addUnchecked addunchecked, SampleVideos sampleVideos) {
        return addunchecked.IconCompatParcelizer(null, null, false, sampleVideos);
    }

    public static final /* synthetic */ Object write(addUnchecked addunchecked, SampleVideos sampleVideos) {
        return addunchecked.read(null, null, false, sampleVideos);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e4, code lost:
    
        if (r0.read(r1, r2) == r3) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    @Override // kotlin.TimedValueQueue
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object RemoteActionCompatParcelizer(kotlin.getFirstSampleTimestampUs r20, kotlin.SampleVideos<? super kotlin.getShowPopup> r21) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.addUnchecked.RemoteActionCompatParcelizer(o.getFirstSampleTimestampUs, o.SampleVideos):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a9, code lost:
    
        if (r15 != r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0139 -> B:39:0x013a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x014a -> B:41:0x014e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0196 -> B:51:0x019d). Please report as a decompilation issue!!! */
    @Override // kotlin.TimedValueQueue
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object AudioAttributesCompatParcelizer(kotlin.SampleVideos<? super java.util.List<? extends kotlin.getFirstSampleTimestampUs>> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 450
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.addUnchecked.AudioAttributesCompatParcelizer(o.SampleVideos):java.lang.Object");
    }

    @Override // kotlin.TimedValueQueue
    public final Object RemoteActionCompatParcelizer(SampleVideos<? super getShowPopup> sampleVideos) {
        Object objAudioAttributesCompatParcelizer = this.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer(sampleVideos);
        return objAudioAttributesCompatParcelizer == getYear.IconCompatParcelizer() ? objAudioAttributesCompatParcelizer : getShowPopup.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlin.TimedValueQueue
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object AudioAttributesCompatParcelizer(java.lang.String r9, kotlin.getAttributeValueIgnorePrefix r10, kotlin.SampleVideos<? super kotlin.adjustSampleTimestamp> r11) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r11 instanceof o.addUnchecked.AudioAttributesImplApi26Parcelizer
            if (r0 == 0) goto L14
            r0 = r11
            o.addUnchecked$AudioAttributesImplApi26Parcelizer r0 = (o.addUnchecked.AudioAttributesImplApi26Parcelizer) r0
            int r1 = r0.read
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r11 = r0.read
            int r11 = r11 + r2
            r0.read = r11
            goto L19
        L14:
            o.addUnchecked$AudioAttributesImplApi26Parcelizer r0 = new o.addUnchecked$AudioAttributesImplApi26Parcelizer
            r0.<init>(r11)
        L19:
            java.lang.Object r11 = r0.RemoteActionCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.read
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L59
            if (r2 == r5) goto L4d
            if (r2 == r4) goto L41
            if (r2 != r3) goto L39
            java.lang.Object r8 = r0.AudioAttributesCompatParcelizer
            o.getLastAdjustedTimestampUs r8 = (kotlin.getLastAdjustedTimestampUs) r8
            java.lang.Object r9 = r0.write
            java.lang.Object r9 = r0.IconCompatParcelizer
            kotlin.SdkPayloadData.IconCompatParcelizer(r11)
            goto Lc0
        L39:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L41:
            java.lang.Object r8 = r0.AudioAttributesCompatParcelizer
            o.getLastAdjustedTimestampUs r8 = (kotlin.getLastAdjustedTimestampUs) r8
            java.lang.Object r9 = r0.write
            java.lang.Object r9 = r0.IconCompatParcelizer
            kotlin.SdkPayloadData.IconCompatParcelizer(r11)
            goto La4
        L4d:
            java.lang.Object r8 = r0.AudioAttributesCompatParcelizer
            o.getLastAdjustedTimestampUs r8 = (kotlin.getLastAdjustedTimestampUs) r8
            java.lang.Object r9 = r0.write
            java.lang.Object r9 = r0.IconCompatParcelizer
            kotlin.SdkPayloadData.IconCompatParcelizer(r11)
            goto L7e
        L59:
            kotlin.SdkPayloadData.IconCompatParcelizer(r11)
            r11 = r9
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            o.newYearNameItem r2 = new o.newYearNameItem
            java.lang.String r6 = "[^Pp]{2}\\d{4}"
            r2.<init>(r6)
            boolean r2 = r2.write(r11)
            r6 = 0
            if (r2 == 0) goto L86
            o.getLastAdjustedTimestampUs r10 = kotlin.getLastAdjustedTimestampUs.IconCompatParcelizer
            r0.IconCompatParcelizer = r6
            r0.write = r6
            r0.AudioAttributesCompatParcelizer = r10
            r0.read = r5
            java.lang.Object r11 = r8.IconCompatParcelizer(r9, r0)
            if (r11 == r1) goto Lbc
            r8 = r10
        L7e:
            o.adjustSampleTimestamp r9 = new o.adjustSampleTimestamp
            java.util.List r11 = (java.util.List) r11
            r9.<init>(r8, r11)
            return r9
        L86:
            o.newYearNameItem r2 = new o.newYearNameItem
            java.lang.String r5 = "[Pp][MFSXCDZmfsxcdz]\\d{4}"
            r2.<init>(r5)
            boolean r11 = r2.write(r11)
            if (r11 == 0) goto Lac
            o.getLastAdjustedTimestampUs r10 = kotlin.getLastAdjustedTimestampUs.read
            r0.IconCompatParcelizer = r6
            r0.write = r6
            r0.AudioAttributesCompatParcelizer = r10
            r0.read = r4
            java.lang.Object r11 = r8.AudioAttributesCompatParcelizer(r9, r0)
            if (r11 == r1) goto Lbc
            r8 = r10
        La4:
            o.adjustSampleTimestamp r9 = new o.adjustSampleTimestamp
            java.util.List r11 = (java.util.List) r11
            r9.<init>(r8, r11)
            return r9
        Lac:
            o.getLastAdjustedTimestampUs r11 = kotlin.getLastAdjustedTimestampUs.AudioAttributesCompatParcelizer
            r0.IconCompatParcelizer = r6
            r0.write = r6
            r0.AudioAttributesCompatParcelizer = r11
            r0.read = r3
            java.lang.Object r8 = r8.RemoteActionCompatParcelizer(r9, r10, r0)
            if (r8 != r1) goto Lbd
        Lbc:
            return r1
        Lbd:
            r7 = r11
            r11 = r8
            r8 = r7
        Lc0:
            o.adjustSampleTimestamp r9 = new o.adjustSampleTimestamp
            java.util.List r11 = (java.util.List) r11
            r9.<init>(r8, r11)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.addUnchecked.AudioAttributesCompatParcelizer(java.lang.String, o.getAttributeValueIgnorePrefix, o.SampleVideos):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x014d, code lost:
    
        if (kotlin.DefaultBandwidthMeter1.AudioAttributesCompatParcelizer(r8.AudioAttributesImplBaseParcelizer, r3, null, null, r5, 6) != r0) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d5 A[PHI: r10
      0x00d5: PHI (r10v8 java.lang.Object) = (r10v7 java.lang.Object), (r10v1 java.lang.Object) binds: [B:21:0x00d3, B:16:0x0089] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010a A[PHI: r1 r9 r10
      0x010a: PHI (r1v13 o.isHoleSpan) = (r1v8 o.isHoleSpan), (r1v19 o.isHoleSpan) binds: [B:28:0x0108, B:14:0x0068] A[DONT_GENERATE, DONT_INLINE]
      0x010a: PHI (r9v11 int) = (r9v9 int), (r9v15 int) binds: [B:28:0x0108, B:14:0x0068] A[DONT_GENERATE, DONT_INLINE]
      0x010a: PHI (r10v12 java.lang.Object) = (r10v11 java.lang.Object), (r10v1 java.lang.Object) binds: [B:28:0x0108, B:14:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlin.TimedValueQueue
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object IconCompatParcelizer(java.lang.String r9, kotlin.SampleVideos<? super java.util.List<kotlin.ptsToUs>> r10) {
        /*
            Method dump skipped, instruction units count: 432
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.addUnchecked.IconCompatParcelizer(java.lang.String, o.SampleVideos):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object AudioAttributesCompatParcelizer(java.lang.String r10, kotlin.SampleVideos<? super java.util.List<kotlin.ptsToUs>> r11) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.addUnchecked.AudioAttributesCompatParcelizer(java.lang.String, o.SampleVideos):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0134, code lost:
    
        if (r1 == r3) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01c4, code lost:
    
        if (r1 == r3) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x01c4 -> B:40:0x01c7). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object RemoteActionCompatParcelizer(java.lang.String r19, kotlin.getAttributeValueIgnorePrefix r20, kotlin.SampleVideos<? super java.util.List<? extends kotlin.getFirstSampleTimestampUs>> r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 512
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.addUnchecked.RemoteActionCompatParcelizer(java.lang.String, o.getAttributeValueIgnorePrefix, o.SampleVideos):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object IconCompatParcelizer(kotlin.toBundleSparseArray r8, kotlin.XmlPullParserUtil r9, boolean r10, kotlin.SampleVideos<? super kotlin.getTimestampOffsetUs> r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof o.addUnchecked.MediaBrowserCompatCustomActionResultReceiver
            if (r0 == 0) goto L14
            r0 = r11
            o.addUnchecked$MediaBrowserCompatCustomActionResultReceiver r0 = (o.addUnchecked.MediaBrowserCompatCustomActionResultReceiver) r0
            int r1 = r0.RemoteActionCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r11 = r0.RemoteActionCompatParcelizer
            int r11 = r11 + r2
            r0.RemoteActionCompatParcelizer = r11
            goto L19
        L14:
            o.addUnchecked$MediaBrowserCompatCustomActionResultReceiver r0 = new o.addUnchecked$MediaBrowserCompatCustomActionResultReceiver
            r0.<init>(r11)
        L19:
            java.lang.Object r11 = r0.MediaBrowserCompatCustomActionResultReceiver
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.RemoteActionCompatParcelizer
            r3 = 2
            r4 = 1
            java.lang.String r5 = ""
            if (r2 == 0) goto L54
            if (r2 == r4) goto L45
            if (r2 != r3) goto L3d
            boolean r7 = r0.read
            java.lang.Object r8 = r0.write
            o.pollFloor r8 = (kotlin.pollFloor) r8
            java.lang.Object r9 = r0.AudioAttributesCompatParcelizer
            o.XmlPullParserUtil r9 = (kotlin.XmlPullParserUtil) r9
            java.lang.Object r10 = r0.IconCompatParcelizer
            o.toBundleSparseArray r10 = (kotlin.toBundleSparseArray) r10
            kotlin.SdkPayloadData.IconCompatParcelizer(r11)
            goto L95
        L3d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L45:
            boolean r10 = r0.read
            java.lang.Object r8 = r0.AudioAttributesCompatParcelizer
            r9 = r8
            o.XmlPullParserUtil r9 = (kotlin.XmlPullParserUtil) r9
            java.lang.Object r8 = r0.IconCompatParcelizer
            o.toBundleSparseArray r8 = (kotlin.toBundleSparseArray) r8
            kotlin.SdkPayloadData.IconCompatParcelizer(r11)
            goto L73
        L54:
            kotlin.SdkPayloadData.IconCompatParcelizer(r11)
            o.closeCurrentOutputStream r11 = r7.AudioAttributesCompatParcelizer
            o.currentTimeMillis r2 = r8.RemoteActionCompatParcelizer()
            java.lang.String r2 = r2.getRemoteActionCompatParcelizer()
            if (r2 != 0) goto L64
            r2 = r5
        L64:
            r0.IconCompatParcelizer = r8
            r0.AudioAttributesCompatParcelizer = r9
            r0.read = r10
            r0.RemoteActionCompatParcelizer = r4
            r4 = 0
            java.lang.Object r11 = r11.IconCompatParcelizer(r2, r4, r0)
            if (r11 == r1) goto La0
        L73:
            o.CacheDataSinkFactory r11 = (kotlin.CacheDataSinkFactory) r11
            o.pollFloor r11 = kotlin.usToNonWrappedPts.RemoteActionCompatParcelizer(r11)
            o.getPlayerStateString r7 = r7.IconCompatParcelizer
            java.lang.String r2 = r11.read()
            r0.IconCompatParcelizer = r8
            r0.AudioAttributesCompatParcelizer = r9
            r0.write = r11
            r0.read = r10
            r0.RemoteActionCompatParcelizer = r3
            java.lang.Object r7 = r7.IconCompatParcelizer(r2, r0)
            if (r7 != r1) goto L90
            goto La0
        L90:
            r6 = r11
            r11 = r7
            r7 = r10
            r10 = r8
            r8 = r6
        L95:
            java.lang.String r11 = (java.lang.String) r11
            if (r11 != 0) goto L9a
            goto L9b
        L9a:
            r5 = r11
        L9b:
            o.getTimestampOffsetUs r7 = kotlin.adjustTsTimestamp.RemoteActionCompatParcelizer(r10, r8, r9, r5, r7)
            return r7
        La0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.addUnchecked.IconCompatParcelizer(o.toBundleSparseArray, o.XmlPullParserUtil, boolean, o.SampleVideos):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object read(kotlin.toBundleSparseArray r12, kotlin.XmlPullParserUtil r13, boolean r14, kotlin.SampleVideos<? super kotlin.usToWrappedPts> r15) {
        /*
            Method dump skipped, instruction units count: 360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.addUnchecked.read(o.toBundleSparseArray, o.XmlPullParserUtil, boolean, o.SampleVideos):java.lang.Object");
    }

    private static String read(String p0) {
        String strValueOf;
        if (p0.length() > 0) {
            StringBuilder sb = new StringBuilder();
            char cCharAt = p0.charAt(0);
            if (Character.isLowerCase(cCharAt)) {
                Locale locale = Locale.getDefault();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(locale, "");
                strValueOf = setStatusTimestamp.read(cCharAt, locale);
            } else {
                strValueOf = String.valueOf(cCharAt);
            }
            sb.append((Object) strValueOf);
            String strSubstring = p0.substring(1);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring, "");
            sb.append(strSubstring);
            p0 = sb.toString();
        }
        return p0 == null ? "" : p0;
    }
}
