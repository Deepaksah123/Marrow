package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public enum getQuestionSource {
    CLASS("class"),
    INTERFACE("interface"),
    ENUM_CLASS("enum class"),
    ENUM_ENTRY(null),
    ANNOTATION_CLASS("annotation class"),
    OBJECT("object");

    private final String AudioAttributesImplBaseParcelizer;

    getQuestionSource(String str) {
        this.AudioAttributesImplBaseParcelizer = str;
    }

    public final boolean AudioAttributesCompatParcelizer() {
        return this == OBJECT || this == ENUM_ENTRY;
    }
}
