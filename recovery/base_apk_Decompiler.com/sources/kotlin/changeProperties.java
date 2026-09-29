package kotlin;

import android.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import kotlin.PolymorphicTypeValidator;
import kotlin.StdKeySerializers;
import kotlin.findSerializerByAnnotations;
import kotlin.modifyCollectionSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class changeProperties implements modifyCollectionSerializer {
    private final PolymorphicTypeValidator.AudioAttributesCompatParcelizer AudioAttributesImplApi21Parcelizer;
    private final PolymorphicTypeValidator.IconCompatParcelizer AudioAttributesImplApi26Parcelizer;
    private final parseUdtaMeta<String> AudioAttributesImplBaseParcelizer;
    private PolymorphicTypeValidator IconCompatParcelizer;
    private final HashMap<String, write> MediaBrowserCompatCustomActionResultReceiver;
    private modifyCollectionSerializer.write MediaBrowserCompatItemReceiver;
    private long read;
    private String write;
    private static parseUdtaMeta<String> RemoteActionCompatParcelizer = new parseUdtaMeta() { // from class: o.BeanSerializerModifier
        @Override // kotlin.parseUdtaMeta
        public final Object get() {
            return changeProperties.AudioAttributesCompatParcelizer();
        }
    };
    private static final Random AudioAttributesCompatParcelizer = new Random();

    public changeProperties() {
        this(RemoteActionCompatParcelizer);
    }

    private changeProperties(parseUdtaMeta<String> parseudtameta) {
        this.AudioAttributesImplBaseParcelizer = parseudtameta;
        this.AudioAttributesImplApi26Parcelizer = new PolymorphicTypeValidator.IconCompatParcelizer();
        this.AudioAttributesImplApi21Parcelizer = new PolymorphicTypeValidator.AudioAttributesCompatParcelizer();
        this.MediaBrowserCompatCustomActionResultReceiver = new HashMap<>();
        this.IconCompatParcelizer = PolymorphicTypeValidator.RemoteActionCompatParcelizer;
        this.read = -1L;
    }

    @Override // kotlin.modifyCollectionSerializer
    public final void IconCompatParcelizer(modifyCollectionSerializer.write writeVar) {
        this.MediaBrowserCompatItemReceiver = writeVar;
    }

    @Override // kotlin.modifyCollectionSerializer
    public final String RemoteActionCompatParcelizer(PolymorphicTypeValidator polymorphicTypeValidator, StdKeySerializers.write writeVar) {
        String str;
        synchronized (this) {
            str = read(polymorphicTypeValidator.RemoteActionCompatParcelizer(writeVar.AudioAttributesCompatParcelizer, this.AudioAttributesImplApi21Parcelizer).AudioAttributesImplBaseParcelizer, writeVar).AudioAttributesCompatParcelizer;
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cd A[Catch: all -> 0x00f3, TryCatch #0 {, blocks: (B:4:0x0005, B:8:0x000f, B:10:0x0013, B:15:0x0021, B:17:0x002d, B:19:0x0037, B:23:0x0041, B:25:0x004d, B:26:0x0053, B:28:0x0057, B:30:0x005f, B:32:0x007c, B:34:0x00c7, B:36:0x00cd, B:37:0x00d3, B:39:0x00df, B:41:0x00e5), top: B:47:0x0005 }] */
    @Override // kotlin.modifyCollectionSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void write(o.findSerializerByAnnotations.RemoteActionCompatParcelizer r22) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.changeProperties.write(o.findSerializerByAnnotations$RemoteActionCompatParcelizer):void");
    }

    @Override // kotlin.modifyCollectionSerializer
    public final void IconCompatParcelizer(findSerializerByAnnotations.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        synchronized (this) {
            PolymorphicTypeValidator polymorphicTypeValidator = this.IconCompatParcelizer;
            this.IconCompatParcelizer = remoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer;
            Iterator<write> it = this.MediaBrowserCompatCustomActionResultReceiver.values().iterator();
            while (it.hasNext()) {
                write next = it.next();
                if (!next.AudioAttributesCompatParcelizer(polymorphicTypeValidator, this.IconCompatParcelizer) || next.read(remoteActionCompatParcelizer)) {
                    it.remove();
                    if (next.write) {
                        if (next.AudioAttributesCompatParcelizer.equals(this.write)) {
                            RemoteActionCompatParcelizer(next);
                        }
                        this.MediaBrowserCompatItemReceiver.IconCompatParcelizer(remoteActionCompatParcelizer, next.AudioAttributesCompatParcelizer);
                    }
                }
            }
            read(remoteActionCompatParcelizer);
        }
    }

    @Override // kotlin.modifyCollectionSerializer
    public final void AudioAttributesCompatParcelizer(findSerializerByAnnotations.RemoteActionCompatParcelizer remoteActionCompatParcelizer, int i) {
        synchronized (this) {
            boolean z = i == 0;
            Iterator<write> it = this.MediaBrowserCompatCustomActionResultReceiver.values().iterator();
            while (it.hasNext()) {
                write next = it.next();
                if (next.read(remoteActionCompatParcelizer)) {
                    it.remove();
                    if (next.write) {
                        boolean zEquals = next.AudioAttributesCompatParcelizer.equals(this.write);
                        if (z && zEquals) {
                            boolean unused = next.read;
                        }
                        if (zEquals) {
                            RemoteActionCompatParcelizer(next);
                        }
                        this.MediaBrowserCompatItemReceiver.IconCompatParcelizer(remoteActionCompatParcelizer, next.AudioAttributesCompatParcelizer);
                    }
                }
            }
            read(remoteActionCompatParcelizer);
        }
    }

    @Override // kotlin.modifyCollectionSerializer
    public final String write() {
        String str;
        synchronized (this) {
            str = this.write;
        }
        return str;
    }

    @Override // kotlin.modifyCollectionSerializer
    public final void AudioAttributesCompatParcelizer(findSerializerByAnnotations.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        modifyCollectionSerializer.write writeVar;
        synchronized (this) {
            String str = this.write;
            if (str != null) {
                RemoteActionCompatParcelizer((write) buildTypeSerializer.IconCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver.get(str)));
            }
            Iterator<write> it = this.MediaBrowserCompatCustomActionResultReceiver.values().iterator();
            while (it.hasNext()) {
                write next = it.next();
                it.remove();
                if (next.write && (writeVar = this.MediaBrowserCompatItemReceiver) != null) {
                    writeVar.IconCompatParcelizer(remoteActionCompatParcelizer, next.AudioAttributesCompatParcelizer);
                }
            }
        }
    }

    private void read(findSerializerByAnnotations.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        if (remoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer()) {
            String str = this.write;
            if (str != null) {
                RemoteActionCompatParcelizer((write) buildTypeSerializer.IconCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver.get(str)));
                return;
            }
            return;
        }
        write writeVar = this.MediaBrowserCompatCustomActionResultReceiver.get(this.write);
        write writeVar2 = read(remoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer, remoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver);
        this.write = writeVar2.AudioAttributesCompatParcelizer;
        write(remoteActionCompatParcelizer);
        if (remoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver == null || !remoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer()) {
            return;
        }
        if (writeVar != null && writeVar.AudioAttributesImplApi21Parcelizer == remoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer && writeVar.RemoteActionCompatParcelizer != null && writeVar.RemoteActionCompatParcelizer.write == remoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver.write && writeVar.RemoteActionCompatParcelizer.read == remoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver.read) {
            return;
        }
        String unused = read(remoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer, new StdKeySerializers.write(remoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer, remoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer)).AudioAttributesCompatParcelizer;
        String unused2 = writeVar2.AudioAttributesCompatParcelizer;
    }

    private void RemoteActionCompatParcelizer(write writeVar) {
        if (writeVar.AudioAttributesImplApi21Parcelizer != -1) {
            this.read = writeVar.AudioAttributesImplApi21Parcelizer;
        }
        this.write = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long IconCompatParcelizer() {
        write writeVar = this.MediaBrowserCompatCustomActionResultReceiver.get(this.write);
        if (writeVar == null || writeVar.AudioAttributesImplApi21Parcelizer == -1) {
            return this.read + 1;
        }
        return writeVar.AudioAttributesImplApi21Parcelizer;
    }

    private write read(int i, StdKeySerializers.write writeVar) {
        write writeVar2 = null;
        long j = Long.MAX_VALUE;
        for (write writeVar3 : this.MediaBrowserCompatCustomActionResultReceiver.values()) {
            writeVar3.AudioAttributesCompatParcelizer(i, writeVar);
            if (writeVar3.IconCompatParcelizer(i, writeVar)) {
                long j2 = writeVar3.AudioAttributesImplApi21Parcelizer;
                if (j2 == -1 || j2 < j) {
                    writeVar2 = writeVar3;
                    j = j2;
                } else if (j2 == j && ((write) LaissezFaireSubTypeValidator.IconCompatParcelizer(writeVar2)).RemoteActionCompatParcelizer != null && writeVar3.RemoteActionCompatParcelizer != null) {
                    writeVar2 = writeVar3;
                }
            }
        }
        if (writeVar2 != null) {
            return writeVar2;
        }
        String str = this.AudioAttributesImplBaseParcelizer.get();
        write writeVar4 = new write(str, i, writeVar);
        this.MediaBrowserCompatCustomActionResultReceiver.put(str, writeVar4);
        return writeVar4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String AudioAttributesCompatParcelizer() {
        byte[] bArr = new byte[12];
        AudioAttributesCompatParcelizer.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    final class write {
        private final String AudioAttributesCompatParcelizer;
        private long AudioAttributesImplApi21Parcelizer;
        private int AudioAttributesImplBaseParcelizer;
        private StdKeySerializers.write RemoteActionCompatParcelizer;
        private boolean read;
        private boolean write;

        static /* synthetic */ boolean AudioAttributesCompatParcelizer(write writeVar) {
            writeVar.write = true;
            return true;
        }

        static /* synthetic */ boolean AudioAttributesImplApi21Parcelizer(write writeVar) {
            writeVar.read = true;
            return true;
        }

        public write(String str, int i, StdKeySerializers.write writeVar) {
            this.AudioAttributesCompatParcelizer = str;
            this.AudioAttributesImplBaseParcelizer = i;
            this.AudioAttributesImplApi21Parcelizer = writeVar == null ? -1L : writeVar.RemoteActionCompatParcelizer;
            if (writeVar == null || !writeVar.IconCompatParcelizer()) {
                return;
            }
            this.RemoteActionCompatParcelizer = writeVar;
        }

        public final boolean AudioAttributesCompatParcelizer(PolymorphicTypeValidator polymorphicTypeValidator, PolymorphicTypeValidator polymorphicTypeValidator2) {
            int i = read(polymorphicTypeValidator, polymorphicTypeValidator2, this.AudioAttributesImplBaseParcelizer);
            this.AudioAttributesImplBaseParcelizer = i;
            if (i == -1) {
                return false;
            }
            StdKeySerializers.write writeVar = this.RemoteActionCompatParcelizer;
            return writeVar == null || polymorphicTypeValidator2.read(writeVar.AudioAttributesCompatParcelizer) != -1;
        }

        public final boolean IconCompatParcelizer(int i, StdKeySerializers.write writeVar) {
            return writeVar == null ? i == this.AudioAttributesImplBaseParcelizer : this.RemoteActionCompatParcelizer == null ? !writeVar.IconCompatParcelizer() && writeVar.RemoteActionCompatParcelizer == this.AudioAttributesImplApi21Parcelizer : writeVar.RemoteActionCompatParcelizer == this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer && writeVar.write == this.RemoteActionCompatParcelizer.write && writeVar.read == this.RemoteActionCompatParcelizer.read;
        }

        public final void AudioAttributesCompatParcelizer(int i, StdKeySerializers.write writeVar) {
            if (this.AudioAttributesImplApi21Parcelizer != -1 || i != this.AudioAttributesImplBaseParcelizer || writeVar == null || writeVar.RemoteActionCompatParcelizer < changeProperties.this.IconCompatParcelizer()) {
                return;
            }
            this.AudioAttributesImplApi21Parcelizer = writeVar.RemoteActionCompatParcelizer;
        }

        public final boolean read(findSerializerByAnnotations.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            if (remoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver == null) {
                return this.AudioAttributesImplBaseParcelizer != remoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer;
            }
            if (this.AudioAttributesImplApi21Parcelizer == -1) {
                return false;
            }
            if (remoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer > this.AudioAttributesImplApi21Parcelizer) {
                return true;
            }
            if (this.RemoteActionCompatParcelizer == null) {
                return false;
            }
            int i = remoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer.read(remoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer);
            int i2 = remoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer.read(this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer);
            if (remoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer < this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer || i < i2) {
                return false;
            }
            if (i > i2) {
                return true;
            }
            if (!remoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer()) {
                return remoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer == -1 || remoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer > this.RemoteActionCompatParcelizer.write;
            }
            int i3 = remoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver.write;
            return i3 > this.RemoteActionCompatParcelizer.write || (i3 == this.RemoteActionCompatParcelizer.write && remoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver.read > this.RemoteActionCompatParcelizer.read);
        }

        private int read(PolymorphicTypeValidator polymorphicTypeValidator, PolymorphicTypeValidator polymorphicTypeValidator2, int i) {
            if (i < polymorphicTypeValidator.AudioAttributesCompatParcelizer()) {
                polymorphicTypeValidator.RemoteActionCompatParcelizer(i, changeProperties.this.AudioAttributesImplApi26Parcelizer);
                for (int i2 = changeProperties.this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer; i2 <= changeProperties.this.AudioAttributesImplApi26Parcelizer.AudioAttributesImplBaseParcelizer; i2++) {
                    int i3 = polymorphicTypeValidator2.read(polymorphicTypeValidator.write(i2));
                    if (i3 != -1) {
                        return polymorphicTypeValidator2.AudioAttributesCompatParcelizer(i3, changeProperties.this.AudioAttributesImplApi21Parcelizer).AudioAttributesImplBaseParcelizer;
                    }
                }
                return -1;
            }
            if (i < polymorphicTypeValidator2.AudioAttributesCompatParcelizer()) {
                return i;
            }
            return -1;
        }
    }
}
