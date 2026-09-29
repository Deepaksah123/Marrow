package kotlin;

import android.os.Handler;
import android.os.Looper;
import kotlin.Metadata;
import kotlin.anyIgnorals;
import kotlin.getApplicationLabel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b&\u0018\u0000 \u0016*\n\b\u0000\u0010\u0002 \u0000*\u00020\u0001*\n\b\u0001\u0010\u0004 \u0001*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005:\u0002\u0019\u0016B1\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00028\u0000H$¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u0010\u001a\u00028\u00012\u0006\u0010\u0007\u001a\u00028\u00002\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u000fH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\bH\u0004¢\u0006\u0004\b\u0019\u0010\u0018R \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR \u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001aR\u0018\u0010\u0019\u001a\u0004\u0018\u00018\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001b"}, d2 = {"Lo/addMediaDescription;", "", "R", "Lo/getApplicationLabel;", "T", "Lo/setSessionInfo;", "Lkotlin/Function1;", "p0", "", "p1", "<init>", "(Lo/getAnswerMap;Lo/getAnswerMap;)V", "Lo/hasGetter;", "AudioAttributesCompatParcelizer", "(Ljava/lang/Object;)Lo/hasGetter;", "Lo/isResolutionNotSupported;", "write", "(Ljava/lang/Object;Lo/isResolutionNotSupported;)Lo/getApplicationLabel;", "", "RemoteActionCompatParcelizer", "(Ljava/lang/Object;)Z", "", "read", "(Ljava/lang/Object;)Ljava/lang/String;", "()V", "IconCompatParcelizer", "Lo/getAnswerMap;", "Lo/getApplicationLabel;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class addMediaDescription<R, T extends getApplicationLabel> implements setSessionInfo<R, T> {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private T IconCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final getAnswerMap<R, T> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final getAnswerMap<T, getShowPopup> AudioAttributesCompatParcelizer;
    private static final read read = new read(null);
    private static final Handler RemoteActionCompatParcelizer = new Handler(Looper.getMainLooper());

    protected abstract hasGetter AudioAttributesCompatParcelizer(R p0);

    /* JADX WARN: Multi-variable type inference failed */
    public addMediaDescription(getAnswerMap<? super R, ? extends T> getanswermap, getAnswerMap<? super T, getShowPopup> getanswermap2) {
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        toMagicModuleMetaRepoModel.write(getanswermap2, "");
        this.RemoteActionCompatParcelizer = getanswermap;
        this.AudioAttributesCompatParcelizer = getanswermap2;
    }

    @Override // kotlin.PlaybackConfigRootRequestBody
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public T read(R p0, isResolutionNotSupported<?> p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        T t = this.IconCompatParcelizer;
        if (t != null) {
            return t;
        }
        if (!RemoteActionCompatParcelizer(p0)) {
            throw new IllegalStateException(read(p0).toString());
        }
        setSessionName setsessionname = setSessionName.INSTANCE;
        setSessionName.read();
        anyIgnorals lifecycle = AudioAttributesCompatParcelizer(p0).getLifecycle();
        if (lifecycle.getAudioAttributesImplApi26Parcelizer() == anyIgnorals.write.AudioAttributesCompatParcelizer) {
            this.IconCompatParcelizer = null;
            return this.RemoteActionCompatParcelizer.invoke(p0);
        }
        T tInvoke = this.RemoteActionCompatParcelizer.invoke(p0);
        lifecycle.IconCompatParcelizer(new IconCompatParcelizer(this));
        this.IconCompatParcelizer = tInvoke;
        return tInvoke;
    }

    protected String read(R p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return "Host view isn't ready. LifecycleViewBindingProperty.isViewInitialized return false";
    }

    public void AudioAttributesCompatParcelizer() {
        SessionDescriptionParser.AudioAttributesCompatParcelizer();
        T t = this.IconCompatParcelizer;
        this.IconCompatParcelizer = null;
        if (t != null) {
            this.AudioAttributesCompatParcelizer.invoke(t);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void write(addMediaDescription addmediadescription) {
        addmediadescription.AudioAttributesCompatParcelizer();
    }

    protected final void IconCompatParcelizer() {
        if (RemoteActionCompatParcelizer.post(new Runnable() { // from class: o.SessionDescription1
            @Override // java.lang.Runnable
            public final void run() {
                addMediaDescription.write(this.write);
            }
        })) {
            return;
        }
        AudioAttributesCompatParcelizer();
    }

    static final class IconCompatParcelizer implements addGetter {
        private final addMediaDescription<?, ?> AudioAttributesCompatParcelizer;

        public IconCompatParcelizer(addMediaDescription<?, ?> addmediadescription) {
            toMagicModuleMetaRepoModel.write(addmediadescription, "");
            this.AudioAttributesCompatParcelizer = addmediadescription;
        }

        @Override // kotlin.addGetter
        public final void AudioAttributesCompatParcelizer(hasGetter hasgetter) {
            toMagicModuleMetaRepoModel.write(hasgetter, "");
            this.AudioAttributesCompatParcelizer.IconCompatParcelizer();
        }

        @Override // kotlin.addGetter
        public final void write(hasGetter hasgetter) {
            toMagicModuleMetaRepoModel.write(hasgetter, "");
        }

        @Override // kotlin.addGetter
        public final void AudioAttributesImplBaseParcelizer(hasGetter hasgetter) {
            toMagicModuleMetaRepoModel.write(hasgetter, "");
        }

        @Override // kotlin.addGetter
        public final void read(hasGetter hasgetter) {
            toMagicModuleMetaRepoModel.write(hasgetter, "");
        }

        @Override // kotlin.addGetter
        public final void IconCompatParcelizer(hasGetter hasgetter) {
            toMagicModuleMetaRepoModel.write(hasgetter, "");
        }

        @Override // kotlin.addGetter
        public final void RemoteActionCompatParcelizer(hasGetter hasgetter) {
            toMagicModuleMetaRepoModel.write(hasgetter, "");
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/addMediaDescription$read;", "", "<init>", "()V", "Landroid/os/Handler;", "RemoteActionCompatParcelizer", "Landroid/os/Handler;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    static final class read {
        private read() {
        }

        public /* synthetic */ read(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    protected boolean RemoteActionCompatParcelizer(R p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return true;
    }
}
