package kotlin;

import kotlin.PlanData;

/* JADX INFO: loaded from: classes4.dex */
final class getOption1 implements PlanData.RemoteActionCompatParcelizer {
    private final boolean AudioAttributesCompatParcelizer;
    private final getVideoPageNotesTitle RemoteActionCompatParcelizer;
    private final getVideoPageNotesTitle write;

    public getOption1(boolean z, getVideoPageNotesTitle getvideopagenotestitle, getVideoPageNotesTitle getvideopagenotestitle2) {
        this.AudioAttributesCompatParcelizer = z;
        this.write = getvideopagenotestitle;
        this.RemoteActionCompatParcelizer = getvideopagenotestitle2;
    }

    @Override // o.PlanData.RemoteActionCompatParcelizer
    public final boolean IconCompatParcelizer(getPlanAddOns getplanaddons, getPlanAddOns getplanaddons2) {
        return setStarred.read(this.AudioAttributesCompatParcelizer, this.write, this.RemoteActionCompatParcelizer, getplanaddons, getplanaddons2);
    }
}
