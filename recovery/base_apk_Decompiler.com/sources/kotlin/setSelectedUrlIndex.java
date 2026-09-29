package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class setSelectedUrlIndex {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> VideoSubtitle AudioAttributesCompatParcelizer(getAnswerMap<? super E, getShowPopup> getanswermap, E e, VideoSubtitle videoSubtitle) {
        try {
            getanswermap.invoke(e);
            return videoSubtitle;
        } catch (Throwable th) {
            if (videoSubtitle != null && videoSubtitle.getCause() != th) {
                getPlanName.IconCompatParcelizer(videoSubtitle, th);
                return videoSubtitle;
            }
            return new VideoSubtitle("Exception in undelivered element handler for ".concat(String.valueOf(e)), th);
        }
    }

    public static final <E> void AudioAttributesCompatParcelizer(getAnswerMap<? super E, getShowPopup> getanswermap, E e, CurrentQuery currentQuery) {
        VideoSubtitle videoSubtitleAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(getanswermap, e, (VideoSubtitle) null);
        if (videoSubtitleAudioAttributesCompatParcelizer != null) {
            YearItem.read(currentQuery, videoSubtitleAudioAttributesCompatParcelizer);
        }
    }
}
