package kotlin;

import android.os.Build;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.anyIgnorals;
import kotlin.onSetRating;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0004\u000f\u0016\u001d\u0014B\u0015\b\u0016\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u000f\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000f\u0010\u0012J\u000f\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\f\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u001bJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\u0013R\u0016\u0010\u001d\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001cR\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001eR\u0016\u0010\f\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u001cR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001fR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010 R\u0018\u0010$\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\n0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001c\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*"}, d2 = {"Lo/onSetRating;", "", "Ljava/lang/Runnable;", "p0", "<init>", "(Ljava/lang/Runnable;)V", "Lo/wrapAsJsonMappingException;", "", "p1", "(Ljava/lang/Runnable;B)V", "Lo/onRemoveQueueItemAt;", "", "read", "(Lo/onRemoveQueueItemAt;)V", "Lo/hasGetter;", "AudioAttributesCompatParcelizer", "(Lo/hasGetter;Lo/onRemoveQueueItemAt;)V", "Lo/MediaBrowserCompatItemReceiver;", "(Lo/onRemoveQueueItemAt;)Lo/MediaBrowserCompatItemReceiver;", "()V", "RemoteActionCompatParcelizer", "Lo/AudioAttributesImplApi26Parcelizer;", "IconCompatParcelizer", "(Lo/AudioAttributesImplApi26Parcelizer;)V", "Landroid/window/OnBackInvokedDispatcher;", "by_", "(Landroid/window/OnBackInvokedDispatcher;)V", "(Z)V", "Z", "write", "Ljava/lang/Runnable;", "Lo/onRemoveQueueItemAt;", "Landroid/window/OnBackInvokedDispatcher;", "Landroid/window/OnBackInvokedCallback;", "AudioAttributesImplApi21Parcelizer", "Landroid/window/OnBackInvokedCallback;", "AudioAttributesImplBaseParcelizer", "Lo/setCardContent;", "MediaBrowserCompatCustomActionResultReceiver", "Lo/setCardContent;", "AudioAttributesImplApi26Parcelizer", "MediaBrowserCompatItemReceiver", "Lo/wrapAsJsonMappingException;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class onSetRating {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private boolean write;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private OnBackInvokedCallback AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private OnBackInvokedDispatcher RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final setCardContent<onRemoveQueueItemAt> AudioAttributesImplApi26Parcelizer;
    private final wrapAsJsonMappingException<Boolean> MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private boolean read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final Runnable IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private onRemoveQueueItemAt AudioAttributesCompatParcelizer;

    private onSetRating(Runnable runnable, byte b) {
        OnBackInvokedCallback onBackInvokedCallbackBz_;
        this.IconCompatParcelizer = runnable;
        this.MediaBrowserCompatItemReceiver = null;
        this.AudioAttributesImplApi26Parcelizer = new setCardContent<>();
        if (Build.VERSION.SDK_INT >= 33) {
            if (Build.VERSION.SDK_INT >= 34) {
                onBackInvokedCallbackBz_ = IconCompatParcelizer.INSTANCE.bA_(new AnonymousClass5(), new AnonymousClass4(), new AnonymousClass1(), new AnonymousClass3());
            } else {
                onBackInvokedCallbackBz_ = AudioAttributesCompatParcelizer.INSTANCE.bz_(new AnonymousClass2());
            }
            this.AudioAttributesImplBaseParcelizer = onBackInvokedCallbackBz_;
        }
    }

    public /* synthetic */ onSetRating(Runnable runnable, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? null : runnable);
    }

    public onSetRating(Runnable runnable) {
        this(runnable, (byte) 0);
    }

    public final void by_(OnBackInvokedDispatcher p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.RemoteActionCompatParcelizer = p0;
        RemoteActionCompatParcelizer(this.read);
    }

    private final void RemoteActionCompatParcelizer(boolean p0) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.RemoteActionCompatParcelizer;
        OnBackInvokedCallback onBackInvokedCallback = this.AudioAttributesImplBaseParcelizer;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        if (p0 && !this.write) {
            AudioAttributesCompatParcelizer.INSTANCE.write(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.write = true;
        } else {
            if (p0 || !this.write) {
                return;
            }
            AudioAttributesCompatParcelizer.INSTANCE.IconCompatParcelizer(onBackInvokedDispatcher, onBackInvokedCallback);
            this.write = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void read() {
        boolean z = this.read;
        setCardContent<onRemoveQueueItemAt> setcardcontent = this.AudioAttributesImplApi26Parcelizer;
        boolean z2 = false;
        if (!(setcardcontent instanceof Collection) || !setcardcontent.isEmpty()) {
            Iterator<onRemoveQueueItemAt> it = setcardcontent.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (it.next().getIsEnabled()) {
                    z2 = true;
                    break;
                }
            }
        }
        this.read = z2;
        if (z2 != z) {
            wrapAsJsonMappingException<Boolean> wrapasjsonmappingexception = this.MediaBrowserCompatItemReceiver;
            if (wrapasjsonmappingexception != null) {
                wrapasjsonmappingexception.AudioAttributesCompatParcelizer(Boolean.valueOf(z2));
            }
            if (Build.VERSION.SDK_INT >= 33) {
                RemoteActionCompatParcelizer(z2);
            }
        }
    }

    /* JADX INFO: renamed from: o.onSetRating$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "read", "()V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<getShowPopup> {
        @Override // kotlin.getCreatedOnDateMs
        public final /* synthetic */ getShowPopup invoke() {
            read();
            return getShowPopup.INSTANCE;
        }

        public final void read() {
            onSetRating.this.RemoteActionCompatParcelizer();
        }

        AnonymousClass1() {
            super(0);
        }
    }

    /* JADX INFO: renamed from: o.onSetRating$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "IconCompatParcelizer", "()V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<getShowPopup> {
        @Override // kotlin.getCreatedOnDateMs
        public final /* synthetic */ getShowPopup invoke() {
            IconCompatParcelizer();
            return getShowPopup.INSTANCE;
        }

        public final void IconCompatParcelizer() {
            onSetRating.this.AudioAttributesCompatParcelizer();
        }

        AnonymousClass3() {
            super(0);
        }
    }

    /* JADX INFO: renamed from: o.onSetRating$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/AudioAttributesImplApi26Parcelizer;", "p0", "", "AudioAttributesCompatParcelizer", "(Lo/AudioAttributesImplApi26Parcelizer;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass4 extends MagicModuleUseCase implements getAnswerMap<kotlin.AudioAttributesImplApi26Parcelizer, getShowPopup> {
        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(kotlin.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer) {
            AudioAttributesCompatParcelizer(audioAttributesImplApi26Parcelizer);
            return getShowPopup.INSTANCE;
        }

        public final void AudioAttributesCompatParcelizer(kotlin.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer) {
            toMagicModuleMetaRepoModel.write(audioAttributesImplApi26Parcelizer, "");
            onSetRating.this.IconCompatParcelizer(audioAttributesImplApi26Parcelizer);
        }

        AnonymousClass4() {
            super(1);
        }
    }

    /* JADX INFO: renamed from: o.onSetRating$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/AudioAttributesImplApi26Parcelizer;", "p0", "", "IconCompatParcelizer", "(Lo/AudioAttributesImplApi26Parcelizer;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass5 extends MagicModuleUseCase implements getAnswerMap<kotlin.AudioAttributesImplApi26Parcelizer, getShowPopup> {
        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(kotlin.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer) {
            IconCompatParcelizer(audioAttributesImplApi26Parcelizer);
            return getShowPopup.INSTANCE;
        }

        public final void IconCompatParcelizer(kotlin.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer) {
            toMagicModuleMetaRepoModel.write(audioAttributesImplApi26Parcelizer, "");
            onSetRating.this.read(audioAttributesImplApi26Parcelizer);
        }

        AnonymousClass5() {
            super(1);
        }
    }

    /* JADX INFO: renamed from: o.onSetRating$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "write", "()V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass2 extends MagicModuleUseCase implements getCreatedOnDateMs<getShowPopup> {
        @Override // kotlin.getCreatedOnDateMs
        public final /* synthetic */ getShowPopup invoke() {
            write();
            return getShowPopup.INSTANCE;
        }

        public final void write() {
            onSetRating.this.RemoteActionCompatParcelizer();
        }

        AnonymousClass2() {
            super(0);
        }
    }

    public final void read(onRemoveQueueItemAt p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        AudioAttributesCompatParcelizer(p0);
    }

    public final MediaBrowserCompatItemReceiver AudioAttributesCompatParcelizer(onRemoveQueueItemAt p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.AudioAttributesImplApi26Parcelizer.add(p0);
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer(this, p0);
        p0.addCancellable(remoteActionCompatParcelizer);
        read();
        p0.setEnabledChangedCallback$activity_release(new AudioAttributesImplApi26Parcelizer(this));
        return remoteActionCompatParcelizer;
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    final /* synthetic */ class AudioAttributesImplApi26Parcelizer extends MagicModuleRepositoryImpl_Factory implements getCreatedOnDateMs<getShowPopup> {
        @Override // kotlin.getCreatedOnDateMs
        public final /* synthetic */ getShowPopup invoke() {
            read();
            return getShowPopup.INSTANCE;
        }

        public final void read() {
            ((onSetRating) this.AudioAttributesImplApi26Parcelizer).read();
        }

        AudioAttributesImplApi26Parcelizer(Object obj) {
            super(0, obj, onSetRating.class, "read", "read()V", 0);
        }
    }

    public final void AudioAttributesCompatParcelizer(hasGetter p0, onRemoveQueueItemAt p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        anyIgnorals lifecycle = p0.getLifecycle();
        if (lifecycle.read() == anyIgnorals.write.AudioAttributesCompatParcelizer) {
            return;
        }
        p1.addCancellable(new write(this, lifecycle, p1));
        read();
        p1.setEnabledChangedCallback$activity_release(new read(this));
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    final /* synthetic */ class read extends MagicModuleRepositoryImpl_Factory implements getCreatedOnDateMs<getShowPopup> {
        public final void RemoteActionCompatParcelizer() {
            ((onSetRating) this.AudioAttributesImplApi26Parcelizer).read();
        }

        @Override // kotlin.getCreatedOnDateMs
        public final /* synthetic */ getShowPopup invoke() {
            RemoteActionCompatParcelizer();
            return getShowPopup.INSTANCE;
        }

        read(Object obj) {
            super(0, obj, onSetRating.class, "read", "read()V", 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void read(kotlin.AudioAttributesImplApi26Parcelizer p0) {
        onRemoveQueueItemAt onremovequeueitematPrevious;
        setCardContent<onRemoveQueueItemAt> setcardcontent = this.AudioAttributesImplApi26Parcelizer;
        ListIterator<onRemoveQueueItemAt> listIterator = setcardcontent.listIterator(setcardcontent.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                onremovequeueitematPrevious = null;
                break;
            } else {
                onremovequeueitematPrevious = listIterator.previous();
                if (onremovequeueitematPrevious.getIsEnabled()) {
                    break;
                }
            }
        }
        onRemoveQueueItemAt onremovequeueitemat = onremovequeueitematPrevious;
        if (this.AudioAttributesCompatParcelizer != null) {
            AudioAttributesCompatParcelizer();
        }
        this.AudioAttributesCompatParcelizer = onremovequeueitemat;
        if (onremovequeueitemat != null) {
            onremovequeueitemat.handleOnBackStarted(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void IconCompatParcelizer(kotlin.AudioAttributesImplApi26Parcelizer p0) {
        onRemoveQueueItemAt onremovequeueitematPrevious;
        onRemoveQueueItemAt onremovequeueitemat = this.AudioAttributesCompatParcelizer;
        if (onremovequeueitemat == null) {
            setCardContent<onRemoveQueueItemAt> setcardcontent = this.AudioAttributesImplApi26Parcelizer;
            ListIterator<onRemoveQueueItemAt> listIterator = setcardcontent.listIterator(setcardcontent.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    onremovequeueitematPrevious = null;
                    break;
                } else {
                    onremovequeueitematPrevious = listIterator.previous();
                    if (onremovequeueitematPrevious.getIsEnabled()) {
                        break;
                    }
                }
            }
            onremovequeueitemat = onremovequeueitematPrevious;
        }
        if (onremovequeueitemat != null) {
            onremovequeueitemat.handleOnBackProgressed(p0);
        }
    }

    public final void RemoteActionCompatParcelizer() {
        onRemoveQueueItemAt onremovequeueitematPrevious;
        onRemoveQueueItemAt onremovequeueitemat = this.AudioAttributesCompatParcelizer;
        if (onremovequeueitemat == null) {
            setCardContent<onRemoveQueueItemAt> setcardcontent = this.AudioAttributesImplApi26Parcelizer;
            ListIterator<onRemoveQueueItemAt> listIterator = setcardcontent.listIterator(setcardcontent.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    onremovequeueitematPrevious = null;
                    break;
                } else {
                    onremovequeueitematPrevious = listIterator.previous();
                    if (onremovequeueitematPrevious.getIsEnabled()) {
                        break;
                    }
                }
            }
            onremovequeueitemat = onremovequeueitematPrevious;
        }
        this.AudioAttributesCompatParcelizer = null;
        if (onremovequeueitemat != null) {
            onremovequeueitemat.handleOnBackPressed();
            return;
        }
        Runnable runnable = this.IconCompatParcelizer;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AudioAttributesCompatParcelizer() {
        onRemoveQueueItemAt onremovequeueitematPrevious;
        onRemoveQueueItemAt onremovequeueitemat = this.AudioAttributesCompatParcelizer;
        if (onremovequeueitemat == null) {
            setCardContent<onRemoveQueueItemAt> setcardcontent = this.AudioAttributesImplApi26Parcelizer;
            ListIterator<onRemoveQueueItemAt> listIterator = setcardcontent.listIterator(setcardcontent.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    onremovequeueitematPrevious = null;
                    break;
                } else {
                    onremovequeueitematPrevious = listIterator.previous();
                    if (onremovequeueitematPrevious.getIsEnabled()) {
                        break;
                    }
                }
            }
            onremovequeueitemat = onremovequeueitematPrevious;
        }
        this.AudioAttributesCompatParcelizer = null;
        if (onremovequeueitemat != null) {
            onremovequeueitemat.handleOnBackCancelled();
        }
    }

    final class RemoteActionCompatParcelizer implements MediaBrowserCompatItemReceiver {
        final /* synthetic */ onSetRating AudioAttributesCompatParcelizer;
        private final onRemoveQueueItemAt RemoteActionCompatParcelizer;

        public RemoteActionCompatParcelizer(onSetRating onsetrating, onRemoveQueueItemAt onremovequeueitemat) {
            toMagicModuleMetaRepoModel.write(onremovequeueitemat, "");
            this.AudioAttributesCompatParcelizer = onsetrating;
            this.RemoteActionCompatParcelizer = onremovequeueitemat;
        }

        @Override // kotlin.MediaBrowserCompatItemReceiver
        public final void RemoteActionCompatParcelizer() {
            this.AudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer.remove(this.RemoteActionCompatParcelizer);
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer)) {
                this.RemoteActionCompatParcelizer.handleOnBackCancelled();
                this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer = null;
            }
            this.RemoteActionCompatParcelizer.removeCancellable(this);
            getCreatedOnDateMs<getShowPopup> enabledChangedCallback$activity_release = this.RemoteActionCompatParcelizer.getEnabledChangedCallback$activity_release();
            if (enabledChangedCallback$activity_release != null) {
                enabledChangedCallback$activity_release.invoke();
            }
            this.RemoteActionCompatParcelizer.setEnabledChangedCallback$activity_release(null);
        }
    }

    final class write implements findAccess, MediaBrowserCompatItemReceiver {
        final /* synthetic */ onSetRating AudioAttributesCompatParcelizer;
        private final anyIgnorals IconCompatParcelizer;
        private final onRemoveQueueItemAt RemoteActionCompatParcelizer;
        private MediaBrowserCompatItemReceiver read;

        public write(onSetRating onsetrating, anyIgnorals anyignorals, onRemoveQueueItemAt onremovequeueitemat) {
            toMagicModuleMetaRepoModel.write(anyignorals, "");
            toMagicModuleMetaRepoModel.write(onremovequeueitemat, "");
            this.AudioAttributesCompatParcelizer = onsetrating;
            this.IconCompatParcelizer = anyignorals;
            this.RemoteActionCompatParcelizer = onremovequeueitemat;
            anyignorals.IconCompatParcelizer(this);
        }

        @Override // kotlin.findAccess
        public final void read(hasGetter hasgetter, anyIgnorals.read readVar) {
            toMagicModuleMetaRepoModel.write(hasgetter, "");
            toMagicModuleMetaRepoModel.write(readVar, "");
            if (readVar == anyIgnorals.read.ON_START) {
                this.read = this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer);
                return;
            }
            if (readVar == anyIgnorals.read.ON_STOP) {
                MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver = this.read;
                if (mediaBrowserCompatItemReceiver != null) {
                    mediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer();
                    return;
                }
                return;
            }
            if (readVar == anyIgnorals.read.ON_DESTROY) {
                RemoteActionCompatParcelizer();
            }
        }

        @Override // kotlin.MediaBrowserCompatItemReceiver
        public final void RemoteActionCompatParcelizer() {
            this.IconCompatParcelizer.AudioAttributesCompatParcelizer(this);
            this.RemoteActionCompatParcelizer.removeCancellable(this);
            MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver = this.read;
            if (mediaBrowserCompatItemReceiver != null) {
                mediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer();
            }
            this.read = null;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ%\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0001¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lo/onSetRating$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "Lkotlin/Function0;", "", "p0", "Landroid/window/OnBackInvokedCallback;", "bz_", "(Lo/getCreatedOnDateMs;)Landroid/window/OnBackInvokedCallback;", "", "p1", "p2", "write", "(Ljava/lang/Object;ILjava/lang/Object;)V", "IconCompatParcelizer", "(Ljava/lang/Object;Ljava/lang/Object;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer {
        public static final AudioAttributesCompatParcelizer INSTANCE = new AudioAttributesCompatParcelizer();

        private AudioAttributesCompatParcelizer() {
        }

        public final void write(Object p0, int p1, Object p2) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p2, "");
            ((OnBackInvokedDispatcher) p0).registerOnBackInvokedCallback(p1, (OnBackInvokedCallback) p2);
        }

        public final void IconCompatParcelizer(Object p0, Object p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            ((OnBackInvokedDispatcher) p0).unregisterOnBackInvokedCallback((OnBackInvokedCallback) p1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void IconCompatParcelizer(getCreatedOnDateMs getcreatedondatems) {
            toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
            getcreatedondatems.invoke();
        }

        public final OnBackInvokedCallback bz_(final getCreatedOnDateMs<getShowPopup> p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new OnBackInvokedCallback() { // from class: o.onSetCaptioningEnabled
                @Override // android.window.OnBackInvokedCallback
                public final void onBackInvoked() {
                    onSetRating.AudioAttributesCompatParcelizer.IconCompatParcelizer(p0);
                }
            };
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JQ\u0010\r\u001a\u00020\f2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lo/onSetRating$IconCompatParcelizer;", "", "<init>", "()V", "Lkotlin/Function1;", "Lo/AudioAttributesImplApi26Parcelizer;", "", "p0", "p1", "Lkotlin/Function0;", "p2", "p3", "Landroid/window/OnBackInvokedCallback;", "bA_", "(Lo/getAnswerMap;Lo/getAnswerMap;Lo/getCreatedOnDateMs;Lo/getCreatedOnDateMs;)Landroid/window/OnBackInvokedCallback;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class IconCompatParcelizer {
        public static final IconCompatParcelizer INSTANCE = new IconCompatParcelizer();

        private IconCompatParcelizer() {
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\t"}, d2 = {"Lo/onSetRating$IconCompatParcelizer$write;", "Landroid/window/OnBackAnimationCallback;", "", "onBackCancelled", "()V", "onBackInvoked", "Landroid/window/BackEvent;", "p0", "onBackProgressed", "(Landroid/window/BackEvent;)V", "onBackStarted"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class write implements OnBackAnimationCallback {
            final /* synthetic */ getCreatedOnDateMs<getShowPopup> AudioAttributesCompatParcelizer;
            final /* synthetic */ getAnswerMap<kotlin.AudioAttributesImplApi26Parcelizer, getShowPopup> IconCompatParcelizer;
            final /* synthetic */ getCreatedOnDateMs<getShowPopup> RemoteActionCompatParcelizer;
            final /* synthetic */ getAnswerMap<kotlin.AudioAttributesImplApi26Parcelizer, getShowPopup> write;

            /* JADX WARN: Multi-variable type inference failed */
            write(getAnswerMap<? super kotlin.AudioAttributesImplApi26Parcelizer, getShowPopup> getanswermap, getAnswerMap<? super kotlin.AudioAttributesImplApi26Parcelizer, getShowPopup> getanswermap2, getCreatedOnDateMs<getShowPopup> getcreatedondatems, getCreatedOnDateMs<getShowPopup> getcreatedondatems2) {
                this.IconCompatParcelizer = getanswermap;
                this.write = getanswermap2;
                this.RemoteActionCompatParcelizer = getcreatedondatems;
                this.AudioAttributesCompatParcelizer = getcreatedondatems2;
            }

            @Override // android.window.OnBackAnimationCallback
            public final void onBackStarted(BackEvent p0) {
                toMagicModuleMetaRepoModel.write(p0, "");
                this.IconCompatParcelizer.invoke(new kotlin.AudioAttributesImplApi26Parcelizer(p0));
            }

            @Override // android.window.OnBackAnimationCallback
            public final void onBackProgressed(BackEvent p0) {
                toMagicModuleMetaRepoModel.write(p0, "");
                this.write.invoke(new kotlin.AudioAttributesImplApi26Parcelizer(p0));
            }

            @Override // android.window.OnBackInvokedCallback
            public final void onBackInvoked() {
                this.RemoteActionCompatParcelizer.invoke();
            }

            @Override // android.window.OnBackAnimationCallback
            public final void onBackCancelled() {
                this.AudioAttributesCompatParcelizer.invoke();
            }
        }

        public final OnBackInvokedCallback bA_(getAnswerMap<? super kotlin.AudioAttributesImplApi26Parcelizer, getShowPopup> p0, getAnswerMap<? super kotlin.AudioAttributesImplApi26Parcelizer, getShowPopup> p1, getCreatedOnDateMs<getShowPopup> p2, getCreatedOnDateMs<getShowPopup> p3) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            toMagicModuleMetaRepoModel.write(p2, "");
            toMagicModuleMetaRepoModel.write(p3, "");
            return new write(p0, p1, p2, p3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public onSetRating() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
