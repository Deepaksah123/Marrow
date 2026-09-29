package kotlin;

import kotlin.Metadata;
import kotlin._handleOddName;
import kotlin.createForPropertyOverride;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0003\b \u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u0004J\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0004J\u000f\u0010\u0010\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0004R$\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00058\u0007@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00148WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R$\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00058\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b\u0017\u0010\u0011\u001a\u0004\b\r\u0010\u0013"}, d2 = {"Lo/initLifecycle;", "Lo/_handleOddName$IconCompatParcelizer;", "Lo/createForPropertyOverride;", "<init>", "()V", "Lo/onCreateView;", "p0", "RemoteActionCompatParcelizer", "(Lo/onCreateView;)Lo/onCreateView;", "", "c_", "MediaDescriptionCompat", "p_", "write", "(Lo/onCreateView;)V", "AudioAttributesImplApi21Parcelizer", "MediaBrowserCompatCustomActionResultReceiver", "Lo/onCreateView;", "read", "()Lo/onCreateView;", "", "MediaBrowserCompatItemReceiver", "()Ljava/lang/Object;", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class initLifecycle extends _handleOddName.IconCompatParcelizer implements createForPropertyOverride {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private onCreateView read = onDestroy.write();

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private onCreateView write = onDestroy.write();

    public abstract onCreateView RemoteActionCompatParcelizer(onCreateView p0);

    /* JADX INFO: renamed from: read, reason: from getter */
    public final onCreateView getRead() {
        return this.read;
    }

    @Override // kotlin.createForPropertyOverride
    public Object MediaBrowserCompatItemReceiver() {
        return "androidx.compose.foundation.layout.ConsumedInsetsProvider";
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final onCreateView getWrite() {
        return this.write;
    }

    @Override // o._handleOddName.IconCompatParcelizer
    public void c_() {
        PropertyName.write(this, MediaBrowserCompatItemReceiver(), new getAnswerMap() { // from class: o.ensureAnimationInfo
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return Boolean.valueOf(initLifecycle.RemoteActionCompatParcelizer(this.write, (createForPropertyOverride) obj));
            }
        });
        AudioAttributesImplApi21Parcelizer();
        super.c_();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean RemoteActionCompatParcelizer(initLifecycle initlifecycle, createForPropertyOverride createforpropertyoverride) {
        toMagicModuleMetaRepoModel.read(createforpropertyoverride, "");
        initlifecycle.read = ((initLifecycle) createforpropertyoverride).write;
        return false;
    }

    @Override // o._handleOddName.IconCompatParcelizer
    public void MediaDescriptionCompat() {
        this.write = this.read;
        MediaBrowserCompatCustomActionResultReceiver();
        super.MediaDescriptionCompat();
    }

    @Override // o._handleOddName.IconCompatParcelizer
    public void p_() {
        super.p_();
        this.read = onDestroy.write();
    }

    private final void write(onCreateView p0) {
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, p0)) {
            return;
        }
        this.read = p0;
        AudioAttributesImplApi21Parcelizer();
    }

    public void AudioAttributesImplApi21Parcelizer() {
        this.write = RemoteActionCompatParcelizer(this.read);
        MediaBrowserCompatCustomActionResultReceiver();
    }

    private final void MediaBrowserCompatCustomActionResultReceiver() {
        PropertyName.RemoteActionCompatParcelizer(this, MediaBrowserCompatItemReceiver(), new getAnswerMap() { // from class: o.showNow
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return initLifecycle.AudioAttributesCompatParcelizer(this.read, (createForPropertyOverride) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createForPropertyOverride.Companion.IconCompatParcelizer AudioAttributesCompatParcelizer(initLifecycle initlifecycle, createForPropertyOverride createforpropertyoverride) {
        toMagicModuleMetaRepoModel.read(createforpropertyoverride, "");
        ((initLifecycle) createforpropertyoverride).write(initlifecycle.write);
        return createForPropertyOverride.Companion.IconCompatParcelizer.IconCompatParcelizer;
    }
}
