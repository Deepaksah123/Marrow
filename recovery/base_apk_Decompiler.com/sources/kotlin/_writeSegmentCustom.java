package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\u0003R\u001e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\rR.\u0010\u0011\u001a\u0004\u0018\u00010\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\u00018\u0007@GX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010\"\u0004\b\u0011\u0010\u0012"}, d2 = {"Lo/_writeSegmentCustom;", "Lo/buf;", "<init>", "()V", "Lo/hasAnyGetter;", "IconCompatParcelizer", "()Lo/hasAnyGetter;", "p0", "", "RemoteActionCompatParcelizer", "(Lo/hasAnyGetter;)V", "read", "Lo/setDropDownBackgroundResource;", "Lo/setDropDownBackgroundResource;", "write", "Lo/buf;", "()Lo/buf;", "AudioAttributesCompatParcelizer", "(Lo/buf;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class _writeSegmentCustom implements buf {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private buf AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private setDropDownBackgroundResource<hasAnyGetter> write;

    /* JADX INFO: renamed from: write, reason: from getter */
    public final buf getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final void AudioAttributesCompatParcelizer(buf bufVar) {
        read();
        this.AudioAttributesCompatParcelizer = bufVar;
    }

    @Override // kotlin.buf
    public final hasAnyGetter IconCompatParcelizer() {
        buf bufVar = this.AudioAttributesCompatParcelizer;
        if (bufVar == null) {
            reportWrongTokenException.read("GraphicsContext not provided");
        }
        hasAnyGetter hasanygetterIconCompatParcelizer = bufVar.IconCompatParcelizer();
        setDropDownBackgroundResource<hasAnyGetter> setdropdownbackgroundresource = this.write;
        if (setdropdownbackgroundresource == null) {
            this.write = setSupportCompoundDrawablesTintMode.AudioAttributesCompatParcelizer(hasanygetterIconCompatParcelizer);
            return hasanygetterIconCompatParcelizer;
        }
        setdropdownbackgroundresource.AudioAttributesCompatParcelizer(hasanygetterIconCompatParcelizer);
        return hasanygetterIconCompatParcelizer;
    }

    @Override // kotlin.buf
    public final void RemoteActionCompatParcelizer(hasAnyGetter p0) {
        buf bufVar = this.AudioAttributesCompatParcelizer;
        if (bufVar != null) {
            bufVar.RemoteActionCompatParcelizer(p0);
        }
    }

    public final void read() {
        setDropDownBackgroundResource<hasAnyGetter> setdropdownbackgroundresource = this.write;
        if (setdropdownbackgroundresource != null) {
            setDropDownBackgroundResource<hasAnyGetter> setdropdownbackgroundresource2 = setdropdownbackgroundresource;
            Object[] objArr = setdropdownbackgroundresource2.IconCompatParcelizer;
            int i = setdropdownbackgroundresource2.RemoteActionCompatParcelizer;
            for (int i2 = 0; i2 < i; i2++) {
                RemoteActionCompatParcelizer((hasAnyGetter) objArr[i2]);
            }
            setdropdownbackgroundresource.RemoteActionCompatParcelizer();
        }
    }
}
