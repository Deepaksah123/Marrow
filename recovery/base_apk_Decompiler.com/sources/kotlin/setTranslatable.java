package kotlin;

/* JADX INFO: loaded from: classes4.dex */
final class setTranslatable {
    private static safeParam AudioAttributesCompatParcelizer = new safeParam();

    static {
        new PlayIntegrityExceptionUtil();
    }

    setTranslatable() {
    }

    static safeParam AudioAttributesCompatParcelizer(setHtmlLoadListener sethtmlloadlistener) {
        return sethtmlloadlistener.RemoteActionCompatParcelizer() <= 0 ? AudioAttributesCompatParcelizer : new safeParam(sethtmlloadlistener);
    }
}
