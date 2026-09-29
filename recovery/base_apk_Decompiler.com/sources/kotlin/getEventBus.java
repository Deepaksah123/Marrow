package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class getEventBus extends LottieRatingBarBig {
    public getEventBus(setMinimumHeightMargin setminimumheightmargin, getPairOfTimeAndIndex getpairoftimeandindex, setMsDelay setmsdelay, int i, setMsDelay setmsdelay2) {
        super(setminimumheightmargin, getpairoftimeandindex, setmsdelay, i, setmsdelay2);
    }

    @Override // kotlin.LottieRatingBarBig, kotlin.setMsDelay
    final setMsDelay MediaBrowserCompatItemReceiver() {
        return this;
    }

    public getEventBus(getCourse_id getcourse_id) {
        super(getcourse_id);
    }

    @Override // kotlin.LottieRatingBarBig
    final setMsFixedDuration RemoteActionCompatParcelizer() {
        setHtmlLoadListener sethtmlloadlistener = new setHtmlLoadListener(4);
        if (this.write != null) {
            sethtmlloadlistener.RemoteActionCompatParcelizer(this.write);
        }
        if (this.IconCompatParcelizer != null) {
            sethtmlloadlistener.RemoteActionCompatParcelizer(this.IconCompatParcelizer);
        }
        if (this.RemoteActionCompatParcelizer != null) {
            sethtmlloadlistener.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer.MediaBrowserCompatItemReceiver());
        }
        sethtmlloadlistener.RemoteActionCompatParcelizer(new setCourse_id(this.AudioAttributesCompatParcelizer == 0, this.AudioAttributesCompatParcelizer, this.read));
        return new getCourse_id(sethtmlloadlistener);
    }
}
