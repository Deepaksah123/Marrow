package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u001c\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0001&BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J\t\u0010\u001e\u001a\u00020\u000bHÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003JQ\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\tHÆ\u0001J\u0013\u0010\"\u001a\u00020\t2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u000bHÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0017R\u0011\u0010\r\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0017¨\u0006'"}, d2 = {"Lcom/marrow2/ui/magic_module/done/MagicModuleDoneUIStates;", "", "moduleId", "", "mcqDetails", "Lcom/marrow2/ui/magic_module/intro/ModuleMcqDetails;", "overallStats", "Lcom/marrow2/ui/magic_module/intro/OverallStats;", "expandOverallStats", "", "correctModuleCount", "", "isFirstModule", "isFeedbackEnabled", "<init>", "(Ljava/lang/String;Lcom/marrow2/ui/magic_module/intro/ModuleMcqDetails;Lcom/marrow2/ui/magic_module/intro/OverallStats;ZIZZ)V", "getModuleId", "()Ljava/lang/String;", "getMcqDetails", "()Lcom/marrow2/ui/magic_module/intro/ModuleMcqDetails;", "getOverallStats", "()Lcom/marrow2/ui/magic_module/intro/OverallStats;", "getExpandOverallStats", "()Z", "getCorrectModuleCount", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "Companion", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TaskUtil {
    public static final RemoteActionCompatParcelizer RemoteActionCompatParcelizer = new RemoteActionCompatParcelizer(null);
    private static final TaskUtil write = new TaskUtil("", new zaaw(25, 0, 0), null, false, 0, false, true, 12, null);
    private final int AudioAttributesCompatParcelizer;
    private final zaaw AudioAttributesImplApi21Parcelizer;
    private final String AudioAttributesImplApi26Parcelizer;
    private final boolean IconCompatParcelizer;
    private final zaau MediaBrowserCompatCustomActionResultReceiver;
    private final boolean MediaBrowserCompatItemReceiver;
    private final boolean read;

    private TaskUtil(String str, zaaw zaawVar, zaau zaauVar, boolean z, int i, boolean z2, boolean z3) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(zaawVar, "");
        this.AudioAttributesImplApi26Parcelizer = str;
        this.AudioAttributesImplApi21Parcelizer = zaawVar;
        this.MediaBrowserCompatCustomActionResultReceiver = zaauVar;
        this.IconCompatParcelizer = z;
        this.AudioAttributesCompatParcelizer = i;
        this.MediaBrowserCompatItemReceiver = z2;
        this.read = z3;
    }

    public /* synthetic */ TaskUtil(String str, zaaw zaawVar, zaau zaauVar, boolean z, int i, boolean z2, boolean z3, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(str, zaawVar, (i2 & 4) != 0 ? null : zaauVar, (i2 & 8) != 0 ? false : z, i, z2, z3);
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final String getAudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final zaaw getAudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final zaau getMediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final boolean getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final boolean getRead() {
        return this.read;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lo/TaskUtil$RemoteActionCompatParcelizer;", "", "<init>", "()V", "Lo/TaskUtil;", "write", "Lo/TaskUtil;", "IconCompatParcelizer", "()Lo/TaskUtil;", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer {
        private RemoteActionCompatParcelizer() {
        }

        public static TaskUtil IconCompatParcelizer() {
            return TaskUtil.write;
        }

        public /* synthetic */ RemoteActionCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public static /* synthetic */ TaskUtil AudioAttributesCompatParcelizer(TaskUtil taskUtil, String str, zaaw zaawVar, zaau zaauVar, boolean z, int i, boolean z2, boolean z3, int i2) {
        if ((i2 & 1) != 0) {
            str = taskUtil.AudioAttributesImplApi26Parcelizer;
        }
        if ((i2 & 2) != 0) {
            zaawVar = taskUtil.AudioAttributesImplApi21Parcelizer;
        }
        zaaw zaawVar2 = zaawVar;
        if ((i2 & 4) != 0) {
            zaauVar = taskUtil.MediaBrowserCompatCustomActionResultReceiver;
        }
        zaau zaauVar2 = zaauVar;
        if ((i2 & 8) != 0) {
            z = taskUtil.IconCompatParcelizer;
        }
        boolean z4 = z;
        if ((i2 & 16) != 0) {
            i = taskUtil.AudioAttributesCompatParcelizer;
        }
        int i3 = i;
        if ((i2 & 32) != 0) {
            z2 = taskUtil.MediaBrowserCompatItemReceiver;
        }
        boolean z5 = z2;
        if ((i2 & 64) != 0) {
            z3 = taskUtil.read;
        }
        return IconCompatParcelizer(str, zaawVar2, zaauVar2, z4, i3, z5, z3);
    }

    private static TaskUtil IconCompatParcelizer(String str, zaaw zaawVar, zaau zaauVar, boolean z, int i, boolean z2, boolean z3) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(zaawVar, "");
        return new TaskUtil(str, zaawVar, zaauVar, z, i, z2, z3);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TaskUtil)) {
            return false;
        }
        TaskUtil taskUtil = (TaskUtil) other;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplApi26Parcelizer, (Object) taskUtil.AudioAttributesImplApi26Parcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, taskUtil.AudioAttributesImplApi21Parcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, taskUtil.MediaBrowserCompatCustomActionResultReceiver) && this.IconCompatParcelizer == taskUtil.IconCompatParcelizer && this.AudioAttributesCompatParcelizer == taskUtil.AudioAttributesCompatParcelizer && this.MediaBrowserCompatItemReceiver == taskUtil.MediaBrowserCompatItemReceiver && this.read == taskUtil.read;
    }

    public final int hashCode() {
        int iHashCode = this.AudioAttributesImplApi26Parcelizer.hashCode();
        int iHashCode2 = this.AudioAttributesImplApi21Parcelizer.hashCode();
        zaau zaauVar = this.MediaBrowserCompatCustomActionResultReceiver;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + (zaauVar == null ? 0 : zaauVar.hashCode())) * 31) + Boolean.hashCode(this.IconCompatParcelizer)) * 31) + Integer.hashCode(this.AudioAttributesCompatParcelizer)) * 31) + Boolean.hashCode(this.MediaBrowserCompatItemReceiver)) * 31) + Boolean.hashCode(this.read);
    }

    public final String toString() {
        String str = this.AudioAttributesImplApi26Parcelizer;
        zaaw zaawVar = this.AudioAttributesImplApi21Parcelizer;
        zaau zaauVar = this.MediaBrowserCompatCustomActionResultReceiver;
        boolean z = this.IconCompatParcelizer;
        int i = this.AudioAttributesCompatParcelizer;
        boolean z2 = this.MediaBrowserCompatItemReceiver;
        boolean z3 = this.read;
        StringBuilder sb = new StringBuilder("MagicModuleDoneUIStates(moduleId=");
        sb.append(str);
        sb.append(", mcqDetails=");
        sb.append(zaawVar);
        sb.append(", overallStats=");
        sb.append(zaauVar);
        sb.append(", expandOverallStats=");
        sb.append(z);
        sb.append(", correctModuleCount=");
        sb.append(i);
        sb.append(", isFirstModule=");
        sb.append(z2);
        sb.append(", isFeedbackEnabled=");
        sb.append(z3);
        sb.append(")");
        return sb.toString();
    }
}
