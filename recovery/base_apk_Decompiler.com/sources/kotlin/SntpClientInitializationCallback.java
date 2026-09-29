package kotlin;

import com.marrow.data.models.pearl.Pearl;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class SntpClientInitializationCallback implements SntpClient1 {
    private final intersects AudioAttributesCompatParcelizer;
    private final getPlatform IconCompatParcelizer;
    private final putBinder RemoteActionCompatParcelizer;
    private final copyWithMutationsApplied write;

    static final class IconCompatParcelizer extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        int AudioAttributesImplApi21Parcelizer;
        /* synthetic */ Object AudioAttributesImplApi26Parcelizer;
        Object IconCompatParcelizer;
        Object RemoteActionCompatParcelizer;
        Object read;
        Object write;

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesImplApi26Parcelizer = obj;
            this.AudioAttributesImplApi21Parcelizer |= Integer.MIN_VALUE;
            return SntpClientInitializationCallback.this.read(null, this);
        }
    }

    @setSdkPayload
    public SntpClientInitializationCallback(putBinder putbinder, intersects intersectsVar, copyWithMutationsApplied copywithmutationsapplied, getPlatform getplatform) {
        toMagicModuleMetaRepoModel.write(putbinder, "");
        toMagicModuleMetaRepoModel.write(intersectsVar, "");
        toMagicModuleMetaRepoModel.write(copywithmutationsapplied, "");
        toMagicModuleMetaRepoModel.write(getplatform, "");
        this.RemoteActionCompatParcelizer = putbinder;
        this.AudioAttributesCompatParcelizer = intersectsVar;
        this.write = copywithmutationsapplied;
        this.IconCompatParcelizer = getplatform;
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;
        private Object AudioAttributesImplApi21Parcelizer;
        private Object AudioAttributesImplApi26Parcelizer;
        private Object AudioAttributesImplBaseParcelizer;
        private Object IconCompatParcelizer;
        private Object MediaBrowserCompatCustomActionResultReceiver;
        private Object MediaBrowserCompatItemReceiver;
        private int RatingCompat;
        private int RemoteActionCompatParcelizer;
        private /* synthetic */ String read;
        private /* synthetic */ long write;

        /* JADX WARN: Code restructure failed: missing block: B:23:0x008e, code lost:
        
            if (r2 != r1) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0128, code lost:
        
            if (r4.read(kotlin.IntermediateLoginResponseBody.RemoteActionCompatParcelizer(new kotlin.loadBitmapFromMetadata(r2.getId(), r2.getAttemptedCount(), r2.getCompletenessScore(), r2.getCorrectnessScore(), r5, r2.getMcqCount(), r2.getLastUpdated(), r2.getCorrectCount(), r2.getWrongCount())), r24) == r1) goto L37;
         */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00a7  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00c6 A[SYNTHETIC] */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r25) {
            /*
                Method dump skipped, instruction units count: 303
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.SntpClientInitializationCallback.RemoteActionCompatParcelizer.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        RemoteActionCompatParcelizer(String str, long j, SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.read = str;
            this.write = j;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return SntpClientInitializationCallback.this.new RemoteActionCompatParcelizer(this.read, this.write, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.SntpClient1
    public final Object IconCompatParcelizer(String str, long j, SampleVideos<? super getShowPopup> sampleVideos) {
        Object objRemoteActionCompatParcelizer = setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.IconCompatParcelizer, new RemoteActionCompatParcelizer(str, j, null), sampleVideos);
        return objRemoteActionCompatParcelizer == getYear.IconCompatParcelizer() ? objRemoteActionCompatParcelizer : getShowPopup.INSTANCE;
    }

    public static final class AudioAttributesCompatParcelizer {
        private final List<dropTable> RemoteActionCompatParcelizer;
        private final List<Pearl> read;
        private final isOpenEnded write;

        /* JADX WARN: Multi-variable type inference failed */
        public AudioAttributesCompatParcelizer(isOpenEnded isopenended, List<dropTable> list, List<? extends Pearl> list2) {
            toMagicModuleMetaRepoModel.write(isopenended, "");
            toMagicModuleMetaRepoModel.write(list, "");
            toMagicModuleMetaRepoModel.write(list2, "");
            this.write = isopenended;
            this.RemoteActionCompatParcelizer = list;
            this.read = list2;
        }

        public final isOpenEnded write() {
            return this.write;
        }

        public final List<dropTable> read() {
            return this.RemoteActionCompatParcelizer;
        }

        public final List<Pearl> RemoteActionCompatParcelizer() {
            return this.read;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AudioAttributesCompatParcelizer)) {
                return false;
            }
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (AudioAttributesCompatParcelizer) obj;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, audioAttributesCompatParcelizer.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, audioAttributesCompatParcelizer.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, audioAttributesCompatParcelizer.read);
        }

        public final int hashCode() {
            return (((this.write.hashCode() * 31) + this.RemoteActionCompatParcelizer.hashCode()) * 31) + this.read.hashCode();
        }

        public final String toString() {
            isOpenEnded isopenended = this.write;
            List<dropTable> list = this.RemoteActionCompatParcelizer;
            List<Pearl> list2 = this.read;
            StringBuilder sb = new StringBuilder("LessonDownloadedData(mcqDownloadedDataRepoModel=");
            sb.append(isopenended);
            sb.append(", lessonAnswerMap=");
            sb.append(list);
            sb.append(", pearls=");
            sb.append(list2);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object read(com.marrow2.data.schema.remote.model.SchemaDetailLessonV2 r11, kotlin.SampleVideos<? super kotlin.getShowPopup> r12) {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.SntpClientInitializationCallback.read(com.marrow2.data.schema.remote.model.SchemaDetailLessonV2, o.SampleVideos):java.lang.Object");
    }
}
