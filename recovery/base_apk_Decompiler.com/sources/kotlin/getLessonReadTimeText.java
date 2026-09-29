package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class getLessonReadTimeText implements setQuestions {
    private final getMasterOrder IconCompatParcelizer;
    private final getQuestions RemoteActionCompatParcelizer;
    private final isAnswerAvailable<incrementTotalCount> read;
    private final boolean write;

    public getLessonReadTimeText(getMasterOrder getmasterorder, isAnswerAvailable<incrementTotalCount> isansweravailable, boolean z, getQuestions getquestions) {
        toMagicModuleMetaRepoModel.write(getmasterorder, "");
        toMagicModuleMetaRepoModel.write(getquestions, "");
        this.IconCompatParcelizer = getmasterorder;
        this.read = isansweravailable;
        this.write = z;
        this.RemoteActionCompatParcelizer = getquestions;
    }

    public final getMasterOrder RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // kotlin.setQuestions
    public final String IconCompatParcelizer() {
        StringBuilder sb = new StringBuilder("Class '");
        sb.append(this.IconCompatParcelizer.read().AudioAttributesCompatParcelizer().RemoteActionCompatParcelizer());
        sb.append('\'');
        return sb.toString();
    }

    @Override // kotlin.getIntroDurationSeconds
    public final CourseConfigV2VideoPageItem AudioAttributesCompatParcelizer() {
        CourseConfigV2VideoPageItem courseConfigV2VideoPageItem = CourseConfigV2VideoPageItem.read;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(courseConfigV2VideoPageItem, "");
        return courseConfigV2VideoPageItem;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(": ");
        sb.append(this.IconCompatParcelizer);
        return sb.toString();
    }
}
