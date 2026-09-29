package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public enum isAddressAvailable {
    ERROR_CLASS("<Error class: %s>"),
    ERROR_FUNCTION("<Error function>"),
    ERROR_SCOPE("<Error scope>"),
    ERROR_MODULE("<Error module>"),
    ERROR_PROPERTY("<Error property>"),
    ERROR_TYPE("[Error type: %s]"),
    PARENT_OF_ERROR_SCOPE("<Fake parent for error lexical scope>");

    private final String AudioAttributesImplApi21Parcelizer;

    isAddressAvailable(String str) {
        this.AudioAttributesImplApi21Parcelizer = str;
    }

    public final String AudioAttributesCompatParcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }
}
