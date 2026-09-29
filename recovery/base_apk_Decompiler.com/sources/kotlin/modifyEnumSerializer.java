package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class modifyEnumSerializer {
    public static final modifyEnumSerializer read = new IconCompatParcelizer().IconCompatParcelizer();
    public final boolean AudioAttributesCompatParcelizer;
    public final boolean IconCompatParcelizer;
    public final boolean RemoteActionCompatParcelizer;

    /* synthetic */ modifyEnumSerializer(IconCompatParcelizer iconCompatParcelizer, byte b) {
        this(iconCompatParcelizer);
    }

    public static final class IconCompatParcelizer {
        private boolean AudioAttributesCompatParcelizer;
        private boolean IconCompatParcelizer;
        private boolean write;

        public final IconCompatParcelizer read() {
            this.IconCompatParcelizer = true;
            return this;
        }

        public final IconCompatParcelizer IconCompatParcelizer(boolean z) {
            this.AudioAttributesCompatParcelizer = z;
            return this;
        }

        public final IconCompatParcelizer RemoteActionCompatParcelizer(boolean z) {
            this.write = z;
            return this;
        }

        public final modifyEnumSerializer IconCompatParcelizer() {
            if (!this.IconCompatParcelizer && (this.AudioAttributesCompatParcelizer || this.write)) {
                throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
            }
            return new modifyEnumSerializer(this, (byte) 0);
        }
    }

    private modifyEnumSerializer(IconCompatParcelizer iconCompatParcelizer) {
        this.RemoteActionCompatParcelizer = iconCompatParcelizer.IconCompatParcelizer;
        this.AudioAttributesCompatParcelizer = iconCompatParcelizer.AudioAttributesCompatParcelizer;
        this.IconCompatParcelizer = iconCompatParcelizer.write;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        modifyEnumSerializer modifyenumserializer = (modifyEnumSerializer) obj;
        return this.RemoteActionCompatParcelizer == modifyenumserializer.RemoteActionCompatParcelizer && this.AudioAttributesCompatParcelizer == modifyenumserializer.AudioAttributesCompatParcelizer && this.IconCompatParcelizer == modifyenumserializer.IconCompatParcelizer;
    }

    public final int hashCode() {
        return ((this.RemoteActionCompatParcelizer ? 1 : 0) << 2) + ((this.AudioAttributesCompatParcelizer ? 1 : 0) << 1) + (this.IconCompatParcelizer ? 1 : 0);
    }
}
