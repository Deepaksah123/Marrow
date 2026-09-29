package kotlin;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class getEditor {
    private final getExamDurationSeconds AudioAttributesCompatParcelizer;
    private final boolean IconCompatParcelizer;
    private final getExamDurationSeconds RemoteActionCompatParcelizer;
    private final Map<getNotesCount, getExamDurationSeconds> read;
    private final RenewEligible write;

    /* JADX WARN: Multi-variable type inference failed */
    private getEditor(getExamDurationSeconds getexamdurationseconds, getExamDurationSeconds getexamdurationseconds2, Map<getNotesCount, ? extends getExamDurationSeconds> map) {
        toMagicModuleMetaRepoModel.write(getexamdurationseconds, "");
        toMagicModuleMetaRepoModel.write(map, "");
        this.AudioAttributesCompatParcelizer = getexamdurationseconds;
        this.RemoteActionCompatParcelizer = getexamdurationseconds2;
        this.read = map;
        this.write = getRenewExpiresOn.RemoteActionCompatParcelizer(new IconCompatParcelizer());
        this.IconCompatParcelizer = getexamdurationseconds == getExamDurationSeconds.IGNORE && getexamdurationseconds2 == getExamDurationSeconds.IGNORE && map.isEmpty();
    }

    public final getExamDurationSeconds RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final getExamDurationSeconds IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public /* synthetic */ getEditor(getExamDurationSeconds getexamdurationseconds, getExamDurationSeconds getexamdurationseconds2) {
        this(getexamdurationseconds, getexamdurationseconds2, VideoTimelineResponseBody.read());
    }

    public final Map<getNotesCount, getExamDurationSeconds> read() {
        return this.read;
    }

    static final class IconCompatParcelizer extends MagicModuleUseCase implements getCreatedOnDateMs<String[]> {
        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public String[] invoke() {
            getEditor geteditor = getEditor.this;
            List listIconCompatParcelizer = IntermediateLoginResponseBody.IconCompatParcelizer();
            listIconCompatParcelizer.add(geteditor.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer());
            getExamDurationSeconds getexamdurationsecondsIconCompatParcelizer = geteditor.IconCompatParcelizer();
            if (getexamdurationsecondsIconCompatParcelizer != null) {
                StringBuilder sb = new StringBuilder("under-migration:");
                sb.append(getexamdurationsecondsIconCompatParcelizer.AudioAttributesCompatParcelizer());
                listIconCompatParcelizer.add(sb.toString());
            }
            for (Map.Entry<getNotesCount, getExamDurationSeconds> entry : geteditor.read().entrySet()) {
                StringBuilder sb2 = new StringBuilder("@");
                sb2.append(entry.getKey());
                sb2.append(':');
                sb2.append(entry.getValue().AudioAttributesCompatParcelizer());
                listIconCompatParcelizer.add(sb2.toString());
            }
            return (String[]) IntermediateLoginResponseBody.AudioAttributesCompatParcelizer(listIconCompatParcelizer).toArray(new String[0]);
        }

        IconCompatParcelizer() {
            super(0);
        }
    }

    public final boolean AudioAttributesCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getEditor)) {
            return false;
        }
        getEditor geteditor = (getEditor) obj;
        return this.AudioAttributesCompatParcelizer == geteditor.AudioAttributesCompatParcelizer && this.RemoteActionCompatParcelizer == geteditor.RemoteActionCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, geteditor.read);
    }

    public final int hashCode() {
        int iHashCode = this.AudioAttributesCompatParcelizer.hashCode();
        getExamDurationSeconds getexamdurationseconds = this.RemoteActionCompatParcelizer;
        return (((iHashCode * 31) + (getexamdurationseconds == null ? 0 : getexamdurationseconds.hashCode())) * 31) + this.read.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Jsr305Settings(globalLevel=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(", migrationLevel=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", userDefinedLevelForSpecificAnnotation=");
        sb.append(this.read);
        sb.append(')');
        return sb.toString();
    }
}
