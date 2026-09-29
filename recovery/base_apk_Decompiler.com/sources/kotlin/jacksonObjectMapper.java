package kotlin;

import android.content.ComponentName;
import android.content.Context;
import android.os.Handler;
import android.os.Message;

/* JADX INFO: loaded from: classes4.dex */
public abstract class jacksonObjectMapper {
    private final Context AudioAttributesCompatParcelizer;
    private boolean AudioAttributesImplBaseParcelizer;
    private final IconCompatParcelizer IconCompatParcelizer = new IconCompatParcelizer();
    private final RemoteActionCompatParcelizer MediaBrowserCompatCustomActionResultReceiver;
    private boolean MediaBrowserCompatItemReceiver;
    private C0183jsonMapper RemoteActionCompatParcelizer;
    private kotlinModuledefault read;
    private write write;

    public static abstract class write {
        public void read(jacksonObjectMapper jacksonobjectmapper, kotlinModuledefault kotlinmoduledefault) {
        }
    }

    public void IconCompatParcelizer(C0183jsonMapper c0183jsonMapper) {
    }

    jacksonObjectMapper(Context context, RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        }
        this.AudioAttributesCompatParcelizer = context;
        if (remoteActionCompatParcelizer == null) {
            this.MediaBrowserCompatCustomActionResultReceiver = new RemoteActionCompatParcelizer(new ComponentName(context, getClass()));
        } else {
            this.MediaBrowserCompatCustomActionResultReceiver = remoteActionCompatParcelizer;
        }
    }

    public final Context AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final Handler AudioAttributesImplApi26Parcelizer() {
        return this.IconCompatParcelizer;
    }

    public final RemoteActionCompatParcelizer AudioAttributesImplApi21Parcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final void AudioAttributesCompatParcelizer(write writeVar) {
        ExtensionsKtkotlinModule1.write();
        this.write = writeVar;
    }

    public final C0183jsonMapper RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final void AudioAttributesCompatParcelizer(C0183jsonMapper c0183jsonMapper) {
        ExtensionsKtkotlinModule1.write();
        if (configureFromStringCreator.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, c0183jsonMapper)) {
            return;
        }
        this.RemoteActionCompatParcelizer = c0183jsonMapper;
        if (this.AudioAttributesImplBaseParcelizer) {
            return;
        }
        this.AudioAttributesImplBaseParcelizer = true;
        this.IconCompatParcelizer.sendEmptyMessage(2);
    }

    void read() {
        this.AudioAttributesImplBaseParcelizer = false;
        IconCompatParcelizer(this.RemoteActionCompatParcelizer);
    }

    public final kotlinModuledefault IconCompatParcelizer() {
        return this.read;
    }

    public final void write(kotlinModuledefault kotlinmoduledefault) {
        ExtensionsKtkotlinModule1.write();
        if (this.read != kotlinmoduledefault) {
            this.read = kotlinmoduledefault;
            if (this.MediaBrowserCompatItemReceiver) {
                return;
            }
            this.MediaBrowserCompatItemReceiver = true;
            this.IconCompatParcelizer.sendEmptyMessage(1);
        }
    }

    void write() {
        this.MediaBrowserCompatItemReceiver = false;
        write writeVar = this.write;
        if (writeVar != null) {
            writeVar.read(this, this.read);
        }
    }

    public AudioAttributesCompatParcelizer read(String str) {
        if (str != null) {
            return null;
        }
        throw new IllegalArgumentException("routeId cannot be null");
    }

    public AudioAttributesCompatParcelizer IconCompatParcelizer(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("routeId cannot be null");
        }
        if (str2 == null) {
            throw new IllegalArgumentException("routeGroupId cannot be null");
        }
        return read(str);
    }

    public static final class RemoteActionCompatParcelizer {
        private final ComponentName IconCompatParcelizer;

        RemoteActionCompatParcelizer(ComponentName componentName) {
            if (componentName == null) {
                throw new IllegalArgumentException("componentName must not be null");
            }
            this.IconCompatParcelizer = componentName;
        }

        public final String write() {
            return this.IconCompatParcelizer.getPackageName();
        }

        public final ComponentName RemoteActionCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ProviderMetadata{ componentName=");
            sb.append(this.IconCompatParcelizer.flattenToShortString());
            sb.append(" }");
            return sb.toString();
        }
    }

    public static abstract class AudioAttributesCompatParcelizer {
        public void AudioAttributesCompatParcelizer(int i) {
        }

        public void IconCompatParcelizer() {
        }

        public void read() {
        }

        public void write() {
        }

        public void write(int i) {
        }

        public void RemoteActionCompatParcelizer(int i) {
            IconCompatParcelizer();
        }
    }

    final class IconCompatParcelizer extends Handler {
        IconCompatParcelizer() {
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                jacksonObjectMapper.this.write();
            } else {
                if (i != 2) {
                    return;
                }
                jacksonObjectMapper.this.read();
            }
        }
    }
}
