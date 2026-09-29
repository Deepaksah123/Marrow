package kotlin;

import kotlin.getActiveEdition;

/* JADX INFO: loaded from: classes4.dex */
final class getBuyNowHighlight implements getActiveEdition.write {
    private final getSearchDescription read;

    public getBuyNowHighlight(getSearchDescription getsearchdescription) {
        this.read = getsearchdescription;
    }

    @Override // o.getActiveEdition.write
    public final Iterable RemoteActionCompatParcelizer(Object obj) {
        return getSearchDescription.IconCompatParcelizer(this.read, (CourseConfigV2CustomModuleQuestionSource) obj);
    }
}
