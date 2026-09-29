package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class setJsSrc {
    private final getCreatedOnDateMs<Float> AudioAttributesCompatParcelizer;
    private final boolean AudioAttributesImplApi21Parcelizer;
    private final getCreatedOnDateMs<Float> AudioAttributesImplApi26Parcelizer;
    private final setCollapseIcon<Boolean> AudioAttributesImplBaseParcelizer;
    private final getAnswerMap<Float, getShowPopup> IconCompatParcelizer;
    private final getCreatedOnDateMs<Float> MediaBrowserCompatItemReceiver;
    private final getCreatedOnDateMs<Float> RemoteActionCompatParcelizer;
    private final float read;
    private final boolean write;

    /* JADX WARN: Multi-variable type inference failed */
    public setJsSrc(boolean z, boolean z2, float f, setCollapseIcon<Boolean> setcollapseicon, getCreatedOnDateMs<Float> getcreatedondatems, getCreatedOnDateMs<Float> getcreatedondatems2, getCreatedOnDateMs<Float> getcreatedondatems3, getCreatedOnDateMs<Float> getcreatedondatems4, getAnswerMap<? super Float, getShowPopup> getanswermap) {
        toMagicModuleMetaRepoModel.write(setcollapseicon, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems2, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems3, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems4, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        this.AudioAttributesImplApi21Parcelizer = z;
        this.write = z2;
        this.read = f;
        this.AudioAttributesImplBaseParcelizer = setcollapseicon;
        this.AudioAttributesCompatParcelizer = getcreatedondatems;
        this.AudioAttributesImplApi26Parcelizer = getcreatedondatems2;
        this.RemoteActionCompatParcelizer = getcreatedondatems3;
        this.MediaBrowserCompatItemReceiver = getcreatedondatems4;
        this.IconCompatParcelizer = getanswermap;
    }

    public final boolean IconCompatParcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final boolean AudioAttributesCompatParcelizer() {
        return this.write;
    }

    public final float RemoteActionCompatParcelizer() {
        return this.read;
    }

    public final setCollapseIcon<Boolean> read() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final getAnswerMap<Float, getShowPopup> write() {
        return this.IconCompatParcelizer;
    }

    public final float MediaBrowserCompatCustomActionResultReceiver() {
        return this.AudioAttributesCompatParcelizer.invoke().floatValue();
    }

    public final float AudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer.invoke().floatValue();
    }

    public final float AudioAttributesImplApi21Parcelizer() {
        return this.RemoteActionCompatParcelizer.invoke().floatValue();
    }

    public final float AudioAttributesImplApi26Parcelizer() {
        return this.MediaBrowserCompatItemReceiver.invoke().floatValue();
    }
}
