package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ValueClassUnboxSerializer implements checkAccessibility {
    private final String IconCompatParcelizer;
    private final String RemoteActionCompatParcelizer;
    private final int write;

    public abstract void AudioAttributesCompatParcelizer(setDrawHoleEnabled setdrawholeenabled);

    public abstract IconCompatParcelizer AudioAttributesImplApi21Parcelizer(setDrawHoleEnabled setdrawholeenabled);

    public abstract void AudioAttributesImplApi26Parcelizer(setDrawHoleEnabled setdrawholeenabled);

    public abstract void IconCompatParcelizer(setDrawHoleEnabled setdrawholeenabled);

    public abstract void RemoteActionCompatParcelizer(setDrawHoleEnabled setdrawholeenabled);

    public abstract void read(setDrawHoleEnabled setdrawholeenabled);

    public abstract void write(setDrawHoleEnabled setdrawholeenabled);

    public ValueClassUnboxSerializer(int i, String str, String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.write = i;
        this.RemoteActionCompatParcelizer = str;
        this.IconCompatParcelizer = str2;
    }

    public final int RemoteActionCompatParcelizer() {
        return this.write;
    }

    public final String write() {
        return this.RemoteActionCompatParcelizer;
    }

    public final String AudioAttributesCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public static final class IconCompatParcelizer {
        public final String IconCompatParcelizer;
        public final boolean read;

        public IconCompatParcelizer(boolean z, String str) {
            this.read = z;
            this.IconCompatParcelizer = str;
        }
    }
}
