package kotlin;

import android.opengl.GLES20;
import java.util.HashMap;
import java.util.Map;
import kotlin.TypeSerializer1;

/* JADX INFO: loaded from: classes4.dex */
public final class AsArrayTypeDeserializer {
    private final int AudioAttributesCompatParcelizer;
    private final IconCompatParcelizer[] IconCompatParcelizer;
    private final Map<String, IconCompatParcelizer> RemoteActionCompatParcelizer;
    private final read[] read;
    private final Map<String, read> write;

    public AsArrayTypeDeserializer(String str, String str2) throws TypeSerializer1.IconCompatParcelizer {
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.AudioAttributesCompatParcelizer = iGlCreateProgram;
        TypeSerializer1.RemoteActionCompatParcelizer();
        write(iGlCreateProgram, 35633, str);
        write(iGlCreateProgram, 35632, str2);
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        boolean z = iArr[0] == 1;
        StringBuilder sb = new StringBuilder("Unable to link shader program: \n");
        sb.append(GLES20.glGetProgramInfoLog(iGlCreateProgram));
        TypeSerializer1.IconCompatParcelizer(z, sb.toString());
        GLES20.glUseProgram(iGlCreateProgram);
        this.RemoteActionCompatParcelizer = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35721, iArr2, 0);
        this.IconCompatParcelizer = new IconCompatParcelizer[iArr2[0]];
        for (int i = 0; i < iArr2[0]; i++) {
            IconCompatParcelizer IconCompatParcelizer2 = IconCompatParcelizer.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, i);
            this.IconCompatParcelizer[i] = IconCompatParcelizer2;
            this.RemoteActionCompatParcelizer.put(IconCompatParcelizer2.write, IconCompatParcelizer2);
        }
        this.write = new HashMap();
        int[] iArr3 = new int[1];
        GLES20.glGetProgramiv(this.AudioAttributesCompatParcelizer, 35718, iArr3, 0);
        this.read = new read[iArr3[0]];
        for (int i2 = 0; i2 < iArr3[0]; i2++) {
            read readVarWrite = read.write(this.AudioAttributesCompatParcelizer, i2);
            this.read[i2] = readVarWrite;
            this.write.put(readVarWrite.write, readVarWrite);
        }
        TypeSerializer1.RemoteActionCompatParcelizer();
    }

    private static void write(int i, int i2, String str) throws TypeSerializer1.IconCompatParcelizer {
        int iGlCreateShader = GLES20.glCreateShader(i2);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        boolean z = iArr[0] == 1;
        StringBuilder sb = new StringBuilder();
        sb.append(GLES20.glGetShaderInfoLog(iGlCreateShader));
        sb.append(", source: \n");
        sb.append(str);
        TypeSerializer1.IconCompatParcelizer(z, sb.toString());
        GLES20.glAttachShader(i, iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        TypeSerializer1.RemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int RemoteActionCompatParcelizer(int i, String str) {
        return GLES20.glGetAttribLocation(i, str);
    }

    private int RemoteActionCompatParcelizer(String str) {
        return RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int AudioAttributesCompatParcelizer(int i, String str) {
        return GLES20.glGetUniformLocation(i, str);
    }

    public final int IconCompatParcelizer(String str) {
        return AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, str);
    }

    public final int write(String str) throws TypeSerializer1.IconCompatParcelizer {
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(str);
        GLES20.glEnableVertexAttribArray(iRemoteActionCompatParcelizer);
        TypeSerializer1.RemoteActionCompatParcelizer();
        return iRemoteActionCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int IconCompatParcelizer(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            if (bArr[i] == 0) {
                return i;
            }
        }
        return bArr.length;
    }

    static final class IconCompatParcelizer {
        private final int RemoteActionCompatParcelizer;
        public final String write;

        public static IconCompatParcelizer IconCompatParcelizer(int i, int i2) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i, 35722, iArr, 0);
            int i3 = iArr[0];
            byte[] bArr = new byte[i3];
            GLES20.glGetActiveAttrib(i, i2, i3, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            String str = new String(bArr, 0, AsArrayTypeDeserializer.IconCompatParcelizer(bArr));
            return new IconCompatParcelizer(str, AsArrayTypeDeserializer.RemoteActionCompatParcelizer(i, str));
        }

        private IconCompatParcelizer(String str, int i) {
            this.write = str;
            this.RemoteActionCompatParcelizer = i;
        }
    }

    static final class read {
        private final int RemoteActionCompatParcelizer;
        private final int read;
        public final String write;
        private final float[] IconCompatParcelizer = new float[16];
        private final int[] AudioAttributesCompatParcelizer = new int[4];

        public static read write(int i, int i2) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i, 35719, iArr, 0);
            int[] iArr2 = new int[1];
            int i3 = iArr[0];
            byte[] bArr = new byte[i3];
            GLES20.glGetActiveUniform(i, i2, i3, new int[1], 0, new int[1], 0, iArr2, 0, bArr, 0);
            String str = new String(bArr, 0, AsArrayTypeDeserializer.IconCompatParcelizer(bArr));
            return new read(str, AsArrayTypeDeserializer.AudioAttributesCompatParcelizer(i, str), iArr2[0]);
        }

        private read(String str, int i, int i2) {
            this.write = str;
            this.RemoteActionCompatParcelizer = i;
            this.read = i2;
        }
    }
}
