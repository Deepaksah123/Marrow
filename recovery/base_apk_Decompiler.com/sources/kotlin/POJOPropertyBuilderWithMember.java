package kotlin;

import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public abstract class POJOPropertyBuilderWithMember {
    private final JsonFormatTypes RemoteActionCompatParcelizer = new JsonFormatTypes();

    public void write() {
    }

    public final void RemoteActionCompatParcelizer() {
        JsonFormatTypes jsonFormatTypes = this.RemoteActionCompatParcelizer;
        if (jsonFormatTypes != null) {
            jsonFormatTypes.write();
        }
        write();
    }

    public final void AudioAttributesCompatParcelizer(String str, AutoCloseable autoCloseable) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(autoCloseable, "");
        JsonFormatTypes jsonFormatTypes = this.RemoteActionCompatParcelizer;
        if (jsonFormatTypes != null) {
            jsonFormatTypes.AudioAttributesCompatParcelizer(str, autoCloseable);
        }
    }

    @getRenewGrpId
    public /* synthetic */ void write(Closeable closeable) {
        toMagicModuleMetaRepoModel.write(closeable, "");
        JsonFormatTypes jsonFormatTypes = this.RemoteActionCompatParcelizer;
        if (jsonFormatTypes != null) {
            jsonFormatTypes.write(closeable);
        }
    }

    public final <T extends AutoCloseable> T IconCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        JsonFormatTypes jsonFormatTypes = this.RemoteActionCompatParcelizer;
        if (jsonFormatTypes != null) {
            return (T) jsonFormatTypes.RemoteActionCompatParcelizer(str);
        }
        return null;
    }
}
