package kotlin;

/* JADX INFO: loaded from: classes5.dex */
public final class parseFromSection {
    private final SpliceScheduleCommandComponentSplice AudioAttributesCompatParcelizer;
    private final TextInformationFrame1 IconCompatParcelizer;
    private final SlowMotionDataSegment1 RemoteActionCompatParcelizer;

    public parseFromSection(SlowMotionDataSegment1 slowMotionDataSegment1, SpliceScheduleCommandComponentSplice spliceScheduleCommandComponentSplice, TextInformationFrame1 textInformationFrame1) {
        toMagicModuleMetaRepoModel.write(slowMotionDataSegment1, "");
        toMagicModuleMetaRepoModel.write(spliceScheduleCommandComponentSplice, "");
        toMagicModuleMetaRepoModel.write(textInformationFrame1, "");
        this.RemoteActionCompatParcelizer = slowMotionDataSegment1;
        this.AudioAttributesCompatParcelizer = spliceScheduleCommandComponentSplice;
        this.IconCompatParcelizer = textInformationFrame1;
    }

    public final SlowMotionDataSegment1 AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final SpliceScheduleCommandComponentSplice write() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final TextInformationFrame1 RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof parseFromSection)) {
            return false;
        }
        parseFromSection parsefromsection = (parseFromSection) obj;
        return this.RemoteActionCompatParcelizer == parsefromsection.RemoteActionCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, parsefromsection.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, parsefromsection.IconCompatParcelizer);
    }

    public final int hashCode() {
        return (((this.RemoteActionCompatParcelizer.hashCode() * 31) + this.AudioAttributesCompatParcelizer.hashCode()) * 31) + this.IconCompatParcelizer.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionEvent(eventType=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", sessionData=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(", applicationInfo=");
        sb.append(this.IconCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }
}
