package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class _writeAsBinary {
    public static final _writeAsBinary read = new _writeAsBinary(new setName[0]);
    private int AudioAttributesCompatParcelizer;
    private final initExtraTracks<setName> IconCompatParcelizer;
    public final int RemoteActionCompatParcelizer;

    static {
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(0);
    }

    public _writeAsBinary(setName... setnameArr) {
        this.IconCompatParcelizer = initExtraTracks.write(setnameArr);
        this.RemoteActionCompatParcelizer = setnameArr.length;
        AudioAttributesCompatParcelizer();
    }

    public final setName RemoteActionCompatParcelizer(int i) {
        return this.IconCompatParcelizer.get(i);
    }

    public final int RemoteActionCompatParcelizer(setName setname) {
        int iIndexOf = this.IconCompatParcelizer.indexOf(setname);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    public final initExtraTracks<Integer> IconCompatParcelizer() {
        return initExtraTracks.write(parseMehd.RemoteActionCompatParcelizer((List) this.IconCompatParcelizer, new parseMvhd() { // from class: o.resolveSelfReferences
            @Override // kotlin.parseMvhd
            public final Object apply(Object obj) {
                return Integer.valueOf(((setName) obj).IconCompatParcelizer);
            }
        }));
    }

    public final int hashCode() {
        if (this.AudioAttributesCompatParcelizer == 0) {
            this.AudioAttributesCompatParcelizer = this.IconCompatParcelizer.hashCode();
        }
        return this.AudioAttributesCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        _writeAsBinary _writeasbinary = (_writeAsBinary) obj;
        return this.RemoteActionCompatParcelizer == _writeasbinary.RemoteActionCompatParcelizer && this.IconCompatParcelizer.equals(_writeasbinary.IconCompatParcelizer);
    }

    private void AudioAttributesCompatParcelizer() {
        int i = 0;
        while (i < this.IconCompatParcelizer.size()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < this.IconCompatParcelizer.size(); i3++) {
                if (this.IconCompatParcelizer.get(i).equals(this.IconCompatParcelizer.get(i3))) {
                    prune.read("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }
}
