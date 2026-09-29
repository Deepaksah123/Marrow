package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0017¢\u0006\u0004\b\u0012\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u000f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001aR\u0016\u0010\u0015\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u001dR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001fR\u0017\u0010#\u001a\u00020 8\u0007¢\u0006\f\n\u0004\b\u0015\u0010!\u001a\u0004\b\u0015\u0010\""}, d2 = {"Lo/JFunction2;", "Lo/allocReadIOBuffer;", "", "p0", "Lo/setLayoutParams;", "p1", "Lo/switchToNext;", "p2", "Lo/Worker;", "p3", "<init>", "(JLo/setLayoutParams;JLo/Worker;Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "", "o_", "()V", "IconCompatParcelizer", "AudioAttributesCompatParcelizer", "Lo/deserializeFromNumber;", "read", "(Lo/deserializeFromNumber;)V", "Lo/isAbstract;", "RemoteActionCompatParcelizer", "(Lo/isAbstract;)V", "Lo/findSetterInfo;", "(Lo/findSetterInfo;)V", "write", "J", "AudioAttributesImplApi26Parcelizer", "Lo/setLayoutParams;", "Lo/Worker;", "Lo/clearModelFromStaging;", "Lo/clearModelFromStaging;", "Lo/_handleOddName;", "Lo/_handleOddName;", "()Lo/_handleOddName;", "AudioAttributesImplBaseParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class JFunction2 implements allocReadIOBuffer {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private Worker RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final setLayoutParams AudioAttributesCompatParcelizer;
    private final long IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final _handleOddName AudioAttributesImplBaseParcelizer;
    private clearModelFromStaging read;
    private final long write;

    private JFunction2(long j, setLayoutParams setlayoutparams, long j2, Worker worker) {
        this.write = j;
        this.AudioAttributesCompatParcelizer = setlayoutparams;
        this.IconCompatParcelizer = j2;
        this.RemoteActionCompatParcelizer = worker;
        this.AudioAttributesImplBaseParcelizer = findObjectId.read$default(OverwritingInputMerger.IconCompatParcelizer(setlayoutparams, j, new getCreatedOnDateMs() { // from class: o.CoroutineWorker
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return JFunction2.write(this.AudioAttributesCompatParcelizer);
            }
        }), extractScalarFromObject.INSTANCE.RemoteActionCompatParcelizer(), false, 2, null);
    }

    public /* synthetic */ JFunction2(long j, setLayoutParams setlayoutparams, long j2, Worker worker, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(j, setlayoutparams, j2, (i & 8) != 0 ? Worker.INSTANCE.RemoteActionCompatParcelizer() : worker, null);
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final _handleOddName getAudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final isAbstract write(JFunction2 jFunction2) {
        return jFunction2.RemoteActionCompatParcelizer.getAudioAttributesCompatParcelizer();
    }

    @Override // kotlin.allocReadIOBuffer
    public final void o_() {
        this.read = this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(new addCurrentlyStagedModelIfExists(this.write, new getCreatedOnDateMs() { // from class: o.test
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return JFunction2.read(this.IconCompatParcelizer);
            }
        }, new getCreatedOnDateMs() { // from class: o.apply
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return JFunction2.AudioAttributesImplApi21Parcelizer(this.read);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final isAbstract read(JFunction2 jFunction2) {
        return jFunction2.RemoteActionCompatParcelizer.getAudioAttributesCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final deserializeFromNumber AudioAttributesImplApi21Parcelizer(JFunction2 jFunction2) {
        return jFunction2.RemoteActionCompatParcelizer.getWrite();
    }

    @Override // kotlin.allocReadIOBuffer
    public final void IconCompatParcelizer() {
        clearModelFromStaging clearmodelfromstaging = this.read;
        if (clearmodelfromstaging != null) {
            this.AudioAttributesCompatParcelizer.IconCompatParcelizer(clearmodelfromstaging);
            this.read = null;
        }
    }

    @Override // kotlin.allocReadIOBuffer
    public final void AudioAttributesCompatParcelizer() {
        clearModelFromStaging clearmodelfromstaging = this.read;
        if (clearmodelfromstaging != null) {
            this.AudioAttributesCompatParcelizer.IconCompatParcelizer(clearmodelfromstaging);
            this.read = null;
        }
    }

    public final void read(deserializeFromNumber p0) {
        deserializeFromNumber write = this.RemoteActionCompatParcelizer.getWrite();
        if (write != null && !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(write.getIconCompatParcelizer().getWrite(), p0.getIconCompatParcelizer().getWrite())) {
            this.AudioAttributesCompatParcelizer.IconCompatParcelizer(this.write);
        }
        this.RemoteActionCompatParcelizer = Worker.IconCompatParcelizer$default(this.RemoteActionCompatParcelizer, null, p0, 1, null);
    }

    public final void RemoteActionCompatParcelizer(isAbstract p0) {
        this.RemoteActionCompatParcelizer = Worker.IconCompatParcelizer$default(this.RemoteActionCompatParcelizer, p0, null, 2, null);
        this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(this.write);
    }

    public final void read(findSetterInfo p0) {
        int read;
        int read2;
        getFirstIndexOfModelInBuildingList getfirstindexofmodelinbuildinglist = this.AudioAttributesCompatParcelizer.read().read(this.write);
        if (getfirstindexofmodelinbuildinglist != null) {
            if (!getfirstindexofmodelinbuildinglist.getRemoteActionCompatParcelizer()) {
                read = getfirstindexofmodelinbuildinglist.getAudioAttributesCompatParcelizer().getRead();
            } else {
                read = getfirstindexofmodelinbuildinglist.getIconCompatParcelizer().getRead();
            }
            if (!getfirstindexofmodelinbuildinglist.getRemoteActionCompatParcelizer()) {
                read2 = getfirstindexofmodelinbuildinglist.getIconCompatParcelizer().getRead();
            } else {
                read2 = getfirstindexofmodelinbuildinglist.getAudioAttributesCompatParcelizer().getRead();
            }
            if (read != read2) {
                clearModelFromStaging clearmodelfromstaging = this.read;
                int iIconCompatParcelizer = clearmodelfromstaging != null ? clearmodelfromstaging.IconCompatParcelizer() : 0;
                removeSoftRefsClearedByGc removesoftrefsclearedbygcRemoteActionCompatParcelizer = this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(getQues.RemoteActionCompatParcelizer(read, iIconCompatParcelizer), getQues.RemoteActionCompatParcelizer(read2, iIconCompatParcelizer));
                if (removesoftrefsclearedbygcRemoteActionCompatParcelizer == null) {
                    return;
                }
                if (!this.RemoteActionCompatParcelizer.write()) {
                    findSetterInfo.AudioAttributesCompatParcelizer$default(p0, removesoftrefsclearedbygcRemoteActionCompatParcelizer, this.IconCompatParcelizer, BitmapDescriptorFactory.HUE_RED, (findViews) null, (switchAndReturnNext) null, 0, 60, (Object) null);
                    return;
                }
                float fIntBitsToFloat = Float.intBitsToFloat((int) (p0.MediaBrowserCompatCustomActionResultReceiver() >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) p0.MediaBrowserCompatCustomActionResultReceiver());
                int iIconCompatParcelizer2 = ReadConstrainedTextBuffer.INSTANCE.IconCompatParcelizer();
                findSerializationTyping iconCompatParcelizer = p0.getIconCompatParcelizer();
                long jAudioAttributesCompatParcelizer = iconCompatParcelizer.AudioAttributesCompatParcelizer();
                iconCompatParcelizer.IconCompatParcelizer().IconCompatParcelizer();
                try {
                    iconCompatParcelizer.getRemoteActionCompatParcelizer().AudioAttributesCompatParcelizer(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, fIntBitsToFloat, fIntBitsToFloat2, iIconCompatParcelizer2);
                    findSetterInfo.AudioAttributesCompatParcelizer$default(p0, removesoftrefsclearedbygcRemoteActionCompatParcelizer, this.IconCompatParcelizer, BitmapDescriptorFactory.HUE_RED, (findViews) null, (switchAndReturnNext) null, 0, 60, (Object) null);
                } finally {
                    iconCompatParcelizer.IconCompatParcelizer().AudioAttributesCompatParcelizer();
                    iconCompatParcelizer.IconCompatParcelizer(jAudioAttributesCompatParcelizer);
                }
            }
        }
    }

    public /* synthetic */ JFunction2(long j, setLayoutParams setlayoutparams, long j2, Worker worker, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(j, setlayoutparams, j2, worker);
    }
}
