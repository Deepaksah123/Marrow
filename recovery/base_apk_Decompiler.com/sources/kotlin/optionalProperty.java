package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class optionalProperty {
    public final int AudioAttributesCompatParcelizer;
    public final int IconCompatParcelizer;
    public final int RemoteActionCompatParcelizer;
    public final String write;

    /* synthetic */ optionalProperty(write writeVar, byte b) {
        this(writeVar);
    }

    static {
        new write().RemoteActionCompatParcelizer();
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(0);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(1);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(2);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(3);
    }

    public static final class write {
        private int AudioAttributesCompatParcelizer;
        private String IconCompatParcelizer;
        private final int RemoteActionCompatParcelizer = 0;
        private int write;

        public final write write(int i) {
            this.write = i;
            return this;
        }

        public final write RemoteActionCompatParcelizer(int i) {
            this.AudioAttributesCompatParcelizer = i;
            return this;
        }

        public final optionalProperty RemoteActionCompatParcelizer() {
            byte b = 0;
            buildTypeSerializer.IconCompatParcelizer(this.write <= this.AudioAttributesCompatParcelizer);
            return new optionalProperty(this, b);
        }
    }

    private optionalProperty(write writeVar) {
        this.RemoteActionCompatParcelizer = writeVar.RemoteActionCompatParcelizer;
        this.AudioAttributesCompatParcelizer = writeVar.write;
        this.IconCompatParcelizer = writeVar.AudioAttributesCompatParcelizer;
        this.write = writeVar.IconCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof optionalProperty)) {
            return false;
        }
        optionalProperty optionalproperty = (optionalProperty) obj;
        return this.RemoteActionCompatParcelizer == optionalproperty.RemoteActionCompatParcelizer && this.AudioAttributesCompatParcelizer == optionalproperty.AudioAttributesCompatParcelizer && this.IconCompatParcelizer == optionalproperty.IconCompatParcelizer && LaissezFaireSubTypeValidator.read(this.write, optionalproperty.write);
    }

    public final int hashCode() {
        int i = this.RemoteActionCompatParcelizer;
        int i2 = this.AudioAttributesCompatParcelizer;
        int i3 = this.IconCompatParcelizer;
        String str = this.write;
        return ((((((i + 527) * 31) + i2) * 31) + i3) * 31) + (str == null ? 0 : str.hashCode());
    }
}
