package kotlin;

import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u000f¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0014\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0005\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u0019R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001a8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u001dR\u0016\u0010\r\u001a\u00020\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\n\u001a\u00020!8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\r\u0010\"R\u0016\u0010\u0017\u001a\u00020\f8\u0000@\u0000X\u0081\f¢\u0006\u0006\n\u0004\b\n\u0010#R\u0018\u0010$\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010'\u001a\u0004\u0018\u00010\u00118\u0000@\u0000X\u0081\f¢\u0006\u0006\n\u0004\b\u0014\u0010&R&\u0010\u001b\u001a\u0012\u0012\f\u0012\n\u0018\u00010)j\u0004\u0018\u0001`*\u0018\u00010(8\u0000@\u0000X\u0081\f¢\u0006\u0006\n\u0004\b\u001e\u0010+R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00128\u0000@\u0000X\u0081\f¢\u0006\u0006\n\u0004\b\u0017\u0010,R\u0018\u0010-\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b-\u0010.R$\u00101\u001a\u00020!2\u0006\u0010\u0003\u001a\u00020!8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\n\u0010/\"\u0004\b\u0017\u00100"}, d2 = {"Lo/canInstantiate;", "Landroid/text/TextPaint;", "", "p0", "", "p1", "<init>", "(IF)V", "Lo/renameAll;", "", "IconCompatParcelizer", "(Lo/renameAll;)V", "Lo/nopInstance;", "RemoteActionCompatParcelizer", "(Lo/nopInstance;)V", "Lo/switchToNext;", "(J)V", "Lo/Instantiatable;", "Lo/calloc;", "p2", "read", "(Lo/Instantiatable;JF)V", "Lo/findViews;", "AudioAttributesCompatParcelizer", "(Lo/findViews;)V", "()V", "Lo/releaseBuffers;", "MediaBrowserCompatCustomActionResultReceiver", "Lo/releaseBuffers;", "()Lo/releaseBuffers;", "write", "MediaBrowserCompatItemReceiver", "Lo/renameAll;", "Lo/createInstance;", "I", "Lo/nopInstance;", "AudioAttributesImplBaseParcelizer", "Lo/switchToNext;", "Lo/Instantiatable;", "AudioAttributesImplApi21Parcelizer", "Lo/parseDouble;", "Landroid/graphics/Shader;", "Lo/AudioAttributesCompatParcelizer;", "Lo/parseDouble;", "Lo/calloc;", "AudioAttributesImplApi26Parcelizer", "Lo/findViews;", "()I", "(I)V", "MediaDescriptionCompat"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class canInstantiate extends TextPaint {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public calloc MediaBrowserCompatItemReceiver;
    private findViews AudioAttributesImplApi26Parcelizer;
    private switchToNext AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public nopInstance AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private releaseBuffers read;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private renameAll RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private int IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public Instantiatable AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public parseDouble<? extends Shader> MediaBrowserCompatCustomActionResultReceiver;

    public canInstantiate(int i, float f) {
        super(i);
        ((TextPaint) this).density = f;
        this.RemoteActionCompatParcelizer = renameAll.INSTANCE.write();
        this.IconCompatParcelizer = findSetterInfo.INSTANCE.write();
        this.AudioAttributesCompatParcelizer = nopInstance.INSTANCE.RemoteActionCompatParcelizer();
    }

    private final releaseBuffers read() {
        releaseBuffers releasebuffers = this.read;
        if (releasebuffers != null) {
            return releasebuffers;
        }
        releaseBuffers releasebuffersRemoteActionCompatParcelizer = fromInitial.RemoteActionCompatParcelizer(this);
        this.read = releasebuffersRemoteActionCompatParcelizer;
        return releasebuffersRemoteActionCompatParcelizer;
    }

    public final void IconCompatParcelizer(renameAll p0) {
        if (p0 == null || toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, p0)) {
            return;
        }
        this.RemoteActionCompatParcelizer = p0;
        setUnderlineText(p0.write(renameAll.INSTANCE.AudioAttributesCompatParcelizer()));
        setStrikeThruText(this.RemoteActionCompatParcelizer.write(renameAll.INSTANCE.RemoteActionCompatParcelizer()));
    }

    public final void RemoteActionCompatParcelizer(nopInstance p0) {
        if (p0 == null || toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, p0)) {
            return;
        }
        this.AudioAttributesCompatParcelizer = p0;
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, nopInstance.INSTANCE.RemoteActionCompatParcelizer())) {
            clearShadowLayer();
        } else {
            setShadowLayer(ValueInstantiators.read(this.AudioAttributesCompatParcelizer.getAudioAttributesCompatParcelizer()), Float.intBitsToFloat((int) (this.AudioAttributesCompatParcelizer.getWrite() >> 32)), Float.intBitsToFloat((int) this.AudioAttributesCompatParcelizer.getWrite()), RequestPayload.IconCompatParcelizer(this.AudioAttributesCompatParcelizer.getIconCompatParcelizer()));
        }
    }

    public final void IconCompatParcelizer(long p0) {
        switchToNext switchtonext = this.AudioAttributesImplBaseParcelizer;
        if ((switchtonext != null && switchToNext.RemoteActionCompatParcelizer(switchtonext.getIconCompatParcelizer(), p0)) || p0 == 16) {
            return;
        }
        this.AudioAttributesImplBaseParcelizer = switchToNext.write(p0);
        setColor(RequestPayload.IconCompatParcelizer(p0));
        RemoteActionCompatParcelizer();
    }

    public final void read(final Instantiatable p0, final long p1, float p2) {
        calloc callocVar;
        if (p0 == null) {
            RemoteActionCompatParcelizer();
            return;
        }
        if (p0 instanceof _hasOneOf) {
            IconCompatParcelizer(isCaseInsensitive.read(((_hasOneOf) p0).getRead(), p2));
            return;
        }
        if (!(p0 instanceof throwInternal)) {
            throw new RenewEligibleCreator();
        }
        if ((!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, p0) || (callocVar = this.MediaBrowserCompatItemReceiver) == null || !calloc.RemoteActionCompatParcelizer(callocVar.getIconCompatParcelizer(), p1)) && p1 != 9205357640488583168L) {
            this.AudioAttributesImplApi21Parcelizer = p0;
            this.MediaBrowserCompatItemReceiver = calloc.read(p1);
            this.MediaBrowserCompatCustomActionResultReceiver = _qbuf.RemoteActionCompatParcelizer(new getCreatedOnDateMs() { // from class: o.createFromBigInteger
                @Override // kotlin.getCreatedOnDateMs
                public final Object invoke() {
                    return canInstantiate.write(p0, p1);
                }
            });
        }
        releaseBuffers releasebuffers = read();
        parseDouble<? extends Shader> parsedouble = this.MediaBrowserCompatCustomActionResultReceiver;
        releasebuffers.read(parsedouble != null ? parsedouble.getRemoteActionCompatParcelizer() : null);
        this.AudioAttributesImplBaseParcelizer = null;
        createFromDouble.write(this, p2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Shader write(Instantiatable instantiatable, long j) {
        return ((throwInternal) instantiatable).IconCompatParcelizer(j);
    }

    public final void AudioAttributesCompatParcelizer(findViews p0) {
        if (p0 == null || toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer, p0)) {
            return;
        }
        this.AudioAttributesImplApi26Parcelizer = p0;
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, findTypeResolver.INSTANCE)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (!(p0 instanceof findValueInstantiator)) {
            throw new RenewEligibleCreator();
        }
        read().write(ThreadLocalBufferManager.INSTANCE.write());
        findValueInstantiator findvalueinstantiator = (findValueInstantiator) p0;
        read().write(findvalueinstantiator.getIconCompatParcelizer());
        read().AudioAttributesCompatParcelizer(findvalueinstantiator.getRemoteActionCompatParcelizer());
        read().IconCompatParcelizer(findvalueinstantiator.getAudioAttributesCompatParcelizer());
        read().AudioAttributesCompatParcelizer(findvalueinstantiator.getWrite());
        read().AudioAttributesCompatParcelizer(findvalueinstantiator.getRead());
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final int getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final void AudioAttributesCompatParcelizer(int i) {
        if (createInstance.IconCompatParcelizer(i, this.IconCompatParcelizer)) {
            return;
        }
        read().RemoteActionCompatParcelizer(i);
        this.IconCompatParcelizer = i;
    }

    private final void RemoteActionCompatParcelizer() {
        this.MediaBrowserCompatCustomActionResultReceiver = null;
        this.AudioAttributesImplApi21Parcelizer = null;
        this.MediaBrowserCompatItemReceiver = null;
        setShader(null);
    }
}
