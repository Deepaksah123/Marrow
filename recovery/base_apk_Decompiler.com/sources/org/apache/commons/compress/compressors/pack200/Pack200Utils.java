package org.apache.commons.compress.compressors.pack200;

import com.marrow.data.models.test.TestIndex;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.jar.JarFile;
import java.util.jar.JarOutputStream;
import java.util.jar.Pack200;

/* JADX INFO: loaded from: classes5.dex */
public class Pack200Utils {
    private Pack200Utils() {
    }

    public static void normalize(File file) throws IOException {
        normalize(file, file, null);
    }

    public static void normalize(File file, Map<String, String> map) throws IOException {
        normalize(file, file, map);
    }

    public static void normalize(File file, File file2) throws IOException {
        normalize(file, file2, null);
    }

    public static void normalize(File file, File file2, Map<String, String> map) throws IOException {
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("pack.segment.limit", TestIndex.ALL_INDIA_ID);
        File fileCreateTempFile = File.createTempFile("commons-compress", "pack200normalize");
        fileCreateTempFile.deleteOnExit();
        try {
            OutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            JarFile jarFile = null;
            try {
                Pack200.Packer packerNewPacker = Pack200.newPacker();
                packerNewPacker.properties().putAll(map);
                JarFile jarFile2 = new JarFile(file);
                try {
                    packerNewPacker.pack(jarFile2, fileOutputStream);
                    fileOutputStream.close();
                    try {
                        Pack200.Unpacker unpackerNewUnpacker = Pack200.newUnpacker();
                        JarOutputStream jarOutputStream = new JarOutputStream(new FileOutputStream(file2));
                        try {
                            unpackerNewUnpacker.unpack(fileCreateTempFile, jarOutputStream);
                            jarOutputStream.close();
                        } catch (Throwable th) {
                            th = th;
                            fileOutputStream = jarOutputStream;
                            if (jarFile != null) {
                                jarFile.close();
                            }
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream = null;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    jarFile = jarFile2;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } finally {
            fileCreateTempFile.delete();
        }
    }
}
