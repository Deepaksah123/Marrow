package kotlin;

import kotlin.getLessonActivityStatus;

/* JADX INFO: loaded from: classes4.dex */
public final class getLessonType {
    public static final getMasterOrder RemoteActionCompatParcelizer(getLessonActivityStatus getlessonactivitystatus, RevisionSubjectStatusModel revisionSubjectStatusModel, incrementTotalCount incrementtotalcount) {
        toMagicModuleMetaRepoModel.write(getlessonactivitystatus, "");
        toMagicModuleMetaRepoModel.write(revisionSubjectStatusModel, "");
        toMagicModuleMetaRepoModel.write(incrementtotalcount, "");
        getLessonActivityStatus.write writeVarIconCompatParcelizer = getlessonactivitystatus.IconCompatParcelizer(revisionSubjectStatusModel, incrementtotalcount);
        if (writeVarIconCompatParcelizer != null) {
            return writeVarIconCompatParcelizer.AudioAttributesCompatParcelizer();
        }
        return null;
    }

    public static final getMasterOrder IconCompatParcelizer(getLessonActivityStatus getlessonactivitystatus, isPaused ispaused, incrementTotalCount incrementtotalcount) {
        toMagicModuleMetaRepoModel.write(getlessonactivitystatus, "");
        toMagicModuleMetaRepoModel.write(ispaused, "");
        toMagicModuleMetaRepoModel.write(incrementtotalcount, "");
        getLessonActivityStatus.write writeVarRemoteActionCompatParcelizer = getlessonactivitystatus.RemoteActionCompatParcelizer(ispaused, incrementtotalcount);
        if (writeVarRemoteActionCompatParcelizer != null) {
            return writeVarRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
        }
        return null;
    }
}
