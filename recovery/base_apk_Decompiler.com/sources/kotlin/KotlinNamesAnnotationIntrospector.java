package kotlin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.KotlinKeySerializersKt;
import kotlin.KotlinModuleCompanion;
import kotlin.KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2;
import kotlin.Metadata;
import kotlin.getInstanceParameter;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\f\u0010\u000bJ%\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e2\b\u0010\u0005\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\n\u001a\u00020\u00122\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0011¢\u0006\u0004\b\n\u0010\u0013J%\u0010\u0017\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00112\u0006\u0010\u0005\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\f\u0010\u0019J1\u0010\u0017\u001a\u00020\u001c2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00142\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001a¢\u0006\u0004\b\u0017\u0010\u001dJ-\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u001e*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001a2\u0006\u0010\u0005\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0017\u0010\u001fR&\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001a0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010!R\u0016\u0010\u0017\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010\u000f\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010#R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010#R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\t0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010%R\u0014\u0010&\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R&\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150(8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b\u0017\u0010+R$\u0010,\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t8\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\b,\u0010#\u001a\u0004\b\u000f\u0010-R,\u00101\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001a0.8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b/\u0010!\u001a\u0004\b\"\u00100R$\u0010/\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t8A@AX\u0080\u000e¢\u0006\f\u001a\u0004\b/\u0010-\"\u0004\b\f\u00102R$\u00103\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t8A@AX\u0080\u000e¢\u0006\f\u001a\u0004\b&\u0010-\"\u0004\b\"\u00102R\u0016\u00104\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b1\u0010#R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\t0$8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b5\u0010%R$\u00105\u001a\u0002072\u0006\u0010\u0005\u001a\u0002078\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b1\u0010:R\u0014\u00108\u001a\u00020\t8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b)\u0010-"}, d2 = {"Lo/KotlinNamesAnnotationIntrospector;", "", "Key", "Value", "Lo/accessfilterOutSingleStringCallables;", "p0", "<init>", "(Lo/accessfilterOutSingleStringCallables;)V", "Lo/NewNumberOtpResendRequest;", "", "write", "()Lo/NewNumberOtpResendRequest;", "IconCompatParcelizer", "Lo/getInstanceParameter$IconCompatParcelizer;", "Lo/accessisPrimaryConstructor;", "RemoteActionCompatParcelizer", "(Lo/getInstanceParameter$IconCompatParcelizer;)Lo/accessisPrimaryConstructor;", "Lo/KotlinModuleCompanion$AudioAttributesCompatParcelizer;", "", "(Lo/KotlinModuleCompanion$AudioAttributesCompatParcelizer;)V", "Lo/accessgetStaticJsonKeyGetter;", "Lo/getInstanceParameter;", "p1", "read", "(Lo/accessgetStaticJsonKeyGetter;Lo/getInstanceParameter;)Lo/KotlinModuleCompanion$AudioAttributesCompatParcelizer;", "(Lo/accessgetStaticJsonKeyGetter;)I", "Lo/KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2$IconCompatParcelizer$write;", "p2", "", "(ILo/accessgetStaticJsonKeyGetter;Lo/KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2$IconCompatParcelizer$write;)Z", "Lo/KotlinModuleCompanion;", "(Lo/KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2$IconCompatParcelizer$write;Lo/accessgetStaticJsonKeyGetter;)Lo/KotlinModuleCompanion;", "", "Ljava/util/List;", "AudioAttributesCompatParcelizer", "I", "Lo/fromCursor;", "Lo/fromCursor;", "AudioAttributesImplBaseParcelizer", "Lo/accessfilterOutSingleStringCallables;", "", "AudioAttributesImplApi26Parcelizer", "Ljava/util/Map;", "()Ljava/util/Map;", "AudioAttributesImplApi21Parcelizer", "()I", "", "MediaBrowserCompatItemReceiver", "()Ljava/util/List;", "MediaBrowserCompatCustomActionResultReceiver", "(I)V", "RatingCompat", "MediaBrowserCompatSearchResultReceiver", "MediaDescriptionCompat", "MediaBrowserCompatMediaItem", "Lo/setupModuleaddMixIn;", "MediaMetadataCompat", "Lo/setupModuleaddMixIn;", "()Lo/setupModuleaddMixIn;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class KotlinNamesAnnotationIntrospector<Key, Value> {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private int read;
    private int AudioAttributesImplApi21Parcelizer;
    private final Map<accessgetStaticJsonKeyGetter, getInstanceParameter> AudioAttributesImplApi26Parcelizer;
    private final accessfilterOutSingleStringCallables AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private int write;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private int MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final List<KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2.IconCompatParcelizer.write<Key, Value>> MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private final fromCursor<Integer> MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private setupModuleaddMixIn MediaDescriptionCompat;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final List<KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2.IconCompatParcelizer.write<Key, Value>> IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private int RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final fromCursor<Integer> AudioAttributesCompatParcelizer;

    public final /* synthetic */ class AudioAttributesCompatParcelizer {
        public static final /* synthetic */ int[] AudioAttributesCompatParcelizer;

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
            AudioAttributesCompatParcelizer = iArr;
        }
    }

    private KotlinNamesAnnotationIntrospector(accessfilterOutSingleStringCallables accessfilteroutsinglestringcallables) {
        this.AudioAttributesImplBaseParcelizer = accessfilteroutsinglestringcallables;
        ArrayList arrayList = new ArrayList();
        this.IconCompatParcelizer = arrayList;
        this.MediaBrowserCompatCustomActionResultReceiver = arrayList;
        this.MediaBrowserCompatMediaItem = getLastName.read(-1, null, 6);
        this.AudioAttributesCompatParcelizer = getLastName.read(-1, null, 6);
        this.AudioAttributesImplApi26Parcelizer = new LinkedHashMap();
        setupModuleaddMixIn setupmoduleaddmixin = new setupModuleaddMixIn();
        setupmoduleaddmixin.AudioAttributesCompatParcelizer(accessgetStaticJsonKeyGetter.REFRESH, KotlinKeySerializersKt.IconCompatParcelizer.INSTANCE);
        this.MediaDescriptionCompat = setupmoduleaddmixin;
    }

    public final List<KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2.IconCompatParcelizer.write<Key, Value>> AudioAttributesCompatParcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final int getAudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    private int AudioAttributesImplApi26Parcelizer() {
        Iterator<T> it = this.MediaBrowserCompatCustomActionResultReceiver.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2.IconCompatParcelizer.write) it.next()).IconCompatParcelizer().size();
        }
        return size;
    }

    private int AudioAttributesImplBaseParcelizer() {
        if (this.AudioAttributesImplBaseParcelizer.read) {
            return this.RemoteActionCompatParcelizer;
        }
        return 0;
    }

    private void AudioAttributesCompatParcelizer(int i) {
        if (i == Integer.MIN_VALUE) {
            i = 0;
        }
        this.RemoteActionCompatParcelizer = i;
    }

    private int MediaBrowserCompatItemReceiver() {
        if (this.AudioAttributesImplBaseParcelizer.read) {
            return this.read;
        }
        return 0;
    }

    private void IconCompatParcelizer(int i) {
        if (i == Integer.MIN_VALUE) {
            i = 0;
        }
        this.read = i;
    }

    public final int IconCompatParcelizer(accessgetStaticJsonKeyGetter p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        int i = AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer[p0.ordinal()];
        if (i == 1) {
            throw new IllegalArgumentException("Cannot get loadId for loadType: REFRESH");
        }
        if (i == 2) {
            return this.MediaBrowserCompatSearchResultReceiver;
        }
        if (i == 3) {
            return this.write;
        }
        throw new RenewEligibleCreator();
    }

    public final Map<accessgetStaticJsonKeyGetter, getInstanceParameter> read() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final setupModuleaddMixIn getMediaDescriptionCompat() {
        return this.MediaDescriptionCompat;
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<getValidationToken<? super Integer>, SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;
        final /* synthetic */ KotlinNamesAnnotationIntrospector<Key, Value> write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            ((KotlinNamesAnnotationIntrospector) this.write).MediaBrowserCompatMediaItem.read(QBankStatsResponse.RemoteActionCompatParcelizer(((KotlinNamesAnnotationIntrospector) this.write).MediaBrowserCompatSearchResultReceiver));
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        RemoteActionCompatParcelizer(KotlinNamesAnnotationIntrospector<Key, Value> kotlinNamesAnnotationIntrospector, SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.write = kotlinNamesAnnotationIntrospector;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new RemoteActionCompatParcelizer(this.write, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(getValidationToken<? super Integer> getvalidationtoken, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(getvalidationtoken, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public final NewNumberOtpResendRequest<Integer> IconCompatParcelizer() {
        return VerifyNewNumberRequest.read(VerifyNewNumberRequest.IconCompatParcelizer(this.MediaBrowserCompatMediaItem), new RemoteActionCompatParcelizer(this, null));
    }

    static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<getValidationToken<? super Integer>, SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;
        final /* synthetic */ KotlinNamesAnnotationIntrospector<Key, Value> RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            ((KotlinNamesAnnotationIntrospector) this.RemoteActionCompatParcelizer).AudioAttributesCompatParcelizer.read(QBankStatsResponse.RemoteActionCompatParcelizer(((KotlinNamesAnnotationIntrospector) this.RemoteActionCompatParcelizer).write));
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        write(KotlinNamesAnnotationIntrospector<Key, Value> kotlinNamesAnnotationIntrospector, SampleVideos<? super write> sampleVideos) {
            super(2, sampleVideos);
            this.RemoteActionCompatParcelizer = kotlinNamesAnnotationIntrospector;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new write(this.RemoteActionCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(getValidationToken<? super Integer> getvalidationtoken, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(getvalidationtoken, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public final NewNumberOtpResendRequest<Integer> write() {
        return VerifyNewNumberRequest.read(VerifyNewNumberRequest.IconCompatParcelizer(this.AudioAttributesCompatParcelizer), new write(this, null));
    }

    public final KotlinModuleCompanion<Value> read(KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2.IconCompatParcelizer.write<Key, Value> writeVar, accessgetStaticJsonKeyGetter accessgetstaticjsonkeygetter) {
        toMagicModuleMetaRepoModel.write(writeVar, "");
        toMagicModuleMetaRepoModel.write(accessgetstaticjsonkeygetter, "");
        int i = AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer[accessgetstaticjsonkeygetter.ordinal()];
        int size = 0;
        if (i != 1) {
            if (i == 2) {
                size = 0 - this.AudioAttributesImplApi21Parcelizer;
            } else {
                if (i != 3) {
                    throw new RenewEligibleCreator();
                }
                size = (this.MediaBrowserCompatCustomActionResultReceiver.size() - this.AudioAttributesImplApi21Parcelizer) - 1;
            }
        }
        List listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer(new KotlinSerializersKt(size, writeVar.IconCompatParcelizer()));
        int i2 = AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer[accessgetstaticjsonkeygetter.ordinal()];
        if (i2 == 1) {
            KotlinModuleCompanion.RemoteActionCompatParcelizer.IconCompatParcelizer iconCompatParcelizer = KotlinModuleCompanion.RemoteActionCompatParcelizer.write;
            return KotlinModuleCompanion.RemoteActionCompatParcelizer.IconCompatParcelizer.read(listRemoteActionCompatParcelizer, AudioAttributesImplBaseParcelizer(), MediaBrowserCompatItemReceiver(), this.MediaDescriptionCompat.write(), null);
        }
        if (i2 == 2) {
            KotlinModuleCompanion.RemoteActionCompatParcelizer.IconCompatParcelizer iconCompatParcelizer2 = KotlinModuleCompanion.RemoteActionCompatParcelizer.write;
            return KotlinModuleCompanion.RemoteActionCompatParcelizer.IconCompatParcelizer.AudioAttributesCompatParcelizer(listRemoteActionCompatParcelizer, AudioAttributesImplBaseParcelizer(), this.MediaDescriptionCompat.write());
        }
        if (i2 != 3) {
            throw new RenewEligibleCreator();
        }
        KotlinModuleCompanion.RemoteActionCompatParcelizer.IconCompatParcelizer iconCompatParcelizer3 = KotlinModuleCompanion.RemoteActionCompatParcelizer.write;
        return KotlinModuleCompanion.RemoteActionCompatParcelizer.IconCompatParcelizer.RemoteActionCompatParcelizer(listRemoteActionCompatParcelizer, MediaBrowserCompatItemReceiver(), this.MediaDescriptionCompat.write());
    }

    public final boolean read(int p0, accessgetStaticJsonKeyGetter p1, KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2.IconCompatParcelizer.write<Key, Value> p2) {
        int audioAttributesCompatParcelizer;
        int write2;
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        int i = AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer[p1.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    if (this.MediaBrowserCompatCustomActionResultReceiver.isEmpty()) {
                        throw new IllegalStateException("should've received an init before append".toString());
                    }
                    if (p0 != this.write) {
                        return false;
                    }
                    this.IconCompatParcelizer.add(p2);
                    if (p2.getWrite() == Integer.MIN_VALUE) {
                        write2 = getQues.write(MediaBrowserCompatItemReceiver() - p2.IconCompatParcelizer().size(), 0);
                    } else {
                        write2 = p2.getWrite();
                    }
                    IconCompatParcelizer(write2);
                    this.AudioAttributesImplApi26Parcelizer.remove(accessgetStaticJsonKeyGetter.APPEND);
                }
            } else {
                if (this.MediaBrowserCompatCustomActionResultReceiver.isEmpty()) {
                    throw new IllegalStateException("should've received an init before prepend".toString());
                }
                if (p0 != this.MediaBrowserCompatSearchResultReceiver) {
                    return false;
                }
                this.IconCompatParcelizer.add(0, p2);
                this.AudioAttributesImplApi21Parcelizer++;
                if (p2.getAudioAttributesCompatParcelizer() == Integer.MIN_VALUE) {
                    audioAttributesCompatParcelizer = getQues.write(AudioAttributesImplBaseParcelizer() - p2.IconCompatParcelizer().size(), 0);
                } else {
                    audioAttributesCompatParcelizer = p2.getAudioAttributesCompatParcelizer();
                }
                AudioAttributesCompatParcelizer(audioAttributesCompatParcelizer);
                this.AudioAttributesImplApi26Parcelizer.remove(accessgetStaticJsonKeyGetter.PREPEND);
            }
        } else {
            if (!this.MediaBrowserCompatCustomActionResultReceiver.isEmpty()) {
                throw new IllegalStateException("cannot receive multiple init calls".toString());
            }
            if (p0 != 0) {
                throw new IllegalStateException("init loadId must be the initial value, 0".toString());
            }
            this.IconCompatParcelizer.add(p2);
            this.AudioAttributesImplApi21Parcelizer = 0;
            IconCompatParcelizer(p2.getWrite());
            AudioAttributesCompatParcelizer(p2.getAudioAttributesCompatParcelizer());
        }
        return true;
    }

    public final void write(KotlinModuleCompanion.AudioAttributesCompatParcelizer<Value> p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (p0.read() > this.MediaBrowserCompatCustomActionResultReceiver.size()) {
            StringBuilder sb = new StringBuilder("invalid drop count. have ");
            sb.append(this.MediaBrowserCompatCustomActionResultReceiver.size());
            sb.append(" but wanted to drop ");
            sb.append(p0.read());
            throw new IllegalStateException(sb.toString().toString());
        }
        this.AudioAttributesImplApi26Parcelizer.remove(p0.AudioAttributesCompatParcelizer());
        setupModuleaddMixIn setupmoduleaddmixin = this.MediaDescriptionCompat;
        accessgetStaticJsonKeyGetter accessgetstaticjsonkeygetterAudioAttributesCompatParcelizer = p0.AudioAttributesCompatParcelizer();
        KotlinKeySerializersKt.RemoteActionCompatParcelizer.Companion companion = KotlinKeySerializersKt.RemoteActionCompatParcelizer.INSTANCE;
        setupmoduleaddmixin.AudioAttributesCompatParcelizer(accessgetstaticjsonkeygetterAudioAttributesCompatParcelizer, KotlinKeySerializersKt.RemoteActionCompatParcelizer.Companion.write());
        int i = AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer[p0.AudioAttributesCompatParcelizer().ordinal()];
        if (i == 2) {
            int i2 = p0.read();
            for (int i3 = 0; i3 < i2; i3++) {
                this.IconCompatParcelizer.remove(0);
            }
            this.AudioAttributesImplApi21Parcelizer -= p0.read();
            AudioAttributesCompatParcelizer(p0.write());
            int i4 = this.MediaBrowserCompatSearchResultReceiver + 1;
            this.MediaBrowserCompatSearchResultReceiver = i4;
            this.MediaBrowserCompatMediaItem.read(Integer.valueOf(i4));
            return;
        }
        if (i == 3) {
            int i5 = p0.read();
            for (int i6 = 0; i6 < i5; i6++) {
                this.IconCompatParcelizer.remove(this.MediaBrowserCompatCustomActionResultReceiver.size() - 1);
            }
            IconCompatParcelizer(p0.write());
            int i7 = this.write + 1;
            this.write = i7;
            this.AudioAttributesCompatParcelizer.read(Integer.valueOf(i7));
            return;
        }
        StringBuilder sb2 = new StringBuilder("cannot drop ");
        sb2.append(p0.AudioAttributesCompatParcelizer());
        throw new IllegalArgumentException(sb2.toString());
    }

    public final KotlinModuleCompanion.AudioAttributesCompatParcelizer<Value> read(accessgetStaticJsonKeyGetter p0, getInstanceParameter p1) {
        int iWrite;
        int iWrite2;
        int size;
        int write2;
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        if (this.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer == Integer.MAX_VALUE || this.MediaBrowserCompatCustomActionResultReceiver.size() <= 2 || AudioAttributesImplApi26Parcelizer() <= this.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer) {
            return null;
        }
        if (p0 == accessgetStaticJsonKeyGetter.REFRESH) {
            throw new IllegalArgumentException("Drop LoadType must be PREPEND or APPEND, but got ".concat(String.valueOf(p0)).toString());
        }
        int iAudioAttributesImplBaseParcelizer = 0;
        int i = 0;
        int i2 = 0;
        while (i < this.MediaBrowserCompatCustomActionResultReceiver.size() && AudioAttributesImplApi26Parcelizer() - i2 > this.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer) {
            if (AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer[p0.ordinal()] == 2) {
                size = this.MediaBrowserCompatCustomActionResultReceiver.get(i).IconCompatParcelizer().size();
            } else {
                List<KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2.IconCompatParcelizer.write<Key, Value>> list = this.MediaBrowserCompatCustomActionResultReceiver;
                size = list.get(IntermediateLoginResponseBody.write((List) list) - i).IconCompatParcelizer().size();
            }
            if (AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer[p0.ordinal()] == 2) {
                write2 = p1.getRemoteActionCompatParcelizer();
            } else {
                write2 = p1.getWrite();
            }
            if ((write2 - i2) - size < this.AudioAttributesImplBaseParcelizer.AudioAttributesImplApi21Parcelizer) {
                break;
            }
            i2 += size;
            i++;
        }
        if (i == 0) {
            return null;
        }
        if (AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer[p0.ordinal()] == 2) {
            iWrite = -this.AudioAttributesImplApi21Parcelizer;
        } else {
            iWrite = (IntermediateLoginResponseBody.write((List) this.MediaBrowserCompatCustomActionResultReceiver) - this.AudioAttributesImplApi21Parcelizer) - (i - 1);
        }
        if (AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer[p0.ordinal()] == 2) {
            iWrite2 = (i - 1) - this.AudioAttributesImplApi21Parcelizer;
        } else {
            iWrite2 = IntermediateLoginResponseBody.write((List) this.MediaBrowserCompatCustomActionResultReceiver) - this.AudioAttributesImplApi21Parcelizer;
        }
        if (this.AudioAttributesImplBaseParcelizer.read) {
            iAudioAttributesImplBaseParcelizer = (p0 == accessgetStaticJsonKeyGetter.PREPEND ? AudioAttributesImplBaseParcelizer() : MediaBrowserCompatItemReceiver()) + i2;
        }
        return new KotlinModuleCompanion.AudioAttributesCompatParcelizer<>(p0, iWrite, iWrite2, iAudioAttributesImplBaseParcelizer);
    }

    public final accessisPrimaryConstructor<Key, Value> RemoteActionCompatParcelizer(getInstanceParameter.IconCompatParcelizer p0) {
        Integer numValueOf;
        int size;
        List listOnPlay = IntermediateLoginResponseBody.onPlay(this.MediaBrowserCompatCustomActionResultReceiver);
        if (p0 != null) {
            int iAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer();
            int i = -this.AudioAttributesImplApi21Parcelizer;
            int iWrite = IntermediateLoginResponseBody.write((List) this.MediaBrowserCompatCustomActionResultReceiver);
            int i2 = this.AudioAttributesImplApi21Parcelizer;
            int iMediaBrowserCompatCustomActionResultReceiver = p0.MediaBrowserCompatCustomActionResultReceiver();
            for (int i3 = i; i3 < iMediaBrowserCompatCustomActionResultReceiver; i3++) {
                if (i3 > iWrite - i2) {
                    size = this.AudioAttributesImplBaseParcelizer.write;
                } else {
                    size = this.MediaBrowserCompatCustomActionResultReceiver.get(this.AudioAttributesImplApi21Parcelizer + i3).IconCompatParcelizer().size();
                }
                iAudioAttributesImplBaseParcelizer += size;
            }
            int i4 = iAudioAttributesImplBaseParcelizer + p0.read();
            if (p0.MediaBrowserCompatCustomActionResultReceiver() < i) {
                i4 -= this.AudioAttributesImplBaseParcelizer.write;
            }
            numValueOf = Integer.valueOf(i4);
        } else {
            numValueOf = null;
        }
        return new accessisPrimaryConstructor<>(listOnPlay, numValueOf, this.AudioAttributesImplBaseParcelizer, AudioAttributesImplBaseParcelizer());
    }

    public /* synthetic */ KotlinNamesAnnotationIntrospector(accessfilterOutSingleStringCallables accessfilteroutsinglestringcallables, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(accessfilteroutsinglestringcallables);
    }

    public static final class IconCompatParcelizer<Key, Value> {
        private final setDownloadPercent AudioAttributesCompatParcelizer;
        private final KotlinNamesAnnotationIntrospector<Key, Value> RemoteActionCompatParcelizer;
        private final accessfilterOutSingleStringCallables write;

        public IconCompatParcelizer(accessfilterOutSingleStringCallables accessfilteroutsinglestringcallables) {
            toMagicModuleMetaRepoModel.write(accessfilteroutsinglestringcallables, "");
            this.write = accessfilteroutsinglestringcallables;
            this.AudioAttributesCompatParcelizer = setEncryptSalt.AudioAttributesCompatParcelizer(false);
            this.RemoteActionCompatParcelizer = new KotlinNamesAnnotationIntrospector<>(accessfilteroutsinglestringcallables, null);
        }
    }
}
