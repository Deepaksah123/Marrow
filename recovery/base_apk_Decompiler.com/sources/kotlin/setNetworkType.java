package kotlin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;
import kotlin.Metadata;
import kotlinx.coroutines.internal.MainDispatcherFactory;
import org.apache.commons.compress.archivers.ArchiveStreamFactory;
import org.apache.commons.compress.utils.CharsetNames;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J1\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0006\u0010\rJ1\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\rJ3\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\u0006\u0010\n\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\u0006\u0010\n\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0011\u0010\u0014J\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\u0006\u0010\n\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0011\u0010\u0016"}, d2 = {"Lo/setNetworkType;", "", "<init>", "()V", "", "Lkotlinx/coroutines/internal/MainDispatcherFactory;", "RemoteActionCompatParcelizer", "()Ljava/util/List;", "S", "Ljava/lang/Class;", "p0", "Ljava/lang/ClassLoader;", "p1", "(Ljava/lang/Class;Ljava/lang/ClassLoader;)Ljava/util/List;", "AudioAttributesCompatParcelizer", "", "p2", "write", "(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/Class;)Ljava/lang/Object;", "Ljava/net/URL;", "(Ljava/net/URL;)Ljava/util/List;", "Ljava/io/BufferedReader;", "(Ljava/io/BufferedReader;)Ljava/util/List;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setNetworkType {
    public static final setNetworkType INSTANCE = new setNetworkType();

    private setNetworkType() {
    }

    public final List<MainDispatcherFactory> RemoteActionCompatParcelizer() {
        MainDispatcherFactory mainDispatcherFactory;
        if (!setPauseTouchCount.IconCompatParcelizer()) {
            return RemoteActionCompatParcelizer(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader());
        }
        try {
            ArrayList arrayList = new ArrayList(2);
            MainDispatcherFactory mainDispatcherFactory2 = null;
            try {
                mainDispatcherFactory = (MainDispatcherFactory) MainDispatcherFactory.class.cast(Class.forName("kotlinx.coroutines.android.AndroidDispatcherFactory", true, MainDispatcherFactory.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused) {
                mainDispatcherFactory = null;
            }
            if (mainDispatcherFactory == null) {
                return RemoteActionCompatParcelizer(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader());
            }
            arrayList.add(mainDispatcherFactory);
            try {
                mainDispatcherFactory2 = (MainDispatcherFactory) MainDispatcherFactory.class.cast(Class.forName("kotlinx.coroutines.test.internal.TestMainDispatcherFactory", true, MainDispatcherFactory.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused2) {
            }
            if (mainDispatcherFactory2 != null) {
                arrayList.add(mainDispatcherFactory2);
            }
            return arrayList;
        } catch (Throwable unused3) {
            return RemoteActionCompatParcelizer(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader());
        }
    }

    private static <S> List<S> RemoteActionCompatParcelizer(Class<S> p0, ClassLoader p1) {
        try {
            return AudioAttributesCompatParcelizer(p0, p1);
        } catch (Throwable unused) {
            return IntermediateLoginResponseBody.onPlay(ServiceLoader.load(p0, p1));
        }
    }

    private static <S> List<S> AudioAttributesCompatParcelizer(Class<S> p0, ClassLoader p1) {
        StringBuilder sb = new StringBuilder("META-INF/services/");
        sb.append(p0.getName());
        ArrayList list = Collections.list(p1.getResources(sb.toString()));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(list, "");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            IntermediateLoginResponseBody.IconCompatParcelizer((Collection) arrayList, (Iterable) write((URL) it.next()));
        }
        Set setOnPlayFromUri = IntermediateLoginResponseBody.onPlayFromUri(arrayList);
        if (setOnPlayFromUri.isEmpty()) {
            throw new IllegalArgumentException("No providers were loaded with FastServiceLoader".toString());
        }
        Set set = setOnPlayFromUri;
        ArrayList arrayList2 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(set, 10));
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            arrayList2.add(write((String) it2.next(), p1, p0));
        }
        return arrayList2;
    }

    private static <S> S write(String p0, ClassLoader p1, Class<S> p2) throws ClassNotFoundException {
        Class<?> cls = Class.forName(p0, false, p1);
        if (!p2.isAssignableFrom(cls)) {
            StringBuilder sb = new StringBuilder("Expected service of class ");
            sb.append(p2);
            sb.append(", but found ");
            sb.append(cls);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        return p2.cast(cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
    }

    private static List<String> write(URL p0) throws IOException {
        BufferedReader bufferedReader;
        String string = p0.toString();
        if (!TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(string, ArchiveStreamFactory.JAR)) {
            bufferedReader = new BufferedReader(new InputStreamReader(getAvcProfileAndLevel.AudioAttributesCompatParcelizer(p0)));
            try {
                List<String> listWrite = write(bufferedReader);
                MagicModuleMetaLSModel.IconCompatParcelizer(bufferedReader, null);
                return listWrite;
            } catch (Throwable th) {
                try {
                    throw th;
                } finally {
                }
            }
        }
        String str = TestGroupLSModel.read(string, "jar:file:", string);
        String strIconCompatParcelizer = TestGroupLSModel.IconCompatParcelizer(str, '!', str);
        String str2 = TestGroupLSModel.read(string, "!/", string);
        JarFile jarFile = new JarFile(strIconCompatParcelizer, false);
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(jarFile.getInputStream(new ZipEntry(str2)), CharsetNames.UTF_8));
            try {
                List<String> listWrite2 = write(bufferedReader);
                MagicModuleMetaLSModel.IconCompatParcelizer(bufferedReader, null);
                jarFile.close();
                return listWrite2;
            } finally {
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                try {
                    jarFile.close();
                    throw th3;
                } catch (Throwable th4) {
                    getPlanName.IconCompatParcelizer(th2, th4);
                    throw th2;
                }
            }
        }
    }

    private static List<String> write(BufferedReader p0) throws IOException {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (true) {
            String line = p0.readLine();
            if (line == null) {
                return IntermediateLoginResponseBody.onPlay(linkedHashSet);
            }
            String string = TestGroupLSModel.AudioAttributesImplApi26Parcelizer((CharSequence) TestGroupLSModel.write(line, "#", line)).toString();
            String str = string;
            for (int i = 0; i < str.length(); i++) {
                char cCharAt = str.charAt(i);
                if (cCharAt != '.' && !Character.isJavaIdentifierPart(cCharAt)) {
                    throw new IllegalArgumentException("Illegal service provider class name: ".concat(String.valueOf(string)).toString());
                }
            }
            if (str.length() > 0) {
                linkedHashSet.add(string);
            }
        }
    }
}
