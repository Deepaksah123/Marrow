package kotlin;

import kotlin.Metadata;
import kotlin._handleOddName;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\r\u001a\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ5\u0010\u000f\u001a\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\r\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\r\u0010\u0003J\u0017\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0003J%\u0010\r\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00162\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0016¢\u0006\u0004\b\r\u0010\u0019J\u0017\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\u001aR\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b8\u0007¢\u0006\f\n\u0004\b\u0015\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\u00178\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 "}, d2 = {"Lo/_isCompatible;", "", "<init>", "()V", "Lo/setPresenter;", "Lo/getArrayBuilders;", "p0", "Lo/isAbstract;", "p1", "Lo/introspectForBuilder;", "p2", "", "p3", "IconCompatParcelizer", "(Lo/setPresenter;Lo/isAbstract;Lo/introspectForBuilder;Z)Z", "AudioAttributesCompatParcelizer", "(Lo/introspectForBuilder;)Z", "", "Lo/_handleOddName$IconCompatParcelizer;", "write", "(Lo/_handleOddName$IconCompatParcelizer;)V", "RemoteActionCompatParcelizer", "", "Lo/setDropDownBackgroundResource;", "Lo/introspectForCreation;", "(JLo/setDropDownBackgroundResource;)V", "(Lo/introspectForBuilder;)V", "Lo/UTF32Reader;", "Lo/UTF32Reader;", "MediaBrowserCompatItemReceiver", "()Lo/UTF32Reader;", "read", "Lo/setDropDownBackgroundResource;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class _isCompatible {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final UTF32Reader<introspectForCreation> read = new UTF32Reader<>(new introspectForCreation[16], 0);

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final setDropDownBackgroundResource<_isCompatible> IconCompatParcelizer = new setDropDownBackgroundResource<>(10);

    public final UTF32Reader<introspectForCreation> MediaBrowserCompatItemReceiver() {
        return this.read;
    }

    public boolean IconCompatParcelizer(setPresenter<getArrayBuilders> p0, isAbstract p1, introspectForBuilder p2, boolean p3) {
        UTF32Reader<introspectForCreation> uTF32Reader = this.read;
        introspectForCreation[] introspectforcreationArr = uTF32Reader.IconCompatParcelizer;
        int audioAttributesCompatParcelizer = uTF32Reader.getAudioAttributesCompatParcelizer();
        boolean z = false;
        for (int i = 0; i < audioAttributesCompatParcelizer; i++) {
            z = introspectforcreationArr[i].IconCompatParcelizer(p0, p1, p2, p3) || z;
        }
        return z;
    }

    public boolean AudioAttributesCompatParcelizer(setPresenter<getArrayBuilders> p0, isAbstract p1, introspectForBuilder p2, boolean p3) {
        UTF32Reader<introspectForCreation> uTF32Reader = this.read;
        introspectForCreation[] introspectforcreationArr = uTF32Reader.IconCompatParcelizer;
        int audioAttributesCompatParcelizer = uTF32Reader.getAudioAttributesCompatParcelizer();
        boolean z = false;
        for (int i = 0; i < audioAttributesCompatParcelizer; i++) {
            z = introspectforcreationArr[i].AudioAttributesCompatParcelizer(p0, p1, p2, p3) || z;
        }
        return z;
    }

    public boolean AudioAttributesCompatParcelizer(introspectForBuilder p0) {
        UTF32Reader<introspectForCreation> uTF32Reader = this.read;
        introspectForCreation[] introspectforcreationArr = uTF32Reader.IconCompatParcelizer;
        int audioAttributesCompatParcelizer = uTF32Reader.getAudioAttributesCompatParcelizer();
        boolean z = false;
        for (int i = 0; i < audioAttributesCompatParcelizer; i++) {
            z = introspectforcreationArr[i].AudioAttributesCompatParcelizer(p0) || z;
        }
        RemoteActionCompatParcelizer(p0);
        return z;
    }

    public void IconCompatParcelizer() {
        UTF32Reader<introspectForCreation> uTF32Reader = this.read;
        introspectForCreation[] introspectforcreationArr = uTF32Reader.IconCompatParcelizer;
        int audioAttributesCompatParcelizer = uTF32Reader.getAudioAttributesCompatParcelizer();
        for (int i = 0; i < audioAttributesCompatParcelizer; i++) {
            introspectforcreationArr[i].IconCompatParcelizer();
        }
    }

    public void write(_handleOddName.IconCompatParcelizer p0) {
        this.IconCompatParcelizer.RemoteActionCompatParcelizer();
        this.IconCompatParcelizer.AudioAttributesCompatParcelizer(this);
        while (this.IconCompatParcelizer.AudioAttributesImplBaseParcelizer()) {
            _isCompatible _iscompatibleAudioAttributesCompatParcelizer = this.IconCompatParcelizer.AudioAttributesCompatParcelizer(r0.getRemoteActionCompatParcelizer() - 1);
            int i = 0;
            while (i < _iscompatibleAudioAttributesCompatParcelizer.read.getAudioAttributesCompatParcelizer()) {
                introspectForCreation introspectforcreation = _iscompatibleAudioAttributesCompatParcelizer.read.IconCompatParcelizer[i];
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(introspectforcreation.getWrite(), p0)) {
                    _iscompatibleAudioAttributesCompatParcelizer.read.IconCompatParcelizer(introspectforcreation);
                    introspectforcreation.IconCompatParcelizer();
                } else {
                    this.IconCompatParcelizer.AudioAttributesCompatParcelizer(introspectforcreation);
                    i++;
                }
            }
        }
    }

    public final void RemoteActionCompatParcelizer() {
        this.read.RemoteActionCompatParcelizer();
    }

    public void IconCompatParcelizer(long p0, setDropDownBackgroundResource<introspectForCreation> p1) {
        UTF32Reader<introspectForCreation> uTF32Reader = this.read;
        introspectForCreation[] introspectforcreationArr = uTF32Reader.IconCompatParcelizer;
        int audioAttributesCompatParcelizer = uTF32Reader.getAudioAttributesCompatParcelizer();
        for (int i = 0; i < audioAttributesCompatParcelizer; i++) {
            introspectforcreationArr[i].IconCompatParcelizer(p0, p1);
        }
    }

    public void RemoteActionCompatParcelizer(introspectForBuilder p0) {
        for (int audioAttributesCompatParcelizer = this.read.getAudioAttributesCompatParcelizer() - 1; audioAttributesCompatParcelizer >= 0; audioAttributesCompatParcelizer--) {
            if (this.read.IconCompatParcelizer[audioAttributesCompatParcelizer].getIconCompatParcelizer().IconCompatParcelizer()) {
                this.read.RemoteActionCompatParcelizer(audioAttributesCompatParcelizer);
            }
        }
    }
}
