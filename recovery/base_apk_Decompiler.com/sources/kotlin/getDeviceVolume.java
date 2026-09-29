package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class getDeviceVolume extends ExoPlayerDeviceComponent {
    private final ExoPlayerBuilderExternalSyntheticLambda15 AudioAttributesCompatParcelizer;
    private final String read;
    private final LessonCompletedDialog write;

    public final LessonCompletedDialog AudioAttributesCompatParcelizer() {
        return this.write;
    }

    public final String IconCompatParcelizer() {
        return this.read;
    }

    public final ExoPlayerBuilderExternalSyntheticLambda15 read() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getDeviceVolume(LessonCompletedDialog lessonCompletedDialog, String str, ExoPlayerBuilderExternalSyntheticLambda15 exoPlayerBuilderExternalSyntheticLambda15) {
        super(null);
        toMagicModuleMetaRepoModel.write(lessonCompletedDialog, "");
        toMagicModuleMetaRepoModel.write(exoPlayerBuilderExternalSyntheticLambda15, "");
        this.write = lessonCompletedDialog;
        this.read = str;
        this.AudioAttributesCompatParcelizer = exoPlayerBuilderExternalSyntheticLambda15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getDeviceVolume)) {
            return false;
        }
        getDeviceVolume getdevicevolume = (getDeviceVolume) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, getdevicevolume.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) getdevicevolume.read) && this.AudioAttributesCompatParcelizer == getdevicevolume.AudioAttributesCompatParcelizer;
    }

    public final int hashCode() {
        int iHashCode = this.write.hashCode();
        String str = this.read;
        return (((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.AudioAttributesCompatParcelizer.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SourceResult(source=");
        sb.append(this.write);
        sb.append(", mimeType=");
        sb.append((Object) this.read);
        sb.append(", dataSource=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }
}
