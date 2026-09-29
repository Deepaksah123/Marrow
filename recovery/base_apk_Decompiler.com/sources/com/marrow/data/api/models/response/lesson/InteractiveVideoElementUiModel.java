package com.marrow.data.api.models.response.lesson;

import java.util.List;
import kotlin.IntermediateLoginResponseBody;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0086\b\u0018\u0000 22\u00020\u0001:\u00012BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\n¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000fJ\u0010\u0010\u0014\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\nHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018JT\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\nHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u000fJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0011R\u001a\u0010 \u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0011R\u001a\u0010#\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u000fR\u001a\u0010&\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b'\u0010\u000fR\u001a\u0010(\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u0015R$\u0010+\u001a\u0004\u0018\u00010\u00078\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b+\u0010)\u001a\u0004\b,\u0010\u0015\"\u0004\b-\u0010.R \u0010/\u001a\b\u0012\u0004\u0012\u00020\u00070\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u0010\u0018"}, d2 = {"Lcom/marrow/data/api/models/response/lesson/InteractiveVideoElementUiModel;", "", "", "p0", "", "p1", "p2", "Lcom/marrow/data/api/models/response/lesson/InteractiveMcqOption;", "p3", "p4", "", "p5", "<init>", "(Ljava/lang/String;IILcom/marrow/data/api/models/response/lesson/InteractiveMcqOption;Lcom/marrow/data/api/models/response/lesson/InteractiveMcqOption;Ljava/util/List;)V", "getIndexOfCorrectOption", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/marrow/data/api/models/response/lesson/InteractiveMcqOption;", "component5", "component6", "()Ljava/util/List;", "copy", "(Ljava/lang/String;IILcom/marrow/data/api/models/response/lesson/InteractiveMcqOption;Lcom/marrow/data/api/models/response/lesson/InteractiveMcqOption;Ljava/util/List;)Lcom/marrow/data/api/models/response/lesson/InteractiveVideoElementUiModel;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "id", "Ljava/lang/String;", "getId", "startTime", "I", "getStartTime", "endTime", "getEndTime", "correctOption", "Lcom/marrow/data/api/models/response/lesson/InteractiveMcqOption;", "getCorrectOption", "attemptedOption", "getAttemptedOption", "setAttemptedOption", "(Lcom/marrow/data/api/models/response/lesson/InteractiveMcqOption;)V", "allOptions", "Ljava/util/List;", "getAllOptions", "Companion"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InteractiveVideoElementUiModel {
    public static final int INVALID_OPTION = -1;
    private final List<InteractiveMcqOption> allOptions;
    private InteractiveMcqOption attemptedOption;
    private final InteractiveMcqOption correctOption;
    private final int endTime;
    private final String id;
    private final int startTime;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InteractiveVideoElementUiModel emptyState = new InteractiveVideoElementUiModel("", -1, -1, InteractiveMcqOption.INVALID, null, null, 32, null);

    /* JADX WARN: Multi-variable type inference failed */
    public InteractiveVideoElementUiModel(String str, int i, int i2, InteractiveMcqOption interactiveMcqOption, InteractiveMcqOption interactiveMcqOption2, List<? extends InteractiveMcqOption> list) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(interactiveMcqOption, "");
        toMagicModuleMetaRepoModel.write(list, "");
        this.id = str;
        this.startTime = i;
        this.endTime = i2;
        this.correctOption = interactiveMcqOption;
        this.attemptedOption = interactiveMcqOption2;
        this.allOptions = list;
    }

    public final String getId() {
        return this.id;
    }

    public final int getStartTime() {
        return this.startTime;
    }

    public final int getEndTime() {
        return this.endTime;
    }

    public final InteractiveMcqOption getCorrectOption() {
        return this.correctOption;
    }

    public final InteractiveMcqOption getAttemptedOption() {
        return this.attemptedOption;
    }

    public final void setAttemptedOption(InteractiveMcqOption interactiveMcqOption) {
        this.attemptedOption = interactiveMcqOption;
    }

    public final List<InteractiveMcqOption> getAllOptions() {
        return this.allOptions;
    }

    public /* synthetic */ InteractiveVideoElementUiModel(String str, int i, int i2, InteractiveMcqOption interactiveMcqOption, InteractiveMcqOption interactiveMcqOption2, List list, int i3, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(str, i, i2, interactiveMcqOption, interactiveMcqOption2, (i3 & 32) != 0 ? IntermediateLoginResponseBody.write(InteractiveMcqOption.OPTION_A, InteractiveMcqOption.OPTION_B, InteractiveMcqOption.OPTION_C, InteractiveMcqOption.OPTION_D) : list);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/marrow/data/api/models/response/lesson/InteractiveVideoElementUiModel$Companion;", "", "<init>", "()V", "", "INVALID_OPTION", "I", "Lcom/marrow/data/api/models/response/lesson/InteractiveVideoElementUiModel;", "emptyState", "Lcom/marrow/data/api/models/response/lesson/InteractiveVideoElementUiModel;", "getEmptyState", "()Lcom/marrow/data/api/models/response/lesson/InteractiveVideoElementUiModel;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final InteractiveVideoElementUiModel getEmptyState() {
            return InteractiveVideoElementUiModel.emptyState;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public final int getIndexOfCorrectOption() {
        return this.correctOption.getOptionIndex();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InteractiveVideoElementUiModel copy$default(InteractiveVideoElementUiModel interactiveVideoElementUiModel, String str, int i, int i2, InteractiveMcqOption interactiveMcqOption, InteractiveMcqOption interactiveMcqOption2, List list, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = interactiveVideoElementUiModel.id;
        }
        if ((i3 & 2) != 0) {
            i = interactiveVideoElementUiModel.startTime;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            i2 = interactiveVideoElementUiModel.endTime;
        }
        int i5 = i2;
        if ((i3 & 8) != 0) {
            interactiveMcqOption = interactiveVideoElementUiModel.correctOption;
        }
        InteractiveMcqOption interactiveMcqOption3 = interactiveMcqOption;
        if ((i3 & 16) != 0) {
            interactiveMcqOption2 = interactiveVideoElementUiModel.attemptedOption;
        }
        InteractiveMcqOption interactiveMcqOption4 = interactiveMcqOption2;
        if ((i3 & 32) != 0) {
            list = interactiveVideoElementUiModel.allOptions;
        }
        return interactiveVideoElementUiModel.copy(str, i4, i5, interactiveMcqOption3, interactiveMcqOption4, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getEndTime() {
        return this.endTime;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final InteractiveMcqOption getCorrectOption() {
        return this.correctOption;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final InteractiveMcqOption getAttemptedOption() {
        return this.attemptedOption;
    }

    public final List<InteractiveMcqOption> component6() {
        return this.allOptions;
    }

    public final InteractiveVideoElementUiModel copy(String p0, int p1, int p2, InteractiveMcqOption p3, InteractiveMcqOption p4, List<? extends InteractiveMcqOption> p5) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p3, "");
        toMagicModuleMetaRepoModel.write(p5, "");
        return new InteractiveVideoElementUiModel(p0, p1, p2, p3, p4, p5);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof InteractiveVideoElementUiModel)) {
            return false;
        }
        InteractiveVideoElementUiModel interactiveVideoElementUiModel = (InteractiveVideoElementUiModel) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.id, (Object) interactiveVideoElementUiModel.id) && this.startTime == interactiveVideoElementUiModel.startTime && this.endTime == interactiveVideoElementUiModel.endTime && this.correctOption == interactiveVideoElementUiModel.correctOption && this.attemptedOption == interactiveVideoElementUiModel.attemptedOption && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.allOptions, interactiveVideoElementUiModel.allOptions);
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode();
        int iHashCode2 = Integer.hashCode(this.startTime);
        int iHashCode3 = Integer.hashCode(this.endTime);
        int iHashCode4 = this.correctOption.hashCode();
        InteractiveMcqOption interactiveMcqOption = this.attemptedOption;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (interactiveMcqOption == null ? 0 : interactiveMcqOption.hashCode())) * 31) + this.allOptions.hashCode();
    }

    public final String toString() {
        String str = this.id;
        int i = this.startTime;
        int i2 = this.endTime;
        InteractiveMcqOption interactiveMcqOption = this.correctOption;
        InteractiveMcqOption interactiveMcqOption2 = this.attemptedOption;
        List<InteractiveMcqOption> list = this.allOptions;
        StringBuilder sb = new StringBuilder("InteractiveVideoElementUiModel(id=");
        sb.append(str);
        sb.append(", startTime=");
        sb.append(i);
        sb.append(", endTime=");
        sb.append(i2);
        sb.append(", correctOption=");
        sb.append(interactiveMcqOption);
        sb.append(", attemptedOption=");
        sb.append(interactiveMcqOption2);
        sb.append(", allOptions=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }
}
