package kotlin;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class getRequiredMarkerFromCorrespondingAccessor {
    private static final Set<File> read = new HashSet();
    private static final boolean write = IconCompatParcelizer(System.getProperty("java.vm.version"));

    public static void IconCompatParcelizer(Context context) {
        if (write) {
            return;
        }
        try {
            ApplicationInfo applicationInfoRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(context);
            if (applicationInfoRemoteActionCompatParcelizer == null) {
                return;
            }
            read(context, new File(applicationInfoRemoteActionCompatParcelizer.sourceDir), new File(applicationInfoRemoteActionCompatParcelizer.dataDir), "secondary-dexes", "");
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("MultiDex installation failed (");
            sb.append(e.getMessage());
            sb.append(").");
            throw new RuntimeException(sb.toString());
        }
    }

    private static void read(Context context, File file, File file2, String str, String str2) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InstantiationException, IOException, SecurityException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        Set<File> set = read;
        synchronized (set) {
            if (set.contains(file)) {
                return;
            }
            set.add(file);
            int i = Build.VERSION.SDK_INT;
            System.getProperty("java.vm.version");
            try {
                ClassLoader classLoader = context.getClassLoader();
                if (classLoader == null) {
                    return;
                }
                try {
                    write(context);
                } catch (Throwable unused) {
                }
                File file3 = read(context, file2, str);
                isParameterRequired isparameterrequired = new isParameterRequired(file, file3);
                try {
                    try {
                        RemoteActionCompatParcelizer(classLoader, file3, isparameterrequired.write(context, str2, false));
                    } catch (IOException unused2) {
                        RemoteActionCompatParcelizer(classLoader, file3, isparameterrequired.write(context, str2, true));
                    }
                    try {
                        e = null;
                    } catch (IOException e) {
                        e = e;
                    }
                    if (e != null) {
                        throw e;
                    }
                } finally {
                    try {
                        isparameterrequired.close();
                    } catch (IOException unused3) {
                    }
                }
            } catch (RuntimeException unused4) {
            }
        }
    }

    private static ApplicationInfo RemoteActionCompatParcelizer(Context context) {
        try {
            return context.getApplicationInfo();
        } catch (RuntimeException unused) {
            return null;
        }
    }

    private static boolean IconCompatParcelizer(String str) {
        if (str == null) {
            return false;
        }
        Matcher matcher = Pattern.compile("(\\d+)\\.(\\d+)(\\.\\d+)?").matcher(str);
        if (!matcher.matches()) {
            return false;
        }
        try {
            int i = Integer.parseInt(matcher.group(1));
            return i > 2 || (i == 2 && Integer.parseInt(matcher.group(2)) > 0);
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    private static void RemoteActionCompatParcelizer(ClassLoader classLoader, File file, List<? extends File> list) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InstantiationException, IOException, SecurityException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        if (list.isEmpty()) {
            return;
        }
        IconCompatParcelizer.read(classLoader, list, file);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Field write(Object obj, String str) throws NoSuchFieldException {
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            try {
                Field declaredField = superclass.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
            }
        }
        StringBuilder sb = new StringBuilder("Field ");
        sb.append(str);
        sb.append(" not found in ");
        sb.append(obj.getClass());
        throw new NoSuchFieldException(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Method read(Object obj, String str, Class<?>... clsArr) throws NoSuchMethodException {
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            try {
                Method declaredMethod = superclass.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
            }
        }
        StringBuilder sb = new StringBuilder("Method ");
        sb.append(str);
        sb.append(" with parameters ");
        sb.append(Arrays.asList(clsArr));
        sb.append(" not found in ");
        sb.append(obj.getClass());
        throw new NoSuchMethodException(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void RemoteActionCompatParcelizer(Object obj, String str, Object[] objArr) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        Field fieldWrite = write(obj, str);
        Object[] objArr2 = (Object[]) fieldWrite.get(obj);
        Object[] objArr3 = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
        System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length);
        System.arraycopy(objArr, 0, objArr3, objArr2.length, objArr.length);
        fieldWrite.set(obj, objArr3);
    }

    private static void write(Context context) throws Exception {
        File file = new File(context.getFilesDir(), "secondary-dexes");
        if (file.isDirectory()) {
            file.getPath();
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                file.getPath();
                return;
            }
            for (File file2 : fileArrListFiles) {
                file2.getPath();
                file2.length();
                if (!file2.delete()) {
                    file2.getPath();
                } else {
                    file2.getPath();
                }
            }
            if (!file.delete()) {
                file.getPath();
            } else {
                file.getPath();
            }
        }
    }

    private static File read(Context context, File file, String str) throws IOException {
        File file2 = new File(file, "code_cache");
        try {
            RemoteActionCompatParcelizer(file2);
        } catch (IOException unused) {
            file2 = new File(context.getFilesDir(), "code_cache");
            RemoteActionCompatParcelizer(file2);
        }
        File file3 = new File(file2, str);
        RemoteActionCompatParcelizer(file3);
        return file3;
    }

    private static void RemoteActionCompatParcelizer(File file) throws IOException {
        file.mkdir();
        if (file.isDirectory()) {
            return;
        }
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            file.getPath();
        } else {
            file.getPath();
            parentFile.isDirectory();
            parentFile.isFile();
            parentFile.exists();
            parentFile.canRead();
            parentFile.canWrite();
        }
        StringBuilder sb = new StringBuilder("Failed to create directory ");
        sb.append(file.getPath());
        throw new IOException(sb.toString());
    }

    static final class IconCompatParcelizer {
        static void read(ClassLoader classLoader, List<? extends File> list, File file) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, IOException, IllegalArgumentException, InvocationTargetException {
            IOException[] iOExceptionArr;
            Object obj = getRequiredMarkerFromCorrespondingAccessor.write(classLoader, "pathList").get(classLoader);
            ArrayList<IOException> arrayList = new ArrayList();
            getRequiredMarkerFromCorrespondingAccessor.RemoteActionCompatParcelizer(obj, "dexElements", write(obj, new ArrayList(list), file, arrayList));
            if (arrayList.size() > 0) {
                for (IOException iOException : arrayList) {
                }
                Field fieldWrite = getRequiredMarkerFromCorrespondingAccessor.write(obj, "dexElementsSuppressedExceptions");
                IOException[] iOExceptionArr2 = (IOException[]) fieldWrite.get(obj);
                if (iOExceptionArr2 == null) {
                    iOExceptionArr = (IOException[]) arrayList.toArray(new IOException[arrayList.size()]);
                } else {
                    IOException[] iOExceptionArr3 = new IOException[arrayList.size() + iOExceptionArr2.length];
                    arrayList.toArray(iOExceptionArr3);
                    System.arraycopy(iOExceptionArr2, 0, iOExceptionArr3, arrayList.size(), iOExceptionArr2.length);
                    iOExceptionArr = iOExceptionArr3;
                }
                fieldWrite.set(obj, iOExceptionArr);
                IOException iOException2 = new IOException("I/O exception during makeDexElement");
                iOException2.initCause((Throwable) arrayList.get(0));
                throw iOException2;
            }
        }

        private static Object[] write(Object obj, ArrayList<File> arrayList, File file, ArrayList<IOException> arrayList2) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return (Object[]) getRequiredMarkerFromCorrespondingAccessor.read(obj, "makeDexElements", (Class<?>[]) new Class[]{ArrayList.class, File.class, ArrayList.class}).invoke(obj, arrayList, file, arrayList2);
        }
    }
}
