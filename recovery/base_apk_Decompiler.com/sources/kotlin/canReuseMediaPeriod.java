package kotlin;

import com.marrow.data.models.pearl.PearlMini;

/* JADX INFO: loaded from: classes3.dex */
public final class canReuseMediaPeriod implements ServerSideAdInsertionMediaSourceSharedMediaPeriod {
    private ServerSideAdInsertionMediaSourceSharedMediaPeriod AudioAttributesCompatParcelizer;
    private ServerSideAdInsertionMediaSourceSharedMediaPeriod read;

    @setSdkPayload
    public canReuseMediaPeriod(ServerSideAdInsertionMediaSourceSharedMediaPeriod serverSideAdInsertionMediaSourceSharedMediaPeriod, ServerSideAdInsertionMediaSourceSharedMediaPeriod serverSideAdInsertionMediaSourceSharedMediaPeriod2) {
        this.read = serverSideAdInsertionMediaSourceSharedMediaPeriod;
        this.AudioAttributesCompatParcelizer = serverSideAdInsertionMediaSourceSharedMediaPeriod2;
    }

    @Override // kotlin.ServerSideAdInsertionMediaSourceSharedMediaPeriod
    public final PearlMini IconCompatParcelizer(String str) {
        return this.read.IconCompatParcelizer(str);
    }
}
