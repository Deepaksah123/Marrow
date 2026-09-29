package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class obtainSystemMessage {
    private final String AudioAttributesCompatParcelizer;
    private final long IconCompatParcelizer;
    private final String MediaBrowserCompatItemReceiver;
    private List<AudioAttributesCompatParcelizer> RemoteActionCompatParcelizer;
    private final String read;
    private final String write;

    public obtainSystemMessage(String str, String str2, long j, String str3, String str4, List<AudioAttributesCompatParcelizer> list) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        toMagicModuleMetaRepoModel.write(list, "");
        this.AudioAttributesCompatParcelizer = str;
        this.read = str2;
        this.IconCompatParcelizer = j;
        this.write = str3;
        this.MediaBrowserCompatItemReceiver = str4;
        this.RemoteActionCompatParcelizer = list;
    }

    public final String AudioAttributesCompatParcelizer() {
        return this.read;
    }

    public final long IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final String read() {
        return this.write;
    }

    public final String write() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final List<AudioAttributesCompatParcelizer> RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public static final class AudioAttributesCompatParcelizer {
        private final int AudioAttributesCompatParcelizer;
        private final int IconCompatParcelizer;
        private final String RemoteActionCompatParcelizer;
        private final String read;
        private final onDisplayInfoChanged write;

        public AudioAttributesCompatParcelizer(String str, onDisplayInfoChanged ondisplayinfochanged, String str2, int i, int i2) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(ondisplayinfochanged, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            this.RemoteActionCompatParcelizer = str;
            this.write = ondisplayinfochanged;
            this.read = str2;
            this.IconCompatParcelizer = i;
            this.AudioAttributesCompatParcelizer = i2;
        }

        public final String IconCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        public final onDisplayInfoChanged AudioAttributesCompatParcelizer() {
            return this.write;
        }

        public final String read() {
            return this.read;
        }

        public final int RemoteActionCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final int write() {
            return this.AudioAttributesCompatParcelizer;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static AudioAttributesCompatParcelizer IconCompatParcelizer(String str, onDisplayInfoChanged ondisplayinfochanged, String str2, int i, int i2) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(ondisplayinfochanged, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            return new AudioAttributesCompatParcelizer(str, ondisplayinfochanged, str2, i, i2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AudioAttributesCompatParcelizer)) {
                return false;
            }
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (AudioAttributesCompatParcelizer) obj;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) audioAttributesCompatParcelizer.RemoteActionCompatParcelizer) && this.write == audioAttributesCompatParcelizer.write && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) audioAttributesCompatParcelizer.read) && this.IconCompatParcelizer == audioAttributesCompatParcelizer.IconCompatParcelizer && this.AudioAttributesCompatParcelizer == audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer;
        }

        public final int hashCode() {
            return (((((((this.RemoteActionCompatParcelizer.hashCode() * 31) + this.write.hashCode()) * 31) + this.read.hashCode()) * 31) + Integer.hashCode(this.IconCompatParcelizer)) * 31) + Integer.hashCode(this.AudioAttributesCompatParcelizer);
        }

        public final String toString() {
            String str = this.RemoteActionCompatParcelizer;
            onDisplayInfoChanged ondisplayinfochanged = this.write;
            String str2 = this.read;
            int i = this.IconCompatParcelizer;
            int i2 = this.AudioAttributesCompatParcelizer;
            StringBuilder sb = new StringBuilder("SchemaMcqListing(mcqId=");
            sb.append(str);
            sb.append(", bookmarkType=");
            sb.append(ondisplayinfochanged);
            sb.append(", title=");
            sb.append(str2);
            sb.append(", myAnswer=");
            sb.append(i);
            sb.append(", correctAnswer=");
            sb.append(i2);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static obtainSystemMessage read(String str, String str2, long j, String str3, String str4, List<AudioAttributesCompatParcelizer> list) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        toMagicModuleMetaRepoModel.write(list, "");
        return new obtainSystemMessage(str, str2, j, str3, str4, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof obtainSystemMessage)) {
            return false;
        }
        obtainSystemMessage obtainsystemmessage = (obtainSystemMessage) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) obtainsystemmessage.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) obtainsystemmessage.read) && this.IconCompatParcelizer == obtainsystemmessage.IconCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) obtainsystemmessage.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatItemReceiver, (Object) obtainsystemmessage.MediaBrowserCompatItemReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, obtainsystemmessage.RemoteActionCompatParcelizer);
    }

    public final int hashCode() {
        return (((((((((this.AudioAttributesCompatParcelizer.hashCode() * 31) + this.read.hashCode()) * 31) + Long.hashCode(this.IconCompatParcelizer)) * 31) + this.write.hashCode()) * 31) + this.MediaBrowserCompatItemReceiver.hashCode()) * 31) + this.RemoteActionCompatParcelizer.hashCode();
    }

    public final String toString() {
        String str = this.AudioAttributesCompatParcelizer;
        String str2 = this.read;
        long j = this.IconCompatParcelizer;
        String str3 = this.write;
        String str4 = this.MediaBrowserCompatItemReceiver;
        List<AudioAttributesCompatParcelizer> list = this.RemoteActionCompatParcelizer;
        StringBuilder sb = new StringBuilder("SchemaDetailUCModel(lessonId=");
        sb.append(str);
        sb.append(", lessonName=");
        sb.append(str2);
        sb.append(", solvedOn=");
        sb.append(j);
        sb.append(", rootSubjectName=");
        sb.append(str3);
        sb.append(", stepId=");
        sb.append(str4);
        sb.append(", mcqIndexes=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }
}
