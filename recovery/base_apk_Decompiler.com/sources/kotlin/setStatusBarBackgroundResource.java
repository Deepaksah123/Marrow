package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.MagicModuleUseCaseImplWhenMappings;
import kotlin.Metadata;
import kotlin.setStatusBarBackgroundResource;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u00011BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u0013¢\u0006\u0004\b\u000f\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\t*\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0017¢\u0006\u0004\b\u0015\u0010\u0018J8\u0010\u001a\u001a\u00020\t*\u00020\u00022\"\u0010\u0003\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006H\u0082@¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010\u001d\u001a\u0004\u0018\u00010 *\b\u0012\u0004\u0012\u00020 0\u001fH\u0002¢\u0006\u0004\b\u001d\u0010!J\u001a\u0010\u001d\u001a\u00020 *\b\u0012\u0004\u0012\u00020 0\u001fH\u0082@¢\u0006\u0004\b\u001d\u0010\"J+\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000%\"\u0004\b\u0000\u0010#2\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000$H\u0002¢\u0006\u0004\b\u001a\u0010&J\u001b\u0010\u000f\u001a\u00020\u001c*\u00020\u00022\u0006\u0010\u0003\u001a\u00020'H\u0002¢\u0006\u0004\b\u000f\u0010(J\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020 H\u0002¢\u0006\u0004\b\u000f\u0010)J,\u0010\u000f\u001a\u00020\t*\u00020\u00022\u0006\u0010\u0003\u001a\u00020 2\u0006\u0010\u0005\u001a\u00020*2\u0006\u0010\n\u001a\u00020*H\u0082@¢\u0006\u0004\b\u000f\u0010+JL\u0010\u001a\u001a\u00020\t*\u00020\u00192\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020-0,2\u0006\u0010\u0005\u001a\u00020*2\u0006\u0010\n\u001a\u00020.2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u001c0/H\u0082@¢\u0006\u0004\b\u001a\u00100J\u001b\u00101\u001a\u00020**\u00020\u00192\u0006\u0010\u0003\u001a\u00020*H\u0002¢\u0006\u0004\b1\u00102R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u001d\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00105R0\u0010\u000f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00106R\u0016\u0010\u001a\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u00107R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u00108R\u0016\u00103\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u00109R\u0018\u0010=\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@"}, d2 = {"Lo/setStatusBarBackgroundResource;", "", "Lo/registerReceiver;", "p0", "Lo/createAttributionContext;", "p1", "Lkotlin/Function2;", "Lo/UnsupportedTypeDeserializer;", "Lo/SampleVideos;", "", "p2", "Lo/bufferMapProperty;", "p3", "<init>", "(Lo/registerReceiver;Lo/createAttributionContext;Lo/MagicModuleSubmissionRequestBody;Lo/bufferMapProperty;)V", "IconCompatParcelizer", "(Lo/bufferMapProperty;)V", "Lo/DeserializationContext;", "Lo/_shapeForToken;", "Lo/getKey;", "(Lo/DeserializationContext;Lo/_shapeForToken;J)V", "read", "(Lo/DeserializationContext;)V", "Lo/TopUserCompanion;", "(Lo/TopUserCompanion;)V", "Lo/shouldSkipDump;", "RemoteActionCompatParcelizer", "(Lo/registerReceiver;Lo/MagicModuleSubmissionRequestBody;Lo/SampleVideos;)Ljava/lang/Object;", "", "AudioAttributesCompatParcelizer", "(Lo/DeserializationContext;J)Z", "Lo/fromCursor;", "Lo/setStatusBarBackgroundResource$write;", "(Lo/fromCursor;)Lo/setStatusBarBackgroundResource$write;", "(Lo/fromCursor;Lo/SampleVideos;)Ljava/lang/Object;", "E", "Lkotlin/Function0;", "Lo/getTopRankers;", "(Lo/getCreatedOnDateMs;)Lo/getTopRankers;", "Lo/getReferencedType;", "(Lo/registerReceiver;J)Z", "(Lo/setStatusBarBackgroundResource$write;)V", "", "(Lo/registerReceiver;Lo/setStatusBarBackgroundResource$write;FFLo/SampleVideos;)Ljava/lang/Object;", "Lo/setShowDividers;", "Lo/setHoverListener;", "", "Lkotlin/Function1;", "(Lo/shouldSkipDump;Lo/setShowDividers;FILo/getAnswerMap;Lo/SampleVideos;)Ljava/lang/Object;", "write", "(Lo/shouldSkipDump;F)F", "AudioAttributesImplBaseParcelizer", "Lo/registerReceiver;", "Lo/createAttributionContext;", "Lo/MagicModuleSubmissionRequestBody;", "Lo/bufferMapProperty;", "Lo/fromCursor;", "Z", "Lo/setPassingYear;", "MediaBrowserCompatItemReceiver", "Lo/setPassingYear;", "AudioAttributesImplApi26Parcelizer", "Lo/getLifecycleRegistryannotations;", "MediaBrowserCompatCustomActionResultReceiver", "Lo/getLifecycleRegistryannotations;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setStatusBarBackgroundResource {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private bufferMapProperty RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final registerReceiver read;
    private final MagicModuleSubmissionRequestBody<UnsupportedTypeDeserializer, SampleVideos<? super getShowPopup>, Object> IconCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private setPassingYear AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private boolean AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final createAttributionContext AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final fromCursor<write> write = getLastName.read(Integer.MAX_VALUE, null, 6);
    private final getLifecycleRegistryannotations MediaBrowserCompatCustomActionResultReceiver = new getLifecycleRegistryannotations();

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AudioAttributesCompatParcelizer extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        int AudioAttributesImplApi21Parcelizer;
        Object IconCompatParcelizer;
        /* synthetic */ Object MediaBrowserCompatCustomActionResultReceiver;
        Object RemoteActionCompatParcelizer;
        Object read;
        Object write;

        AudioAttributesCompatParcelizer(SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.MediaBrowserCompatCustomActionResultReceiver = obj;
            this.AudioAttributesImplApi21Parcelizer |= Integer.MIN_VALUE;
            return setStatusBarBackgroundResource.write(null, null, null, null, null, 0L, this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AudioAttributesImplApi21Parcelizer extends getTotalMcq {
        /* synthetic */ Object AudioAttributesCompatParcelizer;
        int write;

        AudioAttributesImplApi21Parcelizer(SampleVideos<? super AudioAttributesImplApi21Parcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesCompatParcelizer = obj;
            this.write |= Integer.MIN_VALUE;
            return setStatusBarBackgroundResource.this.RemoteActionCompatParcelizer(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class RemoteActionCompatParcelizer extends getTotalMcq {
        int AudioAttributesCompatParcelizer;
        Object IconCompatParcelizer;
        /* synthetic */ Object RemoteActionCompatParcelizer;
        float read;
        Object write;

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.RemoteActionCompatParcelizer = obj;
            this.AudioAttributesCompatParcelizer |= Integer.MIN_VALUE;
            return setStatusBarBackgroundResource.this.IconCompatParcelizer((registerReceiver) null, (write) null, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public setStatusBarBackgroundResource(registerReceiver registerreceiver, createAttributionContext createattributioncontext, MagicModuleSubmissionRequestBody<? super UnsupportedTypeDeserializer, ? super SampleVideos<? super getShowPopup>, ? extends Object> magicModuleSubmissionRequestBody, bufferMapProperty buffermapproperty) {
        this.read = registerreceiver;
        this.AudioAttributesCompatParcelizer = createattributioncontext;
        this.IconCompatParcelizer = magicModuleSubmissionRequestBody;
        this.RemoteActionCompatParcelizer = buffermapproperty;
    }

    public final void IconCompatParcelizer(bufferMapProperty p0) {
        this.RemoteActionCompatParcelizer = p0;
    }

    public final void IconCompatParcelizer(DeserializationContext p0, _shapeForToken p1, long p2) {
        int i = 0;
        if (getDesignInfoListui_tooling.AudioAttributesImplApi26Parcelizer) {
            if (constructCalendar.AudioAttributesCompatParcelizer(p0.getMediaBrowserCompatItemReceiver(), constructCalendar.INSTANCE.MediaBrowserCompatItemReceiver())) {
                List<getArrayBuilders> listAudioAttributesCompatParcelizer = p0.AudioAttributesCompatParcelizer();
                int size = listAudioAttributesCompatParcelizer.size();
                while (i < size) {
                    if (listAudioAttributesCompatParcelizer.get(i).MediaDescriptionCompat()) {
                        return;
                    } else {
                        i++;
                    }
                }
                if (p1 == _shapeForToken.IconCompatParcelizer && this.AudioAttributesImplBaseParcelizer) {
                    AudioAttributesCompatParcelizer(p0, p2);
                    read(p0);
                }
                if (p1 == _shapeForToken.AudioAttributesCompatParcelizer && !this.AudioAttributesImplBaseParcelizer && AudioAttributesCompatParcelizer(p0, p2)) {
                    read(p0);
                    return;
                }
                return;
            }
            return;
        }
        if (p1 == _shapeForToken.AudioAttributesCompatParcelizer && constructCalendar.AudioAttributesCompatParcelizer(p0.getMediaBrowserCompatItemReceiver(), constructCalendar.INSTANCE.MediaBrowserCompatItemReceiver())) {
            List<getArrayBuilders> listAudioAttributesCompatParcelizer2 = p0.AudioAttributesCompatParcelizer();
            int size2 = listAudioAttributesCompatParcelizer2.size();
            while (i < size2) {
                if (listAudioAttributesCompatParcelizer2.get(i).MediaDescriptionCompat()) {
                    return;
                } else {
                    i++;
                }
            }
            if (AudioAttributesCompatParcelizer(p0, p2)) {
                read(p0);
            }
        }
    }

    private final void read(DeserializationContext deserializationContext) {
        List<getArrayBuilders> listAudioAttributesCompatParcelizer = deserializationContext.AudioAttributesCompatParcelizer();
        int size = listAudioAttributesCompatParcelizer.size();
        for (int i = 0; i < size; i++) {
            listAudioAttributesCompatParcelizer.get(i).RemoteActionCompatParcelizer();
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bJ.\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\fJ\u001a\u0010\r\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\n\u0010\u0017R\u001a\u0010\u001a\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b"}, d2 = {"Lo/setStatusBarBackgroundResource$write;", "", "Lo/getReferencedType;", "p0", "", "p1", "", "p2", "<init>", "(JJZLo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "RemoteActionCompatParcelizer", "(Lo/setStatusBarBackgroundResource$write;)Lo/setStatusBarBackgroundResource$write;", "(JJZ)Lo/setStatusBarBackgroundResource$write;", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "AudioAttributesCompatParcelizer", "J", "()J", "IconCompatParcelizer", "Z", "write", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final /* data */ class write {
        private final long AudioAttributesCompatParcelizer;
        private final long IconCompatParcelizer;

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        private final boolean write;

        private write(long j, long j2, boolean z) {
            this.AudioAttributesCompatParcelizer = j;
            this.IconCompatParcelizer = j2;
            this.write = z;
        }

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
        public final long getAudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
        public final long getIconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        /* JADX INFO: renamed from: write, reason: from getter */
        public final boolean getWrite() {
            return this.write;
        }

        public final write RemoteActionCompatParcelizer(write p0) {
            return new write(getReferencedType.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, p0.AudioAttributesCompatParcelizer), Math.max(this.IconCompatParcelizer, p0.IconCompatParcelizer), this.write, null);
        }

        public /* synthetic */ write(long j, long j2, boolean z, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this(j, j2, z);
        }

        public static /* synthetic */ write RemoteActionCompatParcelizer$default(write writeVar, long j, long j2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                j = writeVar.AudioAttributesCompatParcelizer;
            }
            long j3 = j;
            if ((i & 2) != 0) {
                j2 = writeVar.IconCompatParcelizer;
            }
            long j4 = j2;
            if ((i & 4) != 0) {
                z = writeVar.write;
            }
            return writeVar.RemoteActionCompatParcelizer(j3, j4, z);
        }

        public final write RemoteActionCompatParcelizer(long p0, long p1, boolean p2) {
            return new write(p0, p1, p2, null);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof write)) {
                return false;
            }
            write writeVar = (write) p0;
            return getReferencedType.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, writeVar.AudioAttributesCompatParcelizer) && this.IconCompatParcelizer == writeVar.IconCompatParcelizer && this.write == writeVar.write;
        }

        public final int hashCode() {
            return (((getReferencedType.MediaBrowserCompatItemReceiver(this.AudioAttributesCompatParcelizer) * 31) + Long.hashCode(this.IconCompatParcelizer)) * 31) + Boolean.hashCode(this.write);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("write(AudioAttributesCompatParcelizer=");
            sb.append((Object) getReferencedType.AudioAttributesImplBaseParcelizer(this.AudioAttributesCompatParcelizer));
            sb.append(", IconCompatParcelizer=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", write=");
            sb.append(this.write);
            sb.append(')');
            return sb.toString();
        }
    }

    public final void read(TopUserCompanion p0) {
        if (this.AudioAttributesImplApi26Parcelizer == null) {
            this.AudioAttributesImplApi26Parcelizer = C0201setMcqCount.IconCompatParcelizer(p0, null, null, new MediaBrowserCompatCustomActionResultReceiver(null), 3);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class MediaBrowserCompatCustomActionResultReceiver extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ Object IconCompatParcelizer;
        int RemoteActionCompatParcelizer;

        /* JADX WARN: Code restructure failed: missing block: B:21:0x007f, code lost:
        
            if (r5.IconCompatParcelizer(r5.read, r7, r8, r9, r12) != r0) goto L8;
         */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0039 A[Catch: all -> 0x008a, TryCatch #0 {all -> 0x008a, blocks: (B:7:0x0013, B:15:0x002f, B:17:0x0039, B:20:0x004f, B:12:0x0024), top: B:28:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0082  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x007f -> B:8:0x0016). Please report as a decompilation issue!!! */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                int r1 = r12.RemoteActionCompatParcelizer
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L28
                if (r1 == r4) goto L20
                if (r1 != r3) goto L18
                java.lang.Object r1 = r12.IconCompatParcelizer
                o.TopUserCompanion r1 = (kotlin.TopUserCompanion) r1
                kotlin.SdkPayloadData.IconCompatParcelizer(r13)     // Catch: java.lang.Throwable -> L8a
            L16:
                r13 = r1
                goto L2f
            L18:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r13)
                throw r12
            L20:
                java.lang.Object r1 = r12.IconCompatParcelizer
                o.TopUserCompanion r1 = (kotlin.TopUserCompanion) r1
                kotlin.SdkPayloadData.IconCompatParcelizer(r13)     // Catch: java.lang.Throwable -> L8a
                goto L4f
            L28:
                kotlin.SdkPayloadData.IconCompatParcelizer(r13)
                java.lang.Object r13 = r12.IconCompatParcelizer
                o.TopUserCompanion r13 = (kotlin.TopUserCompanion) r13
            L2f:
                o.CurrentQuery r1 = r13.getIconCompatParcelizer()     // Catch: java.lang.Throwable -> L8a
                boolean r1 = kotlin.getUserConfig.write(r1)     // Catch: java.lang.Throwable -> L8a
                if (r1 == 0) goto L82
                o.setStatusBarBackgroundResource r1 = kotlin.setStatusBarBackgroundResource.this     // Catch: java.lang.Throwable -> L8a
                o.fromCursor r1 = kotlin.setStatusBarBackgroundResource.IconCompatParcelizer(r1)     // Catch: java.lang.Throwable -> L8a
                r5 = r12
                o.SampleVideos r5 = (kotlin.SampleVideos) r5     // Catch: java.lang.Throwable -> L8a
                r12.IconCompatParcelizer = r13     // Catch: java.lang.Throwable -> L8a
                r12.RemoteActionCompatParcelizer = r4     // Catch: java.lang.Throwable -> L8a
                java.lang.Object r1 = r1.IconCompatParcelizer(r5)     // Catch: java.lang.Throwable -> L8a
                if (r1 == r0) goto L81
                r11 = r1
                r1 = r13
                r13 = r11
            L4f:
                r7 = r13
                o.setStatusBarBackgroundResource$write r7 = (o.setStatusBarBackgroundResource.write) r7     // Catch: java.lang.Throwable -> L8a
                o.setStatusBarBackgroundResource r13 = kotlin.setStatusBarBackgroundResource.this     // Catch: java.lang.Throwable -> L8a
                o.bufferMapProperty r13 = kotlin.setStatusBarBackgroundResource.read(r13)     // Catch: java.lang.Throwable -> L8a
                float r5 = kotlin.setStatusBarBackgroundColor.write()     // Catch: java.lang.Throwable -> L8a
                float r8 = r13.AudioAttributesCompatParcelizer(r5)     // Catch: java.lang.Throwable -> L8a
                o.setStatusBarBackgroundResource r13 = kotlin.setStatusBarBackgroundResource.this     // Catch: java.lang.Throwable -> L8a
                o.bufferMapProperty r13 = kotlin.setStatusBarBackgroundResource.read(r13)     // Catch: java.lang.Throwable -> L8a
                float r5 = kotlin.setStatusBarBackgroundColor.IconCompatParcelizer()     // Catch: java.lang.Throwable -> L8a
                float r9 = r13.AudioAttributesCompatParcelizer(r5)     // Catch: java.lang.Throwable -> L8a
                o.setStatusBarBackgroundResource r5 = kotlin.setStatusBarBackgroundResource.this     // Catch: java.lang.Throwable -> L8a
                o.registerReceiver r6 = kotlin.setStatusBarBackgroundResource.RemoteActionCompatParcelizer(r5)     // Catch: java.lang.Throwable -> L8a
                r10 = r12
                o.SampleVideos r10 = (kotlin.SampleVideos) r10     // Catch: java.lang.Throwable -> L8a
                r12.IconCompatParcelizer = r1     // Catch: java.lang.Throwable -> L8a
                r12.RemoteActionCompatParcelizer = r3     // Catch: java.lang.Throwable -> L8a
                java.lang.Object r13 = kotlin.setStatusBarBackgroundResource.write(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L8a
                if (r13 != r0) goto L16
            L81:
                return r0
            L82:
                o.setStatusBarBackgroundResource r12 = kotlin.setStatusBarBackgroundResource.this
                kotlin.setStatusBarBackgroundResource.write(r12, r2)
                o.getShowPopup r12 = kotlin.getShowPopup.INSTANCE
                return r12
            L8a:
                r13 = move-exception
                o.setStatusBarBackgroundResource r12 = kotlin.setStatusBarBackgroundResource.this
                kotlin.setStatusBarBackgroundResource.write(r12, r2)
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: o.setStatusBarBackgroundResource.MediaBrowserCompatCustomActionResultReceiver.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        MediaBrowserCompatCustomActionResultReceiver(SampleVideos<? super MediaBrowserCompatCustomActionResultReceiver> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver = setStatusBarBackgroundResource.this.new MediaBrowserCompatCustomActionResultReceiver(sampleVideos);
            mediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer = obj;
            return mediaBrowserCompatCustomActionResultReceiver;
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatCustomActionResultReceiver) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object RemoteActionCompatParcelizer(kotlin.registerReceiver r5, kotlin.MagicModuleSubmissionRequestBody<? super kotlin.shouldSkipDump, ? super kotlin.SampleVideos<? super kotlin.getShowPopup>, ? extends java.lang.Object> r6, kotlin.SampleVideos<? super kotlin.getShowPopup> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof o.setStatusBarBackgroundResource.AudioAttributesImplApi21Parcelizer
            if (r0 == 0) goto L14
            r0 = r7
            o.setStatusBarBackgroundResource$AudioAttributesImplApi21Parcelizer r0 = (o.setStatusBarBackgroundResource.AudioAttributesImplApi21Parcelizer) r0
            int r1 = r0.write
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r7 = r0.write
            int r7 = r7 + r2
            r0.write = r7
            goto L19
        L14:
            o.setStatusBarBackgroundResource$AudioAttributesImplApi21Parcelizer r0 = new o.setStatusBarBackgroundResource$AudioAttributesImplApi21Parcelizer
            r0.<init>(r7)
        L19:
            java.lang.Object r7 = r0.AudioAttributesCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.write
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            goto L48
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L32:
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            r4.AudioAttributesImplBaseParcelizer = r3
            o.setStatusBarBackgroundResource$MediaBrowserCompatItemReceiver r7 = new o.setStatusBarBackgroundResource$MediaBrowserCompatItemReceiver
            r2 = 0
            r7.<init>(r5, r6, r2)
            o.MagicModuleSubmissionRequestBody r7 = (kotlin.MagicModuleSubmissionRequestBody) r7
            r0.write = r3
            java.lang.Object r5 = kotlin.getAltContact.AudioAttributesCompatParcelizer(r7, r0)
            if (r5 != r1) goto L48
            return r1
        L48:
            r5 = 0
            r4.AudioAttributesImplBaseParcelizer = r5
            o.getShowPopup r4 = kotlin.getShowPopup.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setStatusBarBackgroundResource.RemoteActionCompatParcelizer(o.registerReceiver, o.MagicModuleSubmissionRequestBody, o.SampleVideos):java.lang.Object");
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class MediaBrowserCompatItemReceiver extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        final /* synthetic */ MagicModuleSubmissionRequestBody<shouldSkipDump, SampleVideos<? super getShowPopup>, Object> AudioAttributesCompatParcelizer;
        final /* synthetic */ registerReceiver IconCompatParcelizer;
        int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.RemoteActionCompatParcelizer = 1;
                if (this.IconCompatParcelizer.read(Flow.AudioAttributesCompatParcelizer, this.AudioAttributesCompatParcelizer, this) == objIconCompatParcelizer) {
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
        /* JADX WARN: Multi-variable type inference failed */
        MediaBrowserCompatItemReceiver(registerReceiver registerreceiver, MagicModuleSubmissionRequestBody<? super shouldSkipDump, ? super SampleVideos<? super getShowPopup>, ? extends Object> magicModuleSubmissionRequestBody, SampleVideos<? super MediaBrowserCompatItemReceiver> sampleVideos) {
            super(2, sampleVideos);
            this.IconCompatParcelizer = registerreceiver;
            this.AudioAttributesCompatParcelizer = magicModuleSubmissionRequestBody;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new MediaBrowserCompatItemReceiver(this.IconCompatParcelizer, this.AudioAttributesCompatParcelizer, sampleVideos);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatItemReceiver) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final boolean AudioAttributesCompatParcelizer(DeserializationContext p0, long p1) {
        long jWrite = this.AudioAttributesCompatParcelizer.write(this.RemoteActionCompatParcelizer, p0, p1);
        if (IconCompatParcelizer(this.read, jWrite)) {
            return getNameArray.MediaBrowserCompatCustomActionResultReceiver(this.write.read(new write(jWrite, ((getArrayBuilders) IntermediateLoginResponseBody.RatingCompat((List) p0.AudioAttributesCompatParcelizer())).getWrite(), !this.AudioAttributesCompatParcelizer.read() || this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(p0), null)));
        }
        return this.AudioAttributesImplBaseParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final write AudioAttributesCompatParcelizer(final fromCursor<write> fromcursor) {
        Iterator itWrite = RemoteActionCompatParcelizer(new getCreatedOnDateMs() { // from class: o.setStatusBarBackground
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return setStatusBarBackgroundResource.read(fromcursor);
            }
        }).write();
        write writeVarRemoteActionCompatParcelizer = null;
        while (itWrite.hasNext()) {
            write writeVar = (write) itWrite.next();
            writeVarRemoteActionCompatParcelizer = writeVarRemoteActionCompatParcelizer == null ? writeVar : writeVarRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(writeVar);
        }
        return writeVarRemoteActionCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final write read(fromCursor fromcursor) {
        return (write) getNameArray.AudioAttributesCompatParcelizer(fromcursor.AudioAttributesImplBaseParcelizer());
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$MouseWheelScrollDelta;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super write>, Object> {
        final /* synthetic */ fromCursor<write> AudioAttributesCompatParcelizer;
        private /* synthetic */ Object IconCompatParcelizer;
        int write;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
            private /* synthetic */ Object AudioAttributesCompatParcelizer;
            int IconCompatParcelizer;

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                TopUserCompanion topUserCompanion;
                Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                int i = this.IconCompatParcelizer;
                if (i == 0) {
                    SdkPayloadData.IconCompatParcelizer(obj);
                    topUserCompanion = (TopUserCompanion) this.AudioAttributesCompatParcelizer;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    topUserCompanion = (TopUserCompanion) this.AudioAttributesCompatParcelizer;
                    SdkPayloadData.IconCompatParcelizer(obj);
                }
                while (getUserConfig.write(topUserCompanion.getIconCompatParcelizer())) {
                    this.AudioAttributesCompatParcelizer = topUserCompanion;
                    this.IconCompatParcelizer = 1;
                    if (TokenFilterInclusion.AudioAttributesCompatParcelizer(new getAnswerMap() { // from class: o.dispatchKeyEvent
                        @Override // kotlin.getAnswerMap
                        public final Object invoke(Object obj2) {
                            return setStatusBarBackgroundResource.read.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(((Long) obj2).longValue());
                        }
                    }, this) == objIconCompatParcelizer) {
                        return objIconCompatParcelizer;
                    }
                }
                return getShowPopup.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final getShowPopup RemoteActionCompatParcelizer(long j) {
                return getShowPopup.INSTANCE;
            }

            RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
                super(2, sampleVideos);
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer(sampleVideos);
                remoteActionCompatParcelizer.AudioAttributesCompatParcelizer = obj;
                return remoteActionCompatParcelizer;
            }

            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) throws Throwable {
            setPassingYear setpassingyearIconCompatParcelizer;
            setPassingYear setpassingyear;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setpassingyearIconCompatParcelizer = C0201setMcqCount.IconCompatParcelizer((TopUserCompanion) this.IconCompatParcelizer, null, null, new RemoteActionCompatParcelizer(null), 3);
                try {
                    this.IconCompatParcelizer = setpassingyearIconCompatParcelizer;
                    this.write = 1;
                    Object objIconCompatParcelizer2 = this.AudioAttributesCompatParcelizer.IconCompatParcelizer(this);
                    if (objIconCompatParcelizer2 == objIconCompatParcelizer) {
                        return objIconCompatParcelizer;
                    }
                    obj = objIconCompatParcelizer2;
                    setpassingyear = setpassingyearIconCompatParcelizer;
                } catch (Throwable th) {
                    th = th;
                    setpassingyearIconCompatParcelizer.RemoteActionCompatParcelizer((CancellationException) null);
                    throw th;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                setpassingyear = (setPassingYear) this.IconCompatParcelizer;
                try {
                    SdkPayloadData.IconCompatParcelizer(obj);
                } catch (Throwable th2) {
                    setpassingyearIconCompatParcelizer = setpassingyear;
                    th = th2;
                    setpassingyearIconCompatParcelizer.RemoteActionCompatParcelizer((CancellationException) null);
                    throw th;
                }
            }
            write writeVar = (write) obj;
            setpassingyear.RemoteActionCompatParcelizer((CancellationException) null);
            return writeVar;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        read(fromCursor<write> fromcursor, SampleVideos<? super read> sampleVideos) {
            super(2, sampleVideos);
            this.AudioAttributesCompatParcelizer = fromcursor;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            read readVar = new read(this.AudioAttributesCompatParcelizer, sampleVideos);
            readVar.IconCompatParcelizer = obj;
            return readVar;
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super write> sampleVideos) {
            return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object AudioAttributesCompatParcelizer(fromCursor<write> fromcursor, SampleVideos<? super write> sampleVideos) {
        return College.IconCompatParcelizer(new read(fromcursor, null), sampleVideos);
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "E", "Lkotlin/sequences/SequenceScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AudioAttributesImplBaseParcelizer<E> extends getTotalSolvedModule implements MagicModuleSubmissionRequestBody<setStateResult<? super E>, SampleVideos<? super getShowPopup>, Object> {
        Object AudioAttributesCompatParcelizer;
        private /* synthetic */ Object IconCompatParcelizer;
        final /* synthetic */ getCreatedOnDateMs<E> read;
        int write;

        /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0037 -> B:15:0x003b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x003a -> B:15:0x003b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
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
                r2 = 1
                if (r1 == 0) goto L1d
                if (r1 != r2) goto L15
                java.lang.Object r1 = r4.AudioAttributesCompatParcelizer
                java.lang.Object r3 = r4.IconCompatParcelizer
                o.setStateResult r3 = (kotlin.setStateResult) r3
                kotlin.SdkPayloadData.IconCompatParcelizer(r5)
                goto L3b
            L15:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L1d:
                kotlin.SdkPayloadData.IconCompatParcelizer(r5)
                java.lang.Object r5 = r4.IconCompatParcelizer
                o.setStateResult r5 = (kotlin.setStateResult) r5
                r3 = r5
            L25:
                o.getCreatedOnDateMs<E> r5 = r4.read
                java.lang.Object r1 = r5.invoke()
                if (r1 == 0) goto L3a
                r4.IconCompatParcelizer = r3
                r4.AudioAttributesCompatParcelizer = r1
                r4.write = r2
                java.lang.Object r5 = r3.IconCompatParcelizer(r1, r4)
                if (r5 != r0) goto L3b
                return r0
            L3a:
                r1 = 0
            L3b:
                if (r1 != 0) goto L25
                o.getShowPopup r4 = kotlin.getShowPopup.INSTANCE
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: o.setStatusBarBackgroundResource.AudioAttributesImplBaseParcelizer.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AudioAttributesImplBaseParcelizer(getCreatedOnDateMs<? extends E> getcreatedondatems, SampleVideos<? super AudioAttributesImplBaseParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.read = getcreatedondatems;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer = new AudioAttributesImplBaseParcelizer(this.read, sampleVideos);
            audioAttributesImplBaseParcelizer.IconCompatParcelizer = obj;
            return audioAttributesImplBaseParcelizer;
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Object invoke(setStateResult<? super E> setstateresult, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplBaseParcelizer) create(setstateresult, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final <E> getTopRankers<E> RemoteActionCompatParcelizer(getCreatedOnDateMs<? extends E> p0) {
        return StateResult.IconCompatParcelizer((MagicModuleSubmissionRequestBody) new AudioAttributesImplBaseParcelizer(p0, null));
    }

    private final boolean IconCompatParcelizer(registerReceiver registerreceiver, long j) {
        float fIconCompatParcelizer;
        if (getDesignInfoListui_tooling.AudioAttributesImplApi26Parcelizer) {
            fIconCompatParcelizer = registerreceiver.read(registerreceiver.write(j));
        } else {
            fIconCompatParcelizer = registerreceiver.IconCompatParcelizer(registerreceiver.write(j));
        }
        if (fIconCompatParcelizer == BitmapDescriptorFactory.HUE_RED) {
            return false;
        }
        if (fIconCompatParcelizer > BitmapDescriptorFactory.HUE_RED) {
            return registerreceiver.getRemoteActionCompatParcelizer().AudioAttributesCompatParcelizer();
        }
        return registerreceiver.getRemoteActionCompatParcelizer().read();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void IconCompatParcelizer(write p0) {
        this.MediaBrowserCompatCustomActionResultReceiver.write(p0.getIconCompatParcelizer(), p0.getAudioAttributesCompatParcelizer());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0115, code lost:
    
        if (r0.invoke(r1, r11) == r12) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Type inference failed for: r0v10, types: [T, o.setShowDividers] */
    /* JADX WARN: Type inference failed for: r0v17, types: [T, o.setStatusBarBackgroundResource$write] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object IconCompatParcelizer(kotlin.registerReceiver r26, o.setStatusBarBackgroundResource.write r27, float r28, float r29, kotlin.SampleVideos<? super kotlin.getShowPopup> r30) {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setStatusBarBackgroundResource.IconCompatParcelizer(o.registerReceiver, o.setStatusBarBackgroundResource$write, float, float, o.SampleVideos):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARN: Type inference failed for: r1v12, types: [T, o.setShowDividers] */
    /* JADX WARN: Type inference failed for: r1v4, types: [T, o.setStatusBarBackgroundResource$write] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object write(kotlin.setStatusBarBackgroundResource r21, o.MagicModuleUseCaseImplWhenMappings.write<o.setStatusBarBackgroundResource.write> r22, o.MagicModuleUseCaseImplWhenMappings.RemoteActionCompatParcelizer r23, kotlin.registerReceiver r24, o.MagicModuleUseCaseImplWhenMappings.write<kotlin.setShowDividers<java.lang.Float, kotlin.setHoverListener>> r25, long r26, kotlin.SampleVideos<? super java.lang.Boolean> r28) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setStatusBarBackgroundResource.write(o.setStatusBarBackgroundResource, o.MagicModuleUseCaseImplWhenMappings$write, o.MagicModuleUseCaseImplWhenMappings$RemoteActionCompatParcelizer, o.registerReceiver, o.MagicModuleUseCaseImplWhenMappings$write, long, o.SampleVideos):java.lang.Object");
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$MouseWheelScrollDelta;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AudioAttributesImplApi26Parcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super write>, Object> {
        int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
                return obj;
            }
            SdkPayloadData.IconCompatParcelizer(obj);
            setStatusBarBackgroundResource setstatusbarbackgroundresource = setStatusBarBackgroundResource.this;
            this.RemoteActionCompatParcelizer = 1;
            Object objAudioAttributesCompatParcelizer = setstatusbarbackgroundresource.AudioAttributesCompatParcelizer((fromCursor<write>) setstatusbarbackgroundresource.write, this);
            return objAudioAttributesCompatParcelizer == objIconCompatParcelizer ? objIconCompatParcelizer : objAudioAttributesCompatParcelizer;
        }

        AudioAttributesImplApi26Parcelizer(SampleVideos<? super AudioAttributesImplApi26Parcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return setStatusBarBackgroundResource.this.new AudioAttributesImplApi26Parcelizer(sampleVideos);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super write> sampleVideos) {
            return ((AudioAttributesImplApi26Parcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/NestedScrollScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<shouldSkipDump, SampleVideos<? super getShowPopup>, Object> {
        final /* synthetic */ MagicModuleUseCaseImplWhenMappings.write<write> AudioAttributesCompatParcelizer;
        Object AudioAttributesImplApi21Parcelizer;
        Object AudioAttributesImplApi26Parcelizer;
        int AudioAttributesImplBaseParcelizer;
        final /* synthetic */ MagicModuleUseCaseImplWhenMappings.write<setShowDividers<Float, setHoverListener>> IconCompatParcelizer;
        final /* synthetic */ float MediaBrowserCompatCustomActionResultReceiver;
        int MediaBrowserCompatItemReceiver;
        private /* synthetic */ Object MediaDescriptionCompat;
        final /* synthetic */ setStatusBarBackgroundResource RatingCompat;
        final /* synthetic */ MagicModuleUseCaseImplWhenMappings.RemoteActionCompatParcelizer RemoteActionCompatParcelizer;
        final /* synthetic */ float read;
        final /* synthetic */ registerReceiver write;

        /* JADX WARN: Removed duplicated region for block: B:14:0x0065 A[PHI: r2 r13
          0x0065: PHI (r2v4 o.MagicModuleUseCaseImplWhenMappings$AudioAttributesCompatParcelizer) = 
          (r2v3 o.MagicModuleUseCaseImplWhenMappings$AudioAttributesCompatParcelizer)
          (r2v6 o.MagicModuleUseCaseImplWhenMappings$AudioAttributesCompatParcelizer)
         binds: [B:23:0x0130, B:13:0x0063] A[DONT_GENERATE, DONT_INLINE]
          0x0065: PHI (r13v1 o.shouldSkipDump) = (r13v0 o.shouldSkipDump), (r13v2 o.shouldSkipDump) binds: [B:23:0x0130, B:13:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0132  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x019e  */
        /* JADX WARN: Type inference failed for: r6v15, types: [T, o.setShowDividers] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0130 -> B:14:0x0065). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x015b -> B:27:0x015d). Please report as a decompilation issue!!! */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r25) {
            /*
                Method dump skipped, instruction units count: 417
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.setStatusBarBackgroundResource.IconCompatParcelizer.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v4, types: [T, o.setStatusBarBackgroundResource$write] */
        public static final boolean IconCompatParcelizer(setStatusBarBackgroundResource setstatusbarbackgroundresource, MagicModuleUseCaseImplWhenMappings.write writeVar, MagicModuleUseCaseImplWhenMappings.RemoteActionCompatParcelizer remoteActionCompatParcelizer, registerReceiver registerreceiver, MagicModuleUseCaseImplWhenMappings.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, float f) {
            float fIconCompatParcelizer;
            write writeVarAudioAttributesCompatParcelizer = setstatusbarbackgroundresource.AudioAttributesCompatParcelizer(setstatusbarbackgroundresource.write);
            if (writeVarAudioAttributesCompatParcelizer != null) {
                setstatusbarbackgroundresource.IconCompatParcelizer(writeVarAudioAttributesCompatParcelizer);
                writeVar.write = ((write) writeVar.write).RemoteActionCompatParcelizer(writeVarAudioAttributesCompatParcelizer);
                if (getDesignInfoListui_tooling.AudioAttributesImplApi26Parcelizer) {
                    fIconCompatParcelizer = registerreceiver.read(registerreceiver.write(((write) writeVar.write).getAudioAttributesCompatParcelizer()));
                } else {
                    fIconCompatParcelizer = registerreceiver.IconCompatParcelizer(registerreceiver.write(((write) writeVar.write).getAudioAttributesCompatParcelizer()));
                }
                remoteActionCompatParcelizer.read = fIconCompatParcelizer;
                audioAttributesCompatParcelizer.IconCompatParcelizer = !setStatusBarBackgroundColor.RemoteActionCompatParcelizer(remoteActionCompatParcelizer.read - f);
            }
            return writeVarAudioAttributesCompatParcelizer != null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(MagicModuleUseCaseImplWhenMappings.RemoteActionCompatParcelizer remoteActionCompatParcelizer, MagicModuleUseCaseImplWhenMappings.write<setShowDividers<Float, setHoverListener>> writeVar, MagicModuleUseCaseImplWhenMappings.write<write> writeVar2, float f, setStatusBarBackgroundResource setstatusbarbackgroundresource, float f2, registerReceiver registerreceiver, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.RemoteActionCompatParcelizer = remoteActionCompatParcelizer;
            this.IconCompatParcelizer = writeVar;
            this.AudioAttributesCompatParcelizer = writeVar2;
            this.MediaBrowserCompatCustomActionResultReceiver = f;
            this.RatingCompat = setstatusbarbackgroundresource;
            this.read = f2;
            this.write = registerreceiver;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, this.AudioAttributesCompatParcelizer, this.MediaBrowserCompatCustomActionResultReceiver, this.RatingCompat, this.read, this.write, sampleVideos);
            iconCompatParcelizer.MediaDescriptionCompat = obj;
            return iconCompatParcelizer;
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Object invoke(shouldSkipDump shouldskipdump, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(shouldskipdump, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object RemoteActionCompatParcelizer(final shouldSkipDump shouldskipdump, setShowDividers<Float, setHoverListener> setshowdividers, float f, int i, final getAnswerMap<? super Float, Boolean> getanswermap, SampleVideos<? super getShowPopup> sampleVideos) {
        final MagicModuleUseCaseImplWhenMappings.RemoteActionCompatParcelizer remoteActionCompatParcelizer = new MagicModuleUseCaseImplWhenMappings.RemoteActionCompatParcelizer();
        remoteActionCompatParcelizer.read = setshowdividers.getRemoteActionCompatParcelizer().floatValue();
        Object objWrite = setTitleMarginStart.write((setShowDividers<Float, V>) setshowdividers, QBankStatsResponse.write(f), (setOrientation<Float>) setVerticalGravity.RemoteActionCompatParcelizer$default(i, 0, setShowText.read(), 2, (Object) null), true, (getAnswerMap<? super setWeightSum<Float, V>, getShowPopup>) new getAnswerMap() { // from class: o.getExtraDataMapannotations
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return setStatusBarBackgroundResource.IconCompatParcelizer(remoteActionCompatParcelizer, this, shouldskipdump, getanswermap, (setWeightSum) obj);
            }
        }, sampleVideos);
        return objWrite == getYear.IconCompatParcelizer() ? objWrite : getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(MagicModuleUseCaseImplWhenMappings.RemoteActionCompatParcelizer remoteActionCompatParcelizer, setStatusBarBackgroundResource setstatusbarbackgroundresource, shouldSkipDump shouldskipdump, getAnswerMap getanswermap, setWeightSum setweightsum) {
        float fFloatValue = ((Number) setweightsum.write()).floatValue() - remoteActionCompatParcelizer.read;
        if (!setStatusBarBackgroundColor.RemoteActionCompatParcelizer(fFloatValue)) {
            if (!setStatusBarBackgroundColor.RemoteActionCompatParcelizer(fFloatValue - setstatusbarbackgroundresource.write(shouldskipdump, fFloatValue))) {
                setweightsum.AudioAttributesCompatParcelizer();
                return getShowPopup.INSTANCE;
            }
            remoteActionCompatParcelizer.read += fFloatValue;
        }
        if (((Boolean) getanswermap.invoke(Float.valueOf(remoteActionCompatParcelizer.read))).booleanValue()) {
            setweightsum.AudioAttributesCompatParcelizer();
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float write(shouldSkipDump shouldskipdump, float f) {
        registerReceiver registerreceiver = this.read;
        return registerreceiver.IconCompatParcelizer(registerreceiver.write(shouldskipdump.write(registerreceiver.RemoteActionCompatParcelizer(registerreceiver.read(f)), findCoercionAction.INSTANCE.AudioAttributesCompatParcelizer())));
    }
}
