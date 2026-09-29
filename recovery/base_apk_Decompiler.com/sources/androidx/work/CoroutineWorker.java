package androidx.work;

import android.content.Context;
import in.juspay.hyper.constants.LogCategory;
import kotlin.CurrentQuery;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.Metadata;
import kotlin.Mp4ExtractorExternalSyntheticLambda0;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.TopUserCompanion;
import kotlin.eb;
import kotlin.getCollegeName;
import kotlin.getMagicModuleStats;
import kotlin.getPlatform;
import kotlin.getShowPopup;
import kotlin.getUserConfig;
import kotlin.getYear;
import kotlin.i;
import kotlin.j;
import kotlin.setMbbsVerificationYear;
import kotlin.setPassingYear;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001:\u0001\u0011B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\tH¦@¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\b¢\u0006\u0004\b\u0011\u0010\u000bR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0012R\u001a\u0010\f\u001a\u00020\u00138\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Landroidx/work/CoroutineWorker;", "Lo/j;", "Landroid/content/Context;", "p0", "Landroidx/work/WorkerParameters;", "p1", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Lo/Mp4ExtractorExternalSyntheticLambda0;", "Lo/j$RemoteActionCompatParcelizer;", "RemoteActionCompatParcelizer", "()Lo/Mp4ExtractorExternalSyntheticLambda0;", "IconCompatParcelizer", "(Lo/SampleVideos;)Ljava/lang/Object;", "Lo/eb;", "write", "()Ljava/lang/Object;", "read", "Landroidx/work/WorkerParameters;", "Lo/getPlatform;", "Lo/getPlatform;", "AudioAttributesCompatParcelizer", "()Lo/getPlatform;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class CoroutineWorker extends j {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final getPlatform IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final WorkerParameters RemoteActionCompatParcelizer;

    public abstract Object IconCompatParcelizer(SampleVideos<? super j.RemoteActionCompatParcelizer> sampleVideos);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(workerParameters, "");
        this.RemoteActionCompatParcelizer = workerParameters;
        this.IconCompatParcelizer = read.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public getPlatform getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // kotlin.j
    public final Mp4ExtractorExternalSyntheticLambda0<j.RemoteActionCompatParcelizer> RemoteActionCompatParcelizer() {
        getPlatform getplatformIconCompatParcelizer;
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getIconCompatParcelizer(), read.IconCompatParcelizer)) {
            getplatformIconCompatParcelizer = getIconCompatParcelizer();
        } else {
            getplatformIconCompatParcelizer = this.RemoteActionCompatParcelizer.IconCompatParcelizer();
        }
        toMagicModuleMetaRepoModel.write(getplatformIconCompatParcelizer);
        return i.write(getplatformIconCompatParcelizer.plus(getUserConfig.RemoteActionCompatParcelizer((setPassingYear) null)), getCollegeName.write, new AudioAttributesCompatParcelizer(null));
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super j.RemoteActionCompatParcelizer>, Object> {
        private int AudioAttributesCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
                return obj;
            }
            SdkPayloadData.IconCompatParcelizer(obj);
            this.AudioAttributesCompatParcelizer = 1;
            Object objIconCompatParcelizer2 = CoroutineWorker.this.IconCompatParcelizer(this);
            return objIconCompatParcelizer2 == objIconCompatParcelizer ? objIconCompatParcelizer : objIconCompatParcelizer2;
        }

        AudioAttributesCompatParcelizer(SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return CoroutineWorker.this.new AudioAttributesCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super j.RemoteActionCompatParcelizer> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private static /* synthetic */ Object MediaDescriptionCompat() {
        throw new IllegalStateException("Not implemented");
    }

    static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super eb>, Object> {
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
            this.write = 1;
            Object objWrite = CoroutineWorker.write();
            return objWrite == objIconCompatParcelizer ? objIconCompatParcelizer : objWrite;
        }

        write(SampleVideos<? super write> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return CoroutineWorker.this.new write(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super eb> sampleVideos) {
            return ((write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.j
    public final Mp4ExtractorExternalSyntheticLambda0<eb> read() {
        return i.write(getIconCompatParcelizer().plus(getUserConfig.RemoteActionCompatParcelizer((setPassingYear) null)), getCollegeName.write, new write(null));
    }

    public static Object write() {
        return MediaDescriptionCompat();
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u00060\fj\u0002`\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\nH\u0016R\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Landroidx/work/CoroutineWorker$DeprecatedDispatcher;", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "()V", "dispatcher", "getDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "dispatch", "", LogCategory.CONTEXT, "Lkotlin/coroutines/CoroutineContext;", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "isDispatchNeeded", "", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class read extends getPlatform {
        public static final read IconCompatParcelizer = new read();
        private static final getPlatform write = setMbbsVerificationYear.IconCompatParcelizer();

        private read() {
        }

        @Override // kotlin.getPlatform
        public final void RemoteActionCompatParcelizer(CurrentQuery currentQuery, Runnable runnable) {
            toMagicModuleMetaRepoModel.write(currentQuery, "");
            toMagicModuleMetaRepoModel.write(runnable, "");
            write.RemoteActionCompatParcelizer(currentQuery, runnable);
        }

        @Override // kotlin.getPlatform
        public final boolean IconCompatParcelizer(CurrentQuery currentQuery) {
            toMagicModuleMetaRepoModel.write(currentQuery, "");
            return write.IconCompatParcelizer(currentQuery);
        }
    }
}
