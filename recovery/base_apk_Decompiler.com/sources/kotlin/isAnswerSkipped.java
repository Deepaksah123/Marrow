package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class isAnswerSkipped extends RuntimeException {
    private final List<String> IconCompatParcelizer;

    public isAnswerSkipped() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.IconCompatParcelizer = null;
    }

    public final LessonTabItem AudioAttributesCompatParcelizer() {
        return new LessonTabItem(getMessage());
    }
}
