package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class getTopicId extends PlanAddOnsCompanion implements TaxInfo {
    private final getHref read;
    private final getHref write;

    public abstract getHref IconCompatParcelizer();

    public abstract String read(setGuessed setguessed, setFirstAnswer setfirstanswer);

    public final getHref AudioAttributesImplApi26Parcelizer() {
        return this.read;
    }

    public final getHref AudioAttributesImplBaseParcelizer() {
        return this.write;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getTopicId(getHref gethref, getHref gethref2) {
        super((byte) 0);
        toMagicModuleMetaRepoModel.write(gethref, "");
        toMagicModuleMetaRepoModel.write(gethref2, "");
        this.write = gethref;
        this.read = gethref2;
    }

    @Override // kotlin.getLink
    public getGroupDescription bc_() {
        return IconCompatParcelizer().bc_();
    }

    @Override // kotlin.getLink
    public final getPlanAddOns AudioAttributesImplApi21Parcelizer() {
        return IconCompatParcelizer().AudioAttributesImplApi21Parcelizer();
    }

    @Override // kotlin.getLink
    public final List<setDefault> bb_() {
        return IconCompatParcelizer().bb_();
    }

    @Override // kotlin.getLink
    public boolean ba_() {
        return IconCompatParcelizer().ba_();
    }

    @Override // kotlin.getLink
    public setTags read() {
        return IconCompatParcelizer().read();
    }

    public String toString() {
        return setGuessed.RemoteActionCompatParcelizer.read(this);
    }
}
