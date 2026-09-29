package kotlin;

/* JADX INFO: loaded from: classes4.dex */
abstract class setScaleType extends setTotalTimer {
    private setTextSizes RemoteActionCompatParcelizer;

    setScaleType(Class cls, int i) {
        super(cls);
        this.RemoteActionCompatParcelizer = setTextSizes.RemoteActionCompatParcelizer(i);
    }

    final setMsDelay AudioAttributesCompatParcelizer(setMsDelay setmsdelay) {
        if (this.write.isInstance(setmsdelay)) {
            return setmsdelay;
        }
        StringBuilder sb = new StringBuilder("unexpected object: ");
        sb.append(setmsdelay.getClass().getName());
        throw new IllegalStateException(sb.toString());
    }

    setMsDelay AudioAttributesCompatParcelizer(setMsFixedDuration setmsfixedduration) {
        throw new IllegalStateException("unexpected implicit constructed encoding");
    }

    setMsDelay read(EmptyBody emptyBody) {
        throw new IllegalStateException("unexpected implicit primitive encoding");
    }

    final setMsDelay IconCompatParcelizer(ZoomableLinearLayoutManager zoomableLinearLayoutManager, boolean z) {
        return AudioAttributesCompatParcelizer(isTranslatable.AudioAttributesCompatParcelizer(zoomableLinearLayoutManager).RemoteActionCompatParcelizer(false, this));
    }
}
