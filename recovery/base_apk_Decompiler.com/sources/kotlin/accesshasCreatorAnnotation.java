package kotlin;

import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.KotlinKeySerializersKt;
import kotlin.KotlinModuleCompanion;
import kotlin.KotlinNamesAnnotationIntrospector;
import kotlin.KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B{\u0012\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\f\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000e\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000eH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\nH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001aJ#\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u001c2\u0006\u0010\u0006\u001a\u00020\u001dH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001eJ'\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f2\u0006\u0010\u0004\u001a\u00020\u001c2\b\u0010\u0006\u001a\u0004\u0018\u00018\u0000H\u0002¢\u0006\u0004\b\u0015\u0010 J7\u0010\u0019\u001a\u00020\"2\u0006\u0010\u0004\u001a\u00020\u001c2\b\u0010\u0006\u001a\u0004\u0018\u00018\u00002\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010!H\u0002¢\u0006\u0004\b\u0019\u0010#J\u000f\u0010\u001b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001b\u0010\u0018J%\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u001c2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0014H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010$J%\u0010&\u001a\u00020\n*\b\u0012\u0004\u0012\u00020%0\t2\u0006\u0010\u0004\u001a\u00020\u001cH\u0082@ø\u0001\u0000¢\u0006\u0004\b&\u0010'J9\u0010\u0017\u001a\u0004\u0018\u00018\u0000*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010(2\u0006\u0010\u0004\u001a\u00020\u001c2\u0006\u0010\u0006\u001a\u00020%2\u0006\u0010\b\u001a\u00020%H\u0002¢\u0006\u0004\b\u0017\u0010)J3\u0010&\u001a\u00020\n*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010(2\u0006\u0010\u0004\u001a\u00020\u001c2\u0006\u0010\u0006\u001a\u00020*H\u0082@ø\u0001\u0000¢\u0006\u0004\b&\u0010+J+\u0010\u0019\u001a\u00020\n*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010(2\u0006\u0010\u0004\u001a\u00020\u001cH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010,J\u0013\u0010&\u001a\u00020\n*\u00020-H\u0002¢\u0006\u0004\b&\u0010.R\u0014\u0010\u001b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010/R\u0014\u0010\u0015\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u00101R\u0016\u0010&\u001a\u0004\u0018\u00018\u00008\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0015\u00102R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u00103R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u000105048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u00106R\u0014\u0010:\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R#\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u0001050\t8\u0007¢\u0006\f\n\u0004\b:\u0010>\u001a\u0004\b&\u0010?R&\u0010@\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0001X\u0081\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\b\u0015\u0010BR\"\u0010C\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bC\u0010DR(\u0010H\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\b\u0019\u0010GR\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bH\u0010>R \u0010E\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010J8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bK\u0010L\u0082\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lo/accesshasCreatorAnnotation;", "", "Key", "Value", "p0", "Lo/KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2;", "p1", "Lo/accessfilterOutSingleStringCallables;", "p2", "Lo/NewNumberOtpResendRequest;", "", "p3", "Lo/KotlinObjectSingletonDeserializer;", "p4", "Lo/accessisPrimaryConstructor;", "p5", "Lkotlin/Function0;", "p6", "<init>", "(Ljava/lang/Object;Lo/KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2;Lo/accessfilterOutSingleStringCallables;Lo/NewNumberOtpResendRequest;Lo/KotlinObjectSingletonDeserializer;Lo/accessisPrimaryConstructor;Lo/getCreatedOnDateMs;)V", "Lo/getInstanceParameter;", "RemoteActionCompatParcelizer", "(Lo/getInstanceParameter;)V", "read", "()V", "IconCompatParcelizer", "(Lo/SampleVideos;)Ljava/lang/Object;", "write", "Lo/accessgetStaticJsonKeyGetter;", "Lo/KotlinDeserializers;", "(Lo/accessgetStaticJsonKeyGetter;Lo/KotlinDeserializers;Lo/SampleVideos;)Ljava/lang/Object;", "Lo/KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2$RemoteActionCompatParcelizer;", "(Lo/accessgetStaticJsonKeyGetter;Ljava/lang/Object;)Lo/KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2$RemoteActionCompatParcelizer;", "Lo/KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2$IconCompatParcelizer;", "", "(Lo/accessgetStaticJsonKeyGetter;Ljava/lang/Object;Lo/KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2$IconCompatParcelizer;)Ljava/lang/String;", "(Lo/accessgetStaticJsonKeyGetter;Lo/getInstanceParameter;Lo/SampleVideos;)Ljava/lang/Object;", "", "AudioAttributesCompatParcelizer", "(Lo/NewNumberOtpResendRequest;Lo/accessgetStaticJsonKeyGetter;Lo/SampleVideos;)Ljava/lang/Object;", "Lo/KotlinNamesAnnotationIntrospector;", "(Lo/KotlinNamesAnnotationIntrospector;Lo/accessgetStaticJsonKeyGetter;II)Ljava/lang/Object;", "Lo/KotlinKeySerializersKt$write;", "(Lo/KotlinNamesAnnotationIntrospector;Lo/accessgetStaticJsonKeyGetter;Lo/KotlinKeySerializersKt$write;Lo/SampleVideos;)Ljava/lang/Object;", "(Lo/KotlinNamesAnnotationIntrospector;Lo/accessgetStaticJsonKeyGetter;Lo/SampleVideos;)Ljava/lang/Object;", "Lo/TopUserCompanion;", "(Lo/TopUserCompanion;)V", "Lo/accessfilterOutSingleStringCallables;", "Lo/objectSingletonInstance;", "Lo/objectSingletonInstance;", "Ljava/lang/Object;", "Lo/getCreatedOnDateMs;", "Lo/fromCursor;", "Lo/KotlinModuleCompanion;", "Lo/fromCursor;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "AudioAttributesImplBaseParcelizer", "Ljava/util/concurrent/atomic/AtomicBoolean;", "MediaBrowserCompatCustomActionResultReceiver", "Lo/isMockTest;", "AudioAttributesImplApi21Parcelizer", "Lo/isMockTest;", "Lo/NewNumberOtpResendRequest;", "()Lo/NewNumberOtpResendRequest;", "AudioAttributesImplApi26Parcelizer", "Lo/KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2;", "()Lo/KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2;", "MediaBrowserCompatItemReceiver", "Lo/accessisPrimaryConstructor;", "RatingCompat", "Lo/KotlinObjectSingletonDeserializer;", "()Lo/KotlinObjectSingletonDeserializer;", "MediaBrowserCompatSearchResultReceiver", "MediaDescriptionCompat", "Lo/KotlinNamesAnnotationIntrospector$IconCompatParcelizer;", "MediaBrowserCompatMediaItem", "Lo/KotlinNamesAnnotationIntrospector$IconCompatParcelizer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class accesshasCreatorAnnotation<Key, Value> {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final objectSingletonInstance RemoteActionCompatParcelizer;
    private final isMockTest AudioAttributesImplApi21Parcelizer;
    private final KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2<Key, Value> AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final AtomicBoolean MediaBrowserCompatCustomActionResultReceiver;
    private final fromCursor<KotlinModuleCompanion<Value>> IconCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final NewNumberOtpResendRequest<KotlinModuleCompanion<Value>> AudioAttributesImplBaseParcelizer;
    private final accessisPrimaryConstructor<Key, Value> MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private final KotlinNamesAnnotationIntrospector.IconCompatParcelizer<Key, Value> RatingCompat;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private final NewNumberOtpResendRequest<getShowPopup> MediaDescriptionCompat;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private final KotlinObjectSingletonDeserializer<Key, Value> MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final Key AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final accessfilterOutSingleStringCallables write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final getCreatedOnDateMs<getShowPopup> read;

    public final /* synthetic */ class AudioAttributesCompatParcelizer {
        public static final /* synthetic */ int[] write;

        static {
            int[] iArr = new int[accessgetStaticJsonKeyGetter.values().length];
            try {
                iArr[accessgetStaticJsonKeyGetter.REFRESH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[accessgetStaticJsonKeyGetter.PREPEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[accessgetStaticJsonKeyGetter.APPEND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            write = iArr;
        }
    }

    static final class AudioAttributesImplApi26Parcelizer extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        /* synthetic */ Object AudioAttributesImplApi26Parcelizer;
        Object IconCompatParcelizer;
        final /* synthetic */ accesshasCreatorAnnotation<Key, Value> MediaBrowserCompatCustomActionResultReceiver;
        int RemoteActionCompatParcelizer;
        Object read;
        Object write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesImplApi26Parcelizer(accesshasCreatorAnnotation<Key, Value> accesshascreatorannotation, SampleVideos<? super AudioAttributesImplApi26Parcelizer> sampleVideos) {
            super(sampleVideos);
            this.MediaBrowserCompatCustomActionResultReceiver = accesshascreatorannotation;
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesImplApi26Parcelizer = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            return this.MediaBrowserCompatCustomActionResultReceiver.write(this);
        }
    }

    static final class MediaBrowserCompatCustomActionResultReceiver extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        Object AudioAttributesImplApi21Parcelizer;
        Object AudioAttributesImplApi26Parcelizer;
        Object AudioAttributesImplBaseParcelizer;
        int IconCompatParcelizer;
        Object MediaBrowserCompatCustomActionResultReceiver;
        Object MediaBrowserCompatItemReceiver;
        Object MediaBrowserCompatMediaItem;
        /* synthetic */ Object MediaBrowserCompatSearchResultReceiver;
        Object MediaDescriptionCompat;
        int MediaMetadataCompat;
        Object RatingCompat;
        Object RemoteActionCompatParcelizer;
        final /* synthetic */ accesshasCreatorAnnotation<Key, Value> onAddQueueItem;
        int read;
        Object write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        MediaBrowserCompatCustomActionResultReceiver(accesshasCreatorAnnotation<Key, Value> accesshascreatorannotation, SampleVideos<? super MediaBrowserCompatCustomActionResultReceiver> sampleVideos) {
            super(sampleVideos);
            this.onAddQueueItem = accesshascreatorannotation;
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.MediaBrowserCompatSearchResultReceiver = obj;
            this.MediaMetadataCompat |= Integer.MIN_VALUE;
            return this.onAddQueueItem.write(null, null, this);
        }
    }

    static final class RemoteActionCompatParcelizer extends getTotalMcq {
        /* synthetic */ Object AudioAttributesCompatParcelizer;
        Object IconCompatParcelizer;
        final /* synthetic */ accesshasCreatorAnnotation<Key, Value> MediaBrowserCompatCustomActionResultReceiver;
        Object RemoteActionCompatParcelizer;
        Object read;
        int write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        RemoteActionCompatParcelizer(accesshasCreatorAnnotation<Key, Value> accesshascreatorannotation, SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(sampleVideos);
            this.MediaBrowserCompatCustomActionResultReceiver = accesshascreatorannotation;
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesCompatParcelizer = obj;
            this.write |= Integer.MIN_VALUE;
            return this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(this);
        }
    }

    public static final class IconCompatParcelizer implements NewNumberOtpResendRequest<KotlinDeserializers> {
        final /* synthetic */ NewNumberOtpResendRequest IconCompatParcelizer;
        final /* synthetic */ int write;

        /* JADX INFO: renamed from: o.accesshasCreatorAnnotation$IconCompatParcelizer$4, reason: invalid class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "p0", "", "IconCompatParcelizer", "(Ljava/lang/Object;Lo/SampleVideos;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class AnonymousClass4<T> implements getValidationToken {
            final /* synthetic */ int $IconCompatParcelizer;
            final /* synthetic */ getValidationToken $write;

            /* JADX INFO: renamed from: o.accesshasCreatorAnnotation$IconCompatParcelizer$4$5, reason: invalid class name */
            public static final class AnonymousClass5 extends getTotalMcq {
                /* synthetic */ Object read;
                int write;

                public AnonymousClass5(SampleVideos sampleVideos) {
                    super(sampleVideos);
                }

                @Override // kotlin.getMonthName
                public final Object invokeSuspend(Object obj) {
                    this.read = obj;
                    this.write |= Integer.MIN_VALUE;
                    return AnonymousClass4.this.IconCompatParcelizer(null, this);
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
            @Override // kotlin.getValidationToken
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object IconCompatParcelizer(java.lang.Object r5, kotlin.SampleVideos r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof o.accesshasCreatorAnnotation.IconCompatParcelizer.AnonymousClass4.AnonymousClass5
                    if (r0 == 0) goto L14
                    r0 = r6
                    o.accesshasCreatorAnnotation$IconCompatParcelizer$4$5 r0 = (o.accesshasCreatorAnnotation.IconCompatParcelizer.AnonymousClass4.AnonymousClass5) r0
                    int r1 = r0.write
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r1 = r1 & r2
                    if (r1 == 0) goto L14
                    int r6 = r0.write
                    int r6 = r6 + r2
                    r0.write = r6
                    goto L19
                L14:
                    o.accesshasCreatorAnnotation$IconCompatParcelizer$4$5 r0 = new o.accesshasCreatorAnnotation$IconCompatParcelizer$4$5
                    r0.<init>(r6)
                L19:
                    java.lang.Object r6 = r0.read
                    java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
                    int r2 = r0.write
                    r3 = 1
                    if (r2 == 0) goto L32
                    if (r2 != r3) goto L2a
                    kotlin.SdkPayloadData.IconCompatParcelizer(r6)
                    goto L4c
                L2a:
                    java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                    java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                    r4.<init>(r5)
                    throw r4
                L32:
                    kotlin.SdkPayloadData.IconCompatParcelizer(r6)
                    o.getValidationToken r6 = r4.$write
                    r2 = r0
                    o.SampleVideos r2 = (kotlin.SampleVideos) r2
                    o.getInstanceParameter r5 = (kotlin.getInstanceParameter) r5
                    o.KotlinDeserializers r2 = new o.KotlinDeserializers
                    int r4 = r4.$IconCompatParcelizer
                    r2.<init>(r4, r5)
                    r0.write = r3
                    java.lang.Object r4 = r6.IconCompatParcelizer(r2, r0)
                    if (r4 != r1) goto L4c
                    return r1
                L4c:
                    o.getShowPopup r4 = kotlin.getShowPopup.INSTANCE
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: o.accesshasCreatorAnnotation.IconCompatParcelizer.AnonymousClass4.IconCompatParcelizer(java.lang.Object, o.SampleVideos):java.lang.Object");
            }

            public AnonymousClass4(getValidationToken getvalidationtoken, int i) {
                this.$write = getvalidationtoken;
                this.$IconCompatParcelizer = i;
            }
        }

        public IconCompatParcelizer(NewNumberOtpResendRequest newNumberOtpResendRequest, int i) {
            this.IconCompatParcelizer = newNumberOtpResendRequest;
            this.write = i;
        }

        @Override // kotlin.NewNumberOtpResendRequest
        public final Object write(getValidationToken<? super KotlinDeserializers> getvalidationtoken, SampleVideos sampleVideos) {
            Object objWrite = this.IconCompatParcelizer.write(new AnonymousClass4(getvalidationtoken, this.write), sampleVideos);
            return objWrite == getYear.IconCompatParcelizer() ? objWrite : getShowPopup.INSTANCE;
        }
    }

    public accesshasCreatorAnnotation(Key key, KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2<Key, Value> kotlinNamesAnnotationIntrospectorhasCreatorAnnotation2, accessfilterOutSingleStringCallables accessfilteroutsinglestringcallables, NewNumberOtpResendRequest<getShowPopup> newNumberOtpResendRequest, KotlinObjectSingletonDeserializer<Key, Value> kotlinObjectSingletonDeserializer, accessisPrimaryConstructor<Key, Value> accessisprimaryconstructor, getCreatedOnDateMs<getShowPopup> getcreatedondatems) {
        toMagicModuleMetaRepoModel.write(kotlinNamesAnnotationIntrospectorhasCreatorAnnotation2, "");
        toMagicModuleMetaRepoModel.write(accessfilteroutsinglestringcallables, "");
        toMagicModuleMetaRepoModel.write(newNumberOtpResendRequest, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        this.AudioAttributesCompatParcelizer = key;
        this.AudioAttributesImplApi26Parcelizer = kotlinNamesAnnotationIntrospectorhasCreatorAnnotation2;
        this.write = accessfilteroutsinglestringcallables;
        this.MediaDescriptionCompat = newNumberOtpResendRequest;
        this.MediaBrowserCompatSearchResultReceiver = kotlinObjectSingletonDeserializer;
        this.MediaBrowserCompatItemReceiver = accessisprimaryconstructor;
        this.read = getcreatedondatems;
        if (accessfilteroutsinglestringcallables.IconCompatParcelizer != Integer.MIN_VALUE && !kotlinNamesAnnotationIntrospectorhasCreatorAnnotation2.read()) {
            throw new IllegalArgumentException("PagingConfig.jumpThreshold was set, but the associated PagingSource has not marked support for jumps by overriding PagingSource.jumpingSupported to true.".toString());
        }
        this.RemoteActionCompatParcelizer = new objectSingletonInstance();
        this.MediaBrowserCompatCustomActionResultReceiver = new AtomicBoolean(false);
        this.IconCompatParcelizer = getLastName.read(-2, null, 6);
        this.RatingCompat = new KotlinNamesAnnotationIntrospector.IconCompatParcelizer<>(accessfilteroutsinglestringcallables);
        isMockTest ismocktestRemoteActionCompatParcelizer = getUserConfig.RemoteActionCompatParcelizer((setPassingYear) null);
        this.AudioAttributesImplApi21Parcelizer = ismocktestRemoteActionCompatParcelizer;
        this.AudioAttributesImplBaseParcelizer = VerifyNewNumberRequest.read(isRequiredByNullability.AudioAttributesCompatParcelizer(ismocktestRemoteActionCompatParcelizer, new MediaBrowserCompatItemReceiver(this, null)), new AudioAttributesImplBaseParcelizer(this, null));
    }

    public final KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2<Key, Value> RemoteActionCompatParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final KotlinObjectSingletonDeserializer<Key, Value> IconCompatParcelizer() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    public final NewNumberOtpResendRequest<KotlinModuleCompanion<Value>> AudioAttributesCompatParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    static final class MediaBrowserCompatItemReceiver extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<KotlinObjectSingletonDeserializerKt<KotlinModuleCompanion<Value>>, SampleVideos<? super getShowPopup>, Object> {
        private Object AudioAttributesCompatParcelizer;
        private int AudioAttributesImplApi26Parcelizer;
        final /* synthetic */ accesshasCreatorAnnotation<Key, Value> IconCompatParcelizer;
        private Object RemoteActionCompatParcelizer;
        private Object read;
        private /* synthetic */ Object write;

        /* JADX WARN: Removed duplicated region for block: B:29:0x00dd  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00fa  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0110  */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                Method dump skipped, instruction units count: 300
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.accesshasCreatorAnnotation.MediaBrowserCompatItemReceiver.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: renamed from: o.accesshasCreatorAnnotation$MediaBrowserCompatItemReceiver$3, reason: invalid class name */
        static final class AnonymousClass3 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
            private int IconCompatParcelizer;
            final /* synthetic */ accesshasCreatorAnnotation<Key, Value> RemoteActionCompatParcelizer;
            final /* synthetic */ KotlinObjectSingletonDeserializerKt<KotlinModuleCompanion<Value>> read;

            /* JADX INFO: renamed from: o.accesshasCreatorAnnotation$MediaBrowserCompatItemReceiver$3$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Key", "Value", "Lo/KotlinModuleCompanion;", "p0", "", "read", "(Lo/KotlinModuleCompanion;Lo/SampleVideos;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
            static final class AnonymousClass2<T> implements getValidationToken {
                final /* synthetic */ KotlinObjectSingletonDeserializerKt<KotlinModuleCompanion<Value>> $RemoteActionCompatParcelizer;

                /* JADX INFO: renamed from: o.accesshasCreatorAnnotation$MediaBrowserCompatItemReceiver$3$2$write */
                static final class write extends getTotalMcq {
                    /* synthetic */ Object AudioAttributesCompatParcelizer;
                    final /* synthetic */ AnonymousClass2<T> IconCompatParcelizer;
                    int read;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    write(AnonymousClass2<? super T> anonymousClass2, SampleVideos<? super write> sampleVideos) {
                        super(sampleVideos);
                        this.IconCompatParcelizer = anonymousClass2;
                    }

                    @Override // kotlin.getMonthName
                    public final Object invokeSuspend(Object obj) {
                        this.AudioAttributesCompatParcelizer = obj;
                        this.read |= Integer.MIN_VALUE;
                        return this.IconCompatParcelizer.IconCompatParcelizer(null, this);
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
                @Override // kotlin.getValidationToken
                /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object IconCompatParcelizer(kotlin.KotlinModuleCompanion<Value> r5, kotlin.SampleVideos<? super kotlin.getShowPopup> r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof o.accesshasCreatorAnnotation.MediaBrowserCompatItemReceiver.AnonymousClass3.AnonymousClass2.write
                        if (r0 == 0) goto L14
                        r0 = r6
                        o.accesshasCreatorAnnotation$MediaBrowserCompatItemReceiver$3$2$write r0 = (o.accesshasCreatorAnnotation.MediaBrowserCompatItemReceiver.AnonymousClass3.AnonymousClass2.write) r0
                        int r1 = r0.read
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r1 = r1 & r2
                        if (r1 == 0) goto L14
                        int r6 = r0.read
                        int r6 = r6 + r2
                        r0.read = r6
                        goto L19
                    L14:
                        o.accesshasCreatorAnnotation$MediaBrowserCompatItemReceiver$3$2$write r0 = new o.accesshasCreatorAnnotation$MediaBrowserCompatItemReceiver$3$2$write
                        r0.<init>(r4, r6)
                    L19:
                        java.lang.Object r6 = r0.AudioAttributesCompatParcelizer
                        java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
                        int r2 = r0.read
                        r3 = 1
                        if (r2 == 0) goto L32
                        if (r2 != r3) goto L2a
                        kotlin.SdkPayloadData.IconCompatParcelizer(r6)     // Catch: kotlin.isPhoneNumberNull -> L40
                        goto L40
                    L2a:
                        java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                        java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                        r4.<init>(r5)
                        throw r4
                    L32:
                        kotlin.SdkPayloadData.IconCompatParcelizer(r6)
                        o.KotlinObjectSingletonDeserializerKt<o.KotlinModuleCompanion<Value>> r4 = r4.$RemoteActionCompatParcelizer     // Catch: kotlin.isPhoneNumberNull -> L40
                        r0.read = r3     // Catch: kotlin.isPhoneNumberNull -> L40
                        java.lang.Object r4 = r4.RemoteActionCompatParcelizer(r5, r0)     // Catch: kotlin.isPhoneNumberNull -> L40
                        if (r4 != r1) goto L40
                        return r1
                    L40:
                        o.getShowPopup r4 = kotlin.getShowPopup.INSTANCE
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.accesshasCreatorAnnotation.MediaBrowserCompatItemReceiver.AnonymousClass3.AnonymousClass2.IconCompatParcelizer(o.KotlinModuleCompanion, o.SampleVideos):java.lang.Object");
                }

                AnonymousClass2(KotlinObjectSingletonDeserializerKt<KotlinModuleCompanion<Value>> kotlinObjectSingletonDeserializerKt) {
                    this.$RemoteActionCompatParcelizer = kotlinObjectSingletonDeserializerKt;
                }
            }

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                int i = this.IconCompatParcelizer;
                if (i == 0) {
                    SdkPayloadData.IconCompatParcelizer(obj);
                    this.IconCompatParcelizer = 1;
                    if (VerifyNewNumberRequest.IconCompatParcelizer(((accesshasCreatorAnnotation) this.RemoteActionCompatParcelizer).IconCompatParcelizer).write(new AnonymousClass2(this.read), this) == objIconCompatParcelizer) {
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
            AnonymousClass3(accesshasCreatorAnnotation<Key, Value> accesshascreatorannotation, KotlinObjectSingletonDeserializerKt<KotlinModuleCompanion<Value>> kotlinObjectSingletonDeserializerKt, SampleVideos<? super AnonymousClass3> sampleVideos) {
                super(2, sampleVideos);
                this.RemoteActionCompatParcelizer = accesshascreatorannotation;
                this.read = kotlinObjectSingletonDeserializerKt;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                return new AnonymousClass3(this.RemoteActionCompatParcelizer, this.read, sampleVideos);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((AnonymousClass3) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        /* JADX INFO: renamed from: o.accesshasCreatorAnnotation$MediaBrowserCompatItemReceiver$5, reason: invalid class name */
        static final class AnonymousClass5 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
            private int RemoteActionCompatParcelizer;
            final /* synthetic */ fromCursor<getShowPopup> read;
            final /* synthetic */ accesshasCreatorAnnotation<Key, Value> write;

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                int i = this.RemoteActionCompatParcelizer;
                if (i == 0) {
                    SdkPayloadData.IconCompatParcelizer(obj);
                    NewNumberOtpResendRequest newNumberOtpResendRequest = ((accesshasCreatorAnnotation) this.write).MediaDescriptionCompat;
                    final fromCursor<getShowPopup> fromcursor = this.read;
                    this.RemoteActionCompatParcelizer = 1;
                    if (newNumberOtpResendRequest.write(new getValidationToken() { // from class: o.accesshasCreatorAnnotation.MediaBrowserCompatItemReceiver.5.4
                        @Override // kotlin.getValidationToken
                        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
                        public final Object IconCompatParcelizer(getShowPopup getshowpopup, SampleVideos<? super getShowPopup> sampleVideos) {
                            fromcursor.read(getshowpopup);
                            return getShowPopup.INSTANCE;
                        }
                    }, this) == objIconCompatParcelizer) {
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
            AnonymousClass5(accesshasCreatorAnnotation<Key, Value> accesshascreatorannotation, fromCursor<getShowPopup> fromcursor, SampleVideos<? super AnonymousClass5> sampleVideos) {
                super(2, sampleVideos);
                this.write = accesshascreatorannotation;
                this.read = fromcursor;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                return new AnonymousClass5(this.write, this.read, sampleVideos);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((AnonymousClass5) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        /* JADX INFO: renamed from: o.accesshasCreatorAnnotation$MediaBrowserCompatItemReceiver$4, reason: invalid class name */
        static final class AnonymousClass4 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
            final /* synthetic */ accesshasCreatorAnnotation<Key, Value> AudioAttributesCompatParcelizer;
            final /* synthetic */ fromCursor<getShowPopup> IconCompatParcelizer;
            private /* synthetic */ Object RemoteActionCompatParcelizer;
            private int write;

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                int i = this.write;
                if (i == 0) {
                    SdkPayloadData.IconCompatParcelizer(obj);
                    TopUserCompanion topUserCompanion = (TopUserCompanion) this.RemoteActionCompatParcelizer;
                    this.write = 1;
                    if (VerifyNewNumberRequest.IconCompatParcelizer(this.IconCompatParcelizer).write(new AnonymousClass2(this.AudioAttributesCompatParcelizer, topUserCompanion), this) == objIconCompatParcelizer) {
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

            /* JADX INFO: renamed from: o.accesshasCreatorAnnotation$MediaBrowserCompatItemReceiver$4$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Key", "Value", "", "p0", "AudioAttributesCompatParcelizer", "(Lo/getShowPopup;Lo/SampleVideos;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
            static final class AnonymousClass2<T> implements getValidationToken {
                final /* synthetic */ TopUserCompanion $read;
                final /* synthetic */ accesshasCreatorAnnotation<Key, Value> RemoteActionCompatParcelizer;

                /* JADX INFO: renamed from: o.accesshasCreatorAnnotation$MediaBrowserCompatItemReceiver$4$2$IconCompatParcelizer */
                public final /* synthetic */ class IconCompatParcelizer {
                    public static final /* synthetic */ int[] AudioAttributesCompatParcelizer;

                    static {
                        int[] iArr = new int[accessgetStaticJsonKeyGetter.values().length];
                        try {
                            iArr[accessgetStaticJsonKeyGetter.REFRESH.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        AudioAttributesCompatParcelizer = iArr;
                    }
                }

                /* JADX INFO: renamed from: o.accesshasCreatorAnnotation$MediaBrowserCompatItemReceiver$4$2$RemoteActionCompatParcelizer */
                static final class RemoteActionCompatParcelizer extends getTotalMcq {
                    Object AudioAttributesCompatParcelizer;
                    Object AudioAttributesImplApi21Parcelizer;
                    Object AudioAttributesImplApi26Parcelizer;
                    int AudioAttributesImplBaseParcelizer;
                    Object IconCompatParcelizer;
                    Object MediaBrowserCompatCustomActionResultReceiver;
                    /* synthetic */ Object MediaBrowserCompatItemReceiver;
                    final /* synthetic */ AnonymousClass2<T> RatingCompat;
                    Object RemoteActionCompatParcelizer;
                    Object read;
                    Object write;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    RemoteActionCompatParcelizer(AnonymousClass2<? super T> anonymousClass2, SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
                        super(sampleVideos);
                        this.RatingCompat = anonymousClass2;
                    }

                    @Override // kotlin.getMonthName
                    public final Object invokeSuspend(Object obj) {
                        this.MediaBrowserCompatItemReceiver = obj;
                        this.AudioAttributesImplBaseParcelizer |= Integer.MIN_VALUE;
                        return this.RatingCompat.IconCompatParcelizer(null, this);
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:119:0x0429, code lost:
                
                    if (r12.RemoteActionCompatParcelizer(null, r13) != r0) goto L180;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:77:0x031b, code lost:
                
                    if (r12.RemoteActionCompatParcelizer(null, r13) != r0) goto L184;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:107:0x03af  */
                /* JADX WARN: Removed duplicated region for block: B:108:0x03b3  */
                /* JADX WARN: Removed duplicated region for block: B:115:0x0407  */
                /* JADX WARN: Removed duplicated region for block: B:118:0x040f  */
                /* JADX WARN: Removed duplicated region for block: B:131:0x0452 A[PHI: r1 r12 r14
                  0x0452: PHI (r1v56 o.TopUserCompanion) = (r1v30 o.TopUserCompanion), (r1v59 o.TopUserCompanion) binds: [B:90:0x034c, B:127:0x0449] A[DONT_GENERATE, DONT_INLINE]
                  0x0452: PHI (r12v58 o.KotlinKeySerializers) = (r12v31 o.KotlinKeySerializers), (r12v65 o.KotlinKeySerializers) binds: [B:90:0x034c, B:127:0x0449] A[DONT_GENERATE, DONT_INLINE]
                  0x0452: PHI (r14v52 o.accesshasCreatorAnnotation<Key, Value>) = (r14v29 o.accesshasCreatorAnnotation<Key, Value>), (r14v53 o.accesshasCreatorAnnotation<Key, Value>) binds: [B:90:0x034c, B:127:0x0449] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:133:0x045c  */
                /* JADX WARN: Removed duplicated region for block: B:140:0x0498  */
                /* JADX WARN: Removed duplicated region for block: B:141:0x049a  */
                /* JADX WARN: Removed duplicated region for block: B:149:0x04b6  */
                /* JADX WARN: Removed duplicated region for block: B:150:0x04ba  */
                /* JADX WARN: Removed duplicated region for block: B:157:0x050a  */
                /* JADX WARN: Removed duplicated region for block: B:160:0x0511  */
                /* JADX WARN: Removed duplicated region for block: B:167:0x0544  */
                /* JADX WARN: Removed duplicated region for block: B:46:0x0231  */
                /* JADX WARN: Removed duplicated region for block: B:49:0x0244  */
                /* JADX WARN: Removed duplicated region for block: B:56:0x0284  */
                /* JADX WARN: Removed duplicated region for block: B:57:0x0286  */
                /* JADX WARN: Removed duplicated region for block: B:65:0x02a4  */
                /* JADX WARN: Removed duplicated region for block: B:66:0x02a8  */
                /* JADX WARN: Removed duplicated region for block: B:73:0x02fa  */
                /* JADX WARN: Removed duplicated region for block: B:76:0x0302  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
                /* JADX WARN: Removed duplicated region for block: B:89:0x0344 A[PHI: r1 r12 r14
                  0x0344: PHI (r1v30 o.TopUserCompanion) = (r1v7 o.TopUserCompanion), (r1v33 o.TopUserCompanion) binds: [B:48:0x0242, B:85:0x033b] A[DONT_GENERATE, DONT_INLINE]
                  0x0344: PHI (r12v31 o.KotlinKeySerializers) = (r12v7 o.KotlinKeySerializers), (r12v34 o.KotlinKeySerializers) binds: [B:48:0x0242, B:85:0x033b] A[DONT_GENERATE, DONT_INLINE]
                  0x0344: PHI (r14v29 o.accesshasCreatorAnnotation<Key, Value>) = (r14v9 o.accesshasCreatorAnnotation<Key, Value>), (r14v30 o.accesshasCreatorAnnotation<Key, Value>) binds: [B:48:0x0242, B:85:0x033b] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:91:0x034e  */
                /* JADX WARN: Removed duplicated region for block: B:98:0x038f  */
                /* JADX WARN: Removed duplicated region for block: B:99:0x0391  */
                /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, o.accesshasCreatorAnnotation$MediaBrowserCompatItemReceiver$4$2, o.accesshasCreatorAnnotation$MediaBrowserCompatItemReceiver$4$2<T>] */
                /* JADX WARN: Type inference failed for: r12v1, types: [o.setDownloadPercent] */
                /* JADX WARN: Type inference failed for: r12v102 */
                /* JADX WARN: Type inference failed for: r12v103 */
                /* JADX WARN: Type inference failed for: r12v105 */
                /* JADX WARN: Type inference failed for: r12v106 */
                /* JADX WARN: Type inference failed for: r12v108 */
                /* JADX WARN: Type inference failed for: r12v109 */
                /* JADX WARN: Type inference failed for: r12v16, types: [o.setDownloadPercent] */
                /* JADX WARN: Type inference failed for: r12v2, types: [o.setDownloadPercent] */
                /* JADX WARN: Type inference failed for: r12v3, types: [o.setDownloadPercent] */
                /* JADX WARN: Type inference failed for: r12v43, types: [o.setDownloadPercent] */
                /* JADX WARN: Type inference failed for: r12v74, types: [o.setDownloadPercent] */
                /* JADX WARN: Type inference failed for: r5v1 */
                /* JADX WARN: Type inference failed for: r5v2, types: [o.accesshasCreatorAnnotation$MediaBrowserCompatItemReceiver$4$2] */
                /* JADX WARN: Type inference failed for: r5v75 */
                @Override // kotlin.getValidationToken
                /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object IconCompatParcelizer(kotlin.getShowPopup r13, kotlin.SampleVideos<? super kotlin.getShowPopup> r14) {
                    /*
                        Method dump skipped, instruction units count: 1410
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.accesshasCreatorAnnotation.MediaBrowserCompatItemReceiver.AnonymousClass4.AnonymousClass2.IconCompatParcelizer(o.getShowPopup, o.SampleVideos):java.lang.Object");
                }

                AnonymousClass2(accesshasCreatorAnnotation<Key, Value> accesshascreatorannotation, TopUserCompanion topUserCompanion) {
                    this.RemoteActionCompatParcelizer = accesshascreatorannotation;
                    this.$read = topUserCompanion;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(fromCursor<getShowPopup> fromcursor, accesshasCreatorAnnotation<Key, Value> accesshascreatorannotation, SampleVideos<? super AnonymousClass4> sampleVideos) {
                super(2, sampleVideos);
                this.IconCompatParcelizer = fromcursor;
                this.AudioAttributesCompatParcelizer = accesshascreatorannotation;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.IconCompatParcelizer, this.AudioAttributesCompatParcelizer, sampleVideos);
                anonymousClass4.RemoteActionCompatParcelizer = obj;
                return anonymousClass4;
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((AnonymousClass4) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        MediaBrowserCompatItemReceiver(accesshasCreatorAnnotation<Key, Value> accesshascreatorannotation, SampleVideos<? super MediaBrowserCompatItemReceiver> sampleVideos) {
            super(2, sampleVideos);
            this.IconCompatParcelizer = accesshascreatorannotation;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver = new MediaBrowserCompatItemReceiver(this.IconCompatParcelizer, sampleVideos);
            mediaBrowserCompatItemReceiver.write = obj;
            return mediaBrowserCompatItemReceiver;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(KotlinObjectSingletonDeserializerKt<KotlinModuleCompanion<Value>> kotlinObjectSingletonDeserializerKt, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatItemReceiver) create(kotlinObjectSingletonDeserializerKt, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public static final class write extends getMagicModuleStats implements getModuleData<getValidationToken<? super KotlinDeserializers>, Integer, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ Object AudioAttributesCompatParcelizer;
        private Object AudioAttributesImplApi21Parcelizer;
        private int AudioAttributesImplApi26Parcelizer;
        final /* synthetic */ accesshasCreatorAnnotation IconCompatParcelizer;
        private /* synthetic */ Object RemoteActionCompatParcelizer;
        final /* synthetic */ accessgetStaticJsonKeyGetter read;
        private int write;

        /* JADX WARN: Code restructure failed: missing block: B:25:0x00ce, code lost:
        
            if (kotlin.VerifyNewNumberRequest.write(r7, r11, r10) == r0) goto L32;
         */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instruction units count: 218
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.accesshasCreatorAnnotation.write.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public write(SampleVideos sampleVideos, accesshasCreatorAnnotation accesshascreatorannotation, accessgetStaticJsonKeyGetter accessgetstaticjsonkeygetter) {
            super(3, sampleVideos);
            this.IconCompatParcelizer = accesshascreatorannotation;
            this.read = accessgetstaticjsonkeygetter;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getModuleData
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object AudioAttributesCompatParcelizer(getValidationToken<? super KotlinDeserializers> getvalidationtoken, Integer num, SampleVideos<? super getShowPopup> sampleVideos) {
            write writeVar = new write(sampleVideos, this.IconCompatParcelizer, this.read);
            writeVar.RemoteActionCompatParcelizer = getvalidationtoken;
            writeVar.AudioAttributesCompatParcelizer = num;
            return writeVar.invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class AudioAttributesImplBaseParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<getValidationToken<? super KotlinModuleCompanion<Value>>, SampleVideos<? super getShowPopup>, Object> {
        private Object AudioAttributesCompatParcelizer;
        private Object IconCompatParcelizer;
        private /* synthetic */ Object RemoteActionCompatParcelizer;
        private int read;
        final /* synthetic */ accesshasCreatorAnnotation<Key, Value> write;

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0072, code lost:
        
            if (r1.IconCompatParcelizer(new o.KotlinModuleCompanion.write(r8, null, 2, null), r7) == r0) goto L22;
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
                int r1 = r7.read
                r2 = 1
                r3 = 2
                r4 = 0
                if (r1 == 0) goto L2b
                if (r1 == r2) goto L1b
                if (r1 != r3) goto L13
                kotlin.SdkPayloadData.IconCompatParcelizer(r8)
                goto L75
            L13:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L1b:
                java.lang.Object r1 = r7.AudioAttributesCompatParcelizer
                o.getValidationToken r1 = (kotlin.getValidationToken) r1
                java.lang.Object r2 = r7.IconCompatParcelizer
                o.setDownloadPercent r2 = (kotlin.setDownloadPercent) r2
                java.lang.Object r5 = r7.RemoteActionCompatParcelizer
                o.KotlinNamesAnnotationIntrospector$IconCompatParcelizer r5 = (o.KotlinNamesAnnotationIntrospector.IconCompatParcelizer) r5
                kotlin.SdkPayloadData.IconCompatParcelizer(r8)
                goto L4f
            L2b:
                kotlin.SdkPayloadData.IconCompatParcelizer(r8)
                java.lang.Object r8 = r7.RemoteActionCompatParcelizer
                r1 = r8
                o.getValidationToken r1 = (kotlin.getValidationToken) r1
                o.accesshasCreatorAnnotation<Key, Value> r8 = r7.write
                o.KotlinNamesAnnotationIntrospector$IconCompatParcelizer r5 = kotlin.accesshasCreatorAnnotation.AudioAttributesImplBaseParcelizer(r8)
                o.setDownloadPercent r8 = o.KotlinNamesAnnotationIntrospector.IconCompatParcelizer.AudioAttributesCompatParcelizer(r5)
                r6 = r7
                o.SampleVideos r6 = (kotlin.SampleVideos) r6
                r7.RemoteActionCompatParcelizer = r5
                r7.IconCompatParcelizer = r8
                r7.AudioAttributesCompatParcelizer = r1
                r7.read = r2
                java.lang.Object r2 = r8.RemoteActionCompatParcelizer(r4, r6)
                if (r2 == r0) goto L7d
                r2 = r8
            L4f:
                o.KotlinNamesAnnotationIntrospector r8 = o.KotlinNamesAnnotationIntrospector.IconCompatParcelizer.RemoteActionCompatParcelizer(r5)     // Catch: java.lang.Throwable -> L78
                o.setupModuleaddMixIn r8 = r8.getMediaDescriptionCompat()     // Catch: java.lang.Throwable -> L78
                o.KotlinKeySerializers r8 = r8.write()     // Catch: java.lang.Throwable -> L78
                r2.write(r4)
                o.KotlinModuleCompanion$write r2 = new o.KotlinModuleCompanion$write
                r2.<init>(r8, r4, r3, r4)
                r8 = r7
                o.SampleVideos r8 = (kotlin.SampleVideos) r8
                r7.RemoteActionCompatParcelizer = r4
                r7.IconCompatParcelizer = r4
                r7.AudioAttributesCompatParcelizer = r4
                r7.read = r3
                java.lang.Object r7 = r1.IconCompatParcelizer(r2, r8)
                if (r7 != r0) goto L75
                goto L7d
            L75:
                o.getShowPopup r7 = kotlin.getShowPopup.INSTANCE
                return r7
            L78:
                r7 = move-exception
                r2.write(r4)
                throw r7
            L7d:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.accesshasCreatorAnnotation.AudioAttributesImplBaseParcelizer.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesImplBaseParcelizer(accesshasCreatorAnnotation<Key, Value> accesshascreatorannotation, SampleVideos<? super AudioAttributesImplBaseParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.write = accesshascreatorannotation;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer = new AudioAttributesImplBaseParcelizer(this.write, sampleVideos);
            audioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer = obj;
            return audioAttributesImplBaseParcelizer;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(getValidationToken<? super KotlinModuleCompanion<Value>> getvalidationtoken, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplBaseParcelizer) create(getvalidationtoken, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object read(accessgetStaticJsonKeyGetter accessgetstaticjsonkeygetter, getInstanceParameter getinstanceparameter, SampleVideos<? super getShowPopup> sampleVideos) throws Throwable {
        if (AudioAttributesCompatParcelizer.write[accessgetstaticjsonkeygetter.ordinal()] == 1) {
            Object objWrite = write(sampleVideos);
            return objWrite == getYear.IconCompatParcelizer() ? objWrite : getShowPopup.INSTANCE;
        }
        if (getinstanceparameter == null) {
            throw new IllegalStateException("Cannot retry APPEND / PREPEND load on PagingSource without ViewportHint".toString());
        }
        this.RemoteActionCompatParcelizer.read(accessgetstaticjsonkeygetter, getinstanceparameter);
        return getShowPopup.INSTANCE;
    }

    public final void RemoteActionCompatParcelizer(getInstanceParameter p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.RemoteActionCompatParcelizer.read(p0);
    }

    public final void read() {
        this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer((CancellationException) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object IconCompatParcelizer(kotlin.SampleVideos<? super kotlin.accessisPrimaryConstructor<Key, Value>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof o.accesshasCreatorAnnotation.RemoteActionCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r6
            o.accesshasCreatorAnnotation$RemoteActionCompatParcelizer r0 = (o.accesshasCreatorAnnotation.RemoteActionCompatParcelizer) r0
            int r1 = r0.write
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r6 = r0.write
            int r6 = r6 + r2
            r0.write = r6
            goto L19
        L14:
            o.accesshasCreatorAnnotation$RemoteActionCompatParcelizer r0 = new o.accesshasCreatorAnnotation$RemoteActionCompatParcelizer
            r0.<init>(r5, r6)
        L19:
            java.lang.Object r6 = r0.AudioAttributesCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.write
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L41
            if (r2 != r3) goto L39
            java.lang.Object r5 = r0.read
            o.setDownloadPercent r5 = (kotlin.setDownloadPercent) r5
            java.lang.Object r1 = r0.IconCompatParcelizer
            o.KotlinNamesAnnotationIntrospector$IconCompatParcelizer r1 = (o.KotlinNamesAnnotationIntrospector.IconCompatParcelizer) r1
            java.lang.Object r0 = r0.RemoteActionCompatParcelizer
            o.accesshasCreatorAnnotation r0 = (kotlin.accesshasCreatorAnnotation) r0
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)
            r2 = r5
            r5 = r0
            goto L5a
        L39:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L41:
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)
            o.KotlinNamesAnnotationIntrospector$IconCompatParcelizer<Key, Value> r6 = r5.RatingCompat
            o.setDownloadPercent r2 = o.KotlinNamesAnnotationIntrospector.IconCompatParcelizer.AudioAttributesCompatParcelizer(r6)
            r0.RemoteActionCompatParcelizer = r5
            r0.IconCompatParcelizer = r6
            r0.read = r2
            r0.write = r3
            java.lang.Object r0 = r2.RemoteActionCompatParcelizer(r4, r0)
            if (r0 != r1) goto L59
            return r1
        L59:
            r1 = r6
        L5a:
            o.KotlinNamesAnnotationIntrospector r6 = o.KotlinNamesAnnotationIntrospector.IconCompatParcelizer.RemoteActionCompatParcelizer(r1)     // Catch: java.lang.Throwable -> L6c
            o.objectSingletonInstance r5 = r5.RemoteActionCompatParcelizer     // Catch: java.lang.Throwable -> L6c
            o.getInstanceParameter$IconCompatParcelizer r5 = r5.RemoteActionCompatParcelizer()     // Catch: java.lang.Throwable -> L6c
            o.accessisPrimaryConstructor r5 = r6.RemoteActionCompatParcelizer(r5)     // Catch: java.lang.Throwable -> L6c
            r2.write(r4)
            return r5
        L6c:
            r5 = move-exception
            r2.write(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.accesshasCreatorAnnotation.IconCompatParcelizer(o.SampleVideos):java.lang.Object");
    }

    static final class AudioAttributesImplApi21Parcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        final /* synthetic */ accesshasCreatorAnnotation<Key, Value> IconCompatParcelizer;
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                NewNumberOtpResendRequest[] newNumberOtpResendRequestArr = {((accesshasCreatorAnnotation) this.IconCompatParcelizer).RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(accessgetStaticJsonKeyGetter.APPEND), ((accesshasCreatorAnnotation) this.IconCompatParcelizer).RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(accessgetStaticJsonKeyGetter.PREPEND)};
                this.write = 1;
                obj = VerifyNewNumberRequest.RemoteActionCompatParcelizer(VerifyNewNumberRequest.AudioAttributesCompatParcelizer(newNumberOtpResendRequestArr), new write(this.IconCompatParcelizer, null), this);
                if (obj == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            getInstanceParameter getinstanceparameter = (getInstanceParameter) obj;
            if (getinstanceparameter != null) {
                accesshasCreatorAnnotation<Key, Value> accesshascreatorannotation = this.IconCompatParcelizer;
                KotlinModule kotlinModuleWrite = getStaticJsonKeyGetter.write();
                if (kotlinModuleWrite != null && kotlinModuleWrite.write(3)) {
                    StringBuilder sb = new StringBuilder("Jump triggered on PagingSource ");
                    sb.append(accesshascreatorannotation.RemoteActionCompatParcelizer());
                    sb.append(" by ");
                    sb.append(getinstanceparameter);
                    kotlinModuleWrite.write(3, sb.toString());
                }
                ((accesshasCreatorAnnotation) this.IconCompatParcelizer).read.invoke();
            }
            return getShowPopup.INSTANCE;
        }

        static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<getInstanceParameter, SampleVideos<? super Boolean>, Object> {
            private /* synthetic */ Object AudioAttributesCompatParcelizer;
            final /* synthetic */ accesshasCreatorAnnotation<Key, Value> IconCompatParcelizer;
            private int RemoteActionCompatParcelizer;

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                getYear.IconCompatParcelizer();
                SdkPayloadData.IconCompatParcelizer(obj);
                getInstanceParameter getinstanceparameter = (getInstanceParameter) this.AudioAttributesCompatParcelizer;
                return QBankStatsResponse.AudioAttributesCompatParcelizer((-getinstanceparameter.getRemoteActionCompatParcelizer()) > ((accesshasCreatorAnnotation) this.IconCompatParcelizer).write.IconCompatParcelizer || (-getinstanceparameter.getWrite()) > ((accesshasCreatorAnnotation) this.IconCompatParcelizer).write.IconCompatParcelizer);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            write(accesshasCreatorAnnotation<Key, Value> accesshascreatorannotation, SampleVideos<? super write> sampleVideos) {
                super(2, sampleVideos);
                this.IconCompatParcelizer = accesshascreatorannotation;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                write writeVar = new write(this.IconCompatParcelizer, sampleVideos);
                writeVar.AudioAttributesCompatParcelizer = obj;
                return writeVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public Object invoke(getInstanceParameter getinstanceparameter, SampleVideos<? super Boolean> sampleVideos) {
                return ((write) create(getinstanceparameter, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesImplApi21Parcelizer(accesshasCreatorAnnotation<Key, Value> accesshascreatorannotation, SampleVideos<? super AudioAttributesImplApi21Parcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.IconCompatParcelizer = accesshascreatorannotation;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new AudioAttributesImplApi21Parcelizer(this.IconCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplApi21Parcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AudioAttributesCompatParcelizer(TopUserCompanion topUserCompanion) {
        if (this.write.IconCompatParcelizer != Integer.MIN_VALUE) {
            C0201setMcqCount.IconCompatParcelizer(topUserCompanion, null, null, new AudioAttributesImplApi21Parcelizer(this, null), 3);
        }
        C0201setMcqCount.IconCompatParcelizer(topUserCompanion, null, null, new MediaDescriptionCompat(this, null), 3);
        C0201setMcqCount.IconCompatParcelizer(topUserCompanion, null, null, new MediaBrowserCompatSearchResultReceiver(this, null), 3);
    }

    static final class MediaDescriptionCompat extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private Object AudioAttributesCompatParcelizer;
        private Object IconCompatParcelizer;
        final /* synthetic */ accesshasCreatorAnnotation<Key, Value> RemoteActionCompatParcelizer;
        private int read;
        private Object write;

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0066, code lost:
        
            if (r1.AudioAttributesCompatParcelizer(r8, kotlin.accessgetStaticJsonKeyGetter.PREPEND, r7) == r0) goto L22;
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
                int r1 = r7.read
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L2b
                if (r1 == r3) goto L1b
                if (r1 != r2) goto L13
                kotlin.SdkPayloadData.IconCompatParcelizer(r8)
                goto L69
            L13:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L1b:
                java.lang.Object r1 = r7.write
                o.accesshasCreatorAnnotation r1 = (kotlin.accesshasCreatorAnnotation) r1
                java.lang.Object r3 = r7.AudioAttributesCompatParcelizer
                o.setDownloadPercent r3 = (kotlin.setDownloadPercent) r3
                java.lang.Object r5 = r7.IconCompatParcelizer
                o.KotlinNamesAnnotationIntrospector$IconCompatParcelizer r5 = (o.KotlinNamesAnnotationIntrospector.IconCompatParcelizer) r5
                kotlin.SdkPayloadData.IconCompatParcelizer(r8)
                goto L4a
            L2b:
                kotlin.SdkPayloadData.IconCompatParcelizer(r8)
                o.accesshasCreatorAnnotation<Key, Value> r1 = r7.RemoteActionCompatParcelizer
                o.KotlinNamesAnnotationIntrospector$IconCompatParcelizer r5 = kotlin.accesshasCreatorAnnotation.AudioAttributesImplBaseParcelizer(r1)
                o.setDownloadPercent r8 = o.KotlinNamesAnnotationIntrospector.IconCompatParcelizer.AudioAttributesCompatParcelizer(r5)
                r6 = r7
                o.SampleVideos r6 = (kotlin.SampleVideos) r6
                r7.IconCompatParcelizer = r5
                r7.AudioAttributesCompatParcelizer = r8
                r7.write = r1
                r7.read = r3
                java.lang.Object r3 = r8.RemoteActionCompatParcelizer(r4, r6)
                if (r3 == r0) goto L71
                r3 = r8
            L4a:
                o.KotlinNamesAnnotationIntrospector r8 = o.KotlinNamesAnnotationIntrospector.IconCompatParcelizer.RemoteActionCompatParcelizer(r5)     // Catch: java.lang.Throwable -> L6c
                o.NewNumberOtpResendRequest r8 = r8.IconCompatParcelizer()     // Catch: java.lang.Throwable -> L6c
                r3.write(r4)
                o.accessgetStaticJsonKeyGetter r3 = kotlin.accessgetStaticJsonKeyGetter.PREPEND
                r5 = r7
                o.SampleVideos r5 = (kotlin.SampleVideos) r5
                r7.IconCompatParcelizer = r4
                r7.AudioAttributesCompatParcelizer = r4
                r7.write = r4
                r7.read = r2
                java.lang.Object r7 = kotlin.accesshasCreatorAnnotation.RemoteActionCompatParcelizer(r1, r8, r3, r5)
                if (r7 != r0) goto L69
                goto L71
            L69:
                o.getShowPopup r7 = kotlin.getShowPopup.INSTANCE
                return r7
            L6c:
                r7 = move-exception
                r3.write(r4)
                throw r7
            L71:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.accesshasCreatorAnnotation.MediaDescriptionCompat.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        MediaDescriptionCompat(accesshasCreatorAnnotation<Key, Value> accesshascreatorannotation, SampleVideos<? super MediaDescriptionCompat> sampleVideos) {
            super(2, sampleVideos);
            this.RemoteActionCompatParcelizer = accesshascreatorannotation;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new MediaDescriptionCompat(this.RemoteActionCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaDescriptionCompat) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class MediaBrowserCompatSearchResultReceiver extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;
        private Object IconCompatParcelizer;
        private Object RemoteActionCompatParcelizer;
        final /* synthetic */ accesshasCreatorAnnotation<Key, Value> read;
        private Object write;

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0066, code lost:
        
            if (r1.AudioAttributesCompatParcelizer(r8, kotlin.accessgetStaticJsonKeyGetter.APPEND, r7) == r0) goto L22;
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
                int r1 = r7.AudioAttributesCompatParcelizer
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L2b
                if (r1 == r3) goto L1b
                if (r1 != r2) goto L13
                kotlin.SdkPayloadData.IconCompatParcelizer(r8)
                goto L69
            L13:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L1b:
                java.lang.Object r1 = r7.RemoteActionCompatParcelizer
                o.accesshasCreatorAnnotation r1 = (kotlin.accesshasCreatorAnnotation) r1
                java.lang.Object r3 = r7.write
                o.setDownloadPercent r3 = (kotlin.setDownloadPercent) r3
                java.lang.Object r5 = r7.IconCompatParcelizer
                o.KotlinNamesAnnotationIntrospector$IconCompatParcelizer r5 = (o.KotlinNamesAnnotationIntrospector.IconCompatParcelizer) r5
                kotlin.SdkPayloadData.IconCompatParcelizer(r8)
                goto L4a
            L2b:
                kotlin.SdkPayloadData.IconCompatParcelizer(r8)
                o.accesshasCreatorAnnotation<Key, Value> r1 = r7.read
                o.KotlinNamesAnnotationIntrospector$IconCompatParcelizer r5 = kotlin.accesshasCreatorAnnotation.AudioAttributesImplBaseParcelizer(r1)
                o.setDownloadPercent r8 = o.KotlinNamesAnnotationIntrospector.IconCompatParcelizer.AudioAttributesCompatParcelizer(r5)
                r6 = r7
                o.SampleVideos r6 = (kotlin.SampleVideos) r6
                r7.IconCompatParcelizer = r5
                r7.write = r8
                r7.RemoteActionCompatParcelizer = r1
                r7.AudioAttributesCompatParcelizer = r3
                java.lang.Object r3 = r8.RemoteActionCompatParcelizer(r4, r6)
                if (r3 == r0) goto L71
                r3 = r8
            L4a:
                o.KotlinNamesAnnotationIntrospector r8 = o.KotlinNamesAnnotationIntrospector.IconCompatParcelizer.RemoteActionCompatParcelizer(r5)     // Catch: java.lang.Throwable -> L6c
                o.NewNumberOtpResendRequest r8 = r8.write()     // Catch: java.lang.Throwable -> L6c
                r3.write(r4)
                o.accessgetStaticJsonKeyGetter r3 = kotlin.accessgetStaticJsonKeyGetter.APPEND
                r5 = r7
                o.SampleVideos r5 = (kotlin.SampleVideos) r5
                r7.IconCompatParcelizer = r4
                r7.write = r4
                r7.RemoteActionCompatParcelizer = r4
                r7.AudioAttributesCompatParcelizer = r2
                java.lang.Object r7 = kotlin.accesshasCreatorAnnotation.RemoteActionCompatParcelizer(r1, r8, r3, r5)
                if (r7 != r0) goto L69
                goto L71
            L69:
                o.getShowPopup r7 = kotlin.getShowPopup.INSTANCE
                return r7
            L6c:
                r7 = move-exception
                r3.write(r4)
                throw r7
            L71:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.accesshasCreatorAnnotation.MediaBrowserCompatSearchResultReceiver.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        MediaBrowserCompatSearchResultReceiver(accesshasCreatorAnnotation<Key, Value> accesshascreatorannotation, SampleVideos<? super MediaBrowserCompatSearchResultReceiver> sampleVideos) {
            super(2, sampleVideos);
            this.read = accesshascreatorannotation;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new MediaBrowserCompatSearchResultReceiver(this.read, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatSearchResultReceiver) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class read extends getMagicModuleStats implements getModuleData<KotlinDeserializers, KotlinDeserializers, SampleVideos<? super KotlinDeserializers>, Object> {
        final /* synthetic */ accessgetStaticJsonKeyGetter AudioAttributesCompatParcelizer;
        private int IconCompatParcelizer;
        private /* synthetic */ Object RemoteActionCompatParcelizer;
        private /* synthetic */ Object read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            KotlinDeserializers kotlinDeserializers = (KotlinDeserializers) this.read;
            KotlinDeserializers kotlinDeserializers2 = (KotlinDeserializers) this.RemoteActionCompatParcelizer;
            return isKotlinClass.write(kotlinDeserializers2, kotlinDeserializers, this.AudioAttributesCompatParcelizer) ? kotlinDeserializers2 : kotlinDeserializers;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        read(accessgetStaticJsonKeyGetter accessgetstaticjsonkeygetter, SampleVideos<? super read> sampleVideos) {
            super(3, sampleVideos);
            this.AudioAttributesCompatParcelizer = accessgetstaticjsonkeygetter;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getModuleData
        public Object AudioAttributesCompatParcelizer(KotlinDeserializers kotlinDeserializers, KotlinDeserializers kotlinDeserializers2, SampleVideos<? super KotlinDeserializers> sampleVideos) {
            read readVar = new read(this.AudioAttributesCompatParcelizer, sampleVideos);
            readVar.read = kotlinDeserializers;
            readVar.RemoteActionCompatParcelizer = kotlinDeserializers2;
            return readVar.invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2.RemoteActionCompatParcelizer<Key> RemoteActionCompatParcelizer(accessgetStaticJsonKeyGetter p0, Key p1) {
        KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2.RemoteActionCompatParcelizer.Companion companion = KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2.RemoteActionCompatParcelizer.INSTANCE;
        return KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2.RemoteActionCompatParcelizer.Companion.IconCompatParcelizer(p0, p1, p0 == accessgetStaticJsonKeyGetter.REFRESH ? this.write.AudioAttributesCompatParcelizer : this.write.write, this.write.read);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0188 A[Catch: all -> 0x0290, TryCatch #1 {all -> 0x0290, blocks: (B:52:0x0160, B:54:0x0188, B:55:0x0199, B:57:0x01a2), top: B:139:0x0160 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a2 A[Catch: all -> 0x0290, TRY_LEAVE, TryCatch #1 {all -> 0x0290, blocks: (B:52:0x0160, B:54:0x0188, B:55:0x0199, B:57:0x01a2), top: B:139:0x0160 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0282  */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [o.accesshasCreatorAnnotation] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, o.accesshasCreatorAnnotation, o.accesshasCreatorAnnotation<Key, Value>] */
    /* JADX WARN: Type inference failed for: r13v1, types: [o.setDownloadPercent] */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v18, types: [java.lang.Object, o.accesshasCreatorAnnotation] */
    /* JADX WARN: Type inference failed for: r13v2, types: [o.setDownloadPercent] */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object, o.accesshasCreatorAnnotation] */
    /* JADX WARN: Type inference failed for: r13v38, types: [o.setDownloadPercent] */
    /* JADX WARN: Type inference failed for: r13v52, types: [o.setDownloadPercent] */
    /* JADX WARN: Type inference failed for: r13v62 */
    /* JADX WARN: Type inference failed for: r13v63 */
    /* JADX WARN: Type inference failed for: r13v65 */
    /* JADX WARN: Type inference failed for: r13v66 */
    /* JADX WARN: Type inference failed for: r13v69 */
    /* JADX WARN: Type inference failed for: r13v70 */
    /* JADX WARN: Type inference failed for: r13v71 */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, o.accesshasCreatorAnnotation] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object, o.accesshasCreatorAnnotation] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v10, types: [o.accesshasCreatorAnnotation] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, o.accesshasCreatorAnnotation] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Object, o.accesshasCreatorAnnotation] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object write(kotlin.SampleVideos<? super kotlin.getShowPopup> r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 830
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.accesshasCreatorAnnotation.write(o.SampleVideos):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x06a0, code lost:
    
        if (r5.RemoteActionCompatParcelizer(null, r3) != r4) goto L252;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:197:0x0658, B:200:0x0663], limit reached: 249 */
    /* JADX WARN: Path cross not found for [B:203:0x0668, B:206:0x0672], limit reached: 249 */
    /* JADX WARN: Removed duplicated region for block: B:112:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0560  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x05a3 A[Catch: all -> 0x00bc, TryCatch #3 {all -> 0x00bc, blocks: (B:175:0x0595, B:177:0x05a3, B:180:0x05d2, B:182:0x05de, B:184:0x05f7, B:186:0x0603, B:188:0x060b, B:190:0x0618, B:189:0x0612, B:191:0x061d, B:194:0x064f, B:14:0x0083, B:17:0x00b7), top: B:246:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x05dc  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x05f7 A[Catch: all -> 0x00bc, TryCatch #3 {all -> 0x00bc, blocks: (B:175:0x0595, B:177:0x05a3, B:180:0x05d2, B:182:0x05de, B:184:0x05f7, B:186:0x0603, B:188:0x060b, B:190:0x0618, B:189:0x0612, B:191:0x061d, B:194:0x064f, B:14:0x0083, B:17:0x00b7), top: B:246:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x060b A[Catch: all -> 0x00bc, TryCatch #3 {all -> 0x00bc, blocks: (B:175:0x0595, B:177:0x05a3, B:180:0x05d2, B:182:0x05de, B:184:0x05f7, B:186:0x0603, B:188:0x060b, B:190:0x0618, B:189:0x0612, B:191:0x061d, B:194:0x064f, B:14:0x0083, B:17:0x00b7), top: B:246:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0612 A[Catch: all -> 0x00bc, TryCatch #3 {all -> 0x00bc, blocks: (B:175:0x0595, B:177:0x05a3, B:180:0x05d2, B:182:0x05de, B:184:0x05f7, B:186:0x0603, B:188:0x060b, B:190:0x0618, B:189:0x0612, B:191:0x061d, B:194:0x064f, B:14:0x0083, B:17:0x00b7), top: B:246:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x06e6 A[Catch: all -> 0x06ec, TRY_ENTER, TryCatch #2 {all -> 0x06ec, blocks: (B:43:0x0224, B:49:0x0238, B:51:0x0248, B:52:0x0254, B:54:0x025e, B:56:0x0277, B:65:0x02cc, B:57:0x027a, B:59:0x0292, B:62:0x02b0, B:64:0x02c9, B:233:0x06e6, B:234:0x06eb), top: B:245:0x0224 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0316 A[Catch: all -> 0x06df, TRY_LEAVE, TryCatch #7 {all -> 0x06df, blocks: (B:69:0x02fd, B:71:0x0316), top: B:254:0x02fd }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x03ac  */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v56, types: [java.lang.Object, o.accessgetStaticJsonKeyGetter] */
    /* JADX WARN: Type inference failed for: r0v59 */
    /* JADX WARN: Type inference failed for: r0v60, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v63 */
    /* JADX WARN: Type inference failed for: r0v64 */
    /* JADX WARN: Type inference failed for: r0v71 */
    /* JADX WARN: Type inference failed for: r0v90 */
    /* JADX WARN: Type inference failed for: r10v5, types: [o.getInstanceParameter] */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v22, types: [java.lang.Object, o.accessgetStaticJsonKeyGetter] */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r11v36, types: [java.lang.Object, o.accesshasCreatorAnnotation] */
    /* JADX WARN: Type inference failed for: r11v37 */
    /* JADX WARN: Type inference failed for: r11v38, types: [java.lang.Object, o.accesshasCreatorAnnotation] */
    /* JADX WARN: Type inference failed for: r11v40 */
    /* JADX WARN: Type inference failed for: r11v43, types: [java.lang.Object, o.accessgetStaticJsonKeyGetter] */
    /* JADX WARN: Type inference failed for: r11v45 */
    /* JADX WARN: Type inference failed for: r11v46 */
    /* JADX WARN: Type inference failed for: r11v47 */
    /* JADX WARN: Type inference failed for: r11v48 */
    /* JADX WARN: Type inference failed for: r11v49 */
    /* JADX WARN: Type inference failed for: r11v50 */
    /* JADX WARN: Type inference failed for: r11v51 */
    /* JADX WARN: Type inference failed for: r11v52 */
    /* JADX WARN: Type inference failed for: r11v53 */
    /* JADX WARN: Type inference failed for: r12v12, types: [java.lang.Object, o.accesshasCreatorAnnotation] */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v34, types: [java.lang.Object, o.accesshasCreatorAnnotation] */
    /* JADX WARN: Type inference failed for: r12v37 */
    /* JADX WARN: Type inference failed for: r12v38, types: [java.lang.Object, o.accesshasCreatorAnnotation] */
    /* JADX WARN: Type inference failed for: r12v40, types: [java.lang.Object, o.accesshasCreatorAnnotation] */
    /* JADX WARN: Type inference failed for: r12v41 */
    /* JADX WARN: Type inference failed for: r12v45 */
    /* JADX WARN: Type inference failed for: r12v46 */
    /* JADX WARN: Type inference failed for: r12v47 */
    /* JADX WARN: Type inference failed for: r12v48 */
    /* JADX WARN: Type inference failed for: r12v49 */
    /* JADX WARN: Type inference failed for: r12v50 */
    /* JADX WARN: Type inference failed for: r12v51 */
    /* JADX WARN: Type inference failed for: r12v52 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r13v12, types: [o.getInstanceParameter] */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v27, types: [java.lang.Object, o.accessgetStaticJsonKeyGetter] */
    /* JADX WARN: Type inference failed for: r13v35, types: [java.lang.Enum, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v37, types: [o.accessgetStaticJsonKeyGetter] */
    /* JADX WARN: Type inference failed for: r13v38, types: [java.lang.Enum, java.lang.Object, o.accessgetStaticJsonKeyGetter] */
    /* JADX WARN: Type inference failed for: r13v39 */
    /* JADX WARN: Type inference failed for: r13v51 */
    /* JADX WARN: Type inference failed for: r13v52 */
    /* JADX WARN: Type inference failed for: r13v53 */
    /* JADX WARN: Type inference failed for: r13v54 */
    /* JADX WARN: Type inference failed for: r13v55 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v29 */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [o.setDownloadPercent] */
    /* JADX WARN: Type inference failed for: r1v100 */
    /* JADX WARN: Type inference failed for: r1v101 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Enum, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v39, types: [o.setDownloadPercent] */
    /* JADX WARN: Type inference failed for: r1v47, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v48 */
    /* JADX WARN: Type inference failed for: r1v49, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v54, types: [o.KotlinNamesAnnotationIntrospector] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v94 */
    /* JADX WARN: Type inference failed for: r1v95 */
    /* JADX WARN: Type inference failed for: r1v96 */
    /* JADX WARN: Type inference failed for: r1v97 */
    /* JADX WARN: Type inference failed for: r1v98 */
    /* JADX WARN: Type inference failed for: r1v99 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v12, types: [T] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v25, types: [o.KotlinNamesAnnotationIntrospector] */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v67 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r5v58, types: [java.lang.Object, java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25, types: [o.accesshasCreatorAnnotation] */
    /* JADX WARN: Type inference failed for: r8v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v28, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v34, types: [o.setupModuleaddMixIn] */
    /* JADX WARN: Type inference failed for: r8v37, types: [o.setupModuleaddMixIn] */
    /* JADX WARN: Type inference failed for: r8v45 */
    /* JADX WARN: Type inference failed for: r8v48 */
    /* JADX WARN: Type inference failed for: r8v50 */
    /* JADX WARN: Type inference failed for: r8v53 */
    /* JADX WARN: Type inference failed for: r8v54 */
    /* JADX WARN: Type inference failed for: r8v55 */
    /* JADX WARN: Type inference failed for: r9v40 */
    /* JADX WARN: Type inference failed for: r9v41, types: [java.lang.Object, o.accesshasCreatorAnnotation] */
    /* JADX WARN: Type inference failed for: r9v43 */
    /* JADX WARN: Type inference failed for: r9v54 */
    /* JADX WARN: Type inference failed for: r9v56, types: [o.accesshasCreatorAnnotation] */
    /* JADX WARN: Type inference failed for: r9v59 */
    /* JADX WARN: Type inference failed for: r9v60 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:208:0x0675 -> B:220:0x06c7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:210:0x0679 -> B:220:0x06c7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:212:0x06a0 -> B:252:0x06a3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object write(kotlin.accessgetStaticJsonKeyGetter r18, kotlin.KotlinDeserializers r19, kotlin.SampleVideos<? super kotlin.getShowPopup> r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1818
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.accesshasCreatorAnnotation.write(o.accessgetStaticJsonKeyGetter, o.KotlinDeserializers, o.SampleVideos):java.lang.Object");
    }

    private static String IconCompatParcelizer(accessgetStaticJsonKeyGetter p0, Key p1, KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2.IconCompatParcelizer<Key, Value> p2) {
        if (p2 == null) {
            StringBuilder sb = new StringBuilder("End ");
            sb.append(p0);
            sb.append(" with loadkey ");
            sb.append(p1);
            sb.append(". Load CANCELLED.");
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder("End ");
        sb2.append(p0);
        sb2.append(" with loadKey ");
        sb2.append(p1);
        sb2.append(". Returned ");
        sb2.append(p2);
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object IconCompatParcelizer(KotlinNamesAnnotationIntrospector<Key, Value> kotlinNamesAnnotationIntrospector, accessgetStaticJsonKeyGetter accessgetstaticjsonkeygetter, SampleVideos<? super getShowPopup> sampleVideos) {
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(kotlinNamesAnnotationIntrospector.getMediaDescriptionCompat().AudioAttributesCompatParcelizer(accessgetstaticjsonkeygetter), KotlinKeySerializersKt.IconCompatParcelizer.INSTANCE)) {
            kotlinNamesAnnotationIntrospector.getMediaDescriptionCompat().AudioAttributesCompatParcelizer(accessgetstaticjsonkeygetter, KotlinKeySerializersKt.IconCompatParcelizer.INSTANCE);
            Object objRemoteActionCompatParcelizer = this.IconCompatParcelizer.RemoteActionCompatParcelizer(new KotlinModuleCompanion.write(kotlinNamesAnnotationIntrospector.getMediaDescriptionCompat().write(), null), sampleVideos);
            return objRemoteActionCompatParcelizer == getYear.IconCompatParcelizer() ? objRemoteActionCompatParcelizer : getShowPopup.INSTANCE;
        }
        return getShowPopup.INSTANCE;
    }

    private final Object AudioAttributesCompatParcelizer(KotlinNamesAnnotationIntrospector<Key, Value> kotlinNamesAnnotationIntrospector, accessgetStaticJsonKeyGetter accessgetstaticjsonkeygetter, KotlinKeySerializersKt.write writeVar, SampleVideos<? super getShowPopup> sampleVideos) {
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(kotlinNamesAnnotationIntrospector.getMediaDescriptionCompat().AudioAttributesCompatParcelizer(accessgetstaticjsonkeygetter), writeVar)) {
            kotlinNamesAnnotationIntrospector.getMediaDescriptionCompat().AudioAttributesCompatParcelizer(accessgetstaticjsonkeygetter, writeVar);
            Object objRemoteActionCompatParcelizer = this.IconCompatParcelizer.RemoteActionCompatParcelizer(new KotlinModuleCompanion.write(kotlinNamesAnnotationIntrospector.getMediaDescriptionCompat().write(), null), sampleVideos);
            return objRemoteActionCompatParcelizer == getYear.IconCompatParcelizer() ? objRemoteActionCompatParcelizer : getShowPopup.INSTANCE;
        }
        return getShowPopup.INSTANCE;
    }

    private final Key read(KotlinNamesAnnotationIntrospector<Key, Value> kotlinNamesAnnotationIntrospector, accessgetStaticJsonKeyGetter accessgetstaticjsonkeygetter, int i, int i2) {
        if (i != kotlinNamesAnnotationIntrospector.IconCompatParcelizer(accessgetstaticjsonkeygetter) || (kotlinNamesAnnotationIntrospector.getMediaDescriptionCompat().AudioAttributesCompatParcelizer(accessgetstaticjsonkeygetter) instanceof KotlinKeySerializersKt.write) || i2 >= this.write.AudioAttributesImplApi21Parcelizer) {
            return null;
        }
        if (accessgetstaticjsonkeygetter == accessgetStaticJsonKeyGetter.PREPEND) {
            return (Key) ((KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2.IconCompatParcelizer.write) IntermediateLoginResponseBody.RatingCompat((List) kotlinNamesAnnotationIntrospector.AudioAttributesCompatParcelizer())).AudioAttributesCompatParcelizer();
        }
        return (Key) ((KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2.IconCompatParcelizer.write) IntermediateLoginResponseBody.MediaBrowserCompatMediaItem((List) kotlinNamesAnnotationIntrospector.AudioAttributesCompatParcelizer())).RemoteActionCompatParcelizer();
    }

    private final void write() {
        read();
        this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object AudioAttributesCompatParcelizer(NewNumberOtpResendRequest<Integer> newNumberOtpResendRequest, final accessgetStaticJsonKeyGetter accessgetstaticjsonkeygetter, SampleVideos<? super getShowPopup> sampleVideos) {
        Object objWrite = VerifyNewNumberRequest.write(accessobjectSingletonInstance.RemoteActionCompatParcelizer(accessobjectSingletonInstance.read(newNumberOtpResendRequest, new write(null, this, accessgetstaticjsonkeygetter)), new read(accessgetstaticjsonkeygetter, null))).write(new getValidationToken(this) { // from class: o.accesshasCreatorAnnotation.4
            final /* synthetic */ accesshasCreatorAnnotation<Key, Value> IconCompatParcelizer;

            @Override // kotlin.getValidationToken
            /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
            public final Object IconCompatParcelizer(KotlinDeserializers kotlinDeserializers, SampleVideos<? super getShowPopup> sampleVideos2) throws Throwable {
                Object objWrite2 = this.IconCompatParcelizer.write(accessgetstaticjsonkeygetter, kotlinDeserializers, sampleVideos2);
                return objWrite2 == getYear.IconCompatParcelizer() ? objWrite2 : getShowPopup.INSTANCE;
            }

            {
                this.IconCompatParcelizer = this;
            }
        }, sampleVideos);
        return objWrite == getYear.IconCompatParcelizer() ? objWrite : getShowPopup.INSTANCE;
    }
}
