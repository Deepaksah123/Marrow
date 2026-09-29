package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class TemporarySessionResponseBody extends LottieRatingBarBig {
    public TemporarySessionResponseBody(setMinimumHeightMargin setminimumheightmargin, getPairOfTimeAndIndex getpairoftimeandindex, setMsDelay setmsdelay, int i, setMsDelay setmsdelay2) {
        super(setminimumheightmargin, getpairoftimeandindex, setmsdelay, i, setmsdelay2);
    }

    @Override // kotlin.LottieRatingBarBig, kotlin.setMsDelay
    final setMsDelay IconCompatParcelizer() {
        return this;
    }

    @Override // kotlin.LottieRatingBarBig, kotlin.setMsDelay
    final setMsDelay MediaBrowserCompatItemReceiver() {
        return this;
    }

    public TemporarySessionResponseBody(setCode setcode) {
        super(setcode);
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
            sethtmlloadlistener.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer.IconCompatParcelizer());
        }
        sethtmlloadlistener.RemoteActionCompatParcelizer(new getVideoAnalyticPublisher(this.AudioAttributesCompatParcelizer == 0, this.AudioAttributesCompatParcelizer, this.read));
        return new setCode(sethtmlloadlistener);
    }
}
