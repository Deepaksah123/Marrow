package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class newSingleThreadScheduledExecutor {
    private final int AudioAttributesCompatParcelizer;
    private final int IconCompatParcelizer;
    private final int read;
    private final int write;

    public newSingleThreadScheduledExecutor(int i, int i2, int i3, int i4) {
        this.IconCompatParcelizer = i;
        this.read = i2;
        this.AudioAttributesCompatParcelizer = i3;
        this.write = i4;
    }

    public final int RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final int IconCompatParcelizer() {
        return this.read;
    }

    public final int read() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final int AudioAttributesCompatParcelizer() {
        return this.write;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof newSingleThreadScheduledExecutor)) {
            return false;
        }
        newSingleThreadScheduledExecutor newsinglethreadscheduledexecutor = (newSingleThreadScheduledExecutor) obj;
        return this.IconCompatParcelizer == newsinglethreadscheduledexecutor.IconCompatParcelizer && this.read == newsinglethreadscheduledexecutor.read && this.AudioAttributesCompatParcelizer == newsinglethreadscheduledexecutor.AudioAttributesCompatParcelizer && this.write == newsinglethreadscheduledexecutor.write;
    }

    public final int hashCode() {
        return (((((Integer.hashCode(this.IconCompatParcelizer) * 31) + Integer.hashCode(this.read)) * 31) + Integer.hashCode(this.AudioAttributesCompatParcelizer)) * 31) + Integer.hashCode(this.write);
    }

    public final String toString() {
        int i = this.IconCompatParcelizer;
        int i2 = this.read;
        int i3 = this.AudioAttributesCompatParcelizer;
        int i4 = this.write;
        StringBuilder sb = new StringBuilder("VideoSubjectProgressUcModel(lessonCompletionCount=");
        sb.append(i);
        sb.append(", lessonTotalCount=");
        sb.append(i2);
        sb.append(", activeRecallTotalCount=");
        sb.append(i3);
        sb.append(", activeRecallCompletionCount=");
        sb.append(i4);
        sb.append(")");
        return sb.toString();
    }
}
