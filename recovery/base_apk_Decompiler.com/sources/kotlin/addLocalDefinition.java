package kotlin;

import android.os.Handler;
import kotlin.anyIgnorals;

/* JADX INFO: loaded from: classes.dex */
public final class addLocalDefinition {
    private final getSetterUnchecked AudioAttributesCompatParcelizer;
    private write RemoteActionCompatParcelizer;
    private final Handler read;

    public addLocalDefinition(hasGetter hasgetter) {
        toMagicModuleMetaRepoModel.write(hasgetter, "");
        this.AudioAttributesCompatParcelizer = new getSetterUnchecked(hasgetter);
        this.read = new Handler();
    }

    private final void AudioAttributesCompatParcelizer(anyIgnorals.read readVar) {
        write writeVar = this.RemoteActionCompatParcelizer;
        if (writeVar != null) {
            writeVar.run();
        }
        write writeVar2 = new write(this.AudioAttributesCompatParcelizer, readVar);
        this.RemoteActionCompatParcelizer = writeVar2;
        Handler handler = this.read;
        toMagicModuleMetaRepoModel.write(writeVar2);
        handler.postAtFrontOfQueue(writeVar2);
    }

    public final void RemoteActionCompatParcelizer() {
        AudioAttributesCompatParcelizer(anyIgnorals.read.ON_CREATE);
    }

    public final void write() {
        AudioAttributesCompatParcelizer(anyIgnorals.read.ON_START);
    }

    public final void IconCompatParcelizer() {
        AudioAttributesCompatParcelizer(anyIgnorals.read.ON_START);
    }

    public final void read() {
        AudioAttributesCompatParcelizer(anyIgnorals.read.ON_STOP);
        AudioAttributesCompatParcelizer(anyIgnorals.read.ON_DESTROY);
    }

    public final anyIgnorals AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class write implements Runnable {
        private final anyIgnorals.read IconCompatParcelizer;
        private final getSetterUnchecked read;
        private boolean write;

        public write(getSetterUnchecked getsetterunchecked, anyIgnorals.read readVar) {
            toMagicModuleMetaRepoModel.write(getsetterunchecked, "");
            toMagicModuleMetaRepoModel.write(readVar, "");
            this.read = getsetterunchecked;
            this.IconCompatParcelizer = readVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.write) {
                return;
            }
            this.read.RemoteActionCompatParcelizer(this.IconCompatParcelizer);
            this.write = true;
        }
    }
}
