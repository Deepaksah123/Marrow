package kotlin;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.MagicModuleUseCaseImplWhenMappings;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u0000 \u001d*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0003\u001d\u001b\u001eBr\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u00120\b\u0002\u0010\u000e\u001a*\u0012&\u0012$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\t0\b\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0016\u001a\u00020\f2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0019\u001a\u00020\f2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\fH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u0016\u001a\u00020\fH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\fH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001cJ\u0013\u0010\u0019\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001cJ\u0013\u0010\u001e\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001cJ?\u0010\u0019\u001a\u00028\u00002\"\u0010\u0005\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\t2\u0006\u0010\u0007\u001a\u00020\u001fH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010 J7\u0010\u001e\u001a\u00028\u00002\"\u0010\u0005\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\tH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010!J\u001b\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00028\u0000H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\"J\u0013\u0010\u001e\u001a\u00020\f*\u00020\u0004H\u0002¢\u0006\u0004\b\u001e\u0010#R\u0014\u0010\u0016\u001a\u00020$8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001b\u0010%R \u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000'0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010(R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000+8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b\u001d\u0010.R \u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u0000000/8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001b\u00103\u001a\u00020\u00048CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b\u0019\u00105RC\u0010)\u001a,\u0012&\u0012$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\t\u0018\u00010\b8\u0002@\u0002X\u0083\u000eø\u0001\u0000¢\u0006\u0006\n\u0004\b6\u00107R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010,\u001a\u00020\u00118\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b<\u0010=\u0082\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lo/collect;", "T", "Lo/collectAnnotations;", "Lkotlin/Function0;", "Ljava/io/File;", "p0", "Lo/constructNonDefaultConstructor;", "p1", "", "Lkotlin/Function2;", "Lo/_isIncludableFactoryMethod;", "Lo/SampleVideos;", "", "", "p2", "Lo/getParameterType;", "p3", "Lo/TopUserCompanion;", "p4", "<init>", "(Lo/getCreatedOnDateMs;Lo/constructNonDefaultConstructor;Ljava/util/List;Lo/getParameterType;Lo/TopUserCompanion;)V", "Lo/collect$IconCompatParcelizer$RemoteActionCompatParcelizer;", "AudioAttributesCompatParcelizer", "(Lo/collect$IconCompatParcelizer$RemoteActionCompatParcelizer;Lo/SampleVideos;)Ljava/lang/Object;", "Lo/collect$IconCompatParcelizer$read;", "RemoteActionCompatParcelizer", "(Lo/collect$IconCompatParcelizer$read;Lo/SampleVideos;)Ljava/lang/Object;", "IconCompatParcelizer", "(Lo/SampleVideos;)Ljava/lang/Object;", "write", "read", "Lo/CurrentQuery;", "(Lo/MagicModuleSubmissionRequestBody;Lo/CurrentQuery;Lo/SampleVideos;)Ljava/lang/Object;", "(Lo/MagicModuleSubmissionRequestBody;Lo/SampleVideos;)Ljava/lang/Object;", "(Ljava/lang/Object;Lo/SampleVideos;)Ljava/lang/Object;", "(Ljava/io/File;)V", "", "Ljava/lang/String;", "Lo/constructFactoryCreator;", "Lo/collect$IconCompatParcelizer;", "Lo/constructFactoryCreator;", "AudioAttributesImplApi26Parcelizer", "Lo/getParameterType;", "Lo/NewNumberOtpResendRequest;", "AudioAttributesImplBaseParcelizer", "Lo/NewNumberOtpResendRequest;", "()Lo/NewNumberOtpResendRequest;", "Lo/getResolutionSize;", "Lo/isIncludableConstructor;", "AudioAttributesImplApi21Parcelizer", "Lo/getResolutionSize;", "MediaBrowserCompatItemReceiver", "Lo/RenewEligible;", "()Ljava/io/File;", "MediaBrowserCompatCustomActionResultReceiver", "Ljava/util/List;", "MediaBrowserCompatSearchResultReceiver", "Lo/getCreatedOnDateMs;", "MediaBrowserCompatMediaItem", "Lo/TopUserCompanion;", "MediaMetadataCompat", "Lo/constructNonDefaultConstructor;"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class collect<T> implements collectAnnotations<T> {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final constructFactoryCreator<IconCompatParcelizer<T>> write;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final getResolutionSize<isIncludableConstructor<T>> IconCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final getParameterType<T> read;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final NewNumberOtpResendRequest<T> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final String AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private List<? extends MagicModuleSubmissionRequestBody<? super _isIncludableFactoryMethod<T>, ? super SampleVideos<? super getShowPopup>, ? extends Object>> AudioAttributesImplApi26Parcelizer;
    private final RenewEligible MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private final TopUserCompanion AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private final getCreatedOnDateMs<File> MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private final constructNonDefaultConstructor<T> AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Set<String> read = new LinkedHashSet();
    private static final Object RemoteActionCompatParcelizer = new Object();

    static final class AudioAttributesImplApi26Parcelizer extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        final /* synthetic */ collect<T> AudioAttributesImplApi21Parcelizer;
        int IconCompatParcelizer;
        /* synthetic */ Object RemoteActionCompatParcelizer;
        Object read;
        Object write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesImplApi26Parcelizer(collect<T> collectVar, SampleVideos<? super AudioAttributesImplApi26Parcelizer> sampleVideos) {
            super(sampleVideos);
            this.AudioAttributesImplApi21Parcelizer = collectVar;
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.RemoteActionCompatParcelizer = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            return this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer((IconCompatParcelizer.read) null, this);
        }
    }

    static final class AudioAttributesImplBaseParcelizer extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        int AudioAttributesImplApi21Parcelizer;
        final /* synthetic */ collect<T> AudioAttributesImplApi26Parcelizer;
        /* synthetic */ Object AudioAttributesImplBaseParcelizer;
        Object IconCompatParcelizer;
        Object MediaBrowserCompatCustomActionResultReceiver;
        Object RemoteActionCompatParcelizer;
        Object read;
        Object write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesImplBaseParcelizer(collect<T> collectVar, SampleVideos<? super AudioAttributesImplBaseParcelizer> sampleVideos) {
            super(sampleVideos);
            this.AudioAttributesImplApi26Parcelizer = collectVar;
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesImplBaseParcelizer = obj;
            this.AudioAttributesImplApi21Parcelizer |= Integer.MIN_VALUE;
            return this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer(this);
        }
    }

    static final class MediaBrowserCompatCustomActionResultReceiver extends getTotalMcq {
        /* synthetic */ Object AudioAttributesCompatParcelizer;
        int IconCompatParcelizer;
        Object RemoteActionCompatParcelizer;
        final /* synthetic */ collect<T> write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        MediaBrowserCompatCustomActionResultReceiver(collect<T> collectVar, SampleVideos<? super MediaBrowserCompatCustomActionResultReceiver> sampleVideos) {
            super(sampleVideos);
            this.write = collectVar;
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesCompatParcelizer = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            return this.write.write(this);
        }
    }

    static final class MediaBrowserCompatItemReceiver extends getTotalMcq {
        final /* synthetic */ collect<T> AudioAttributesCompatParcelizer;
        /* synthetic */ Object IconCompatParcelizer;
        int RemoteActionCompatParcelizer;
        Object read;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        MediaBrowserCompatItemReceiver(collect<T> collectVar, SampleVideos<? super MediaBrowserCompatItemReceiver> sampleVideos) {
            super(sampleVideos);
            this.AudioAttributesCompatParcelizer = collectVar;
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.IconCompatParcelizer = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            return this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(this);
        }
    }

    static final class MediaBrowserCompatMediaItem extends getTotalMcq {
        int AudioAttributesCompatParcelizer;
        final /* synthetic */ collect<T> AudioAttributesImplApi21Parcelizer;
        /* synthetic */ Object IconCompatParcelizer;
        Object RemoteActionCompatParcelizer;
        Object read;
        Object write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        MediaBrowserCompatMediaItem(collect<T> collectVar, SampleVideos<? super MediaBrowserCompatMediaItem> sampleVideos) {
            super(sampleVideos);
            this.AudioAttributesImplApi21Parcelizer = collectVar;
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.IconCompatParcelizer = obj;
            this.AudioAttributesCompatParcelizer |= Integer.MIN_VALUE;
            return collect.AudioAttributesImplApi26Parcelizer(this.AudioAttributesImplApi21Parcelizer, this);
        }
    }

    static final class MediaBrowserCompatSearchResultReceiver extends getTotalMcq {
        int AudioAttributesCompatParcelizer;
        final /* synthetic */ collect<T> AudioAttributesImplApi21Parcelizer;
        /* synthetic */ Object IconCompatParcelizer;
        Object RemoteActionCompatParcelizer;
        Object read;
        Object write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        MediaBrowserCompatSearchResultReceiver(collect<T> collectVar, SampleVideos<? super MediaBrowserCompatSearchResultReceiver> sampleVideos) {
            super(sampleVideos);
            this.AudioAttributesImplApi21Parcelizer = collectVar;
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.IconCompatParcelizer = obj;
            this.AudioAttributesCompatParcelizer |= Integer.MIN_VALUE;
            return this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(this);
        }
    }

    static final class MediaDescriptionCompat extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        Object IconCompatParcelizer;
        /* synthetic */ Object RemoteActionCompatParcelizer;
        final /* synthetic */ collect<T> read;
        int write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        MediaDescriptionCompat(collect<T> collectVar, SampleVideos<? super MediaDescriptionCompat> sampleVideos) {
            super(sampleVideos);
            this.read = collectVar;
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.RemoteActionCompatParcelizer = obj;
            this.write |= Integer.MIN_VALUE;
            return this.read.read(this);
        }
    }

    static final class MediaMetadataCompat extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        int AudioAttributesImplApi21Parcelizer;
        final /* synthetic */ collect<T> AudioAttributesImplApi26Parcelizer;
        Object IconCompatParcelizer;
        /* synthetic */ Object MediaBrowserCompatCustomActionResultReceiver;
        Object RemoteActionCompatParcelizer;
        Object read;
        Object write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        MediaMetadataCompat(collect<T> collectVar, SampleVideos<? super MediaMetadataCompat> sampleVideos) {
            super(sampleVideos);
            this.AudioAttributesImplApi26Parcelizer = collectVar;
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.MediaBrowserCompatCustomActionResultReceiver = obj;
            this.AudioAttributesImplApi21Parcelizer |= Integer.MIN_VALUE;
            return this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer((Object) null, this);
        }
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<getValidationToken<? super T>, SampleVideos<? super getShowPopup>, Object> {
        final /* synthetic */ collect<T> AudioAttributesCompatParcelizer;
        private int IconCompatParcelizer;
        private /* synthetic */ Object read;

        public static final class read implements NewNumberOtpResendRequest<T> {
            final /* synthetic */ NewNumberOtpResendRequest AudioAttributesCompatParcelizer;

            /* JADX INFO: renamed from: o.collect$AudioAttributesCompatParcelizer$read$1, reason: invalid class name */
            public static final class AnonymousClass1 implements getValidationToken<isIncludableConstructor<T>> {
                final /* synthetic */ getValidationToken AudioAttributesCompatParcelizer;

                /* JADX INFO: renamed from: o.collect$AudioAttributesCompatParcelizer$read$1$5, reason: invalid class name */
                public static final class AnonymousClass5 extends getTotalMcq {
                    int AudioAttributesCompatParcelizer;
                    /* synthetic */ Object read;

                    public AnonymousClass5(SampleVideos sampleVideos) {
                        super(sampleVideos);
                    }

                    @Override // kotlin.getMonthName
                    public final Object invokeSuspend(Object obj) {
                        this.read = obj;
                        this.AudioAttributesCompatParcelizer |= Integer.MIN_VALUE;
                        return AnonymousClass1.this.IconCompatParcelizer(null, this);
                    }
                }

                public AnonymousClass1(getValidationToken getvalidationtoken) {
                    this.AudioAttributesCompatParcelizer = getvalidationtoken;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
                @Override // kotlin.getValidationToken
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object IconCompatParcelizer(java.lang.Object r5, kotlin.SampleVideos r6) throws java.lang.Throwable {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof o.collect.AudioAttributesCompatParcelizer.read.AnonymousClass1.AnonymousClass5
                        if (r0 == 0) goto L14
                        r0 = r6
                        o.collect$AudioAttributesCompatParcelizer$read$1$5 r0 = (o.collect.AudioAttributesCompatParcelizer.read.AnonymousClass1.AnonymousClass5) r0
                        int r1 = r0.AudioAttributesCompatParcelizer
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r1 = r1 & r2
                        if (r1 == 0) goto L14
                        int r6 = r0.AudioAttributesCompatParcelizer
                        int r6 = r6 + r2
                        r0.AudioAttributesCompatParcelizer = r6
                        goto L19
                    L14:
                        o.collect$AudioAttributesCompatParcelizer$read$1$5 r0 = new o.collect$AudioAttributesCompatParcelizer$read$1$5
                        r0.<init>(r6)
                    L19:
                        java.lang.Object r6 = r0.read
                        java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
                        int r2 = r0.AudioAttributesCompatParcelizer
                        r3 = 1
                        if (r2 == 0) goto L32
                        if (r2 != r3) goto L2a
                        kotlin.SdkPayloadData.IconCompatParcelizer(r6)
                        goto L57
                    L2a:
                        java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                        java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                        r4.<init>(r5)
                        throw r4
                    L32:
                        kotlin.SdkPayloadData.IconCompatParcelizer(r6)
                        o.getValidationToken r4 = r4.AudioAttributesCompatParcelizer
                        r6 = r0
                        o.SampleVideos r6 = (kotlin.SampleVideos) r6
                        o.isIncludableConstructor r5 = (kotlin.isIncludableConstructor) r5
                        boolean r6 = r5 instanceof kotlin._findPotentialConstructors
                        if (r6 != 0) goto L79
                        boolean r6 = r5 instanceof kotlin.collectCreators
                        if (r6 != 0) goto L72
                        boolean r6 = r5 instanceof kotlin.getRawParameterType
                        if (r6 == 0) goto L5a
                        o.getRawParameterType r5 = (kotlin.getRawParameterType) r5
                        java.lang.Object r5 = r5.IconCompatParcelizer()
                        r0.AudioAttributesCompatParcelizer = r3
                        java.lang.Object r4 = r4.IconCompatParcelizer(r5, r0)
                        if (r4 != r1) goto L57
                        return r1
                    L57:
                        o.getShowPopup r4 = kotlin.getShowPopup.INSTANCE
                        return r4
                    L5a:
                        boolean r4 = r5 instanceof kotlin.constructDefaultConstructor
                        if (r4 == 0) goto L6c
                        java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                        java.lang.String r5 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
                        java.lang.String r5 = r5.toString()
                        r4.<init>(r5)
                        java.lang.Throwable r4 = (java.lang.Throwable) r4
                        throw r4
                    L6c:
                        o.RenewEligibleCreator r4 = new o.RenewEligibleCreator
                        r4.<init>()
                        throw r4
                    L72:
                        o.collectCreators r5 = (kotlin.collectCreators) r5
                        java.lang.Throwable r4 = r5.AudioAttributesCompatParcelizer()
                        throw r4
                    L79:
                        o._findPotentialConstructors r5 = (kotlin._findPotentialConstructors) r5
                        java.lang.Throwable r4 = r5.AudioAttributesCompatParcelizer()
                        throw r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.collect.AudioAttributesCompatParcelizer.read.AnonymousClass1.IconCompatParcelizer(java.lang.Object, o.SampleVideos):java.lang.Object");
                }
            }

            public read(NewNumberOtpResendRequest newNumberOtpResendRequest) {
                this.AudioAttributesCompatParcelizer = newNumberOtpResendRequest;
            }

            @Override // kotlin.NewNumberOtpResendRequest
            public final Object write(getValidationToken getvalidationtoken, SampleVideos sampleVideos) {
                Object objWrite = this.AudioAttributesCompatParcelizer.write(new AnonymousClass1(getvalidationtoken), sampleVideos);
                return objWrite == getYear.IconCompatParcelizer() ? objWrite : getShowPopup.INSTANCE;
            }
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                getValidationToken getvalidationtoken = (getValidationToken) this.read;
                isIncludableConstructor isincludableconstructor = (isIncludableConstructor) ((collect) this.AudioAttributesCompatParcelizer).IconCompatParcelizer.IconCompatParcelizer();
                if (!(isincludableconstructor instanceof getRawParameterType)) {
                    ((collect) this.AudioAttributesCompatParcelizer).write.read(new IconCompatParcelizer.RemoteActionCompatParcelizer(isincludableconstructor));
                }
                this.IconCompatParcelizer = 1;
                if (VerifyNewNumberRequest.write(getvalidationtoken, new read(VerifyNewNumberRequest.write(((collect) this.AudioAttributesCompatParcelizer).IconCompatParcelizer, new AnonymousClass1(isincludableconstructor, null))), this) == objIconCompatParcelizer) {
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

        /* JADX INFO: renamed from: o.collect$AudioAttributesCompatParcelizer$1, reason: invalid class name */
        static final class AnonymousClass1 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<isIncludableConstructor<T>, SampleVideos<? super Boolean>, Object> {
            private /* synthetic */ Object AudioAttributesCompatParcelizer;
            final /* synthetic */ isIncludableConstructor<T> read;
            private int write;

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                getYear.IconCompatParcelizer();
                SdkPayloadData.IconCompatParcelizer(obj);
                isIncludableConstructor<T> isincludableconstructor = (isIncludableConstructor) this.AudioAttributesCompatParcelizer;
                isIncludableConstructor<T> isincludableconstructor2 = this.read;
                boolean z = false;
                if (!(isincludableconstructor2 instanceof getRawParameterType) && !(isincludableconstructor2 instanceof collectCreators) && isincludableconstructor == isincludableconstructor2) {
                    z = true;
                }
                return QBankStatsResponse.AudioAttributesCompatParcelizer(z);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(isIncludableConstructor<T> isincludableconstructor, SampleVideos<? super AnonymousClass1> sampleVideos) {
                super(2, sampleVideos);
                this.read = isincludableconstructor;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.read, sampleVideos);
                anonymousClass1.AudioAttributesCompatParcelizer = obj;
                return anonymousClass1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
            public Object invoke(isIncludableConstructor<T> isincludableconstructor, SampleVideos<? super Boolean> sampleVideos) {
                return ((AnonymousClass1) create(isincludableconstructor, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesCompatParcelizer(collect<T> collectVar, SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.AudioAttributesCompatParcelizer = collectVar;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, sampleVideos);
            audioAttributesCompatParcelizer.read = obj;
            return audioAttributesCompatParcelizer;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(getValidationToken<? super T> getvalidationtoken, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(getvalidationtoken, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public collect(getCreatedOnDateMs<? extends File> getcreatedondatems, constructNonDefaultConstructor<T> constructnondefaultconstructor, List<? extends MagicModuleSubmissionRequestBody<? super _isIncludableFactoryMethod<T>, ? super SampleVideos<? super getShowPopup>, ? extends Object>> list, getParameterType<T> getparametertype, TopUserCompanion topUserCompanion) {
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        toMagicModuleMetaRepoModel.write(constructnondefaultconstructor, "");
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(getparametertype, "");
        toMagicModuleMetaRepoModel.write(topUserCompanion, "");
        this.MediaBrowserCompatCustomActionResultReceiver = getcreatedondatems;
        this.AudioAttributesImplApi21Parcelizer = constructnondefaultconstructor;
        this.read = getparametertype;
        this.AudioAttributesImplBaseParcelizer = topUserCompanion;
        this.RemoteActionCompatParcelizer = VerifyNewNumberRequest.read((MagicModuleSubmissionRequestBody) new AudioAttributesCompatParcelizer(this, null));
        this.AudioAttributesCompatParcelizer = ".tmp";
        this.MediaBrowserCompatItemReceiver = getRenewExpiresOn.RemoteActionCompatParcelizer(new AnonymousClass5(this));
        this.IconCompatParcelizer = setStartTime.RemoteActionCompatParcelizer(constructDefaultConstructor.INSTANCE);
        this.AudioAttributesImplApi26Parcelizer = IntermediateLoginResponseBody.onPlay(list);
        this.write = new constructFactoryCreator<>(topUserCompanion, new AnonymousClass4(this), AnonymousClass1.write, new RemoteActionCompatParcelizer(this, null));
    }

    public static final /* synthetic */ Object AudioAttributesImplApi26Parcelizer(collect collectVar, SampleVideos sampleVideos) {
        return collectVar.RemoteActionCompatParcelizer((MagicModuleSubmissionRequestBody) null, (CurrentQuery) null, sampleVideos);
    }

    @Override // kotlin.collectAnnotations
    public final NewNumberOtpResendRequest<T> write() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.collectAnnotations
    public final Object read(MagicModuleSubmissionRequestBody<? super T, ? super SampleVideos<? super T>, ? extends Object> magicModuleSubmissionRequestBody, SampleVideos<? super T> sampleVideos) throws Throwable {
        getUserStartedTimestampMs getuserstartedtimestampmsAudioAttributesCompatParcelizer = getUserSubmittedTimestampMs.AudioAttributesCompatParcelizer(null);
        this.write.read(new IconCompatParcelizer.read(magicModuleSubmissionRequestBody, getuserstartedtimestampmsAudioAttributesCompatParcelizer, this.IconCompatParcelizer.IconCompatParcelizer(), sampleVideos.getWrite()));
        return getuserstartedtimestampmsAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer((SampleVideos) sampleVideos);
    }

    /* JADX INFO: renamed from: o.collect$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Ljava/io/File;", "write", "()Ljava/io/File;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<File> {
        final /* synthetic */ collect<T> read;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            File file = (File) ((collect) this.read).MediaBrowserCompatCustomActionResultReceiver.invoke();
            String absolutePath = file.getAbsolutePath();
            Companion companion = collect.INSTANCE;
            synchronized (Companion.AudioAttributesCompatParcelizer()) {
                Companion companion2 = collect.INSTANCE;
                if (Companion.read().contains(absolutePath)) {
                    StringBuilder sb = new StringBuilder("There are multiple DataStores active for the same file: ");
                    sb.append(file);
                    sb.append(". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).");
                    throw new IllegalStateException(sb.toString().toString());
                }
                Companion companion3 = collect.INSTANCE;
                Set<String> set = Companion.read();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(absolutePath, "");
                set.add(absolutePath);
            }
            return file;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(collect<T> collectVar) {
            super(0);
            this.read = collectVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File RemoteActionCompatParcelizer() {
        return (File) this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer();
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b2\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002:\u0002\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b"}, d2 = {"Lo/collect$IconCompatParcelizer;", "T", "", "<init>", "()V", "RemoteActionCompatParcelizer", "read", "Lo/collect$IconCompatParcelizer$RemoteActionCompatParcelizer;", "Lo/collect$IconCompatParcelizer$read;"}, k = 1, mv = {1, 5, 1}, xi = 48)
    static abstract class IconCompatParcelizer<T> {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }

        public static final class RemoteActionCompatParcelizer<T> extends IconCompatParcelizer<T> {
            private final isIncludableConstructor<T> RemoteActionCompatParcelizer;

            public final isIncludableConstructor<T> read() {
                return this.RemoteActionCompatParcelizer;
            }

            public RemoteActionCompatParcelizer(isIncludableConstructor<T> isincludableconstructor) {
                super(null);
                this.RemoteActionCompatParcelizer = isincludableconstructor;
            }
        }

        public static final class read<T> extends IconCompatParcelizer<T> {
            private final MagicModuleSubmissionRequestBody<T, SampleVideos<? super T>, Object> AudioAttributesCompatParcelizer;
            private final getUserStartedTimestampMs<T> IconCompatParcelizer;
            private final CurrentQuery RemoteActionCompatParcelizer;
            private final isIncludableConstructor<T> read;

            public final MagicModuleSubmissionRequestBody<T, SampleVideos<? super T>, Object> RemoteActionCompatParcelizer() {
                return this.AudioAttributesCompatParcelizer;
            }

            public final getUserStartedTimestampMs<T> IconCompatParcelizer() {
                return this.IconCompatParcelizer;
            }

            public final isIncludableConstructor<T> read() {
                return this.read;
            }

            public final CurrentQuery AudioAttributesCompatParcelizer() {
                return this.RemoteActionCompatParcelizer;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public read(MagicModuleSubmissionRequestBody<? super T, ? super SampleVideos<? super T>, ? extends Object> magicModuleSubmissionRequestBody, getUserStartedTimestampMs<T> getuserstartedtimestampms, isIncludableConstructor<T> isincludableconstructor, CurrentQuery currentQuery) {
                super(null);
                toMagicModuleMetaRepoModel.write(magicModuleSubmissionRequestBody, "");
                toMagicModuleMetaRepoModel.write(getuserstartedtimestampms, "");
                toMagicModuleMetaRepoModel.write(currentQuery, "");
                this.AudioAttributesCompatParcelizer = magicModuleSubmissionRequestBody;
                this.IconCompatParcelizer = getuserstartedtimestampms;
                this.read = isincludableconstructor;
                this.RemoteActionCompatParcelizer = currentQuery;
            }
        }
    }

    /* JADX INFO: renamed from: o.collect$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "p0", "", "write", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
    static final class AnonymousClass4 extends MagicModuleUseCase implements getAnswerMap<Throwable, getShowPopup> {
        final /* synthetic */ collect<T> IconCompatParcelizer;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(Throwable th) {
            write(th);
            return getShowPopup.INSTANCE;
        }

        public final void write(Throwable th) {
            if (th != null) {
                ((collect) this.IconCompatParcelizer).IconCompatParcelizer.write(new collectCreators(th));
            }
            Companion companion = collect.INSTANCE;
            Object objAudioAttributesCompatParcelizer = Companion.AudioAttributesCompatParcelizer();
            collect<T> collectVar = this.IconCompatParcelizer;
            synchronized (objAudioAttributesCompatParcelizer) {
                Companion companion2 = collect.INSTANCE;
                Companion.read().remove(collectVar.RemoteActionCompatParcelizer().getAbsolutePath());
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(collect<T> collectVar) {
            super(1);
            this.IconCompatParcelizer = collectVar;
        }
    }

    /* JADX INFO: renamed from: o.collect$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "Lo/collect$IconCompatParcelizer;", "p0", "", "p1", "", "AudioAttributesCompatParcelizer", "(Lo/collect$IconCompatParcelizer;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
    static final class AnonymousClass1 extends MagicModuleUseCase implements MagicModuleSubmissionRequestBody<IconCompatParcelizer<T>, Throwable, getShowPopup> {
        public static final AnonymousClass1 write = new AnonymousClass1();

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ getShowPopup invoke(Object obj, Throwable th) {
            AudioAttributesCompatParcelizer((IconCompatParcelizer) obj, th);
            return getShowPopup.INSTANCE;
        }

        public final void AudioAttributesCompatParcelizer(IconCompatParcelizer<T> iconCompatParcelizer, Throwable th) {
            toMagicModuleMetaRepoModel.write(iconCompatParcelizer, "");
            if (iconCompatParcelizer instanceof IconCompatParcelizer.read) {
                getUserStartedTimestampMs<T> getuserstartedtimestampmsIconCompatParcelizer = ((IconCompatParcelizer.read) iconCompatParcelizer).IconCompatParcelizer();
                if (th == null) {
                    th = new CancellationException("DataStore scope was cancelled before updateData could complete");
                }
                getuserstartedtimestampmsIconCompatParcelizer.AudioAttributesCompatParcelizer(th);
            }
        }

        AnonymousClass1() {
            super(2);
        }
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<IconCompatParcelizer<T>, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ Object AudioAttributesCompatParcelizer;
        final /* synthetic */ collect<T> RemoteActionCompatParcelizer;
        private int write;

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
        
            if (r4.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer((o.collect.IconCompatParcelizer.RemoteActionCompatParcelizer) r5, r4) == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0047, code lost:
        
            if (r4.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer((o.collect.IconCompatParcelizer.read) r5, r4) == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
        
            return r0;
         */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                int r1 = r4.write
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1b
                if (r1 == r3) goto L17
                if (r1 != r2) goto Lf
                goto L17
            Lf:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L17:
                kotlin.SdkPayloadData.IconCompatParcelizer(r5)
                goto L4a
            L1b:
                kotlin.SdkPayloadData.IconCompatParcelizer(r5)
                java.lang.Object r5 = r4.AudioAttributesCompatParcelizer
                o.collect$IconCompatParcelizer r5 = (o.collect.IconCompatParcelizer) r5
                boolean r1 = r5 instanceof o.collect.IconCompatParcelizer.RemoteActionCompatParcelizer
                if (r1 == 0) goto L36
                o.collect<T> r1 = r4.RemoteActionCompatParcelizer
                o.collect$IconCompatParcelizer$RemoteActionCompatParcelizer r5 = (o.collect.IconCompatParcelizer.RemoteActionCompatParcelizer) r5
                r2 = r4
                o.SampleVideos r2 = (kotlin.SampleVideos) r2
                r4.write = r3
                java.lang.Object r4 = kotlin.collect.RemoteActionCompatParcelizer(r1, r5, r2)
                if (r4 != r0) goto L4a
                goto L49
            L36:
                boolean r1 = r5 instanceof o.collect.IconCompatParcelizer.read
                if (r1 == 0) goto L4a
                o.collect<T> r1 = r4.RemoteActionCompatParcelizer
                o.collect$IconCompatParcelizer$read r5 = (o.collect.IconCompatParcelizer.read) r5
                r3 = r4
                o.SampleVideos r3 = (kotlin.SampleVideos) r3
                r4.write = r2
                java.lang.Object r4 = kotlin.collect.write(r1, r5, r3)
                if (r4 != r0) goto L4a
            L49:
                return r0
            L4a:
                o.getShowPopup r4 = kotlin.getShowPopup.INSTANCE
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: o.collect.RemoteActionCompatParcelizer.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        RemoteActionCompatParcelizer(collect<T> collectVar, SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.RemoteActionCompatParcelizer = collectVar;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, sampleVideos);
            remoteActionCompatParcelizer.AudioAttributesCompatParcelizer = obj;
            return remoteActionCompatParcelizer;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(IconCompatParcelizer<T> iconCompatParcelizer, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(iconCompatParcelizer, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object AudioAttributesCompatParcelizer(IconCompatParcelizer.RemoteActionCompatParcelizer<T> remoteActionCompatParcelizer, SampleVideos<? super getShowPopup> sampleVideos) {
        isIncludableConstructor<T> isincludableconstructorIconCompatParcelizer = this.IconCompatParcelizer.IconCompatParcelizer();
        if (!(isincludableconstructorIconCompatParcelizer instanceof getRawParameterType)) {
            if (isincludableconstructorIconCompatParcelizer instanceof _findPotentialConstructors) {
                if (isincludableconstructorIconCompatParcelizer == remoteActionCompatParcelizer.read()) {
                    Object objWrite = write(sampleVideos);
                    return objWrite == getYear.IconCompatParcelizer() ? objWrite : getShowPopup.INSTANCE;
                }
            } else {
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(isincludableconstructorIconCompatParcelizer, constructDefaultConstructor.INSTANCE)) {
                    Object objWrite2 = write(sampleVideos);
                    return objWrite2 == getYear.IconCompatParcelizer() ? objWrite2 : getShowPopup.INSTANCE;
                }
                if (isincludableconstructorIconCompatParcelizer instanceof collectCreators) {
                    throw new IllegalStateException("Can't read in final state.".toString());
                }
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* JADX WARN: Type inference failed for: r8v3, types: [o.getUserStartedTimestampMs] */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object RemoteActionCompatParcelizer(o.collect.IconCompatParcelizer.read<T> r9, kotlin.SampleVideos<? super kotlin.getShowPopup> r10) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collect.RemoteActionCompatParcelizer(o.collect$IconCompatParcelizer$read, o.SampleVideos):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object AudioAttributesCompatParcelizer(kotlin.SampleVideos<? super kotlin.getShowPopup> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof o.collect.MediaBrowserCompatItemReceiver
            if (r0 == 0) goto L14
            r0 = r5
            o.collect$MediaBrowserCompatItemReceiver r0 = (o.collect.MediaBrowserCompatItemReceiver) r0
            int r1 = r0.RemoteActionCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r5 = r0.RemoteActionCompatParcelizer
            int r5 = r5 + r2
            r0.RemoteActionCompatParcelizer = r5
            goto L19
        L14:
            o.collect$MediaBrowserCompatItemReceiver r0 = new o.collect$MediaBrowserCompatItemReceiver
            r0.<init>(r4, r5)
        L19:
            java.lang.Object r5 = r0.IconCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.RemoteActionCompatParcelizer
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r4 = r0.read
            o.collect r4 = (kotlin.collect) r4
            kotlin.SdkPayloadData.IconCompatParcelizer(r5)     // Catch: java.lang.Throwable -> L47
            goto L44
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            kotlin.SdkPayloadData.IconCompatParcelizer(r5)
            r0.read = r4     // Catch: java.lang.Throwable -> L47
            r0.RemoteActionCompatParcelizer = r3     // Catch: java.lang.Throwable -> L47
            java.lang.Object r4 = r4.IconCompatParcelizer(r0)     // Catch: java.lang.Throwable -> L47
            if (r4 != r1) goto L44
            return r1
        L44:
            o.getShowPopup r4 = kotlin.getShowPopup.INSTANCE
            return r4
        L47:
            r5 = move-exception
            o.getResolutionSize<o.isIncludableConstructor<T>> r4 = r4.IconCompatParcelizer
            o._findPotentialConstructors r0 = new o._findPotentialConstructors
            r0.<init>(r5)
            r4.write(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collect.AudioAttributesCompatParcelizer(o.SampleVideos):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, o.collect, o.collect<T>] */
    /* JADX WARN: Type inference failed for: r4v1, types: [o.collect] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object write(kotlin.SampleVideos<? super kotlin.getShowPopup> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof o.collect.MediaBrowserCompatCustomActionResultReceiver
            if (r0 == 0) goto L14
            r0 = r5
            o.collect$MediaBrowserCompatCustomActionResultReceiver r0 = (o.collect.MediaBrowserCompatCustomActionResultReceiver) r0
            int r1 = r0.IconCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r5 = r0.IconCompatParcelizer
            int r5 = r5 + r2
            r0.IconCompatParcelizer = r5
            goto L19
        L14:
            o.collect$MediaBrowserCompatCustomActionResultReceiver r0 = new o.collect$MediaBrowserCompatCustomActionResultReceiver
            r0.<init>(r4, r5)
        L19:
            java.lang.Object r5 = r0.AudioAttributesCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.IconCompatParcelizer
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r4 = r0.RemoteActionCompatParcelizer
            o.collect r4 = (kotlin.collect) r4
            kotlin.SdkPayloadData.IconCompatParcelizer(r5)     // Catch: java.lang.Throwable -> L44
            goto L4f
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            kotlin.SdkPayloadData.IconCompatParcelizer(r5)
            r0.RemoteActionCompatParcelizer = r4     // Catch: java.lang.Throwable -> L44
            r0.IconCompatParcelizer = r3     // Catch: java.lang.Throwable -> L44
            java.lang.Object r4 = r4.IconCompatParcelizer(r0)     // Catch: java.lang.Throwable -> L44
            if (r4 != r1) goto L4f
            return r1
        L44:
            r5 = move-exception
            o.getResolutionSize<o.isIncludableConstructor<T>> r4 = r4.IconCompatParcelizer
            o._findPotentialConstructors r0 = new o._findPotentialConstructors
            r0.<init>(r5)
            r4.write(r0)
        L4f:
            o.getShowPopup r4 = kotlin.getShowPopup.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collect.write(o.SampleVideos):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [o.collect] */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, o.collect, o.collect<T>] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [o.collect] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, o.collect] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object IconCompatParcelizer(kotlin.SampleVideos<? super kotlin.getShowPopup> r12) throws kotlin.AnnotatedConstructorSerialization, java.io.FileNotFoundException {
        /*
            Method dump skipped, instruction units count: 322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collect.IconCompatParcelizer(o.SampleVideos):java.lang.Object");
    }

    public static final class AudioAttributesImplApi21Parcelizer implements _isIncludableFactoryMethod<T> {
        final /* synthetic */ collect<T> AudioAttributesCompatParcelizer;
        final /* synthetic */ MagicModuleUseCaseImplWhenMappings.AudioAttributesCompatParcelizer RemoteActionCompatParcelizer;
        final /* synthetic */ setDownloadPercent read;
        final /* synthetic */ MagicModuleUseCaseImplWhenMappings.write<T> write;

        static final class IconCompatParcelizer extends getTotalMcq {
            Object AudioAttributesCompatParcelizer;
            /* synthetic */ Object AudioAttributesImplApi21Parcelizer;
            Object IconCompatParcelizer;
            int MediaBrowserCompatCustomActionResultReceiver;
            Object RemoteActionCompatParcelizer;
            Object read;
            Object write;

            IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
                super(sampleVideos);
            }

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                this.AudioAttributesImplApi21Parcelizer = obj;
                this.MediaBrowserCompatCustomActionResultReceiver |= Integer.MIN_VALUE;
                return AudioAttributesImplApi21Parcelizer.this.RemoteActionCompatParcelizer(null, this);
            }
        }

        AudioAttributesImplApi21Parcelizer(setDownloadPercent setdownloadpercent, MagicModuleUseCaseImplWhenMappings.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, MagicModuleUseCaseImplWhenMappings.write<T> writeVar, collect<T> collectVar) {
            this.read = setdownloadpercent;
            this.RemoteActionCompatParcelizer = audioAttributesCompatParcelizer;
            this.write = writeVar;
            this.AudioAttributesCompatParcelizer = collectVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x00b6 A[Catch: all -> 0x0057, TRY_LEAVE, TryCatch #0 {all -> 0x0057, blocks: (B:21:0x0053, B:34:0x00ae, B:36:0x00b6), top: B:53:0x0053 }] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00ca  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
        @Override // kotlin._isIncludableFactoryMethod
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object RemoteActionCompatParcelizer(kotlin.MagicModuleSubmissionRequestBody<? super T, ? super kotlin.SampleVideos<? super T>, ? extends java.lang.Object> r10, kotlin.SampleVideos<? super T> r11) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 227
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.collect.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(o.MagicModuleSubmissionRequestBody, o.SampleVideos):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object read(kotlin.SampleVideos<? super T> r8) throws kotlin.AnnotatedConstructorSerialization, java.io.FileNotFoundException {
        /*
            r7 = this;
            boolean r0 = r8 instanceof o.collect.MediaDescriptionCompat
            if (r0 == 0) goto L14
            r0 = r8
            o.collect$MediaDescriptionCompat r0 = (o.collect.MediaDescriptionCompat) r0
            int r1 = r0.write
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r8 = r0.write
            int r8 = r8 + r2
            r0.write = r8
            goto L19
        L14:
            o.collect$MediaDescriptionCompat r0 = new o.collect$MediaDescriptionCompat
            r0.<init>(r7, r8)
        L19:
            java.lang.Object r8 = r0.RemoteActionCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.write
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L54
            if (r2 == r5) goto L4c
            if (r2 == r4) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r7 = r0.IconCompatParcelizer
            java.lang.Object r0 = r0.AudioAttributesCompatParcelizer
            o.AnnotatedConstructorSerialization r0 = (kotlin.AnnotatedConstructorSerialization) r0
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)     // Catch: java.io.IOException -> L36
            return r7
        L36:
            r7 = move-exception
            goto L86
        L38:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L40:
            java.lang.Object r7 = r0.IconCompatParcelizer
            o.AnnotatedConstructorSerialization r7 = (kotlin.AnnotatedConstructorSerialization) r7
            java.lang.Object r2 = r0.AudioAttributesCompatParcelizer
            o.collect r2 = (kotlin.collect) r2
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            goto L75
        L4c:
            java.lang.Object r7 = r0.AudioAttributesCompatParcelizer
            o.collect r7 = (kotlin.collect) r7
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)     // Catch: kotlin.AnnotatedConstructorSerialization -> L62
            return r8
        L54:
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            r0.AudioAttributesCompatParcelizer = r7     // Catch: kotlin.AnnotatedConstructorSerialization -> L62
            r0.write = r5     // Catch: kotlin.AnnotatedConstructorSerialization -> L62
            java.lang.Object r7 = r7.RemoteActionCompatParcelizer(r0)     // Catch: kotlin.AnnotatedConstructorSerialization -> L62
            if (r7 == r1) goto L8f
            return r7
        L62:
            r8 = move-exception
            o.getParameterType<T> r2 = r7.read
            r0.AudioAttributesCompatParcelizer = r7
            r0.IconCompatParcelizer = r8
            r0.write = r4
            java.lang.Object r2 = r2.IconCompatParcelizer(r8)
            if (r2 == r1) goto L8f
            r6 = r2
            r2 = r7
            r7 = r8
            r8 = r6
        L75:
            r0.AudioAttributesCompatParcelizer = r7     // Catch: java.io.IOException -> L83
            r0.IconCompatParcelizer = r8     // Catch: java.io.IOException -> L83
            r0.write = r3     // Catch: java.io.IOException -> L83
            java.lang.Object r7 = r2.IconCompatParcelizer(r8, r0)     // Catch: java.io.IOException -> L83
            if (r7 != r1) goto L82
            goto L8f
        L82:
            return r8
        L83:
            r8 = move-exception
            r0 = r7
            r7 = r8
        L86:
            r8 = r0
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            kotlin.getPlanName.IconCompatParcelizer(r8, r7)
            throw r0
        L8f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collect.read(o.SampleVideos):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object RemoteActionCompatParcelizer(kotlin.SampleVideos<? super T> r8) throws java.io.FileNotFoundException {
        /*
            r7 = this;
            boolean r0 = r8 instanceof o.collect.MediaBrowserCompatSearchResultReceiver
            if (r0 == 0) goto L14
            r0 = r8
            o.collect$MediaBrowserCompatSearchResultReceiver r0 = (o.collect.MediaBrowserCompatSearchResultReceiver) r0
            int r1 = r0.AudioAttributesCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r8 = r0.AudioAttributesCompatParcelizer
            int r8 = r8 + r2
            r0.AudioAttributesCompatParcelizer = r8
            goto L19
        L14:
            o.collect$MediaBrowserCompatSearchResultReceiver r0 = new o.collect$MediaBrowserCompatSearchResultReceiver
            r0.<init>(r7, r8)
        L19:
            java.lang.Object r8 = r0.IconCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.AudioAttributesCompatParcelizer
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L43
            if (r2 != r4) goto L3b
            java.lang.Object r7 = r0.read
            java.lang.Object r7 = r0.RemoteActionCompatParcelizer
            java.io.Closeable r7 = (java.io.Closeable) r7
            java.lang.Object r0 = r0.write
            o.collect r0 = (kotlin.collect) r0
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)     // Catch: java.lang.Throwable -> L35
            goto L6b
        L35:
            r8 = move-exception
            r6 = r8
            r8 = r7
            r7 = r0
            r0 = r6
            goto L72
        L3b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L43:
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L7e
            java.io.File r2 = r7.RemoteActionCompatParcelizer()     // Catch: java.io.FileNotFoundException -> L7e
            r8.<init>(r2)     // Catch: java.io.FileNotFoundException -> L7e
            java.io.Closeable r8 = (java.io.Closeable) r8     // Catch: java.io.FileNotFoundException -> L7e
            r2 = r8
            java.io.FileInputStream r2 = (java.io.FileInputStream) r2     // Catch: java.lang.Throwable -> L71
            o.constructNonDefaultConstructor<T> r5 = r7.AudioAttributesImplApi21Parcelizer     // Catch: java.lang.Throwable -> L71
            java.io.InputStream r2 = (java.io.InputStream) r2     // Catch: java.lang.Throwable -> L71
            r0.write = r7     // Catch: java.lang.Throwable -> L71
            r0.RemoteActionCompatParcelizer = r8     // Catch: java.lang.Throwable -> L71
            r0.read = r3     // Catch: java.lang.Throwable -> L71
            r0.AudioAttributesCompatParcelizer = r4     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r5.write(r2)     // Catch: java.lang.Throwable -> L71
            if (r0 != r1) goto L67
            return r1
        L67:
            r6 = r0
            r0 = r7
            r7 = r8
            r8 = r6
        L6b:
            kotlin.MagicModuleMetaLSModel.IconCompatParcelizer(r7, r3)     // Catch: java.io.FileNotFoundException -> L6f
            return r8
        L6f:
            r7 = move-exception
            goto L7b
        L71:
            r0 = move-exception
        L72:
            throw r0     // Catch: java.lang.Throwable -> L73
        L73:
            r1 = move-exception
            kotlin.MagicModuleMetaLSModel.IconCompatParcelizer(r8, r0)     // Catch: java.io.FileNotFoundException -> L78
            throw r1     // Catch: java.io.FileNotFoundException -> L78
        L78:
            r8 = move-exception
            r0 = r7
            r7 = r8
        L7b:
            r8 = r7
            r7 = r0
            goto L7f
        L7e:
            r8 = move-exception
        L7f:
            java.io.File r0 = r7.RemoteActionCompatParcelizer()
            boolean r0 = r0.exists()
            if (r0 != 0) goto L90
            o.constructNonDefaultConstructor<T> r7 = r7.AudioAttributesImplApi21Parcelizer
            java.lang.Object r7 = r7.RemoteActionCompatParcelizer()
            return r7
        L90:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collect.RemoteActionCompatParcelizer(o.SampleVideos):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object RemoteActionCompatParcelizer(kotlin.MagicModuleSubmissionRequestBody<? super T, ? super kotlin.SampleVideos<? super T>, ? extends java.lang.Object> r9, kotlin.CurrentQuery r10, kotlin.SampleVideos<? super T> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof o.collect.MediaBrowserCompatMediaItem
            if (r0 == 0) goto L14
            r0 = r11
            o.collect$MediaBrowserCompatMediaItem r0 = (o.collect.MediaBrowserCompatMediaItem) r0
            int r1 = r0.AudioAttributesCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r11 = r0.AudioAttributesCompatParcelizer
            int r11 = r11 + r2
            r0.AudioAttributesCompatParcelizer = r11
            goto L19
        L14:
            o.collect$MediaBrowserCompatMediaItem r0 = new o.collect$MediaBrowserCompatMediaItem
            r0.<init>(r8, r11)
        L19:
            java.lang.Object r11 = r0.IconCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.AudioAttributesCompatParcelizer
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L4a
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r8 = r0.read
            java.lang.Object r9 = r0.RemoteActionCompatParcelizer
            o.collect r9 = (kotlin.collect) r9
            kotlin.SdkPayloadData.IconCompatParcelizer(r11)
            goto L91
        L34:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3c:
            java.lang.Object r8 = r0.write
            java.lang.Object r9 = r0.read
            o.getRawParameterType r9 = (kotlin.getRawParameterType) r9
            java.lang.Object r10 = r0.RemoteActionCompatParcelizer
            o.collect r10 = (kotlin.collect) r10
            kotlin.SdkPayloadData.IconCompatParcelizer(r11)
            goto L76
        L4a:
            kotlin.SdkPayloadData.IconCompatParcelizer(r11)
            o.getResolutionSize<o.isIncludableConstructor<T>> r11 = r8.IconCompatParcelizer
            java.lang.Object r11 = r11.IconCompatParcelizer()
            o.getRawParameterType r11 = (kotlin.getRawParameterType) r11
            r11.read()
            java.lang.Object r2 = r11.IconCompatParcelizer()
            o.collect$RatingCompat r6 = new o.collect$RatingCompat
            r6.<init>(r9, r2, r5)
            o.MagicModuleSubmissionRequestBody r6 = (kotlin.MagicModuleSubmissionRequestBody) r6
            r0.RemoteActionCompatParcelizer = r8
            r0.read = r11
            r0.write = r2
            r0.AudioAttributesCompatParcelizer = r4
            java.lang.Object r9 = kotlin.setModifiedEndTimestampMs.RemoteActionCompatParcelizer(r10, r6, r0)
            if (r9 == r1) goto La4
            r10 = r8
            r8 = r2
            r7 = r11
            r11 = r9
            r9 = r7
        L76:
            r9.read()
            boolean r9 = kotlin.toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(r8, r11)
            if (r9 == 0) goto L80
            return r8
        L80:
            r0.RemoteActionCompatParcelizer = r10
            r0.read = r11
            r0.write = r5
            r0.AudioAttributesCompatParcelizer = r3
            java.lang.Object r8 = r10.IconCompatParcelizer(r11, r0)
            if (r8 != r1) goto L8f
            goto La4
        L8f:
            r9 = r10
            r8 = r11
        L91:
            o.getResolutionSize<o.isIncludableConstructor<T>> r9 = r9.IconCompatParcelizer
            if (r8 == 0) goto L9a
            int r10 = r8.hashCode()
            goto L9b
        L9a:
            r10 = 0
        L9b:
            o.getRawParameterType r11 = new o.getRawParameterType
            r11.<init>(r8, r10)
            r9.write(r11)
            return r8
        La4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collect.RemoteActionCompatParcelizer(o.MagicModuleSubmissionRequestBody, o.CurrentQuery, o.SampleVideos):java.lang.Object");
    }

    static final class RatingCompat extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super T>, Object> {
        final /* synthetic */ T AudioAttributesCompatParcelizer;
        final /* synthetic */ MagicModuleSubmissionRequestBody<T, SampleVideos<? super T>, Object> RemoteActionCompatParcelizer;
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
                return obj;
            }
            SdkPayloadData.IconCompatParcelizer(obj);
            MagicModuleSubmissionRequestBody<T, SampleVideos<? super T>, Object> magicModuleSubmissionRequestBody = this.RemoteActionCompatParcelizer;
            T t = this.AudioAttributesCompatParcelizer;
            this.write = 1;
            Object objInvoke = magicModuleSubmissionRequestBody.invoke(t, this);
            return objInvoke == objIconCompatParcelizer ? objIconCompatParcelizer : objInvoke;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        RatingCompat(MagicModuleSubmissionRequestBody<? super T, ? super SampleVideos<? super T>, ? extends Object> magicModuleSubmissionRequestBody, T t, SampleVideos<? super RatingCompat> sampleVideos) {
            super(2, sampleVideos);
            this.RemoteActionCompatParcelizer = magicModuleSubmissionRequestBody;
            this.AudioAttributesCompatParcelizer = t;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new RatingCompat(this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super T> sampleVideos) {
            return ((RatingCompat) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object IconCompatParcelizer(T r9, kotlin.SampleVideos<? super kotlin.getShowPopup> r10) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collect.IconCompatParcelizer(java.lang.Object, o.SampleVideos):java.lang.Object");
    }

    private static void read(File file) throws IOException {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                throw new IOException(toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer("Unable to create parent directories of ", (Object) file));
            }
        }
    }

    static final class read extends OutputStream {
        private final FileOutputStream IconCompatParcelizer;

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        public read(FileOutputStream fileOutputStream) {
            toMagicModuleMetaRepoModel.write(fileOutputStream, "");
            this.IconCompatParcelizer = fileOutputStream;
        }

        @Override // java.io.OutputStream
        public final void write(int i) throws IOException {
            this.IconCompatParcelizer.write(i);
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr) throws IOException {
            toMagicModuleMetaRepoModel.write(bArr, "");
            this.IconCompatParcelizer.write(bArr);
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i, int i2) throws IOException {
            toMagicModuleMetaRepoModel.write(bArr, "");
            this.IconCompatParcelizer.write(bArr, i, i2);
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public final void flush() throws IOException {
            this.IconCompatParcelizer.flush();
        }
    }

    /* JADX INFO: renamed from: o.collect$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\t\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\u000e\u001a\u00020\u00018\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Lo/collect$write;", "", "<init>", "()V", "", "", "read", "Ljava/util/Set;", "()Ljava/util/Set;", "write", "RemoteActionCompatParcelizer", "Ljava/lang/Object;", "AudioAttributesCompatParcelizer", "()Ljava/lang/Object;", "IconCompatParcelizer"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static Set<String> read() {
            return collect.read;
        }

        public static Object AudioAttributesCompatParcelizer() {
            return collect.RemoteActionCompatParcelizer;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
