package kotlin;

import android.util.SparseBooleanArray;

/* JADX INFO: loaded from: classes2.dex */
public final class enumTypes {
    private final SparseBooleanArray IconCompatParcelizer;

    /* synthetic */ enumTypes(SparseBooleanArray sparseBooleanArray, byte b) {
        this(sparseBooleanArray);
    }

    public static final class write {
        private final SparseBooleanArray read = new SparseBooleanArray();
        private boolean write;

        public final write RemoteActionCompatParcelizer(int i) {
            buildTypeSerializer.write(!this.write);
            this.read.append(i, true);
            return this;
        }

        public final write read(int i, boolean z) {
            return z ? RemoteActionCompatParcelizer(i) : this;
        }

        public final write AudioAttributesCompatParcelizer(int... iArr) {
            for (int i : iArr) {
                RemoteActionCompatParcelizer(i);
            }
            return this;
        }

        public final write AudioAttributesCompatParcelizer(enumTypes enumtypes) {
            for (int i = 0; i < enumtypes.AudioAttributesCompatParcelizer(); i++) {
                RemoteActionCompatParcelizer(enumtypes.RemoteActionCompatParcelizer(i));
            }
            return this;
        }

        public final enumTypes AudioAttributesCompatParcelizer() {
            buildTypeSerializer.write(!this.write);
            this.write = true;
            return new enumTypes(this.read, (byte) 0);
        }
    }

    private enumTypes(SparseBooleanArray sparseBooleanArray) {
        this.IconCompatParcelizer = sparseBooleanArray;
    }

    public final boolean AudioAttributesCompatParcelizer(int i) {
        return this.IconCompatParcelizer.get(i);
    }

    public final boolean write(int... iArr) {
        for (int i : iArr) {
            if (AudioAttributesCompatParcelizer(i)) {
                return true;
            }
        }
        return false;
    }

    public final int AudioAttributesCompatParcelizer() {
        return this.IconCompatParcelizer.size();
    }

    public final int RemoteActionCompatParcelizer(int i) {
        buildTypeSerializer.RemoteActionCompatParcelizer(i, AudioAttributesCompatParcelizer());
        return this.IconCompatParcelizer.keyAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof enumTypes)) {
            return false;
        }
        enumTypes enumtypes = (enumTypes) obj;
        if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver < 24) {
            if (AudioAttributesCompatParcelizer() != enumtypes.AudioAttributesCompatParcelizer()) {
                return false;
            }
            for (int i = 0; i < AudioAttributesCompatParcelizer(); i++) {
                if (RemoteActionCompatParcelizer(i) != enumtypes.RemoteActionCompatParcelizer(i)) {
                    return false;
                }
            }
            return true;
        }
        return this.IconCompatParcelizer.equals(enumtypes.IconCompatParcelizer);
    }

    public final int hashCode() {
        if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver < 24) {
            int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
            for (int i = 0; i < AudioAttributesCompatParcelizer(); i++) {
                iAudioAttributesCompatParcelizer = (iAudioAttributesCompatParcelizer * 31) + RemoteActionCompatParcelizer(i);
            }
            return iAudioAttributesCompatParcelizer;
        }
        return this.IconCompatParcelizer.hashCode();
    }
}
