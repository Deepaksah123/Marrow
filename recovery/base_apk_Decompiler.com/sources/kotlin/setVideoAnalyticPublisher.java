package kotlin;

/* JADX INFO: loaded from: classes4.dex */
final class setVideoAnalyticPublisher {
    static final getCourse_id RemoteActionCompatParcelizer = new getCourse_id();
    private static McqBookmarkResponseBody read = new McqBookmarkResponseBody();

    setVideoAnalyticPublisher() {
    }

    static getCourse_id read(setHtmlLoadListener sethtmlloadlistener) {
        return sethtmlloadlistener.RemoteActionCompatParcelizer() <= 0 ? RemoteActionCompatParcelizer : new getCourse_id(sethtmlloadlistener);
    }

    static McqBookmarkResponseBody write(setHtmlLoadListener sethtmlloadlistener) {
        return sethtmlloadlistener.RemoteActionCompatParcelizer() <= 0 ? read : new McqBookmarkResponseBody(sethtmlloadlistener);
    }
}
