package kotlin;

import com.marrow.data.models.mcq.QaPair;

/* JADX INFO: loaded from: classes3.dex */
public final class lockRange {
    public static final getSpan read(QaPair qaPair) {
        if (qaPair != null) {
            String mcqId = qaPair.getMcqId();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(mcqId, "");
            boolean zIsStarred = qaPair.isStarred();
            String answerPointer = qaPair.getAnswerPointer();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(answerPointer, "");
            return new getSpan(mcqId, zIsStarred, answerPointer, delete.RemoteActionCompatParcelizer(qaPair.getAnswer()));
        }
        return new getSpan(null, false, null, null, 15, null);
    }
}
