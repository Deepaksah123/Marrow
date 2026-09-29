package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\f\u001a\u00020\u000b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0000¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u0003R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\b0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0011R&\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011"}, d2 = {"Lo/getAdapterPosition;", "", "<init>", "()V", "Lo/isAttachedToTransitionOverlay;", "RemoteActionCompatParcelizer", "()Lo/isAttachedToTransitionOverlay;", "Lkotlin/Function1;", "Lo/getPosition;", "", "p0", "", "AudioAttributesCompatParcelizer", "(Lo/getAnswerMap;)V", "write", "(Lo/getPosition;)V", "Lo/setDropDownBackgroundResource;", "Lo/setDropDownBackgroundResource;", "read", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getAdapterPosition {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final setDropDownBackgroundResource<getPosition> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final setDropDownBackgroundResource<getAnswerMap<getPosition, Boolean>> IconCompatParcelizer;

    public getAdapterPosition() {
        int i = 0;
        int i2 = 1;
        MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0 = null;
        this.RemoteActionCompatParcelizer = new setDropDownBackgroundResource<>(i, i2, magicModuleRepositoryImplExternalSyntheticLambda0);
        this.IconCompatParcelizer = new setDropDownBackgroundResource<>(i, i2, magicModuleRepositoryImplExternalSyntheticLambda0);
    }

    public final void AudioAttributesCompatParcelizer(getAnswerMap<? super getPosition, Boolean> p0) {
        this.IconCompatParcelizer.AudioAttributesCompatParcelizer(p0);
    }

    public final void write(getPosition p0) {
        this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(p0);
    }

    public final void write() {
        this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(hasAnyOfTheFlags.INSTANCE);
    }

    public final isAttachedToTransitionOverlay RemoteActionCompatParcelizer() {
        setDropDownBackgroundResource setdropdownbackgroundresource = new setDropDownBackgroundResource(0, 1, false ? 1 : 0);
        setDropDownBackgroundResource<getPosition> setdropdownbackgroundresource2 = this.RemoteActionCompatParcelizer;
        Object[] objArr = setdropdownbackgroundresource2.IconCompatParcelizer;
        int i = setdropdownbackgroundresource2.RemoteActionCompatParcelizer;
        int i2 = 0;
        boolean z = true;
        getPosition getposition = null;
        while (i2 < i) {
            getPosition getposition2 = (getPosition) objArr[i2];
            if (!z || getposition2 != hasAnyOfTheFlags.INSTANCE) {
                if (getBindingAdapterPosition.read(getposition2) && getBindingAdapterPosition.read(getposition)) {
                    z = false;
                    break;
                    break;
                }
                if (!getBindingAdapterPosition.read(getposition2)) {
                    setDropDownBackgroundResource<getAnswerMap<getPosition, Boolean>> setdropdownbackgroundresource3 = this.IconCompatParcelizer;
                    Object[] objArr2 = setdropdownbackgroundresource3.IconCompatParcelizer;
                    int i3 = setdropdownbackgroundresource3.RemoteActionCompatParcelizer;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (!((Boolean) ((getAnswerMap) objArr2[i4]).invoke(getposition2)).booleanValue()) {
                            z = false;
                            break;
                        }
                    }
                }
                setdropdownbackgroundresource.AudioAttributesCompatParcelizer(getposition2);
                z = false;
                getposition = getposition2;
            }
            i2++;
            z = z;
        }
        setDropDownBackgroundResource setdropdownbackgroundresource4 = setdropdownbackgroundresource;
        if (getBindingAdapterPosition.read((getPosition) (setdropdownbackgroundresource4.AudioAttributesImplApi21Parcelizer() ? null : setdropdownbackgroundresource4.IconCompatParcelizer[setdropdownbackgroundresource4.RemoteActionCompatParcelizer - 1]))) {
            setdropdownbackgroundresource.AudioAttributesCompatParcelizer(setdropdownbackgroundresource4.RemoteActionCompatParcelizer - 1);
        }
        return new isAttachedToTransitionOverlay(setdropdownbackgroundresource.IconCompatParcelizer());
    }
}
