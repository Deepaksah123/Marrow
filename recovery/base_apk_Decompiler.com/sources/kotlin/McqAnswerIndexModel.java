package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public enum McqAnswerIndexModel {
    PLAIN { // from class: o.McqAnswerIndexModel.IconCompatParcelizer
        @Override // kotlin.McqAnswerIndexModel
        public final String read(String str) {
            toMagicModuleMetaRepoModel.write(str, "");
            return str;
        }
    },
    HTML { // from class: o.McqAnswerIndexModel.AudioAttributesCompatParcelizer
        @Override // kotlin.McqAnswerIndexModel
        public final String read(String str) {
            toMagicModuleMetaRepoModel.write(str, "");
            return TestGroupLSModel.read(TestGroupLSModel.read(str, "<", "&lt;", false), ">", "&gt;", false);
        }
    };

    public abstract String read(String str);

    /* synthetic */ McqAnswerIndexModel(byte b) {
        this();
    }
}
