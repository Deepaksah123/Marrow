package kotlin;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class keyFormat {
    public static final keyFormat IconCompatParcelizer = new read().IconCompatParcelizer(1).read(2).RemoteActionCompatParcelizer(3).write();
    public final int AudioAttributesCompatParcelizer;
    private int AudioAttributesImplApi21Parcelizer;
    public final byte[] MediaBrowserCompatCustomActionResultReceiver;
    public final int MediaBrowserCompatItemReceiver;
    public final int RemoteActionCompatParcelizer;
    public final int read;
    public final int write;

    public static int AudioAttributesCompatParcelizer(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 4) {
            return 10;
        }
        if (i == 13) {
            return 2;
        }
        if (i == 16) {
            return 6;
        }
        if (i != 18) {
            return (i == 6 || i == 7) ? 3 : -1;
        }
        return 7;
    }

    public static int write(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 9) {
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 6;
    }

    /* synthetic */ keyFormat(int i, int i2, int i3, byte[] bArr, int i4, int i5, byte b) {
        this(i, i2, i3, bArr, i4, i5);
    }

    public static final class read {
        private int AudioAttributesCompatParcelizer;
        private int IconCompatParcelizer;
        private int MediaBrowserCompatItemReceiver;
        private int RemoteActionCompatParcelizer;
        private int read;
        private byte[] write;

        /* synthetic */ read(keyFormat keyformat, byte b) {
            this(keyformat);
        }

        public read() {
            this.read = -1;
            this.IconCompatParcelizer = -1;
            this.RemoteActionCompatParcelizer = -1;
            this.MediaBrowserCompatItemReceiver = -1;
            this.AudioAttributesCompatParcelizer = -1;
        }

        private read(keyFormat keyformat) {
            this.read = keyformat.read;
            this.IconCompatParcelizer = keyformat.RemoteActionCompatParcelizer;
            this.RemoteActionCompatParcelizer = keyformat.AudioAttributesCompatParcelizer;
            this.write = keyformat.MediaBrowserCompatCustomActionResultReceiver;
            this.MediaBrowserCompatItemReceiver = keyformat.MediaBrowserCompatItemReceiver;
            this.AudioAttributesCompatParcelizer = keyformat.write;
        }

        public final read IconCompatParcelizer(int i) {
            this.read = i;
            return this;
        }

        public final read read(int i) {
            this.IconCompatParcelizer = i;
            return this;
        }

        public final read RemoteActionCompatParcelizer(int i) {
            this.RemoteActionCompatParcelizer = i;
            return this;
        }

        public final read IconCompatParcelizer(byte[] bArr) {
            this.write = bArr;
            return this;
        }

        public final read AudioAttributesCompatParcelizer(int i) {
            this.MediaBrowserCompatItemReceiver = i;
            return this;
        }

        public final read write(int i) {
            this.AudioAttributesCompatParcelizer = i;
            return this;
        }

        public final keyFormat write() {
            return new keyFormat(this.read, this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, this.write, this.MediaBrowserCompatItemReceiver, this.AudioAttributesCompatParcelizer, (byte) 0);
        }
    }

    static {
        new read().IconCompatParcelizer(1).read(1).RemoteActionCompatParcelizer(2).write();
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(0);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(1);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(2);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(3);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(4);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(5);
    }

    public static boolean IconCompatParcelizer(keyFormat keyformat) {
        if (keyformat == null) {
            return true;
        }
        int i = keyformat.read;
        if (i != -1 && i != 1 && i != 2) {
            return false;
        }
        int i2 = keyformat.RemoteActionCompatParcelizer;
        if (i2 != -1 && i2 != 2) {
            return false;
        }
        int i3 = keyformat.AudioAttributesCompatParcelizer;
        if ((i3 != -1 && i3 != 3) || keyformat.MediaBrowserCompatCustomActionResultReceiver != null) {
            return false;
        }
        int i4 = keyformat.write;
        if (i4 != -1 && i4 != 8) {
            return false;
        }
        int i5 = keyformat.MediaBrowserCompatItemReceiver;
        return i5 == -1 || i5 == 8;
    }

    private keyFormat(int i, int i2, int i3, byte[] bArr, int i4, int i5) {
        this.read = i;
        this.RemoteActionCompatParcelizer = i2;
        this.AudioAttributesCompatParcelizer = i3;
        this.MediaBrowserCompatCustomActionResultReceiver = bArr;
        this.MediaBrowserCompatItemReceiver = i4;
        this.write = i5;
    }

    public final read write() {
        return new read(this, (byte) 0);
    }

    public final boolean RemoteActionCompatParcelizer() {
        return AudioAttributesCompatParcelizer() || read();
    }

    private boolean AudioAttributesCompatParcelizer() {
        return (this.MediaBrowserCompatItemReceiver == -1 || this.write == -1) ? false : true;
    }

    public final boolean read() {
        return (this.read == -1 || this.RemoteActionCompatParcelizer == -1 || this.AudioAttributesCompatParcelizer == -1) ? false : true;
    }

    public final String IconCompatParcelizer() {
        String str;
        String string;
        if (read()) {
            str = LaissezFaireSubTypeValidator.read("%s/%s/%s", read(this.read), IconCompatParcelizer(this.RemoteActionCompatParcelizer), MediaBrowserCompatCustomActionResultReceiver(this.AudioAttributesCompatParcelizer));
        } else {
            str = "NA/NA/NA";
        }
        if (AudioAttributesCompatParcelizer()) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.MediaBrowserCompatItemReceiver);
            sb.append("/");
            sb.append(this.write);
            string = sb.toString();
        } else {
            string = "NA/NA";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("/");
        sb2.append(string);
        return sb2.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        keyFormat keyformat = (keyFormat) obj;
        return this.read == keyformat.read && this.RemoteActionCompatParcelizer == keyformat.RemoteActionCompatParcelizer && this.AudioAttributesCompatParcelizer == keyformat.AudioAttributesCompatParcelizer && Arrays.equals(this.MediaBrowserCompatCustomActionResultReceiver, keyformat.MediaBrowserCompatCustomActionResultReceiver) && this.MediaBrowserCompatItemReceiver == keyformat.MediaBrowserCompatItemReceiver && this.write == keyformat.write;
    }

    public final int hashCode() {
        if (this.AudioAttributesImplApi21Parcelizer == 0) {
            int i = this.read;
            int i2 = this.RemoteActionCompatParcelizer;
            int i3 = this.AudioAttributesCompatParcelizer;
            int iHashCode = Arrays.hashCode(this.MediaBrowserCompatCustomActionResultReceiver);
            this.AudioAttributesImplApi21Parcelizer = ((((((((((i + 527) * 31) + i2) * 31) + i3) * 31) + iHashCode) * 31) + this.MediaBrowserCompatItemReceiver) * 31) + this.write;
        }
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ColorInfo(");
        sb.append(read(this.read));
        sb.append(", ");
        sb.append(IconCompatParcelizer(this.RemoteActionCompatParcelizer));
        sb.append(", ");
        sb.append(MediaBrowserCompatCustomActionResultReceiver(this.AudioAttributesCompatParcelizer));
        sb.append(", ");
        sb.append(this.MediaBrowserCompatCustomActionResultReceiver != null);
        sb.append(", ");
        sb.append(MediaBrowserCompatItemReceiver(this.MediaBrowserCompatItemReceiver));
        sb.append(", ");
        sb.append(RemoteActionCompatParcelizer(this.write));
        sb.append(")");
        return sb.toString();
    }

    private static String MediaBrowserCompatItemReceiver(int i) {
        if (i == -1) {
            return "NA";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append("bit Luma");
        return sb.toString();
    }

    private static String RemoteActionCompatParcelizer(int i) {
        if (i == -1) {
            return "NA";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append("bit Chroma");
        return sb.toString();
    }

    private static String read(int i) {
        if (i == -1) {
            return "Unset color space";
        }
        if (i == 6) {
            return "BT2020";
        }
        if (i == 1) {
            return "BT709";
        }
        if (i == 2) {
            return "BT601";
        }
        return "Undefined color space ".concat(String.valueOf(i));
    }

    private static String MediaBrowserCompatCustomActionResultReceiver(int i) {
        if (i == -1) {
            return "Unset color transfer";
        }
        if (i == 10) {
            return "Gamma 2.2";
        }
        if (i == 1) {
            return "Linear";
        }
        if (i == 2) {
            return "sRGB";
        }
        if (i == 3) {
            return "SDR SMPTE 170M";
        }
        if (i == 6) {
            return "ST2084 PQ";
        }
        if (i == 7) {
            return "HLG";
        }
        return "Undefined color transfer ".concat(String.valueOf(i));
    }

    private static String IconCompatParcelizer(int i) {
        if (i == -1) {
            return "Unset color range";
        }
        if (i == 1) {
            return "Full range";
        }
        if (i == 2) {
            return "Limited range";
        }
        return "Undefined color range ".concat(String.valueOf(i));
    }
}
