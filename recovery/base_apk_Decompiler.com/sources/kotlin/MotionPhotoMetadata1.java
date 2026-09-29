package kotlin;

import android.app.Application;
import android.content.Context;
import com.google.firebase.FirebaseApp;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.parseSpliceTime;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB7\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000eH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0010\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0010\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0010\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001dR\u0014\u0010\u0018\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010 R\u0014\u0010\u0013\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\"\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)\u0082\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lo/MotionPhotoMetadata1;", "", "Lcom/google/firebase/FirebaseApp;", "p0", "Lo/hasSamples;", "p1", "Lo/getPlatform;", "p2", "p3", "Lo/onInputBufferAvailable;", "Lo/DrmUtilApi18;", "p4", "<init>", "(Lcom/google/firebase/FirebaseApp;Lo/hasSamples;Lo/getPlatform;Lo/getPlatform;Lo/onInputBufferAvailable;)V", "Lo/SpliceInsertCommand1;", "", "IconCompatParcelizer", "(Lo/SpliceInsertCommand1;Lo/SampleVideos;)Ljava/lang/Object;", "Lo/parseSpliceTime;", "AudioAttributesCompatParcelizer", "(Lo/parseSpliceTime;)V", "", "()Z", "Lo/TextInformationFrame1;", "RemoteActionCompatParcelizer", "Lo/TextInformationFrame1;", "write", "Lo/PrivFrame1;", "Lo/PrivFrame1;", "Lcom/google/firebase/FirebaseApp;", "read", "Lo/SmtaMetadataEntry1;", "Lo/SmtaMetadataEntry1;", "Lo/SpliceInsertCommandComponentSplice;", "MediaBrowserCompatCustomActionResultReceiver", "Lo/SpliceInsertCommandComponentSplice;", "Lo/ensureInitialized;", "AudioAttributesImplBaseParcelizer", "Lo/ensureInitialized;", "Lo/DefaultDownloadIndex;", "MediaBrowserCompatItemReceiver", "Lo/DefaultDownloadIndex;"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class MotionPhotoMetadata1 {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final SmtaMetadataEntry1 RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final ensureInitialized MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final FirebaseApp read;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final SpliceInsertCommandComponentSplice AudioAttributesCompatParcelizer;
    private final DefaultDownloadIndex MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final TextInformationFrame1 write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final PrivFrame1 IconCompatParcelizer;

    static final class RemoteActionCompatParcelizer extends getTotalMcq {
        /* synthetic */ Object AudioAttributesCompatParcelizer;
        int IconCompatParcelizer;
        Object read;
        Object write;

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesCompatParcelizer = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            return MotionPhotoMetadata1.this.IconCompatParcelizer(null, this);
        }
    }

    public MotionPhotoMetadata1(FirebaseApp firebaseApp, hasSamples hassamples, getPlatform getplatform, getPlatform getplatform2, onInputBufferAvailable<DrmUtilApi18> oninputbufferavailable) {
        toMagicModuleMetaRepoModel.write(firebaseApp, "");
        toMagicModuleMetaRepoModel.write(hassamples, "");
        toMagicModuleMetaRepoModel.write(getplatform, "");
        toMagicModuleMetaRepoModel.write(getplatform2, "");
        toMagicModuleMetaRepoModel.write(oninputbufferavailable, "");
        this.read = firebaseApp;
        PrivateCommand1 privateCommand1 = PrivateCommand1.INSTANCE;
        TextInformationFrame1 textInformationFrame1AudioAttributesCompatParcelizer = PrivateCommand1.AudioAttributesCompatParcelizer(firebaseApp);
        this.write = textInformationFrame1AudioAttributesCompatParcelizer;
        Context contextAudioAttributesCompatParcelizer = firebaseApp.AudioAttributesCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextAudioAttributesCompatParcelizer, "");
        getPlatform getplatform3 = getplatform;
        ensureInitialized ensureinitialized = new ensureInitialized(contextAudioAttributesCompatParcelizer, getplatform2, getplatform3, hassamples, textInformationFrame1AudioAttributesCompatParcelizer);
        this.MediaBrowserCompatCustomActionResultReceiver = ensureinitialized;
        SpliceScheduleCommand1 spliceScheduleCommand1 = new SpliceScheduleCommand1();
        this.MediaBrowserCompatItemReceiver = spliceScheduleCommand1;
        PrivFrame1 privFrame1 = new PrivFrame1(oninputbufferavailable);
        this.IconCompatParcelizer = privFrame1;
        this.RemoteActionCompatParcelizer = new SmtaMetadataEntry1(hassamples, privFrame1);
        SpliceInsertCommandComponentSplice spliceInsertCommandComponentSplice = new SpliceInsertCommandComponentSplice(IconCompatParcelizer(), spliceScheduleCommand1, null, 4, null);
        this.AudioAttributesCompatParcelizer = spliceInsertCommandComponentSplice;
        SpliceScheduleCommandEvent spliceScheduleCommandEvent = new SpliceScheduleCommandEvent(spliceScheduleCommand1, getplatform3, new IconCompatParcelizer(), ensureinitialized, spliceInsertCommandComponentSplice);
        Context applicationContext = firebaseApp.AudioAttributesCompatParcelizer().getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(spliceScheduleCommandEvent.RemoteActionCompatParcelizer());
        } else {
            Objects.toString(applicationContext.getClass());
        }
    }

    public static final class IconCompatParcelizer implements SpliceNullCommand1 {
        IconCompatParcelizer() {
        }

        @Override // kotlin.SpliceNullCommand1
        public final Object write(SpliceInsertCommand1 spliceInsertCommand1, SampleVideos<? super getShowPopup> sampleVideos) {
            Object objIconCompatParcelizer = MotionPhotoMetadata1.this.IconCompatParcelizer(spliceInsertCommand1, sampleVideos);
            return objIconCompatParcelizer == getYear.IconCompatParcelizer() ? objIconCompatParcelizer : getShowPopup.INSTANCE;
        }
    }

    public final void AudioAttributesCompatParcelizer(parseSpliceTime p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        decodeStreamKeys decodestreamkeys = decodeStreamKeys.INSTANCE;
        decodeStreamKeys.AudioAttributesCompatParcelizer(p0);
        Objects.toString(p0.IconCompatParcelizer());
        p0.RemoteActionCompatParcelizer();
        if (this.AudioAttributesCompatParcelizer.write()) {
            p0.AudioAttributesCompatParcelizer(new parseSpliceTime.write(this.AudioAttributesCompatParcelizer.read().IconCompatParcelizer()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f9, code lost:
    
        if (r11.read(r9, r0) == r1) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object IconCompatParcelizer(kotlin.SpliceInsertCommand1 r10, kotlin.SampleVideos<? super kotlin.getShowPopup> r11) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.MotionPhotoMetadata1.IconCompatParcelizer(o.SpliceInsertCommand1, o.SampleVideos):java.lang.Object");
    }

    private final boolean IconCompatParcelizer() {
        return Math.random() <= this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer();
    }
}
