package kotlin;

import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class PearlMini {
    private final getHref IconCompatParcelizer;
    private final Set<getBadgeText> RemoteActionCompatParcelizer;
    private final setGroupSubttile read;

    /* JADX WARN: Multi-variable type inference failed */
    public PearlMini(setGroupSubttile setgroupsubttile, Set<? extends getBadgeText> set, getHref gethref) {
        toMagicModuleMetaRepoModel.write(setgroupsubttile, "");
        this.read = setgroupsubttile;
        this.RemoteActionCompatParcelizer = set;
        this.IconCompatParcelizer = gethref;
    }

    public setGroupSubttile IconCompatParcelizer() {
        return this.read;
    }

    public Set<getBadgeText> AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public getHref read() {
        return this.IconCompatParcelizer;
    }

    public PearlMini IconCompatParcelizer(getBadgeText getbadgetext) {
        toMagicModuleMetaRepoModel.write(getbadgetext, "");
        setGroupSubttile setgroupsubttileIconCompatParcelizer = IconCompatParcelizer();
        Set<getBadgeText> setAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        return new PearlMini(setgroupsubttileIconCompatParcelizer, setAudioAttributesCompatParcelizer != null ? getKycMessage.write(setAudioAttributesCompatParcelizer, getbadgetext) : getKycMessage.read(getbadgetext), read());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PearlMini)) {
            return false;
        }
        PearlMini pearlMini = (PearlMini) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(pearlMini.read(), read()) && pearlMini.IconCompatParcelizer() == IconCompatParcelizer();
    }

    public int hashCode() {
        getHref gethref = read();
        int iHashCode = gethref != null ? gethref.hashCode() : 0;
        return iHashCode + (iHashCode * 31) + IconCompatParcelizer().hashCode();
    }
}
